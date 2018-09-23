package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.FinalidadCertificadoEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.logica.entidad.SolicitudCertificadoEntity;
import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;
import com.manashiki.uchilearte.negocio.model.SolicitudCertificadoModel;
import vijnana.utilidades.component.utilidades.DateMapper;

public class SolicitudCertificadoModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static SolicitudCertificadoEntity SolicitudCertificadoModelToSolicitudCertificadoEntity(SolicitudCertificadoModel solicitudCertificadoModel){
		
		SolicitudCertificadoEntity solicitudCertificadoEntity=new SolicitudCertificadoEntity();
//		java.util.Date dateUtil;
//		java.sql.Timestamp dateTimestamp;
		
		if(solicitudCertificadoModel==null){
			return new SolicitudCertificadoEntity();
		}
		else{
			solicitudCertificadoEntity.setIdSolicitudCertificado(solicitudCertificadoModel.getIdSolicitudCertificado());
			solicitudCertificadoEntity.setNombrePersonaSolicitudCertificado(solicitudCertificadoModel.getNombrePersonaSolicitudCertificado()); //Nombre a Mostrar
			solicitudCertificadoEntity.setApellidoPaternoPersonaSolicitudCertificado(solicitudCertificadoModel.getApellidoPaternoPersonaSolicitudCertificado());
			solicitudCertificadoEntity.setApellidoMaternoPersonaSolicitudCertificado(solicitudCertificadoModel.getApellidoMaternoPersonaSolicitudCertificado()); 
			solicitudCertificadoEntity.setRutPersonaSolicitudCertificado(solicitudCertificadoModel.getRutPersonaSolicitudCertificado());
			
			ProgramaUniversidadEntity programaUniversidad = new ProgramaUniversidadEntity();
			programaUniversidad.setIdProgramaUniversidad(solicitudCertificadoModel.getIdProgramaUniversidad());
			solicitudCertificadoEntity.setFkIdProgramaUniversidad(programaUniversidad);
			
			solicitudCertificadoEntity.setMailMember(solicitudCertificadoModel.getMailMember()); //mail usuario
			solicitudCertificadoEntity.setAnhoIngreso(solicitudCertificadoModel.getAnhoIngreso()); //mail usuario
			
			TipoCertificadoEntity tipoCertificado = new TipoCertificadoEntity();
			tipoCertificado.setIdTipoCertificado(solicitudCertificadoModel.getIdTipoCertificado());
			solicitudCertificadoEntity.setFkIdTipoCertificado(tipoCertificado);
			
			FinalidadCertificadoEntity finalidadCertificado = new FinalidadCertificadoEntity();
			finalidadCertificado.setIdFinalidadCertificado(solicitudCertificadoModel.getIdFinalidadCertificado());
			solicitudCertificadoEntity.setFkIdFinalidadCertificado(finalidadCertificado);
			
//			dateUtil = solicitudCertificadoModel.getFechaSolicitud();
//			dateTimestamp = DateMapper.DateUtilToTimestamp(dateUtil);
			solicitudCertificadoEntity.setFechaSolicitud(DateMapper.DateUtilToTimestamp(solicitudCertificadoModel.getFechaSolicitud())); 
			solicitudCertificadoEntity.setEstadoSolicitud(solicitudCertificadoModel.getEstadoSolicitud());
		}
		
