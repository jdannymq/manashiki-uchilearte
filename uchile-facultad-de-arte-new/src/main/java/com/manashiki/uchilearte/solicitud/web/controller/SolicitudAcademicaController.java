package com.manashiki.uchilearte.solicitud.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.solicitud.web.controller.impl.AcademicaImpl;




/**
 * Servlet implementation class PostulacionController
 */
public class SolicitudAcademicaController extends HttpServlet {
	
	private static final long serialVersionUID = 6098745782027999297L;
	private static final Logger logger = Logger.getLogger(SolicitudCertificadoController.class);
	Gson g = new Gson();	
	AcademicaImpl academicaImpl = new AcademicaImpl();
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SolicitudAcademicaController() {
        super();
        
    }
	
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		logger.info("Inicializando Postulaciones Controller.");
		try {
			
			academicaImpl.llamarRemoteCommandSeguridad();
			ProgramaUniversidadDTO programa = new ProgramaUniversidadDTO();
			programa.setIdProgramaUniversidad(0);
			programa.setNombreProgramaUniversidad("Seleccionar Programa");
			academicaImpl.getListaProgramaUniversidadDTO().add(0, programa);
			
			
			String listaPrograma = g.toJson(academicaImpl.getListaProgramaUniversidadDTO());
			String listaTipoSolicitudes = g.toJson(academicaImpl.getListaTipoSolicitudDTO());
			
			logger.info("Se cargaron las listas");
			
			request.setAttribute("listaPrograma", listaPrograma);
			request.setAttribute("listaTipoSolicitudes", listaTipoSolicitudes);
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
			
			request.getRequestDispatcher("/main/view/solicitud-academica.jsp").forward(request, response);
			logger.info("Pintando pagina de Postulaciones del alumno.");
	
		} 
		catch (Exception e) {
			logger.error("Exception: "+e.getMessage(), e);
			request.setAttribute("listaPrograma", "[]");
			request.setAttribute("listaTipoSolicitudes", "[]");
			request.setAttribute("Archivo", "{'archivo':'No tiene Archivo'}");
			request.setAttribute("Error", "{'mensajeError':'Error de los servicios interno'}");
			request.getRequestDispatcher("/main/view/solicitud-academica.jsp").forward(request, response);
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
