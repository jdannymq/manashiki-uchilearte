package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Index;

/**
 * Entity implementation class for Entity: Usuario
 * en la base de Datos representa el registro de las personas asociadas al servicio.
 */
@Entity
@Table (name="alumno_uchile")

public class AlumnoEntity implements Serializable {
 
	private static final long serialVersionUID = 7044228102523612582L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_alumno_uchile")
	private Integer idAlumnoUchile;
	
	@OrderBy
	@Column(name="descripcion_alumno_uchile")
	private String descripcionAlumnosUchile; //mail de solicitante
	
	@OrderBy
	@Index(name="idx_alumno_uchile_alumno_uchile")
	@Column(name="estado_alumno_uchile")
	private Integer estadoAlumnosUchile;
	
	@OrderBy
	@Index(name="idx_alumno_fk_id_usuario")
	@Column(name="fk_id_usuario")
	private Integer fkIdUsuario;
	
	@OneToMany(mappedBy="fkIdAlumno")
	private List<AlumnoProgramaActivoSemestreEntity> alumnos_programas_activos_semestres_asignaturas;
	
	@OneToMany(mappedBy="fkIdAlumno")
	private List<AsignaturaTomadaProgramaActivoSemestreEntity> programas_activos_semestres_asignaturas_tomadas;
	
	public AlumnoEntity() {
		super();
	}

	public Integer getIdAlumnoUchile() {
		return idAlumnoUchile;
	}

	public void setIdAlumnoUchile(Integer idAlumnoUchile) {
		this.idAlumnoUchile = idAlumnoUchile;
	}

	public String getDescripcionAlumnosUchile() {
		return descripcionAlumnosUchile;
	}

	public void setDescripcionAlumnosUchile(String descripcionAlumnosUchile) {
		this.descripcionAlumnosUchile = descripcionAlumnosUchile;
	}

	public Integer getEstadoAlumnosUchile() {
		return estadoAlumnosUchile;
	}

	public void setEstadoAlumnosUchile(Integer estadoAlumnosUchile) {
		this.estadoAlumnosUchile = estadoAlumnosUchile;
	}

	public Integer getFkIdUsuario() {
		return fkIdUsuario;
	}

	public void setFkIdUsuario(Integer fkIdUsuario) {
		this.fkIdUsuario = fkIdUsuario;
	}

	public List<AlumnoProgramaActivoSemestreEntity> getAlumnos_programas_activos_semestres_asignaturas() {
		return alumnos_programas_activos_semestres_asignaturas;
	}

	public void setAlumnos_programas_activos_semestres_asignaturas(
			List<AlumnoProgramaActivoSemestreEntity> alumnos_programas_activos_semestres_asignaturas) {
		this.alumnos_programas_activos_semestres_asignaturas = alumnos_programas_activos_semestres_asignaturas;
	}

	public List<AsignaturaTomadaProgramaActivoSemestreEntity> getProgramas_activos_semestres_asignaturas_tomadas() {
		return programas_activos_semestres_asignaturas_tomadas;
	}

	public void setProgramas_activos_semestres_asignaturas_tomadas(
			List<AsignaturaTomadaProgramaActivoSemestreEntity> programas_activos_semestres_asignaturas_tomadas) {
		this.programas_activos_semestres_asignaturas_tomadas = programas_activos_semestres_asignaturas_tomadas;
	}

	
	
	
}
