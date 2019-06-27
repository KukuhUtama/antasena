package com.mandiri.antasena.service;

import java.util.List;

import com.mandiri.antasena.domain.User;

public interface UserService {
	    void delete(User deleted);
	    List<User> findAll();
	    User save(User persisted);
}
