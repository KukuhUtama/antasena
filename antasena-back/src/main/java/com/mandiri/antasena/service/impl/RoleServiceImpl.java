package com.mandiri.antasena.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mandiri.antasena.domain.Role;
import com.mandiri.antasena.entity.RoleEntity;
import com.mandiri.antasena.repository.RoleRepository;
import com.mandiri.antasena.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	@Qualifier("roleRepository")
	private RoleRepository roleRepository;
	
	private Role role;
	private RoleEntity roleEntity;
	private List<Role> listRole;
	
	@Override
	public void delete(Role role) {
		roleEntity = new RoleEntity();
		roleEntity.fromDomain(role);
		roleRepository.delete(roleEntity);
	}

	@Override
	public List<Role> findAll() {
		listRole = new ArrayList<Role>();
		for(RoleEntity el : roleRepository.findAll()) {
			role = el.toDomain(Role.class, true);
			listRole.add(role);
		}
		return listRole;
	}

	@Override
	public Role save(Role role) {
		roleEntity =  new RoleEntity();
		roleEntity.fromDomain(role);
		roleEntity = roleRepository.save(roleEntity);
		return roleEntity.toDomain(Role.class); 
	}
}
