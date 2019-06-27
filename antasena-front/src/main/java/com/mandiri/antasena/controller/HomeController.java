package com.mandiri.antasena.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mandiri.antasena.domain.User;
import com.mandiri.antasena.service.UserService;

@Controller
public class HomeController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	private User user;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		user = new User();
		user.setUsername("kukuh");
		user.setEmail("kukuh2utama");
		userService.save(user);
		return new ModelAndView("page.index");
	}

}
