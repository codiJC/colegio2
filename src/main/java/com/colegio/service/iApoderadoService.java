package com.colegio.service;

import java.util.List;
import java.util.Optional;
import com.colegio.model.apoderado;

public interface iApoderadoService {
	List<apoderado> listar();
	Optional<apoderado> listarPorId(Integer id);
	apoderado registrar(apoderado apo);
	apoderado actualizar(apoderado apo);
	void eliminar(apoderado apo);
}
