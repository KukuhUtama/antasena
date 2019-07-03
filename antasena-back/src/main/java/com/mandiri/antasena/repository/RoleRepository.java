package com.mandiri.antasena.repository;

import org.springframework.stereotype.Repository;

import com.mandiri.antasena.entity.RoleEntity;

@Repository("roleRepository")
public interface RoleRepository extends GenericRepository<RoleEntity, Long>{

}
