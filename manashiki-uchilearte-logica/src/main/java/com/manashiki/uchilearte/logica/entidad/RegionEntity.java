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
@Table (name="region")

public class RegionEntity implements Serializable {
 
	private static final long serialVersionUID = 1L;
	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@IndexColumn(name="idx_region_id_region")
	@Column(name="id_region")
	private Integer idRegion;
	@OrderBy
	@Column(name="codigo_region")
	private String codigoRegion;
	@OrderBy
	@Column(name="nombre_region")
	private String nombreRegion;
	@OrderBy
	@Column(name="nombre_region_lower")
	private String nombreRegionLower;

	@Column(name="descripcion_region")
	private String descripcionRegion; 
	
	@OneToMany(mappedBy="fkIdRegion")
	private List<ComunaEntity> regiones_comunas;
	
	public RegionEntity() {
		super();
	}

	public Integer getIdRegion() {
		return idRegion;
	}

	public String getCodigoRegion() {
		return codigoRegion;
	}

	public String getNombreRegion() {
		return nombreRegion;
	}

	public String getNombreRegionLower() {
		return nombreRegionLower;
	}

	public String getDescripcionRegion() {
		return descripcionRegion;
	}

	public List<ComunaEntity> getRegiones_comunas() {
		return regiones_comunas;
	}

	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}

	public void setCodigoRegion(String codigoRegion) {
		this.codigoRegion = codigoRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public void setNombreRegionLower(String nombreRegionLower) {
		this.nombreRegionLower = nombreRegionLower;
	}

	public void setDescripcionRegion(String descripcionRegion) {
		this.descripcionRegion = descripcionRegion;
	}

	public void setRegiones_comunas(List<ComunaEntity> regiones_comunas) {
		this.regiones_comunas = regiones_comunas;
	}
	
}
