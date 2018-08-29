package com.manashiki.uchilearte.negocio.model;

import java.util.Date;

public class NegocioSolicitudModel{

	private Integer idNegocioSolicitudModel;
	private String valorNegocioSolicitud;
	private String keyNegocioSolicitud;
	private int tipoNegocioSolicitud;
	private Date fechaInicialNegocioSolicitud;
	private Date fechaVencimientoNegocioSolicitud;
	
	public NegocioSolicitudModel() {
		super();
	}

	public Integer getIdNegocioSolicitudModel() {
		return idNegocioSolicitudModel;
	}

	public void setIdNegocioSolicitudModel(Integer idNegocioSolicitudModel) {
		this.idNegocioSolicitudModel = idNegocioSolicitudModel;
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

	public Date getFechaInicialNegocioSolicitud() {
		return fechaInicialNegocioSolicitud;
	}

	public void setFechaInicialNegocioSolicitud(Date fechaInicialNegocioSolicitud) {
		this.fechaInicialNegocioSolicitud = fechaInicialNegocioSolicitud;
	}

	public Date getFechaVencimientoNegocioSolicitud() {
		return fechaVencimientoNegocioSolicitud;
	}

	public void setFechaVencimientoNegocioSolicitud(Date fechaVencimientoNegocioSolicitud) {
		this.fechaVencimientoNegocioSolicitud = fechaVencimientoNegocioSolicitud;
	}
	
	
}
