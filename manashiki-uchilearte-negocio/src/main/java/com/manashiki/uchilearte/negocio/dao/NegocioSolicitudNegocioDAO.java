package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.NegocioSolicitudModel;



public interface NegocioSolicitudNegocioDAO{
	public NegocioSolicitudModel crearNegocioSolicitudModel(NegocioSolicitudModel objNegocioSolicitudModel);
	public NegocioSolicitudModel actualizarNegocioSolicitudModel(NegocioSolicitudModel objNegocioSolicitudModel);
	public NegocioSolicitudModel buscarNegocioSolicitudxIdModel(NegocioSolicitudModel objNegocioSolicitudModel) throws NegocioImplException;
	public List<NegocioSolicitudModel> listarNegocioSolicitudModel();
	
}