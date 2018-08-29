package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.ArchivoSolicitudModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servicio.IArchivoSolicitudServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.ArchivoSolicitudDTOMapper;

@Service
public class ArchivoSolicitudServicio implements IArchivoSolicitudServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(ArchivoSolicitudServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public ArchivoSolicitudDTO crearArchivoSolicitudDTO(ArchivoSolicitudDTO archivoSolicitudDTO) {
		objLog.info("INI - crearArchivoSolicitudDTO");
		ArchivoSolicitudModel archivoSolicitud = new ArchivoSolicitudModel();
		archivoSolicitud = ArchivoSolicitudDTOMapper.ArchivoSolicitudDTOToArchivoSolicitudModel(archivoSolicitudDTO);

		archivoSolicitud = factoryNegocioDAO.getArchivoSolicitudNegocioDAO().crearArchivoSolicitudModel(archivoSolicitud);
		
		archivoSolicitudDTO = ArchivoSolicitudDTOMapper.ArchivoSolicitudModelToArchivoSolicitudDTO(archivoSolicitud);
		objLog.info("FIN - crearArchivoSolicitudDTO "+archivoSolicitudDTO.getIdArchivoSolicitud());
		return archivoSolicitudDTO;

	}

	public ArchivoSolicitudDTO actualizarArchivoSolicitudDTO(ArchivoSolicitudDTO archivoSolicitudDTO) {
		objLog.info("INI - actualizarArchivoSolicitudDTO "+archivoSolicitudDTO.getIdArchivoSolicitud());
		ArchivoSolicitudModel archivoSolicitud = new ArchivoSolicitudModel();
		archivoSolicitud = ArchivoSolicitudDTOMapper.ArchivoSolicitudDTOToArchivoSolicitudModel(archivoSolicitudDTO);

		archivoSolicitud = factoryNegocioDAO.getArchivoSolicitudNegocioDAO().actualizarArchivoSolicitudModel(archivoSolicitud);
		
		archivoSolicitudDTO = ArchivoSolicitudDTOMapper.ArchivoSolicitudModelToArchivoSolicitudDTO(archivoSolicitud);
		objLog.info("FIN - actualizarArchivoSolicitudDTO "+archivoSolicitudDTO.getIdArchivoSolicitud());
		return archivoSolicitudDTO;

	}

	public ArchivoSolicitudDTO buscarArchivoSolicitudIdDTO(ArchivoSolicitudDTO archivoSolicitudDTO)throws ServicioImplException{
		objLog.info("INI - buscarArchivoSolicitudxIdDTO "+archivoSolicitudDTO.getIdArchivoSolicitud());
		ArchivoSolicitudModel archivoSolicitud = new ArchivoSolicitudModel();
		archivoSolicitud = ArchivoSolicitudDTOMapper.ArchivoSolicitudDTOToArchivoSolicitudModel(archivoSolicitudDTO);

		try {
			archivoSolicitud=factoryNegocioDAO.getArchivoSolicitudNegocioDAO().buscarArchivoSolicitudxIdModel(archivoSolicitud);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		archivoSolicitudDTO = ArchivoSolicitudDTOMapper.ArchivoSolicitudModelToArchivoSolicitudDTO(archivoSolicitud);
		
		objLog.info("FIN - buscarArchivoSolicitudxIdDTO "+archivoSolicitudDTO.getIdArchivoSolicitud());
		return archivoSolicitudDTO;
	}

	public List<ArchivoSolicitudDTO> listarArchivoSolicitudesDTO() {
		objLog.info("INI - listarArchivoSolicitudesDTO");
		List<ArchivoSolicitudDTO> listaArchivoSolicitudDTO=new ArrayList<ArchivoSolicitudDTO>();
		List<ArchivoSolicitudModel> listaArchivoSolicitudes = new ArrayList<ArchivoSolicitudModel>();

		listaArchivoSolicitudes=factoryNegocioDAO.getArchivoSolicitudNegocioDAO().listarArchivoSolicitudesModel();

		listaArchivoSolicitudDTO = ArchivoSolicitudDTOMapper.ListArchivoSolicitudModelToListArchivoSolicitudDTO(listaArchivoSolicitudes);
		
		objLog.info("FIN - listarArchivoSolicitudesDTO "+listaArchivoSolicitudDTO.size());
		return listaArchivoSolicitudDTO;
	}

}
