package com.manashiki.uchilearte.logica.entidad;

import java.io.Serializable;
import java.lang.String;
import java.sql.Timestamp;

import javax.persistence.*;

import org.eclipse.persistence.annotations.Index;
import org.hibernate.annotations.IndexColumn;

/**
 * Entity implementation class for Entity: Usuario
 * en la base de Datos representa el registro de las personas asociadas al servicio.
 */
@Entity
@Table (name="confirmacion_asignatura_tomada")

public class ConfirmacionAsignaturaTomadaEntity implements Serializable {

	private static final long serialVersionUID = 6455262527057552051L;

	@Id
	@OrderBy
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_confirmacion_asignatura_tomada")
	private Integer idConfirmacionAsignaturaTomada;
	
	@OrderBy
	@IndexColumn(name="idx_cat_listaFkIdProgramaActivoSemestreAsignaturaTomada")
	private String listaFkIdProgramaActivoSemestreAsignaturaTomada; //mail de solicitante
	
	@OrderBy
	@Column(name="fecha_confirmacion_asignatura_tomada")
	private Timestamp fechaConfirmacionAsignaturaTomada; //mail de solicitante
	
	@OrderBy
	@Column(name="descripcion_confirmacion_asignatura_tomada")
	private String descripcionConfirmacionAsignaturaTomada; //mail de solicitante
	
	@OrderBy
	@Index(name="idx_cat_estado__confirmacion_asignatura_tomada")
	@Column(name="estado_confirmacion_asignatura_tomada")
	private Integer estadoConfirmacionAsignaturaTomada;
	
	public ConfirmacionAsignaturaTomadaEntity() {
		super();
	}

	public Integer getIdConfirmacionAsignaturaTomada() {
		return idConfirmacionAsignaturaTomada;
	}

	public void setIdConfirmacionAsignaturaTomada(Integer idConfirmacionAsignaturaTomada) {
		this.idConfirmacionAsignaturaTomada = idConfirmacionAsignaturaTomada;
	}

	public String getListaFkIdProgramaActivoSemestreAsignaturaTomada() {
		return listaFkIdProgramaActivoSemestreAsignaturaTomada;
	}

	public void setListaFkIdProgramaActivoSemestreAsignaturaTomada(String listaFkIdProgramaActivoSemestreAsignaturaTomada) {
		this.listaFkIdProgramaActivoSemestreAsignaturaTomada = listaFkIdProgramaActivoSemestreAsignaturaTomada;
	}

	public Timestamp getFechaConfirmacionAsignaturaTomada() {
		return fechaConfirmacionAsignaturaTomada;
	}

	public void setFechaConfirmacionAsignaturaTomada(Timestamp fechaConfirmacionAsignaturaTomada) {
		this.fechaConfirmacionAsignaturaTomada = fechaConfirmacionAsignaturaTomada;
	}

	public String getDescripcionConfirmacionAsignaturaTomada() {
		return descripcionConfirmacionAsignaturaTomada;
	}

	public void setDescripcionConfirmacionAsignaturaTomada(String descripcionConfirmacionAsignaturaTomada) {
		this.descripcionConfirmacionAsignaturaTomada = descripcionConfirmacionAsignaturaTomada;
	}

	public Integer getEstadoConfirmacionAsignaturaTomada() {
		return estadoConfirmacionAsignaturaTomada;
	}

	public void setEstadoConfirmacionAsignaturaTomada(Integer estadoConfirmacionAsignaturaTomada) {
		this.estadoConfirmacionAsignaturaTomada = estadoConfirmacionAsignaturaTomada;
	}
}
