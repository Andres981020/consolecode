package com.consolecode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.consolecode.model.Persona;

@Service
public interface IPersonaService {

	List<Persona> listar();
	Persona registrar(Persona persona);
	Persona actualizar(Persona persona);
	void eliminar(Integer codigo);
	Persona ListarPorId(Integer codigo);
}
