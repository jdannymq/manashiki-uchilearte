package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.AsignaturaProgramaActivoSemestreModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AsignaturaProgramaActivoSemestreDTO;


public class AsignaturaProgramaActivoSemestreDTOMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static AsignaturaProgramaActivoSemestreModel AsignaturaProgramaActivoSemestreDTOToAsignaturaProgramaActivoSemestreModel(AsignaturaProgramaActivoSemestreDTO programaActivoSemestreAsignaturaDTO){

		AsignaturaProgramaActivoSemestreModel programaActivoSemestreAsignaturaModel=new AsignaturaProgramaActivoSemestreModel();

		if(programaActivoSemestreAsignaturaDTO==null){
			return new AsignaturaProgramaActivoSemestreModel();
		}
		else{
			programaActivoSemestreAsignaturaModel.setIdAsignaturaProgramaActivoSemestre(programaActivoSemestreAsignaturaDTO.getIdAsignaturaProgramaActivoSemestre());
			
			programaActivoSemestreAsignaturaModel.setIdProgramaActivoSemestre(programaActivoSemestreAsignaturaDTO.getIdProgramaActivoSemestre());
			
			programaActivoSemestreAsignaturaModel.setNombreAsignaturaProgramaActivoSemestre(programaActivoSemestreAsignaturaDTO.getNombreAsignaturaProgramaActivoSemestre());

			programaActivoSemestreAsignaturaModel.setDescripcionAsignaturaProgramaActivoSemestre(programaActivoSemestreAsignaturaDTO.getDescripcionAsignaturaProgramaActivoSemestre());
			
			programaActivoSemestreAsignaturaModel.setEstadoAsignaturaProgramaActivoSemestre(programaActivoSemestreAsignaturaDTO.getEstadoAsignaturaProgramaActivoSemestre());
		}
		return programaActivoSemestreAsignaturaModel;
	}

	public static List<AsignaturaProgramaActivoSemestreModel> ListAsignaturaProgramaActivoSemestreDTOToListAsignaturaProgramaActivoSemestreModel(List<AsignaturaProgramaActivoSemestreDTO> listaAsignaturaProgramaActivoSemestreDTO){

		List<AsignaturaProgramaActivoSemestreModel> listaAsignaturaProgramaActivoSemestre=new ArrayList<AsignaturaProgramaActivoSemestreModel>();

		if(listaAsignaturaProgramaActivoSemestreDTO==null || listaAsignaturaProgramaActivoSemestreDTO.size()==0){
			return new ArrayList<AsignaturaProgramaActivoSemestreModel>();
		}
		else{
			listaAsignaturaProgramaActivoSemestre=new ArrayList<AsignaturaProgramaActivoSemestreModel>();
			AsignaturaProgramaActivoSemestreModel programaActivoSemestreAsignaturaModel=new AsignaturaProgramaActivoSemestreModel();
			
			for(AsignaturaProgramaActivoSemestreDTO aluMod: listaAsignaturaProgramaActivoSemestreDTO){
				programaActivoSemestreAsignaturaModel = new AsignaturaProgramaActivoSemestreModel();
				
				programaActivoSemestreAsignaturaModel = AsignaturaProgramaActivoSemestreDTOToAsignaturaProgramaActivoSemestreModel(aluMod);

				listaAsignaturaProgramaActivoSemestre.add(programaActivoSemestreAsignaturaModel);
			}
		}

		return listaAsignaturaProgramaActivoSemestre;
	}

	public static AsignaturaProgramaActivoSemestreDTO AsignaturaProgramaActivoSemestreModelToAsignaturaProgramaActivoSemestreDTO(AsignaturaProgramaActivoSemestreModel programaActivoSemestreAsignaturaModel){

		AsignaturaProgramaActivoSemestreDTO programaActivoSemestreAsignaturaDTO=new AsignaturaProgramaActivoSemestreDTO();

		if(programaActivoSemestreAsignaturaModel==null){
			return new AsignaturaProgramaActivoSemestreDTO();
		}
		else{
			programaActivoSemestreAsignaturaDTO.setIdAsignaturaProgramaActivoSemestre(programaActivoSemestreAsignaturaModel.getIdAsignaturaProgramaActivoSemestre());
			
			programaActivoSemestreAsignaturaDTO.setIdProgramaActivoSemestre(programaActivoSemestreAsignaturaModel.getIdProgramaActivoSemestre());
					
			programaActivoSemestreAsignaturaDTO.setNombreAsignaturaProgramaActivoSemestre(programaActivoSemestreAsignaturaModel.getNombreAsignaturaProgramaActivoSemestre());

			programaActivoSemestreAsignaturaDTO.setDescripcionAsignaturaProgramaActivoSemestre(programaActivoSemestreAsignaturaModel.getDescripcionAsignaturaProgramaActivoSemestre());
			
			programaActivoSemestreAsignaturaDTO.setEstadoAsignaturaProgramaActivoSemestre(programaActivoSemestreAsignaturaModel.getEstadoAsignaturaProgramaActivoSemestre());
		}
		return programaActivoSemestreAsignaturaDTO;
	}

	public static List<AsignaturaProgramaActivoSemestreDTO> ListAsignaturaProgramaActivoSemestreModelToListAsignaturaProgramaActivoSemestreDTO(List<AsignaturaProgramaActivoSemestreModel> listaAsignaturaProgramaActivoSemestreModel){

		List<AsignaturaProgramaActivoSemestreDTO> listaAsignaturaProgramaActivoSemestreDTO=new ArrayList<AsignaturaProgramaActivoSemestreDTO>();

		
		if(listaAsignaturaProgramaActivoSemestreModel == null || listaAsignaturaProgramaActivoSemestreModel.size()==0){
			return new ArrayList<AsignaturaProgramaActivoSemestreDTO>();
		}
		else{
			listaAsignaturaProgramaActivoSemestreDTO=new ArrayList<AsignaturaProgramaActivoSemestreDTO>();
			AsignaturaProgramaActivoSemestreDTO programaActivoSemestreAsignaturaDTO=new AsignaturaProgramaActivoSemestreDTO();


			for(AsignaturaProgramaActivoSemestreModel aluEnt: listaAsignaturaProgramaActivoSemestreModel){
				programaActivoSemestreAsignaturaDTO=new AsignaturaProgramaActivoSemestreDTO();

				programaActivoSemestreAsignaturaDTO = AsignaturaProgramaActivoSemestreModelToAsignaturaProgramaActivoSemestreDTO(aluEnt);

				listaAsignaturaProgramaActivoSemestreDTO.add(programaActivoSemestreAsignaturaDTO);
			}
		}

		return listaAsignaturaProgramaActivoSemestreDTO;
	}

}
