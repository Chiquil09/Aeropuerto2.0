package com.tuempresa.aeropuerto2.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
@View( members = "nombre, numeroelementos;"+
                 "aerolinea;" + 
		         "detalles")
public class Tripulacion extends Identificable{
	
	@Column(length = 32)
	String nombre;
	
	@Column(length = 12)
	int numeroelementos;
	
	@ManyToOne
	@DescriptionsList
	Aerolinea aerolinea;
	
	//@ManyToOne
	//Empleado empleado;
	
	@ElementCollection
	@ListProperties("empleado.nombres, empleado.apellidos")
	Collection<Detalle> detalles;
	

}
