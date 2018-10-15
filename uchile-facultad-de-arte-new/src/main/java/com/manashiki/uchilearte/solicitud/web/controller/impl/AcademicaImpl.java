package com.manashiki.uchilearte.solicitud.web.controller.impl;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;
import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
import com.manashiki.uchilearte.web.utilidades.cliente.ClienteRest;
import com.manashiki.uchilearte.web.utilidades.cliente.ClienteRestUtilidades;
import com.manashiki.uchilearte.web.utilidades.direccionamiento.Navigation;
//import com.manashiki.uchilearte.web.direccionamiento.Navigation;
//import com.manashiki.uchilearte.web.utilidades.ClienteRest;
//import com.manashiki.uchilearte.web.utilidades.ClienteRestUtilidades;
//import com.manashiki.uchilearte.web.utilidades.cliente.ClienteWsRestUtilidades;
//import com.manashiki.uchilearte.web.utilidades.properties.PropertiesAplicacion;
import com.manashiki.uchilearte.web.utilidades.properties.UchileProperties;

import vijnana.utilidades.component.utilidades.AppDate;
import vijnana.utilidades.component.utilidades.GenerarAlmacenamientoArchivos;
import vijnana.utilidades.component.utilidades.TipoFormatoFecha;
import vijnana.utilidades.component.utilidades.ValidacionPatrones;


public class AcademicaImpl {

	private static final Logger objLog = Logger.getLogger(AcademicaImpl.class);

	/*********************************************/
	private String mensajeDialog;
	//	private String selPrograma;
	private int selecPrograma = 0;
	private boolean mostrarBotonArchivo;
	private boolean mostrarNombreArchivo;
	/******************/
	private SolicitudAcademicaDTO solicitudAcademicaDTO = new SolicitudAcademicaDTO();

	private ProgramaUniversidadDTO programaUniversidadDTO = new ProgramaUniversidadDTO();

	private List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();

	private TipoSolicitudDTO tipoSolicitudDTO = new TipoSolicitudDTO();

	private List<TipoSolicitudDTO> listaTipoSolicitudDTO = new ArrayList<TipoSolicitudDTO>();

	private File file=null;

	private ArchivoSolicitudDTO archivoSolicitudDTO = new ArchivoSolicitudDTO();

	private int colspanBotonGuardar= 2;
	private int colspanBotonPagar = 0;

	private boolean reversoArchivoSolicitud =true;
	private boolean adjuntoArchivoSolicitud =false;
	private boolean checkNoAdjunto = false;

	private boolean flujoPagoOnline = false;
	private boolean aplicacionPagoOnline = false;
	private boolean flujoEnviarCorreo = false;
	private boolean aplicacionEnviarCorreo = false;
	private boolean mostrarBotonPagoOnline = false;

	private boolean skip;

	UchileProperties propertiesAplicacion = new UchileProperties();

