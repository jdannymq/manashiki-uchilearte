package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Index;
import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Usuario
 * en la base de Datos representa el registro de las personas asociadas al servicio.
 */
@Entity
@Table (name="alumno_programa_activo_semestre")

public class AlumnoProgramaActivoSemestreEntity implements Serializable {
 
	private static final long serialVersionUID = -4371823717700196231L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_alumno_programa_activo_semestre")
	private Integer idAlumnoProgramaActivoSemestre;
	
	@ManyToOne
	@JoinColumn(name="fk_id_programa_activo_semestre")
	@IndexColumn(name="idx_apas_fk_id_programa_activo_semestre")
	private ProgramaActivoSemestreEntity fkIdProgramaActivoSemestre;
	
	@ManyToOne
	@JoinColumn(name="fk_id_alumno")
	@IndexColumn(name="idx_apas_fk_id_alumno")
	private AlumnoEntity fkIdAlumno;
	
	@OrderBy
	@Column(name="fecha_inicial_inscripcion_alumno_programa_activo_semestre")
	private Timestamp fechaInicialInscripcionAlumnoProgramaActivoSemestre; //
	
	@OrderBy
	@Index(name="idx_apas_estado_alumno_programa_activo_semestre")
	@Column(name="estado_alumno_programa_activo_semestre")
	private Integer estadoAlumnoProgramaActivoSemestre;
	
	
	
	public AlumnoProgramaActivoSemestreEntity() {
		super();
	}

	public Integer getIdAlumnoProgramaActivoSemestre() {
		return idAlumnoProgramaActivoSemestre;
	}

	public void setIdAlumnoProgramaActivoSemestre(Integer idAlumnoProgramaActivoSemestre) {
		this.idAlumnoProgramaActivoSemestre = idAlumnoProgramaActivoSemestre;
	}

	public ProgramaActivoSemestreEntity getFkIdProgramaActivoSemestre() {
		return fkIdProgramaActivoSemestre;
	}

	public void setFkIdProgramaActivoSemestre(ProgramaActivoSemestreEntity fkIdProgramaActivoSemestre) {
		this.fkIdProgramaActivoSemestre = fkIdProgramaActivoSemestre;
	}

	public AlumnoEntity getFkIdAlumno() {
		return fkIdAlumno;
	}

	public void setFkIdAlumno(AlumnoEntity fkIdAlumno) {
		this.fkIdAlumno = fkIdAlumno;
	}

	public Timestamp getFechaInicialInscripcionAlumnoProgramaActivoSemestre() {
		return fechaInicialInscripcionAlumnoProgramaActivoSemestre;
	}

	public void setFechaInicialInscripcionAlumnoProgramaActivoSemestre(
			Timestamp fechaInicialInscripcionAlumnoProgramaActivoSemestre) {
		this.fechaInicialInscripcionAlumnoProgramaActivoSemestre = fechaInicialInscripcionAlumnoProgramaActivoSemestre;
	}

	public Integer getEstadoAlumnoProgramaActivoSemestre() {
		return estadoAlumnoProgramaActivoSemestre;
	}

	public void setEstadoAlumnoProgramaActivoSemestre(Integer estadoAlumnoProgramaActivoSemestre) {
		this.estadoAlumnoProgramaActivoSemestre = estadoAlumnoProgramaActivoSemestre;
	}

	
}
