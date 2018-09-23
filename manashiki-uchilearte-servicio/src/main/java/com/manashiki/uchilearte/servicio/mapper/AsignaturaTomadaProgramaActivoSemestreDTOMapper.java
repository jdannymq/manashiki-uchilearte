package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.AsignaturaTomadaProgramaActivoSemestreModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AsignaturaTomadaProgramaActivoSemestreDTO;

public class AsignaturaTomadaProgramaActivoSemestreDTOMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static AsignaturaTomadaProgramaActivoSemestreModel AsignaturaTomadaProgramaActivoSemestreDTOToAsignaturaTomadaProgramaActivoSemestreModel(AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO){

		AsignaturaTomadaProgramaActivoSemestreModel asignaturaTomadaProgramaActivoSemestreModel=new AsignaturaTomadaProgramaActivoSemestreModel();

		if(asignaturaTomadaProgramaActivoSemestreDTO==null){
			return new AsignaturaTomadaProgramaActivoSemestreModel();
		}
		else{
			asignaturaTomadaProgramaActivoSemestreModel.setIdAsignaturaTomadaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreDTO.getIdAsignaturaTomadaProgramaActivoSemestre());
			
			asignaturaTomadaProgramaActivoSemestreModel.setIdAsignaturaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreDTO.getIdAsignaturaProgramaActivosSemestre());
			
			asignaturaTomadaProgramaActivoSemestreModel.setIdAlumno(asignaturaTomadaProgramaActivoSemestreDTO.getIdAlumno());
			
			asignaturaTomadaProgramaActivoSemestreModel.setEstadoAsignaturaTomadaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreDTO.getEstadoAsignaturaTomadaProgramaActivoSemestre());
		}
		
		return asignaturaTomadaProgramaActivoSemestreModel;
	}

	public static List<AsignaturaTomadaProgramaActivoSemestreModel> ListAsignaturaTomadaProgramaActivoSemestreDTOToListAsignaturaTomadaProgramaActivoSemestreModel(List<AsignaturaTomadaProgramaActivoSemestreDTO> listaAsignaturaTomadaProgramaActivoSemestreDTO){

		List<AsignaturaTomadaProgramaActivoSemestreModel> listaAsignaturaTomadaProgramaActivoSemestre=new ArrayList<AsignaturaTomadaProgramaActivoSemestreModel>();

		if(listaAsignaturaTomadaProgramaActivoSemestreDTO==null || listaAsignaturaTomadaProgramaActivoSemestreDTO.size()==0){
			return new ArrayList<AsignaturaTomadaProgramaActivoSemestreModel>();
		}
		else{
			listaAsignaturaTomadaProgramaActivoSemestre=new ArrayList<AsignaturaTomadaProgramaActivoSemestreModel>();
			AsignaturaTomadaProgramaActivoSemestreModel programaActivoSemestreAsignaturaModel=new AsignaturaTomadaProgramaActivoSemestreModel();
			
			for(AsignaturaTomadaProgramaActivoSemestreDTO aluMod: listaAsignaturaTomadaProgramaActivoSemestreDTO){
				programaActivoSemestreAsignaturaModel = new AsignaturaTomadaProgramaActivoSemestreModel();
				
				programaActivoSemestreAsignaturaModel = AsignaturaTomadaProgramaActivoSemestreDTOToAsignaturaTomadaProgramaActivoSemestreModel(aluMod);

				listaAsignaturaTomadaProgramaActivoSemestre.add(programaActivoSemestreAsignaturaModel);
			}
		}

		return listaAsignaturaTomadaProgramaActivoSemestre;
	}

	public static AsignaturaTomadaProgramaActivoSemestreDTO AsignaturaTomadaProgramaActivoSemestreModelToAsignaturaTomadaProgramaActivoSemestreDTO(AsignaturaTomadaProgramaActivoSemestreModel asignaturaTomadaProgramaActivoSemestreModel){

		AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO=new AsignaturaTomadaProgramaActivoSemestreDTO();

		if(asignaturaTomadaProgramaActivoSemestreModel==null){
			return new AsignaturaTomadaProgramaActivoSemestreDTO();
		}
		else{
			if(asignaturaTomadaProgramaActivoSemestreModel.getIdAsignaturaTomadaProgramaActivoSemestre()!=null){
				asignaturaTomadaProgramaActivoSemestreDTO.setIdAsignaturaTomadaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreModel.getIdAsignaturaTomadaProgramaActivoSemestre());
			}
			
			if(asignaturaTomadaProgramaActivoSemestreModel.getIdAsignaturaProgramaActivoSemestre()!=null){
				asignaturaTomadaProgramaActivoSemestreDTO.setIdAsignaturaProgramaActivosSemestre(asignaturaTomadaProgramaActivoSemestreModel.getIdAsignaturaProgramaActivoSemestre());
			}
			
			if(asignaturaTomadaProgramaActivoSemestreModel.getIdAlumno()!=null){
				asignaturaTomadaProgramaActivoSemestreDTO.setIdAlumno(asignaturaTomadaProgramaActivoSemestreModel.getIdAlumno());
			}
			
			if(asignaturaTomadaProgramaActivoSemestreModel.getEstadoAsignaturaTomadaProgramaActivoSemestre()!=null){
				asignaturaTomadaProgramaActivoSemestreDTO.setEstadoAsignaturaTomadaProgramaActivoSemestre(asignaturaTomadaProgramaActivoSemestreModel.getEstadoAsignaturaTomadaProgramaActivoSemestre());
			}
		}
		return asignaturaTomadaProgramaActivoSemestreDTO;
	}

	public static List<AsignaturaTomadaProgramaActivoSemestreDTO> ListAsignaturaTomadaProgramaActivoSemestreModelToListAsignaturaTomadaProgramaActivoSemestreDTO(List<AsignaturaTomadaProgramaActivoSemestreModel> listaAsignaturaTomadaProgramaActivoSemestreModel){

		List<AsignaturaTomadaProgramaActivoSemestreDTO> listaAsignaturaTomadaProgramaActivoSemestreDTO=new ArrayList<AsignaturaTomadaProgramaActivoSemestreDTO>();

		
		if(listaAsignaturaTomadaProgramaActivoSemestreModel == null || listaAsignaturaTomadaProgramaActivoSemestreModel.size()==0){
			return new ArrayList<AsignaturaTomadaProgramaActivoSemestreDTO>();
		}
		else{
			listaAsignaturaTomadaProgramaActivoSemestreDTO=new ArrayList<AsignaturaTomadaProgramaActivoSemestreDTO>();
			AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO=new AsignaturaTomadaProgramaActivoSemestreDTO();


			for(AsignaturaTomadaProgramaActivoSemestreModel aluEnt: listaAsignaturaTomadaProgramaActivoSemestreModel){
				asignaturaTomadaProgramaActivoSemestreDTO=new AsignaturaTomadaProgramaActivoSemestreDTO();

				asignaturaTomadaProgramaActivoSemestreDTO = AsignaturaTomadaProgramaActivoSemestreModelToAsignaturaTomadaProgramaActivoSemestreDTO(aluEnt);

				listaAsignaturaTomadaProgramaActivoSemestreDTO.add(asignaturaTomadaProgramaActivoSemestreDTO);
			}
		}

		return listaAsignaturaTomadaProgramaActivoSemestreDTO;
	}

}