	//	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	//			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public AcademicaImpl(){

	}


	public void llamarRemoteCommandSeguridad(){
		iniciliazarFormulario();
		inicializarSubirArchivo();
	}
	/***********************INICIALIZAR VALORES DEL FORMULARIO *************************************/
	/** @Do inicializa los valores de todo el formulario
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void iniciliazarFormulario(){
		iniciliazarValoresDTO();
		generarValoresFormulario();
	}

	/** @Do inicializa los valores de los datos de trabajo del formulario
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void iniciliazarValoresDTO(){
		selecPrograma = 0;
		solicitudAcademicaDTO = new SolicitudAcademicaDTO();
		listaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();
		listaTipoSolicitudDTO = new ArrayList<TipoSolicitudDTO>();
		archivoSolicitudDTO = new ArchivoSolicitudDTO();
		reversoArchivoSolicitud =true;
		adjuntoArchivoSolicitud =false;
		setMostrarBotonArchivo(true);
		setMostrarNombreArchivo(false);
		checkNoAdjunto = false;
	}

	/** @Do genera los valores de disabled y llenado de combobox del formulario 
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void generarValoresFormulario(){
		iniciliazarDisabled();
		listarProgramasUniversidadDTO();
		listarTipoSolicitudDTO();
		inicializarBotonPago();
	}

	/** @Do inicializa los valores de los datos de disabled
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void iniciliazarDisabled(){

	}

	public void listarProgramasUniversidadDTO(){

		List<ProgramaUniversidadDTO> retListaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();

		UchileArte uchileArte = new UchileArte();
		//		 Mostrar Todo
		ClienteRest clienteRest = new ClienteRest();

		uchileArte = clienteRest.post(new RequestProductoDTO(), propertiesAplicacion.getLocalListarProgramaUniversidad());
		//##################################################
//		String ipServer = PropertiesAplicacion.getVijnanaServidor();
//		//String ipServer = "localhost:8080";
//		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//		uchileArte = clienteWsRestUtilidades.listarProgramaUniversidad(new RequestProductoDTO(), ipServer);
		//##################################################
		

		retListaProgramaUniversidadDTO = uchileArte.getListaProgramaUniversidadDTO(); 

		setListaProgramaUniversidadDTO(retListaProgramaUniversidadDTO);
	}

	public void listarTipoSolicitudDTO(){
		List<TipoSolicitudDTO> retListaTipoSolicitudDTO = new ArrayList<TipoSolicitudDTO>();

		UchileArte uchileArte = new UchileArte();

		ClienteRest clienteRest = new ClienteRest();

		uchileArte = clienteRest.post(new RequestProductoDTO(), propertiesAplicacion.getLocalListarTipoSolicitudes());
		//##################################################
//		String ipServer = PropertiesAplicacion.getVijnanaServidor();
//		//String ipServer = "localhost:8080";
//		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//		uchileArte = clienteWsRestUtilidades.listarTipoSolicitudes(new RequestProductoDTO(), ipServer);
		//##################################################

		retListaTipoSolicitudDTO = uchileArte.getListaTipoSolicitudDTO();

		setListaTipoSolicitudDTO(retListaTipoSolicitudDTO);

	}

	public void inicializarBotonPago(){

		flujoPagoOnline = Boolean.parseBoolean(propertiesAplicacion.getServerFlujoPagoOnlineActivo());

		aplicacionPagoOnline = Boolean.parseBoolean(propertiesAplicacion.getLocalSolicitudAcademicaPagoOnlineactivo());

		flujoEnviarCorreo = Boolean.parseBoolean(propertiesAplicacion.getServerFlujoCorreoActivo());

		aplicacionEnviarCorreo = Boolean.parseBoolean(propertiesAplicacion.getLocalSolicitudAcademicaCorreoActivo());

		if(flujoPagoOnline && aplicacionPagoOnline){
			setMostrarBotonPagoOnline(true);
			colspanBotonGuardar= 1;
			colspanBotonPagar = 1;

		}
	}

	public void inicializarSubirArchivo(){
		try {
			fileNulo();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/***********************INICIALIZAR VALORES DEL FORMULARIO ********************/
	/********************* METODOS DE FUNCIONAMIENTO /ACTIVIDADES ******************************/


	public void fileNulo() throws IOException {
		setFile(null);
	}

	/** @Do valida el input de nombre ingresado. y actualiza si existe o no
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void validarNombreSolicitudAcademica(){
		if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getNombrePersonaSolicitudAcademica()!=null){
			objLog.info("A - validarNombreSolicitudAcademica: "+solicitudAcademicaDTO.getNombrePersonaSolicitudAcademica());
		}
	}

	public void validarApellidoPaternoPersonaSolicitudAcademica(){
		if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getApellidoPaternoPersonaSolicitudAcademica()!=null){
			objLog.info("B - validarApellidoPaternoPersonaSolicitudAcademica: "+solicitudAcademicaDTO.getApellidoPaternoPersonaSolicitudAcademica());
		}
	}

	public void validarApellidoMaternoPersonaSolicitudAcademica(){
		if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getApellidoMaternoPersonaSolicitudAcademica()!=null){
			objLog.info("C - validarApellidoPaternoPersonaSolicitudAcademica: "+solicitudAcademicaDTO.getApellidoMaternoPersonaSolicitudAcademica());
		}
	}

	public void validarRutPersonaSolicitudAcademica(){
		if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getRutPersonaSolicitudAcademica()!=null){
			objLog.info("D - validarRutPersonaSolicitudAcademica: "+solicitudAcademicaDTO.getRutPersonaSolicitudAcademica());
		}
	}

	public void validarProgramaUniversidadSolicitudAcademica(){

		if(selecPrograma<1){
			solicitudAcademicaDTO.setIdProgramaUniversidad(0);
		}
		else{
			int numer = selecPrograma;

			solicitudAcademicaDTO.setIdProgramaUniversidad(numer);

			for(ProgramaUniversidadDTO pu:listaProgramaUniversidadDTO){
				if(pu.getIdProgramaUniversidad()==numer){
					solicitudAcademicaDTO.setProgramaUniversidad(pu.getNombreProgramaUniversidad());
				}
			}

			if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getIdProgramaUniversidad()>0){
				objLog.info("E - validarProgramaUniversidadSolicitudAcademica: "+solicitudAcademicaDTO.getIdProgramaUniversidad());
			}
		}
	}

	public void validarEmailPersonaSolicitudAcademica(){
		if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getMailMember()!=null){
			objLog.info("F - validarEmailPersonaSolicitudAcademica: "+solicitudAcademicaDTO.getMailMember());
		}
	}

	public void validarAnhoEgresoPersonaSolicitudAcademica(){
		if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getAnhoIngreso()!=null){
			objLog.info("G - validarAnhoEgresoPersonaSolicitudAcademica: "+solicitudAcademicaDTO.getAnhoIngreso());
		}
	}

	public void validarTipoSolicitudAcademica(){

		int numer = solicitudAcademicaDTO.getIdTipoSolicitud();

		//		String nombreTipoSolicitud="";

		solicitudAcademicaDTO.setIdTipoSolicitud(numer);

		for(TipoSolicitudDTO tsDTO:getListaTipoSolicitudDTO()){
			if(tsDTO.getIdTipoSolicitud() == numer){
				solicitudAcademicaDTO.setTipoSolicitud(tsDTO.getNombreTipoSolicitud());
				//				nombreTipoSolicitud = tsDTO.getNombreTipoSolicitud();
				break;
			}
		}

		if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getTipoSolicitud()!=null && !solicitudAcademicaDTO.getTipoSolicitud().equals("")){
			objLog.info("H - validarTipoSolicitudAcademica: "+solicitudAcademicaDTO.getTipoSolicitud());
		}

		//		setTipoSolicitud(nombreTipoSolicitud);

	}

	public void validarFundamenteSolicitudAcademica(){
		if(solicitudAcademicaDTO.getFundamentacionSolicitud()!=null && !solicitudAcademicaDTO.getFundamentacionSolicitud().equals("")){
			if(solicitudAcademicaDTO.getFundamentacionSolicitud().length()>=851){
				FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se fundamento la solicitud académica");
				FacesContext.getCurrentInstance().addMessage(null, msg);
				solicitudAcademicaDTO.setFundamentacionSolicitud("");
			}
		}

		if(solicitudAcademicaDTO!=null && solicitudAcademicaDTO.getTipoSolicitud()!=null && !solicitudAcademicaDTO.getTipoSolicitud().equals("")){
			objLog.info("I - validarFundamenteSolicitudAcademica: "+solicitudAcademicaDTO.getTipoSolicitud());
		}
	}



	public void handleFileUpload(String nombreArchivo, InputStream entrega, File f, byte[] contenido){
		objLog.info("INI handleFileUpload");
		//UploadedFile upFile = fileUploadEvent.getFile();
		try {
			long size = f.length();
			if(size<20646905){
				GenerarAlmacenamientoArchivos GenerarAlmacenamientoArchivos = new GenerarAlmacenamientoArchivos();

				String filePath = GenerarAlmacenamientoArchivos.generarNombreCarpetaProyectoNombreArchivo("solicitudesAcademicas", nombreArchivo);

				GenerarAlmacenamientoArchivos.almacenarObjectFile(f, filePath, contenido);

				solicitudAcademicaDTO.setNombreArchivo(nombreArchivo);

				archivoSolicitudDTO = new ArchivoSolicitudDTO();
				/************/
				solicitudAcademicaDTO.setNombreArchivo(nombreArchivo);
				setReversoArchivoSolicitud(false);
				setAdjuntoArchivoSolicitud(true);

				archivoSolicitudDTO.setNombreArchivoSolicitud(nombreArchivo);

				archivoSolicitudDTO.setDireccionAlmacenamientoArchivoSolicitud(filePath);

				archivoSolicitudDTO.setTipoArchivoSolicitud("solicitudAcademica");

				checkNoAdjunto = false;

				objLog.info("archivo:"+filePath+""+nombreArchivo);
				/************/
				RequestProductoDTO requestProductoDTO = new RequestProductoDTO();
				requestProductoDTO.setArchivoSolicitudDTO(archivoSolicitudDTO);
				// Mostrar Todo
				UchileArte uchileArte = new UchileArte();

				ClienteRest clienteRest = new ClienteRest();

				uchileArte = clienteRest.post(requestProductoDTO, propertiesAplicacion.getLocalCrearArchivoSolicitud());
				//##################################################
