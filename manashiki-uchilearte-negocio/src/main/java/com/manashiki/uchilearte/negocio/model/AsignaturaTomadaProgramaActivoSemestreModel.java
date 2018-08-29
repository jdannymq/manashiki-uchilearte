package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class AsignaturaTomadaProgramaActivoSemestreModel implements Serializable {
 

	private static final long serialVersionUID = 6455262527057552051L;

	private Integer idAsignaturaTomadaProgramaActivoSemestre;
	private Integer idAsignaturaProgramaActivoSemestre;
	private Integer idAlumno;
	private Integer estadoAsignaturaTomadaProgramaActivoSemestre;
	
	public AsignaturaTomadaProgramaActivoSemestreModel() {
		super();
	}

	public Integer getIdAsignaturaTomadaProgramaActivoSemestre() {
		return idAsignaturaTomadaProgramaActivoSemestre;
	}

	public void setIdAsignaturaTomadaProgramaActivoSemestre(Integer idAsignaturaTomadaProgramaActivoSemestre) {
		this.idAsignaturaTomadaProgramaActivoSemestre = idAsignaturaTomadaProgramaActivoSemestre;
	}

	public Integer getIdAsignaturaProgramaActivoSemestre() {
		return idAsignaturaProgramaActivoSemestre;
	}

	public void setIdAsignaturaProgramaActivoSemestre(Integer idAsignaturaProgramaActivoSemestre) {
		this.idAsignaturaProgramaActivoSemestre = idAsignaturaProgramaActivoSemestre;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Integer getEstadoAsignaturaTomadaProgramaActivoSemestre() {
		return estadoAsignaturaTomadaProgramaActivoSemestre;
	}

	public void setEstadoAsignaturaTomadaProgramaActivoSemestre(Integer estadoAsignaturaTomadaProgramaActivoSemestre) {
		this.estadoAsignaturaTomadaProgramaActivoSemestre = estadoAsignaturaTomadaProgramaActivoSemestre;
	}
	
}
