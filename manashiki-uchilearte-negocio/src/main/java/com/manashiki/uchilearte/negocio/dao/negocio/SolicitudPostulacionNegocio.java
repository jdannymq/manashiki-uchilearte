package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.SolicitudPostulacionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.SolicitudPostulacionNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.SolicitudPostulacionModelMapper;
import com.manashiki.uchilearte.negocio.model.SolicitudPostulacionModel;

@Component
public class SolicitudPostulacionNegocio implements SolicitudPostulacionNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(SolicitudPostulacionNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public SolicitudPostulacionModel crearSolicitudPostulacionModel(SolicitudPostulacionModel solicitudPostulacionModel) {
		objLog.info("INI - crearSolicitudPostulacionModel");
		SolicitudPostulacionEntity solicitudPostulacion = new SolicitudPostulacionEntity();
		solicitudPostulacion = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModel);

		solicitudPostulacion = factoryPersistenciaDAO.getSolicitudPostulacionDAO().crearSolicitudPostulacionEntity(solicitudPostulacion);
		
		solicitudPostulacionModel = SolicitudPostulacionModelMapper.SolicitudPostulacionEntityToSolicitudPostulacionModel(solicitudPostulacion);
		objLog.info("FIN - crearSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		return solicitudPostulacionModel;

	}

	public SolicitudPostulacionModel actualizarSolicitudPostulacionModel(SolicitudPostulacionModel solicitudPostulacionModel) {
		objLog.info("INI - actualizarSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		SolicitudPostulacionEntity solicitudPostulacion = new SolicitudPostulacionEntity();
		solicitudPostulacion = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModel);

		solicitudPostulacion = factoryPersistenciaDAO.getSolicitudPostulacionDAO().actualizarSolicitudPostulacionEntity(solicitudPostulacion);
		
		solicitudPostulacionModel = SolicitudPostulacionModelMapper.SolicitudPostulacionEntityToSolicitudPostulacionModel(solicitudPostulacion);
		objLog.info("FIN - actualizarSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		return solicitudPostulacionModel;

	}

	public SolicitudPostulacionModel buscarSolicitudPostulacionxIdModel(SolicitudPostulacionModel solicitudPostulacionModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudPostulacionxIdModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		SolicitudPostulacionEntity solicitudPostulacion = new SolicitudPostulacionEntity();
		solicitudPostulacion = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModel);

		try {
			solicitudPostulacion=factoryPersistenciaDAO.getSolicitudPostulacionDAO().buscarSolicitudPostulacionxIdEntity(solicitudPostulacion);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudPostulacionModel = SolicitudPostulacionModelMapper.SolicitudPostulacionEntityToSolicitudPostulacionModel(solicitudPostulacion);
		
		objLog.info("FIN - buscarSolicitudPostulacionxIdModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		return solicitudPostulacionModel;
	}
	
	public SolicitudPostulacionModel buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionModel(SolicitudPostulacionModel solicitudPostulacionModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		SolicitudPostulacionEntity solicitudPostulacion = new SolicitudPostulacionEntity();
		solicitudPostulacion = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModel);

		try {
			solicitudPostulacion=factoryPersistenciaDAO.getSolicitudPostulacionDAO().buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionEntity(solicitudPostulacion);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudPostulacionModel = SolicitudPostulacionModelMapper.SolicitudPostulacionEntityToSolicitudPostulacionModel(solicitudPostulacion);
		
		objLog.info("FIN - buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		return solicitudPostulacionModel;
	}
	
	public SolicitudPostulacionModel buscarSolicitudPostulacionxNombrePersonaSolicitudPostulacionModel(SolicitudPostulacionModel solicitudPostulacionModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		SolicitudPostulacionEntity solicitudPostulacion = new SolicitudPostulacionEntity();
		solicitudPostulacion = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModel);

		try {
			solicitudPostulacion=factoryPersistenciaDAO.getSolicitudPostulacionDAO().buscarSolicitudPostulacionxNombrePersonaSolicitudPostulacionEntity(solicitudPostulacion);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudPostulacionModel = SolicitudPostulacionModelMapper.SolicitudPostulacionEntityToSolicitudPostulacionModel(solicitudPostulacion);
		
		objLog.info("FIN - buscarSolicitudPostulacionxRutPersonaSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		return solicitudPostulacionModel;
	}
	
	public List<SolicitudPostulacionModel> listarSolicitudPostulacionesModel() {
		objLog.info("INI - listarSolicitudPostulacionesModel");
		List<SolicitudPostulacionModel> listaSolicitudPostulacionModel=new ArrayList<SolicitudPostulacionModel>();
		List<SolicitudPostulacionEntity> listaSolicitudPostulaciones = new ArrayList<SolicitudPostulacionEntity>();

		listaSolicitudPostulaciones=factoryPersistenciaDAO.getSolicitudPostulacionDAO().listarSolicitudPostulacionesEntity();

		listaSolicitudPostulacionModel = SolicitudPostulacionModelMapper.ListSolicitudPostulacionEntityToListSolicitudPostulacionModel(listaSolicitudPostulaciones);
		
		objLog.info("FIN - listarSolicitudPostulacionesModel "+listaSolicitudPostulacionModel.size());
		return listaSolicitudPostulacionModel;
	}
	
	
	public List<SolicitudPostulacionModel> listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionModel(SolicitudPostulacionModel solicitudPostulacionModel){
		objLog.info("INI - listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		SolicitudPostulacionEntity solicitudPostulacion = new SolicitudPostulacionEntity();
		List<SolicitudPostulacionModel> listaSolicitudPostulacionModel=new ArrayList<SolicitudPostulacionModel>();
		List<SolicitudPostulacionEntity> listaSolicitudPostulacions = new ArrayList<SolicitudPostulacionEntity>();
		
		
		solicitudPostulacion = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModel);
		
		listaSolicitudPostulacions=factoryPersistenciaDAO.getSolicitudPostulacionDAO().listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionEntity(solicitudPostulacion);
		
		listaSolicitudPostulacionModel = SolicitudPostulacionModelMapper.ListSolicitudPostulacionEntityToListSolicitudPostulacionModel(listaSolicitudPostulacions);
		
		objLog.info("FIN - listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
		return listaSolicitudPostulacionModel;
	}
	
//	public List<SolicitudPostulacionModel> listarSolicitudPostulacionxTipoSolicitudModel(SolicitudPostulacionModel solicitudPostulacionModel){
//		objLog.info("INI - listarSolicitudPostulacionxTipoSolicitudModel "+solicitudPostulacionModel.getIdTipoPostulacion());
//		SolicitudPostulacionEntity solicitudPostulacion = new SolicitudPostulacionEntity();
//		
//		List<SolicitudPostulacionModel> listaSolicitudPostulacionModel=new ArrayList<SolicitudPostulacionModel>();
//		
//		List<SolicitudPostulacionEntity> listaSolicitudPostulacions = new ArrayList<SolicitudPostulacionEntity>();
//		
//		solicitudPostulacion = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModel);
//		
//		listaSolicitudPostulacions=factoryPersistenciaDAO.getSolicitudPostulacionDAO().listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionEntity(solicitudPostulacion);
//		
//		listaSolicitudPostulacionModel = SolicitudPostulacionModelMapper.ListSolicitudPostulacionEntityToListSolicitudPostulacionModel(listaSolicitudPostulacions);
//		
//		objLog.info("FIN - listarSolicitudPostulacionxApellidoPaternoPersonaSolicitudPostulacionModel "+solicitudPostulacionModel.getIdSolicitudPostulacion());
//		return listaSolicitudPostulacionModel;
//	}
	
	public List<SolicitudPostulacionModel> listarSolicitudPostulacionxxEntreFechasModel(SolicitudPostulacionModel solicitudPostulacionModelInicial,SolicitudPostulacionModel solicitudPostulacionModelFinal) {
		objLog.info("INI - listarSolicitudPostulacionxEstadoModel");
		SolicitudPostulacionEntity solicitudPostulacionInicial = new SolicitudPostulacionEntity();
		SolicitudPostulacionEntity solicitudPostulacionFinal = new SolicitudPostulacionEntity();
		List<SolicitudPostulacionModel> listaSolicitudPostulacionModel=new ArrayList<SolicitudPostulacionModel>();
		List<SolicitudPostulacionEntity> listaSolicitudPostulacions = new ArrayList<SolicitudPostulacionEntity>();
		
		
		solicitudPostulacionInicial = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModelInicial);
		solicitudPostulacionFinal = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModelFinal);
		
		
		listaSolicitudPostulacions=factoryPersistenciaDAO.getSolicitudPostulacionDAO().listarSolicitudPostulacionxEntreFechasEntity(solicitudPostulacionInicial, solicitudPostulacionFinal);
		
		listaSolicitudPostulacionModel = SolicitudPostulacionModelMapper.ListSolicitudPostulacionEntityToListSolicitudPostulacionModel(listaSolicitudPostulacions);
		
		objLog.info("FIN - listarSolicitudPostulacionxEstadoModel "+listaSolicitudPostulacionModel.size());
		
		return listaSolicitudPostulacionModel;
	}
	
	public List<SolicitudPostulacionModel> listarSolicitudPostulacionxEstadoModel(SolicitudPostulacionModel solicitudPostulacionModel) {
		objLog.info("INI - listarSolicitudPostulacionxEstadoModel");
		SolicitudPostulacionEntity solicitudPostulacion = new SolicitudPostulacionEntity();
		List<SolicitudPostulacionModel> listaSolicitudPostulacionModel=new ArrayList<SolicitudPostulacionModel>();
		List<SolicitudPostulacionEntity> listaSolicitudPostulacions = new ArrayList<SolicitudPostulacionEntity>();
		
		
		solicitudPostulacion = SolicitudPostulacionModelMapper.SolicitudPostulacionModelToSolicitudPostulacionEntity(solicitudPostulacionModel);
		
		listaSolicitudPostulacions=factoryPersistenciaDAO.getSolicitudPostulacionDAO().listarSolicitudPostulacionxEstadoEntity(solicitudPostulacion);
		listaSolicitudPostulacionModel = SolicitudPostulacionModelMapper.ListSolicitudPostulacionEntityToListSolicitudPostulacionModel(listaSolicitudPostulacions);
		
		objLog.info("FIN - listarSolicitudPostulacionxEstadoModel "+listaSolicitudPostulacionModel.size());
		return listaSolicitudPostulacionModel;
	}

}