//				String ipServer = PropertiesAplicacion.getVijnanaServidor();
//				//String ipServer = "localhost:8080";
//				ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//				uchileArte = clienteWsRestUtilidades.crearArchivoSolicitud(requestProductoDTO, ipServer);
				//##################################################
				

				ArchivoSolicitudDTO metArchivoSolicitudDTO = uchileArte.getArchivoAcademicaDTO();

				setMostrarBotonArchivo(false);
				setMostrarNombreArchivo(true);
				setArchivoSolicitudDTO(metArchivoSolicitudDTO);
				setFile(f);

				if(getArchivoSolicitudDTO()!=null && archivoSolicitudDTO.getNombreArchivoSolicitud()!=null && archivoSolicitudDTO.getTipoArchivoSolicitud()!=null){
					objLog.info("I - validarFundamenteSolicitudAcademica: "+solicitudAcademicaDTO.getTipoSolicitud());
				}

			}else{
				objLog.info("Archivo " + nombreArchivo + " el archivo ha excedido el tamaño maximo 20MB.");
			}
			//Guardar el nombre y la direccion en la base de datos "archivoSolicitud y relacionarlo con solicitudAcademica"
		} catch (Exception e) {
			e.printStackTrace();
		}


		objLog.info("FIN handleFileUpload");

	}

	/** @Do valida si el llenado de los datos del formulario es correcto o no.
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public boolean validarLlenadoFormulario(SolicitudAcademicaDTO solicitudAcademicaDTO){
		boolean validar = false;

		if(solicitudAcademicaDTO.getNombrePersonaSolicitudAcademica()!=null && !solicitudAcademicaDTO.getNombrePersonaSolicitudAcademica().equals("")){
			if(solicitudAcademicaDTO.getApellidoPaternoPersonaSolicitudAcademica()!=null && !solicitudAcademicaDTO.getApellidoPaternoPersonaSolicitudAcademica().equals("")){
				if(solicitudAcademicaDTO.getApellidoMaternoPersonaSolicitudAcademica()!=null && !solicitudAcademicaDTO.getApellidoMaternoPersonaSolicitudAcademica().equals("")){
					if(solicitudAcademicaDTO.getRutPersonaSolicitudAcademica()!=null && !solicitudAcademicaDTO.getRutPersonaSolicitudAcademica().equals("")){
						if(solicitudAcademicaDTO.getIdProgramaUniversidad()!= 0 ){
								if(solicitudAcademicaDTO.getMailMember()!=null && !solicitudAcademicaDTO.getMailMember().equals("")){
									if(ValidacionPatrones.validarPatronEmail(solicitudAcademicaDTO.getMailMember())){	
										if(solicitudAcademicaDTO.getAnhoIngreso()!=null && !solicitudAcademicaDTO.getAnhoIngreso().equals("")){
											if(solicitudAcademicaDTO.getIdTipoSolicitud()!=0){
												if(solicitudAcademicaDTO.getFundamentacionSolicitud()!=null && !solicitudAcademicaDTO.getFundamentacionSolicitud().equals("")){
													validar = true;
												}else{
													objLog.error("No se fundamento la solicitud académica");
												}
											}else{
												objLog.error("No se seleccionó tipo de solicitud del alumno");
												
											}
										}else{
											objLog.error( "No se seleccionó año de ingreso del alumno");
										}
									}else{
										objLog.error("el mail ingresado no es valido");
									}
								}
								else{
									objLog.error( "No se ingreso el mail del alumno");
								}
						}else{
							objLog.error( "No se seleccionó programa de la universidad");
						}
					}else{
						objLog.error( "No se ingreso rut del alumno");
					}
				}else{
					objLog.error( "No se ingreso apellido materno del alumno");
				}
			}else{
				objLog.error( "No se ingreso apellido paterno del alumno");
			}
		}else{
			objLog.error( "No se ingreso nombre del alumno");
		}

		return validar;
	}




	/** @Do almacena/actualiza una aplicacion en la base de datos
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public boolean almacenarSolicitudAcademicaPagoOffline() throws IOException {
		//Almacenar y redirigir a exito.xhtml
		String paginaRedireccion = "/exito.xhtml";
		almacenarSolicitudAcademica(paginaRedireccion, false);
		return true;
	}

	public void almacenarSolicitudAcademicaPagoOnline() throws IOException {
		//Almacenar y redirigir a pago.xhtml
		String paginaRedireccion = "/pago.xhtml";
		almacenarSolicitudAcademica(paginaRedireccion, true);
	}



	/*AlmacenarSolicitud recibe Online y Offline, envio Correo o sin envio*/
	public void almacenarSolicitudAcademica(String paginaRedireccion, boolean online) throws IOException {
		objLog.info("INI - almacenarSolicitudAcademica:"+solicitudAcademicaDTO.getRutPersonaSolicitudAcademica());
		FacesContext context = FacesContext.getCurrentInstance();

		boolean validar = validarLlenadoFormulario(solicitudAcademicaDTO);

		if(validar==true){

			try{
				archivoSolicitudDTO = getArchivoSolicitudDTO();
				if(archivoSolicitudDTO==null){
					//Todo Ok
				}
				else{

					objLog.info("1:"+solicitudAcademicaDTO.getNombrePersonaSolicitudAcademica());
					objLog.info("2:"+solicitudAcademicaDTO.getApellidoPaternoPersonaSolicitudAcademica());
					objLog.info("3:"+solicitudAcademicaDTO.getApellidoMaternoPersonaSolicitudAcademica());
					objLog.info("4:"+solicitudAcademicaDTO.getRutPersonaSolicitudAcademica());
					objLog.info("5:"+solicitudAcademicaDTO.getIdProgramaUniversidad());
					objLog.info("6:"+solicitudAcademicaDTO.getMailMember());
					objLog.info("7:"+solicitudAcademicaDTO.getAnhoIngreso());
					objLog.info("8:"+solicitudAcademicaDTO.getIdTipoSolicitud());
					objLog.info("9:"+solicitudAcademicaDTO.getFundamentacionSolicitud()); 
					
					int hayArchivo = 0;
					String archivo = null;
					if(checkNoAdjunto!=true && archivoSolicitudDTO!=null && archivoSolicitudDTO.getIdArchivoSolicitud()>0){	
						//Se relaciona la direccion del archivo almacenado con la solicitud academica.
						if(archivoSolicitudDTO.getNombreArchivoSolicitud()!=null){
							objLog.info("10:"+archivoSolicitudDTO.getNombreArchivoSolicitud());
						}
						solicitudAcademicaDTO.setIdArchivoSolicitud(archivoSolicitudDTO.getIdArchivoSolicitud());
						solicitudAcademicaDTO.setArchivoAdjunto(true);
						hayArchivo = 1;
						archivo = solicitudAcademicaDTO.getIdArchivoSolicitud()+"";

					}else{
						solicitudAcademicaDTO.setArchivoAdjunto(false);
						//						objLog.info("Usuario con RUT:"+solicitudAcademicaDTO.getRutPersonaSolicitudAcademica()+ " no ha adjuntado su archivo ");
					}
					
//					objLog.info("VALUES("+solicitudAcademicaDTO.getAnhoIngreso()+", "+solicitudAcademicaDTO.getApellidoMaternoPersonaSolicitudAcademica()+", "+solicitudAcademicaDTO.getApellidoPaternoPersonaSolicitudAcademica()+","+
//					hayArchivo +", 1, "+solicitudAcademicaDTO.getFechaSolicitud()+", "+solicitudAcademicaDTO.getFundamentacionSolicitud()+","+
//					solicitudAcademicaDTO.getMailMember()+", "+solicitudAcademicaDTO.getNombrePersonaSolicitudAcademica()+", "+solicitudAcademicaDTO.getRutPersonaSolicitudAcademica()+","+
//					archivo, solicitudAcademicaDTO.getIdProgramaUniversidad(), solicitudAcademicaDTO.getIdTipoSolicitud());
					
				}
				//Asociar la direccion del Archivo almacenado
				solicitudAcademicaDTO.setFechaSolicitud(new Date());

				solicitudAcademicaDTO.setEstadoSolicitud(1);

				RequestProductoDTO requestProductoDTO = new RequestProductoDTO();

				requestProductoDTO.setSolicitudAcademicaDTO(solicitudAcademicaDTO);

				ClienteRest clienteRest = new ClienteRest();
				objLog.info("A1: creando Solicitud");

				UchileArte uchileArte = clienteRest.post(requestProductoDTO, propertiesAplicacion.getLocalCrearSolicitudAcademica());
				//##################################################
//				String ipServer = PropertiesAplicacion.getVijnanaServidor();
//				//String ipServer = "localhost:8080";
//				ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//				UchileArte uchileArte = clienteWsRestUtilidades.crearSolicitudAcademica(requestProductoDTO, ipServer);
				//##################################################
				

				requestProductoDTO.getSolicitudAcademicaDTO().setIdSolicitudAcademica(uchileArte.getSolicitudAcademicaDTO().getIdSolicitudAcademica());
				requestProductoDTO.getSolicitudAcademicaDTO().setProgramaUniversidad(obtenerProgramaUniversidad(solicitudAcademicaDTO.getIdProgramaUniversidad()));
				requestProductoDTO.getSolicitudAcademicaDTO().setTipoSolicitud(obtenerTipoSolicitud(solicitudAcademicaDTO.getIdTipoSolicitud()));
				requestProductoDTO.getSolicitudAcademicaDTO().setSfechaSolicitud(AppDate.obtenerFechaEnFormato(solicitudAcademicaDTO.getFechaSolicitud(), TipoFormatoFecha.DD_MM_YYYY));

				String key = ClienteRestUtilidades.generacionSolicitudAcademicaSHA(requestProductoDTO);

				if(flujoEnviarCorreo==true && aplicacionEnviarCorreo==true ){
					//clienteRest.postEmail(requestProductoDTO, "1", "1", key, propertiesAplicacion.getLocalEnviarCorreoSolicitud());
//					ClienteRest clienteRest = new ClienteRest();
					clienteRest.postEmail(requestProductoDTO,  propertiesAplicacion.getServerIdSolicitudAcademicaAplicacion(), propertiesAplicacion.getServerIdSolicitudAcademicaEmailWebmail(), key, propertiesAplicacion.getLocalEnviarCorreoSolicitud());
					objLog.info("A2: Envio Email");
				}else{
					objLog.info("A2: Envio Email false");
					objLog.info("flujoEnviarCorreo:"+flujoEnviarCorreo +" - aplicacionEnviarCorreo:"+aplicacionEnviarCorreo);
				}

				if(flujoPagoOnline == true && aplicacionPagoOnline==true && online == true){
					String valorNegocioSolicitud= ClienteRestUtilidades.obtenerContenidoRequestByMail(requestProductoDTO, propertiesAplicacion.getServerIdSolicitudAcademicaAplicacion(), propertiesAplicacion.getServerIdSolicitudAcademicaEmailWebmail());

					NegocioSolicitudDTO negocioSolicitudDTO = new NegocioSolicitudDTO();

					negocioSolicitudDTO.setValorNegocioSolicitud(valorNegocioSolicitud);

					negocioSolicitudDTO.setKeyNegocioSolicitud(key);

					negocioSolicitudDTO.setFechaInicialNegocioSolicitud(new Date());

					negocioSolicitudDTO.setFechaVencimientoNegocioSolicitud(new Date());

					requestProductoDTO.setNegocioSolicitudDTO(negocioSolicitudDTO);
					
					//##################################################
					//String ipServer = "localhost:8080";
//					uchileArte = clienteWsRestUtilidades.crearNegocioSolicitud(requestProductoDTO, ipServer);
					//##################################################
					
					clienteRest.post(requestProductoDTO, propertiesAplicacion.getLocalCrearNegocioSolicitud());
					objLog.info("A3: Creando Negocio Solicitud");
				}else{
					objLog.info("A3: Creando Negocio Solicitud false");
					objLog.info("flujoPagoOnline:"+flujoPagoOnline +" - aplicacionPagoOnline:"+aplicacionPagoOnline);
				}

				//context.addMessage(null, new FacesMessage("Aviso", "Registrando solicitud academica..."));

			}
			catch(Exception e){
				e.printStackTrace();
				objLog.info("ERROR - almacenarSolicitudAcademica:"+solicitudAcademicaDTO.getRutPersonaSolicitudAcademica()+" - "+e.getMessage());
			}
			iniciliazarFormulario();

			inicializarSubirArchivo();

			objLog.info("A4: Redireccion a "+paginaRedireccion);

			if(flujoPagoOnline == true && aplicacionPagoOnline==true && online == true){
				//Navigation.redirectExterno(paginaRedireccion);
			}else{
				//Navigation.redirectInterno(paginaRedireccion);
			}
		}

		if(validar==false){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ha realizado Solicitud");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		objLog.info("A5: Fin almacenarSolicitudAcademica");
	}


	/** @Do limpia e inicializa el formulario mediante el boton limpiar
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public String limpiarFormularioSolicitudAcademica(){

		iniciliazarFormulario();

		return null;
	}

	public String obtenerProgramaUniversidad(int idProgramaUniversidad) {
		for(ProgramaUniversidadDTO puDTO: listaProgramaUniversidadDTO){
			if(puDTO.getIdProgramaUniversidad()==idProgramaUniversidad){
				return puDTO.getNombreProgramaUniversidad(); 
			}
		}
		return "";
	}

	public String obtenerTipoSolicitud(int idTipoSolicitud) {
		for(TipoSolicitudDTO tsDTO: listaTipoSolicitudDTO){
			if(tsDTO.getIdTipoSolicitud()==idTipoSolicitud){
				return tsDTO.getNombreTipoSolicitud(); 
			}
		}
		return "";
	}

	/********************* METODOS DE FUNCIONAMIENTO ******************************/
	/******************GETTER y SETTER********************************************/

	public String getMensajeDialog() {
		return mensajeDialog;
	}

	public void setMensajeDialog(String mensajeDialog) {
		this.mensajeDialog = mensajeDialog;
	}

	public boolean isCheckNoAdjunto() {
		return checkNoAdjunto;
	}

	public void setCheckNoAdjunto(boolean checkNoAdjunto) {
		this.checkNoAdjunto = checkNoAdjunto;
	}

	public SolicitudAcademicaDTO getSolicitudAcademicaDTO() {
		return solicitudAcademicaDTO;
	}

	public void setSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO) {
		this.solicitudAcademicaDTO = solicitudAcademicaDTO;
	}

	public ProgramaUniversidadDTO getProgramaUniversidadDTO() {
		return programaUniversidadDTO;
	}

	public void setProgramaUniversidadDTO(ProgramaUniversidadDTO programaUniversidadDTO) {
		this.programaUniversidadDTO = programaUniversidadDTO;
	}

	public List<ProgramaUniversidadDTO> getListaProgramaUniversidadDTO() {
		return listaProgramaUniversidadDTO;
	}

	public void setListaProgramaUniversidadDTO(List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO) {
		this.listaProgramaUniversidadDTO = listaProgramaUniversidadDTO;
	}

	public TipoSolicitudDTO getTipoSolicitudDTO() {
		return tipoSolicitudDTO;
	}

	public void setTipoSolicitudDTO(TipoSolicitudDTO tipoSolicitudDTO) {
		this.tipoSolicitudDTO = tipoSolicitudDTO;
	}

	public List<TipoSolicitudDTO> getListaTipoSolicitudDTO() {
		return listaTipoSolicitudDTO;
	}

	public void setListaTipoSolicitudDTO(List<TipoSolicitudDTO> listaTipoSolicitudDTO) {
		this.listaTipoSolicitudDTO = listaTipoSolicitudDTO;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public ArchivoSolicitudDTO getArchivoSolicitudDTO() {
		return archivoSolicitudDTO;
	}

	public void setArchivoSolicitudDTO(ArchivoSolicitudDTO archivoSolicitudDTO) {
		this.archivoSolicitudDTO = archivoSolicitudDTO;
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public boolean isReversoArchivoSolicitud() {
		return reversoArchivoSolicitud;
	}

	public void setReversoArchivoSolicitud(boolean reversoArchivoSolicitud) {
		this.reversoArchivoSolicitud = reversoArchivoSolicitud;
	}

	public boolean isAdjuntoArchivoSolicitud() {
		return adjuntoArchivoSolicitud;
	}

	public void setAdjuntoArchivoSolicitud(boolean adjuntoArchivoSolicitud) {
		this.adjuntoArchivoSolicitud = adjuntoArchivoSolicitud;
	}

	public boolean isMostrarBotonArchivo() {
		return mostrarBotonArchivo;
	}

	public void setMostrarBotonArchivo(boolean mostrarBotonArchivo) {
		this.mostrarBotonArchivo = mostrarBotonArchivo;
	}

	public boolean isMostrarNombreArchivo() {
		return mostrarNombreArchivo;
	}

	public void setMostrarNombreArchivo(boolean mostrarNombreArchivo) {
		this.mostrarNombreArchivo = mostrarNombreArchivo;
	}

	public int getSelecPrograma() {
		return selecPrograma;
	}

	public void setSelecPrograma(int selecPrograma) {
		this.selecPrograma = selecPrograma;
	}

	public int getColspanBotonGuardar() {
		return colspanBotonGuardar;
	}

	public void setColspanBotonGuardar(int colspanBotonGuardar) {
		this.colspanBotonGuardar = colspanBotonGuardar;
	}

	public int getColspanBotonPagar() {
		return colspanBotonPagar;
	}

	public void setColspanBotonPagar(int colspanBotonPagar) {
		this.colspanBotonPagar = colspanBotonPagar;
	}

	public boolean isFlujoPagoOnline() {
		return flujoPagoOnline;
	}

	public void setFlujoPagoOnline(boolean flujoPagoOnline) {
		this.flujoPagoOnline = flujoPagoOnline;
	}

	public boolean isAplicacionPagoOnline() {
		return aplicacionPagoOnline;
	}

	public void setAplicacionPagoOnline(boolean aplicacionPagoOnline) {
		this.aplicacionPagoOnline = aplicacionPagoOnline;
	}

	public boolean isFlujoEnviarCorreo() {
		return flujoEnviarCorreo;
	}

	public void setFlujoEnviarCorreo(boolean flujoEnviarCorreo) {
		this.flujoEnviarCorreo = flujoEnviarCorreo;
	}

	public boolean isAplicacionEnviarCorreo() {
		return aplicacionEnviarCorreo;
	}

	public void setAplicacionEnviarCorreo(boolean aplicacionEnviarCorreo) {
		this.aplicacionEnviarCorreo = aplicacionEnviarCorreo;
	}

	public boolean isMostrarBotonPagoOnline() {
		return mostrarBotonPagoOnline;
	}

	public void setMostrarBotonPagoOnline(boolean mostrarBotonPagoOnline) {
		this.mostrarBotonPagoOnline = mostrarBotonPagoOnline;
	}
	
	



	
	
}
