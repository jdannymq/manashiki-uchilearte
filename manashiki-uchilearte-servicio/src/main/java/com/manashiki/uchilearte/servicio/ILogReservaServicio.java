package com.manashiki.uchilearte.servicio;

import java.util.List;

import com.manashiki.uchilearte.servdto.transaccion.LogReservaDTO;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;


public interface ILogReservaServicio{
	public LogReservaDTO crearLogReservaDTO(LogReservaDTO objLogReservaDTO);
	public LogReservaDTO actualizarLogReservaDTO(LogReservaDTO objLogReservaDTO);
	public LogReservaDTO buscarLogReservaxIdDTO(LogReservaDTO objLogReservaDTO) throws ServicioImplException;
	public List<LogReservaDTO> listarLogReservaDTO();
	
}