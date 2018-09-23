package com.manashiki.uchilearte.negocio.dao;



public interface FactoryNegocioDAO {

	public ArchivoSolicitudNegocioDAO getArchivoSolicitudNegocioDAO();
	public ComunaNegocioDAO getComunaNegocioDAO();
	public FinalidadCertificadoNegocioDAO getFinalidadCertificadoNegocioDAO();
	public NegocioSolicitudNegocioDAO getNegocioSolicitudNegocioDAO();
	public LogReservaNegocioDAO getLogReservaNegocioDAO();
	public ProgramaUniversidadNegocioDAO getProgramaUniversidadNegocioDAO();
	public ProgramaUniversidadPostulacionNegocioDAO getProgramaUniversidadPostulacionNegocioDAO();
	public RegionNegocioDAO getRegionNegocioDAO();
	public SolicitudAcademicaNegocioDAO getSolicitudAcademicaNegocioDAO();
	public SolicitudPostulacionNegocioDAO getSolicitudPostulacionNegocioDAO();
	public SolicitudCertificadoNegocioDAO getSolicitudCertificadoNegocioDAO();
	public TipoCertificadoNegocioDAO getTipoCertificadoNegocioDAO();
	public TipoSolicitudNegocioDAO getTipoSolicitudNegocioDAO();
	/****************************************/
	public AlumnoNegocioDAO getAlumnoNegocioDAO();
	public AlumnoProgramaActivoSemestreNegocioDAO getAlumnoProgramaActivoSemestreNegocioDAO();
	public ConfirmacionAsignaturaTomadaNegocioDAO getConfirmacionAsignaturaTomadaNegocioDAO();
	public AsignaturaProgramaActivoSemestreNegocioDAO getAsignaturaProgramaActivoSemestreNegocioDAO();
	public AsignaturaTomadaProgramaActivoSemestreNegocioDAO getAsignaturaTomadaProgramaActivoSemestreNegocioDAO();
	public ProgramaActivoSemestreNegocioDAO getProgramaActivoSemestreNegocioDAO();
	public SemestreTemporadaNegocioDAO getSemestreTemporadaNegocioDAO();
}
