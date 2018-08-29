package com.manashiki.uchilearte.logica.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.SolicitudAcademicaEntity;
import com.manashiki.uchilearte.logica.entidad.TipoSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;


public interface SolicitudAcademicaRepository extends JpaRepository<SolicitudAcademicaEntity, Integer> {
	
	SolicitudAcademicaEntity findByNombrePersonaSolicitudAcademica(String nombrePersonaSolicitudAcademica) throws PersistenceImplException;
	SolicitudAcademicaEntity findByRutPersonaSolicitudAcademica(String RutPersonaSolicitudAcademica);
	
	List<SolicitudAcademicaEntity> findByApellidoPaternoPersonaSolicitudAcademicaContaining(String apellidoPaternoPersonaSolicitudAcademica);
	List<SolicitudAcademicaEntity> findByFkIdTipoSolicitud(TipoSolicitudEntity fkIdTipoSolicitud);
	List<SolicitudAcademicaEntity> findByEstadoSolicitud(Integer estadoSolicitud);
	
	List<SolicitudAcademicaEntity> findByFechaSolicitudBetween(Timestamp fechaInicial, Timestamp fechaFinal);
	List<SolicitudAcademicaEntity> findByFechaSolicitudBetweenOrderByIdSolicitudAcademicaDesc(Timestamp fechaInicial, Timestamp fechaFinal);
	List<SolicitudAcademicaEntity> findAllByOrderByIdSolicitudAcademicaDesc();
}
