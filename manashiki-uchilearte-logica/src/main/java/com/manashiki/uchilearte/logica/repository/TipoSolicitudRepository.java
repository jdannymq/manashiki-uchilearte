package com.manashiki.uchilearte.logica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.TipoSolicitudEntity;

public interface TipoSolicitudRepository extends JpaRepository<TipoSolicitudEntity, Integer> {
	
//	List<TipoSolicitudEntity> findByEstadoTipoSolicitud(Integer TipoSolicitud);
//	List<TipoSolicitudEntity> findByFkIdEmpresa(EmpresaEntity fkIdEmpresa);
//	List<TipoSolicitudEntity> findByFkIdUsuario(UsuarioEntity fkIdUsuario);
	//Solo el Buscar Todos
}
