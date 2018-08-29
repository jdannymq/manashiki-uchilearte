package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.RegionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.RegionNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.RegionModelMapper;
import com.manashiki.uchilearte.negocio.model.RegionModel;
import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;
//import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;
//
//import vijnana.cache.component.ICacheComponent;

import vijnana.cache.component.ICacheComponent;

@Component
public class RegionNegocio implements RegionNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(RegionNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public RegionModel crearRegionModel(RegionModel regionModel) {
		objLog.info("INI - crearRegionModel");
		RegionEntity region = new RegionEntity();
		region = RegionModelMapper.RegionModelToRegionEntity(regionModel);

		region = factoryPersistenciaDAO.getRegionDAO().crearRegionEntity(region);
		
		regionModel = RegionModelMapper.RegionEntityToRegionModel(region);
		objLog.info("FIN - crearRegionModel "+regionModel.getIdRegion());
		return regionModel;

	}

	public RegionModel actualizarRegionModel(RegionModel regionModel) {
		objLog.info("INI - actualizarRegionModel "+regionModel.getIdRegion());
		RegionEntity region = new RegionEntity();
		region = RegionModelMapper.RegionModelToRegionEntity(regionModel);

		region = factoryPersistenciaDAO.getRegionDAO().actualizarRegionEntity(region);
		
		regionModel = RegionModelMapper.RegionEntityToRegionModel(region);
		objLog.info("FIN - actualizarRegionModel "+regionModel.getIdRegion());
		return regionModel;

	}

	public RegionModel buscarRegionxIdModel(RegionModel regionModel)throws NegocioImplException{
		objLog.info("INI - buscarRegionxIdModel "+regionModel.getIdRegion());
		RegionEntity region = new RegionEntity();
		region = RegionModelMapper.RegionModelToRegionEntity(regionModel);

		try {
			region=factoryPersistenciaDAO.getRegionDAO().buscarRegionxIdEntity(region);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		regionModel = RegionModelMapper.RegionEntityToRegionModel(region);
		
		objLog.info("FIN - buscarRegionxIdModel "+regionModel.getIdRegion());
		return regionModel;
	}

	public List<RegionModel> listarRegionesModel() {
		objLog.info("INI - listarRegionesModel");
		List<RegionModel> listaRegionModel=new ArrayList<RegionModel>();
		List<RegionEntity> listaRegiones = new ArrayList<RegionEntity>();

		listaRegiones=factoryPersistenciaDAO.getRegionDAO().listarRegionesEntity();

		listaRegionModel = RegionModelMapper.ListRegionEntityToListRegionModel(listaRegiones);
		
		listaRegionModel = obtenerCacheListaRegion();
		
		objLog.info("FIN - listarRegionesModel "+listaRegionModel.size());
		return listaRegionModel;
	}
	
	ICacheComponent objCacheComponent = null;
	
	private List<RegionModel> obtenerCacheListaRegion(){
		List<RegionModel> listaRegionModel=new ArrayList<RegionModel>();
		List<RegionEntity> listaRegionEntity=new ArrayList<RegionEntity>();
//		RegionModel regionModel = new RegionModel();
		try{
			if(objCacheComponent==null){
				objCacheComponent = CacheLocalRepositorio.crearRepositorioCacheLocal(); //Colocar el nombre de cache local del ws
			}
		
		}catch(Exception e){
			listaRegionModel = null;
			objLog.error("Cae al obtener el repositorio de Cache");
		}
		
		try{
			listaRegionModel = CacheLocalRepositorio.obtenerCacheListaRegion(objCacheComponent);

		}catch(Exception e){
			
			listaRegionModel=null;
		
		}
		
		try{
			if(listaRegionModel==null || listaRegionModel.size()==0){
				
				listaRegionEntity = factoryPersistenciaDAO.getRegionDAO().listarRegionesEntity();
				
				listaRegionModel = CacheLocalRepositorio.generarCacheListaRegion(objCacheComponent, listaRegionEntity);
				
//				if(listaRegionEntity!=null && listaRegionEntity.size()>0){
//					
//
//					listaRegionModel = new ArrayList<RegionModel>();
//					for(RegionEntity regEnt:listaRegionEntity){
//						regionModel = new RegionModel();
//						regionModel = RegionModelMapper.RegionEntityToRegionModel(regEnt);
//						listaRegionModel.add(regionModel);
//					}
//					
//					
//				}
			}
		}
		catch(Exception e){
			objLog.error("Error en la implementacion del Servicio "+e.getMessage());
		}
		return listaRegionModel;
	}

}
