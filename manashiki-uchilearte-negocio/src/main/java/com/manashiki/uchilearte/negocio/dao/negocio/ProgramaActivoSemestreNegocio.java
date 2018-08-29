package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.ProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.ProgramaActivoSemestreNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.ProgramaActivoSemestreModelMapper;
import com.manashiki.uchilearte.negocio.model.ProgramaActivoSemestreModel;

@Component
public class ProgramaActivoSemestreNegocio implements ProgramaActivoSemestreNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(ProgramaActivoSemestreNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public ProgramaActivoSemestreModel crearProgramaActivoSemestreModel(ProgramaActivoSemestreModel programaActivoSemestreModel) {
		objLog.info("INI - crearProgramaActivoSemestreModel");
		ProgramaActivoSemestreEntity programaActivoSemestre = new ProgramaActivoSemestreEntity();
		programaActivoSemestre = ProgramaActivoSemestreModelMapper.ProgramaActivoSemestreModelToProgramaActivoSemestreEntity(programaActivoSemestreModel);
		
		
		programaActivoSemestre = factoryPersistenciaDAO.getProgramaActivoSemestreDAO().crearProgramaActivoSemestreEntity(programaActivoSemestre);
		
		programaActivoSemestreModel = ProgramaActivoSemestreModelMapper.ProgramaActivoSemestreEntityToProgramaActivoSemestreModel(programaActivoSemestre);
		objLog.info("FIN - crearProgramaActivoSemestreModel "+programaActivoSemestreModel.getIdProgramaActivoSemestre());
		return programaActivoSemestreModel;
	}

	public ProgramaActivoSemestreModel actualizarProgramaActivoSemestreModel(ProgramaActivoSemestreModel programaActivoSemestreModel) {
		objLog.info("INI - actualizarProgramaActivoSemestreModel "+programaActivoSemestreModel.getIdProgramaActivoSemestre());
		ProgramaActivoSemestreEntity programaActivoSemestre = new ProgramaActivoSemestreEntity();
		programaActivoSemestre = ProgramaActivoSemestreModelMapper.ProgramaActivoSemestreModelToProgramaActivoSemestreEntity(programaActivoSemestreModel);
		
		programaActivoSemestre = factoryPersistenciaDAO.getProgramaActivoSemestreDAO().actualizarProgramaActivoSemestreEntity(programaActivoSemestre);
		
		programaActivoSemestreModel = ProgramaActivoSemestreModelMapper.ProgramaActivoSemestreEntityToProgramaActivoSemestreModel(programaActivoSemestre);
		objLog.info("FIN - actualizarProgramaActivoSemestreModel "+programaActivoSemestreModel.getIdProgramaActivoSemestre());
		return programaActivoSemestreModel;
	}

	public ProgramaActivoSemestreModel buscarProgramaActivoSemestrexIdModel(ProgramaActivoSemestreModel programaActivoSemestreModel) throws NegocioImplException {
		objLog.info("INI - buscarProgramaActivoSemestrexIdModel "+programaActivoSemestreModel.getIdProgramaActivoSemestre());
		ProgramaActivoSemestreEntity programaActivoSemestre = new ProgramaActivoSemestreEntity();
		programaActivoSemestre = ProgramaActivoSemestreModelMapper.ProgramaActivoSemestreModelToProgramaActivoSemestreEntity(programaActivoSemestreModel);
		
		try {
			programaActivoSemestre=factoryPersistenciaDAO.getProgramaActivoSemestreDAO().buscarProgramaActivoSemestrexIdEntity(programaActivoSemestre);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		programaActivoSemestreModel = ProgramaActivoSemestreModelMapper.ProgramaActivoSemestreEntityToProgramaActivoSemestreModel(programaActivoSemestre);
		objLog.info("FIN - buscarProgramaActivoSemestrexIdModel "+programaActivoSemestreModel.getIdProgramaActivoSemestre());
		return programaActivoSemestreModel;
	}
	
	public List<ProgramaActivoSemestreModel> listarProgramaActivoSemestreModel() {
		objLog.info("INI - listarProgramaActivoSemestreesModel");
		List<ProgramaActivoSemestreModel> listaProgramaActivoSemestreModel=new ArrayList<ProgramaActivoSemestreModel>();
		List<ProgramaActivoSemestreEntity> listaProgramaActivoSemestrees = new ArrayList<ProgramaActivoSemestreEntity>();
		
		listaProgramaActivoSemestrees=factoryPersistenciaDAO.getProgramaActivoSemestreDAO().listarProgramaActivoSemestreEntity();
		
		listaProgramaActivoSemestreModel = ProgramaActivoSemestreModelMapper.ListProgramaActivoSemestreEntityToListProgramaActivoSemestreModel(listaProgramaActivoSemestrees);
		
		objLog.info("FIN - listarProgramaActivoSemestreesModel "+listaProgramaActivoSemestreModel.size());
		return listaProgramaActivoSemestreModel;
	}
	
}
