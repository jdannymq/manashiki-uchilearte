package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.SolicitudCertificadoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.servicio.ISolicitudCertificadoServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.SolicitudCertificadoDTOMapper;

@Service
public class SolicitudCertificadoServicio implements ISolicitudCertificadoServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(SolicitudCertificadoServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public SolicitudCertificadoDTO crearSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO) {
		objLog.info("INI - crearSolicitudCertificadoDTO");
		SolicitudCertificadoModel solicitudCertificado = new SolicitudCertificadoModel();
		solicitudCertificado = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTO);

		solicitudCertificado = factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().crearSolicitudCertificadoModel(solicitudCertificado);
		
		solicitudCertificadoDTO = SolicitudCertificadoDTOMapper.SolicitudCertificadoModelToSolicitudCertificadoDTO(solicitudCertificado);
		objLog.info("FIN - crearSolicitudCertificadoDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
		return solicitudCertificadoDTO;

	}

	public SolicitudCertificadoDTO actualizarSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO) {
		objLog.info("INI - actualizarSolicitudCertificadoDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
		SolicitudCertificadoModel solicitudCertificado = new SolicitudCertificadoModel();
		solicitudCertificado = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTO);

		solicitudCertificado = factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().actualizarSolicitudCertificadoModel(solicitudCertificado);
		
		solicitudCertificadoDTO = SolicitudCertificadoDTOMapper.SolicitudCertificadoModelToSolicitudCertificadoDTO(solicitudCertificado);
		objLog.info("FIN - actualizarSolicitudCertificadoDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
		return solicitudCertificadoDTO;

	}

	public SolicitudCertificadoDTO buscarSolicitudCertificadoxIdDTO(SolicitudCertificadoDTO solicitudCertificadoDTO)throws ServicioImplException{
		objLog.info("INI - buscarSolicitudCertificadoxIdDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
		SolicitudCertificadoModel solicitudCertificado = new SolicitudCertificadoModel();
		solicitudCertificado = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTO);

		try {
			solicitudCertificado=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().buscarSolicitudCertificadoxIdModel(solicitudCertificado);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		solicitudCertificadoDTO = SolicitudCertificadoDTOMapper.SolicitudCertificadoModelToSolicitudCertificadoDTO(solicitudCertificado);
		
		objLog.info("FIN - buscarSolicitudCertificadoxIdDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
		return solicitudCertificadoDTO;
	}
	
	public SolicitudCertificadoDTO buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO)throws ServicioImplException{
		objLog.info("INI - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
		SolicitudCertificadoModel solicitudCertificado = new SolicitudCertificadoModel();
		solicitudCertificado = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTO);

		try {
			solicitudCertificado=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoModel(solicitudCertificado);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Servicio:: ");
			throw new ServicioImplException(e);
		}
		solicitudCertificadoDTO = SolicitudCertificadoDTOMapper.SolicitudCertificadoModelToSolicitudCertificadoDTO(solicitudCertificado);
		
		objLog.info("FIN - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
		return solicitudCertificadoDTO;
	}
	
//	public SolicitudCertificadoDTO buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO)throws ServicioImplException{
//		objLog.info("INI - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
//		SolicitudCertificadoModel solicitudCertificado = new SolicitudCertificadoModel();
//		solicitudCertificado = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTO);
//
//		try {
//			solicitudCertificado=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoModel(solicitudCertificado);
//		} catch (NegocioImplException e) {
//			objLog.error("error en implementacion de Servicio:: ");
//			throw new ServicioImplException(e);
//		}
//		solicitudCertificadoDTO = SolicitudCertificadoDTOMapper.SolicitudCertificadoModelToSolicitudCertificadoDTO(solicitudCertificado);
//		
//		objLog.info("FIN - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
//		return solicitudCertificadoDTO;
//	}
	
	public List<SolicitudCertificadoDTO> listarSolicitudCertificadosDTO() {
		objLog.info("INI - listarSolicitudCertificadoesDTO");
		List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO=new ArrayList<SolicitudCertificadoDTO>();
		List<SolicitudCertificadoModel> listaSolicitudCertificadoes = new ArrayList<SolicitudCertificadoModel>();

		listaSolicitudCertificadoes=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().listarSolicitudCertificadosModel();

		listaSolicitudCertificadoDTO = SolicitudCertificadoDTOMapper.ListSolicitudCertificadoModelToListSolicitudCertificadoDTO(listaSolicitudCertificadoes);
		
		objLog.info("FIN - listarSolicitudCertificadoesDTO "+listaSolicitudCertificadoDTO.size());
		return listaSolicitudCertificadoDTO;
	}
	
	public List<SolicitudCertificadoDTO> listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO){
		objLog.info("INI - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoDTO "+solicitudCertificadoDTO.getIdSolicitudCertificado());
		SolicitudCertificadoModel solicitudCertificado = new SolicitudCertificadoModel();
		
		List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO=new ArrayList<SolicitudCertificadoDTO>();
		List<SolicitudCertificadoModel> listaSolicitudCertificados = new ArrayList<SolicitudCertificadoModel>();
		
		
		solicitudCertificado = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTO);
		
		listaSolicitudCertificados=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoModel(solicitudCertificado);
		listaSolicitudCertificadoDTO = SolicitudCertificadoDTOMapper.ListSolicitudCertificadoModelToListSolicitudCertificadoDTO(listaSolicitudCertificados);
		
		objLog.info("FIN - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoDTO "+listaSolicitudCertificadoDTO.size());
		return listaSolicitudCertificadoDTO;
	}
	
	public List<SolicitudCertificadoDTO> listarSolicitudCertificadoxEntreFechasDTO(SolicitudCertificadoDTO solicitudCertificadoDTOInicial, SolicitudCertificadoDTO solicitudCertificadoDTOFinal){
		objLog.info("INI - listarSolicitudCertificadoxEntreFechasDTO "+solicitudCertificadoDTOInicial.getFechaSolicitud()+" v/s "+solicitudCertificadoDTOFinal.getFechaSolicitud());
		SolicitudCertificadoModel solicitudCertificadoInicial = new SolicitudCertificadoModel();
		SolicitudCertificadoModel solicitudCertificadoFinal = new SolicitudCertificadoModel();
		List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO=new ArrayList<SolicitudCertificadoDTO>();
		List<SolicitudCertificadoModel> listaSolicitudCertificados = new ArrayList<SolicitudCertificadoModel>();
		
		
		solicitudCertificadoInicial = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTOInicial);
		solicitudCertificadoFinal = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTOFinal);
		
		listaSolicitudCertificados=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().listarSolicitudCertificadoxEntreFechasModel(solicitudCertificadoInicial, solicitudCertificadoFinal);
		
		listaSolicitudCertificadoDTO = SolicitudCertificadoDTOMapper.ListSolicitudCertificadoModelToListSolicitudCertificadoDTO(listaSolicitudCertificados);
		
		objLog.info("FIN - listarSolicitudCertificadoxEntreFechasDTO "+listaSolicitudCertificadoDTO.size());
		return listaSolicitudCertificadoDTO;
	}
	
	public List<SolicitudCertificadoDTO> listarSolicitudCertificadoxEstadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO) {
		objLog.info("INI - listarSolicitudCertificadoxEstadoDTO");
		SolicitudCertificadoModel solicitudCertificado = new SolicitudCertificadoModel();
		List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO=new ArrayList<SolicitudCertificadoDTO>();
		List<SolicitudCertificadoModel> listaSolicitudCertificados = new ArrayList<SolicitudCertificadoModel>();
		
		
		solicitudCertificado = SolicitudCertificadoDTOMapper.SolicitudCertificadoDTOToSolicitudCertificadoModel(solicitudCertificadoDTO);
		
		listaSolicitudCertificados=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().listarSolicitudCertificadoxEstadoModel(solicitudCertificado);
		listaSolicitudCertificadoDTO = SolicitudCertificadoDTOMapper.ListSolicitudCertificadoModelToListSolicitudCertificadoDTO(listaSolicitudCertificados);
		
		objLog.info("FIN - listarSolicitudCertificadoxEstadoDTO "+listaSolicitudCertificadoDTO.size());
		return listaSolicitudCertificadoDTO;
	}
	
	

}
