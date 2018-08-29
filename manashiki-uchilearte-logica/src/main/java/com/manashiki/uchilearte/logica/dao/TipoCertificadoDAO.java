package com.manashiki.uchilearte.logica.dao;

import java.util.List;

import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;



public interface TipoCertificadoDAO{
	public TipoCertificadoEntity crearTipoCertificadoEntity(TipoCertificadoEntity objTipoCertificadoEntity);
	public TipoCertificadoEntity actualizarTipoCertificadoEntity(TipoCertificadoEntity objTipoCertificadoEntity);
	public TipoCertificadoEntity buscarTipoCertificadoxIdEntity(TipoCertificadoEntity objTipoCertificadoEntity) throws PersistenceImplException;
	public List<TipoCertificadoEntity> listarTipoCertificadoesEntity();
	
}