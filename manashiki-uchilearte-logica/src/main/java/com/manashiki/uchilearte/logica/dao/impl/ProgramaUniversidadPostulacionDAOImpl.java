package com.manashiki.uchilearte.logica.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.ProgramaUniversidadPostulacionDAO;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadPostulacionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.ProgramaUniversidadPostulacionRepository;

@Repository
public class ProgramaUniversidadPostulacionDAOImpl implements ProgramaUniversidadPostulacionDAO{

	private static final Logger objLog = LoggerFactory.getLogger(ProgramaUniversidadPostulacionDAOImpl.class);
	
	@Autowired
	ProgramaUniversidadPostulacionRepository programaUniversidadPostulacionRepository;
	
	/**
	 * Crea una Entidad ProgramaUniversidad en la base de datos
	 * @param  aplicacion ProgramaUniversidad
	 * @return void
	 * @exception no lanza excepciones
	 */
	public ProgramaUniversidadPostulacionEntity crearProgramaUniversidadPostulacionEntity(ProgramaUniversidadPostulacionEntity objProgramaUniversidadPostulacionEntity){
		objLog.info("INI - crearProgramaUniversidadPostulacionEntity ");
		ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity = programaUniversidadPostulacionRepository.save(objProgramaUniversidadPostulacionEntity);
		objLog.info("FIN - crearProgramaUniversidadPostulacionEntity "+objProgramaUniversidadPostulacionEntity.getIdProgramaUniversidadPostulacion());
		return programaUniversidadPostulacionEntity;
	}
	
	/**
	 * Actualiza un Entidad ProgramaUniversidad en la base de datos 
	 * @param  aplicacion ProgramaUniversidad
	 * @return void
	 * @exception no lanza excepciones
	 */
	public ProgramaUniversidadPostulacionEntity actualizarProgramaUniversidadPostulacionEntity(ProgramaUniversidadPostulacionEntity objProgramaUniversidadPostulacionEntity){
		objLog.info("INI - actualizarProgramaUniversidadPostulacionEntity "+objProgramaUniversidadPostulacionEntity.getIdProgramaUniversidadPostulacion());
		ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity = programaUniversidadPostulacionRepository.save(objProgramaUniversidadPostulacionEntity);
		objLog.info("FIN - actualizarProgramaUniversidadPostulacionEntity "+objProgramaUniversidadPostulacionEntity.getIdProgramaUniversidadPostulacion());
		return programaUniversidadPostulacionEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad ProgramaUniversidad por el id
	 * @param  aplicacion ProgramaUniversidad
	 * @return apliEmpresa ProgramaUniversidad
	 * @exception no lanza excepciones
	 */
	public ProgramaUniversidadPostulacionEntity buscarProgramaUniversidadPostulacionxIdEntity(ProgramaUniversidadPostulacionEntity objProgramaUniversidadPostulacionEntity) throws PersistenceImplException{
		objLog.info("INI - buscarProgramaUniversidadPostulacionxIdEntity "+objProgramaUniversidadPostulacionEntity.getIdProgramaUniversidadPostulacion());
		ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity = null;
 		try {
 			programaUniversidadPostulacionEntity = programaUniversidadPostulacionRepository.findOne(objProgramaUniversidadPostulacionEntity.getIdProgramaUniversidadPostulacion());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(programaUniversidadPostulacionEntity!=null){
 			if(programaUniversidadPostulacionEntity.getIdProgramaUniversidadPostulacion()!=null){
 				objLog.info("FIN - buscarProgramaUniversidadPostulacionxIdEntity "+programaUniversidadPostulacionEntity.getIdProgramaUniversidadPostulacion());
 			}
 		}
 		
		return programaUniversidadPostulacionEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las ProgramaUniversidads
	 * @return lista List<ProgramaUniversidad>
	 * @exception no lanza excepciones
	 */
	public List<ProgramaUniversidadPostulacionEntity> listarProgramaUniversidadPostulacionEntity(){
		objLog.info("INI - listarProgramaUniversidadPostulacionEntity");
		List<ProgramaUniversidadPostulacionEntity> lista = null;
		try {
			lista = programaUniversidadPostulacionRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarProgramaUniversidadPostulacionEntity "+lista.size());
 		}
		
		return lista;
	}
	
	/**
	 * Método que devuelve listado de Todas las ProgramaUniversidads
	 * @return lista List<ProgramaUniversidad>
	 * @exception no lanza excepciones
	 */
	public List<ProgramaUniversidadPostulacionEntity> listarProgramaUniversidadPostulacionOrdenPrioridad(){
		objLog.info("INI - listarProgramaUniversidadPostulacionOrdenPrioridad");
		List<ProgramaUniversidadPostulacionEntity> lista = null;
		List<ProgramaUniversidadPostulacionEntity> metLista = null;
		try {
			metLista = programaUniversidadPostulacionRepository.findAllByOrderByClasificacionProgramaPostulacionAscPrioridadAsc();
			lista = new ArrayList<ProgramaUniversidadPostulacionEntity>();
			for(ProgramaUniversidadPostulacionEntity puE :metLista){
				if(puE.getClasificacionProgramaPostulacion()>0 && puE.getPrioridad()>0 &&  !puE.getCostoProgramaUniversidadPostulacion().equals("-")){
//					System.out.println(puE.getClasificacionProgramaPostulacion() + " :: " +puE.getPrioridad() +" :: " +puE.getNombreProgramaUniversidadPostulacion()+" :: " +puE.getCostoProgramaUniversidadPostulacion());
					lista.add(puE);
				}
			}
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarProgramaUniversidadPostulacionOrdenPrioridad "+lista.size());
 		}
		
		return lista;
	}
	
}
