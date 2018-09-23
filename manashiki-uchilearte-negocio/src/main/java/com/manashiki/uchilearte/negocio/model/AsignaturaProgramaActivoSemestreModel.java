package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class AsignaturaProgramaActivoSemestreModel implements Serializable {
	
	private static final long serialVersionUID = 328901007901665059L;
	
	private Integer idAsignaturaProgramaActivoSemestre;
	private Integer idProgramaActivoSemestre;
	private String nombreAsignaturaProgramaActivoSemestre; //
	private String descripcionAsignaturaProgramaActivoSemestre; //
	private Integer estadoAsignaturaProgramaActivoSemestre;
	
	public AsignaturaProgramaActivoSemestreModel() {
		super();
	}

	public Integer getIdAsignaturaProgramaActivoSemestre() {
		return idAsignaturaProgramaActivoSemestre;
	}

	public void setIdAsignaturaProgramaActivoSemestre(Integer idAsignaturaProgramaActivoSemestre) {
		this.idAsignaturaProgramaActivoSemestre = idAsignaturaProgramaActivoSemestre;
	}

	public Integer getIdProgramaActivoSemestre() {
		return idProgramaActivoSemestre;
	}

	public void setIdProgramaActivoSemestre(Integer idProgramaActivoSemestre) {
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

	public Integer getEstadoAsignaturaProgramaActivoSemestre() {
		return estadoAsignaturaProgramaActivoSemestre;
	}

	public void setEstadoAsignaturaProgramaActivoSemestre(Integer estadoAsignaturaProgramaActivoSemestre) {
		this.estadoAsignaturaProgramaActivoSemestre = estadoAsignaturaProgramaActivoSemestre;
	}
}
