package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.AsignaturaProgramaActivoSemestreModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AsignaturaProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servicio.IAsignaturaProgramaActivoSemestreServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.AsignaturaProgramaActivoSemestreDTOMapper;

@Component
public class AsignaturaProgramaActivoSemestreServicio implements IAsignaturaProgramaActivoSemestreServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(AsignaturaProgramaActivoSemestreServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public AsignaturaProgramaActivoSemestreDTO crearAsignaturaProgramaActivoSemestreDTO(AsignaturaProgramaActivoSemestreDTO programaActivoSemestreAsignaturaDTO) {
		objLog.info("INI - crearAsignaturaProgramaActivoSemestreDTO");
		AsignaturaProgramaActivoSemestreModel programaActivoSemestreAsignatura = new AsignaturaProgramaActivoSemestreModel();
		
		programaActivoSemestreAsignatura = AsignaturaProgramaActivoSemestreDTOMapper.AsignaturaProgramaActivoSemestreDTOToAsignaturaProgramaActivoSemestreModel(programaActivoSemestreAsignaturaDTO);
		
		programaActivoSemestreAsignatura = factoryNegocioDAO.getAsignaturaProgramaActivoSemestreNegocioDAO().crearAsignaturaProgramaActivoSemestreModel(programaActivoSemestreAsignatura);
		
		programaActivoSemestreAsignaturaDTO = AsignaturaProgramaActivoSemestreDTOMapper.AsignaturaProgramaActivoSemestreModelToAsignaturaProgramaActivoSemestreDTO(programaActivoSemestreAsignatura);
		
		objLog.info("FIN - crearAsignaturaProgramaActivoSemestreDTO "+programaActivoSemestreAsignaturaDTO.getIdAsignaturaProgramaActivoSemestre());
		
		return programaActivoSemestreAsignaturaDTO;
	}

	public AsignaturaProgramaActivoSemestreDTO actualizarAsignaturaProgramaActivoSemestreDTO(AsignaturaProgramaActivoSemestreDTO programaActivoSemestreAsignaturaDTO) {
		objLog.info("INI - actualizarAsignaturaProgramaActivoSemestreDTO "+programaActivoSemestreAsignaturaDTO.getIdAsignaturaProgramaActivoSemestre());
		AsignaturaProgramaActivoSemestreModel programaActivoSemestreAsignatura = new AsignaturaProgramaActivoSemestreModel();
		programaActivoSemestreAsignatura = AsignaturaProgramaActivoSemestreDTOMapper.AsignaturaProgramaActivoSemestreDTOToAsignaturaProgramaActivoSemestreModel(programaActivoSemestreAsignaturaDTO);
		
		programaActivoSemestreAsignatura = factoryNegocioDAO.getAsignaturaProgramaActivoSemestreNegocioDAO().actualizarAsignaturaProgramaActivoSemestreModel(programaActivoSemestreAsignatura);
		
		programaActivoSemestreAsignaturaDTO = AsignaturaProgramaActivoSemestreDTOMapper.AsignaturaProgramaActivoSemestreModelToAsignaturaProgramaActivoSemestreDTO(programaActivoSemestreAsignatura);
		objLog.info("FIN - actualizarAsignaturaProgramaActivoSemestreDTO "+programaActivoSemestreAsignaturaDTO.getIdAsignaturaProgramaActivoSemestre());
		return programaActivoSemestreAsignaturaDTO;
	}

	public AsignaturaProgramaActivoSemestreDTO buscarAsignaturaProgramaActivoSemestrexIdDTO(AsignaturaProgramaActivoSemestreDTO programaActivoSemestreAsignaturaDTO) throws ServicioImplException {
		objLog.info("INI - buscarAsignaturaProgramaActivoSemestrexIdDTO "+programaActivoSemestreAsignaturaDTO.getIdAsignaturaProgramaActivoSemestre());
		AsignaturaProgramaActivoSemestreModel programaActivoSemestreAsignatura = new AsignaturaProgramaActivoSemestreModel();
		programaActivoSemestreAsignatura = AsignaturaProgramaActivoSemestreDTOMapper.AsignaturaProgramaActivoSemestreDTOToAsignaturaProgramaActivoSemestreModel(programaActivoSemestreAsignaturaDTO);
		
		try {
			programaActivoSemestreAsignatura=factoryNegocioDAO.getAsignaturaProgramaActivoSemestreNegocioDAO().buscarAsignaturaProgramaActivoSemestrexIdModel(programaActivoSemestreAsignatura);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		programaActivoSemestreAsignaturaDTO = AsignaturaProgramaActivoSemestreDTOMapper.AsignaturaProgramaActivoSemestreModelToAsignaturaProgramaActivoSemestreDTO(programaActivoSemestreAsignatura);
		objLog.info("FIN - buscarAsignaturaProgramaActivoSemestrexIdDTO "+programaActivoSemestreAsignaturaDTO.getIdAsignaturaProgramaActivoSemestre());
		return programaActivoSemestreAsignaturaDTO;
	}
	
	public List<AsignaturaProgramaActivoSemestreDTO> listarAsignaturaProgramaActivoSemestreDTO() {
		objLog.info("INI - listarAsignaturaProgramaActivoSemestreesDTO");
		List<AsignaturaProgramaActivoSemestreDTO> listaAsignaturaProgramaActivoSemestreDTO=new ArrayList<AsignaturaProgramaActivoSemestreDTO>();
		List<AsignaturaProgramaActivoSemestreModel> listaAsignaturaProgramaActivoSemestrees = new ArrayList<AsignaturaProgramaActivoSemestreModel>();
		
		listaAsignaturaProgramaActivoSemestrees=factoryNegocioDAO.getAsignaturaProgramaActivoSemestreNegocioDAO().listarAsignaturaProgramaActivoSemestreModel();
		
		listaAsignaturaProgramaActivoSemestreDTO = AsignaturaProgramaActivoSemestreDTOMapper.ListAsignaturaProgramaActivoSemestreModelToListAsignaturaProgramaActivoSemestreDTO(listaAsignaturaProgramaActivoSemestrees);
		
		objLog.info("FIN - listarAsignaturaProgramaActivoSemestreesDTO "+listaAsignaturaProgramaActivoSemestreDTO.size());
		return listaAsignaturaProgramaActivoSemestreDTO;
	}
	
}
