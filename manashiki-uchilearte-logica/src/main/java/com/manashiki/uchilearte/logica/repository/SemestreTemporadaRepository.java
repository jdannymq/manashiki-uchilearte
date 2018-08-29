package com.manashiki.uchilearte.logica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.SemestreTemporadaEntity;

public interface SemestreTemporadaRepository extends JpaRepository<SemestreTemporadaEntity, Integer> {
	
//	List<SemestreTemporadaEntity> findBetweenFechaActivacionDesdeAndfechaActivacionHasta(Timestamp fechaActivacionDesde, Timestamp fechaActivacionHasta);
}
