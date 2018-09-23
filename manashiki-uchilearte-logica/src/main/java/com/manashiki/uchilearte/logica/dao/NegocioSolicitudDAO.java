package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.NegocioSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;

public interface NegocioSolicitudDAO{
	public NegocioSolicitudEntity crearNegocioSolicitudEntity(NegocioSolicitudEntity objNegocioSolicitudEntity);
	public NegocioSolicitudEntity actualizarNegocioSolicitudEntity(NegocioSolicitudEntity objNegocioSolicitudEntity);
	public NegocioSolicitudEntity buscarNegocioSolicitudxIdEntity(NegocioSolicitudEntity objNegocioSolicitudEntity) throws PersistenceImplException;
	public List<NegocioSolicitudEntity> listarNegocioSolicitudEntity();
	
}