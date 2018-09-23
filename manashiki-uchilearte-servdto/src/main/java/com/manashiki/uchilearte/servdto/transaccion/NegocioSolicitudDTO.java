package com.manashiki.uchilearte.servdto.transaccion;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "negocioSolicitudDTO")
public class NegocioSolicitudDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4059599000866694541L;
	private int idNegocioSolicitudDTO;
	private String valorNegocioSolicitud="";
	private String keyNegocioSolicitud="";
	private Date fechaInicialNegocioSolicitud;
	private Date fechaVencimientoNegocioSolicitud;
	//	private SolicitudAcademicaDTO solicitudAcademicaDTO;
	//	private SolicitudCertificadoDTO solicitudCertificadoDTO;
	//	private SolicitudPostulacionDTO solicitudPostulacionDTO;

	public NegocioSolicitudDTO() {
		super();
	}

//	public NegocioSolicitudDTO(int idNegocioSolicitudDTO, String valorNegocioSolicitud, String keyNegocioSolicitud,
//			Date fechaInicialNegocioSolicitud, Date fechaVencimientoNegocioSolicitud) {
//		super();
//		this.idNegocioSolicitudDTO = idNegocioSolicitudDTO;
//		this.valorNegocioSolicitud = valorNegocioSolicitud;
//		this.keyNegocioSolicitud = keyNegocioSolicitud;
//		this.fechaInicialNegocioSolicitud = fechaInicialNegocioSolicitud;
//		this.fechaVencimientoNegocioSolicitud = fechaVencimientoNegocioSolicitud;
//	}
	
	public int getIdNegocioSolicitudDTO() {
		return idNegocioSolicitudDTO;
	}

	public void setIdNegocioSolicitudDTO(int idNegocioSolicitudDTO) {
		this.idNegocioSolicitudDTO = idNegocioSolicitudDTO;
	}

	public String getValorNegocioSolicitud() {
		return valorNegocioSolicitud;
	}
	public void setValorNegocioSolicitud(String valorNegocioSolicitud) {
		this.valorNegocioSolicitud = valorNegocioSolicitud;
	}
	public String getKeyNegocioSolicitud() {
		return keyNegocioSolicitud;
	}
	public void setKeyNegocioSolicitud(String keyNegocioSolicitud) {
		this.keyNegocioSolicitud = keyNegocioSolicitud;
	}
	public Date getFechaInicialNegocioSolicitud() {
		return fechaInicialNegocioSolicitud;
	}
	public void setFechaInicialNegocioSolicitud(Date fechaInicialNegocioSolicitud) {
		this.fechaInicialNegocioSolicitud = fechaInicialNegocioSolicitud;
	}
	public Date getFechaVencimientoNegocioSolicitud() {
		return fechaVencimientoNegocioSolicitud;
	}
	public void setFechaVencimientoNegocioSolicitud(Date fechaVencimientoNegocioSolicitud) {
		this.fechaVencimientoNegocioSolicitud = fechaVencimientoNegocioSolicitud;
	}
	//	public SolicitudAcademicaDTO getSolicitudAcademicaDTO() {
	//		return solicitudAcademicaDTO;
	//	}
	//	public void setSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO) {
	//		this.solicitudAcademicaDTO = solicitudAcademicaDTO;
	//	}
	//	public SolicitudCertificadoDTO getSolicitudCertificadoDTO() {
	//		return solicitudCertificadoDTO;
	//	}
	//	public void setSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO) {
	//		this.solicitudCertificadoDTO = solicitudCertificadoDTO;
	//	}
	//	public SolicitudPostulacionDTO getSolicitudPostulacionDTO() {
	//		return solicitudPostulacionDTO;
	//	}
	//	public void setSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO) {
	//		this.solicitudPostulacionDTO = solicitudPostulacionDTO;
	//	}

}
