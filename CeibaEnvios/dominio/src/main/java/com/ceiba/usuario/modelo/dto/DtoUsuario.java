package com.ceiba.usuario.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class DtoUsuario {
	private Long id;
	private String nombre;
	private String clave;
	private LocalDateTime fechaCreacion;

	public DtoUsuario(Long id, String nombre, String clave, LocalDateTime fechaCreacion) {
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.fechaCreacion = fechaCreacion;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getClave() {
		return clave;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

}
