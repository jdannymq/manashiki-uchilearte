package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;
import com.manashiki.uchilearte.negocio.model.TipoCertificadoModel;

public class TipoCertificadoModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static TipoCertificadoEntity TipoCertificadoModelToTipoCertificadoEntity(TipoCertificadoModel tipoCertificadoModel){

		TipoCertificadoEntity tipoCertificado=new TipoCertificadoEntity();
		if(tipoCertificadoModel==null){
			return new TipoCertificadoEntity();
		}
		else{
			tipoCertificado.setIdTipoCertificado(tipoCertificadoModel.getIdTipoCertificado());
			tipoCertificado.setCodigoTipoCertificado(tipoCertificadoModel.getCodigoTipoCertificado());
			tipoCertificado.setNombreTipoCertificado(tipoCertificadoModel.getNombreTipoCertificado());
		}
		
		return tipoCertificado;
	}

	public static List<TipoCertificadoEntity> ListTipoCertificadoModelToListTipoCertificadoEntity(List<TipoCertificadoModel> listaTipoCertificadoModel){

		List<TipoCertificadoEntity> listalistaTipoCertificadoEntity=new ArrayList<TipoCertificadoEntity>();

		if(listaTipoCertificadoModel==null || listaTipoCertificadoModel.size()==0){
			return new ArrayList<TipoCertificadoEntity>();
		}
		else{
			listalistaTipoCertificadoEntity=new ArrayList<TipoCertificadoEntity>();
			TipoCertificadoEntity tipoCertificadoEntity=new TipoCertificadoEntity();

			for(TipoCertificadoModel tipCerMod: listaTipoCertificadoModel){
				tipoCertificadoEntity=new TipoCertificadoEntity();
				
				tipoCertificadoEntity = TipoCertificadoModelToTipoCertificadoEntity(tipCerMod);

				listalistaTipoCertificadoEntity.add(tipoCertificadoEntity);
			}
		}

		return listalistaTipoCertificadoEntity;
	}

	public static TipoCertificadoModel TipoCertificadoEntityToTipoCertificadoModel(TipoCertificadoEntity tipoCertificado){

		TipoCertificadoModel tipoCertificadoModel=new TipoCertificadoModel();
		if(tipoCertificado==null){
			return new TipoCertificadoModel();
		}
		else{
			tipoCertificadoModel.setIdTipoCertificado(tipoCertificado.getIdTipoCertificado());
			tipoCertificadoModel.setCodigoTipoCertificado(tipoCertificado.getCodigoTipoCertificado());
			tipoCertificadoModel.setNombreTipoCertificado(tipoCertificado.getNombreTipoCertificado());
		}
		return tipoCertificadoModel;
	}

	public static List<TipoCertificadoModel> ListTipoCertificadoEntityToListTipoCertificadoModel(List<TipoCertificadoEntity> listaTipoCertificadoEntity){

		List<TipoCertificadoModel> listaTipoCertificadoModel=new ArrayList<TipoCertificadoModel>();

		if(listaTipoCertificadoEntity==null || listaTipoCertificadoEntity.size()==0){
			return new ArrayList<TipoCertificadoModel>();
		}
		else{
			listaTipoCertificadoModel=new ArrayList<TipoCertificadoModel>();
			TipoCertificadoModel tipoCertificadoModel=new TipoCertificadoModel();

			for(TipoCertificadoEntity tipCerEnt: listaTipoCertificadoEntity){
				tipoCertificadoModel=new TipoCertificadoModel();

				tipoCertificadoModel = TipoCertificadoEntityToTipoCertificadoModel(tipCerEnt);

				listaTipoCertificadoModel.add(tipoCertificadoModel);
			}
		}
		return listaTipoCertificadoModel;
	}
}
