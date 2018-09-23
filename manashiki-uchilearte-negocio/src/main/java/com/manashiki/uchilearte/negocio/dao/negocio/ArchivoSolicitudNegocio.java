package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.ArchivoSolicitudEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.ArchivoSolicitudNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.ArchivoSolicitudModelMapper;
import com.manashiki.uchilearte.negocio.model.ArchivoSolicitudModel;

@Component
public class ArchivoSolicitudNegocio implements ArchivoSolicitudNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(ArchivoSolicitudNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public ArchivoSolicitudModel crearArchivoSolicitudModel(ArchivoSolicitudModel archivoSolicitudModel) {
		objLog.info("INI - crearArchivoSolicitudModel");
		ArchivoSolicitudEntity archivoSolicitud = new ArchivoSolicitudEntity();
		archivoSolicitud = ArchivoSolicitudModelMapper.ArchivoSolicitudModelToArchivoSolicitudEntity(archivoSolicitudModel);

		archivoSolicitud = factoryPersistenciaDAO.getArchivoSolicitudDAO().crearArchivoSolicitudEntity(archivoSolicitud);
		
		archivoSolicitudModel = ArchivoSolicitudModelMapper.ArchivoSolicitudEntityToArchivoSolicitudModel(archivoSolicitud);
		objLog.info("FIN - crearArchivoSolicitudModel "+archivoSolicitudModel.getIdArchivoSolicitud());
		return archivoSolicitudModel;

	}

	public ArchivoSolicitudModel actualizarArchivoSolicitudModel(ArchivoSolicitudModel archivoSolicitudModel) {
		objLog.info("INI - actualizarArchivoSolicitudModel "+archivoSolicitudModel.getIdArchivoSolicitud());
		ArchivoSolicitudEntity archivoSolicitud = new ArchivoSolicitudEntity();
		archivoSolicitud = ArchivoSolicitudModelMapper.ArchivoSolicitudModelToArchivoSolicitudEntity(archivoSolicitudModel);

		archivoSolicitud = factoryPersistenciaDAO.getArchivoSolicitudDAO().actualizarArchivoSolicitudEntity(archivoSolicitud);
		
		archivoSolicitudModel = ArchivoSolicitudModelMapper.ArchivoSolicitudEntityToArchivoSolicitudModel(archivoSolicitud);
		objLog.info("FIN - actualizarArchivoSolicitudModel "+archivoSolicitudModel.getIdArchivoSolicitud());
		return archivoSolicitudModel;

	}

	public ArchivoSolicitudModel buscarArchivoSolicitudxIdModel(ArchivoSolicitudModel archivoSolicitudModel)throws NegocioImplException{
		objLog.info("INI - buscarArchivoSolicitudxIdModel "+archivoSolicitudModel.getIdArchivoSolicitud());
		ArchivoSolicitudEntity archivoSolicitud = new ArchivoSolicitudEntity();
		archivoSolicitud = ArchivoSolicitudModelMapper.ArchivoSolicitudModelToArchivoSolicitudEntity(archivoSolicitudModel);

		try {
			archivoSolicitud=factoryPersistenciaDAO.getArchivoSolicitudDAO().buscarArchivoSolicitudxIdEntity(archivoSolicitud);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		archivoSolicitudModel = ArchivoSolicitudModelMapper.ArchivoSolicitudEntityToArchivoSolicitudModel(archivoSolicitud);
		
		objLog.info("FIN - buscarArchivoSolicitudxIdModel "+archivoSolicitudModel.getIdArchivoSolicitud());
		return archivoSolicitudModel;
	}

	public List<ArchivoSolicitudModel> listarArchivoSolicitudesModel() {
		objLog.info("INI - listarArchivoSolicitudesModel");
		List<ArchivoSolicitudModel> listaArchivoSolicitudModel=new ArrayList<ArchivoSolicitudModel>();
		List<ArchivoSolicitudEntity> listaArchivoSolicitudes = new ArrayList<ArchivoSolicitudEntity>();

		listaArchivoSolicitudes=factoryPersistenciaDAO.getArchivoSolicitudDAO().listarArchivoSolicitudesEntity();

		listaArchivoSolicitudModel = ArchivoSolicitudModelMapper.ListArchivoSolicitudEntityToListArchivoSolicitudModel(listaArchivoSolicitudes);
		
		objLog.info("FIN - listarArchivoSolicitudesModel "+listaArchivoSolicitudModel.size());
		return listaArchivoSolicitudModel;
	}

}
