package com.manashiki.uchilearte.wrapper;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonProperty;

import com.manashiki.uchilearte.servdto.wrapper.UchileArte;

import vijnana.respuesta.wrapper.response.Error;
import vijnana.respuesta.wrapper.response.Wrapper;


@XmlRootElement(name="wrapperUchileArte")
public class WrapperUchileArte extends Wrapper implements Serializable{

	private static final long serialVersionUID = 8865841942078096681L;
	
	@JsonProperty("data")
	private UchileArte data;
	
	public WrapperUchileArte(boolean ok, String tiempoRespuesta, int cantidadResultados, String url, Error error,
			String tipoMetodo, UchileArte data) {
		super(ok, tiempoRespuesta, cantidadResultados, url, error, tipoMetodo);
		this.data = data;
	}
	
	public WrapperUchileArte() {
		super();
	}
	
	public UchileArte getData() {
		return data;
	}

	public void setData(UchileArte data) {
		this.data = data;
	}

	
}
