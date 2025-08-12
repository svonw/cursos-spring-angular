package com.udemyfullstack.microservicios.app.examenes.services;

import org.springframework.stereotype.Service;

import com.udemyfullstack.microservicios.app.examenes.models.entity.Examen;
import com.udemyfullstack.microservicios.app.examenes.models.repository.ExamenRepository;
import com.udemyfullstack.microservicios.generic.service.GenericServiceImpl;

@Service
public class ExamenServiceImpl extends GenericServiceImpl<Examen, ExamenRepository> implements ExamenService {

}
