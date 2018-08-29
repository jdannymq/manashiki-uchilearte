package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.AlumnoProgramaActivoSemestreDAO;
import com.manashiki.uchilearte.logica.entidad.AlumnoProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.AlumnoProgramaActivoSemestreRepository;


@Repository
public class AlumnoProgramaActivoSemestreDAOImpl implements AlumnoProgramaActivoSemestreDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(AlumnoProgramaActivoSemestreDAOImpl.class);
	
	@Autowired
	AlumnoProgramaActivoSemestreRepository alumnoProgramaActivoSemestreRepository;
	
	/**
	 * Crea un Entidad AlumnoProgramaActivoSemestre en la base de datos
	 * @param  AlumnoProgramaActivoSemestre AlumnoProgramaActivoSemestre
	 * @return void
	 * @throws no lanza excepciones
	 */
	public AlumnoProgramaActivoSemestreEntity crearAlumnoProgramaActivoSemestreEntity(AlumnoProgramaActivoSemestreEntity objAlumnoProgramaActivoSemestreEntity ){
		objLog.info("INI - crearAlumnoProgramaActivoSemestreEntity");
		AlumnoProgramaActivoSemestreEntity AlumnoProgramaActivoSemestreEntity = alumnoProgramaActivoSemestreRepository.save(objAlumnoProgramaActivoSemestreEntity);
		objLog.info("FIN - crearAlumnoProgramaActivoSemestreEntity "+objAlumnoProgramaActivoSemestreEntity.getIdAlumnoProgramaActivoSemestre());
		return AlumnoProgramaActivoSemestreEntity;
	}
	
	/**
	 * Actualiza un Entidad AlumnoProgramaActivoSemestre en la base de datos 
	 * @param  AlumnoProgramaActivoSemestre AlumnoProgramaActivoSemestre
	 * @return void
	 * @throws no lanza excepciones
	 */
	public AlumnoProgramaActivoSemestreEntity actualizarAlumnoProgramaActivoSemestreEntity(AlumnoProgramaActivoSemestreEntity objAlumnoProgramaActivoSemestreEntity) {
		objLog.info("INI - actualizarAlumnoProgramaActivoSemestreEntity");
		AlumnoProgramaActivoSemestreEntity AlumnoProgramaActivoSemestreEntity = alumnoProgramaActivoSemestreRepository.save(objAlumnoProgramaActivoSemestreEntity); //Necesita el Id
		objLog.info("FIN - actualizarAlumnoProgramaActivoSemestreEntity "+objAlumnoProgramaActivoSemestreEntity.getIdAlumnoProgramaActivoSemestre()+" "+objAlumnoProgramaActivoSemestreEntity.getEstadoAlumnoProgramaActivoSemestre());
		return AlumnoProgramaActivoSemestreEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad AlumnoProgramaActivoSemestre por el id
	 * @param  AlumnoProgramaActivoSemestre AlumnoProgramaActivoSemestre
	 * @return metApl AlumnoProgramaActivoSemestre
	 * @throws PersistenceImplException
	 */
	public AlumnoProgramaActivoSemestreEntity buscarAlumnoProgramaActivoSemestrexIdEntity(AlumnoProgramaActivoSemestreEntity objAlumnoProgramaActivoSemestreEntity ) throws PersistenceImplException {
		objLog.info("INI - buscarAlumnoProgramaActivoSemestrexIdEntity");
		AlumnoProgramaActivoSemestreEntity metApl = null;
 		try {
 			metApl = alumnoProgramaActivoSemestreRepository.findOne(objAlumnoProgramaActivoSemestreEntity.getIdAlumnoProgramaActivoSemestre());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		if(metApl!=null){
 			if(metApl.getIdAlumnoProgramaActivoSemestre()!=null && metApl.getEstadoAlumnoProgramaActivoSemestre()!=null){
 			objLog.info("FIN - buscarAlumnoProgramaActivoSemestrexIdEntity "+metApl.getIdAlumnoProgramaActivoSemestre()+" "+metApl.getEstadoAlumnoProgramaActivoSemestre());
 			}
 		}
 		return metApl;
	}
	

	/**
	 * Método que devuelve listado de Todas AlumnoProgramaActivoSemestrees almacenadas
	 * @return lista List<AlumnoProgramaActivoSemestre>
	 * @throws no lanza excepciones
	 */
	public List<AlumnoProgramaActivoSemestreEntity> listarAlumnoProgramaActivoSemestreEntity(){
		objLog.info("INI - listarAlumnoProgramaActivoSemestreesEntity");
		List<AlumnoProgramaActivoSemestreEntity> lista = null;
		try {
			lista = alumnoProgramaActivoSemestreRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarAlumnoProgramaActivoSemestreesEntity "+lista.size());
 		}
		
		return lista;
	}

}
