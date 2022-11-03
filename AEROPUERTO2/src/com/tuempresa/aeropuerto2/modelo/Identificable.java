package com.tuempresa.aeropuerto2.modelo;

import javax.persistence.*;

import org.hibernate.annotations.*;
import org.openxava.annotations.*;

import lombok.*;

@MappedSuperclass @Getter @Setter
public class Identificable {
	
	@Id
	@Hidden
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(length = 32)
	String oid;
}
