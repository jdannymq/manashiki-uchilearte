package com.manashiki.uchilearte.solicitud.web.controller.impl;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;


import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;
import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
import com.manashiki.uchilearte.web.utilidades.cliente.ClienteRest;
import com.manashiki.uchilearte.web.utilidades.cliente.ClienteRestUtilidades;
//import com.manashiki.uchilearte.web.direccionamiento.Navigation;
//import com.manashiki.uchilearte.web.utilidades.ClienteRest;
//import com.manashiki.uchilearte.web.utilidades.ClienteRestUtilidades;
//import com.manashiki.uchilearte.web.utilidades.cliente.ClienteWsRestUtilidades;
//import com.manashiki.uchilearte.web.utilidades.properties.PropertiesAplicacion;
import com.manashiki.uchilearte.web.utilidades.properties.UchileProperties;

import vijnana.utilidades.component.utilidades.AppDate;
import vijnana.utilidades.component.utilidades.TipoFormatoFecha;
import vijnana.utilidades.component.utilidades.ValidacionPatrones;


public class SolicitudCertificadoImpl {

	private static final Logger objLog = Logger.getLogger(SolicitudCertificadoImpl.class);


	/*********************************************/
//	private String mensajeDialog ="";
	private int selecPrograma = 0;
	/******************/
	private SolicitudCertificadoDTO solicitudCertificadoDTO = new SolicitudCertificadoDTO();
	private ProgramaUniversidadDTO programaUniversidadDTO = new ProgramaUniversidadDTO();
	private List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();
	private List<TipoCertificadoDTO> listaTipoCertificado = new ArrayList<TipoCertificadoDTO>();
	private FinalidadCertificadoDTO finalidadCertificado = new FinalidadCertificadoDTO();
	private List<FinalidadCertificadoDTO> listaFinalidadCertificado = new ArrayList<FinalidadCertificadoDTO>();

	UchileProperties propertiesAplicacion = new UchileProperties();

	//	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	//			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private int colspanBotonGuardar= 2;
	private int colspanBotonPagar = 0;

	private boolean flujoPagoOnline = false;
	private boolean aplicacionPagoOnline = false;
	private boolean flujoEnviarCorreo = false;
	private boolean aplicacionEnviarCorreo = false;
	private boolean mostrarBotonPagoOnline = false;
	
	public void llamarRemoteCommandHotel(){
		iniciliazarFormulario();
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

		solicitudCertificadoDTO = new SolicitudCertificadoDTO();

		listaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();

		listaTipoCertificado = new ArrayList<TipoCertificadoDTO>();
	}

