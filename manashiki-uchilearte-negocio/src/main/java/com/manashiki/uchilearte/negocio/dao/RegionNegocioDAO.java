package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.RegionModel;

public interface RegionNegocioDAO{
	public RegionModel crearRegionModel(RegionModel objRegionModel);
	public RegionModel actualizarRegionModel(RegionModel objRegionModel);
	public RegionModel buscarRegionxIdModel(RegionModel objRegionModel) throws NegocioImplException;
	public List<RegionModel> listarRegionesModel();
	
}