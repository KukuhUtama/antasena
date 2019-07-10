package com.mandiri.antasena.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mandiri.antasena.domain.Role;
import com.mandiri.antasena.domain.User;
import com.mandiri.antasena.entity.RoleEntity;
import com.mandiri.antasena.entity.UserEntity;
import com.mandiri.antasena.repository.RoleRepository;
import com.mandiri.antasena.repository.UserRepository;
import com.mandiri.antasena.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	@Autowired
	@Qualifier("roleRepository")
	private RoleRepository roleRepository;

	private UserEntity userEntity;
	private List<RoleEntity> listRoleEntity;
	private List<User> listUser;
	private List<Role> listRole;
	

	@Override
	public void delete(User user) {
		userEntity = new UserEntity();
		userEntity.fromDomain(user, true);
		userRepository.delete(userEntity);
	}

	@Override
	public List<User> findAll() {
		listUser = new ArrayList<User>();
		for (UserEntity el : userRepository.findAll()) {
			listUser.add(el.toDomain(User.class, true));
		}
		return listUser;
	}

	@Override
	public User save(User user) {
		userEntity = new UserEntity();
		userEntity.fromDomain(user, true);
		userEntity = userRepository.save(userEntity);
		return user = userEntity.toDomain(User.class, true);
	}

	@Override
	public User findByUserName(String username) {
        User user = null;
        userEntity = new UserEntity();
        userEntity = userRepository.findByUserName(username);
        user = userEntity.toDomain(User.class, true);
        if(user != null && user.getId() != null) {
        	listRoleEntity = roleRepository.findByUserId(userEntity.getId());
        }
        if(listRoleEntity != null && listRoleEntity.size() > 0) {
        	listRole = new ArrayList<Role>();
        	for(RoleEntity elm : listRoleEntity) {
        		listRole.add(elm.toDomain(Role.class));
        	}
        	user.setListRole(listRole);
        }
        return user;
	}

}
