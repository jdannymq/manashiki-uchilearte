package com.manashiki.uchilearte.servicio.impl;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.manashiki.uchilearte.servicio.IArchivoSolicitudServicio;
import com.manashiki.uchilearte.servicio.IComunaServicio;
import com.manashiki.uchilearte.servicio.IConfirmacionAsignaturaTomadaServicio;
import com.manashiki.uchilearte.servicio.FactoryServicio;
import com.manashiki.uchilearte.servicio.IAlumnoProgramaActivoSemestreServicio;
import com.manashiki.uchilearte.servicio.IAlumnoServicio;
import com.manashiki.uchilearte.servicio.IFinalidadCertificadoServicio;
import com.manashiki.uchilearte.servicio.ILogReservaServicio;
import com.manashiki.uchilearte.servicio.INegocioSolicitudServicio;
import com.manashiki.uchilearte.servicio.IAsignaturaProgramaActivoSemestreServicio;
import com.manashiki.uchilearte.servicio.IAsignaturaTomadaProgramaActivoSemestreServicio;
import com.manashiki.uchilearte.servicio.IProgramaActivoSemestreServicio;
import com.manashiki.uchilearte.servicio.IProgramaUniversidadPostulacionServicio;
import com.manashiki.uchilearte.servicio.IProgramaUniversidadServicio;
import com.manashiki.uchilearte.servicio.IRegionServicio;
import com.manashiki.uchilearte.servicio.ISemestreTemporadaServicio;
import com.manashiki.uchilearte.servicio.ISolicitudAcademicaServicio;
import com.manashiki.uchilearte.servicio.ISolicitudCertificadoServicio;
import com.manashiki.uchilearte.servicio.ISolicitudPostulacionServicio;
import com.manashiki.uchilearte.servicio.ITipoCertificadoServicio;
import com.manashiki.uchilearte.servicio.ITipoSolicitudServicio;


@Service
public class FactoryServicioImpl implements FactoryServicio {

		
	@Autowired
	private IArchivoSolicitudServicio archivoSolicitudServicio;	
	
	public IArchivoSolicitudServicio getArchivoSolicitudServicio() {
		return archivoSolicitudServicio;
	}
	
	@Autowired
	private IComunaServicio comunaServicio;	
	
	public IComunaServicio getComunaServicio() {
		return comunaServicio;
	}
	
	@Autowired
	private IFinalidadCertificadoServicio finalidadCertificadoServicio;	
	
	public IFinalidadCertificadoServicio getFinalidadCertificadoServicio() {
		return finalidadCertificadoServicio;
	}
	
	@Autowired
	private INegocioSolicitudServicio negocioSolicitudServicio;	
	
	public INegocioSolicitudServicio getNegocioSolicitudServicio() {
		return negocioSolicitudServicio;
	}
	
	@Autowired
	private ILogReservaServicio logReservaServicio;	
	
	public ILogReservaServicio getLogReservaServicio() {
		return logReservaServicio;
	}
	
	
	@Autowired
	private IProgramaUniversidadServicio programaUniversidadServicio;	
	
	public IProgramaUniversidadServicio getProgramaUniversidadServicio() {
		return programaUniversidadServicio;
	}
	
	@Autowired
	private IProgramaUniversidadPostulacionServicio programaUniversidadPostulacionServicio;	
	
	public IProgramaUniversidadPostulacionServicio getProgramaUniversidadPostulacionServicio() {
		return programaUniversidadPostulacionServicio;
	}
	
	@Autowired
	private IRegionServicio regionServicio;	
	
	public IRegionServicio getRegionServicio() {
		return regionServicio;
	}
	
	@Autowired
	private ISolicitudAcademicaServicio solicitudAcademicaServicio;	
	
	public ISolicitudAcademicaServicio getSolicitudAcademicaServicio() {
		return solicitudAcademicaServicio;
	}
	
	@Autowired
	private ISolicitudPostulacionServicio solicitudPostulacionServicio;	
	
	public ISolicitudPostulacionServicio getSolicitudPostulacionServicio() {
		return solicitudPostulacionServicio;
	}
	
	
	@Autowired
	private ISolicitudCertificadoServicio solicitudCertificadoServicio;	
	
	public ISolicitudCertificadoServicio getSolicitudCertificadoServicio() {
		return solicitudCertificadoServicio;
	}
	
	@Autowired
	private ITipoCertificadoServicio tipoCertificadoServicio;	
	
	public ITipoCertificadoServicio getTipoCertificadoServicio() {
		return tipoCertificadoServicio;
	}
	
	
	
	@Autowired
	private ITipoSolicitudServicio tipoSolicitudServicio;	
	
	public ITipoSolicitudServicio getTipoSolicitudServicio() {
		return tipoSolicitudServicio;
	}
	
	@Autowired
	private ISemestreTemporadaServicio semestreTemporadaServicio;	
	
	public ISemestreTemporadaServicio getSemestreTemporadaServicio() {
		return semestreTemporadaServicio;
	}

	@Autowired
	private IAlumnoServicio alumnoServicio;	
	
	public IAlumnoServicio getAlumnoServicio() {
		return alumnoServicio;
	}
	
	@Autowired
	private IProgramaActivoSemestreServicio programaActivoSemestreServicio;	
	
	public IProgramaActivoSemestreServicio getProgramaActivoSemestreServicio() {
		return programaActivoSemestreServicio;
	}
	
	@Autowired
	private IConfirmacionAsignaturaTomadaServicio confirmacionAsignaturaTomadaServicio;	
	
	public IConfirmacionAsignaturaTomadaServicio getConfirmacionAsignaturaTomadaServicio() {
		return confirmacionAsignaturaTomadaServicio;
	}
	
	@Autowired
	private IAsignaturaTomadaProgramaActivoSemestreServicio asignaturaTomadaProgramaActivoSemestreServicio;	
	
	public IAsignaturaTomadaProgramaActivoSemestreServicio getAsignaturaTomadaProgramaActivoSemestreServicio() {
		return asignaturaTomadaProgramaActivoSemestreServicio;
	}
	
	@Autowired
	private IAsignaturaProgramaActivoSemestreServicio asignaturaProgramaActivoSemestreServicio;	
	
	public IAsignaturaProgramaActivoSemestreServicio getAsignaturaProgramaActivoSemestreServicio() {
		return asignaturaProgramaActivoSemestreServicio;
	}
	

	


	@Autowired
	private IAlumnoProgramaActivoSemestreServicio alumnoProgramaActivoSemestreServicio;	
	
	public IAlumnoProgramaActivoSemestreServicio getAlumnoProgramaActivoSemestreServicio() {
		// TODO Auto-generated method stub
		return alumnoProgramaActivoSemestreServicio;
	}


}
