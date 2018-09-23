package com.manashiki.uchilearte.servdto.request;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AlumnoProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ArchivoSolicitudDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AsignaturaProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.AsignaturaTomadaProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.PostulacionAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaActivoSemestreDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SemestreTemporadaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servdto.transaccion.LogReservaDTO;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;

@XmlRootElement(name = "requestUchileArteDTO")
public class RequestUchileArteDTO implements Serializable {

	private static final long serialVersionUID = -2951908142809987695L;
	private ArchivoSolicitudDTO archivoSolicitudDTO;
	private ComunaDTO comunaDTO;
	private FinalidadCertificadoDTO finalidadCertificadoDTO;
	private PostulacionAcademicaDTO postulacionAcademicaDTO;
	private ProgramaUniversidadDTO programaUniversidadDTO;
	private RegionDTO regionDTO;
	private SolicitudAcademicaDTO solicitudAcademicaDTO;
	private List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO;
	private SolicitudCertificadoDTO solicitudCertificadoDTO;
	private List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO;
	private SolicitudPostulacionDTO solicitudPostulacionDTO;
	private List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO;
	private TipoCertificadoDTO tipoCertificadoDTO;
	private TipoSolicitudDTO tipoSolicitudDTO;
	private NegocioSolicitudDTO negocioSolicitudDTO;
	private LogReservaDTO logReservaDTO;
	/************************************/
	private AlumnoDTO alumnoDTO;
	private ProgramaActivoSemestreDTO programaActivoSemestreDTO;
	private AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO;
	private AsignaturaProgramaActivoSemestreDTO asignaturaProgramaActivoSemestreDTO;
	private AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO;
	private SemestreTemporadaDTO semestreTemporadaDTO;
	/************************************/

