package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.SolicitudPostulacionModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;

import vijnana.utilidades.component.utilidades.AppDate;
import vijnana.utilidades.component.utilidades.TipoFormatoFecha;

public class SolicitudPostulacionDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/

	public static SolicitudPostulacionModel SolicitudPostulacionDTOToSolicitudPostulacionModel(SolicitudPostulacionDTO solicitudPostulacionDTO){

		SolicitudPostulacionModel solicitudPostulacionModel=new SolicitudPostulacionModel();

		if(solicitudPostulacionDTO==null){
			return new SolicitudPostulacionModel();
		}
		else{
			solicitudPostulacionModel.setIdSolicitudPostulacion(solicitudPostulacionDTO.getIdSolicitudPostulacion());
			solicitudPostulacionModel.setIdProgramaUniversidadPostulacion(solicitudPostulacionDTO.getIdProgramaUniversidadPostulacion());
			solicitudPostulacionModel.setRutPersonaSolicitudPostulacion(solicitudPostulacionDTO.getRutPersonaSolicitudPostulacion());
			solicitudPostulacionModel.setNombrePersonaSolicitudPostulacion(solicitudPostulacionDTO.getNombrePersonaSolicitudPostulacion()); //Nombre a Mostrar
			solicitudPostulacionModel.setApellidoPaternoPersonaSolicitudPostulacion(solicitudPostulacionDTO.getApellidoPaternoPersonaSolicitudPostulacion());
			solicitudPostulacionModel.setApellidoMaternoPersonaSolicitudPostulacion(solicitudPostulacionDTO.getApellidoMaternoPersonaSolicitudPostulacion()); 
			solicitudPostulacionModel.setFechaNacimiento(solicitudPostulacionDTO.getFechaNacimiento());
			solicitudPostulacionModel.setNacionalidad(solicitudPostulacionDTO.getNacionalidad());
			solicitudPostulacionModel.setFonoContacto(solicitudPostulacionDTO.getFonoContacto()); //mail de solicitante
			solicitudPostulacionModel.setCelularContacto(solicitudPostulacionDTO.getCelularContacto()); //celular de solicitante
			solicitudPostulacionModel.setMailMember(solicitudPostulacionDTO.getMailMember()); //mail de solicitante
			solicitudPostulacionModel.setDomicilio(solicitudPostulacionDTO.getDomicilio());
			solicitudPostulacionModel.setIdComunaDomicilio(solicitudPostulacionDTO.getIdComunaDomicilio());
			
			solicitudPostulacionModel.setCiudadDomicilio(solicitudPostulacionDTO.getCiudadDomicilio());
			solicitudPostulacionModel.setPaisDomicilio(solicitudPostulacionDTO.getPaisDomicilio());

			solicitudPostulacionModel.setTituloProfesional(solicitudPostulacionDTO.getTituloProfesional());
			solicitudPostulacionModel.setEntidadEducacional(solicitudPostulacionDTO.getEntidadEducacional());
			solicitudPostulacionModel.setPaisEntidadEducacional(solicitudPostulacionDTO.getPaisEntidadEducacional());
			solicitudPostulacionModel.setAnhoObtencionEntidadEducacional(solicitudPostulacionDTO.getAnhoObtencionEntidadEducacional());
			solicitudPostulacionModel.setOcupacionActual(solicitudPostulacionDTO.getOcupacionActual());
			
			solicitudPostulacionModel.setInteresPrograma(solicitudPostulacionDTO.getInteresPrograma());
			solicitudPostulacionModel.setFuenteFinancimiamiento(solicitudPostulacionDTO.getFuenteFinancimiamiento());
			solicitudPostulacionModel.setComentarios(solicitudPostulacionDTO.getComentarios());
			
			solicitudPostulacionModel.setIdArchivoSolicitud(solicitudPostulacionDTO.getIdArchivoSolicitud());

			solicitudPostulacionModel.setFechaSolicitudPostulacion(solicitudPostulacionDTO.getFechaSolicitudPostulacion());
			solicitudPostulacionModel.setEstadoSolicitudPostulacion(solicitudPostulacionDTO.getEstadoSolicitudPostulacion());
		}

		return solicitudPostulacionModel;
	}

	public static List<SolicitudPostulacionModel> ListSolicitudPostulacionDTOToListSolicitudPostulacionModel(List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO){

		List<SolicitudPostulacionModel> listaSolicitudPostulacion=new ArrayList<SolicitudPostulacionModel>();
		
		if(listaSolicitudPostulacionDTO==null || listaSolicitudPostulacionDTO.size()>0){
			return new ArrayList<SolicitudPostulacionModel>();
		}
		else{
			listaSolicitudPostulacion=new ArrayList<SolicitudPostulacionModel>();
			SolicitudPostulacionModel solicitudPostulacionModel=new SolicitudPostulacionModel();

			for(SolicitudPostulacionDTO solPosDTO: listaSolicitudPostulacionDTO){
				solicitudPostulacionModel=new SolicitudPostulacionModel();

				solicitudPostulacionModel = SolicitudPostulacionDTOToSolicitudPostulacionModel(solPosDTO);

				listaSolicitudPostulacion.add(solicitudPostulacionModel);
			}
		}

		return listaSolicitudPostulacion;
	}

	public static SolicitudPostulacionDTO SolicitudPostulacionModelToSolicitudPostulacionDTO(SolicitudPostulacionModel solicitudPostulacionModel){

		SolicitudPostulacionDTO solicitudPostulacionDTO=new SolicitudPostulacionDTO();
		if(solicitudPostulacionModel==null){
			return new SolicitudPostulacionDTO();
		}
		else{
			if(solicitudPostulacionModel.getIdSolicitudPostulacion()!=null){
				solicitudPostulacionDTO.setIdSolicitudPostulacion(solicitudPostulacionModel.getIdSolicitudPostulacion());
			}
			if(solicitudPostulacionModel.getIdProgramaUniversidadPostulacion()!=null){
				solicitudPostulacionDTO.setIdProgramaUniversidadPostulacion(solicitudPostulacionModel.getIdProgramaUniversidadPostulacion());
			}
			solicitudPostulacionDTO.setRutPersonaSolicitudPostulacion(solicitudPostulacionModel.getRutPersonaSolicitudPostulacion());
			solicitudPostulacionDTO.setNombrePersonaSolicitudPostulacion(solicitudPostulacionModel.getNombrePersonaSolicitudPostulacion()); //Nombre a Mostrar
			solicitudPostulacionDTO.setApellidoPaternoPersonaSolicitudPostulacion(solicitudPostulacionModel.getApellidoPaternoPersonaSolicitudPostulacion());
			solicitudPostulacionDTO.setApellidoMaternoPersonaSolicitudPostulacion(solicitudPostulacionModel.getApellidoMaternoPersonaSolicitudPostulacion()); 
			solicitudPostulacionDTO.setFechaNacimiento(solicitudPostulacionModel.getFechaNacimiento());
			solicitudPostulacionDTO.setNacionalidad(solicitudPostulacionModel.getNacionalidad());
			solicitudPostulacionDTO.setFonoContacto(solicitudPostulacionModel.getFonoContacto()); //mail de solicitante
			solicitudPostulacionDTO.setCelularContacto(solicitudPostulacionModel.getCelularContacto()); //celular de solicitante
			solicitudPostulacionDTO.setMailMember(solicitudPostulacionModel.getMailMember()); //mail de solicitante
			solicitudPostulacionDTO.setDomicilio(solicitudPostulacionModel.getDomicilio());
			if(solicitudPostulacionModel.getIdComunaDomicilio()!=null){
				solicitudPostulacionDTO.setIdComunaDomicilio(solicitudPostulacionModel.getIdComunaDomicilio());
			}
			solicitudPostulacionDTO.setCiudadDomicilio(solicitudPostulacionModel.getCiudadDomicilio());
			solicitudPostulacionDTO.setPaisDomicilio(solicitudPostulacionModel.getPaisDomicilio());

			solicitudPostulacionDTO.setTituloProfesional(solicitudPostulacionModel.getTituloProfesional());
			solicitudPostulacionDTO.setEntidadEducacional(solicitudPostulacionModel.getEntidadEducacional());
			solicitudPostulacionDTO.setPaisEntidadEducacional(solicitudPostulacionModel.getPaisEntidadEducacional());
			solicitudPostulacionDTO.setAnhoObtencionEntidadEducacional(solicitudPostulacionModel.getAnhoObtencionEntidadEducacional());
			solicitudPostulacionDTO.setOcupacionActual(solicitudPostulacionModel.getOcupacionActual());
			
			solicitudPostulacionDTO.setInteresPrograma(solicitudPostulacionModel.getInteresPrograma());
			solicitudPostulacionDTO.setFuenteFinancimiamiento(solicitudPostulacionModel.getFuenteFinancimiamiento());
			solicitudPostulacionDTO.setComentarios(solicitudPostulacionModel.getComentarios());
			
			if(solicitudPostulacionModel.getIdArchivoSolicitud()!=null){
				solicitudPostulacionDTO.setIdArchivoSolicitud(solicitudPostulacionModel.getIdArchivoSolicitud());
			}
			
			if(solicitudPostulacionModel.getFechaSolicitudPostulacion()!=null){
				solicitudPostulacionDTO.setSfechaSolicitud(AppDate.obtenerFechaEnFormato(solicitudPostulacionModel.getFechaSolicitudPostulacion(), TipoFormatoFecha.YYYY_MM_ddTHH_MM_SSZ));
				solicitudPostulacionDTO.setFechaSolicitudPostulacion(null);
//				solicitudPostulacionDTO.setFechaSolicitudPostulacion(solicitudPostulacionModel.getFechaSolicitudPostulacion());
			}
			if(solicitudPostulacionModel.getEstadoSolicitudPostulacion()!=null){
				solicitudPostulacionDTO.setEstadoSolicitudPostulacion(solicitudPostulacionModel.getEstadoSolicitudPostulacion());
			}
		}
		return solicitudPostulacionDTO;
	}

	public static List<SolicitudPostulacionDTO> ListSolicitudPostulacionModelToListSolicitudPostulacionDTO(List<SolicitudPostulacionModel> listaSolicitudPostulacionModel){

		List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO=new ArrayList<SolicitudPostulacionDTO>();
		
		if(listaSolicitudPostulacionModel==null || listaSolicitudPostulacionModel.size()==0){
			return new ArrayList<SolicitudPostulacionDTO>();
		}
		else{
			listaSolicitudPostulacionDTO=new ArrayList<SolicitudPostulacionDTO>();
			SolicitudPostulacionDTO solicitudPostulacionDTO=new SolicitudPostulacionDTO();

			for(SolicitudPostulacionModel solPosMod: listaSolicitudPostulacionModel){
				solicitudPostulacionDTO=new SolicitudPostulacionDTO();

				solicitudPostulacionDTO = SolicitudPostulacionModelToSolicitudPostulacionDTO(solPosMod);

				listaSolicitudPostulacionDTO.add(solicitudPostulacionDTO);
			}
		}
		return listaSolicitudPostulacionDTO;
	}
}
