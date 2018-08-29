package com.manashiki.uchilearte.servicio.impl.utilidades;

import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;


public class UchileArteServicioUtilidades {

	/*******************************/
	ObjectMapper objectMapper;

	SimpleDateFormat sdf;

	//	public T retonarSolicitudDTO(String valorContenido, Class<T> typeResponse){
	public int retonarSolicitudDTO(String valorContenido){
		try {
			if(objectMapper==null){
				objectMapper = new ObjectMapper();

				sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

				objectMapper.setDateFormat(sdf);

				objectMapper.configure(DeserializationConfig.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
			}
			try{
				if(objectMapper.readValue(valorContenido, SolicitudCertificadoDTO.class) instanceof SolicitudCertificadoDTO){
					return 1;
				}
			}catch(Exception e){

			}
			try{
				if(objectMapper.readValue(valorContenido, SolicitudAcademicaDTO.class) instanceof SolicitudAcademicaDTO){
					return 2;
				}
			}catch(Exception e){

			}
			try{
				if(objectMapper.readValue(valorContenido, SolicitudPostulacionDTO.class) instanceof SolicitudPostulacionDTO){
					return 3;
				}
			}catch(Exception e){

			}


			//			return  (T) attrWrapper;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

} 