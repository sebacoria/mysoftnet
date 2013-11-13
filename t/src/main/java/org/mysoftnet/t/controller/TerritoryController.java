/**
 * t
 * org.mysoftnet.t.controller
 * Created: 12/10/2013 
 */
package org.mysoftnet.t.controller;

import javax.inject.Inject;

import org.mysoftnet.t.dao.EntityDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The MapsController type.
 * @author sebastian.a.coria
 *
 */
@Controller
public class TerritoryController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Inject
	EntityDao entityService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/maps/territory/{territoryNumber}")
	public String viewTerritoryMap(@PathVariable int territoryNumber) {
	    	logger.info("territory " + Integer.toString(territoryNumber));
	    	
		return "territory_detail";
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/maps/territory/new")
	public String viewTerritoryMap() {
	    	logger.info("requesting territory details");
	    	
		return "territory_detail";
	}
	
	@RequestMapping(value="/maps/territory/new/{territoryNumber}", method=RequestMethod.POST)
	public String createTerritoryMap(@PathVariable int territoryNumber) {
	    	logger.info(Integer.toString(territoryNumber));
	    	
		return "redirect:maps";
	}

}
