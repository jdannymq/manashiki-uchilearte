package com.manashiki.uchilearte.logica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manashiki.uchilearte.logica.entidad.FinalidadCertificadoEntity;

public interface FinalidadCertificadoRepository extends JpaRepository<FinalidadCertificadoEntity, Integer> {
	
//	List<FinalidadCertificadoEntity> findByEstadoFinalidadCertificado(Integer FinalidadCertificado);
//	List<FinalidadCertificadoEntity> findByFkIdEmpresa(EmpresaEntity fkIdEmpresa);
//	List<FinalidadCertificadoEntity> findByFkIdUsuario(UsuarioEntity fkIdUsuario);
	//Solo el Buscar Todos
}
