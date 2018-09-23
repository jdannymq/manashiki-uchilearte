package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servicio.IProgramaUniversidadServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.ProgramaUniversidadDTOMapper;

@Service
public class ProgramaUniversidadServicio implements IProgramaUniversidadServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(ProgramaUniversidadServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public ProgramaUniversidadDTO crearProgramaUniversidadDTO(ProgramaUniversidadDTO programaUniversidadDTO) {
		objLog.info("INI - crearProgramaUniversidadDTO");
		ProgramaUniversidadModel programaUniversidad = new ProgramaUniversidadModel();
		programaUniversidad = ProgramaUniversidadDTOMapper.ProgramaUniversidadDTOToProgramaUniversidadModel(programaUniversidadDTO);

		programaUniversidad = factoryNegocioDAO.getProgramaUniversidadNegocioDAO().crearProgramaUniversidadModel(programaUniversidad);
		
		programaUniversidadDTO = ProgramaUniversidadDTOMapper.ProgramaUniversidadModelToProgramaUniversidadDTO(programaUniversidad);
		objLog.info("FIN - crearProgramaUniversidadDTO "+programaUniversidadDTO.getIdProgramaUniversidad());
		return programaUniversidadDTO;

	}

	public ProgramaUniversidadDTO actualizarProgramaUniversidadDTO(ProgramaUniversidadDTO programaUniversidadDTO) {
		objLog.info("INI - actualizarProgramaUniversidadDTO "+programaUniversidadDTO.getIdProgramaUniversidad());
		ProgramaUniversidadModel programaUniversidad = new ProgramaUniversidadModel();
		programaUniversidad = ProgramaUniversidadDTOMapper.ProgramaUniversidadDTOToProgramaUniversidadModel(programaUniversidadDTO);

		programaUniversidad = factoryNegocioDAO.getProgramaUniversidadNegocioDAO().actualizarProgramaUniversidadModel(programaUniversidad);
		
		programaUniversidadDTO = ProgramaUniversidadDTOMapper.ProgramaUniversidadModelToProgramaUniversidadDTO(programaUniversidad);
		objLog.info("FIN - actualizarProgramaUniversidadDTO "+programaUniversidadDTO.getIdProgramaUniversidad());
		return programaUniversidadDTO;

	}

	public ProgramaUniversidadDTO buscarProgramaUniversidadxIdDTO(ProgramaUniversidadDTO programaUniversidadDTO)throws ServicioImplException{
		objLog.info("INI - buscarProgramaUniversidadxIdDTO "+programaUniversidadDTO.getIdProgramaUniversidad());
		ProgramaUniversidadModel programaUniversidad = new ProgramaUniversidadModel();
		programaUniversidad = ProgramaUniversidadDTOMapper.ProgramaUniversidadDTOToProgramaUniversidadModel(programaUniversidadDTO);

		try {
			programaUniversidad=factoryNegocioDAO.getProgramaUniversidadNegocioDAO().buscarProgramaUniversidadxIdModel(programaUniversidad);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		programaUniversidadDTO = ProgramaUniversidadDTOMapper.ProgramaUniversidadModelToProgramaUniversidadDTO(programaUniversidad);
		
		objLog.info("FIN - buscarProgramaUniversidadxIdDTO "+programaUniversidadDTO.getIdProgramaUniversidad());
		return programaUniversidadDTO;
	}

	public List<ProgramaUniversidadDTO> listarProgramaUniversidadesDTO() {
		objLog.info("INI - listarProgramaUniversidadesDTO");
		List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO=new ArrayList<ProgramaUniversidadDTO>();
		List<ProgramaUniversidadModel> listaProgramaUniversidades = new ArrayList<ProgramaUniversidadModel>();

		listaProgramaUniversidades=factoryNegocioDAO.getProgramaUniversidadNegocioDAO().listarProgramaUniversidadModel();

		listaProgramaUniversidadDTO = ProgramaUniversidadDTOMapper.ListProgramaUniversidadModelToListProgramaUniversidadDTO(listaProgramaUniversidades);
		
		objLog.info("FIN - listarProgramaUniversidadesDTO "+listaProgramaUniversidadDTO.size());
		return listaProgramaUniversidadDTO;
	}
	
	public List<ProgramaUniversidadDTO> listarProgramaUniversidadesConPrecioDTO() {
		objLog.info("INI - listarProgramaUniversidadesDTO");
		List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO=new ArrayList<ProgramaUniversidadDTO>();
		List<ProgramaUniversidadModel> listaProgramaUniversidades = new ArrayList<ProgramaUniversidadModel>();

		listaProgramaUniversidades=factoryNegocioDAO.getProgramaUniversidadNegocioDAO().listarProgramaUniversidadPrecioModel();

		listaProgramaUniversidadDTO = ProgramaUniversidadDTOMapper.ListProgramaUniversidadModelToListProgramaUniversidadDTO(listaProgramaUniversidades);
		
		objLog.info("FIN - listarProgramaUniversidadesDTO "+listaProgramaUniversidadDTO.size());
		return listaProgramaUniversidadDTO;
	}

}
