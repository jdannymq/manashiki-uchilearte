package com.manashiki.uchilearte.logica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.ConfirmacionAsignaturaTomadaEntity;

public interface ConfirmacionAsignaturaTomadaRepository extends JpaRepository<ConfirmacionAsignaturaTomadaEntity, Integer> {
	
	List<ConfirmacionAsignaturaTomadaEntity> findByEstadoConfirmacionAsignaturaTomada(Integer estadoConfirmacionAsignaturaTomada);

}
