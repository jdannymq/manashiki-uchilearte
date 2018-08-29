package com.manashiki.uchilearte.solicitud.dto;

import java.io.Serializable;

public class ResponseTo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String estado;
	private String tipoError; /*0 = success, 1 = error de validacion, 2 = error de sistema*/
	private String mensaje;
	private String url;
	
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipoError() {
		return tipoError;
	}
	public void setTipoError(String tipoError) {
		this.tipoError = tipoError;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
