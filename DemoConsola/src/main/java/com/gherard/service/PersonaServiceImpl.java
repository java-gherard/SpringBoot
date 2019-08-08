package com.gherard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gherard.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		repo.registrar(nombre);	
	}	
}
