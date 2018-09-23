package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ArchivoSolicitudEntity;
import com.manashiki.uchilearte.logica.entidad.ComunaEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadPostulacionEntity;
import com.manashiki.uchilearte.logica.entidad.SolicitudPostulacionEntity;
import com.manashiki.uchilearte.negocio.model.SolicitudPostulacionModel;
import vijnana.utilidades.component.utilidades.DateMapper;

public class SolicitudPostulacionModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static SolicitudPostulacionEntity SolicitudPostulacionModelToSolicitudPostulacionEntity(SolicitudPostulacionModel solicitudPostulacionModel){
		
		SolicitudPostulacionEntity solicitudPostulacionEntity=new SolicitudPostulacionEntity();
//		java.util.Date dateUtil;
//		java.sql.Timestamp dateTimestamp;
		if(solicitudPostulacionModel==null){
			return new SolicitudPostulacionEntity();
		}
		else{
			solicitudPostulacionEntity.setIdSolicitudPostulacion(solicitudPostulacionModel.getIdSolicitudPostulacion());
			
			if(solicitudPostulacionModel.getIdProgramaUniversidadPostulacion()!=null){
				ProgramaUniversidadPostulacionEntity programaUniversidadPostulacionEntity = new ProgramaUniversidadPostulacionEntity();
				programaUniversidadPostulacionEntity.setIdProgramaUniversidadPostulacion(solicitudPostulacionModel.getIdProgramaUniversidadPostulacion());
				solicitudPostulacionEntity.setFkIdProgramaUniversidadPostulacion(programaUniversidadPostulacionEntity);
			}
			
//			solicitudPostulacionEntity.setTituloVersionSemestral(solicitudPostulacionModel.getTituloVersionSemestral());
			solicitudPostulacionEntity.setRutPersonaSolicitudPostulacion(solicitudPostulacionModel.getRutPersonaSolicitudPostulacion());
			solicitudPostulacionEntity.setNombrePersonaSolicitudPostulacion(solicitudPostulacionModel.getNombrePersonaSolicitudPostulacion());
			solicitudPostulacionEntity.setApellidoPaternoPersonaSolicitudPostulacion(solicitudPostulacionModel.getApellidoPaternoPersonaSolicitudPostulacion());
			solicitudPostulacionEntity.setApellidoMaternoPersonaSolicitudPostulacion(solicitudPostulacionModel.getApellidoMaternoPersonaSolicitudPostulacion()); 
			solicitudPostulacionEntity.setFechaNacimiento(solicitudPostulacionModel.getFechaNacimiento()); 
			solicitudPostulacionEntity.setNacionalidad(solicitudPostulacionModel.getNacionalidad()); 
			solicitudPostulacionEntity.setFonoContacto(solicitudPostulacionModel.getFonoContacto()); 
			solicitudPostulacionEntity.setCelularContacto(solicitudPostulacionModel.getCelularContacto()); 
			solicitudPostulacionEntity.setMailMember(solicitudPostulacionModel.getMailMember());
			solicitudPostulacionEntity.setDomicilio(solicitudPostulacionModel.getDomicilio()); 
			
			if(solicitudPostulacionModel.getIdComunaDomicilio()!=null && solicitudPostulacionModel.getIdComunaDomicilio()!=0){
			ComunaEntity comuna=new ComunaEntity();
			comuna.setIdComuna(solicitudPostulacionModel.getIdComunaDomicilio());
			solicitudPostulacionEntity.setFkIdComuna(comuna);
			}
			else{
				solicitudPostulacionEntity.setFkIdComuna(null);
			}
			
			solicitudPostulacionEntity.setCiudadDomicilio(solicitudPostulacionModel.getCiudadDomicilio()); 
			solicitudPostulacionEntity.setPaisDomicilio(solicitudPostulacionModel.getPaisDomicilio()); 
			solicitudPostulacionEntity.setTituloProfesional(solicitudPostulacionModel.getTituloProfesional());
			solicitudPostulacionEntity.setEntidadEducacional(solicitudPostulacionModel.getEntidadEducacional());
			solicitudPostulacionEntity.setPaisEntidadEducacional(solicitudPostulacionModel.getPaisEntidadEducacional());
			solicitudPostulacionEntity.setAnhoObtencionEntidadEducacional(solicitudPostulacionModel.getAnhoObtencionEntidadEducacional());
			solicitudPostulacionEntity.setOcupacionActual(solicitudPostulacionModel.getOcupacionActual());
			solicitudPostulacionEntity.setInteresPrograma(solicitudPostulacionModel.getInteresPrograma());
			solicitudPostulacionEntity.setFuenteFinancimiamiento(solicitudPostulacionModel.getFuenteFinancimiamiento());
			solicitudPostulacionEntity.setComentarios(solicitudPostulacionModel.getComentarios());
			
			if(solicitudPostulacionModel.getIdArchivoSolicitud()!=null){
				if( solicitudPostulacionModel.getIdArchivoSolicitud()!=0){
					ArchivoSolicitudEntity archivoSolicitudPostulacionEntity = new ArchivoSolicitudEntity();
					archivoSolicitudPostulacionEntity.setIdArchivoSolicitud(solicitudPostulacionModel.getIdArchivoSolicitud());
					solicitudPostulacionEntity.setFkIdArchivoSolicitud(archivoSolicitudPostulacionEntity);
				}
				}
			
//			dateUtil = solicitudPostulacionModel.getFechaSolicitudPostulacion();
//			dateTimestamp = DateMapper.DateUtilToTimestamp(dateUtil);
			solicitudPostulacionEntity.setFechaSolicitud(DateMapper.DateUtilToTimestamp(solicitudPostulacionModel.getFechaSolicitudPostulacion())); 
			
			solicitudPostulacionEntity.setEstadoSolicitudPostulacion(solicitudPostulacionModel.getEstadoSolicitudPostulacion());
		}
		
