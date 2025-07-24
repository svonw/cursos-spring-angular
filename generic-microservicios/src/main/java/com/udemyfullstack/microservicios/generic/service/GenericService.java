package com.udemyfullstack.microservicios.generic.service;

import java.util.Optional;

public interface GenericService<E> {

	Iterable<E> findAll();

	Optional<E> findById(Long id);

	E save(E entity);

	void deleteById(Long id);

}
