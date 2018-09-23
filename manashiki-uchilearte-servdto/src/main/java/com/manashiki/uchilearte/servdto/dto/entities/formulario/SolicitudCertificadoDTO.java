package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="solicitudCertificadoDTO")
public class SolicitudCertificadoDTO implements Serializable{
 

	/**
	 * 
	 */
	private static final long serialVersionUID = -4470761710345661384L;
	private int idSolicitudCertificado;
	private String nombrePersonaSolicitudCertificado="";
	private String apellidoPaternoPersonaSolicitudCertificado="";
	private String apellidoMaternoPersonaSolicitudCertificado="";
	private String rutPersonaSolicitudCertificado="";
	private int idProgramaUniversidad;
	private String programaUniversidad="";
	private String mailMember="";
	private String anhoIngreso="";
	private int idTipoCertificado;
	private String tipoCertificado="";
	private int idFinalidadCertificado;
	private String finalidadCertificado="";
	private Date fechaSolicitud; //momento que que ejecutada la solicitud
	private String sfechaSolicitud="";
	private int estadoSolicitud;
	private String descripcionEstadoSolicitud="";
	
	public SolicitudCertificadoDTO() {
		super();
	}

	public int getIdSolicitudCertificado() {
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

	public int getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public String getProgramaUniversidad() {
		return programaUniversidad;
	}

	public String getMailMember() {
		return mailMember;
	}

	public String getAnhoIngreso() {
		return anhoIngreso;
	}

	public int getIdTipoCertificado() {
		return idTipoCertificado;
	}

	public String getTipoCertificado() {
		return tipoCertificado;
	}

	public int getIdFinalidadCertificado() {
		return idFinalidadCertificado;
	}

	public String getFinalidadCertificado() {
		return finalidadCertificado;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public String getSfechaSolicitud() {
		return sfechaSolicitud;
	}

	public int getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public String getDescripcionEstadoSolicitud() {
		return descripcionEstadoSolicitud;
	}

	public void setIdSolicitudCertificado(int idSolicitudCertificado) {
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

	public void setIdProgramaUniversidad(int idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	public void setProgramaUniversidad(String programaUniversidad) {
		this.programaUniversidad = programaUniversidad;
	}

	public void setMailMember(String mailMember) {
		this.mailMember = mailMember;
	}

	public void setAnhoIngreso(String anhoIngreso) {
		this.anhoIngreso = anhoIngreso;
	}

	public void setIdTipoCertificado(int idTipoCertificado) {
		this.idTipoCertificado = idTipoCertificado;
	}

	public void setTipoCertificado(String tipoCertificado) {
		this.tipoCertificado = tipoCertificado;
	}

	public void setIdFinalidadCertificado(int idFinalidadCertificado) {
		this.idFinalidadCertificado = idFinalidadCertificado;
	}

	public void setFinalidadCertificado(String finalidadCertificado) {
		this.finalidadCertificado = finalidadCertificado;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public void setSfechaSolicitud(String sfechaSolicitud) {
		this.sfechaSolicitud = sfechaSolicitud;
	}

	public void setEstadoSolicitud(int estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public void setDescripcionEstadoSolicitud(String descripcionEstadoSolicitud) {
		this.descripcionEstadoSolicitud = descripcionEstadoSolicitud;
	}
}
