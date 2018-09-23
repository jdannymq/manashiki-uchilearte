package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.SemestreTemporadaDAO;
import com.manashiki.uchilearte.logica.entidad.SemestreTemporadaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.SemestreTemporadaRepository;


@Repository
public class SemestreTemporadaDAOImpl implements SemestreTemporadaDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(SemestreTemporadaDAOImpl.class);
	
	@Autowired
	SemestreTemporadaRepository semestreTemporadaRepository;
	
	/**
	 * Crea un Entidad SemestreTemporada en la base de datos
	 * @param  SemestreTemporada SemestreTemporada
	 * @return void
	 * @throws no lanza excepciones
	 */
	public SemestreTemporadaEntity crearSemestreTemporadaEntity(SemestreTemporadaEntity objSemestreTemporadaEntity){
		objLog.info("INI - crearSemestreTemporadaEntity");
		SemestreTemporadaEntity SemestreTemporadaEntity = semestreTemporadaRepository.save(objSemestreTemporadaEntity);
		objLog.info("FIN - crearSemestreTemporadaEntity "+objSemestreTemporadaEntity.getIdSemestreTemporada());
		return SemestreTemporadaEntity;
	}
	
	/**
	 * Actualiza un Entidad SemestreTemporada en la base de datos 
	 * @param  SemestreTemporada SemestreTemporada
	 * @return void
	 * @throws no lanza excepciones
	 */
	public SemestreTemporadaEntity actualizarSemestreTemporadaEntity(SemestreTemporadaEntity objSemestreTemporadaEntity) {
		objLog.info("INI - actualizarSemestreTemporadaEntity");
		SemestreTemporadaEntity SemestreTemporadaEntity = semestreTemporadaRepository.save(objSemestreTemporadaEntity); //Necesita el Id
		objLog.info("FIN - actualizarSemestreTemporadaEntity "+objSemestreTemporadaEntity.getIdSemestreTemporada()+" "+objSemestreTemporadaEntity.getNombreSemestreTemporada());
		return SemestreTemporadaEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad SemestreTemporada por el id
	 * @param  SemestreTemporada SemestreTemporada
	 * @return metApl SemestreTemporada
	 * @throws PersistenceImplException
	 */
	public SemestreTemporadaEntity buscarSemestreTemporadaxIdEntity(SemestreTemporadaEntity objSemestreTemporadaEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSemestreTemporadaxIdEntity");
		SemestreTemporadaEntity metApl = null;
 		try {
 			metApl = semestreTemporadaRepository.findOne(objSemestreTemporadaEntity.getIdSemestreTemporada());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		if(metApl!=null){
 			if(metApl.getIdSemestreTemporada()!=null && metApl.getNombreSemestreTemporada()!=null){
 			objLog.info("FIN - buscarSemestreTemporadaxIdEntity "+metApl.getIdSemestreTemporada()+" "+metApl.getNombreSemestreTemporada());
 			}
 		}
 		return metApl;
	}
	
	/**
	 * Método que devuelve listado de Todas SemestreTemporadaes almacenadas
	 * @return lista List<SemestreTemporada>
	 * @throws no lanza excepciones
	 */
	public List<SemestreTemporadaEntity> listarSemestreTemporadaEntity(){
		objLog.info("INI - listarSemestreTemporadaEntity");
		List<SemestreTemporadaEntity> lista = null;
		try {
			lista = semestreTemporadaRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarSemestreTemporadaEntity "+lista.size());
 		}
		
		return lista;
	}
	
//	public List<SemestreTemporadaEntity> listarSemestreEntreFechaActivacion(SemestreTemporadaEntity objSemestreTemporadaInicialEntity){
//		objLog.info("INI - listarSemestreTemporadaByFechaActivacionDesdeAndfechaActivacionHastaEntity");
//		List<SemestreTemporadaEntity> lista = null;
//		try {
//			lista = semestreTemporadaRepository.findBetweenFechaActivacionDesdeAndfechaActivacionHasta(objSemestreTemporadaInicialEntity.getFechaActivacionDesde(), objSemestreTemporadaInicialEntity.getFechaActivacionHasta());
//		} catch (PersistenceException e) {
//			objLog.error("No se pudo obtener la lista "+e.getMessage());
//		}
//		if(lista!=null){
// 			objLog.info("FIN - listarSemestreTemporadaByFechaActivacionDesdeAndfechaActivacionHastaEntity "+lista.size());
// 		}
//		
//		return lista;
//	}

}
