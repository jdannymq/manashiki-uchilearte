package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.AlumnoModel;


public interface AlumnoNegocioDAO{
	
	public AlumnoModel crearAlumnoModel(AlumnoModel objAlumnoModel );
	public AlumnoModel actualizarAlumnoModel(AlumnoModel objAlumnoModel );
 	public AlumnoModel buscarAlumnoxIdModel(AlumnoModel objAlumnoModel ) throws NegocioImplException;
 	public AlumnoModel buscarAlumnoxIdUsuarioxEstadoModel(AlumnoModel objAlumnoModel ) throws NegocioImplException;
 	public List<AlumnoModel> listarAlumnoModel();
}
