package com.colegio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.DAO.iApoderadoDao;
import com.colegio.model.apoderado;

@Service
public class iApoderadoServiceImp implements iApoderadoService {

	@Autowired
	private iApoderadoDao dao;
	
	@Override
	public List<apoderado> listar() {
		return dao.findAll();
	}

	@Override
	public Optional<apoderado> listarPorId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public apoderado registrar(apoderado apo) {
		return dao.save(apo);
	}

	@Override
	public apoderado actualizar(apoderado apo) {
		Optional<apoderado> apodao = dao.findById(apo.getId());
		if (apodao.isPresent()) {
			return dao.save(apo);
		}
		return new apoderado();
	}

	@Override
	public void eliminar(apoderado apo) {
		dao.delete(apo);
		
	}

}
