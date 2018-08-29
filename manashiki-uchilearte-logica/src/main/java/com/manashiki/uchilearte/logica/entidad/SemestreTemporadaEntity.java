package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;


/**
 * Entity implementation class for Entity: Usuario
 * en la base de Datos representa el registro de las personas asociadas al servicio.
 */
@Entity
@Table (name="semestre_temporada")

public class SemestreTemporadaEntity implements Serializable {
 
	private static final long serialVersionUID = 9158823486183875709L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_semestre_temporada")
	private Integer idSemestreTemporada;
	
	@OrderBy
	@Column(name="nombre_semestre_temporada")
	private String nombreSemestreTemporada; //Nombre a Mostrar
	
	@OrderBy
	@Column(name="descripcion_semestre_temporada")
	private String descripcionSemestreTemporada;
	
	@OrderBy
	@Column(name="fecha_activacion_desde")
	private Timestamp fechaActivacionDesde;
	
	@OrderBy
	@Column(name="fecha_activacion_hasta")
	private Timestamp fechaActivacionHasta;
	
	@OneToMany(mappedBy="fkIdSemestreTemporada")
	private List<ProgramaActivoSemestreEntity> programas_activos_semestre;
	
	public SemestreTemporadaEntity() {
		super();
	}

	public Integer getIdSemestreTemporada() {
		return idSemestreTemporada;
	}

	public void setIdSemestreTemporada(Integer idSemestreTemporada) {
		this.idSemestreTemporada = idSemestreTemporada;
	}

	public String getNombreSemestreTemporada() {
		return nombreSemestreTemporada;
	}

	public void setNombreSemestreTemporada(String nombreSemestreTemporada) {
		this.nombreSemestreTemporada = nombreSemestreTemporada;
	}

	public String getDescripcionSemestreTemporada() {
		return descripcionSemestreTemporada;
	}

	public void setDescripcionSemestreTemporada(String descripcionSemestreTemporada) {
		this.descripcionSemestreTemporada = descripcionSemestreTemporada;
	}

	public Timestamp getFechaActivacionDesde() {
		return fechaActivacionDesde;
	}

	public void setFechaActivacionDesde(Timestamp fechaActivacionDesde) {
		this.fechaActivacionDesde = fechaActivacionDesde;
	}

	public Timestamp getFechaActivacionHasta() {
		return fechaActivacionHasta;
	}

	public void setFechaActivacionHasta(Timestamp fechaActivacionHasta) {
		this.fechaActivacionHasta = fechaActivacionHasta;
	}

	public List<ProgramaActivoSemestreEntity> getProgramas_activos_semestre() {
		return programas_activos_semestre;
	}

	public void setProgramas_activos_semestre(List<ProgramaActivoSemestreEntity> programas_activos_semestre) {
		this.programas_activos_semestre = programas_activos_semestre;
	}
}
