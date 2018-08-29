//package com.manashiki.uchilearte.solicitud.web.commons;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//
//import com.fwk.util.AppProperties;
//import com.fwk.util.enums.TipoAplicacion;
//import com.parametro.client.ParametroClient;
//import com.parametro.dto.ParametroDto;
//
//public class Parametros implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	private static final Logger logger = Logger.getLogger(Parametros.class);
//	private transient List<ParametroDto> parametroDtos = new ArrayList<ParametroDto>();
//	
//	/***
//	 * Retorna todos los parametros asociados al país del portal
//	 * @param CL, AR, CO o PE
//	 * @throws IOException 
//	 * @throws FileNotFoundException 
//	 */
//	private void getParametros(String strCountryCode) throws Exception{
//		try{
//			AppProperties appProperties = new AppProperties(TipoAplicacion.WS);
//			ParametroClient parametroClient = new ParametroClient(appProperties.getProperty("parametro.connection.url"));
//			parametroDtos = parametroClient.ListarParamsPorId(Integer.parseInt(appProperties.getProperty("id.app.portal." + strCountryCode.toLowerCase())));
//		}catch(Exception e){
//			logger.error("Excepcion al buscar parametros: "+e.getMessage());
//			throw e;
//		}
//	}
//	
//	private String getValor(String strLlave){
//		if(!this.parametroDtos.isEmpty()) {
//			for(ParametroDto p : this.parametroDtos) {
//				if(strLlave.equals(p.getDescripcion()))
//					return p.getValorPar();
//			}
//		}
//		return null;
//	}
//	
//	public Parametros(String strCountryCode) throws Exception {
//		getParametros(strCountryCode);
//	}
//	
//	public String getUrlListadoHoteles() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.LISTADO");
//	}
//	
//	public String getUrlObtenerHotelesDisponibles() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.REST.DISPONIBILIDAD");
//	}
//	
//	public String getUrlObtenerParametrosBusqueda() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.REST.BUSQUEDA");
//	}
//	
//	public String getUrlObtenerZonasAutoComplete() {
//		return this.getValor("FLUJO.HOTELES.AUTOCOMPLETE.API");
//	}
//	
//	public String getUrlObtenerDataComparador() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.REST.COMPARADOR");
//	}
//	
//	public String getUrlFicha() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.FICHA");
//	}
//
//	public String getUrlRedireccionFicha() {
//		return this.getValor("FLUJO.HOTELES.URL.REDIRECCION.FICHA");
//	}
//	
//	public String getUrlRedireccionNuevaFicha() {
//		return this.getValor("FLUJO.HOTELES.URL.REDIRECCION.NUEVA.FICHA");
//	}
//	
//	public String getUrlObtenerIdProductoFicha() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.REST.FICHA");
//	}
//	
//	public String getUrlObtenerPoliticasCancelacion() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.REST.POLITICAS");
//	}
//	
//	public String getUrlInicializaPago() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.PAGO");
//	}
//	
//	public String getUrlObtieneIdNegocioPago() {
//		return this.getValor("FLUJO.HOTELES.URL.PARCIAL.REST.PAGO");
//	}
//	
//	public String getUrlHeader() {
//		return this.getValor("FLUJO.HOTELES.URL.HEADER");
//	}
//	
//	public String getUrlFooter() {
//		return this.getValor("FLUJO.HOTELES.URL.FOOTER");
//	}
//	
//	public String getTagManagerId() {
//		return this.getValor("FLUJO.GOOGLE.TAG.MANAGER.ID");
//	}
//
//	public String getTextoFinanciacion() {
//		
//		return this.getValor("FLUJO.HOTELES.TEXTO.FINANCIACION");
//	}
//	
//	public String getBookingHabilitado() {
//		return this.getValor("BOOKING.HABILITADO");
//	}
//
//	public String getTextoAgotado() {
//		return this.getValor("FLUJO.HOTELES.TEXTO.AGOTADO");
//	}
//	
//	public String getUrlFinanciacion() {
//		return this.getValor("FLUJO.HOTELES.URL.FINANCIACION");
//	}
//
//	public String getUrlWebCallback() {
//		
//		return this.getValor("FLUJO.HOTELES.URL.WEBCALLBACK");
//	}
//	
//	public Boolean getDisponibilidadPHP(){
//		return Boolean.parseBoolean(this.getValor("FLUJO.HOTELES.DISPONIBILIDAD.PHP"));
//	}
//	
//	public Boolean getDescuentoListado(){
//		return Boolean.parseBoolean(this.getValor("FLUJO.HOTELES.DESCUENTO.LISTADO"));
//	}
//
//	public Boolean getBannerCyber(){
//		return Boolean.parseBoolean(this.getValor("FLUJO.HOTELES.BANNER.CYBER"));
//	}
//	
//	public Boolean getUrlCambioFicha(){
//		return Boolean.parseBoolean(this.getValor("FLUJO.HOTELES.URL.CAMBIO.FICHA"));
//	}
//	
//	
//}