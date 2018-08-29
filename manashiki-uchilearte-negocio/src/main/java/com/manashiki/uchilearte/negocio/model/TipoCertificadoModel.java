package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class TipoCertificadoModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 7453078237613812012L;
	private Integer idTipoCertificado;
	private String codigoTipoCertificado;
	private String nombreTipoCertificado;

	public TipoCertificadoModel() {
		super();
	}

	public Integer getIdTipoCertificado() {
		return idTipoCertificado;
	}

	public String getCodigoTipoCertificado() {
		return codigoTipoCertificado;
	}

	public String getNombreTipoCertificado() {
		return nombreTipoCertificado;
	}

	public void setIdTipoCertificado(Integer idTipoCertificado) {
		this.idTipoCertificado = idTipoCertificado;
	}

	public void setCodigoTipoCertificado(String codigoTipoCertificado) {
		this.codigoTipoCertificado = codigoTipoCertificado;
	}

	public void setNombreTipoCertificado(String nombreTipoCertificado) {
		this.nombreTipoCertificado = nombreTipoCertificado;
	}
	
}
