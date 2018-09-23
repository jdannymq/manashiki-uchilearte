package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.RegionModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servicio.IRegionServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.RegionDTOMapper;

@Service
public class RegionServicio implements IRegionServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(RegionServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public RegionDTO crearRegionDTO(RegionDTO regionDTO) {
		objLog.info("INI - crearRegionDTO");
		RegionModel region = new RegionModel();
		region = RegionDTOMapper.RegionDTOToRegionModel(regionDTO);

		region = factoryNegocioDAO.getRegionNegocioDAO().crearRegionModel(region);
		
		regionDTO = RegionDTOMapper.RegionModelToRegionDTO(region);
		objLog.info("FIN - crearRegionDTO "+regionDTO.getIdRegion());
		return regionDTO;

	}

	public RegionDTO actualizarRegionDTO(RegionDTO regionDTO) {
		objLog.info("INI - actualizarRegionDTO "+regionDTO.getIdRegion());
		RegionModel region = new RegionModel();
		region = RegionDTOMapper.RegionDTOToRegionModel(regionDTO);

		region = factoryNegocioDAO.getRegionNegocioDAO().actualizarRegionModel(region);
		
		regionDTO = RegionDTOMapper.RegionModelToRegionDTO(region);
		objLog.info("FIN - actualizarRegionDTO "+regionDTO.getIdRegion());
		return regionDTO;

	}

	public RegionDTO buscarRegionxIdDTO(RegionDTO regionDTO)throws ServicioImplException{
		objLog.info("INI - buscarRegionxIdDTO "+regionDTO.getIdRegion());
		RegionModel region = new RegionModel();
		region = RegionDTOMapper.RegionDTOToRegionModel(regionDTO);

		try {
			region=factoryNegocioDAO.getRegionNegocioDAO().buscarRegionxIdModel(region);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		regionDTO = RegionDTOMapper.RegionModelToRegionDTO(region);
		
		objLog.info("FIN - buscarRegionxIdDTO "+regionDTO.getIdRegion());
		return regionDTO;
	}

	public List<RegionDTO> listarRegionesDTO() {
		objLog.info("INI - listarRegionesDTO ");
		List<RegionDTO> listaRegionDTO=new ArrayList<RegionDTO>();
		List<RegionModel> listaRegiones = new ArrayList<RegionModel>();

		listaRegiones=factoryNegocioDAO.getRegionNegocioDAO().listarRegionesModel();

		listaRegionDTO = RegionDTOMapper.ListRegionModelToListRegionDTO(listaRegiones);
		
		objLog.info("FIN - listarRegionesDTO "+listaRegionDTO.size());
		return listaRegionDTO;
	}

}
