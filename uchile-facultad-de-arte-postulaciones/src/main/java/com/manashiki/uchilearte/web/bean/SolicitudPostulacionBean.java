package com.manashiki.uchilearte.web.bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.FlowEvent;
import org.primefaces.model.UploadedFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;
import com.manashiki.uchilearte.servdto.request.RequestProductoDTO;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;
import com.manashiki.uchilearte.servdto.wrapper.UchileArte;
import com.manashiki.uchilearte.web.utilidades.cliente.ClienteRest;
import com.manashiki.uchilearte.web.utilidades.cliente.ClienteRestUtilidades;
import com.manashiki.uchilearte.web.utilidades.direccionamiento.Navigation;
//import com.manashiki.uchilearte.web.utilidades.cliente.ClienteWsRestUtilidades;
import com.manashiki.uchilearte.web.utilidades.properties.UchileProperties;

import vijnana.utilidades.component.utilidades.AppDate;
import vijnana.utilidades.component.utilidades.GenerarAlmacenamientoArchivos;
import vijnana.utilidades.component.utilidades.TipoFormatoFecha;
import vijnana.utilidades.component.utilidades.ValidacionPatrones;

@ManagedBean(name = "solicitudPostulacionBean")
@ViewScoped
public class SolicitudPostulacionBean implements Serializable{

	private static final long serialVersionUID = 3409917190126496151L;

	private static final Logger objLog = LoggerFactory.getLogger(SolicitudPostulacionBean.class);
	/*********************************************/
	private String mensajeDialog;
	//	private String selPrograma;
	private int selecPrograma = 0;
	/******************/
	private SolicitudPostulacionDTO solicitudPostulacionDTO;
	private ProgramaUniversidadDTO programaUniversidadDTO;
	private List<ProgramaUniversidadPostulacionDTO> listaProgramaUniversidadPostulacionDTO;
	private List<RegionDTO> listaRegionesDTO;
	private List<ComunaDTO> listaComunasDTO;

	private UploadedFile file=null;
	private ArchivoSolicitudDTO archivoSolicitudPostulacionDTO;

	UchileProperties uchileProperties = new UchileProperties();

	//	private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	//			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	private String textoCostoProgramaUniversidad;

	private int colspanBotonGuardar= 2;
	private int colspanBotonPagar = 0;

	private boolean mostrarCondicionesPago;
	private boolean disabledRegion;
	private boolean disabledComuna;
	private boolean mostrarBotonArchivo;
	private boolean mostrarNombreArchivo;

	private boolean flujoPagoOnline = false;
	private boolean aplicacionPagoOnline = false;
	private boolean flujoEnviarCorreo = false;
	private boolean aplicacionEnviarCorreo = false;
	private boolean mostrarBotonPagoOnline = false;


	private boolean skip;

	//mostrar o no mostrar boton de pagar online.

	public SolicitudPostulacionBean(){

	}

	public String validarFlujoProceso(FlowEvent event) {
		if(skip) {
			skip = false;   //reset in case user goes back
			return "confirm";
		}
		else {
			return event.getNewStep();
		}
	}

	public void llamarRemoteCommandSeguridad(){
		iniciliazarFormulario();
		//		inicializarSubirCSV();
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
		//		objLog.info("INI - iniciliazarValoresDTO");
		selecPrograma = 0;

		archivoSolicitudPostulacionDTO = null;

		solicitudPostulacionDTO = new SolicitudPostulacionDTO();

		listaProgramaUniversidadPostulacionDTO = new ArrayList<ProgramaUniversidadPostulacionDTO>();

		listaRegionesDTO=new ArrayList<RegionDTO>();

		listaComunasDTO=new ArrayList<ComunaDTO>();


	}

	/** @Do genera los valores de disabled y llenado de combobox del formulario 
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void generarValoresFormulario(){
		//		objLog.info("INI - generarValoresFormulario");
		iniciliazarDisabled();
		listarProgramasUniversidadPostulacionDTO();
		listarRegionesDTO();

		inicializarBotonPago();
		//		objLog.info("FIN - generarValoresFormulario");
	}

	/** @Do inicializa los valores de los datos de disabled
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public void iniciliazarDisabled(){
		//		objLog.info("INI - iniciliazarDisabled");
		setMostrarCondicionesPago(false);
		setDisabledRegion(true);
		setDisabledComuna(true);
		setMostrarBotonArchivo(true);
		setMostrarNombreArchivo(false);
		//		objLog.info("FIN - iniciliazarDisabled");
	}
	/** @Do inicializa los datos de datatable de aplicaciones del formulario
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */

