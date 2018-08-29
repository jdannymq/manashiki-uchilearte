package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.TipoCertificadoNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.TipoCertificadoModelMapper;
import com.manashiki.uchilearte.negocio.model.TipoCertificadoModel;
import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;

import vijnana.cache.component.ICacheComponent;

@Component
public class TipoCertificadoNegocio implements TipoCertificadoNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(TipoCertificadoNegocio.class);
	
	ICacheComponent objCacheComponent = null;
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public TipoCertificadoModel crearTipoCertificadoModel(TipoCertificadoModel tipoCertificadoModel) {
		objLog.info("INI - crearTipoCertificadoModel");
		TipoCertificadoEntity tipoCertificado = new TipoCertificadoEntity();
		tipoCertificado = TipoCertificadoModelMapper.TipoCertificadoModelToTipoCertificadoEntity(tipoCertificadoModel);

		tipoCertificado = factoryPersistenciaDAO.getTipoCertificadoDAO().crearTipoCertificadoEntity(tipoCertificado);
		
		tipoCertificadoModel = TipoCertificadoModelMapper.TipoCertificadoEntityToTipoCertificadoModel(tipoCertificado);
		objLog.info("FIN - crearTipoCertificadoModel "+tipoCertificadoModel.getIdTipoCertificado());
		return tipoCertificadoModel;

	}

	public TipoCertificadoModel actualizarTipoCertificadoModel(TipoCertificadoModel tipoCertificadoModel) {
		objLog.info("INI - actualizarTipoCertificadoModel "+tipoCertificadoModel.getIdTipoCertificado());
		TipoCertificadoEntity tipoCertificado = new TipoCertificadoEntity();
		tipoCertificado = TipoCertificadoModelMapper.TipoCertificadoModelToTipoCertificadoEntity(tipoCertificadoModel);

		tipoCertificado = factoryPersistenciaDAO.getTipoCertificadoDAO().actualizarTipoCertificadoEntity(tipoCertificado);
		
		tipoCertificadoModel = TipoCertificadoModelMapper.TipoCertificadoEntityToTipoCertificadoModel(tipoCertificado);
		objLog.info("FIN - actualizarTipoCertificadoModel "+tipoCertificadoModel.getIdTipoCertificado());
		return tipoCertificadoModel;

	}

	public TipoCertificadoModel buscarTipoCertificadoxIdModel(TipoCertificadoModel tipoCertificadoModel)throws NegocioImplException{
		objLog.info("INI - buscarTipoCertificadoxIdModel "+tipoCertificadoModel.getIdTipoCertificado());
		TipoCertificadoEntity tipoCertificado = new TipoCertificadoEntity();
		tipoCertificado = TipoCertificadoModelMapper.TipoCertificadoModelToTipoCertificadoEntity(tipoCertificadoModel);

		try {
			tipoCertificado=factoryPersistenciaDAO.getTipoCertificadoDAO().buscarTipoCertificadoxIdEntity(tipoCertificado);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		tipoCertificadoModel = TipoCertificadoModelMapper.TipoCertificadoEntityToTipoCertificadoModel(tipoCertificado);
		
		objLog.info("FIN - buscarTipoCertificadoxIdModel "+tipoCertificadoModel.getIdTipoCertificado());
		return tipoCertificadoModel;
	}

	public List<TipoCertificadoModel> listarTipoCertificadoesModel() {
		objLog.info("INI - listarTipoCertificadoesModel");
		List<TipoCertificadoModel> listaTipoCertificadoModel=new ArrayList<TipoCertificadoModel>();
//		List<TipoCertificadoEntity> listaTipoCertificadoes = new ArrayList<TipoCertificadoEntity>();
//
//		listaTipoCertificadoes=factoryPersistenciaDAO.getTipoCertificadoDAO().listarTipoCertificadoesEntity();
//
//		listaTipoCertificadoModel = TipoCertificadoModelMapper.ListTipoCertificadoEntityToListTipoCertificadoModel(listaTipoCertificadoes);
		
		listaTipoCertificadoModel = obtenerCacheListaTipoCertificado();
		
		objLog.info("FIN - listarTipoCertificadoesModel "+listaTipoCertificadoModel.size());
		
		return listaTipoCertificadoModel;
	}
	
	
	
	private List<TipoCertificadoModel> obtenerCacheListaTipoCertificado(){
		List<TipoCertificadoModel> listaTipoCertificadoModel=new ArrayList<TipoCertificadoModel>();
		List<TipoCertificadoEntity> listaTipoCertificadoEntity=new ArrayList<TipoCertificadoEntity>();
		TipoCertificadoModel tipoCertificadoModel = new TipoCertificadoModel();

		try{
			if(objCacheComponent==null){
				objCacheComponent = CacheLocalRepositorio.crearRepositorioCacheLocal(); //Colocar el nombre de cache local del ws
			}
		
		}catch(Exception e){
			listaTipoCertificadoModel = null;
			objLog.error("Cae al obtener el repositorio de Cache");
		}
		
		try{
			listaTipoCertificadoModel = CacheLocalRepositorio.obtenerCacheListaTipoCertificado(objCacheComponent);

		}catch(Exception e){
			
			listaTipoCertificadoModel=null;
		
		}
		
		try{
			if(listaTipoCertificadoModel==null || listaTipoCertificadoModel.size()==0){
				
				listaTipoCertificadoEntity = factoryPersistenciaDAO.getTipoCertificadoDAO().listarTipoCertificadoesEntity();
				
				if(listaTipoCertificadoEntity!=null && listaTipoCertificadoEntity.size()>0){
					
					listaTipoCertificadoModel = CacheLocalRepositorio.generarCacheListaTipoCertificado(objCacheComponent, listaTipoCertificadoEntity);
					listaTipoCertificadoModel = new ArrayList<TipoCertificadoModel>();
					for(TipoCertificadoEntity puEnt:listaTipoCertificadoEntity){
						tipoCertificadoModel = new TipoCertificadoModel();
						tipoCertificadoModel = TipoCertificadoModelMapper.TipoCertificadoEntityToTipoCertificadoModel(puEnt);
						listaTipoCertificadoModel.add(tipoCertificadoModel);
					}
				
				}
			
			}
		
		}
		catch(Exception e){
			objLog.error("Error en la implementacion del Servicio "+e.getMessage());
		}
		return listaTipoCertificadoModel;
	}

}
