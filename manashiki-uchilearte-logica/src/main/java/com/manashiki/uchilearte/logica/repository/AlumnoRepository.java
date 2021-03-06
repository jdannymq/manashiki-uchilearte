package com.manashiki.uchilearte.logica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.AlumnoEntity;

public interface AlumnoRepository extends JpaRepository<AlumnoEntity, Integer> {

	AlumnoEntity findByFkIdUsuarioAndEstadoAlumnosUchile(Integer fkIdUsuario, Integer estadoAlumnosUchile);
	List<AlumnoEntity> findByFkIdUsuarioIsNull();
	List<AlumnoEntity> findByFkIdUsuarioIsNotNull();
}
