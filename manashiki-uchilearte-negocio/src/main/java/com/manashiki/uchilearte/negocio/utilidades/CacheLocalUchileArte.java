package com.manashiki.uchilearte.negocio.utilidades;

import java.io.Serializable;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.FinalidadCertificadoModel;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadModel;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadPostulacionModel;
import com.manashiki.uchilearte.negocio.model.RegionModel;
import com.manashiki.uchilearte.negocio.model.TipoCertificadoModel;
import com.manashiki.uchilearte.negocio.model.TipoSolicitudModel;

public class CacheLocalUchileArte implements Serializable{

	private static final long serialVersionUID = -2948463167324803166L;
	
	/*Todos los creados*/
	private List<ProgramaUniversidadModel> listaProgramaUniversidad;
	/*Todos los activos para Postulaciones, Activos, Ordenados[Postulaciones]*/
	private List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacion;
	private List<TipoCertificadoModel> listaTipoCertificado;
	private List<FinalidadCertificadoModel> listaFinalidadCertificado;
	private List<TipoSolicitudModel> listaTipoSolicitud;
	private List<RegionModel> listaRegion;
	
	public CacheLocalUchileArte() {
	
	}
	
	public CacheLocalUchileArte(List<ProgramaUniversidadModel> listaProgramaUniversidad, List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacion,
			List<TipoCertificadoModel> listaTipoCertificado, List<FinalidadCertificadoModel> listaFinalidadCertificado,
			List<TipoSolicitudModel> listaTipoSolicitud, List<RegionModel> listaRegion) {
		super();
		this.listaProgramaUniversidad = listaProgramaUniversidad;
		this.listaProgramaUniversidadPostulacion = listaProgramaUniversidadPostulacion;
		this.listaTipoCertificado = listaTipoCertificado;
		this.listaFinalidadCertificado = listaFinalidadCertificado;
		this.listaTipoSolicitud = listaTipoSolicitud;
		this.listaRegion = listaRegion;
	}



	public List<ProgramaUniversidadModel> getListaProgramaUniversidad() {
		return listaProgramaUniversidad;
	}

	public List<TipoCertificadoModel> getListaTipoCertificado() {
		return listaTipoCertificado;
	}
	
	public List<ProgramaUniversidadPostulacionModel> getListaProgramaUniversidadPostulaciones() {
		return listaProgramaUniversidadPostulacion;
	}

	public void setListaProgramaUniversidadPostulaciones(
			List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacion) {
		this.listaProgramaUniversidadPostulacion = listaProgramaUniversidadPostulacion;
	}

	public List<FinalidadCertificadoModel> getListaFinalidadCertificado() {
		return listaFinalidadCertificado;
	}

	public List<TipoSolicitudModel> getListaTipoSolicitud() {
		return listaTipoSolicitud;
	}

	public void setListaProgramaUniversidad(List<ProgramaUniversidadModel> listaProgramaUniversidad) {
		this.listaProgramaUniversidad = listaProgramaUniversidad;
	}

	public void setListaTipoCertificado(List<TipoCertificadoModel> listaTipoCertificado) {
		this.listaTipoCertificado = listaTipoCertificado;
	}

	public void setListaFinalidadCertificado(List<FinalidadCertificadoModel> listaFinalidadCertificado) {
		this.listaFinalidadCertificado = listaFinalidadCertificado;
	}

	public void setListaTipoSolicitud(List<TipoSolicitudModel> listaTipoSolicitud) {
		this.listaTipoSolicitud = listaTipoSolicitud;
	}

	public List<RegionModel> getListaRegion() {
		return listaRegion;
	}

	public void setListaRegion(List<RegionModel> listaRegion) {
		this.listaRegion = listaRegion;
	}
	
}