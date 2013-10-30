package org.mysoftnet.t.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mysoftnet.t.dao.exception.DaoException;
import org.mysoftnet.t.dao.exception.EntityNotFoundException;
import org.mysoftnet.t.dao.interfaces.ICongregationDao;
import org.mysoftnet.t.model.Congregation;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.force.sdk.connector.ForceServiceConnector;
import com.sforce.ws.ConnectionException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/app-context.xml")
public class CongregationDaoTest {

	@Inject
	private ICongregationDao entityService;
	
	@Inject
	private ForceServiceConnector connector;
	
	@Test
	public void testEntityCRUD() throws DaoException {
		
		String entityId1 = null;
		String entityId2 = null;

		try {
			// This little trick turns on traces for both the connector *and* the
			// entity manager because they share the same underlying connection object.
			// When trace is on, you'll see the SOAP requests and responses on stdout.
			connector.getConnection().getConfig().setTraceMessage(true);
			connector.getConnection().getConfig().setPrettyPrintXml(true);

			Congregation entity = new Congregation();
//			entity.setName("A Test Congregation");
			entity.setNumber((double) new Double(12508));
			entity.setCongregationName("A Congregation Name");
			entityService.save(entity);
			
			assertNotNull(entity.getId());
			entityId1 = entity.getId();

			entity = entityService.loadById(entityId1);
			
//			assertEquals("A Test Congregation", entity.getName());
			assertEquals((double) new Double(12508), entity.getNumber(),0);

			
//			entity.setName("A Modified Test Entity");
			entity.setNumber((double) new Double(12509));
			
			entityService.save(entity);

			entity = entityService.loadById(entityId1);
			
//			assertEquals("A Modified Test Entity",entity.getName());
			assertEquals((double) new Double(12509), entity.getNumber(),0);
			
			//Will add a new entity to check loadall and loadfirst
			Congregation entityNew = new Congregation();
//			entity.setName("A Test Congregation");
			entityNew.setNumber((double) new Double(12510));
			entityNew.setCongregationName("Other Congregation Name");
			entityService.save(entityNew);
			entityId2 = entityNew.getId();

			List<Congregation> congregations = entityService.loadAll();
			for (Congregation co:congregations) {
				System.out.println(co.getId() + " | " + co.getCongregationName() + " | " + co.getNumber());
			}
			assertTrue(congregations.size()>1);
			
			//First should be 12509...
			entity = entityService.loadFirst();
			assertEquals((double) new Double(12509), entity.getNumber(),0);

			//Will delete the new ones entities...
			entityService.delete(entityNew);
			
			entityService.delete(entity);
			
			try {
				entity = entityService.loadById(entityId1);
			} catch(EntityNotFoundException e) {
				//This is the expected exception
				assertTrue(true);
			} catch (Throwable t) {
				//Any other exception isn't the expected exception
				assertTrue(false);
			}
			
			entity = entityService.findById(entityId1);
			
			assertNull(entity);
			
			// In case the entity is not null, the finally block will try to clean up using
			// the native connection
			if(entity==null) entityId1 = null;
			

		} catch (ConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(entityId1!=null) {
				try {
					
					connector.getConnection().delete(new String[] {entityId1 });
				} catch (ConnectionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(entityId2!=null) {
				try {
					connector.getConnection().delete(new String[] {entityId2});
				} catch (ConnectionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

}
