package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.FinalidadCertificadoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;
import com.manashiki.uchilearte.servicio.IFinalidadCertificadoServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.FinalidadCertificadoDTOMapper;


@Service
public class FinalidadCertificadoServicio implements IFinalidadCertificadoServicio{

	private static final Logger objLog = LoggerFactory.getLogger(FinalidadCertificadoServicio.class);
	
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	/**
	 * Crea una Entidad FinalidadCertificado en la base de datos
	 * @param  finalidadCertificado FinalidadCertificado
	 * @return void
	 * @throws no lanza excepciones
	 */
	public FinalidadCertificadoDTO crearFinalidadCertificadoDTO(FinalidadCertificadoDTO finalidadCertificadoDTO){
		objLog.info("INI - crearFinalidadCertificadoDTO");
		FinalidadCertificadoModel finalidadCertificado= new FinalidadCertificadoModel();
		finalidadCertificado = FinalidadCertificadoDTOMapper.FinalidadCertificadoDTOToFinalidadCertificadoModel(finalidadCertificadoDTO);

		finalidadCertificado = factoryNegocioDAO.getFinalidadCertificadoNegocioDAO().crearFinalidadCertificadoModel(finalidadCertificado);
		
		finalidadCertificadoDTO = FinalidadCertificadoDTOMapper.FinalidadCertificadoModelToFinalidadCertificadoDTO(finalidadCertificado);
		
		objLog.info("FIN - crearFinalidadCertificadoDTO "+finalidadCertificadoDTO.getIdFinalidadCertificado());
		return finalidadCertificadoDTO;
	}

	public FinalidadCertificadoDTO actualizarFinalidadCertificadoDTO(FinalidadCertificadoDTO finalidadCertificadoDTO) {
		objLog.info("INI - actualizarFinalidadCertificadoDTO "+finalidadCertificadoDTO.getIdFinalidadCertificado());
		FinalidadCertificadoModel finalidadCertificado= new FinalidadCertificadoModel();
		finalidadCertificado = FinalidadCertificadoDTOMapper.FinalidadCertificadoDTOToFinalidadCertificadoModel(finalidadCertificadoDTO);

		finalidadCertificado = factoryNegocioDAO.getFinalidadCertificadoNegocioDAO().actualizarFinalidadCertificadoModel(finalidadCertificado);
		
		finalidadCertificadoDTO = FinalidadCertificadoDTOMapper.FinalidadCertificadoModelToFinalidadCertificadoDTO(finalidadCertificado);
		objLog.info("FIN - actualizarFinalidadCertificadoDTO "+finalidadCertificadoDTO.getIdFinalidadCertificado());
		return finalidadCertificadoDTO;
		
	}

	public FinalidadCertificadoDTO buscarFinalidadCertificadoxIdDTO(FinalidadCertificadoDTO finalidadCertificadoDTO) throws ServicioImplException{
		objLog.info("INI - buscarFinalidadCertificadoxIdDTO "+finalidadCertificadoDTO.getIdFinalidadCertificado());
		FinalidadCertificadoModel finalidadCertificado = new FinalidadCertificadoModel();
		finalidadCertificado = FinalidadCertificadoDTOMapper.FinalidadCertificadoDTOToFinalidadCertificadoModel(finalidadCertificadoDTO);

		try {
			finalidadCertificado=factoryNegocioDAO.getFinalidadCertificadoNegocioDAO().buscarFinalidadCertificadoxIdModel(finalidadCertificado);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		finalidadCertificadoDTO = FinalidadCertificadoDTOMapper.FinalidadCertificadoModelToFinalidadCertificadoDTO(finalidadCertificado);
		
		objLog.info("FIN - buscarFinalidadCertificadoxIdDTO "+finalidadCertificadoDTO.getIdFinalidadCertificado());
		return finalidadCertificadoDTO;
	}

	public List<FinalidadCertificadoDTO> listarFinalidadCertificadosDTO() {
		objLog.info("INI - listarFinalidadCertificadosDTO");
		List<FinalidadCertificadoDTO> listaFinalidadCertificadoDTO=new ArrayList<FinalidadCertificadoDTO>();
		List<FinalidadCertificadoModel> listaFinalidadCertificadoes = new ArrayList<FinalidadCertificadoModel>();
		
		listaFinalidadCertificadoes=factoryNegocioDAO.getFinalidadCertificadoNegocioDAO().listarFinalidadCertificadosModel();
		
		listaFinalidadCertificadoDTO = FinalidadCertificadoDTOMapper.ListFinalidadCertificadoModelToListFinalidadCertificadoDTO(listaFinalidadCertificadoes);
		
		objLog.info("FIN - listarFinalidadCertificadosDTO "+listaFinalidadCertificadoDTO.size());
		return listaFinalidadCertificadoDTO;
	}

}
