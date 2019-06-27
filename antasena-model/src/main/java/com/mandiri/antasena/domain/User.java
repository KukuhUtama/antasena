package com.mandiri.antasena.domain;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = -830070182483354365L;
	
	private Long userNo;
	private String username;
	private String email;

	public Long getUserNo() {
		return userNo;
	}

	public void setUserNo(Long userNo) {
		this.userNo = userNo;
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

}
