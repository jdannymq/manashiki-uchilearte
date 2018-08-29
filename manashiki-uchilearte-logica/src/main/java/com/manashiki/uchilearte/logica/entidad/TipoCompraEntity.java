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
//@Table (name="tipo_compra")
//
//public class TipoCompraEntity implements Serializable {
// 
//	private static final long serialVersionUID = -7852247520638441347L;
//	@Id
//	@OrderBy
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@IndexColumn(name="idx_tipo_compra_id_tipo_compra")
//	@Column(name="id_tipo_compra")
//	private Integer idTipoCompra;
//	@OrderBy
//	@Column(name="codigo_tipo_compra")
//	private String codigoTipoCompra;
//	@OrderBy
//	@Column(name="nombre_tipo_compra")
//	private String nombreTipoCompra;
//
//	@OneToMany(mappedBy="fkIdTipoCompra")
//	private List<NegocioSolicitudEntity> negocios_solicitudes;
//	
//	public TipoCompraEntity() {
//		super();
//	}
//
//	public Integer getIdTipoCompra() {
//		return idTipoCompra;
//	}
//
//	public void setIdTipoCompra(Integer idTipoCompra) {
//		this.idTipoCompra = idTipoCompra;
//	}
//
//	public String getCodigoTipoCompra() {
//		return codigoTipoCompra;
//	}
//
//	public void setCodigoTipoCompra(String codigoTipoCompra) {
//		this.codigoTipoCompra = codigoTipoCompra;
//	}
//
//	public String getNombreTipoCompra() {
//		return nombreTipoCompra;
//	}
//
//	public void setNombreTipoCompra(String nombreTipoCompra) {
//		this.nombreTipoCompra = nombreTipoCompra;
//	}
//
//	public List<NegocioSolicitudEntity> getNegocios_solicitudes() {
//		return negocios_solicitudes;
//	}
//
//	public void setNegocios_solicitudes(List<NegocioSolicitudEntity> negocios_solicitudes) {
//		this.negocios_solicitudes = negocios_solicitudes;
//	}
//	
//}
