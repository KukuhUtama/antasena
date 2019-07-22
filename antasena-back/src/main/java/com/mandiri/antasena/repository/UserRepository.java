package com.mandiri.antasena.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mandiri.antasena.entity.UserEntity;

@Repository("userRepository")
public interface UserRepository extends GenericRepository<UserEntity, Long>{
	@Query("SELECT u FROM UserEntity u WHERE u.username = ?1")
	public UserEntity findByUserName(String username);
}
