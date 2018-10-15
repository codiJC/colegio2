package com.colegio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegio.model.alumno;

public interface iAlumnoDao extends JpaRepository<alumno, Integer> {


}
