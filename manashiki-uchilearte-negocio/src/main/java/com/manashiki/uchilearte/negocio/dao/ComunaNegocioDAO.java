package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ComunaModel;

public interface ComunaNegocioDAO{
	public ComunaModel crearComunaModel(ComunaModel objComunaModel);
	public ComunaModel actualizarComunaModel(ComunaModel objComunaModel);
	public ComunaModel buscarComunaxIdModel(ComunaModel objComunaModel) throws NegocioImplException;
	public List<ComunaModel> listarComunasModel();
	public List<ComunaModel> listarComunasModelxRegion(ComunaModel objComunaModel);
	/**************************************************/
	
}