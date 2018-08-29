package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="confirmacionAsignaturaTomadaDTO")
public class ConfirmacionAsignaturaTomadaDTO implements Serializable {

	private static final long serialVersionUID = 4474204399495099382L;

	private int idConfirmacionAsignaturaTomada;
	private String listaProgramaActivoSemestreAsignaturaTomada; //mail de solicitante
	private Date fechaConfirmacionAsignaturaTomada; //mail de solicitante
	private String descripcionConfirmacionAsignaturaTomada; //mail de solicitante
	private int estadoConfirmacionAsignaturaTomada;
	
	public ConfirmacionAsignaturaTomadaDTO() {
		super();
	}

	public int getIdConfirmacionAsignaturaTomada() {
		return idConfirmacionAsignaturaTomada;
	}

	public void setIdConfirmacionAsignaturaTomada(int idConfirmacionAsignaturaTomada) {
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

	public int getEstadoConfirmacionAsignaturaTomada() {
		return estadoConfirmacionAsignaturaTomada;
	}

	public void setEstadoConfirmacionAsignaturaTomada(int estadoConfirmacionAsignaturaTomada) {
		this.estadoConfirmacionAsignaturaTomada = estadoConfirmacionAsignaturaTomada;
	}
	
}
