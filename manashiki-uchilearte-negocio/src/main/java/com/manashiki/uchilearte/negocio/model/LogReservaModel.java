package com.manashiki.uchilearte.negocio.model;

import java.math.BigDecimal;
import java.util.Date;

public class LogReservaModel{

	private Integer idLogReservaModel;
	private String contenidoLogReserva;
	private Integer idSolicitudCertificado;
	private Integer idSolicitudAcademica;
	private Integer idSolicitudPostulacion;
	private Date fechaInicialLogReserva;
	private Date fechaConfirmacionLogReserva;
	private Integer tipoCompra;
	private Integer medioPago;
	private BigDecimal valorPagado;
	private Boolean correoConfirmacionEnviado;
	
	public LogReservaModel() {
		super();
	}

	public Integer getIdLogReservaModel() {
		return idLogReservaModel;
	}

	public void setIdLogReservaModel(Integer idLogReservaModel) {
		this.idLogReservaModel = idLogReservaModel;
	}

	public String getContenidoLogReserva() {
		return contenidoLogReserva;
	}

	public void setContenidoLogReserva(String contenidoLogReserva) {
		this.contenidoLogReserva = contenidoLogReserva;
	}

	public Integer getIdSolicitudCertificado() {
		return idSolicitudCertificado;
	}

	public void setIdSolicitudCertificado(Integer idSolicitudCertificado) {
		this.idSolicitudCertificado = idSolicitudCertificado;
	}

	public Integer getIdSolicitudAcademica() {
		return idSolicitudAcademica;
	}

	public void setIdSolicitudAcademica(Integer idSolicitudAcademica) {
		this.idSolicitudAcademica = idSolicitudAcademica;
	}

	public Integer getIdSolicitudPostulacion() {
		return idSolicitudPostulacion;
	}

	public void setIdSolicitudPostulacion(Integer idSolicitudPostulacion) {
		this.idSolicitudPostulacion = idSolicitudPostulacion;
	}

	public Date getFechaInicialLogReserva() {
		return fechaInicialLogReserva;
	}

	public void setFechaInicialLogReserva(Date fechaInicialLogReserva) {
		this.fechaInicialLogReserva = fechaInicialLogReserva;
	}

	public Date getFechaConfirmacionLogReserva() {
		return fechaConfirmacionLogReserva;
	}

	public void setFechaConfirmacionLogReserva(Date fechaConfirmacionLogReserva) {
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
