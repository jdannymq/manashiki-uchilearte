package com.manashiki.uchilearte.solicitud.exceptions;

public class ServicioException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ServicioException(String message){
		super(message);
	}
	
	public ServicioException(String message, Throwable cause)
    {
        super(message);
        if(cause != null)
        {
            initCause(cause);
        }
    }

}
