package com.mandiri.antasena.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mandiri.antasena.domain.Role;


@Entity
@Table(name = "t_antasena_role")
public class RoleEntity extends CommonEntity<Role> implements Serializable{
	private static final long serialVersionUID = -4835185717577191282L;
	

	private Long id;
	private String roleName;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
   
	@Column(name = "rolename",length = 150)
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
