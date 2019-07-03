package com.mandiri.antasena.domain;

import java.io.Serializable;
//https://memorynotfound.com/mixing-xml-java-config-spring/
//https://www.mkyong.com/spring/spring-mixing-xml-and-javaconfig/
public class Role extends Common implements Serializable {
	private static final long serialVersionUID = -5460971887493769502L;
	private Long id;
	private String roleName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
