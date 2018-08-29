package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.SemestreTemporadaModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SemestreTemporadaDTO;

public class SemestreTemporadaDTOMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static SemestreTemporadaModel SemestreTemporadaDTOToSemestreTemporadaModel(SemestreTemporadaDTO semestreTemporadaDTO){

		SemestreTemporadaModel semestreTemporadaModel=new SemestreTemporadaModel();

		if(semestreTemporadaDTO==null){
			return new SemestreTemporadaModel();
		}
		else{
			semestreTemporadaModel.setIdSemestreTemporada(semestreTemporadaDTO.getIdSemestreTemporada());
			semestreTemporadaModel.setNombreSemestreTemporada(semestreTemporadaDTO.getNombreSemestreTemporada());
			semestreTemporadaModel.setDescripcionSemestreTemporada(semestreTemporadaDTO.getDescripcionSemestreTemporada());
		}
		return semestreTemporadaModel;
	}

	public static List<SemestreTemporadaModel> ListSemestreTemporadaDTOToListSemestreTemporadaModel(List<SemestreTemporadaDTO> listaSemestreTemporadaDTO){

		List<SemestreTemporadaModel> listaSemestreTemporada=new ArrayList<SemestreTemporadaModel>();

		if(listaSemestreTemporadaDTO==null || listaSemestreTemporadaDTO.size()==0){
			return new ArrayList<SemestreTemporadaModel>();
		}
		else{
			listaSemestreTemporada=new ArrayList<SemestreTemporadaModel>();
			SemestreTemporadaModel semestreTemporadaModel=new SemestreTemporadaModel();
			
			for(SemestreTemporadaDTO aluMod: listaSemestreTemporadaDTO){
				semestreTemporadaModel = new SemestreTemporadaModel();
				
				semestreTemporadaModel = SemestreTemporadaDTOToSemestreTemporadaModel(aluMod);

				listaSemestreTemporada.add(semestreTemporadaModel);
			}
		}

		return listaSemestreTemporada;
	}

	public static SemestreTemporadaDTO SemestreTemporadaModelToSemestreTemporadaDTO(SemestreTemporadaModel semestreTemporadaModel){

		SemestreTemporadaDTO semestreTemporadaDTO=new SemestreTemporadaDTO();

		if(semestreTemporadaModel==null){
			return new SemestreTemporadaDTO();
		}
		else{
			semestreTemporadaDTO.setIdSemestreTemporada(semestreTemporadaModel.getIdSemestreTemporada());
			semestreTemporadaDTO.setNombreSemestreTemporada(semestreTemporadaModel.getNombreSemestreTemporada());
			semestreTemporadaDTO.setDescripcionSemestreTemporada(semestreTemporadaModel.getDescripcionSemestreTemporada());
		}
		return semestreTemporadaDTO;
	}

	public static List<SemestreTemporadaDTO> ListSemestreTemporadaModelToListSemestreTemporadaDTO(List<SemestreTemporadaModel> listaSemestreTemporadaModel){

		List<SemestreTemporadaDTO> listaSemestreTemporadaDTO=new ArrayList<SemestreTemporadaDTO>();

		
		if(listaSemestreTemporadaModel == null || listaSemestreTemporadaModel.size()==0){
			return new ArrayList<SemestreTemporadaDTO>();
		}
		else{
			listaSemestreTemporadaDTO=new ArrayList<SemestreTemporadaDTO>();
			SemestreTemporadaDTO semestreTemporadaDTO=new SemestreTemporadaDTO();


			for(SemestreTemporadaModel aluEnt: listaSemestreTemporadaModel){
				semestreTemporadaDTO=new SemestreTemporadaDTO();

				semestreTemporadaDTO = SemestreTemporadaModelToSemestreTemporadaDTO(aluEnt);

				listaSemestreTemporadaDTO.add(semestreTemporadaDTO);
			}
		}

		return listaSemestreTemporadaDTO;
	}

}
