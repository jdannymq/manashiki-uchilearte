package com.manashiki.uchilearte.logica.entidad;

import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;


/**
 * Entity implementation class for Entity: Region
 * en la base de Datos representa 
 */
@Entity
@Table (name="programa_universidad_postulacion")
public class ProgramaUniversidadPostulacionEntity{
 
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@IndexColumn(name="idx_programa_universidad_postulacion_id_programa_universidad_postulacion")
	@Column(name="id_programa_universidad_postulacion")
	private Integer idProgramaUniversidadPostulacion;
	@OrderBy
	@Column(name="codigo_programa_universidad_postulacion")
	private String codigoProgramaUniversidadPostulacion;
	@OrderBy
	@Column(name="nombre_programa_universidad_postulacion")
	private String nombreProgramaUniversidadPostulacion;
	
	@OrderBy
	@Column(name="duracion_programa_universidad_postulacion")
	private String duracionProgramaUniversidadPostulacion;
	
	@OrderBy
	@Column(name="costo_programa_universidad_postulacion")
	private String costoProgramaUniversidadPostulacion;
	
	@OrderBy
	@Column(name="clasificacion_programa_postulacion")
	private Integer clasificacionProgramaPostulacion;
	
	@OrderBy
	@Column(name="prioridad")
	private Integer prioridad;
	
//	@OneToMany(mappedBy="fkIdProgramaUniversidad")
//	private List<SolicitudCertificadoEntity> solicitudes_certificados;
//	
//	@OneToMany(mappedBy="fkIdProgramaUniversidad")
//	private List<SolicitudAcademicaEntity> solicitudes_academicas;
	
	@OneToMany(mappedBy="fkIdProgramaUniversidadPostulacion")
	private List<SolicitudPostulacionEntity> solicitudes_postulaciones;
	
//	@OneToMany(mappedBy="fkIdProgramaUniversidad")
//	private List<VersionProgramaUniversidadEntity> versiones_programas_universidades;
		
	public ProgramaUniversidadPostulacionEntity() {
		super();
	}

	public Integer getIdProgramaUniversidadPostulacion() {
		return idProgramaUniversidadPostulacion;
	}

	public void setIdProgramaUniversidadPostulacion(Integer idProgramaUniversidadPostulacion) {
		this.idProgramaUniversidadPostulacion = idProgramaUniversidadPostulacion;
	}

	public String getCodigoProgramaUniversidadPostulacion() {
		return codigoProgramaUniversidadPostulacion;
	}

	public void setCodigoProgramaUniversidadPostulacion(String codigoProgramaUniversidadPostulacion) {
		this.codigoProgramaUniversidadPostulacion = codigoProgramaUniversidadPostulacion;
	}

	public String getNombreProgramaUniversidadPostulacion() {
		return nombreProgramaUniversidadPostulacion;
	}

	public void setNombreProgramaUniversidadPostulacion(String nombreProgramaUniversidadPostulacion) {
		this.nombreProgramaUniversidadPostulacion = nombreProgramaUniversidadPostulacion;
	}

	public String getDuracionProgramaUniversidadPostulacion() {
		return duracionProgramaUniversidadPostulacion;
	}

	public void setDuracionProgramaUniversidadPostulacion(String duracionProgramaUniversidadPostulacion) {
		this.duracionProgramaUniversidadPostulacion = duracionProgramaUniversidadPostulacion;
	}

	public String getCostoProgramaUniversidadPostulacion() {
		return costoProgramaUniversidadPostulacion;
	}

	public void setCostoProgramaUniversidadPostulacion(String costoProgramaUniversidadPostulacion) {
		this.costoProgramaUniversidadPostulacion = costoProgramaUniversidadPostulacion;
	}
	
	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public Integer getClasificacionProgramaPostulacion() {
		return clasificacionProgramaPostulacion;
	}

	public void setClasificacionProgramaPostulacion(Integer clasificacionProgramaPostulacion) {
		this.clasificacionProgramaPostulacion = clasificacionProgramaPostulacion;
	}

	public List<SolicitudPostulacionEntity> getSolicitudes_postulaciones() {
		return solicitudes_postulaciones;
	}

	public void setSolicitudes_postulaciones(List<SolicitudPostulacionEntity> solicitudes_postulaciones) {
		this.solicitudes_postulaciones = solicitudes_postulaciones;
	}
	
}
