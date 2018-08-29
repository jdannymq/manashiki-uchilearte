package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.LogReservaEntity;
import com.manashiki.uchilearte.logica.entidad.SolicitudAcademicaEntity;
import com.manashiki.uchilearte.logica.entidad.SolicitudCertificadoEntity;
import com.manashiki.uchilearte.logica.entidad.SolicitudPostulacionEntity;
import com.manashiki.uchilearte.negocio.model.LogReservaModel;

import vijnana.utilidades.component.utilidades.DateMapper;

public class LogReservaModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static LogReservaEntity LogReservaModelToLogReservaEntity(LogReservaModel logReservaModel){

		LogReservaEntity logReservaEntity=new LogReservaEntity();
		if(logReservaModel==null){
			return new LogReservaEntity();
		}
		else{
			logReservaEntity.setIdLogReservaEntity(logReservaModel.getIdLogReservaModel());
			
			if(logReservaModel.getIdSolicitudCertificado()!=null && logReservaModel.getIdSolicitudCertificado()>0){
				SolicitudCertificadoEntity solicitudCertificadoEntity = new SolicitudCertificadoEntity();
				solicitudCertificadoEntity.setIdSolicitudCertificado(logReservaModel.getIdSolicitudCertificado());
				logReservaEntity.setFkIdSolicitudCertificado(solicitudCertificadoEntity);
			}
			
			if(logReservaModel.getIdSolicitudAcademica()!=null && logReservaModel.getIdSolicitudAcademica()>0){
				SolicitudAcademicaEntity solicitudAcademicaEntity = new SolicitudAcademicaEntity();
				solicitudAcademicaEntity.setIdSolicitudAcademica(logReservaModel.getIdSolicitudAcademica());
				logReservaEntity.setFkIdSolicitudAcademica(solicitudAcademicaEntity);
			}
			
			if(logReservaModel.getIdSolicitudPostulacion()!=null && logReservaModel.getIdSolicitudPostulacion()>0){
				SolicitudPostulacionEntity solicitudPostulacionEntity = new SolicitudPostulacionEntity();
				solicitudPostulacionEntity.setIdSolicitudPostulacion(logReservaModel.getIdSolicitudPostulacion());
				logReservaEntity.setFkIdSolicitudPostulacion(solicitudPostulacionEntity);
			}

			logReservaEntity.setFechaInicialLogReserva(DateMapper.DateUtilToTimestamp(logReservaModel.getFechaInicialLogReserva()));
			
			logReservaEntity.setFechaConfirmacionLogReserva(DateMapper.DateUtilToTimestamp(logReservaModel.getFechaConfirmacionLogReserva()));
			
			logReservaEntity.setTipoCompra(logReservaModel.getTipoCompra());
			
			logReservaEntity.setMedioPago(logReservaModel.getMedioPago());

			logReservaEntity.setValorPagado(logReservaModel.getValorPagado());
			
			logReservaEntity.setCorreoConfirmacionEnviado(logReservaModel.getCorreoConfirmacionEnviado());
		}
		
		return logReservaEntity;
	}

	public static List<LogReservaEntity> ListLogReservaModelToListLogReservaEntity(List<LogReservaModel> listaLogReservaModel){

		List<LogReservaEntity> listaLogReservaEntity=new ArrayList<LogReservaEntity>();

		if(listaLogReservaModel==null || listaLogReservaModel.size()==0){
			return new ArrayList<LogReservaEntity>();
		}
		else{
			listaLogReservaEntity=new ArrayList<LogReservaEntity>();
			LogReservaEntity logReserva=new LogReservaEntity();

			for(LogReservaModel proUniMod: listaLogReservaModel){
				logReserva = new LogReservaEntity();
				
				logReserva = LogReservaModelToLogReservaEntity(proUniMod);
				
				listaLogReservaEntity.add(logReserva);
			}
		}

		return listaLogReservaEntity;
	}

	public static LogReservaModel LogReservaEntityToLogReservaModel(LogReservaEntity logReservaEntity){

		LogReservaModel logReservaModel=new LogReservaModel();
		
		if(logReservaEntity==null){
			return new LogReservaModel();
		}
		else{
			logReservaModel.setIdLogReservaModel(logReservaEntity.getIdLogReservaEntity());
			
			if(logReservaEntity.getFkIdSolicitudCertificado()!=null && logReservaEntity.getFkIdSolicitudCertificado().getIdSolicitudCertificado()>0){
				logReservaModel.setIdSolicitudCertificado(logReservaEntity.getFkIdSolicitudCertificado().getIdSolicitudCertificado());
			}
			
			if(logReservaEntity.getFkIdSolicitudAcademica()!=null && logReservaEntity.getFkIdSolicitudAcademica().getIdSolicitudAcademica()>0){
				logReservaModel.setIdSolicitudAcademica(logReservaEntity.getFkIdSolicitudAcademica().getIdSolicitudAcademica());
			}
			
			if(logReservaEntity.getFkIdSolicitudPostulacion()!=null && logReservaEntity.getFkIdSolicitudPostulacion().getIdSolicitudPostulacion()>0){
				logReservaModel.setIdSolicitudPostulacion(logReservaEntity.getFkIdSolicitudPostulacion().getIdSolicitudPostulacion());
			}
			
			logReservaModel.setFechaInicialLogReserva(DateMapper.TimestampToDateUtil(logReservaEntity.getFechaInicialLogReserva()));
			
			logReservaModel.setFechaConfirmacionLogReserva(DateMapper.TimestampToDateUtil(logReservaEntity.getFechaConfirmacionLogReserva()));
			
			logReservaModel.setTipoCompra(logReservaEntity.getTipoCompra());
			
			logReservaModel.setMedioPago(logReservaEntity.getMedioPago());
			
			logReservaModel.setValorPagado(logReservaEntity.getValorPagado());
			
			logReservaModel.setCorreoConfirmacionEnviado(logReservaEntity.getCorreoConfirmacionEnviado());
		}
		return logReservaModel;
	}

	public static List<LogReservaModel> ListLogReservaEntityToListLogReservaModel(List<LogReservaEntity> listaLogReservaEntity){

		List<LogReservaModel> listaLogReservaModel=new ArrayList<LogReservaModel>();

		if(listaLogReservaEntity==null || listaLogReservaEntity.size()==0){
			return new ArrayList<LogReservaModel>();
		}
		else{
			listaLogReservaModel=new ArrayList<LogReservaModel>();
			LogReservaModel logReservaModel=new LogReservaModel();

			for(LogReservaEntity proUniEnt: listaLogReservaEntity){
				logReservaModel=new LogReservaModel();
				
				logReservaModel = LogReservaEntityToLogReservaModel(proUniEnt);
				
				listaLogReservaModel.add(logReservaModel);
			}
		}
		return listaLogReservaModel;
	}
}
