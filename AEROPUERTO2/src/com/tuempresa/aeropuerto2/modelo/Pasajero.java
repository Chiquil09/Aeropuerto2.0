package com.tuempresa.aeropuerto2.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
@View(members = "numAsiento, costoBoleto; " +
                                 "persona")
public class Pasajero extends Identificable{
	
	@Column(length = 8)
	int numAsiento;
	
	@Column(length = 10)
	float costoBoleto;
	
	@ManyToOne
	@ReferenceView("refe")
	Persona persona;
	
}
