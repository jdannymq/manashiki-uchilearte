package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.AsignaturaProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.negocio.model.AsignaturaProgramaActivoSemestreModel;


public class AsignaturaProgramaActivoSemestreModelMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static AsignaturaProgramaActivoSemestreEntity AsignaturaProgramaActivoSemestreModelToAsignaturaProgramaActivoSemestreEntity(AsignaturaProgramaActivoSemestreModel asignaturaProgramaActivoSemestreModel){

		AsignaturaProgramaActivoSemestreEntity asignaturaProgramaActivoSemestreEntity=new AsignaturaProgramaActivoSemestreEntity();

		if(asignaturaProgramaActivoSemestreModel==null){
			return new AsignaturaProgramaActivoSemestreEntity();
		}
		else{
			asignaturaProgramaActivoSemestreEntity.setIdAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreModel.getIdAsignaturaProgramaActivoSemestre());
			
			if(asignaturaProgramaActivoSemestreModel.getIdProgramaActivoSemestre()!=null){
				ProgramaActivoSemestreEntity programaActivoSemestreEntity = new ProgramaActivoSemestreEntity();
				programaActivoSemestreEntity.setIdProgramaActivoSemestre(asignaturaProgramaActivoSemestreModel.getIdProgramaActivoSemestre());
				asignaturaProgramaActivoSemestreEntity.setFkIdProgramaActivoSemestre(programaActivoSemestreEntity);
			}
			
			asignaturaProgramaActivoSemestreEntity.setNombreAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreModel.getNombreAsignaturaProgramaActivoSemestre());
			
			asignaturaProgramaActivoSemestreEntity.setDescripcionAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreModel.getDescripcionAsignaturaProgramaActivoSemestre());
			
			asignaturaProgramaActivoSemestreEntity.setEstadoAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreModel.getEstadoAsignaturaProgramaActivoSemestre());
			
		}
		return asignaturaProgramaActivoSemestreEntity;
	}

	public static List<AsignaturaProgramaActivoSemestreEntity> ListAsignaturaProgramaActivoSemestreModelToListAsignaturaProgramaActivoSemestreEntity(List<AsignaturaProgramaActivoSemestreModel> listaAsignaturaProgramaActivoSemestreModel){

		List<AsignaturaProgramaActivoSemestreEntity> listaAsignaturaProgramaActivoSemestre=new ArrayList<AsignaturaProgramaActivoSemestreEntity>();

		if(listaAsignaturaProgramaActivoSemestreModel==null || listaAsignaturaProgramaActivoSemestreModel.size()==0){
			return new ArrayList<AsignaturaProgramaActivoSemestreEntity>();
		}
		else{
			listaAsignaturaProgramaActivoSemestre=new ArrayList<AsignaturaProgramaActivoSemestreEntity>();
			AsignaturaProgramaActivoSemestreEntity asignaturaProgramaActivoSemestreEntity=new AsignaturaProgramaActivoSemestreEntity();
			
			for(AsignaturaProgramaActivoSemestreModel aluMod: listaAsignaturaProgramaActivoSemestreModel){
				asignaturaProgramaActivoSemestreEntity = new AsignaturaProgramaActivoSemestreEntity();
				
				asignaturaProgramaActivoSemestreEntity = AsignaturaProgramaActivoSemestreModelToAsignaturaProgramaActivoSemestreEntity(aluMod);

				listaAsignaturaProgramaActivoSemestre.add(asignaturaProgramaActivoSemestreEntity);
			}
		}

		return listaAsignaturaProgramaActivoSemestre;
	}

	public static AsignaturaProgramaActivoSemestreModel AsignaturaProgramaActivoSemestreEntityToAsignaturaProgramaActivoSemestreModel(AsignaturaProgramaActivoSemestreEntity asignaturaProgramaActivoSemestreEntity){

		AsignaturaProgramaActivoSemestreModel asignaturaProgramaActivoSemestreModel = new AsignaturaProgramaActivoSemestreModel();

		if(asignaturaProgramaActivoSemestreEntity==null){
			return new AsignaturaProgramaActivoSemestreModel();
		}
		else{
			
			asignaturaProgramaActivoSemestreModel.setIdAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreEntity.getIdAsignaturaProgramaActivoSemestre());
			
			if(asignaturaProgramaActivoSemestreEntity.getFkIdProgramaActivoSemestre()!=null && asignaturaProgramaActivoSemestreEntity.getFkIdProgramaActivoSemestre().getIdProgramaActivoSemestre()!=null){
				asignaturaProgramaActivoSemestreModel.setIdProgramaActivoSemestre(asignaturaProgramaActivoSemestreEntity.getFkIdProgramaActivoSemestre().getIdProgramaActivoSemestre());
			}
			
			asignaturaProgramaActivoSemestreModel.setNombreAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreModel.getNombreAsignaturaProgramaActivoSemestre());
			
			asignaturaProgramaActivoSemestreModel.setDescripcionAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreModel.getDescripcionAsignaturaProgramaActivoSemestre());
			
			asignaturaProgramaActivoSemestreModel.setEstadoAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreModel.getEstadoAsignaturaProgramaActivoSemestre());
		}
		return asignaturaProgramaActivoSemestreModel;
	}

	public static List<AsignaturaProgramaActivoSemestreModel> ListAsignaturaProgramaActivoSemestreEntityToListAsignaturaProgramaActivoSemestreModel(List<AsignaturaProgramaActivoSemestreEntity> listaAsignaturaProgramaActivoSemestreEntity){

		List<AsignaturaProgramaActivoSemestreModel> listaAsignaturaProgramaActivoSemestreModel=new ArrayList<AsignaturaProgramaActivoSemestreModel>();

		
		if(listaAsignaturaProgramaActivoSemestreEntity == null || listaAsignaturaProgramaActivoSemestreEntity.size()==0){
			return new ArrayList<AsignaturaProgramaActivoSemestreModel>();
		}
		else{
			listaAsignaturaProgramaActivoSemestreModel=new ArrayList<AsignaturaProgramaActivoSemestreModel>();
			AsignaturaProgramaActivoSemestreModel asignaturaProgramaActivoSemestreModel=new AsignaturaProgramaActivoSemestreModel();


			for(AsignaturaProgramaActivoSemestreEntity aluEnt: listaAsignaturaProgramaActivoSemestreEntity){
				asignaturaProgramaActivoSemestreModel=new AsignaturaProgramaActivoSemestreModel();

				asignaturaProgramaActivoSemestreModel = AsignaturaProgramaActivoSemestreEntityToAsignaturaProgramaActivoSemestreModel(aluEnt);

				listaAsignaturaProgramaActivoSemestreModel.add(asignaturaProgramaActivoSemestreModel);
			}
		}

		return listaAsignaturaProgramaActivoSemestreModel;
	}

}
