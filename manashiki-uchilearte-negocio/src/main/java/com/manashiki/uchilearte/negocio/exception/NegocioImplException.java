package com.manashiki.uchilearte.negocio.exception;

import java.io.Serializable;

public class NegocioImplException extends Exception implements Serializable{

	private static final long serialVersionUID = 6845419737950513993L;

	public NegocioImplException(){
		super();
	}

	public NegocioImplException(String message){
		super(message);
	}
	
	public NegocioImplException(String message, Throwable cause){
		super(message, cause);
	}
	
	
	public NegocioImplException(Throwable cause){
		super(cause);
	}
}
