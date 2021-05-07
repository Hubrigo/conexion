package com.prueba.conexion.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.prueba.conexion.modelo.Usuario;
import com.prueba.conexion.service.PersonaService;
@RestController
@RequestMapping ("/api/usuario/")

public class PersonaRest {

	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	private ResponseEntity<List<Usuario>> ListaUsuarios (){
		return ResponseEntity.ok(personaService.getAllusuarios());
	}
	

	
	
}
