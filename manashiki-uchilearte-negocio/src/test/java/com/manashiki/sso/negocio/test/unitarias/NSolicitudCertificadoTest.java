//package com.manashiki.sso.negocio.test.unitarias;
//import java.util.ArrayList;
//import java.util.Date;
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
//import com.manashiki.sso.negocio.model.SolicitudCertificadoModel;
//
//	@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration(locations="classpath:negocio-context.xml")
//	public class NSolicitudCertificadoTest {
//		
//		@Autowired
//		FactoryNegocioDAO factoryNegocioDAO;
//		
//		private static final Log objLog = LogFactory.getLog(BRegionNegocioTest.class);
//	
//	/**Pruebas Unitaria hacia SolicitudCertificadoNegocioDAO
//	 * @testMethod
//	 * SolicitudCertificadoNegocioDAOImpl.crearSolicitudCertificadoModel(SolicitudCertificadoModel objSolicitudCertificadoModel);
// 	 * SolicitudCertificadoNegocioDAOImpl.actualizarSolicitudCertificadoModel(SolicitudCertificadoModel objSolicitudCertificadoModel);
//	 * SolicitudCertificadoNegocioDAOImpl.buscarSolicitudCertificadoxIdModel(SolicitudCertificadoModel objSolicitudCertificadoModel);
//	 * SolicitudCertificadoNegocioDAOImpl.buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoModel(SolicitudCertificadoModel objSolicitudCertificadoModel);
//	 * SolicitudCertificadoNegocioDAOImpl.buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoModel(SolicitudCertificadoModel objSolicitudCertificadoModel);
//	 * SolicitudCertificadoNegocioDAOImpl.listarSolicitudCertificadosModel();
//	 * SolicitudCertificadoNegocioDAOImpl.listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoModel(SolicitudCertificadoModel objSolicitudCertificadoModel);
//	 * SolicitudCertificadoNegocioDAOImpl.listarSolicitudCertificadoxEstadoModel(SolicitudCertificadoModel objSolicitudCertificadoModel);
//	 */
//	
//		@Test
//		public void testMetodosSolicitudCertificadoNegocioTest(){
//			crearSolicitudCertificadoNegocioTest();
//			actualizarSolicitudCertificadoNegocioTest();
//			buscarSolicitudCertificadoxIdNegocioTest();
//			buscarSolicitudCertificadoxRutNegocioTest();
////			buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoNegocioTest();
//			listaSolicitudCertificadosNegocioTest();
//			listarSolicitudCertificadoxEstadoNegocioTest();
//		}
//		
//	public void crearSolicitudCertificadoNegocioTest(){
//		objLog.info("crearSolicitudCertificadoNegocioTest");
//		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();
//		
//		solicitudCertificadoModel.setNombrePersonaSolicitudCertificado("aaa");
//		solicitudCertificadoModel.setApellidoPaternoPersonaSolicitudCertificado("aaa");
//		solicitudCertificadoModel.setApellidoMaternoPersonaSolicitudCertificado("aaa");
//		solicitudCertificadoModel.setRutPersonaSolicitudCertificado("1-9");
//		solicitudCertificadoModel.setIdProgramaUniversidad(1);
//		solicitudCertificadoModel.setMailMember("aaa@a.cl"); //mail usuario
//		solicitudCertificadoModel.setAnhoIngreso("aaa"); 
//		solicitudCertificadoModel.setIdTipoCertificado(1);
//		solicitudCertificadoModel.setIdFinalidadCertificado(1);
//		solicitudCertificadoModel.setFechaSolicitud(new Date()); //momento que que ejecutada la solicitud
//		solicitudCertificadoModel.setEstadoSolicitud(1);
//		
//		factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().crearSolicitudCertificadoModel(solicitudCertificadoModel);
//	}
//	
//	public void actualizarSolicitudCertificadoNegocioTest(){
//		objLog.info("actualizarSolicitudCertificadoNegocioTest");
//		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();
//		
//		solicitudCertificadoModel.setIdSolicitudCertificado(1);
//		solicitudCertificadoModel.setNombrePersonaSolicitudCertificado("bbb");
//		solicitudCertificadoModel.setApellidoPaternoPersonaSolicitudCertificado("bbb");
//		solicitudCertificadoModel.setApellidoMaternoPersonaSolicitudCertificado("bbb");
//		solicitudCertificadoModel.setRutPersonaSolicitudCertificado("2-7");
//		solicitudCertificadoModel.setIdProgramaUniversidad(1);
//		solicitudCertificadoModel.setMailMember("bbb@bb.cl"); //mail usuario
//		solicitudCertificadoModel.setAnhoIngreso("bbb"); 
//		solicitudCertificadoModel.setIdTipoCertificado(2);
//		solicitudCertificadoModel.setIdFinalidadCertificado(2);
//		solicitudCertificadoModel.setFechaSolicitud(new Date()); //momento que que ejecutada la solicitud
//		solicitudCertificadoModel.setEstadoSolicitud(1);
//		
//		
//		factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().actualizarSolicitudCertificadoModel(solicitudCertificadoModel);
//	}
//	
//	public void buscarSolicitudCertificadoxIdNegocioTest(){
//		objLog.info("buscarSolicitudCertificadoxIdNegocioTest");
//		
//		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();
//		solicitudCertificadoModel.setIdSolicitudCertificado(1);
//		
//		try {
//			solicitudCertificadoModel=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().buscarSolicitudCertificadoxIdModel(solicitudCertificadoModel);
//		
//		} catch (NegocioImplException e) {
//			e.printStackTrace();
//		}
//		objLog.info(solicitudCertificadoModel.getIdSolicitudCertificado()+" - "+solicitudCertificadoModel.getNombrePersonaSolicitudCertificado());
//	}
//
//	
//	public void buscarSolicitudCertificadoxRutNegocioTest(){
//		objLog.info("buscarSolicitudCertificadoxRutNegocioTest");
//		
//		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();
//		solicitudCertificadoModel.setRutPersonaSolicitudCertificado("1-9");
//		
//		try {
//			solicitudCertificadoModel=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoModel(solicitudCertificadoModel);
//		} catch (NegocioImplException e) {
//			solicitudCertificadoModel=null;
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(solicitudCertificadoModel !=null){
//			objLog.info(solicitudCertificadoModel.getIdSolicitudCertificado()+" - "+solicitudCertificadoModel.getRutPersonaSolicitudCertificado());
//		}
//	
//	}
//	
////	public void buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoNegocioTest(){
////		objLog.info("buscarSolicitudCertificadoxRutNegocioTest");
////		
////		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();
////		solicitudCertificadoModel.setNombrePersonaSolicitudCertificado("aaa");
////		
////		try {
////			//Pasarlo a Lista
////			solicitudCertificadoModel=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoModel(solicitudCertificadoModel);
////		} catch (NegocioImplException e) {
////			solicitudCertificadoModel=null;
////			objLog.error("error en implementacion de Negocio:: ");
////		}
////		
////		if(solicitudCertificadoModel !=null){
////			objLog.info(solicitudCertificadoModel.getIdSolicitudCertificado()+" - "+solicitudCertificadoModel.getNombrePersonaSolicitudCertificado());
////		}
////	
////	}
//	
//	public void listaSolicitudCertificadosNegocioTest(){
//		objLog.info("listaSolicitudCertificadosNegocioTest");
//		List<SolicitudCertificadoModel> listaSolicitudCertificadosModel=new ArrayList<SolicitudCertificadoModel>();
//		
//		
//		listaSolicitudCertificadosModel=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().listarSolicitudCertificadosModel();
//	
//		for(SolicitudCertificadoModel emprMod:listaSolicitudCertificadosModel){
//			objLog.info(emprMod.getIdSolicitudCertificado()+" - "+emprMod.getNombrePersonaSolicitudCertificado() +" - "+emprMod.getRutPersonaSolicitudCertificado());
//		}
//	}
//	
//	public void listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoNegocioTest(){
//		objLog.info("listarSolicitudCertificadoxEstadoNegocioTest");
//		
//		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();
//		List<SolicitudCertificadoModel> listaSolicitudCertificadosModel=new ArrayList<SolicitudCertificadoModel>();
//		solicitudCertificadoModel.setApellidoPaternoPersonaSolicitudCertificado("bbb");;
//		
//		listaSolicitudCertificadosModel=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoModel(solicitudCertificadoModel);
//
//		for(SolicitudCertificadoModel emprMod:listaSolicitudCertificadosModel){
//			objLog.info(emprMod.getIdSolicitudCertificado()+" - "+emprMod.getNombrePersonaSolicitudCertificado() +" - "+emprMod.getEstadoSolicitud());
//		}
//	
//	}
//	
//	public void listarSolicitudCertificadoxEstadoNegocioTest(){
//		objLog.info("listarSolicitudCertificadoxEstadoNegocioTest");
//		
//		SolicitudCertificadoModel solicitudCertificadoModel=new SolicitudCertificadoModel();
//		List<SolicitudCertificadoModel> listaSolicitudCertificadosModel=new ArrayList<SolicitudCertificadoModel>();
//		solicitudCertificadoModel.setEstadoSolicitud(1);
//		
//		listaSolicitudCertificadosModel=factoryNegocioDAO.getSolicitudCertificadoNegocioDAO().listarSolicitudCertificadoxEstadoModel(solicitudCertificadoModel);
//
//		for(SolicitudCertificadoModel emprMod:listaSolicitudCertificadosModel){
//			objLog.info(emprMod.getIdSolicitudCertificado()+" - "+emprMod.getNombrePersonaSolicitudCertificado() +" - "+emprMod.getEstadoSolicitud());
//		}
//	
//	}
//	
//}
