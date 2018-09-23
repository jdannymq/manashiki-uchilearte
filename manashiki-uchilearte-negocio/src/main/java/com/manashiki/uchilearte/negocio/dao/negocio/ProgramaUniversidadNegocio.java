package com.manashiki.uchilearte.negocio.dao.negocio;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.logica.exception.PersistenceImplException;
import com.manashiki.uchilearte.negocio.dao.ProgramaUniversidadNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.mapper.ProgramaUniversidadModelMapper;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadModel;
import com.manashiki.uchilearte.negocio.utilidades.CacheLocalRepositorio;
import vijnana.cache.component.ICacheComponent;

@Component
public class ProgramaUniversidadNegocio implements ProgramaUniversidadNegocioDAO{
	
	private static final Logger objLog = LoggerFactory.getLogger(ProgramaUniversidadNegocio.class);
	
	@Autowired
	FactoryPersistenciaDAO factoryPersistenciaDAO;
	
	ICacheComponent objCacheComponent = null;
	
	public ProgramaUniversidadModel crearProgramaUniversidadModel(ProgramaUniversidadModel programaUniversidadModel) {
		objLog.info("INI - crearProgramaUniversidadModel");
		ProgramaUniversidadEntity programaUniversidad = new ProgramaUniversidadEntity();
		programaUniversidad = ProgramaUniversidadModelMapper.ProgramaUniversidadModelToProgramaUniversidadEntity(programaUniversidadModel);

		programaUniversidad = factoryPersistenciaDAO.getProgramaUniversidadDAO().crearProgramaUniversidadEntity(programaUniversidad);
		
		programaUniversidadModel = ProgramaUniversidadModelMapper.ProgramaUniversidadEntityToProgramaUniversidadModel(programaUniversidad);
		objLog.info("FIN - crearProgramaUniversidadModel "+programaUniversidadModel.getIdProgramaUniversidad());
		return programaUniversidadModel;

	}

	public ProgramaUniversidadModel actualizarProgramaUniversidadModel(ProgramaUniversidadModel programaUniversidadModel) {
		objLog.info("INI - actualizarProgramaUniversidadModel "+programaUniversidadModel.getIdProgramaUniversidad());
		ProgramaUniversidadEntity programaUniversidad = new ProgramaUniversidadEntity();
		programaUniversidad = ProgramaUniversidadModelMapper.ProgramaUniversidadModelToProgramaUniversidadEntity(programaUniversidadModel);

		programaUniversidad = factoryPersistenciaDAO.getProgramaUniversidadDAO().actualizarProgramaUniversidadEntity(programaUniversidad);
		
		programaUniversidadModel = ProgramaUniversidadModelMapper.ProgramaUniversidadEntityToProgramaUniversidadModel(programaUniversidad);
		objLog.info("FIN - actualizarProgramaUniversidadModel "+programaUniversidadModel.getIdProgramaUniversidad());
		return programaUniversidadModel;

	}

	public ProgramaUniversidadModel buscarProgramaUniversidadxIdModel(ProgramaUniversidadModel programaUniversidadModel)throws NegocioImplException{
		objLog.info("INI - buscarProgramaUniversidadxIdModel "+programaUniversidadModel.getIdProgramaUniversidad());
		ProgramaUniversidadEntity programaUniversidad = new ProgramaUniversidadEntity();
		programaUniversidad = ProgramaUniversidadModelMapper.ProgramaUniversidadModelToProgramaUniversidadEntity(programaUniversidadModel);

		try {
			programaUniversidad=factoryPersistenciaDAO.getProgramaUniversidadDAO().buscarProgramaUniversidadxIdEntity(programaUniversidad);
		} catch (PersistenceImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new NegocioImplException(e);
		}
		programaUniversidadModel = ProgramaUniversidadModelMapper.ProgramaUniversidadEntityToProgramaUniversidadModel(programaUniversidad);
		
		objLog.info("FIN - buscarProgramaUniversidadxIdModel "+programaUniversidadModel.getIdProgramaUniversidad());
		return programaUniversidadModel;
	}
	//Traer todos los programas inscritos
	public List<ProgramaUniversidadModel> listarProgramaUniversidadModel() {
		objLog.info("INI - listarProgramaUniversidadModel");
		List<ProgramaUniversidadModel> listaProgramaUniversidadModel=new ArrayList<ProgramaUniversidadModel>();
//		List<ProgramaUniversidadEntity> listaProgramaUniversidades = new ArrayList<ProgramaUniversidadEntity>();
//		listaProgramaUniversidades = factoryPersistenciaDAO.getProgramaUniversidadDAO().listarProgramaUniversidadesEntity();
//		listaProgramaUniversidadModel = ProgramaUniversidadModelMapper.ListProgramaUniversidadEntityToListProgramaUniversidadModel(listaProgramaUniversidades);
		listaProgramaUniversidadModel = obtenerCacheListaProgramaUniversidad();
		
		objLog.info("FIN - listarProgramaUniversidadModel "+listaProgramaUniversidadModel.size());
		
		return listaProgramaUniversidadModel;
	}
	//Traer todos los programas con precios (Solo Postulaciones)
	public List<ProgramaUniversidadModel> listarProgramaUniversidadPrecioModel() {
		objLog.info("INI - listarProgramaUniversidadPrecioModel");
		List<ProgramaUniversidadModel> listaProgramaUniversidadModel=new ArrayList<ProgramaUniversidadModel>();
		
		listaProgramaUniversidadModel = obtenerCacheListaProgramaUniversidades();
		
		if(listaProgramaUniversidadModel!=null && listaProgramaUniversidadModel.size()>0){
			objLog.info("FIN - listarProgramaUniversidadPrecioModel "+listaProgramaUniversidadModel.size());
		}
		
		return listaProgramaUniversidadModel;
	}
	
