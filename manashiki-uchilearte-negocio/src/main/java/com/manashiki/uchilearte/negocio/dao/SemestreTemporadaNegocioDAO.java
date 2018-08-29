package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.SemestreTemporadaModel;


public interface SemestreTemporadaNegocioDAO{
	
	public SemestreTemporadaModel crearSemestreTemporadaModel(SemestreTemporadaModel objSemestreTemporadaModel );
	public SemestreTemporadaModel actualizarSemestreTemporadaModel(SemestreTemporadaModel objSemestreTemporadaModel );
 	public SemestreTemporadaModel buscarSemestreTemporadaxIdModel(SemestreTemporadaModel objSemestreTemporadaModel ) throws NegocioImplException;
 	public List<SemestreTemporadaModel> listarSemestreTemporadaModel();
}
