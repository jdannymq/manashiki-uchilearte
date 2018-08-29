package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.TipoSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.TipoSolicitudNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.TipoSolicitudModelMapper;
import com.manashiki.uchilearte.negocio.model.TipoSolicitudModel;
import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;
//import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;
//
//import vijnana.cache.component.ICacheComponent;

import vijnana.cache.component.ICacheComponent;

@Component
public class TipoSolicitudNegocio implements TipoSolicitudNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(TipoSolicitudNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public TipoSolicitudModel crearTipoSolicitudModel(TipoSolicitudModel tipoSolicitudModel) {
		objLog.info("INI - crearTipoSolicitudModel");
		TipoSolicitudEntity tipoSolicitud = new TipoSolicitudEntity();
		tipoSolicitud = TipoSolicitudModelMapper.TipoSolicitudModelToTipoSolicitudEntity(tipoSolicitudModel);

		tipoSolicitud = factoryPersistenciaDAO.getTipoSolicitudDAO().crearTipoSolicitudEntity(tipoSolicitud);
		
		tipoSolicitudModel = TipoSolicitudModelMapper.TipoSolicitudEntityToTipoSolicitudModel(tipoSolicitud);
		objLog.info("FIN - crearTipoSolicitudModel "+tipoSolicitudModel.getIdTipoSolicitud());
		return tipoSolicitudModel;

	}

	public TipoSolicitudModel actualizarTipoSolicitudModel(TipoSolicitudModel tipoSolicitudModel) {
		objLog.info("INI - actualizarTipoSolicitudModel "+tipoSolicitudModel.getIdTipoSolicitud());
		TipoSolicitudEntity tipoSolicitud = new TipoSolicitudEntity();
		tipoSolicitud = TipoSolicitudModelMapper.TipoSolicitudModelToTipoSolicitudEntity(tipoSolicitudModel);

		tipoSolicitud = factoryPersistenciaDAO.getTipoSolicitudDAO().actualizarTipoSolicitudEntity(tipoSolicitud);
		
		tipoSolicitudModel = TipoSolicitudModelMapper.TipoSolicitudEntityToTipoSolicitudModel(tipoSolicitud);
		objLog.info("FIN - actualizarTipoSolicitudModel "+tipoSolicitudModel.getIdTipoSolicitud());
		return tipoSolicitudModel;

	}

	public TipoSolicitudModel buscarTipoSolicitudxIdModel(TipoSolicitudModel tipoSolicitudModel)throws NegocioImplException{
		objLog.info("INI - buscarTipoSolicitudxIdModel "+tipoSolicitudModel.getIdTipoSolicitud());
		TipoSolicitudEntity tipoSolicitud = new TipoSolicitudEntity();
		tipoSolicitud = TipoSolicitudModelMapper.TipoSolicitudModelToTipoSolicitudEntity(tipoSolicitudModel);

		try {
			tipoSolicitud=factoryPersistenciaDAO.getTipoSolicitudDAO().buscarTipoSolicitudxIdEntity(tipoSolicitud);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		tipoSolicitudModel = TipoSolicitudModelMapper.TipoSolicitudEntityToTipoSolicitudModel(tipoSolicitud);
		
		objLog.info("FIN - buscarTipoSolicitudxIdModel "+tipoSolicitudModel.getIdTipoSolicitud());
		return tipoSolicitudModel;
	}

	public List<TipoSolicitudModel> listarTipoSolicitudesModel() {
		objLog.info("INI - listarTipoSolicitudesModel");
		List<TipoSolicitudModel> listaTipoSolicitudModel=new ArrayList<TipoSolicitudModel>();
//		List<TipoSolicitudEntity> listaTipoSolicitudes = new ArrayList<TipoSolicitudEntity>();
//
//		listaTipoSolicitudes=factoryPersistenciaDAO.getTipoSolicitudDAO().listarTipoSolicitudesEntity();
//
//		listaTipoSolicitudModel = TipoSolicitudModelMapper.ListTipoSolicitudEntityToListTipoSolicitudModel(listaTipoSolicitudes);
		
		listaTipoSolicitudModel = obtenerCacheListaTipoSolicitud();
		
		objLog.info("FIN - listarTipoSolicitudesModel "+listaTipoSolicitudModel.size());
		
		return listaTipoSolicitudModel;
	}
	
	ICacheComponent objCacheComponent = null;
	
	private List<TipoSolicitudModel> obtenerCacheListaTipoSolicitud(){
		List<TipoSolicitudModel> listaTipoSolicitudModel=new ArrayList<TipoSolicitudModel>();
		List<TipoSolicitudEntity> listaTipoSolicitudEntity=new ArrayList<TipoSolicitudEntity>();
//		TipoSolicitudModel tipoSolicitudModel = new TipoSolicitudModel();
		try{
			if(objCacheComponent==null){
				objCacheComponent = CacheLocalRepositorio.crearRepositorioCacheLocal(); //Colocar el nombre de cache local del ws
			}
		
		}catch(Exception e){
			listaTipoSolicitudModel = null;
			objLog.error("Cae al obtener el repositorio de Cache");
		}
		
		try{
			listaTipoSolicitudModel = CacheLocalRepositorio.obtenerCacheListaTipoSolicitud(objCacheComponent);

		}catch(Exception e){
			
			listaTipoSolicitudModel=null;
		
		}
		
		try{
			if(listaTipoSolicitudModel==null || listaTipoSolicitudModel.size()==0){
				
				listaTipoSolicitudEntity = factoryPersistenciaDAO.getTipoSolicitudDAO().listarTipoSolicitudesEntity();
				
				listaTipoSolicitudModel = CacheLocalRepositorio.generarCacheListaTipoSolicitud(objCacheComponent, listaTipoSolicitudEntity);
				
//				if(listaTipoSolicitudEntity!=null && listaTipoSolicitudEntity.size()>0){
//					listaTipoSolicitudModel = new ArrayList<TipoSolicitudModel>();
//					for(TipoSolicitudEntity puEnt:listaTipoSolicitudEntity){
//						tipoSolicitudModel = new TipoSolicitudModel();
//						tipoSolicitudModel = TipoSolicitudModelMapper.TipoSolicitudEntityToTipoSolicitudModel(puEnt);
//						listaTipoSolicitudModel.add(tipoSolicitudModel);
//					}
//					
//				
//				}
			
			}
		
		}
		catch(Exception e){
			objLog.error("Error en la implementacion del Servicio "+e.getMessage());
		}
		return listaTipoSolicitudModel;
	}

}
