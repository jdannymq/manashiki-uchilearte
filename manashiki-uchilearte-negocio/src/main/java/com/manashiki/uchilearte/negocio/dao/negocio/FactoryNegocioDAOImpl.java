package com.manashiki.uchilearte.negocio.dao.negocio;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

import com.manashiki.uchilearte.negocio.dao.AlumnoNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.AlumnoProgramaActivoSemestreNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.ArchivoSolicitudNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.ComunaNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.ConfirmacionAsignaturaTomadaNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.FactoryNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.FinalidadCertificadoNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.LogReservaNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.NegocioSolicitudNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.AsignaturaProgramaActivoSemestreNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.AsignaturaTomadaProgramaActivoSemestreNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.ProgramaActivoSemestreNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.ProgramaUniversidadNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.ProgramaUniversidadPostulacionNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.RegionNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.SemestreTemporadaNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.SolicitudAcademicaNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.SolicitudCertificadoNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.SolicitudPostulacionNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.TipoCertificadoNegocioDAO;
//import com.manashiki.uchilearte.negocio.dao.TipoCompraNegocioDAO;
import com.manashiki.uchilearte.negocio.dao.TipoSolicitudNegocioDAO;
//import com.manashiki.uchilearte.negocio.dao.VersionProgramaUniversidadNegocioDAO;
//import com.manashiki.uchilearte.negocio.dao.VersionSemestralNegocioDAO;

@Component
public class FactoryNegocioDAOImpl implements FactoryNegocioDAO {

	@Autowired
	private ArchivoSolicitudNegocioDAO archivoSolicitudNegocioDAO;	
	
	public ArchivoSolicitudNegocioDAO getArchivoSolicitudNegocioDAO() {
		return archivoSolicitudNegocioDAO;
	}
	
	@Autowired
	private ComunaNegocioDAO comunaNegocioDAO;	
	
	public ComunaNegocioDAO getComunaNegocioDAO() {
		return comunaNegocioDAO;
	}
	
	
	
	@Autowired
	private FinalidadCertificadoNegocioDAO finalidadCertificadoNegocioDAO;	
	
	public FinalidadCertificadoNegocioDAO getFinalidadCertificadoNegocioDAO(){
		return finalidadCertificadoNegocioDAO;
	}
	
	@Autowired
	private LogReservaNegocioDAO logReservaNegocioDAO;	
	
	public LogReservaNegocioDAO getLogReservaNegocioDAO(){
		return logReservaNegocioDAO;
	}
	
	@Autowired
	private NegocioSolicitudNegocioDAO negocioSolicitudNegocioDAO;	
	
	public NegocioSolicitudNegocioDAO getNegocioSolicitudNegocioDAO(){
		return negocioSolicitudNegocioDAO;
	}
	
	@Autowired
	private ProgramaUniversidadNegocioDAO programaUniversidadNegocioDAO;	
	
	public ProgramaUniversidadNegocioDAO getProgramaUniversidadNegocioDAO() {
		return programaUniversidadNegocioDAO;
	}
	
	@Autowired
	private ProgramaUniversidadPostulacionNegocioDAO programaUniversidadPostulacionNegocioDAO;	
	
	public ProgramaUniversidadPostulacionNegocioDAO getProgramaUniversidadPostulacionNegocioDAO() {
		return programaUniversidadPostulacionNegocioDAO;
	}
	
	@Autowired
	private RegionNegocioDAO regionNegocioDAO;	
	
	public RegionNegocioDAO getRegionNegocioDAO() {
		return regionNegocioDAO;
	}
	
	@Autowired
	private SolicitudAcademicaNegocioDAO solicitudAcademicaNegocioDAO;	
	
	public SolicitudAcademicaNegocioDAO getSolicitudAcademicaNegocioDAO() {
		return solicitudAcademicaNegocioDAO;
	}
	
	@Autowired
	private SolicitudPostulacionNegocioDAO solicitudPostulacionNegocioDAO;	
	
