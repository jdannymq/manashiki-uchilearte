package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.LogReservaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;

public interface LogReservaDAO{
	public LogReservaEntity crearLogReservaEntity(LogReservaEntity objLogReservaEntity);
	public LogReservaEntity actualizarLogReservaEntity(LogReservaEntity objLogReservaEntity);
	public LogReservaEntity buscarLogReservaxIdEntity(LogReservaEntity objLogReservaEntity) throws PersistenceImplException;
	public List<LogReservaEntity> listarLogReservaEntity();
	
}