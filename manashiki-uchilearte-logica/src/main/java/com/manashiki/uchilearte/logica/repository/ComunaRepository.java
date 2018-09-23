package com.manashiki.uchilearte.logica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.ComunaEntity;
import com.manashiki.uchilearte.logica.entidad.RegionEntity;

public interface ComunaRepository extends JpaRepository<ComunaEntity, Integer> {
	
	List<ComunaEntity> findByFkIdRegion(RegionEntity fkIdRegion);
}
