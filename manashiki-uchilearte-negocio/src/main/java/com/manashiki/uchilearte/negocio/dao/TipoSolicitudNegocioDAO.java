package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.TipoSolicitudModel;

public interface TipoSolicitudNegocioDAO{
	
	public TipoSolicitudModel crearTipoSolicitudModel(TipoSolicitudModel objTipoSolicitudModel);
	public TipoSolicitudModel actualizarTipoSolicitudModel(TipoSolicitudModel objTipoSolicitudModel);
	public TipoSolicitudModel buscarTipoSolicitudxIdModel(TipoSolicitudModel objTipoSolicitudModel) throws NegocioImplException;
	public List<TipoSolicitudModel> listarTipoSolicitudesModel();
	
}