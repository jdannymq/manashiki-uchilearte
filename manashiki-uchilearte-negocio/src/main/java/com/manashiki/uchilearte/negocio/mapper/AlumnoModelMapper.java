package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.AlumnoEntity;
import com.manashiki.uchilearte.negocio.model.AlumnoModel;


public class AlumnoModelMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static AlumnoEntity AlumnoModelToAlumnoEntity(AlumnoModel alumnoModel){

		AlumnoEntity alumnoEntity=new AlumnoEntity();

		if(alumnoModel==null){
			return new AlumnoEntity();
		}
		else{
			alumnoEntity.setIdAlumnoUchile(alumnoModel.getIdAlumnoUchile());
			alumnoEntity.setDescripcionAlumnosUchile(alumnoModel.getDescripcionAlumnosUchile());
			alumnoEntity.setEstadoAlumnosUchile(alumnoModel.getEstadoAlumnosUchile());
		}
		return alumnoEntity;
	}

	public static List<AlumnoEntity> ListAlumnoModelToListAlumnoEntity(List<AlumnoModel> listaAlumnoModel){

		List<AlumnoEntity> listaAlumno=new ArrayList<AlumnoEntity>();

		if(listaAlumnoModel==null || listaAlumnoModel.size()==0){
			return new ArrayList<AlumnoEntity>();
		}
		else{
			listaAlumno=new ArrayList<AlumnoEntity>();
			AlumnoEntity alumnoEntity=new AlumnoEntity();
			
			for(AlumnoModel aluMod: listaAlumnoModel){
				alumnoEntity = new AlumnoEntity();
				
				alumnoEntity = AlumnoModelToAlumnoEntity(aluMod);

				listaAlumno.add(alumnoEntity);
			}
		}

		return listaAlumno;
	}

	public static AlumnoModel AlumnoEntityToAlumnoModel(AlumnoEntity alumnoEntity){

		AlumnoModel alumnoModel=new AlumnoModel();

		if(alumnoEntity==null){
			return new AlumnoModel();
		}
		else{
			alumnoModel.setIdAlumnoUchile(alumnoEntity.getIdAlumnoUchile());
			alumnoModel.setDescripcionAlumnosUchile(alumnoEntity.getDescripcionAlumnosUchile());
			alumnoModel.setEstadoAlumnosUchile(alumnoEntity.getEstadoAlumnosUchile());
		}
		return alumnoModel;
	}

	public static List<AlumnoModel> ListAlumnoEntityToListAlumnoModel(List<AlumnoEntity> listaAlumnoEntity){

		List<AlumnoModel> listaAlumnoModel=new ArrayList<AlumnoModel>();

		
		if(listaAlumnoEntity == null || listaAlumnoEntity.size()==0){
			return new ArrayList<AlumnoModel>();
		}
		else{
			listaAlumnoModel=new ArrayList<AlumnoModel>();
			AlumnoModel alumnoModel=new AlumnoModel();


			for(AlumnoEntity aluEnt: listaAlumnoEntity){
				alumnoModel=new AlumnoModel();

				alumnoModel = AlumnoEntityToAlumnoModel(aluEnt);

				listaAlumnoModel.add(alumnoModel);
			}
		}

		return listaAlumnoModel;
	}

}