	/** @Do genera los valores de disabled y llenado de combobox del formulario 
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void generarValoresFormulario(){

		iniciliazarDisabled();

		listarProgramasUniversidadDTO();

		listarTipoCertificadoDTO();

		listarFinalidadCertificadoDTO();

		inicializarBotonPago();

	}

	/** @Do inicializa los valores de los datos de disabled
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void iniciliazarDisabled(){
//		objLog.info("INI - iniciliazarDisabled");

//		objLog.info("FIN - iniciliazarDisabled");
	}

	public void listarProgramasUniversidadDTO(){

		List<ProgramaUniversidadDTO> retListaProgramaUniversidadDTO = new ArrayList<ProgramaUniversidadDTO>();

		UchileArte uchileArte = new UchileArte();
		//		 Mostrar Todo
		ClienteRest clienteRest = new ClienteRest();
		//
		uchileArte = clienteRest.post(new RequestProductoDTO(), propertiesAplicacion.getLocalListarProgramaUniversidad());
		//##################################################
//		String ipServer = PropertiesAplicacion.getVijnanaServidor();
//		//		String ipServer = "localhost:8080";
//		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//		uchileArte = clienteWsRestUtilidades.listarProgramaUniversidad(new RequestProductoDTO(), ipServer);
		//##################################################

		retListaProgramaUniversidadDTO = uchileArte.getListaProgramaUniversidadDTO(); 

		setListaProgramaUniversidadDTO(retListaProgramaUniversidadDTO);
	}


	public void listarTipoCertificadoDTO(){

		List<TipoCertificadoDTO> retListaTipoCertificadoDTO = new ArrayList<TipoCertificadoDTO>();

		UchileArte uchileArte = new UchileArte();

				ClienteRest clienteRest = new ClienteRest();
		
				uchileArte = clienteRest.post(new RequestProductoDTO(), propertiesAplicacion.getLocalListarTipoCertificados());
		//##################################################
//		String ipServer = PropertiesAplicacion.getVijnanaServidor();
//		//		String ipServer = "localhost:8080";
//		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//		uchileArte = clienteWsRestUtilidades.listarTipoCertificados(new RequestProductoDTO(), ipServer);
		//##################################################


		retListaTipoCertificadoDTO = uchileArte.getListaTipoCertificadoDTO(); 

		setListaTipoCertificado(retListaTipoCertificadoDTO);
	}

	public void listarFinalidadCertificadoDTO(){

		List<FinalidadCertificadoDTO> retListaFinalidadCertificadoDTO = new ArrayList<FinalidadCertificadoDTO>();

		UchileArte uchileArte = new UchileArte();

		ClienteRest clienteRest = new ClienteRest();

		uchileArte = clienteRest.post(new RequestProductoDTO(), propertiesAplicacion.getLocalListarFinalidadCertificados());
		//##################################################
//		String ipServer = PropertiesAplicacion.getVijnanaServidor();
//		//		String ipServer = "localhost:8080";
//		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//		uchileArte = clienteWsRestUtilidades.listarFinalidadCertificados(new RequestProductoDTO(), ipServer);
		//##################################################

		retListaFinalidadCertificadoDTO = uchileArte.getListaFinalidadCertificadoDTO(); 

		setListaFinalidadCertificado(retListaFinalidadCertificadoDTO);
	}
	
	public void inicializarBotonPago(){

		flujoPagoOnline = Boolean.parseBoolean(propertiesAplicacion.getServerFlujoPagoOnlineActivo());

		aplicacionPagoOnline = Boolean.parseBoolean(propertiesAplicacion.getLocalSolicitudCertificadoPagoOnlineactivo());

		flujoEnviarCorreo = Boolean.parseBoolean(propertiesAplicacion.getServerFlujoCorreoActivo());

		aplicacionEnviarCorreo = Boolean.parseBoolean(propertiesAplicacion.getLocalSolicitudCertificadoCorreoActivo());

		if(flujoPagoOnline && aplicacionPagoOnline){
			setMostrarBotonPagoOnline(true);
			colspanBotonGuardar= 1;
			colspanBotonPagar = 1;

		}
	}


	/***********************INICIALIZAR VALORES DEL FORMULARIO ********************/
	/********************* METODOS DE FUNCIONAMIENTO /ACTIVIDADES ******************************/
	/** @Do valida el input de nombre ingresado. y actualiza si existe o no
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public boolean validarNombreSolicitudCertificado(){
		if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getNombrePersonaSolicitudCertificado()!=null){
			objLog.info("A - validarNombreSolicitudCertificado: "+solicitudCertificadoDTO.getNombrePersonaSolicitudCertificado());
			return true;
		}
		return false;
	}

	public boolean validarApellidoPaternoPersonaSolicitudCertificado(){
		if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getApellidoPaternoPersonaSolicitudCertificado()!=null){
			objLog.info("B - validarApellidoPaternoPersonaSolicitudCertificado: "+solicitudCertificadoDTO.getApellidoPaternoPersonaSolicitudCertificado());
			return true;
		}
		return false;
	}

	public boolean validarApellidoMaternoPersonaSolicitudCertificado(){
		if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getApellidoMaternoPersonaSolicitudCertificado()!=null){
			objLog.info("C - validarApellidoMaternoPersonaSolicitudCertificado: "+solicitudCertificadoDTO.getApellidoMaternoPersonaSolicitudCertificado());
			return true;
		}
		return false;
	}

	public boolean validarRutPersonaSolicitudCertificado(){
		if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getRutPersonaSolicitudCertificado()!=null){
			objLog.info("D - validarRutPersonaSolicitudCertificado: "+solicitudCertificadoDTO.getRutPersonaSolicitudCertificado());
			return true;
		}
		return false;
	}

	public boolean validarProgramaUniversidadSolicitudCertificado(){

		if(selecPrograma<1){
			solicitudCertificadoDTO.setIdProgramaUniversidad(0);
			return false;
		}
		else{
			int numer = selecPrograma;

			solicitudCertificadoDTO.setIdProgramaUniversidad(numer);

			for(ProgramaUniversidadDTO pu:listaProgramaUniversidadDTO){
				if(pu.getIdProgramaUniversidad()==numer){
					solicitudCertificadoDTO.setProgramaUniversidad(pu.getNombreProgramaUniversidad());
				}
			}

			if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getIdProgramaUniversidad()>0){
				objLog.info("E - validarProgramaUniversidadSolicitudCertificado: "+obtenerProgramaUniversidad(solicitudCertificadoDTO.getIdProgramaUniversidad()));
				return true;
			}
		}
		
		return false;
	}

	public boolean validarEmailPersonaSolicitudCertificado(){
		if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getMailMember()!=null){
			objLog.info("F - validarEmailPersonaSolicitudCertificado: "+solicitudCertificadoDTO.getMailMember());
			return true;
		}
		return false;
	}

	public boolean validarAnhoEgresoPersonaSolicitudCertificado(){
		if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getAnhoIngreso()!=null){
			objLog.info("G - validarAnhoEgresoPersonaSolicitudCertificado: "+solicitudCertificadoDTO.getAnhoIngreso());
			return true;
		}
		return false;
	}

	public boolean validarTipoCertificado(){

		if(solicitudCertificadoDTO.getIdTipoCertificado()<1){
			solicitudCertificadoDTO.setIdTipoCertificado(0);
			return false;
		}
		else{
			int numer = solicitudCertificadoDTO.getIdTipoCertificado();

			solicitudCertificadoDTO.setTipoCertificado(obtenerTipoCertificado(numer));

			if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getIdTipoCertificado()>0){
				objLog.info("H - validarTipoCertificado: "+obtenerTipoCertificado(solicitudCertificadoDTO.getIdTipoCertificado()));
				return true;
			}
		}
		
		return false;
	}

	public boolean validarFinalidadCertificado(){
		if(solicitudCertificadoDTO.getIdFinalidadCertificado()<1){
			solicitudCertificadoDTO.setIdFinalidadCertificado(0);
			return false;
		}
		else{
			int numer = solicitudCertificadoDTO.getIdFinalidadCertificado();

			solicitudCertificadoDTO.setFinalidadCertificado(obtenerFinalidadCertificado(numer));

			if(solicitudCertificadoDTO!=null && solicitudCertificadoDTO.getIdFinalidadCertificado()>0){
				objLog.info("I - validarFinalidadCertificado: "+obtenerFinalidadCertificado(solicitudCertificadoDTO.getIdTipoCertificado()));
				return true;
			}
		}
		return false;
	}

	/** @Do valida si el llenado de los datos del formulario es correcto o no.
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */


