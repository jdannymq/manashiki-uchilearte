package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.lang.String;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="archivoAcademicaDTO")
public class ArchivoSolicitudDTO implements Serializable{
	
	private static final long serialVersionUID = 3064519187742498671L;
	private int idArchivoSolicitud;
	private String nombreArchivoSolicitud; //Nombre a Mostrar
	private String direccionAlmacenamientoArchivoSolicitud;
	private String tipoArchivoSolicitud;
	
	public ArchivoSolicitudDTO() {
		super();
	}

	public int getIdArchivoSolicitud() {
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

	public void setIdArchivoSolicitud(int idArchivoSolicitud) {
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
