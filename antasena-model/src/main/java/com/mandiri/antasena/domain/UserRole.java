package com.mandiri.antasena.domain;

import java.io.Serializable;

public class UserRole extends Common implements Serializable{
	private static final long serialVersionUID = 7413386152978230715L;
	
	private long id;
	private User user;
	private Role role;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
}
