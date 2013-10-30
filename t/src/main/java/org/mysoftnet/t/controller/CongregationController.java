package org.mysoftnet.t.controller;

import javax.inject.Inject;

import org.mysoftnet.t.dao.exception.DaoException;
import org.mysoftnet.t.dao.interfaces.ICongregationDao;
import org.mysoftnet.t.model.Congregation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CongregationController {

	private static final Logger logger = LoggerFactory.getLogger(CongregationController.class);

	@Inject
	ICongregationDao congregationService;
	
	@ModelAttribute("congregation")
	public Congregation init(@PathVariable String id) throws DaoException {
		return congregationService.loadById(id);
	}
	
	@RequestMapping(value="/congregation/{id}", method=RequestMethod.GET)
	public ModelAndView view(ModelAndView mv, @ModelAttribute("congregation") Congregation congregation) {
		mv.addObject("congregation", congregation);
		mv.setViewName("congregation_detail");
		logger.info("requesting /congregation");
		return mv;
	}

//	@RequestMapping(value="/myentity/{id}", method=RequestMethod.POST)
//	public String update(ModelAndView mv, @ModelAttribute("entity") MyEntity entity) throws ServiceException {
//	    	logger.info("updating /myentity");
//		return "redirect:/myentity/"+congregationService.save(entity).getId();
//	}
}

