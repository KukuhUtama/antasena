package com.mandiri.antasena.service;

import java.util.List;

import com.mandiri.antasena.domain.User;

public interface UserService {
	    public void delete(User user);
	    public List<User> findAll();
	    public User save(User user);
	    public User findByUserName(String username);
}
