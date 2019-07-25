package com.filipe.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filipe.model.Formulario;
import com.filipe.repository.FormularioRepository;
import com.filipe.service.exception.ObjectNotFoundException;

@Service
public class FormularioService {

	@Autowired
	FormularioRepository formularioRepository;
	
	public Formulario find(Long id) {
		Optional<Formulario> formularioOptional = formularioRepository.findById(id);
		
		return formularioOptional.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não Encontrado! Id: " + id + " ,tipo:"+ Formulario.class.getName()));
	}
	
	@Transactional
	public Formulario insert(Formulario formulario) {
		formulario.setId(null);
		formulario = formularioRepository.save(formulario);
		return formulario;
	}
}
