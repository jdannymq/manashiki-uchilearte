package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.SolicitudCertificadoDAO;
import com.manashiki.uchilearte.logica.entidad.SolicitudCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.SolicitudCertificadoRepository;

@Repository
public class SolicitudCertificadoDAOImpl implements SolicitudCertificadoDAO{

	private static final Logger objLog = LoggerFactory.getLogger(SolicitudCertificadoDAOImpl.class);
	
	@Autowired
	SolicitudCertificadoRepository solicitudCertificadoRepository;
	
	/**
	 * Crea una Entidad SolicitudCertificado en la base de datos
	 * @param solicitudCertificado SolicitudCertificado 
	 * @return void
	 * @throws no lanza excepciones
	 */
	public SolicitudCertificadoEntity crearSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity){
		objLog.info("INI - crearSolicitudCertificadoEntity");
		SolicitudCertificadoEntity solicitudCertificadoEntity = solicitudCertificadoRepository.save(objSolicitudCertificadoEntity);
		objLog.info("FIN - crearSolicitudCertificadoEntity "+objSolicitudCertificadoEntity.getIdSolicitudCertificado());
		return solicitudCertificadoEntity;
	}
	
	/**
	 * Actualiza una Entidad SolicitudCertificado en la base de datos 
	 * @param solicitudCertificado SolicitudCertificado
	 * @return void
	 * @throws no lanza excepciones
	 */
	public SolicitudCertificadoEntity actualizarSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity){
		objLog.info("INI - actualizarSolicitudCertificadoEntity");
		SolicitudCertificadoEntity solicitudCertificadoEntity = solicitudCertificadoRepository.save(objSolicitudCertificadoEntity);
		objLog.info("FIN - actualizarSolicitudCertificadoEntity "+objSolicitudCertificadoEntity.getIdSolicitudCertificado());
		return solicitudCertificadoEntity;
	}
	
	/**
	 * Método que devuelve entidad SolicitudCertificado por Id
	 * @param solicitudCertificado SolicitudCertificado
	 * @return metEmp SolicitudCertificado
	 * @throws no lanza excepciones
	 */
	public SolicitudCertificadoEntity buscarSolicitudCertificadoxIdEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudCertificadoxIdEntity "+objSolicitudCertificadoEntity.getIdSolicitudCertificado());
		SolicitudCertificadoEntity metEmp= null;
		try {
			metEmp = solicitudCertificadoRepository.findOne(objSolicitudCertificadoEntity.getIdSolicitudCertificado());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudCertificado()!=null){
 				objLog.info("FIN - buscarSolicitudCertificadoxIdEntity "+metEmp.getIdSolicitudCertificado());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve entidad SolicitudCertificado por Rut
	 * @param solicitudCertificado SolicitudCertificado
	 * @return metEmp SolicitudCertificado
	 * @throws no lanza excepciones
	 */
	public SolicitudCertificadoEntity buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudCertificadoxRolUnicoSolicitudCertificadoEntity "+objSolicitudCertificadoEntity.getRutPersonaSolicitudCertificado());
		SolicitudCertificadoEntity metEmp= null;
		try {
			metEmp = solicitudCertificadoRepository.findByRutPersonaSolicitudCertificado(objSolicitudCertificadoEntity.getRutPersonaSolicitudCertificado());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudCertificado()!=null){
 				objLog.info("FIN - buscarSolicitudCertificadoxRolUnicoSolicitudCertificadoEntity "+metEmp.getIdSolicitudCertificado());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve entidad SolicitudCertificado por Nombre Lower
	 * @param solicitudCertificado SolicitudCertificado
	 * @return metEmp SolicitudCertificado
	 * @throws no lanza excepciones
	 */
	public SolicitudCertificadoEntity buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudCertificadoxNombreSolicitudCertificadoLower "+objSolicitudCertificadoEntity.getNombrePersonaSolicitudCertificado());
		SolicitudCertificadoEntity metEmp= null;
		try {
			metEmp = solicitudCertificadoRepository.findByNombrePersonaSolicitudCertificado(objSolicitudCertificadoEntity.getNombrePersonaSolicitudCertificado());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudCertificado()!=null){
 				objLog.info("FIN - buscarSolicitudCertificadoxNombreSolicitudCertificadoLower "+metEmp.getIdSolicitudCertificado());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve listado de todos las SolicitudCertificados almacenadas
	 * @return lista List<SolicitudCertificado>
	 * @throws no lanza excepciones
	 */
	public List<SolicitudCertificadoEntity> listarSolicitudCertificadosEntity() {
		objLog.info("INI - listarSolicitudCertificadosEntity");
		List<SolicitudCertificadoEntity> listaSolicitudCertificado = null;
		try {
//			listaSolicitudCertificado = solicitudCertificadoRepository.findAll();
			listaSolicitudCertificado = solicitudCertificadoRepository.findAllByOrderByIdSolicitudCertificadoDesc();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista de solicitudes");
		}
		
		if(listaSolicitudCertificado!=null){
			objLog.info("FIN - listarSolicitudCertificadosEntity "+listaSolicitudCertificado.size());
 		}
		
		return listaSolicitudCertificado;
	}
	
	/**
	 * Método que devuelve entidad SolicitudCertificado por Nombre Lower
	 * @param solicitudCertificado SolicitudCertificado
	 * @return metEmp SolicitudCertificado
	 * @throws no lanza excepciones
	 */
	public List<SolicitudCertificadoEntity> listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity){
		objLog.info("INI - buscarSolicitudCertificadoxRazSocEntity "+objSolicitudCertificadoEntity.getApellidoPaternoPersonaSolicitudCertificado());
		List<SolicitudCertificadoEntity> listaSolicitudCertificado = null;
		try {
			listaSolicitudCertificado = solicitudCertificadoRepository.findByApellidoPaternoPersonaSolicitudCertificadoContaining(objSolicitudCertificadoEntity.getApellidoPaternoPersonaSolicitudCertificado());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
		}
		
		if(listaSolicitudCertificado!=null){
			objLog.info("FIN - listarSolicitudCertificadosEntity "+listaSolicitudCertificado.size());
 		}
		
		return listaSolicitudCertificado;
	}
	
	public List<SolicitudCertificadoEntity> listarSolicitudCertificadoxEntreFechasEntity(SolicitudCertificadoEntity objSolicitudCertificadoInicial, SolicitudCertificadoEntity objSolicitudCertificadoFinal){
		objLog.info("INI - listarSolicitudCertificadoxEntreFechasEntity "+objSolicitudCertificadoInicial.getFechaSolicitud()+" v/s"+objSolicitudCertificadoFinal.getFechaSolicitud());
		List<SolicitudCertificadoEntity> listaSolicitudCertificado = null;
		try {
			listaSolicitudCertificado = solicitudCertificadoRepository.findByFechaSolicitudBetweenOrderByIdSolicitudCertificadoDesc(objSolicitudCertificadoInicial.getFechaSolicitud(),objSolicitudCertificadoFinal.getFechaSolicitud());
//			listaSolicitudCertificado = solicitudCertificadoRepository.findByFechaSolicitudBetween(objSolicitudCertificadoInicial.getFechaSolicitud(),objSolicitudCertificadoFinal.getFechaSolicitud());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
		}
		
		if(listaSolicitudCertificado!=null){
			objLog.info("FIN - listarSolicitudCertificadosEntity "+listaSolicitudCertificado.size());
 		}
		
		return listaSolicitudCertificado;
	}
	
	/**
	 * Método que devuelve entidad SolicitudCertificado por estado
	 * @param solicitudCertificado SolicitudCertificado
	 * @return lista List<SolicitudCertificado>
	 * @throws no lanza excepciones
	 */
	public List<SolicitudCertificadoEntity> listarSolicitudCertificadoxEstadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity){
		objLog.info("INI - listarSolicitudCertificadoxEstadoEntity "+objSolicitudCertificadoEntity.getEstadoSolicitud());
		List<SolicitudCertificadoEntity> listaSolicitudCertificado= null;
		try {
			listaSolicitudCertificado = solicitudCertificadoRepository.findByEstadoSolicitud(objSolicitudCertificadoEntity.getEstadoSolicitud());
		} catch (PersistenceException e) {
			objLog.error("No se pudo Obtener la lista");
		}
		
		if(listaSolicitudCertificado!=null){
			objLog.info("FIN - listarSolicitudCertificadoxEstadoEntity "+listaSolicitudCertificado.size());
 		}
		
		
		return listaSolicitudCertificado;
	}
	
//	/**
//	 * Método que devuelve lista SolicitudCertificado por el detalle de rol v/s nombre vs razsoc
//	 * @param solicitudCertificado SolicitudCertificado
//	 * @return lista List<SolicitudCertificado>
//	 */
//	public List<SolicitudCertificado> listarSolicitudCertificadosxDetalleEntity(SolicitudCertificado solicitudCertificado){
//		objLog.info("INI - listarSolicitudCertificadosxDetalleEntity");
//		List<SolicitudCertificado> lista= null;
//        Map<String, Object> parametros = new HashMap<String, Object>();
//        parametros.put("rol_unico_identificador_solicitudCertificado", solicitudCertificado.getRol_unico_identificador_solicitudCertificado());
//        parametros.put("nombre_solicitudCertificado_lower", solicitudCertificado.getNombre_solicitudCertificado_lower());
//        parametros.put("razon_social_solicitudCertificado_lower", solicitudCertificado.getRazon_social_solicitudCertificado_lower());
//		try {
//			lista = listaTX(SQL_LISTAR_EMPRESAS_X_DETALLE, parametros);
//		} catch (PersistenceException e) {
//			LogsFile.setLogError("No se pudo obtener la lista");
//		}
//		objLog.info("FIN - listarSolicitudCertificadosxDetalleEntity");
//		return lista;
//	}
	
}
