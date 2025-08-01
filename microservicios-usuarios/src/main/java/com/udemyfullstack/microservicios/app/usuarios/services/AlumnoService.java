package com.udemyfullstack.microservicios.app.usuarios.services;

import java.util.List;

import com.udemyfullstack.microservicios.generic.alumnos.models.entity.Alumno;
import com.udemyfullstack.microservicios.generic.service.GenericService;

public interface AlumnoService extends GenericService<Alumno> {

	public List<Alumno> finByNombreOrApellido(String texto);
}
