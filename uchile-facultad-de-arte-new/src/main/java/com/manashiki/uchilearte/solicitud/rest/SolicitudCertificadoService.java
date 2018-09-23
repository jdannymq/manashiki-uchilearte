package com.manashiki.uchilearte.solicitud.rest;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.solicitud.dto.ResponseTo;
import com.manashiki.uchilearte.solicitud.web.controller.impl.SolicitudCertificadoImpl;
import com.manashiki.uchilearte.solicitud.web.model.SolicitudCertificadoModel;

import vijnana.utilidades.component.utilidades.JsonMappeo;


@Path("/SolicitudCertificadoService")
public class SolicitudCertificadoService {
	
	private static final Logger logger = Logger.getLogger(SolicitudCertificadoService.class);
	
	@POST
    @Path("/almacenarSolicitudCertificadoPagoOffline")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String obtenerListadoCertificados(
    									@FormParam("requestJson") String jsonParametrosBusquedaRequest,
    									@Context HttpServletResponse servletResponse) throws IOException {
		logger.info("Inicio validación de Certificados.");
		logger.info(jsonParametrosBusquedaRequest);
		Gson g = new Gson();
		SolicitudCertificadoModel dataSolicitud = new SolicitudCertificadoModel();
		SolicitudCertificadoImpl solicitudCertificadoImpl = new SolicitudCertificadoImpl();
		ResponseTo data = new ResponseTo();
		String jsonResultado = "";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			
			solicitudCertificadoImpl.iniciliazarFormulario();
			dataSolicitud = objectMapper.readValue(jsonParametrosBusquedaRequest, SolicitudCertificadoModel.class);

			if(solicitudCertificadoImpl.getSolicitudCertificadoDTO() == null){
				solicitudCertificadoImpl.setSolicitudCertificadoDTO(new SolicitudCertificadoDTO());
			}
			solicitudCertificadoImpl.setProgramaUniversidadDTO(dataSolicitud.getPrograma());
			solicitudCertificadoImpl.setFinalidadCertificado(dataSolicitud.getFinalidadCertificado());
			
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setAnhoIngreso(dataSolicitud.getAnhoIngreso());
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setRutPersonaSolicitudCertificado(dataSolicitud.getRutPersonaSolicitudCertificado());
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setNombrePersonaSolicitudCertificado(dataSolicitud.getNombrePersonaSolicitudCertificado());
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setApellidoMaternoPersonaSolicitudCertificado(dataSolicitud.getApellidoMaternoPersonaSolicitudCertificado());
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setApellidoPaternoPersonaSolicitudCertificado(dataSolicitud.getApellidoPaternoPersonaSolicitudCertificado());
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setMailMember(dataSolicitud.getMailMember());
			
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setDescripcionEstadoSolicitud("enviado");
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setEstadoSolicitud(0);
			solicitudCertificadoImpl.getSolicitudCertificadoDTO().setFechaSolicitud(new Date());
			if(solicitudCertificadoImpl.getFinalidadCertificado() != null){
				solicitudCertificadoImpl.getSolicitudCertificadoDTO().setFinalidadCertificado(solicitudCertificadoImpl.getFinalidadCertificado().getNombreFinalidadCertificado());	
				solicitudCertificadoImpl.getSolicitudCertificadoDTO().setIdFinalidadCertificado(solicitudCertificadoImpl.getFinalidadCertificado().getIdFinalidadCertificado());
			}
			if(solicitudCertificadoImpl.getProgramaUniversidadDTO() != null){
				solicitudCertificadoImpl.getSolicitudCertificadoDTO().setIdProgramaUniversidad(solicitudCertificadoImpl.getProgramaUniversidadDTO().getIdProgramaUniversidad());
				solicitudCertificadoImpl.getSolicitudCertificadoDTO().setProgramaUniversidad(solicitudCertificadoImpl.getProgramaUniversidadDTO().getNombreProgramaUniversidad());
				solicitudCertificadoImpl.setSelecPrograma(solicitudCertificadoImpl.getProgramaUniversidadDTO().getIdProgramaUniversidad());
			}
			
			if(dataSolicitud.getTipoCertificado() != null){
				solicitudCertificadoImpl.getSolicitudCertificadoDTO().setIdTipoCertificado(dataSolicitud.getTipoCertificado().getIdTipoCertificado());
				solicitudCertificadoImpl.getSolicitudCertificadoDTO().setTipoCertificado(dataSolicitud.getTipoCertificado().getNombreTipoCertificado());				
			}

			/*hay que validar antes de enivar la información*/
			
			
			

		} catch (Exception e) {
			logger.error("Exception en el seteo de los datos para la solicitud de certificado: "+e.getMessage(), e);
			data.setEstado("ERROR");
			data.setMensaje("Exception en el seteo de los datos para la solicitud de certificado");
			data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-certificado-error.jsp");
			jsonResultado = JsonMappeo.convertirObjectToJson(data);
			return jsonResultado;
		}		
		
		logger.info("################################## Siguiente Paso Almacenar dato ###################################################");
		try{
			solicitudCertificadoImpl.almacenarSolicitudCertificadoPagoOffline();
			data.setEstado("EXITO");
			data.setMensaje("Fue envianda la solicitd de certificado");
			data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-certificado-exito.jsp");
			jsonResultado = JsonMappeo.convertirObjectToJson(data);
			
		}catch(Exception e){
			logger.error("Exception No fue posible enviar la solicitud del certificado. "+e.getMessage(), e);
			data.setEstado("ERROR");
			data.setMensaje("Exception en el seteo de los datos para la solicitud de certificado");
			data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-certificado-error.jsp");
			jsonResultado = JsonMappeo.convertirObjectToJson(data);
			return jsonResultado;			
		}
        return jsonResultado;
	}
	

	@POST
    @Path("/levantarFicha")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String levantarFichaHotel(
    									@FormParam("requestJson") String jsonParametrosRequest,
    									@FormParam("hotelJson") String jsonHotelRequest,
    									@Context HttpServletResponse servletResponse) {
		logger.info("Levantando Ficha.");
		logger.info(jsonParametrosRequest);
		
		try {
			logger.info("LLamar persistir paso 2: ");
			
		} catch (Exception e) {
			logger.error("Exception: "+e.getMessage(), e);

		}
		
		logger.info("Fin Levantando Ficha");
		
        return "";
    }
	
	@POST
    @Path("/obtenerDetalleHotel")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String obtenerDetalleHotel(
    									@FormParam("requestJson") String jsonParametrosRequest,
    									@FormParam("hotelJson") String jsonHotelRequest,
    									@Context HttpServletResponse servletResponse) {
		logger.info("Levantando Ficha.");
		logger.info(jsonParametrosRequest);
		
		try {
	
			
	
				
		} catch (Exception e) {
			logger.error("Exception: "+e.getMessage(), e);
			
		}
		
		logger.info("Fin Levantando Ficha");
		
        return "";
    }
	
}
