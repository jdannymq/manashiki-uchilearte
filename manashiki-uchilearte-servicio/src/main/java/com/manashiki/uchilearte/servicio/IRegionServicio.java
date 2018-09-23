package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;

public interface IRegionServicio{
	public RegionDTO crearRegionDTO(RegionDTO objRegionDTO);
	public RegionDTO actualizarRegionDTO(RegionDTO objRegionDTO);
	public RegionDTO buscarRegionxIdDTO(RegionDTO objRegionDTO) throws ServicioImplException;
	public List<RegionDTO> listarRegionesDTO();
	
}