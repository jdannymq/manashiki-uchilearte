package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class AlumnoModel implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -413475494953773193L;
	private Integer idAlumnoUchile;
	private String descripcionAlumnosUchile;
	private Integer estadoAlumnosUchile;
	
	public AlumnoModel() {
		super();
	}

	public Integer getIdAlumnoUchile() {
		return idAlumnoUchile;
	}

	public void setIdAlumnoUchile(Integer idAlumnoUchile) {
		this.idAlumnoUchile = idAlumnoUchile;
	}

	public String getDescripcionAlumnosUchile() {
		return descripcionAlumnosUchile;
	}

	public void setDescripcionAlumnosUchile(String descripcionAlumnosUchile) {
		this.descripcionAlumnosUchile = descripcionAlumnosUchile;
	}

	public Integer getEstadoAlumnosUchile() {
		return estadoAlumnosUchile;
	}

	public void setEstadoAlumnosUchile(Integer estadoAlumnosUchile) {
		this.estadoAlumnosUchile = estadoAlumnosUchile;
	}
	
}
