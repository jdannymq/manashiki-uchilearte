package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.ComunaDAO;
import com.manashiki.uchilearte.logica.entidad.ComunaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.ComunaRepository;

@Repository
public class ComunaDAOImpl implements ComunaDAO{

	private static final Logger objLog = LoggerFactory.getLogger(ComunaDAOImpl.class);
	
	@Autowired
	ComunaRepository comunaRepository;
	
	/**
	 * Crea una Entidad Comuna en la base de datos
	 * @param  aplicacion Comuna
	 * @return void
	 * @throws no lanza excepciones
	 */
	public ComunaEntity crearComunaEntity(ComunaEntity objComunaEntity){
		objLog.info("INI - crearComunaEntity");
		ComunaEntity comunaEntity = comunaRepository.save(objComunaEntity);
		objLog.info("FIN - crearComunaEntity "+objComunaEntity.getIdComuna());
		return comunaEntity;
	}
	
	/**
	 * Actualiza un Entidad Comuna en la base de datos 
	 * @param  aplicacion Comuna
	 * @return void
	 * @throws no lanza excepciones
	 */
	public ComunaEntity actualizarComunaEntity(ComunaEntity objComunaEntity){
		objLog.info("INI - actualizarComunaEntity "+objComunaEntity.getIdComuna());
		ComunaEntity comunaEntity = comunaRepository.save(objComunaEntity);
		objLog.info("FIN - actualizarComunaEntity "+objComunaEntity.getIdComuna());
		return comunaEntity;
	}
	
	/**
	 * Método que devuelve Entidad Comuna por el id
	 * @param  aplicacion Comuna
	 * @return apliEmpresa Comuna
	 * @throws no lanza excepciones
	 */
	public ComunaEntity buscarComunaxIdEntity(ComunaEntity objComunaEntity) throws PersistenceImplException{
		objLog.info("INI - buscarComunaxIdEntity "+objComunaEntity.getIdComuna());
		ComunaEntity metCom = null;
 		try {
 			metCom = comunaRepository.findOne(objComunaEntity.getIdComuna());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia "+e.getMessage());
			throw new PersistenceImplException(e);
		}
 		
 		if(metCom!=null){
 			if(metCom.getIdComuna()!=null){
 				objLog.info("FIN - buscarComunaxIdEntity "+objComunaEntity.getIdComuna());
 			}
 		}
 		
		return metCom;
	}
	
	/**
	 * Método que devuelve listado de Todas las Comunas
	 * @return lista List<Comuna>
	 * @throws no lanza excepciones
	 */
	public List<ComunaEntity> listarComunasEntity(){
		objLog.info("INI - listarComunasEntity");
		List<ComunaEntity> lista = null;
		try {
			lista = comunaRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		
		if(lista!=null){
			objLog.info("FIN - listarComunasEntity "+lista.size());
 		}
		
		return lista;
	}	
	
	
	
	/**
	 * Método que devuelve listado de Todas las Comunas
	 * @return lista List<Comuna>
	 * @throws no lanza excepciones
	 */
	public List<ComunaEntity> listarComunasEntityxRegion(ComunaEntity objComunaEntity){
		objLog.info("INI - listarComunasEntityxRegion "+objComunaEntity.getFkIdRegion().getIdRegion());
		List<ComunaEntity> lista = null;
		
		try {
			lista = comunaRepository.findByFkIdRegion(objComunaEntity.getFkIdRegion());
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		
		if(lista!=null){
			objLog.info("FIN - listarComunasEntityxRegion "+lista.size());
 		}
		
		return lista;
	}
	
}
