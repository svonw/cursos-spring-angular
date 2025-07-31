package com.udemyfullstack.microservicios.app.cursos.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemyfullstack.microservicios.app.cursos.models.entity.Curso;
import com.udemyfullstack.microservicios.app.cursos.services.CursoService;
import com.udemyfullstack.microservicios.generic.controllers.GenericController;

@RestController
@RequestMapping("/api/cursos")
public class CursoController extends GenericController<Curso, CursoService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Curso curso, @PathVariable Long id) {

		Optional<Curso> o = this.service.findById(id);
		if (!o.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Curso dbCurso = o.get();
		dbCurso.setNombre(curso.getNombre());
		return ResponseEntity.ok(service.save(dbCurso));
	}

}
