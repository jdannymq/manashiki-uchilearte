package com.manashiki.uchilearte.web.utilidades.properties;

import java.io.Serializable;

import vijnana.utilidades.component.apiproperties.AppProperties;
import vijnana.utilidades.component.exception.VijnanaUtilidadesException;
import vijnana.wsrest.client.impl.PropertiesCliente;

public class UchileProperties implements Serializable {
	
	private static final long serialVersionUID = 1L;

//	private static String ambiente = null;
	
	public UchileProperties(){
		super();
	}
	
	public static String getVijnanaServidor(){

		PropertiesCliente propertiesCliente = new PropertiesCliente();

		String servidorProp =  propertiesCliente.getWProduccion(obtenerAmbiente());

		return servidorProp;
	}
	
	public static String obtenerAmbiente(){
//		AppProperties appProperties = new AppProperties();
//		
//		if(ambiente == null){
//			try {
//				ambiente = appProperties.getLineaAppProperties("tomcat.ambiente");
//			} catch (VijnanaUtilidadesException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		return ambiente;
		PropertiesServerAplicacion metProp = new PropertiesServerAplicacion();
		
		String retorno = metProp.obtenerAmbiente();
		
		return retorno;
	}
	
	public String getLocalListarProgramaUniversidad() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarProgramaUniversidad();
		
