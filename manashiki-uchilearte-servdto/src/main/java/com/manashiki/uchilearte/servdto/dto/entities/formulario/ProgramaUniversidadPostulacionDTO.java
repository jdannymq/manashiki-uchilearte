package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="programaUniversidadPostulacionDTO")
public class ProgramaUniversidadPostulacionDTO implements Serializable{

	private static final long serialVersionUID = -3920002567025377799L;
	
	private int idProgramaUniversidadPostulacion = 0;
	private String codigoProgramaUniversidadPostulacion = "";
	private String nombreProgramaUniversidadPostulacion = "";
	private String duracionProgramaUniversidadPostulacion = "";
	private String costoProgramaUniversidadPostulacion = "";
	private int clasificacionProgramaPostulacion;
	private int prioridad;
	
	public ProgramaUniversidadPostulacionDTO() {
		super();
	}

	public int getIdProgramaUniversidadPostulacion() {
		return idProgramaUniversidadPostulacion;
	}

	public void setIdProgramaUniversidadPostulacion(int idProgramaUniversidadPostulacion) {
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

	public int getClasificacionProgramaPostulacion() {
		return clasificacionProgramaPostulacion;
	}

	public void setClasificacionProgramaPostulacion(int clasificacionProgramaPostulacion) {
		this.clasificacionProgramaPostulacion = clasificacionProgramaPostulacion;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
//	public int getSubClasificacionProgramaPostulacion() {
//		return subClasificacionProgramaPostulacion;
//	}
//
//	public void setSubClasificacionProgramaPostulacion(int subClasificacionProgramaPostulacion) {
//		this.subClasificacionProgramaPostulacion = subClasificacionProgramaPostulacion;
//	}
//	
	
}
