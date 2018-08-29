package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.TipoSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;



public interface TipoSolicitudDAO{
	public TipoSolicitudEntity crearTipoSolicitudEntity(TipoSolicitudEntity objTipoSolicitudEntity);
	public TipoSolicitudEntity actualizarTipoSolicitudEntity(TipoSolicitudEntity objTipoSolicitudEntity);
	public TipoSolicitudEntity buscarTipoSolicitudxIdEntity(TipoSolicitudEntity objTipoSolicitudEntity) throws PersistenceImplException;
	public List<TipoSolicitudEntity> listarTipoSolicitudesEntity();
	
}