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
//import com.manashiki.sso.negocio.model.EmpresaUsuarioAplicacionEmpresaModel;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:negocio-context.xml")
//	public class LEmpresaUsuarioAplicacionEmpresaNegocioTest {
//		
//		@Autowired
//		FactoryNegocioDAO factoryNegocioDAO;
//		
//		private static final Log objLog = LogFactory.getLog(LEmpresaUsuarioAplicacionEmpresaNegocioTest.class);
//		
//	
//	/**Pruebas Unitaria hacia EmpresaUsuarioAplicacionEmpresaNegocioDAO
//	 * @testMethod
//	 * EmpresaUsuarioAplicacionEmpresaNegocio.crearEmpresaUsuarioAplicacionEmpresaModel
//	 * EmpresaUsuarioAplicacionEmpresaNegocio.actualizarEmpresaUsuarioAplicacionEmpresaModel
// 	 * EmpresaUsuarioAplicacionEmpresaNegocio.buscarEmpresaUsuarioAplicacionEmpresaxIdModel
// 	 * EmpresaUsuarioAplicacionEmpresaNegocio.listarEmpresaUsuarioAplicacionEmpresaModel
// 	 * EmpresaUsuarioAplicacionEmpresaNegocio.listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuario
// 	 * EmpresaUsuarioAplicacionEmpresaNegocio.listarEmpresaUsuarioAplicacionEmpresaxRol
// 	 * EmpresaUsuarioAplicacionEmpresaNegocio.listarEmpresaUsuarioAplicacionEmpresaxEstadoModel
//	 */
//		
//		@Test
//		public void testMetodosEmpresaUsuarioAplicacionEmpresaNegocioTest(){
//			crearEmpresaUsuarioAplicacionEmpresaTest();
//			actualizarEmpresaUsuarioAplicacionEmpresaTest();
//			buscarEmpresaUsuarioAplicacionEmpresaxIdTest();
//			listarEmpresaUsuarioAplicacionEmpresasTest();
//			listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioTest();
//			listarEmpresaUsuarioAplicacionEmpresaxAplicacionEmpresaTest();
//			listarEmpresaUsuarioAplicacionEmpresaxEstadoTest();
//		}
//	
//	public void crearEmpresaUsuarioAplicacionEmpresaTest(){
//		objLog.info("crearEmpresaUsuarioAplicacionEmpresaTest");
//		EmpresaUsuarioAplicacionEmpresaModel eUAEMod=new EmpresaUsuarioAplicacionEmpresaModel();
//		eUAEMod.setIdEmpresaUsuario(1);
//		eUAEMod.setIdAplicacionEmpresa(1);
//		eUAEMod.setEstadoEmpresaUsuarioAplicacionEmpresa(1);
//		
//		factoryNegocioDAO.getEmpresaUsuarioAplicacionEmpresaNegocioDAO().crearEmpresaUsuarioAplicacionEmpresaModel(eUAEMod);
//	}
//	
//	public void actualizarEmpresaUsuarioAplicacionEmpresaTest(){
//		objLog.info("actualizarEmpresaUsuarioTest");
//		EmpresaUsuarioAplicacionEmpresaModel eUAEMod=new EmpresaUsuarioAplicacionEmpresaModel();
//		eUAEMod.setIdEmpresaUsuarioAplicacionEmpresa(1);
//		eUAEMod.setIdEmpresaUsuario(2);
//		eUAEMod.setIdAplicacionEmpresa(2);
//		eUAEMod.setEstadoEmpresaUsuarioAplicacionEmpresa(1);
//		
//		
//		factoryNegocioDAO.getEmpresaUsuarioAplicacionEmpresaNegocioDAO().actualizarEmpresaUsuarioAplicacionEmpresaModel(eUAEMod);
//	}
//	
//	public void buscarEmpresaUsuarioAplicacionEmpresaxIdTest(){
//		objLog.info("buscarEmpresaUsuarioAplicacionEmpresaxIdTest");
//		
//		EmpresaUsuarioAplicacionEmpresaModel eUAEMod=new EmpresaUsuarioAplicacionEmpresaModel();
//		eUAEMod.setIdEmpresaUsuarioAplicacionEmpresa(1);
//		
//		try {
//			eUAEMod=factoryNegocioDAO.getEmpresaUsuarioAplicacionEmpresaNegocioDAO().buscarEmpresaUsuarioAplicacionEmpresaxIdModel(eUAEMod);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(eUAEMod!=null){
//			objLog.info(eUAEMod.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+eUAEMod.getIdEmpresaUsuario() +" - "+eUAEMod.getIdAplicacionEmpresa());
//		}
//	}
//	
//	public void listarEmpresaUsuarioAplicacionEmpresasTest(){
//		objLog.info("listarEmpresaUsuarioAplicacionEmpresasTest");
//		List<EmpresaUsuarioAplicacionEmpresaModel> listaEmpresaUsuarioAplicacionEmpresa=new ArrayList<EmpresaUsuarioAplicacionEmpresaModel>();
//
//		
//		listaEmpresaUsuarioAplicacionEmpresa=factoryNegocioDAO.getEmpresaUsuarioAplicacionEmpresaNegocioDAO().listarEmpresaUsuarioAplicacionEmpresasModel();
//	
//		for(EmpresaUsuarioAplicacionEmpresaModel empUsuApliEmp:listaEmpresaUsuarioAplicacionEmpresa){
//			objLog.info(empUsuApliEmp.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empUsuApliEmp.getIdEmpresaUsuario() +" - "+empUsuApliEmp.getIdAplicacionEmpresa());
//		}
//	}
//	
//	public void listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioTest(){
//		objLog.info("listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioTest");
//		
//		List<EmpresaUsuarioAplicacionEmpresaModel> listaEmpresaUsuarioAplicacionEmpresas =new ArrayList<EmpresaUsuarioAplicacionEmpresaModel>();
//		
//		EmpresaUsuarioAplicacionEmpresaModel euae= new EmpresaUsuarioAplicacionEmpresaModel();
//		euae.setIdEmpresaUsuario(1);
//		
//		
//		listaEmpresaUsuarioAplicacionEmpresas=factoryNegocioDAO.getEmpresaUsuarioAplicacionEmpresaNegocioDAO().listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioModel(euae);
//		
//		for(EmpresaUsuarioAplicacionEmpresaModel empUsuApliEmp:listaEmpresaUsuarioAplicacionEmpresas){
//			objLog.info(empUsuApliEmp.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empUsuApliEmp.getIdEmpresaUsuario() +" - "+empUsuApliEmp.getIdAplicacionEmpresa());
//		}
//	}
//
//	public void listarEmpresaUsuarioAplicacionEmpresaxAplicacionEmpresaTest(){
//		objLog.info("listarEmpresaUsuarioAplicacionEmpresaxAplicacionEmpresaTest");
//		
//		List<EmpresaUsuarioAplicacionEmpresaModel> listaEmpresaUsuarioAplicacionEmpresas =new ArrayList<EmpresaUsuarioAplicacionEmpresaModel>();
//		
//		EmpresaUsuarioAplicacionEmpresaModel euae= new EmpresaUsuarioAplicacionEmpresaModel();
//		euae.setIdAplicacionEmpresa(1);
//		
//		
//		listaEmpresaUsuarioAplicacionEmpresas=factoryNegocioDAO.getEmpresaUsuarioAplicacionEmpresaNegocioDAO().listarEmpresaUsuarioAplicacionEmpresaxAplicacionEmpresaModel(euae);
//		
//		for(EmpresaUsuarioAplicacionEmpresaModel empUsuApliEmp:listaEmpresaUsuarioAplicacionEmpresas){
//			objLog.info(empUsuApliEmp.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empUsuApliEmp.getIdEmpresaUsuario() +" - "+empUsuApliEmp.getIdAplicacionEmpresa());
//		}
//	}
//	
//	public void listarEmpresaUsuarioAplicacionEmpresaxEstadoTest(){
//		objLog.info("listarEmpresaUsuarioAplicacionEmpresaxEstadoTest");
//		
//		List<EmpresaUsuarioAplicacionEmpresaModel> listaEmpresaUsuarioAplicacionEmpresas =new ArrayList<EmpresaUsuarioAplicacionEmpresaModel>();
//		
//		EmpresaUsuarioAplicacionEmpresaModel euae= new EmpresaUsuarioAplicacionEmpresaModel();
//		euae.setEstadoEmpresaUsuarioAplicacionEmpresa(1);;
//		
//		listaEmpresaUsuarioAplicacionEmpresas=factoryNegocioDAO.getEmpresaUsuarioAplicacionEmpresaNegocioDAO().listarEmpresaUsuarioAplicacionEmpresaxEstadoModel(euae);
//		
//		for(EmpresaUsuarioAplicacionEmpresaModel empUsuApliEmp:listaEmpresaUsuarioAplicacionEmpresas){
//			objLog.info(empUsuApliEmp.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empUsuApliEmp.getIdEmpresaUsuario() +" - "+empUsuApliEmp.getIdAplicacionEmpresa());
//		}
//	}
//	
//}