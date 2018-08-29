package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.LogReservaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.LogReservaNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.LogReservaModelMapper;
import com.manashiki.uchilearte.negocio.model.LogReservaModel;

import vijnana.cache.component.ICacheComponent;

@Component
public class LogReservaNegocio implements LogReservaNegocioDAO{

	private static final Logger objLog = LoggerFactory.getLogger(LogReservaNegocio.class);
	
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	ICacheComponent objCacheComponent = null;
	
	/**
	 * Crea una Entidad LogReserva en la base de datos
	 * @param  logReserva LogReserva
	 * @return void
	 * @throws no lanza excepciones
	 */
	public LogReservaModel crearLogReservaModel(LogReservaModel logReservaModel){
		objLog.info("INI - crearLogReservaModel");
		LogReservaEntity logReserva= new LogReservaEntity();
		logReserva = LogReservaModelMapper.LogReservaModelToLogReservaEntity(logReservaModel);

		logReserva = factoryPersistenciaDAO.getLogReservaDAO().crearLogReservaEntity(logReserva);
		
		logReservaModel = LogReservaModelMapper.LogReservaEntityToLogReservaModel(logReserva);
		
		objLog.info("FIN - crearLogReservaModel "+logReservaModel.getIdLogReservaModel());
		return logReservaModel;
	}

	public LogReservaModel actualizarLogReservaModel(LogReservaModel logReservaModel) {
		objLog.info("INI - actualizarLogReservaModel "+logReservaModel.getIdLogReservaModel());
		LogReservaEntity logReserva= new LogReservaEntity();
		logReserva = LogReservaModelMapper.LogReservaModelToLogReservaEntity(logReservaModel);

		logReserva = factoryPersistenciaDAO.getLogReservaDAO().actualizarLogReservaEntity(logReserva);
		
		logReservaModel = LogReservaModelMapper.LogReservaEntityToLogReservaModel(logReserva);
		objLog.info("FIN - actualizarLogReservaModel "+logReservaModel.getIdLogReservaModel());
		return logReservaModel;
		
	}

	public LogReservaModel buscarLogReservaxIdModel(LogReservaModel logReservaModel) throws NegocioImplException{
		objLog.info("INI - buscarLogReservaxIdModel "+logReservaModel.getIdLogReservaModel());
		LogReservaEntity logReserva = new LogReservaEntity();
		logReserva = LogReservaModelMapper.LogReservaModelToLogReservaEntity(logReservaModel);

		try {
			logReserva=factoryPersistenciaDAO.getLogReservaDAO().buscarLogReservaxIdEntity(logReserva);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		logReservaModel = LogReservaModelMapper.LogReservaEntityToLogReservaModel(logReserva);
		
		objLog.info("FIN - buscarLogReservaxIdModel "+logReservaModel.getIdLogReservaModel());
		return logReservaModel;
	}

	public List<LogReservaModel> listarLogReservaModel() {
		objLog.info("INI - listarLogReservasModel");
		List<LogReservaModel> listaLogReservaModel=new ArrayList<LogReservaModel>();
		List<LogReservaEntity> listaLogReservaes = new ArrayList<LogReservaEntity>();
		
		listaLogReservaes=factoryPersistenciaDAO.getLogReservaDAO().listarLogReservaEntity();
		
		listaLogReservaModel = LogReservaModelMapper.ListLogReservaEntityToListLogReservaModel(listaLogReservaes);
				
		objLog.info("FIN - listarLogReservasModel "+listaLogReservaModel.size());
		
		return listaLogReservaModel;
	}
	
	

}
