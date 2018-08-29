package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.TipoSolicitudModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;


public class TipoSolicitudDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static TipoSolicitudModel TipoSolicitudDTOToTipoSolicitudModel(TipoSolicitudDTO tipoSolicitudDTO){

		TipoSolicitudModel tipoSolicitud=new TipoSolicitudModel();
		if(tipoSolicitudDTO==null){
			return new TipoSolicitudModel();
		}
		else{
			tipoSolicitud.setIdTipoSolicitud(tipoSolicitudDTO.getIdTipoSolicitud());
			tipoSolicitud.setCodigoTipoSolicitud(tipoSolicitudDTO.getCodigoTipoSolicitud());
			tipoSolicitud.setNombreTipoSolicitud(tipoSolicitudDTO.getNombreTipoSolicitud());
		}
		
		return tipoSolicitud;
	}

	public static List<TipoSolicitudModel> ListTipoSolicitudDTOToListTipoSolicitudModel(List<TipoSolicitudDTO> listaTipoSolicitudDTO){

		List<TipoSolicitudModel> listaTipoSolicitudModel=new ArrayList<TipoSolicitudModel>();

		if(listaTipoSolicitudDTO==null || listaTipoSolicitudDTO.size()==0){
			return new ArrayList<TipoSolicitudModel>();
		}
		else{
			listaTipoSolicitudModel=new ArrayList<TipoSolicitudModel>();
			
			TipoSolicitudModel tipoSolicitudModel=new TipoSolicitudModel();

			for(TipoSolicitudDTO tipSolDTO: listaTipoSolicitudDTO){
				tipoSolicitudModel=new TipoSolicitudModel();
				
				tipoSolicitudModel = TipoSolicitudDTOToTipoSolicitudModel(tipSolDTO);

				listaTipoSolicitudModel.add(tipoSolicitudModel);
			}
		}

		return listaTipoSolicitudModel;
	}

	public static TipoSolicitudDTO TipoSolicitudModelToTipoSolicitudDTO(TipoSolicitudModel tipoSolicitudModel){

		TipoSolicitudDTO tipoSolicitudDTO=new TipoSolicitudDTO();
		if(tipoSolicitudModel==null){
			return new TipoSolicitudDTO();
		}
		else{
			tipoSolicitudDTO.setIdTipoSolicitud(tipoSolicitudModel.getIdTipoSolicitud());
			tipoSolicitudDTO.setCodigoTipoSolicitud(tipoSolicitudModel.getCodigoTipoSolicitud());
			tipoSolicitudDTO.setNombreTipoSolicitud(tipoSolicitudModel.getNombreTipoSolicitud());
		}
		return tipoSolicitudDTO;
	}

	public static List<TipoSolicitudDTO> ListTipoSolicitudModelToListTipoSolicitudDTO(List<TipoSolicitudModel> listaTipoSolicitudModel){

		List<TipoSolicitudDTO> listaTipoSolicitudDTO=new ArrayList<TipoSolicitudDTO>();

		if(listaTipoSolicitudModel==null || listaTipoSolicitudModel.size()==0){
			return new ArrayList<TipoSolicitudDTO>();
		}
		else{
			listaTipoSolicitudDTO=new ArrayList<TipoSolicitudDTO>();
			
			TipoSolicitudDTO tipoSolicitudDTO=new TipoSolicitudDTO();

			for(TipoSolicitudModel tipSolMod: listaTipoSolicitudModel){
				tipoSolicitudDTO=new TipoSolicitudDTO();
				
				tipoSolicitudDTO = TipoSolicitudModelToTipoSolicitudDTO(tipSolMod);

				listaTipoSolicitudDTO.add(tipoSolicitudDTO);
			}
		}
		return listaTipoSolicitudDTO;
	}
}
