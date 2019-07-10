package com.mandiri.antasena.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mandiri.antasena.entity.RoleEntity;

@Repository("roleRepository")
public interface RoleRepository extends GenericRepository<RoleEntity, Long>{
    
	@Query("SELECT r FROM RoleEntity r WHERE r.id IN (SELECT ur.id FROM UserRoleEntity ur WHERE ur.id = :id")
	public List<RoleEntity> findByUserId(@Param("id") Long id);
}
