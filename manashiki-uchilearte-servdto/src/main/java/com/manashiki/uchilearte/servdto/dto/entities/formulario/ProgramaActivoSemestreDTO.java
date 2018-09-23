package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="programaActivoSemestreDTO")
public class ProgramaActivoSemestreDTO implements Serializable {

	private static final long serialVersionUID = -3391381512983919715L;

	private int idProgramaActivoSemestre;
	private int idProgramaUniversidad;
	private int idSemestreTemporada;
	private String descripcionProgramaActivoSemestre; //mail de solicitante
	private int estadoProgramaActivoSemestre;
	
	public ProgramaActivoSemestreDTO() {
		super();
	}

	public int getIdProgramaActivoSemestre() {
		return idProgramaActivoSemestre;
	}

	public void setIdProgramaActivoSemestre(int idProgramaActivoSemestre) {
		this.idProgramaActivoSemestre = idProgramaActivoSemestre;
	}

	public int getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public void setIdProgramaUniversidad(int idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	

	public int getIdSemestreTemporada() {
		return idSemestreTemporada;
	}

	public void setIdSemestreTemporada(int idSemestreTemporada) {
		this.idSemestreTemporada = idSemestreTemporada;
	}

	public String getDescripcionProgramaActivoSemestre() {
		return descripcionProgramaActivoSemestre;
	}

	public void setDescripcionProgramaActivoSemestre(String descripcionProgramaActivoSemestre) {
		this.descripcionProgramaActivoSemestre = descripcionProgramaActivoSemestre;
	}

	public int getEstadoProgramaActivoSemestre() {
		return estadoProgramaActivoSemestre;
	}

	public void setEstadoProgramaActivoSemestre(int estadoProgramaActivoSemestre) {
		this.estadoProgramaActivoSemestre = estadoProgramaActivoSemestre;
	}
	
	
}
