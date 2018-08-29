package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.ConfirmacionAsignaturaTomadaModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ConfirmacionAsignaturaTomadaDTO;

import vijnana.utilidades.component.utilidades.DateMapper;


public class ConfirmacionAsignaturaTomadaDTOMapper {
	
	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static ConfirmacionAsignaturaTomadaModel ConfirmacionAsignaturaTomadaDTOToConfirmacionAsignaturaTomadaModel(ConfirmacionAsignaturaTomadaDTO confirmacionProgramaTomadoDTO){

		ConfirmacionAsignaturaTomadaModel confirmacionProgramaTomadoModel=new ConfirmacionAsignaturaTomadaModel();

		if(confirmacionProgramaTomadoDTO==null){
			return new ConfirmacionAsignaturaTomadaModel();
		}
		else{
			confirmacionProgramaTomadoModel.setIdConfirmacionAsignaturaTomada(confirmacionProgramaTomadoDTO.getIdConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoModel.setListaProgramaActivoSemestreAsignaturaTomada(confirmacionProgramaTomadoDTO.getListaProgramaActivoSemestreAsignaturaTomada());
			
			confirmacionProgramaTomadoModel.setFechaConfirmacionAsignaturaTomada(DateMapper.DateUtilToTimestamp(confirmacionProgramaTomadoDTO.getFechaConfirmacionAsignaturaTomada()));
			
			confirmacionProgramaTomadoModel.setDescripcionConfirmacionAsignaturaTomada(confirmacionProgramaTomadoDTO.getDescripcionConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoModel.setEstadoConfirmacionAsignaturaTomada(confirmacionProgramaTomadoDTO.getEstadoConfirmacionAsignaturaTomada());
			
		}
		return confirmacionProgramaTomadoModel;
	}

	public static List<ConfirmacionAsignaturaTomadaModel> ListConfirmacionAsignaturaTomadaDTOToListConfirmacionAsignaturaTomadaModel(List<ConfirmacionAsignaturaTomadaDTO> listaConfirmacionAsignaturaTomadaDTO){

		List<ConfirmacionAsignaturaTomadaModel> listaConfirmacionAsignaturaTomada=new ArrayList<ConfirmacionAsignaturaTomadaModel>();

		if(listaConfirmacionAsignaturaTomadaDTO==null || listaConfirmacionAsignaturaTomadaDTO.size()==0){
			return new ArrayList<ConfirmacionAsignaturaTomadaModel>();
		}
		else{
			listaConfirmacionAsignaturaTomada=new ArrayList<ConfirmacionAsignaturaTomadaModel>();
			ConfirmacionAsignaturaTomadaModel confirmacionProgramaTomadoModel=new ConfirmacionAsignaturaTomadaModel();
			
			for(ConfirmacionAsignaturaTomadaDTO aluMod: listaConfirmacionAsignaturaTomadaDTO){
				confirmacionProgramaTomadoModel = new ConfirmacionAsignaturaTomadaModel();
				
				confirmacionProgramaTomadoModel = ConfirmacionAsignaturaTomadaDTOToConfirmacionAsignaturaTomadaModel(aluMod);

				listaConfirmacionAsignaturaTomada.add(confirmacionProgramaTomadoModel);
			}
		}

		return listaConfirmacionAsignaturaTomada;
	}

	public static ConfirmacionAsignaturaTomadaDTO ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaDTO(ConfirmacionAsignaturaTomadaModel confirmacionProgramaTomadoModel){

		ConfirmacionAsignaturaTomadaDTO confirmacionProgramaTomadoDTO=new ConfirmacionAsignaturaTomadaDTO();

		if(confirmacionProgramaTomadoModel==null){
			return new ConfirmacionAsignaturaTomadaDTO();
		}
		else{
			
			confirmacionProgramaTomadoDTO.setIdConfirmacionAsignaturaTomada(confirmacionProgramaTomadoModel.getIdConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoDTO.setListaProgramaActivoSemestreAsignaturaTomada(confirmacionProgramaTomadoModel.getListaProgramaActivoSemestreAsignaturaTomada());
			
			confirmacionProgramaTomadoDTO.setFechaConfirmacionAsignaturaTomada(confirmacionProgramaTomadoModel.getFechaConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoDTO.setDescripcionConfirmacionAsignaturaTomada(confirmacionProgramaTomadoModel.getDescripcionConfirmacionAsignaturaTomada());
			
			confirmacionProgramaTomadoDTO.setEstadoConfirmacionAsignaturaTomada(confirmacionProgramaTomadoModel.getEstadoConfirmacionAsignaturaTomada());
		}
		return confirmacionProgramaTomadoDTO;
	}

	public static List<ConfirmacionAsignaturaTomadaDTO> ListConfirmacionAsignaturaTomadaModelToListConfirmacionAsignaturaTomadaDTO(List<ConfirmacionAsignaturaTomadaModel> listaConfirmacionAsignaturaTomadaModel){

		List<ConfirmacionAsignaturaTomadaDTO> listaConfirmacionAsignaturaTomadaDTO=new ArrayList<ConfirmacionAsignaturaTomadaDTO>();

		
		if(listaConfirmacionAsignaturaTomadaModel == null || listaConfirmacionAsignaturaTomadaModel.size()==0){
			return new ArrayList<ConfirmacionAsignaturaTomadaDTO>();
		}
		else{
			listaConfirmacionAsignaturaTomadaDTO=new ArrayList<ConfirmacionAsignaturaTomadaDTO>();
			ConfirmacionAsignaturaTomadaDTO confirmacionProgramaTomadoDTO=new ConfirmacionAsignaturaTomadaDTO();


			for(ConfirmacionAsignaturaTomadaModel aluEnt: listaConfirmacionAsignaturaTomadaModel){
				confirmacionProgramaTomadoDTO=new ConfirmacionAsignaturaTomadaDTO();

				confirmacionProgramaTomadoDTO = ConfirmacionAsignaturaTomadaModelToConfirmacionAsignaturaTomadaDTO(aluEnt);

				listaConfirmacionAsignaturaTomadaDTO.add(confirmacionProgramaTomadoDTO);
			}
		}

		return listaConfirmacionAsignaturaTomadaDTO;
	}

}
