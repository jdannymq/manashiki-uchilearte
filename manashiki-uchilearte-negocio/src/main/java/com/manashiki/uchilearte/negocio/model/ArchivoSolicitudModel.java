package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;
import java.lang.String;

public class ArchivoSolicitudModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1517799505569145089L;
	private Integer idArchivoSolicitud;
	private String nombreArchivoSolicitud; //Nombre a Mostrar
	private String direccionAlmacenamientoArchivoSolicitud;
	private String tipoArchivoSolicitud;
	
	public ArchivoSolicitudModel() {
		super();
	}

	public Integer getIdArchivoSolicitud() {
		return idArchivoSolicitud;
	}

	public String getNombreArchivoSolicitud() {
		return nombreArchivoSolicitud;
	}

	public String getDireccionAlmacenamientoArchivoSolicitud() {
		return direccionAlmacenamientoArchivoSolicitud;
	}

	public String getTipoArchivoSolicitud() {
		return tipoArchivoSolicitud;
	}

	public void setIdArchivoSolicitud(Integer idArchivoSolicitud) {
		this.idArchivoSolicitud = idArchivoSolicitud;
	}

	public void setNombreArchivoSolicitud(String nombreArchivoSolicitud) {
		this.nombreArchivoSolicitud = nombreArchivoSolicitud;
	}

	public void setDireccionAlmacenamientoArchivoSolicitud(String direccionAlmacenamientoArchivoSolicitud) {
		this.direccionAlmacenamientoArchivoSolicitud = direccionAlmacenamientoArchivoSolicitud;
	}

	public void setTipoArchivoSolicitud(String tipoArchivoSolicitud) {
		this.tipoArchivoSolicitud = tipoArchivoSolicitud;
	}
}
