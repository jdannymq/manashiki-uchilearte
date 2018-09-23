package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;


public interface INegocioSolicitudServicio{
	public NegocioSolicitudDTO crearNegocioSolicitudDTO(NegocioSolicitudDTO objNegocioSolicitudDTO);
	public NegocioSolicitudDTO actualizarNegocioSolicitudDTO(NegocioSolicitudDTO objNegocioSolicitudDTO);
	public NegocioSolicitudDTO buscarNegocioSolicitudxIdDTO(NegocioSolicitudDTO objNegocioSolicitudDTO) throws ServicioImplException;
	public List<NegocioSolicitudDTO> listarNegocioSolicitudDTO();
	
}