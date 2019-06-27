package com.mandiri.antasena.repository.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mandiri.antasena.repository.GenericRepository;

public abstract class GenericRepositoryImpl<T> implements GenericRepository<T, Long>, Serializable{

	private static final long serialVersionUID = -6881595590160916212L;
	
	@PersistenceContext
	protected EntityManager em;
	protected Class<T> clazz;
	
	@Override
	public void delete(T deleted) {
		em.remove(deleted);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return em.createQuery("Select t from " + clazz.getSimpleName() + " t").getResultList();
	}

	@Override
	public T save(T persisted) {
		return em.merge(persisted);
	}

	@Override
	public T findOne(Long id) {
		return em.find(clazz, id );
	}
}
