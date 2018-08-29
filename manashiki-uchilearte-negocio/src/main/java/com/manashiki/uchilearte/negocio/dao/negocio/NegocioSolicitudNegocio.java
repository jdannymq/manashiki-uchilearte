package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.NegocioSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.NegocioSolicitudNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.NegocioSolicitudModelMapper;
import com.manashiki.uchilearte.negocio.model.NegocioSolicitudModel;

import vijnana.cache.component.ICacheComponent;

@Component
public class NegocioSolicitudNegocio implements NegocioSolicitudNegocioDAO{

	private static final Logger objLog = LoggerFactory.getLogger(NegocioSolicitudNegocio.class);
	
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	ICacheComponent objCacheComponent = null;
	
	/**
	 * Crea una Entidad NegocioSolicitud en la base de datos
	 * @param  negocioSolicitud NegocioSolicitud
	 * @return void
	 * @throws no lanza excepciones
	 */
	public NegocioSolicitudModel crearNegocioSolicitudModel(NegocioSolicitudModel negocioSolicitudModel){
		objLog.info("INI - crearNegocioSolicitudModel");
		NegocioSolicitudEntity negocioSolicitud= new NegocioSolicitudEntity();
		negocioSolicitud = NegocioSolicitudModelMapper.NegocioSolicitudModelToNegocioSolicitudEntity(negocioSolicitudModel);

		negocioSolicitud = factoryPersistenciaDAO.getNegocioSolicitudDAO().crearNegocioSolicitudEntity(negocioSolicitud);
		
		negocioSolicitudModel = NegocioSolicitudModelMapper.NegocioSolicitudEntityToNegocioSolicitudModel(negocioSolicitud);
		
		objLog.info("FIN - crearNegocioSolicitudModel "+negocioSolicitudModel.getIdNegocioSolicitudModel());
		return negocioSolicitudModel;
	}

	public NegocioSolicitudModel actualizarNegocioSolicitudModel(NegocioSolicitudModel negocioSolicitudModel) {
		objLog.info("INI - actualizarNegocioSolicitudModel "+negocioSolicitudModel.getIdNegocioSolicitudModel());
		NegocioSolicitudEntity negocioSolicitud= new NegocioSolicitudEntity();
		negocioSolicitud = NegocioSolicitudModelMapper.NegocioSolicitudModelToNegocioSolicitudEntity(negocioSolicitudModel);

		negocioSolicitud = factoryPersistenciaDAO.getNegocioSolicitudDAO().actualizarNegocioSolicitudEntity(negocioSolicitud);
		
		negocioSolicitudModel = NegocioSolicitudModelMapper.NegocioSolicitudEntityToNegocioSolicitudModel(negocioSolicitud);
		objLog.info("FIN - actualizarNegocioSolicitudModel "+negocioSolicitudModel.getIdNegocioSolicitudModel());
		return negocioSolicitudModel;
		
	}

	public NegocioSolicitudModel buscarNegocioSolicitudxIdModel(NegocioSolicitudModel negocioSolicitudModel) throws NegocioImplException{
		objLog.info("INI - buscarNegocioSolicitudxIdModel "+negocioSolicitudModel.getIdNegocioSolicitudModel());
		NegocioSolicitudEntity negocioSolicitud = new NegocioSolicitudEntity();
		negocioSolicitud = NegocioSolicitudModelMapper.NegocioSolicitudModelToNegocioSolicitudEntity(negocioSolicitudModel);

		try {
			negocioSolicitud=factoryPersistenciaDAO.getNegocioSolicitudDAO().buscarNegocioSolicitudxIdEntity(negocioSolicitud);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		negocioSolicitudModel = NegocioSolicitudModelMapper.NegocioSolicitudEntityToNegocioSolicitudModel(negocioSolicitud);
		
		objLog.info("FIN - buscarNegocioSolicitudxIdModel "+negocioSolicitudModel.getIdNegocioSolicitudModel());
		return negocioSolicitudModel;
	}

	public List<NegocioSolicitudModel> listarNegocioSolicitudModel() {
		objLog.info("INI - listarNegocioSolicitudsModel");
		List<NegocioSolicitudModel> listaNegocioSolicitudModel=new ArrayList<NegocioSolicitudModel>();
		List<NegocioSolicitudEntity> listaNegocioSolicitudes = new ArrayList<NegocioSolicitudEntity>();
		
		listaNegocioSolicitudes=factoryPersistenciaDAO.getNegocioSolicitudDAO().listarNegocioSolicitudEntity();
		
		listaNegocioSolicitudModel = NegocioSolicitudModelMapper.ListNegocioSolicitudEntityToListNegocioSolicitudModel(listaNegocioSolicitudes);
				
		objLog.info("FIN - listarNegocioSolicitudsModel "+listaNegocioSolicitudModel.size());
		
		return listaNegocioSolicitudModel;
	}
	
	

}
