package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.model.alumno;
import com.colegio.service.iAlumnoService;

@RestController
public class alumnoController {

	@Autowired
	private iAlumnoService serv;
	
	@GetMapping(value = "/listar")
	public List<alumno> listar(){
		return serv.listar();
	}
	
}
