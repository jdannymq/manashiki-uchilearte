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
@Table (name="solicitud_academica")

public class SolicitudAcademicaEntity implements Serializable {
 
	private static final long serialVersionUID = 9158823486183875709L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_solicitud_academica")
	private Integer idSolicitudAcademica;
	
	@OrderBy
	@Column(name="nombre_persona_solicitud_academica")
	private String nombrePersonaSolicitudAcademica; //Nombre a Mostrar
	
	@OrderBy
	@Column(name="apellido_paterno_persona_solicitud_academica")
	private String apellidoPaternoPersonaSolicitudAcademica;
	/**************************/
	@OrderBy
	@Column(name="apellido_materno_persona_solicitud_academica")
	private String apellidoMaternoPersonaSolicitudAcademica; 
	
	@Column(name="rut_persona_solicitud_academica")
	private String rutPersonaSolicitudAcademica;
	
	@ManyToOne
	@JoinColumn(name="fk_id_programa_universidad")
	@IndexColumn(name="idx_solicitud_academica_fk_id_programa_universidad")
	private ProgramaUniversidadEntity fkIdProgramaUniversidad;
	
	@OrderBy
	@Column(name="mail_member")
	private String mailMember; //mail de solicitante
	
	@OrderBy
	@Column(name="anho_ingreso")
	private String anhoIngreso; //anño ingreso Solicitante
	
	@ManyToOne
	@JoinColumn(name="fk_id_tipo_solicitud")
	@IndexColumn(name="idx_solicitud_academica_fk_id_tipo_solicitud")
	private TipoSolicitudEntity fkIdTipoSolicitud;
	
	@OrderBy
	@Column(name="fundamentacion_solicitud", length=1000)
	private String fundamentacionSolicitud; //mail usuario
	
	@IndexColumn(name="idx_solicitud_academica_fecha_solicitud")
	@Column(name="fecha_solicitud")
	private Timestamp fechaSolicitud; //momento que que ejecutada la solicitud
	
	@OrderBy
	@Column(name="archivo_adjunto")
	private boolean archivoAdjunto; 
	
	@ManyToOne
	@JoinColumn(name="fk_id_archivo_solicitud_")
	@IndexColumn(name="idx_solicitud_academica_fk_id_archivo_solicitud")
	private ArchivoSolicitudEntity fkIdArchivoSolicitud;
	
	@OrderBy
	@Index(name="idx_solicitud_solicitud_estado_solicitud")
	@Column(name="estado_solicitud")
	private Integer estadoSolicitud;
	
	@OneToMany(mappedBy="fkIdSolicitudAcademica")
	private List<LogReservaEntity> negocios_solicitudes;
	
	public SolicitudAcademicaEntity() {
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

	public ProgramaUniversidadEntity getFkIdProgramaUniversidad() {
		return fkIdProgramaUniversidad;
	}

	public String getMailMember() {
		return mailMember;
	}

	public String getAnhoIngreso() {
		return anhoIngreso;
	}

	public TipoSolicitudEntity getFkIdTipoSolicitud() {
		return fkIdTipoSolicitud;
	}

	public String getFundamentacionSolicitud() {
		return fundamentacionSolicitud;
	}

	public Timestamp getFechaSolicitud() {
		return fechaSolicitud;
	}

	public ArchivoSolicitudEntity getFkIdArchivoSolicitud() {
		return fkIdArchivoSolicitud;
	}

	public Integer getEstadoSolicitud() {
		return estadoSolicitud;
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

	public void setFkIdProgramaUniversidad(ProgramaUniversidadEntity fkIdProgramaUniversidad) {
		this.fkIdProgramaUniversidad = fkIdProgramaUniversidad;
	}

	public void setMailMember(String mailMember) {
		this.mailMember = mailMember;
	}

	public void setAnhoIngreso(String anhoIngreso) {
		this.anhoIngreso = anhoIngreso;
	}

	public void setFkIdTipoSolicitud(TipoSolicitudEntity fkIdTipoSolicitud) {
		this.fkIdTipoSolicitud = fkIdTipoSolicitud;
	}

	public void setFundamentacionSolicitud(String fundamentacionSolicitud) {
		this.fundamentacionSolicitud = fundamentacionSolicitud;
	}

	public void setFechaSolicitud(Timestamp fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public void setFkIdArchivoSolicitud(ArchivoSolicitudEntity fkIdArchivoSolicitud) {
		this.fkIdArchivoSolicitud = fkIdArchivoSolicitud;
	}

	public void setEstadoSolicitud(Integer estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public boolean isArchivoAdjunto() {
		return archivoAdjunto;
	}

	public void setArchivoAdjunto(boolean archivoAdjunto) {
		this.archivoAdjunto = archivoAdjunto;
	}

	public List<LogReservaEntity> getNegocios_solicitudes() {
		return negocios_solicitudes;
	}

	public void setNegocios_solicitudes(List<LogReservaEntity> negocios_solicitudes) {
		this.negocios_solicitudes = negocios_solicitudes;
	}
	
}
