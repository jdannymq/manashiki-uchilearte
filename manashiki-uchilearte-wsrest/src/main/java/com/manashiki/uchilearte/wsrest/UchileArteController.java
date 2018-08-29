package com.manashiki.uchilearte.wsrest;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;
import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
import com.manashiki.uchilearte.servicio.FactoryServicio;
import com.manashiki.uchilearte.wrapper.WrapperUchileArte;
//import com.manashiki.uchilearte.wrapper.WrapperUchileArte;

import vijnana.utilidades.component.utilidades.AppDate;

@Component
@Path("/uchileArte")
public class UchileArteController {


	@Context
	private HttpServletRequest request;

	@Autowired
	FactoryServicio factoryServicio;

	@GET
	@Path("/prueba/{cadena}")
	@Produces({ "application/json" })
	public Response pruebaJson(@PathParam("cadena") String variable) {

		String responseGG = ".. servicio rest uchilearte 19-11-2016";

		return Response.status(201).entity(responseGG).build();
	}

	@POST
	@Path("/listarProgramaUniversidad")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaUniversidad(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<ProgramaUniversidadDTO> retListaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaProgramaUniversidadDTO=factoryServicio.getProgramaUniversidadServicio().listarProgramaUniversidadesDTO();//Traer Todos

		if(retListaProgramaUniversidadDTO!=null && retListaProgramaUniversidadDTO.size()>0){
			cantidadResultados = retListaProgramaUniversidadDTO.size();
		}

		uchileArte.setListaProgramaUniversidadDTO(retListaProgramaUniversidadDTO);
		/*-------------------------------------------------------------------------------------------------------------*/
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), new vijnana.respuesta.wrapper.response.Error(),
				this.request.getMethod(), uchileArte);
		wrapperUchileArte.setData(uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
		

	}

	@POST
	@Path("/listarProgramaUniversidadConPrecio")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaUniversidadesConPrecio(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<ProgramaUniversidadDTO> retListaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();

		/*-------------------------------------------------------------------------------------------------------------*/
		retListaProgramaUniversidadDTO=factoryServicio.getProgramaUniversidadServicio().listarProgramaUniversidadesConPrecioDTO();

		if(retListaProgramaUniversidadDTO!=null && retListaProgramaUniversidadDTO.size()>0){
			cantidadResultados = retListaProgramaUniversidadDTO.size();
		}

		uchileArte.setListaProgramaUniversidadDTO(retListaProgramaUniversidadDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);


		return Response.status(201).entity(wrapperUchileArte).build();

	}
	
	@POST
	@Path("/listarProgramaUniversidadPostulacionConPrecio")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaUniversidadPostulacionConPrecio(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<ProgramaUniversidadPostulacionDTO> retListaProgramaUniversidadPostulacionDTO = new ArrayList<ProgramaUniversidadPostulacionDTO>();

		/*-------------------------------------------------------------------------------------------------------------*/
		retListaProgramaUniversidadPostulacionDTO=factoryServicio.getProgramaUniversidadPostulacionServicio().listarProgramaUniversidadPostulacionConPrecioDTO();

		if(retListaProgramaUniversidadPostulacionDTO!=null && retListaProgramaUniversidadPostulacionDTO.size()>0){
			cantidadResultados = retListaProgramaUniversidadPostulacionDTO.size();
		}

		uchileArte.setListaProgramaUniversidadPostulacionDTO(retListaProgramaUniversidadPostulacionDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);


		return Response.status(201).entity(wrapperUchileArte).build();

	}
	
	@POST
	@Path("/listarProgramaUniversidadPostulacion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarProgramaUniversidadPostulacion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<ProgramaUniversidadPostulacionDTO> retListaProgramaUniversidadPostulacionDTO = new ArrayList<ProgramaUniversidadPostulacionDTO>();

		/*-------------------------------------------------------------------------------------------------------------*/
		retListaProgramaUniversidadPostulacionDTO=factoryServicio.getProgramaUniversidadPostulacionServicio().listarProgramaUniversidadPostulacionDTO();

		if(retListaProgramaUniversidadPostulacionDTO!=null && retListaProgramaUniversidadPostulacionDTO.size()>0){
			cantidadResultados = retListaProgramaUniversidadPostulacionDTO.size();
		}

		uchileArte.setListaProgramaUniversidadPostulacionDTO(retListaProgramaUniversidadPostulacionDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);


		return Response.status(201).entity(wrapperUchileArte).build();

	}


	/******** Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado****/
	@POST
	@Path("/listarTipoCertificados")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarTipoCertificados(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<TipoCertificadoDTO> retListaTipoCertificadoDTO = new ArrayList<TipoCertificadoDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaTipoCertificadoDTO=factoryServicio.getTipoCertificadoServicio().listarTipoCertificadosDTO();//Traer Todos

		if(retListaTipoCertificadoDTO!=null && retListaTipoCertificadoDTO.size()>0){
			cantidadResultados = retListaTipoCertificadoDTO.size();
		}

		uchileArte.setListaTipoCertificadoDTO(retListaTipoCertificadoDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();

	}


	@POST
	@Path("/listarFinalidadCertificados")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarFinalidadCertificados(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<FinalidadCertificadoDTO> retListaFinalidadCertificadoDTO = new ArrayList<FinalidadCertificadoDTO>();
		// Mostrar Todo
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaFinalidadCertificadoDTO=factoryServicio.getFinalidadCertificadoServicio().listarFinalidadCertificadosDTO();//Traer Todos

		if(retListaFinalidadCertificadoDTO!=null && retListaFinalidadCertificadoDTO.size()>0){
			cantidadResultados = retListaFinalidadCertificadoDTO.size();
		}

		uchileArte.setListaFinalidadCertificadoDTO(retListaFinalidadCertificadoDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}


	@POST
	@Path("/crearSolicitudCertificado")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearSolicitudCertificado(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		// Mostrar Todo
		/*-------------------------------------------------------------------------------------------------------------*/
		SolicitudCertificadoDTO solicitudCertificadoDTO = factoryServicio.getSolicitudCertificadoServicio().crearSolicitudCertificadoDTO(requestProductoDTO.getSolicitudCertificadoDTO());

		cantidadResultados = 1;

		uchileArte.setSolicitudCertificadoDTO(solicitudCertificadoDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	
	}


	@POST
	@Path("/listarSolicitudCertificados")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudCertificados(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<SolicitudCertificadoDTO> retSolicitudCertificadoDTO = new ArrayList<SolicitudCertificadoDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retSolicitudCertificadoDTO = factoryServicio.getSolicitudCertificadoServicio().listarSolicitudCertificadosDTO();

		if(retSolicitudCertificadoDTO!=null && retSolicitudCertificadoDTO.size()>0){
			cantidadResultados = retSolicitudCertificadoDTO.size();
		}

		uchileArte.setListaSolicitudCertificadoDTO(retSolicitudCertificadoDTO);
		/*-------------------------------------------------------------------------------------------------------------*/
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarSolicitudCertificadoxEntreFechas")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarSolicitudCertificadoxEntreFechas(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<SolicitudCertificadoDTO> retListaSolicitudCertificadoDTO = new ArrayList<SolicitudCertificadoDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaSolicitudCertificadoDTO = factoryServicio.getSolicitudCertificadoServicio().listarSolicitudCertificadoxEntreFechasDTO(requestProductoDTO.getListaSolicitudCertificadoDTO().get(0), requestProductoDTO.getListaSolicitudCertificadoDTO().get(1));

		if(retListaSolicitudCertificadoDTO!=null && retListaSolicitudCertificadoDTO.size()>0){
			cantidadResultados = retListaSolicitudCertificadoDTO.size();
		}

		uchileArte.setListaSolicitudCertificadoDTO(retListaSolicitudCertificadoDTO);
		/*-------------------------------------------------------------------------------------------------------------*/
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);
		
		return Response.status(201).entity(wrapperUchileArte).build();
//		return Response.status(Status.OK).entity(wrapperUchileArte).build();
		
//		String jsonRetorno = MapperWrapper.mapperWrapper(wrapperUchileArte);
//		
//		
//		return Response.status(201).entity(jsonRetorno).build();
	}

	/******** Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado  Solicitudes Certificado****/
	/******** Solicitudes Academicas  Solicitudes Academicas  Solicitudes Academicas  Solicitudes Academicas  Solicitudes Academicas  Solicitudes Academicas *********/


	@POST
	@Path("/listarTipoSolicitudes")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarTipoSolicitudes(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<TipoSolicitudDTO> retListaTipoSolicitudDTO = new ArrayList<TipoSolicitudDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaTipoSolicitudDTO=factoryServicio.getTipoSolicitudServicio().listarTipoSolicitudesDTO();

		if(retListaTipoSolicitudDTO!=null && retListaTipoSolicitudDTO.size()>0){
			cantidadResultados = retListaTipoSolicitudDTO.size();
		}

		uchileArte.setListaTipoSolicitudDTO(retListaTipoSolicitudDTO);
		/*-------------------------------------------------------------------------------------------------------------*/
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();

	}

	@POST
	@Path("/crearArchivoSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearArchivoSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		/*-------------------------------------------------------------------------------------------------------------*/
		ArchivoSolicitudDTO metArchivoSolicitudAcademicaDTO = factoryServicio.getArchivoSolicitudServicio().crearArchivoSolicitudDTO(requestProductoDTO.getArchivoSolicitudDTO());


		cantidadResultados = 1;

		uchileArte.setArchivoAcademicaDTO(metArchivoSolicitudAcademicaDTO);
		/*-------------------------------------------------------------------------------------------------------------*/
		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}


	@POST
	@Path("/actualizarArchivoSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response actualizarArchivoSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		/*-------------------------------------------------------------------------------------------------------------*/

		ArchivoSolicitudDTO metArchivoSolicitudAcademicaDTO = factoryServicio.getArchivoSolicitudServicio().actualizarArchivoSolicitudDTO(requestProductoDTO.getArchivoSolicitudDTO());

		cantidadResultados = 1;
		
		uchileArte.setArchivoAcademicaDTO(metArchivoSolicitudAcademicaDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/crearSolicitudAcademica")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearSolicitudAcademica(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		/*-------------------------------------------------------------------------------------------------------------*/
		SolicitudAcademicaDTO solicitudAcademicaDTO = factoryServicio.getSolicitudAcademicaServicio().crearSolicitudAcademicaDTO(requestProductoDTO.getSolicitudAcademicaDTO());

		cantidadResultados = 1;
		
		uchileArte.setSolicitudAcademicaDTO(solicitudAcademicaDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarSolicitudAcademicas")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudAcademicas(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<SolicitudAcademicaDTO> retListaSolicitudAcademicaDTO = new ArrayList<SolicitudAcademicaDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaSolicitudAcademicaDTO = factoryServicio.getSolicitudAcademicaServicio().listarSolicitudAcademicasDTO();

		if(retListaSolicitudAcademicaDTO!=null && retListaSolicitudAcademicaDTO.size()>0){
			cantidadResultados = retListaSolicitudAcademicaDTO.size();
		}

		uchileArte.setListaSolicitudAcademicaDTO(retListaSolicitudAcademicaDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarSolicitudAcademicaxEntreFechas")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudAcademicaxEntreFechas(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<SolicitudAcademicaDTO> retListaSolicitudAcademicaDTO = new ArrayList<SolicitudAcademicaDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaSolicitudAcademicaDTO = factoryServicio.getSolicitudAcademicaServicio().listarSolicitudAcademicaxEntreFechasDTO(requestProductoDTO.getListaSolicitudAcademicaDTO().get(0), requestProductoDTO.getListaSolicitudAcademicaDTO().get(1));

		if(retListaSolicitudAcademicaDTO!=null && retListaSolicitudAcademicaDTO.size()>0){
			cantidadResultados = retListaSolicitudAcademicaDTO.size();
		}

		uchileArte.setListaSolicitudAcademicaDTO(retListaSolicitudAcademicaDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);
		
		return Response.status(201).entity(wrapperUchileArte).build();
//		return Response.status(Status.OK).entity(wrapperUchileArte).build();
		
//		String jsonRetorno = MapperWrapper.mapperWrapper(wrapperUchileArte);
//		
//		return Response.status(201).entity(jsonRetorno).build();
	}

	@POST
	@Path("/buscarArchivoSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response buscarArchivoSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		/*-------------------------------------------------------------------------------------------------------------*/
		try{
			ArchivoSolicitudDTO archivoSolicitudDTO = factoryServicio.getArchivoSolicitudServicio().buscarArchivoSolicitudIdDTO(requestProductoDTO.getArchivoSolicitudDTO());

			cantidadResultados = 1;

			uchileArte.setArchivoAcademicaDTO(archivoSolicitudDTO);
		}catch(Exception e){

		}
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarRegiones")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarRegiones(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<RegionDTO> retListaRegionDTO = new ArrayList<RegionDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaRegionDTO = factoryServicio.getRegionServicio().listarRegionesDTO();

		if(retListaRegionDTO!=null && retListaRegionDTO.size()>0){
			cantidadResultados = retListaRegionDTO.size();
		}

		uchileArte.setListaRegionDTO(retListaRegionDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/listarComunasxRegion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarComunasxRegion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<ComunaDTO> retListaComunaDTO = new ArrayList<ComunaDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaComunaDTO = factoryServicio.getComunaServicio().listarComunasDTOxRegion(requestProductoDTO.getComunaDTO());

		if(retListaComunaDTO!=null && retListaComunaDTO.size()>0){
			cantidadResultados = retListaComunaDTO.size();
		}

		uchileArte.setListaComunaDTO(retListaComunaDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

	@POST
	@Path("/crearSolicitudPostulacion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearSolicitudPostulacion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		/*-------------------------------------------------------------------------------------------------------------*/
		SolicitudPostulacionDTO solicitudPostulacionDTO = factoryServicio.getSolicitudPostulacionServicio().crearSolicitudPostulacionDTO(requestProductoDTO.getSolicitudPostulacionDTO());

		cantidadResultados = 1;

		uchileArte.setSolicitudPostulacionDTO(solicitudPostulacionDTO);

		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}
	
	
	
	@POST
	@Path("/listarSolicitudPostulacion")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudPostulacion(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<SolicitudPostulacionDTO> retListaSolicitudPostulacionDTO = new ArrayList<SolicitudPostulacionDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaSolicitudPostulacionDTO = factoryServicio.getSolicitudPostulacionServicio().listarSolicitudPostulacionesDTO();

		if(retListaSolicitudPostulacionDTO!=null && retListaSolicitudPostulacionDTO.size()>0){
			cantidadResultados = retListaSolicitudPostulacionDTO.size();
		}

		uchileArte.setListaSolicitudPostulacionDTO(retListaSolicitudPostulacionDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

//	@POST
//	@Path("/listarSolicitudPostulacionxEntreFechas")
//	@Consumes({ "application/json" })
//	@Produces({ "application/json" })
//	public Response listarSolicitudPostulacionxEntreFechas(RequestProductoDTO requestProductoDTO) {
//		WrapperUchileArte wrapperUchileArte = null;
//
//		UchileArte uchileArte = new UchileArte();
//
//		Instant start = Instant.now();
//
//		int cantidadResultados = 0;
//
//		List<SolicitudPostulacionDTO> retListaSolicitudPostulacionDTO = new ArrayList<SolicitudPostulacionDTO>();
//		/*-------------------------------------------------------------------------------------------------------------*/
//		retListaSolicitudPostulacionDTO = factoryServicio.getSolicitudPostulacionServicio().listarSolicitudPostulacionxEntreFechasDTO(requestProductoDTO.getListaSolicitudPostulacionDTO().get(0), requestProductoDTO.getListaSolicitudPostulacionDTO().get(1));
//
//		if(retListaSolicitudPostulacionDTO!=null && retListaSolicitudPostulacionDTO.size()>0){
//			cantidadResultados = retListaSolicitudPostulacionDTO.size();
//		}
//
//		uchileArte.setListaSolicitudPostulacionDTO(retListaSolicitudPostulacionDTO);
//		/*-------------------------------------------------------------------------------------------------------------*/
//
//		Instant end = Instant.now();
//
//		Duration duration = Duration.between(start, end);
//
//		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());
//
//		//wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
//				//this.request.getContentType(), uchileArte);
//
//		return Response.status(201).entity(wrapperUchileArte).build();
//	}
	
	@POST
	@Path("/listarSolicitudPostulacionxEntreFechas")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response listarSolicitudPostulacionxEntreFechas(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		List<SolicitudPostulacionDTO> retListaSolicitudPostulacionDTO = new ArrayList<SolicitudPostulacionDTO>();
		/*-------------------------------------------------------------------------------------------------------------*/
		retListaSolicitudPostulacionDTO = factoryServicio.getSolicitudPostulacionServicio().listarSolicitudPostulacionxEntreFechasDTO(requestProductoDTO.getListaSolicitudPostulacionDTO().get(0), requestProductoDTO.getListaSolicitudPostulacionDTO().get(1));

		if(retListaSolicitudPostulacionDTO!=null && retListaSolicitudPostulacionDTO.size()>0){
			cantidadResultados = retListaSolicitudPostulacionDTO.size();
		}

		uchileArte.setListaSolicitudPostulacionDTO(retListaSolicitudPostulacionDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);
		
		return Response.status(201).entity(wrapperUchileArte).build();
//		return Response.status(Status.OK).entity(wrapperUchileArte).build();
		
//		String jsonRetorno = MapperWrapper.mapperWrapper(wrapperUchileArte);
//		
//		return Response.status(201).entity(jsonRetorno).build();
	}
	
	@POST
	@Path("/crearNegocioSolicitud")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response crearNegocioSolicitud(RequestProductoDTO requestProductoDTO) {
		WrapperUchileArte wrapperUchileArte = null;

		UchileArte uchileArte = new UchileArte();

		Instant start = Instant.now();

		int cantidadResultados = 0;

		/*-------------------------------------------------------------------------------------------------------------*/
		NegocioSolicitudDTO negocioSolicitudDTO = factoryServicio.getNegocioSolicitudServicio().crearNegocioSolicitudDTO(requestProductoDTO.getNegocioSolicitudDTO());

		cantidadResultados = 1;

		uchileArte.setNegocioSolicitudDTO(negocioSolicitudDTO);
		/*-------------------------------------------------------------------------------------------------------------*/

		Instant end = Instant.now();

		Duration duration = Duration.between(start, end);

		String tiempoRespuesta = AppDate.generarTiempoDuracion(duration.getSeconds(), duration.getNano());

		wrapperUchileArte = new WrapperUchileArte(true, tiempoRespuesta, cantidadResultados, this.request.getRequestURL().toString(), null,
				this.request.getContentType(), uchileArte);

		return Response.status(201).entity(wrapperUchileArte).build();
	}

}
