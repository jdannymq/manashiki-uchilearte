package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.LogReservaModel;
import com.manashiki.uchilearte.servdto.transaccion.LogReservaDTO;

import vijnana.utilidades.component.utilidades.DateMapper;

public class LogReservaDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static LogReservaModel LogReservaDTOToLogReservaModel(LogReservaDTO logReservaDTO){

		LogReservaModel logReservaModel=new LogReservaModel();
		if(logReservaDTO==null){
			return new LogReservaModel();
		}
		else{
			logReservaModel.setIdLogReservaModel(logReservaDTO.getIdLogReservaDTO());
			
			logReservaModel.setIdSolicitudCertificado(logReservaDTO.getIdSolicitudCertificado());
			
			logReservaModel.setIdSolicitudAcademica(logReservaDTO.getIdSolicitudAcademica());
			
			logReservaModel.setIdSolicitudPostulacion(logReservaDTO.getIdSolicitudPostulacion());

			logReservaModel.setFechaInicialLogReserva(DateMapper.DateUtilToTimestamp(logReservaDTO.getFechaInicialLogReserva()));
			
			logReservaModel.setFechaConfirmacionLogReserva(DateMapper.DateUtilToTimestamp(logReservaDTO.getFechaConfirmacionLogReserva()));
			
			logReservaModel.setTipoCompra(logReservaDTO.getTipoCompra());
			
			logReservaModel.setMedioPago(logReservaDTO.getMedioPago());

			logReservaModel.setValorPagado(logReservaDTO.getValorPagado());
			
			logReservaModel.setCorreoConfirmacionEnviado(logReservaDTO.isCorreoConfirmacionEnviado());
		}
		
		return logReservaModel;
	}

	public static List<LogReservaModel> ListLogReservaDTOToListLogReservaModel(List<LogReservaDTO> listaLogReservaDTO){

		List<LogReservaModel> listaLogReservaModel=new ArrayList<LogReservaModel>();

		if(listaLogReservaDTO==null || listaLogReservaDTO.size()==0){
			return new ArrayList<LogReservaModel>();
		}
		else{
			listaLogReservaModel=new ArrayList<LogReservaModel>();
			LogReservaModel logReserva=new LogReservaModel();

			for(LogReservaDTO proUniMod: listaLogReservaDTO){
				logReserva = new LogReservaModel();
				
				logReserva = LogReservaDTOToLogReservaModel(proUniMod);
				
				listaLogReservaModel.add(logReserva);
			}
		}

		return listaLogReservaModel;
	}

	public static LogReservaDTO LogReservaModelToLogReservaDTO(LogReservaModel logReservaModel){

		LogReservaDTO logReservaDTO=new LogReservaDTO();
		
		if(logReservaModel==null){
			return new LogReservaDTO();
		}
		else{
			logReservaDTO.setIdLogReservaDTO(logReservaModel.getIdLogReservaModel());
			
			if(logReservaModel.getIdSolicitudCertificado()!=null){
				logReservaDTO.setIdSolicitudCertificado(logReservaModel.getIdSolicitudCertificado());
			}
			
			if(logReservaModel.getIdSolicitudAcademica()!=null ){
				logReservaDTO.setIdSolicitudAcademica(logReservaModel.getIdSolicitudAcademica());
			}
			
			if(logReservaModel.getIdSolicitudPostulacion()!=null ){
				logReservaDTO.setIdSolicitudPostulacion(logReservaModel.getIdSolicitudPostulacion());
			}
			
			logReservaDTO.setFechaInicialLogReserva(logReservaModel.getFechaInicialLogReserva());
			
			logReservaDTO.setFechaConfirmacionLogReserva(logReservaModel.getFechaConfirmacionLogReserva());
			
			logReservaDTO.setTipoCompra(logReservaModel.getTipoCompra());
			
			logReservaDTO.setMedioPago(logReservaModel.getMedioPago());
			
			logReservaDTO.setValorPagado(logReservaModel.getValorPagado());
			
			logReservaDTO.setCorreoConfirmacionEnviado(logReservaModel.getCorreoConfirmacionEnviado());
		}
		return logReservaDTO;
	}

	public static List<LogReservaDTO> ListLogReservaModelToListLogReservaDTO(List<LogReservaModel> listaLogReservaModel){

		List<LogReservaDTO> listaLogReservaDTO=new ArrayList<LogReservaDTO>();

		if(listaLogReservaModel==null || listaLogReservaModel.size()==0){
			return new ArrayList<LogReservaDTO>();
		}
		else{
			listaLogReservaDTO=new ArrayList<LogReservaDTO>();
			LogReservaDTO logReservaDTO=new LogReservaDTO();

			for(LogReservaModel proUniEnt: listaLogReservaModel){
				logReservaDTO=new LogReservaDTO();
				
				logReservaDTO = LogReservaModelToLogReservaDTO(proUniEnt);
				
				listaLogReservaDTO.add(logReservaDTO);
			}
		}
		return listaLogReservaDTO;
	}
}
