package com.manashiki.uchilearte.solicitud.dto;

import java.io.Serializable;

public class ErrorDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*atributos para google analitys*/
	private String hotelTipoError;
	private String hotelPaginaError;
	
	
	public String getHotelTipoError() {
		return hotelTipoError;
	}
	public void setHotelTipoError(String hotelTipoError) {
		this.hotelTipoError = hotelTipoError;
	}
	public String getHotelPaginaError() {
		return hotelPaginaError;
	}
	public void setHotelPaginaError(String hotelPaginaError) {
		this.hotelPaginaError = hotelPaginaError;
	}
}
