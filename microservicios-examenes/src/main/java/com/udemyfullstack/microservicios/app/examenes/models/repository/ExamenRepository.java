package com.udemyfullstack.microservicios.app.examenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.udemyfullstack.microservicios.app.examenes.models.entity.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Long> {

}
