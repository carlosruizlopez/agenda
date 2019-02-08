package net.tecgurus.agenda.model;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope("prototype")
public @Data class Contacto {
	private Integer id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String email;
	private Date fechaNacimiento;
	private Integer id_usuario;
}
