package com.mandiri.antasena.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface GenericRepository <T, ID extends Serializable> extends Repository<T, ID> {
 
    void delete(T deleted);
 
    List<T> findAll();
 
    T save(T persisted);
    
    T findOne(Long id);
}