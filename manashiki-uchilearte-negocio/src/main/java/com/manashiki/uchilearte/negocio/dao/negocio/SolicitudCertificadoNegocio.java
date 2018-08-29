package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.SolicitudCertificadoEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.SolicitudCertificadoNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.SolicitudCertificadoModelMapper;
import com.manashiki.uchilearte.negocio.model.SolicitudCertificadoModel;

@Component
public class SolicitudCertificadoNegocio implements SolicitudCertificadoNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(SolicitudCertificadoNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public SolicitudCertificadoModel crearSolicitudCertificadoModel(SolicitudCertificadoModel solicitudCertificadoModel) {
		objLog.info("INI - crearSolicitudCertificadoModel");
		SolicitudCertificadoEntity solicitudCertificado = new SolicitudCertificadoEntity();
		solicitudCertificado = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModel);

		solicitudCertificado = factoryPersistenciaDAO.getSolicitudCertificadoDAO().crearSolicitudCertificadoEntity(solicitudCertificado);
		
		solicitudCertificadoModel = SolicitudCertificadoModelMapper.SolicitudCertificadoEntityToSolicitudCertificadoModel(solicitudCertificado);
		objLog.info("FIN - crearSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		return solicitudCertificadoModel;

	}

	public SolicitudCertificadoModel actualizarSolicitudCertificadoModel(SolicitudCertificadoModel solicitudCertificadoModel) {
		objLog.info("INI - actualizarSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		SolicitudCertificadoEntity solicitudCertificado = new SolicitudCertificadoEntity();
		solicitudCertificado = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModel);

		solicitudCertificado = factoryPersistenciaDAO.getSolicitudCertificadoDAO().actualizarSolicitudCertificadoEntity(solicitudCertificado);
		
		solicitudCertificadoModel = SolicitudCertificadoModelMapper.SolicitudCertificadoEntityToSolicitudCertificadoModel(solicitudCertificado);
		objLog.info("FIN - actualizarSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		return solicitudCertificadoModel;

	}

	public SolicitudCertificadoModel buscarSolicitudCertificadoxIdModel(SolicitudCertificadoModel solicitudCertificadoModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudCertificadoxIdModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		SolicitudCertificadoEntity solicitudCertificado = new SolicitudCertificadoEntity();
		solicitudCertificado = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModel);

		try {
			solicitudCertificado=factoryPersistenciaDAO.getSolicitudCertificadoDAO().buscarSolicitudCertificadoxIdEntity(solicitudCertificado);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudCertificadoModel = SolicitudCertificadoModelMapper.SolicitudCertificadoEntityToSolicitudCertificadoModel(solicitudCertificado);
		
		objLog.info("FIN - buscarSolicitudCertificadoxIdModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		return solicitudCertificadoModel;
	}
	
	public SolicitudCertificadoModel buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoModel(SolicitudCertificadoModel solicitudCertificadoModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		SolicitudCertificadoEntity solicitudCertificado = new SolicitudCertificadoEntity();
		solicitudCertificado = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModel);

		try {
			solicitudCertificado=factoryPersistenciaDAO.getSolicitudCertificadoDAO().buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoEntity(solicitudCertificado);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudCertificadoModel = SolicitudCertificadoModelMapper.SolicitudCertificadoEntityToSolicitudCertificadoModel(solicitudCertificado);
		
		objLog.info("FIN - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		return solicitudCertificadoModel;
	}
	
	public SolicitudCertificadoModel buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoModel(SolicitudCertificadoModel solicitudCertificadoModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		SolicitudCertificadoEntity solicitudCertificado = new SolicitudCertificadoEntity();
		solicitudCertificado = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModel);

		try {
			solicitudCertificado=factoryPersistenciaDAO.getSolicitudCertificadoDAO().buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoEntity(solicitudCertificado);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudCertificadoModel = SolicitudCertificadoModelMapper.SolicitudCertificadoEntityToSolicitudCertificadoModel(solicitudCertificado);
		
		objLog.info("FIN - buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		return solicitudCertificadoModel;
	}
	
	public List<SolicitudCertificadoModel> listarSolicitudCertificadosModel() {
		objLog.info("INI - listarSolicitudCertificadoesModel");
		List<SolicitudCertificadoModel> listaSolicitudCertificadoModel=new ArrayList<SolicitudCertificadoModel>();
		List<SolicitudCertificadoEntity> listaSolicitudCertificadoes = new ArrayList<SolicitudCertificadoEntity>();

		listaSolicitudCertificadoes=factoryPersistenciaDAO.getSolicitudCertificadoDAO().listarSolicitudCertificadosEntity();

		listaSolicitudCertificadoModel = SolicitudCertificadoModelMapper.ListSolicitudCertificadoEntityToListSolicitudCertificadoModel(listaSolicitudCertificadoes);
		
		objLog.info("FIN - listarSolicitudCertificadoesModel "+listaSolicitudCertificadoModel.size());
		return listaSolicitudCertificadoModel;
	}
	
	
	public List<SolicitudCertificadoModel> listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoModel(SolicitudCertificadoModel solicitudCertificadoModel){
		objLog.info("INI - listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		SolicitudCertificadoEntity solicitudCertificado = new SolicitudCertificadoEntity();
		List<SolicitudCertificadoModel> listaSolicitudCertificadoModel=new ArrayList<SolicitudCertificadoModel>();
		List<SolicitudCertificadoEntity> listaSolicitudCertificados = new ArrayList<SolicitudCertificadoEntity>();
		
		
		solicitudCertificado = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModel);
		
		listaSolicitudCertificados=factoryPersistenciaDAO.getSolicitudCertificadoDAO().listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoEntity(solicitudCertificado);
		
		listaSolicitudCertificadoModel = SolicitudCertificadoModelMapper.ListSolicitudCertificadoEntityToListSolicitudCertificadoModel(listaSolicitudCertificados);
		
		objLog.info("FIN - listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoModel "+solicitudCertificadoModel.getIdSolicitudCertificado());
		return listaSolicitudCertificadoModel;
	}
	
	public List<SolicitudCertificadoModel> listarSolicitudCertificadoxEntreFechasModel(SolicitudCertificadoModel solicitudCertificadoModelInicial,SolicitudCertificadoModel solicitudCertificadoModelFinal) {
		objLog.info("INI - listarSolicitudCertificadoxEstadoModel");
		SolicitudCertificadoEntity solicitudCertificadoInicial = new SolicitudCertificadoEntity();
		SolicitudCertificadoEntity solicitudCertificadoFinal = new SolicitudCertificadoEntity();
		List<SolicitudCertificadoModel> listaSolicitudCertificadoModel=new ArrayList<SolicitudCertificadoModel>();
		List<SolicitudCertificadoEntity> listaSolicitudCertificados = new ArrayList<SolicitudCertificadoEntity>();
		
		
		solicitudCertificadoInicial = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModelInicial);
		solicitudCertificadoFinal = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModelFinal);
		
		
		listaSolicitudCertificados=factoryPersistenciaDAO.getSolicitudCertificadoDAO().listarSolicitudCertificadoxEntreFechasEntity(solicitudCertificadoInicial, solicitudCertificadoFinal);
		
		listaSolicitudCertificadoModel = SolicitudCertificadoModelMapper.ListSolicitudCertificadoEntityToListSolicitudCertificadoModel(listaSolicitudCertificados);
		
		objLog.info("FIN - listarSolicitudCertificadoxEstadoModel "+listaSolicitudCertificadoModel.size());
		
		return listaSolicitudCertificadoModel;
	}
	
	public List<SolicitudCertificadoModel> listarSolicitudCertificadoxEstadoModel(SolicitudCertificadoModel solicitudCertificadoModel) {
		objLog.info("INI - listarSolicitudCertificadoxEstadoModel");
		SolicitudCertificadoEntity solicitudCertificado = new SolicitudCertificadoEntity();
		List<SolicitudCertificadoModel> listaSolicitudCertificadoModel=new ArrayList<SolicitudCertificadoModel>();
		List<SolicitudCertificadoEntity> listaSolicitudCertificados = new ArrayList<SolicitudCertificadoEntity>();
		
		
		solicitudCertificado = SolicitudCertificadoModelMapper.SolicitudCertificadoModelToSolicitudCertificadoEntity(solicitudCertificadoModel);
		
		listaSolicitudCertificados=factoryPersistenciaDAO.getSolicitudCertificadoDAO().listarSolicitudCertificadoxEstadoEntity(solicitudCertificado);
		listaSolicitudCertificadoModel = SolicitudCertificadoModelMapper.ListSolicitudCertificadoEntityToListSolicitudCertificadoModel(listaSolicitudCertificados);
		
		objLog.info("FIN - listarSolicitudCertificadoxEstadoModel "+listaSolicitudCertificadoModel.size());
		return listaSolicitudCertificadoModel;
	}
	
	

}
