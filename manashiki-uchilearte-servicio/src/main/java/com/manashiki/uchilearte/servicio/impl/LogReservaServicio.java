package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.LogReservaModel;
import com.manashiki.uchilearte.servdto.transaccion.LogReservaDTO;
import com.manashiki.uchilearte.servicio.ILogReservaServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.mapper.LogReservaDTOMapper;


@Service
public class LogReservaServicio implements ILogReservaServicio{

	private static final Logger objLog = LoggerFactory.getLogger(LogReservaServicio.class);
	
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	/**
	 * Crea una Entidad LogReserva en la base de datos
	 * @param  logReservaModel LogReserva
	 * @return void
	 * @throws no lanza excepciones
	 */
	public LogReservaDTO crearLogReservaDTO(LogReservaDTO objLogReservaDTO){
		objLog.info("INI - crearLogReservaDTO");
		LogReservaModel logReservaModel = new LogReservaModel();
		
		logReservaModel = LogReservaDTOMapper.LogReservaDTOToLogReservaModel(objLogReservaDTO);

		logReservaModel = factoryNegocioDAO.getLogReservaNegocioDAO().crearLogReservaModel(logReservaModel);
		
		objLogReservaDTO = LogReservaDTOMapper.LogReservaModelToLogReservaDTO(logReservaModel);
		
		objLog.info("FIN - crearLogReservaDTO "+objLogReservaDTO.getIdLogReservaDTO());
		
		return objLogReservaDTO;
	}

	public LogReservaDTO actualizarLogReservaDTO(LogReservaDTO objLogReservaDTO) {
		objLog.info("INI - actualizarLogReservaDTO "+objLogReservaDTO.getIdLogReservaDTO());
		LogReservaModel logReservaModel= new LogReservaModel();
		logReservaModel = LogReservaDTOMapper.LogReservaDTOToLogReservaModel(objLogReservaDTO);

		logReservaModel = factoryNegocioDAO.getLogReservaNegocioDAO().actualizarLogReservaModel(logReservaModel);
		
		objLogReservaDTO = LogReservaDTOMapper.LogReservaModelToLogReservaDTO(logReservaModel);
		if(objLogReservaDTO!=null){
			objLog.info("FIN - actualizarLogReservaDTO "+objLogReservaDTO.getIdLogReservaDTO());
		}
		return objLogReservaDTO;
		
	}

	public LogReservaDTO buscarLogReservaxIdDTO(LogReservaDTO objLogReservaDTO) throws ServicioImplException{
		objLog.info("INI - buscarLogReservaxIdDTO "+objLogReservaDTO.getIdLogReservaDTO());
		LogReservaModel logReservaModel = new LogReservaModel();
		logReservaModel = LogReservaDTOMapper.LogReservaDTOToLogReservaModel(objLogReservaDTO);

		try {
			logReservaModel=factoryNegocioDAO.getLogReservaNegocioDAO().buscarLogReservaxIdModel(logReservaModel);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		objLogReservaDTO = LogReservaDTOMapper.LogReservaModelToLogReservaDTO(logReservaModel);
		
		if(objLogReservaDTO!=null){
			objLog.info("FIN - buscarLogReservaxIdDTO "+objLogReservaDTO.getIdLogReservaDTO());
		}
		return objLogReservaDTO;
	}

	public List<LogReservaDTO> listarLogReservaDTO() {
		objLog.info("INI - listarLogReservaDTO");
		List<LogReservaDTO> listaLogReservaDTO=new ArrayList<LogReservaDTO>();
		List<LogReservaModel> listaLogReservaes = new ArrayList<LogReservaModel>();
		
		listaLogReservaes=factoryNegocioDAO.getLogReservaNegocioDAO().listarLogReservaModel();;
		
		listaLogReservaDTO = LogReservaDTOMapper.ListLogReservaModelToListLogReservaDTO(listaLogReservaes);
		
		if(listaLogReservaDTO!=null){
			objLog.info("FIN - listarLogReservaDTO tam:"+listaLogReservaDTO.size());
		}
		return listaLogReservaDTO;
	}

}
