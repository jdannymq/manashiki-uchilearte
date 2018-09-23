package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.SolicitudPostulacionDAO;
import com.manashiki.uchilearte.logica.entidad.SolicitudPostulacionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.SolicitudPostulacionRepository;

@Repository
public class SolicitudPostulacionDAOImpl implements SolicitudPostulacionDAO{

	private static final Logger objLog = LoggerFactory.getLogger(SolicitudPostulacionDAOImpl.class);
	
	@Autowired
	SolicitudPostulacionRepository solicitudPostulacionRepository;
	
	/**
	 * Crea una Entidad SolicitudPostulacion en la base de datos
	 * @param solicitudCertificado SolicitudPostulacion 
	 * @return void
	 * @throws no lanza excepciones
	 */
	public SolicitudPostulacionEntity crearSolicitudPostulacionEntity(SolicitudPostulacionEntity objSolicitudPostulacionEntity){
		objLog.info("INI - crearSolicitudPostulacionEntity");
		SolicitudPostulacionEntity solicitudCertificadoEntity = solicitudPostulacionRepository.save(objSolicitudPostulacionEntity);
		objLog.info("FIN - crearSolicitudPostulacionEntity "+objSolicitudPostulacionEntity.getIdSolicitudPostulacion());
		return solicitudCertificadoEntity;
	}
	
	/**
	 * Actualiza una Entidad SolicitudPostulacion en la base de datos 
	 * @param solicitudCertificado SolicitudPostulacion
	 * @return void
	 * @throws no lanza excepciones
	 */
	public SolicitudPostulacionEntity actualizarSolicitudPostulacionEntity(SolicitudPostulacionEntity objSolicitudPostulacionEntity){
		objLog.info("INI - actualizarSolicitudPostulacionEntity");
		SolicitudPostulacionEntity solicitudCertificadoEntity = solicitudPostulacionRepository.save(objSolicitudPostulacionEntity);
		objLog.info("FIN - actualizarSolicitudPostulacionEntity "+objSolicitudPostulacionEntity.getIdSolicitudPostulacion());
		return solicitudCertificadoEntity;
	}
	
