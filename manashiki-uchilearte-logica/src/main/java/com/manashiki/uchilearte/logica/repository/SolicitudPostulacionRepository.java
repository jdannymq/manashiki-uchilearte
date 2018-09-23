package com.manashiki.uchilearte.logica.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.SolicitudPostulacionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;


public interface SolicitudPostulacionRepository extends JpaRepository<SolicitudPostulacionEntity, Integer> {
	
	SolicitudPostulacionEntity findByNombrePersonaSolicitudPostulacion(String nombrePersonaSolicitudPostulacion) throws PersistenceImplException;
	SolicitudPostulacionEntity findByRutPersonaSolicitudPostulacion(String RutPersonaSolicitudPostulacion);
	
	List<SolicitudPostulacionEntity> findByApellidoPaternoPersonaSolicitudPostulacionContaining(String apellidoPaternoPersonaSolicitudPostulacion);
//	List<SolicitudPostulacionEntity> findByFkIdTipoPostulacion(TipoPostulacionEntity fkIdTipoPostulacion);
	List<SolicitudPostulacionEntity> findByEstadoSolicitudPostulacion(Integer estadoSolicitudPostulacion);
	
	List<SolicitudPostulacionEntity> findByFechaSolicitudBetween(Timestamp fechaInicial, Timestamp fechaFinal);
	List<SolicitudPostulacionEntity> findByFechaSolicitudBetweenOrderByIdSolicitudPostulacionDesc(Timestamp fechaInicial, Timestamp fechaFinal);
	List<SolicitudPostulacionEntity> findAllByOrderByIdSolicitudPostulacionDesc();
}
