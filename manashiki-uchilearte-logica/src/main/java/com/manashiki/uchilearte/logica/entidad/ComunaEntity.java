package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.IndexColumn;


/**
 * Entity implementation class for Entity: Empresa
 * en la base de Datos representa las empresas que pueden acceder a los servicios de la empresa Tesoro del Cielo.
 */
@Entity
@Table (name="comuna")

public class ComunaEntity  implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 6007334041628922483L;
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@IndexColumn(name="idx_comuna_id_comuna")
	@Column(name="id_comuna")
	private Integer idComuna;
	@OrderBy
	@Column(name="codigo_comuna")
	private String codigoComuna;
	@OrderBy
	@Column(name="nombre_comuna")
	private String nombreComuna;
	@OrderBy
	@Column(name="nombre_comuna_lower")
	private String nombreComunaLower;
	
	@ManyToOne
	@JoinColumn(name="fk_id_region")
	@IndexColumn(name="idx_comuna_fk_id_region")
	private RegionEntity fkIdRegion;	
	
//	@OneToMany(mappedBy="fkIdComuna")
//	private List<EmpresaEntity> comunas_empresas;
	
	@OneToMany(mappedBy="fkIdComuna")
	private List<SolicitudPostulacionEntity> solicitudes_postulaciones;
	
	public ComunaEntity() {
		super();
	}

	public Integer getIdComuna() {
		return idComuna;
	}

	public String getCodigoComuna() {
		return codigoComuna;
	}

	public String getNombreComuna() {
		return nombreComuna;
	}

	public String getNombreComunaLower() {
		return nombreComunaLower;
	}

	public RegionEntity getFkIdRegion() {
		return fkIdRegion;
	}

//	public List<EmpresaEntity> getComunas_empresas() {
//		return comunas_empresas;
//	}

	public List<SolicitudPostulacionEntity> getSolicitudes_postulaciones() {
		return solicitudes_postulaciones;
	}

	public void setIdComuna(Integer idComuna) {
		this.idComuna = idComuna;
	}

	public void setCodigoComuna(String codigoComuna) {
		this.codigoComuna = codigoComuna;
	}

	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}

	public void setNombreComunaLower(String nombreComunaLower) {
		this.nombreComunaLower = nombreComunaLower;
	}

	public void setFkIdRegion(RegionEntity fkIdRegion) {
		this.fkIdRegion = fkIdRegion;
	}

//	public void setComunas_empresas(List<EmpresaEntity> comunas_empresas) {
//		this.comunas_empresas = comunas_empresas;
//	}

	public void setSolicitudes_postulaciones(List<SolicitudPostulacionEntity> solicitudes_postulaciones) {
		this.solicitudes_postulaciones = solicitudes_postulaciones;
	}
	
}
