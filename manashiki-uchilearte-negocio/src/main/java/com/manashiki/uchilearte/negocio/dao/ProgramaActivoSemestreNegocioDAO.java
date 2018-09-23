package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ProgramaActivoSemestreModel;

public interface ProgramaActivoSemestreNegocioDAO{
	
	public ProgramaActivoSemestreModel crearProgramaActivoSemestreModel(ProgramaActivoSemestreModel objProgramaActivoSemestreModel );
	public ProgramaActivoSemestreModel actualizarProgramaActivoSemestreModel(ProgramaActivoSemestreModel objProgramaActivoSemestreModel );
 	public ProgramaActivoSemestreModel buscarProgramaActivoSemestrexIdModel(ProgramaActivoSemestreModel objProgramaActivoSemestreModel ) throws NegocioImplException;
 	public List<ProgramaActivoSemestreModel> listarProgramaActivoSemestreModel();
}
