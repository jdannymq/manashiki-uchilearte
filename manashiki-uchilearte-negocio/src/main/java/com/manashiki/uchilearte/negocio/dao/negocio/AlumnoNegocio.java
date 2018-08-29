package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.AlumnoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.AlumnoNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.AlumnoModelMapper;
import com.manashiki.uchilearte.negocio.model.AlumnoModel;

@Component
public class AlumnoNegocio implements AlumnoNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(AlumnoNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public AlumnoModel crearAlumnoModel(AlumnoModel alumnoModel) {
		objLog.info("INI - crearAlumnoModel");
		AlumnoEntity alumnoEntity = new AlumnoEntity();
		alumnoEntity = AlumnoModelMapper.AlumnoModelToAlumnoEntity(alumnoModel);
		
		
		alumnoEntity = factoryPersistenciaDAO.getAlumnoDAO().crearAlumnoEntity(alumnoEntity);
		
		alumnoModel = AlumnoModelMapper.AlumnoEntityToAlumnoModel(alumnoEntity);
		objLog.info("FIN - crearAlumnoModel "+alumnoModel.getIdAlumnoUchile());
		return alumnoModel;
	}

	public AlumnoModel actualizarAlumnoModel(AlumnoModel alumnoModel) {
		objLog.info("INI - actualizarAlumnoModel "+alumnoModel.getIdAlumnoUchile());
		AlumnoEntity alumnoEntity = new AlumnoEntity();
		alumnoEntity = AlumnoModelMapper.AlumnoModelToAlumnoEntity(alumnoModel);
		
		alumnoEntity = factoryPersistenciaDAO.getAlumnoDAO().actualizarAlumnoEntity(alumnoEntity);
		
		alumnoModel = AlumnoModelMapper.AlumnoEntityToAlumnoModel(alumnoEntity);
		objLog.info("FIN - actualizarAlumnoModel "+alumnoModel.getIdAlumnoUchile());
		return alumnoModel;
	}

	public AlumnoModel buscarAlumnoxIdModel(AlumnoModel alumnoModel) throws NegocioImplException {
		objLog.info("INI - buscarAlumnoxIdModel "+alumnoModel.getIdAlumnoUchile());
		AlumnoEntity alumnoEntity = new AlumnoEntity();
		alumnoEntity = AlumnoModelMapper.AlumnoModelToAlumnoEntity(alumnoModel);
		
		try {
			alumnoEntity =factoryPersistenciaDAO.getAlumnoDAO().buscarAlumnoxIdEntity(alumnoEntity);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		alumnoModel = AlumnoModelMapper.AlumnoEntityToAlumnoModel(alumnoEntity);
		objLog.info("FIN - buscarAlumnoxIdModel "+alumnoModel.getIdAlumnoUchile());
		return alumnoModel;
	}
	
	public AlumnoModel buscarAlumnoxIdUsuarioxEstadoModel(AlumnoModel alumnoModel) throws NegocioImplException {
		objLog.info("INI - buscarAlumnoxIdModel "+alumnoModel.getIdAlumnoUchile());
		AlumnoEntity alumnoEntity = new AlumnoEntity();
		alumnoEntity = AlumnoModelMapper.AlumnoModelToAlumnoEntity(alumnoModel);
		
		try {
			alumnoEntity =factoryPersistenciaDAO.getAlumnoDAO().buscarAlumnoxIdUsuarioxEstadoEntity(alumnoEntity);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		alumnoModel = AlumnoModelMapper.AlumnoEntityToAlumnoModel(alumnoEntity);
		objLog.info("FIN - buscarAlumnoxIdModel "+alumnoModel.getIdAlumnoUchile());
		return alumnoModel;
	}
	
	public List<AlumnoModel> listarAlumnoModel() {
		objLog.info("INI - listarAlumnoModel");
		List<AlumnoModel> listaAlumnoModel=new ArrayList<AlumnoModel>();
		List<AlumnoEntity> listaAlumnoes = new ArrayList<AlumnoEntity>();
		
		listaAlumnoes=factoryPersistenciaDAO.getAlumnoDAO().listarAlumnoEntity();
		
		listaAlumnoModel = AlumnoModelMapper.ListAlumnoEntityToListAlumnoModel(listaAlumnoes);
		
		objLog.info("FIN - listarAlumnoModel "+listaAlumnoModel.size());
		return listaAlumnoModel;
	}
	
}
