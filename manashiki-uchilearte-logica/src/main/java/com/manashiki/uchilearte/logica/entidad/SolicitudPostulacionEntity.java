package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Index;
import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Usuario
 * en la base de Datos representa el registro de las personas asociadas al servicio.
 */
@Entity
@Table (name="solicitud_postulacion")
public class SolicitudPostulacionEntity implements Serializable {
	
	private static final long serialVersionUID = 9158823486183875709L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_solicitud_postulacion")
	private Integer idSolicitudPostulacion;
	
//	@ManyToOne
//	@JoinColumn(name="fk_id_programa_universidad")
//	@IndexColumn(name="idx_solicitud_postulacion_fk_id_programa_universidad")
//	private ProgramaUniversidadEntity fkIdProgramaUniversidad;
//	@ManyToOne
//	@JoinColumn(name="fk_id_programa_universidad_postulacion") //Mantener el Nombre
	@ManyToOne
	@JoinColumn(name="fk_id_programa_universidad") 
	@IndexColumn(name="idx_solicitud_postulacion_fk_id_programa_universidad_postulacion")
	private ProgramaUniversidadPostulacionEntity fkIdProgramaUniversidadPostulacion;
	
	//Solo necesitamos el titulo de la version del semestre
//	@Column(name="titulo_version_semestral")
//	private String tituloVersionSemestral;
	
	@Column(name="rut_persona_solicitud_postulacion")
	private String rutPersonaSolicitudPostulacion;
	
	@OrderBy
	@Column(name="nombre_persona_solicitud_postulacion")
	private String nombrePersonaSolicitudPostulacion; //Nombre a Mostrar
	
	@OrderBy
	@Column(name="apellido_paterno_persona_solicitud_postulacion")
	private String apellidoPaternoPersonaSolicitudPostulacion;
	
	@OrderBy
	@Column(name="apellido_materno_persona_solicitud_postulacion")
	private String apellidoMaternoPersonaSolicitudPostulacion; 
	
	@OrderBy
	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;
	
	@OrderBy
	@Column(name="nacionalidad")
	private String nacionalidad;
	
	@OrderBy
	@Column(name="fonoContacto")
	private String fonoContacto; //mail de solicitante
	
	@OrderBy
	@Column(name="celularContacto")
	private String celularContacto; //celular de solicitante
	
	@OrderBy
	@Column(name="mail_member")
	private String mailMember; //mail de solicitante
	
	@OrderBy
	@Column(name="domicilio")
	private String domicilio; 
	
	@ManyToOne
	@JoinColumn(name="fk_id_comuna")
	@IndexColumn(name="idx_solicitud_postulacion_fk_id_comuna")
	private ComunaEntity fkIdComuna;
	
	@OrderBy
	@Column(name="ciudad_domicilio")
	private String ciudadDomicilio; 
	
	@OrderBy
	@Column(name="pais_domicilio")
	private String paisDomicilio; 
	
	@OrderBy
	@Column(name="titulo_profesional")
	private String tituloProfesional;
	
	@OrderBy
	@Column(name="entidad_educacional")
	private String entidadEducacional;
	
	@OrderBy
	@Column(name="pais_entidad_educacional")
	private String paisEntidadEducacional;
	
	@OrderBy
	@Column(name="anho_obtencion_entidad_educacional")
	private String anhoObtencionEntidadEducacional;
	
	@OrderBy
	@Column(name="ocupacion_actual")
	private String ocupacionActual;
	
	@OrderBy
	@Column(name="interes_programa")
	private String interesPrograma;
	
	@OrderBy
	@Column(name="fuente_financimiamiento")
	private String fuenteFinancimiamiento;
	
	@OrderBy
	@Column(name="comentarios", length=1000)
	private String comentarios;
	
	@ManyToOne
	@JoinColumn(name="fk_id_archivo_solicitud")
	@IndexColumn(name="idx_solicitud_postulacion_fk_id_archivo_solicitud")
	private ArchivoSolicitudEntity fkIdArchivoSolicitud;
	
	@IndexColumn(name="idx_solicitud_postulacion_fecha_solicitud")
	@Column(name="fecha_solicitud")
	private Timestamp fechaSolicitud; //momento que que ejecutada la solicitud
	
	@OrderBy
	@Index(name="idx_solicitud_postulacion_estado_solicitud")
	@Column(name="estado_solicitud_postulacion")
	private Integer estadoSolicitudPostulacion;
	
	@OneToMany(mappedBy="fkIdSolicitudPostulacion")
	private List<LogReservaEntity> negocios_solicitudes;
	
	public SolicitudPostulacionEntity() {
		super();
	}

	public Integer getIdSolicitudPostulacion() {
		return idSolicitudPostulacion;
	}

	public void setIdSolicitudPostulacion(Integer idSolicitudPostulacion) {
		this.idSolicitudPostulacion = idSolicitudPostulacion;
	}
	
	public ProgramaUniversidadPostulacionEntity getFkIdProgramaUniversidadPostulacion() {
		return fkIdProgramaUniversidadPostulacion;
	}

	public void setFkIdProgramaUniversidadPostulacion(
			ProgramaUniversidadPostulacionEntity fkIdProgramaUniversidadPostulacion) {
		this.fkIdProgramaUniversidadPostulacion = fkIdProgramaUniversidadPostulacion;
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

	public ComunaEntity getFkIdComuna() {
		return fkIdComuna;
	}

	public void setFkIdComuna(ComunaEntity fkIdComuna) {
		this.fkIdComuna = fkIdComuna;
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

	public ArchivoSolicitudEntity getFkIdArchivoSolicitud() {
		return fkIdArchivoSolicitud;
	}

	public void setFkIdArchivoSolicitud(ArchivoSolicitudEntity fkIdArchivoSolicitud) {
		this.fkIdArchivoSolicitud = fkIdArchivoSolicitud;
	}

	public Timestamp getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Timestamp fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Integer getEstadoSolicitudPostulacion() {
		return estadoSolicitudPostulacion;
	}

	public void setEstadoSolicitudPostulacion(Integer estadoSolicitudPostulacion) {
		this.estadoSolicitudPostulacion = estadoSolicitudPostulacion;
	}

	public List<LogReservaEntity> getNegocios_solicitudes() {
		return negocios_solicitudes;
	}

	public void setNegocios_solicitudes(List<LogReservaEntity> negocios_solicitudes) {
		this.negocios_solicitudes = negocios_solicitudes;
	}
	
}
