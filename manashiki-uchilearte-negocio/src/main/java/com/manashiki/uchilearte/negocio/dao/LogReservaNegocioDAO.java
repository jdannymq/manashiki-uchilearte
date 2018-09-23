package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.LogReservaModel;



public interface LogReservaNegocioDAO{
	public LogReservaModel crearLogReservaModel(LogReservaModel objLogReservaModel);
	public LogReservaModel actualizarLogReservaModel(LogReservaModel objLogReservaModel);
	public LogReservaModel buscarLogReservaxIdModel(LogReservaModel objLogReservaModel) throws NegocioImplException;
	public List<LogReservaModel> listarLogReservaModel();
	
}