	public void listarProgramasUniversidadPostulacionDTO(){
		//		objLog.info("INI - listarProgramasUnivrsidadDTO");
		List<ProgramaUniversidadPostulacionDTO> retListaProgramaUniversidadPostulacionDTO = new ArrayList<ProgramaUniversidadPostulacionDTO>();
		// Mostrar Todo
		UchileArte uchileArte = new UchileArte();
		//		 Mostrar Todo
		ClienteRest clienteRest = new ClienteRest();

		uchileArte = clienteRest.post(new RequestProductoDTO(), uchileProperties.getLocalListarProgramaUniversidadPostulacionConPrecio());
		//##################################################
//		String ipServer = UchileProperties.getVijnanaServidor();
//		//String ipServer = "localhost:8080";
//		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//		uchileArte = clienteWsRestUtilidades.listarProgramaUniversidadPostulacionConPrecio(new RequestProductoDTO(), ipServer);
		//##################################################

		retListaProgramaUniversidadPostulacionDTO = uchileArte.getListaProgramaUniversidadPostulacionDTO();

		setListaProgramaUniversidadPostulacionDTO(retListaProgramaUniversidadPostulacionDTO);

	}

	public void listarRegionesDTO(){
		List<RegionDTO> metListaRegionDTO = new ArrayList<RegionDTO>();
		List<RegionDTO> finalListaRegionDTO = new ArrayList<RegionDTO>();
		// Mostrar Todo

		UchileArte uchileArte = new UchileArte();
		//		 Mostrar Todo
		ClienteRest clienteRest = new ClienteRest();

		uchileArte = clienteRest.post(new RequestProductoDTO(), uchileProperties.getLocalListarRegiones());
		//##################################################
//		String ipServer = UchileProperties.getVijnanaServidor();
//		//String ipServer = "localhost:8080";
//		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//		uchileArte = clienteWsRestUtilidades.listarRegiones(new RequestProductoDTO(), ipServer);
		//##################################################

		metListaRegionDTO = uchileArte.getListaRegionDTO();

		for(RegionDTO reg: metListaRegionDTO){
			if(!reg.getCodigoRegion().equals("None")){
				finalListaRegionDTO.add(reg);
			}
		}

		setListaRegionesDTO(finalListaRegionDTO);
	}

	public void seleccionarComunaXRegion(){
		//		objLog.info("INI - seleccionarComunaXRegion");

		ComunaDTO metComDTO=new ComunaDTO();
		solicitudPostulacionDTO.setNombreComuna("");
		if(solicitudPostulacionDTO.getIdRegionDomicilio()==0 || solicitudPostulacionDTO.getIdRegionDomicilio()<1){
			listaComunasDTO=new ArrayList<ComunaDTO>();
			setListaComunasDTO(listaComunasDTO);
			solicitudPostulacionDTO.setNombreComuna("");
			solicitudPostulacionDTO.setCiudadDomicilio("");
			setDisabledComuna(true);

		}
		else{
			metComDTO.setIdRegion(solicitudPostulacionDTO.getIdRegionDomicilio());
			listaComunasXRegion(metComDTO);
			setDisabledComuna(false);
		}
		//		objLog.info("FIN - seleccionarComunaXRegion");
	}

	private void listaComunasXRegion(ComunaDTO comDTO){

		List<ComunaDTO> listaComunaDTO = new ArrayList<ComunaDTO>();

		UchileArte uchileArte = new UchileArte();

		ClienteRest clienteRest = new ClienteRest();

		//Buscar en Todas las Regiones 
		RequestProductoDTO requestProductoDTO = new RequestProductoDTO();

		requestProductoDTO.setComunaDTO(comDTO);

		uchileArte = clienteRest.post(requestProductoDTO, uchileProperties.getLocalListarComunasxRegion());
		
		//##################################################
//		String ipServer = UchileProperties.getVijnanaServidor();
//		//String ipServer = "localhost:8080";
//		ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//		uchileArte = clienteWsRestUtilidades.listarComunasxRegion(requestProductoDTO, ipServer);
		//##################################################
		

		listaComunaDTO = uchileArte.getListaComunaDTO(); 

		//Setear el Valor de la Lista del Modelo a la vista.
		setListaComunasDTO(listaComunaDTO);
	}

	public void inicializarBotonPago(){

		flujoPagoOnline = Boolean.parseBoolean(uchileProperties.getServerFlujoPagoOnlineActivo());

		aplicacionPagoOnline = Boolean.parseBoolean(uchileProperties.getLocalSolicitudPostulacionPagoOnlineactivo());

		flujoEnviarCorreo = Boolean.parseBoolean(uchileProperties.getServerFlujoCorreoActivo());

		aplicacionEnviarCorreo = Boolean.parseBoolean(uchileProperties.getLocalSolicitudPostulacionCorreoActivo());

		if(flujoPagoOnline && aplicacionPagoOnline){
			setMostrarBotonPagoOnline(true);
			colspanBotonGuardar= 1;
			colspanBotonPagar = 1;

		}
	}

	/***********************INICIALIZAR VALORES DEL FORMULARIO ********************/
	/********************* METODOS DE FUNCIONAMIENTO /ACTIVIDADES ******************************/

