package com.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.DAO.iAlumnoDao;
import com.colegio.model.alumno;

@Service
public class iAlumnoServiceImp implements iAlumnoService {

	@Autowired
	private iAlumnoDao dao;
	
	@Override
	public List<alumno> listar() {
		return dao.findAll();
	}

	@Override
	public Optional<alumno> listarPorId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public alumno Registrar(alumno alu) {
		return dao.save(alu);
	}

	@Override
	public alumno modificar(alumno alu) {
		Optional<alumno> alumnoM = dao.findById(alu.getId());
		if (alumnoM.isPresent()) {
			return dao.save(alu);
		}
		return new alumno();
	}

	@Override
	public void eliminar(alumno alu) {
		dao.delete(alu);
	}

}
