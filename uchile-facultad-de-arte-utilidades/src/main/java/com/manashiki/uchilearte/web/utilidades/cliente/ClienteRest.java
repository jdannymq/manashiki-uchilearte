package com.manashiki.uchilearte.web.utilidades.cliente;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
import com.manashiki.uchilearte.web.utilidades.properties.UchileProperties;

import vijnana.respuesta.wrapper.request.*;
import vijnana.respuesta.wrapper.response.Wrapper;
import vijnana.utilidades.component.utilidades.Ip;
import vijnana.wsrest.client.IClientWsRest;
import vijnana.wsrest.client.exception.VijnanaClientException;
import vijnana.wsrest.client.impl.ClienteWsRest;

public class ClienteRest {
	
	private static Logger objLog = LoggerFactory.getLogger(ClienteRest.class);

	public UchileArte get(){
		
		try {
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new UchileArte();
	}
	
	@SuppressWarnings("unchecked")
	public UchileArte post(RequestProductoDTO requestProductoDTO, String urlMetodo){
		
		UchileArte data = null;
		
		try {
			@SuppressWarnings("rawtypes")
			IClientWsRest clientWsRest = new ClienteWsRest();
			
			data = (UchileArte) clientWsRest.post(requestProductoDTO, RequestProductoDTO.class, UchileArte.class,  UchileProperties.getVijnanaServidor(), urlMetodo);
			
		} catch (VijnanaClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
		// TODO Auto-generated catch block
		}
		
		return data;
	}
	
	
	public void postEmail(RequestProductoDTO requestProductoDTO, String idAplicacion, String idEmail, String key, String urlEnvioMailCertificado){
		
		try {
			ConsultaWebmail consultaWebmail = new ConsultaWebmail();
			
			consultaWebmail.setRequest(ClienteRestUtilidades.obtenerContenidoRequestByMail(requestProductoDTO, idAplicacion, idEmail));

			consultaWebmail.setKeySession(key);
			consultaWebmail.setRemoteAddr(Ip.direccionServer());
			consultaWebmail.setIdEmail(idEmail);
			consultaWebmail.setIdAplicacion(idAplicacion);
			
			postEmail(consultaWebmail, urlEnvioMailCertificado);
			
		} catch (Exception e) {
		// TODO Auto-generated catch block
		}
	}
	
	@SuppressWarnings("unchecked")
	public void postEmail(ConsultaWebmail consultaWebmail, String urlEnvioMailCertificado){
		
		try {
			
			@SuppressWarnings("rawtypes")
			IClientWsRest clientWsRest = new ClienteWsRest();
			
			clientWsRest.post(consultaWebmail, ConsultaWebmail.class, Wrapper.class,  UchileProperties.getVijnanaServidor(), urlEnvioMailCertificado);
			
		} catch (VijnanaClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
		// TODO Auto-generated catch block
			
		}
	}
	
}
