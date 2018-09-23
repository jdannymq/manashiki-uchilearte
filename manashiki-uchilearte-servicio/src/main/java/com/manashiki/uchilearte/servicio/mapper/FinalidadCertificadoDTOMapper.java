package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.FinalidadCertificadoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;

public class FinalidadCertificadoDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static FinalidadCertificadoModel FinalidadCertificadoDTOToFinalidadCertificadoModel(FinalidadCertificadoDTO finalidadCertificadoDTO){

		FinalidadCertificadoModel finalidadCertificado=new FinalidadCertificadoModel();
		if(finalidadCertificadoDTO==null){
			return new FinalidadCertificadoModel();
		}
		else{
			finalidadCertificado.setIdFinalidadCertificado(finalidadCertificadoDTO.getIdFinalidadCertificado());
			finalidadCertificado.setCodigoFinalidadCertificado(finalidadCertificadoDTO.getCodigoFinalidadCertificado());
			finalidadCertificado.setNombreFinalidadCertificado(finalidadCertificadoDTO.getNombreFinalidadCertificado());
			
		}
		
		return finalidadCertificado;
	}

	public static List<FinalidadCertificadoModel> ListFinalidadCertificadoDTOToListFinalidadCertificadoModel(List<FinalidadCertificadoDTO> listaFinalidadCertificadoDTO){

		List<FinalidadCertificadoModel> listaFinalidadCertificadoModel=new ArrayList<FinalidadCertificadoModel>();

		if(listaFinalidadCertificadoDTO==null || listaFinalidadCertificadoDTO.size()==0){
			return new ArrayList<FinalidadCertificadoModel>();
		}
		else{
			listaFinalidadCertificadoModel=new ArrayList<FinalidadCertificadoModel>();
			
			FinalidadCertificadoModel finalidadCertificadoModel = new FinalidadCertificadoModel();

			for(FinalidadCertificadoDTO finCerDTO: listaFinalidadCertificadoDTO){
				finalidadCertificadoModel=new FinalidadCertificadoModel();
				
				finalidadCertificadoModel = FinalidadCertificadoDTOToFinalidadCertificadoModel(finCerDTO);

				listaFinalidadCertificadoModel.add(finalidadCertificadoModel);
			}
		}

		return listaFinalidadCertificadoModel;
	}

	public static FinalidadCertificadoDTO FinalidadCertificadoModelToFinalidadCertificadoDTO(FinalidadCertificadoModel finalidadCertificado){

		FinalidadCertificadoDTO finalidadCertificadoDTO=new FinalidadCertificadoDTO();
		
		if(finalidadCertificado==null){
			return new FinalidadCertificadoDTO();
		}
		else{
			finalidadCertificadoDTO.setIdFinalidadCertificado(finalidadCertificado.getIdFinalidadCertificado());
			finalidadCertificadoDTO.setCodigoFinalidadCertificado(finalidadCertificado.getCodigoFinalidadCertificado());
			finalidadCertificadoDTO.setNombreFinalidadCertificado(finalidadCertificado.getNombreFinalidadCertificado());
		}
		return finalidadCertificadoDTO;
	}

	public static List<FinalidadCertificadoDTO> ListFinalidadCertificadoModelToListFinalidadCertificadoDTO(List<FinalidadCertificadoModel> listaFinalidadCertificadoModel){

		List<FinalidadCertificadoDTO> listaFinalidadCertificadoDTO=new ArrayList<FinalidadCertificadoDTO>();

		if(listaFinalidadCertificadoModel==null || listaFinalidadCertificadoModel.size()==0){
			return new ArrayList<FinalidadCertificadoDTO>();
		}
		else{
			listaFinalidadCertificadoDTO=new ArrayList<FinalidadCertificadoDTO>();
			
			FinalidadCertificadoDTO finalidadCertificadoDTO=new FinalidadCertificadoDTO();

			for(FinalidadCertificadoModel finCerMod: listaFinalidadCertificadoModel){
				finalidadCertificadoDTO=new FinalidadCertificadoDTO();
				
				finalidadCertificadoDTO = FinalidadCertificadoModelToFinalidadCertificadoDTO(finCerMod);

				listaFinalidadCertificadoDTO.add(finalidadCertificadoDTO);
			}
		}
		return listaFinalidadCertificadoDTO;
	}
}
