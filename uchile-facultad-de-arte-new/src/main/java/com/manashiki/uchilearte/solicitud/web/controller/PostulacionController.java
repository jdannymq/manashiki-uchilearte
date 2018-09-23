package com.manashiki.uchilearte.solicitud.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.solicitud.web.controller.impl.PostulacionImpl;




/**
 * Servlet implementation class PostulacionController
 */
public class PostulacionController extends HttpServlet {
	
	private static final long serialVersionUID = 6098745782027999297L;
	private static final Logger logger = Logger.getLogger(SolicitudCertificadoController.class);
	Gson g = new Gson();	
	PostulacionImpl postulacionImpl = new PostulacionImpl();
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostulacionController() {
        super();
        
    }
	
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		logger.info("Inicializando Postulaciones Controller.");
		try {
			
			postulacionImpl.llamarRemoteCommandSeguridad();
			ProgramaUniversidadPostulacionDTO postulacion = new ProgramaUniversidadPostulacionDTO();
			postulacion.setIdProgramaUniversidadPostulacion(0);
			postulacion.setNombreProgramaUniversidadPostulacion("Seleccionar Programa");
			postulacionImpl.getListaProgramaUniversidadPostulacionDTO().add(0, postulacion);
			
			RegionDTO region = new RegionDTO();
			region.setIdRegion(0);
			region.setNombreRegion("Seleccione Región");
			postulacionImpl.getListaRegionesDTO().add(0, region);
			
			String listaPrograma = g.toJson(postulacionImpl.getListaProgramaUniversidadPostulacionDTO());
			String listaRegiones = g.toJson(postulacionImpl.getListaRegionesDTO());
			
			logger.info("Se cargaron las listas");
			
			request.setAttribute("listaPrograma", listaPrograma);
			request.setAttribute("listaRegiones", listaRegiones);
			request.setAttribute("Error", "{'mensajeError':''}");
			/*verificacion de archivo*/
			try{
				String arhcivoPrueba =  (String) request.getAttribute("Archivo");
				if(arhcivoPrueba != null){
					logger.info("contiene archivo");
				}else{
					logger.info("no contiene archivo, setear archivo vacio");
					request.setAttribute("Archivo", "{'archivo':'No tiene Archivo'}");
				}
								
			}catch (Exception e) {
				logger.info("no contiene archivo, setear archivo vacio");
				request.setAttribute("Archivo", "{'archivo':'No tiene Archivo'}");
			}
			/*fin d ela verificacion*/
			
			
			request.getRequestDispatcher("/main/view/solicitud-postulacion.jsp").forward(request, response);
			logger.info("Pintando pagina de Postulaciones del alumno.");
	
		} 
		catch (Exception e) {
			logger.error("Exception: "+e.getMessage(), e);
			request.setAttribute("listaPrograma", "[]");
			request.setAttribute("listaRegiones", "[]");
			request.setAttribute("Archivo", "{'archivo':'No tiene Archivo'}");
			request.setAttribute("Error", "{'mensajeError':'Error de los servicios interno'}");
			request.getRequestDispatcher("/main/view/solicitud-postulacion.jsp").forward(request, response);
			logger.info("Pintando pagina de Postulaciones del alumno. pasando por el error.");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	
	}
}
