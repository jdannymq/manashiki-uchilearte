package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.AlumnoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoDTO;


public class AlumnoDTOMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static AlumnoModel AlumnoDTOToAlumnoModel(AlumnoDTO alumnoDTO){

		AlumnoModel alumnoModel=new AlumnoModel();

		if(alumnoDTO==null){
			return new AlumnoModel();
		}
		else{
			alumnoModel.setIdAlumnoUchile(alumnoDTO.getIdAlumnoUchile());
			alumnoModel.setDescripcionAlumnosUchile(alumnoDTO.getDescripcionAlumnosUchile());
			alumnoModel.setEstadoAlumnosUchile(alumnoDTO.getEstadoAlumnosUchile());
		}
		return alumnoModel;
	}

	public static List<AlumnoModel> ListAlumnoDTOToListAlumnoModel(List<AlumnoDTO> listaAlumnoDTO){

		List<AlumnoModel> listaAlumno=new ArrayList<AlumnoModel>();

		if(listaAlumnoDTO==null || listaAlumnoDTO.size()==0){
			return new ArrayList<AlumnoModel>();
		}
		else{
			listaAlumno=new ArrayList<AlumnoModel>();
			AlumnoModel alumnoModel=new AlumnoModel();
			
			for(AlumnoDTO aluMod: listaAlumnoDTO){
				alumnoModel = new AlumnoModel();
				
				alumnoModel = AlumnoDTOToAlumnoModel(aluMod);

				listaAlumno.add(alumnoModel);
			}
		}

		return listaAlumno;
	}

	public static AlumnoDTO AlumnoModelToAlumnoDTO(AlumnoModel alumnoModel){

		AlumnoDTO alumnoDTO=new AlumnoDTO();

		if(alumnoModel==null){
			return new AlumnoDTO();
		}
		else{
			alumnoDTO.setIdAlumnoUchile(alumnoModel.getIdAlumnoUchile());
			alumnoDTO.setDescripcionAlumnosUchile(alumnoModel.getDescripcionAlumnosUchile());
			alumnoDTO.setEstadoAlumnosUchile(alumnoModel.getEstadoAlumnosUchile());
		}
		return alumnoDTO;
	}

	public static List<AlumnoDTO> ListAlumnoModelToListAlumnoDTO(List<AlumnoModel> listaAlumnoModel){

		List<AlumnoDTO> listaAlumnoDTO=new ArrayList<AlumnoDTO>();

		
		if(listaAlumnoModel == null || listaAlumnoModel.size()==0){
			return new ArrayList<AlumnoDTO>();
		}
		else{
			listaAlumnoDTO=new ArrayList<AlumnoDTO>();
			AlumnoDTO alumnoDTO=new AlumnoDTO();


			for(AlumnoModel aluEnt: listaAlumnoModel){
				alumnoDTO=new AlumnoDTO();

				alumnoDTO = AlumnoModelToAlumnoDTO(aluEnt);

				listaAlumnoDTO.add(alumnoDTO);
			}
		}

		return listaAlumnoDTO;
	}

}
