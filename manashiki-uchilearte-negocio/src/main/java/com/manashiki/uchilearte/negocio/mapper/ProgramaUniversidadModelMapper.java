package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadModel;

public class ProgramaUniversidadModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static ProgramaUniversidadEntity ProgramaUniversidadModelToProgramaUniversidadEntity(ProgramaUniversidadModel programaUniversidadModel){

		ProgramaUniversidadEntity programaUniversidad=new ProgramaUniversidadEntity();
		if(programaUniversidadModel==null){
			return new ProgramaUniversidadEntity();
		}
		else{
			programaUniversidad.setIdProgramaUniversidad(programaUniversidadModel.getIdProgramaUniversidad());
			programaUniversidad.setCodigoProgramaUniversidad(programaUniversidadModel.getCodigoProgramaUniversidad());
			programaUniversidad.setNombreProgramaUniversidad(programaUniversidadModel.getNombreProgramaUniversidad());
			programaUniversidad.setDuracionProgramaUniversidad(programaUniversidadModel.getDuracionProgramaUniversidad());
			programaUniversidad.setCostoProgramaUniversidad(programaUniversidadModel.getCostoProgramaUniversidad());
			programaUniversidad.setClasificacionPrograma(programaUniversidadModel.getClasificacionPrograma());
		}
		
		return programaUniversidad;
	}

	public static List<ProgramaUniversidadEntity> ListProgramaUniversidadModelToListProgramaUniversidadEntity(List<ProgramaUniversidadModel> listaProgramaUniversidadModel){

		List<ProgramaUniversidadEntity> listaProgramaUniversidad=new ArrayList<ProgramaUniversidadEntity>();

		if(listaProgramaUniversidadModel==null || listaProgramaUniversidadModel.size()==0){
			return new ArrayList<ProgramaUniversidadEntity>();
		}
		else{
			listaProgramaUniversidad=new ArrayList<ProgramaUniversidadEntity>();
			ProgramaUniversidadEntity programaUniversidad=new ProgramaUniversidadEntity();

			for(ProgramaUniversidadModel proUniMod: listaProgramaUniversidadModel){
				programaUniversidad = new ProgramaUniversidadEntity();
				
				programaUniversidad = ProgramaUniversidadModelToProgramaUniversidadEntity(proUniMod);
				
				listaProgramaUniversidad.add(programaUniversidad);
			}
		}

		return listaProgramaUniversidad;
	}

	public static ProgramaUniversidadModel ProgramaUniversidadEntityToProgramaUniversidadModel(ProgramaUniversidadEntity programaUniversidadEntity){

		ProgramaUniversidadModel programaUniversidadModel=new ProgramaUniversidadModel();
		
		if(programaUniversidadEntity==null){
			return new ProgramaUniversidadModel();
		}
		else{
			programaUniversidadModel.setIdProgramaUniversidad(programaUniversidadEntity.getIdProgramaUniversidad());
			programaUniversidadModel.setCodigoProgramaUniversidad(programaUniversidadEntity.getCodigoProgramaUniversidad());
			programaUniversidadModel.setNombreProgramaUniversidad(programaUniversidadEntity.getNombreProgramaUniversidad());
			programaUniversidadModel.setDuracionProgramaUniversidad(programaUniversidadEntity.getDuracionProgramaUniversidad());
			programaUniversidadModel.setCostoProgramaUniversidad(programaUniversidadEntity.getCostoProgramaUniversidad());
			programaUniversidadModel.setClasificacionPrograma(programaUniversidadEntity.getClasificacionPrograma());
		}
		return programaUniversidadModel;
	}

	public static List<ProgramaUniversidadModel> ListProgramaUniversidadEntityToListProgramaUniversidadModel(List<ProgramaUniversidadEntity> listaProgramaUniversidadEntity){

		List<ProgramaUniversidadModel> listaProgramaUniversidadModel=new ArrayList<ProgramaUniversidadModel>();

		if(listaProgramaUniversidadEntity==null || listaProgramaUniversidadEntity.size()==0){
			return new ArrayList<ProgramaUniversidadModel>();
		}
		else{
			listaProgramaUniversidadModel=new ArrayList<ProgramaUniversidadModel>();
			ProgramaUniversidadModel programaUniversidadModel=new ProgramaUniversidadModel();

			for(ProgramaUniversidadEntity proUniEnt: listaProgramaUniversidadEntity){
				programaUniversidadModel=new ProgramaUniversidadModel();
				
				programaUniversidadModel = ProgramaUniversidadEntityToProgramaUniversidadModel(proUniEnt);
				
				listaProgramaUniversidadModel.add(programaUniversidadModel);
			}
		}
		return listaProgramaUniversidadModel;
	}
}
