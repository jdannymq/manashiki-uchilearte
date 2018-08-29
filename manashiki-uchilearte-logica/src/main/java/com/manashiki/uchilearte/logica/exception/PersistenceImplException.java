package com.manashiki.uchilearte.logica.exception;

import java.io.Serializable;

public class PersistenceImplException extends Exception implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7672936385153673862L;

	public PersistenceImplException(){
		super();
	}

	public PersistenceImplException(String message){
		super(message);
	}
	
	public PersistenceImplException(String message, Throwable cause){
		super(message, cause);
	}
	
	
	public PersistenceImplException(Throwable cause){
		super(cause);
	}
}
