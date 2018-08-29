package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="alumnoDTO")
public class AlumnoDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -181671067657883357L;

	private int idAlumnoUchile;
	private String descripcionAlumnosUchile; //mail de solicitante
	private int estadoAlumnosUchile;
	
	public AlumnoDTO() {
		super();
	}

	public int getIdAlumnoUchile() {
		return idAlumnoUchile;
	}

	public void setIdAlumnoUchile(int idAlumnoUchile) {
		this.idAlumnoUchile = idAlumnoUchile;
	}

	public String getDescripcionAlumnosUchile() {
		return descripcionAlumnosUchile;
	}

	public void setDescripcionAlumnosUchile(String descripcionAlumnosUchile) {
		this.descripcionAlumnosUchile = descripcionAlumnosUchile;
	}

	public int getEstadoAlumnosUchile() {
		return estadoAlumnosUchile;
	}

	public void setEstadoAlumnosUchile(int estadoAlumnosUchile) {
		this.estadoAlumnosUchile = estadoAlumnosUchile;
	}
	
}
