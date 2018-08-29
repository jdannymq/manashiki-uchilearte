package com.manashiki.uchilearte.logica.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.ProgramaUniversidadDAO;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.ProgramaUniversidadRepository;

@Repository
public class ProgramaUniversidadDAOImpl implements ProgramaUniversidadDAO{

	private static final Logger objLog = LoggerFactory.getLogger(ProgramaUniversidadDAOImpl.class);
	
	
	@Autowired
	ProgramaUniversidadRepository programaUniversidadRepository;
	
	/**
	 * Crea una Entidad ProgramaUniversidad en la base de datos
	 * @param  aplicacion ProgramaUniversidad
	 * @return void
	 * @exception no lanza excepciones
	 */
	public ProgramaUniversidadEntity crearProgramaUniversidadEntity(ProgramaUniversidadEntity objProgramaUniversidadEntity){
		objLog.info("INI - crearProgramaUniversidadEntity ");
		ProgramaUniversidadEntity programaUniversidadEntity = programaUniversidadRepository.save(objProgramaUniversidadEntity);
		objLog.info("FIN - crearProgramaUniversidadEntity "+objProgramaUniversidadEntity.getIdProgramaUniversidad());
		return programaUniversidadEntity;
	}
	
	/**
	 * Actualiza un Entidad ProgramaUniversidad en la base de datos 
	 * @param  aplicacion ProgramaUniversidad
	 * @return void
	 * @exception no lanza excepciones
	 */
	public ProgramaUniversidadEntity actualizarProgramaUniversidadEntity(ProgramaUniversidadEntity objProgramaUniversidadEntity){
		objLog.info("INI - actualizarProgramaUniversidadEntity "+objProgramaUniversidadEntity.getIdProgramaUniversidad());
		ProgramaUniversidadEntity programaUniversidadEntity = programaUniversidadRepository.save(objProgramaUniversidadEntity);
		objLog.info("FIN - actualizarProgramaUniversidadEntity "+objProgramaUniversidadEntity.getIdProgramaUniversidad());
		return programaUniversidadEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad ProgramaUniversidad por el id
	 * @param  aplicacion ProgramaUniversidad
	 * @return apliEmpresa ProgramaUniversidad
	 * @exception no lanza excepciones
	 */
	public ProgramaUniversidadEntity buscarProgramaUniversidadxIdEntity(ProgramaUniversidadEntity objProgramaUniversidadEntity) throws PersistenceImplException{
		objLog.info("INI - buscarProgramaUniversidadxIdEntity "+objProgramaUniversidadEntity.getIdProgramaUniversidad());
		ProgramaUniversidadEntity programaUniversidadEntity = null;
 		try {
 			programaUniversidadEntity = programaUniversidadRepository.findOne(objProgramaUniversidadEntity.getIdProgramaUniversidad());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(programaUniversidadEntity!=null){
 			if(programaUniversidadEntity.getIdProgramaUniversidad()!=null){
 				objLog.info("FIN - buscarProgramaUniversidadxIdEntity "+programaUniversidadEntity.getIdProgramaUniversidad());
 			}
 		}
 		
 		
		return programaUniversidadEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las ProgramaUniversidads
	 * @return lista List<ProgramaUniversidad>
	 * @exception no lanza excepciones
	 */
	public List<ProgramaUniversidadEntity> listarProgramaUniversidadesEntity(){
		objLog.info("INI - listarProgramaUniversidadesEntity");
		List<ProgramaUniversidadEntity> lista = null;
		try {
			lista = programaUniversidadRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarProgramaUniversidadesEntity "+lista.size());
 		}
		
		return lista;
	}
	
	/**
	 * Método que devuelve listado de Todas las ProgramaUniversidads
	 * @return lista List<ProgramaUniversidad>
	 * @exception no lanza excepciones
	 */
	public List<ProgramaUniversidadEntity> listarProgramaUniversidadesOrdenPrioridad(){
		objLog.info("INI - listarProgramaUniversidadesOrdenPrioridad");
		List<ProgramaUniversidadEntity> lista = null;
		List<ProgramaUniversidadEntity> metLista = null;
		try {
			metLista = programaUniversidadRepository.findAllByOrderByClasificacionProgramaAsc();
			lista = new ArrayList<ProgramaUniversidadEntity>();
			for(ProgramaUniversidadEntity puE :metLista){
				if(puE.getClasificacionPrograma()>0){
					lista.add(puE);
				}
			}
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarProgramaUniversidadesOrdenPrioridad "+lista.size());
 		}
		
		return lista;
	}
	
}
