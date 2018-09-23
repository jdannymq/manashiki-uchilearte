package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.logica.entidad.SemestreTemporadaEntity;
import com.manashiki.uchilearte.negocio.model.ProgramaActivoSemestreModel;


public class ProgramaActivoSemestreModelMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static ProgramaActivoSemestreEntity ProgramaActivoSemestreModelToProgramaActivoSemestreEntity(ProgramaActivoSemestreModel programaActivoSemestreModel){

		ProgramaActivoSemestreEntity programaActivoSemestreEntity=new ProgramaActivoSemestreEntity();

		if(programaActivoSemestreModel==null){
			return new ProgramaActivoSemestreEntity();
		}
		else{
			programaActivoSemestreEntity.setIdProgramaActivoSemestre(programaActivoSemestreModel.getIdProgramaActivoSemestre());
			
			if(programaActivoSemestreModel.getIdProgramaUniversidad()!=null){
				ProgramaUniversidadEntity fkIdProgramaUniversidad = new ProgramaUniversidadEntity();
				fkIdProgramaUniversidad.setIdProgramaUniversidad(programaActivoSemestreModel.getIdProgramaUniversidad());
				programaActivoSemestreEntity.setFkIdProgramaUniversidad(fkIdProgramaUniversidad);
			}
			
			if(programaActivoSemestreModel.getIdSemestreTemporada()!=null){
				SemestreTemporadaEntity fkIdSemestreTemporada = new SemestreTemporadaEntity();
				fkIdSemestreTemporada.setIdSemestreTemporada(programaActivoSemestreModel.getIdSemestreTemporada());
				programaActivoSemestreEntity.setFkIdSemestreTemporada(fkIdSemestreTemporada);
			}
			
			programaActivoSemestreEntity.setDescripcionProgramaActivoSemestre(programaActivoSemestreModel.getDescripcionProgramaActivoSemestre());
			programaActivoSemestreEntity.setEstadoProgramaActivoSemestre(programaActivoSemestreModel.getEstadoProgramaActivoSemestre());
			
		}
		return programaActivoSemestreEntity;
	}

	public static List<ProgramaActivoSemestreEntity> ListProgramaActivoSemestreModelToListProgramaActivoSemestreEntity(List<ProgramaActivoSemestreModel> listaProgramaActivoSemestreModel){

		List<ProgramaActivoSemestreEntity> listaProgramaActivoSemestre=new ArrayList<ProgramaActivoSemestreEntity>();

		if(listaProgramaActivoSemestreModel==null || listaProgramaActivoSemestreModel.size()==0){
			return new ArrayList<ProgramaActivoSemestreEntity>();
		}
		else{
			listaProgramaActivoSemestre=new ArrayList<ProgramaActivoSemestreEntity>();
			ProgramaActivoSemestreEntity programaActivoSemestreEntity=new ProgramaActivoSemestreEntity();
			
			for(ProgramaActivoSemestreModel aluMod: listaProgramaActivoSemestreModel){
				programaActivoSemestreEntity = new ProgramaActivoSemestreEntity();
				
				programaActivoSemestreEntity = ProgramaActivoSemestreModelToProgramaActivoSemestreEntity(aluMod);

				listaProgramaActivoSemestre.add(programaActivoSemestreEntity);
			}
		}

		return listaProgramaActivoSemestre;
	}

	public static ProgramaActivoSemestreModel ProgramaActivoSemestreEntityToProgramaActivoSemestreModel(ProgramaActivoSemestreEntity programaActivoSemestreEntity){

		ProgramaActivoSemestreModel programaActivoSemestreModel=new ProgramaActivoSemestreModel();

		if(programaActivoSemestreEntity==null){
			return new ProgramaActivoSemestreModel();
		}
		else{
			programaActivoSemestreModel.setIdProgramaActivoSemestre(programaActivoSemestreModel.getIdProgramaActivoSemestre());
			
			if(programaActivoSemestreEntity.getFkIdProgramaUniversidad()!=null && programaActivoSemestreEntity.getFkIdProgramaUniversidad().getIdProgramaUniversidad()!=null){
				programaActivoSemestreModel.setIdProgramaUniversidad(programaActivoSemestreEntity.getFkIdProgramaUniversidad().getIdProgramaUniversidad());
			}
			
			if(programaActivoSemestreEntity.getFkIdSemestreTemporada()!=null && programaActivoSemestreEntity.getFkIdSemestreTemporada().getIdSemestreTemporada()!=null){
				programaActivoSemestreModel.setIdSemestreTemporada(programaActivoSemestreEntity.getFkIdSemestreTemporada().getIdSemestreTemporada());
			}
			
			programaActivoSemestreModel.setDescripcionProgramaActivoSemestre(programaActivoSemestreEntity.getDescripcionProgramaActivoSemestre());
			programaActivoSemestreModel.setEstadoProgramaActivoSemestre(programaActivoSemestreEntity.getEstadoProgramaActivoSemestre());
		}
		return programaActivoSemestreModel;
	}

	public static List<ProgramaActivoSemestreModel> ListProgramaActivoSemestreEntityToListProgramaActivoSemestreModel(List<ProgramaActivoSemestreEntity> listaProgramaActivoSemestreEntity){

		List<ProgramaActivoSemestreModel> listaProgramaActivoSemestreModel=new ArrayList<ProgramaActivoSemestreModel>();

		
		if(listaProgramaActivoSemestreEntity == null || listaProgramaActivoSemestreEntity.size()==0){
			return new ArrayList<ProgramaActivoSemestreModel>();
		}
		else{
			listaProgramaActivoSemestreModel=new ArrayList<ProgramaActivoSemestreModel>();
			ProgramaActivoSemestreModel programaActivoSemestreModel=new ProgramaActivoSemestreModel();


			for(ProgramaActivoSemestreEntity aluEnt: listaProgramaActivoSemestreEntity){
				programaActivoSemestreModel=new ProgramaActivoSemestreModel();

				programaActivoSemestreModel = ProgramaActivoSemestreEntityToProgramaActivoSemestreModel(aluEnt);

				listaProgramaActivoSemestreModel.add(programaActivoSemestreModel);
			}
		}

		return listaProgramaActivoSemestreModel;
	}

}
