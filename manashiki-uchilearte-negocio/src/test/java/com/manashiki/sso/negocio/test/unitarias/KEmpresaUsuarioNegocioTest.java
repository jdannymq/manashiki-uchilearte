//package com.manashiki.sso.negocio.test.unitarias;
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
//import com.manashiki.sso.negocio.model.EmpresaUsuarioModel;
//
//
//	@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration(locations="classpath:negocio-context.xml")
//	public class KEmpresaUsuarioNegocioTest {
//		
//		@Autowired
//		FactoryNegocioDAO factoryNegocioDAO;
//		
//		private static final Log objLog = LogFactory.getLog(KEmpresaUsuarioNegocioTest.class);
//		
//	
//	/**Pruebas Unitaria hacia EmpresaUsuarioNegocioDAO
//	 * @testMethod
//	 * EmpresaUsuarioNegocio.crearEmpresaUsuarioModel
//	 * EmpresaUsuarioNegocio.actualizarEmpresaUsuarioModel
// 	 * EmpresaUsuarioNegocio.buscarEmpresaUsuarioxIdModel
// 	 * EmpresaUsuarioNegocio.listarEmpresaUsuariosModel
// 	 * EmpresaUsuarioNegocio.listarEmpresaUsuariosxEmpresa
// 	 * EmpresaUsuarioNegocio.listarEmpresaUsuariosxUsuario
// 	 * EmpresaUsuarioNegocio.listarEmpresaUsuarioEstadoModel
//	 */
//		@Test
//		public void testMetodosEmpresaUsuarioNegocioTest(){
//			crearEmpresaUsuarioNegocioTest();
//			actualizarEmpresaUsuarioNegocioTest();
//			buscarEmpresaUsuarioxIdNegocioTest();
//			listarEmpresaUsuariosNegocioTest();
//			listarEmpresaUsuarioxEmpresaNegocioTest();
//			listarEmpresaUsuarioxUsuarioNegocioTest();
//			listarEmpresaUsuarioxEstadoNegocioTest();
//		}
//		
//		
//	public void crearEmpresaUsuarioNegocioTest(){
//		objLog.info("crearEmpresaUsuarioNegocioTest");
//		EmpresaUsuarioModel empresaUsuarioModel=new EmpresaUsuarioModel();
//		empresaUsuarioModel.setIdEmpresa(1);
//		empresaUsuarioModel.setIdUsuario(1);
//		empresaUsuarioModel.setEstadoEmpresaUsuario(1);
//
//		
//		factoryNegocioDAO.getEmpresaUsuarioNegocioDAO().crearEmpresaUsuarioModel(empresaUsuarioModel);
//	}
//	
//	public void actualizarEmpresaUsuarioNegocioTest(){
//		objLog.info("actualizarEmpresaUsuarioNegocioTest");
//		EmpresaUsuarioModel empresaUsuarioModel=new EmpresaUsuarioModel();
//		
//		empresaUsuarioModel.setIdEmpresaUsuario(1);
//		empresaUsuarioModel.setIdEmpresa(2);
//		empresaUsuarioModel.setIdUsuario(2);
//		empresaUsuarioModel.setEstadoEmpresaUsuario(2);
//		
//		
//		factoryNegocioDAO.getEmpresaUsuarioNegocioDAO().actualizarEmpresaUsuarioModel(empresaUsuarioModel);
//	}
//	
//	public void buscarEmpresaUsuarioxIdNegocioTest(){
//		objLog.info("buscarEmpresaUsuarioxIdNegocioTest");
//		
//		EmpresaUsuarioModel empresaUsuarioModel=new EmpresaUsuarioModel();
//		empresaUsuarioModel.setIdEmpresaUsuario(1);
//		
//		
//		try {
//			empresaUsuarioModel=factoryNegocioDAO.getEmpresaUsuarioNegocioDAO().buscarEmpresaUsuarioxIdModel(empresaUsuarioModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(empresaUsuarioModel!=null){
//			objLog.info(empresaUsuarioModel.getIdEmpresaUsuario()+" - "+empresaUsuarioModel.getIdEmpresa() +" - "+empresaUsuarioModel.getIdUsuario());
//		}
//	}
//	
//	public void listarEmpresaUsuariosNegocioTest(){
//		objLog.info("listarEmpresaUsuariosNegocioTest");
//		List<EmpresaUsuarioModel> listaEmpresaUsuarios=new ArrayList<EmpresaUsuarioModel>();
//		
//		
//		listaEmpresaUsuarios=factoryNegocioDAO.getEmpresaUsuarioNegocioDAO().listarEmpresaUsuariosModel();
//	
//		for(EmpresaUsuarioModel EmpUsuMod:listaEmpresaUsuarios){
//			objLog.info(EmpUsuMod.getIdEmpresaUsuario()+" - "+EmpUsuMod.getIdEmpresa() +" - "+EmpUsuMod.getIdUsuario());
//		}
//	}
//	
//	public void listarEmpresaUsuarioxEmpresaNegocioTest(){
//		objLog.info("listarEmpresaUsuarioxEmpresaNegocioTest");
//		
//		EmpresaUsuarioModel empresaUsuarioModel=new EmpresaUsuarioModel();
//		List<EmpresaUsuarioModel> listaEmpresaUsuarios =new ArrayList<EmpresaUsuarioModel>();
//		
//		empresaUsuarioModel.setIdEmpresa(1);
//		
//		listaEmpresaUsuarios=factoryNegocioDAO.getEmpresaUsuarioNegocioDAO().listarEmpresaUsuarioxEmpresaModel(empresaUsuarioModel);
//		
//		for(EmpresaUsuarioModel EmpUsuMod:listaEmpresaUsuarios){
//			objLog.info(EmpUsuMod.getIdEmpresaUsuario()+" - "+EmpUsuMod.getIdEmpresa() +" - "+EmpUsuMod.getIdUsuario());
//		}
//	}
//
//	public void listarEmpresaUsuarioxUsuarioNegocioTest(){
//		objLog.info("listarEmpresaUsuarioxUsuarioNegocioTest");
//		
//		EmpresaUsuarioModel empresaUsuarioModel=new EmpresaUsuarioModel();
//		List<EmpresaUsuarioModel> listaEmpresaUsuarios =new ArrayList<EmpresaUsuarioModel>();
//		
//		empresaUsuarioModel.setIdUsuario(1);
//		
//		listaEmpresaUsuarios=factoryNegocioDAO.getEmpresaUsuarioNegocioDAO().listarEmpresaUsuarioxUsuarioModel(empresaUsuarioModel);
//		
//		for(EmpresaUsuarioModel EmpUsuMod:listaEmpresaUsuarios){
//			objLog.info(EmpUsuMod.getIdEmpresaUsuario()+" - "+EmpUsuMod.getIdEmpresa() +" - "+EmpUsuMod.getIdUsuario());
//		}
//	}
//	
//	public void listarEmpresaUsuarioxEstadoNegocioTest(){
//		objLog.info("listarEmpresaUsuarioxEstadoNegocioTest");
//		
//		EmpresaUsuarioModel empresaUsuarioModel=new EmpresaUsuarioModel();
//		List<EmpresaUsuarioModel> listaEmpresaUsuarios =new ArrayList<EmpresaUsuarioModel>();
//		
//		empresaUsuarioModel.setEstadoEmpresaUsuario(1);
//		
//		
//		
//		listaEmpresaUsuarios=factoryNegocioDAO.getEmpresaUsuarioNegocioDAO().listarEmpresaUsuarioxEstadoModel(empresaUsuarioModel);
//		
//		for(EmpresaUsuarioModel EmpUsuMod:listaEmpresaUsuarios){
//			objLog.info(EmpUsuMod.getIdEmpresaUsuario()+" - "+EmpUsuMod.getIdEmpresa() +" - "+EmpUsuMod.getIdUsuario());
//		}
//	}
//	
//}