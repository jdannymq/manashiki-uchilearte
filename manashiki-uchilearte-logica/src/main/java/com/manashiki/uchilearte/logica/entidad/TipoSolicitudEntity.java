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
@Table (name="tipo_solicitud")

public class TipoSolicitudEntity implements Serializable {
 
	private static final long serialVersionUID = -7852247520638441347L;
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@IndexColumn(name="idx_tipo_solicitud_id_tipo_solicitud")
	@Column(name="id_tipo_solicitud")
	private Integer idTipoSolicitud;
	@OrderBy
	@Column(name="codigo_tipo_solicitud")
	private String codigoTipoSolicitud;
	@OrderBy
	@Column(name="nombre_tipo_solicitud")
	private String nombreTipoSolicitud;

	@OneToMany(mappedBy="fkIdTipoSolicitud")
	private List<SolicitudAcademicaEntity> tipos_solicitudes;
	
	public TipoSolicitudEntity() {
		super();
	}

	public Integer getIdTipoSolicitud() {
		return idTipoSolicitud;
	}

	public String getCodigoTipoSolicitud() {
		return codigoTipoSolicitud;
	}

	public String getNombreTipoSolicitud() {
		return nombreTipoSolicitud;
	}

	public List<SolicitudAcademicaEntity> getTipos_solicitudes() {
		return tipos_solicitudes;
	}

	public void setIdTipoSolicitud(Integer idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
	}

	public void setCodigoTipoSolicitud(String codigoTipoSolicitud) {
		this.codigoTipoSolicitud = codigoTipoSolicitud;
	}

	public void setNombreTipoSolicitud(String nombreTipoSolicitud) {
		this.nombreTipoSolicitud = nombreTipoSolicitud;
	}

	public void setTipos_solicitudes(List<SolicitudAcademicaEntity> tipos_solicitudes) {
		this.tipos_solicitudes = tipos_solicitudes;
	}
}
