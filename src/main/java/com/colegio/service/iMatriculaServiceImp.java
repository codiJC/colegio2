package com.colegio.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.colegio.DAO.iMatriculaDao;
import com.colegio.model.matricula;

@Service
public class iMatriculaServiceImp implements iMatriculaService {

	@Autowired
	private iMatriculaDao dao;
	
	@Override
	public List<matricula> listarpoid(matricula mat) {
		return dao.findAll();
	}

	@Override
	public Optional<matricula> listarPorId(Integer id) {
		return dao.findById(id);
	}

	@Override
	public matricula registrar(matricula mat) {
		return dao.save(mat);
	}

	@Override
	public matricula modificar(matricula mat) {
		Optional<matricula> matdao = dao.findById(mat.getId());
		if (matdao.isPresent()) {
			return dao.save(mat);
		}
		return new matricula();
		
	}

	@Override
	public void eliminar(matricula mat) {
		dao.delete(mat);
	}

}
