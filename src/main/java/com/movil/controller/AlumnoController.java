package com.movil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movil.entity.Alumno;
import com.movil.service.AlumnoService;

@RestController
@RequestMapping("/url/alumnos")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;
	
	
	//metodos de listar
	@GetMapping("/listar")
	public List<Alumno> listar() {
		return alumnoService.findAll();
	}
	
	@PostMapping("/registrar")
	public Alumno registrar(@RequestBody Alumno alumno) {
		return alumnoService.save(alumno);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") int idAlumno) {
		alumnoService.delete(idAlumno);
	}
	
}
