package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.util.Date;

public class AlumnoProgramaActivoSemestreDTO implements Serializable {
 
	private static final long serialVersionUID = -7680302162672877658L;

	private Integer idAlumnoProgramaActivoSemestre;
	
	private Integer idProgramaActivoSemestre;
	
	private Integer idAlumno;
	
	private Date fechaInicialInscripcionAlumnoProgramaActivoSemestre; 
	
	private Integer estadoAlumnoProgramaActivoSemestre;
	
	public AlumnoProgramaActivoSemestreDTO() {
		super();
	}

	public Integer getIdAlumnoProgramaActivoSemestre() {
		return idAlumnoProgramaActivoSemestre;
	}

	public void setIdAlumnoProgramaActivoSemestre(Integer idAlumnoProgramaActivoSemestre) {
		this.idAlumnoProgramaActivoSemestre = idAlumnoProgramaActivoSemestre;
	}

	public Integer getIdProgramaActivoSemestre() {
		return idProgramaActivoSemestre;
	}

	public void setIdProgramaActivoSemestre(Integer idProgramaActivoSemestre) {
		this.idProgramaActivoSemestre = idProgramaActivoSemestre;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	public Date getFechaInicialInscripcionAlumnoProgramaActivoSemestre() {
		return fechaInicialInscripcionAlumnoProgramaActivoSemestre;
	}

	public void setFechaInicialInscripcionAlumnoProgramaActivoSemestre(
			Date fechaInicialInscripcionAlumnoProgramaActivoSemestre) {
		this.fechaInicialInscripcionAlumnoProgramaActivoSemestre = fechaInicialInscripcionAlumnoProgramaActivoSemestre;
	}

	public Integer getEstadoAlumnoProgramaActivoSemestre() {
		return estadoAlumnoProgramaActivoSemestre;
	}

	public void setEstadoAlumnoProgramaActivoSemestre(Integer estadoAlumnoProgramaActivoSemestre) {
		this.estadoAlumnoProgramaActivoSemestre = estadoAlumnoProgramaActivoSemestre;
	}
	
	
}
