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
@Table (name="asignatura_programa_activo_semestre")

public class AsignaturaProgramaActivoSemestreEntity implements Serializable {
 

	private static final long serialVersionUID = 6455262527057552051L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_asignatura_programa_activo_semestre")
	private Integer idAsignaturaProgramaActivoSemestre;
	
	@ManyToOne
	@JoinColumn(name="fk_id_programa_activo_semestre")
	@IndexColumn(name="idx_apas_fk_id_programa_activo_semestre")
	private ProgramaActivoSemestreEntity fkIdProgramaActivoSemestre;
	
	@OrderBy
	@Column(name="nombre_asignatura_programa_activo_semestre")
	private String nombreAsignaturaProgramaActivoSemestre; //
	
	@OrderBy
	@Column(name="descripcion_asignatura_programa_activo_semestre")
	private String descripcionAsignaturaProgramaActivoSemestre; //
	
	@OrderBy
	@Index(name="idx_apas_estado_asignatura_programa_activo_semestre")
	@Column(name="estado_asignatura_programa_activo_semestre")
	private Integer estadoAsignaturaProgramaActivoSemestre;
	
	@OneToMany(mappedBy="fkIdAsignaturaProgramaActivoSemestre")
	private List<AsignaturaTomadaProgramaActivoSemestreEntity> programas_activos_semestres_asignaturas_tomadas;
	
	public AsignaturaProgramaActivoSemestreEntity() {
		super();
	}

	public Integer getIdAsignaturaProgramaActivoSemestre() {
		return idAsignaturaProgramaActivoSemestre;
	}

	public void setIdAsignaturaProgramaActivoSemestre(Integer idAsignaturaProgramaActivoSemestre) {
		this.idAsignaturaProgramaActivoSemestre = idAsignaturaProgramaActivoSemestre;
	}

	public ProgramaActivoSemestreEntity getFkIdProgramaActivoSemestre() {
		return fkIdProgramaActivoSemestre;
	}

	public void setFkIdProgramaActivoSemestre(ProgramaActivoSemestreEntity fkIdProgramaActivoSemestre) {
		this.fkIdProgramaActivoSemestre = fkIdProgramaActivoSemestre;
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

	public List<AsignaturaTomadaProgramaActivoSemestreEntity> getProgramas_activos_semestres_asignaturas_tomadas() {
		return programas_activos_semestres_asignaturas_tomadas;
	}

	public void setProgramas_activos_semestres_asignaturas_tomadas(
			List<AsignaturaTomadaProgramaActivoSemestreEntity> programas_activos_semestres_asignaturas_tomadas) {
		this.programas_activos_semestres_asignaturas_tomadas = programas_activos_semestres_asignaturas_tomadas;
	}
}
