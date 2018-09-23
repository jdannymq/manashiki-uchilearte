package com.manashiki.uchilearte.servicio.mapper;

import java.util.ArrayList;
import java.util.List;

import com.manashiki.uchilearte.negocio.model.ComunaModel;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;

public class ComunaDTOMapper{


	/**
	 * Mapper de las entidades 
	 * 1 DTO to Model
	 * 2 list<DTO>  to List<Model>
	 * 3 Model to DTO
	 * 4 List<Model> to List<DTO>*/
	
	public static ComunaModel ComunaDTOToComunaModel(ComunaDTO comunaDTO){

		ComunaModel comuna=new ComunaModel();

		if(comunaDTO==null){
			return new ComunaModel();
		}
		else{
			comuna.setIdComuna(comunaDTO.getIdComuna());
			comuna.setCodigoComuna(comunaDTO.getCodigoComuna());
			comuna.setNombreComuna(comunaDTO.getNombreComuna());
			comuna.setNombreComunaLower(comunaDTO.getNombreComunaLower());
			comuna.setIdRegion(comunaDTO.getIdRegion());

		}
		return comuna;
	}

	public static List<ComunaModel> ListComunaDTOToListComunaModel(List<ComunaDTO> listaComunaDTO){

		List<ComunaModel> listaComuna=new ArrayList<ComunaModel>();

		if(listaComunaDTO==null || listaComunaDTO.size()==0){
			return new ArrayList<ComunaModel>();
		}
		else{
			listaComuna=new ArrayList<ComunaModel>();

			ComunaModel comuna=new ComunaModel();

			for(ComunaDTO comDTO: listaComunaDTO){
				comuna=new ComunaModel();
				
				comuna = ComunaDTOToComunaModel(comDTO);

				listaComuna.add(comuna);
			}
		}

		return listaComuna;
	}

	public static ComunaDTO ComunaModelToComunaDTO(ComunaModel comuna){

		ComunaDTO comunaDTO=new ComunaDTO();

		if(comuna==null){
			return new ComunaDTO();
		}
		else{
			comunaDTO.setIdComuna(comuna.getIdComuna());
			comunaDTO.setCodigoComuna(comuna.getCodigoComuna());
			comunaDTO.setNombreComuna(comuna.getNombreComuna());
			comunaDTO.setNombreComunaLower(comuna.getNombreComunaLower());
			comunaDTO.setIdRegion(comuna.getIdRegion());
		}
		return comunaDTO;
	}

	public static List<ComunaDTO> ListComunaModelToListComunaDTO(List<ComunaModel> listaComunaModel){

		List<ComunaDTO> listaComunaDTO=new ArrayList<ComunaDTO>();

		if(listaComunaModel==null || listaComunaModel.size()==0){
			return new ArrayList<ComunaDTO>();
		}
		else{
			listaComunaDTO=new ArrayList<ComunaDTO>();
			
			ComunaDTO comunaDTO=new ComunaDTO();

			for(ComunaModel com: listaComunaModel){
				comunaDTO=new ComunaDTO();
				
				comunaDTO = ComunaModelToComunaDTO(com);

				listaComunaDTO.add(comunaDTO);
			}
		}

		return listaComunaDTO;
	}
}
