package com.manashiki.uchilearte.logica.dao.impl;

import java.util.List;

import javax.persistence.PersistenceException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.SolicitudAcademicaDAO;
import com.manashiki.uchilearte.logica.entidad.SolicitudAcademicaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.logica.repository.SolicitudAcademicaRepository;

@Repository
public class SolicitudAcademicaDAOImpl implements SolicitudAcademicaDAO{

	private static final Logger objLog = LoggerFactory.getLogger(SolicitudAcademicaDAOImpl.class);
	
	@Autowired
	SolicitudAcademicaRepository solicitudCertificadoRepository;
	
	/**
	 * Crea una Entidad SolicitudAcademica en la base de datos
	 * @param solicitudCertificado SolicitudAcademica 
	 * @return void
	 * @throws no lanza excepciones
	 */
	public SolicitudAcademicaEntity crearSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity){
		objLog.info("INI - crearSolicitudAcademicaEntity");
		SolicitudAcademicaEntity solicitudCertificadoEntity = solicitudCertificadoRepository.save(objSolicitudAcademicaEntity);
		objLog.info("FIN - crearSolicitudAcademicaEntity "+objSolicitudAcademicaEntity.getIdSolicitudAcademica());
		return solicitudCertificadoEntity;
	}
	
	/**
	 * Actualiza una Entidad SolicitudAcademica en la base de datos 
	 * @param solicitudCertificado SolicitudAcademica
	 * @return void
	 * @throws no lanza excepciones
	 */
	public SolicitudAcademicaEntity actualizarSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity){
		objLog.info("INI - actualizarSolicitudAcademicaEntity");
		SolicitudAcademicaEntity solicitudCertificadoEntity = solicitudCertificadoRepository.save(objSolicitudAcademicaEntity);
		objLog.info("FIN - actualizarSolicitudAcademicaEntity "+objSolicitudAcademicaEntity.getIdSolicitudAcademica());
		return solicitudCertificadoEntity;
	}
	
	/**
	 * Método que devuelve entidad SolicitudAcademica por Id
	 * @param solicitudCertificado SolicitudAcademica
	 * @return metEmp SolicitudAcademica
	 * @throws no lanza excepciones
	 */
	public SolicitudAcademicaEntity buscarSolicitudAcademicaxIdEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudAcademicaxIdEntity "+objSolicitudAcademicaEntity.getIdSolicitudAcademica());
		SolicitudAcademicaEntity metEmp= null;
		try {
			metEmp = solicitudCertificadoRepository.findOne(objSolicitudAcademicaEntity.getIdSolicitudAcademica());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudAcademica()!=null){
 				objLog.info("FIN - buscarSolicitudAcademicaxIdEntity "+metEmp.getIdSolicitudAcademica());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve entidad SolicitudAcademica por Rut
	 * @param solicitudCertificado SolicitudAcademica
	 * @return metEmp SolicitudAcademica
	 * @throws no lanza excepciones
	 */
	public SolicitudAcademicaEntity buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudAcademicaxRolUnicoSolicitudAcademicaEntity "+objSolicitudAcademicaEntity.getRutPersonaSolicitudAcademica());
		SolicitudAcademicaEntity metEmp= null;
		try {
			metEmp = solicitudCertificadoRepository.findByRutPersonaSolicitudAcademica(objSolicitudAcademicaEntity.getRutPersonaSolicitudAcademica());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudAcademica()!=null){
 				objLog.info("FIN - buscarSolicitudAcademicaxRolUnicoSolicitudAcademicaEntity "+metEmp.getIdSolicitudAcademica());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve entidad SolicitudAcademica por Nombre Lower
	 * @param solicitudCertificado SolicitudAcademica
	 * @return metEmp SolicitudAcademica
	 * @throws no lanza excepciones
	 */
	public SolicitudAcademicaEntity buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException {
		objLog.info("INI - buscarSolicitudAcademicaxNombreSolicitudAcademicaLower "+objSolicitudAcademicaEntity.getNombrePersonaSolicitudAcademica());
		SolicitudAcademicaEntity metEmp= null;
		try {
			metEmp = solicitudCertificadoRepository.findByNombrePersonaSolicitudAcademica(objSolicitudAcademicaEntity.getNombrePersonaSolicitudAcademica());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
			throw new PersistenceImplException(e);
		}
		
		if(metEmp!=null){
 			if(metEmp.getIdSolicitudAcademica()!=null){
 				objLog.info("FIN - buscarSolicitudAcademicaxNombreSolicitudAcademicaLower "+metEmp.getIdSolicitudAcademica());
 			}
 		}
		
		return metEmp;
	}
	
	/**
	 * Método que devuelve listado de todos las SolicitudAcademicas almacenadas
	 * @return lista List<SolicitudAcademica>
	 * @throws no lanza excepciones
	 */
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicasEntity() {
		objLog.info("INI - listarSolicitudAcademicasEntity");
		List<SolicitudAcademicaEntity> listaSolicitudAcademica = null;
		try {
//			listaSolicitudAcademica = solicitudCertificadoRepository.findAll();
			listaSolicitudAcademica = solicitudCertificadoRepository.findAllByOrderByIdSolicitudAcademicaDesc();
		} catch (PersistenceException e) {
			objLog.error("No se pudo obtener la lista de solicitudes");
		}
		
		if(listaSolicitudAcademica!=null){
			objLog.info("FIN - listarSolicitudAcademicasEntity "+listaSolicitudAcademica.size());
 		}
		
		return listaSolicitudAcademica;
	}
	
	/**
	 * Método que devuelve entidad SolicitudAcademica por Apellido Lower
	 * @param solicitudCertificado SolicitudAcademica
	 * @return metEmp SolicitudAcademica
	 * @throws no lanza excepciones
	 */
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity){
		objLog.info("INI - buscarSolicitudAcademicaxRazSocEntity "+objSolicitudAcademicaEntity.getApellidoPaternoPersonaSolicitudAcademica());
		List<SolicitudAcademicaEntity> listaSolicitudAcademica = null;
		try {
			listaSolicitudAcademica = solicitudCertificadoRepository.findByApellidoPaternoPersonaSolicitudAcademicaContaining(objSolicitudAcademicaEntity.getApellidoPaternoPersonaSolicitudAcademica());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
		}
		
		if(listaSolicitudAcademica!=null){
			objLog.info("FIN - listarSolicitudAcademicasEntity "+listaSolicitudAcademica.size());
 		}
		
		return listaSolicitudAcademica;
	}
	
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicaxTipoSolicitudEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity){
		objLog.info("INI - listarSolicitudAcademicaxTipoSolicitudEntity "+objSolicitudAcademicaEntity.getFkIdTipoSolicitud());
		List<SolicitudAcademicaEntity> listaSolicitudAcademica = null;
		try {
			listaSolicitudAcademica = solicitudCertificadoRepository.findByFkIdTipoSolicitud(objSolicitudAcademicaEntity.getFkIdTipoSolicitud());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
		}
		
		if(listaSolicitudAcademica!=null){
			objLog.info("FIN - listarSolicitudAcademicasEntity "+listaSolicitudAcademica.size());
 		}
		
		return listaSolicitudAcademica;
	}
	
	/**
	 * Método que devuelve entidad SolicitudAcademica por Nombre Lower
	 * @param solicitudCertificado SolicitudAcademica
	 * @return metEmp SolicitudAcademica
	 * @throws no lanza excepciones
	 */
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicaxEntreFechasEntity(SolicitudAcademicaEntity objSolicitudAcademicaInicial, SolicitudAcademicaEntity objSolicitudAcademicaFinal){
		objLog.info("INI - buscarSolicitudAcademicaxRazSocEntity "+objSolicitudAcademicaInicial.getFechaSolicitud()+" v/s"+objSolicitudAcademicaFinal.getFechaSolicitud());
		List<SolicitudAcademicaEntity> listaSolicitudAcademica = null;
		try {
//			listaSolicitudAcademica = solicitudCertificadoRepository.findByFechaSolicitudBetween(objSolicitudAcademicaInicial.getFechaSolicitud(),objSolicitudAcademicaFinal.getFechaSolicitud());
			listaSolicitudAcademica = solicitudCertificadoRepository.findByFechaSolicitudBetweenOrderByIdSolicitudAcademicaDesc(objSolicitudAcademicaInicial.getFechaSolicitud(),objSolicitudAcademicaFinal.getFechaSolicitud());
		} catch (PersistenceException e) {
			objLog.error("Error en la implementacion de la Persistencia");
		}
		
		if(listaSolicitudAcademica!=null){
			objLog.info("FIN - listarSolicitudAcademicasEntity "+listaSolicitudAcademica.size());
 		}
		
		return listaSolicitudAcademica;
	}
	
	/**
	 * Método que devuelve entidad SolicitudAcademica por estado
	 * @param solicitudCertificado SolicitudAcademica
	 * @return lista List<SolicitudAcademica>
	 * @throws no lanza excepciones
	 */
	public List<SolicitudAcademicaEntity> listarSolicitudAcademicaxEstadoEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity){
		objLog.info("INI - listarSolicitudAcademicaxEstadoEntity "+objSolicitudAcademicaEntity.getEstadoSolicitud());
		List<SolicitudAcademicaEntity> listaSolicitudAcademica= null;
		try {
			listaSolicitudAcademica = solicitudCertificadoRepository.findByEstadoSolicitud(objSolicitudAcademicaEntity.getEstadoSolicitud());
		} catch (PersistenceException e) {
			objLog.error("No se pudo Obtener la lista");
		}
		
		if(listaSolicitudAcademica!=null){
			objLog.info("FIN - listarSolicitudAcademicaxEstadoEntity "+listaSolicitudAcademica.size());
 		}
		
		return listaSolicitudAcademica;
	}
	
}
