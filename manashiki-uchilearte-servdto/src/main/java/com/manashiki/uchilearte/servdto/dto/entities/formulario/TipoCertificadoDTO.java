package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="tipoCertificadoDTO")
public class TipoCertificadoDTO implements Serializable{
 
	private static final long serialVersionUID = -3149454368528357641L;

	private int idTipoCertificado;
	private String codigoTipoCertificado;
	private String nombreTipoCertificado;

	public TipoCertificadoDTO() {
		super();
	}

	public int getIdTipoCertificado() {
		return idTipoCertificado;
	}

	public String getCodigoTipoCertificado() {
		return codigoTipoCertificado;
	}

	public String getNombreTipoCertificado() {
		return nombreTipoCertificado;
	}

	public void setIdTipoCertificado(int idTipoCertificado) {
		this.idTipoCertificado = idTipoCertificado;
	}

	public void setCodigoTipoCertificado(String codigoTipoCertificado) {
		this.codigoTipoCertificado = codigoTipoCertificado;
	}

	public void setNombreTipoCertificado(String nombreTipoCertificado) {
		this.nombreTipoCertificado = nombreTipoCertificado;
	}
	
}
