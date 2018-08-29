package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.SemestreTemporadaDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;



public interface ISemestreTemporadaServicio{
	
	public SemestreTemporadaDTO crearSemestreTemporadaDTO(SemestreTemporadaDTO objSemestreTemporadaDTO );
	public SemestreTemporadaDTO actualizarSemestreTemporadaDTO(SemestreTemporadaDTO objSemestreTemporadaDTO );
 	public SemestreTemporadaDTO buscarSemestreTemporadaxIdDTO(SemestreTemporadaDTO objSemestreTemporadaDTO ) throws ServicioImplException;
 	public List<SemestreTemporadaDTO> listarSemestreTemporadaDTO();
}
