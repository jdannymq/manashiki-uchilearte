package com.manashiki.uchilearte.servdto.transaccion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "logReservaDTO")
public class LogReservaDTO implements Serializable {

	private static final long serialVersionUID = 8820798237726577623L;

	private int idLogReservaDTO;
	private String contenidoLogReserva;
	private int idSolicitudCertificado;
	private int idSolicitudAcademica;
	private int idSolicitudPostulacion;
	private Date fechaInicialLogReserva;
	private Date fechaConfirmacionLogReserva;
	private int tipoCompra;
	private int medioPago;
	private BigDecimal valorPagado;
	private boolean correoConfirmacionEnviado;

	public LogReservaDTO() {
		super();
	}

	public LogReservaDTO(int idLogReservaDTO, String contenidoLogReserva, int idSolicitudCertificado,
			int idSolicitudAcademica, int idSolicitudPostulacion, Date fechaInicialLogReserva,
			Date fechaConfirmacionLogReserva, int tipoCompra, int medioPago, BigDecimal valorPagado,
			boolean correoConfirmacionEnviado) {
		super();
		this.idLogReservaDTO = idLogReservaDTO;
		this.contenidoLogReserva = contenidoLogReserva;
		this.idSolicitudCertificado = idSolicitudCertificado;
		this.idSolicitudAcademica = idSolicitudAcademica;
		this.idSolicitudPostulacion = idSolicitudPostulacion;
		this.fechaInicialLogReserva = fechaInicialLogReserva;
		this.fechaConfirmacionLogReserva = fechaConfirmacionLogReserva;
		this.tipoCompra = tipoCompra;
		this.medioPago = medioPago;
		this.valorPagado = valorPagado;
		this.correoConfirmacionEnviado = correoConfirmacionEnviado;
	}

	public int getIdLogReservaDTO() {
		return idLogReservaDTO;
	}

	public void setIdLogReservaDTO(int idLogReservaDTO) {
		this.idLogReservaDTO = idLogReservaDTO;
	}

	public String getContenidoLogReserva() {
		return contenidoLogReserva;
	}

	public void setContenidoLogReserva(String contenidoLogReserva) {
		this.contenidoLogReserva = contenidoLogReserva;
	}

	public int getIdSolicitudCertificado() {
		return idSolicitudCertificado;
	}

	public void setIdSolicitudCertificado(int idSolicitudCertificado) {
		this.idSolicitudCertificado = idSolicitudCertificado;
	}

	public int getIdSolicitudAcademica() {
		return idSolicitudAcademica;
	}

	public void setIdSolicitudAcademica(int idSolicitudAcademica) {
		this.idSolicitudAcademica = idSolicitudAcademica;
	}

	public int getIdSolicitudPostulacion() {
		return idSolicitudPostulacion;
	}

	public void setIdSolicitudPostulacion(int idSolicitudPostulacion) {
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

	public int getTipoCompra() {
		return tipoCompra;
	}

	public void setTipoCompra(int tipoCompra) {
		this.tipoCompra = tipoCompra;
	}

	public int getMedioPago() {
		return medioPago;
	}

	public void setMedioPago(int medioPago) {
		this.medioPago = medioPago;
	}

	public BigDecimal getValorPagado() {
		return valorPagado;
	}

	public void setValorPagado(BigDecimal valorPagado) {
		this.valorPagado = valorPagado;
	}

	public boolean isCorreoConfirmacionEnviado() {
		return correoConfirmacionEnviado;
	}

	public void setCorreoConfirmacionEnviado(boolean correoConfirmacionEnviado) {
		this.correoConfirmacionEnviado = correoConfirmacionEnviado;
	}

	
}
