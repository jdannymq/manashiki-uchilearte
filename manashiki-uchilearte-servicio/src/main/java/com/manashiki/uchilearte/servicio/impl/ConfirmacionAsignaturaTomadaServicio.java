package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ConfirmacionAsignaturaTomadaModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ConfirmacionAsignaturaTomadaDTO;
import com.manashiki.uchilearte.servicio.IConfirmacionAsignaturaTomadaServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.ConfirmacionAsignaturaTomadaDTOMapper;

@Component
public class ConfirmacionAsignaturaTomadaServicio implements IConfirmacionAsignaturaTomadaServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(ConfirmacionAsignaturaTomadaServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public ConfirmacionAsignaturaTomadaDTO crearConfirmacionAsignaturaTomadaDTO(ConfirmacionAsignaturaTomadaDTO objConfirmacionAsignaturaTomadaDTO) {
		objLog.info("INI - crearConfirmacionAsignaturaTomadaDTO");
		ConfirmacionAsignaturaTomadaModel confirmacionAsignaturaTomadaModel = new ConfirmacionAsignaturaTomadaModel();
		
		confirmacionAsignaturaTomadaModel = ConfirmacionAsignaturaTomadaDTOMapper.ConfirmacionAsignaturaTomadaDTOToConfirmacionAsignaturaTomadaModel(objConfirmacionAsignaturaTomadaDTO);
		
		confirmacionAsignaturaTomadaModel = factoryNegocioDAO.getConfirmacionAsignaturaTomadaNegocioDAO().crearConfirmacionAsignaturaTomadaModel(confirmacionAsignaturaTomadaModel);
		
		objConfirmacionAsignaturaTomadaDTO = ConfirmacionAsignaturaTomadaDTOMapper.ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaDTO(confirmacionAsignaturaTomadaModel);
		
		objLog.info("FIN - crearConfirmacionAsignaturaTomadaDTO "+objConfirmacionAsignaturaTomadaDTO.getIdConfirmacionAsignaturaTomada());
		
		return objConfirmacionAsignaturaTomadaDTO;
	}

	public ConfirmacionAsignaturaTomadaDTO actualizarConfirmacionAsignaturaTomadaDTO(ConfirmacionAsignaturaTomadaDTO confirmacionAsignaturaTomadaDTO) {
		objLog.info("INI - actualizarConfirmacionAsignaturaTomadaDTO "+confirmacionAsignaturaTomadaDTO.getIdConfirmacionAsignaturaTomada());
		ConfirmacionAsignaturaTomadaModel confirmacionAsignaturaTomada = new ConfirmacionAsignaturaTomadaModel();
		confirmacionAsignaturaTomada = ConfirmacionAsignaturaTomadaDTOMapper.ConfirmacionAsignaturaTomadaDTOToConfirmacionAsignaturaTomadaModel(confirmacionAsignaturaTomadaDTO);
		
		confirmacionAsignaturaTomada = factoryNegocioDAO.getConfirmacionAsignaturaTomadaNegocioDAO().actualizarConfirmacionAsignaturaTomadaModel(confirmacionAsignaturaTomada);
		
		confirmacionAsignaturaTomadaDTO = ConfirmacionAsignaturaTomadaDTOMapper.ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaDTO(confirmacionAsignaturaTomada);
		objLog.info("FIN - actualizarConfirmacionAsignaturaTomadaDTO "+confirmacionAsignaturaTomadaDTO.getIdConfirmacionAsignaturaTomada());
		return confirmacionAsignaturaTomadaDTO;
	}

	public ConfirmacionAsignaturaTomadaDTO buscarConfirmacionAsignaturaTomadaxIdDTO(ConfirmacionAsignaturaTomadaDTO confirmacionAsignaturaTomadaDTO) throws ServicioImplException {
		objLog.info("INI - buscarConfirmacionAsignaturaTomadaxIdDTO "+confirmacionAsignaturaTomadaDTO.getIdConfirmacionAsignaturaTomada());
		ConfirmacionAsignaturaTomadaModel confirmacionAsignaturaTomada = new ConfirmacionAsignaturaTomadaModel();
		confirmacionAsignaturaTomada = ConfirmacionAsignaturaTomadaDTOMapper.ConfirmacionAsignaturaTomadaDTOToConfirmacionAsignaturaTomadaModel(confirmacionAsignaturaTomadaDTO);
		
		try {
			confirmacionAsignaturaTomada=factoryNegocioDAO.getConfirmacionAsignaturaTomadaNegocioDAO().buscarConfirmacionAsignaturaTomadaxIdModel(confirmacionAsignaturaTomada);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		confirmacionAsignaturaTomadaDTO = ConfirmacionAsignaturaTomadaDTOMapper.ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaDTO(confirmacionAsignaturaTomada);
		objLog.info("FIN - buscarConfirmacionAsignaturaTomadaxIdDTO "+confirmacionAsignaturaTomadaDTO.getIdConfirmacionAsignaturaTomada());
		return confirmacionAsignaturaTomadaDTO;
	}
	
	public List<ConfirmacionAsignaturaTomadaDTO> listarConfirmacionAsignaturaTomadaDTO() {
		objLog.info("INI - listarConfirmacionAsignaturaTomadaesDTO");
		List<ConfirmacionAsignaturaTomadaDTO> listaConfirmacionAsignaturaTomadaDTO=new ArrayList<ConfirmacionAsignaturaTomadaDTO>();

		List<ConfirmacionAsignaturaTomadaModel> listaConfirmacionAsignaturaTomadaes = new ArrayList<ConfirmacionAsignaturaTomadaModel>();
		
		listaConfirmacionAsignaturaTomadaes=factoryNegocioDAO.getConfirmacionAsignaturaTomadaNegocioDAO().listarConfirmacionAsignaturaTomadaModel();
		
		listaConfirmacionAsignaturaTomadaDTO = ConfirmacionAsignaturaTomadaDTOMapper.ListConfirmacionAsignaturaTomadaModelToListConfirmacionAsignaturaTomadaDTO(listaConfirmacionAsignaturaTomadaes);
		
		objLog.info("FIN - listarConfirmacionAsignaturaTomadaesDTO "+listaConfirmacionAsignaturaTomadaDTO.size());
		return listaConfirmacionAsignaturaTomadaDTO;
	}
	
}
