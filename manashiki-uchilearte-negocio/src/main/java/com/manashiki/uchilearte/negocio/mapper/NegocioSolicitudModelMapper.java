package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.NegocioSolicitudEntity;
import com.manashiki.uchilearte.negocio.model.NegocioSolicitudModel;

import vijnana.utilidades.component.utilidades.DateMapper;

public class NegocioSolicitudModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static NegocioSolicitudEntity NegocioSolicitudModelToNegocioSolicitudEntity(NegocioSolicitudModel negocioSolicitudModel){

		NegocioSolicitudEntity negocioSolicitudEntity=new NegocioSolicitudEntity();
		if(negocioSolicitudModel==null){
			return new NegocioSolicitudEntity();
		}
		else{
			negocioSolicitudEntity.setIdNegocioSolicitudEntity(negocioSolicitudModel.getIdNegocioSolicitudModel());
			
			negocioSolicitudEntity.setValorNegocioSolicitud(negocioSolicitudModel.getValorNegocioSolicitud());
			
			negocioSolicitudEntity.setKeyNegocioSolicitud(negocioSolicitudModel.getKeyNegocioSolicitud());
			
			negocioSolicitudEntity.setTipoNegocioSolicitud(negocioSolicitudModel.getTipoNegocioSolicitud());
			
			negocioSolicitudEntity.setFechaInicialNegocioSolicitud(DateMapper.DateUtilToTimestamp(negocioSolicitudModel.getFechaInicialNegocioSolicitud()));
			
			negocioSolicitudEntity.setFechaVencimientoNegocioSolicitud(DateMapper.DateUtilToTimestamp(negocioSolicitudModel.getFechaVencimientoNegocioSolicitud()));

		}
		
		return negocioSolicitudEntity;
	}

	public static List<NegocioSolicitudEntity> ListNegocioSolicitudModelToListNegocioSolicitudEntity(List<NegocioSolicitudModel> listaNegocioSolicitudModel){

		List<NegocioSolicitudEntity> listaNegocioSolicitudEntity=new ArrayList<NegocioSolicitudEntity>();

		if(listaNegocioSolicitudModel==null || listaNegocioSolicitudModel.size()==0){
			return new ArrayList<NegocioSolicitudEntity>();
		}
		else{
			listaNegocioSolicitudEntity=new ArrayList<NegocioSolicitudEntity>();
			NegocioSolicitudEntity negocioSolicitud=new NegocioSolicitudEntity();

			for(NegocioSolicitudModel proUniMod: listaNegocioSolicitudModel){
				negocioSolicitud = new NegocioSolicitudEntity();
				
				negocioSolicitud = NegocioSolicitudModelToNegocioSolicitudEntity(proUniMod);
				
				listaNegocioSolicitudEntity.add(negocioSolicitud);
			}
		}

		return listaNegocioSolicitudEntity;
	}

	public static NegocioSolicitudModel NegocioSolicitudEntityToNegocioSolicitudModel(NegocioSolicitudEntity negocioSolicitudEntity){

		NegocioSolicitudModel negocioSolicitudModel=new NegocioSolicitudModel();
		
		if(negocioSolicitudEntity==null){
			return new NegocioSolicitudModel();
		}
		else{
			negocioSolicitudModel.setIdNegocioSolicitudModel(negocioSolicitudEntity.getIdNegocioSolicitudEntity());
			
			negocioSolicitudModel.setValorNegocioSolicitud(negocioSolicitudEntity.getValorNegocioSolicitud());
			
			negocioSolicitudModel.setKeyNegocioSolicitud(negocioSolicitudEntity.getKeyNegocioSolicitud());
			
			negocioSolicitudModel.setTipoNegocioSolicitud(negocioSolicitudEntity.getTipoNegocioSolicitud());
			
			negocioSolicitudModel.setFechaInicialNegocioSolicitud(DateMapper.TimestampToDateUtil(negocioSolicitudEntity.getFechaInicialNegocioSolicitud()));
			
			negocioSolicitudModel.setFechaVencimientoNegocioSolicitud(DateMapper.TimestampToDateUtil(negocioSolicitudEntity.getFechaVencimientoNegocioSolicitud()));
		}
		return negocioSolicitudModel;
	}

	public static List<NegocioSolicitudModel> ListNegocioSolicitudEntityToListNegocioSolicitudModel(List<NegocioSolicitudEntity> listaNegocioSolicitudEntity){

		List<NegocioSolicitudModel> listaNegocioSolicitudModel=new ArrayList<NegocioSolicitudModel>();

		if(listaNegocioSolicitudEntity==null || listaNegocioSolicitudEntity.size()==0){
			return new ArrayList<NegocioSolicitudModel>();
		}
		else{
			listaNegocioSolicitudModel=new ArrayList<NegocioSolicitudModel>();
			NegocioSolicitudModel negocioSolicitudModel=new NegocioSolicitudModel();

			for(NegocioSolicitudEntity proUniEnt: listaNegocioSolicitudEntity){
				negocioSolicitudModel=new NegocioSolicitudModel();
				
				negocioSolicitudModel = NegocioSolicitudEntityToNegocioSolicitudModel(proUniEnt);
				
				listaNegocioSolicitudModel.add(negocioSolicitudModel);
			}
		}
		return listaNegocioSolicitudModel;
	}
}
