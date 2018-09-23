package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.TipoCertificadoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;


public class TipoCertificadoDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static TipoCertificadoModel TipoCertificadoDTOToTipoCertificadoModel(TipoCertificadoDTO tipoCertificadoDTO){

		TipoCertificadoModel tipoCertificado=new TipoCertificadoModel();
		if(tipoCertificadoDTO==null){
			return new TipoCertificadoModel();
		}
		else{
			tipoCertificado.setIdTipoCertificado(tipoCertificadoDTO.getIdTipoCertificado());
			tipoCertificado.setCodigoTipoCertificado(tipoCertificadoDTO.getCodigoTipoCertificado());
			tipoCertificado.setNombreTipoCertificado(tipoCertificadoDTO.getNombreTipoCertificado());
		}
		
		return tipoCertificado;
	}

	public static List<TipoCertificadoModel> ListTipoCertificadoDTOToListTipoCertificadoModel(List<TipoCertificadoDTO> listaTipoCertificadoDTO){

		List<TipoCertificadoModel> listaTipoCertificado=new ArrayList<TipoCertificadoModel>();

		if(listaTipoCertificadoDTO==null || listaTipoCertificadoDTO.size()==0){
			return new ArrayList<TipoCertificadoModel>();
		}
		else{
			listaTipoCertificado=new ArrayList<TipoCertificadoModel>();
			TipoCertificadoModel tipoCertificadoModel=new TipoCertificadoModel();

			for(TipoCertificadoDTO tipCerDTO: listaTipoCertificadoDTO){
				tipoCertificadoModel=new TipoCertificadoModel();
				
				tipoCertificadoModel = TipoCertificadoDTOToTipoCertificadoModel(tipCerDTO);

				listaTipoCertificado.add(tipoCertificadoModel);
			}
		}

		return listaTipoCertificado;
	}

	public static TipoCertificadoDTO TipoCertificadoModelToTipoCertificadoDTO(TipoCertificadoModel tipoCertificadoModel){

		TipoCertificadoDTO tipoCertificadoDTO=new TipoCertificadoDTO();
		if(tipoCertificadoModel==null){
			return new TipoCertificadoDTO();
		}
		else{
			tipoCertificadoDTO.setIdTipoCertificado(tipoCertificadoModel.getIdTipoCertificado());
			tipoCertificadoDTO.setCodigoTipoCertificado(tipoCertificadoModel.getCodigoTipoCertificado());
			tipoCertificadoDTO.setNombreTipoCertificado(tipoCertificadoModel.getNombreTipoCertificado());
		}
		return tipoCertificadoDTO;
	}

	public static List<TipoCertificadoDTO> ListTipoCertificadoModelToListTipoCertificadoDTO(List<TipoCertificadoModel> listaTipoCertificadoModel){

		List<TipoCertificadoDTO> listaTipoCertificadoDTO=new ArrayList<TipoCertificadoDTO>();

		if(listaTipoCertificadoModel==null || listaTipoCertificadoModel.size()==0){
			return new ArrayList<TipoCertificadoDTO>();
		}
		else{
			listaTipoCertificadoDTO=new ArrayList<TipoCertificadoDTO>();
			TipoCertificadoDTO tipoCertificadoDTO=new TipoCertificadoDTO();

			for(TipoCertificadoModel tipCerMod: listaTipoCertificadoModel){
				tipoCertificadoDTO=new TipoCertificadoDTO();
				
				tipoCertificadoDTO = TipoCertificadoModelToTipoCertificadoDTO(tipCerMod);

				listaTipoCertificadoDTO.add(tipoCertificadoDTO);
			}
		}
		return listaTipoCertificadoDTO;
	}
}
