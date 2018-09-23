package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class RegionModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -7035847077859850960L;
	private Integer idRegion;
	private String codigoRegion;
	private String nombreRegion;
	private String nombreRegionLower;
	private String descripcionRegion; 
	
	public RegionModel() {
		super();
	}

	public Integer getIdRegion() {
		return idRegion;
	}

	public String getCodigoRegion() {
		return codigoRegion;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public String getNombreRegionLower() {
		return nombreRegionLower;
	}

	public String getDescripcionRegion() {
		return descripcionRegion;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}

	public void setCodigoRegion(String codigoRegion) {
		this.codigoRegion = codigoRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public void setNombreRegionLower(String nombreRegionLower) {
		this.nombreRegionLower = nombreRegionLower;
	}

	public void setDescripcionRegion(String descripcionRegion) {
		this.descripcionRegion = descripcionRegion;
	}
}
