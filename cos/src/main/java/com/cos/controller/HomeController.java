package com.cos.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cos.domain.ApiVO;
import com.cos.domain.SBoardVO;
import com.cos.persistence.ApiDAO;
import com.cos.persistence.SBoardDAO;
import com.cos.service.SBoardService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private SBoardService service;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "home";
	}
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(Model model,@RequestParam("bid") String bid) {
			
		SBoardVO sboard = service.contentView(bid);
		
		
		model.addAttribute("sboard", sboard);
		
		return "view";
	}
	
}
