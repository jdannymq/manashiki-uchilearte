package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.ArchivoSolicitudModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;

public class ArchivoSolicitudDTOMapper{

	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static ArchivoSolicitudModel ArchivoSolicitudDTOToArchivoSolicitudModel(ArchivoSolicitudDTO archivoSolicitudCertificadoDTO){
		
		ArchivoSolicitudModel archivoSolicitudCertificado=new ArchivoSolicitudModel();
		
		if(archivoSolicitudCertificadoDTO==null){
			return new ArchivoSolicitudModel();
		}
		else{
			archivoSolicitudCertificado.setIdArchivoSolicitud(archivoSolicitudCertificadoDTO.getIdArchivoSolicitud());
			archivoSolicitudCertificado.setNombreArchivoSolicitud(archivoSolicitudCertificadoDTO.getNombreArchivoSolicitud()); //Nombre a Mostrar
			archivoSolicitudCertificado.setDireccionAlmacenamientoArchivoSolicitud(archivoSolicitudCertificadoDTO.getDireccionAlmacenamientoArchivoSolicitud());
			archivoSolicitudCertificado.setTipoArchivoSolicitud(archivoSolicitudCertificadoDTO.getTipoArchivoSolicitud());
		}
		
		return archivoSolicitudCertificado;
	}

	public static List<ArchivoSolicitudModel> ListArchivoSolicitudDTOToListArchivoSolicitudModel(List<ArchivoSolicitudDTO> listaArchivoSolicitudDTO){

		List<ArchivoSolicitudModel> listaArchivoSolicitud=new ArrayList<ArchivoSolicitudModel>();
		
		if(listaArchivoSolicitudDTO==null || listaArchivoSolicitudDTO.size()==0){
			return new ArrayList<ArchivoSolicitudModel>();
		}
		else{
			listaArchivoSolicitud=new ArrayList<ArchivoSolicitudModel>();
			
			ArchivoSolicitudModel archivoSolicitudCertificado=new ArchivoSolicitudModel();

			for(ArchivoSolicitudDTO arcSolAcaDTO: listaArchivoSolicitudDTO){
				archivoSolicitudCertificado=new ArchivoSolicitudModel();
				
				archivoSolicitudCertificado = ArchivoSolicitudDTOToArchivoSolicitudModel(arcSolAcaDTO);
				
				listaArchivoSolicitud.add(archivoSolicitudCertificado);
			}
		}

		return listaArchivoSolicitud;
	}

	public static ArchivoSolicitudDTO ArchivoSolicitudModelToArchivoSolicitudDTO(ArchivoSolicitudModel archivoSolicitudCertificadoModel){

		ArchivoSolicitudDTO archivoSolicitudCertificadoDTO=new ArchivoSolicitudDTO();
		if(archivoSolicitudCertificadoModel==null){
			return new ArchivoSolicitudDTO();
		}
		else{
			archivoSolicitudCertificadoDTO.setIdArchivoSolicitud(archivoSolicitudCertificadoModel.getIdArchivoSolicitud());
			archivoSolicitudCertificadoDTO.setNombreArchivoSolicitud(archivoSolicitudCertificadoModel.getNombreArchivoSolicitud()); //Nombre a Mostrar
			archivoSolicitudCertificadoDTO.setDireccionAlmacenamientoArchivoSolicitud(archivoSolicitudCertificadoModel.getDireccionAlmacenamientoArchivoSolicitud());
			archivoSolicitudCertificadoDTO.setTipoArchivoSolicitud(archivoSolicitudCertificadoModel.getTipoArchivoSolicitud());
		}
		return archivoSolicitudCertificadoDTO;
	}

	public static List<ArchivoSolicitudDTO> ListArchivoSolicitudModelToListArchivoSolicitudDTO(List<ArchivoSolicitudModel> listaArchivoSolicitudModel){

		List<ArchivoSolicitudDTO> listaArchivoSolicitudDTO=new ArrayList<ArchivoSolicitudDTO>();
		if(listaArchivoSolicitudModel==null || listaArchivoSolicitudModel.size()==0){
			return new ArrayList<ArchivoSolicitudDTO>();
		}
		else{
			listaArchivoSolicitudDTO=new ArrayList<ArchivoSolicitudDTO>();
			
			ArchivoSolicitudDTO archivoSolicitudDTO=new ArchivoSolicitudDTO();

			for(ArchivoSolicitudModel arcSolAcaMod: listaArchivoSolicitudModel){
				archivoSolicitudDTO=new ArchivoSolicitudDTO();
				
				archivoSolicitudDTO = ArchivoSolicitudModelToArchivoSolicitudDTO(arcSolAcaMod);

				listaArchivoSolicitudDTO.add(archivoSolicitudDTO);
			}
		}
		return listaArchivoSolicitudDTO;
	}
}
