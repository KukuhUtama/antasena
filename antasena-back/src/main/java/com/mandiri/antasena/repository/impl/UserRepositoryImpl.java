package com.mandiri.antasena.repository.impl;


import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.mandiri.antasena.entity.UserEntity;
import com.mandiri.antasena.repository.UserRepository;

@Repository("userRepository")
public class UserRepositoryImpl extends GenericRepositoryImpl <UserEntity> implements UserRepository, Serializable {
	private static final long serialVersionUID = 7280751207147765256L;


}
