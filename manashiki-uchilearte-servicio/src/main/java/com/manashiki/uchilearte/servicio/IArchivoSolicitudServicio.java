package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;

public interface IArchivoSolicitudServicio{
	public ArchivoSolicitudDTO crearArchivoSolicitudDTO(ArchivoSolicitudDTO objArchivoSolicitudDTO);
	public ArchivoSolicitudDTO actualizarArchivoSolicitudDTO(ArchivoSolicitudDTO objArchivoSolicitudDTO);
	public ArchivoSolicitudDTO buscarArchivoSolicitudIdDTO(ArchivoSolicitudDTO objArchivoSolicitudDTO) throws ServicioImplException;
	public List<ArchivoSolicitudDTO> listarArchivoSolicitudesDTO();
	
}