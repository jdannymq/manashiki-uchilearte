package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Index;
import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Usuario
 * en la base de Datos representa el registro de las personas asociadas al servicio.
 */
@Entity
@Table (name="asignatura_tomada_programa_activo_semestre")

public class AsignaturaTomadaProgramaActivoSemestreEntity implements Serializable {
 

	private static final long serialVersionUID = 6455262527057552051L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_asignatura_tomada_programa_activo_semestre")
	private Integer idAsignaturaTomadaProgramaActivoSemestre;
	
	@ManyToOne
	@JoinColumn(name="fk_id_programa_activo_semestre_asignatura")
	@IndexColumn(name="idx_atpas_fk_id_asignatura_programa_activo_semestre")
	private AsignaturaProgramaActivoSemestreEntity fkIdAsignaturaProgramaActivoSemestre;
	
	@ManyToOne
	@JoinColumn(name="fk_id_alumno")
	@IndexColumn(name="idx_atpas_fk_id_alumno")
	private AlumnoEntity fkIdAlumno;
	
	@OrderBy
	@Index(name="idx_atpas_estado_asignatura_tomada_programa_activo_semestre")
	@Column(name="estado_asignatura_tomada_programa_activo_semestre")
	private Integer estadoAsignaturaProgramaActivoSemestreTomada;
	
	public AsignaturaTomadaProgramaActivoSemestreEntity() {
		super();
	}

	public Integer getIdAsignaturaTomadaProgramaActivoSemestre() {
		return idAsignaturaTomadaProgramaActivoSemestre;
	}

	public void setIdAsignaturaTomadaProgramaActivoSemestre(Integer idAsignaturaTomadaProgramaActivoSemestre) {
		this.idAsignaturaTomadaProgramaActivoSemestre = idAsignaturaTomadaProgramaActivoSemestre;
	}

	public AsignaturaProgramaActivoSemestreEntity getFkIdAsignaturaProgramaActivoSemestre() {
		return fkIdAsignaturaProgramaActivoSemestre;
	}

	public void setFkIdAsignaturaProgramaActivoSemestre(
			AsignaturaProgramaActivoSemestreEntity fkIdAsignaturaProgramaActivoSemestre) {
		this.fkIdAsignaturaProgramaActivoSemestre = fkIdAsignaturaProgramaActivoSemestre;
	}

	public AlumnoEntity getFkIdAlumno() {
		return fkIdAlumno;
	}

	public void setFkIdAlumno(AlumnoEntity fkIdAlumno) {
		this.fkIdAlumno = fkIdAlumno;
	}

	public Integer getEstadoAsignaturaProgramaActivoSemestreTomada() {
		return estadoAsignaturaProgramaActivoSemestreTomada;
	}

	public void setEstadoAsignaturaProgramaActivoSemestreTomada(Integer estadoAsignaturaProgramaActivoSemestreTomada) {
		this.estadoAsignaturaProgramaActivoSemestreTomada = estadoAsignaturaProgramaActivoSemestreTomada;
	}
	
}
