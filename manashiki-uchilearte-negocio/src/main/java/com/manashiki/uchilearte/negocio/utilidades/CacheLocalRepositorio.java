package com.manashiki.uchilearte.negocio.utilidades;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.manashiki.uchilearte.logica.entidad.FinalidadCertificadoEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadEntity;
import com.manashiki.uchilearte.logica.entidad.ProgramaUniversidadPostulacionEntity;
import com.manashiki.uchilearte.logica.entidad.RegionEntity;
import com.manashiki.uchilearte.logica.entidad.TipoCertificadoEntity;
import com.manashiki.uchilearte.logica.entidad.TipoSolicitudEntity;
import com.manashiki.uchilearte.negocio.mapper.FinalidadCertificadoModelMapper;
import com.manashiki.uchilearte.negocio.mapper.ProgramaUniversidadModelMapper;
import com.manashiki.uchilearte.negocio.mapper.ProgramaUniversidadPostulacionModelMapper;
import com.manashiki.uchilearte.negocio.mapper.RegionModelMapper;
import com.manashiki.uchilearte.negocio.mapper.TipoCertificadoModelMapper;
import com.manashiki.uchilearte.negocio.mapper.TipoSolicitudModelMapper;
import com.manashiki.uchilearte.negocio.model.FinalidadCertificadoModel;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadModel;
import com.manashiki.uchilearte.negocio.model.ProgramaUniversidadPostulacionModel;
import com.manashiki.uchilearte.negocio.model.RegionModel;
import com.manashiki.uchilearte.negocio.model.TipoCertificadoModel;
import com.manashiki.uchilearte.negocio.model.TipoSolicitudModel;

import vijnana.cache.component.ICacheComponent;
import vijnana.cache.component.factory.impl.CacheLocalFctry;
import vijnana.cache.component.impl.EjecutarImpl;

public class CacheLocalRepositorio {

	private static final Logger objLog = LoggerFactory.getLogger(CacheLocalRepositorio.class);

	static ICacheComponent objCacheLocal=null;

	private static final String objetoCache = "objetoCacheLocal";

	public static ICacheComponent crearRepositorioCacheLocal() throws Exception{
		try{
			if(objCacheLocal==null){
				ICacheComponent objCacheLocal = new EjecutarImpl(new CacheLocalFctry("manashiki_uchilearte_local"));
				setObjCacheLocal(objCacheLocal);
			}
			return objCacheLocal;
		}
		catch(Exception ne){
			throw new Exception(ne);
		}
	}

