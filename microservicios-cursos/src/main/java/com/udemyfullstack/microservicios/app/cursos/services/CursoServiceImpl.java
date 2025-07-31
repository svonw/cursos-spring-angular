package com.udemyfullstack.microservicios.app.cursos.services;

import org.springframework.stereotype.Service;

import com.udemyfullstack.microservicios.app.cursos.models.entity.Curso;
import com.udemyfullstack.microservicios.app.cursos.models.repository.CursoRepository;
import com.udemyfullstack.microservicios.generic.service.GenericServiceImpl;

@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, CursoRepository> implements CursoService {

}
