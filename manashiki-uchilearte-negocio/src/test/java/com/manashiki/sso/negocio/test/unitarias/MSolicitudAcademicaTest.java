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
//import com.manashiki.sso.negocio.model.SolicitudAcademicaModel;
//
//	@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration(locations="classpath:negocio-context.xml")
//	public class MSolicitudAcademicaTest {
//		
//		@Autowired
//		FactoryNegocioDAO factoryNegocioDAO;
//		
//		private static final Log objLog = LogFactory.getLog(BRegionNegocioTest.class);
//	
//	/**Pruebas Unitaria hacia SolicitudAcademicaNegocioDAO
//	 * @testMethod
//	 * SolicitudAcademicaNegocioDAOImpl.crearSolicitudAcademicaModel(SolicitudAcademicaModel objSolicitudAcademicaModel);
// 	 * SolicitudAcademicaNegocioDAOImpl.actualizarSolicitudAcademicaModel(SolicitudAcademicaModel objSolicitudAcademicaModel);
//	 * SolicitudAcademicaNegocioDAOImpl.buscarSolicitudAcademicaxIdModel(SolicitudAcademicaModel objSolicitudAcademicaModel);
//	 * SolicitudAcademicaNegocioDAOImpl.buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaModel(SolicitudAcademicaModel objSolicitudAcademicaModel);
//	 * SolicitudAcademicaNegocioDAOImpl.buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaModel(SolicitudAcademicaModel objSolicitudAcademicaModel);
//	 * SolicitudAcademicaNegocioDAOImpl.listarSolicitudAcademicasModel();
//	 * SolicitudAcademicaNegocioDAOImpl.listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaModel(SolicitudAcademicaModel objSolicitudAcademicaModel);
//	 * SolicitudAcademicaNegocioDAOImpl.listarSolicitudAcademicaxEstadoModel(SolicitudAcademicaModel objSolicitudAcademicaModel);
//	 */
//	
//		@Test
//		public void testMetodosSolicitudAcademicaNegocioTest(){
//			crearSolicitudAcademicaNegocioTest();
//			actualizarSolicitudAcademicaNegocioTest();
//			buscarSolicitudAcademicaxIdNegocioTest();
//			buscarSolicitudAcademicaxRutNegocioTest();
//			buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaNegocioTest();
//			listaSolicitudAcademicasNegocioTest();
//			listarSolicitudAcademicaxEstadoNegocioTest();
//		}
//		
//	public void crearSolicitudAcademicaNegocioTest(){
//		objLog.info("crearSolicitudAcademicaNegocioTest");
//		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
//		
//		solicitudAcademicaModel.setNombrePersonaSolicitudAcademica("aaa");
//		solicitudAcademicaModel.setApellidoPaternoPersonaSolicitudAcademica("aaa");
//		solicitudAcademicaModel.setApellidoMaternoPersonaSolicitudAcademica("aaa");
//		solicitudAcademicaModel.setRutPersonaSolicitudAcademica("1-9");
//		solicitudAcademicaModel.setIdProgramaUniversidad(1);
//		solicitudAcademicaModel.setMailMember("aaa@a.cl"); //mail usuario
//		solicitudAcademicaModel.setAnhoIngreso("aaa"); 
//		solicitudAcademicaModel.setIdTipoSolicitud(1);
//		solicitudAcademicaModel.setFundamentacionSolicitud("aaaaaa"); //mail usuario
//		solicitudAcademicaModel.setFechaSolicitud(new Date()); //momento que que ejecutada la solicitud
//		solicitudAcademicaModel.setEstadoSolicitud(1);
//		
//		factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().crearSolicitudAcademicaModel(solicitudAcademicaModel);
//	}
//	
//	public void actualizarSolicitudAcademicaNegocioTest(){
//		objLog.info("actualizarSolicitudAcademicaNegocioTest");
//		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
//		
//		solicitudAcademicaModel.setIdSolicitudAcademica(1);
//		solicitudAcademicaModel.setNombrePersonaSolicitudAcademica("bbb");
//		solicitudAcademicaModel.setApellidoPaternoPersonaSolicitudAcademica("bbb");
//		solicitudAcademicaModel.setApellidoMaternoPersonaSolicitudAcademica("bbb");
//		solicitudAcademicaModel.setRutPersonaSolicitudAcademica("2-7");
//		solicitudAcademicaModel.setIdProgramaUniversidad(2);
//		solicitudAcademicaModel.setMailMember("bbb@bbb.cl"); //mail usuario
//		solicitudAcademicaModel.setAnhoIngreso("bbb"); 
//		solicitudAcademicaModel.setIdTipoSolicitud(2);
//		solicitudAcademicaModel.setFundamentacionSolicitud("bbb"); //mail usuario
//		solicitudAcademicaModel.setFechaSolicitud(new Date()); //momento que que ejecutada la solicitud
//		solicitudAcademicaModel.setEstadoSolicitud(1);
//		
//		
//		factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().actualizarSolicitudAcademicaModel(solicitudAcademicaModel);
//	}
//	
//	public void buscarSolicitudAcademicaxIdNegocioTest(){
//		objLog.info("buscarSolicitudAcademicaxIdNegocioTest");
//		
//		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
//		solicitudAcademicaModel.setIdSolicitudAcademica(1);
//		
//		try {
//			solicitudAcademicaModel=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().buscarSolicitudAcademicaxIdModel(solicitudAcademicaModel);
//		
//		} catch (NegocioImplException e) {
//			e.printStackTrace();
//		}
//		objLog.info(solicitudAcademicaModel.getIdSolicitudAcademica()+" - "+solicitudAcademicaModel.getNombrePersonaSolicitudAcademica());
//	}
//
//	
//	public void buscarSolicitudAcademicaxRutNegocioTest(){
//		objLog.info("buscarSolicitudAcademicaxRutNegocioTest");
//		
//		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
//		solicitudAcademicaModel.setRutPersonaSolicitudAcademica("1-9");
//		
//		try {
//			solicitudAcademicaModel=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaModel(solicitudAcademicaModel);
//		} catch (NegocioImplException e) {
//			solicitudAcademicaModel=null;
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(solicitudAcademicaModel !=null){
//			objLog.info(solicitudAcademicaModel.getIdSolicitudAcademica()+" - "+solicitudAcademicaModel.getRutPersonaSolicitudAcademica());
//		}
//	
//	}
//	
//	public void buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaNegocioTest(){
//		objLog.info("buscarSolicitudAcademicaxRutNegocioTest");
//		
//		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
//		solicitudAcademicaModel.setNombrePersonaSolicitudAcademica("aaa");
//		
//		try {
//			//Pasarlo a Lista
//			solicitudAcademicaModel=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaModel(solicitudAcademicaModel);
//		} catch (NegocioImplException e) {
//			solicitudAcademicaModel=null;
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(solicitudAcademicaModel !=null){
//			objLog.info(solicitudAcademicaModel.getIdSolicitudAcademica()+" - "+solicitudAcademicaModel.getNombrePersonaSolicitudAcademica());
//		}
//	
//	}
//	
//	public void listaSolicitudAcademicasNegocioTest(){
//		objLog.info("listaSolicitudAcademicasNegocioTest");
//		List<SolicitudAcademicaModel> listaSolicitudAcademicasModel=new ArrayList<SolicitudAcademicaModel>();
//		
//		
//		listaSolicitudAcademicasModel=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().listarSolicitudAcademicasModel();
//	
//		for(SolicitudAcademicaModel emprMod:listaSolicitudAcademicasModel){
//			objLog.info(emprMod.getIdSolicitudAcademica()+" - "+emprMod.getNombrePersonaSolicitudAcademica() +" - "+emprMod.getRutPersonaSolicitudAcademica());
//		}
//	}
//	
//	public void listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaNegocioTest(){
//		objLog.info("listarSolicitudAcademicaxEstadoNegocioTest");
//		
//		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
//		List<SolicitudAcademicaModel> listaSolicitudAcademicasModel=new ArrayList<SolicitudAcademicaModel>();
//		solicitudAcademicaModel.setApellidoPaternoPersonaSolicitudAcademica("bbb");;
//		
//		listaSolicitudAcademicasModel=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaModel(solicitudAcademicaModel);
//
//		for(SolicitudAcademicaModel emprMod:listaSolicitudAcademicasModel){
//			objLog.info(emprMod.getIdSolicitudAcademica()+" - "+emprMod.getNombrePersonaSolicitudAcademica() +" - "+emprMod.getEstadoSolicitud());
//		}
//	
//	}
//	
//	public void listarSolicitudAcademicaxEstadoNegocioTest(){
//		objLog.info("listarSolicitudAcademicaxEstadoNegocioTest");
//		
//		SolicitudAcademicaModel solicitudAcademicaModel=new SolicitudAcademicaModel();
//		List<SolicitudAcademicaModel> listaSolicitudAcademicasModel=new ArrayList<SolicitudAcademicaModel>();
//		solicitudAcademicaModel.setEstadoSolicitud(1);
//		
//		listaSolicitudAcademicasModel=factoryNegocioDAO.getSolicitudAcademicaNegocioDAO().listarSolicitudAcademicaxEstadoModel(solicitudAcademicaModel);
//
//		for(SolicitudAcademicaModel emprMod:listaSolicitudAcademicasModel){
//			objLog.info(emprMod.getIdSolicitudAcademica()+" - "+emprMod.getNombrePersonaSolicitudAcademica() +" - "+emprMod.getEstadoSolicitud());
//		}
//	
//	}
//	
//}
