package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.ArchivoSolicitudDAO;
import com.manashiki.uchilearte.logica.entidad.ArchivoSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.ArchivoSolicitudRepository;

@Repository
public class ArchivoSolicitudDAOImpl implements ArchivoSolicitudDAO{

	private static final Logger objLog = LoggerFactory.getLogger(ArchivoSolicitudDAOImpl.class);
	
	
	@Autowired
	ArchivoSolicitudRepository archivoSolicitudRepository;
	
	/**
	 * Crea una Entidad ArchivoSolicitudAcademica en la base de datos
	 * @param  aplicacion ArchivoSolicitudAcademica
	 * @return void
	 * @exception no lanza excepciones
	 */
	public ArchivoSolicitudEntity crearArchivoSolicitudEntity(ArchivoSolicitudEntity archivoSolicitudEntity){
		objLog.info("INI - crearArchivoSolicitudEntity ");
		ArchivoSolicitudEntity archivoSolicitudAcademicaEntity = archivoSolicitudRepository.save(archivoSolicitudEntity);
		objLog.info("FIN - crearArchivoSolicitudEntity "+archivoSolicitudEntity.getIdArchivoSolicitud());
		return archivoSolicitudAcademicaEntity;
	}
	
	/**
	 * Actualiza un Entidad ArchivoSolicitudAcademica en la base de datos 
	 * @param  aplicacion ArchivoSolicitudAcademica
	 * @return void
	 * @exception no lanza excepciones
	 */
	public ArchivoSolicitudEntity actualizarArchivoSolicitudEntity(ArchivoSolicitudEntity archivoSolicitudEntity){
		objLog.info("INI - actualizarArchivoSolicitudEntity "+archivoSolicitudEntity.getIdArchivoSolicitud());
		ArchivoSolicitudEntity archivoSolicitudAcademicaEntity = archivoSolicitudRepository.save(archivoSolicitudEntity);
		objLog.info("FIN - actualizarArchivoSolicitudEntity "+archivoSolicitudEntity.getIdArchivoSolicitud());
		return archivoSolicitudAcademicaEntity;
	
	}
	
	/**
	 * Método que devuelve Entidad ArchivoSolicitudAcademica por el id
	 * @param  aplicacion ArchivoSolicitudAcademica
	 * @return apliEmpresa ArchivoSolicitudAcademica
	 * @exception no lanza excepciones
	 */
	public ArchivoSolicitudEntity buscarArchivoSolicitudxIdEntity(ArchivoSolicitudEntity archivoSolicitudEntity) throws PersistenceImplException{
		objLog.info("INI - buscarArchivoSolicitudxIdEntity "+archivoSolicitudEntity.getIdArchivoSolicitud());
		ArchivoSolicitudEntity archivoSolicitudAcademicaEntity = null;
 		try {
 			archivoSolicitudAcademicaEntity = archivoSolicitudRepository.findOne(archivoSolicitudEntity.getIdArchivoSolicitud());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
 		
 		if(archivoSolicitudAcademicaEntity!=null){
 			if(archivoSolicitudAcademicaEntity.getIdArchivoSolicitud()!=null){
 				objLog.info("FIN - buscarArchivoSolicitudxIdEntity "+archivoSolicitudAcademicaEntity.getIdArchivoSolicitud());
 			}
 		}
 		
 		
		return archivoSolicitudAcademicaEntity;
	}
	
	/**
	 * Método que devuelve listado de Todas las ArchivoSolicitudAcademicas
	 * @return lista List<ArchivoSolicitudAcademica>
	 * @exception no lanza excepciones
	 */
	public List<ArchivoSolicitudEntity> listarArchivoSolicitudesEntity(){
		objLog.info("INI - listarArchivoSolicitudEntity");
		List<ArchivoSolicitudEntity> lista = null;
		try {
			lista = archivoSolicitudRepository.findAll();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista "+lista.size());
		}
		
		if(lista!=null){
 				objLog.info("FIN - listarArchivoSolicitudEntity "+lista.size());
 		}
		
		return lista;
	}	
	
}