	public boolean validarLlenadoFormulario(SolicitudCertificadoDTO solicitudCertificadoDTO){
		//		objLog.info("INI - validarLlenadoFormulario");
		boolean validar = false;

		if(solicitudCertificadoDTO.getNombrePersonaSolicitudCertificado()!=null && !solicitudCertificadoDTO.getNombrePersonaSolicitudCertificado().equals("")){
			if(solicitudCertificadoDTO.getApellidoPaternoPersonaSolicitudCertificado()!=null && !solicitudCertificadoDTO.getApellidoPaternoPersonaSolicitudCertificado().equals("")){
				if(solicitudCertificadoDTO.getApellidoMaternoPersonaSolicitudCertificado()!=null && !solicitudCertificadoDTO.getApellidoMaternoPersonaSolicitudCertificado().equals("")){
					if(solicitudCertificadoDTO.getRutPersonaSolicitudCertificado()!=null && !solicitudCertificadoDTO.getRutPersonaSolicitudCertificado().equals("")){
						if(solicitudCertificadoDTO.getIdProgramaUniversidad()!= 0 ){
							if(solicitudCertificadoDTO.getMailMember()!=null && !solicitudCertificadoDTO.getMailMember().equals("")){
								if(ValidacionPatrones.validarPatronEmail(solicitudCertificadoDTO.getMailMember())){	
									if(solicitudCertificadoDTO.getAnhoIngreso()!=null && !solicitudCertificadoDTO.getAnhoIngreso().equals("")){
										if(solicitudCertificadoDTO.getIdTipoCertificado()!=0){
											if(solicitudCertificadoDTO.getIdFinalidadCertificado()!=0){
												validar = true;
											}else{
												FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se indicó la finalidad del certificado");
												FacesContext.getCurrentInstance().addMessage(null, msg);
											}
										}else{
											FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se indicó el tipo de certificado");
											FacesContext.getCurrentInstance().addMessage(null, msg);
										}
									}else{
										FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se indicó el año de ingreso del alumno");
										FacesContext.getCurrentInstance().addMessage(null, msg);
									}
								}
								else{
									FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "el mail ingresado no es valido");
									FacesContext.getCurrentInstance().addMessage(null, msg);
								}
							}else{
								FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso el mail del alumno");
								FacesContext.getCurrentInstance().addMessage(null, msg);
							}
						}else{
							FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se indicó el programa de la universidad");
							FacesContext.getCurrentInstance().addMessage(null, msg);
						}
					}else{
						FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso el rut del alumno");
						FacesContext.getCurrentInstance().addMessage(null, msg);
					}
				}else{
					FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso el apellido materno del alumno");
					FacesContext.getCurrentInstance().addMessage(null, msg);
				}
			}else{
				FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso el apellido paterno del alumno");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		}else{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso el nombre del alumno");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

		return validar;
	}
	
