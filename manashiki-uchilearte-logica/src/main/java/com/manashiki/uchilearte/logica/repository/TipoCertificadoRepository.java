package com.manashiki.uchilearte.logica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;

public interface TipoCertificadoRepository extends JpaRepository<TipoCertificadoEntity, Integer> {
	
//	List<TipoCertificadoEntity> findByEstadoTipoCertificado(Integer TipoCertificado);
//	List<TipoCertificadoEntity> findByFkIdEmpresa(EmpresaEntity fkIdEmpresa);
//	List<TipoCertificadoEntity> findByFkIdUsuario(UsuarioEntity fkIdUsuario);
	//Solo el Buscar Todos
}
