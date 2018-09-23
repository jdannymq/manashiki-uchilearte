package com.manashiki.uchilearte.servicio.exception;

import java.io.Serializable;

public class ServicioImplException extends Exception implements Serializable{

	private static final long serialVersionUID = 6845419737950513993L;

	public ServicioImplException(){
		super();
	}

	public ServicioImplException(String message){
		super(message);
	}
	
	public ServicioImplException(String message, Throwable cause){
		super(message, cause);
	}
	
	
	public ServicioImplException(Throwable cause){
		super(cause);
	}
}
