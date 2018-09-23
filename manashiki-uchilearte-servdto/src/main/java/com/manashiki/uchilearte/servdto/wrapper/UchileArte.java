package com.manashiki.uchilearte.servdto.wrapper;

import java.io.Serializable;
import java.util.ArrayList;
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
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SemestreTemporadaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudAcademicaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.SolicitudPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servdto.transaccion.LogReservaDTO;
import com.manashiki.uchilearte.servdto.transaccion.NegocioSolicitudDTO;

@XmlRootElement(name="uchileArte")
public class UchileArte implements Serializable{

	private static final long serialVersionUID = -3438798842564788485L;
	
	//
	private ArchivoSolicitudDTO archivoAcademicaDTO= new ArchivoSolicitudDTO();
	private ComunaDTO comunaDTO= new ComunaDTO();
	private FinalidadCertificadoDTO finalidadCertificadoDTO= new FinalidadCertificadoDTO();
	private PostulacionAcademicaDTO postulacionAcademicaDTO= new PostulacionAcademicaDTO();
	private ProgramaUniversidadDTO programaUniversidadDTO= new ProgramaUniversidadDTO();
	private ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTO= new ProgramaUniversidadPostulacionDTO();
	private RegionDTO regionDTO= new RegionDTO();
	private SolicitudAcademicaDTO solicitudAcademicaDTO= new SolicitudAcademicaDTO();
	private SolicitudCertificadoDTO solicitudCertificadoDTO= new SolicitudCertificadoDTO();
	private SolicitudPostulacionDTO solicitudPostulacionDTO= new SolicitudPostulacionDTO();
	private TipoCertificadoDTO tipoCertificadoDTO= new TipoCertificadoDTO();
	private TipoSolicitudDTO tipoSolicitudDTO= new TipoSolicitudDTO();
	private NegocioSolicitudDTO negocioSolicitudDTO= new NegocioSolicitudDTO();
	private LogReservaDTO logReservaDTO= new LogReservaDTO();
	private AlumnoDTO alumnoDTO= new AlumnoDTO();
	private ProgramaActivoSemestreDTO programaActivoSemestreDTO = new ProgramaActivoSemestreDTO();
	private AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO;
	private AsignaturaProgramaActivoSemestreDTO asignaturaProgramaActivoSemestreDTO;
	private AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO;
	private SemestreTemporadaDTO semestreTemporadaDTO;
	
	private List<ArchivoSolicitudDTO> listaArchivoAcademicaDTO= new ArrayList<ArchivoSolicitudDTO>();
	private List<ComunaDTO> listaComunaDTO= new ArrayList<ComunaDTO>();
	private List<FinalidadCertificadoDTO> listaFinalidadCertificadoDTO= new ArrayList<FinalidadCertificadoDTO>();
	private List<PostulacionAcademicaDTO> listaPostulacionAcademicaDTO= new ArrayList<PostulacionAcademicaDTO>();
	private List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO= new ArrayList<ProgramaUniversidadDTO>();
	private List<ProgramaUniversidadPostulacionDTO> listaProgramaUniversidadPostulacionDTO= new ArrayList<ProgramaUniversidadPostulacionDTO>();
	private List<RegionDTO> listaRegionDTO= new ArrayList<RegionDTO>();
	private List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO= new ArrayList<SolicitudAcademicaDTO>();
	private List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO= new ArrayList<SolicitudCertificadoDTO>();
	private List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO= new ArrayList<SolicitudPostulacionDTO>();
	private List<TipoCertificadoDTO> listaTipoCertificadoDTO= new ArrayList<TipoCertificadoDTO>();
	private List<TipoSolicitudDTO> listaTipoSolicitudDTO= new ArrayList<TipoSolicitudDTO>();
	private List<NegocioSolicitudDTO> listaNegocioSolicitudDTO = new ArrayList<NegocioSolicitudDTO>();
	private List<LogReservaDTO> listaLogReservaDTO = new ArrayList<LogReservaDTO>();
	
