package kr.co.INNO.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@RequestMapping(value = "/")
	public String index() {
		logger.info("================================================================");
		logger.info("================================================================");
		logger.info("index page return");
		logger.info("================================================================");
		logger.info("================================================================");
		return "index";
	}
	
}