	/** @Do almacena/actualiza una aplicacion en la base de datos
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void almacenarSolicitudCertificadoPagoOffline() throws IOException {
		//Almacenar y redirigir a exito.xhtml
		String paginaRedireccion = "/exito.xhtml";
		almacenarSolicitudPostulacion(paginaRedireccion, false);
	}

	public void almacenarSolicitudCertificadoPagoOnline() throws IOException {
		//Almacenar y redirigir a pago.xhtml
		String paginaRedireccion = "/pago.xhtml";
		almacenarSolicitudPostulacion(paginaRedireccion, true);
	}
	
	/*AlmacenarSolicitud recibe Online y Offline, envio Correo o sin envio*/
	public void almacenarSolicitudPostulacion(String paginaRedireccion, boolean online) throws IOException { 
		objLog.info("INI - almacenarSolicitudCertificado "+solicitudCertificadoDTO.getRutPersonaSolicitudCertificado());
		FacesContext context = FacesContext.getCurrentInstance();
		boolean validar = false;

		validar = validarLlenadoFormulario(solicitudCertificadoDTO);

		if(validar==true){

			try{

				RequestProductoDTO requestProductoDTO = new RequestProductoDTO();

				solicitudCertificadoDTO.setFechaSolicitud(new Date());

				solicitudCertificadoDTO.setEstadoSolicitud(1);

				objLog.info("1:"+solicitudCertificadoDTO.getNombrePersonaSolicitudCertificado());
				objLog.info("2:"+solicitudCertificadoDTO.getApellidoPaternoPersonaSolicitudCertificado());
				objLog.info("3:"+solicitudCertificadoDTO.getApellidoMaternoPersonaSolicitudCertificado());
				objLog.info("4:"+solicitudCertificadoDTO.getRutPersonaSolicitudCertificado());
				objLog.info("5:"+solicitudCertificadoDTO.getIdProgramaUniversidad());
				objLog.info("6:"+solicitudCertificadoDTO.getMailMember());
				objLog.info("7:"+solicitudCertificadoDTO.getAnhoIngreso());
				objLog.info("8:"+solicitudCertificadoDTO.getIdTipoCertificado());
				objLog.info("9:"+solicitudCertificadoDTO.getIdFinalidadCertificado()); 
				objLog.info("10:"+solicitudCertificadoDTO.getFechaSolicitud());
				objLog.info("-------------------------");
				objLog.info("VALUES	("+solicitudCertificadoDTO.getAnhoIngreso()+","+solicitudCertificadoDTO.getApellidoMaternoPersonaSolicitudCertificado()+","+
				solicitudCertificadoDTO.getApellidoPaternoPersonaSolicitudCertificado()+", 1,"+solicitudCertificadoDTO.getFechaSolicitud()+", "+solicitudCertificadoDTO.getMailMember()+","+
				solicitudCertificadoDTO.getNombrePersonaSolicitudCertificado() +","+solicitudCertificadoDTO.getRutPersonaSolicitudCertificado() +","+
				solicitudCertificadoDTO.getIdFinalidadCertificado()+","+solicitudCertificadoDTO.getIdProgramaUniversidad()+","+solicitudCertificadoDTO.getIdTipoCertificado());
				objLog.info("-------------------------");
				requestProductoDTO.setSolicitudCertificadoDTO(solicitudCertificadoDTO);

				ClienteRest clienteRest = new ClienteRest();
//				objLog.info("A1: creando Solicitud");
				UchileArte uchileArte = clienteRest.post(requestProductoDTO, propertiesAplicacion.getLocalCrearSolicitudCertificado());
				//##################################################
//				String ipServer = PropertiesAplicacion.getVijnanaServidor();
//				//		String ipServer = "localhost:8080";
//				ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//				UchileArte uchileArte = clienteWsRestUtilidades.crearSolicitudCertificado(requestProductoDTO, ipServer);
				//##################################################

				requestProductoDTO.getSolicitudCertificadoDTO().setIdSolicitudCertificado(uchileArte.getSolicitudCertificadoDTO().getIdSolicitudCertificado());
				requestProductoDTO.getSolicitudCertificadoDTO().setProgramaUniversidad(obtenerProgramaUniversidad(solicitudCertificadoDTO.getIdProgramaUniversidad()));
				requestProductoDTO.getSolicitudCertificadoDTO().setTipoCertificado(obtenerTipoCertificado(solicitudCertificadoDTO.getIdTipoCertificado()));
				requestProductoDTO.getSolicitudCertificadoDTO().setFinalidadCertificado(obtenerFinalidadCertificado(solicitudCertificadoDTO.getIdFinalidadCertificado()));
				requestProductoDTO.getSolicitudCertificadoDTO().setSfechaSolicitud(AppDate.obtenerFechaEnFormato(solicitudCertificadoDTO.getFechaSolicitud(), TipoFormatoFecha.DD_MM_YYYY));

				String key = ClienteRestUtilidades.generacionSolicitudCertificadoSHA(requestProductoDTO);

				if(flujoEnviarCorreo==true && aplicacionEnviarCorreo==true ){
					clienteRest.postEmail(requestProductoDTO, "1", "1", key, propertiesAplicacion.getLocalEnviarCorreoSolicitud());
//					ClienteRest clienteRest = new ClienteRest();
					clienteRest.postEmail(requestProductoDTO,  propertiesAplicacion.getServerIdSolicitudCertificadoAplicacion(), propertiesAplicacion.getServerIdSolicitudCertificadoEmailWebmail(), key, propertiesAplicacion.getLocalEnviarCorreoSolicitud());
					objLog.info("A2: Envio Email true");
				}else{
					objLog.info("A2: Envio Email false");
					objLog.info("flujoEnviarCorreo:"+flujoEnviarCorreo +" - aplicacionEnviarCorreo:"+aplicacionEnviarCorreo);
				}
				//permitido en los flujos, en la aplicacion particular, si el usuario seleccionó pagar
				if(flujoPagoOnline == true && aplicacionPagoOnline==true && online == true){
					String valorNegocioSolicitud= ClienteRestUtilidades.obtenerContenidoRequestByMail(requestProductoDTO, propertiesAplicacion.getServerIdSolicitudCertificadoAplicacion(), propertiesAplicacion.getServerIdSolicitudCertificadoEmailWebmail());

					NegocioSolicitudDTO negocioSolicitudDTO = new NegocioSolicitudDTO();

					negocioSolicitudDTO.setValorNegocioSolicitud(valorNegocioSolicitud);
					negocioSolicitudDTO.setKeyNegocioSolicitud(key);
					negocioSolicitudDTO.setFechaInicialNegocioSolicitud(new Date());
					negocioSolicitudDTO.setFechaVencimientoNegocioSolicitud(new Date());

					requestProductoDTO.setNegocioSolicitudDTO(negocioSolicitudDTO);

					clienteRest.post(requestProductoDTO, propertiesAplicacion.getLocalCrearNegocioSolicitud());
					//##################################################
//					uchileArte = clienteWsRestUtilidades.crearNegocioSolicitud(requestProductoDTO, ipServer);
					//##################################################
					
					
					objLog.info("A3: Creando Negocio Solicitud true");
				}else{
					objLog.info("A3: Creando Negocio Solicitud false");
					objLog.info("flujoPagoOnline:"+flujoPagoOnline +" - aplicacionPagoOnline:"+aplicacionPagoOnline);
				}

				context.addMessage(null, new FacesMessage("Aviso", "Creando solicitud certificado"));


			}catch(Exception e){

			}

			iniciliazarFormulario();

			objLog.info("A4: Redireccion a "+paginaRedireccion);

			if(flujoPagoOnline == true && aplicacionPagoOnline==true && online == true){
				//Navigation.redirectExterno(paginaRedireccion);
			}else{
				//Navigation.redirectInterno(paginaRedireccion);
			}
		}

		if(validar==false){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ha realizado Almacenamiento");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		objLog.info("A5: Fin almacenarSolicitudCertificado");
	}
	
	/** @Do limpia e inicializa el formulario mediante el boton limpiar
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public String limpiarFormularioSolicitudCertificado(){

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

	public String obtenerTipoCertificado(int idTipoCertificado) {
		for(TipoCertificadoDTO tcDTO: listaTipoCertificado){
			if(tcDTO.getIdTipoCertificado()==idTipoCertificado){
				return tcDTO.getNombreTipoCertificado(); 
			}
		}
		return "";
	}

	public String obtenerFinalidadCertificado(int idFinalidadCertificado) {
		for(FinalidadCertificadoDTO fcDTO: listaFinalidadCertificado){
			if(fcDTO.getIdFinalidadCertificado()==idFinalidadCertificado){
				return fcDTO.getNombreFinalidadCertificado(); 
			}
		}
		return "";
	}
	
	/********************* METODOS DE FUNCIONAMIENTO ******************************/
	/******************GETTER y SETTER********************************************/

//	public String getMensajeDialog() {
//		return mensajeDialog;
//	}

	public SolicitudCertificadoDTO getSolicitudCertificadoDTO() {
		return solicitudCertificadoDTO;
	}

	public void setSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO) {
		this.solicitudCertificadoDTO = solicitudCertificadoDTO;
	}

