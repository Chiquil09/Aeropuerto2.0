package com.tuempresa.aeropuerto2.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "nombres, apellidos; " +
                              "fotografia;" +
		                      "direccion")
public class Persona extends Identificable {
	
	@Column(length = 23)
	String nombres;
	
	@Column(length = 23)
	String apellidos;
	
	@File
	@Column(length = 32)
	String fotografia;
	
	@ManyToOne
	Direccion direccion;

}
