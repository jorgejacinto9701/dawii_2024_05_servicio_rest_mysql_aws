package com.movil.service;

import java.util.List;

import com.movil.entity.Alumno;

public interface AlumnoService {

	//metodos para el crud
	public abstract List<Alumno> findAll();
	public abstract Alumno findById(int idAlumno);
	public abstract Alumno save(Alumno alumno);
	public abstract void delete(int idAlumno);
	
	
}