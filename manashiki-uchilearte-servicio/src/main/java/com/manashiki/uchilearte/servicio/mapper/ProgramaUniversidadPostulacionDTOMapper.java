package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadPostulacionModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;

public class ProgramaUniversidadPostulacionDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static ProgramaUniversidadPostulacionModel ProgramaUniversidadPostulacionDTOToProgramaUniversidadPostulacionModel(ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTO){

		ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel=new ProgramaUniversidadPostulacionModel();
		if(programaUniversidadPostulacionDTO==null){
			return new ProgramaUniversidadPostulacionModel();
		}
		else{
			programaUniversidadPostulacionModel.setIdProgramaUniversidadPostulacion(programaUniversidadPostulacionDTO.getIdProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setCodigoProgramaUniversidadPostulacion(programaUniversidadPostulacionDTO.getCodigoProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setNombreProgramaUniversidadPostulacion(programaUniversidadPostulacionDTO.getNombreProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setDuracionProgramaUniversidadPostulacion(programaUniversidadPostulacionDTO.getDuracionProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setCostoProgramaUniversidadPostulacion(programaUniversidadPostulacionDTO.getCostoProgramaUniversidadPostulacion());
			programaUniversidadPostulacionModel.setClasificacionProgramaPostulacion(programaUniversidadPostulacionDTO.getClasificacionProgramaPostulacion());
			programaUniversidadPostulacionModel.setPrioridad(programaUniversidadPostulacionDTO.getPrioridad());
			
		}
		
		return programaUniversidadPostulacionModel;
	}

	public static List<ProgramaUniversidadPostulacionModel> ListProgramaUniversidadPostulacionDTOToListProgramaUniversidadPostulacionModel(List<ProgramaUniversidadPostulacionDTO> listaProgramaUniversidadPostulacionDTO){

		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel=new ArrayList<ProgramaUniversidadPostulacionModel>();

		if(listaProgramaUniversidadPostulacionDTO==null || listaProgramaUniversidadPostulacionDTO.size()==0){
			return new ArrayList<ProgramaUniversidadPostulacionModel>();
		}
		else{
			listaProgramaUniversidadPostulacionModel=new ArrayList<ProgramaUniversidadPostulacionModel>();
			ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel=new ProgramaUniversidadPostulacionModel();

			for(ProgramaUniversidadPostulacionDTO proUniDTO: listaProgramaUniversidadPostulacionDTO){
				programaUniversidadPostulacionModel=new ProgramaUniversidadPostulacionModel();
				
				programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionDTOToProgramaUniversidadPostulacionModel(proUniDTO);
				
				listaProgramaUniversidadPostulacionModel.add(programaUniversidadPostulacionModel);
			}
		}

		return listaProgramaUniversidadPostulacionModel;
	}

	public static ProgramaUniversidadPostulacionDTO ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionDTO(ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel){

		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTO=new ProgramaUniversidadPostulacionDTO();
		if(programaUniversidadPostulacionModel==null){
			return new ProgramaUniversidadPostulacionDTO();
		}
		else{
			if(programaUniversidadPostulacionModel.getIdProgramaUniversidadPostulacion()!=null){
				programaUniversidadPostulacionDTO.setIdProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getIdProgramaUniversidadPostulacion());
			}
			programaUniversidadPostulacionDTO.setCodigoProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getCodigoProgramaUniversidadPostulacion());
			programaUniversidadPostulacionDTO.setNombreProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getNombreProgramaUniversidadPostulacion());
			programaUniversidadPostulacionDTO.setDuracionProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getDuracionProgramaUniversidadPostulacion());
			programaUniversidadPostulacionDTO.setCostoProgramaUniversidadPostulacion(programaUniversidadPostulacionModel.getCostoProgramaUniversidadPostulacion());
			if(programaUniversidadPostulacionModel.getClasificacionProgramaPostulacion()!=null){
				programaUniversidadPostulacionDTO.setClasificacionProgramaPostulacion(programaUniversidadPostulacionModel.getClasificacionProgramaPostulacion());
			}
			if(programaUniversidadPostulacionModel.getPrioridad()!=null){
				programaUniversidadPostulacionDTO.setPrioridad(programaUniversidadPostulacionModel.getPrioridad());
			}
		
		}
		return programaUniversidadPostulacionDTO;
	}

	public static List<ProgramaUniversidadPostulacionDTO> ListProgramaUniversidadPostulacionModelToListProgramaUniversidadPostulacionDTO(List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel){

		List<ProgramaUniversidadPostulacionDTO> listaProgramaUniversidadPostulacionDTO=new ArrayList<ProgramaUniversidadPostulacionDTO>();

		if(listaProgramaUniversidadPostulacionModel==null || listaProgramaUniversidadPostulacionModel.size()==0){
			return new ArrayList<ProgramaUniversidadPostulacionDTO>();
		}
		else{
			listaProgramaUniversidadPostulacionDTO=new ArrayList<ProgramaUniversidadPostulacionDTO>();
			ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTO=new ProgramaUniversidadPostulacionDTO();

			for(ProgramaUniversidadPostulacionModel proUniPosMod: listaProgramaUniversidadPostulacionModel){
				programaUniversidadPostulacionDTO=new ProgramaUniversidadPostulacionDTO();
				
				programaUniversidadPostulacionDTO = ProgramaUniversidadPostulacionModelToProgramaUniversidadPostulacionDTO(proUniPosMod);

				listaProgramaUniversidadPostulacionDTO.add(programaUniversidadPostulacionDTO);
			}
		}
		return listaProgramaUniversidadPostulacionDTO;
	}
}
