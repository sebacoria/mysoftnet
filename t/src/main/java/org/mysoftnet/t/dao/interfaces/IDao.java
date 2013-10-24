/**
 * t
 * org.mysoftnet.t.service.interfaces
 * Created: 15/10/2013 
 */
package org.mysoftnet.t.dao.interfaces;

import java.util.List;

import org.mysoftnet.t.dao.exception.DaoException;


/**
 * The IGenericService type.
 * @author sebastian.a.coria
 *
 * @param <T> the generic type
 * @param <K> the key type
 */
public interface IDao<T, K> {

	/**
	 * Load by id.
	 *
	 * @param o the o
	 * @return the t
	 * @throws DaoException the dao exception
	 */
	T loadById(K o) throws DaoException;
	
	/**
	 * Find by id.
	 *
	 * @param o the o
	 * @return the t
	 * @throws DaoException the dao exception
	 */
	T findById(K o) throws DaoException;
	
	/**
	 * Method implemented to improve testing.
	 *
	 * @return the t
	 * @throws DaoException the dao exception
	 */
	T loadFirst() throws DaoException;
	
	/**
	 * Save.
	 *
	 * @param entity the entity
	 * @return the T
	 * @throws DaoException the dao exception
	 */
	T save(T entity) throws DaoException;

	/**
	 * Load all.
	 *
	 * @return the list
	 * @throws DaoException the dao exception
	 */
	List<T> loadAll() throws DaoException;
	
	/**
	 * Delete.
	 *
	 * @param entity the entity
	 * @throws DaoException the dao exception
	 */
	public void delete(T entity) throws DaoException;


}
