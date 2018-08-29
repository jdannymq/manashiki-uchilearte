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
@Table (name="solicitud_certificado")

public class SolicitudCertificadoEntity implements Serializable {
 
	private static final long serialVersionUID = -5744715367087064959L;
	
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_solicitud_certificado")
	private Integer idSolicitudCertificado;
	
	@OrderBy
	@Column(name="nombre_persona_solicitud_certificado")
	private String nombrePersonaSolicitudCertificado; //Nombre a Mostrar
	
	@OrderBy
	@Column(name="apellido_paterno_persona_solicitud_certificado")
	private String apellidoPaternoPersonaSolicitudCertificado;
	/**************************/
	@OrderBy
	@Column(name="apellido_materno_persona_solicitud_certificado")
	private String apellidoMaternoPersonaSolicitudCertificado; 
	
	@Column(name="rut_persona_solicitud_certificado")
	private String rutPersonaSolicitudCertificado;
	
	@ManyToOne
	@JoinColumn(name="fk_id_programa_universidad")
	@IndexColumn(name="idx_solicitud_certificado_fk_id_programa_universidad")
	private ProgramaUniversidadEntity fkIdProgramaUniversidad;
	
	@OrderBy
	@Column(name="mail_member")
	private String mailMember; //mail usuario
	
	@OrderBy
	@Column(name="anho_ingreso")
	private String anhoIngreso; //mail usuario
	
	@ManyToOne
	@JoinColumn(name="fk_id_tipo_certificado")
	@IndexColumn(name="idx_solicitud_certificado_fk_id_tipo_certificado")
	private TipoCertificadoEntity fkIdTipoCertificado;
	
	@ManyToOne
	@JoinColumn(name="fk_id_finalidad_certificado")
	@IndexColumn(name="idx_solicitud_certificado_fk_id_finalidad_certificado")
	private FinalidadCertificadoEntity fkIdFinalidadCertificado;
	
	@IndexColumn(name="idx_solicitud_certificado_fecha_solicitud")
	@Column(name="fecha_solicitud")
	private Timestamp fechaSolicitud; //momento que que ejecutada la solicitud
	
	@OrderBy
	@Index(name="idx_solicitud_certificado_estado_solicitud")
	@Column(name="estado_solicitud")
	private Integer estadoSolicitud;
	
	@OneToMany(mappedBy="fkIdSolicitudCertificado")
	private List<LogReservaEntity> negocios_solicitudes;
	
	//Solo Agregar el Aplicacion Empresa
	
	public SolicitudCertificadoEntity() {
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

	public ProgramaUniversidadEntity getFkIdProgramaUniversidad() {
		return fkIdProgramaUniversidad;
	}

	public String getMailMember() {
		return mailMember;
	}

	public String getAnhoIngreso() {
		return anhoIngreso;
	}

	public TipoCertificadoEntity getFkIdTipoCertificado() {
		return fkIdTipoCertificado;
	}

	public FinalidadCertificadoEntity getFkIdFinalidadCertificado() {
		return fkIdFinalidadCertificado;
	}

	public Timestamp getFechaSolicitud() {
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

	public void setFkIdProgramaUniversidad(ProgramaUniversidadEntity fkIdProgramaUniversidad) {
		this.fkIdProgramaUniversidad = fkIdProgramaUniversidad;
	}

	public void setMailMember(String mailMember) {
		this.mailMember = mailMember;
	}

	public void setAnhoIngreso(String anhoIngreso) {
		this.anhoIngreso = anhoIngreso;
	}

	public void setFkIdTipoCertificado(TipoCertificadoEntity fkIdTipoCertificado) {
		this.fkIdTipoCertificado = fkIdTipoCertificado;
	}

	public void setFkIdFinalidadCertificado(FinalidadCertificadoEntity fkIdFinalidadCertificado) {
		this.fkIdFinalidadCertificado = fkIdFinalidadCertificado;
	}

	public void setFechaSolicitud(Timestamp fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public void setEstadoSolicitud(Integer estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public List<LogReservaEntity> getNegocios_solicitudes() {
		return negocios_solicitudes;
	}

	public void setNegocios_solicitudes(List<LogReservaEntity> negocios_solicitudes) {
		this.negocios_solicitudes = negocios_solicitudes;
	}
	
}