	public List<TipoCertificadoDTO> getListaTipoCertificado() {
		return listaTipoCertificado;
	}

	public FinalidadCertificadoDTO getFinalidadCertificado() {
		return finalidadCertificado;
	}

	public List<FinalidadCertificadoDTO> getListaFinalidadCertificado() {
		return listaFinalidadCertificado;
	}

//	public void setMensajeDialog(String mensajeDialog) {
//		this.mensajeDialog = mensajeDialog;
//	}

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

	//	public void setTipoCertificado(TipoCertificadoDTO tipoCertificado) {
	//		this.tipoCertificado = tipoCertificado;
	//	}

	public void setListaTipoCertificado(List<TipoCertificadoDTO> listaTipoCertificado) {
		this.listaTipoCertificado = listaTipoCertificado;
	}

	public void setFinalidadCertificado(FinalidadCertificadoDTO finalidadCertificado) {
		this.finalidadCertificado = finalidadCertificado;
	}

	public void setListaFinalidadCertificado(List<FinalidadCertificadoDTO> listaFinalidadCertificado) {
		this.listaFinalidadCertificado = listaFinalidadCertificado;
	}

	public int getSelecPrograma() {
		return selecPrograma;
	}

	public void setSelecPrograma(int selecPrograma) {
		this.selecPrograma = selecPrograma;
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
	
	
}
