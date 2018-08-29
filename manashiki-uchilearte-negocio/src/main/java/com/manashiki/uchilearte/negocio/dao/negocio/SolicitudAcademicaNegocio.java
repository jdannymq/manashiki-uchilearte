package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.SolicitudAcademicaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.SolicitudAcademicaNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.SolicitudAcademicaModelMapper;
import com.manashiki.uchilearte.negocio.model.SolicitudAcademicaModel;

@Component
public class SolicitudAcademicaNegocio implements SolicitudAcademicaNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(SolicitudAcademicaNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public SolicitudAcademicaModel crearSolicitudAcademicaModel(SolicitudAcademicaModel solicitudAcademicaModel) {
		objLog.info("INI - crearSolicitudAcademicaModel");
		SolicitudAcademicaEntity solicitudAcademica = new SolicitudAcademicaEntity();
		solicitudAcademica = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModel);

		solicitudAcademica = factoryPersistenciaDAO.getSolicitudAcademicaDAO().crearSolicitudAcademicaEntity(solicitudAcademica);
		
		solicitudAcademicaModel = SolicitudAcademicaModelMapper.SolicitudAcademicaEntityToSolicitudAcademicaModel(solicitudAcademica);
		objLog.info("FIN - crearSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		return solicitudAcademicaModel;

	}

	public SolicitudAcademicaModel actualizarSolicitudAcademicaModel(SolicitudAcademicaModel solicitudAcademicaModel) {
		objLog.info("INI - actualizarSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		SolicitudAcademicaEntity solicitudAcademica = new SolicitudAcademicaEntity();
		solicitudAcademica = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModel);

		solicitudAcademica = factoryPersistenciaDAO.getSolicitudAcademicaDAO().actualizarSolicitudAcademicaEntity(solicitudAcademica);
		
		solicitudAcademicaModel = SolicitudAcademicaModelMapper.SolicitudAcademicaEntityToSolicitudAcademicaModel(solicitudAcademica);
		objLog.info("FIN - actualizarSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		return solicitudAcademicaModel;

	}

	public SolicitudAcademicaModel buscarSolicitudAcademicaxIdModel(SolicitudAcademicaModel solicitudAcademicaModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudAcademicaxIdModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		SolicitudAcademicaEntity solicitudAcademica = new SolicitudAcademicaEntity();
		solicitudAcademica = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModel);

		try {
			solicitudAcademica=factoryPersistenciaDAO.getSolicitudAcademicaDAO().buscarSolicitudAcademicaxIdEntity(solicitudAcademica);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudAcademicaModel = SolicitudAcademicaModelMapper.SolicitudAcademicaEntityToSolicitudAcademicaModel(solicitudAcademica);
		
		objLog.info("FIN - buscarSolicitudAcademicaxIdModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		return solicitudAcademicaModel;
	}
	
	public SolicitudAcademicaModel buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaModel(SolicitudAcademicaModel solicitudAcademicaModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		SolicitudAcademicaEntity solicitudAcademica = new SolicitudAcademicaEntity();
		solicitudAcademica = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModel);

		try {
			solicitudAcademica=factoryPersistenciaDAO.getSolicitudAcademicaDAO().buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaEntity(solicitudAcademica);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudAcademicaModel = SolicitudAcademicaModelMapper.SolicitudAcademicaEntityToSolicitudAcademicaModel(solicitudAcademica);
		
		objLog.info("FIN - buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		return solicitudAcademicaModel;
	}
	
	public SolicitudAcademicaModel buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaModel(SolicitudAcademicaModel solicitudAcademicaModel)throws NegocioImplException{
		objLog.info("INI - buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		SolicitudAcademicaEntity solicitudAcademica = new SolicitudAcademicaEntity();
		solicitudAcademica = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModel);

		try {
			solicitudAcademica=factoryPersistenciaDAO.getSolicitudAcademicaDAO().buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaEntity(solicitudAcademica);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		solicitudAcademicaModel = SolicitudAcademicaModelMapper.SolicitudAcademicaEntityToSolicitudAcademicaModel(solicitudAcademica);
		
		objLog.info("FIN - buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		return solicitudAcademicaModel;
	}
	
	public List<SolicitudAcademicaModel> listarSolicitudAcademicasModel() {
		objLog.info("INI - listarSolicitudAcademicaesModel");
		List<SolicitudAcademicaModel> listaSolicitudAcademicaModel=new ArrayList<SolicitudAcademicaModel>();
		List<SolicitudAcademicaEntity> listaSolicitudAcademicaes = new ArrayList<SolicitudAcademicaEntity>();

		listaSolicitudAcademicaes=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicasEntity();

		listaSolicitudAcademicaModel = SolicitudAcademicaModelMapper.ListSolicitudAcademicaEntityToListSolicitudAcademicaModel(listaSolicitudAcademicaes);
		
		objLog.info("FIN - listarSolicitudAcademicaesModel "+listaSolicitudAcademicaModel.size());
		return listaSolicitudAcademicaModel;
	}
	
	
	public List<SolicitudAcademicaModel> listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaModel(SolicitudAcademicaModel solicitudAcademicaModel){
		objLog.info("INI - listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		SolicitudAcademicaEntity solicitudAcademica = new SolicitudAcademicaEntity();
		List<SolicitudAcademicaModel> listaSolicitudAcademicaModel=new ArrayList<SolicitudAcademicaModel>();
		List<SolicitudAcademicaEntity> listaSolicitudAcademicas = new ArrayList<SolicitudAcademicaEntity>();
		
		
		solicitudAcademica = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModel);
		
		listaSolicitudAcademicas=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaEntity(solicitudAcademica);
		
		listaSolicitudAcademicaModel = SolicitudAcademicaModelMapper.ListSolicitudAcademicaEntityToListSolicitudAcademicaModel(listaSolicitudAcademicas);
		
		objLog.info("FIN - listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		return listaSolicitudAcademicaModel;
	}
	
	public List<SolicitudAcademicaModel> listarSolicitudAcademicaxTipoSolicitudModel(SolicitudAcademicaModel solicitudAcademicaModel){
		objLog.info("INI - listarSolicitudAcademicaxTipoSolicitudModel "+solicitudAcademicaModel.getIdTipoSolicitud());
		SolicitudAcademicaEntity solicitudAcademica = new SolicitudAcademicaEntity();
		
		List<SolicitudAcademicaModel> listaSolicitudAcademicaModel=new ArrayList<SolicitudAcademicaModel>();
		
		List<SolicitudAcademicaEntity> listaSolicitudAcademicas = new ArrayList<SolicitudAcademicaEntity>();
		
		solicitudAcademica = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModel);
		
		listaSolicitudAcademicas=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaEntity(solicitudAcademica);
		
		listaSolicitudAcademicaModel = SolicitudAcademicaModelMapper.ListSolicitudAcademicaEntityToListSolicitudAcademicaModel(listaSolicitudAcademicas);
		
		objLog.info("FIN - listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaModel "+solicitudAcademicaModel.getIdSolicitudAcademica());
		return listaSolicitudAcademicaModel;
	}
	
	public List<SolicitudAcademicaModel> listarSolicitudAcademicaxxEntreFechasModel(SolicitudAcademicaModel solicitudAcademicaModelInicial,SolicitudAcademicaModel solicitudAcademicaModelFinal) {
		objLog.info("INI - listarSolicitudAcademicaxEstadoModel");
		SolicitudAcademicaEntity solicitudAcademicaInicial = new SolicitudAcademicaEntity();
		SolicitudAcademicaEntity solicitudAcademicaFinal = new SolicitudAcademicaEntity();
		List<SolicitudAcademicaModel> listaSolicitudAcademicaModel=new ArrayList<SolicitudAcademicaModel>();
		List<SolicitudAcademicaEntity> listaSolicitudAcademicas = new ArrayList<SolicitudAcademicaEntity>();
		
		
		solicitudAcademicaInicial = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModelInicial);
		solicitudAcademicaFinal = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModelFinal);
		
		
		listaSolicitudAcademicas=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicaxEntreFechasEntity(solicitudAcademicaInicial, solicitudAcademicaFinal);
		
		listaSolicitudAcademicaModel = SolicitudAcademicaModelMapper.ListSolicitudAcademicaEntityToListSolicitudAcademicaModel(listaSolicitudAcademicas);
		
		objLog.info("FIN - listarSolicitudAcademicaxEstadoModel "+listaSolicitudAcademicaModel.size());
		
		return listaSolicitudAcademicaModel;
	}
	
	public List<SolicitudAcademicaModel> listarSolicitudAcademicaxEstadoModel(SolicitudAcademicaModel solicitudAcademicaModel) {
		objLog.info("INI - listarSolicitudAcademicaxEstadoModel");
		SolicitudAcademicaEntity solicitudAcademica = new SolicitudAcademicaEntity();
		List<SolicitudAcademicaModel> listaSolicitudAcademicaModel=new ArrayList<SolicitudAcademicaModel>();
		List<SolicitudAcademicaEntity> listaSolicitudAcademicas = new ArrayList<SolicitudAcademicaEntity>();
		
		
		solicitudAcademica = SolicitudAcademicaModelMapper.SolicitudAcademicaModelToSolicitudAcademicaEntity(solicitudAcademicaModel);
		
		listaSolicitudAcademicas=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicaxEstadoEntity(solicitudAcademica);
		listaSolicitudAcademicaModel = SolicitudAcademicaModelMapper.ListSolicitudAcademicaEntityToListSolicitudAcademicaModel(listaSolicitudAcademicas);
		
		objLog.info("FIN - listarSolicitudAcademicaxEstadoModel "+listaSolicitudAcademicaModel.size());
		return listaSolicitudAcademicaModel;
	}
	
	

}
