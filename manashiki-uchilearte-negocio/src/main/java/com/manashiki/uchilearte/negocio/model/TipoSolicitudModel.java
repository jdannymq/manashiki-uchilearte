package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class TipoSolicitudModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2763219271159392952L;
	private Integer idTipoSolicitud;
	private String codigoTipoSolicitud;
	private String nombreTipoSolicitud;
	
	public TipoSolicitudModel() {
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

	public void setIdTipoSolicitud(Integer idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
	}

	public void setCodigoTipoSolicitud(String codigoTipoSolicitud) {
		this.codigoTipoSolicitud = codigoTipoSolicitud;
	}

	public void setNombreTipoSolicitud(String nombreTipoSolicitud) {
		this.nombreTipoSolicitud = nombreTipoSolicitud;
	}
	
}
