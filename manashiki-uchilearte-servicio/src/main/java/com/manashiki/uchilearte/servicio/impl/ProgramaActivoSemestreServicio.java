package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ProgramaActivoSemestreModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servicio.IProgramaActivoSemestreServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.ProgramaActivoSemestreDTOMapper;

@Component
public class ProgramaActivoSemestreServicio implements IProgramaActivoSemestreServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(ProgramaActivoSemestreServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public ProgramaActivoSemestreDTO crearProgramaActivoSemestreDTO(ProgramaActivoSemestreDTO programaActivoSemestreDTO) {
		objLog.info("INI - crearProgramaActivoSemestreDTO");
		ProgramaActivoSemestreModel programaActivoSemestre = new ProgramaActivoSemestreModel();
		programaActivoSemestre = ProgramaActivoSemestreDTOMapper.ProgramaActivoSemestreDTOToProgramaActivoSemestreModel(programaActivoSemestreDTO);
		
		
		programaActivoSemestre = factoryNegocioDAO.getProgramaActivoSemestreNegocioDAO().crearProgramaActivoSemestreModel(programaActivoSemestre);
		
		programaActivoSemestreDTO = ProgramaActivoSemestreDTOMapper.ProgramaActivoSemestreModelToProgramaActivoSemestreDTO(programaActivoSemestre);
		
		objLog.info("FIN - crearProgramaActivoSemestreDTO "+programaActivoSemestreDTO.getIdProgramaActivoSemestre());
		
		return programaActivoSemestreDTO;
	}

	public ProgramaActivoSemestreDTO actualizarProgramaActivoSemestreDTO(ProgramaActivoSemestreDTO programaActivoSemestreDTO) {
		objLog.info("INI - actualizarProgramaActivoSemestreDTO "+programaActivoSemestreDTO.getIdProgramaActivoSemestre());
		ProgramaActivoSemestreModel programaActivoSemestre = new ProgramaActivoSemestreModel();
		programaActivoSemestre = ProgramaActivoSemestreDTOMapper.ProgramaActivoSemestreDTOToProgramaActivoSemestreModel(programaActivoSemestreDTO);
		
		programaActivoSemestre = factoryNegocioDAO.getProgramaActivoSemestreNegocioDAO().actualizarProgramaActivoSemestreModel(programaActivoSemestre);
		
		programaActivoSemestreDTO = ProgramaActivoSemestreDTOMapper.ProgramaActivoSemestreModelToProgramaActivoSemestreDTO(programaActivoSemestre);
		objLog.info("FIN - actualizarProgramaActivoSemestreDTO "+programaActivoSemestreDTO.getIdProgramaActivoSemestre());
		return programaActivoSemestreDTO;
	}

	public ProgramaActivoSemestreDTO buscarProgramaActivoSemestrexIdDTO(ProgramaActivoSemestreDTO programaActivoSemestreDTO) throws ServicioImplException {
		objLog.info("INI - buscarProgramaActivoSemestrexIdDTO "+programaActivoSemestreDTO.getIdProgramaActivoSemestre());
		ProgramaActivoSemestreModel programaActivoSemestre = new ProgramaActivoSemestreModel();
		programaActivoSemestre = ProgramaActivoSemestreDTOMapper.ProgramaActivoSemestreDTOToProgramaActivoSemestreModel(programaActivoSemestreDTO);
		
		try {
			programaActivoSemestre=factoryNegocioDAO.getProgramaActivoSemestreNegocioDAO().buscarProgramaActivoSemestrexIdModel(programaActivoSemestre);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		programaActivoSemestreDTO = ProgramaActivoSemestreDTOMapper.ProgramaActivoSemestreModelToProgramaActivoSemestreDTO(programaActivoSemestre);
		objLog.info("FIN - buscarProgramaActivoSemestrexIdDTO "+programaActivoSemestreDTO.getIdProgramaActivoSemestre());
		return programaActivoSemestreDTO;
	}
	
	public List<ProgramaActivoSemestreDTO> listarProgramaActivoSemestreDTO() {
		objLog.info("INI - listarProgramaActivoSemestreesDTO");
		List<ProgramaActivoSemestreDTO> listaProgramaActivoSemestreDTO=new ArrayList<ProgramaActivoSemestreDTO>();
		List<ProgramaActivoSemestreModel> listaProgramaActivoSemestrees = new ArrayList<ProgramaActivoSemestreModel>();
		
		listaProgramaActivoSemestrees=factoryNegocioDAO.getProgramaActivoSemestreNegocioDAO().listarProgramaActivoSemestreModel();
		
		listaProgramaActivoSemestreDTO = ProgramaActivoSemestreDTOMapper.ListProgramaActivoSemestreModelToListProgramaActivoSemestreDTO(listaProgramaActivoSemestrees);
		
		objLog.info("FIN - listarProgramaActivoSemestreesDTO "+listaProgramaActivoSemestreDTO.size());
		return listaProgramaActivoSemestreDTO;
	}
	
}
