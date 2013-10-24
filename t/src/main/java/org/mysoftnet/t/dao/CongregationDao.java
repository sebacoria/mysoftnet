/**
 * t
 * org.mysoftnet.t.service
 * Created: 15/10/2013 
 */
package org.mysoftnet.t.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.mysoftnet.t.model.Congregation;
import org.springframework.stereotype.Service;

/**
 * The Congregation type.
 * @author sebastian.a.coria
 *
 */
@Service
public class CongregationDao extends GenericDao<Congregation, String> {
	@PersistenceContext
	EntityManager em;

	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

}
