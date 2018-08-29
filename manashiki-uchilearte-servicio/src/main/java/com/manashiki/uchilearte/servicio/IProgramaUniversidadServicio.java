package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;

public interface IProgramaUniversidadServicio{
	public ProgramaUniversidadDTO crearProgramaUniversidadDTO(ProgramaUniversidadDTO objProgramaUniversidadDTO);
	public ProgramaUniversidadDTO actualizarProgramaUniversidadDTO(ProgramaUniversidadDTO objProgramaUniversidadDTO);
	public ProgramaUniversidadDTO buscarProgramaUniversidadxIdDTO(ProgramaUniversidadDTO objProgramaUniversidadDTO) throws ServicioImplException;
	public List<ProgramaUniversidadDTO> listarProgramaUniversidadesDTO(); //Las Muestra Ordenadas,	
//	de los programas ya ordenados, mostrar solo los que tengan precio.
	public List<ProgramaUniversidadDTO> listarProgramaUniversidadesConPrecioDTO();
	
}