	public void fileNulo() throws IOException {
		setFile(null);
	}
	/**1**/

	public void validarProgramaUniversidad(){
		String metTextoCostoProgramaUniversidad ="";

		if(selecPrograma<1){
			solicitudPostulacionDTO.setIdProgramaUniversidadPostulacion(0);;
		}
		else{
			int numer = selecPrograma;

			solicitudPostulacionDTO.setIdProgramaUniversidadPostulacion(numer);

			for(ProgramaUniversidadPostulacionDTO puDTO:listaProgramaUniversidadPostulacionDTO){
				if(puDTO.getIdProgramaUniversidadPostulacion()==numer){
					solicitudPostulacionDTO.setProgramaPostulacionUniversidad(puDTO.getNombreProgramaUniversidadPostulacion());
					metTextoCostoProgramaUniversidad = "El valor del arancel de inscripción inscripcion del programa de "+puDTO.getNombreProgramaUniversidadPostulacion()+" es de "+puDTO.getCostoProgramaUniversidadPostulacion() +" pesos"; 
					setMostrarCondicionesPago(true);
					break;
				}
			}

			setTextoCostoProgramaUniversidad(metTextoCostoProgramaUniversidad);

			if(solicitudPostulacionDTO!=null && solicitudPostulacionDTO.getIdProgramaUniversidadPostulacion()>0){
				objLog.info("A - validarProgramaUniversidad: "+solicitudPostulacionDTO.getIdProgramaUniversidadPostulacion());
			}
		}
	}
	/**2**/
	public void validarRutPersonaSolicitudPostulacion(){
		if(solicitudPostulacionDTO.getRutPersonaSolicitudPostulacion()!=null && !solicitudPostulacionDTO.getRutPersonaSolicitudPostulacion().equals("") ){
			objLog.info("B:"+solicitudPostulacionDTO.getRutPersonaSolicitudPostulacion());
		}
	}
	/**3**/
	public void validarNombreSolicitudPostulacion(){
		if(solicitudPostulacionDTO.getNombrePersonaSolicitudPostulacion()!=null && !solicitudPostulacionDTO.getNombrePersonaSolicitudPostulacion().equals("") ){
			objLog.info("C:"+solicitudPostulacionDTO.getNombrePersonaSolicitudPostulacion());
		}
	}
	/**4**/
	public void validarApellidoPaternoPersonaSolicitudPostulacion(){
		if(solicitudPostulacionDTO.getApellidoPaternoPersonaSolicitudPostulacion()!=null && !solicitudPostulacionDTO.getApellidoPaternoPersonaSolicitudPostulacion().equals("") ){
			objLog.info("D:"+solicitudPostulacionDTO.getApellidoPaternoPersonaSolicitudPostulacion());
		}

	}
	/**5**/
	public void validarApellidoMaternoPersonaSolicitudPostulacion(){
		if(solicitudPostulacionDTO.getApellidoMaternoPersonaSolicitudPostulacion()!=null && !solicitudPostulacionDTO.getApellidoMaternoPersonaSolicitudPostulacion().equals("") ){
			objLog.info("E:"+solicitudPostulacionDTO.getApellidoMaternoPersonaSolicitudPostulacion());
		}
	}
	/**6**/
	public void validarFechaNacimiento(){
		if(solicitudPostulacionDTO.getFechaNacimiento()!=null && !solicitudPostulacionDTO.getFechaNacimiento().equals("") ){
			objLog.info("F:"+solicitudPostulacionDTO.getFechaNacimiento());
		}
	}
	/**7**/
	public void validarNacionalidad(){
		if(solicitudPostulacionDTO.getNacionalidad()!=null && !solicitudPostulacionDTO.getNacionalidad().equals("") ){
			objLog.info("G:"+solicitudPostulacionDTO.getNacionalidad());
		}
	}
	/**8**/
	public void validarFonoContacto(){
		if(solicitudPostulacionDTO.getFonoContacto()!=null && !solicitudPostulacionDTO.getFonoContacto().equals("") ){
			objLog.info("H:"+solicitudPostulacionDTO.getFonoContacto());
		}

	}
	/**9**/
	public void validarCelularContacto(){
		if(solicitudPostulacionDTO.getCelularContacto()!=null && !solicitudPostulacionDTO.getCelularContacto().equals("") ){
			objLog.info("I:"+solicitudPostulacionDTO.getCelularContacto());
		}
	}
	/**10**/
	public void validarEmailPersonaSolicitudPostulacion(){
		if(solicitudPostulacionDTO.getMailMember()!=null && !solicitudPostulacionDTO.getMailMember().equals("") ){
			solicitudPostulacionDTO.setMailMember(solicitudPostulacionDTO.getMailMember().trim());
			objLog.info("J:"+solicitudPostulacionDTO.getMailMember());
		}
	}
	/**11**/
	public void validarPaisDomicilio(){
		if(solicitudPostulacionDTO.getPaisDomicilio()!=null && !solicitudPostulacionDTO.getPaisDomicilio().equals("") ){
			if(solicitudPostulacionDTO.getPaisDomicilio().equalsIgnoreCase("chile")){
				setDisabledRegion(false);
			}
			objLog.info("K:"+solicitudPostulacionDTO.getPaisDomicilio());
		}

	}
	/**12**/
	public void validarComunaDomicilio(){
		if(solicitudPostulacionDTO.getIdComunaDomicilio()>0){
			objLog.info("L:"+solicitudPostulacionDTO.getIdComunaDomicilio());
		}

	}
	/**13**/
	public void validarCiudadDomicilio(){
		if(solicitudPostulacionDTO.getDomicilio()!=null && !solicitudPostulacionDTO.getDomicilio().equals("") ){
			objLog.info("M:"+solicitudPostulacionDTO.getDomicilio());
		}
	}
	/**14**/

