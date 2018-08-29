package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="asignaturaTomadaProgramaActivoSemestreTomadaDTO")
public class AsignaturaTomadaProgramaActivoSemestreDTO implements Serializable {
 
	private static final long serialVersionUID = 8194515523461562063L;

	private int idAsignaturaTomadaProgramaActivoSemestre;
	private int idAsignaturaProgramaActivosSemestre;
	private int idAlumno;
	private int estadoAsignaturaTomadaProgramaActivoSemestre;
	
	public AsignaturaTomadaProgramaActivoSemestreDTO() {
		super();
	}

	public int getIdAsignaturaTomadaProgramaActivoSemestre() {
		return idAsignaturaTomadaProgramaActivoSemestre;
	}

	public void setIdAsignaturaTomadaProgramaActivoSemestre(int idAsignaturaTomadaProgramaActivoSemestre) {
		this.idAsignaturaTomadaProgramaActivoSemestre = idAsignaturaTomadaProgramaActivoSemestre;
	}

	public int getIdAsignaturaProgramaActivosSemestre() {
		return idAsignaturaProgramaActivosSemestre;
	}

	public void setIdAsignaturaProgramaActivosSemestre(int idAsignaturaProgramaActivosSemestre) {
		this.idAsignaturaProgramaActivosSemestre = idAsignaturaProgramaActivosSemestre;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public int getEstadoAsignaturaTomadaProgramaActivoSemestre() {
		return estadoAsignaturaTomadaProgramaActivoSemestre;
	}

	public void setEstadoAsignaturaTomadaProgramaActivoSemestre(int estadoAsignaturaTomadaProgramaActivoSemestre) {
		this.estadoAsignaturaTomadaProgramaActivoSemestre = estadoAsignaturaTomadaProgramaActivoSemestre;
	}
	
}
