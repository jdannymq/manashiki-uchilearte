package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.AlumnoEntity;
import com.manashiki.uchilearte.logica.entidad.AlumnoProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaActivoSemestreEntity;
import com.manashiki.uchilearte.negocio.model.AlumnoProgramaActivoSemestreModel;

import vijnana.utilidades.component.utilidades.DateMapper;


public class AlumnoProgramaActivoSemestreModelMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static AlumnoProgramaActivoSemestreEntity AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreEntity(AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel){

		AlumnoProgramaActivoSemestreEntity alumnoProgramaActivoSemestreEntity=new AlumnoProgramaActivoSemestreEntity();

		if(alumnoProgramaActivoSemestreModel==null){
			return new AlumnoProgramaActivoSemestreEntity();
		}
		else{
			/*
		private Integer idAlumnoProgramaActivoSemestre;
		private Integer idProgramaActivoSemestre;
		private Integer idAlumno;
		private Date fechaInicialInscripcionAlumnoProgramaActivoSemestre; 
		private Integer estadoAlumnoProgramaActivoSemestre;
			 	*/
			
			alumnoProgramaActivoSemestreEntity.setIdAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre());
			
			if(alumnoProgramaActivoSemestreModel.getIdProgramaActivoSemestre()!=null){
				ProgramaActivoSemestreEntity programaActivoSemestreEntity = new ProgramaActivoSemestreEntity();
				programaActivoSemestreEntity.setIdProgramaActivoSemestre(alumnoProgramaActivoSemestreModel.getIdProgramaActivoSemestre());
				alumnoProgramaActivoSemestreEntity.setFkIdProgramaActivoSemestre(programaActivoSemestreEntity);
			}
			
			if(alumnoProgramaActivoSemestreModel.getIdAlumno()!=null){
				AlumnoEntity alumnoEntity = new AlumnoEntity();
				alumnoEntity.setIdAlumnoUchile(alumnoProgramaActivoSemestreModel.getIdAlumno());
				alumnoProgramaActivoSemestreEntity.setFkIdAlumno(alumnoEntity);
			}
			
			alumnoProgramaActivoSemestreEntity.setFechaInicialInscripcionAlumnoProgramaActivoSemestre(DateMapper.DateUtilToTimestamp(alumnoProgramaActivoSemestreModel.getFechaInicialInscripcionAlumnoProgramaActivoSemestre()));
			alumnoProgramaActivoSemestreEntity.setEstadoAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreModel.getEstadoAlumnoProgramaActivoSemestre());
		}
		return alumnoProgramaActivoSemestreEntity;
	}

	public static List<AlumnoProgramaActivoSemestreEntity> ListAlumnoProgramaActivoSemestreModelToListAlumnoProgramaActivoSemestreEntity(List<AlumnoProgramaActivoSemestreModel> listaAlumnoProgramaActivoSemestreModel){

		List<AlumnoProgramaActivoSemestreEntity> listaAlumnoProgramaActivoSemestre=new ArrayList<AlumnoProgramaActivoSemestreEntity>();

		if(listaAlumnoProgramaActivoSemestreModel==null || listaAlumnoProgramaActivoSemestreModel.size()==0){
			return new ArrayList<AlumnoProgramaActivoSemestreEntity>();
		}
		else{
			listaAlumnoProgramaActivoSemestre=new ArrayList<AlumnoProgramaActivoSemestreEntity>();
			AlumnoProgramaActivoSemestreEntity alumnoProgramaActivoSemestreEntity=new AlumnoProgramaActivoSemestreEntity();
			
			for(AlumnoProgramaActivoSemestreModel aluMod: listaAlumnoProgramaActivoSemestreModel){
				alumnoProgramaActivoSemestreEntity = new AlumnoProgramaActivoSemestreEntity();
				
				alumnoProgramaActivoSemestreEntity = AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreEntity(aluMod);

				listaAlumnoProgramaActivoSemestre.add(alumnoProgramaActivoSemestreEntity);
			}
		}

		return listaAlumnoProgramaActivoSemestre;
	}

	public static AlumnoProgramaActivoSemestreModel AlumnoProgramaActivoSemestreEntityToAlumnoProgramaActivoSemestreModel(AlumnoProgramaActivoSemestreEntity alumnoProgramaActivoSemestreEntity){

		AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel=new AlumnoProgramaActivoSemestreModel();

		if(alumnoProgramaActivoSemestreEntity==null){
			return new AlumnoProgramaActivoSemestreModel();
		}
		else{
			if(alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre()!=null){
				
			}
			alumnoProgramaActivoSemestreModel.setIdAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreEntity.getIdAlumnoProgramaActivoSemestre());
			
			if(alumnoProgramaActivoSemestreEntity.getFkIdProgramaActivoSemestre()!=null && alumnoProgramaActivoSemestreEntity.getFkIdProgramaActivoSemestre().getIdProgramaActivoSemestre()!=null){
				alumnoProgramaActivoSemestreModel.setIdProgramaActivoSemestre(alumnoProgramaActivoSemestreEntity.getFkIdProgramaActivoSemestre().getIdProgramaActivoSemestre());
			}
			
			if(alumnoProgramaActivoSemestreEntity.getFkIdAlumno()!=null && alumnoProgramaActivoSemestreEntity.getFkIdAlumno().getIdAlumnoUchile()!=null){
				alumnoProgramaActivoSemestreModel.setIdAlumno(alumnoProgramaActivoSemestreEntity.getFkIdAlumno().getIdAlumnoUchile());
			}
			
			alumnoProgramaActivoSemestreModel.setFechaInicialInscripcionAlumnoProgramaActivoSemestre(DateMapper.TimestampToDateUtil(alumnoProgramaActivoSemestreEntity.getFechaInicialInscripcionAlumnoProgramaActivoSemestre()));
			
			alumnoProgramaActivoSemestreModel.setEstadoAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreEntity.getEstadoAlumnoProgramaActivoSemestre());
		}
		return alumnoProgramaActivoSemestreModel;
	}

	public static List<AlumnoProgramaActivoSemestreModel> ListAlumnoProgramaActivoSemestreEntityToListAlumnoProgramaActivoSemestreModel(List<AlumnoProgramaActivoSemestreEntity> listaAlumnoProgramaActivoSemestreEntity){

		List<AlumnoProgramaActivoSemestreModel> listaAlumnoProgramaActivoSemestreModel=new ArrayList<AlumnoProgramaActivoSemestreModel>();

		
		if(listaAlumnoProgramaActivoSemestreEntity == null || listaAlumnoProgramaActivoSemestreEntity.size()==0){
			return new ArrayList<AlumnoProgramaActivoSemestreModel>();
		}
		else{
			listaAlumnoProgramaActivoSemestreModel=new ArrayList<AlumnoProgramaActivoSemestreModel>();
			AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel=new AlumnoProgramaActivoSemestreModel();


			for(AlumnoProgramaActivoSemestreEntity aluEnt: listaAlumnoProgramaActivoSemestreEntity){
				alumnoProgramaActivoSemestreModel=new AlumnoProgramaActivoSemestreModel();

				alumnoProgramaActivoSemestreModel = AlumnoProgramaActivoSemestreEntityToAlumnoProgramaActivoSemestreModel(aluEnt);

				listaAlumnoProgramaActivoSemestreModel.add(alumnoProgramaActivoSemestreModel);
			}
		}

		return listaAlumnoProgramaActivoSemestreModel;
	}

}
