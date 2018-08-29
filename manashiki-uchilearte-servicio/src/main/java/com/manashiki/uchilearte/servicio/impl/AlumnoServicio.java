package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.AlumnoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoDTO;
import com.manashiki.uchilearte.servicio.IAlumnoServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.AlumnoDTOMapper;

@Component
public class AlumnoServicio implements IAlumnoServicio{
	
	private static final Logger objLog = LoggerFactory.getLogger(AlumnoServicio.class);
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	public AlumnoDTO crearAlumnoDTO(AlumnoDTO alumnoDTO) {
		objLog.info("INI - crearAlumnoDTO");
		/****Crear usuario en Seguridad asociado a Universidad de Chile con el Id- Agregarlo al alumnoDTO*****/
		
		/****Crear usuario en Seguridad asociado a Universidad de Chile con el Id- Agregarlo al alumnoDTO*****/
		
		AlumnoModel alumnoModel = new AlumnoModel();
		alumnoModel = AlumnoDTOMapper.AlumnoDTOToAlumnoModel(alumnoDTO);
		
		
		alumnoModel = factoryNegocioDAO.getAlumnoNegocioDAO().crearAlumnoModel(alumnoModel);
		
		alumnoDTO = AlumnoDTOMapper.AlumnoModelToAlumnoDTO(alumnoModel);
		
		objLog.info("FIN - crearAlumnoDTO "+alumnoDTO.getIdAlumnoUchile());
		
		return alumnoDTO;
	}

	public AlumnoDTO actualizarAlumnoDTO(AlumnoDTO alumnoDTO) {
		objLog.info("INI - actualizarAlumnoDTO "+alumnoDTO.getIdAlumnoUchile());
		/****Crear usuario en Seguridad asociado a Universidad de Chile con el Id- Agregarlo al alumnoDTO*****/
		
		/****Crear usuario en Seguridad asociado a Universidad de Chile con el Id- Agregarlo al alumnoDTO*****/
		AlumnoModel alumnoModel = new AlumnoModel();
		alumnoModel = AlumnoDTOMapper.AlumnoDTOToAlumnoModel(alumnoDTO);
		
		alumnoModel = factoryNegocioDAO.getAlumnoNegocioDAO().actualizarAlumnoModel(alumnoModel);
		
		alumnoDTO = AlumnoDTOMapper.AlumnoModelToAlumnoDTO(alumnoModel);
		objLog.info("FIN - actualizarAlumnoDTO "+alumnoDTO.getIdAlumnoUchile());
		return alumnoDTO;
	}

