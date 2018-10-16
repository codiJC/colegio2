package com.colegio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.model.matricula;

public interface iMatriculaDao extends JpaRepository<matricula, Integer> {

}
