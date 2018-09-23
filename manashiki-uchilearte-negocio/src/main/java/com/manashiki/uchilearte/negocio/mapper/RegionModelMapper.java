package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.RegionEntity;
import com.manashiki.uchilearte.negocio.model.RegionModel;

public class RegionModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static RegionEntity RegionModelToRegionEntity(RegionModel regionModel){

		RegionEntity region=new RegionEntity();
		if(regionModel==null){
			return new RegionEntity();
		}
		else{
			region.setIdRegion(regionModel.getIdRegion());
			region.setCodigoRegion(regionModel.getCodigoRegion());
			region.setNombreRegion(regionModel.getNombreRegion());
			region.setNombreRegionLower(regionModel.getNombreRegionLower());
			region.setDescripcionRegion(regionModel.getDescripcionRegion());
			
		}
		
		return region;
	}

	public static List<RegionEntity> ListRegionModelToListRegionEntity(List<RegionModel> listaRegionModel){

		List<RegionEntity> listaRegionEntity=new ArrayList<RegionEntity>();

		if(listaRegionModel==null || listaRegionModel.size()==0){
			return new ArrayList<RegionEntity>();
		}
		else{
			listaRegionEntity=new ArrayList<RegionEntity>();
			
			RegionEntity region=new RegionEntity();

			for(RegionModel regMod: listaRegionModel){
				region=new RegionEntity();
				
				region = RegionModelToRegionEntity(regMod);

				listaRegionEntity.add(region);
			}
		}

		return listaRegionEntity;
	}

	public static RegionModel RegionEntityToRegionModel(RegionEntity regionEntity){

		RegionModel regionModel=new RegionModel();
		if(regionEntity==null){
			return new RegionModel();
		}
		else{
			regionModel.setIdRegion(regionEntity.getIdRegion());
			regionModel.setCodigoRegion(regionEntity.getCodigoRegion());
			regionModel.setNombreRegion(regionEntity.getNombreRegion());
			regionModel.setNombreRegionLower(regionEntity.getNombreRegionLower());
			regionModel.setDescripcionRegion(regionEntity.getDescripcionRegion());
		}
		return regionModel;
	}

	public static List<RegionModel> ListRegionEntityToListRegionModel(List<RegionEntity> listaRegionEntity){

		List<RegionModel> listaRegionModel=new ArrayList<RegionModel>();

		if(listaRegionEntity==null || listaRegionEntity.size()==0){
			return new ArrayList<RegionModel>();
		}
		else{
			listaRegionModel=new ArrayList<RegionModel>();
			
			RegionModel regionModel=new RegionModel();

			for(RegionEntity regEnt: listaRegionEntity){
				regionModel=new RegionModel();
				
				regionModel = RegionEntityToRegionModel(regEnt);

				listaRegionModel.add(regionModel);
			}
		}
		return listaRegionModel;
	}
}