	public AlumnoDTO buscarAlumnoxIdDTO(AlumnoDTO alumnoDTO) throws ServicioImplException {
		objLog.info("INI - buscarAlumnoxIdDTO "+alumnoDTO.getIdAlumnoUchile());
		AlumnoModel alumnoModel = new AlumnoModel();
		alumnoModel = AlumnoDTOMapper.AlumnoDTOToAlumnoModel(alumnoDTO);
		
		try {
			alumnoModel =factoryNegocioDAO.getAlumnoNegocioDAO().buscarAlumnoxIdModel(alumnoModel);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		alumnoDTO = AlumnoDTOMapper.AlumnoModelToAlumnoDTO(alumnoModel);
		objLog.info("FIN - buscarAlumnoxIdDTO "+alumnoDTO.getIdAlumnoUchile());
		return alumnoDTO;
	}
	
	public AlumnoDTO buscarAlumnoxIdUsuarioxIdEstadoDTO(AlumnoDTO alumnoDTO) throws ServicioImplException {
		objLog.info("INI - buscarAlumnoxIdUsuarioxIdEstadoDTO "+alumnoDTO.getIdAlumnoUchile());
		AlumnoModel alumnoModel = new AlumnoModel();
		alumnoModel = AlumnoDTOMapper.AlumnoDTOToAlumnoModel(alumnoDTO);
		
		try {
			alumnoModel=factoryNegocioDAO.getAlumnoNegocioDAO().buscarAlumnoxIdUsuarioxEstadoModel(alumnoModel);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		alumnoDTO = AlumnoDTOMapper.AlumnoModelToAlumnoDTO(alumnoModel);
		objLog.info("FIN - buscarAlumnoxIdUsuarioxIdEstadoDTO "+alumnoDTO.getIdAlumnoUchile());
		return alumnoDTO;
	}
	
	public List<AlumnoDTO> listarAlumnoDTO() {
		objLog.info("INI - listarAlumnoDTO");

		List<AlumnoDTO> listaAlumnoDTO=new ArrayList<AlumnoDTO>();
		
		List<AlumnoModel> listaAlumnoes = new ArrayList<AlumnoModel>();
		
		listaAlumnoes=factoryNegocioDAO.getAlumnoNegocioDAO().listarAlumnoModel();
		
		listaAlumnoDTO = AlumnoDTOMapper.ListAlumnoModelToListAlumnoDTO(listaAlumnoes);
		
		objLog.info("FIN - listarAlumnoDTO "+listaAlumnoDTO.size());
		
		return listaAlumnoDTO;
	}
	
	public List<AlumnoDTO> listarAlumnoNoAsociadoToUsuario() throws ServicioImplException{
		objLog.info("INI - listarAlumnoNoAsociadoToUsuario");

		List<AlumnoDTO> listaAlumnoDTO=new ArrayList<AlumnoDTO>();
		
		List<AlumnoModel> listaAlumnos = new ArrayList<AlumnoModel>();
		
		listaAlumnos=factoryNegocioDAO.getAlumnoNegocioDAO().listarAlumnoModel();
		
		listaAlumnoDTO = AlumnoDTOMapper.ListAlumnoModelToListAlumnoDTO(listaAlumnos);
		
		objLog.info("FIN - listarAlumnoNoAsociadoToUsuario "+listaAlumnoDTO.size());
		
		return listaAlumnoDTO;
	}
	
	public List<AlumnoDTO> listarAlumnoAsociadoToUsuario() throws ServicioImplException{
		objLog.info("INI - listarAlumnoAsociadoToUsuario");

		List<AlumnoDTO> listaAlumnoDTO=new ArrayList<AlumnoDTO>();
		
		List<AlumnoModel> listaAlumnos = new ArrayList<AlumnoModel>();
		
		listaAlumnos=factoryNegocioDAO.getAlumnoNegocioDAO().listarAlumnoModel();
		
		listaAlumnoDTO = AlumnoDTOMapper.ListAlumnoModelToListAlumnoDTO(listaAlumnos);
		
		objLog.info("FIN - listarAlumnoAsociadoToUsuario "+listaAlumnoDTO.size());
		
		return listaAlumnoDTO;
	}
	
	public List<AlumnoDTO> listarAlumnoAsociadoToSeguridad() throws ServicioImplException{
		objLog.info("INI - listarAlumnoAsociadoToSeguridad");

		List<AlumnoDTO> listaAlumnoDTO=new ArrayList<AlumnoDTO>();
		
		List<AlumnoModel> listaAlumnos = new ArrayList<AlumnoModel>();
		
		listaAlumnos=factoryNegocioDAO.getAlumnoNegocioDAO().listarAlumnoModel();
		
		listaAlumnoDTO = AlumnoDTOMapper.ListAlumnoModelToListAlumnoDTO(listaAlumnos);
		
		objLog.info("FIN - listarAlumnoAsociadoToSeguridad "+listaAlumnoDTO.size());
		
		return listaAlumnoDTO;
	}
	
	public List<AlumnoDTO> listarAlumnoNoAsociadoToSeguridad() throws ServicioImplException{
		objLog.info("INI - listarAlumnoAsociadoToSeguridad");

		List<AlumnoDTO> listaAlumnoDTO=new ArrayList<AlumnoDTO>();
		
		List<AlumnoModel> listaAlumnos = new ArrayList<AlumnoModel>();
		
		listaAlumnos=factoryNegocioDAO.getAlumnoNegocioDAO().listarAlumnoModel();
		
		listaAlumnoDTO = AlumnoDTOMapper.ListAlumnoModelToListAlumnoDTO(listaAlumnos);
		
		objLog.info("FIN - listarAlumnoAsociadoToSeguridad "+listaAlumnoDTO.size());
		
		return listaAlumnoDTO;
	}
	
	
}
