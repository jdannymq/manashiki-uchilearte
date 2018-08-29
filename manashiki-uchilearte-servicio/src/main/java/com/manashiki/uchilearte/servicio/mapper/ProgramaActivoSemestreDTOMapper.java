package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.ProgramaActivoSemestreModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaActivoSemestreDTO;

public class ProgramaActivoSemestreDTOMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static ProgramaActivoSemestreModel ProgramaActivoSemestreDTOToProgramaActivoSemestreModel(ProgramaActivoSemestreDTO programaActivoSemestreDTO){

		ProgramaActivoSemestreModel programaActivoSemestreModel=new ProgramaActivoSemestreModel();

		if(programaActivoSemestreDTO==null){
			return new ProgramaActivoSemestreModel();
		}
		else{
			programaActivoSemestreModel.setIdProgramaActivoSemestre(programaActivoSemestreDTO.getIdProgramaActivoSemestre());
			
			programaActivoSemestreModel.setIdProgramaActivoSemestre(programaActivoSemestreDTO.getIdProgramaUniversidad());
			
			programaActivoSemestreModel.setIdSemestreTemporada(programaActivoSemestreDTO.getIdSemestreTemporada());
			
			programaActivoSemestreModel.setDescripcionProgramaActivoSemestre(programaActivoSemestreDTO.getDescripcionProgramaActivoSemestre());
			
			programaActivoSemestreModel.setEstadoProgramaActivoSemestre(programaActivoSemestreDTO.getEstadoProgramaActivoSemestre());
			
		}
		return programaActivoSemestreModel;
	}

	public static List<ProgramaActivoSemestreModel> ListProgramaActivoSemestreDTOToListProgramaActivoSemestreModel(List<ProgramaActivoSemestreDTO> listaProgramaActivoSemestreDTO){

		List<ProgramaActivoSemestreModel> listaProgramaActivoSemestre=new ArrayList<ProgramaActivoSemestreModel>();

		if(listaProgramaActivoSemestreDTO==null || listaProgramaActivoSemestreDTO.size()==0){
			return new ArrayList<ProgramaActivoSemestreModel>();
		}
		else{
			listaProgramaActivoSemestre=new ArrayList<ProgramaActivoSemestreModel>();
			ProgramaActivoSemestreModel programaActivoSemestreModel=new ProgramaActivoSemestreModel();
			
			for(ProgramaActivoSemestreDTO aluMod: listaProgramaActivoSemestreDTO){
				programaActivoSemestreModel = new ProgramaActivoSemestreModel();
				
				programaActivoSemestreModel = ProgramaActivoSemestreDTOToProgramaActivoSemestreModel(aluMod);

				listaProgramaActivoSemestre.add(programaActivoSemestreModel);
			}
		}

		return listaProgramaActivoSemestre;
	}

	public static ProgramaActivoSemestreDTO ProgramaActivoSemestreModelToProgramaActivoSemestreDTO(ProgramaActivoSemestreModel programaActivoSemestreModel){

		ProgramaActivoSemestreDTO programaActivoSemestreDTO=new ProgramaActivoSemestreDTO();

		if(programaActivoSemestreModel==null){
			return new ProgramaActivoSemestreDTO();
		}
		else{
			if(programaActivoSemestreModel.getIdProgramaActivoSemestre()!=null){
				programaActivoSemestreDTO.setIdProgramaActivoSemestre(programaActivoSemestreModel.getIdProgramaActivoSemestre());
			}
			
			if(programaActivoSemestreModel.getIdProgramaUniversidad()!=null){
				programaActivoSemestreDTO.setIdProgramaActivoSemestre(programaActivoSemestreModel.getIdProgramaUniversidad());
			}
			
			if(programaActivoSemestreModel.getIdSemestreTemporada()!=null){
				programaActivoSemestreDTO.setIdSemestreTemporada(programaActivoSemestreModel.getIdSemestreTemporada());
			}
			
			
			programaActivoSemestreDTO.setDescripcionProgramaActivoSemestre(programaActivoSemestreModel.getDescripcionProgramaActivoSemestre());
			
			if(programaActivoSemestreModel.getEstadoProgramaActivoSemestre()!=null){
				programaActivoSemestreDTO.setEstadoProgramaActivoSemestre(programaActivoSemestreModel.getEstadoProgramaActivoSemestre());
			}
		}
		return programaActivoSemestreDTO;
	}

	public static List<ProgramaActivoSemestreDTO> ListProgramaActivoSemestreModelToListProgramaActivoSemestreDTO(List<ProgramaActivoSemestreModel> listaProgramaActivoSemestreModel){

		List<ProgramaActivoSemestreDTO> listaProgramaActivoSemestreDTO=new ArrayList<ProgramaActivoSemestreDTO>();

		
		if(listaProgramaActivoSemestreModel == null || listaProgramaActivoSemestreModel.size()==0){
			return new ArrayList<ProgramaActivoSemestreDTO>();
		}
		else{
			listaProgramaActivoSemestreDTO=new ArrayList<ProgramaActivoSemestreDTO>();
			ProgramaActivoSemestreDTO programaActivoSemestreDTO=new ProgramaActivoSemestreDTO();


			for(ProgramaActivoSemestreModel aluEnt: listaProgramaActivoSemestreModel){
				programaActivoSemestreDTO=new ProgramaActivoSemestreDTO();

				programaActivoSemestreDTO = ProgramaActivoSemestreModelToProgramaActivoSemestreDTO(aluEnt);

				listaProgramaActivoSemestreDTO.add(programaActivoSemestreDTO);
			}
		}

		return listaProgramaActivoSemestreDTO;
	}

}
