package com.manashiki.uchilearte.logica.entidad;

import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Region
 * en la base de Datos representa 
 */
@Entity
@Table (name="negocio_solicitud")

public class NegocioSolicitudEntity{
 
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_negocio_solicitud")
	private Integer idNegocioSolicitudEntity;
	@OrderBy
	@Lob
	@Column(name="valor_negocio_solicitud", length = 100000)
	private String valorNegocioSolicitud;
	@OrderBy
	@Column(name="key_negocio_solicitud")
	private String keyNegocioSolicitud;
	
	@OrderBy
	@Column(name="tipo_negocio_solicitud")
	private int tipoNegocioSolicitud;
	
	@IndexColumn(name="idx_negocio_solicitud_fecha_inicial_negocio_solicitud")
	@Column(name="fecha_inicial_negocio_solicitud")
	private Timestamp fechaInicialNegocioSolicitud;
	
	@IndexColumn(name="idx_negocio_solicitud_fecha_vencimiento_negocio_solicitud")
	@Column(name="fecha_vencimiento_negocio_solicitud")
	private Timestamp fechaVencimientoNegocioSolicitud;
	
	public NegocioSolicitudEntity() {
		super();
	}

	public Integer getIdNegocioSolicitudEntity() {
		return idNegocioSolicitudEntity;
	}

	public void setIdNegocioSolicitudEntity(Integer idNegocioSolicitudEntity) {
		this.idNegocioSolicitudEntity = idNegocioSolicitudEntity;
	}

	public String getValorNegocioSolicitud() {
		return valorNegocioSolicitud;
	}

	public void setValorNegocioSolicitud(String valorNegocioSolicitud) {
		this.valorNegocioSolicitud = valorNegocioSolicitud;
	}

	public String getKeyNegocioSolicitud() {
		return keyNegocioSolicitud;
	}

	public void setKeyNegocioSolicitud(String keyNegocioSolicitud) {
		this.keyNegocioSolicitud = keyNegocioSolicitud;
	}
	
	
	public int getTipoNegocioSolicitud() {
		return tipoNegocioSolicitud;
	}

	public void setTipoNegocioSolicitud(int tipoNegocioSolicitud) {
		this.tipoNegocioSolicitud = tipoNegocioSolicitud;
	}

	public Timestamp getFechaInicialNegocioSolicitud() {
		return fechaInicialNegocioSolicitud;
	}

	public void setFechaInicialNegocioSolicitud(Timestamp fechaInicialNegocioSolicitud) {
		this.fechaInicialNegocioSolicitud = fechaInicialNegocioSolicitud;
	}

	public Timestamp getFechaVencimientoNegocioSolicitud() {
		return fechaVencimientoNegocioSolicitud;
	}

	public void setFechaVencimientoNegocioSolicitud(Timestamp fechaVencimientoNegocioSolicitud) {
		this.fechaVencimientoNegocioSolicitud = fechaVencimientoNegocioSolicitud;
	}
	
}
