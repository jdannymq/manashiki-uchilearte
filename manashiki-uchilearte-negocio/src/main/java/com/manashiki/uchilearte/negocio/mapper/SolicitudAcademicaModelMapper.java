package com.manashiki.uchilearte.negocio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.logica.entidad.ArchivoSolicitudEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.logica.entidad.SolicitudAcademicaEntity;
import com.manashiki.uchilearte.logica.entidad.TipoSolicitudEntity;
import com.manashiki.uchilearte.negocio.model.SolicitudAcademicaModel;

import vijnana.utilidades.component.utilidades.DateMapper;

public class SolicitudAcademicaModelMapper{

	/**
	 * Mapper de las entidades 
	 * 1 Model to Entity
	 * 2 list<Model>  to List<Entity>
	 * 3 Entity to Model
	 * 4 List<Entity> to List<Model>*/
	
	public static SolicitudAcademicaEntity SolicitudAcademicaModelToSolicitudAcademicaEntity(SolicitudAcademicaModel solicitudAcademicaModel){
		
		SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();
		if(solicitudAcademicaModel==null){
			return new SolicitudAcademicaEntity();
		}
		else{
			solicitudAcademica.setIdSolicitudAcademica(solicitudAcademicaModel.getIdSolicitudAcademica());
			solicitudAcademica.setNombrePersonaSolicitudAcademica(solicitudAcademicaModel.getNombrePersonaSolicitudAcademica());
			solicitudAcademica.setApellidoPaternoPersonaSolicitudAcademica(solicitudAcademicaModel.getApellidoPaternoPersonaSolicitudAcademica());
			solicitudAcademica.setApellidoMaternoPersonaSolicitudAcademica(solicitudAcademicaModel.getApellidoMaternoPersonaSolicitudAcademica()); 
			solicitudAcademica.setRutPersonaSolicitudAcademica(solicitudAcademicaModel.getRutPersonaSolicitudAcademica());
			
			ProgramaUniversidadEntity programaUniversidad = new ProgramaUniversidadEntity();
			programaUniversidad.setIdProgramaUniversidad(solicitudAcademicaModel.getIdProgramaUniversidad());
			solicitudAcademica.setFkIdProgramaUniversidad(programaUniversidad);
			
			solicitudAcademica.setMailMember(solicitudAcademicaModel.getMailMember());
			solicitudAcademica.setAnhoIngreso(solicitudAcademicaModel.getAnhoIngreso());
			
			TipoSolicitudEntity tipoSolicitud = new TipoSolicitudEntity();
			tipoSolicitud.setIdTipoSolicitud(solicitudAcademicaModel.getIdTipoSolicitud());
			solicitudAcademica.setFkIdTipoSolicitud(tipoSolicitud);
			
			solicitudAcademica.setFundamentacionSolicitud(solicitudAcademicaModel.getFundamentacionSolicitud());
//			dateUtil = solicitudAcademicaModel.getFechaSolicitud();
//			dateTimestamp = DateMapper.DateUtilToTimestamp(dateUtil);
			solicitudAcademica.setFechaSolicitud( DateMapper.DateUtilToTimestamp(solicitudAcademicaModel.getFechaSolicitud())); 
			
			solicitudAcademica.setArchivoAdjunto(solicitudAcademicaModel.isArchivoAdjunto()); 
			
			if(solicitudAcademicaModel.getIdArchivoSolicitud()!=null){
				if( solicitudAcademicaModel.getIdArchivoSolicitud()!=0){
					ArchivoSolicitudEntity archivoSolicitudAcademicaEntity = new ArchivoSolicitudEntity();
					archivoSolicitudAcademicaEntity.setIdArchivoSolicitud(solicitudAcademicaModel.getIdArchivoSolicitud());
					solicitudAcademica.setFkIdArchivoSolicitud(archivoSolicitudAcademicaEntity);
				}
			}
			
			solicitudAcademica.setEstadoSolicitud(solicitudAcademicaModel.getEstadoSolicitud());
		}
		
		return solicitudAcademica;
	}

