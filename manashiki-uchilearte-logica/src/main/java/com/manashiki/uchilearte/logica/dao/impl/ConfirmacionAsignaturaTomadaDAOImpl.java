package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.ConfirmacionAsignaturaTomadaDAO;
import com.manashiki.uchilearte.logica.entidad.ConfirmacionAsignaturaTomadaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.ConfirmacionAsignaturaTomadaRepository;


@Repository
public class ConfirmacionAsignaturaTomadaDAOImpl implements ConfirmacionAsignaturaTomadaDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(ConfirmacionAsignaturaTomadaDAOImpl.class);
	
	@Autowired
	ConfirmacionAsignaturaTomadaRepository confirmacionAsignaturaTomadaRepository;
	
	/**
	 * Crea un Entidad ConfirmacionAsignaturaTomada en la base de datos
	 * @param  ConfirmacionAsignaturaTomada ConfirmacionAsignaturaTomada
	 * @return void
	 * @throws no lanza excepciones
	 */
	public ConfirmacionAsignaturaTomadaEntity crearConfirmacionAsignaturaTomadaEntity(ConfirmacionAsignaturaTomadaEntity objConfirmacionAsignaturaTomadaEntity){
		objLog.info("INI - crearConfirmacionAsignaturaTomadaEntity");
		ConfirmacionAsignaturaTomadaEntity ConfirmacionAsignaturaTomadaEntity = confirmacionAsignaturaTomadaRepository.save(objConfirmacionAsignaturaTomadaEntity);
		objLog.info("FIN - crearConfirmacionAsignaturaTomadaEntity "+objConfirmacionAsignaturaTomadaEntity.getIdConfirmacionAsignaturaTomada());
		return ConfirmacionAsignaturaTomadaEntity;
	}
	
	/**
	 * Actualiza un Entidad ConfirmacionAsignaturaTomada en la base de datos 
	 * @param  ConfirmacionAsignaturaTomada ConfirmacionAsignaturaTomada
	 * @return void
	 * @throws no lanza excepciones
	 */
	public ConfirmacionAsignaturaTomadaEntity actualizarConfirmacionAsignaturaTomadaEntity(ConfirmacionAsignaturaTomadaEntity objConfirmacionAsignaturaTomadaEntity) {
		objLog.info("INI - actualizarConfirmacionAsignaturaTomadaEntity");
		ConfirmacionAsignaturaTomadaEntity ConfirmacionAsignaturaTomadaEntity = confirmacionAsignaturaTomadaRepository.save(objConfirmacionAsignaturaTomadaEntity); //Necesita el Id
		objLog.info("FIN - actualizarConfirmacionAsignaturaTomadaEntity "+objConfirmacionAsignaturaTomadaEntity.getIdConfirmacionAsignaturaTomada()+" "+objConfirmacionAsignaturaTomadaEntity.getEstadoConfirmacionAsignaturaTomada());
		return ConfirmacionAsignaturaTomadaEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad ConfirmacionAsignaturaTomada por el id
	 * @param  ConfirmacionAsignaturaTomada ConfirmacionAsignaturaTomada
	 * @return metApl ConfirmacionAsignaturaTomada
	 * @throws PersistenceImplException
	 */
	public ConfirmacionAsignaturaTomadaEntity buscarConfirmacionAsignaturaTomadaxIdEntity(ConfirmacionAsignaturaTomadaEntity objConfirmacionAsignaturaTomadaEntity) throws PersistenceImplException {
		objLog.info("INI - buscarConfirmacionAsignaturaTomadaxIdEntity");
		ConfirmacionAsignaturaTomadaEntity metApl = null;
 		try {
 			metApl = confirmacionAsignaturaTomadaRepository.findOne(objConfirmacionAsignaturaTomadaEntity.getIdConfirmacionAsignaturaTomada());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		if(metApl!=null){
 			if(metApl.getIdConfirmacionAsignaturaTomada()!=null && metApl.getEstadoConfirmacionAsignaturaTomada()!=null){
 			objLog.info("FIN - buscarConfirmacionAsignaturaTomadaxIdEntity "+metApl.getIdConfirmacionAsignaturaTomada()+" "+metApl.getEstadoConfirmacionAsignaturaTomada());
 			}
 		}
 		return metApl;
	}
	
	/**
	 * Método que devuelve listado de Todas ConfirmacionAsignaturaTomadaes almacenadas
	 * @return lista List<ConfirmacionAsignaturaTomada>
	 * @throws no lanza excepciones
	 */
	public List<ConfirmacionAsignaturaTomadaEntity> listarConfirmacionAsignaturaTomadaEntity(){
		objLog.info("INI - listarConfirmacionAsignaturaTomadaEntity");
		List<ConfirmacionAsignaturaTomadaEntity> lista = null;
		try {
			lista = confirmacionAsignaturaTomadaRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+e.getMessage());
		}
		if(lista!=null){
 			objLog.info("FIN - listarConfirmacionAsignaturaTomadaEntity "+lista.size());
 		}
		
		return lista;
	}

}
