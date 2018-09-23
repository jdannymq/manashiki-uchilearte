package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.AlumnoProgramaActivoSemestreModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoProgramaActivoSemestreDTO;


public class AlumnoProgramaActivoSemestreDTOMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static AlumnoProgramaActivoSemestreModel AlumnoProgramaActivoSemestreDTOToAlumnoProgramaActivoSemestreModel(AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO){

		AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel=new AlumnoProgramaActivoSemestreModel();

		if(alumnoProgramaActivoSemestreDTO==null){
			return new AlumnoProgramaActivoSemestreModel();
		}
		else{
			alumnoProgramaActivoSemestreModel.setIdAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreDTO.getIdAlumnoProgramaActivoSemestre());
			
			alumnoProgramaActivoSemestreModel.setIdProgramaActivoSemestre(alumnoProgramaActivoSemestreDTO.getIdProgramaActivoSemestre());
			
			alumnoProgramaActivoSemestreModel.setIdAlumno(alumnoProgramaActivoSemestreDTO.getIdAlumno());
			
			alumnoProgramaActivoSemestreModel.setFechaInicialInscripcionAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreDTO.getFechaInicialInscripcionAlumnoProgramaActivoSemestre());
			
			alumnoProgramaActivoSemestreModel.setEstadoAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreDTO.getEstadoAlumnoProgramaActivoSemestre());
		}
		return alumnoProgramaActivoSemestreModel;
	}

	public static List<AlumnoProgramaActivoSemestreModel> ListAlumnoProgramaActivoSemestreDTOToListAlumnoProgramaActivoSemestreModel(List<AlumnoProgramaActivoSemestreDTO> listaAlumnoProgramaActivoSemestreDTO){

		List<AlumnoProgramaActivoSemestreModel> listaAlumnoProgramaActivoSemestre=new ArrayList<AlumnoProgramaActivoSemestreModel>();

		if(listaAlumnoProgramaActivoSemestreDTO==null || listaAlumnoProgramaActivoSemestreDTO.size()==0){
			return new ArrayList<AlumnoProgramaActivoSemestreModel>();
		}
		else{
			listaAlumnoProgramaActivoSemestre=new ArrayList<AlumnoProgramaActivoSemestreModel>();
			AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel=new AlumnoProgramaActivoSemestreModel();
			
			for(AlumnoProgramaActivoSemestreDTO aluMod: listaAlumnoProgramaActivoSemestreDTO){
				alumnoProgramaActivoSemestreModel = new AlumnoProgramaActivoSemestreModel();
				
				alumnoProgramaActivoSemestreModel = AlumnoProgramaActivoSemestreDTOToAlumnoProgramaActivoSemestreModel(aluMod);

				listaAlumnoProgramaActivoSemestre.add(alumnoProgramaActivoSemestreModel);
			}
		}

		return listaAlumnoProgramaActivoSemestre;
	}

	public static AlumnoProgramaActivoSemestreDTO AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreDTO(AlumnoProgramaActivoSemestreModel alumnoProgramaActivoSemestreModel){

		AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO=new AlumnoProgramaActivoSemestreDTO();

		if(alumnoProgramaActivoSemestreModel==null){
			return new AlumnoProgramaActivoSemestreDTO();
		}
		else{
			if(alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre()!=null){
				alumnoProgramaActivoSemestreDTO.setIdAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreModel.getIdAlumnoProgramaActivoSemestre());
			}
			
			if(alumnoProgramaActivoSemestreModel.getIdProgramaActivoSemestre()!=null){
				alumnoProgramaActivoSemestreDTO.setIdProgramaActivoSemestre(alumnoProgramaActivoSemestreModel.getIdProgramaActivoSemestre());
			}
			
			if(alumnoProgramaActivoSemestreModel.getIdAlumno()!=null){
				alumnoProgramaActivoSemestreDTO.setIdAlumno(alumnoProgramaActivoSemestreModel.getIdAlumno());
			}
			
			if(alumnoProgramaActivoSemestreModel.getFechaInicialInscripcionAlumnoProgramaActivoSemestre()!=null){
				alumnoProgramaActivoSemestreDTO.setFechaInicialInscripcionAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreModel.getFechaInicialInscripcionAlumnoProgramaActivoSemestre());
			}
			
			if(alumnoProgramaActivoSemestreModel.getEstadoAlumnoProgramaActivoSemestre()!=null){
				alumnoProgramaActivoSemestreDTO.setEstadoAlumnoProgramaActivoSemestre(alumnoProgramaActivoSemestreModel.getEstadoAlumnoProgramaActivoSemestre());
			}
		}
		return alumnoProgramaActivoSemestreDTO;
	}

	public static List<AlumnoProgramaActivoSemestreDTO> ListAlumnoProgramaActivoSemestreModelToListAlumnoProgramaActivoSemestreDTO(List<AlumnoProgramaActivoSemestreModel> listaAlumnoProgramaActivoSemestreModel){

		List<AlumnoProgramaActivoSemestreDTO> listaAlumnoProgramaActivoSemestreDTO=new ArrayList<AlumnoProgramaActivoSemestreDTO>();

		
		if(listaAlumnoProgramaActivoSemestreModel == null || listaAlumnoProgramaActivoSemestreModel.size()==0){
			return new ArrayList<AlumnoProgramaActivoSemestreDTO>();
		}
		else{
			listaAlumnoProgramaActivoSemestreDTO=new ArrayList<AlumnoProgramaActivoSemestreDTO>();
			AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO=new AlumnoProgramaActivoSemestreDTO();


			for(AlumnoProgramaActivoSemestreModel aluEnt: listaAlumnoProgramaActivoSemestreModel){
				alumnoProgramaActivoSemestreDTO=new AlumnoProgramaActivoSemestreDTO();

				alumnoProgramaActivoSemestreDTO = AlumnoProgramaActivoSemestreModelToAlumnoProgramaActivoSemestreDTO(aluEnt);

				listaAlumnoProgramaActivoSemestreDTO.add(alumnoProgramaActivoSemestreDTO);
			}
		}

		return listaAlumnoProgramaActivoSemestreDTO;
	}

}
