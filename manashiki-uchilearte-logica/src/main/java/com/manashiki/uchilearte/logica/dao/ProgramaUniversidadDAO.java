package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;



public interface ProgramaUniversidadDAO{
	public ProgramaUniversidadEntity crearProgramaUniversidadEntity(ProgramaUniversidadEntity objProgramaUniversidadEntity);
	public ProgramaUniversidadEntity actualizarProgramaUniversidadEntity(ProgramaUniversidadEntity objProgramaUniversidadEntity);
	public ProgramaUniversidadEntity buscarProgramaUniversidadxIdEntity(ProgramaUniversidadEntity objProgramaUniversidadEntity) throws PersistenceImplException;
	public List<ProgramaUniversidadEntity> listarProgramaUniversidadesEntity();
	public List<ProgramaUniversidadEntity> listarProgramaUniversidadesOrdenPrioridad();
	
}