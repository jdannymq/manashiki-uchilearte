package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;

public interface ITipoCertificadoServicio{
	public TipoCertificadoDTO crearTipoCertificadoDTO(TipoCertificadoDTO objTipoCertificadoDTO);
	public TipoCertificadoDTO actualizarTipoCertificadoDTO(TipoCertificadoDTO objTipoCertificadoDTO);
	public TipoCertificadoDTO buscarTipoCertificadoxIdDTO(TipoCertificadoDTO objTipoCertificadoDTO) throws ServicioImplException;
	public List<TipoCertificadoDTO> listarTipoCertificadosDTO();
	
}