package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.SolicitudAcademicaModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;

import vijnana.utilidades.component.utilidades.AppDate;
import vijnana.utilidades.component.utilidades.TipoFormatoFecha;

public class SolicitudAcademicaDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static SolicitudAcademicaModel SolicitudAcademicaDTOToSolicitudAcademicaModel(SolicitudAcademicaDTO solicitudAcademicaDTO){
		
		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
		
		if(solicitudAcademicaDTO==null){
			return new SolicitudAcademicaModel();
		}
		else{
			solicitudAcademicaModel.setIdSolicitudAcademica(solicitudAcademicaDTO.getIdSolicitudAcademica());
			solicitudAcademicaModel.setNombrePersonaSolicitudAcademica(solicitudAcademicaDTO.getNombrePersonaSolicitudAcademica()); //Nombre a Mostrar
			solicitudAcademicaModel.setApellidoPaternoPersonaSolicitudAcademica(solicitudAcademicaDTO.getApellidoPaternoPersonaSolicitudAcademica());
			solicitudAcademicaModel.setApellidoMaternoPersonaSolicitudAcademica(solicitudAcademicaDTO.getApellidoMaternoPersonaSolicitudAcademica()); 
			solicitudAcademicaModel.setRutPersonaSolicitudAcademica(solicitudAcademicaDTO.getRutPersonaSolicitudAcademica());
			solicitudAcademicaModel.setIdProgramaUniversidad(solicitudAcademicaDTO.getIdProgramaUniversidad());
			solicitudAcademicaModel.setMailMember(solicitudAcademicaDTO.getMailMember()); //mail usuario
			solicitudAcademicaModel.setAnhoIngreso(solicitudAcademicaDTO.getAnhoIngreso()); //anho egreso universidad usuario
			solicitudAcademicaModel.setIdTipoSolicitud(solicitudAcademicaDTO.getIdTipoSolicitud());
			solicitudAcademicaModel.setFundamentacionSolicitud(solicitudAcademicaDTO.getFundamentacionSolicitud()); //mail usuario
			solicitudAcademicaModel.setFechaSolicitud(solicitudAcademicaDTO.getFechaSolicitud()); 
			solicitudAcademicaModel.setIdArchivoSolicitud(solicitudAcademicaDTO.getIdArchivoSolicitud()); 
			solicitudAcademicaModel.setArchivoAdjunto(solicitudAcademicaDTO.isArchivoAdjunto()); 
			solicitudAcademicaModel.setEstadoSolicitud(solicitudAcademicaDTO.getEstadoSolicitud());
		}
		
		return solicitudAcademicaModel;
	}

	public static List<SolicitudAcademicaModel> ListSolicitudAcademicaDTOToListSolicitudAcademicaModel(List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO){

		List<SolicitudAcademicaModel> listaSolicitudAcademicaModel = new ArrayList<SolicitudAcademicaModel>();
		if(listaSolicitudAcademicaDTO==null || listaSolicitudAcademicaDTO.size()==0){
			return new ArrayList<SolicitudAcademicaModel>();
		}
		else{
			listaSolicitudAcademicaModel = new ArrayList<SolicitudAcademicaModel>();
			
			SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();

			for(SolicitudAcademicaDTO solAcaDTO: listaSolicitudAcademicaDTO){
				solicitudAcademicaModel=new SolicitudAcademicaModel();
				
				solicitudAcademicaModel = SolicitudAcademicaDTOToSolicitudAcademicaModel(solAcaDTO);

				listaSolicitudAcademicaModel.add(solicitudAcademicaModel);
			}
		}

		return listaSolicitudAcademicaModel;
	}

	public static SolicitudAcademicaDTO SolicitudAcademicaModelToSolicitudAcademicaDTO(SolicitudAcademicaModel solicitudAcademicaModel){

		SolicitudAcademicaDTO solicitudAcademicaDTO=new SolicitudAcademicaDTO();
		if(solicitudAcademicaModel==null){
			return new SolicitudAcademicaDTO();
		}
		else{
			solicitudAcademicaDTO.setIdSolicitudAcademica(solicitudAcademicaModel.getIdSolicitudAcademica());
			solicitudAcademicaDTO.setNombrePersonaSolicitudAcademica(solicitudAcademicaModel.getNombrePersonaSolicitudAcademica()); //Nombre a Mostrar
			solicitudAcademicaDTO.setApellidoPaternoPersonaSolicitudAcademica(solicitudAcademicaModel.getApellidoPaternoPersonaSolicitudAcademica());
			solicitudAcademicaDTO.setApellidoMaternoPersonaSolicitudAcademica(solicitudAcademicaModel.getApellidoMaternoPersonaSolicitudAcademica()); 
			solicitudAcademicaDTO.setRutPersonaSolicitudAcademica(solicitudAcademicaModel.getRutPersonaSolicitudAcademica());
			solicitudAcademicaDTO.setIdProgramaUniversidad(solicitudAcademicaModel.getIdProgramaUniversidad());
			solicitudAcademicaDTO.setMailMember(solicitudAcademicaModel.getMailMember()); //mail usuario
			solicitudAcademicaDTO.setAnhoIngreso(solicitudAcademicaModel.getAnhoIngreso()); //anho egreso universidad usuario
			solicitudAcademicaDTO.setIdTipoSolicitud(solicitudAcademicaModel.getIdTipoSolicitud());
			solicitudAcademicaDTO.setFundamentacionSolicitud(solicitudAcademicaModel.getFundamentacionSolicitud()); //mail usuario
			solicitudAcademicaDTO.setFechaSolicitud(null);
			if(solicitudAcademicaModel.getFechaSolicitud()!=null){
				solicitudAcademicaDTO.setSfechaSolicitud(AppDate.obtenerFechaEnFormato(solicitudAcademicaModel.getFechaSolicitud(), TipoFormatoFecha.YYYY_MM_ddTHH_MM_SSZ));
			}
			solicitudAcademicaDTO.setArchivoAdjunto(solicitudAcademicaModel.isArchivoAdjunto());
			if(solicitudAcademicaModel.getIdArchivoSolicitud()!=null){
				solicitudAcademicaDTO.setIdArchivoSolicitud(solicitudAcademicaModel.getIdArchivoSolicitud());
			}
			solicitudAcademicaDTO.setEstadoSolicitud(solicitudAcademicaModel.getEstadoSolicitud());
		}
		return solicitudAcademicaDTO;
	}

	public static List<SolicitudAcademicaDTO> ListSolicitudAcademicaModelToListSolicitudAcademicaDTO(List<SolicitudAcademicaModel> listaSolicitudAcademicaModel){

		List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO=new ArrayList<SolicitudAcademicaDTO>();
		if(listaSolicitudAcademicaModel==null || listaSolicitudAcademicaModel.size()==0){
			return new ArrayList<SolicitudAcademicaDTO>();
		}
		else{
			listaSolicitudAcademicaDTO=new ArrayList<SolicitudAcademicaDTO>();
			SolicitudAcademicaDTO solicitudAcademicaDTO=new SolicitudAcademicaDTO();

			for(SolicitudAcademicaModel solAcaMod: listaSolicitudAcademicaModel){
				solicitudAcademicaDTO=new SolicitudAcademicaDTO();
				
				solicitudAcademicaDTO = SolicitudAcademicaModelToSolicitudAcademicaDTO(solAcaMod);

				listaSolicitudAcademicaDTO.add(solicitudAcademicaDTO);
			}
		}
		return listaSolicitudAcademicaDTO;
	}
}
