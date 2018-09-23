package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadPostulacionEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.ProgramaUniversidadPostulacionNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.ProgramaUniversidadPostulacionModelMapper;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadPostulacionModel;
import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;
import vijnana.cache.component.ICacheComponent;

@Component
public class ProgramaUniversidadPostulacionNegocio implements ProgramaUniversidadPostulacionNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(ProgramaUniversidadPostulacionNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	ICacheComponent objCacheComponent = null;
	
	public ProgramaUniversidadPostulacionModel crearProgramaUniversidadPostulacionModel(ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel) {
		objLog.info("INI - crearProgramaUniversidadPostulacionModel");
		ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity = new ProgramaUniversidadPostulacionEntity();
		programaUniversidadPostulacionEntity = ProgramaUniversidadPostulacionModelMapper.ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionEntity(programaUniversidadPostulacionModel);

		programaUniversidadPostulacionEntity = factoryPersistenciaDAO.getProgramaUniversidadPostulacionDAO().crearProgramaUniversidadPostulacionEntity(programaUniversidadPostulacionEntity);
		
		programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionModelMapper.ProgramaUniversidadPostulacionEntityToProgramaUniversidadPostulacionModel(programaUniversidadPostulacionEntity);
		objLog.info("FIN - crearProgramaUniversidadPostulacionModel "+programaUniversidadPostulacionModel.getIdProgramaUniversidadPostulacion());
		return programaUniversidadPostulacionModel;

	}

	public ProgramaUniversidadPostulacionModel actualizarProgramaUniversidadPostulacionModel(ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel) {
		objLog.info("INI - actualizarProgramaUniversidadPostulacionModel "+programaUniversidadPostulacionModel.getIdProgramaUniversidadPostulacion());
		ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity = new ProgramaUniversidadPostulacionEntity();
		programaUniversidadPostulacionEntity = ProgramaUniversidadPostulacionModelMapper.ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionEntity(programaUniversidadPostulacionModel);

		programaUniversidadPostulacionEntity = factoryPersistenciaDAO.getProgramaUniversidadPostulacionDAO().actualizarProgramaUniversidadPostulacionEntity(programaUniversidadPostulacionEntity);
		
		programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionModelMapper.ProgramaUniversidadPostulacionEntityToProgramaUniversidadPostulacionModel(programaUniversidadPostulacionEntity);
		objLog.info("FIN - actualizarProgramaUniversidadPostulacionModel "+programaUniversidadPostulacionModel.getIdProgramaUniversidadPostulacion());
		return programaUniversidadPostulacionModel;

	}

	public ProgramaUniversidadPostulacionModel buscarProgramaUniversidadPostulacionxIdModel(ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel)throws NegocioImplException{
		objLog.info("INI - buscarProgramaUniversidadxIdModel "+programaUniversidadPostulacionModel.getIdProgramaUniversidadPostulacion());
		ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity = new ProgramaUniversidadPostulacionEntity();
		
		programaUniversidadPostulacionEntity = ProgramaUniversidadPostulacionModelMapper.ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionEntity(programaUniversidadPostulacionModel);

		try {
			programaUniversidadPostulacionEntity=factoryPersistenciaDAO.getProgramaUniversidadPostulacionDAO().buscarProgramaUniversidadPostulacionxIdEntity(programaUniversidadPostulacionEntity);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionModelMapper.ProgramaUniversidadPostulacionEntityToProgramaUniversidadPostulacionModel(programaUniversidadPostulacionEntity);
		
		objLog.info("FIN - buscarProgramaUniversidadxIdModel "+programaUniversidadPostulacionModel.getIdProgramaUniversidadPostulacion());
		return programaUniversidadPostulacionModel;
	}
	//Traer todos los programas inscritos
	public List<ProgramaUniversidadPostulacionModel> listarProgramaUniversidadPostulacionModel() {
		objLog.info("INI - listarProgramaUniversidadPostulacionModel");
		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel=new ArrayList<ProgramaUniversidadPostulacionModel>();
		
		List<ProgramaUniversidadPostulacionEntity> listaProgramaUniversidadPostulacionEntity = factoryPersistenciaDAO.getProgramaUniversidadPostulacionDAO().listarProgramaUniversidadPostulacionEntity();
		
		listaProgramaUniversidadPostulacionModel = ProgramaUniversidadPostulacionModelMapper.ListProgramaUniversidadPostulacionEntityToListProgramaUniversidadPostulacionModel(listaProgramaUniversidadPostulacionEntity);
		
		objLog.info("FIN - listarProgramaUniversidadPostulacionModel: "+listaProgramaUniversidadPostulacionModel.size());
		
		return listaProgramaUniversidadPostulacionModel;
	}
	//Traer todos los programas con precios (Solo Postulaciones)
	public List<ProgramaUniversidadPostulacionModel> listarProgramaUniversidadPostulacionPrecioModel() {
		objLog.info("INI - listarProgramaUniversidadesPrecioModel");
		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel=new ArrayList<ProgramaUniversidadPostulacionModel>();
		
		listaProgramaUniversidadPostulacionModel = obtenerCacheListaProgramaUniversidadPostulacion();
		
		if(listaProgramaUniversidadPostulacionModel!=null && listaProgramaUniversidadPostulacionModel.size()>0){
			objLog.info("FIN - listarProgramaUniversidadesPrecioModel "+listaProgramaUniversidadPostulacionModel.size());
		}
		
		return listaProgramaUniversidadPostulacionModel;
	}
	
	//Aca deben ir todas los Programas
	private List<ProgramaUniversidadPostulacionModel> obtenerCacheListaProgramaUniversidadPostulacion(){
		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel=new ArrayList<ProgramaUniversidadPostulacionModel>();
		List<ProgramaUniversidadPostulacionEntity> listaProgramaUniversidadPostulacionEntity=new ArrayList<ProgramaUniversidadPostulacionEntity>();
		ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel = new ProgramaUniversidadPostulacionModel();
		
		try{
			if(objCacheComponent==null){
				objCacheComponent = CacheLocalRepositorio.crearRepositorioCacheLocal(); //Colocar el nombre de cache local del ws
			}
		
		}catch(Exception e){
			listaProgramaUniversidadPostulacionModel = null;
			objLog.error("Cae al obtener el repositorio de Cache");
		}
		
		try{
			listaProgramaUniversidadPostulacionModel = CacheLocalRepositorio.obtenerCacheListaProgramaUniversidadPostulaciones(objCacheComponent);

		}catch(Exception e){
			
			listaProgramaUniversidadPostulacionModel=null;
		
		}
		
		try{
			if(listaProgramaUniversidadPostulacionModel==null || listaProgramaUniversidadPostulacionModel.size()==0){
//				listaProgramaUniversidadEntity = factoryPersistenciaDAO.getProgramaUniversidadDAO().listarProgramaUniversidadesEntity();
				//Que los entregue ordenados por doc-mag-pos-dipl
				listaProgramaUniversidadPostulacionEntity = factoryPersistenciaDAO.getProgramaUniversidadPostulacionDAO().listarProgramaUniversidadPostulacionOrdenPrioridad();
				
				if(listaProgramaUniversidadPostulacionEntity!=null && listaProgramaUniversidadPostulacionEntity.size()>0){
					listaProgramaUniversidadPostulacionModel = CacheLocalRepositorio.generarCacheListaProgramaUniversidadPostulaciones(objCacheComponent, listaProgramaUniversidadPostulacionEntity);
					listaProgramaUniversidadPostulacionModel = new ArrayList<ProgramaUniversidadPostulacionModel>();
					for(ProgramaUniversidadPostulacionEntity puEnt:listaProgramaUniversidadPostulacionEntity){
						programaUniversidadPostulacionModel = new ProgramaUniversidadPostulacionModel();
						programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionModelMapper.ProgramaUniversidadPostulacionEntityToProgramaUniversidadPostulacionModel(puEnt);
						listaProgramaUniversidadPostulacionModel.add(programaUniversidadPostulacionModel);
					}
				}
			}
		}
		catch(Exception e){
			objLog.error("Error en la implementacion del Servicio "+e.getMessage());
		}
		return listaProgramaUniversidadPostulacionModel;
	}
	
	

}