	public RequestUchileArteDTO() {
		super();
	}
	public ArchivoSolicitudDTO getArchivoSolicitudDTO() {
		return archivoSolicitudDTO;
	}
	public void setArchivoSolicitudDTO(ArchivoSolicitudDTO archivoSolicitudDTO) {
		this.archivoSolicitudDTO = archivoSolicitudDTO;
	}
	public ComunaDTO getComunaDTO() {
		return comunaDTO;
	}
	public void setComunaDTO(ComunaDTO comunaDTO) {
		this.comunaDTO = comunaDTO;
	}
	public FinalidadCertificadoDTO getFinalidadCertificadoDTO() {
		return finalidadCertificadoDTO;
	}
	public void setFinalidadCertificadoDTO(FinalidadCertificadoDTO finalidadCertificadoDTO) {
		this.finalidadCertificadoDTO = finalidadCertificadoDTO;
	}
	public PostulacionAcademicaDTO getPostulacionAcademicaDTO() {
		return postulacionAcademicaDTO;
	}
	public void setPostulacionAcademicaDTO(PostulacionAcademicaDTO postulacionAcademicaDTO) {
		this.postulacionAcademicaDTO = postulacionAcademicaDTO;
	}
	public ProgramaUniversidadDTO getProgramaUniversidadDTO() {
		return programaUniversidadDTO;
	}
	public void setProgramaUniversidadDTO(ProgramaUniversidadDTO programaUniversidadDTO) {
		this.programaUniversidadDTO = programaUniversidadDTO;
	}
	public RegionDTO getRegionDTO() {
		return regionDTO;
	}
	public void setRegionDTO(RegionDTO regionDTO) {
		this.regionDTO = regionDTO;
	}
	public SolicitudAcademicaDTO getSolicitudAcademicaDTO() {
		return solicitudAcademicaDTO;
	}
	public void setSolicitudAcademicaDTO(SolicitudAcademicaDTO solicitudAcademicaDTO) {
		this.solicitudAcademicaDTO = solicitudAcademicaDTO;
	}
	public List<SolicitudAcademicaDTO> getListaSolicitudAcademicaDTO() {
		return listaSolicitudAcademicaDTO;
	}
	public void setListaSolicitudAcademicaDTO(List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO) {
		this.listaSolicitudAcademicaDTO = listaSolicitudAcademicaDTO;
	}
	public SolicitudCertificadoDTO getSolicitudCertificadoDTO() {
		return solicitudCertificadoDTO;
	}
	public void setSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO) {
		this.solicitudCertificadoDTO = solicitudCertificadoDTO;
	}
	public List<SolicitudCertificadoDTO> getListaSolicitudCertificadoDTO() {
		return listaSolicitudCertificadoDTO;
	}
	public void setListaSolicitudCertificadoDTO(List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO) {
		this.listaSolicitudCertificadoDTO = listaSolicitudCertificadoDTO;
	}
	public SolicitudPostulacionDTO getSolicitudPostulacionDTO() {
		return solicitudPostulacionDTO;
	}
	public void setSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO) {
		this.solicitudPostulacionDTO = solicitudPostulacionDTO;
	}
	public List<SolicitudPostulacionDTO> getListaSolicitudPostulacionDTO() {
		return listaSolicitudPostulacionDTO;
	}
	public void setListaSolicitudPostulacionDTO(List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO) {
		this.listaSolicitudPostulacionDTO = listaSolicitudPostulacionDTO;
	}
	public TipoCertificadoDTO getTipoCertificadoDTO() {
		return tipoCertificadoDTO;
	}
	public void setTipoCertificadoDTO(TipoCertificadoDTO tipoCertificadoDTO) {
		this.tipoCertificadoDTO = tipoCertificadoDTO;
	}
	public TipoSolicitudDTO getTipoSolicitudDTO() {
		return tipoSolicitudDTO;
	}
	public void setTipoSolicitudDTO(TipoSolicitudDTO tipoSolicitudDTO) {
		this.tipoSolicitudDTO = tipoSolicitudDTO;
	}
	public NegocioSolicitudDTO getNegocioSolicitudDTO() {
		return negocioSolicitudDTO;
	}
	public void setNegocioSolicitudDTO(NegocioSolicitudDTO negocioSolicitudDTO) {
		this.negocioSolicitudDTO = negocioSolicitudDTO;
	}
	public LogReservaDTO getLogReservaDTO() {
		return logReservaDTO;
	}
	public void setLogReservaDTO(LogReservaDTO logReservaDTO) {
		this.logReservaDTO = logReservaDTO;
	}
	public AlumnoDTO getAlumnoDTO() {
		return alumnoDTO;
	}
	public void setAlumnoDTO(AlumnoDTO alumnoDTO) {
		this.alumnoDTO = alumnoDTO;
	}
	public ProgramaActivoSemestreDTO getProgramaActivoSemestreDTO() {
		return programaActivoSemestreDTO;
	}
	public void setProgramaActivoSemestreDTO(ProgramaActivoSemestreDTO programaActivoSemestreDTO) {
		this.programaActivoSemestreDTO = programaActivoSemestreDTO;
	}
	public AlumnoProgramaActivoSemestreDTO getAlumnoProgramaActivoSemestreDTO() {
		return alumnoProgramaActivoSemestreDTO;
	}
	public void setAlumnoProgramaActivoSemestreDTO(AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO) {
		this.alumnoProgramaActivoSemestreDTO = alumnoProgramaActivoSemestreDTO;
	}
	public AsignaturaProgramaActivoSemestreDTO getAsignaturaProgramaActivoSemestreDTO() {
		return asignaturaProgramaActivoSemestreDTO;
	}
	public void setAsignaturaProgramaActivoSemestreDTO(
			AsignaturaProgramaActivoSemestreDTO asignaturaProgramaActivoSemestreDTO) {
		this.asignaturaProgramaActivoSemestreDTO = asignaturaProgramaActivoSemestreDTO;
	}
	public AsignaturaTomadaProgramaActivoSemestreDTO getAsignaturaTomadaProgramaActivoSemestreDTO() {
		return asignaturaTomadaProgramaActivoSemestreDTO;
	}
	public void setAsignaturaTomadaProgramaActivoSemestreDTO(
			AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO) {
		this.asignaturaTomadaProgramaActivoSemestreDTO = asignaturaTomadaProgramaActivoSemestreDTO;
	}
	public SemestreTemporadaDTO getSemestreTemporadaDTO() {
		return semestreTemporadaDTO;
	}
	public void setSemestreTemporadaDTO(SemestreTemporadaDTO semestreTemporadaDTO) {
		this.semestreTemporadaDTO = semestreTemporadaDTO;
	}
	
}
