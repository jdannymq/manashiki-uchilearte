package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.RegionDAO;
import com.manashiki.uchilearte.logica.entidad.RegionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.RegionRepository;

@Repository
public class RegionDAOImpl implements RegionDAO{

	private static final Logger objLog = LoggerFactory.getLogger(RegionDAOImpl.class);
	
//	//Traerlas desde un Parametro o desde un Xml
//	private static final String SQL_ALL_REGION = "SELECT region FROM Region region order by region.id_region";
//	private static final String SQL_BUSCAR_REGION_X_ID = "SELECT region FROM Region region WHERE region.id_region=:id_region";
	
	@Autowired
	RegionRepository regionRepository;
	
	/**
	 * Crea una Entidad Region en la base de datos
	 * @param  aplicacion Region
	 * @return void
	 * @exception no lanza excepciones
	 */
	public RegionEntity crearRegionEntity(RegionEntity objRegionEntity){
		objLog.info("INI - crearRegionEntity ");
		RegionEntity regionEntity = regionRepository.save(objRegionEntity);
		objLog.info("FIN - crearRegionEntity "+objRegionEntity.getIdRegion());
		return regionEntity;
	}
	
	/**
	 * Actualiza un Entidad Region en la base de datos 
	 * @param  aplicacion Region
	 * @return void
	 * @exception no lanza excepciones
	 */
	public RegionEntity actualizarRegionEntity(RegionEntity objRegionEntity){
		objLog.info("INI - actualizarRegionEntity "+objRegionEntity.getIdRegion());
		RegionEntity regionEntity = regionRepository.save(objRegionEntity);
		objLog.info("FIN - actualizarRegionEntity "+objRegionEntity.getIdRegion());
		return regionEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad Region por el id
	 * @param  aplicacion Region
	 * @return apliEmpresa Region
	 * @exception no lanza excepciones
	 */
	public RegionEntity buscarRegionxIdEntity(RegionEntity objRegionEntity) throws PersistenceImplException{
		objLog.info("INI - buscarRegionxIdEntity "+objRegionEntity.getIdRegion());
		RegionEntity regionEntity = null;
 		try {
 			regionEntity = regionRepository.findOne(objRegionEntity.getIdRegion());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(regionEntity!=null){
 			if(regionEntity.getIdRegion()!=null){
 				objLog.info("FIN - buscarRegionxIdEntity "+regionEntity.getIdRegion());
 			}
 		}
 		
 		
		return regionEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las Regions
	 * @return lista List<Region>
	 * @exception no lanza excepciones
	 */
	public List<RegionEntity> listarRegionesEntity(){
		objLog.info("INI - listarRegionesEntity");
		List<RegionEntity> lista = null;
		try {
			lista = regionRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarRegionesEntity "+lista.size());
 		}
		
		return lista;
	}	
	
}
