package com.mandiri.antasena.service;

import java.util.List;

import com.mandiri.antasena.domain.Role;

public interface RoleService {
    public void delete(Role role);
    public List<Role> findAll();
    public Role save(Role role);
    public List<Role> findByUserId(Long id);
}
