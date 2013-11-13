/**
 * t
 * org.mysoftnet.t.controller
 * Created: 12/10/2013 
 */
package org.mysoftnet.t.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The MapsController type.
 * @author sebastian.a.coria
 *
 */
@Controller
public class MapsController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value="/maps", method=RequestMethod.GET)
	public String getMapsView() {
	    	logger.info("requesting maps");
		return "maps";
	}

}
