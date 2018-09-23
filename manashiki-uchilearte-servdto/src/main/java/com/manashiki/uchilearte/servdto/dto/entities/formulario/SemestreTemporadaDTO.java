package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="semestreTemporadaDTO")
public class SemestreTemporadaDTO implements Serializable {
 

	private static final long serialVersionUID = -6333428817911635601L;
	
	private int idSemestreTemporada;
	private String nombreSemestreTemporada; //Nombre a Mostrar
	private String descripcionSemestreTemporada;
	
	public SemestreTemporadaDTO() {
		super();
	}

	public int getIdSemestreTemporada() {
		return idSemestreTemporada;
	}

	public void setIdSemestreTemporada(int idSemestreTemporada) {
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
