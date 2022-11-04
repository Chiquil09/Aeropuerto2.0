package com.tuempresa.aeropuerto2.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable @Getter @Setter
public class Detalle {
	
	@ManyToOne(fetch=FetchType.LAZY,optional=true)
	Empleado empleado;

}
