//package com.manashiki.uchilearte.web.bean;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.Serializable;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.List;
//
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//
//import org.apache.commons.io.FileUtils;
//import org.primefaces.event.SelectEvent;
//import org.primefaces.model.DefaultStreamedContent;
//import org.primefaces.model.StreamedContent;
////import org.slf4j.Logger;
////import org.slf4j.LoggerFactory;
//
//import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
//import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
//import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
//import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
//import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
//import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
//import com.manashiki.uchilearte.web.utilidades.ClienteRest;
////import com.manashiki.uchilearte.web.utilidades.cliente.ClienteWsRestUtilidades;
//import com.manashiki.uchilearte.web.utilidades.properties.PropertiesAplicacion;
//
//import vijnana.utilidades.component.utilidades.ValidacionPatrones;
//
//@ManagedBean(name = "administracionSolicitudAcademicaBean")
//@ViewScoped
//public class AdministracionSolicitudAcademicaBean implements Serializable{
//
//	private static final long serialVersionUID = 3409917190126496151L;
//
////	private static final Logger objLog = LoggerFactory.getLogger(AdministracionSolicitudAcademicaBean.class);
//	/*********************************************/
//
//	private String mensajeDialog="";
//	private Date fechaInicial = new Date();
//	private Date fechaFinal= new Date();
//
//	private Date limiteInferiorFechaInicial=new Date();
//	private Date limiteInferiorFechaFinal=new Date();
//	private Date limiteSuperiorFechaInicial=new Date();
//	private Date limiteSuperiorFechaFinal=new Date();
//
//	private SolicitudAcademicaDTO solicitudAcademicaDTO = new SolicitudAcademicaDTO();
//	private SolicitudAcademicaDTO verSolicitudAcademicaDTO = new SolicitudAcademicaDTO();
//	private List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO;
//	private List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO;
//	private List<TipoSolicitudDTO> listaTipoSolicitudDTO;
////	private boolean mostrarRowArchivo=false;
//	private StreamedContent file;
//	
//	PropertiesAplicacion propertiesAplicacion = new PropertiesAplicacion();
//	
//	public AdministracionSolicitudAcademicaBean(){
////		objLog.info("INICIO Constructor - SolicitudAcademicaBean");
////		objLog.info("FIN Constructor - SolicitudAcademicaBean");
//	}
//
//	public void llamarRemoteCommandSeguridad(){
////		objLog.info("INI - llamarRemoteCommandSeguridad");
//		iniciliazarFormulario();
////		objLog.info("FIN - llamarRemoteCommandSeguridad");
//	}
//	/***********************INICIALIZAR VALORES DEL FORMULARIO *************************************/
//	/** @Do inicializa los valores de todo el formulario
//	 * @param no param
//	 * @return void.
//	 * no lanza Excepciones.
//	 */
//	public void iniciliazarFormulario(){
////		objLog.info("INI - iniciliazarFormulario");
//		iniciliazarValoresDTO();
//		generarValoresFormulario();
////		objLog.info("FIN - iniciliazarFormulario");
//	}
//
//	/** @Do inicializa los valores de los datos de trabajo del formulario
//	 * @param no param
//	 * @return void.
//	 * no lanza Excepciones.
//	 */
//	public void iniciliazarValoresDTO(){
////		objLog.info("INI - iniciliazarValoresDTO");
//		solicitudAcademicaDTO = new SolicitudAcademicaDTO();
////		mostrarRowArchivo = false;
////		objLog.info("FIN - iniciliazarValoresDTO");
//	}
//
//	/** @Do genera los valores de disabled y llenado de combobox del formulario 
//	 * @param no param
//	 * @return void.
//	 * no lanza Excepciones.
//	 */
//	public void generarValoresFormulario(){
////		objLog.info("INI - generarValoresFormulario");
//		iniciliazarDisabled();
//		llenarFechasSolicitudesAcademicas();
//		listarProgramasUniversidadDTO();
//		listarTipoSolicitudDTO();
//		listarUltimosSolicitudAcademicaDTO();
////		objLog.info("FIN - generarValoresFormulario");
//	}
//
//	/** @Do inicializa los valores de los datos de disabled
//	 * @param no param
//	 * @return void.
//	 * no lanza Excepciones.
//	 */
//	public void iniciliazarDisabled(){
////		objLog.info("INI - iniciliazarDisabled");
////		objLog.info("FIN - iniciliazarDisabled");
//	}
//
//	public void llenarFechasSolicitudesAcademicas(){
//		Date MfechaHoy=new Date();
//
//		Date MfechaInicial=new Date();
//		Date MfechaFinal=new Date();
//		Date MfechaLimInfIni=new Date();
//		Date MfechaLimSupIni=new Date();
//		Date MfechaLimInfFin=new Date();
//		Date MfechaLimSupFin=new Date();
//
//		SimpleDateFormat formatInicial = new SimpleDateFormat("dd/MM/yyyy");
//		String fechaCompare1=formatInicial.format(MfechaHoy).toString();
//		Calendar calHoy = Calendar.getInstance();
//		Calendar calInicio = Calendar.getInstance();
//		Calendar calFinal = Calendar.getInstance();
//		Calendar calLimiteInferiorOrigen = Calendar.getInstance();
//		Calendar calLimiteSuperiorOrigen = Calendar.getInstance();
//		Calendar calLimiteInferiorRegreso = Calendar.getInstance();
//		Calendar calLimiteSuperiorRegreso = Calendar.getInstance();
//
//		long miliHoy = 0;
//		int dia1 = Integer.parseInt(fechaCompare1.substring(0, 2));
//		int mes1 = Integer.parseInt(fechaCompare1.substring(3, 5));
//		int ano1 = Integer.parseInt(fechaCompare1.substring(6, 10));
//		GregorianCalendar c = new GregorianCalendar(ano1, mes1 - 1, dia1);
//
//		miliHoy = c.getTime().getTime();
//		java.util.Date fechaHoy = new java.util.Date(miliHoy);
//
//		calHoy.setTime(fechaHoy);
//		calInicio.setTime(fechaHoy);
//		calFinal.setTime(fechaHoy);
//		calLimiteInferiorOrigen.setTime(fechaHoy);
//		calLimiteSuperiorOrigen.setTime(fechaHoy);
//		calLimiteInferiorRegreso.setTime(fechaHoy);
//		calLimiteSuperiorRegreso.setTime(fechaHoy);
//
//		calInicio.add(Calendar.DATE, -7);
//		MfechaInicial=calInicio.getTime();
//
//		calFinal.add(Calendar.DATE, 0);
//		calFinal.add(Calendar.HOUR, 23);
//		calFinal.add(Calendar.MINUTE, 59);
//		calFinal.add(Calendar.SECOND, 59);
//		MfechaFinal=calFinal.getTime();
//
//		calLimiteInferiorOrigen.add(Calendar.DATE, -365);
//		MfechaLimInfIni=calLimiteInferiorOrigen.getTime();
//
//		calLimiteSuperiorOrigen.add(Calendar.DATE, -1);
//		MfechaLimSupIni=calLimiteSuperiorOrigen.getTime();
//
//		calLimiteInferiorRegreso.add(Calendar.DATE, -365);
//		MfechaLimInfFin=calLimiteInferiorRegreso.getTime();
//		//un a\F1o desde el Origen
//		calLimiteSuperiorRegreso.add(Calendar.DATE, 0);
//		MfechaLimSupFin=calLimiteSuperiorRegreso.getTime();
//
//
//		setFechaInicial(MfechaInicial);
//		setFechaFinal(MfechaFinal);
//		//generar los 4 limites
//		setLimiteInferiorFechaInicial(MfechaLimInfIni);
//		setLimiteSuperiorFechaInicial(MfechaLimSupIni);
//		setLimiteInferiorFechaFinal(MfechaLimInfFin);
//		setLimiteSuperiorFechaFinal(MfechaLimSupFin);
//
//	}
//
////	public void listarProgramasUniversidadDTO(){
//////		objLog.info("INI - listarProgramasUnivrsidadDTO");
////		List<ProgramaUniversidadDTO> retListaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();
////		// Mostrar Todo
////		ClientUchileArteWs clientUchileArteWs = new ClientUchileArteWs();
////
////		retListaProgramaUniversidadDTO = clientUchileArteWs.listarProgramaUniversidad(new RequestProductoDTO());
////
////		setListaProgramaUniversidadDTO(retListaProgramaUniversidadDTO);
////
//////		objLog.info("FIN - listarProgramasUniversidadDTO "+retListaProgramaUniversidadDTO.size());
////	}
//	
//	public void listarProgramasUniversidadDTO(){
//
//		List<ProgramaUniversidadDTO> retListaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();
//
//		UchileArte uchileArte = new UchileArte();
//		//		 Mostrar Todo
//				ClienteRest clienteRest = new ClienteRest();
//
//		//		String urlMetodo = clienteRest.obtenerUrlMetodo("1");
//
//				uchileArte = clienteRest.post(new RequestProductoDTO(),  propertiesAplicacion.getLocalListarProgramaUniversidad());
//		//##################################################
////		String ipServer = PropertiesAplicacion.getVijnanaServidor();
////		//		String ipServer = "localhost:8080";
////		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
////
////		uchileArte = clienteWsRestUtilidades.listarProgramaUniversidad(new RequestProductoDTO(), ipServer);
//		//##################################################
//
//		retListaProgramaUniversidadDTO = uchileArte.getListaProgramaUniversidadDTO(); 
//
//		setListaProgramaUniversidadDTO(retListaProgramaUniversidadDTO);
//	}
//
//	public void listarTipoSolicitudDTO(){
//		//		objLog.info("INI - listarTipoSolicitudDTO");
//
//		List<TipoSolicitudDTO> retListaTipoSolicitudDTO = new ArrayList<TipoSolicitudDTO>();
//
//		UchileArte uchileArte = new UchileArte();
//
//				ClienteRest clienteRest = new ClienteRest();
//
//		//		String urlMetodo = clienteRest.obtenerUrlMetodo("9");
//
//				uchileArte = clienteRest.post(new RequestProductoDTO(),  propertiesAplicacion.getLocalListarTipoSolicitudes());
//		//##################################################
////		String ipServer = PropertiesAplicacion.getVijnanaServidor();
////		//		String ipServer = "localhost:8080";
////		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
////
////		uchileArte = clienteWsRestUtilidades.listarTipoSolicitudes(new RequestProductoDTO(), ipServer);
//		//##################################################
//
//		retListaTipoSolicitudDTO = uchileArte.getListaTipoSolicitudDTO();
//
//		setListaTipoSolicitudDTO(retListaTipoSolicitudDTO);
//
//		//		objLog.info("FIN - listarTipoSolicitudDTO "+retListaTipoSolicitudDTO.size());
//	}
//
//	/** @Do inicializa los datos de datatable de aplicaciones del formulario
//	 * @param no param
//	 * @return void.
//	 * no lanza Excepciones.
//	 */
//	public void listarUltimosSolicitudAcademicaDTO(){
////		objLog.info("INI - listarSolicitudAcademicaDTO");
//		List<SolicitudAcademicaDTO> retListaSolicitudAcademicaDTO = new ArrayList<SolicitudAcademicaDTO>();
//		// Mostrar Todo
////		ClientUchileArteWs clientUchileArteWs = new ClientUchileArteWs();
//
//		RequestProductoDTO requestProductoDTO = generarRequestProductoBusquedaSolicitudAcademica();
//
//		// Mostrar Todo
//		UchileArte uchileArte = new UchileArte();
//		
//		ClienteRest clienteRest = new ClienteRest();
//		
////		String urlMetodo = clienteRest.obtenerUrlMetodo("15");
//		//TODO Ver fechas de Solicitud Academica.
//		uchileArte = clienteRest.post(requestProductoDTO,  propertiesAplicacion.getLocalListarSolicitudAcademicaxEntreFechas());
////		uchileArte = clienteRest.postDosCientos(requestProductoDTO, propertiesAplicacion.getLocalListarSolicitudCertificadoxEntreFechas());
//		//##################################################
////		String ipServer = PropertiesAplicacion.getVijnanaServidor();
////		//		String ipServer = "localhost:8080";
////		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
////
////		uchileArte = clienteWsRestUtilidades.listarSolicitudAcademicaxEntreFechas(requestProductoDTO, ipServer);
//		//##################################################
//		
//		retListaSolicitudAcademicaDTO = uchileArte.getListaSolicitudAcademicaDTO();
//		
//		//		retListaSolicitudAcademicaDTO = clientUchileArteWs.listarSolicitudAcademicaxEntreFechas(requestProductoDTO); //Traer entre hoy de la ultima hora y la semana pasada.
//
//		List<SolicitudAcademicaDTO> metListaSolicitudAcademicaDTO = new ArrayList<SolicitudAcademicaDTO>();
//
//		SolicitudAcademicaDTO metSolicitudAcademicaDTO = new SolicitudAcademicaDTO();
//
//		for(SolicitudAcademicaDTO SolAcaDTO : retListaSolicitudAcademicaDTO){
//			metSolicitudAcademicaDTO = new SolicitudAcademicaDTO(); 
//			metSolicitudAcademicaDTO = SolAcaDTO;
//
//			for(ProgramaUniversidadDTO proUniDTO: listaProgramaUniversidadDTO){
//				if(SolAcaDTO.getIdProgramaUniversidad()==proUniDTO.getIdProgramaUniversidad()){
//					metSolicitudAcademicaDTO.setProgramaUniversidad(proUniDTO.getNombreProgramaUniversidad());
//				}
//			}
//			for(TipoSolicitudDTO tipSolDTO: listaTipoSolicitudDTO){
//				if(SolAcaDTO.getIdTipoSolicitud()==tipSolDTO.getIdTipoSolicitud()){
//					metSolicitudAcademicaDTO.setTipoSolicitud(tipSolDTO.getNombreTipoSolicitud());
//				}
//			}
//
//			metSolicitudAcademicaDTO.setSfechaSolicitud(transformarDateToString(metSolicitudAcademicaDTO.getSfechaSolicitud()));
//
//			metListaSolicitudAcademicaDTO.add(metSolicitudAcademicaDTO);
//		}
//
//		setListaSolicitudAcademicaDTO(metListaSolicitudAcademicaDTO);
////		objLog.info("FIN - listarProgramasUniversidadDTO "+metListaSolicitudAcademicaDTO.size());
//	}
//
//	public RequestProductoDTO generarRequestProductoBusquedaSolicitudAcademica(){
//
//		RequestProductoDTO requestProductoDTO = new RequestProductoDTO();
//
//		Date fechaAhora = new Date();
//
//		Date fechaCasiManhana = obtenerFechaMañana(fechaAhora);
//
//		Date fechaSemanaPasada = obtenerFechaSemanaPasada(fechaAhora);
//
//		List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO = new ArrayList<SolicitudAcademicaDTO>();
//
//		SolicitudAcademicaDTO solicitudAcademicaDTOInicial = new SolicitudAcademicaDTO();
//
//		SolicitudAcademicaDTO solicitudAcademicaDTOFinal = new SolicitudAcademicaDTO();
//
//		solicitudAcademicaDTOInicial.setFechaSolicitud(fechaSemanaPasada);
//
//		solicitudAcademicaDTOFinal.setFechaSolicitud(fechaCasiManhana);
//
//		listaSolicitudAcademicaDTO.add(solicitudAcademicaDTOInicial);
//
//		listaSolicitudAcademicaDTO.add(solicitudAcademicaDTOFinal);
//
//		requestProductoDTO.setListaSolicitudAcademicaDTO(listaSolicitudAcademicaDTO);
//
//		return requestProductoDTO;
//	}
//
//	public Date obtenerFechaMañana(Date fechaAhora) {
//		SimpleDateFormat formatFechaHpoy = new SimpleDateFormat("dd/MM/yyyy");
//
//		String stringFechaAhora=formatFechaHpoy.format(fechaAhora).toString();
//		Calendar calCasiManhana = Calendar.getInstance();
//		long miliHoy = 0;
//
//		int diaHoy = Integer.parseInt(stringFechaAhora.substring(0, 2));
//		int mesHoy = Integer.parseInt(stringFechaAhora.substring(3, 5));
//		int anoHoy = Integer.parseInt(stringFechaAhora.substring(6, 10));
//
//		GregorianCalendar cHoy = new GregorianCalendar(anoHoy, mesHoy - 1, diaHoy);
//		miliHoy = cHoy.getTime().getTime();
//		java.util.Date dateFechaCasiMañana = new java.util.Date(miliHoy);
//		calCasiManhana.setTime(dateFechaCasiMañana);
//		calCasiManhana.add(Calendar.DATE, 0); //Dar Un Dia
//		calCasiManhana.add(Calendar.HOUR, 23);
//		calCasiManhana.add(Calendar.MINUTE, 59);
//		calCasiManhana.add(Calendar.SECOND, 59);
//		Date fechaCasiMañana=calCasiManhana.getTime();
//
//		return fechaCasiMañana;
//	}
//
//	public Date obtenerFechaSemanaPasada(Date fechaAhora) {
//		SimpleDateFormat formatFechaHpoy = new SimpleDateFormat("dd/MM/yyyy");
//
//		String stringFechaAhora=formatFechaHpoy.format(fechaAhora).toString();
//		Calendar calSemanaPasada = Calendar.getInstance();
//		long miliHoy = 0;
//
//		int diaHoy = Integer.parseInt(stringFechaAhora.substring(0, 2));
//		int mesHoy = Integer.parseInt(stringFechaAhora.substring(3, 5));
//		int anoHoy = Integer.parseInt(stringFechaAhora.substring(6, 10));
//
//		GregorianCalendar cHoy = new GregorianCalendar(anoHoy, mesHoy - 1, diaHoy);
//		miliHoy = cHoy.getTime().getTime();
//		java.util.Date dateFechaSemanaPasada = new java.util.Date(miliHoy);
//		calSemanaPasada.setTime(dateFechaSemanaPasada);
//
//		calSemanaPasada.add(Calendar.DATE, -7); //Dar Un Dia
//
//		Date fechaSemanaPasada=calSemanaPasada.getTime();
//
//		return fechaSemanaPasada;
//	}
//
//	public String transformarDateToString(String sfechaSolicitud){
////		SimpleDateFormat formatInicial = new SimpleDateFormat("dd/MM/yyyy");
//		
//		sfechaSolicitud=sfechaSolicitud.substring(0,10);
//		
//		return sfechaSolicitud;
//	}
//	/********************* METODOS DE FUNCIONAMIENTO /ACTIVIDADES ******************************/
//	public void cambiarFechaFinal(SelectEvent event){
//		//Obtener fecha de resolucion, Osea...cuando el usuario creo la empresa en el registro de SII.
//		//		Date MfechaHoy=new Date();
//
//		Date MfechaHoy=new Date();
//		Date MfechaIda=new Date();
//
//		Date MfechaRetorno=new Date();
//		Date MfechaLimInfIni=new Date();
//		Date MfechaLimSupIni=new Date();
//		Date MfechaLimInfFin=new Date();
//		Date MfechaLimSupFin=new Date();
//
//		MfechaIda= (Date) event.getObject();
//
//		SimpleDateFormat formatFechaHpoy = new SimpleDateFormat("dd/MM/yyyy");
//		String stringFechaHoy=formatFechaHpoy.format(MfechaHoy).toString();
//
//		SimpleDateFormat formatFechaIda = new SimpleDateFormat("dd/MM/yyyy");
//		String stringFechaIda=formatFechaIda.format(MfechaIda).toString();
//
//		Calendar calRegreso = Calendar.getInstance();
//		Calendar calLimiteInferiorOrigen = Calendar.getInstance();
//		Calendar calLimiteSuperiorOrigen = Calendar.getInstance();
//		Calendar calLimiteInferiorRegreso = Calendar.getInstance();
//		Calendar calLimiteSuperiorRegreso = Calendar.getInstance();
//
//		//Milisegundos de Fecha de Hoy
//		long miliHoy = 0;
//		int diaHoy = Integer.parseInt(stringFechaHoy.substring(0, 2));
//		int mesHoy = Integer.parseInt(stringFechaHoy.substring(3, 5));
//		int anoHoy = Integer.parseInt(stringFechaHoy.substring(6, 10));
//
//		GregorianCalendar cHoy = new GregorianCalendar(anoHoy, mesHoy - 1, diaHoy);
//		miliHoy = cHoy.getTime().getTime();
//		java.util.Date dateFechaHoy = new java.util.Date(miliHoy);
//		//Milisegundos de Fecha de Hoy
//		//Milisegundos de Fecha de Ida
//		long mili1 = 0;
//		int dia1 = Integer.parseInt(stringFechaIda.substring(0, 2));
//		int mes1 = Integer.parseInt(stringFechaIda.substring(3, 5));
//		int ano1 = Integer.parseInt(stringFechaIda.substring(6, 10));
//		GregorianCalendar c = new GregorianCalendar(ano1, mes1 - 1, dia1);
//		mili1 = c.getTime().getTime();
//		java.util.Date dateFechaIda = new java.util.Date(mili1);
//		//Milisegundos de Fecha de Ida
//
//		calRegreso.setTime(dateFechaIda);
//		//desde la Fecha de Hoy hasta un a\F1o
//		calLimiteInferiorOrigen.setTime(dateFechaHoy);
//		calLimiteSuperiorOrigen.setTime(dateFechaHoy);
//		//desde la Fecha de Hoy hasta un a\F1o despues de la Ida
//		calLimiteInferiorRegreso.setTime(dateFechaIda);
//		calLimiteSuperiorRegreso.setTime(dateFechaHoy);
//
//		//Setear el Mismo dia de la Fecha de Inicio.
//		calRegreso.add(Calendar.DATE, 0); //Dar Un Dia
//		calRegreso.add(Calendar.HOUR, 23);
//		calRegreso.add(Calendar.MINUTE, 59);
//		calRegreso.add(Calendar.SECOND, 59);
//		MfechaRetorno=calRegreso.getTime();
//
//		calLimiteInferiorOrigen.add(Calendar.DATE, -365);
//		MfechaLimInfIni=calLimiteInferiorOrigen.getTime();
//
//		calLimiteSuperiorOrigen.add(Calendar.DATE, 0);
//		MfechaLimSupIni=calLimiteSuperiorOrigen.getTime();
//
//		calLimiteInferiorRegreso.add(Calendar.DATE, 1);
//		MfechaLimInfFin=calLimiteInferiorRegreso.getTime();
//		//un a\F1o desde el Origen
//		calLimiteSuperiorRegreso.add(Calendar.DATE, 0);
//		MfechaLimSupFin=calLimiteSuperiorRegreso.getTime();
//
//		if (MfechaLimSupIni.before(MfechaRetorno)) {
//			calRegreso.setTime(dateFechaIda);
//			calRegreso.add(Calendar.DATE, 0);
//			MfechaRetorno=calRegreso.getTime();
//		}
//
//		setFechaInicial(MfechaIda);
//		setFechaFinal(MfechaRetorno);
//		//generar los 4 limites
//		setLimiteInferiorFechaInicial(MfechaLimInfIni);
//		setLimiteSuperiorFechaInicial(MfechaLimSupIni);
//		setLimiteInferiorFechaFinal(MfechaLimInfFin);
//		setLimiteSuperiorFechaFinal(MfechaLimSupFin);
//		//limpiar referencias siempre
//
//	}
//
//	public String buscarSolicitudAcademica(){
//
//		listarSolicitudAcademicaDTOEntreFechas();
//
//		return null;
//	}
//
//	public void listarSolicitudAcademicaDTOEntreFechas(){
////		objLog.info("INI - listarSolicitudAcademicaDTO");
//		List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO = new ArrayList<SolicitudAcademicaDTO>();
//		List<SolicitudAcademicaDTO> metListaSolicitudAcademicaDTO = new ArrayList<SolicitudAcademicaDTO>();
//		List<SolicitudAcademicaDTO> retListaSolicitudAcademicaDTO = new ArrayList<SolicitudAcademicaDTO>();
//		RequestProductoDTO requestProductoDTO = new RequestProductoDTO();
//		SolicitudAcademicaDTO metSolicitudAcademicaDTO = new SolicitudAcademicaDTO();
//
//		SolicitudAcademicaDTO solicitudAcademicaDTOInicial = new SolicitudAcademicaDTO();
//		solicitudAcademicaDTOInicial.setFechaSolicitud(fechaInicial);
//
//		SolicitudAcademicaDTO solicitudAcademicaDTOFinal = new SolicitudAcademicaDTO();
//		//Agregar 23 Hrs - 59 min 59 sec
//		SimpleDateFormat formatFechaIda = new SimpleDateFormat("dd/MM/yyyy");
//		String stringFechaFinal=formatFechaIda.format(fechaFinal).toString();
//		Calendar calRegreso = Calendar.getInstance();
//
//		long mili1 = 0;
//		int dia1 = Integer.parseInt(stringFechaFinal.substring(0, 2));
//		int mes1 = Integer.parseInt(stringFechaFinal.substring(3, 5));
//		int ano1 = Integer.parseInt(stringFechaFinal.substring(6, 10));
//		GregorianCalendar c = new GregorianCalendar(ano1, mes1 - 1, dia1);
//		mili1 = c.getTime().getTime();
//		java.util.Date dateFechaFinal = new java.util.Date(mili1);
//		calRegreso.setTime(dateFechaFinal);
//
//		calRegreso.add(Calendar.DATE, 0); //Dar Un Dia
//		calRegreso.add(Calendar.HOUR, 23);
//		calRegreso.add(Calendar.MINUTE, 59);
//		calRegreso.add(Calendar.SECOND, 59);
//		fechaFinal=calRegreso.getTime();
//		//Agregar 23 Hrs - 59 min 59 sec
//
//		solicitudAcademicaDTOFinal.setFechaSolicitud(fechaFinal);
//
////		ClientUchileArteWs clientUchileArteWs = new ClientUchileArteWs();
//
//		listaSolicitudAcademicaDTO.add(solicitudAcademicaDTOInicial);
//
//		listaSolicitudAcademicaDTO.add(solicitudAcademicaDTOFinal);
//
//		requestProductoDTO.setListaSolicitudAcademicaDTO(listaSolicitudAcademicaDTO);
//		
//		UchileArte uchileArte = new UchileArte();
//		
//		ClienteRest clienteRest = new ClienteRest();
//		
////		String urlMetodo = clienteRest.obtenerUrlMetodo("15");
//		
//		uchileArte = clienteRest.post(requestProductoDTO,  propertiesAplicacion.getLocalListarSolicitudAcademicaxEntreFechas());
//		//##################################################
////		String ipServer = PropertiesAplicacion.getVijnanaServidor();
////		//		String ipServer = "localhost:8080";
////		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
////
////		uchileArte = clienteWsRestUtilidades.listarSolicitudAcademicaxEntreFechas(requestProductoDTO, ipServer);
//		//##################################################
//		
//		retListaSolicitudAcademicaDTO = uchileArte.getListaSolicitudAcademicaDTO();
//		
////		retListaSolicitudAcademicaDTO = clientUchileArteWs.listarSolicitudAcademicaxEntreFechas(requestProductoDTO);
//
//		for(SolicitudAcademicaDTO SolAcaDTO : retListaSolicitudAcademicaDTO){
//			metSolicitudAcademicaDTO = new SolicitudAcademicaDTO(); 
//			metSolicitudAcademicaDTO = SolAcaDTO;
//
//			for(ProgramaUniversidadDTO proUniDTO: listaProgramaUniversidadDTO){
//				if(SolAcaDTO.getIdProgramaUniversidad()==proUniDTO.getIdProgramaUniversidad()){
//					metSolicitudAcademicaDTO.setProgramaUniversidad(proUniDTO.getNombreProgramaUniversidad());
//				}
//			}
//			for(TipoSolicitudDTO tipSolDTO: listaTipoSolicitudDTO){
//				if(SolAcaDTO.getIdTipoSolicitud()==tipSolDTO.getIdTipoSolicitud()){
//					metSolicitudAcademicaDTO.setTipoSolicitud(tipSolDTO.getNombreTipoSolicitud());
//				}
//			}
//
//			metSolicitudAcademicaDTO.setSfechaSolicitud(transformarDateToString(metSolicitudAcademicaDTO.getSfechaSolicitud()));
//
//			metListaSolicitudAcademicaDTO.add(metSolicitudAcademicaDTO);
//		}
//
//		setListaSolicitudAcademicaDTO(retListaSolicitudAcademicaDTO);
//
////		objLog.info("FIN - listarProgramasUniversidadDTO "+retListaSolicitudAcademicaDTO.size());
//	}
//
//	/** @Do cambia el mensaje en el boton del dialog
//	 * @param no param
//	 * @return void.
//	 * no lanza Excepciones.
//	 * @throws IOException 
//	 */
//	public String mostrarDialog() throws IOException{
//		String nombreExtension = "";
//		
//		int indexOf =0;
//
//		if(verSolicitudAcademicaDTO.getIdArchivoSolicitud()>0){
//			
//			ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO();
//			
//			archivoSolicitudDTO.setIdArchivoSolicitud(verSolicitudAcademicaDTO.getIdArchivoSolicitud());
////			ClientUchileArteWs clientUchileArteWs = new ClientUchileArteWs();
//			RequestProductoDTO requestProductoDTO= new RequestProductoDTO();
//			requestProductoDTO.setArchivoSolicitudDTO(archivoSolicitudDTO);
////			archivoSolicitudDTO = clientUchileArteWs.buscarArchivoSolicitud(requestProductoDTO);
//			
//			UchileArte uchileArte = new UchileArte();
//			
//			ClienteRest clienteRest = new ClienteRest();
//			
////			String urlMetodo = clienteRest.obtenerUrlMetodo("11");
//			
//			uchileArte = clienteRest.post(requestProductoDTO,  propertiesAplicacion.getLocalBuscarArchivoSolicitud());
//			//##################################################
////			String ipServer = PropertiesAplicacion.getVijnanaServidor();
////			//		String ipServer = "localhost:8080";
////			ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
////
////			uchileArte = clienteWsRestUtilidades.buscarArchivoSolicitud(requestProductoDTO, ipServer);
//			//##################################################
//			
//			archivoSolicitudDTO = uchileArte.getArchivoAcademicaDTO();
//			
//			nombreExtension =ValidacionPatrones.stringInvertir(archivoSolicitudDTO.getNombreArchivoSolicitud()); 
//			
//			indexOf = nombreExtension.indexOf('.');
//			
//			nombreExtension = nombreExtension.substring(0, indexOf);
//			
//			nombreExtension = ValidacionPatrones.stringInvertir(nombreExtension);
//			
//			verSolicitudAcademicaDTO.setNombreArchivo(archivoSolicitudDTO.getNombreArchivoSolicitud());
//			try {
//				if(nombreExtension.equals("zip")){
//
////					String fileFolderEscritura = System.getProperty("catalina.base") + "/temp/";
//
////					String filePathFinal = fileFolderEscritura+archivoSolicitudDTO.getDireccionAlmacenamientoArchivoSolicitud();
//					String filePathFinal = archivoSolicitudDTO.getDireccionAlmacenamientoArchivoSolicitud();
//
//					File fileSolicitudAcademica = new File(filePathFinal);
//
//					InputStream targetStream = FileUtils.openInputStream(fileSolicitudAcademica);
//
//					file = new DefaultStreamedContent(targetStream, "application/zip", archivoSolicitudDTO.getNombreArchivoSolicitud());
//
//				}
//
//				if(nombreExtension.equals("rar")){
//					//FileInputStream fis = new FileInputStream(filePathFinal);
//					String fileFolderEscritura = System.getProperty("catalina.base") + "/temp/";
//
////					String filePathFinal = fileFolderEscritura+archivoSolicitudDTO.getDireccionAlmacenamientoArchivoSolicitud();
//					String filePathFinal = archivoSolicitudDTO.getDireccionAlmacenamientoArchivoSolicitud();
//
//					File fileSolicitudAcademica = new File(filePathFinal);
//
//					InputStream targetStream = FileUtils.openInputStream(fileSolicitudAcademica);
//
//					file = new DefaultStreamedContent(targetStream, "application/x-rar-compressed", archivoSolicitudDTO.getNombreArchivoSolicitud());
//
//				}
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//			}
//		}
//		return null;
//	}
//
//	/** @Do limpia e inicializa el formulario mediante el boton limpiar
//	 * @param no param
//	 * @return void.
//	 * no lanza Excepciones.
//	 */
//	public String limpiarFormularioSolicitudAcademica(){
//		iniciliazarFormulario();
//		return null;
//	}
//	/********************* METODOS DE FUNCIONAMIENTO ******************************/
//	/******************GETTER y SETTER********************************************/
//	public String getMensajeDialog() {
//		return mensajeDialog;
//	}
//
//	public Date getFechaInicial() {
//		return fechaInicial;
//	}
//
//	public Date getFechaFinal() {
//		return fechaFinal;
//	}
//
//	public Date getLimiteInferiorFechaInicial() {
//		return limiteInferiorFechaInicial;
//	}
//
//	public Date getLimiteInferiorFechaFinal() {
//		return limiteInferiorFechaFinal;
//	}
//
//	public Date getLimiteSuperiorFechaInicial() {
//		return limiteSuperiorFechaInicial;
//	}
//
//	public Date getLimiteSuperiorFechaFinal() {
//		return limiteSuperiorFechaFinal;
//	}
//
//	public SolicitudAcademicaDTO getSolicitudAcademicaDTO() {
//		return solicitudAcademicaDTO;
//	}
//
//	public SolicitudAcademicaDTO getVerSolicitudAcademicaDTO() {
//		return verSolicitudAcademicaDTO;
//	}
//
//	public List<SolicitudAcademicaDTO> getListaSolicitudAcademicaDTO() {
//		return listaSolicitudAcademicaDTO;
//	}
//
//	public List<ProgramaUniversidadDTO> getListaProgramaUniversidadDTO() {
//		return listaProgramaUniversidadDTO;
//	}
//
//	public List<TipoSolicitudDTO> getListaTipoSolicitudDTO() {
//		return listaTipoSolicitudDTO;
//	}
//
//	public StreamedContent getFile() {
//		return file;
//	}
//
//	public void setMensajeDialog(String mensajeDialog) {
//		this.mensajeDialog = mensajeDialog;
//	}
//
//	public void setFechaInicial(Date fechaInicial) {
//		this.fechaInicial = fechaInicial;
//	}
//
//	public void setFechaFinal(Date fechaFinal) {
//		this.fechaFinal = fechaFinal;
//	}
//
//	public void setLimiteInferiorFechaInicial(Date limiteInferiorFechaInicial) {
//		this.limiteInferiorFechaInicial = limiteInferiorFechaInicial;
//	}
//
//	public void setLimiteInferiorFechaFinal(Date limiteInferiorFechaFinal) {
//		this.limiteInferiorFechaFinal = limiteInferiorFechaFinal;
//	}
//
//	public void setLimiteSuperiorFechaInicial(Date limiteSuperiorFechaInicial) {
//		this.limiteSuperiorFechaInicial = limiteSuperiorFechaInicial;
//	}
//
//	public void setLimiteSuperiorFechaFinal(Date limiteSuperiorFechaFinal) {
//		this.limiteSuperiorFechaFinal = limiteSuperiorFechaFinal;
//	}
//
//	public void setSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO) {
//		this.solicitudAcademicaDTO = solicitudAcademicaDTO;
//	}
//
//	public void setVerSolicitudAcademicaDTO(SolicitudAcademicaDTO verSolicitudAcademicaDTO) {
//		this.verSolicitudAcademicaDTO = verSolicitudAcademicaDTO;
//	}
//
//	public void setListaSolicitudAcademicaDTO(List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO) {
//		this.listaSolicitudAcademicaDTO = listaSolicitudAcademicaDTO;
//	}
//
//	public void setListaProgramaUniversidadDTO(List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO) {
//		this.listaProgramaUniversidadDTO = listaProgramaUniversidadDTO;
//	}
//
//	public void setListaTipoSolicitudDTO(List<TipoSolicitudDTO> listaTipoSolicitudDTO) {
//		this.listaTipoSolicitudDTO = listaTipoSolicitudDTO;
//	}
//
//	public void setFile(StreamedContent file) {
//		this.file = file;
//	}
//
////	public boolean isMostrarRowArchivo() {
////		return mostrarRowArchivo;
////	}
////
////	public void setMostrarRowArchivo(boolean mostrarRowArchivo) {
////		this.mostrarRowArchivo = mostrarRowArchivo;
////	}
//
//}
