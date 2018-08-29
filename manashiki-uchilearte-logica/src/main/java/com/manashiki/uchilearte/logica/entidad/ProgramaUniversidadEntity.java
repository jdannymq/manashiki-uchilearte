package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;


/**
 * Entity implementation class for Entity: Region
 * en la base de Datos representa 
 */
@Entity
@Table (name="programa_universidad")

public class ProgramaUniversidadEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@IndexColumn(name="idx_programa_universidad_id_programa_universidad")
	@Column(name="id_programa_universidad")
	private Integer idProgramaUniversidad;
	@OrderBy
	@Column(name="codigo_programa_universidad")
	private String codigoProgramaUniversidad;
	@OrderBy
	@Column(name="nombre_programa_universidad")
	private String nombreProgramaUniversidad;
	
	@OrderBy
	@Column(name="duracion_programa_universidad")
	private String duracionProgramaUniversidad;
	
	@OrderBy
	@Column(name="costo_programa_universidad")
	private String costoProgramaUniversidad;
	
	@OrderBy
	@Column(name="clasificacion_programa")
	private Integer clasificacionPrograma;

	@OneToMany(mappedBy="fkIdProgramaUniversidad")
	private List<SolicitudCertificadoEntity> solicitudes_certificados;
	
	@OneToMany(mappedBy="fkIdProgramaUniversidad")
	private List<SolicitudAcademicaEntity> solicitudes_academicas;
	
	@OneToMany(mappedBy="fkIdProgramaUniversidad")
	private List<ProgramaActivoSemestreEntity> programas_activos_semestre;
	
//	@OneToMany(mappedBy="fkIdProgramaUniversidad")
//	private List<SolicitudPostulacionEntity> solicitudes_postulaciones;
	
//	@OneToMany(mappedBy="fkIdProgramaUniversidad")
//	private List<VersionProgramaUniversidadEntity> versiones_programas_universidades;
		
	public ProgramaUniversidadEntity() {
		super();
	}

	public Integer getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public String getCodigoProgramaUniversidad() {
		return codigoProgramaUniversidad;
	}

	public String getNombreProgramaUniversidad() {
		return nombreProgramaUniversidad;
	}

	public List<SolicitudCertificadoEntity> getSolicitudes_certificados() {
		return solicitudes_certificados;
	}

	public void setIdProgramaUniversidad(Integer idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	public void setCodigoProgramaUniversidad(String codigoProgramaUniversidad) {
		this.codigoProgramaUniversidad = codigoProgramaUniversidad;
	}

	public void setNombreProgramaUniversidad(String nombreProgramaUniversidad) {
		this.nombreProgramaUniversidad = nombreProgramaUniversidad;
	}

	public void setSolicitudes_certificados(List<SolicitudCertificadoEntity> solicitudes_certificados) {
		this.solicitudes_certificados = solicitudes_certificados;
	}

	public String getDuracionProgramaUniversidad() {
		return duracionProgramaUniversidad;
	}

	public String getCostoProgramaUniversidad() {
		return costoProgramaUniversidad;
	}

	public void setDuracionProgramaUniversidad(String duracionProgramaUniversidad) {
		this.duracionProgramaUniversidad = duracionProgramaUniversidad;
	}

	public void setCostoProgramaUniversidad(String costoProgramaUniversidad) {
		this.costoProgramaUniversidad = costoProgramaUniversidad;
	}

	public Integer getClasificacionPrograma() {
		return clasificacionPrograma;
	}

	public void setClasificacionPrograma(Integer clasificacionPrograma) {
		this.clasificacionPrograma = clasificacionPrograma;
	}

	public List<SolicitudAcademicaEntity> getSolicitudes_academicas() {
		return solicitudes_academicas;
	}

	public void setSolicitudes_academicas(List<SolicitudAcademicaEntity> solicitudes_academicas) {
		this.solicitudes_academicas = solicitudes_academicas;
	}

	public List<ProgramaActivoSemestreEntity> getProgramas_activos_semestre() {
		return programas_activos_semestre;
	}

	public void setProgramas_activos_semestre(List<ProgramaActivoSemestreEntity> programas_activos_semestre) {
		this.programas_activos_semestre = programas_activos_semestre;
	}
	
}
