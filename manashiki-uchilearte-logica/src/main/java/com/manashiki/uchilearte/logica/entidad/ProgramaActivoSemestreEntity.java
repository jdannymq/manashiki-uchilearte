package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Index;
import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Usuario
 * en la base de Datos representa el registro de las personas asociadas al servicio.
 */
@Entity
@Table (name="programa_activo_semestre")

public class ProgramaActivoSemestreEntity implements Serializable {
 

	private static final long serialVersionUID = -4823628814973538188L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_programa_activo_semestre")
	private Integer idProgramaActivoSemestre;
	
	@ManyToOne
	@JoinColumn(name="fk_id_programa_universidad")
	@IndexColumn(name="idx_pas_fk_id_programa_universidad")
	private ProgramaUniversidadEntity fkIdProgramaUniversidad;
	
	@ManyToOne
	@JoinColumn(name="fk_id_semestre_temporada")
	@IndexColumn(name="idx_pas_fk_id_semestre_temporada")
	private SemestreTemporadaEntity fkIdSemestreTemporada;
	
	@OrderBy
	@Column(name="descripcion_programa_activo_semestre")
	private String descripcionProgramaActivoSemestre; //mail de solicitante
	
	@OrderBy
	@Index(name="idx_pas_estado_programa_activo_semestre")
	@Column(name="estado_programa_activo_semestre")
	private Integer estadoProgramaActivoSemestre;
	
	@OneToMany(mappedBy="fkIdProgramaActivoSemestre")
	private List<AsignaturaProgramaActivoSemestreEntity> programas_activos_semestres_asignaturas;
	
	@OneToMany(mappedBy="fkIdProgramaActivoSemestre")
	private List<AlumnoProgramaActivoSemestreEntity> alumnos_programas_activos_semestres_asignaturas;
	
	
	public ProgramaActivoSemestreEntity() {
		super();
	}

	public Integer getIdProgramaActivoSemestre() {
		return idProgramaActivoSemestre;
	}

	public void setIdProgramaActivoSemestre(Integer idProgramaActivoSemestre) {
		this.idProgramaActivoSemestre = idProgramaActivoSemestre;
	}

	public ProgramaUniversidadEntity getFkIdProgramaUniversidad() {
		return fkIdProgramaUniversidad;
	}

	public void setFkIdProgramaUniversidad(ProgramaUniversidadEntity fkIdProgramaUniversidad) {
		this.fkIdProgramaUniversidad = fkIdProgramaUniversidad;
	}

	public SemestreTemporadaEntity getFkIdSemestreTemporada() {
		return fkIdSemestreTemporada;
	}

	public void setFkIdSemestreTemporada(SemestreTemporadaEntity fkIdSemestreTemporada) {
		this.fkIdSemestreTemporada = fkIdSemestreTemporada;
	}

	public String getDescripcionProgramaActivoSemestre() {
		return descripcionProgramaActivoSemestre;
	}

	public void setDescripcionProgramaActivoSemestre(String descripcionProgramaActivoSemestre) {
		this.descripcionProgramaActivoSemestre = descripcionProgramaActivoSemestre;
	}

	public Integer getEstadoProgramaActivoSemestre() {
		return estadoProgramaActivoSemestre;
	}

	public void setEstadoProgramaActivoSemestre(Integer estadoProgramaActivoSemestre) {
		this.estadoProgramaActivoSemestre = estadoProgramaActivoSemestre;
	}

	public List<AsignaturaProgramaActivoSemestreEntity> getProgramas_activos_semestres_asignaturas() {
		return programas_activos_semestres_asignaturas;
	}

	public void setProgramas_activos_semestres_asignaturas(
			List<AsignaturaProgramaActivoSemestreEntity> programas_activos_semestres_asignaturas) {
		this.programas_activos_semestres_asignaturas = programas_activos_semestres_asignaturas;
	}

	public List<AlumnoProgramaActivoSemestreEntity> getAlumnos_programas_activos_semestres_asignaturas() {
		return alumnos_programas_activos_semestres_asignaturas;
	}

	public void setAlumnos_programas_activos_semestres_asignaturas(
			List<AlumnoProgramaActivoSemestreEntity> alumnos_programas_activos_semestres_asignaturas) {
		this.alumnos_programas_activos_semestres_asignaturas = alumnos_programas_activos_semestres_asignaturas;
	}
	
	
}
