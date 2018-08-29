package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.FinalidadCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.FinalidadCertificadoNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.FinalidadCertificadoModelMapper;
import com.manashiki.uchilearte.negocio.model.FinalidadCertificadoModel;
import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;

import vijnana.cache.component.ICacheComponent;
//import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;

//import vijnana.cache.component.ICacheComponent;

@Component
public class FinalidadCertificadoNegocio implements FinalidadCertificadoNegocioDAO{

	private static final Logger objLog = LoggerFactory.getLogger(FinalidadCertificadoNegocio.class);
	
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	ICacheComponent objCacheComponent = null;
	
	/**
	 * Crea una Entidad FinalidadCertificado en la base de datos
	 * @param  finalidadCertificado FinalidadCertificado
	 * @return void
	 * @throws no lanza excepciones
	 */
	public FinalidadCertificadoModel crearFinalidadCertificadoModel(FinalidadCertificadoModel finalidadCertificadoModel){
		objLog.info("INI - crearFinalidadCertificadoModel");
		FinalidadCertificadoEntity finalidadCertificado= new FinalidadCertificadoEntity();
		finalidadCertificado = FinalidadCertificadoModelMapper.FinalidadCertificadoModelToFinalidadCertificadoEntity(finalidadCertificadoModel);

		finalidadCertificado = factoryPersistenciaDAO.getFinalidadCertificadoDAO().crearFinalidadCertificadoEntity(finalidadCertificado);
		
		finalidadCertificadoModel = FinalidadCertificadoModelMapper.FinalidadCertificadoEntityToFinalidadCertificadoModel(finalidadCertificado);
		
		objLog.info("FIN - crearFinalidadCertificadoModel "+finalidadCertificadoModel.getIdFinalidadCertificado());
		return finalidadCertificadoModel;
	}

	public FinalidadCertificadoModel actualizarFinalidadCertificadoModel(FinalidadCertificadoModel finalidadCertificadoModel) {
		objLog.info("INI - actualizarFinalidadCertificadoModel "+finalidadCertificadoModel.getIdFinalidadCertificado());
		FinalidadCertificadoEntity finalidadCertificado= new FinalidadCertificadoEntity();
		finalidadCertificado = FinalidadCertificadoModelMapper.FinalidadCertificadoModelToFinalidadCertificadoEntity(finalidadCertificadoModel);

		finalidadCertificado = factoryPersistenciaDAO.getFinalidadCertificadoDAO().actualizarFinalidadCertificadoEntity(finalidadCertificado);
		
		finalidadCertificadoModel = FinalidadCertificadoModelMapper.FinalidadCertificadoEntityToFinalidadCertificadoModel(finalidadCertificado);
		objLog.info("FIN - actualizarFinalidadCertificadoModel "+finalidadCertificadoModel.getIdFinalidadCertificado());
		return finalidadCertificadoModel;
		
	}

	public FinalidadCertificadoModel buscarFinalidadCertificadoxIdModel(FinalidadCertificadoModel finalidadCertificadoModel) throws NegocioImplException{
		objLog.info("INI - buscarFinalidadCertificadoxIdModel "+finalidadCertificadoModel.getIdFinalidadCertificado());
		FinalidadCertificadoEntity finalidadCertificado = new FinalidadCertificadoEntity();
		finalidadCertificado = FinalidadCertificadoModelMapper.FinalidadCertificadoModelToFinalidadCertificadoEntity(finalidadCertificadoModel);

		try {
			finalidadCertificado=factoryPersistenciaDAO.getFinalidadCertificadoDAO().buscarFinalidadCertificadoxIdEntity(finalidadCertificado);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		finalidadCertificadoModel = FinalidadCertificadoModelMapper.FinalidadCertificadoEntityToFinalidadCertificadoModel(finalidadCertificado);
		
		objLog.info("FIN - buscarFinalidadCertificadoxIdModel "+finalidadCertificadoModel.getIdFinalidadCertificado());
		return finalidadCertificadoModel;
	}

	public List<FinalidadCertificadoModel> listarFinalidadCertificadosModel() {
		objLog.info("INI - listarFinalidadCertificadosModel");
		List<FinalidadCertificadoModel> listaFinalidadCertificadoModel=new ArrayList<FinalidadCertificadoModel>();
//		List<FinalidadCertificadoEntity> listaFinalidadCertificadoes = new ArrayList<FinalidadCertificadoEntity>();
//		
//		listaFinalidadCertificadoes=factoryPersistenciaDAO.getFinalidadCertificadoDAO().listarFinalidadCertificadoesEntity();
		
//		listaFinalidadCertificadoModel = FinalidadCertificadoModelMapper.ListFinalidadCertificadoEntityToListFinalidadCertificadoModel(listaFinalidadCertificadoes);
		listaFinalidadCertificadoModel = obtenerCacheListaFinalidadCertificado();
		
		objLog.info("FIN - listarFinalidadCertificadosModel "+listaFinalidadCertificadoModel.size());
		
		return listaFinalidadCertificadoModel;
	}
	

	
	private List<FinalidadCertificadoModel> obtenerCacheListaFinalidadCertificado(){
		List<FinalidadCertificadoModel> listaFinalidadCertificadoModel=new ArrayList<FinalidadCertificadoModel>();
		List<FinalidadCertificadoEntity> listaFinalidadCertificadoEntity=new ArrayList<FinalidadCertificadoEntity>();
//		FinalidadCertificadoModel finalidadCertificadoModel = new FinalidadCertificadoModel();
		try{
			if(objCacheComponent==null){
				objCacheComponent = CacheLocalRepositorio.crearRepositorioCacheLocal(); //Colocar el nombre de cache local del ws
			}
		
		}catch(Exception e){
			listaFinalidadCertificadoModel = null;
			objLog.error("Cae al obtener el repositorio de Cache");
		}
		
		try{
			listaFinalidadCertificadoModel = CacheLocalRepositorio.obtenerCacheListaFinalidadCertificado(objCacheComponent);

		}catch(Exception e){
			
			listaFinalidadCertificadoModel=null;
		
		}
		
		try{
			if(listaFinalidadCertificadoModel==null || listaFinalidadCertificadoModel.size()==0){
				
				listaFinalidadCertificadoEntity = factoryPersistenciaDAO.getFinalidadCertificadoDAO().listarFinalidadCertificadoesEntity();
				
				if(listaFinalidadCertificadoEntity!=null && listaFinalidadCertificadoEntity.size()>0){
					
					listaFinalidadCertificadoModel = CacheLocalRepositorio.generarCacheListaFinalidadCertificado(objCacheComponent, listaFinalidadCertificadoEntity);
					
//					listaFinalidadCertificadoModel = new ArrayList<FinalidadCertificadoModel>();
//					for(FinalidadCertificadoEntity puEnt:listaFinalidadCertificadoEntity){
//						finalidadCertificadoModel = new FinalidadCertificadoModel();
//						finalidadCertificadoModel = FinalidadCertificadoModelMapper.FinalidadCertificadoEntityToFinalidadCertificadoModel(puEnt);
//						listaFinalidadCertificadoModel.add(finalidadCertificadoModel);
//					}
									
				}
			
			}
		
		}
		catch(Exception e){
			objLog.error("Error en la implementacion del Servicio "+e.getMessage());
		}
		return listaFinalidadCertificadoModel;
	}

}
