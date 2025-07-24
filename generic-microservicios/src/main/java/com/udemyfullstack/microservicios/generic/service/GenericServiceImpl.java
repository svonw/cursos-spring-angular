package com.udemyfullstack.microservicios.generic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public class GenericServiceImpl<E, R extends CrudRepository<E, Long>> implements GenericService<E> {
	@Autowired
	protected R repository;
	// es protected para poder usarlo en la clase que hereda este servicio

	@Override
	@Transactional(readOnly = true)
	public Iterable<E> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	@Transactional
	public E save(E entity) {
		// TODO Auto-generated method stub
		return repository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);

	}

}
