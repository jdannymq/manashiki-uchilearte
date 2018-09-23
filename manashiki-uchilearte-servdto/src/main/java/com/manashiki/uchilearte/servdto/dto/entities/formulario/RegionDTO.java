package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="regionDTO")
public class RegionDTO implements Serializable{
 
	private static final long serialVersionUID = -5574194532649530830L;

	private int idRegion;
	private String codigoRegion;
	private String nombreRegion;
	private String nombreRegionLower;
	private String descripcionRegion; 
	
	public RegionDTO() {
		super();
	}

	public int getIdRegion() {
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

	public void setIdRegion(int idRegion) {
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
