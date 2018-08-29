package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="solicitudPostulacionDTO")
public class SolicitudPostulacionDTO  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5666265297271829157L;
	/***/
	private int idSolicitudPostulacion;
	private int idProgramaUniversidadPostulacion;
	private String programaPostulacionUniversidad ="";
	private String costoProgramaUniversidad ="";
	private String tituloVersionSemestral; //Programa Universidad + Version de Programa Universidad se deben ver en la tabla de administracion 
	/***/
	private String rutPersonaSolicitudPostulacion;
	private String nombrePersonaSolicitudPostulacion; //Nombre a Mostrar
	private String apellidoPaternoPersonaSolicitudPostulacion;
	private String apellidoMaternoPersonaSolicitudPostulacion; 
	private String fechaNacimiento;
	private String nacionalidad;
	private String fonoContacto; //mail de solicitante
	private String celularContacto; //celular de solicitante
	private String mailMember; //mail de solicitante
	private String domicilio;
	private String paisDomicilio;
	private int idRegionDomicilio;
	private String nombreRegion;
	private int idComunaDomicilio;
	private String nombreComuna;
	private String ciudadDomicilio;
	
	/***/
	private String tituloProfesional;
	private String entidadEducacional;
	private String paisEntidadEducacional;
	private String anhoObtencionEntidadEducacional;
	private String ocupacionActual;
	/***/
	private String interesPrograma;
	private String fuenteFinancimiamiento;
	private String comentarios;
	/***/
	private int idArchivoSolicitud;
	private String nombreArchivoSolicitud;
	/***/
	private Date fechaSolicitudPostulacion;
	private String sfechaSolicitud="";
	private int estadoSolicitudPostulacion;
	private String descripcionEstadoSolicitudPostulacion;
	
	public SolicitudPostulacionDTO() {
		super();
	}

	public int getIdSolicitudPostulacion() {
		return idSolicitudPostulacion;
	}

	public void setIdSolicitudPostulacion(int idSolicitudPostulacion) {
		this.idSolicitudPostulacion = idSolicitudPostulacion;
	}

	
	public int getIdProgramaUniversidadPostulacion() {
		return idProgramaUniversidadPostulacion;
	}

	public void setIdProgramaUniversidadPostulacion(int idProgramaUniversidadPostulacion) {
		this.idProgramaUniversidadPostulacion = idProgramaUniversidadPostulacion;
	}

	public String getProgramaPostulacionUniversidad() {
		return programaPostulacionUniversidad;
	}

	public void setProgramaPostulacionUniversidad(String programaPostulacionUniversidad) {
		this.programaPostulacionUniversidad = programaPostulacionUniversidad;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public String getCostoProgramaUniversidad() {
		return costoProgramaUniversidad;
	}

	public void setCostoProgramaUniversidad(String costoProgramaUniversidad) {
		this.costoProgramaUniversidad = costoProgramaUniversidad;
	}

	public String getTituloVersionSemestral() {
		return tituloVersionSemestral;
	}

	public void setTituloVersionSemestral(String tituloVersionSemestral) {
		this.tituloVersionSemestral = tituloVersionSemestral;
	}

	public String getRutPersonaSolicitudPostulacion() {
		return rutPersonaSolicitudPostulacion;
	}

	public void setRutPersonaSolicitudPostulacion(String rutPersonaSolicitudPostulacion) {
		this.rutPersonaSolicitudPostulacion = rutPersonaSolicitudPostulacion;
	}

	public String getNombrePersonaSolicitudPostulacion() {
		return nombrePersonaSolicitudPostulacion;
	}

	public void setNombrePersonaSolicitudPostulacion(String nombrePersonaSolicitudPostulacion) {
		this.nombrePersonaSolicitudPostulacion = nombrePersonaSolicitudPostulacion;
	}

	public String getApellidoPaternoPersonaSolicitudPostulacion() {
		return apellidoPaternoPersonaSolicitudPostulacion;
	}

	public void setApellidoPaternoPersonaSolicitudPostulacion(String apellidoPaternoPersonaSolicitudPostulacion) {
		this.apellidoPaternoPersonaSolicitudPostulacion = apellidoPaternoPersonaSolicitudPostulacion;
	}

	public String getApellidoMaternoPersonaSolicitudPostulacion() {
		return apellidoMaternoPersonaSolicitudPostulacion;
	}

	public void setApellidoMaternoPersonaSolicitudPostulacion(String apellidoMaternoPersonaSolicitudPostulacion) {
		this.apellidoMaternoPersonaSolicitudPostulacion = apellidoMaternoPersonaSolicitudPostulacion;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getFonoContacto() {
		return fonoContacto;
	}

	public void setFonoContacto(String fonoContacto) {
		this.fonoContacto = fonoContacto;
	}

	public String getCelularContacto() {
		return celularContacto;
	}

	public void setCelularContacto(String celularContacto) {
		this.celularContacto = celularContacto;
	}

	public String getMailMember() {
		return mailMember;
	}

	public void setMailMember(String mailMember) {
		this.mailMember = mailMember;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getPaisDomicilio() {
		return paisDomicilio;
	}

	public void setPaisDomicilio(String paisDomicilio) {
		this.paisDomicilio = paisDomicilio;
	}

	public int getIdRegionDomicilio() {
		return idRegionDomicilio;
	}

	public void setIdRegionDomicilio(int idRegionDomicilio) {
		this.idRegionDomicilio = idRegionDomicilio;
	}

	public int getIdComunaDomicilio() {
		return idComunaDomicilio;
	}

	public void setIdComunaDomicilio(int idComunaDomicilio) {
		this.idComunaDomicilio = idComunaDomicilio;
	}

	public String getNombreComuna() {
		return nombreComuna;
	}

	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}

	public String getCiudadDomicilio() {
		return ciudadDomicilio;
	}

	public void setCiudadDomicilio(String ciudadDomicilio) {
		this.ciudadDomicilio = ciudadDomicilio;
	}

	public String getTituloProfesional() {
		return tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getEntidadEducacional() {
		return entidadEducacional;
	}

	public void setEntidadEducacional(String entidadEducacional) {
		this.entidadEducacional = entidadEducacional;
	}

	public String getPaisEntidadEducacional() {
		return paisEntidadEducacional;
	}

	public void setPaisEntidadEducacional(String paisEntidadEducacional) {
		this.paisEntidadEducacional = paisEntidadEducacional;
	}

	public String getAnhoObtencionEntidadEducacional() {
		return anhoObtencionEntidadEducacional;
	}

	public void setAnhoObtencionEntidadEducacional(String anhoObtencionEntidadEducacional) {
		this.anhoObtencionEntidadEducacional = anhoObtencionEntidadEducacional;
	}

	public String getOcupacionActual() {
		return ocupacionActual;
	}

	public void setOcupacionActual(String ocupacionActual) {
		this.ocupacionActual = ocupacionActual;
	}

	public String getInteresPrograma() {
		return interesPrograma;
	}

	public void setInteresPrograma(String interesPrograma) {
		this.interesPrograma = interesPrograma;
	}

	public String getFuenteFinancimiamiento() {
		return fuenteFinancimiamiento;
	}

	public void setFuenteFinancimiamiento(String fuenteFinancimiamiento) {
		this.fuenteFinancimiamiento = fuenteFinancimiamiento;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public int getIdArchivoSolicitud() {
		return idArchivoSolicitud;
	}

	public void setIdArchivoSolicitud(int idArchivoSolicitud) {
		this.idArchivoSolicitud = idArchivoSolicitud;
	}

	public String getNombreArchivoSolicitud() {
		return nombreArchivoSolicitud;
	}

	public void setNombreArchivoSolicitud(String nombreArchivoSolicitud) {
		this.nombreArchivoSolicitud = nombreArchivoSolicitud;
	}

	public Date getFechaSolicitudPostulacion() {
		return fechaSolicitudPostulacion;
	}

	public void setFechaSolicitudPostulacion(Date fechaSolicitudPostulacion) {
		this.fechaSolicitudPostulacion = fechaSolicitudPostulacion;
	}

	public String getSfechaSolicitud() {
		return sfechaSolicitud;
	}

	public void setSfechaSolicitud(String sfechaSolicitud) {
		this.sfechaSolicitud = sfechaSolicitud;
	}

	public int getEstadoSolicitudPostulacion() {
		return estadoSolicitudPostulacion;
	}

	public void setEstadoSolicitudPostulacion(int estadoSolicitudPostulacion) {
		this.estadoSolicitudPostulacion = estadoSolicitudPostulacion;
	}

	public String getDescripcionEstadoSolicitudPostulacion() {
		return descripcionEstadoSolicitudPostulacion;
	}

	public void setDescripcionEstadoSolicitudPostulacion(String descripcionEstadoSolicitudPostulacion) {
		this.descripcionEstadoSolicitudPostulacion = descripcionEstadoSolicitudPostulacion;
	}
	
}