	/**
	 * Método que devuelve entidad SolicitudPostulacion por Id
	 * @param solicitudCertificado SolicitudPostulacion
	 * @return metEmp SolicitudPostulacion
	 * @throws no lanza excepciones
	 */
	public SolicitudPostulacionEntity buscarSolicitudPostulacionxIdEntity(SolicitudPostulacionEntity objSolicitudPostulacionEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudPostulacionxIdEntity "+objSolicitudPostulacionEntity.getIdSolicitudPostulacion());
		SolicitudPostulacionEntity metEmp= null;
		try {
			metEmp = solicitudPostulacionRepository.findOne(objSolicitudPostulacionEntity.getIdSolicitudPostulacion());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudPostulacion()!=null){
 				objLog.info("FIN - buscarSolicitudPostulacionxIdEntity "+metEmp.getIdSolicitudPostulacion());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve entidad SolicitudPostulacion por Rut
	 * @param solicitudCertificado SolicitudPostulacion
	 * @return metEmp SolicitudPostulacion
	 * @throws no lanza excepciones
	 */
	public SolicitudPostulacionEntity buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionEntity(SolicitudPostulacionEntity objSolicitudPostulacionEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudPostulacionxRolUnicoSolicitudPostulacionEntity "+objSolicitudPostulacionEntity.getRutPersonaSolicitudPostulacion());
		SolicitudPostulacionEntity metEmp= null;
		try {
			metEmp = solicitudPostulacionRepository.findByRutPersonaSolicitudPostulacion(objSolicitudPostulacionEntity.getRutPersonaSolicitudPostulacion());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudPostulacion()!=null){
 				objLog.info("FIN - buscarSolicitudPostulacionxRolUnicoSolicitudPostulacionEntity "+metEmp.getIdSolicitudPostulacion());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve entidad SolicitudPostulacion por Nombre Lower
	 * @param solicitudCertificado SolicitudPostulacion
	 * @return metEmp SolicitudPostulacion
	 * @throws no lanza excepciones
	 */
	public SolicitudPostulacionEntity buscarSolicitudPostulacionxNombrePersonaSolicitudPostulacionEntity(SolicitudPostulacionEntity objSolicitudPostulacionEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudPostulacionxNombreSolicitudPostulacionLower "+objSolicitudPostulacionEntity.getNombrePersonaSolicitudPostulacion());
		SolicitudPostulacionEntity metEmp= null;
		try {
			metEmp = solicitudPostulacionRepository.findByNombrePersonaSolicitudPostulacion(objSolicitudPostulacionEntity.getNombrePersonaSolicitudPostulacion());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudPostulacion()!=null){
 				objLog.info("FIN - buscarSolicitudPostulacionxNombreSolicitudPostulacionLower "+metEmp.getIdSolicitudPostulacion());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve listado de todos las SolicitudPostulacions almacenadas
	 * @return lista List<SolicitudPostulacion>
	 * @throws no lanza excepciones
	 */
	public List<SolicitudPostulacionEntity> listarSolicitudPostulacionesEntity() {
		objLog.info("INI - listarSolicitudPostulacionsEntity");
		List<SolicitudPostulacionEntity> listaSolicitudPostulacion = null;
		try {
//			listaSolicitudPostulacion = solicitudPostulacionRepository.findAll();
			listaSolicitudPostulacion = solicitudPostulacionRepository.findAllByOrderByIdSolicitudPostulacionDesc();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista de solicitudes");
		}
		
		if(listaSolicitudPostulacion!=null){
			objLog.info("FIN - listarSolicitudPostulacionsEntity "+listaSolicitudPostulacion.size());
 		}
		
		return listaSolicitudPostulacion;
	}
	
	/**
	 * Método que devuelve entidad SolicitudPostulacion por Apellido Lower
	 * @param solicitudCertificado SolicitudPostulacion
	 * @return metEmp SolicitudPostulacion
	 * @throws no lanza excepciones
	 */
	public List<SolicitudPostulacionEntity> listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionEntity(SolicitudPostulacionEntity objSolicitudPostulacionEntity){
		objLog.info("INI - buscarSolicitudPostulacionxRazSocEntity "+objSolicitudPostulacionEntity.getApellidoPaternoPersonaSolicitudPostulacion());
		List<SolicitudPostulacionEntity> listaSolicitudPostulacion = null;
		try {
			listaSolicitudPostulacion = solicitudPostulacionRepository.findByApellidoPaternoPersonaSolicitudPostulacionContaining(objSolicitudPostulacionEntity.getApellidoPaternoPersonaSolicitudPostulacion());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
		}
		
		if(listaSolicitudPostulacion!=null){
			objLog.info("FIN - listarSolicitudPostulacionsEntity "+listaSolicitudPostulacion.size());
 		}
		
		return listaSolicitudPostulacion;
	}
	
//	public List<SolicitudPostulacionEntity> listarSolicitudPostulacionxTipoSolicitudEntity(SolicitudPostulacionEntity objSolicitudPostulacionEntity){
//		objLog.info("INI - listarSolicitudPostulacionxTipoSolicitudEntity "+objSolicitudPostulacionEntity.getFkIdTipoPostulacion());
//		List<SolicitudPostulacionEntity> listaSolicitudPostulacion = null;
//		try {
//			listaSolicitudPostulacion = solicitudPostulacionRepository.findByFkIdTipoPostulacion(objSolicitudPostulacionEntity.getFkIdTipoPostulacion());
//		} catch (PersistenceException e) {
//			objLog.error("Error en la implementacion de la Persistencia");
//		}
//		
//		if(listaSolicitudPostulacion!=null){
//			objLog.info("FIN - listarSolicitudPostulacionsEntity "+listaSolicitudPostulacion.size());
// 		}
//		
//		return listaSolicitudPostulacion;
//	}
	
	/**
	 * Método que devuelve entidad SolicitudPostulacion por Nombre Lower
	 * @param solicitudCertificado SolicitudPostulacion
	 * @return metEmp SolicitudPostulacion
	 * @throws no lanza excepciones
	 */
	public List<SolicitudPostulacionEntity> listarSolicitudPostulacionxEntreFechasEntity(SolicitudPostulacionEntity objSolicitudPostulacionInicial, SolicitudPostulacionEntity objSolicitudPostulacionFinal){
		objLog.info("INI - buscarSolicitudPostulacionxRazSocEntity "+objSolicitudPostulacionInicial.getFechaSolicitud()+" v/s"+objSolicitudPostulacionFinal.getFechaSolicitud());
		List<SolicitudPostulacionEntity> listaSolicitudPostulacion = null;
		try {
//			listaSolicitudPostulacion = solicitudPostulacionRepository.findByFechaSolicitudBetween(objSolicitudPostulacionInicial.getFechaSolicitud(),objSolicitudPostulacionFinal.getFechaSolicitud());
			listaSolicitudPostulacion = solicitudPostulacionRepository.findByFechaSolicitudBetweenOrderByIdSolicitudPostulacionDesc(objSolicitudPostulacionInicial.getFechaSolicitud(),objSolicitudPostulacionFinal.getFechaSolicitud());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
		}
		
		if(listaSolicitudPostulacion!=null){
			objLog.info("FIN - listarSolicitudPostulacionsEntity "+listaSolicitudPostulacion.size());
 		}
		
		return listaSolicitudPostulacion;
	}
	
	/**
	 * Método que devuelve entidad SolicitudPostulacion por estado
	 * @param solicitudCertificado SolicitudPostulacion
	 * @return lista List<SolicitudPostulacion>
	 * @throws no lanza excepciones
	 */
	public List<SolicitudPostulacionEntity> listarSolicitudPostulacionxEstadoEntity(SolicitudPostulacionEntity objSolicitudPostulacionEntity){
		objLog.info("INI - listarSolicitudPostulacionxEstadoEntity "+objSolicitudPostulacionEntity.getEstadoSolicitudPostulacion());
		List<SolicitudPostulacionEntity> listaSolicitudPostulacion= null;
		try {
			listaSolicitudPostulacion = solicitudPostulacionRepository.findByEstadoSolicitudPostulacion(objSolicitudPostulacionEntity.getEstadoSolicitudPostulacion());
		} catch (PersistenceException e) {
			objLog.error("No se pudo Obtener la lista");
		}
		
		if(listaSolicitudPostulacion!=null){
			objLog.info("FIN - listarSolicitudPostulacionxEstadoEntity "+listaSolicitudPostulacion.size());
 		}
		
		return listaSolicitudPostulacion;
	}
	
}
