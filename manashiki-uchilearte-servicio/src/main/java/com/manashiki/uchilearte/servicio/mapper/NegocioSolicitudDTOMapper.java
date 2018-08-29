package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.NegocioSolicitudModel;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;

import vijnana.utilidades.component.utilidades.DateMapper;

public class NegocioSolicitudDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static NegocioSolicitudModel NegocioSolicitudDTOToNegocioSolicitudModel(NegocioSolicitudDTO negocioSolicitudDTO){

		NegocioSolicitudModel negocioSolicitudModel=new NegocioSolicitudModel();
		if(negocioSolicitudDTO==null){
			return new NegocioSolicitudModel();
		}
		else{
			negocioSolicitudModel.setIdNegocioSolicitudModel(negocioSolicitudDTO.getIdNegocioSolicitudDTO());
			
			negocioSolicitudModel.setValorNegocioSolicitud(negocioSolicitudDTO.getValorNegocioSolicitud());
			
			negocioSolicitudModel.setKeyNegocioSolicitud(negocioSolicitudDTO.getKeyNegocioSolicitud());
			
			negocioSolicitudModel.setFechaInicialNegocioSolicitud(DateMapper.DateUtilToTimestamp(negocioSolicitudDTO.getFechaInicialNegocioSolicitud()));
			
			negocioSolicitudModel.setFechaVencimientoNegocioSolicitud(DateMapper.DateUtilToTimestamp(negocioSolicitudDTO.getFechaVencimientoNegocioSolicitud()));

		}
		
		return negocioSolicitudModel;
	}

	public static List<NegocioSolicitudModel> ListNegocioSolicitudDTOToListNegocioSolicitudModel(List<NegocioSolicitudDTO> listaNegocioSolicitudDTO){

		List<NegocioSolicitudModel> listaNegocioSolicitudModel=new ArrayList<NegocioSolicitudModel>();

		if(listaNegocioSolicitudDTO==null || listaNegocioSolicitudDTO.size()==0){
			return new ArrayList<NegocioSolicitudModel>();
		}
		else{
			listaNegocioSolicitudModel=new ArrayList<NegocioSolicitudModel>();
			NegocioSolicitudModel negocioSolicitud=new NegocioSolicitudModel();

			for(NegocioSolicitudDTO proUniMod: listaNegocioSolicitudDTO){
				negocioSolicitud = new NegocioSolicitudModel();
				
				negocioSolicitud = NegocioSolicitudDTOToNegocioSolicitudModel(proUniMod);
				
				listaNegocioSolicitudModel.add(negocioSolicitud);
			}
		}

		return listaNegocioSolicitudModel;
	}

	public static NegocioSolicitudDTO NegocioSolicitudModelToNegocioSolicitudDTO(NegocioSolicitudModel negocioSolicitudModel){

		NegocioSolicitudDTO negocioSolicitudDTO=new NegocioSolicitudDTO();
		
		if(negocioSolicitudModel==null){
			return new NegocioSolicitudDTO();
		}
		else{
			negocioSolicitudDTO.setIdNegocioSolicitudDTO(negocioSolicitudModel.getIdNegocioSolicitudModel());
			
			negocioSolicitudDTO.setValorNegocioSolicitud(negocioSolicitudModel.getValorNegocioSolicitud());
			
			negocioSolicitudDTO.setKeyNegocioSolicitud(negocioSolicitudModel.getKeyNegocioSolicitud());
			
			negocioSolicitudDTO.setFechaInicialNegocioSolicitud(negocioSolicitudModel.getFechaInicialNegocioSolicitud());
			
			negocioSolicitudDTO.setFechaVencimientoNegocioSolicitud(negocioSolicitudModel.getFechaVencimientoNegocioSolicitud());
		}
		return negocioSolicitudDTO;
	}

	public static List<NegocioSolicitudDTO> ListNegocioSolicitudModelToListNegocioSolicitudDTO(List<NegocioSolicitudModel> listaNegocioSolicitudModel){

		List<NegocioSolicitudDTO> listaNegocioSolicitudDTO=new ArrayList<NegocioSolicitudDTO>();

		if(listaNegocioSolicitudModel==null || listaNegocioSolicitudModel.size()==0){
			return new ArrayList<NegocioSolicitudDTO>();
		}
		else{
			listaNegocioSolicitudDTO=new ArrayList<NegocioSolicitudDTO>();
			NegocioSolicitudDTO negocioSolicitudDTO=new NegocioSolicitudDTO();

			for(NegocioSolicitudModel proUniEnt: listaNegocioSolicitudModel){
				negocioSolicitudDTO=new NegocioSolicitudDTO();
				
				negocioSolicitudDTO = NegocioSolicitudModelToNegocioSolicitudDTO(proUniEnt);
				
				listaNegocioSolicitudDTO.add(negocioSolicitudDTO);
			}
		}
		return listaNegocioSolicitudDTO;
	}
}
