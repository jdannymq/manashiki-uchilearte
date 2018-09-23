package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.AsignaturaProgramaActivoSemestreDAO;
import com.manashiki.uchilearte.logica.entidad.AsignaturaProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.AsignaturaProgramaActivoSemestreRepository;


@Repository
public class AsignaturaProgramaActivoSemestreDAOImpl implements AsignaturaProgramaActivoSemestreDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(AsignaturaProgramaActivoSemestreDAOImpl.class);
	
	@Autowired
	AsignaturaProgramaActivoSemestreRepository asignaturaProgramaActivoSemestreRepository;
	
	/**
	 * Crea un Entidad AsignaturaProgramaActivoSemestre en la base de datos
	 * @param  AsignaturaProgramaActivoSemestre AsignaturaProgramaActivoSemestre
	 * @return void
	 * @throws no lanza excepciones
	 */
	public AsignaturaProgramaActivoSemestreEntity crearAsignaturaProgramaActivoSemestreEntity(AsignaturaProgramaActivoSemestreEntity objAsignaturaProgramaActivoSemestreEntity ){
		objLog.info("INI - crearAsignaturaProgramaActivoSemestreEntity");
		AsignaturaProgramaActivoSemestreEntity AsignaturaProgramaActivoSemestreEntity = asignaturaProgramaActivoSemestreRepository.save(objAsignaturaProgramaActivoSemestreEntity);
		objLog.info("FIN - crearAsignaturaProgramaActivoSemestreEntity "+objAsignaturaProgramaActivoSemestreEntity.getIdAsignaturaProgramaActivoSemestre());
		return AsignaturaProgramaActivoSemestreEntity;
	}
	
	/**
	 * Actualiza un Entidad AsignaturaProgramaActivoSemestre en la base de datos 
	 * @param  AsignaturaProgramaActivoSemestre AsignaturaProgramaActivoSemestre
	 * @return void
	 * @throws no lanza excepciones
	 */
	public AsignaturaProgramaActivoSemestreEntity actualizarAsignaturaProgramaActivoSemestreEntity(AsignaturaProgramaActivoSemestreEntity objAsignaturaProgramaActivoSemestreEntity) {
		objLog.info("INI - actualizarAsignaturaProgramaActivoSemestreEntity");
		AsignaturaProgramaActivoSemestreEntity AsignaturaProgramaActivoSemestreEntity = asignaturaProgramaActivoSemestreRepository.save(objAsignaturaProgramaActivoSemestreEntity); //Necesita el Id
		objLog.info("FIN - actualizarAsignaturaProgramaActivoSemestreEntity "+objAsignaturaProgramaActivoSemestreEntity.getIdAsignaturaProgramaActivoSemestre()+" "+objAsignaturaProgramaActivoSemestreEntity.getDescripcionAsignaturaProgramaActivoSemestre());
		return AsignaturaProgramaActivoSemestreEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad AsignaturaProgramaActivoSemestre por el id
	 * @param  AsignaturaProgramaActivoSemestre AsignaturaProgramaActivoSemestre
	 * @return metApl AsignaturaProgramaActivoSemestre
	 * @throws PersistenceImplException
	 */
	public AsignaturaProgramaActivoSemestreEntity buscarAsignaturaProgramaActivoSemestrexIdEntity(AsignaturaProgramaActivoSemestreEntity objAsignaturaProgramaActivoSemestreEntity ) throws PersistenceImplException{
		objLog.info("INI - buscarAsignaturaProgramaActivoSemestrexIdEntity");
		AsignaturaProgramaActivoSemestreEntity metApl = null;
 		try {
 			metApl = asignaturaProgramaActivoSemestreRepository.findOne(objAsignaturaProgramaActivoSemestreEntity.getIdAsignaturaProgramaActivoSemestre());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		if(metApl!=null){
 			if(metApl.getIdAsignaturaProgramaActivoSemestre()!=null && metApl.getDescripcionAsignaturaProgramaActivoSemestre()!=null){
 			objLog.info("FIN - buscarAsignaturaProgramaActivoSemestrexIdEntity "+metApl.getIdAsignaturaProgramaActivoSemestre()+" "+metApl.getDescripcionAsignaturaProgramaActivoSemestre());
 			}
 		}
 		return metApl;
	}
	
	/**
	 * Método que devuelve listado de Todas AsignaturaProgramaActivoSemestrees almacenadas
	 * @return lista List<AsignaturaProgramaActivoSemestre>
	 * @throws no lanza excepciones
	 */
	public List<AsignaturaProgramaActivoSemestreEntity> listarAsignaturaProgramaActivoSemestreEntity(){
		objLog.info("INI - listarAsignaturaProgramaActivoSemestreEntity");
		List<AsignaturaProgramaActivoSemestreEntity> lista = null;
		try {
			lista = asignaturaProgramaActivoSemestreRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarAsignaturaProgramaActivoSemestreEntity "+lista.size());
 		}
		
		return lista;
	}

}
