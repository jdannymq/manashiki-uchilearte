package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;
import java.lang.String;

public class FinalidadCertificadoModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 5444716888892334213L;
	private Integer idFinalidadCertificado;
	private String codigoFinalidadCertificado;
	private String nombreFinalidadCertificado;

	public FinalidadCertificadoModel() {
		super();
	}

	public Integer getIdFinalidadCertificado() {
		return idFinalidadCertificado;
	}

	public String getCodigoFinalidadCertificado() {
		return codigoFinalidadCertificado;
	}

	public String getNombreFinalidadCertificado() {
		return nombreFinalidadCertificado;
	}

	public void setIdFinalidadCertificado(Integer idFinalidadCertificado) {
		this.idFinalidadCertificado = idFinalidadCertificado;
	}

	public void setCodigoFinalidadCertificado(String codigoFinalidadCertificado) {
		this.codigoFinalidadCertificado = codigoFinalidadCertificado;
	}

	public void setNombreFinalidadCertificado(String nombreFinalidadCertificado) {
		this.nombreFinalidadCertificado = nombreFinalidadCertificado;
	}
	
}
