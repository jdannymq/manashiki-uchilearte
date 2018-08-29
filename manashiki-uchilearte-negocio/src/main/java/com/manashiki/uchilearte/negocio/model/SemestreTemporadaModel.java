package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class SemestreTemporadaModel implements Serializable {
 
	private static final long serialVersionUID = 6854926684228271513L;

	private Integer idSemestreTemporada;
	private String nombreSemestreTemporada; //Nombre a Mostrar
	private String descripcionSemestreTemporada;
	
	public SemestreTemporadaModel() {
		super();
	}

	public Integer getIdSemestreTemporada() {
		return idSemestreTemporada;
	}

	public void setIdSemestreTemporada(Integer idSemestreTemporada) {
		this.idSemestreTemporada = idSemestreTemporada;
	}

	public String getNombreSemestreTemporada() {
		return nombreSemestreTemporada;
	}

	public void setNombreSemestreTemporada(String nombreSemestreTemporada) {
		this.nombreSemestreTemporada = nombreSemestreTemporada;
	}

	public String getDescripcionSemestreTemporada() {
		return descripcionSemestreTemporada;
	}

	public void setDescripcionSemestreTemporada(String descripcionSemestreTemporada) {
		this.descripcionSemestreTemporada = descripcionSemestreTemporada;
	}
	
	
}
