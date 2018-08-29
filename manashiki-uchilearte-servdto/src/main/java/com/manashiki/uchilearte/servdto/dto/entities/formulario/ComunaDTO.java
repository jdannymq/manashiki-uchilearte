package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.lang.String;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="comunaDTO")
public class ComunaDTO implements Serializable{
 
	private static final long serialVersionUID = 1027021488032240734L;

	private int idComuna;
	private String codigoComuna;
	private String nombreComuna;
	private String nombreComunaLower;
	private int idRegion;	
	
	public ComunaDTO() {
		super();
	}

	public int getIdComuna() {
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

	public int getIdRegion() {
		return idRegion;
	}

	public void setIdComuna(int idComuna) {
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

	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}
	
}
