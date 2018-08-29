//package com.manashiki.uchilearte.logica.entidad;
//
//import java.io.Serializable;
//import java.lang.String;
//import java.util.List;
//
//import javax.persistence.*;
//
//import org.hibernate.annotations.IndexColumn;
//
//
///**
// * Entity implementation class for Entity: Region
// * en la base de Datos representa 
// */
//@Entity
//@Table (name="tipo_postulacion")
//
//public class TipoPostulacionEntity implements Serializable {
// 
//	private static final long serialVersionUID = 1L;
//	@Id
//	@OrderBy
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@IndexColumn(name="idx_tipo_certificado_id_tipo_postulacion")
//	@Column(name="id_tipo_certificado")
//	private Integer idTipoPostulacion;
//	@OrderBy
//	@Column(name="codigo_tipo_postulacion")
//	private String codigoTipoPostulacion;
//	@OrderBy
//	@Column(name="nombre_tipo_postulacion")
//	private String nombreTipoPostulacion;
//
////	@OneToMany(mappedBy="fkIdTipoPostulacion")
////	private List<SolicitudPostulacionEntity> tipos_postulaciones;
//	
//	public TipoPostulacionEntity() {
//		super();
//	}
//
//	public Integer getIdTipoPostulacion() {
//		return idTipoPostulacion;
//	}
//
//	public String getCodigoTipoPostulacion() {
//		return codigoTipoPostulacion;
//	}
//
//	public String getNombreTipoPostulacion() {
//		return nombreTipoPostulacion;
//	}
//
//	public List<SolicitudPostulacionEntity> getTipos_postulaciones() {
//		return tipos_postulaciones;
//	}
//
//	public void setIdTipoPostulacion(Integer idTipoPostulacion) {
//		this.idTipoPostulacion = idTipoPostulacion;
//	}
//
//	public void setCodigoTipoPostulacion(String codigoTipoPostulacion) {
//		this.codigoTipoPostulacion = codigoTipoPostulacion;
//	}
//
//	public void setNombreTipoPostulacion(String nombreTipoPostulacion) {
//		this.nombreTipoPostulacion = nombreTipoPostulacion;
//	}
//
//	public void setTipos_postulaciones(List<SolicitudPostulacionEntity> tipos_postulaciones) {
//		this.tipos_postulaciones = tipos_postulaciones;
//	}
//}
