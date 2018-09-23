package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ComunaModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;
import com.manashiki.uchilearte.servicio.IComunaServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.ComunaDTOMapper;

@Service
public class ComunaServicio implements IComunaServicio{

	private static final Logger objLog = LoggerFactory.getLogger(ComunaServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	/**
	 * Crea una Entidad Comuna en la base de datos
	 * @param  comuna Comuna
	 * @return void
	 * @throws no lanza excepciones
	 */
	public ComunaDTO crearComunaDTO(ComunaDTO comunaDTO){
		objLog.info("INI - crearComunaDTO");
		ComunaModel comuna= new ComunaModel();
		comuna = ComunaDTOMapper.ComunaDTOToComunaModel(comunaDTO);

		comuna = factoryNegocioDAO.getComunaNegocioDAO().crearComunaModel(comuna);
		
		comunaDTO = ComunaDTOMapper.ComunaModelToComunaDTO(comuna);
		
		objLog.info("FIN - crearComunaDTO "+comunaDTO.getIdComuna());
		return comunaDTO;
	}

	public ComunaDTO actualizarComunaDTO(ComunaDTO comunaDTO) {
		objLog.info("INI - actualizarComunaDTO "+comunaDTO.getIdComuna());
		ComunaModel comuna= new ComunaModel();
		comuna = ComunaDTOMapper.ComunaDTOToComunaModel(comunaDTO);

		comuna = factoryNegocioDAO.getComunaNegocioDAO().actualizarComunaModel(comuna);
		
		comunaDTO = ComunaDTOMapper.ComunaModelToComunaDTO(comuna);
		objLog.info("FIN - actualizarComunaDTO "+comunaDTO.getIdComuna());
		return comunaDTO;
		
	}

	public ComunaDTO buscarComunaxIdDTO(ComunaDTO comunaDTO) throws ServicioImplException{
		objLog.info("INI - buscarComunaxIdDTO "+comunaDTO.getIdComuna());
		ComunaModel comuna = new ComunaModel();
		comuna = ComunaDTOMapper.ComunaDTOToComunaModel(comunaDTO);

		try {
			comuna=factoryNegocioDAO.getComunaNegocioDAO().buscarComunaxIdModel(comuna);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		comunaDTO = ComunaDTOMapper.ComunaModelToComunaDTO(comuna);
		
		objLog.info("FIN - buscarComunaxIdDTO "+comunaDTO.getIdComuna());
		return comunaDTO;
	}

	public List<ComunaDTO> listarComunasDTO() {
		objLog.info("INI - listarComunasDTO");
		List<ComunaDTO> listaComunaDTO=new ArrayList<ComunaDTO>();
		List<ComunaModel> listaComunaes = new ArrayList<ComunaModel>();
		
		listaComunaes=factoryNegocioDAO.getComunaNegocioDAO().listarComunasModel();
		
		listaComunaDTO = ComunaDTOMapper.ListComunaModelToListComunaDTO(listaComunaes);
		
		objLog.info("FIN - listarComunasDTO "+listaComunaDTO.size());
		return listaComunaDTO;
	}

	public List<ComunaDTO> listarComunasDTOxRegion(ComunaDTO comunaDTO) {
		objLog.info("INI - listarComunasDTOxRegion "+comunaDTO);
		ComunaModel comuna = new ComunaModel();
		List<ComunaDTO> listaComunaDTO=new ArrayList<ComunaDTO>();
		List<ComunaModel> listaComunas = new ArrayList<ComunaModel>();
		
		comuna = ComunaDTOMapper.ComunaDTOToComunaModel(comunaDTO);
		
		comuna.setIdRegion(comunaDTO.getIdRegion());
		
		listaComunas=factoryNegocioDAO.getComunaNegocioDAO().listarComunasModelxRegion(comuna);
		
		listaComunaDTO = ComunaDTOMapper.ListComunaModelToListComunaDTO(listaComunas);
		
		objLog.info("FIN - listarComunasDTOxRegion "+listaComunaDTO.size());
		return listaComunaDTO;
		
	}


}
