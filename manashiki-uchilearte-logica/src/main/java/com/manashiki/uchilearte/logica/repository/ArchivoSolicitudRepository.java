package com.manashiki.uchilearte.logica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.ArchivoSolicitudEntity;

public interface ArchivoSolicitudRepository extends JpaRepository<ArchivoSolicitudEntity, Integer> {
	
//	List<ProgramaUniversidadEntity> findByEstadoProgramaUniversidad(Integer ProgramaUniversidad);
//	List<ProgramaUniversidadEntity> findByFkIdEmpresa(EmpresaEntity fkIdEmpresa);
//	List<ProgramaUniversidadEntity> findByFkIdUsuario(UsuarioEntity fkIdUsuario);
	//Solo el Buscar Todos
}
