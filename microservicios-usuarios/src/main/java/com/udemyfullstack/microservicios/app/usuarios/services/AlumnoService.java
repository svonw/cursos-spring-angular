package com.udemyfullstack.microservicios.app.usuarios.services;

import java.util.Optional;

import com.udemyfullstack.microservicios.app.usuarios.models.entity.Alumno;

public interface AlumnoService {

	Iterable<Alumno> findAll();

	Optional<Alumno> findById(Long id);

	Alumno save(Alumno alumno);

	void deleteById(Long id);

}