		return solicitudPostulacionEntity;
	}

	public static List<SolicitudPostulacionEntity> ListSolicitudPostulacionModelToListSolicitudPostulacionEntity(List<SolicitudPostulacionModel> listaSolicitudPostulacionModel){

		List<SolicitudPostulacionEntity> listaSolicitudPostulacion=new ArrayList<SolicitudPostulacionEntity>();
//		java.util.Date dateUtil;
//		java.sql.Timestamp dateTimestamp;
		if(listaSolicitudPostulacionModel==null || listaSolicitudPostulacionModel.size()==0){
			return new ArrayList<SolicitudPostulacionEntity>();
		}
		else{
			listaSolicitudPostulacion=new ArrayList<SolicitudPostulacionEntity>();
			SolicitudPostulacionEntity solicitudPostulacionEntity=new SolicitudPostulacionEntity();

			for(SolicitudPostulacionModel solPosMod: listaSolicitudPostulacionModel){
				solicitudPostulacionEntity = new SolicitudPostulacionEntity();
				
				solicitudPostulacionEntity = SolicitudPostulacionModelToSolicitudPostulacionEntity(solPosMod);

				listaSolicitudPostulacion.add(solicitudPostulacionEntity);
			}
		}

		return listaSolicitudPostulacion;
	}

	public static SolicitudPostulacionModel SolicitudPostulacionEntityToSolicitudPostulacionModel(SolicitudPostulacionEntity solicitudPostulacionEntity){

		SolicitudPostulacionModel solicitudPostulacionModel=new SolicitudPostulacionModel();
//		java.util.Date dateUtil;
//		java.sql.Timestamp dateTimestamp;
		
		if(solicitudPostulacionEntity==null){
			return new SolicitudPostulacionModel();
		}
		else{
			solicitudPostulacionModel.setIdSolicitudPostulacion(solicitudPostulacionEntity.getIdSolicitudPostulacion());
			if(solicitudPostulacionEntity.getFkIdProgramaUniversidadPostulacion()!=null){
				solicitudPostulacionModel.setIdProgramaUniversidadPostulacion(solicitudPostulacionEntity.getFkIdProgramaUniversidadPostulacion().getIdProgramaUniversidadPostulacion());
			}
			
			solicitudPostulacionModel.setRutPersonaSolicitudPostulacion(solicitudPostulacionEntity.getRutPersonaSolicitudPostulacion());
			solicitudPostulacionModel.setNombrePersonaSolicitudPostulacion(solicitudPostulacionEntity.getNombrePersonaSolicitudPostulacion()); //Nombre a Mostrar
			solicitudPostulacionModel.setApellidoPaternoPersonaSolicitudPostulacion(solicitudPostulacionEntity.getApellidoPaternoPersonaSolicitudPostulacion());
			solicitudPostulacionModel.setApellidoMaternoPersonaSolicitudPostulacion(solicitudPostulacionEntity.getApellidoMaternoPersonaSolicitudPostulacion()); 
			solicitudPostulacionModel.setFechaNacimiento(solicitudPostulacionEntity.getFechaNacimiento());
			solicitudPostulacionModel.setNacionalidad(solicitudPostulacionEntity.getNacionalidad());
			solicitudPostulacionModel.setFonoContacto(solicitudPostulacionEntity.getFonoContacto()); //mail de solicitante
			solicitudPostulacionModel.setCelularContacto(solicitudPostulacionEntity.getCelularContacto()); //celular de solicitante
			solicitudPostulacionModel.setMailMember(solicitudPostulacionEntity.getMailMember()); //mail de solicitante
			solicitudPostulacionModel.setDomicilio(solicitudPostulacionEntity.getDomicilio());
			
			if(solicitudPostulacionEntity.getFkIdComuna()!=null){
				solicitudPostulacionModel.setIdComunaDomicilio(solicitudPostulacionEntity.getFkIdComuna().getIdComuna());
			}
			solicitudPostulacionModel.setCiudadDomicilio(solicitudPostulacionEntity.getCiudadDomicilio());
			solicitudPostulacionModel.setPaisDomicilio(solicitudPostulacionEntity.getPaisDomicilio());

			solicitudPostulacionModel.setTituloProfesional(solicitudPostulacionEntity.getTituloProfesional());
			solicitudPostulacionModel.setEntidadEducacional(solicitudPostulacionEntity.getEntidadEducacional());
			solicitudPostulacionModel.setPaisEntidadEducacional(solicitudPostulacionEntity.getPaisEntidadEducacional());
			solicitudPostulacionModel.setAnhoObtencionEntidadEducacional(solicitudPostulacionEntity.getAnhoObtencionEntidadEducacional());
			solicitudPostulacionModel.setOcupacionActual(solicitudPostulacionEntity.getOcupacionActual());
			
			solicitudPostulacionModel.setInteresPrograma(solicitudPostulacionEntity.getInteresPrograma());
			solicitudPostulacionModel.setFuenteFinancimiamiento(solicitudPostulacionEntity.getFuenteFinancimiamiento());
			solicitudPostulacionModel.setComentarios(solicitudPostulacionEntity.getComentarios());
			
			if(solicitudPostulacionEntity.getFkIdArchivoSolicitud()!=null){
				solicitudPostulacionModel.setIdArchivoSolicitud(solicitudPostulacionEntity.getFkIdArchivoSolicitud().getIdArchivoSolicitud());
			}

			solicitudPostulacionModel.setFechaSolicitudPostulacion(solicitudPostulacionEntity.getFechaSolicitud());
			solicitudPostulacionModel.setEstadoSolicitudPostulacion(solicitudPostulacionEntity.getEstadoSolicitudPostulacion());
		}
		return solicitudPostulacionModel;
	}

	public static List<SolicitudPostulacionModel> ListSolicitudPostulacionEntityToListSolicitudPostulacionModel(List<SolicitudPostulacionEntity> listaSolicitudPostulacion){

		List<SolicitudPostulacionModel> listaSolicitudPostulacionModel=new ArrayList<SolicitudPostulacionModel>();
//		java.util.Date dateUtil;
//		java.sql.Timestamp dateTimestamp;
		if(listaSolicitudPostulacion==null || listaSolicitudPostulacion.size()==0){
			return new ArrayList<SolicitudPostulacionModel>();
		}
		else{
			listaSolicitudPostulacionModel=new ArrayList<SolicitudPostulacionModel>();
			SolicitudPostulacionModel solicitudPostulacionModel=new SolicitudPostulacionModel();

			for(SolicitudPostulacionEntity solPosEnt: listaSolicitudPostulacion){
				solicitudPostulacionModel=new SolicitudPostulacionModel();
				
				solicitudPostulacionModel = SolicitudPostulacionEntityToSolicitudPostulacionModel(solPosEnt);
				
				listaSolicitudPostulacionModel.add(solicitudPostulacionModel);
			}
		}
		return listaSolicitudPostulacionModel;
	}
}
