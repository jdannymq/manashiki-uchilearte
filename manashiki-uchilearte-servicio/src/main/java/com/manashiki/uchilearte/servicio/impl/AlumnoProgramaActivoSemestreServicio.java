package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.AlumnoProgramaActivoSemestreModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servicio.IAlumnoProgramaActivoSemestreServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.AlumnoProgramaActivoSemestreDTOMapper;

@Component
public class AlumnoProgramaActivoSemestreServicio implements IAlumnoProgramaActivoSemestreServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(AlumnoProgramaActivoSemestreServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public AlumnoProgramaActivoSemestreDTO crearAlumnoProgramaActivoSemestreDTO(AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestre) {
		objLog.info("INI - crearAlumnoProgramaActivoSemestreDTO");
		AlumnoProgramaActivoSemestreModel programaActivoSemestreAsignatura = new AlumnoProgramaActivoSemestreModel();
		
		programaActivoSemestreAsignatura = AlumnoProgramaActivoSemestreDTOMapper.AlumnoProgramaActivoSemestreDTOToAlumnoProgramaActivoSemestreModel(alumnoProgramaActivoSemestre);
		
		programaActivoSemestreAsignatura = factoryNegocioDAO.getAlumnoProgramaActivoSemestreNegocioDAO().crearAlumnoProgramaActivoSemestreModel(programaActivoSemestreAsignatura);
		
		alumnoProgramaActivoSemestre = AlumnoProgramaActivoSemestreDTOMapper.AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreDTO(programaActivoSemestreAsignatura);
		
		objLog.info("FIN - crearAlumnoProgramaActivoSemestreDTO "+alumnoProgramaActivoSemestre.getIdAlumnoProgramaActivoSemestre());
		
		return alumnoProgramaActivoSemestre;
	}

	public AlumnoProgramaActivoSemestreDTO actualizarAlumnoProgramaActivoSemestreDTO(AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestre) {
		objLog.info("INI - actualizarAlumnoProgramaActivoSemestreDTO "+alumnoProgramaActivoSemestre.getIdAlumnoProgramaActivoSemestre());
		AlumnoProgramaActivoSemestreModel programaActivoSemestreAsignatura = new AlumnoProgramaActivoSemestreModel();
		programaActivoSemestreAsignatura = AlumnoProgramaActivoSemestreDTOMapper.AlumnoProgramaActivoSemestreDTOToAlumnoProgramaActivoSemestreModel(alumnoProgramaActivoSemestre);
		
		programaActivoSemestreAsignatura = factoryNegocioDAO.getAlumnoProgramaActivoSemestreNegocioDAO().actualizarAlumnoProgramaActivoSemestreModel(programaActivoSemestreAsignatura);
		
		alumnoProgramaActivoSemestre = AlumnoProgramaActivoSemestreDTOMapper.AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreDTO(programaActivoSemestreAsignatura);
		objLog.info("FIN - actualizarAlumnoProgramaActivoSemestreDTO "+alumnoProgramaActivoSemestre.getIdAlumnoProgramaActivoSemestre());
		return alumnoProgramaActivoSemestre;
	}

	public AlumnoProgramaActivoSemestreDTO buscarAlumnoProgramaActivoSemestrexIdDTO(AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestre) throws ServicioImplException {
		objLog.info("INI - buscarAlumnoProgramaActivoSemestrexIdDTO "+alumnoProgramaActivoSemestre.getIdAlumnoProgramaActivoSemestre());
		AlumnoProgramaActivoSemestreModel programaActivoSemestreAsignatura = new AlumnoProgramaActivoSemestreModel();
		programaActivoSemestreAsignatura = AlumnoProgramaActivoSemestreDTOMapper.AlumnoProgramaActivoSemestreDTOToAlumnoProgramaActivoSemestreModel(alumnoProgramaActivoSemestre);
		
		try {
			programaActivoSemestreAsignatura=factoryNegocioDAO.getAlumnoProgramaActivoSemestreNegocioDAO().buscarAlumnoProgramaActivoSemestrexIdModel(programaActivoSemestreAsignatura);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		alumnoProgramaActivoSemestre = AlumnoProgramaActivoSemestreDTOMapper.AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreDTO(programaActivoSemestreAsignatura);
		objLog.info("FIN - buscarAlumnoProgramaActivoSemestrexIdDTO "+alumnoProgramaActivoSemestre.getIdAlumnoProgramaActivoSemestre());
		return alumnoProgramaActivoSemestre;
	}
	
	public List<AlumnoProgramaActivoSemestreDTO> listarAlumnoProgramaActivoSemestreDTO() {
		objLog.info("INI - listarAlumnoProgramaActivoSemestreesDTO");
		List<AlumnoProgramaActivoSemestreDTO> listaAlumnoProgramaActivoSemestreDTO=new ArrayList<AlumnoProgramaActivoSemestreDTO>();
		List<AlumnoProgramaActivoSemestreModel> listaAlumnoProgramaActivoSemestrees = new ArrayList<AlumnoProgramaActivoSemestreModel>();
		
		listaAlumnoProgramaActivoSemestrees=factoryNegocioDAO.getAlumnoProgramaActivoSemestreNegocioDAO().listarAlumnoProgramaActivoSemestreModel();
		
		listaAlumnoProgramaActivoSemestreDTO = AlumnoProgramaActivoSemestreDTOMapper.ListAlumnoProgramaActivoSemestreModelToListAlumnoProgramaActivoSemestreDTO(listaAlumnoProgramaActivoSemestrees);
		
		objLog.info("FIN - listarAlumnoProgramaActivoSemestreesDTO "+listaAlumnoProgramaActivoSemestreDTO.size());
		return listaAlumnoProgramaActivoSemestreDTO;
	}
	
}
