package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ComunaEntity;
import com.manashiki.uchilearte.logica.entidad.RegionEntity;
import com.manashiki.uchilearte.negocio.model.ComunaModel;

public class ComunaModelMapper{


	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static ComunaEntity ComunaModelToComunaEntity(ComunaModel comunaModel){

		ComunaEntity comuna=new ComunaEntity();

		if(comunaModel==null){
			return new ComunaEntity();
		}
		else{
			comuna.setIdComuna(comunaModel.getIdComuna());
			comuna.setCodigoComuna(comunaModel.getCodigoComuna());
			comuna.setNombreComuna(comunaModel.getNombreComuna());
			comuna.setNombreComunaLower(comunaModel.getNombreComunaLower());
			
			RegionEntity region=new RegionEntity();
			region.setIdRegion(comunaModel.getIdRegion());
			comuna.setFkIdRegion(region);

		}
		return comuna;
	}

	public static List<ComunaEntity> ListComunaModelToListComunaEntity(List<ComunaModel> listaComunaModel){

		List<ComunaEntity> listaComunaEntity=new ArrayList<ComunaEntity>();

		if(listaComunaModel == null || listaComunaModel.size()==0){
			return new ArrayList<ComunaEntity>();
		}
		else{
			listaComunaEntity=new ArrayList<ComunaEntity>();
			
			ComunaEntity comunaEntity=new ComunaEntity();


			for(ComunaModel comMod: listaComunaModel){
				comunaEntity=new ComunaEntity();
				
				comunaEntity = ComunaModelToComunaEntity(comMod);

				listaComunaEntity.add(comunaEntity);
			}
		}

		return listaComunaEntity;
	}

	public static ComunaModel ComunaEntityToComunaModel(ComunaEntity comunaEntity){

		ComunaModel comunaModel=new ComunaModel();

		if(comunaEntity==null){
			return new ComunaModel();
		}
		else{
			comunaModel.setIdComuna(comunaEntity.getIdComuna());
			comunaModel.setCodigoComuna(comunaEntity.getCodigoComuna());
			comunaModel.setNombreComuna(comunaEntity.getNombreComuna());
			comunaModel.setNombreComunaLower(comunaEntity.getNombreComunaLower());
			if(comunaEntity!=null && comunaEntity.getFkIdRegion()!=null){
				comunaModel.setIdRegion(comunaEntity.getFkIdRegion().getIdRegion());
			}
		}
		return comunaModel;
	}

	public static List<ComunaModel> ListComunaEntityToListComunaModel(List<ComunaEntity> listaComunaEntity){

		List<ComunaModel> listaComunaModel=new ArrayList<ComunaModel>();

		if(listaComunaEntity == null || listaComunaEntity.size()==0){
			return new ArrayList<ComunaModel>();
		}
		else{
			listaComunaModel=new ArrayList<ComunaModel>();
			ComunaModel comunaModel=new ComunaModel();

			for(ComunaEntity com: listaComunaEntity){
				comunaModel=new ComunaModel();

				comunaModel = ComunaEntityToComunaModel(com);

				listaComunaModel.add(comunaModel);
			}
		}

		return listaComunaModel;
	}
}
