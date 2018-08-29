package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.SemestreTemporadaEntity;
import com.manashiki.uchilearte.negocio.model.SemestreTemporadaModel;


public class SemestreTemporadaModelMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static SemestreTemporadaEntity SemestreTemporadaModelToSemestreTemporadaEntity(SemestreTemporadaModel semestreTemporadaModel){

		SemestreTemporadaEntity semestreTemporadaEntity=new SemestreTemporadaEntity();

		if(semestreTemporadaModel==null){
			return new SemestreTemporadaEntity();
		}
		else{
			semestreTemporadaEntity.setIdSemestreTemporada(semestreTemporadaModel.getIdSemestreTemporada());
			semestreTemporadaEntity.setNombreSemestreTemporada(semestreTemporadaModel.getNombreSemestreTemporada());
			semestreTemporadaEntity.setDescripcionSemestreTemporada(semestreTemporadaModel.getDescripcionSemestreTemporada());
		}
		return semestreTemporadaEntity;
	}

	public static List<SemestreTemporadaEntity> ListSemestreTemporadaModelToListSemestreTemporadaEntity(List<SemestreTemporadaModel> listaSemestreTemporadaModel){

		List<SemestreTemporadaEntity> listaSemestreTemporada=new ArrayList<SemestreTemporadaEntity>();

		if(listaSemestreTemporadaModel==null || listaSemestreTemporadaModel.size()==0){
			return new ArrayList<SemestreTemporadaEntity>();
		}
		else{
			listaSemestreTemporada=new ArrayList<SemestreTemporadaEntity>();
			SemestreTemporadaEntity semestreTemporadaEntity=new SemestreTemporadaEntity();
			
			for(SemestreTemporadaModel aluMod: listaSemestreTemporadaModel){
				semestreTemporadaEntity = new SemestreTemporadaEntity();
				
				semestreTemporadaEntity = SemestreTemporadaModelToSemestreTemporadaEntity(aluMod);

				listaSemestreTemporada.add(semestreTemporadaEntity);
			}
		}

		return listaSemestreTemporada;
	}

	public static SemestreTemporadaModel SemestreTemporadaEntityToSemestreTemporadaModel(SemestreTemporadaEntity semestreTemporadaEntity){

		SemestreTemporadaModel semestreTemporadaModel=new SemestreTemporadaModel();

		if(semestreTemporadaEntity==null){
			return new SemestreTemporadaModel();
		}
		else{
			semestreTemporadaModel.setIdSemestreTemporada(semestreTemporadaEntity.getIdSemestreTemporada());
			semestreTemporadaModel.setNombreSemestreTemporada(semestreTemporadaEntity.getNombreSemestreTemporada());
			semestreTemporadaModel.setDescripcionSemestreTemporada(semestreTemporadaEntity.getDescripcionSemestreTemporada());
		}
		return semestreTemporadaModel;
	}

	public static List<SemestreTemporadaModel> ListSemestreTemporadaEntityToListSemestreTemporadaModel(List<SemestreTemporadaEntity> listaSemestreTemporadaEntity){

		List<SemestreTemporadaModel> listaSemestreTemporadaModel=new ArrayList<SemestreTemporadaModel>();

		
		if(listaSemestreTemporadaEntity == null || listaSemestreTemporadaEntity.size()==0){
			return new ArrayList<SemestreTemporadaModel>();
		}
		else{
			listaSemestreTemporadaModel=new ArrayList<SemestreTemporadaModel>();
			SemestreTemporadaModel semestreTemporadaModel=new SemestreTemporadaModel();


			for(SemestreTemporadaEntity aluEnt: listaSemestreTemporadaEntity){
				semestreTemporadaModel=new SemestreTemporadaModel();

				semestreTemporadaModel = SemestreTemporadaEntityToSemestreTemporadaModel(aluEnt);

				listaSemestreTemporadaModel.add(semestreTemporadaModel);
			}
		}

		return listaSemestreTemporadaModel;
	}

}
