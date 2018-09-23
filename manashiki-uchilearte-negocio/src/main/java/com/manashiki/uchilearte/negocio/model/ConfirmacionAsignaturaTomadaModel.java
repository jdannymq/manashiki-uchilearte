package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;
import java.util.Date;

public class ConfirmacionAsignaturaTomadaModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4186140669318770074L;

	private Integer idConfirmacionAsignaturaTomada;
	private String listaProgramaActivoSemestreAsignaturaTomada; //mail de solicitante
	private Date fechaConfirmacionAsignaturaTomada; //mail de solicitante
	private String descripcionConfirmacionAsignaturaTomada; //mail de solicitante
	private Integer estadoConfirmacionAsignaturaTomada;
	
	public ConfirmacionAsignaturaTomadaModel() {
		super();
	}

	public Integer getIdConfirmacionAsignaturaTomada() {
		return idConfirmacionAsignaturaTomada;
	}

	public void setIdConfirmacionAsignaturaTomada(Integer idConfirmacionAsignaturaTomada) {
		this.idConfirmacionAsignaturaTomada = idConfirmacionAsignaturaTomada;
	}

	public String getListaProgramaActivoSemestreAsignaturaTomada() {
		return listaProgramaActivoSemestreAsignaturaTomada;
	}

	public void setListaProgramaActivoSemestreAsignaturaTomada(String listaProgramaActivoSemestreAsignaturaTomada) {
		this.listaProgramaActivoSemestreAsignaturaTomada = listaProgramaActivoSemestreAsignaturaTomada;
	}

	public Date getFechaConfirmacionAsignaturaTomada() {
		return fechaConfirmacionAsignaturaTomada;
	}

	public void setFechaConfirmacionAsignaturaTomada(Date fechaConfirmacionAsignaturaTomada) {
		this.fechaConfirmacionAsignaturaTomada = fechaConfirmacionAsignaturaTomada;
	}

	public String getDescripcionConfirmacionAsignaturaTomada() {
		return descripcionConfirmacionAsignaturaTomada;
	}

	public void setDescripcionConfirmacionAsignaturaTomada(String descripcionConfirmacionAsignaturaTomada) {
		this.descripcionConfirmacionAsignaturaTomada = descripcionConfirmacionAsignaturaTomada;
	}

	public Integer getEstadoConfirmacionAsignaturaTomada() {
		return estadoConfirmacionAsignaturaTomada;
	}

	public void setEstadoConfirmacionAsignaturaTomada(Integer estadoConfirmacionAsignaturaTomada) {
		this.estadoConfirmacionAsignaturaTomada = estadoConfirmacionAsignaturaTomada;
	}
	
	
}
