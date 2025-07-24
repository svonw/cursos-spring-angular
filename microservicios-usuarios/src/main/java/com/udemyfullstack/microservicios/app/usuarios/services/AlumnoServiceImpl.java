package com.udemyfullstack.microservicios.app.usuarios.services;

import org.springframework.stereotype.Service;

import com.udemyfullstack.microservicios.app.usuarios.models.entity.Alumno;
import com.udemyfullstack.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.udemyfullstack.microservicios.generic.service.GenericServiceImpl;

@Service
public class AlumnoServiceImpl extends GenericServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

}
