package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.ComunaEntity;
import com.manashiki.uchilearte.logica.entidad.RegionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.ComunaNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.ComunaModelMapper;
import com.manashiki.uchilearte.negocio.model.ComunaModel;

@Component
public class ComunaNegocio implements ComunaNegocioDAO{

	private static final Logger objLog = LoggerFactory.getLogger(ComunaNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	/**
	 * Crea una Entidad Comuna en la base de datos
	 * @param  comuna Comuna
	 * @return void
	 * @throws no lanza excepciones
	 */
	public ComunaModel crearComunaModel(ComunaModel comunaModel){
		objLog.info("INI - crearComunaModel");
		ComunaEntity comuna= new ComunaEntity();
		comuna = ComunaModelMapper.ComunaModelToComunaEntity(comunaModel);

		comuna = factoryPersistenciaDAO.getComunaDAO().crearComunaEntity(comuna);
		
		comunaModel = ComunaModelMapper.ComunaEntityToComunaModel(comuna);
		
		objLog.info("FIN - crearComunaModel "+comunaModel.getIdComuna());
		return comunaModel;
	}

	public ComunaModel actualizarComunaModel(ComunaModel comunaModel) {
		objLog.info("INI - actualizarComunaModel "+comunaModel.getIdComuna());
		ComunaEntity comuna= new ComunaEntity();
		comuna = ComunaModelMapper.ComunaModelToComunaEntity(comunaModel);

		comuna = factoryPersistenciaDAO.getComunaDAO().actualizarComunaEntity(comuna);
		
		comunaModel = ComunaModelMapper.ComunaEntityToComunaModel(comuna);
		objLog.info("FIN - actualizarComunaModel "+comunaModel.getIdComuna());
		return comunaModel;
		
	}

	public ComunaModel buscarComunaxIdModel(ComunaModel comunaModel) throws NegocioImplException{
		objLog.info("INI - buscarComunaxIdModel "+comunaModel.getIdComuna());
		ComunaEntity comuna = new ComunaEntity();
		comuna = ComunaModelMapper.ComunaModelToComunaEntity(comunaModel);

		try {
			comuna=factoryPersistenciaDAO.getComunaDAO().buscarComunaxIdEntity(comuna);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		comunaModel = ComunaModelMapper.ComunaEntityToComunaModel(comuna);
		
		objLog.info("FIN - buscarComunaxIdModel "+comunaModel.getIdComuna());
		return comunaModel;
	}

	public List<ComunaModel> listarComunasModel() {
		objLog.info("INI - listarComunasModel");
		List<ComunaModel> listaComunaModel=new ArrayList<ComunaModel>();
		List<ComunaEntity> listaComunaes = new ArrayList<ComunaEntity>();
		
		listaComunaes=factoryPersistenciaDAO.getComunaDAO().listarComunasEntity();
		
		listaComunaModel = ComunaModelMapper.ListComunaEntityToListComunaModel(listaComunaes);
		
		objLog.info("FIN - listarComunasModel "+listaComunaModel.size());
		return listaComunaModel;
	}

	public List<ComunaModel> listarComunasModelxRegion(ComunaModel comunaModel) {
		objLog.info("INI - listarComunasModelxRegion "+comunaModel);
		ComunaEntity comuna = new ComunaEntity();
		List<ComunaModel> listaComunaModel=new ArrayList<ComunaModel>();
		List<ComunaEntity> listaComunas = new ArrayList<ComunaEntity>();
		
		comuna = ComunaModelMapper.ComunaModelToComunaEntity(comunaModel);
		
		RegionEntity region= new RegionEntity();
		region.setIdRegion(comunaModel.getIdRegion());
		comuna.setFkIdRegion(region);
		
		listaComunas=factoryPersistenciaDAO.getComunaDAO().listarComunasEntityxRegion(comuna);
		
		listaComunaModel = ComunaModelMapper.ListComunaEntityToListComunaModel(listaComunas);
		
		objLog.info("FIN - listarComunasModelxRegion "+listaComunaModel.size());
		return listaComunaModel;
		
	}


}
