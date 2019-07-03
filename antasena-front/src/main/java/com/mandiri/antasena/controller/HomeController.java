package com.mandiri.antasena.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mandiri.antasena.domain.Role;
import com.mandiri.antasena.domain.User;
import com.mandiri.antasena.domain.UserRole;
import com.mandiri.antasena.service.RoleService;
import com.mandiri.antasena.service.UserRoleService;
import com.mandiri.antasena.service.UserService;

@Controller
public class HomeController extends BaseController {
	private static final Logger logger = Logger.getLogger(HomeController.class);
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Autowired
	@Qualifier("roleService")
	private RoleService roleService;
	
	@Autowired
	@Qualifier("userRoleService")
	private UserRoleService userRoleService;
	
	private User user;
	private Role role;
	private UserRole userRole;
	
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
	    user = new User();
	    user.setCreatedBy("Admin");
	    user.setCreatedDate(new Date());
	    user.setEmail("kukuh2utama@gmail");
	    user.setUsername("kukuh.utama");
	    user = userService.save(user);
	    
	    role = new Role();
	    role.setCreatedBy("Admin");
	    role.setCreatedDate(new Date());
	    role.setRoleName("ADMIN");
	    role = roleService.save(role);
	    
	    userRole = new UserRole();
	    userRole.setRole(role);
	    userRole.setUser(user);
	    userRole.setCreatedBy("Admin");
	    userRole.setCreatedDate(new Date());
	    userRoleService.save(userRole);
		return new ModelAndView("page.index");
	}
	

	@RequestMapping(value="/user/user-detail.html")
	public ModelAndView Admin(HttpServletResponse response) throws IOException{

		return new ModelAndView("page.user.detail");
	}

}
