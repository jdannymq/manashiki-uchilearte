package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.AlumnoProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.AlumnoProgramaActivoSemestreNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.AlumnoProgramaActivoSemestreModelMapper;
import com.manashiki.uchilearte.negocio.model.AlumnoProgramaActivoSemestreModel;

@Component
public class AlumnoProgramaActivoSemestreNegocio implements AlumnoProgramaActivoSemestreNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(AlumnoProgramaActivoSemestreNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public AlumnoProgramaActivoSemestreModel crearAlumnoProgramaActivoSemestreModel(AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel) {
		objLog.info("INI - crearAlumnoProgramaActivoSemestreModel");
		AlumnoProgramaActivoSemestreEntity alumnoProgramaActivoSemestreEntity = new AlumnoProgramaActivoSemestreEntity();
		alumnoProgramaActivoSemestreEntity = AlumnoProgramaActivoSemestreModelMapper.AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreEntity(alumnoProgramaActivoSemestreModel);
		
		
		alumnoProgramaActivoSemestreEntity = factoryPersistenciaDAO.getAlumnoProgramaActivoSemestreDAO().crearAlumnoProgramaActivoSemestreEntity(alumnoProgramaActivoSemestreEntity);
		
		alumnoProgramaActivoSemestreModel = AlumnoProgramaActivoSemestreModelMapper.AlumnoProgramaActivoSemestreEntityToAlumnoProgramaActivoSemestreModel(alumnoProgramaActivoSemestreEntity);
		objLog.info("FIN - crearAlumnoProgramaActivoSemestreModel "+alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre());
		return alumnoProgramaActivoSemestreModel;
	}

	public AlumnoProgramaActivoSemestreModel actualizarAlumnoProgramaActivoSemestreModel(AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel) {
		objLog.info("INI - actualizarAlumnoProgramaActivoSemestreModel "+alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre());
		AlumnoProgramaActivoSemestreEntity alumnoProgramaActivoSemestreEntity = new AlumnoProgramaActivoSemestreEntity();
		alumnoProgramaActivoSemestreEntity = AlumnoProgramaActivoSemestreModelMapper.AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreEntity(alumnoProgramaActivoSemestreModel);
		
		alumnoProgramaActivoSemestreEntity = factoryPersistenciaDAO.getAlumnoProgramaActivoSemestreDAO().actualizarAlumnoProgramaActivoSemestreEntity(alumnoProgramaActivoSemestreEntity);
		
		alumnoProgramaActivoSemestreModel = AlumnoProgramaActivoSemestreModelMapper.AlumnoProgramaActivoSemestreEntityToAlumnoProgramaActivoSemestreModel(alumnoProgramaActivoSemestreEntity);
		objLog.info("FIN - actualizarAlumnoProgramaActivoSemestreModel "+alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre());
		return alumnoProgramaActivoSemestreModel;
	}

	public AlumnoProgramaActivoSemestreModel buscarAlumnoProgramaActivoSemestrexIdModel(AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel) throws NegocioImplException {
		objLog.info("INI - buscarAlumnoProgramaActivoSemestrexIdModel "+alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre());
		AlumnoProgramaActivoSemestreEntity alumnoProgramaActivoSemestreEntity = new AlumnoProgramaActivoSemestreEntity();
		alumnoProgramaActivoSemestreEntity = AlumnoProgramaActivoSemestreModelMapper.AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreEntity(alumnoProgramaActivoSemestreModel);
		
		try {
			alumnoProgramaActivoSemestreEntity =factoryPersistenciaDAO.getAlumnoProgramaActivoSemestreDAO().buscarAlumnoProgramaActivoSemestrexIdEntity(alumnoProgramaActivoSemestreEntity);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		alumnoProgramaActivoSemestreModel = AlumnoProgramaActivoSemestreModelMapper.AlumnoProgramaActivoSemestreEntityToAlumnoProgramaActivoSemestreModel(alumnoProgramaActivoSemestreEntity);
		objLog.info("FIN - buscarAlumnoProgramaActivoSemestrexIdModel "+alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre());
		return alumnoProgramaActivoSemestreModel;
	}
	
	public List<AlumnoProgramaActivoSemestreModel> listarAlumnoProgramaActivoSemestreModel() {
		objLog.info("INI - listarAlumnoProgramaActivoSemestreModel");
		List<AlumnoProgramaActivoSemestreModel> listaAlumnoProgramaActivoSemestreModel=new ArrayList<AlumnoProgramaActivoSemestreModel>();
		List<AlumnoProgramaActivoSemestreEntity> listaAlumnoProgramaActivoSemestrees = new ArrayList<AlumnoProgramaActivoSemestreEntity>();
		
		listaAlumnoProgramaActivoSemestrees=factoryPersistenciaDAO.getAlumnoProgramaActivoSemestreDAO().listarAlumnoProgramaActivoSemestreEntity();
		
		listaAlumnoProgramaActivoSemestreModel = AlumnoProgramaActivoSemestreModelMapper.ListAlumnoProgramaActivoSemestreEntityToListAlumnoProgramaActivoSemestreModel(listaAlumnoProgramaActivoSemestrees);
		
		objLog.info("FIN - listarAlumnoProgramaActivoSemestreModel "+listaAlumnoProgramaActivoSemestreModel.size());
		return listaAlumnoProgramaActivoSemestreModel;
	}
	
}
