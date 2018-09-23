package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.TipoCertificadoDAO;
import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.TipoCertificadoRepository;

@Repository
public class TipoCertificadoDAOImpl implements TipoCertificadoDAO{

	private static final Logger objLog = LoggerFactory.getLogger(TipoCertificadoDAOImpl.class);
	
	
	@Autowired
	TipoCertificadoRepository tipoCertificadoRepository;
	
	/**
	 * Crea una Entidad TipoCertificado en la base de datos
	 * @param  aplicacion TipoCertificado
	 * @return void
	 * @exception no lanza excepciones
	 */
	public TipoCertificadoEntity crearTipoCertificadoEntity(TipoCertificadoEntity objTipoCertificadoEntity){
		objLog.info("INI - crearTipoCertificadoEntity ");
		TipoCertificadoEntity regionEntity = tipoCertificadoRepository.save(objTipoCertificadoEntity);
		objLog.info("FIN - crearTipoCertificadoEntity "+objTipoCertificadoEntity.getIdTipoCertificado());
		return regionEntity;
	}
	
	/**
	 * Actualiza un Entidad TipoCertificado en la base de datos 
	 * @param  aplicacion TipoCertificado
	 * @return void
	 * @exception no lanza excepciones
	 */
	public TipoCertificadoEntity actualizarTipoCertificadoEntity(TipoCertificadoEntity objTipoCertificadoEntity){
		objLog.info("INI - actualizarTipoCertificadoEntity "+objTipoCertificadoEntity.getIdTipoCertificado());
		TipoCertificadoEntity regionEntity = tipoCertificadoRepository.save(objTipoCertificadoEntity);
		objLog.info("FIN - actualizarTipoCertificadoEntity "+objTipoCertificadoEntity.getIdTipoCertificado());
		return regionEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad TipoCertificado por el id
	 * @param  aplicacion TipoCertificado
	 * @return apliEmpresa TipoCertificado
	 * @exception no lanza excepciones
	 */
	public TipoCertificadoEntity buscarTipoCertificadoxIdEntity(TipoCertificadoEntity objTipoCertificadoEntity) throws PersistenceImplException{
		objLog.info("INI - buscarTipoCertificadoxIdEntity "+objTipoCertificadoEntity.getIdTipoCertificado());
		TipoCertificadoEntity regionEntity = null;
 		try {
 			regionEntity = tipoCertificadoRepository.findOne(objTipoCertificadoEntity.getIdTipoCertificado());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(regionEntity!=null){
 			if(regionEntity.getIdTipoCertificado()!=null){
 				objLog.info("FIN - buscarTipoCertificadoxIdEntity "+regionEntity.getIdTipoCertificado());
 			}
 		}
 		
 		
		return regionEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las TipoCertificados
	 * @return lista List<TipoCertificado>
	 * @exception no lanza excepciones
	 */
	public List<TipoCertificadoEntity> listarTipoCertificadoesEntity(){
		objLog.info("INI - listarTipoCertificadoesEntity");
		List<TipoCertificadoEntity> lista = null;
		try {
			lista = tipoCertificadoRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarTipoCertificadosEntity "+lista.size());
 		}
		
		return lista;
	}	
	
}