	//Aca deben ir todas los Programas, por orden de prioridad
	private List<ProgramaUniversidadModel> obtenerCacheListaProgramaUniversidad(){
		List<ProgramaUniversidadModel> listaProgramaUniversidadModel=new ArrayList<ProgramaUniversidadModel>();
		List<ProgramaUniversidadEntity> listaProgramaUniversidadEntity=new ArrayList<ProgramaUniversidadEntity>();
		ProgramaUniversidadModel programaUniversidadModel = new ProgramaUniversidadModel();
		
		try{
			if(objCacheComponent==null){
				objCacheComponent = CacheLocalRepositorio.crearRepositorioCacheLocal(); //Colocar el nombre de cache local del ws
			}
		
		}catch(Exception e){
			listaProgramaUniversidadModel = null;
			objLog.error("Cae al obtener el repositorio de Cache");
		}
		
		try{
			listaProgramaUniversidadModel = CacheLocalRepositorio.obtenerCacheListaProgramaUniversidad(objCacheComponent);

		}catch(Exception e){
			
			listaProgramaUniversidadModel=null;
		
		}
		
		try{
			if(listaProgramaUniversidadModel==null || listaProgramaUniversidadModel.size()==0){
				//Que los entregue ordenados por doc-mag-pos-dipl
				listaProgramaUniversidadEntity = factoryPersistenciaDAO.getProgramaUniversidadDAO().listarProgramaUniversidadesOrdenPrioridad();
				
				if(listaProgramaUniversidadEntity!=null && listaProgramaUniversidadEntity.size()>0){
					listaProgramaUniversidadModel = CacheLocalRepositorio.generarCacheListaProgramaUniversidad(objCacheComponent, listaProgramaUniversidadEntity);
					listaProgramaUniversidadModel = new ArrayList<ProgramaUniversidadModel>();
					for(ProgramaUniversidadEntity puEnt:listaProgramaUniversidadEntity){
						programaUniversidadModel = new ProgramaUniversidadModel();
						programaUniversidadModel = ProgramaUniversidadModelMapper.ProgramaUniversidadEntityToProgramaUniversidadModel(puEnt);
						listaProgramaUniversidadModel.add(programaUniversidadModel);
					}
				}
			}
		}
		catch(Exception e){
			objLog.error("Error en la implementacion del Servicio "+e.getMessage());
		}
		return listaProgramaUniversidadModel;
	}
	
	//Aca deben ir todas los Programas ordenados por prioridad
	private List<ProgramaUniversidadModel> obtenerCacheListaProgramaUniversidades(){
		List<ProgramaUniversidadModel> listaProgramaUniversidadModel=new ArrayList<ProgramaUniversidadModel>();
		List<ProgramaUniversidadEntity> listaProgramaUniversidadEntity=new ArrayList<ProgramaUniversidadEntity>();
		ProgramaUniversidadModel programaUniversidadModel = new ProgramaUniversidadModel();
		try{
			if(objCacheComponent==null){
				objCacheComponent = CacheLocalRepositorio.crearRepositorioCacheLocal(); //Colocar el nombre de cache local del ws
			}
		
		}catch(Exception e){
			listaProgramaUniversidadModel = null;
			objLog.error("Cae al obtener el repositorio de Cache");
		}
		
		try{
			listaProgramaUniversidadModel = CacheLocalRepositorio.obtenerCacheListaProgramaUniversidad(objCacheComponent);

		}catch(Exception e){
			
			listaProgramaUniversidadModel=null;
		
		}
		
		try{
			if(listaProgramaUniversidadModel==null || listaProgramaUniversidadModel.size()==0){
				//Traer Todos los Programas desde la Base de Datos
				listaProgramaUniversidadEntity = factoryPersistenciaDAO.getProgramaUniversidadDAO().listarProgramaUniversidadesOrdenPrioridad();
				
				if(listaProgramaUniversidadEntity!=null && listaProgramaUniversidadEntity.size()>0 ){
					
					List<ProgramaUniversidadEntity> metListaProgramaUniversidadEntity = new ArrayList<ProgramaUniversidadEntity>();
					
					for(ProgramaUniversidadEntity pum:listaProgramaUniversidadEntity){
						if(pum.getCostoProgramaUniversidad().equals("-") || pum.getCostoProgramaUniversidad().equals(" - ") || pum.getCostoProgramaUniversidad().equals("- ")){
							
						}else{
							metListaProgramaUniversidadEntity.add(pum);
						}
					}
					
					if(metListaProgramaUniversidadEntity!=null && metListaProgramaUniversidadEntity.size()>0){
						listaProgramaUniversidadModel = CacheLocalRepositorio.generarCacheListaProgramaUniversidad(objCacheComponent, metListaProgramaUniversidadEntity);
						listaProgramaUniversidadModel = new ArrayList<ProgramaUniversidadModel>();
						for(ProgramaUniversidadEntity puEnt:listaProgramaUniversidadEntity){
							programaUniversidadModel = new ProgramaUniversidadModel();
							programaUniversidadModel = ProgramaUniversidadModelMapper.ProgramaUniversidadEntityToProgramaUniversidadModel(puEnt);
							listaProgramaUniversidadModel.add(programaUniversidadModel);
						}
					}
				}
			}
		}
		catch(Exception e){
			objLog.error("Error en la implementacion del Servicio "+e.getMessage());
		}
		return listaProgramaUniversidadModel;
	}

}
