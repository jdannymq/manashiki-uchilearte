package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class ProgramaUniversidadModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -4161268953005452394L;
	private Integer idProgramaUniversidad;
	private String codigoProgramaUniversidad;
	private String nombreProgramaUniversidad;
	private String duracionProgramaUniversidad;
	private String costoProgramaUniversidad;
	private Integer clasificacionPrograma;
	
	public ProgramaUniversidadModel() {
		super();
	}

	public Integer getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public String getCodigoProgramaUniversidad() {
		return codigoProgramaUniversidad;
	}

	public String getNombreProgramaUniversidad() {
		return nombreProgramaUniversidad;
	}

	public void setIdProgramaUniversidad(Integer idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	public void setCodigoProgramaUniversidad(String codigoProgramaUniversidad) {
		this.codigoProgramaUniversidad = codigoProgramaUniversidad;
	}

	public void setNombreProgramaUniversidad(String nombreProgramaUniversidad) {
		this.nombreProgramaUniversidad = nombreProgramaUniversidad;
	}

	public String getDuracionProgramaUniversidad() {
		return duracionProgramaUniversidad;
	}

	public String getCostoProgramaUniversidad() {
		return costoProgramaUniversidad;
	}

	public void setDuracionProgramaUniversidad(String duracionProgramaUniversidad) {
		this.duracionProgramaUniversidad = duracionProgramaUniversidad;
	}

	public void setCostoProgramaUniversidad(String costoProgramaUniversidad) {
		this.costoProgramaUniversidad = costoProgramaUniversidad;
	}

	public Integer getClasificacionPrograma() {
		return clasificacionPrograma;
	}

	public void setClasificacionPrograma(Integer clasificacionPrograma) {
		this.clasificacionPrograma = clasificacionPrograma;
	}
	
}