	public static List<SolicitudAcademicaEntity> ListSolicitudAcademicaModelToListSolicitudAcademicaEntity(List<SolicitudAcademicaModel> listaSolicitudAcademicaModel){

		List<SolicitudAcademicaEntity> listaSolicitudAcademica=new ArrayList<SolicitudAcademicaEntity>();
		
		if(listaSolicitudAcademicaModel == null || listaSolicitudAcademicaModel.size()==0){
			return new ArrayList<SolicitudAcademicaEntity>();
		}
		else{
			listaSolicitudAcademica=new ArrayList<SolicitudAcademicaEntity>();
			
			SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();

			for(SolicitudAcademicaModel solAcaMod: listaSolicitudAcademicaModel){
				solicitudAcademica=new SolicitudAcademicaEntity();
				
				solicitudAcademica = SolicitudAcademicaModelToSolicitudAcademicaEntity(solAcaMod);

				listaSolicitudAcademica.add(solicitudAcademica);
			}
		}

		return listaSolicitudAcademica;
	}

	public static SolicitudAcademicaModel SolicitudAcademicaEntityToSolicitudAcademicaModel(SolicitudAcademicaEntity solicitudAcademica){

		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
		
		if(solicitudAcademica==null){
			return new SolicitudAcademicaModel();
		}
		else{
			solicitudAcademicaModel.setIdSolicitudAcademica(solicitudAcademica.getIdSolicitudAcademica());
			solicitudAcademicaModel.setNombrePersonaSolicitudAcademica(solicitudAcademica.getNombrePersonaSolicitudAcademica());
			solicitudAcademicaModel.setApellidoPaternoPersonaSolicitudAcademica(solicitudAcademica.getApellidoPaternoPersonaSolicitudAcademica());
			solicitudAcademicaModel.setApellidoMaternoPersonaSolicitudAcademica(solicitudAcademica.getApellidoMaternoPersonaSolicitudAcademica()); 
			solicitudAcademicaModel.setRutPersonaSolicitudAcademica(solicitudAcademica.getRutPersonaSolicitudAcademica());
			
			if(solicitudAcademica.getFkIdProgramaUniversidad()!=null && solicitudAcademica.getFkIdProgramaUniversidad().getIdProgramaUniversidad()!=null){
				solicitudAcademicaModel.setIdProgramaUniversidad(solicitudAcademica.getFkIdProgramaUniversidad().getIdProgramaUniversidad());
			}
			
			solicitudAcademicaModel.setMailMember(solicitudAcademica.getMailMember());
			solicitudAcademicaModel.setAnhoIngreso(solicitudAcademica.getAnhoIngreso());
			
			if(solicitudAcademica.getFkIdTipoSolicitud()!=null && solicitudAcademica.getFkIdTipoSolicitud().getIdTipoSolicitud()!=null){
				solicitudAcademicaModel.setIdTipoSolicitud(solicitudAcademica.getFkIdTipoSolicitud().getIdTipoSolicitud());
			}
			
			solicitudAcademicaModel.setFundamentacionSolicitud(solicitudAcademica.getFundamentacionSolicitud());
			
			solicitudAcademicaModel.setFechaSolicitud(DateMapper.TimestampToDateUtil(solicitudAcademica.getFechaSolicitud()));
			
			solicitudAcademicaModel.setArchivoAdjunto(solicitudAcademica.isArchivoAdjunto());
			
			if(solicitudAcademica.getFkIdArchivoSolicitud()!=null && solicitudAcademica.getFkIdArchivoSolicitud().getIdArchivoSolicitud()!=null){
					solicitudAcademicaModel.setIdArchivoSolicitud(solicitudAcademica.getFkIdArchivoSolicitud().getIdArchivoSolicitud());
			}
			solicitudAcademicaModel.setEstadoSolicitud(solicitudAcademica.getEstadoSolicitud());
		}
		return solicitudAcademicaModel;
	}

	public static List<SolicitudAcademicaModel> ListSolicitudAcademicaEntityToListSolicitudAcademicaModel(List<SolicitudAcademicaEntity> listaSolicitudAcademicaEntity){

		List<SolicitudAcademicaModel> listaSolicitudAcademicaModel=new ArrayList<SolicitudAcademicaModel>();
		if(listaSolicitudAcademicaEntity==null || listaSolicitudAcademicaEntity.size()==0){
			return new ArrayList<SolicitudAcademicaModel>();
		}
		else{
			listaSolicitudAcademicaModel=new ArrayList<SolicitudAcademicaModel>();
			SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();

			for(SolicitudAcademicaEntity solAcaEnt: listaSolicitudAcademicaEntity){
				solicitudAcademicaModel=new SolicitudAcademicaModel();
				
				solicitudAcademicaModel = SolicitudAcademicaEntityToSolicitudAcademicaModel(solAcaEnt);
				
				listaSolicitudAcademicaModel.add(solicitudAcademicaModel);
			}
		}
		return listaSolicitudAcademicaModel;
	}
}
