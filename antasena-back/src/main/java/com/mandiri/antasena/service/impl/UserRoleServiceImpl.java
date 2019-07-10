package com.mandiri.antasena.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mandiri.antasena.domain.UserRole;
import com.mandiri.antasena.entity.UserRoleEntity;
import com.mandiri.antasena.repository.UserRoleRepository;
import com.mandiri.antasena.service.UserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService{
	private static final Logger logger = Logger.getLogger(UserRoleServiceImpl.class);

	private UserRoleEntity userRoleEntity;

	@Autowired
	@Qualifier("userRoleRepository")
	private UserRoleRepository userRoleRepository;
	
	@Override
	public UserRole save(UserRole userRole) {
		userRoleEntity = new UserRoleEntity();
		userRoleEntity.fromDomain(userRole, true);
		userRoleRepository.save(userRoleEntity);
		return null;
	}

}
