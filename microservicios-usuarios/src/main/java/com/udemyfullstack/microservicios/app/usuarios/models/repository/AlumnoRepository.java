package com.udemyfullstack.microservicios.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.udemyfullstack.microservicios.app.usuarios.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
