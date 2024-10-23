package com.movil.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "alumno")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlumno;

	@Column(name = "nombres", nullable = false, length = 200)
	private String nombres;

	@Column(name = "apellidos", nullable = false, length = 200)
	private String apellidos;

	@Column(name = "dni", nullable = false, length = 8)
	private String dni;

	@Column(name = "fechaNacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

}
