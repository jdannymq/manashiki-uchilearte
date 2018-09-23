package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;


public interface IComunaServicio{
	public ComunaDTO crearComunaDTO(ComunaDTO objComunaDTO);
	public ComunaDTO actualizarComunaDTO(ComunaDTO objComunaDTO);
	public ComunaDTO buscarComunaxIdDTO(ComunaDTO objComunaDTO) throws ServicioImplException;
	public List<ComunaDTO> listarComunasDTO();
	public List<ComunaDTO> listarComunasDTOxRegion(ComunaDTO objComunaDTO);
	/**************************************************/
	
}