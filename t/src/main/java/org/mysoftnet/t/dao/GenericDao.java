/**
 * t
 * org.mysoftnet.t.service
 * Created: 15/10/2013 
 */
package org.mysoftnet.t.dao;

import java.io.Serializable;

import org.mysoftnet.t.dao.exception.EntityNotFoundException;
import org.mysoftnet.t.dao.exception.DaoException;
import org.mysoftnet.t.dao.interfaces.IDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;



/**
 * The GenericDao type.
 * @author sebastian.a.coria
 *
 * @param <T> the generic type
 * @param <K> the key type
 */
@Service
public class GenericDao<T, K extends Serializable> implements IDao<T, K> {

	/** The Constant logger. */
	private static Logger logger;

	/** The type. */
	private Class<T> type;
	
	@PersistenceContext
	EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	/**
	 * Instantiates a new generic service.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GenericDao(){
		 Type t = getClass().getGenericSuperclass();
	        ParameterizedType pt = (ParameterizedType) t;
	        type = (Class) pt.getActualTypeArguments()[0];
	        logger = LoggerFactory.getLogger(type);
	        logger.info("initialized...");
	}
	
	@Override
	@Transactional(readOnly=true)
	public T loadById(K id) throws DaoException {
		T entity = null;
		try {
			entity = (T) em.find(type, id);//getHibernateTemplate().get(type, id); 
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new DaoException(e);
		}
		if(entity == null){
			String mesage=getMessageIdentification(id);
			logger.error(mesage);
			throw new EntityNotFoundException(mesage);
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public T loadFirst() throws DaoException {
		try {
		    CriteriaBuilder builder = em.getCriteriaBuilder();
		    CriteriaQuery<T> cq = builder.createQuery(type);
		    Root<T> variableRoot = cq.from(type);
		    cq.select(variableRoot);
		    Query query = em.createQuery(cq);
		    query.setFirstResult(0);
		    query.setMaxResults(1);
		    List<T> entities = (List<T>) query.getResultList();
		    if(entities.isEmpty()){
				String mesage=getMessageIdentification(null);
				logger.error(mesage);
				throw new EntityNotFoundException(mesage);
			}
			return entities.get(0);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new DaoException(e);
		}
	}

	@Override
	@Transactional
	public T save(T entity) throws DaoException {
		try {
			entity = em.merge(entity);
		} catch (Exception e) {
			try {
				em.persist(entity);
			} catch (Exception e1) {
				logger.error(e1.getMessage());
				throw new DaoException(e1);
			}
		}	
		return entity;
	}
	
	@Override
	@Transactional(readOnly=true)
	public List<T> loadAll() throws DaoException {
		try {
		    CriteriaBuilder builder = em.getCriteriaBuilder();
		    CriteriaQuery<T> query = builder.createQuery(type);
		    Root<T> variableRoot = query.from(type);
		    query.select(variableRoot);

		    return em.createQuery(query).getResultList();
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new DaoException(e);
		}
	}


	@Override
	@Transactional
	public void delete(T entity) throws DaoException {
		try {
			em.remove(entity);
		} catch (Exception e) {
			logger.error(e.getMessage());
			throw new DaoException(e);
		}
	}

    @Override
	@Transactional(readOnly=true)
    public T findById(K id) throws DaoException {
        T entity = null;
        try {
        	entity = (T) em.find(type, id);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new DaoException(e);
        }
        return entity;
    }

	/**
	 * Gets the message identification.
	 *
	 * @param id the id
	 * @return the message identification
	 */
	protected String getMessageIdentification(K id){
		StringBuilder sb=new StringBuilder("Entity no found for class ");
		sb.append(type);
		sb.append(" with id : ");
		if(id!=null){
			sb.append(String.valueOf(id));
		}else{
			sb.append("null");
		}
		return sb.toString();
	}    
}
