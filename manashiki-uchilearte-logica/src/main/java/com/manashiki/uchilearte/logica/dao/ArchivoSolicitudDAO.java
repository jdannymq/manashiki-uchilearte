package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ArchivoSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;

public interface ArchivoSolicitudDAO{
	
	public ArchivoSolicitudEntity crearArchivoSolicitudEntity(ArchivoSolicitudEntity objArchivoSolicitudAcademicaEntity);
	public ArchivoSolicitudEntity actualizarArchivoSolicitudEntity(ArchivoSolicitudEntity objArchivoSolicitudAcademicaEntity);
	public ArchivoSolicitudEntity buscarArchivoSolicitudxIdEntity(ArchivoSolicitudEntity objArchivoSolicitudAcademicaEntity) throws PersistenceImplException;
	public List<ArchivoSolicitudEntity> listarArchivoSolicitudesEntity();
	
}