package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="solicitudAcademicaDTO")
public class SolicitudAcademicaDTO implements Serializable{
 
	/**
	 * 
	 */
	private static final long serialVersionUID = -94497543430452141L;
	private int idSolicitudAcademica = 0 ;
	private String nombrePersonaSolicitudAcademica ="";
	private String apellidoPaternoPersonaSolicitudAcademica ="";
	private String apellidoMaternoPersonaSolicitudAcademica =""; 
	private String rutPersonaSolicitudAcademica ="";
	private int idProgramaUniversidad = 0;
	private String programaUniversidad = "";
	private String mailMember =""; //mail usuario
	private String anhoIngreso =""; 
	private int idTipoSolicitud = 0;
	private String tipoSolicitud = "";
	private String fundamentacionSolicitud =""; //mail usuario
	private Date fechaSolicitud = null; //momento que que ejecutada la solicitud
	private String sfechaSolicitud="";
	/**********************************************************/
	private boolean archivoAdjunto;
	private String nombreArchivo;
	private int idArchivoSolicitud;
	/**********************************************************/
	private int estadoSolicitud=0;
	private String descripcionEstadoSolicitud ="";
	
	public SolicitudAcademicaDTO() {
		super();
	}

	public int getIdSolicitudAcademica() {
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

	public int getIdProgramaUniversidad() {
		return idProgramaUniversidad;
	}

	public String getMailMember() {
		return mailMember;
	}

	public String getAnhoIngreso() {
		return anhoIngreso;
	}

	public int getIdTipoSolicitud() {
		return idTipoSolicitud;
	}

	public String getFundamentacionSolicitud() {
		return fundamentacionSolicitud;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public String getSfechaSolicitud() {
		return sfechaSolicitud;
	}

	public int getIdArchivoSolicitud() {
		return idArchivoSolicitud;
	}

	public int getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public String getDescripcionEstadoSolicitud() {
		return descripcionEstadoSolicitud;
	}

	public void setIdSolicitudAcademica(int idSolicitudAcademica) {
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

	public void setIdProgramaUniversidad(int idProgramaUniversidad) {
		this.idProgramaUniversidad = idProgramaUniversidad;
	}

	public void setMailMember(String mailMember) {
		this.mailMember = mailMember;
	}

	public void setAnhoIngreso(String anhoIngreso) {
		this.anhoIngreso = anhoIngreso;
	}

	public void setIdTipoSolicitud(int idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
	}

	

	public void setFundamentacionSolicitud(String fundamentacionSolicitud) {
		this.fundamentacionSolicitud = fundamentacionSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public void setSfechaSolicitud(String sfechaSolicitud) {
		this.sfechaSolicitud = sfechaSolicitud;
	}

	public void setIdArchivoSolicitud(int idArchivoSolicitud) {
		this.idArchivoSolicitud = idArchivoSolicitud;
	}

	public void setEstadoSolicitud(int estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public void setDescripcionEstadoSolicitud(String descripcionEstadoSolicitud) {
		this.descripcionEstadoSolicitud = descripcionEstadoSolicitud;
	}

	public boolean isArchivoAdjunto() {
		return archivoAdjunto;
	}

	public void setArchivoAdjunto(boolean archivoAdjunto) {
		this.archivoAdjunto = archivoAdjunto;
	}

	public String getProgramaUniversidad() {
		return programaUniversidad;
	}

	public void setProgramaUniversidad(String programaUniversidad) {
		this.programaUniversidad = programaUniversidad;
	}

	public String getTipoSolicitud() {
		return tipoSolicitud;
	}

	public void setTipoSolicitud(String tipoSolicitud) {
		this.tipoSolicitud = tipoSolicitud;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}
	
	
	
}
