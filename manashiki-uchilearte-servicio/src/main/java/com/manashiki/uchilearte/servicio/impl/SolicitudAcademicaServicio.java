package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.SolicitudAcademicaModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servicio.ISolicitudAcademicaServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.SolicitudAcademicaDTOMapper;

@Service
public class SolicitudAcademicaServicio implements ISolicitudAcademicaServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(SolicitudAcademicaServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public SolicitudAcademicaDTO crearSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO) {
		objLog.info("INI - crearSolicitudAcademicaDTO");
		SolicitudAcademicaModel solicitudAcademica = new SolicitudAcademicaModel();
		solicitudAcademica = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTO);

		solicitudAcademica = factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().crearSolicitudAcademicaModel(solicitudAcademica);
		
		solicitudAcademicaDTO = SolicitudAcademicaDTOMapper.SolicitudAcademicaModelToSolicitudAcademicaDTO(solicitudAcademica);
		objLog.info("FIN - crearSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		return solicitudAcademicaDTO;

	}

	public SolicitudAcademicaDTO actualizarSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO) {
		objLog.info("INI - actualizarSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		SolicitudAcademicaModel solicitudAcademica = new SolicitudAcademicaModel();
		solicitudAcademica = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTO);

		solicitudAcademica = factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().actualizarSolicitudAcademicaModel(solicitudAcademica);
		
		solicitudAcademicaDTO = SolicitudAcademicaDTOMapper.SolicitudAcademicaModelToSolicitudAcademicaDTO(solicitudAcademica);
		objLog.info("FIN - actualizarSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		return solicitudAcademicaDTO;

	}

	public SolicitudAcademicaDTO buscarSolicitudAcademicaxIdDTO(SolicitudAcademicaDTO solicitudAcademicaDTO)throws ServicioImplException{
		objLog.info("INI - buscarSolicitudAcademicaxIdDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		SolicitudAcademicaModel solicitudAcademica = new SolicitudAcademicaModel();
		solicitudAcademica = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTO);

		try {
			solicitudAcademica=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().buscarSolicitudAcademicaxIdModel(solicitudAcademica);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		solicitudAcademicaDTO = SolicitudAcademicaDTOMapper.SolicitudAcademicaModelToSolicitudAcademicaDTO(solicitudAcademica);
		
		objLog.info("FIN - buscarSolicitudAcademicaxIdDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		return solicitudAcademicaDTO;
	}
	
	public SolicitudAcademicaDTO buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO)throws ServicioImplException{
		objLog.info("INI - buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		SolicitudAcademicaModel solicitudAcademica = new SolicitudAcademicaModel();
		solicitudAcademica = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTO);

		try {
			solicitudAcademica=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaModel(solicitudAcademica);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		solicitudAcademicaDTO = SolicitudAcademicaDTOMapper.SolicitudAcademicaModelToSolicitudAcademicaDTO(solicitudAcademica);
		
		objLog.info("FIN - buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		return solicitudAcademicaDTO;
	}
	
//	public SolicitudAcademicaDTO buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO)throws ServicioImplException{
//		objLog.info("INI - buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
//		SolicitudAcademicaModel solicitudAcademica = new SolicitudAcademicaModel();
//		solicitudAcademica = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTO);
//
//		try {
//			solicitudAcademica=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaModel(solicitudAcademica);
//		} catch (PersistenceImplException e) {
//			objLog.error("error en implementacion de Negocio:: ");
//			throw new NegocioImplException(e);
//		}
//		solicitudAcademicaDTO = SolicitudAcademicaDTOMapper.SolicitudAcademicaModelToSolicitudAcademicaDTO(solicitudAcademica);
//		
//		objLog.info("FIN - buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
//		return solicitudAcademicaDTO;
//	}
	
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicasDTO() {
		objLog.info("INI - listarSolicitudAcademicaesDTO");
		List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO=new ArrayList<SolicitudAcademicaDTO>();
		List<SolicitudAcademicaModel> listaSolicitudAcademicaes = new ArrayList<SolicitudAcademicaModel>();

		listaSolicitudAcademicaes=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().listarSolicitudAcademicasModel();

		listaSolicitudAcademicaDTO = SolicitudAcademicaDTOMapper.ListSolicitudAcademicaModelToListSolicitudAcademicaDTO(listaSolicitudAcademicaes);
		
		objLog.info("FIN - listarSolicitudAcademicaesDTO "+listaSolicitudAcademicaDTO.size());
		return listaSolicitudAcademicaDTO;
	}
	
	
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO){
		objLog.info("INI - listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		SolicitudAcademicaModel solicitudAcademica = new SolicitudAcademicaModel();
		List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO=new ArrayList<SolicitudAcademicaDTO>();
		List<SolicitudAcademicaModel> listaSolicitudAcademicas = new ArrayList<SolicitudAcademicaModel>();
		
		
		solicitudAcademica = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTO);
		
		listaSolicitudAcademicas=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaModel(solicitudAcademica);
		
		listaSolicitudAcademicaDTO = SolicitudAcademicaDTOMapper.ListSolicitudAcademicaModelToListSolicitudAcademicaDTO(listaSolicitudAcademicas);
		
		objLog.info("FIN - listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		return listaSolicitudAcademicaDTO;
	}
	
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicaxTipoSolicitudDTO(SolicitudAcademicaDTO solicitudAcademicaDTO){
		objLog.info("INI - listarSolicitudAcademicaxTipoSolicitudDTO "+solicitudAcademicaDTO.getIdTipoSolicitud());
		SolicitudAcademicaModel solicitudAcademica = new SolicitudAcademicaModel();
		
		List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO=new ArrayList<SolicitudAcademicaDTO>();

		List<SolicitudAcademicaModel> listaSolicitudAcademicas = new ArrayList<SolicitudAcademicaModel>();
		
		solicitudAcademica = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTO);
		
		listaSolicitudAcademicas=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().listarSolicitudAcademicaxTipoSolicitudModel(solicitudAcademica);
		
		listaSolicitudAcademicaDTO = SolicitudAcademicaDTOMapper.ListSolicitudAcademicaModelToListSolicitudAcademicaDTO(listaSolicitudAcademicas);
		
		objLog.info("FIN - listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaDTO "+solicitudAcademicaDTO.getIdSolicitudAcademica());
		
		return listaSolicitudAcademicaDTO;
	}
	
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicaxEntreFechasDTO(SolicitudAcademicaDTO solicitudAcademicaDTOInicial, SolicitudAcademicaDTO solicitudAcademicaDTOFinal){
		objLog.info("INI - listarSolicitudAcademicaxEntreFechasDTO "+solicitudAcademicaDTOInicial.getFechaSolicitud()+" v/s "+solicitudAcademicaDTOFinal.getFechaSolicitud());
		SolicitudAcademicaModel solicitudAcademicaInicial = new SolicitudAcademicaModel();
		SolicitudAcademicaModel solicitudAcademicaFinal = new SolicitudAcademicaModel();
		List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO=new ArrayList<SolicitudAcademicaDTO>();
		List<SolicitudAcademicaModel> listaSolicitudAcademicas = new ArrayList<SolicitudAcademicaModel>();
		
		
		solicitudAcademicaInicial = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTOInicial);
		solicitudAcademicaFinal = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTOFinal);
		
		listaSolicitudAcademicas=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().listarSolicitudAcademicaxxEntreFechasModel(solicitudAcademicaInicial, solicitudAcademicaFinal);
		
		listaSolicitudAcademicaDTO = SolicitudAcademicaDTOMapper.ListSolicitudAcademicaModelToListSolicitudAcademicaDTO(listaSolicitudAcademicas);
		
		objLog.info("FIN - listarSolicitudAcademicaxEntreFechasDTO "+listaSolicitudAcademicaDTO.size());
		return listaSolicitudAcademicaDTO;
	}
	
	public List<SolicitudAcademicaDTO> listarSolicitudAcademicaxEstadoDTO(SolicitudAcademicaDTO solicitudAcademicaDTO) {
		objLog.info("INI - listarSolicitudAcademicaxEstadoDTO");
		SolicitudAcademicaModel solicitudAcademica = new SolicitudAcademicaModel();
		List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO=new ArrayList<SolicitudAcademicaDTO>();
		List<SolicitudAcademicaModel> listaSolicitudAcademicas = new ArrayList<SolicitudAcademicaModel>();
		
		
		solicitudAcademica = SolicitudAcademicaDTOMapper.SolicitudAcademicaDTOToSolicitudAcademicaModel(solicitudAcademicaDTO);
		
		listaSolicitudAcademicas=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().listarSolicitudAcademicaxEstadoModel(solicitudAcademica);
		listaSolicitudAcademicaDTO = SolicitudAcademicaDTOMapper.ListSolicitudAcademicaModelToListSolicitudAcademicaDTO(listaSolicitudAcademicas);
		
		objLog.info("FIN - listarSolicitudAcademicaxEstadoDTO "+listaSolicitudAcademicaDTO.size());
		return listaSolicitudAcademicaDTO;
	}
	
	

}
