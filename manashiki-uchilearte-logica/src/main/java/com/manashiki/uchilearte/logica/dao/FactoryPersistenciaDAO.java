package com.manashiki.uchilearte.logica.dao;

public interface FactoryPersistenciaDAO {
	
	public ArchivoSolicitudDAO getArchivoSolicitudDAO();
	public ComunaDAO getComunaDAO();

	public LogReservaDAO getLogReservaDAO();
	public NegocioSolicitudDAO getNegocioSolicitudDAO();
	public FinalidadCertificadoDAO getFinalidadCertificadoDAO();
	public ProgramaUniversidadDAO getProgramaUniversidadDAO();
	public ProgramaUniversidadPostulacionDAO getProgramaUniversidadPostulacionDAO();
	public RegionDAO getRegionDAO();
	public SolicitudAcademicaDAO getSolicitudAcademicaDAO();
	public SolicitudPostulacionDAO getSolicitudPostulacionDAO();
	public SolicitudCertificadoDAO getSolicitudCertificadoDAO();
	public TipoCertificadoDAO getTipoCertificadoDAO();
	public TipoSolicitudDAO getTipoSolicitudDAO();
	
	/****Inscripcion Asignaturas***/
	public AlumnoDAO getAlumnoDAO();
	public AlumnoProgramaActivoSemestreDAO getAlumnoProgramaActivoSemestreDAO();
	public ConfirmacionAsignaturaTomadaDAO getConfirmacionAsignaturaTomadaDAO();
	public AsignaturaProgramaActivoSemestreDAO getAsignaturaProgramaActivoSemestreDAO();
	public AsignaturaTomadaProgramaActivoSemestreDAO getAsignaturaTomadaProgramaActivoSemestreDAO();
	public ProgramaActivoSemestreDAO getProgramaActivoSemestreDAO();
	public SemestreTemporadaDAO getSemestreTemporadaDAO();
	
	
	
	
}
