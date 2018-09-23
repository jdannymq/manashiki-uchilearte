package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;
import java.lang.String;

public class ComunaModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 3656725983429652587L;
	private Integer idComuna;
	private String codigoComuna;
	private String nombreComuna;
	private String nombreComunaLower;
	private Integer idRegion;	
	
	public ComunaModel() {
		super();
	}

	public Integer getIdComuna() {
		return idComuna;
	}

	public String getCodigoComuna() {
		return codigoComuna;
	}

	public String getNombreComuna() {
		return nombreComuna;
	}

	public String getNombreComunaLower() {
		return nombreComunaLower;
	}

	public Integer getIdRegion() {
		return idRegion;
	}

	public void setIdComuna(Integer idComuna) {
		this.idComuna = idComuna;
	}

	public void setCodigoComuna(String codigoComuna) {
		this.codigoComuna = codigoComuna;
	}

	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}

	public void setNombreComunaLower(String nombreComunaLower) {
		this.nombreComunaLower = nombreComunaLower;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}
	
}
