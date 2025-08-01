package com.udemyfullstack.microservicios.app.usuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemyfullstack.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.udemyfullstack.microservicios.generic.alumnos.models.entity.Alumno;
import com.udemyfullstack.microservicios.generic.service.GenericServiceImpl;

@Service
public class AlumnoServiceImpl extends GenericServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> finByNombreOrApellido(String texto) {
		// TODO Auto-generated method stub
		return repository.finByNombreOrApellido(texto);
	}

}
