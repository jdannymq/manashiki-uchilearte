package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;

public interface ITipoSolicitudServicio{
	
	public TipoSolicitudDTO crearTipoSolicitudDTO(TipoSolicitudDTO objTipoSolicitudDTO);
	public TipoSolicitudDTO actualizarTipoSolicitudDTO(TipoSolicitudDTO objTipoSolicitudDTO);
	public TipoSolicitudDTO buscarTipoSolicitudxIdDTO(TipoSolicitudDTO objTipoSolicitudDTO) throws ServicioImplException;
	public List<TipoSolicitudDTO> listarTipoSolicitudesDTO();
	
}