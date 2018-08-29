package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.TipoSolicitudModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servicio.ITipoSolicitudServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.TipoSolicitudDTOMapper;

@Service
public class TipoSolicitudServicio implements ITipoSolicitudServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(TipoSolicitudServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public TipoSolicitudDTO crearTipoSolicitudDTO(TipoSolicitudDTO tipoSolicitudDTO) {
		objLog.info("INI - crearTipoSolicitudDTO");
		TipoSolicitudModel tipoSolicitud = new TipoSolicitudModel();
		tipoSolicitud = TipoSolicitudDTOMapper.TipoSolicitudDTOToTipoSolicitudModel(tipoSolicitudDTO);

		tipoSolicitud = factoryNegocioDAO.getTipoSolicitudNegocioDAO().crearTipoSolicitudModel(tipoSolicitud);
		
		tipoSolicitudDTO = TipoSolicitudDTOMapper.TipoSolicitudModelToTipoSolicitudDTO(tipoSolicitud);
		objLog.info("FIN - crearTipoSolicitudDTO "+tipoSolicitudDTO.getIdTipoSolicitud());
		return tipoSolicitudDTO;

	}

	public TipoSolicitudDTO actualizarTipoSolicitudDTO(TipoSolicitudDTO tipoSolicitudDTO) {
		objLog.info("INI - actualizarTipoSolicitudDTO "+tipoSolicitudDTO.getIdTipoSolicitud());
		TipoSolicitudModel tipoSolicitud = new TipoSolicitudModel();
		tipoSolicitud = TipoSolicitudDTOMapper.TipoSolicitudDTOToTipoSolicitudModel(tipoSolicitudDTO);

		tipoSolicitud = factoryNegocioDAO.getTipoSolicitudNegocioDAO().actualizarTipoSolicitudModel(tipoSolicitud);
		
		tipoSolicitudDTO = TipoSolicitudDTOMapper.TipoSolicitudModelToTipoSolicitudDTO(tipoSolicitud);
		objLog.info("FIN - actualizarTipoSolicitudDTO "+tipoSolicitudDTO.getIdTipoSolicitud());
		return tipoSolicitudDTO;

	}

	public TipoSolicitudDTO buscarTipoSolicitudxIdDTO(TipoSolicitudDTO tipoSolicitudDTO)throws ServicioImplException{
		objLog.info("INI - buscarTipoSolicitudxIdDTO "+tipoSolicitudDTO.getIdTipoSolicitud());
		TipoSolicitudModel tipoSolicitud = new TipoSolicitudModel();
		tipoSolicitud = TipoSolicitudDTOMapper.TipoSolicitudDTOToTipoSolicitudModel(tipoSolicitudDTO);

		try {
			tipoSolicitud=factoryNegocioDAO.getTipoSolicitudNegocioDAO().buscarTipoSolicitudxIdModel(tipoSolicitud);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		tipoSolicitudDTO = TipoSolicitudDTOMapper.TipoSolicitudModelToTipoSolicitudDTO(tipoSolicitud);
		
		objLog.info("FIN - buscarTipoSolicitudxIdDTO "+tipoSolicitudDTO.getIdTipoSolicitud());
		return tipoSolicitudDTO;
	}

	public List<TipoSolicitudDTO> listarTipoSolicitudesDTO() {
		objLog.info("INI - listarTipoSolicitudesDTO");
		List<TipoSolicitudDTO> listaTipoSolicitudDTO=new ArrayList<TipoSolicitudDTO>();
		List<TipoSolicitudModel> listaTipoSolicitudes = new ArrayList<TipoSolicitudModel>();

		listaTipoSolicitudes=factoryNegocioDAO.getTipoSolicitudNegocioDAO().listarTipoSolicitudesModel();

		listaTipoSolicitudDTO = TipoSolicitudDTOMapper.ListTipoSolicitudModelToListTipoSolicitudDTO(listaTipoSolicitudes);
		
		objLog.info("FIN - listarTipoSolicitudesDTO "+listaTipoSolicitudDTO.size());
		return listaTipoSolicitudDTO;
	}

}
