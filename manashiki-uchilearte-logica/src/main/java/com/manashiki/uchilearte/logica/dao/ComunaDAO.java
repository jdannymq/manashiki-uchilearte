package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ComunaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;



public interface ComunaDAO{
	public ComunaEntity crearComunaEntity(ComunaEntity objComunaEntity);
	public ComunaEntity actualizarComunaEntity(ComunaEntity objComunaEntity);
	public ComunaEntity buscarComunaxIdEntity(ComunaEntity objComunaEntity) throws PersistenceImplException;
	public List<ComunaEntity> listarComunasEntity();
	public List<ComunaEntity> listarComunasEntityxRegion(ComunaEntity objComunaEntity);
	/**************************************************/
	
}