	public static List<ProgramaUniversidadModel> generarCacheListaProgramaUniversidad(ICacheComponent objCacheLocal, List<ProgramaUniversidadEntity> listaProgramaUniversidadEntity) {
		objLog.info("INI - generarCacheListaProgramaUniversidad");
		CacheLocalUchileArte cacheLocalUchileArteModel = null;
		ProgramaUniversidadModel programaUniversidadModel = new ProgramaUniversidadModel();
		List<ProgramaUniversidadModel> listaProgramaUniversidadModel = null;
		try{
			try{
				if(objCacheLocal==null){
					objCacheLocal = crearRepositorioCacheLocal();
				}
			}
			catch(Exception e){
				listaProgramaUniversidadModel=null; //No existe
			}

			try{
				if(objCacheLocal!=null){
					cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);
					if(cacheLocalUchileArteModel!=null){
						if(cacheLocalUchileArteModel.getListaProgramaUniversidad()!=null){
							listaProgramaUniversidadModel = cacheLocalUchileArteModel.getListaProgramaUniversidad();
						}
					}else{
						cacheLocalUchileArteModel = new CacheLocalUchileArte();
					}
				}
			}catch(Exception e){
				listaProgramaUniversidadModel= null;
			}

			if(listaProgramaUniversidadModel==null || listaProgramaUniversidadModel.size()==0){
				//Lista distinta de Nula, y no existia el Country
				listaProgramaUniversidadModel = new ArrayList<ProgramaUniversidadModel>();
				for(ProgramaUniversidadEntity puEnt:listaProgramaUniversidadEntity){
					programaUniversidadModel = new ProgramaUniversidadModel();
					programaUniversidadModel = ProgramaUniversidadModelMapper.ProgramaUniversidadEntityToProgramaUniversidadModel(puEnt);
					listaProgramaUniversidadModel.add(programaUniversidadModel);
				}

				cacheLocalUchileArteModel = new CacheLocalUchileArte(listaProgramaUniversidadModel, cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones(),
						cacheLocalUchileArteModel.getListaTipoCertificado(), cacheLocalUchileArteModel.getListaFinalidadCertificado(),
						cacheLocalUchileArteModel.getListaTipoSolicitud(), cacheLocalUchileArteModel.getListaRegion());
				objCacheLocal.Eliminar(objetoCache);
				objCacheLocal.Enviar(objetoCache, cacheLocalUchileArteModel);


			}
		}
		catch(Exception ne){
			listaProgramaUniversidadModel =null;
		}
		objLog.info("FIN - generarCacheListaProgramaUniversidad");
		return listaProgramaUniversidadModel;
	}

	public static List<ProgramaUniversidadModel> obtenerCacheListaProgramaUniversidad(ICacheComponent objCacheLocal) {
		objLog.info("INI - obtenerCacheListaProgramaUniversidad");

		CacheLocalUchileArte cacheLocalUchileArteModel = new CacheLocalUchileArte();

		List<ProgramaUniversidadModel> listaProgramaUniversidadModel = new ArrayList<ProgramaUniversidadModel>();

		try{
			try{
				cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);

			}catch(Exception ne){
				cacheLocalUchileArteModel = null; 
			}

			if(cacheLocalUchileArteModel!=null){
				if(cacheLocalUchileArteModel.getListaProgramaUniversidad()!=null && cacheLocalUchileArteModel.getListaProgramaUniversidad().size()>0){
					listaProgramaUniversidadModel = cacheLocalUchileArteModel.getListaProgramaUniversidad();
				}
			}
		}catch(Exception ne){
			listaProgramaUniversidadModel = null;
		}

		objLog.info("FIN - obtenerCacheListaProgramaUniversidad");

		return listaProgramaUniversidadModel;

	}

	// ProgramaUniversidadPostulacion - ProgramaUniversidadPostulacion - ProgramaUniversidadPostulacion
	public static List<ProgramaUniversidadPostulacionModel> generarCacheListaProgramaUniversidadPostulaciones(ICacheComponent objCacheLocal, List<ProgramaUniversidadPostulacionEntity> listaProgramaUniversidadPostulacionEntity) {
		objLog.info("INI - generarCacheListaProgramaUniversidadPostulaciones");
		CacheLocalUchileArte cacheLocalUchileArteModel = null;
		ProgramaUniversidadPostulacionModel programaUniversidadPostulacionModel = new ProgramaUniversidadPostulacionModel();
		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel = null;
		try{
			try{
				if(objCacheLocal==null){
					objCacheLocal = crearRepositorioCacheLocal();
				}
			}
			catch(Exception e){
				listaProgramaUniversidadPostulacionModel=null; //No existe
			}

			try{
				if(objCacheLocal!=null){
					cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);
					if(cacheLocalUchileArteModel!=null){
						if(cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones()!=null){
							listaProgramaUniversidadPostulacionModel = cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones();
						}
					}else{
						cacheLocalUchileArteModel = new CacheLocalUchileArte();
					}
				}
			}catch(Exception e){
				listaProgramaUniversidadPostulacionModel= null;
			}


			if(listaProgramaUniversidadPostulacionModel==null || listaProgramaUniversidadPostulacionModel.size()==0){
				//Lista distinta de Nula, y no existia el Country
				listaProgramaUniversidadPostulacionModel = new ArrayList<ProgramaUniversidadPostulacionModel>();
				for(ProgramaUniversidadPostulacionEntity puEnt:listaProgramaUniversidadPostulacionEntity){
					programaUniversidadPostulacionModel = new ProgramaUniversidadPostulacionModel();
					programaUniversidadPostulacionModel = ProgramaUniversidadPostulacionModelMapper.ProgramaUniversidadPostulacionEntityToProgramaUniversidadPostulacionModel(puEnt);
					listaProgramaUniversidadPostulacionModel.add(programaUniversidadPostulacionModel);
				}

				cacheLocalUchileArteModel = new CacheLocalUchileArte(cacheLocalUchileArteModel.getListaProgramaUniversidad(), listaProgramaUniversidadPostulacionModel,
						cacheLocalUchileArteModel.getListaTipoCertificado(), cacheLocalUchileArteModel.getListaFinalidadCertificado(),
						cacheLocalUchileArteModel.getListaTipoSolicitud(), cacheLocalUchileArteModel.getListaRegion());
				objCacheLocal.Eliminar(objetoCache);
				objCacheLocal.Enviar(objetoCache, cacheLocalUchileArteModel);

			}
		}
		catch(Exception ne){
			listaProgramaUniversidadPostulacionModel = null;
		}
		objLog.info("FIN - generarCacheListaProgramaUniversidadPostulaciones");
		return listaProgramaUniversidadPostulacionModel;
	}

	public static List<ProgramaUniversidadPostulacionModel> obtenerCacheListaProgramaUniversidadPostulaciones(ICacheComponent objCacheLocal) {
		objLog.info("INI - obtenerCacheListaProgramaUniversidadPostulaciones");
		CacheLocalUchileArte cacheLocalUchileArteModel = new CacheLocalUchileArte();
		List<ProgramaUniversidadPostulacionModel> listaProgramaUniversidadPostulacionModel = new ArrayList<ProgramaUniversidadPostulacionModel>();
		try{
			try{
				cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);

			}catch(Exception ne){
				cacheLocalUchileArteModel = null; 
			}

			if(cacheLocalUchileArteModel!=null){
				if(cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones()!=null && cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones().size()>0){
					listaProgramaUniversidadPostulacionModel = cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones();
				}
			}
		}catch(Exception ne){
			listaProgramaUniversidadPostulacionModel = null; 
		}

		objLog.info("FIN - obtenerCacheListaProgramaUniversidadPostulaciones");
		return listaProgramaUniversidadPostulacionModel;

	}
	// ProgramaUniversidadPostulacion - ProgramaUniversidadPostulacion - ProgramaUniversidadPostulacion

	public static List<TipoCertificadoModel> generarCacheListaTipoCertificado(ICacheComponent objCacheLocal, List<TipoCertificadoEntity> listaTipoCertificadoEntity) {
		objLog.info("INI - generarCacheListaTipoCertificado");
		CacheLocalUchileArte cacheLocalUchileArteModel = null;
		TipoCertificadoModel tipoCertificadoModel = new TipoCertificadoModel();
		List<TipoCertificadoModel> listaTipoCertificadoModel = null;
		try{
			try{
				if(objCacheLocal==null){
					objCacheLocal = crearRepositorioCacheLocal();
				}
			}
			catch(Exception e){
				listaTipoCertificadoModel=null; //No existe
			}

			try{
				if(objCacheLocal!=null){
					cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);
					if(cacheLocalUchileArteModel!=null){
						if(cacheLocalUchileArteModel.getListaTipoCertificado()!=null){
							listaTipoCertificadoModel = cacheLocalUchileArteModel.getListaTipoCertificado();
						}
					}else{
						cacheLocalUchileArteModel = new CacheLocalUchileArte();
					}
				}
			}catch(Exception e){
				listaTipoCertificadoModel= null;
			}


			if(listaTipoCertificadoModel==null || listaTipoCertificadoModel.size()==0){
				//Lista distinta de Nula, y no existia el Country
				listaTipoCertificadoModel = new ArrayList<TipoCertificadoModel>();
				for(TipoCertificadoEntity puEnt:listaTipoCertificadoEntity){
					tipoCertificadoModel = new TipoCertificadoModel();
					tipoCertificadoModel = TipoCertificadoModelMapper.TipoCertificadoEntityToTipoCertificadoModel(puEnt);
					listaTipoCertificadoModel.add(tipoCertificadoModel);
				}


				cacheLocalUchileArteModel = new CacheLocalUchileArte(cacheLocalUchileArteModel.getListaProgramaUniversidad(), cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones(),
						listaTipoCertificadoModel, cacheLocalUchileArteModel.getListaFinalidadCertificado(),
						cacheLocalUchileArteModel.getListaTipoSolicitud(), cacheLocalUchileArteModel.getListaRegion());
				objCacheLocal.Eliminar(objetoCache);
				objCacheLocal.Enviar(objetoCache, cacheLocalUchileArteModel);

			}
		}
		catch(Exception ne){
			listaTipoCertificadoModel = null;
		}
		objLog.info("FIN - generarCacheListaTipoCertificado");
		return listaTipoCertificadoModel;
	}

	public static List<TipoCertificadoModel> obtenerCacheListaTipoCertificado(ICacheComponent objCacheLocal) {
		objLog.info("INI - obtenerCacheListaTipoCertificado");
		CacheLocalUchileArte cacheLocalUchileArteModel = new CacheLocalUchileArte();
		List<TipoCertificadoModel> listaTipoCertificadoModel = new ArrayList<TipoCertificadoModel>();
		try{
			try{

				cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);

			}catch(Exception ne){
				cacheLocalUchileArteModel = null; 
			}

			if(cacheLocalUchileArteModel!=null){
				if(cacheLocalUchileArteModel.getListaTipoCertificado()!=null && cacheLocalUchileArteModel.getListaTipoCertificado().size()>0){
					listaTipoCertificadoModel = cacheLocalUchileArteModel.getListaTipoCertificado();
				}
			}
		}catch(Exception ne){
			listaTipoCertificadoModel=null; 
		}

		objLog.info("FIN - obtenerCacheListaTipoCertificado");
		return listaTipoCertificadoModel;

	}

	public static List<FinalidadCertificadoModel> generarCacheListaFinalidadCertificado(ICacheComponent objCacheLocal, List<FinalidadCertificadoEntity> listaFinalidadCertificadoEntity){
		objLog.info("INI - generarCacheListaFinalidadCertificado");
		CacheLocalUchileArte cacheLocalUchileArteModel = null;
		FinalidadCertificadoModel finalidadCertificadoModel = new FinalidadCertificadoModel();
		List<FinalidadCertificadoModel> listaFinalidadCertificadoModel = null;
		try{
			try{
				if(objCacheLocal==null){
					objCacheLocal = crearRepositorioCacheLocal();
				}
			}
			catch(Exception e){
				listaFinalidadCertificadoModel=null; //No existe
			}

			try{
				if(objCacheLocal!=null){
					cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);
					if(cacheLocalUchileArteModel!=null){
						if(cacheLocalUchileArteModel.getListaFinalidadCertificado()!=null){
							listaFinalidadCertificadoModel = cacheLocalUchileArteModel.getListaFinalidadCertificado();
						}
					}else{
						cacheLocalUchileArteModel = new CacheLocalUchileArte();
					}
				}
			}catch(Exception e){
				listaFinalidadCertificadoModel= null;
			}


			if(listaFinalidadCertificadoModel==null || listaFinalidadCertificadoModel.size()==0){
				//Lista distinta de Nula, y no existia el Country
				listaFinalidadCertificadoModel = new ArrayList<FinalidadCertificadoModel>();
				for(FinalidadCertificadoEntity puEnt:listaFinalidadCertificadoEntity){
					finalidadCertificadoModel = new FinalidadCertificadoModel();
					finalidadCertificadoModel = FinalidadCertificadoModelMapper.FinalidadCertificadoEntityToFinalidadCertificadoModel(puEnt);
					listaFinalidadCertificadoModel.add(finalidadCertificadoModel);
				}

				cacheLocalUchileArteModel = new CacheLocalUchileArte(cacheLocalUchileArteModel.getListaProgramaUniversidad(), cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones(),
						cacheLocalUchileArteModel.getListaTipoCertificado(), listaFinalidadCertificadoModel,
						cacheLocalUchileArteModel.getListaTipoSolicitud(), cacheLocalUchileArteModel.getListaRegion());
				objCacheLocal.Eliminar(objetoCache);
				objCacheLocal.Enviar(objetoCache, cacheLocalUchileArteModel);
			}
		}
		catch(Exception e){
			listaFinalidadCertificadoModel=null; //No existe
		}
		objLog.info("FIN - generarCacheListaFinalidadCertificado");
		return listaFinalidadCertificadoModel;
	}

	public static List<FinalidadCertificadoModel> obtenerCacheListaFinalidadCertificado(ICacheComponent objCacheLocal){
		objLog.info("INI - obtenerCacheListaFinalidadCertificado");
		CacheLocalUchileArte cacheLocalUchileArteModel = new CacheLocalUchileArte();
		List<FinalidadCertificadoModel> listaFinalidadCertificadoModel = new ArrayList<FinalidadCertificadoModel>();
		try{
			try{

				cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);

			}catch(Exception ne){
				cacheLocalUchileArteModel = null; 
			}

			if(cacheLocalUchileArteModel!=null){
				if(cacheLocalUchileArteModel.getListaFinalidadCertificado()!=null && cacheLocalUchileArteModel.getListaFinalidadCertificado().size()>0){
					listaFinalidadCertificadoModel = cacheLocalUchileArteModel.getListaFinalidadCertificado();
				}
			}
		}catch(Exception ne){
			listaFinalidadCertificadoModel = null; 
		}

		objLog.info("FIN - obtenerCacheListaFinalidadCertificado");
		return listaFinalidadCertificadoModel;

	}

	public static List<TipoSolicitudModel> generarCacheListaTipoSolicitud(ICacheComponent objCacheLocal, List<TipoSolicitudEntity> listaTipoSolicitudEntity) {
		objLog.info("INI - generarCacheListaTipoSolicitud");
		CacheLocalUchileArte cacheLocalUchileArteModel = null;
		TipoSolicitudModel tipoSolicitudModel = new TipoSolicitudModel();
		List<TipoSolicitudModel> listaTipoSolicitudModel = null;
		try{
			try{
				if(objCacheLocal==null){
					objCacheLocal = crearRepositorioCacheLocal();
				}
			}
			catch(Exception e){
				listaTipoSolicitudModel=null; //No existe
			}

			try{
				if(objCacheLocal!=null){
					cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);
					if(cacheLocalUchileArteModel!=null){
						if(cacheLocalUchileArteModel.getListaTipoSolicitud()!=null){
							listaTipoSolicitudModel = cacheLocalUchileArteModel.getListaTipoSolicitud();
						}
					}else{
						cacheLocalUchileArteModel = new CacheLocalUchileArte();
					}
				}
			}catch(Exception e){
				listaTipoSolicitudModel= null;
			}


			if(listaTipoSolicitudModel==null || listaTipoSolicitudModel.size()==0){
				//Lista distinta de Nula, y no existia el Country
				listaTipoSolicitudModel = new ArrayList<TipoSolicitudModel>();
				for(TipoSolicitudEntity puEnt:listaTipoSolicitudEntity){
					tipoSolicitudModel = new TipoSolicitudModel();
					tipoSolicitudModel = TipoSolicitudModelMapper.TipoSolicitudEntityToTipoSolicitudModel(puEnt);
					listaTipoSolicitudModel.add(tipoSolicitudModel);
				}


				cacheLocalUchileArteModel = new CacheLocalUchileArte(cacheLocalUchileArteModel.getListaProgramaUniversidad(), cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones(),
						cacheLocalUchileArteModel.getListaTipoCertificado(), cacheLocalUchileArteModel.getListaFinalidadCertificado(),
						listaTipoSolicitudModel, cacheLocalUchileArteModel.getListaRegion());
				objCacheLocal.Eliminar(objetoCache);
				objCacheLocal.Enviar(objetoCache, cacheLocalUchileArteModel);

			}
		}
		catch(Exception ne){
			listaTipoSolicitudModel = null;
		}
		objLog.info("FIN - generarCacheListaTipoSolicitud");
		return listaTipoSolicitudModel;
	}

	public static List<TipoSolicitudModel> obtenerCacheListaTipoSolicitud(ICacheComponent objCacheLocal) {
		objLog.info("INI - obtenerCacheListaTipoSolicitud");
		CacheLocalUchileArte cacheLocalUchileArteModel = new CacheLocalUchileArte();
		List<TipoSolicitudModel> listaTipoSolicitudModel = new ArrayList<TipoSolicitudModel>();
		try{
			try{

				cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);

			}catch(Exception ne){
				cacheLocalUchileArteModel = null; 
			}

			if(cacheLocalUchileArteModel!=null){
				if(cacheLocalUchileArteModel.getListaTipoSolicitud()!=null && cacheLocalUchileArteModel.getListaTipoSolicitud().size()>0){
					listaTipoSolicitudModel = cacheLocalUchileArteModel.getListaTipoSolicitud();
				}
			}
		}catch(Exception ne){
			listaTipoSolicitudModel = null; 
		}

		objLog.info("FIN - obtenerCacheListaTipoSolicitud");
		return listaTipoSolicitudModel;

	}


	public static List<RegionModel> generarCacheListaRegion(ICacheComponent objCacheLocal, List<RegionEntity> listaRegionEntity) {
		objLog.info("INI - generarCacheListaRegion");
		CacheLocalUchileArte cacheLocalUchileArteModel = null;
		RegionModel regionModel = new RegionModel();
		List<RegionModel> listaRegionModel = null;
		try{
			try{
				if(objCacheLocal==null){
					objCacheLocal = crearRepositorioCacheLocal();
				}
			}
			catch(Exception e){
				listaRegionModel=null; //No existe
			}

			try{
				if(objCacheLocal!=null){
					cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);
					if(cacheLocalUchileArteModel!=null){
						if(cacheLocalUchileArteModel.getListaRegion()!=null){
							listaRegionModel = cacheLocalUchileArteModel.getListaRegion();
						}
					}else{
						cacheLocalUchileArteModel = new CacheLocalUchileArte();
					}
				}
			}catch(Exception e){
				listaRegionModel= null;
			}


			if(listaRegionModel==null || listaRegionModel.size()==0){
				//Lista distinta de Nula, y no existia el Country
				listaRegionModel = new ArrayList<RegionModel>();
				for(RegionEntity regEnt:listaRegionEntity){
					regionModel = new RegionModel();
					regionModel = RegionModelMapper.RegionEntityToRegionModel(regEnt);
					listaRegionModel.add(regionModel);
				}

				cacheLocalUchileArteModel = new CacheLocalUchileArte(cacheLocalUchileArteModel.getListaProgramaUniversidad(), cacheLocalUchileArteModel.getListaProgramaUniversidadPostulaciones(),
						cacheLocalUchileArteModel.getListaTipoCertificado(), cacheLocalUchileArteModel.getListaFinalidadCertificado(),
						cacheLocalUchileArteModel.getListaTipoSolicitud(), listaRegionModel);
				objCacheLocal.Eliminar(objetoCache);
				objCacheLocal.Enviar(objetoCache, cacheLocalUchileArteModel);

			}
		}
		catch(Exception ne){
			listaRegionModel = null;
		}
		objLog.info("FIN - generarCacheListaRegion");
		return listaRegionModel;
	}

	public static List<RegionModel> obtenerCacheListaRegion(ICacheComponent objCacheLocal) {
		objLog.info("INI - obtenerCacheListaRegion");
		CacheLocalUchileArte cacheLocalUchileArteModel = new CacheLocalUchileArte();
		List<RegionModel> listaRegionModel = new ArrayList<RegionModel>();

		try{
			try{
				cacheLocalUchileArteModel = (CacheLocalUchileArte) objCacheLocal.Buscar(objetoCache);

			}catch(Exception ne){
				cacheLocalUchileArteModel=null; 
			}

			if(cacheLocalUchileArteModel!=null){
				if(cacheLocalUchileArteModel.getListaRegion()!=null && cacheLocalUchileArteModel.getListaRegion().size()>0){
					listaRegionModel = cacheLocalUchileArteModel.getListaRegion();
				}
			}
		}catch(Exception ne){
			listaRegionModel = null; 
		}

		objLog.info("FIN - obtenerCacheListaRegion");
		return listaRegionModel;

	}

	public static ICacheComponent getObjCacheLocal() {
		return objCacheLocal;
	}

	public static void setObjCacheLocal(ICacheComponent objCacheLocal) {
		CacheLocalRepositorio.objCacheLocal = objCacheLocal;
	}



}

