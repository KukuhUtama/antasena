package com.mandiri.antasena.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mandiri.antasena.domain.Role;
import com.mandiri.antasena.domain.User;
import com.mandiri.antasena.service.UserService;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	private static final Logger logger = Logger.getLogger(UserDetailsServiceImpl.class);

	private User user;
	private List<String> listRoleName;

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		user = userService.findByUserName(username);
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
