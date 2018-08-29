package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.RegionModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;

public class RegionDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static RegionModel RegionDTOToRegionModel(RegionDTO regionDTO){

		RegionModel region=new RegionModel();
		if(regionDTO==null){
			return new RegionModel();
		}
		else{
			region.setIdRegion(regionDTO.getIdRegion());
			region.setCodigoRegion(regionDTO.getCodigoRegion());
			region.setNombreRegion(regionDTO.getNombreRegion());
			region.setNombreRegionLower(regionDTO.getNombreRegionLower());
			region.setDescripcionRegion(regionDTO.getDescripcionRegion());
			
		}
		
		return region;
	}

	public static List<RegionModel> ListRegionDTOToListRegionModel(List<RegionDTO> listaRegionDTO){

		List<RegionModel> listaRegionModel=new ArrayList<RegionModel>();

		if(listaRegionDTO==null || listaRegionDTO.size()==0){
			return new ArrayList<RegionModel>();
		}
		else{
			listaRegionModel=new ArrayList<RegionModel>();
			
			RegionModel regionModel=new RegionModel();

			for(RegionDTO regDTO: listaRegionDTO){
				regionModel=new RegionModel();
				
				regionModel = RegionDTOToRegionModel(regDTO);

				listaRegionModel.add(regionModel);
			}
		}

		return listaRegionModel;
	}

	public static RegionDTO RegionModelToRegionDTO(RegionModel regionModel){

		RegionDTO regionDTO=new RegionDTO();
		if(regionModel==null){
			return new RegionDTO();
		}
		else{
			regionDTO.setIdRegion(regionModel.getIdRegion());
			regionDTO.setCodigoRegion(regionModel.getCodigoRegion());
			regionDTO.setNombreRegion(regionModel.getNombreRegion());
			regionDTO.setNombreRegionLower(regionModel.getNombreRegionLower());
			regionDTO.setDescripcionRegion(regionModel.getDescripcionRegion());
		}
		return regionDTO;
	}

	public static List<RegionDTO> ListRegionModelToListRegionDTO(List<RegionModel> listaRegionModel){

		List<RegionDTO> listaRegionDTO=new ArrayList<RegionDTO>();

		if(listaRegionModel==null || listaRegionModel.size()==0){
			return new ArrayList<RegionDTO>();
		}
		else{
			listaRegionDTO=new ArrayList<RegionDTO>();
			RegionDTO regionDTO=new RegionDTO();

			for(RegionModel regMod: listaRegionModel){
				regionDTO=new RegionDTO();
				
				regionDTO = RegionModelToRegionDTO(regMod);

				listaRegionDTO.add(regionDTO);
			}
		}
		return listaRegionDTO;
	}
}
