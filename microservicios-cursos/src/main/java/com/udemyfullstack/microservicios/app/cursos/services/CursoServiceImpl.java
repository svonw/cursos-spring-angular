package com.udemyfullstack.microservicios.app.cursos.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udemyfullstack.microservicios.app.cursos.models.entity.Curso;
import com.udemyfullstack.microservicios.app.cursos.models.repository.CursoRepository;
import com.udemyfullstack.microservicios.generic.service.GenericServiceImpl;

@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, CursoRepository> implements CursoService {

	@Override
	@Transactional(readOnly = true)
	public Curso findCursoByAlumnoId(Long id) {

		return repository.findCursoByAlumnoId(id);
	}

}
