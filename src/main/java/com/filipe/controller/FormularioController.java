package com.filipe.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.filipe.model.Formulario;
import com.filipe.service.FormularioService;

@RestController
@RequestMapping("/formularios")
public class FormularioController {

	@Autowired
	FormularioService formularioService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Formulario> find(@PathVariable Long id){

		Formulario formulario = formularioService.find(id);
		
		return ResponseEntity.ok().body(formulario);
	}
	
	@PostMapping()
	public ResponseEntity<Formulario> insert(@RequestBody Formulario formulario){

		formulario = formularioService.insert(formulario);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(formulario.getId()).toUri();

		return ResponseEntity.created(uri).body(formulario);
	}
}
