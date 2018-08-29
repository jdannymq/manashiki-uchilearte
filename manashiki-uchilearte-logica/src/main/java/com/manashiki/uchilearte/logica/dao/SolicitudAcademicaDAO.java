package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.SolicitudAcademicaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;


public interface SolicitudAcademicaDAO{
	
	public SolicitudAcademicaEntity crearSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity);
	public SolicitudAcademicaEntity actualizarSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity);
	public SolicitudAcademicaEntity buscarSolicitudAcademicaxIdEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException;
	public SolicitudAcademicaEntity buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException;
	public SolicitudAcademicaEntity buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException;
	
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicasEntity();
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity);
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicaxTipoSolicitudEntity(SolicitudAcademicaEntity objSolicitudAcademicaInicial);
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicaxEntreFechasEntity(SolicitudAcademicaEntity objSolicitudAcademicaInicial, SolicitudAcademicaEntity objSolicitudAcademicaFinal);
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicaxEstadoEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity);
	
}