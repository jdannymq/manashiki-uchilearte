package com.manashiki.uchilearte.logica.entidad;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Region
 * en la base de Datos representa 
 */
@Entity
@Table (name="log_reserva")

public class LogReservaEntity{
 
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_log_reserva")
	private Integer idLogReservaEntity;
	@OrderBy
	@Lob
	@Column(name="contenido_log_reserva", length = 100000)
	private String contenidoLogReserva;
	
	@ManyToOne
	@JoinColumn(name="fk_id_solicitud_certificado", nullable=true)
	@IndexColumn(name="idx_log_reserva_fk_id_solicitud_certificado")
	private SolicitudCertificadoEntity fkIdSolicitudCertificado;
	
	@ManyToOne
	@JoinColumn(name="fk_id_solicitud_academica", nullable=true)
	@IndexColumn(name="idx_log_reserva_fk_id_solicitud_academica")
	private SolicitudAcademicaEntity fkIdSolicitudAcademica;
	
	@ManyToOne
	@JoinColumn(name="fk_id_solicitud_postulacion", nullable=true)
	@IndexColumn(name="idx_log_reserva_fk_id_solicitud_postulacion")
	private SolicitudPostulacionEntity fkIdSolicitudPostulacion;
	
	@IndexColumn(name="idx_log_reserva_fecha_inicial_log_reserva")
	@Column(name="fecha_inicial_log_reserva")
	private Timestamp fechaInicialLogReserva;
	
	@IndexColumn(name="idx_log_reserva_fecha_confirmacion_log_reserva")
	@Column(name="fecha_confirmacion_log_reserva")
	private Timestamp fechaConfirmacionLogReserva;
	
	@IndexColumn(name="idx_log_reserva_tipo_compra")
	@Column(name="tipo_compra")
	private Integer tipoCompra;
	
	@IndexColumn(name="idx_log_reserva_medio_pago")
	@Column(name="medio_pago")
	private Integer medioPago;
	
	@IndexColumn(name="idx_log_reserva_valor_pagado")
	@Column(name="valor_pagado")
	private BigDecimal valorPagado;
	
	@IndexColumn(name="idx_log_reserva_correo_confirmacion_enviado")
	@Column(name="correo_confirmacion_enviado")
	private Boolean correoConfirmacionEnviado;
		
	public LogReservaEntity() {
		super();
	}
	
	public Integer getIdLogReservaEntity() {
		return idLogReservaEntity;
	}

	public void setIdLogReservaEntity(Integer idLogReservaEntity) {
		this.idLogReservaEntity = idLogReservaEntity;
	}

	public String getContenidoLogReserva() {
		return contenidoLogReserva;
	}

	public void setContenidoLogReserva(String contenidoLogReserva) {
		this.contenidoLogReserva = contenidoLogReserva;
	}

	public SolicitudCertificadoEntity getFkIdSolicitudCertificado() {
		return fkIdSolicitudCertificado;
	}

	public void setFkIdSolicitudCertificado(SolicitudCertificadoEntity fkIdSolicitudCertificado) {
		this.fkIdSolicitudCertificado = fkIdSolicitudCertificado;
	}

	public SolicitudAcademicaEntity getFkIdSolicitudAcademica() {
		return fkIdSolicitudAcademica;
	}

	public void setFkIdSolicitudAcademica(SolicitudAcademicaEntity fkIdSolicitudAcademica) {
		this.fkIdSolicitudAcademica = fkIdSolicitudAcademica;
	}

	public SolicitudPostulacionEntity getFkIdSolicitudPostulacion() {
		return fkIdSolicitudPostulacion;
	}

	public void setFkIdSolicitudPostulacion(SolicitudPostulacionEntity fkIdSolicitudPostulacion) {
		this.fkIdSolicitudPostulacion = fkIdSolicitudPostulacion;
	}

	public Timestamp getFechaInicialLogReserva() {
		return fechaInicialLogReserva;
	}

	public void setFechaInicialLogReserva(Timestamp fechaInicialLogReserva) {
		this.fechaInicialLogReserva = fechaInicialLogReserva;
	}

	public Timestamp getFechaConfirmacionLogReserva() {
		return fechaConfirmacionLogReserva;
	}

	public void setFechaConfirmacionLogReserva(Timestamp fechaConfirmacionLogReserva) {
		this.fechaConfirmacionLogReserva = fechaConfirmacionLogReserva;
	}

	public Integer getTipoCompra() {
		return tipoCompra;
	}

	public void setTipoCompra(Integer tipoCompra) {
		this.tipoCompra = tipoCompra;
	}
	
	public Integer getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(Integer medioPago) {
		this.medioPago = medioPago;
	}

	public BigDecimal getValorPagado() {
		return valorPagado;
	}

	public void setValorPagado(BigDecimal valorPagado) {
		this.valorPagado = valorPagado;
	}

	public Boolean getCorreoConfirmacionEnviado() {
		return correoConfirmacionEnviado;
	}

	public void setCorreoConfirmacionEnviado(Boolean correoConfirmacionEnviado) {
		this.correoConfirmacionEnviado = correoConfirmacionEnviado;
	}
	
}
