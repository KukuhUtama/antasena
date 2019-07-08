package com.mandiri.antasena.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mandiri.antasena.domain.UserRole;

@Entity
@Table(name = "t_antasena_user_role")
public class UserRoleEntity extends CommonEntity<UserRole> implements Serializable {
	private static final long serialVersionUID = -3087543533387763789L;

	private Long id;
	private UserEntity userEntity;
	private RoleEntity roleEntity;

	public UserRoleEntity() {
	        ignoreList = new String[] {};
	}

	@Override
    public void fromDomain(UserRole domain, boolean includeChild) {
		super.fromDomain(domain, includeChild);
		userEntity = new UserEntity();
		userEntity.fromDomain(domain.getUser());
		roleEntity = new RoleEntity();
		roleEntity.fromDomain(domain.getRole());
	}
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id")
	public RoleEntity getRoleEntity() {
		return roleEntity;
	}

	public void setRoleEntity(RoleEntity roleEntity) {
		this.roleEntity = roleEntity;
	}

}
