package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;


public interface IFinalidadCertificadoServicio{
	public FinalidadCertificadoDTO crearFinalidadCertificadoDTO(FinalidadCertificadoDTO objFinalidadCertificadoDTO);
	public FinalidadCertificadoDTO actualizarFinalidadCertificadoDTO(FinalidadCertificadoDTO objFinalidadCertificadoDTO);
	public FinalidadCertificadoDTO buscarFinalidadCertificadoxIdDTO(FinalidadCertificadoDTO objFinalidadCertificadoDTO) throws ServicioImplException;
	public List<FinalidadCertificadoDTO> listarFinalidadCertificadosDTO();
	
}