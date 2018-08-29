package com.manashiki.uchilearte.logica.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.SolicitudCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;


public interface SolicitudCertificadoRepository extends JpaRepository<SolicitudCertificadoEntity, Integer> {
	
	SolicitudCertificadoEntity findByNombrePersonaSolicitudCertificado(String nombrePersonaSolicitudCertificado) throws PersistenceImplException;
	SolicitudCertificadoEntity findByRutPersonaSolicitudCertificado(String RutPersonaSolicitudCertificado);
	
	List<SolicitudCertificadoEntity> findByApellidoPaternoPersonaSolicitudCertificadoContaining(String apellidoPaternoPersonaSolicitudCertificado);
	List<SolicitudCertificadoEntity> findByEstadoSolicitud(Integer estadoSolicitud);
	
	List<SolicitudCertificadoEntity> findByFechaSolicitudBetween(Timestamp fechaInicial, Timestamp fechaFinal);
	List<SolicitudCertificadoEntity> findByFechaSolicitudBetweenOrderByIdSolicitudCertificadoDesc(Timestamp fechaInicial, Timestamp fechaFinal);
	List<SolicitudCertificadoEntity> findAllByOrderByIdSolicitudCertificadoDesc();
	
}
