package com.mandiri.antasena.repository;

import org.springframework.stereotype.Repository;

import com.mandiri.antasena.entity.UserRoleEntity;

@Repository("userRoleRepository")
public interface UserRoleRepository extends GenericRepository<UserRoleEntity, Long>{

}
