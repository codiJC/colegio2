package com.colegio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "matricula")
public class matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String fchRegistro;
	private String copiaDniAlu;
	private String copiaDniApo;
	private String copiaRecibo;
	private String declaracion;
	
	public matricula() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFchRegistro() {
		return fchRegistro;
	}
	public void setFchRegistro(String fchRegistro) {
		this.fchRegistro = fchRegistro;
	}
	public String getCopiaDniAlu() {
		return copiaDniAlu;
	}
	public void setCopiaDniAlu(String copiaDniAlu) {
		this.copiaDniAlu = copiaDniAlu;
	}
	public String getCopiaDniApo() {
		return copiaDniApo;
	}
	public void setCopiaDniApo(String copiaDniApo) {
		this.copiaDniApo = copiaDniApo;
	}
	public String getCopiaRecibo() {
		return copiaRecibo;
	}
	public void setCopiaRecibo(String copiaRecibo) {
		this.copiaRecibo = copiaRecibo;
	}
	public String getDeclaracion() {
		return declaracion;
	}
	public void setDeclaracion(String declaracion) {
		this.declaracion = declaracion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		matricula other = (matricula) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
}
