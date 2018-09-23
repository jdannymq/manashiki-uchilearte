package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.AsignaturaTomadaProgramaActivoSemestreDAO;
import com.manashiki.uchilearte.logica.entidad.AsignaturaTomadaProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.AsignaturaTomadaProgramaActivoSemestreRepository;


@Repository
public class AsignaturaTomadaProgramaActivoSemestreDAOImpl implements AsignaturaTomadaProgramaActivoSemestreDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(AsignaturaTomadaProgramaActivoSemestreDAOImpl.class);
	
	@Autowired
	AsignaturaTomadaProgramaActivoSemestreRepository asignaturaTomadaProgramaActivoSemestreRepository;
	
	/**
	 * Crea un Entidad AsignaturaTomadaProgramaActivoSemestre en la base de datos
	 * @param  AsignaturaTomadaProgramaActivoSemestre AsignaturaTomadaProgramaActivoSemestre
	 * @return void
	 * @throws no lanza excepciones
	 */
	public AsignaturaTomadaProgramaActivoSemestreEntity crearAsignaturaTomadaProgramaActivoSemestreEntity(AsignaturaTomadaProgramaActivoSemestreEntity objAsignaturaTomadaProgramaActivoSemestreEntity){
		objLog.info("INI - crearAsignaturaTomadaProgramaActivoSemestreEntity");
		AsignaturaTomadaProgramaActivoSemestreEntity AsignaturaTomadaProgramaActivoSemestreEntity = asignaturaTomadaProgramaActivoSemestreRepository.save(objAsignaturaTomadaProgramaActivoSemestreEntity);
		objLog.info("FIN - crearAsignaturaTomadaProgramaActivoSemestreEntity "+objAsignaturaTomadaProgramaActivoSemestreEntity.getIdAsignaturaTomadaProgramaActivoSemestre());
		return AsignaturaTomadaProgramaActivoSemestreEntity;
	}
	
	/**
	 * Actualiza un Entidad AsignaturaTomadaProgramaActivoSemestre en la base de datos 
	 * @param  AsignaturaTomadaProgramaActivoSemestre AsignaturaTomadaProgramaActivoSemestre
	 * @return void
	 * @throws no lanza excepciones
	 */
	public AsignaturaTomadaProgramaActivoSemestreEntity actualizarAsignaturaTomadaProgramaActivoSemestreEntity(AsignaturaTomadaProgramaActivoSemestreEntity objAsignaturaTomadaProgramaActivoSemestreEntity) {
		objLog.info("INI - actualizarAsignaturaTomadaProgramaActivoSemestreEntity");
		AsignaturaTomadaProgramaActivoSemestreEntity AsignaturaTomadaProgramaActivoSemestreEntity = asignaturaTomadaProgramaActivoSemestreRepository.save(objAsignaturaTomadaProgramaActivoSemestreEntity); //Necesita el Id
		objLog.info("FIN - actualizarAsignaturaTomadaProgramaActivoSemestreEntity "+objAsignaturaTomadaProgramaActivoSemestreEntity.getIdAsignaturaTomadaProgramaActivoSemestre()+" "+objAsignaturaTomadaProgramaActivoSemestreEntity.getEstadoAsignaturaProgramaActivoSemestreTomada());
		return AsignaturaTomadaProgramaActivoSemestreEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad AsignaturaTomadaProgramaActivoSemestre por el id
	 * @param  AsignaturaTomadaProgramaActivoSemestre AsignaturaTomadaProgramaActivoSemestre
	 * @return metApl AsignaturaTomadaProgramaActivoSemestre
	 * @throws PersistenceImplException
	 */
	public AsignaturaTomadaProgramaActivoSemestreEntity buscarAsignaturaTomadaProgramaActivoSemestrexIdEntity(AsignaturaTomadaProgramaActivoSemestreEntity objAsignaturaTomadaProgramaActivoSemestreEntity) throws PersistenceImplException {
		objLog.info("INI - buscarAsignaturaTomadaProgramaActivoSemestrexIdEntity");
		AsignaturaTomadaProgramaActivoSemestreEntity metApl = null;
 		try {
 			metApl = asignaturaTomadaProgramaActivoSemestreRepository.findOne(objAsignaturaTomadaProgramaActivoSemestreEntity.getIdAsignaturaTomadaProgramaActivoSemestre());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		if(metApl!=null){
 			if(metApl.getIdAsignaturaTomadaProgramaActivoSemestre()!=null && metApl.getEstadoAsignaturaProgramaActivoSemestreTomada()!=null){
 			objLog.info("FIN - buscarAsignaturaTomadaProgramaActivoSemestrexIdEntity "+metApl.getIdAsignaturaTomadaProgramaActivoSemestre()+" "+metApl.getEstadoAsignaturaProgramaActivoSemestreTomada());
 			}
 		}
 		return metApl;
	}
	
	/**
	 * Método que devuelve listado de Todas AsignaturaTomadaProgramaActivoSemestrees almacenadas
	 * @return lista List<AsignaturaTomadaProgramaActivoSemestre>
	 * @throws no lanza excepciones
	 */
	public List<AsignaturaTomadaProgramaActivoSemestreEntity> listarAsignaturaTomadaProgramaActivoSemestreEntity(){
		objLog.info("INI - listarAsignaturaTomadaProgramaActivoSemestreEntity");
		List<AsignaturaTomadaProgramaActivoSemestreEntity> lista = null;
		try {
			lista = asignaturaTomadaProgramaActivoSemestreRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarAsignaturaTomadaProgramaActivoSemestreEntity "+lista.size());
 		}
		
		return lista;
	}

}
