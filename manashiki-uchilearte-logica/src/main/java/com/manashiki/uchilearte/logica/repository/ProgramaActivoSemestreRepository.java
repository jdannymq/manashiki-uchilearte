package com.manashiki.uchilearte.logica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.ProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.logica.entidad.SemestreTemporadaEntity;

public interface ProgramaActivoSemestreRepository extends JpaRepository<ProgramaActivoSemestreEntity, Integer> {
	
	List<ProgramaActivoSemestreEntity> findByFkIdProgramaUniversidadAndFkIdSemestreTemporada(ProgramaUniversidadEntity fkIdProgramaUniversidad, SemestreTemporadaEntity fkIdSemestreTemporada);
}
