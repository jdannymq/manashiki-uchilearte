package com.manashiki.uchilearte.logica.dao.impl;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

import com.manashiki.uchilearte.logica.dao.AlumnoDAO;
//import com.manashiki.uchilearte.logica.dao.AplicacionDAO;
//import com.manashiki.uchilearte.logica.dao.AplicacionEmpresaDAO;
//import com.manashiki.uchilearte.logica.dao.EmpresaDAO;
//import com.manashiki.uchilearte.logica.dao.EmpresaUsuarioAplicacionEmpresaDAO;
//import com.manashiki.uchilearte.logica.dao.EmpresaUsuarioDAO;
//import com.manashiki.uchilearte.logica.dao.UsuarioDAO;
import com.manashiki.uchilearte.logica.dao.AlumnoProgramaActivoSemestreDAO;
import com.manashiki.uchilearte.logica.dao.ArchivoSolicitudDAO;
import com.manashiki.uchilearte.logica.dao.ComunaDAO;
import com.manashiki.uchilearte.logica.dao.ConfirmacionAsignaturaTomadaDAO;

import com.manashiki.uchilearte.logica.dao.FactoryPersistenciaDAO;
import com.manashiki.uchilearte.logica.dao.FinalidadCertificadoDAO;
import com.manashiki.uchilearte.logica.dao.LogReservaDAO;
import com.manashiki.uchilearte.logica.dao.NegocioSolicitudDAO;
import com.manashiki.uchilearte.logica.dao.AsignaturaProgramaActivoSemestreDAO;
import com.manashiki.uchilearte.logica.dao.AsignaturaTomadaProgramaActivoSemestreDAO;
import com.manashiki.uchilearte.logica.dao.ProgramaActivoSemestreDAO;
//import com.manashiki.uchilearte.logica.dao.NegocioSolicitudDAO;
import com.manashiki.uchilearte.logica.dao.ProgramaUniversidadDAO;
import com.manashiki.uchilearte.logica.dao.ProgramaUniversidadPostulacionDAO;
import com.manashiki.uchilearte.logica.dao.RegionDAO;
import com.manashiki.uchilearte.logica.dao.SemestreTemporadaDAO;
import com.manashiki.uchilearte.logica.dao.SolicitudAcademicaDAO;
import com.manashiki.uchilearte.logica.dao.SolicitudCertificadoDAO;
import com.manashiki.uchilearte.logica.dao.SolicitudPostulacionDAO;
import com.manashiki.uchilearte.logica.dao.TipoCertificadoDAO;
import com.manashiki.uchilearte.logica.dao.TipoSolicitudDAO;

//import com.manashiki.uchilearte.logica.dao.VersionProgramaUniversidadDAO;
//import com.manashiki.uchilearte.logica.dao.VersionSemestralDAO;

@Repository
public class FactoryPersistenciaDAOImpl implements FactoryPersistenciaDAO {

	@Autowired
	private ArchivoSolicitudDAO archivoSolicitudDAO;	
	
	public ArchivoSolicitudDAO getArchivoSolicitudDAO() {
		return archivoSolicitudDAO;
	}
	
	@Autowired
	private ComunaDAO comunaDAO;	
	
	public ComunaDAO getComunaDAO() {
		return comunaDAO;
	}
	
	@Autowired
	private FinalidadCertificadoDAO finalidadCertificadoDAO;	
	
	public FinalidadCertificadoDAO getFinalidadCertificadoDAO() {
		return finalidadCertificadoDAO;
	}
	
	@Autowired
	private LogReservaDAO logReservaDAO;	
	
	public LogReservaDAO getLogReservaDAO() {
		return logReservaDAO;
	}
	
	@Autowired
	private NegocioSolicitudDAO negocioSolicitudDAO;	
	
	public NegocioSolicitudDAO getNegocioSolicitudDAO() {
		return negocioSolicitudDAO;
	}
	
	@Autowired
	private ProgramaUniversidadDAO programaUniversidadDAO;	
	
	public ProgramaUniversidadDAO getProgramaUniversidadDAO() {
		return programaUniversidadDAO;
	}
	
	@Autowired
	private ProgramaUniversidadPostulacionDAO programaUniversidadPostulacionDAO;	
	
	public ProgramaUniversidadPostulacionDAO getProgramaUniversidadPostulacionDAO() {
		return programaUniversidadPostulacionDAO;
	}
	
	@Autowired
	private RegionDAO regionDAO;	
	
	public RegionDAO getRegionDAO() {
		return regionDAO;
	}
	
	@Autowired
	private SolicitudAcademicaDAO solicitudAcademicaDAO;	
	
	public SolicitudAcademicaDAO getSolicitudAcademicaDAO() {
		return solicitudAcademicaDAO;
	}
	
	
	@Autowired
	private SolicitudPostulacionDAO solicitudPostulacionDAO;	
	
	public SolicitudPostulacionDAO getSolicitudPostulacionDAO() {
		return solicitudPostulacionDAO;
	}

	@Autowired
	private SolicitudCertificadoDAO solicitudCertificadoDAO;	
	
	public SolicitudCertificadoDAO getSolicitudCertificadoDAO() {
		return solicitudCertificadoDAO;
	}
	
	@Autowired
	private TipoCertificadoDAO tipoCertificadoDAO;	
	
	public TipoCertificadoDAO getTipoCertificadoDAO() {
		return tipoCertificadoDAO;
	}
	
	@Autowired
	private TipoSolicitudDAO tipoSolicitudDAO;	
	
	public TipoSolicitudDAO getTipoSolicitudDAO() {
		return tipoSolicitudDAO;
	}
	
	
	@Autowired
	private AlumnoDAO alumnoDAO;	
	public AlumnoDAO getAlumnoDAO(){
		return alumnoDAO;
	}
	
	@Autowired
	private AlumnoProgramaActivoSemestreDAO alumnoProgramaActivoSemestreDAO;	
	
	public AlumnoProgramaActivoSemestreDAO getAlumnoProgramaActivoSemestreDAO(){
		return alumnoProgramaActivoSemestreDAO;
	}
	
	@Autowired
	private ConfirmacionAsignaturaTomadaDAO confirmacionAsignaturaTomadaDAO;	
	public ConfirmacionAsignaturaTomadaDAO getConfirmacionAsignaturaTomadaDAO(){
		return confirmacionAsignaturaTomadaDAO;
	}
	
	@Autowired
	private AsignaturaProgramaActivoSemestreDAO asignaturaProgramaActivoSemestreDAO;	
	public AsignaturaProgramaActivoSemestreDAO getAsignaturaProgramaActivoSemestreDAO(){
		return asignaturaProgramaActivoSemestreDAO;
	}
	
	@Autowired
	private AsignaturaTomadaProgramaActivoSemestreDAO asignaturaTomadaProgramaActivoSemestreDAO;	
	public AsignaturaTomadaProgramaActivoSemestreDAO getAsignaturaTomadaProgramaActivoSemestreDAO(){
		return asignaturaTomadaProgramaActivoSemestreDAO;
	}
	
	@Autowired
	private ProgramaActivoSemestreDAO programaActivoSemestreDAO;	
	public ProgramaActivoSemestreDAO getProgramaActivoSemestreDAO(){
		return programaActivoSemestreDAO;
	}
	
	@Autowired
	private SemestreTemporadaDAO semestreTemporadaDAO;	
	public SemestreTemporadaDAO getSemestreTemporadaDAO(){
		return semestreTemporadaDAO;
	}
	
}
