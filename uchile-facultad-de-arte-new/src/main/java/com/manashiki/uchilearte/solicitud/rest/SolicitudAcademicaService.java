package com.manashiki.uchilearte.solicitud.rest;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.solicitud.dto.ResponseTo;
import com.manashiki.uchilearte.solicitud.web.controller.impl.AcademicaImpl;
import com.manashiki.uchilearte.solicitud.web.model.SolicitudAcademicaModel;

import vijnana.respuesta.wrapper.response.Respuesta;
import vijnana.utilidades.component.utilidades.JsonMappeo;


@Path("/SolicitudAcademicaService")
public class SolicitudAcademicaService {
	
	private static final Logger logger = Logger.getLogger(SolicitudPostulacionService.class);
	AcademicaImpl academicaImpl = new AcademicaImpl();
	Gson g = new Gson();	
	
	@POST
    @Path("/almacenarSolicitudAcademicaPagoOffline")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public String obtenerListadoCertificados(
    									@FormParam("requestJson") String jsonParametrosBusquedaRequest,
    									@Context HttpServletResponse servletResponse) throws IOException {
		logger.info("Inicio validación de postulación.");
		logger.info(jsonParametrosBusquedaRequest);
		Gson g = new Gson();
		SolicitudAcademicaModel dataSolicitud = new SolicitudAcademicaModel();
		ResponseTo data = new ResponseTo();
		String jsonResultado = "";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			
			academicaImpl.iniciliazarFormulario();
			dataSolicitud = objectMapper.readValue(jsonParametrosBusquedaRequest, SolicitudAcademicaModel.class);
			System.out.println("data :: " + g.toJson(dataSolicitud));

			if(academicaImpl.getSolicitudAcademicaDTO() == null){
				academicaImpl.setSolicitudAcademicaDTO(new SolicitudAcademicaDTO());
			}
			
			academicaImpl.getSolicitudAcademicaDTO().setNombrePersonaSolicitudAcademica(dataSolicitud.getNombrePersonaSolicitudAcademica());
			academicaImpl.getSolicitudAcademicaDTO().setApellidoPaternoPersonaSolicitudAcademica(dataSolicitud.getApellidoPaternoPersonaSolicitudAcademica());
			academicaImpl.getSolicitudAcademicaDTO().setApellidoMaternoPersonaSolicitudAcademica(dataSolicitud.getApellidoMaternoPersonaSolicitudAcademica());
			academicaImpl.getSolicitudAcademicaDTO().setRutPersonaSolicitudAcademica(dataSolicitud.getRutPersonaSolicitudAcademica());
			academicaImpl.getSolicitudAcademicaDTO().setIdProgramaUniversidad(dataSolicitud.getIdProgramaUniversidad());
			academicaImpl.getSolicitudAcademicaDTO().setProgramaUniversidad(dataSolicitud.getProgramaUniversidad());
			academicaImpl.getSolicitudAcademicaDTO().setMailMember(dataSolicitud.getMailMember());
			academicaImpl.getSolicitudAcademicaDTO().setAnhoIngreso(dataSolicitud.getAnhoIngreso());
			academicaImpl.getSolicitudAcademicaDTO().setIdTipoSolicitud(dataSolicitud.getIdTipoSolicitud());
			academicaImpl.getSolicitudAcademicaDTO().setTipoSolicitud(dataSolicitud.getTipoSolicitud());
			academicaImpl.getSolicitudAcademicaDTO().setFundamentacionSolicitud(dataSolicitud.getFundamentacionSolicitud());
			academicaImpl.getSolicitudAcademicaDTO().setArchivoAdjunto(dataSolicitud.isArchivoAdjunto());
			academicaImpl.getSolicitudAcademicaDTO().setNombreArchivo(dataSolicitud.getNombreArchivo());
			academicaImpl.getSolicitudAcademicaDTO().setIdArchivoSolicitud(dataSolicitud.getIdArchivoSolicitud());
	
			academicaImpl.setArchivoSolicitudDTO(dataSolicitud.getArchivo());
			academicaImpl.setProgramaUniversidadDTO(dataSolicitud.getProgramaUniversidadDTO());
			academicaImpl.setTipoSolicitudDTO(dataSolicitud.getTipoSolicitudDTO());
			
			/*hay que validar antes de enivar la información*/
//			
//			data.setEstado("EXITO");
//			data.setMensaje("Fue envianda la solicitd de certificado");
//			data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-academica-exito.jsp");
//			jsonResultado = JsonMappeo.convertirObjectToJson(data);	
			

		} catch (Exception e) {
			logger.error("Exception en el seteo de los datos para la solicitud de certificado: "+e.getMessage(), e);
			data.setEstado("ERROR");
			data.setMensaje("Exception en el seteo de los datos para la solicitud de certificado");
			data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-academia-error.jsp");
			jsonResultado = JsonMappeo.convertirObjectToJson(data);
			return jsonResultado;
		}		
		
