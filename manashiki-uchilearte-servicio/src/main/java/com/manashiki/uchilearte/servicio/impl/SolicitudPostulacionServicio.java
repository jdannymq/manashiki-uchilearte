package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.SolicitudPostulacionModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;
import com.manashiki.uchilearte.servicio.ISolicitudPostulacionServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.SolicitudPostulacionDTOMapper;

@Service
public class SolicitudPostulacionServicio implements ISolicitudPostulacionServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(SolicitudPostulacionServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public SolicitudPostulacionDTO crearSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO) {
		objLog.info("INI - crearSolicitudPostulacionDTO");
		SolicitudPostulacionModel solicitudPostulacion = new SolicitudPostulacionModel();
		solicitudPostulacion = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTO);

		solicitudPostulacion = factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().crearSolicitudPostulacionModel(solicitudPostulacion);
		
		solicitudPostulacionDTO = SolicitudPostulacionDTOMapper.SolicitudPostulacionModelToSolicitudPostulacionDTO(solicitudPostulacion);
		objLog.info("FIN - crearSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		return solicitudPostulacionDTO;

	}

	public SolicitudPostulacionDTO actualizarSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO) {
		objLog.info("INI - actualizarSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		SolicitudPostulacionModel solicitudPostulacion = new SolicitudPostulacionModel();
		solicitudPostulacion = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTO);

		solicitudPostulacion = factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().actualizarSolicitudPostulacionModel(solicitudPostulacion);
		
		solicitudPostulacionDTO = SolicitudPostulacionDTOMapper.SolicitudPostulacionModelToSolicitudPostulacionDTO(solicitudPostulacion);
		objLog.info("FIN - actualizarSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		return solicitudPostulacionDTO;

	}

	public SolicitudPostulacionDTO buscarSolicitudPostulacionxIdDTO(SolicitudPostulacionDTO solicitudPostulacionDTO)throws ServicioImplException{
		objLog.info("INI - buscarSolicitudPostulacionxIdDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		SolicitudPostulacionModel solicitudPostulacion = new SolicitudPostulacionModel();
		solicitudPostulacion = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTO);

		try {
			solicitudPostulacion=factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().buscarSolicitudPostulacionxIdModel(solicitudPostulacion);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		solicitudPostulacionDTO = SolicitudPostulacionDTOMapper.SolicitudPostulacionModelToSolicitudPostulacionDTO(solicitudPostulacion);
		
		objLog.info("FIN - buscarSolicitudPostulacionxIdDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		return solicitudPostulacionDTO;
	}
	
	public SolicitudPostulacionDTO buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO)throws ServicioImplException{
		objLog.info("INI - buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		SolicitudPostulacionModel solicitudPostulacion = new SolicitudPostulacionModel();
		solicitudPostulacion = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTO);

		try {
			solicitudPostulacion=factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionModel(solicitudPostulacion);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		solicitudPostulacionDTO = SolicitudPostulacionDTOMapper.SolicitudPostulacionModelToSolicitudPostulacionDTO(solicitudPostulacion);
		
		objLog.info("FIN - buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		return solicitudPostulacionDTO;
	}
	
//	public SolicitudPostulacionDTO buscarSolicitudPostulacionxNombrePersonaSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO)throws ServicioImplException{
//		objLog.info("INI - buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
//		SolicitudPostulacionModel solicitudPostulacion = new SolicitudPostulacionModel();
//		solicitudPostulacion = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTO);
//
//		try {
//			solicitudPostulacion=factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().buscarSolicitudPostulacionxNombrePersonaSolicitudPostulacionModel(solicitudPostulacion);
//		} catch (PersistenceImplException e) {
//			objLog.error("error en implementacion de Negocio:: ");
//			throw new NegocioImplException(e);
//		}
//		solicitudPostulacionDTO = SolicitudPostulacionDTOMapper.SolicitudPostulacionModelToSolicitudPostulacionDTO(solicitudPostulacion);
//		
//		objLog.info("FIN - buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
//		return solicitudPostulacionDTO;
//	}
	
	public List<SolicitudPostulacionDTO> listarSolicitudPostulacionesDTO() {
		objLog.info("INI - listarSolicitudPostulacionesDTO");
		List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO=new ArrayList<SolicitudPostulacionDTO>();
		List<SolicitudPostulacionModel> listaSolicitudPostulaciones = new ArrayList<SolicitudPostulacionModel>();

		listaSolicitudPostulaciones=factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().listarSolicitudPostulacionesModel();

		listaSolicitudPostulacionDTO = SolicitudPostulacionDTOMapper.ListSolicitudPostulacionModelToListSolicitudPostulacionDTO(listaSolicitudPostulaciones);
		
		objLog.info("FIN - listarSolicitudPostulacionesDTO "+listaSolicitudPostulacionDTO.size());
		return listaSolicitudPostulacionDTO;
	}
	
	
	public List<SolicitudPostulacionDTO> listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO){
		objLog.info("INI - listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		SolicitudPostulacionModel solicitudPostulacion = new SolicitudPostulacionModel();
		List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO=new ArrayList<SolicitudPostulacionDTO>();
		List<SolicitudPostulacionModel> listaSolicitudPostulacions = new ArrayList<SolicitudPostulacionModel>();
		
		
		solicitudPostulacion = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTO);
		
		listaSolicitudPostulacions=factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionModel(solicitudPostulacion);
		
		listaSolicitudPostulacionDTO = SolicitudPostulacionDTOMapper.ListSolicitudPostulacionModelToListSolicitudPostulacionDTO(listaSolicitudPostulacions);
		
		objLog.info("FIN - listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
		return listaSolicitudPostulacionDTO;
	}
	
//	public List<SolicitudPostulacionDTO> listarSolicitudPostulacionxTipoSolicitudDTO(SolicitudPostulacionDTO solicitudPostulacionDTO){
//		objLog.info("INI - listarSolicitudPostulacionxTipoSolicitudDTO "+solicitudPostulacionDTO.getIdTipoPostulacion());
//		SolicitudPostulacionModel solicitudPostulacion = new SolicitudPostulacionModel();
//		
//		List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO=new ArrayList<SolicitudPostulacionDTO>();
//
//		List<SolicitudPostulacionModel> listaSolicitudPostulacions = new ArrayList<SolicitudPostulacionModel>();
//		
//		solicitudPostulacion = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTO);
//		
//		listaSolicitudPostulacions=factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().listarSolicitudPostulacionxTipoSolicitudModel(solicitudPostulacion);
//		
//		listaSolicitudPostulacionDTO = SolicitudPostulacionDTOMapper.ListSolicitudPostulacionModelToListSolicitudPostulacionDTO(listaSolicitudPostulacions);
//		
//		objLog.info("FIN - listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionDTO "+solicitudPostulacionDTO.getIdSolicitudPostulacion());
//		
//		return listaSolicitudPostulacionDTO;
//	}
	
	public List<SolicitudPostulacionDTO> listarSolicitudPostulacionxEntreFechasDTO(SolicitudPostulacionDTO solicitudPostulacionDTOInicial, SolicitudPostulacionDTO solicitudPostulacionDTOFinal){
		objLog.info("INI - listarSolicitudPostulacionxEntreFechasDTO "+solicitudPostulacionDTOInicial.getFechaSolicitudPostulacion()+" v/s "+solicitudPostulacionDTOFinal.getFechaSolicitudPostulacion());
		SolicitudPostulacionModel solicitudPostulacionInicial = new SolicitudPostulacionModel();
		SolicitudPostulacionModel solicitudPostulacionFinal = new SolicitudPostulacionModel();
		List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO=new ArrayList<SolicitudPostulacionDTO>();
		List<SolicitudPostulacionModel> listaSolicitudPostulacions = new ArrayList<SolicitudPostulacionModel>();
		
		
		solicitudPostulacionInicial = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTOInicial);
		solicitudPostulacionFinal = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTOFinal);
		
		listaSolicitudPostulacions=factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().listarSolicitudPostulacionxxEntreFechasModel(solicitudPostulacionInicial, solicitudPostulacionFinal);
		
		listaSolicitudPostulacionDTO = SolicitudPostulacionDTOMapper.ListSolicitudPostulacionModelToListSolicitudPostulacionDTO(listaSolicitudPostulacions);
		
		objLog.info("FIN - listarSolicitudPostulacionxEntreFechasDTO "+listaSolicitudPostulacionDTO.size());
		return listaSolicitudPostulacionDTO;
	}
	
	public List<SolicitudPostulacionDTO> listarSolicitudPostulacionxEstadoDTO(SolicitudPostulacionDTO solicitudPostulacionDTO) {
		objLog.info("INI - listarSolicitudPostulacionxEstadoDTO");
		SolicitudPostulacionModel solicitudPostulacion = new SolicitudPostulacionModel();
		List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO=new ArrayList<SolicitudPostulacionDTO>();
		List<SolicitudPostulacionModel> listaSolicitudPostulacions = new ArrayList<SolicitudPostulacionModel>();
		
		
		solicitudPostulacion = SolicitudPostulacionDTOMapper.SolicitudPostulacionDTOToSolicitudPostulacionModel(solicitudPostulacionDTO);
		
		listaSolicitudPostulacions=factoryNegocioDAO.getSolicitudPostulacionNegocioDAO().listarSolicitudPostulacionxEstadoModel(solicitudPostulacion);
		listaSolicitudPostulacionDTO = SolicitudPostulacionDTOMapper.ListSolicitudPostulacionModelToListSolicitudPostulacionDTO(listaSolicitudPostulacions);
		
		objLog.info("FIN - listarSolicitudPostulacionxEstadoDTO "+listaSolicitudPostulacionDTO.size());
		return listaSolicitudPostulacionDTO;
	}
	
	

}
