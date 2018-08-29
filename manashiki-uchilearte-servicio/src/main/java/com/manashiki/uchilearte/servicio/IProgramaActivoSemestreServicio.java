package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;

public interface IProgramaActivoSemestreServicio{
	
	public ProgramaActivoSemestreDTO crearProgramaActivoSemestreDTO(ProgramaActivoSemestreDTO objProgramaActivoSemestreDTO );
	public ProgramaActivoSemestreDTO actualizarProgramaActivoSemestreDTO(ProgramaActivoSemestreDTO objProgramaActivoSemestreDTO );
 	public ProgramaActivoSemestreDTO buscarProgramaActivoSemestrexIdDTO(ProgramaActivoSemestreDTO objProgramaActivoSemestreDTO ) throws ServicioImplException;
 	public List<ProgramaActivoSemestreDTO> listarProgramaActivoSemestreDTO();
}
