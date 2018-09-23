package com.manashiki.uchilearte.logica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;

public interface ProgramaUniversidadRepository extends JpaRepository<ProgramaUniversidadEntity, Integer> {
	
//	List<ProgramaUniversidadEntity> findByEstadoProgramaUniversidad(Integer ProgramaUniversidad);
//	List<ProgramaUniversidadEntity> findByFkIdEmpresa(EmpresaEntity fkIdEmpresa);
//	List<ProgramaUniversidadEntity> findByFkIdUsuario(UsuarioEntity fkIdUsuario);
	//Solo el Buscar Todos

	List<ProgramaUniversidadEntity> findAllByOrderByClasificacionProgramaAsc();
}
