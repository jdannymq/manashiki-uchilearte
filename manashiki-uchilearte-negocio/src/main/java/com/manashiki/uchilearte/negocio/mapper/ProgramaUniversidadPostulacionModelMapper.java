package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadPostulacionEntity;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadPostulacionModel;

public class ProgramaUniversidadPostulacionModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static ProgramaUniversidadPostulacionEntity ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionEntity(ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel){

		ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity=new ProgramaUniversidadPostulacionEntity();
		if(programaUniversidadPostulacionModel==null){
			return new ProgramaUniversidadPostulacionEntity();
		}
		else{
			programaUniversidadPostulacionEntity.setIdProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getIdProgramaUniversidadPostulacion());
			programaUniversidadPostulacionEntity.setCodigoProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getCodigoProgramaUniversidadPostulacion());
			programaUniversidadPostulacionEntity.setNombreProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getNombreProgramaUniversidadPostulacion());
			programaUniversidadPostulacionEntity.setDuracionProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getDuracionProgramaUniversidadPostulacion());
			programaUniversidadPostulacionEntity.setCostoProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getCostoProgramaUniversidadPostulacion());
			programaUniversidadPostulacionEntity.setClasificacionProgramaPostulacion(programaUniversidadPostulacionModel.getClasificacionProgramaPostulacion());
//			programaUniversidadPostulacionEntity.setPrioridad(programaUniversidadPostulacionModel.getSubClasificacionProgramaPostulacion());
			programaUniversidadPostulacionEntity.setPrioridad(programaUniversidadPostulacionModel.getPrioridad());
		}
		
		return programaUniversidadPostulacionEntity;
	}

	public static List<ProgramaUniversidadPostulacionEntity> ListProgramaUniversidadPostulacionModelToListProgramaUniversidadPostulacionEntity(List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel){

		List<ProgramaUniversidadPostulacionEntity> listaProgramaUniversidadEntity=new ArrayList<ProgramaUniversidadPostulacionEntity>();

		if(listaProgramaUniversidadPostulacionModel==null || listaProgramaUniversidadPostulacionModel.size()==0){
			return new ArrayList<ProgramaUniversidadPostulacionEntity>();
		}
		else{
			listaProgramaUniversidadEntity=new ArrayList<ProgramaUniversidadPostulacionEntity>();
			ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity=new ProgramaUniversidadPostulacionEntity();

			for(ProgramaUniversidadPostulacionModel proUniMod: listaProgramaUniversidadPostulacionModel){
				programaUniversidadPostulacionEntity=new ProgramaUniversidadPostulacionEntity();
				
				programaUniversidadPostulacionEntity = ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionEntity(proUniMod);
				
				listaProgramaUniversidadEntity.add(programaUniversidadPostulacionEntity);
			}
		}

		return listaProgramaUniversidadEntity;
	}

	public static ProgramaUniversidadPostulacionModel ProgramaUniversidadPostulacionEntityToProgramaUniversidadPostulacionModel(ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity){

		ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel=new ProgramaUniversidadPostulacionModel();
		if(programaUniversidadPostulacionEntity==null){
			return new ProgramaUniversidadPostulacionModel();
		}
		else{
			programaUniversidadPostulacionModel.setIdProgramaUniversidadPostulacion(programaUniversidadPostulacionEntity.getIdProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setCodigoProgramaUniversidadPostulacion(programaUniversidadPostulacionEntity.getCodigoProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setNombreProgramaUniversidadPostulacion(programaUniversidadPostulacionEntity.getNombreProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setDuracionProgramaUniversidadPostulacion(programaUniversidadPostulacionEntity.getDuracionProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setCostoProgramaUniversidadPostulacion(programaUniversidadPostulacionEntity.getCostoProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setClasificacionProgramaPostulacion(programaUniversidadPostulacionEntity.getClasificacionProgramaPostulacion());
			programaUniversidadPostulacionModel.setPrioridad(programaUniversidadPostulacionEntity.getPrioridad());
		}
		return programaUniversidadPostulacionModel;
	}

	public static List<ProgramaUniversidadPostulacionModel> ListProgramaUniversidadPostulacionEntityToListProgramaUniversidadPostulacionModel(List<ProgramaUniversidadPostulacionEntity> listaProgramaUniversidadPostulacionEntity){

		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel=new ArrayList<ProgramaUniversidadPostulacionModel>();

		if(listaProgramaUniversidadPostulacionEntity==null || listaProgramaUniversidadPostulacionEntity.size()==0){
			return new ArrayList<ProgramaUniversidadPostulacionModel>();
		}
		else{
			listaProgramaUniversidadPostulacionModel=new ArrayList<ProgramaUniversidadPostulacionModel>();
			ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel=new ProgramaUniversidadPostulacionModel();

			for(ProgramaUniversidadPostulacionEntity proUniEnt: listaProgramaUniversidadPostulacionEntity){
				programaUniversidadPostulacionModel=new ProgramaUniversidadPostulacionModel();
				
				programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionEntityToProgramaUniversidadPostulacionModel(proUniEnt);
				
				listaProgramaUniversidadPostulacionModel.add(programaUniversidadPostulacionModel);
			}
		}
		return listaProgramaUniversidadPostulacionModel;
	}
}
