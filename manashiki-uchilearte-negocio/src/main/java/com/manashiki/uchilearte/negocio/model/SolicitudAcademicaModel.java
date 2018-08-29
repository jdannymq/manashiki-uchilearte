package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

public class SolicitudAcademicaModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 7094901345508150103L;
	private Integer idSolicitudAcademica;
	private String nombrePersonaSolicitudAcademica;
	private String apellidoPaternoPersonaSolicitudAcademica;
	private String apellidoMaternoPersonaSolicitudAcademica; 
	private String rutPersonaSolicitudAcademica;
	private Integer idProgramaUniversidad;
	private String mailMember; //mail usuario
	private String anhoIngreso; 
	private Integer idTipoSolicitud;
	private String fundamentacionSolicitud; //mail usuario
	private boolean archivoAdjunto; 
	private Date fechaSolicitud; //momento que que ejecutada la solicitud
	private Integer estadoSolicitud;
	private Integer idArchivoSolicitud;
	
	public SolicitudAcademicaModel() {
		super();
	}

	public Integer getIdSolicitudAcademica() {
		return idSolicitudAcademica;
	}

	public String getNombrePersonaSolicitudAcademica() {
		return nombrePersonaSolicitudAcademica;
	}

	public String getApellidoPaternoPersonaSolicitudAcademica() {
		return apellidoPaternoPersonaSolicitudAcademica;
	}

	public String getApellidoMaternoPersonaSolicitudAcademica() {
		return apellidoMaternoPersonaSolicitudAcademica;
	}

	public String getRutPersonaSolicitudAcademica() {
		return rutPersonaSolicitudAcademica;
	}

	public Integer getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public String getMailMember() {
		return mailMember;
	}

	public String getAnhoIngreso() {
		return anhoIngreso;
	}

	public Integer getIdTipoSolicitud() {
		return idTipoSolicitud;
	}

	public String getFundamentacionSolicitud() {
		return fundamentacionSolicitud;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public Integer getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public Integer getIdArchivoSolicitud() {
		return idArchivoSolicitud;
	}

	public void setIdSolicitudAcademica(Integer idSolicitudAcademica) {
		this.idSolicitudAcademica = idSolicitudAcademica;
	}

	public void setNombrePersonaSolicitudAcademica(String nombrePersonaSolicitudAcademica) {
		this.nombrePersonaSolicitudAcademica = nombrePersonaSolicitudAcademica;
	}

	public void setApellidoPaternoPersonaSolicitudAcademica(String apellidoPaternoPersonaSolicitudAcademica) {
		this.apellidoPaternoPersonaSolicitudAcademica = apellidoPaternoPersonaSolicitudAcademica;
	}

	public void setApellidoMaternoPersonaSolicitudAcademica(String apellidoMaternoPersonaSolicitudAcademica) {
		this.apellidoMaternoPersonaSolicitudAcademica = apellidoMaternoPersonaSolicitudAcademica;
	}

	public void setRutPersonaSolicitudAcademica(String rutPersonaSolicitudAcademica) {
		this.rutPersonaSolicitudAcademica = rutPersonaSolicitudAcademica;
	}

	public void setIdProgramaUniversidad(Integer idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	public void setMailMember(String mailMember) {
		this.mailMember = mailMember;
	}

	public void setAnhoIngreso(String anhoIngreso) {
		this.anhoIngreso = anhoIngreso;
	}

	public void setIdTipoSolicitud(Integer idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
	}

	public void setFundamentacionSolicitud(String fundamentacionSolicitud) {
		this.fundamentacionSolicitud = fundamentacionSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public void setEstadoSolicitud(Integer estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public void setIdArchivoSolicitud(Integer idArchivoSolicitud) {
		this.idArchivoSolicitud = idArchivoSolicitud;
	}

	public boolean isArchivoAdjunto() {
		return archivoAdjunto;
	}

	public void setArchivoAdjunto(boolean archivoAdjunto) {
		this.archivoAdjunto = archivoAdjunto;
	}

}