		logger.info("################################## Siguiente Paso Almacenar dato ###################################################");
		try{
			boolean valido = academicaImpl.validarLlenadoFormulario(academicaImpl.getSolicitudAcademicaDTO());
			if(valido){
				boolean guardado = academicaImpl.almacenarSolicitudAcademicaPagoOffline();
				if(guardado){
					data.setEstado("EXITO");
					data.setMensaje("Fue envianda la solicitd de academica");
					data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-academica-exito.jsp");
					jsonResultado = JsonMappeo.convertirObjectToJson(data);		
				}else{
					logger.error("Error en el metodo almacenarSolicitudAcademicaPagoOffline");
					data.setEstado("ERROR");
					data.setMensaje("Exception en el seteo de los datos para la solicitud de academica");
					data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-academia-error.jsp");
					jsonResultado = JsonMappeo.convertirObjectToJson(data);
				}
			}else{
				logger.error("Error en el metodo almacenarSolicitudAcademicaPagoOffline");
				data.setEstado("ERROR");
				data.setMensaje("Exception en el seteo de los datos para la solicitud de academica");
				data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-academia-error.jsp");
				jsonResultado = JsonMappeo.convertirObjectToJson(data);
			}
		}catch(Exception e){
			logger.error("Exception No fue posible enviar la solicitud del academica. "+e.getMessage(), e);
			data.setEstado("ERROR");
			data.setMensaje("Exception en el seteo de los datos para la solicitud de academica");
			data.setUrl("uchile-facultad-de-arte-new/main/view/solicitud-academia-error.jsp");
			jsonResultado = JsonMappeo.convertirObjectToJson(data);
			return jsonResultado;			
		}
        return jsonResultado;
	}
	

	@POST
    @Path("/subirArchivo")
    @Produces(MediaType.APPLICATION_JSON)
    public String subirArchivo(@Context HttpServletRequest servletRequest, @Context HttpServletResponse servletResponse) {

		String archivo = "{'archivo':'No tiene Archivo'}";
		try {
				logger.info("iniciando la subida de archivo en la pagina de postulaciones.");
				academicaImpl.llamarRemoteCommandSeguridad();
				String nombreArchivoFinal = ""; 
			    String primerosdatos = "";
			    String segundodatos = "";
			    
			    InputStream inStream = servletRequest.getInputStream(); 
			    InputStreamReader reader = new InputStreamReader(inStream);
			    BufferedReader bReader = new BufferedReader(reader);

			    StringBuffer sb = new StringBuffer();
			    String inputLine;
			    int contador = 0;
			    while ((inputLine = bReader.readLine()) != null) {
			    	 	if(contador == 1){
			    	 		primerosdatos = inputLine;
			    	 	}
			    	 	if(contador == 2){
			    	 		segundodatos = inputLine;
			    	 	}
			    	 	sb.append(inputLine).append('\n');
			    	 	contador++;
				    	
			        sb.append(inputLine);
			        sb.append("\n");
			    }

			    String[] arrayDatos = null;
			   try { 
				    if(primerosdatos != null && segundodatos != null){
				    	 StringBuilder cadena = new  StringBuilder(primerosdatos);
				    	 cadena.append(";");
				    	 cadena.append(segundodatos);
				    	 cadena.append(";");
				    	 arrayDatos = cadena.toString().split(";");
				    	 if(arrayDatos != null && arrayDatos.length > 0){
				    		 logger.info(arrayDatos[2]);
				    		 String[] arrayNombreArchivo= arrayDatos[2].split("=");
				    		 if(arrayNombreArchivo != null && arrayNombreArchivo.length > 0){
				    			 nombreArchivoFinal = arrayNombreArchivo[1].replaceAll("\"","");
				    		 }
				    	 }
				     }
				    
					 try{

						   InputStream readerNew = servletRequest.getInputStream(); 
						   File f = new File(nombreArchivoFinal);		//Aqui le dan el nombre y/o con la ruta del archivo salida
						   OutputStream salida=new FileOutputStream(f);
						   byte[] buf =new byte[1024];					//Actualizado me olvide del 1024
						   int len;
						   while((len=readerNew.read())>0){
						      salida.write(buf,0,len);
						   }
						   
						   InputStream is = null;
						   byte[] contenido = null;
						       try {
							           is = new ByteArrayInputStream(sb.toString().getBytes("UTF-8"));
							           contenido = sb.toString().getBytes("UTF-8");
							           logger.info("se ha transformado a un archivo .-.!!"+ contenido );
						       } catch (UnsupportedEncodingException e) {
						            e.printStackTrace();
						       }
						       academicaImpl.handleFileUpload(nombreArchivoFinal,is, f, contenido);
				          
							 
						   salida.close();
						   readerNew.close();
					  }catch(IOException e){
						  logger.error("Se produjo el error : "+e.toString());
					  }
			    } finally { 
			     reader.close(); 
			    } 
			  
			   ArchivoSolicitudDTO archivoGuardado = (academicaImpl.getArchivoSolicitudDTO()!= null) ? academicaImpl.getArchivoSolicitudDTO(): null; 
			   if(archivoGuardado != null){
				   archivo = g.toJson(archivoGuardado);
				   Respuesta res = new Respuesta();
				   res.setCantidadResultados(1);
				   res.setTiempoRespuesta(archivo);
				   res.setOk(true);
				   res.setTipoMetodo("subir_archivo");
				   return g.toJson(res);

			   }

			   logger.info("archivo subido y el objeto esta trasnformado de json.");
				
		} catch (Exception e) {
			logger.error("Exception: "+e.getMessage(), e);
			e.printStackTrace();
			logger.info("Pintando pagina de Postulaciones del alumno, error al subir el archivo adjunto.");
			archivo = "{'archivo':'No tiene Archivo'}";
		}
		logger.info("se sube archivo con exito");
		
        return archivo;
    }
	
}
