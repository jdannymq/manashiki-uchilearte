package com.manashiki.uchilearte.logica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadPostulacionEntity;

public interface ProgramaUniversidadPostulacionRepository extends JpaRepository<ProgramaUniversidadPostulacionEntity, Integer> {
	
	//List<ProgramaUniversidadPostulacionEntity> findAllByOrderByClasificacionProgramaPostulacionAsc();
	//List<ProgramaUniversidadPostulacionEntity> findAllByOrderByClasificacionProgramaPostulacionAndSubClasificacionProgramaPostulacionAsc();
	List<ProgramaUniversidadPostulacionEntity> findAllByOrderByClasificacionProgramaPostulacionAscPrioridadAsc();
}
