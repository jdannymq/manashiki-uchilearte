package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ArchivoSolicitudModel;

public interface ArchivoSolicitudNegocioDAO{
	public ArchivoSolicitudModel crearArchivoSolicitudModel(ArchivoSolicitudModel archivoSolicitudModel);
	public ArchivoSolicitudModel actualizarArchivoSolicitudModel(ArchivoSolicitudModel archivoSolicitudModel);
	public ArchivoSolicitudModel buscarArchivoSolicitudxIdModel(ArchivoSolicitudModel archivoSolicitudModel) throws NegocioImplException;
	public List<ArchivoSolicitudModel> listarArchivoSolicitudesModel();
	
}