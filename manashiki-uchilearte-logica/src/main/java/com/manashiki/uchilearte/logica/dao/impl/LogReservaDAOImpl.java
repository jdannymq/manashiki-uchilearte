package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.LogReservaDAO;
import com.manashiki.uchilearte.logica.entidad.LogReservaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.LogReservaRepository;

@Repository
public class LogReservaDAOImpl implements LogReservaDAO{

	private static final Logger objLog = LoggerFactory.getLogger(LogReservaDAOImpl.class);
	
	
	@Autowired
	LogReservaRepository regionRepository;
	
	/**
	 * Crea una Entidad LogReserva en la base de datos
	 * @param  aplicacion LogReserva
	 * @return void
	 * @exception no lanza excepciones
	 */
	public LogReservaEntity crearLogReservaEntity(LogReservaEntity objLogReservaEntity){
		objLog.info("INI - crearLogReservaEntity ");
		LogReservaEntity logReservaEntity = regionRepository.save(objLogReservaEntity);
		objLog.info("FIN - crearLogReservaEntity "+objLogReservaEntity.getIdLogReservaEntity());
		return logReservaEntity;
	}
	
	/**
	 * Actualiza un Entidad LogReserva en la base de datos 
	 * @param  aplicacion LogReserva
	 * @return void
	 * @exception no lanza excepciones
	 */
	public LogReservaEntity actualizarLogReservaEntity(LogReservaEntity objLogReservaEntity){
		objLog.info("INI - actualizarLogReservaEntity "+objLogReservaEntity.getIdLogReservaEntity());
		LogReservaEntity logReservaEntity = regionRepository.save(objLogReservaEntity);
		objLog.info("FIN - actualizarLogReservaEntity "+objLogReservaEntity.getIdLogReservaEntity());
		return logReservaEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad LogReserva por el id
	 * @param  aplicacion LogReserva
	 * @return apliEmpresa LogReserva
	 * @exception no lanza excepciones
	 */
	public LogReservaEntity buscarLogReservaxIdEntity(LogReservaEntity objLogReservaEntity) throws PersistenceImplException{
		objLog.info("INI - buscarLogReservaxIdEntity "+objLogReservaEntity.getIdLogReservaEntity());
		LogReservaEntity logReservaEntity = null;
 		try {
 			logReservaEntity = regionRepository.findOne(objLogReservaEntity.getIdLogReservaEntity());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(logReservaEntity!=null){
 			if(logReservaEntity.getIdLogReservaEntity()!=null){
 				objLog.info("FIN - buscarLogReservaxIdEntity "+logReservaEntity.getIdLogReservaEntity());
 			}
 		}
 		
 		
		return logReservaEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las LogReservas
	 * @return lista List<LogReserva>
	 * @exception no lanza excepciones
	 */
	public List<LogReservaEntity> listarLogReservaEntity(){
		objLog.info("INI - listarLogReservaEntity");
		List<LogReservaEntity> lista = null;
		try {
			lista = regionRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarLogReservaEntity "+lista.size());
 		}
		
		return lista;
	}	
	
}
