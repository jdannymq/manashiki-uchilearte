package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.SemestreTemporadaModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SemestreTemporadaDTO;
import com.manashiki.uchilearte.servicio.ISemestreTemporadaServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.SemestreTemporadaDTOMapper;

@Component
public class SemestreTemporadaServicio implements ISemestreTemporadaServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(SemestreTemporadaServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public SemestreTemporadaDTO crearSemestreTemporadaDTO(SemestreTemporadaDTO semestreTemporadaDTO) {
		objLog.info("INI - crearSemestreTemporadaDTO");
		SemestreTemporadaModel semestreTemporada = new SemestreTemporadaModel();
		semestreTemporada = SemestreTemporadaDTOMapper.SemestreTemporadaDTOToSemestreTemporadaModel(semestreTemporadaDTO);
		
		
		semestreTemporada = factoryNegocioDAO.getSemestreTemporadaNegocioDAO().crearSemestreTemporadaModel(semestreTemporada);
		
		semestreTemporadaDTO = SemestreTemporadaDTOMapper.SemestreTemporadaModelToSemestreTemporadaDTO(semestreTemporada);
		objLog.info("FIN - crearSemestreTemporadaDTO "+semestreTemporadaDTO.getIdSemestreTemporada());
		return semestreTemporadaDTO;
	}

	public SemestreTemporadaDTO actualizarSemestreTemporadaDTO(SemestreTemporadaDTO semestreTemporadaDTO) {
		objLog.info("INI - actualizarSemestreTemporadaDTO "+semestreTemporadaDTO.getIdSemestreTemporada());
		SemestreTemporadaModel semestreTemporada = new SemestreTemporadaModel();
		semestreTemporada = SemestreTemporadaDTOMapper.SemestreTemporadaDTOToSemestreTemporadaModel(semestreTemporadaDTO);
		
		semestreTemporada = factoryNegocioDAO.getSemestreTemporadaNegocioDAO().actualizarSemestreTemporadaModel(semestreTemporada);
		
		semestreTemporadaDTO = SemestreTemporadaDTOMapper.SemestreTemporadaModelToSemestreTemporadaDTO(semestreTemporada);
		objLog.info("FIN - actualizarSemestreTemporadaDTO "+semestreTemporadaDTO.getIdSemestreTemporada());
		return semestreTemporadaDTO;
	}

	public SemestreTemporadaDTO buscarSemestreTemporadaxIdDTO(SemestreTemporadaDTO semestreTemporadaDTO) throws ServicioImplException {
		objLog.info("INI - buscarSemestreTemporadaxIdDTO "+semestreTemporadaDTO.getIdSemestreTemporada());
		SemestreTemporadaModel semestreTemporada = new SemestreTemporadaModel();
		semestreTemporada = SemestreTemporadaDTOMapper.SemestreTemporadaDTOToSemestreTemporadaModel(semestreTemporadaDTO);
		
		try {
			semestreTemporada=factoryNegocioDAO.getSemestreTemporadaNegocioDAO().buscarSemestreTemporadaxIdModel(semestreTemporada);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		semestreTemporadaDTO = SemestreTemporadaDTOMapper.SemestreTemporadaModelToSemestreTemporadaDTO(semestreTemporada);
		objLog.info("FIN - buscarSemestreTemporadaxIdDTO "+semestreTemporadaDTO.getIdSemestreTemporada());
		return semestreTemporadaDTO;
	}
	
	public List<SemestreTemporadaDTO> listarSemestreTemporadaDTO() {
		objLog.info("INI - listarSemestreTemporadaesDTO");
		List<SemestreTemporadaDTO> listaSemestreTemporadaDTO=new ArrayList<SemestreTemporadaDTO>();
		List<SemestreTemporadaModel> listaSemestreTemporadaes = new ArrayList<SemestreTemporadaModel>();
		
		listaSemestreTemporadaes=factoryNegocioDAO.getSemestreTemporadaNegocioDAO().listarSemestreTemporadaModel();
		
		listaSemestreTemporadaDTO = SemestreTemporadaDTOMapper.ListSemestreTemporadaModelToListSemestreTemporadaDTO(listaSemestreTemporadaes);
		
		objLog.info("FIN - listarSemestreTemporadaesDTO "+listaSemestreTemporadaDTO.size());
		return listaSemestreTemporadaDTO;
	}
	
}
