package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadPostulacionModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;
import com.manashiki.uchilearte.servicio.IProgramaUniversidadPostulacionServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.ProgramaUniversidadPostulacionDTOMapper;

@Service
public class ProgramaUniversidadPostulacionServicio implements IProgramaUniversidadPostulacionServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(ProgramaUniversidadPostulacionServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public ProgramaUniversidadPostulacionDTO crearProgramaUniversidadPostulacionDTO(ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTO) {
		objLog.info("INI - crearProgramaUniversidadPostulacionDTO");
		ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel = new ProgramaUniversidadPostulacionModel();
		programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionDTOMapper.ProgramaUniversidadPostulacionDTOToProgramaUniversidadPostulacionModel(programaUniversidadPostulacionDTO);

		programaUniversidadPostulacionModel = factoryNegocioDAO.getProgramaUniversidadPostulacionNegocioDAO().crearProgramaUniversidadPostulacionModel(programaUniversidadPostulacionModel);
		
		programaUniversidadPostulacionDTO = ProgramaUniversidadPostulacionDTOMapper.ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionModel);
		objLog.info("FIN - crearProgramaUniversidadPostulacionDTO "+programaUniversidadPostulacionDTO.getIdProgramaUniversidadPostulacion());
		return programaUniversidadPostulacionDTO;

	}

	public ProgramaUniversidadPostulacionDTO actualizarProgramaUniversidadPostulacionDTO(ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTO) {
		objLog.info("INI - actualizarProgramaUniversidadPostulacionDTO "+programaUniversidadPostulacionDTO.getIdProgramaUniversidadPostulacion());
		ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel = new ProgramaUniversidadPostulacionModel();
		programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionDTOMapper.ProgramaUniversidadPostulacionDTOToProgramaUniversidadPostulacionModel(programaUniversidadPostulacionDTO);

		programaUniversidadPostulacionModel = factoryNegocioDAO.getProgramaUniversidadPostulacionNegocioDAO().actualizarProgramaUniversidadPostulacionModel(programaUniversidadPostulacionModel);
		
		programaUniversidadPostulacionDTO = ProgramaUniversidadPostulacionDTOMapper.ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionModel);
		objLog.info("FIN - actualizarProgramaUniversidadPostulacionDTO "+programaUniversidadPostulacionDTO.getIdProgramaUniversidadPostulacion());
		return programaUniversidadPostulacionDTO;

	}

	public ProgramaUniversidadPostulacionDTO buscarProgramaUniversidadPostulacionxIdDTO(ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTO)throws ServicioImplException{
		objLog.info("INI - buscarProgramaUniversidadPostulacionxIdDTO "+programaUniversidadPostulacionDTO.getIdProgramaUniversidadPostulacion());
		ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel = new ProgramaUniversidadPostulacionModel();
		programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionDTOMapper.ProgramaUniversidadPostulacionDTOToProgramaUniversidadPostulacionModel(programaUniversidadPostulacionDTO);

		try {
			programaUniversidadPostulacionModel = factoryNegocioDAO.getProgramaUniversidadPostulacionNegocioDAO().buscarProgramaUniversidadPostulacionxIdModel(programaUniversidadPostulacionModel);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		programaUniversidadPostulacionDTO = ProgramaUniversidadPostulacionDTOMapper.ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionModel);
		
		objLog.info("FIN - buscarProgramaUniversidadPostulacionxIdDTO "+programaUniversidadPostulacionDTO.getIdProgramaUniversidadPostulacion());
		return programaUniversidadPostulacionDTO;
	}

	public List<ProgramaUniversidadPostulacionDTO> listarProgramaUniversidadPostulacionDTO() {
		objLog.info("INI - listarProgramaUniversidadPostulacionDTO");
		List<ProgramaUniversidadPostulacionDTO> listaProgramaUniversidadPostulacionDTO=new ArrayList<ProgramaUniversidadPostulacionDTO>();
		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidades = new ArrayList<ProgramaUniversidadPostulacionModel>();

		listaProgramaUniversidades=factoryNegocioDAO.getProgramaUniversidadPostulacionNegocioDAO().listarProgramaUniversidadPostulacionModel();

		listaProgramaUniversidadPostulacionDTO = ProgramaUniversidadPostulacionDTOMapper.ListProgramaUniversidadPostulacionModelToListProgramaUniversidadPostulacionDTO(listaProgramaUniversidades);
		
		objLog.info("FIN - listarProgramaUniversidadPostulacionDTO "+listaProgramaUniversidadPostulacionDTO.size());
		return listaProgramaUniversidadPostulacionDTO;
	}
	
	public List<ProgramaUniversidadPostulacionDTO> listarProgramaUniversidadPostulacionConPrecioDTO() {
		objLog.info("INI - listarProgramaUniversidadPostulacionConPrecioDTO");
		List<ProgramaUniversidadPostulacionDTO> listaProgramaUniversidadPostulacionDTO=new ArrayList<ProgramaUniversidadPostulacionDTO>();
		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidades = new ArrayList<ProgramaUniversidadPostulacionModel>();

		listaProgramaUniversidades=factoryNegocioDAO.getProgramaUniversidadPostulacionNegocioDAO().listarProgramaUniversidadPostulacionPrecioModel();

		listaProgramaUniversidadPostulacionDTO = ProgramaUniversidadPostulacionDTOMapper.ListProgramaUniversidadPostulacionModelToListProgramaUniversidadPostulacionDTO(listaProgramaUniversidades);
		
		objLog.info("FIN - listarProgramaUniversidadPostulacionConPrecioDTO "+listaProgramaUniversidadPostulacionDTO.size());
		return listaProgramaUniversidadPostulacionDTO;
	}

}
