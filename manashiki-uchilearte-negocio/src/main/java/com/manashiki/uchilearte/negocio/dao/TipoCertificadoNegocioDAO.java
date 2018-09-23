package com.manashiki.uchilearte.negocio.dao;

import java.util.List;

import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.TipoCertificadoModel;

public interface TipoCertificadoNegocioDAO{
	public TipoCertificadoModel crearTipoCertificadoModel(TipoCertificadoModel objTipoCertificadoModel);
	public TipoCertificadoModel actualizarTipoCertificadoModel(TipoCertificadoModel objTipoCertificadoModel);
	public TipoCertificadoModel buscarTipoCertificadoxIdModel(TipoCertificadoModel objTipoCertificadoModel) throws NegocioImplException;
	public List<TipoCertificadoModel> listarTipoCertificadoesModel();
	
}