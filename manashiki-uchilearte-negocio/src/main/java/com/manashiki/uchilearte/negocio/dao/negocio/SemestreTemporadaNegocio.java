package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.SemestreTemporadaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.SemestreTemporadaNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.SemestreTemporadaModelMapper;
import com.manashiki.uchilearte.negocio.model.SemestreTemporadaModel;

@Component
public class SemestreTemporadaNegocio implements SemestreTemporadaNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(SemestreTemporadaNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public SemestreTemporadaModel crearSemestreTemporadaModel(SemestreTemporadaModel semestreTemporadaModel) {
		objLog.info("INI - crearSemestreTemporadaModel");
		SemestreTemporadaEntity semestreTemporada = new SemestreTemporadaEntity();
		semestreTemporada = SemestreTemporadaModelMapper.SemestreTemporadaModelToSemestreTemporadaEntity(semestreTemporadaModel);
		
		
		semestreTemporada = factoryPersistenciaDAO.getSemestreTemporadaDAO().crearSemestreTemporadaEntity(semestreTemporada);
		
		semestreTemporadaModel = SemestreTemporadaModelMapper.SemestreTemporadaEntityToSemestreTemporadaModel(semestreTemporada);
		objLog.info("FIN - crearSemestreTemporadaModel "+semestreTemporadaModel.getIdSemestreTemporada());
		return semestreTemporadaModel;
	}

	public SemestreTemporadaModel actualizarSemestreTemporadaModel(SemestreTemporadaModel semestreTemporadaModel) {
		objLog.info("INI - actualizarSemestreTemporadaModel "+semestreTemporadaModel.getIdSemestreTemporada());
		SemestreTemporadaEntity semestreTemporada = new SemestreTemporadaEntity();
		semestreTemporada = SemestreTemporadaModelMapper.SemestreTemporadaModelToSemestreTemporadaEntity(semestreTemporadaModel);
		
		semestreTemporada = factoryPersistenciaDAO.getSemestreTemporadaDAO().actualizarSemestreTemporadaEntity(semestreTemporada);
		
		semestreTemporadaModel = SemestreTemporadaModelMapper.SemestreTemporadaEntityToSemestreTemporadaModel(semestreTemporada);
		objLog.info("FIN - actualizarSemestreTemporadaModel "+semestreTemporadaModel.getIdSemestreTemporada());
		return semestreTemporadaModel;
	}

	public SemestreTemporadaModel buscarSemestreTemporadaxIdModel(SemestreTemporadaModel semestreTemporadaModel) throws NegocioImplException {
		objLog.info("INI - buscarSemestreTemporadaxIdModel "+semestreTemporadaModel.getIdSemestreTemporada());
		SemestreTemporadaEntity semestreTemporada = new SemestreTemporadaEntity();
		semestreTemporada = SemestreTemporadaModelMapper.SemestreTemporadaModelToSemestreTemporadaEntity(semestreTemporadaModel);
		
		try {
			semestreTemporada=factoryPersistenciaDAO.getSemestreTemporadaDAO().buscarSemestreTemporadaxIdEntity(semestreTemporada);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		semestreTemporadaModel = SemestreTemporadaModelMapper.SemestreTemporadaEntityToSemestreTemporadaModel(semestreTemporada);
		objLog.info("FIN - buscarSemestreTemporadaxIdModel "+semestreTemporadaModel.getIdSemestreTemporada());
		return semestreTemporadaModel;
	}
	
	public List<SemestreTemporadaModel> listarSemestreTemporadaModel() {
		objLog.info("INI - listarSemestreTemporadaesModel");
		List<SemestreTemporadaModel> listaSemestreTemporadaModel=new ArrayList<SemestreTemporadaModel>();
		List<SemestreTemporadaEntity> listaSemestreTemporadaes = new ArrayList<SemestreTemporadaEntity>();
		
		listaSemestreTemporadaes=factoryPersistenciaDAO.getSemestreTemporadaDAO().listarSemestreTemporadaEntity();
		
		listaSemestreTemporadaModel = SemestreTemporadaModelMapper.ListSemestreTemporadaEntityToListSemestreTemporadaModel(listaSemestreTemporadaes);
		
		objLog.info("FIN - listarSemestreTemporadaesModel "+listaSemestreTemporadaModel.size());
		return listaSemestreTemporadaModel;
	}
	
}
