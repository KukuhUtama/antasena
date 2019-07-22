package com.mandiri.antasena.domain;

import java.io.Serializable;
import java.util.List;

public class User extends Common implements Serializable{

	private static final long serialVersionUID = -830070182483354365L;
	
	private Long id;
	private String username;
	private String email;
	private String password;
	private List<Role> listRole;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getListRole() {
		return listRole;
	}

	public void setListRole(List<Role> listRole) {
		this.listRole = listRole;
	}
}
