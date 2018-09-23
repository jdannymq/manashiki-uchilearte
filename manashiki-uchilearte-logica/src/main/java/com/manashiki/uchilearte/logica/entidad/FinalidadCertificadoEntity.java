package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;


/**
 * Entity implementation class for Entity: Region
 * en la base de Datos representa 
 */
@Entity
@Table (name="finalidad_certificado")

public class FinalidadCertificadoEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@IndexColumn(name="idx_finalidad_certificado_id_tipo_finalidad")
	@Column(name="id_finalidad_certificado")
	private Integer idFinalidadCertificado;
	@OrderBy
	@Column(name="codigo_finalidad_certificado")
	private String codigoFinalidadCertificado;
	@OrderBy
	@Column(name="nombre_finalidad_certificado")
	private String nombreFinalidadCertificado;

	@OneToMany(mappedBy="fkIdFinalidadCertificado")
	private List<SolicitudCertificadoEntity> finalidad_certificados;
	
	public FinalidadCertificadoEntity() {
		super();
	}

	public Integer getIdFinalidadCertificado() {
		return idFinalidadCertificado;
	}

	public String getCodigoFinalidadCertificado() {
		return codigoFinalidadCertificado;
	}

	public String getNombreFinalidadCertificado() {
		return nombreFinalidadCertificado;
	}

	public List<SolicitudCertificadoEntity> getFinalidad_certificados() {
		return finalidad_certificados;
	}

	public void setIdFinalidadCertificado(Integer idFinalidadCertificado) {
		this.idFinalidadCertificado = idFinalidadCertificado;
	}

	public void setCodigoFinalidadCertificado(String codigoFinalidadCertificado) {
		this.codigoFinalidadCertificado = codigoFinalidadCertificado;
	}

	public void setNombreFinalidadCertificado(String nombreFinalidadCertificado) {
		this.nombreFinalidadCertificado = nombreFinalidadCertificado;
	}

	public void setFinalidad_certificados(List<SolicitudCertificadoEntity> finalidad_certificados) {
		this.finalidad_certificados = finalidad_certificados;
	}

}
