package com.mandiri.antasena.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController extends BaseController {
	private static final Logger logger = Logger.getLogger(LoginController.class);

	
	private ModelAndView mv;

	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout) {
		
		mv = new ModelAndView("page.login");
		String errorMessage = null;
		if (error != null) {
			errorMessage = "Username or Password is incorrect !!";
			mv.addObject("errorMessage", errorMessage);
		}
		if (logout != null) {
			errorMessage = "You have been successfully logged out !!";
			mv.addObject("message", errorMessage);
		}
		
		return mv;
	}
	
	
	@RequestMapping(value = "/logout.html", method = RequestMethod.GET)
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/login.html?logout=true";
	}
}
