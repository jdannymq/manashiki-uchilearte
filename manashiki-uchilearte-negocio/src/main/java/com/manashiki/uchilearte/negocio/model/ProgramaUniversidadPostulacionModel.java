package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;

public class ProgramaUniversidadPostulacionModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 8262998924298353961L;
	private Integer idProgramaUniversidadPostulacion;
	private String codigoProgramaUniversidadPostulacion;
	private String nombreProgramaUniversidadPostulacion;
	private String duracionProgramaUniversidadPostulacion;
	private String costoProgramaUniversidadPostulacion;
	private Integer clasificacionProgramaPostulacion;
//	private Integer subClasificacionProgramaPostulacion;
	private Integer prioridad;
	
	public ProgramaUniversidadPostulacionModel() {
		super();
	}

	public Integer getIdProgramaUniversidadPostulacion() {
		return idProgramaUniversidadPostulacion;
	}

	public void setIdProgramaUniversidadPostulacion(Integer idProgramaUniversidadPostulacion) {
		this.idProgramaUniversidadPostulacion = idProgramaUniversidadPostulacion;
	}

	public String getCodigoProgramaUniversidadPostulacion() {
		return codigoProgramaUniversidadPostulacion;
	}

	public void setCodigoProgramaUniversidadPostulacion(String codigoProgramaUniversidadPostulacion) {
		this.codigoProgramaUniversidadPostulacion = codigoProgramaUniversidadPostulacion;
	}

	public String getNombreProgramaUniversidadPostulacion() {
		return nombreProgramaUniversidadPostulacion;
	}

	public void setNombreProgramaUniversidadPostulacion(String nombreProgramaUniversidadPostulacion) {
		this.nombreProgramaUniversidadPostulacion = nombreProgramaUniversidadPostulacion;
	}

	public String getDuracionProgramaUniversidadPostulacion() {
		return duracionProgramaUniversidadPostulacion;
	}

	public void setDuracionProgramaUniversidadPostulacion(String duracionProgramaUniversidadPostulacion) {
		this.duracionProgramaUniversidadPostulacion = duracionProgramaUniversidadPostulacion;
	}

	public String getCostoProgramaUniversidadPostulacion() {
		return costoProgramaUniversidadPostulacion;
	}

	public void setCostoProgramaUniversidadPostulacion(String costoProgramaUniversidadPostulacion) {
		this.costoProgramaUniversidadPostulacion = costoProgramaUniversidadPostulacion;
	}

	public Integer getClasificacionProgramaPostulacion() {
		return clasificacionProgramaPostulacion;
	}

	public void setClasificacionProgramaPostulacion(Integer clasificacionProgramaPostulacion) {
		this.clasificacionProgramaPostulacion = clasificacionProgramaPostulacion;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

//	public Integer getSubClasificacionProgramaPostulacion() {
//		return subClasificacionProgramaPostulacion;
//	}
//
//	public void setSubClasificacionProgramaPostulacion(Integer subClasificacionProgramaPostulacion) {
//		this.subClasificacionProgramaPostulacion = subClasificacionProgramaPostulacion;
//	}
	
	
}
