package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.TipoCertificadoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servicio.ITipoCertificadoServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.TipoCertificadoDTOMapper;

@Service
public class TipoCertificadoServicio implements ITipoCertificadoServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(TipoCertificadoServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public TipoCertificadoDTO crearTipoCertificadoDTO(TipoCertificadoDTO tipoCertificadoDTO) {
		objLog.info("INI - crearTipoCertificadoDTO");
		TipoCertificadoModel tipoCertificado = new TipoCertificadoModel();
		tipoCertificado = TipoCertificadoDTOMapper.TipoCertificadoDTOToTipoCertificadoModel(tipoCertificadoDTO);

		tipoCertificado = factoryNegocioDAO.getTipoCertificadoNegocioDAO().crearTipoCertificadoModel(tipoCertificado);
		
		tipoCertificadoDTO = TipoCertificadoDTOMapper.TipoCertificadoModelToTipoCertificadoDTO(tipoCertificado);
		objLog.info("FIN - crearTipoCertificadoDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		return tipoCertificadoDTO;

	}

	public TipoCertificadoDTO actualizarTipoCertificadoDTO(TipoCertificadoDTO tipoCertificadoDTO) {
		objLog.info("INI - actualizarTipoCertificadoDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		TipoCertificadoModel tipoCertificado = new TipoCertificadoModel();
		tipoCertificado = TipoCertificadoDTOMapper.TipoCertificadoDTOToTipoCertificadoModel(tipoCertificadoDTO);

		tipoCertificado = factoryNegocioDAO.getTipoCertificadoNegocioDAO().actualizarTipoCertificadoModel(tipoCertificado);
		
		tipoCertificadoDTO = TipoCertificadoDTOMapper.TipoCertificadoModelToTipoCertificadoDTO(tipoCertificado);
		objLog.info("FIN - actualizarTipoCertificadoDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		return tipoCertificadoDTO;

	}

	public TipoCertificadoDTO buscarTipoCertificadoxIdDTO(TipoCertificadoDTO tipoCertificadoDTO)throws ServicioImplException{
		objLog.info("INI - buscarTipoCertificadoxIdDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		TipoCertificadoModel tipoCertificado = new TipoCertificadoModel();
		tipoCertificado = TipoCertificadoDTOMapper.TipoCertificadoDTOToTipoCertificadoModel(tipoCertificadoDTO);

		try {
			tipoCertificado=factoryNegocioDAO.getTipoCertificadoNegocioDAO().buscarTipoCertificadoxIdModel(tipoCertificado);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		tipoCertificadoDTO = TipoCertificadoDTOMapper.TipoCertificadoModelToTipoCertificadoDTO(tipoCertificado);
		
		objLog.info("FIN - buscarTipoCertificadoxIdDTO "+tipoCertificadoDTO.getIdTipoCertificado());
		return tipoCertificadoDTO;
	}

	public List<TipoCertificadoDTO> listarTipoCertificadosDTO() {
		objLog.info("INI - listarTipoCertificadoesDTO");
		List<TipoCertificadoDTO> listaTipoCertificadoDTO=new ArrayList<TipoCertificadoDTO>();
		List<TipoCertificadoModel> listaTipoCertificadoes = new ArrayList<TipoCertificadoModel>();

		listaTipoCertificadoes=factoryNegocioDAO.getTipoCertificadoNegocioDAO().listarTipoCertificadoesModel();

		listaTipoCertificadoDTO = TipoCertificadoDTOMapper.ListTipoCertificadoModelToListTipoCertificadoDTO(listaTipoCertificadoes);
		
		objLog.info("FIN - listarTipoCertificadoesDTO "+listaTipoCertificadoDTO.size());
		return listaTipoCertificadoDTO;
	}

}
