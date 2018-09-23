package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.AlumnoEntity;
import com.manashiki.uchilearte.logica.entidad.AsignaturaProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.entidad.AsignaturaTomadaProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.negocio.model.AsignaturaTomadaProgramaActivoSemestreModel;


public class AsignaturaTomadaProgramaActivoSemestreModelMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static AsignaturaTomadaProgramaActivoSemestreEntity AsignaturaTomadaProgramaActivoSemestreModelToAsignaturaTomadaProgramaActivoSemestreEntity(AsignaturaTomadaProgramaActivoSemestreModel asignaturaTomadaProgramaActivoSemestreModel){

		AsignaturaTomadaProgramaActivoSemestreEntity asignaturaTomadaProgramaActivoSemestreEntity=new AsignaturaTomadaProgramaActivoSemestreEntity();

		if(asignaturaTomadaProgramaActivoSemestreModel==null){
			return new AsignaturaTomadaProgramaActivoSemestreEntity();
		}
		else{
			asignaturaTomadaProgramaActivoSemestreEntity.setIdAsignaturaTomadaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreModel.getIdAsignaturaTomadaProgramaActivoSemestre());
			
			if(asignaturaTomadaProgramaActivoSemestreModel.getIdAsignaturaProgramaActivoSemestre()!=null){
				AsignaturaProgramaActivoSemestreEntity asignaturaProgramaActivoSemestreEntity = new AsignaturaProgramaActivoSemestreEntity();;
				asignaturaProgramaActivoSemestreEntity.setIdAsignaturaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreModel.getIdAsignaturaProgramaActivoSemestre());
				asignaturaTomadaProgramaActivoSemestreEntity.setFkIdAsignaturaProgramaActivoSemestre(asignaturaProgramaActivoSemestreEntity);
			}
			
			if(asignaturaTomadaProgramaActivoSemestreModel.getIdAlumno()!=null){
				AlumnoEntity alumnoEntity = new AlumnoEntity();
				alumnoEntity.setIdAlumnoUchile(asignaturaTomadaProgramaActivoSemestreModel.getIdAlumno());
				asignaturaTomadaProgramaActivoSemestreEntity.setFkIdAlumno(alumnoEntity);
			}
			
			asignaturaTomadaProgramaActivoSemestreEntity.setEstadoAsignaturaProgramaActivoSemestreTomada(asignaturaTomadaProgramaActivoSemestreModel.getEstadoAsignaturaTomadaProgramaActivoSemestre());
			
		}
		return asignaturaTomadaProgramaActivoSemestreEntity;
	}

	public static List<AsignaturaTomadaProgramaActivoSemestreEntity> ListAsignaturaTomadaProgramaActivoSemestreModelToListAsignaturaTomadaProgramaActivoSemestreEntity(List<AsignaturaTomadaProgramaActivoSemestreModel> listaAsignaturaTomadaProgramaActivoSemestreModel){

		List<AsignaturaTomadaProgramaActivoSemestreEntity> listaAsignaturaTomadaProgramaActivoSemestre=new ArrayList<AsignaturaTomadaProgramaActivoSemestreEntity>();

		if(listaAsignaturaTomadaProgramaActivoSemestreModel==null || listaAsignaturaTomadaProgramaActivoSemestreModel.size()==0){
			return new ArrayList<AsignaturaTomadaProgramaActivoSemestreEntity>();
		}
		else{
			listaAsignaturaTomadaProgramaActivoSemestre=new ArrayList<AsignaturaTomadaProgramaActivoSemestreEntity>();
			AsignaturaTomadaProgramaActivoSemestreEntity asignaturaTomadaProgramaActivoSemestreEntity=new AsignaturaTomadaProgramaActivoSemestreEntity();
			
			for(AsignaturaTomadaProgramaActivoSemestreModel aluMod: listaAsignaturaTomadaProgramaActivoSemestreModel){
				asignaturaTomadaProgramaActivoSemestreEntity = new AsignaturaTomadaProgramaActivoSemestreEntity();
				
				asignaturaTomadaProgramaActivoSemestreEntity = AsignaturaTomadaProgramaActivoSemestreModelToAsignaturaTomadaProgramaActivoSemestreEntity(aluMod);

				listaAsignaturaTomadaProgramaActivoSemestre.add(asignaturaTomadaProgramaActivoSemestreEntity);
			}
		}

		return listaAsignaturaTomadaProgramaActivoSemestre;
	}

	public static AsignaturaTomadaProgramaActivoSemestreModel AsignaturaTomadaProgramaActivoSemestreEntityToAsignaturaTomadaProgramaActivoSemestreModel(AsignaturaTomadaProgramaActivoSemestreEntity asignaturaTomadaProgramaActivoSemestreEntity){

		AsignaturaTomadaProgramaActivoSemestreModel asignaturaTomadaProgramaActivoSemestreModel = new AsignaturaTomadaProgramaActivoSemestreModel();

		if(asignaturaTomadaProgramaActivoSemestreEntity==null){
			return new AsignaturaTomadaProgramaActivoSemestreModel();
		}
		else{
			asignaturaTomadaProgramaActivoSemestreModel.setIdAsignaturaTomadaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreEntity.getIdAsignaturaTomadaProgramaActivoSemestre());
			
			if(asignaturaTomadaProgramaActivoSemestreEntity.getFkIdAsignaturaProgramaActivoSemestre()!=null && asignaturaTomadaProgramaActivoSemestreEntity.getFkIdAsignaturaProgramaActivoSemestre().getIdAsignaturaProgramaActivoSemestre()!=null){
				asignaturaTomadaProgramaActivoSemestreModel.setIdAsignaturaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreEntity.getFkIdAsignaturaProgramaActivoSemestre().getIdAsignaturaProgramaActivoSemestre());
			}
			
			if(asignaturaTomadaProgramaActivoSemestreEntity.getFkIdAlumno()!=null && asignaturaTomadaProgramaActivoSemestreEntity.getFkIdAlumno().getIdAlumnoUchile()!=null){
				asignaturaTomadaProgramaActivoSemestreModel.setIdAlumno(asignaturaTomadaProgramaActivoSemestreEntity.getFkIdAlumno().getIdAlumnoUchile());
			}
			
			asignaturaTomadaProgramaActivoSemestreEntity.setEstadoAsignaturaProgramaActivoSemestreTomada(asignaturaTomadaProgramaActivoSemestreModel.getEstadoAsignaturaTomadaProgramaActivoSemestre());
			
			
		}
		return asignaturaTomadaProgramaActivoSemestreModel;
	}

	public static List<AsignaturaTomadaProgramaActivoSemestreModel> ListAsignaturaTomadaProgramaActivoSemestreEntityToListAsignaturaTomadaProgramaActivoSemestreModel(List<AsignaturaTomadaProgramaActivoSemestreEntity> listaAsignaturaTomadaProgramaActivoSemestreEntity){

		List<AsignaturaTomadaProgramaActivoSemestreModel> listaAsignaturaTomadaProgramaActivoSemestreModel=new ArrayList<AsignaturaTomadaProgramaActivoSemestreModel>();

		
		if(listaAsignaturaTomadaProgramaActivoSemestreEntity == null || listaAsignaturaTomadaProgramaActivoSemestreEntity.size()==0){
			return new ArrayList<AsignaturaTomadaProgramaActivoSemestreModel>();
		}
		else{
			listaAsignaturaTomadaProgramaActivoSemestreModel=new ArrayList<AsignaturaTomadaProgramaActivoSemestreModel>();
			AsignaturaTomadaProgramaActivoSemestreModel asignaturaTomadaProgramaActivoSemestreModel=new AsignaturaTomadaProgramaActivoSemestreModel();


			for(AsignaturaTomadaProgramaActivoSemestreEntity aluEnt: listaAsignaturaTomadaProgramaActivoSemestreEntity){
				asignaturaTomadaProgramaActivoSemestreModel=new AsignaturaTomadaProgramaActivoSemestreModel();

				asignaturaTomadaProgramaActivoSemestreModel = AsignaturaTomadaProgramaActivoSemestreEntityToAsignaturaTomadaProgramaActivoSemestreModel(aluEnt);

				listaAsignaturaTomadaProgramaActivoSemestreModel.add(asignaturaTomadaProgramaActivoSemestreModel);
			}
		}

		return listaAsignaturaTomadaProgramaActivoSemestreModel;
	}

}
