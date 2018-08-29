//package com.manashiki.uchilearte.logica.dao.impl;
//
//import java.util.List;
//
//import javax.persistence.PersistenceException;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.manashiki.uchilearte.logica.dao.TipoPostulacionDAO;
//import com.manashiki.uchilearte.logica.entidad.TipoPostulacionEntity;
//import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
//import com.manashiki.uchilearte.logica.repository.TipoPostulacionRepository;
//
//@Repository
//public class TipoPostulacionDAOImpl implements TipoPostulacionDAO{
//
//	private static final Logger objLog = LoggerFactory.getLogger(TipoPostulacionDAOImpl.class);
//	
//	
//	@Autowired
//	TipoPostulacionRepository regionRepository;
//	
//	/**
//	 * Crea una Entidad TipoPostulacion en la base de datos
//	 * @param  aplicacion TipoPostulacion
//	 * @return void
//	 * @exception no lanza excepciones
//	 */
//	public TipoPostulacionEntity crearTipoPostulacionEntity(TipoPostulacionEntity objTipoPostulacionEntity){
//		objLog.info("INI - crearTipoPostulacionEntity ");
//		TipoPostulacionEntity regionEntity = regionRepository.save(objTipoPostulacionEntity);
//		objLog.info("FIN - crearTipoPostulacionEntity "+objTipoPostulacionEntity.getIdTipoPostulacion());
//		return regionEntity;
//	}
//	
//	/**
//	 * Actualiza un Entidad TipoPostulacion en la base de datos 
//	 * @param  aplicacion TipoPostulacion
//	 * @return void
//	 * @exception no lanza excepciones
//	 */
//	public TipoPostulacionEntity actualizarTipoPostulacionEntity(TipoPostulacionEntity objTipoPostulacionEntity){
//		objLog.info("INI - actualizarTipoPostulacionEntity "+objTipoPostulacionEntity.getIdTipoPostulacion());
//		TipoPostulacionEntity regionEntity = regionRepository.save(objTipoPostulacionEntity);
//		objLog.info("FIN - actualizarTipoPostulacionEntity "+objTipoPostulacionEntity.getIdTipoPostulacion());
//		return regionEntity;
//	
//	}
//	
//	/**
//	 * Método que devuelve Entidad TipoPostulacion por el id
//	 * @param  aplicacion TipoPostulacion
//	 * @return apliEmpresa TipoPostulacion
//	 * @exception no lanza excepciones
//	 */
//	public TipoPostulacionEntity buscarTipoPostulacionxIdEntity(TipoPostulacionEntity objTipoPostulacionEntity) throws PersistenceImplException{
//		objLog.info("INI - buscarTipoPostulacionxIdEntity "+objTipoPostulacionEntity.getIdTipoPostulacion());
//		TipoPostulacionEntity regionEntity = null;
// 		try {
// 			regionEntity = regionRepository.findOne(objTipoPostulacionEntity.getIdTipoPostulacion());
//		} catch (PersistenceException e) {
//			objLog.error("Error en la implementacion de la Persistencia");
//			throw new PersistenceImplException(e);
//		}
// 		
// 		if(regionEntity!=null){
// 			if(regionEntity.getIdTipoPostulacion()!=null){
// 				objLog.info("FIN - buscarTipoPostulacionxIdEntity "+regionEntity.getIdTipoPostulacion());
// 			}
// 		}
// 		
// 		
//		return regionEntity;
//	}
//	
//	/**
//	 * Método que devuelve listado de Todas las TipoPostulacions
//	 * @return lista List<TipoPostulacion>
//	 * @exception no lanza excepciones
//	 */
//	public List<TipoPostulacionEntity> listarTipoPostulacionesEntity(){
//		objLog.info("INI - listarTipoPostulacionesEntity");
//		List<TipoPostulacionEntity> lista = null;
//		try {
//			lista = regionRepository.findAll();
//		} catch (PersistenceException e) {
//			objLog.error("No se pudo obtener la lista "+lista.size());
//		}
//		
//		if(lista!=null){
// 				objLog.info("FIN - listarTipoPostulacionesEntity "+lista.size());
// 		}
//		
//		return lista;
//	}	
//	
//}
