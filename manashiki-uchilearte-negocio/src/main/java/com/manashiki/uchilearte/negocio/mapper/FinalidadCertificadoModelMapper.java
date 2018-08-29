package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.FinalidadCertificadoEntity;
import com.manashiki.uchilearte.negocio.model.FinalidadCertificadoModel;

public class FinalidadCertificadoModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static FinalidadCertificadoEntity FinalidadCertificadoModelToFinalidadCertificadoEntity(FinalidadCertificadoModel finalidadCertificadoModel){

		FinalidadCertificadoEntity finalidadCertificado=new FinalidadCertificadoEntity();
		if(finalidadCertificadoModel==null){
			return new FinalidadCertificadoEntity();
		}
		else{
			finalidadCertificado.setIdFinalidadCertificado(finalidadCertificadoModel.getIdFinalidadCertificado());
			finalidadCertificado.setCodigoFinalidadCertificado(finalidadCertificadoModel.getCodigoFinalidadCertificado());
			finalidadCertificado.setNombreFinalidadCertificado(finalidadCertificadoModel.getNombreFinalidadCertificado());
			
		}
		
		return finalidadCertificado;
	}

	public static List<FinalidadCertificadoEntity> ListFinalidadCertificadoModelToListFinalidadCertificadoEntity(List<FinalidadCertificadoModel> listaFinalidadCertificadoModel){

		List<FinalidadCertificadoEntity> listaFinalidadCertificadoEntity=new ArrayList<FinalidadCertificadoEntity>();

		if(listaFinalidadCertificadoEntity==null || listaFinalidadCertificadoEntity.size()==0){
			return new ArrayList<FinalidadCertificadoEntity>();
		}
		else{
			listaFinalidadCertificadoEntity=new ArrayList<FinalidadCertificadoEntity>();
			
			FinalidadCertificadoEntity finalidadCertificadoEntity = new FinalidadCertificadoEntity();

			for(FinalidadCertificadoModel proUniMod: listaFinalidadCertificadoModel){
				finalidadCertificadoEntity=new FinalidadCertificadoEntity();
				
				finalidadCertificadoEntity = FinalidadCertificadoModelToFinalidadCertificadoEntity(proUniMod);

				listaFinalidadCertificadoEntity.add(finalidadCertificadoEntity);
			}
		}

		return listaFinalidadCertificadoEntity;
	}

	public static FinalidadCertificadoModel FinalidadCertificadoEntityToFinalidadCertificadoModel(FinalidadCertificadoEntity finalidadCertificado){

		FinalidadCertificadoModel finalidadCertificadoModel=new FinalidadCertificadoModel();
		if(finalidadCertificado==null){
			return new FinalidadCertificadoModel();
		}
		else{
			finalidadCertificadoModel.setIdFinalidadCertificado(finalidadCertificado.getIdFinalidadCertificado());
			finalidadCertificadoModel.setCodigoFinalidadCertificado(finalidadCertificado.getCodigoFinalidadCertificado());
			finalidadCertificadoModel.setNombreFinalidadCertificado(finalidadCertificado.getNombreFinalidadCertificado());
		}
		return finalidadCertificadoModel;
	}

	public static List<FinalidadCertificadoModel> ListFinalidadCertificadoEntityToListFinalidadCertificadoModel(List<FinalidadCertificadoEntity> listaFinalidadCertificadoEntity){

		List<FinalidadCertificadoModel> listaFinalidadCertificadoModel=new ArrayList<FinalidadCertificadoModel>();

		if(listaFinalidadCertificadoModel==null || listaFinalidadCertificadoModel.size()==0){
			return new ArrayList<FinalidadCertificadoModel>();
		}
		else{
			listaFinalidadCertificadoModel=new ArrayList<FinalidadCertificadoModel>();
			FinalidadCertificadoModel finalidadCertificadoModel=new FinalidadCertificadoModel();

			for(FinalidadCertificadoEntity finCerEnt: listaFinalidadCertificadoEntity){
				finalidadCertificadoModel=new FinalidadCertificadoModel();
				
				finalidadCertificadoModel = FinalidadCertificadoEntityToFinalidadCertificadoModel(finCerEnt);

				listaFinalidadCertificadoModel.add(finalidadCertificadoModel);
			}
		}
		return listaFinalidadCertificadoModel;
	}
}
