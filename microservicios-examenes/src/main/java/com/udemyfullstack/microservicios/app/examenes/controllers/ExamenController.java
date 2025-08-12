package com.udemyfullstack.microservicios.app.examenes.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.udemyfullstack.microservicios.app.examenes.models.entity.Examen;
import com.udemyfullstack.microservicios.app.examenes.services.ExamenService;
import com.udemyfullstack.microservicios.generic.controllers.GenericController;

@RestController
public class ExamenController extends GenericController<Examen, ExamenService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@PathVariable Long id, @RequestBody Examen examen) {
		Optional<Examen> o = service.findById(id);
		if (!o.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Examen examenDb = o.get();
		examenDb.setNombre(examen.getNombre());

		examenDb.getPreguntas().stream().filter(pdb -> !examen.getPreguntas().contains(pdb)).forEach(p -> {
			examenDb.removePregunta(p);
		});

		examenDb.setPreguntas(examen.getPreguntas());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(examenDb));
	}
}
