package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;

public class ProgramaUniversidadDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static ProgramaUniversidadModel ProgramaUniversidadDTOToProgramaUniversidadModel(ProgramaUniversidadDTO programaUniversidadDTO){

		ProgramaUniversidadModel programaUniversidadModel=new ProgramaUniversidadModel();
		if(programaUniversidadDTO==null){
			return new ProgramaUniversidadModel();
		}
		else{
			programaUniversidadModel.setIdProgramaUniversidad(programaUniversidadDTO.getIdProgramaUniversidad());
			programaUniversidadModel.setCodigoProgramaUniversidad(programaUniversidadDTO.getCodigoProgramaUniversidad());
			programaUniversidadModel.setNombreProgramaUniversidad(programaUniversidadDTO.getNombreProgramaUniversidad());
			programaUniversidadModel.setDuracionProgramaUniversidad(programaUniversidadDTO.getDuracionProgramaUniversidad());
			programaUniversidadModel.setCostoProgramaUniversidad(programaUniversidadDTO.getCostoProgramaUniversidad());
			programaUniversidadModel.setClasificacionPrograma(programaUniversidadDTO.getClasificacionPrograma());
		}
		
		return programaUniversidadModel;
	}

	public static List<ProgramaUniversidadModel> ListProgramaUniversidadDTOToListProgramaUniversidadModel(List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO){

		List<ProgramaUniversidadModel> listaProgramaUniversidadModel = new ArrayList<ProgramaUniversidadModel>();

		if(listaProgramaUniversidadDTO==null || listaProgramaUniversidadDTO.size()==0){
			return new ArrayList<ProgramaUniversidadModel>();
		}
		else{
			listaProgramaUniversidadModel = new ArrayList<ProgramaUniversidadModel>();
			
			ProgramaUniversidadModel programaUniversidadModel = new ProgramaUniversidadModel();

			for(ProgramaUniversidadDTO proUniDTO: listaProgramaUniversidadDTO){
				programaUniversidadModel=new ProgramaUniversidadModel();
				
				programaUniversidadModel = ProgramaUniversidadDTOToProgramaUniversidadModel(proUniDTO);
				
				listaProgramaUniversidadModel.add(programaUniversidadModel);
			}
		}

		return listaProgramaUniversidadModel;
	}

	public static ProgramaUniversidadDTO ProgramaUniversidadModelToProgramaUniversidadDTO(ProgramaUniversidadModel programaUniversidadModel){

		ProgramaUniversidadDTO programaUniversidadDTO=new ProgramaUniversidadDTO();
		
		if(programaUniversidadModel==null){
			return new ProgramaUniversidadDTO();
		}
		else{
			if(programaUniversidadModel.getIdProgramaUniversidad()!=null){
				programaUniversidadDTO.setIdProgramaUniversidad(programaUniversidadModel.getIdProgramaUniversidad());
			}
			programaUniversidadDTO.setCodigoProgramaUniversidad(programaUniversidadModel.getCodigoProgramaUniversidad());
			programaUniversidadDTO.setNombreProgramaUniversidad(programaUniversidadModel.getNombreProgramaUniversidad());
			programaUniversidadDTO.setDuracionProgramaUniversidad(programaUniversidadModel.getDuracionProgramaUniversidad());
			programaUniversidadDTO.setCostoProgramaUniversidad(programaUniversidadModel.getCostoProgramaUniversidad());
			if(programaUniversidadModel.getClasificacionPrograma()!=null){
				programaUniversidadDTO.setClasificacionPrograma(programaUniversidadModel.getClasificacionPrograma());
			}
		
		}
		return programaUniversidadDTO;
	}

	public static List<ProgramaUniversidadDTO> ListProgramaUniversidadModelToListProgramaUniversidadDTO(List<ProgramaUniversidadModel> listaProgramaUniversidad){

		List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO=new ArrayList<ProgramaUniversidadDTO>();

		if(listaProgramaUniversidad==null || listaProgramaUniversidad.size()==0){
			return new ArrayList<ProgramaUniversidadDTO>();
		}
		else{
			listaProgramaUniversidadDTO=new ArrayList<ProgramaUniversidadDTO>();
			
			ProgramaUniversidadDTO programaUniversidadDTO=new ProgramaUniversidadDTO();

			for(ProgramaUniversidadModel proUniMod: listaProgramaUniversidad){
				programaUniversidadDTO=new ProgramaUniversidadDTO();
				
				programaUniversidadDTO = ProgramaUniversidadModelToProgramaUniversidadDTO(proUniMod);

				listaProgramaUniversidadDTO.add(programaUniversidadDTO);
			}
		}
		return listaProgramaUniversidadDTO;
	}
}
