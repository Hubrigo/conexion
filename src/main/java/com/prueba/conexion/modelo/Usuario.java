package com.prueba.conexion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name="usuario_id")
	private Long usuario_id;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="mensaje")
	private String mensaje;
	
	
	
	
	
	public Long getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	public Usuario(Long usuario_id, String nombre, String mensaje) {
		super();
		this.usuario_id = usuario_id;
		this.nombre = nombre;
		this.mensaje = mensaje;
	
	}
	
	
}
