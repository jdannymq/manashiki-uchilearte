package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;

public interface ISolicitudAcademicaServicio{
	
	public SolicitudAcademicaDTO crearSolicitudAcademicaDTO(SolicitudAcademicaDTO objSolicitudAcademicaDTO);
	public SolicitudAcademicaDTO actualizarSolicitudAcademicaDTO(SolicitudAcademicaDTO objSolicitudAcademicaDTO);
	public SolicitudAcademicaDTO buscarSolicitudAcademicaxIdDTO(SolicitudAcademicaDTO objSolicitudAcademicaDTO) throws ServicioImplException;
	public SolicitudAcademicaDTO buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaDTO(SolicitudAcademicaDTO objSolicitudAcademicaDTO) throws ServicioImplException;
//	public SolicitudAcademicaDTO buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaDTO(SolicitudAcademicaDTO objSolicitudAcademicaDTO) throws ServicioImplException;
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicasDTO();
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaDTO(SolicitudAcademicaDTO objSolicitudAcademicaDTO);
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicaxTipoSolicitudDTO(SolicitudAcademicaDTO objSolicitudAcademicaDTO);
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicaxEntreFechasDTO(SolicitudAcademicaDTO solicitudAcademicaDTOInicial, SolicitudAcademicaDTO solicitudAcademicaDTOFinal);
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicaxEstadoDTO(SolicitudAcademicaDTO objSolicitudAcademicaDTO);
	
}