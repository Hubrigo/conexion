package com.prueba.conexion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.conexion.modelo.Usuario;

public interface PersonaRepositorio extends JpaRepository<Usuario, Long> { 
/* Se crea una interfaz en donde extendemos el repository de JPA, nos exige un objeto (El objero es la clase) y un identificador(int) */

}
