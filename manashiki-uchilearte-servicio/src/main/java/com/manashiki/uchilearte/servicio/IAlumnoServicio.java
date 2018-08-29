package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;

public interface IAlumnoServicio{
	
	public AlumnoDTO crearAlumnoDTO(AlumnoDTO alumnoDTO);
	public AlumnoDTO actualizarAlumnoDTO(AlumnoDTO alumnoDTO);
	public AlumnoDTO buscarAlumnoxIdDTO(AlumnoDTO alumnoDTO) throws ServicioImplException;
	public AlumnoDTO buscarAlumnoxIdUsuarioxIdEstadoDTO(AlumnoDTO alumnoDTO) throws ServicioImplException;
	public List<AlumnoDTO> listarAlumnoDTO();
	public List<AlumnoDTO> listarAlumnoNoAsociadoToUsuario() throws ServicioImplException;
	public List<AlumnoDTO> listarAlumnoAsociadoToUsuario() throws ServicioImplException;
	public List<AlumnoDTO> listarAlumnoAsociadoToSeguridad() throws ServicioImplException;
	public List<AlumnoDTO> listarAlumnoNoAsociadoToSeguridad() throws ServicioImplException;
}
