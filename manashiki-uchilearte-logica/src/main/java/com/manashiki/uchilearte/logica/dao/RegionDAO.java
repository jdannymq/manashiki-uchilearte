package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.RegionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;



public interface RegionDAO{
	public RegionEntity crearRegionEntity(RegionEntity objRegionEntity);
	public RegionEntity actualizarRegionEntity(RegionEntity objRegionEntity);
	public RegionEntity buscarRegionxIdEntity(RegionEntity objRegionEntity) throws PersistenceImplException;
	public List<RegionEntity> listarRegionesEntity();
	
}