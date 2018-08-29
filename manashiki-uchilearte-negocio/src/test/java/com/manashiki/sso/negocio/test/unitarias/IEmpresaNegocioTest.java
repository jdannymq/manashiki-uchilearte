//package com.manashiki.sso.negocio.test.unitarias;
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
//import com.manashiki.sso.negocio.model.EmpresaModel;
//
//	@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration(locations="classpath:negocio-context.xml")
//	public class IEmpresaNegocioTest {
//		
//		@Autowired
//		FactoryNegocioDAO factoryNegocioDAO;
//		
//		private static final Log objLog = LogFactory.getLog(BRegionNegocioTest.class);
//	
//	/**Pruebas Unitaria hacia EmpresaNegocioDAO
//	 * @testMethod
//	 * EmpresaNegocioDAOImpl.crearEmpresaModel(EmpresaModel objEmpresaModel);
//		EmpresaNegocioDAOImpl.actualizarEmpresaModel(EmpresaModel objEmpresaModel);
//		EmpresaNegocioDAOImpl.buscarEmpresaxIdModel(EmpresaModel objEmpresaModel);
//		EmpresaNegocioDAOImpl.buscarEmpresaxRolUnicoEmpresaModel(EmpresaModel objEmpresaModel);
//		EmpresaNegocioDAOImpl.buscarEmpresaxNombreEmpresaLower(EmpresaModel objEmpresaModel);
//		EmpresaNegocioDAOImpl.buscarEmpresaxRazonSocialEmpresaLower(EmpresaModel objEmpresaModel);
//		EmpresaNegocioDAOImpl.listarEmpresasModel();
//		EmpresaNegocioDAOImpl.listarEmpresaxEstadoModel(EmpresaModel objEmpresaModel);
//	 */
//	
//		@Test
//		public void testMetodosEmpresaNegocioTest(){
//			crearEmpresaNegocioTest();
//			actualizarEmpresaNegocioTest();
//			buscarEmpresaxIdNegocioTest();
//			buscarEmpresaxRutNegocioTest();
//			buscarEmpresaxNombreEmpresaNegocioTest();
//			buscarEmpresaxRazonSocialNegocioTest();
//			listaEmpresasNegocioTest();
//			listarEmpresaxEstadoNegocioTest();
//		}
//		
//	public void crearEmpresaNegocioTest(){
//		objLog.info("crearEmpresaNegocioTest");
//		EmpresaModel empresaModel=new EmpresaModel();
//		
//		empresaModel.setRolUnicoIdentificadorEmpresa("EmpresaModel Rol Prueba");
//		empresaModel.setNombreEmpresa("EmpresaModel Nombre Prueba"); //nombre fantasia
//		empresaModel.setNombreEmpresaLower(empresaModel.getNombreEmpresa().toLowerCase());
//		empresaModel.setRazonSocialEmpresa("EmpresaModel RazonSocial Prueba"); //nombre legal empresa
//		empresaModel.setRazonSocialEmpresaLower(empresaModel.getRazonSocialEmpresa().toLowerCase());
//		empresaModel.setGiroEmpresa("EmpresaModel Giro Prueba"); // accion que hace empresa
//		empresaModel.setDireccionOrigen("EmpresaModel Direccion Prueba");  // ubicacion legal empresa
//		empresaModel.setPaisEmpresa("EmpresaModel Pais Prueba");
//		empresaModel.setIdComuna(1);
//		empresaModel.setCiudadOrigen("EmpresaModel Ciudad Prueba");
//		empresaModel.setEstadoEmpresa(1); 
//		
//		
//		factoryNegocioDAO.getEmpresaNegocioDAO().crearEmpresaModel(empresaModel);
//	}
//	
//	public void actualizarEmpresaNegocioTest(){
//		objLog.info("actualizarEmpresaNegocioTest");
//		EmpresaModel empresaModel=new EmpresaModel();
//		
//		empresaModel.setIdEmpresa(1);
//		empresaModel.setRolUnicoIdentificadorEmpresa("Act EmpresaModel Rol Prueba Model");
//		empresaModel.setNombreEmpresa("Act EmpresaModel Nombre Prueba"); //nombre fantasia
//		empresaModel.setNombreEmpresaLower(empresaModel.getNombreEmpresa().toLowerCase());
//		empresaModel.setRazonSocialEmpresa("Act EmpresaModel RazonSocial Prueba"); //nombre legal empresa
//		empresaModel.setRazonSocialEmpresaLower(empresaModel.getRazonSocialEmpresa().toLowerCase());
//		empresaModel.setGiroEmpresa("Act EmpresaModel Giro Prueba"); // accion que hace empresa
//		empresaModel.setDireccionOrigen("Act EmpresaModel Direccion Prueba");  // ubicacion legal empresa
//		empresaModel.setPaisEmpresa("Act EmpresaModel Pais Prueba");
//		empresaModel.setIdComuna(2);
//		empresaModel.setCiudadOrigen("EmpresaModel Ciudad Prueba");
//		empresaModel.setEstadoEmpresa(2);
//		
//		
//		factoryNegocioDAO.getEmpresaNegocioDAO().actualizarEmpresaModel(empresaModel);
//	}
//	
//	public void buscarEmpresaxIdNegocioTest(){
//		objLog.info("buscarEmpresaxIdNegocioTest");
//		
//		EmpresaModel empresaModel=new EmpresaModel();
//		empresaModel.setIdEmpresa(1);
//		
//		
//		
//		try {
//			empresaModel=factoryNegocioDAO.getEmpresaNegocioDAO().buscarEmpresaxIdModel(empresaModel);
//		
//		} catch (NegocioImplException e) {
//			e.printStackTrace();
//		}
//		objLog.info(empresaModel.getIdEmpresa()+" - "+empresaModel.getNombreEmpresa());
//	}
//
//	
//	public void buscarEmpresaxRutNegocioTest(){
//		objLog.info("buscarEmpresaxRutNegocioTest");
//		
//		EmpresaModel empresaModel=new EmpresaModel();
//		empresaModel.setRolUnicoIdentificadorEmpresa("Act EmpresaModel Rol Prueba Model");
//		
//		try {
//			empresaModel=factoryNegocioDAO.getEmpresaNegocioDAO().buscarEmpresaxRolUnicoEmpresaModel(empresaModel);
//		} catch (NegocioImplException e) {
//			empresaModel=null;
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(empresaModel !=null){
//			objLog.info(empresaModel.getIdEmpresa()+" - "+empresaModel.getNombreEmpresa());
//		}
//	
//	}
//	
//	public void buscarEmpresaxNombreEmpresaNegocioTest(){
//		objLog.info("buscarEmpresaxRutNegocioTest");
//		
//		EmpresaModel empresaModel=new EmpresaModel();
//		empresaModel.setNombreEmpresa("Act EmpresaModel Nombre Prueba");
//		empresaModel.setNombreEmpresaLower(empresaModel.getNombreEmpresa().toLowerCase());
//		
//		try {
//			empresaModel=factoryNegocioDAO.getEmpresaNegocioDAO().buscarEmpresaxNombreEmpresaLower(empresaModel);
//		} catch (NegocioImplException e) {
//			empresaModel=null;
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(empresaModel !=null){
//			objLog.info(empresaModel.getIdEmpresa()+" - "+empresaModel.getNombreEmpresa());
//		}
//	
//	}
//	
//	public void buscarEmpresaxRazonSocialNegocioTest(){
//		objLog.info("buscarEmpresaxRutNegocioTest");
//		
//		EmpresaModel empresaModel=new EmpresaModel();
//		empresaModel.setRazonSocialEmpresa("Act EmpresaModel RazonSocial Prueba");
//		empresaModel.setRazonSocialEmpresaLower(empresaModel.getRazonSocialEmpresa().toLowerCase());
//		
//		try {
//			empresaModel=factoryNegocioDAO.getEmpresaNegocioDAO().buscarEmpresaxRazonSocialEmpresaLower(empresaModel);
//		} catch (NegocioImplException e) {
//			empresaModel=null;
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(empresaModel !=null){
//			objLog.info(empresaModel.getIdEmpresa()+" - "+empresaModel.getNombreEmpresa());
//		}
//	
//	}
//	
//	public void listaEmpresasNegocioTest(){
//		objLog.info("listaEmpresasNegocioTest");
//		List<EmpresaModel> listaEmpresasModel=new ArrayList<EmpresaModel>();
//		
//		
//		
//		listaEmpresasModel=factoryNegocioDAO.getEmpresaNegocioDAO().listarEmpresasModel();
//	
//		for(EmpresaModel emprMod:listaEmpresasModel){
//			objLog.info(emprMod.getIdEmpresa()+" - "+emprMod.getNombreEmpresa() +" - "+emprMod.getRolUnicoIdentificadorEmpresa());
//		}
//	}
//	
//	public void listarEmpresaxEstadoNegocioTest(){
//		objLog.info("listarEmpresaxEstadoNegocioTest");
//		
//		EmpresaModel empresaModel=new EmpresaModel();
//		List<EmpresaModel> listaEmpresasModel=new ArrayList<EmpresaModel>();
//		empresaModel.setEstadoEmpresa(1);
//		
//		listaEmpresasModel=factoryNegocioDAO.getEmpresaNegocioDAO().listarEmpresaxEstadoModel(empresaModel);
//
//		for(EmpresaModel emprMod:listaEmpresasModel){
//			objLog.info(emprMod.getIdEmpresa()+" - "+emprMod.getNombreEmpresa() +" - "+emprMod.getRolUnicoIdentificadorEmpresa());
//		}
//	
//	}
//	
//}