	private List<AlumnoDTO> listaAlumnoDTO;
	private List<ProgramaActivoSemestreDTO> listaProgramaActivoSemestreDTO; 
	private List<AlumnoProgramaActivoSemestreDTO> listaAlumnoProgramaActivoSemestreDTO;
	private List<AsignaturaProgramaActivoSemestreDTO> listaAsignaturaProgramaActivoSemestreDTO;
	private List<AsignaturaTomadaProgramaActivoSemestreDTO> listaAsignaturaTomadaProgramaActivoSemestreDTO;
	private List<SemestreTemporadaDTO> listaSemestreTemporadaDTO;

	public UchileArte() {
		super();
	}

	public ArchivoSolicitudDTO getArchivoAcademicaDTO() {
		return archivoAcademicaDTO;
	}

	public void setArchivoAcademicaDTO(ArchivoSolicitudDTO archivoAcademicaDTO) {
		this.archivoAcademicaDTO = archivoAcademicaDTO;
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

	public ProgramaUniversidadPostulacionDTO getProgramaUniversidadPostulacionDTO() {
		return programaUniversidadPostulacionDTO;
	}

	public void setProgramaUniversidadPostulacionDTO(ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTO) {
		this.programaUniversidadPostulacionDTO = programaUniversidadPostulacionDTO;
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

	public SolicitudCertificadoDTO getSolicitudCertificadoDTO() {
		return solicitudCertificadoDTO;
	}

	public void setSolicitudCertificadoDTO(SolicitudCertificadoDTO solicitudCertificadoDTO) {
		this.solicitudCertificadoDTO = solicitudCertificadoDTO;
	}

	public SolicitudPostulacionDTO getSolicitudPostulacionDTO() {
		return solicitudPostulacionDTO;
	}

	public void setSolicitudPostulacionDTO(SolicitudPostulacionDTO solicitudPostulacionDTO) {
		this.solicitudPostulacionDTO = solicitudPostulacionDTO;
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

	public List<ArchivoSolicitudDTO> getListaArchivoAcademicaDTO() {
		return listaArchivoAcademicaDTO;
	}

	public void setListaArchivoAcademicaDTO(List<ArchivoSolicitudDTO> listaArchivoAcademicaDTO) {
		this.listaArchivoAcademicaDTO = listaArchivoAcademicaDTO;
	}

	public List<ComunaDTO> getListaComunaDTO() {
		return listaComunaDTO;
	}

	public void setListaComunaDTO(List<ComunaDTO> listaComunaDTO) {
		this.listaComunaDTO = listaComunaDTO;
	}

	public List<FinalidadCertificadoDTO> getListaFinalidadCertificadoDTO() {
		return listaFinalidadCertificadoDTO;
	}

	public void setListaFinalidadCertificadoDTO(List<FinalidadCertificadoDTO> listaFinalidadCertificadoDTO) {
		this.listaFinalidadCertificadoDTO = listaFinalidadCertificadoDTO;
	}

	public List<PostulacionAcademicaDTO> getListaPostulacionAcademicaDTO() {
		return listaPostulacionAcademicaDTO;
	}

	public void setListaPostulacionAcademicaDTO(List<PostulacionAcademicaDTO> listaPostulacionAcademicaDTO) {
		this.listaPostulacionAcademicaDTO = listaPostulacionAcademicaDTO;
	}

	public List<ProgramaUniversidadDTO> getListaProgramaUniversidadDTO() {
		return listaProgramaUniversidadDTO;
	}

	public void setListaProgramaUniversidadDTO(List<ProgramaUniversidadDTO> listaProgramaUniversidadDTO) {
		this.listaProgramaUniversidadDTO = listaProgramaUniversidadDTO;
	}

	public List<ProgramaUniversidadPostulacionDTO> getListaProgramaUniversidadPostulacionDTO() {
		return listaProgramaUniversidadPostulacionDTO;
	}

	public void setListaProgramaUniversidadPostulacionDTO(
			List<ProgramaUniversidadPostulacionDTO> listaProgramaUniversidadPostulacionDTO) {
		this.listaProgramaUniversidadPostulacionDTO = listaProgramaUniversidadPostulacionDTO;
	}

	public List<RegionDTO> getListaRegionDTO() {
		return listaRegionDTO;
	}

	public void setListaRegionDTO(List<RegionDTO> listaRegionDTO) {
		this.listaRegionDTO = listaRegionDTO;
	}

	public List<SolicitudAcademicaDTO> getListaSolicitudAcademicaDTO() {
		return listaSolicitudAcademicaDTO;
	}

	public void setListaSolicitudAcademicaDTO(List<SolicitudAcademicaDTO> listaSolicitudAcademicaDTO) {
		this.listaSolicitudAcademicaDTO = listaSolicitudAcademicaDTO;
	}

	public List<SolicitudCertificadoDTO> getListaSolicitudCertificadoDTO() {
		return listaSolicitudCertificadoDTO;
	}

	public void setListaSolicitudCertificadoDTO(List<SolicitudCertificadoDTO> listaSolicitudCertificadoDTO) {
		this.listaSolicitudCertificadoDTO = listaSolicitudCertificadoDTO;
	}

	public List<SolicitudPostulacionDTO> getListaSolicitudPostulacionDTO() {
		return listaSolicitudPostulacionDTO;
	}

	public void setListaSolicitudPostulacionDTO(List<SolicitudPostulacionDTO> listaSolicitudPostulacionDTO) {
		this.listaSolicitudPostulacionDTO = listaSolicitudPostulacionDTO;
	}

	public List<TipoCertificadoDTO> getListaTipoCertificadoDTO() {
		return listaTipoCertificadoDTO;
	}

	public void setListaTipoCertificadoDTO(List<TipoCertificadoDTO> listaTipoCertificadoDTO) {
		this.listaTipoCertificadoDTO = listaTipoCertificadoDTO;
	}

	public List<TipoSolicitudDTO> getListaTipoSolicitudDTO() {
		return listaTipoSolicitudDTO;
	}

	public void setListaTipoSolicitudDTO(List<TipoSolicitudDTO> listaTipoSolicitudDTO) {
		this.listaTipoSolicitudDTO = listaTipoSolicitudDTO;
	}

	public List<NegocioSolicitudDTO> getListaNegocioSolicitudDTO() {
		return listaNegocioSolicitudDTO;
	}

	public void setListaNegocioSolicitudDTO(List<NegocioSolicitudDTO> listaNegocioSolicitudDTO) {
		this.listaNegocioSolicitudDTO = listaNegocioSolicitudDTO;
	}

	public List<LogReservaDTO> getListaLogReservaDTO() {
		return listaLogReservaDTO;
	}

	public void setListaLogReservaDTO(List<LogReservaDTO> listaLogReservaDTO) {
		this.listaLogReservaDTO = listaLogReservaDTO;
	}

	public List<AlumnoDTO> getListaAlumnoDTO() {
		return listaAlumnoDTO;
	}

	public void setListaAlumnoDTO(List<AlumnoDTO> listaAlumnoDTO) {
		this.listaAlumnoDTO = listaAlumnoDTO;
	}

	public ProgramaActivoSemestreDTO getProgramaActivoSemestreDTO() {
		return programaActivoSemestreDTO;
	}

	public void setProgramaActivoSemestreDTO(ProgramaActivoSemestreDTO programaActivoSemestreDTO) {
		this.programaActivoSemestreDTO = programaActivoSemestreDTO;
	}

	public List<ProgramaActivoSemestreDTO> getListaProgramaActivoSemestreDTO() {
		return listaProgramaActivoSemestreDTO;
	}

	public void setListaProgramaActivoSemestreDTO(List<ProgramaActivoSemestreDTO> listaProgramaActivoSemestreDTO) {
		this.listaProgramaActivoSemestreDTO = listaProgramaActivoSemestreDTO;
	}

	public AlumnoProgramaActivoSemestreDTO getAlumnoProgramaActivoSemestreDTO() {
		return alumnoProgramaActivoSemestreDTO;
	}

	public void setAlumnoProgramaActivoSemestreDTO(AlumnoProgramaActivoSemestreDTO alumnoProgramaActivoSemestreDTO) {
		this.alumnoProgramaActivoSemestreDTO = alumnoProgramaActivoSemestreDTO;
	}

	public List<AlumnoProgramaActivoSemestreDTO> getListaAlumnoProgramaActivoSemestreDTO() {
		return listaAlumnoProgramaActivoSemestreDTO;
	}

	public void setListaAlumnoProgramaActivoSemestreDTO(
			List<AlumnoProgramaActivoSemestreDTO> listaAlumnoProgramaActivoSemestreDTO) {
		this.listaAlumnoProgramaActivoSemestreDTO = listaAlumnoProgramaActivoSemestreDTO;
	}

	public AsignaturaProgramaActivoSemestreDTO getAsignaturaProgramaActivoSemestreDTO() {
		return asignaturaProgramaActivoSemestreDTO;
	}

	public void setAsignaturaProgramaActivoSemestreDTO(
			AsignaturaProgramaActivoSemestreDTO asignaturaProgramaActivoSemestreDTO) {
		this.asignaturaProgramaActivoSemestreDTO = asignaturaProgramaActivoSemestreDTO;
	}

	public List<AsignaturaProgramaActivoSemestreDTO> getListaAsignaturaProgramaActivoSemestreDTO() {
		return listaAsignaturaProgramaActivoSemestreDTO;
	}

	public void setListaAsignaturaProgramaActivoSemestreDTO(
			List<AsignaturaProgramaActivoSemestreDTO> listaAsignaturaProgramaActivoSemestreDTO) {
		this.listaAsignaturaProgramaActivoSemestreDTO = listaAsignaturaProgramaActivoSemestreDTO;
	}

	public AsignaturaTomadaProgramaActivoSemestreDTO getAsignaturaTomadaProgramaActivoSemestreDTO() {
		return asignaturaTomadaProgramaActivoSemestreDTO;
	}

	public void setAsignaturaTomadaProgramaActivoSemestreDTO(
			AsignaturaTomadaProgramaActivoSemestreDTO asignaturaTomadaProgramaActivoSemestreDTO) {
		this.asignaturaTomadaProgramaActivoSemestreDTO = asignaturaTomadaProgramaActivoSemestreDTO;
	}

	public List<AsignaturaTomadaProgramaActivoSemestreDTO> getListaAsignaturaTomadaProgramaActivoSemestreDTO() {
		return listaAsignaturaTomadaProgramaActivoSemestreDTO;
	}

	public void setListaAsignaturaTomadaProgramaActivoSemestreDTO(
			List<AsignaturaTomadaProgramaActivoSemestreDTO> listaAsignaturaTomadaProgramaActivoSemestreDTO) {
		this.listaAsignaturaTomadaProgramaActivoSemestreDTO = listaAsignaturaTomadaProgramaActivoSemestreDTO;
	}

	public SemestreTemporadaDTO getSemestreTemporadaDTO() {
		return semestreTemporadaDTO;
	}

	public void setSemestreTemporadaDTO(SemestreTemporadaDTO semestreTemporadaDTO) {
		this.semestreTemporadaDTO = semestreTemporadaDTO;
	}

	public List<SemestreTemporadaDTO> getListaSemestreTemporadaDTO() {
		return listaSemestreTemporadaDTO;
	}

	public void setListaSemestreTemporadaDTO(List<SemestreTemporadaDTO> listaSemestreTemporadaDTO) {
		this.listaSemestreTemporadaDTO = listaSemestreTemporadaDTO;
	}
	
}
