package com.colegio.service;

import java.util.List;
import java.util.Optional;

import com.colegio.model.matricula;

public interface iMatriculaService {
	List<matricula> listarpoid(matricula mat);
	Optional<matricula> listarPorId(Integer id);
	matricula registrar(matricula mat);
	matricula modificar(matricula mat);
	void eliminar(matricula mat);
}
