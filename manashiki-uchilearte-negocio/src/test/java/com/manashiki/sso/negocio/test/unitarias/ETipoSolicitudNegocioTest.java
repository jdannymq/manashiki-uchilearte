//package com.manashiki.sso.negocio.test.unitarias;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.manashiki.sso.negocio.dao.FactoryNegocioDAO;
//import com.manashiki.sso.negocio.exception.NegocioImplException;
//import com.manashiki.sso.negocio.model.TipoSolicitudModel;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:negocio-context.xml")
//public class ETipoSolicitudNegocioTest {
//	
//	@Autowired
//	FactoryNegocioDAO factoryNegocioDAO;
//	
//	private static final Log objLog = LogFactory.getLog(ETipoSolicitudNegocioTest.class);
//	/**Pruebas Unitaria hacia TipoSolicitudNegocioDAO
//	 * @testMethod
//	 * TipoSolicitudNegocio.crearTipoSolicitudModel
//	 * TipoSolicitudNegocio.actualizarTipoSolicitudModel
// 	 * TipoSolicitudNegocio.buscarTipoSolicitudxIdModel
// 	 * TipoSolicitudNegocio.listarTipoSolicitudesModel
// 	 * TipoSolicitudNegocio.listarTipoSolicitudxNombreLowerModel
// 	 * TipoSolicitudNegocio.listarTipoSolicitudesxEstadoModel
//	 */
//	
//	@Test
//	public void testMetodosTipoSolicitudNegocioTest(){
//		crearTipoSolicitudNegocioTest();
//		actualizarTipoSolicitudNegocioTest();
//		buscarTipoSolicitudNegocioxIdTest();
//		listaTipoSolicitudesNegocioTest();
//	}
//	
//	public void crearTipoSolicitudNegocioTest(){
//		objLog.info("crearTipoSolicitudNegocioTest");
//		TipoSolicitudModel tipoCertificadoModel=new TipoSolicitudModel();
//		tipoCertificadoModel.setCodigoTipoSolicitud("cod TipoSolicitud Model");
//		tipoCertificadoModel.setNombreTipoSolicitud("TipoSolicitud Model");
//		
//		tipoCertificadoModel = factoryNegocioDAO.getTipoSolicitudNegocioDAO().crearTipoSolicitudModel(tipoCertificadoModel);
//		System.out.println(tipoCertificadoModel.getIdTipoSolicitud()+" "+tipoCertificadoModel.getNombreTipoSolicitud());
//	}
//	
//	public void actualizarTipoSolicitudNegocioTest(){
//		objLog.info("actualizarTipoSolicitudNegocioTest");
//		
//		TipoSolicitudModel tipoCertificadoModel=new TipoSolicitudModel();
//		tipoCertificadoModel.setIdTipoSolicitud(1);
//		tipoCertificadoModel.setCodigoTipoSolicitud("cod TipoSolicitud ACT");
//		tipoCertificadoModel.setNombreTipoSolicitud("TipoSolicitud ACT");
//		
//		tipoCertificadoModel = factoryNegocioDAO.getTipoSolicitudNegocioDAO().actualizarTipoSolicitudModel(tipoCertificadoModel);
//	}
//	
//	public void buscarTipoSolicitudNegocioxIdTest(){
//		objLog.info("buscarTipoSolicitudNegocioxIdTest");
//		
//		TipoSolicitudModel tipoCertificadoModel=new TipoSolicitudModel();
//		tipoCertificadoModel.setIdTipoSolicitud(1);
//		
//		try {
//			tipoCertificadoModel=factoryNegocioDAO.getTipoSolicitudNegocioDAO().buscarTipoSolicitudxIdModel(tipoCertificadoModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(tipoCertificadoModel!=null){
//			objLog.info(tipoCertificadoModel.getIdTipoSolicitud()+" - "+tipoCertificadoModel.getNombreTipoSolicitud());
//		}
//	}
//	
//	public void listaTipoSolicitudesNegocioTest(){
//		objLog.info("listaTipoSolicitudesNegocioTest");
//		List<TipoSolicitudModel> listaTipoSolicitudesModel=new ArrayList<TipoSolicitudModel>();
//		
//		listaTipoSolicitudesModel=factoryNegocioDAO.getTipoSolicitudNegocioDAO().listarTipoSolicitudesModel();
//	
//		for(TipoSolicitudModel apliMod:listaTipoSolicitudesModel){
//			objLog.info(apliMod.getIdTipoSolicitud()+" - "+apliMod.getNombreTipoSolicitud());
//		}
//	}
//	
//
//	
//}
