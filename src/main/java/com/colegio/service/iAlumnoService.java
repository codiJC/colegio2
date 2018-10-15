package com.colegio.service;

import java.util.List;
import java.util.Optional;

import com.colegio.model.alumno;

public interface iAlumnoService {
	List<alumno> listar();
	Optional<alumno> listarPorId(Integer id);
	alumno Registrar(alumno alu);
	alumno modificar(alumno alu);
	void eliminar(alumno alu);
}