	public void validarDomicilio(){
		if(solicitudPostulacionDTO.getCiudadDomicilio()!=null && !solicitudPostulacionDTO.getCiudadDomicilio().equals("") ){
			objLog.info("N:"+solicitudPostulacionDTO.getCiudadDomicilio());
		}
	}
	/**15**/
	public void validarTituloProfesional(){
		if(solicitudPostulacionDTO.getTituloProfesional()!=null && !solicitudPostulacionDTO.getTituloProfesional().equals("") ){
			objLog.info("O:"+solicitudPostulacionDTO.getTituloProfesional());
		}
	}
	/**16**/
	public void validarEntidadEducacional(){
		if(solicitudPostulacionDTO.getEntidadEducacional()!=null && !solicitudPostulacionDTO.getEntidadEducacional().equals("") ){
			objLog.info("P:"+solicitudPostulacionDTO.getEntidadEducacional());
		}
	}
	/**17**/
	public void validarPaisEntidadEducacional(){
		if(solicitudPostulacionDTO.getPaisEntidadEducacional()!=null && !solicitudPostulacionDTO.getPaisEntidadEducacional().equals("") ){
			objLog.info("Q:"+solicitudPostulacionDTO.getPaisEntidadEducacional());
		}
	}
	/**18**/
	public void validarAnhoObtencionEntidadEducacional(){
		if(solicitudPostulacionDTO.getAnhoObtencionEntidadEducacional()!=null && !solicitudPostulacionDTO.getAnhoObtencionEntidadEducacional().equals("") ){
			objLog.info("R:"+solicitudPostulacionDTO.getAnhoObtencionEntidadEducacional());
		}
	}
	/**19**/
	public void validarOcupacionActual(){
		if(solicitudPostulacionDTO.getOcupacionActual()!=null && !solicitudPostulacionDTO.getOcupacionActual().equals("") ){
			objLog.info("S:"+solicitudPostulacionDTO.getOcupacionActual());
		}
	}
	/**20**/
	public void validarInteresPrograma(){
		if(solicitudPostulacionDTO.getInteresPrograma()!=null && !solicitudPostulacionDTO.getInteresPrograma().equals("") ){
			objLog.info("T:"+solicitudPostulacionDTO.getInteresPrograma());
		}
	}
	/**21**/
	public void validarFuenteFinanciamiento(){
		if(solicitudPostulacionDTO.getFuenteFinancimiamiento()!=null && !solicitudPostulacionDTO.getFuenteFinancimiamiento().equals("") ){
			objLog.info("U:"+solicitudPostulacionDTO.getFuenteFinancimiamiento());
		}

	}
	/**22**/
	public void validarComentarios(){
		if(solicitudPostulacionDTO.getComentarios()!=null && !solicitudPostulacionDTO.getComentarios().equals("")){
			if(solicitudPostulacionDTO.getComentarios()!=null && !solicitudPostulacionDTO.getComentarios().equals("") ){
				if(solicitudPostulacionDTO.getComentarios().length()>=851){
					FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "Comentarios de la postulacion muy extensos");
					FacesContext.getCurrentInstance().addMessage(null, msg);
				}
				objLog.info("V:"+solicitudPostulacionDTO.getComentarios());
			}
		}
	}



	public void handleFileUpload(FileUploadEvent fileUploadEvent){
		UploadedFile upFile = fileUploadEvent.getFile();

		try {
			GenerarAlmacenamientoArchivos GenerarAlmacenamientoArchivos = new GenerarAlmacenamientoArchivos();
			/***Archivo creado en la carpeta temp del tomcat ***/
			String filePath = GenerarAlmacenamientoArchivos.generarNombreCarpetaProyectoNombreArchivo("solicitudesPostulaciones", upFile.getFileName());

			GenerarAlmacenamientoArchivos.almacenarObjectFile(upFile, filePath, upFile.getContents());

			solicitudPostulacionDTO.setNombreArchivoSolicitud(upFile.getFileName());

			/***Archivo creado en la carpeta temp del tomcat ***/
			/***Asociar el archivo con la postulacion ***/
			archivoSolicitudPostulacionDTO = new ArchivoSolicitudDTO();

			archivoSolicitudPostulacionDTO.setNombreArchivoSolicitud(upFile.getFileName());

			archivoSolicitudPostulacionDTO.setDireccionAlmacenamientoArchivoSolicitud(filePath);

			archivoSolicitudPostulacionDTO.setTipoArchivoSolicitud("solicitudPostulacion");

			objLog.info("archivo:"+filePath+""+upFile.getFileName());

			UchileArte uchileArte = new UchileArte();
			//		 Mostrar Todo
			ClienteRest clienteRest = new ClienteRest();

			RequestProductoDTO requestProductoDTO = new RequestProductoDTO();

			requestProductoDTO.setArchivoSolicitudDTO(archivoSolicitudPostulacionDTO);

			uchileArte = clienteRest.post(requestProductoDTO, uchileProperties.getLocalCrearArchivoSolicitud());
			
			//##################################################
//			String ipServer = UchileProperties.getVijnanaServidor();
//			//String ipServer = "localhost:8080";
//			ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//			uchileArte = clienteWsRestUtilidades.crearArchivoSolicitud(requestProductoDTO, ipServer);
			//##################################################
			

			ArchivoSolicitudDTO metArchivoSolicitudDTO = uchileArte.getArchivoAcademicaDTO(); 
			//			ArchivoSolicitudDTO metArchivoSolicitudDTO = archivoSolicitudPostulacionDTO;

			setMostrarBotonArchivo(false);

			setMostrarNombreArchivo(true);

			setArchivoSolicitudPostulacionDTO(metArchivoSolicitudDTO);

			setFile(file);

		} catch (Exception e) {
			e.printStackTrace();
		}

		FacesMessage message = new FacesMessage("Succesful", fileUploadEvent.getFile().getFileName() + " ha sido añadido a la postulación.");

		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public boolean validarLlenadoFormularioPostulacion(SolicitudPostulacionDTO solicitudPostulacionDTO){

		boolean validar = false;

		if(solicitudPostulacionDTO.getNombrePersonaSolicitudPostulacion()!=null && !solicitudPostulacionDTO.getNombrePersonaSolicitudPostulacion().equals("")){
			if(solicitudPostulacionDTO.getApellidoPaternoPersonaSolicitudPostulacion()!=null && !solicitudPostulacionDTO.getApellidoPaternoPersonaSolicitudPostulacion().equals("")){
				if(solicitudPostulacionDTO.getApellidoMaternoPersonaSolicitudPostulacion()!=null && !solicitudPostulacionDTO.getApellidoMaternoPersonaSolicitudPostulacion().equals("")){
					if(solicitudPostulacionDTO.getIdProgramaUniversidadPostulacion()!= 0 ){
						if(solicitudPostulacionDTO.getRutPersonaSolicitudPostulacion()!=null && !solicitudPostulacionDTO.getRutPersonaSolicitudPostulacion().equals("")){
							if(solicitudPostulacionDTO.getFechaNacimiento()!=null && !solicitudPostulacionDTO.getFechaNacimiento().equals("")){
								if(solicitudPostulacionDTO.getMailMember()!=null && !solicitudPostulacionDTO.getMailMember().equals("")){
									if(ValidacionPatrones.validarPatronEmail(solicitudPostulacionDTO.getMailMember())){	
										if(solicitudPostulacionDTO.getTituloProfesional()!=null && !solicitudPostulacionDTO.getTituloProfesional().equals("")){
											if(solicitudPostulacionDTO.getEntidadEducacional()!=null && !solicitudPostulacionDTO.getEntidadEducacional().equals("")){
												if(getArchivoSolicitudPostulacionDTO()==null){
													FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "Deben adjuntarse los documentos obligatorios para la postulación");
													FacesContext.getCurrentInstance().addMessage(null, msg);
												}else{
													ArchivoSolicitudDTO metArchivoSolicitudPostulacionDTO = getArchivoSolicitudPostulacionDTO();
													if(metArchivoSolicitudPostulacionDTO!=null && metArchivoSolicitudPostulacionDTO.getIdArchivoSolicitud()>0){
														validar = true;
													}else{
														FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se han adjuntado los documentos obligatorios para la postulación");
														FacesContext.getCurrentInstance().addMessage(null, msg);
													}
												}
											}else{
												FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso casa de estudios");
												FacesContext.getCurrentInstance().addMessage(null, msg);
											}
										}else{
											FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso titulo profesional");
											FacesContext.getCurrentInstance().addMessage(null, msg);
										}
									}else{
										FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "el mail ingresado no es valido");
										FacesContext.getCurrentInstance().addMessage(null, msg);
									}
								}else{
									FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso email para postulación");
									FacesContext.getCurrentInstance().addMessage(null, msg);
								}
							}else{
								FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso fecha de nacimiento del postulante");
								FacesContext.getCurrentInstance().addMessage(null, msg);
							}
						}else{
							FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso rut del postulante");
							FacesContext.getCurrentInstance().addMessage(null, msg);
						}
					}
					else{
						FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se seleccionó programa de la universidad");
						FacesContext.getCurrentInstance().addMessage(null, msg);
					}
				}else{
					FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso apellido materno del postulante");
					FacesContext.getCurrentInstance().addMessage(null, msg);
				}
			}else{
				FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso apellido paterno del postulante");
				FacesContext.getCurrentInstance().addMessage(null, msg);
			}
		}else{
			FacesMessage msg=new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ingreso nombre del postulante");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

		return validar;
	}

	/** @Do almacena/actualiza una aplicacion en la base de datos
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	boolean enviarCorreo = false;
	boolean online = false;

	public void almacenarSolicitudPostulacionPagoOnline() throws IOException {
		//Almacenar y redirigir a pago.xhtml
		String paginaRedireccion = "/pago.xhtml";
		boolean online = true;
		almacenarSolicitudPostulacion(paginaRedireccion, enviarCorreo, online);
	}

	public void almacenarSolicitudPostulacionPagoOffline() throws IOException {
		//Almacenar y redirigir a exito.xhtml
		String paginaRedireccion = "/exito.xhtml";
		boolean online = false;
		almacenarSolicitudPostulacion(paginaRedireccion, enviarCorreo, online);
	}

	public void almacenarSolicitudPostulacion(String paginaRedireccion, boolean enviarCorreo, boolean online) throws IOException { 
		FacesContext context = FacesContext.getCurrentInstance();

		boolean validar = validarLlenadoFormularioPostulacion(solicitudPostulacionDTO);

		if(validar==true){

			try{
				//Asociar el archivo con la Solicitud Academica
				archivoSolicitudPostulacionDTO = getArchivoSolicitudPostulacionDTO();

				solicitudPostulacionDTO.setIdArchivoSolicitud(archivoSolicitudPostulacionDTO.getIdArchivoSolicitud());

				solicitudPostulacionDTO.setFechaSolicitudPostulacion(new Date());

				solicitudPostulacionDTO.setEstadoSolicitudPostulacion(1);

				objLog.info("1:"+solicitudPostulacionDTO.getNombrePersonaSolicitudPostulacion());
				objLog.info("2:"+solicitudPostulacionDTO.getApellidoPaternoPersonaSolicitudPostulacion());
				objLog.info("3:"+solicitudPostulacionDTO.getApellidoMaternoPersonaSolicitudPostulacion());
				objLog.info("4:"+solicitudPostulacionDTO.getRutPersonaSolicitudPostulacion());
				objLog.info("5:"+solicitudPostulacionDTO.getIdProgramaUniversidadPostulacion());
				objLog.info("6:"+solicitudPostulacionDTO.getMailMember());
				objLog.info("7:"+solicitudPostulacionDTO.getCelularContacto());
				objLog.info("8:"+solicitudPostulacionDTO.getCiudadDomicilio());
				objLog.info("9 fuentes:"+solicitudPostulacionDTO.getFuenteFinancimiamiento());
				objLog.info("10 comentarios:"+solicitudPostulacionDTO.getComentarios());
				objLog.info("11 interes:"+solicitudPostulacionDTO.getInteresPrograma());

				ClienteRest clienteRest = new ClienteRest();
				objLog.info("A1: creando Solicitud");

				RequestProductoDTO requestProductoDTO = new RequestProductoDTO();

				requestProductoDTO.setSolicitudPostulacionDTO(solicitudPostulacionDTO);
				requestProductoDTO.getSolicitudPostulacionDTO().setProgramaPostulacionUniversidad(obtenerProgramaPostulacionUniversidad(solicitudPostulacionDTO.getIdProgramaUniversidadPostulacion()));

				if(solicitudPostulacionDTO.getIdRegionDomicilio()>0){
					requestProductoDTO.getSolicitudPostulacionDTO().setNombreRegion(obtenerRegion(solicitudPostulacionDTO.getIdRegionDomicilio()));
				}

				if(solicitudPostulacionDTO.getIdComunaDomicilio()>0){
					requestProductoDTO.getSolicitudPostulacionDTO().setNombreComuna(obtenerComuna(solicitudPostulacionDTO.getIdComunaDomicilio()));
				}

				requestProductoDTO.getSolicitudPostulacionDTO().setSfechaSolicitud(AppDate.obtenerFechaEnFormato(solicitudPostulacionDTO.getFechaSolicitudPostulacion(), TipoFormatoFecha.DD_MM_YYYY));

				clienteRest.post(requestProductoDTO, uchileProperties.getLocalCrearSolicitudPostulacion());
				//##################################################
//				String ipServer = UchileProperties.getVijnanaServidor();
//				//String ipServer = "localhost:8080";
//				ClienteWsRestUtilidades clienteWsRestUtilidades = new ClienteWsRestUtilidades();
//
//				clienteWsRestUtilidades.crearSolicitudPostulacion(requestProductoDTO, ipServer);
				//##################################################
				String key = ClienteRestUtilidades.generacionSolicitudPostulacionSHA(requestProductoDTO);

				if(flujoEnviarCorreo==true && aplicacionEnviarCorreo==true ){
					//					clienteRest.postEmail(requestProductoDTO, "1", "1", key, uchileProperties.getLocalEnviarCorreoSolicitud());
					clienteRest.postEmail(requestProductoDTO, uchileProperties.getServerIdSolicitudPostulacionAplicacion(), uchileProperties.getServerIdSolicitudPostulacionEmailWebmail(), key, uchileProperties.getLocalEnviarCorreoSolicitud());
					objLog.info("A2: Envio Email");
				}else{
					objLog.info("A2: Envio Email false");
					objLog.info("flujoEnviarCorreo:"+flujoEnviarCorreo +" - aplicacionEnviarCorreo:"+aplicacionEnviarCorreo);
				}

				if(flujoPagoOnline == true && aplicacionPagoOnline==true && online == true){
					String valorNegocioSolicitud= ClienteRestUtilidades.obtenerContenidoRequestByMail(requestProductoDTO, uchileProperties.getServerIdSolicitudPostulacionAplicacion(), uchileProperties.getServerIdSolicitudPostulacionEmailWebmail());

					NegocioSolicitudDTO negocioSolicitudDTO = new NegocioSolicitudDTO();

					negocioSolicitudDTO.setValorNegocioSolicitud(valorNegocioSolicitud);
					negocioSolicitudDTO.setKeyNegocioSolicitud(key);
					negocioSolicitudDTO.setFechaInicialNegocioSolicitud(new Date());
					negocioSolicitudDTO.setFechaVencimientoNegocioSolicitud(new Date());

					requestProductoDTO.setNegocioSolicitudDTO(negocioSolicitudDTO);

					clienteRest.post(requestProductoDTO, uchileProperties.getLocalCrearNegocioSolicitud());
					//##################################################
//					UchileArte uchileArte = clienteWsRestUtilidades.crearNegocioSolicitud(requestProductoDTO, ipServer);
					//##################################################
					objLog.info("A3: Creando Negocio Solicitud");
				}else{
					objLog.info("A3: Creando Negocio Solicitud false");
					objLog.info("flujoPagoOnline:"+flujoPagoOnline +" - aplicacionPagoOnline:"+aplicacionPagoOnline);
				}




				context.addMessage(null, new FacesMessage("Aviso", "Creando Solicitud de Postulacion"));

			}
			catch(Exception e){
				objLog.info("ERROR - almacenarSolicitudAcademica: "+solicitudPostulacionDTO.getRutPersonaSolicitudPostulacion()+" - "+e.getMessage());
			}
			iniciliazarFormulario();

			objLog.info("A4: Redireccion a "+paginaRedireccion);

			if(flujoPagoOnline == true && aplicacionPagoOnline==true && online == true){
				Navigation.redirectExterno(paginaRedireccion);
			}else{
				Navigation.redirectInterno(paginaRedireccion);
			}
		}
		
		if(validar==false){
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERROR", "No se ha realizado Solicitud");
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}
		
		objLog.info("A5: Fin almacenarSolicitudPostulacion");

	}



	/** @Do limpia e inicializa el formulario mediante el boton limpiar
	 * @param no param
	 * @return void.
	 * no lanza Excepciones.
	 */
	public String limpiarFormularioSolicitudPostulacion(){

		iniciliazarFormulario();

		return null;
	}

	public static String redirectInterno(String paginaRedireccion) {
		//Formato de linkInterno "/exito.xhtml"
		FacesContext ctx = FacesContext.getCurrentInstance();
		ExternalContext extContext = ctx.getExternalContext();
		//se le agrega el encodeActionUrl
		//String url = extContext.encodeActionURL(ctx.getApplication().getViewHandler().getActionURL(ctx, "/exito.xhtml"));
		String url = extContext.encodeActionURL(ctx.getApplication().getViewHandler().getActionURL(ctx, paginaRedireccion));

		try {
			extContext.redirect(url);
		} catch (IOException ioe) {
			throw new FacesException(ioe);

		}
		return null;

	}

	public String obtenerProgramaPostulacionUniversidad(int idProgramaPostulacionUniversidad) {
		for(ProgramaUniversidadPostulacionDTO ppuDTO: listaProgramaUniversidadPostulacionDTO){
			if(ppuDTO.getIdProgramaUniversidadPostulacion()==idProgramaPostulacionUniversidad){
				return ppuDTO.getNombreProgramaUniversidadPostulacion(); 
			}
		}
		return "";
	}

	public String obtenerRegion(int idRegion) {
		for(RegionDTO regDTO: listaRegionesDTO){
			if(regDTO.getIdRegion()==idRegion){
				return regDTO.getNombreRegion(); 
			}
		}
		return "";
	}

	public String obtenerComuna(int idComuna) {
		for(ComunaDTO comDTO: listaComunasDTO){
			if(comDTO.getIdComuna()==idComuna){
				return comDTO.getNombreComuna(); 
			}
		}
		return "";
	}

	/********************* METODOS DE FUNCIONAMIENTO ******************************/
	/******************GETTER y SETTER********************************************/
	public String getMensajeDialog() {
		return mensajeDialog;
	}

	public SolicitudPostulacionDTO getSolicitudPostulacionDTO() {
		return solicitudPostulacionDTO;
	}

	public ProgramaUniversidadDTO getProgramaUniversidadDTO() {
		return programaUniversidadDTO;
	}

	public List<ProgramaUniversidadPostulacionDTO> getListaProgramaUniversidadPostulacionDTO() {
		return listaProgramaUniversidadPostulacionDTO;
	}

	public UploadedFile getFile() {
		return file;
	}

	public ArchivoSolicitudDTO getArchivoSolicitudPostulacionDTO() {
		return archivoSolicitudPostulacionDTO;
	}

	public void setMensajeDialog(String mensajeDialog) {
		this.mensajeDialog = mensajeDialog;
	}

	public void setSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO) {
		this.solicitudPostulacionDTO = solicitudPostulacionDTO;
	}

	public void setProgramaUniversidadDTO(ProgramaUniversidadDTO programaUniversidadDTO) {
		this.programaUniversidadDTO = programaUniversidadDTO;
	}

	public void setListaProgramaUniversidadPostulacionDTO(List<ProgramaUniversidadPostulacionDTO> listaProgramaUniversidadPostulacionDTO) {
		this.listaProgramaUniversidadPostulacionDTO = listaProgramaUniversidadPostulacionDTO;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public void setArchivoSolicitudPostulacionDTO(ArchivoSolicitudDTO archivoSolicitudPostulacionDTO) {
		this.archivoSolicitudPostulacionDTO = archivoSolicitudPostulacionDTO;
	}

	public boolean isSkip() {
		return skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public List<RegionDTO> getListaRegionesDTO() {
		return listaRegionesDTO;
	}

	public List<ComunaDTO> getListaComunasDTO() {
		return listaComunasDTO;
	}

	public void setListaRegionesDTO(List<RegionDTO> listaRegionesDTO) {
		this.listaRegionesDTO = listaRegionesDTO;
	}

	public void setListaComunasDTO(List<ComunaDTO> listaComunasDTO) {
		this.listaComunasDTO = listaComunasDTO;
	}

	public boolean isDisabledRegion() {
		return disabledRegion;
	}

	public boolean isDisabledComuna() {
		return disabledComuna;
	}

	public void setDisabledRegion(boolean disabledRegion) {
		this.disabledRegion = disabledRegion;
	}

	public void setDisabledComuna(boolean disabledComuna) {
		this.disabledComuna = disabledComuna;
	}

	public String getTextoCostoProgramaUniversidad() {
		return textoCostoProgramaUniversidad;
	}

	public void setTextoCostoProgramaUniversidad(String textoCostoProgramaUniversidad) {
		this.textoCostoProgramaUniversidad = textoCostoProgramaUniversidad;
	}

	public boolean isMostrarCondicionesPago() {
		return mostrarCondicionesPago;
	}

	public void setMostrarCondicionesPago(boolean mostrarCondicionesPago) {
		this.mostrarCondicionesPago = mostrarCondicionesPago;
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


	public boolean isMostrarBotonPagoOnline() {
		return mostrarBotonPagoOnline;
	}


	public void setMostrarBotonPagoOnline(boolean mostrarBotonPagoOnline) {
		this.mostrarBotonPagoOnline = mostrarBotonPagoOnline;
	}

	public int getSelecPrograma() {
		return selecPrograma;
	}

	public void setSelecPrograma(int selecPrograma) {
		this.selecPrograma = selecPrograma;
	}

	public UchileProperties getUchileProperties() {
		return uchileProperties;
	}

	public void setUchileProperties(UchileProperties uchileProperties) {
		this.uchileProperties = uchileProperties;
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

	public boolean isEnviarCorreo() {
		return enviarCorreo;
	}

	public void setEnviarCorreo(boolean enviarCorreo) {
		this.enviarCorreo = enviarCorreo;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}



}
