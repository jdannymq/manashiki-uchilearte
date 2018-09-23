package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.ProgramaActivoSemestreDAO;
import com.manashiki.uchilearte.logica.entidad.ProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.ProgramaActivoSemestreRepository;


@Repository
public class ProgramaActivoSemestreDAOImpl implements ProgramaActivoSemestreDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(ProgramaActivoSemestreDAOImpl.class);
	
	@Autowired
	ProgramaActivoSemestreRepository programaActivoSemestreRepository;
	
	/**
	 * Crea un Entidad ProgramaActivoSemestre en la base de datos
	 * @param  ProgramaActivoSemestre ProgramaActivoSemestre
	 * @return void
	 * @throws no lanza excepciones
	 */
	public ProgramaActivoSemestreEntity crearProgramaActivoSemestreEntity(ProgramaActivoSemestreEntity objProgramaActivoSemestreEntity){
		objLog.info("INI - crearProgramaActivoSemestreEntity");
		ProgramaActivoSemestreEntity ProgramaActivoSemestreEntity = programaActivoSemestreRepository.save(objProgramaActivoSemestreEntity);
		objLog.info("FIN - crearProgramaActivoSemestreEntity "+objProgramaActivoSemestreEntity.getIdProgramaActivoSemestre());
		return ProgramaActivoSemestreEntity;
	}
	
	/**
	 * Actualiza un Entidad ProgramaActivoSemestre en la base de datos 
	 * @param  ProgramaActivoSemestre ProgramaActivoSemestre
	 * @return void
	 * @throws no lanza excepciones
	 */
	public ProgramaActivoSemestreEntity actualizarProgramaActivoSemestreEntity(ProgramaActivoSemestreEntity objProgramaActivoSemestreEntity) {
		objLog.info("INI - actualizarProgramaActivoSemestreEntity");
		ProgramaActivoSemestreEntity ProgramaActivoSemestreEntity = programaActivoSemestreRepository.save(objProgramaActivoSemestreEntity); //Necesita el Id
		objLog.info("FIN - actualizarProgramaActivoSemestreEntity "+objProgramaActivoSemestreEntity.getIdProgramaActivoSemestre()+" "+objProgramaActivoSemestreEntity.getDescripcionProgramaActivoSemestre());
		return ProgramaActivoSemestreEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad ProgramaActivoSemestre por el id
	 * @param  ProgramaActivoSemestre ProgramaActivoSemestre
	 * @return metApl ProgramaActivoSemestre
	 * @throws PersistenceImplException
	 */
	public ProgramaActivoSemestreEntity buscarProgramaActivoSemestrexIdEntity(ProgramaActivoSemestreEntity objProgramaActivoSemestreEntity) throws PersistenceImplException {
		objLog.info("INI - buscarProgramaActivoSemestrexIdEntity");
		ProgramaActivoSemestreEntity metApl = null;
 		try {
 			metApl = programaActivoSemestreRepository.findOne(objProgramaActivoSemestreEntity.getIdProgramaActivoSemestre());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		if(metApl!=null){
 			if(metApl.getIdProgramaActivoSemestre()!=null && metApl.getDescripcionProgramaActivoSemestre()!=null){
 			objLog.info("FIN - buscarProgramaActivoSemestrexIdEntity "+metApl.getIdProgramaActivoSemestre()+" "+metApl.getDescripcionProgramaActivoSemestre());
 			}
 		}
 		return metApl;
	}
	
	/**
	 * Método que devuelve listado de Todas ProgramaActivoSemestrees almacenadas
	 * @return lista List<ProgramaActivoSemestre>
	 * @throws no lanza excepciones
	 */
	public List<ProgramaActivoSemestreEntity> listarProgramaActivoSemestreEntity(){
		objLog.info("INI - listarProgramaActivoSemestreEntity");
		List<ProgramaActivoSemestreEntity> lista = null;
		try {
			lista = programaActivoSemestreRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarProgramaActivoSemestreEntity "+lista.size());
 		}
		
		return lista;
	}

}
