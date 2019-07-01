package com.mandiri.antasena.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController {
	private static final Logger logger = Logger.getLogger(LoginController.class);

	
	private ModelAndView mv;
	
	@RequestMapping(value="/login.html")
	public ModelAndView login() {
		mv = new ModelAndView("page.login");
		
		return mv;
	}
}
