package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.AlumnoDAO;
import com.manashiki.uchilearte.logica.entidad.AlumnoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.AlumnoRepository;


@Repository
public class AlumnoDAOImpl implements AlumnoDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(AlumnoDAOImpl.class);
	
	@Autowired
	AlumnoRepository alumnoRepository;
	
	/**
	 * Crea un Entidad Alumno en la base de datos
	 * @param  Alumno Alumno
	 * @return void
	 * @throws no lanza excepciones
	 */
	public AlumnoEntity crearAlumnoEntity(AlumnoEntity objAlumnoEntity){
		objLog.info("INI - crearAlumnoEntity");
		AlumnoEntity AlumnoEntity = alumnoRepository.save(objAlumnoEntity);
		objLog.info("FIN - crearAlumnoEntity "+objAlumnoEntity.getIdAlumnoUchile());
		return AlumnoEntity;
	}
	
	/**
	 * Actualiza un Entidad Alumno en la base de datos 
	 * @param  Alumno Alumno
	 * @return void
	 * @throws no lanza excepciones
	 */
	public AlumnoEntity actualizarAlumnoEntity(AlumnoEntity objAlumnoEntity) {
		objLog.info("INI - actualizarAlumnoEntity");
		AlumnoEntity AlumnoEntity = alumnoRepository.save(objAlumnoEntity); //Necesita el Id
		objLog.info("FIN - actualizarAlumnoEntity "+objAlumnoEntity.getIdAlumnoUchile()+" "+objAlumnoEntity.getEstadoAlumnosUchile());
		return AlumnoEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad Alumno por el id
	 * @param  Alumno Alumno
	 * @return metApl Alumno
	 * @throws PersistenceImplException
	 */
	public AlumnoEntity buscarAlumnoxIdEntity(AlumnoEntity objAlumnoEntity) throws PersistenceImplException {
		objLog.info("INI - buscarAlumnoxIdEntity");
		AlumnoEntity metApl = null;
 		try {
 			metApl = alumnoRepository.findOne(objAlumnoEntity.getIdAlumnoUchile());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		if(metApl!=null){
 			if(metApl.getIdAlumnoUchile()!=null && metApl.getEstadoAlumnosUchile()!=null){
 			objLog.info("FIN - buscarAlumnoxIdEntity "+metApl.getIdAlumnoUchile()+" "+metApl.getEstadoAlumnosUchile());
 			}
 		}
 		return metApl;
	}
	
	public AlumnoEntity buscarAlumnoxIdUsuarioxEstadoEntity(AlumnoEntity objAlumnoEntity) throws PersistenceImplException {
		objLog.info("INI - buscarAlumnoxIdUsuarioxEstadoEntity");
		AlumnoEntity metApl = null;
 		try {
 			metApl = alumnoRepository.findByFkIdUsuarioAndEstadoAlumnosUchile(objAlumnoEntity.getFkIdUsuario(), objAlumnoEntity.getEstadoAlumnosUchile());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		if(metApl!=null){
 			if(metApl.getIdAlumnoUchile()!=null && metApl.getEstadoAlumnosUchile()!=null){
 			objLog.info("FIN - buscarAlumnoxIdUsuarioxEstadoEntity "+metApl.getIdAlumnoUchile()+" "+metApl.getEstadoAlumnosUchile());
 			}
 		}
 		return metApl;
	}
	
	
	/**
	 * Método que devuelve listado de Todas Alumnoes almacenadas
	 * @return lista List<Alumno>
	 * @throws no lanza excepciones
	 */
	public List<AlumnoEntity> listarAlumnoEntity(){
		objLog.info("INI - listarAlumnoesEntity");
		List<AlumnoEntity> lista = null;
		try {
			lista = alumnoRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarAlumnoesEntity "+lista.size());
 		}
		
		return lista;
	}
	
	public List<AlumnoEntity> listarAlumnoNoAsociadoToUsuarioEntity(){
		objLog.info("INI - listarAlumnoNoAsociadoUsuarioEntity");
		List<AlumnoEntity> lista = null;
		try {
			lista = alumnoRepository.findByFkIdUsuarioIsNull();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarAlumnoNoAsociadoUsuarioEntity "+lista.size());
 		}
		
		return lista;
	}
	
	public List<AlumnoEntity> listarAlumnoNoAsociadoToSeguridadEntity(){
		objLog.info("INI - listarAlumnoAsociadoSeguridadEntity");
		List<AlumnoEntity> lista = null;
		try {
			lista = alumnoRepository.findByFkIdUsuarioIsNotNull();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarAlumnoAsociadoSeguridadEntity "+lista.size());
 		}
		
		return lista;
	}

}
