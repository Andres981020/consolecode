package com.consolecode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consolecode.model.Persona;
import com.consolecode.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public List<Persona> listar(){
		return service.listar();
	}
	
	@PostMapping
	public ResponseEntity<Persona> registrar(@RequestBody Persona persona){
		Persona obj = service.registrar(persona);
		return new ResponseEntity<Persona>(obj,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Persona> actualizar(@RequestBody Persona persona){
		Persona obj = service.actualizar(persona);
		return new ResponseEntity<Persona>(obj,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Persona obj = service.ListarPorId(id);
		if(obj == null) {
			throw new Exception("No se encontrĂ³ id");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Persona> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Persona obj = service.ListarPorId(id);
		if(obj == null) {
			throw new Exception("No se encontrĂ³ id");
		}
		return new ResponseEntity<Persona>(obj,HttpStatus.OK);
	}
}
