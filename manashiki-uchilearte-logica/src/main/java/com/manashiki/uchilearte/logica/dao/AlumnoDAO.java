package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.AlumnoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;

public interface AlumnoDAO{
	
	public AlumnoEntity crearAlumnoEntity(AlumnoEntity objAlumnoEntity );
	public AlumnoEntity actualizarAlumnoEntity(AlumnoEntity objAlumnoEntity );
 	public AlumnoEntity buscarAlumnoxIdEntity(AlumnoEntity objAlumnoEntity ) throws PersistenceImplException;
 	public AlumnoEntity buscarAlumnoxIdUsuarioxEstadoEntity(AlumnoEntity objAlumnoEntity ) throws PersistenceImplException;
 	public List<AlumnoEntity> listarAlumnoEntity();
}
