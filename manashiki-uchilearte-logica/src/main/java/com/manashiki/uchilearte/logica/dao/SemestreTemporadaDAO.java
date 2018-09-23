package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.SemestreTemporadaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;

public interface SemestreTemporadaDAO{
	
	public SemestreTemporadaEntity crearSemestreTemporadaEntity(SemestreTemporadaEntity objSemestreTemporadaEntity );
	public SemestreTemporadaEntity actualizarSemestreTemporadaEntity(SemestreTemporadaEntity objSemestreTemporadaEntity );
 	public SemestreTemporadaEntity buscarSemestreTemporadaxIdEntity(SemestreTemporadaEntity objSemestreTemporadaEntity ) throws PersistenceImplException;
 	public List<SemestreTemporadaEntity> listarSemestreTemporadaEntity();
// 	public List<SemestreTemporadaEntity> listarSemestreEntreFechaActivacion(SemestreTemporadaEntity objSemestreTemporadaInicialEntity);
}
