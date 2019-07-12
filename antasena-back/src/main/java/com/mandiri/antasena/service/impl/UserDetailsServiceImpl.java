package com.mandiri.antasena.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.mandiri.antasena.domain.Role;
import com.mandiri.antasena.domain.User;
import com.mandiri.antasena.domain.UserRole;
import com.mandiri.antasena.service.RoleService;
import com.mandiri.antasena.service.UserRoleService;
import com.mandiri.antasena.service.UserService;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	private static final Logger logger = Logger.getLogger(UserDetailsServiceImpl.class);

	private User user;
	private List<String> listRoleName;
	private Role role;
	private UserRole userRole;
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Autowired
	@Qualifier("roleService")
	private RoleService roleService;
	
	@Autowired
	@Qualifier("userRoleService")
	private UserRoleService userRoleService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("------------------in here loadUserByUsername------------------------------");
		/*Temporary*/
		/*
		 * user = new User(); user.setCreatedBy("Admin"); user.setCreatedDate(new
		 * Date()); user.setEmail("kukuh2utama@gmail"); user.setUsername("kukuh.utama");
		 * user.setPassword("password"); user = userService.save(user);
		 * 
		 * role = new Role(); role.setCreatedBy("Admin"); role.setCreatedDate(new
		 * Date()); role.setRoleName("ADMIN"); role = roleService.save(role);
		 * 
		 * userRole = new UserRole(); userRole.setRole(role); userRole.setUser(user);
		 * userRole.setCreatedBy("Admin"); userRole.setCreatedDate(new Date());
		 * userRoleService.save(userRole);
		 */
		user = userService.findByUserName(username);
	    if(user == null){
	        throw new UsernameNotFoundException("User not authorized.");
	    }
	    
		listRoleName = new ArrayList<String>();
		for (Role elm : user.getListRole()) {
			listRoleName.add(elm.getRoleName());
		}
		return new org.springframework.security.core.userdetails.User(username, "", getAuthorities(listRoleName));
	}

	private Collection<? extends GrantedAuthority> getAuthorities(List<String> listRoleName) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : listRoleName) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}

}
