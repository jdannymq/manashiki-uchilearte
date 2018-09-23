package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="asignaturaProgramaActivoSemestreDTO")
public class AsignaturaProgramaActivoSemestreDTO implements Serializable {
	
	private static final long serialVersionUID = 2619967122808208238L;
	
	private int idAsignaturaProgramaActivoSemestre;
	private int idProgramaActivoSemestre;
	private String nombreAsignaturaProgramaActivoSemestre; //
	private String descripcionAsignaturaProgramaActivoSemestre; //
	private int estadoAsignaturaProgramaActivoSemestre;
	
	public AsignaturaProgramaActivoSemestreDTO() {
		super();
	}

	public int getIdAsignaturaProgramaActivoSemestre() {
		return idAsignaturaProgramaActivoSemestre;
	}

	public void setIdAsignaturaProgramaActivoSemestre(int idAsignaturaProgramaActivoSemestre) {
		this.idAsignaturaProgramaActivoSemestre = idAsignaturaProgramaActivoSemestre;
	}

	public int getIdProgramaActivoSemestre() {
		return idProgramaActivoSemestre;
	}

	public void setIdProgramaActivoSemestre(int idProgramaActivoSemestre) {
		this.idProgramaActivoSemestre = idProgramaActivoSemestre;
	}

	public String getNombreAsignaturaProgramaActivoSemestre() {
		return nombreAsignaturaProgramaActivoSemestre;
	}

	public void setNombreAsignaturaProgramaActivoSemestre(String nombreAsignaturaProgramaActivoSemestre) {
		this.nombreAsignaturaProgramaActivoSemestre = nombreAsignaturaProgramaActivoSemestre;
	}

	public String getDescripcionAsignaturaProgramaActivoSemestre() {
		return descripcionAsignaturaProgramaActivoSemestre;
	}

	public void setDescripcionAsignaturaProgramaActivoSemestre(String descripcionAsignaturaProgramaActivoSemestre) {
		this.descripcionAsignaturaProgramaActivoSemestre = descripcionAsignaturaProgramaActivoSemestre;
	}

	public int getEstadoAsignaturaProgramaActivoSemestre() {
		return estadoAsignaturaProgramaActivoSemestre;
	}

	public void setEstadoAsignaturaProgramaActivoSemestre(int estadoAsignaturaProgramaActivoSemestre) {
		this.estadoAsignaturaProgramaActivoSemestre = estadoAsignaturaProgramaActivoSemestre;
	}
	
}