		return solicitudCertificadoEntity;
	}

	public static List<SolicitudCertificadoEntity> ListSolicitudCertificadoModelToListSolicitudCertificadoEntity(List<SolicitudCertificadoModel> listaSolicitudCertificadoModel){

		List<SolicitudCertificadoEntity> listaSolicitudCertificadoEntity=new ArrayList<SolicitudCertificadoEntity>();
		
		if(listaSolicitudCertificadoModel==null || listaSolicitudCertificadoModel.size()==0){
			return new ArrayList<SolicitudCertificadoEntity>();
		}
		else{
			listaSolicitudCertificadoEntity=new ArrayList<SolicitudCertificadoEntity>();
			SolicitudCertificadoEntity solicitudCertificadoEntity=new SolicitudCertificadoEntity();

			for(SolicitudCertificadoModel solCerMod: listaSolicitudCertificadoModel){
				
				solicitudCertificadoEntity=new SolicitudCertificadoEntity();
				
				solicitudCertificadoEntity = SolicitudCertificadoModelToSolicitudCertificadoEntity(solCerMod);

				listaSolicitudCertificadoEntity.add(solicitudCertificadoEntity);
			}
		}

		return listaSolicitudCertificadoEntity;
	}

	public static SolicitudCertificadoModel SolicitudCertificadoEntityToSolicitudCertificadoModel(SolicitudCertificadoEntity solicitudCertificadoEntity){

		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();
//		java.util.Date dateUtil;
//		java.sql.Timestamp dateTimestamp;
		if(solicitudCertificadoEntity ==null){
			return new SolicitudCertificadoModel();
		}
		else{
			solicitudCertificadoModel.setIdSolicitudCertificado(solicitudCertificadoEntity.getIdSolicitudCertificado());
			solicitudCertificadoModel.setNombrePersonaSolicitudCertificado(solicitudCertificadoEntity.getNombrePersonaSolicitudCertificado()); //Nombre a Mostrar
			solicitudCertificadoModel.setApellidoPaternoPersonaSolicitudCertificado(solicitudCertificadoEntity.getApellidoPaternoPersonaSolicitudCertificado());
			solicitudCertificadoModel.setApellidoMaternoPersonaSolicitudCertificado(solicitudCertificadoEntity.getApellidoMaternoPersonaSolicitudCertificado()); 
			solicitudCertificadoModel.setRutPersonaSolicitudCertificado(solicitudCertificadoEntity.getRutPersonaSolicitudCertificado());
			
			if(solicitudCertificadoEntity.getFkIdProgramaUniversidad()!=null && solicitudCertificadoEntity.getFkIdProgramaUniversidad().getIdProgramaUniversidad()!=null){
				solicitudCertificadoModel.setIdProgramaUniversidad(solicitudCertificadoEntity.getFkIdProgramaUniversidad().getIdProgramaUniversidad());
			}
			
			solicitudCertificadoModel.setMailMember(solicitudCertificadoEntity.getMailMember()); //mail usuario
			solicitudCertificadoModel.setAnhoIngreso(solicitudCertificadoEntity.getAnhoIngreso()); //mail usuario
			
			if(solicitudCertificadoEntity.getFkIdTipoCertificado()!=null && solicitudCertificadoEntity.getFkIdTipoCertificado().getIdTipoCertificado()!=null){
			solicitudCertificadoModel.setIdTipoCertificado(solicitudCertificadoEntity.getFkIdTipoCertificado().getIdTipoCertificado());
			}
//			solicitudCertificadoModel.setIdTipoCertificado(solicitudCertificado.getFkIdProgramaUniversidad().getIdProgramaUniversidad());
			
			if(solicitudCertificadoEntity.getFkIdFinalidadCertificado()!=null && solicitudCertificadoEntity.getFkIdFinalidadCertificado().getIdFinalidadCertificado()!=null){
				solicitudCertificadoModel.setIdFinalidadCertificado(solicitudCertificadoEntity.getFkIdFinalidadCertificado().getIdFinalidadCertificado());
			}
			
//			dateTimestamp = solicitudCertificado.getFechaSolicitud();
//			dateUtil = DateMapper.TimestampToDateUtil(dateTimestamp);
			solicitudCertificadoModel.setFechaSolicitud(DateMapper.TimestampToDateUtil(solicitudCertificadoEntity.getFechaSolicitud())); 
			solicitudCertificadoModel.setEstadoSolicitud(solicitudCertificadoEntity.getEstadoSolicitud());
		}
		return solicitudCertificadoModel;
	}

	public static List<SolicitudCertificadoModel> ListSolicitudCertificadoEntityToListSolicitudCertificadoModel(List<SolicitudCertificadoEntity> listaSolicitudCertificadoEntity){

		List<SolicitudCertificadoModel> listaSolicitudCertificadoModel=new ArrayList<SolicitudCertificadoModel>();
//		java.util.Date dateUtil;
//		java.sql.Timestamp dateTimestamp;
		if(listaSolicitudCertificadoEntity==null || listaSolicitudCertificadoEntity.size()==0){
			return new ArrayList<SolicitudCertificadoModel>();
		}
		else{
			listaSolicitudCertificadoModel=new ArrayList<SolicitudCertificadoModel>();
			SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();

			for(SolicitudCertificadoEntity solCerEnt: listaSolicitudCertificadoEntity){
				solicitudCertificadoModel=new SolicitudCertificadoModel();
				
				solicitudCertificadoModel = SolicitudCertificadoEntityToSolicitudCertificadoModel(solCerEnt);

				listaSolicitudCertificadoModel.add(solicitudCertificadoModel);
			}
		}
		return listaSolicitudCertificadoModel;
	}
}
