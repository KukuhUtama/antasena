package com.mandiri.antasena.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mandiri.antasena.domain.UserRole;
import com.mandiri.antasena.entity.RoleEntity;
import com.mandiri.antasena.entity.UserEntity;
import com.mandiri.antasena.entity.UserRoleEntity;
import com.mandiri.antasena.repository.UserRoleRepository;
import com.mandiri.antasena.service.UserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	@Qualifier("userRoleRepository")
	private UserRoleRepository userRoleRepository;
	
	private UserRoleEntity userRoleEntity;
	private UserEntity userEntity;
	private RoleEntity roleEntity;
	
	@Override
	public UserRole save(UserRole userRole) {
		userRoleEntity = new UserRoleEntity();
		userEntity = new UserEntity();
		roleEntity = new RoleEntity();
		userEntity.fromDomain(userRole.getUser());
		roleEntity.fromDomain(userRole.getRole());
		
		userRoleEntity.fromDomain(userRole, true);
		userRoleEntity.setRoleEntity(roleEntity);
		userRoleEntity.setUserEntity(userEntity);
		
		userRoleRepository.save(userRoleEntity);
		return null;
	}

}
