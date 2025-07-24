package com.udemyfullstack.microservicios.generic.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.udemyfullstack.microservicios.generic.service.GenericService;

public class GenericController<E, S extends GenericService<E>> {

	@Autowired
	protected S service;

	@GetMapping
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok().body(service.findAll());
		// responseentity es un iterable del tipo que sea por eso la ?, al body que es
		// lo que recibe la respuesta le estamos pasando la lista que devuelve findAll.
	}

	@GetMapping("/{id}") // con los {} recogemos el id que es un parametro variable
	public ResponseEntity<?> ver(@PathVariable Long id) {

		Optional<E> o = service.findById(id);
		if (o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(o.get());
	}

	@PostMapping
	public ResponseEntity<?> crear(@RequestBody E entity) {
		E alumnoDb = service.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDb);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id) {
		service.deleteById(id);
		return ResponseEntity.noContent().build();

	}

}
