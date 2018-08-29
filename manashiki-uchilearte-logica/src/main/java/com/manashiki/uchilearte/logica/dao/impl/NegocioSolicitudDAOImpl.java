package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.NegocioSolicitudDAO;
import com.manashiki.uchilearte.logica.entidad.NegocioSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.NegocioSolicitudRepository;

@Repository
public class NegocioSolicitudDAOImpl implements NegocioSolicitudDAO{

	private static final Logger objLog = LoggerFactory.getLogger(NegocioSolicitudDAOImpl.class);
	
	
	@Autowired
	NegocioSolicitudRepository regionRepository;
	
	/**
	 * Crea una Entidad NegocioSolicitud en la base de datos
	 * @param  aplicacion NegocioSolicitud
	 * @return void
	 * @exception no lanza excepciones
	 */
	public NegocioSolicitudEntity crearNegocioSolicitudEntity(NegocioSolicitudEntity objNegocioSolicitudEntity){
		objLog.info("INI - crearNegocioSolicitudEntity ");
		objNegocioSolicitudEntity = regionRepository.save(objNegocioSolicitudEntity);
		objLog.info("FIN - crearNegocioSolicitudEntity "+objNegocioSolicitudEntity.getIdNegocioSolicitudEntity());
		return objNegocioSolicitudEntity;
	}
	
	/**
	 * Actualiza un Entidad NegocioSolicitud en la base de datos 
	 * @param  aplicacion NegocioSolicitud
	 * @return void
	 * @exception no lanza excepciones
	 */
	public NegocioSolicitudEntity actualizarNegocioSolicitudEntity(NegocioSolicitudEntity objNegocioSolicitudEntity){
		objLog.info("INI - actualizarNegocioSolicitudEntity "+objNegocioSolicitudEntity.getIdNegocioSolicitudEntity());
		objNegocioSolicitudEntity = regionRepository.save(objNegocioSolicitudEntity);
		objLog.info("FIN - actualizarNegocioSolicitudEntity "+objNegocioSolicitudEntity.getIdNegocioSolicitudEntity());
		return objNegocioSolicitudEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad NegocioSolicitud por el id
	 * @param  aplicacion NegocioSolicitud
	 * @return apliEmpresa NegocioSolicitud
	 * @exception no lanza excepciones
	 */
	public NegocioSolicitudEntity buscarNegocioSolicitudxIdEntity(NegocioSolicitudEntity objNegocioSolicitudEntity) throws PersistenceImplException{
		objLog.info("INI - buscarNegocioSolicitudxIdEntity "+objNegocioSolicitudEntity.getIdNegocioSolicitudEntity());
		NegocioSolicitudEntity negocioSolicitudEntity = null;
 		try {
 			negocioSolicitudEntity = regionRepository.findOne(objNegocioSolicitudEntity.getIdNegocioSolicitudEntity());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(negocioSolicitudEntity!=null){
 			if(negocioSolicitudEntity.getIdNegocioSolicitudEntity()!=null){
 				objLog.info("FIN - buscarNegocioSolicitudxIdEntity "+negocioSolicitudEntity.getIdNegocioSolicitudEntity());
 			}
 		}
 		
 		
		return negocioSolicitudEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las NegocioSolicituds
	 * @return lista List<NegocioSolicitud>
	 * @exception no lanza excepciones
	 */
	public List<NegocioSolicitudEntity> listarNegocioSolicitudEntity(){
		objLog.info("INI - listarNegocioSolicitudesEntity");
		List<NegocioSolicitudEntity> lista = null;
		try {
			lista = regionRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarNegocioSolicitudsEntity "+lista.size());
 		}
		
		return lista;
	}	
	
}
