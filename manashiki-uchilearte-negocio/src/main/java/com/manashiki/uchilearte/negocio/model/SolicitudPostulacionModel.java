package com.manashiki.uchilearte.negocio.model;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

public class SolicitudPostulacionModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3839161042630247592L;
	private Integer idSolicitudPostulacion;
	private Integer idProgramaUniversidadPostulacion;
//	private String tituloVersionSemestral;
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
	private Integer idComunaDomicilio;
	private String ciudadDomicilio;
	private String paisDomicilio;
	
	private String tituloProfesional;
	private String entidadEducacional;
	private String paisEntidadEducacional;
	private String anhoObtencionEntidadEducacional;
	private String ocupacionActual;
	
	private String interesPrograma;
	private String fuenteFinancimiamiento;
	private String comentarios;
	
	private Integer idArchivoSolicitud;
	
	private Date fechaSolicitudPostulacion;
	private Integer estadoSolicitudPostulacion;
	
	public SolicitudPostulacionModel() {
		super();
	}

	public Integer getIdSolicitudPostulacion() {
		return idSolicitudPostulacion;
	}

	public void setIdSolicitudPostulacion(Integer idSolicitudPostulacion) {
		this.idSolicitudPostulacion = idSolicitudPostulacion;
	}

//	public String getTituloVersionSemestral() {
//		return tituloVersionSemestral;
//	}
//
//	public void setTituloVersionSemestral(String tituloVersionSemestral) {
//		this.tituloVersionSemestral = tituloVersionSemestral;
//	}

	public Integer getIdProgramaUniversidadPostulacion() {
		return idProgramaUniversidadPostulacion;
	}

	public void setIdProgramaUniversidadPostulacion(Integer idProgramaUniversidadPostulacion) {
		this.idProgramaUniversidadPostulacion = idProgramaUniversidadPostulacion;
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

	public Integer getIdComunaDomicilio() {
		return idComunaDomicilio;
	}

	public void setIdComunaDomicilio(Integer idComunaDomicilio) {
		this.idComunaDomicilio = idComunaDomicilio;
	}

	public String getCiudadDomicilio() {
		return ciudadDomicilio;
	}

	public void setCiudadDomicilio(String ciudadDomicilio) {
		this.ciudadDomicilio = ciudadDomicilio;
	}

	public String getPaisDomicilio() {
		return paisDomicilio;
	}

	public void setPaisDomicilio(String paisDomicilio) {
		this.paisDomicilio = paisDomicilio;
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

	public Integer getIdArchivoSolicitud() {
		return idArchivoSolicitud;
	}

	public void setIdArchivoSolicitud(Integer idArchivoSolicitud) {
		this.idArchivoSolicitud = idArchivoSolicitud;
	}

	public Date getFechaSolicitudPostulacion() {
		return fechaSolicitudPostulacion;
	}

	public void setFechaSolicitudPostulacion(Date fechaSolicitudPostulacion) {
		this.fechaSolicitudPostulacion = fechaSolicitudPostulacion;
	}

	public Integer getEstadoSolicitudPostulacion() {
		return estadoSolicitudPostulacion;
	}

	public void setEstadoSolicitudPostulacion(Integer estadoSolicitudPostulacion) {
		this.estadoSolicitudPostulacion = estadoSolicitudPostulacion;
	}
}
