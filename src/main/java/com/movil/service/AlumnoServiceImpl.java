package com.movil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movil.entity.Alumno;
import com.movil.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public List<Alumno> findAll() {
		return alumnoRepository.findAll();
	}
	
	@Override
	public Alumno findById(int idAlumno) {
		return alumnoRepository.findById(idAlumno).orElse(null);
	}
	
	@Override
	public Alumno save(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	
	@Override
	public void delete(int idAlumno) {
		alumnoRepository.deleteById(idAlumno);
	}
	

}