		return retorno;
	}
	
	public String getLocalListarProgramaUniversidadConPrecio() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarProgramaUniversidadConPrecio();
		
		return retorno;
	}
	
	public String getLocalListarProgramaUniversidadPostulacion() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarProgramaUniversidadPostulacion();
		
		return retorno;
	}
	
	public String getLocalListarProgramaUniversidadPostulacionConPrecio() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarProgramaUniversidadPostulacionConPrecio();
		
		return retorno;
	}
	
	public String getLocalListarTipoCertificados() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarTipoCertificados();
		
		return retorno;
	}
	
	public String getLocalListarFinalidadCertificados() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarFinalidadCertificados();
		
		return retorno;
	}
	
	public String getLocalCrearSolicitudCertificado() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalCrearSolicitudCertificado();
		
		return retorno;
	}
	
	public String getLocalListarSolicitudCertificados() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarSolicitudCertificados();
		
		return retorno;
	}
	
	public String getLocalListarSolicitudCertificadoxEntreFechas() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarSolicitudCertificadoxEntreFechas();
		
		return retorno;
	}
	
	public String getLocalListarTipoSolicitudes() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarTipoSolicitudes();
		
		return retorno;
	}
	
	public String getLocalCrearArchivoSolicitud() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalCrearArchivoSolicitud();
		
		return retorno;
	}
	
	public String getLocalBuscarArchivoSolicitud() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalBuscarArchivoSolicitud();
		
		return retorno;
	}
	
	public String getLocalActualizarArchivoSolicitud() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalActualizarArchivoSolicitud();
		
		return retorno;
	}
	
	public String getLocalCrearSolicitudAcademica() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalCrearSolicitudAcademica();
		
		return retorno;
	}
	
	public String getLocalListarSolicitudAcademicaxEntreFechas() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarSolicitudAcademicaxEntreFechas();
		
		return retorno;
	}
	
	public String getLocalListarRegiones() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarRegiones();
		
		return retorno;
	}
	
	public String getLocalListarComunasxRegion() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarComunasxRegion();
		
		return retorno;
	}
	
	public String getLocalCrearSolicitudPostulacion() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalCrearSolicitudPostulacion();
		
		return retorno;
	}
	
	public String getLocalCrearNegocioSolicitud() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalCrearNegocioSolicitud();
		
		return retorno;
	}
	
	public String getLocalListarSolicitudPostulacion() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalCrearNegocioSolicitud();
		
		return retorno;
	}
	
	public String getLocalListarSolicitudPostulacionxEntreFechas() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalListarSolicitudPostulacionxEntreFechas();
		
		return retorno;
	}
	
	public String getLocalEnviarCorreoSolicitud() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno = metProp.getLocalEnviarCorreoSolicitud();
		
		return retorno;
	}
	
	public String getServerIdSolicitudCertificadoAplicacion() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String idAplicacion = metProp.getLocalIdSolicitudCertificadoAplicacion();
		
		return idAplicacion;
	}
	
	public String getServerIdSolicitudAcademicaAplicacion() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String idAplicacion =metProp.getLocalIdSolicitudAcademicaAplicacion();
		
		return idAplicacion;
	}
	
	public String getServerIdSolicitudPostulacionAplicacion() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String idAplicacion =metProp.getLocalIdSolicitudPostulacionAplicacion();
		
		return idAplicacion;
	}
	
	public String getServerIdSolicitudCertificadoEmailWebmail() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String idEmailWebmail =metProp.getLocalIdSolicitudCertificadoEmailWebmail();
		
		return idEmailWebmail;
	}
	
	public String getServerIdSolicitudAcademicaEmailWebmail() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String idEmailWebmail =metProp.getLocalIdSolicitudAcademicaEmailWebmail();
		
		return idEmailWebmail;
	}
	
	public String getServerIdSolicitudPostulacionEmailWebmail() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String idEmailWebmail =metProp.getLocalIdSolicitudPostulacionEmailWebmail();
		
		return idEmailWebmail;
	}
	
	/***********************************************************************/
	/***********************************************************************/
	/***********************************************************************/
	public String getLocalSolicitudCertificadoCorreoActivo() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalSolicitudCertificadoCorreoActivo();
		
		return retorno;
	}
	
	public String getLocalSolicitudAcademicaCorreoActivo() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalSolicitudAcademicaCorreoActivo();
		
		return retorno;
	}
	
	public String getLocalSolicitudPostulacionCorreoActivo() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalSolicitudPostulacionCorreoActivo();
		
		return retorno;
	}
	
	public String getLocalSolicitudCertificadoPagoOnlineactivo() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalSolicitudCertificadoPagoOnlineactivo();
		
		return retorno;
	}
	
	public String getLocalSolicitudAcademicaPagoOnlineactivo() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalSolicitudAcademicaPagoOnlineactivo();
		
		return retorno;
	}
	
	public String getLocalSolicitudPostulacionPagoOnlineactivo() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalSolicitudPostulacionPagoOnlineactivo();
		
		return retorno;
	}
	
	/***********************************************************************/
	public String getServerFlujoPagoOnlineActivo() {
		PropertiesServerAplicacion metProp = new PropertiesServerAplicacion();
		
		String retorno =metProp.getServerFlujoPagoOnlineActivo();
		
		return retorno;
	}
	
	public String getServerFlujoCorreoActivo() {
		PropertiesServerAplicacion metProp = new PropertiesServerAplicacion();
		
		String retorno =metProp.getServerFlujoCorreoActivo();
		
		return retorno;
	}
	/***********************************************************************/
	
	public String getLocalListarSemestreTemporada() {
		
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalListarSemestreTemporada();
		
		return retorno;
	}
	
	public String getLocalCrearSemestreTemporada() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalCrearSemestreTemporada();
		
		return retorno;
	}
	
	public String getLocalActualizarSemestreTemporada() {
		
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalActualizarSemestreTemporada();
		
		return retorno;

	}
	
	public String getLocalBuscarSemestreTemporada() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalBuscarSemestreTemporada();
		
		return retorno;
		
	}
	
	public String getLocalCrearAlumno() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalCrearAlumno();
		
		return retorno;
	}
	
	public String getLocalActualizarAlumno() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalActualizarAlumno();
		
		return retorno;
	}
	
	public String getLocalObtenerAlumnoxUsuario() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalObtenerAlumnoxUsuario();
		
		return retorno;
		
	}
	
	public String getLocalListarAlumnoNoAsociadoToUsuario() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalListarAlumnoNoAsociadoToUsuario();
		
		return retorno;
	}
	
	public String getLocalListarAlumnoNoAsociadoToSeguridad() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalListarAlumnoNoAsociadoToSeguridad();
		
		return retorno;
	}
	
	public String getLocalCrearProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalCrearProgramaActivoSemestre();
		
		return retorno;
		
	}
	
	public String getLocalActualizarProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalActualizarProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalBuscarProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalBuscarProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalListarProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalListarProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalCrearAlumnoProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalCrearAlumnoProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalActualizarAlumnoProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalActualizarAlumnoProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalBuscarAlumnoProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalBuscarAlumnoProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalListarAlumnoProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalListarAlumnoProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalCrearAsignaturaProgramaActivoSemestre() {
PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalCrearAsignaturaProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalActualizarAsignaturaProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalActualizarAsignaturaProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalBuscarAsignaturaProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalBuscarAsignaturaProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalListarAsignaturaProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalListarAsignaturaProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalCrearAsignaturaTomadaProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalCrearAsignaturaTomadaProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalActualizarAsignaturaTomadaProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalActualizarAsignaturaTomadaProgramaActivoSemestre();
		
		return retorno;
	}
			
	public String getLocalBuscarAsignaturaTomadaProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalBuscarAsignaturaTomadaProgramaActivoSemestre();
		
		return retorno;
	}
	
	public String getLocalListarAsignaturaTomadaProgramaActivoSemestre() {
		PropertiesLocalAplicacion metProp = new PropertiesLocalAplicacion();
		
		String retorno =metProp.getLocalListarAsignaturaTomadaProgramaActivoSemestre();
		
		return retorno;
	}
	
}
