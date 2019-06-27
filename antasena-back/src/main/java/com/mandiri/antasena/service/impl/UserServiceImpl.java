package com.mandiri.antasena.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mandiri.antasena.domain.User;
import com.mandiri.antasena.entity.UserEntity;
import com.mandiri.antasena.repository.UserRepository;
import com.mandiri.antasena.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;

	private UserEntity userEntity;
	private User user;
	private List<User> listUser;

	@Override
	public void delete(User deleted) {
		userEntity = new UserEntity();
		userEntity.fromDomain(deleted, true);
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
	public User save(User persisted) {
		user = null;
		userEntity = new UserEntity();
		userEntity.fromDomain(persisted, true);
		userEntity = userRepository.save(userEntity);
		return user = userEntity.toDomain(User.class, true);
	}

}
