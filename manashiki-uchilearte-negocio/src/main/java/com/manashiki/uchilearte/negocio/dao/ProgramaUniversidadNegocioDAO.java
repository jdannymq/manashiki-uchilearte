package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadModel;

public interface ProgramaUniversidadNegocioDAO{
	public ProgramaUniversidadModel crearProgramaUniversidadModel(ProgramaUniversidadModel objProgramaUniversidadModel);
	public ProgramaUniversidadModel actualizarProgramaUniversidadModel(ProgramaUniversidadModel objProgramaUniversidadModel);
	public ProgramaUniversidadModel buscarProgramaUniversidadxIdModel(ProgramaUniversidadModel objProgramaUniversidadModel) throws NegocioImplException;
	public List<ProgramaUniversidadModel> listarProgramaUniversidadModel();
	public List<ProgramaUniversidadModel> listarProgramaUniversidadPrecioModel();
	
}