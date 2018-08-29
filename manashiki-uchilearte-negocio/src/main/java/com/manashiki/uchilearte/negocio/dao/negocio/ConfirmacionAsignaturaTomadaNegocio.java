package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.ConfirmacionAsignaturaTomadaEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.ConfirmacionAsignaturaTomadaNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.ConfirmacionAsignaturaTomadaModelMapper;
import com.manashiki.uchilearte.negocio.model.ConfirmacionAsignaturaTomadaModel;

@Component
public class ConfirmacionAsignaturaTomadaNegocio implements ConfirmacionAsignaturaTomadaNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(ConfirmacionAsignaturaTomadaNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	public ConfirmacionAsignaturaTomadaModel crearConfirmacionAsignaturaTomadaModel(ConfirmacionAsignaturaTomadaModel confirmacionAsignaturaTomadaModel) {
		objLog.info("INI - crearConfirmacionAsignaturaTomadaModel");
		ConfirmacionAsignaturaTomadaEntity confirmacionAsignaturaTomada = new ConfirmacionAsignaturaTomadaEntity();
		confirmacionAsignaturaTomada = ConfirmacionAsignaturaTomadaModelMapper.ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaEntity(confirmacionAsignaturaTomadaModel);
		
		
		confirmacionAsignaturaTomada = factoryPersistenciaDAO.getConfirmacionAsignaturaTomadaDAO().crearConfirmacionAsignaturaTomadaEntity(confirmacionAsignaturaTomada);
		
		confirmacionAsignaturaTomadaModel = ConfirmacionAsignaturaTomadaModelMapper.ConfirmacionAsignaturaTomadaEntityToConfirmacionAsignaturaTomadaModel(confirmacionAsignaturaTomada);
		objLog.info("FIN - crearConfirmacionAsignaturaTomadaModel "+confirmacionAsignaturaTomadaModel.getIdConfirmacionAsignaturaTomada());
		return confirmacionAsignaturaTomadaModel;
	}

	public ConfirmacionAsignaturaTomadaModel actualizarConfirmacionAsignaturaTomadaModel(ConfirmacionAsignaturaTomadaModel confirmacionAsignaturaTomadaModel) {
		objLog.info("INI - actualizarConfirmacionAsignaturaTomadaModel "+confirmacionAsignaturaTomadaModel.getIdConfirmacionAsignaturaTomada());
		ConfirmacionAsignaturaTomadaEntity confirmacionAsignaturaTomada = new ConfirmacionAsignaturaTomadaEntity();
		confirmacionAsignaturaTomada = ConfirmacionAsignaturaTomadaModelMapper.ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaEntity(confirmacionAsignaturaTomadaModel);
		
		confirmacionAsignaturaTomada = factoryPersistenciaDAO.getConfirmacionAsignaturaTomadaDAO().actualizarConfirmacionAsignaturaTomadaEntity(confirmacionAsignaturaTomada);
		
		confirmacionAsignaturaTomadaModel = ConfirmacionAsignaturaTomadaModelMapper.ConfirmacionAsignaturaTomadaEntityToConfirmacionAsignaturaTomadaModel(confirmacionAsignaturaTomada);
		objLog.info("FIN - actualizarConfirmacionAsignaturaTomadaModel "+confirmacionAsignaturaTomadaModel.getIdConfirmacionAsignaturaTomada());
		return confirmacionAsignaturaTomadaModel;
	}

	public ConfirmacionAsignaturaTomadaModel buscarConfirmacionAsignaturaTomadaxIdModel(ConfirmacionAsignaturaTomadaModel confirmacionAsignaturaTomadaModel) throws NegocioImplException {
		objLog.info("INI - buscarConfirmacionAsignaturaTomadaxIdModel "+confirmacionAsignaturaTomadaModel.getIdConfirmacionAsignaturaTomada());
		ConfirmacionAsignaturaTomadaEntity confirmacionAsignaturaTomada = new ConfirmacionAsignaturaTomadaEntity();
		confirmacionAsignaturaTomada = ConfirmacionAsignaturaTomadaModelMapper.ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaEntity(confirmacionAsignaturaTomadaModel);
		
		try {
			confirmacionAsignaturaTomada=factoryPersistenciaDAO.getConfirmacionAsignaturaTomadaDAO().buscarConfirmacionAsignaturaTomadaxIdEntity(confirmacionAsignaturaTomada);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		confirmacionAsignaturaTomadaModel = ConfirmacionAsignaturaTomadaModelMapper.ConfirmacionAsignaturaTomadaEntityToConfirmacionAsignaturaTomadaModel(confirmacionAsignaturaTomada);
		objLog.info("FIN - buscarConfirmacionAsignaturaTomadaxIdModel "+confirmacionAsignaturaTomadaModel.getIdConfirmacionAsignaturaTomada());
		return confirmacionAsignaturaTomadaModel;
	}
	
	public List<ConfirmacionAsignaturaTomadaModel> listarConfirmacionAsignaturaTomadaModel() {
		objLog.info("INI - listarConfirmacionAsignaturaTomadaesModel");
		List<ConfirmacionAsignaturaTomadaModel> listaConfirmacionAsignaturaTomadaModel=new ArrayList<ConfirmacionAsignaturaTomadaModel>();
		List<ConfirmacionAsignaturaTomadaEntity> listaConfirmacionAsignaturaTomadaes = new ArrayList<ConfirmacionAsignaturaTomadaEntity>();
		
		listaConfirmacionAsignaturaTomadaes=factoryPersistenciaDAO.getConfirmacionAsignaturaTomadaDAO().listarConfirmacionAsignaturaTomadaEntity();
		
		listaConfirmacionAsignaturaTomadaModel = ConfirmacionAsignaturaTomadaModelMapper.ListConfirmacionAsignaturaTomadaEntityToListConfirmacionAsignaturaTomadaModel(listaConfirmacionAsignaturaTomadaes);
		
		objLog.info("FIN - listarConfirmacionAsignaturaTomadaesModel "+listaConfirmacionAsignaturaTomadaModel.size());
		return listaConfirmacionAsignaturaTomadaModel;
	}
	
}