	public SolicitudPostulacionNegocioDAO getSolicitudPostulacionNegocioDAO() {
		return solicitudPostulacionNegocioDAO;
	}
	
	@Autowired
	private SolicitudCertificadoNegocioDAO solicitudCertificadoNegocioDAO;	
	
	public SolicitudCertificadoNegocioDAO getSolicitudCertificadoNegocioDAO() {
		return solicitudCertificadoNegocioDAO;
	}
	
//	@Autowired
//	private TipoCompraNegocioDAO tipoCompraNegocioDAO;	
//	
//	public TipoCompraNegocioDAO getTipoCompraNegocioDAO() {
//		return tipoCompraNegocioDAO;
//	}
	
	@Autowired
	private TipoCertificadoNegocioDAO tipoCertificadoNegocioDAO;	
	
	public TipoCertificadoNegocioDAO getTipoCertificadoNegocioDAO() {
		return tipoCertificadoNegocioDAO;
	}
	
	@Autowired
	private TipoSolicitudNegocioDAO tipoSolicitudNegocioDAO;	
	
	public TipoSolicitudNegocioDAO getTipoSolicitudNegocioDAO() {
		return tipoSolicitudNegocioDAO;
	}
	
//	@Autowired
//	private VersionProgramaUniversidadNegocioDAO versionProgramaUniversidadNegocioDAO;	
//	
//	public VersionProgramaUniversidadNegocioDAO getVersionProgramaUniversidadNegocioDAO() {
//		return versionProgramaUniversidadNegocioDAO;
//	}
//	
//	@Autowired
//	private VersionSemestralNegocioDAO versionSemestralNegocioDAO;	
//	
//	public VersionSemestralNegocioDAO getVersionSemestralNegocioDAO() {
//		return versionSemestralNegocioDAO;
//	}
	
	/****************************************/
	@Autowired
	private AlumnoNegocioDAO alumnoNegocioDAO;
	
	public AlumnoNegocioDAO getAlumnoNegocioDAO(){
		return alumnoNegocioDAO;
	}
	
	@Autowired
	private AlumnoProgramaActivoSemestreNegocioDAO alumnoProgramaActivoSemestreNegocioDAO;
	
	public AlumnoProgramaActivoSemestreNegocioDAO getAlumnoProgramaActivoSemestreNegocioDAO(){
		return alumnoProgramaActivoSemestreNegocioDAO;
	}
	
	@Autowired
	private ConfirmacionAsignaturaTomadaNegocioDAO confirmacionAsignaturaTomadaNegocioDAO;
	
	public ConfirmacionAsignaturaTomadaNegocioDAO getConfirmacionAsignaturaTomadaNegocioDAO(){
		return confirmacionAsignaturaTomadaNegocioDAO;
	}
	
	@Autowired
	private AsignaturaProgramaActivoSemestreNegocioDAO asignaturaProgramaActivoSemestreNegocioDAO;
	
	public AsignaturaProgramaActivoSemestreNegocioDAO getAsignaturaProgramaActivoSemestreNegocioDAO(){
		return asignaturaProgramaActivoSemestreNegocioDAO;
	}
	
	@Autowired
	private AsignaturaTomadaProgramaActivoSemestreNegocioDAO asignaturaTomadaProgramaActivoSemestreNegocioDAO;
	
	public AsignaturaTomadaProgramaActivoSemestreNegocioDAO getAsignaturaTomadaProgramaActivoSemestreNegocioDAO(){
		return asignaturaTomadaProgramaActivoSemestreNegocioDAO;
	}
	
	@Autowired
	private ProgramaActivoSemestreNegocioDAO programaActivoSemestreNegocioDAO;
	
	public ProgramaActivoSemestreNegocioDAO getProgramaActivoSemestreNegocioDAO(){
		return programaActivoSemestreNegocioDAO;
	}
	
	@Autowired
	
	private SemestreTemporadaNegocioDAO semestreTemporadaNegocioDAO;
	
	public SemestreTemporadaNegocioDAO getSemestreTemporadaNegocioDAO(){
		return semestreTemporadaNegocioDAO;
	}
	
}
