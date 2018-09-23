package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;
import java.util.Date;

public class SolicitudCertificadoModel implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -8809642511011159161L;
	private Integer idSolicitudCertificado;
	private String nombrePersonaSolicitudCertificado;
	private String apellidoPaternoPersonaSolicitudCertificado;
	private String apellidoMaternoPersonaSolicitudCertificado; 
	private String rutPersonaSolicitudCertificado;
	private Integer idProgramaUniversidad;
	private String mailMember;
	private String anhoIngreso;
	private Integer idTipoCertificado;
	private Integer idFinalidadCertificado;
	private Date fechaSolicitud;
	private Integer estadoSolicitud;
	
	public SolicitudCertificadoModel() {
		super();
	}

	public Integer getIdSolicitudCertificado() {
		return idSolicitudCertificado;
	}

	public String getNombrePersonaSolicitudCertificado() {
		return nombrePersonaSolicitudCertificado;
	}

	public String getApellidoPaternoPersonaSolicitudCertificado() {
		return apellidoPaternoPersonaSolicitudCertificado;
	}

	public String getApellidoMaternoPersonaSolicitudCertificado() {
		return apellidoMaternoPersonaSolicitudCertificado;
	}

	public String getRutPersonaSolicitudCertificado() {
		return rutPersonaSolicitudCertificado;
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

	public Integer getIdTipoCertificado() {
		return idTipoCertificado;
	}

	public Integer getIdFinalidadCertificado() {
		return idFinalidadCertificado;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public Integer getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setIdSolicitudCertificado(Integer idSolicitudCertificado) {
		this.idSolicitudCertificado = idSolicitudCertificado;
	}

	public void setNombrePersonaSolicitudCertificado(String nombrePersonaSolicitudCertificado) {
		this.nombrePersonaSolicitudCertificado = nombrePersonaSolicitudCertificado;
	}

	public void setApellidoPaternoPersonaSolicitudCertificado(String apellidoPaternoPersonaSolicitudCertificado) {
		this.apellidoPaternoPersonaSolicitudCertificado = apellidoPaternoPersonaSolicitudCertificado;
	}

	public void setApellidoMaternoPersonaSolicitudCertificado(String apellidoMaternoPersonaSolicitudCertificado) {
		this.apellidoMaternoPersonaSolicitudCertificado = apellidoMaternoPersonaSolicitudCertificado;
	}

	public void setRutPersonaSolicitudCertificado(String rutPersonaSolicitudCertificado) {
		this.rutPersonaSolicitudCertificado = rutPersonaSolicitudCertificado;
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

	public void setIdTipoCertificado(Integer idTipoCertificado) {
		this.idTipoCertificado = idTipoCertificado;
	}

	public void setIdFinalidadCertificado(Integer idFinalidadCertificado) {
		this.idFinalidadCertificado = idFinalidadCertificado;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public void setEstadoSolicitud(Integer estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}
}
