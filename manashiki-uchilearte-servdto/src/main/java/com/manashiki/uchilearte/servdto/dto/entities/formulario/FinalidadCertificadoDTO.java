package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.lang.String;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="finalidadCertificadoDTO")
public class FinalidadCertificadoDTO implements Serializable{
 
	private static final long serialVersionUID = 1297496656391697891L;

	private int idFinalidadCertificado;
	private String codigoFinalidadCertificado;
	private String nombreFinalidadCertificado;

	public FinalidadCertificadoDTO() {
		super();
	}

	public int getIdFinalidadCertificado() {
		return idFinalidadCertificado;
	}

	public String getCodigoFinalidadCertificado() {
		return codigoFinalidadCertificado;
	}

	public String getNombreFinalidadCertificado() {
		return nombreFinalidadCertificado;
	}

	public void setIdFinalidadCertificado(int idFinalidadCertificado) {
		this.idFinalidadCertificado = idFinalidadCertificado;
	}

	public void setCodigoFinalidadCertificado(String codigoFinalidadCertificado) {
		this.codigoFinalidadCertificado = codigoFinalidadCertificado;
	}

	public void setNombreFinalidadCertificado(String nombreFinalidadCertificado) {
		this.nombreFinalidadCertificado = nombreFinalidadCertificado;
	}
	
}
