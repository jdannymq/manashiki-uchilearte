package com.manashiki.uchilearte.servdto.dto.entities.formulario;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="postulacionAcademicaDTO")
public class PostulacionAcademicaDTO implements Serializable{
 
	private static final long serialVersionUID = -2373371816477564324L;
	private int idSolicitudAcademica;
	private String nombrePersonaPostulacionAcademica ="";
	private String apellidoPaternoPersonaPostulacionAcademica ="";
	private String apellidoMaternoPersonaPostulacionAcademica =""; 
	private String rutPersonaPostulacionAcademica ="";
	private int idProgramaUniversidad;
	private String programaUniversidad ="";
	private String mailMember =""; //mail usuario
	private String anhoIngreso =""; 
	private int idTipoPostulacion;
	private String tipoPostulacion ="";
	private String fundamentacionPostulacion =""; //mail usuario
	private Date fechaPostulacion; //momento que que ejecutada la Postulacion
	private String sfechaPostulacion="";
	/**********************************************************/
	private String textFilePostulacion ="";
	private int idArchivoPostulacionAcademica;
	private byte[] filePostulacion;
	/**********************************************************/
	private int estadoPostulacion;
	private String descripcionEstadoPostulacion;
	
	public PostulacionAcademicaDTO() {
		super();
	}

	public int getIdSolicitudAcademica() {
		return idSolicitudAcademica;
	}

	public String getNombrePersonaPostulacionAcademica() {
		return nombrePersonaPostulacionAcademica;
	}

	public String getApellidoPaternoPersonaPostulacionAcademica() {
		return apellidoPaternoPersonaPostulacionAcademica;
	}

	public String getApellidoMaternoPersonaPostulacionAcademica() {
		return apellidoMaternoPersonaPostulacionAcademica;
	}

	public String getRutPersonaPostulacionAcademica() {
		return rutPersonaPostulacionAcademica;
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

	public int getIdTipoPostulacion() {
		return idTipoPostulacion;
	}

	public String getTipoPostulacion() {
		return tipoPostulacion;
	}

	public String getFundamentacionPostulacion() {
		return fundamentacionPostulacion;
	}

	public Date getFechaPostulacion() {
		return fechaPostulacion;
	}

	public String getSfechaPostulacion() {
		return sfechaPostulacion;
	}

	public String getTextFilePostulacion() {
		return textFilePostulacion;
	}

	public int getIdArchivoPostulacionAcademica() {
		return idArchivoPostulacionAcademica;
	}

	public byte[] getFilePostulacion() {
		return filePostulacion;
	}

	public int getEstadoPostulacion() {
		return estadoPostulacion;
	}

	public String getDescripcionEstadoPostulacion() {
		return descripcionEstadoPostulacion;
	}

	public void setIdSolicitudAcademica(int idSolicitudAcademica) {
		this.idSolicitudAcademica = idSolicitudAcademica;
	}

	public void setNombrePersonaPostulacionAcademica(String nombrePersonaPostulacionAcademica) {
		this.nombrePersonaPostulacionAcademica = nombrePersonaPostulacionAcademica;
	}

	public void setApellidoPaternoPersonaPostulacionAcademica(String apellidoPaternoPersonaPostulacionAcademica) {
		this.apellidoPaternoPersonaPostulacionAcademica = apellidoPaternoPersonaPostulacionAcademica;
	}

	public void setApellidoMaternoPersonaPostulacionAcademica(String apellidoMaternoPersonaPostulacionAcademica) {
		this.apellidoMaternoPersonaPostulacionAcademica = apellidoMaternoPersonaPostulacionAcademica;
	}

	public void setRutPersonaPostulacionAcademica(String rutPersonaPostulacionAcademica) {
		this.rutPersonaPostulacionAcademica = rutPersonaPostulacionAcademica;
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

	public void setIdTipoPostulacion(int idTipoPostulacion) {
		this.idTipoPostulacion = idTipoPostulacion;
	}

	public void setTipoPostulacion(String tipoPostulacion) {
		this.tipoPostulacion = tipoPostulacion;
	}

	public void setFundamentacionPostulacion(String fundamentacionPostulacion) {
		this.fundamentacionPostulacion = fundamentacionPostulacion;
	}

	public void setFechaPostulacion(Date fechaPostulacion) {
		this.fechaPostulacion = fechaPostulacion;
	}

	public void setSfechaPostulacion(String sfechaPostulacion) {
		this.sfechaPostulacion = sfechaPostulacion;
	}

	public void setTextFilePostulacion(String textFilePostulacion) {
		this.textFilePostulacion = textFilePostulacion;
	}

	public void setIdArchivoPostulacionAcademica(int idArchivoPostulacionAcademica) {
		this.idArchivoPostulacionAcademica = idArchivoPostulacionAcademica;
	}

	public void setFilePostulacion(byte[] filePostulacion) {
		this.filePostulacion = filePostulacion;
	}

	public void setEstadoPostulacion(int estadoPostulacion) {
		this.estadoPostulacion = estadoPostulacion;
	}

	public void setDescripcionEstadoPostulacion(String descripcionEstadoPostulacion) {
		this.descripcionEstadoPostulacion = descripcionEstadoPostulacion;
	}
	
}
