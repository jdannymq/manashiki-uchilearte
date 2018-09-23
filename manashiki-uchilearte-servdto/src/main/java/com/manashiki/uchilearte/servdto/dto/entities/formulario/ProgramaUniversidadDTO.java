package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="programaUniversidadDTO")
public class ProgramaUniversidadDTO implements Serializable{


	private static final long serialVersionUID = -537936973993838942L;
	
	private int idProgramaUniversidad = 0;
	private String codigoProgramaUniversidad = "";
	private String nombreProgramaUniversidad = "";
	private String duracionProgramaUniversidad = "";
	private String costoProgramaUniversidad = "";
	private int clasificacionPrograma;
	
	public ProgramaUniversidadDTO() {
		super();
	}

	public int getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public String getCodigoProgramaUniversidad() {
		return codigoProgramaUniversidad;
	}

	public String getNombreProgramaUniversidad() {
		return nombreProgramaUniversidad;
	}

	public String getDuracionProgramaUniversidad() {
		return duracionProgramaUniversidad;
	}

	public String getCostoProgramaUniversidad() {
		return costoProgramaUniversidad;
	}

	public void setIdProgramaUniversidad(int idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	public void setCodigoProgramaUniversidad(String codigoProgramaUniversidad) {
		this.codigoProgramaUniversidad = codigoProgramaUniversidad;
	}

	public void setNombreProgramaUniversidad(String nombreProgramaUniversidad) {
		this.nombreProgramaUniversidad = nombreProgramaUniversidad;
	}

	public void setDuracionProgramaUniversidad(String duracionProgramaUniversidad) {
		this.duracionProgramaUniversidad = duracionProgramaUniversidad;
	}

	public void setCostoProgramaUniversidad(String costoProgramaUniversidad) {
		this.costoProgramaUniversidad = costoProgramaUniversidad;
	}

	public int getClasificacionPrograma() {
		return clasificacionPrograma;
	}

	public void setClasificacionPrograma(int clasificacionPrograma) {
		this.clasificacionPrograma = clasificacionPrograma;
	}
	
	
	
}
