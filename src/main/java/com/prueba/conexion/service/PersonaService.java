package com.prueba.conexion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.conexion.modelo.Usuario;
import com.prueba.conexion.repositorio.PersonaRepositorio;


@Service
public class PersonaService {

	@Autowired /* nos indica que el servcio esta conectado con el repositorio y que hace uso de de la base de datos y los objetos*/
	private PersonaRepositorio personaRepositorio;
	
	
	public List<Usuario> getAllusuarios(){
		return personaRepositorio.findAll();
	}
		
	
	
	
}
