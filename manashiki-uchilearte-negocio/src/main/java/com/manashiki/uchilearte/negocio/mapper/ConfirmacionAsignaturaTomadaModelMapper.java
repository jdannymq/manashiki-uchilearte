package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ConfirmacionAsignaturaTomadaEntity;
import com.manashiki.uchilearte.negocio.model.ConfirmacionAsignaturaTomadaModel;

import vijnana.utilidades.component.utilidades.DateMapper;


public class ConfirmacionAsignaturaTomadaModelMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static ConfirmacionAsignaturaTomadaEntity ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaEntity(ConfirmacionAsignaturaTomadaModel confirmacionProgramaTomadoModel){

		ConfirmacionAsignaturaTomadaEntity confirmacionProgramaTomadoEntity=new ConfirmacionAsignaturaTomadaEntity();

		if(confirmacionProgramaTomadoModel==null){
			return new ConfirmacionAsignaturaTomadaEntity();
		}
		else{
			confirmacionProgramaTomadoEntity.setIdConfirmacionAsignaturaTomada(confirmacionProgramaTomadoModel.getIdConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoEntity.setListaFkIdProgramaActivoSemestreAsignaturaTomada(confirmacionProgramaTomadoModel.getListaProgramaActivoSemestreAsignaturaTomada());
			
			confirmacionProgramaTomadoEntity.setFechaConfirmacionAsignaturaTomada(DateMapper.DateUtilToTimestamp(confirmacionProgramaTomadoModel.getFechaConfirmacionAsignaturaTomada()));
			
			confirmacionProgramaTomadoEntity.setDescripcionConfirmacionAsignaturaTomada(confirmacionProgramaTomadoModel.getDescripcionConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoEntity.setEstadoConfirmacionAsignaturaTomada(confirmacionProgramaTomadoModel.getEstadoConfirmacionAsignaturaTomada());
			
		}
		return confirmacionProgramaTomadoEntity;
	}

	public static List<ConfirmacionAsignaturaTomadaEntity> ListConfirmacionAsignaturaTomadaModelToListConfirmacionAsignaturaTomadaEntity(List<ConfirmacionAsignaturaTomadaModel> listaConfirmacionAsignaturaTomadaModel){

		List<ConfirmacionAsignaturaTomadaEntity> listaConfirmacionAsignaturaTomada=new ArrayList<ConfirmacionAsignaturaTomadaEntity>();

		if(listaConfirmacionAsignaturaTomadaModel==null || listaConfirmacionAsignaturaTomadaModel.size()==0){
			return new ArrayList<ConfirmacionAsignaturaTomadaEntity>();
		}
		else{
			listaConfirmacionAsignaturaTomada=new ArrayList<ConfirmacionAsignaturaTomadaEntity>();
			ConfirmacionAsignaturaTomadaEntity confirmacionProgramaTomadoEntity=new ConfirmacionAsignaturaTomadaEntity();
			
			for(ConfirmacionAsignaturaTomadaModel aluMod: listaConfirmacionAsignaturaTomadaModel){
				confirmacionProgramaTomadoEntity = new ConfirmacionAsignaturaTomadaEntity();
				
				confirmacionProgramaTomadoEntity = ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaEntity(aluMod);

				listaConfirmacionAsignaturaTomada.add(confirmacionProgramaTomadoEntity);
			}
		}

		return listaConfirmacionAsignaturaTomada;
	}

	public static ConfirmacionAsignaturaTomadaModel ConfirmacionAsignaturaTomadaEntityToConfirmacionAsignaturaTomadaModel(ConfirmacionAsignaturaTomadaEntity confirmacionProgramaTomadoEntity){

		ConfirmacionAsignaturaTomadaModel confirmacionProgramaTomadoModel=new ConfirmacionAsignaturaTomadaModel();

		if(confirmacionProgramaTomadoEntity==null){
			return new ConfirmacionAsignaturaTomadaModel();
		}
		else{
			
			confirmacionProgramaTomadoModel.setIdConfirmacionAsignaturaTomada(confirmacionProgramaTomadoEntity.getIdConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoModel.setListaProgramaActivoSemestreAsignaturaTomada(confirmacionProgramaTomadoEntity.getListaFkIdProgramaActivoSemestreAsignaturaTomada());
			
			confirmacionProgramaTomadoModel.setFechaConfirmacionAsignaturaTomada(DateMapper.TimestampToDateUtil(confirmacionProgramaTomadoEntity.getFechaConfirmacionAsignaturaTomada()));
			
			confirmacionProgramaTomadoModel.setDescripcionConfirmacionAsignaturaTomada(confirmacionProgramaTomadoEntity.getDescripcionConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoModel.setEstadoConfirmacionAsignaturaTomada(confirmacionProgramaTomadoEntity.getEstadoConfirmacionAsignaturaTomada());
		}
		return confirmacionProgramaTomadoModel;
	}

	public static List<ConfirmacionAsignaturaTomadaModel> ListConfirmacionAsignaturaTomadaEntityToListConfirmacionAsignaturaTomadaModel(List<ConfirmacionAsignaturaTomadaEntity> listaConfirmacionAsignaturaTomadaEntity){

		List<ConfirmacionAsignaturaTomadaModel> listaConfirmacionAsignaturaTomadaModel=new ArrayList<ConfirmacionAsignaturaTomadaModel>();

		
		if(listaConfirmacionAsignaturaTomadaEntity == null || listaConfirmacionAsignaturaTomadaEntity.size()==0){
			return new ArrayList<ConfirmacionAsignaturaTomadaModel>();
		}
		else{
			listaConfirmacionAsignaturaTomadaModel=new ArrayList<ConfirmacionAsignaturaTomadaModel>();
			ConfirmacionAsignaturaTomadaModel confirmacionProgramaTomadoModel=new ConfirmacionAsignaturaTomadaModel();


			for(ConfirmacionAsignaturaTomadaEntity aluEnt: listaConfirmacionAsignaturaTomadaEntity){
				confirmacionProgramaTomadoModel=new ConfirmacionAsignaturaTomadaModel();

				confirmacionProgramaTomadoModel = ConfirmacionAsignaturaTomadaEntityToConfirmacionAsignaturaTomadaModel(aluEnt);

				listaConfirmacionAsignaturaTomadaModel.add(confirmacionProgramaTomadoModel);
			}
		}

		return listaConfirmacionAsignaturaTomadaModel;
	}

}
