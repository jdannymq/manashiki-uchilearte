package com.manashiki.uchilearte.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.exception.NegocioImplException;
import com.manashiki.uchilearte.negocio.model.NegocioSolicitudModel;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;
import com.manashiki.uchilearte.servicio.INegocioSolicitudServicio;
import com.manashiki.uchilearte.servicio.exception.ServicioImplException;
import com.manashiki.uchilearte.servicio.impl.utilidades.UchileArteServicioUtilidades;
import com.manashiki.uchilearte.servicio.mapper.NegocioSolicitudDTOMapper;

import vijnana.utilidades.component.utilidades.AppDate;


@Service
public class NegocioSolicitudServicio implements INegocioSolicitudServicio{

	private static final Logger objLog = LoggerFactory.getLogger(NegocioSolicitudServicio.class);
	
	
	@Autowired
	FactoryNegocioDAO factoryNegocioDAO;
	
	/**
	 * Crea una Entidad NegocioSolicitud en la base de datos
	 * @param  negocioSolicitudModel NegocioSolicitud
	 * @return void
	 * @throws no lanza excepciones
	 */
	public NegocioSolicitudDTO crearNegocioSolicitudDTO(NegocioSolicitudDTO objNegocioSolicitudDTO){
		objLog.info("INI - crearNegocioSolicitudDTO");
		
		NegocioSolicitudModel negocioSolicitudModel = new NegocioSolicitudModel();
		
		objNegocioSolicitudDTO.setFechaVencimientoNegocioSolicitud(AppDate.agregarMinutos(objNegocioSolicitudDTO.getFechaInicialNegocioSolicitud(),15));
		
		UchileArteServicioUtilidades uchileArteServicioUtilidades = new UchileArteServicioUtilidades();

		negocioSolicitudModel = NegocioSolicitudDTOMapper.NegocioSolicitudDTOToNegocioSolicitudModel(objNegocioSolicitudDTO);

		negocioSolicitudModel.setTipoNegocioSolicitud(uchileArteServicioUtilidades.retonarSolicitudDTO(objNegocioSolicitudDTO.getValorNegocioSolicitud()));
		
		negocioSolicitudModel = factoryNegocioDAO.getNegocioSolicitudNegocioDAO().crearNegocioSolicitudModel(negocioSolicitudModel);
		
		objNegocioSolicitudDTO = NegocioSolicitudDTOMapper.NegocioSolicitudModelToNegocioSolicitudDTO(negocioSolicitudModel);
		
		objLog.info("FIN - crearNegocioSolicitudDTO "+objNegocioSolicitudDTO.getIdNegocioSolicitudDTO());
		
		return objNegocioSolicitudDTO;
	}

	public NegocioSolicitudDTO actualizarNegocioSolicitudDTO(NegocioSolicitudDTO objNegocioSolicitudDTO) {
		objLog.info("INI - actualizarNegocioSolicitudDTO "+objNegocioSolicitudDTO.getIdNegocioSolicitudDTO());
		NegocioSolicitudModel negocioSolicitudModel= new NegocioSolicitudModel();
		
		objNegocioSolicitudDTO.setFechaVencimientoNegocioSolicitud(AppDate.agregarMinutos(objNegocioSolicitudDTO.getFechaInicialNegocioSolicitud(),15));
		
		negocioSolicitudModel = NegocioSolicitudDTOMapper.NegocioSolicitudDTOToNegocioSolicitudModel(objNegocioSolicitudDTO);

		negocioSolicitudModel = factoryNegocioDAO.getNegocioSolicitudNegocioDAO().actualizarNegocioSolicitudModel(negocioSolicitudModel);
		
		objNegocioSolicitudDTO = NegocioSolicitudDTOMapper.NegocioSolicitudModelToNegocioSolicitudDTO(negocioSolicitudModel);
		if(objNegocioSolicitudDTO!=null){
			objLog.info("FIN - actualizarNegocioSolicitudDTO "+objNegocioSolicitudDTO.getIdNegocioSolicitudDTO());
		}
		return objNegocioSolicitudDTO;
		
	}

	public NegocioSolicitudDTO buscarNegocioSolicitudxIdDTO(NegocioSolicitudDTO objNegocioSolicitudDTO) throws ServicioImplException{
		objLog.info("INI - buscarNegocioSolicitudxIdDTO "+objNegocioSolicitudDTO.getIdNegocioSolicitudDTO());
		NegocioSolicitudModel negocioSolicitudModel = new NegocioSolicitudModel();
		negocioSolicitudModel = NegocioSolicitudDTOMapper.NegocioSolicitudDTOToNegocioSolicitudModel(objNegocioSolicitudDTO);

		try {
			negocioSolicitudModel=factoryNegocioDAO.getNegocioSolicitudNegocioDAO().buscarNegocioSolicitudxIdModel(negocioSolicitudModel);
		} catch (NegocioImplException e) {
			objLog.error("error en implementacion de Negocio:: ");
			throw new ServicioImplException(e);
		}
		objNegocioSolicitudDTO = NegocioSolicitudDTOMapper.NegocioSolicitudModelToNegocioSolicitudDTO(negocioSolicitudModel);
		
		if(objNegocioSolicitudDTO!=null){
			objLog.info("FIN - buscarNegocioSolicitudxIdDTO "+objNegocioSolicitudDTO.getIdNegocioSolicitudDTO());
		}
		return objNegocioSolicitudDTO;
	}

	public List<NegocioSolicitudDTO> listarNegocioSolicitudDTO() {
		objLog.info("INI - listarNegocioSolicitudDTO");
		List<NegocioSolicitudDTO> listaNegocioSolicitudDTO=new ArrayList<NegocioSolicitudDTO>();
		List<NegocioSolicitudModel> listaNegocioSolicitudes = new ArrayList<NegocioSolicitudModel>();
		
		listaNegocioSolicitudes=factoryNegocioDAO.getNegocioSolicitudNegocioDAO().listarNegocioSolicitudModel();;
		
		listaNegocioSolicitudDTO = NegocioSolicitudDTOMapper.ListNegocioSolicitudModelToListNegocioSolicitudDTO(listaNegocioSolicitudes);
		
		if(listaNegocioSolicitudDTO!=null){
			objLog.info("FIN - listarNegocioSolicitudDTO tam:"+listaNegocioSolicitudDTO.size());
		}
		return listaNegocioSolicitudDTO;
	}
	
	
	
}
