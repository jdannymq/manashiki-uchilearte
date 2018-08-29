package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.SolicitudCertificadoModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;

import vijnana.utilidades.component.utilidades.AppDate;
import vijnana.utilidades.component.utilidades.TipoFormatoFecha;

public class SolicitudCertificadoDTOMapper{

//	private static final String formatoFecha = "yyyy-MM-dd'T'HH:mm:ss'Z'"; 
	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/

	public static SolicitudCertificadoModel SolicitudCertificadoDTOToSolicitudCertificadoModel(SolicitudCertificadoDTO solicitudCertificadoDTO){

		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();

		if(solicitudCertificadoDTO==null){
			return new SolicitudCertificadoModel();
		}
		else{
			solicitudCertificadoModel.setIdSolicitudCertificado(solicitudCertificadoDTO.getIdSolicitudCertificado());
			solicitudCertificadoModel.setNombrePersonaSolicitudCertificado(solicitudCertificadoDTO.getNombrePersonaSolicitudCertificado()); //Nombre a Mostrar
			solicitudCertificadoModel.setApellidoPaternoPersonaSolicitudCertificado(solicitudCertificadoDTO.getApellidoPaternoPersonaSolicitudCertificado());
			solicitudCertificadoModel.setApellidoMaternoPersonaSolicitudCertificado(solicitudCertificadoDTO.getApellidoMaternoPersonaSolicitudCertificado()); 
			solicitudCertificadoModel.setRutPersonaSolicitudCertificado(solicitudCertificadoDTO.getRutPersonaSolicitudCertificado());
			solicitudCertificadoModel.setIdProgramaUniversidad(solicitudCertificadoDTO.getIdProgramaUniversidad());
			solicitudCertificadoModel.setMailMember(solicitudCertificadoDTO.getMailMember()); //mail usuario
			solicitudCertificadoModel.setAnhoIngreso(solicitudCertificadoDTO.getAnhoIngreso()); //anho egreso universidad usuario
			solicitudCertificadoModel.setIdTipoCertificado(solicitudCertificadoDTO.getIdTipoCertificado());
			solicitudCertificadoModel.setIdFinalidadCertificado(solicitudCertificadoDTO.getIdFinalidadCertificado());
			solicitudCertificadoModel.setFechaSolicitud(solicitudCertificadoDTO.getFechaSolicitud()); 
			solicitudCertificadoModel.setEstadoSolicitud(solicitudCertificadoDTO.getEstadoSolicitud());
		}

		return solicitudCertificadoModel;
	}

	public static List<SolicitudCertificadoModel> ListSolicitudCertificadoDTOToListSolicitudCertificadoModel(List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO){

		List<SolicitudCertificadoModel> listaSolicitudCertificado=new ArrayList<SolicitudCertificadoModel>();
		if(listaSolicitudCertificadoDTO==null || listaSolicitudCertificadoDTO.size()==0){
			return new ArrayList<SolicitudCertificadoModel>();
		}
		else{
			listaSolicitudCertificado=new ArrayList<SolicitudCertificadoModel>();

			SolicitudCertificadoModel solicitudCertificado=new SolicitudCertificadoModel();

			for(SolicitudCertificadoDTO solCerDTO: listaSolicitudCertificadoDTO){
				solicitudCertificado=new SolicitudCertificadoModel();

				solicitudCertificado = SolicitudCertificadoDTOToSolicitudCertificadoModel(solCerDTO);

				listaSolicitudCertificado.add(solicitudCertificado);
			}
		}

		return listaSolicitudCertificado;
	}

	public static SolicitudCertificadoDTO SolicitudCertificadoModelToSolicitudCertificadoDTO(SolicitudCertificadoModel solicitudCertificadoModel){

		SolicitudCertificadoDTO solicitudCertificadoDTO=new SolicitudCertificadoDTO();

		if(solicitudCertificadoModel==null){
			return new SolicitudCertificadoDTO();
		}
		else{
			solicitudCertificadoDTO.setIdSolicitudCertificado(solicitudCertificadoModel.getIdSolicitudCertificado());
			solicitudCertificadoDTO.setNombrePersonaSolicitudCertificado(solicitudCertificadoModel.getNombrePersonaSolicitudCertificado()); //Nombre a Mostrar
			solicitudCertificadoDTO.setApellidoPaternoPersonaSolicitudCertificado(solicitudCertificadoModel.getApellidoPaternoPersonaSolicitudCertificado());
			solicitudCertificadoDTO.setApellidoMaternoPersonaSolicitudCertificado(solicitudCertificadoModel.getApellidoMaternoPersonaSolicitudCertificado()); 
			solicitudCertificadoDTO.setRutPersonaSolicitudCertificado(solicitudCertificadoModel.getRutPersonaSolicitudCertificado());
			solicitudCertificadoDTO.setIdProgramaUniversidad(solicitudCertificadoModel.getIdProgramaUniversidad());
			solicitudCertificadoDTO.setMailMember(solicitudCertificadoModel.getMailMember()); //mail usuario
			solicitudCertificadoDTO.setAnhoIngreso(solicitudCertificadoModel.getAnhoIngreso()); //anho egreso universidad usuario
			solicitudCertificadoDTO.setIdTipoCertificado(solicitudCertificadoModel.getIdTipoCertificado());
			solicitudCertificadoDTO.setIdFinalidadCertificado(solicitudCertificadoModel.getIdFinalidadCertificado());
			if(solicitudCertificadoModel.getFechaSolicitud()!=null){
				//solicitudCertificadoDTO.setFechaSolicitud(solicitudCertificadoModel.getFechaSolicitud());
				solicitudCertificadoDTO.setSfechaSolicitud(AppDate.obtenerFechaEnFormato(solicitudCertificadoModel.getFechaSolicitud(), TipoFormatoFecha.YYYY_MM_ddTHH_MM_SSZ));
			}
			solicitudCertificadoDTO.setEstadoSolicitud(solicitudCertificadoModel.getEstadoSolicitud());
		}
		return solicitudCertificadoDTO;
	}

	public static List<SolicitudCertificadoDTO> ListSolicitudCertificadoModelToListSolicitudCertificadoDTO(List<SolicitudCertificadoModel> listaSolicitudCertificadoModel){

		List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO=new ArrayList<SolicitudCertificadoDTO>();
		if(listaSolicitudCertificadoModel==null || listaSolicitudCertificadoModel.size()==0){
			return new ArrayList<SolicitudCertificadoDTO>();
		}
		else{
			listaSolicitudCertificadoDTO=new ArrayList<SolicitudCertificadoDTO>();
			SolicitudCertificadoDTO solicitudCertificadoDTO=new SolicitudCertificadoDTO();

			for(SolicitudCertificadoModel solCerMod: listaSolicitudCertificadoModel){
				solicitudCertificadoDTO=new SolicitudCertificadoDTO();

				solicitudCertificadoDTO = SolicitudCertificadoModelToSolicitudCertificadoDTO(solCerMod);

				listaSolicitudCertificadoDTO.add(solicitudCertificadoDTO);
			}
		}
		return listaSolicitudCertificadoDTO;
	}
}
