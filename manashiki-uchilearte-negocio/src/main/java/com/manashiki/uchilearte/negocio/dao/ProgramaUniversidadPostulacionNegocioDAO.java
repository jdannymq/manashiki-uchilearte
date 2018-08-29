package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadPostulacionModel;

public interface ProgramaUniversidadPostulacionNegocioDAO{
	
	public ProgramaUniversidadPostulacionModel crearProgramaUniversidadPostulacionModel(ProgramaUniversidadPostulacionModel objProgramaUniversidadPostulacionModel);
	public ProgramaUniversidadPostulacionModel actualizarProgramaUniversidadPostulacionModel(ProgramaUniversidadPostulacionModel objProgramaUniversidadPostulacionModel);
	public ProgramaUniversidadPostulacionModel buscarProgramaUniversidadPostulacionxIdModel(ProgramaUniversidadPostulacionModel objProgramaUniversidadPostulacionModel) throws NegocioImplException;
	public List<ProgramaUniversidadPostulacionModel> listarProgramaUniversidadPostulacionModel();
	public List<ProgramaUniversidadPostulacionModel> listarProgramaUniversidadPostulacionPrecioModel();
	
}