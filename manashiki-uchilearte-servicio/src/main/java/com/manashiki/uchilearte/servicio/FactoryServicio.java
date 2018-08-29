package com.manashiki.uchilearte.servicio;

public interface FactoryServicio {

	public IArchivoSolicitudServicio getArchivoSolicitudServicio();
	public IComunaServicio getComunaServicio();
	public IFinalidadCertificadoServicio getFinalidadCertificadoServicio();
	public ILogReservaServicio getLogReservaServicio();
	public INegocioSolicitudServicio getNegocioSolicitudServicio();
	public IProgramaUniversidadServicio getProgramaUniversidadServicio();
	public IProgramaUniversidadPostulacionServicio getProgramaUniversidadPostulacionServicio();
	public IRegionServicio getRegionServicio();
	public ISolicitudAcademicaServicio getSolicitudAcademicaServicio();
	public ISolicitudPostulacionServicio getSolicitudPostulacionServicio();
	public ISolicitudCertificadoServicio getSolicitudCertificadoServicio();
	public ITipoCertificadoServicio getTipoCertificadoServicio();
	public ITipoSolicitudServicio getTipoSolicitudServicio();
	
//	<class>com.manashiki.uchilearte.logica.entidad.SemestreTemporadaEntity</class>
//	<class>com.manashiki.uchilearte.logica.entidad.ProgramaActivoSemestreEntity</class>
//	<class>com.manashiki.uchilearte.logica.entidad.AsignaturaProgramaActivoSemestreEntity</class>
//	<class>com.manashiki.uchilearte.logica.entidad.AlumnoEntity</class>
//	<class>com.manashiki.uchilearte.logica.entidad.AlumnoProgramaActivoSemestreEntity</class>
//	<class>com.manashiki.uchilearte.logica.entidad.AsignaturaTomadaProgramaActivoSemestreEntity</class>
//	<class>com.manashiki.uchilearte.logica.entidad.ConfirmacionAsignaturaTomadaEntity</class>
	
	public ISemestreTemporadaServicio getSemestreTemporadaServicio();
	public IProgramaActivoSemestreServicio getProgramaActivoSemestreServicio();
	public IAsignaturaProgramaActivoSemestreServicio getAsignaturaProgramaActivoSemestreServicio();
	public IAlumnoServicio getAlumnoServicio();
	public IAlumnoProgramaActivoSemestreServicio getAlumnoProgramaActivoSemestreServicio();
	public IAsignaturaTomadaProgramaActivoSemestreServicio getAsignaturaTomadaProgramaActivoSemestreServicio();
	public IConfirmacionAsignaturaTomadaServicio getConfirmacionAsignaturaTomadaServicio();

}
