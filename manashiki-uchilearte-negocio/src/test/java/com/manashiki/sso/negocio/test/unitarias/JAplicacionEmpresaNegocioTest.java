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
//import com.manashiki.sso.negocio.model.AplicacionEmpresaModel;
//
//	@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration(locations="classpath:negocio-context.xml")
//	public class JAplicacionEmpresaNegocioTest {
//		
//		@Autowired
//		FactoryNegocioDAO factoryNegocioDAO;
//		
//		private static final Log objLog = LogFactory.getLog(JAplicacionEmpresaNegocioTest.class);
//	
//	/**Pruebas Unitaria hacia AplicacionEmpresaNegocioDAO
//	 * @testMethod
//	 * public AplicacionEmpresaModel crearAplicacionEmpresaModel(AplicacionEmpresaModel objAplicacionEmpresaModel );
//	AplicacionEmpresaNegocio.actualizarAplicacionEmpresaModel(AplicacionEmpresaModel objAplicacionEmpresaModel );
//	AplicacionEmpresaNegocio.buscarAplicacionEmpresaxIdModel(AplicacionEmpresaModel objAplicacionEmpresa) throws NegocioImplException;
//	AplicacionEmpresaNegocio.buscarAplicacionEmpresaxAplicacionModelxEmpresaModel(AplicacionEmpresaModel objAplicacionEmpresa) throws NegocioImplException;
//	AplicacionEmpresaNegocio.listarAplicacionEmpresasModel();
//	AplicacionEmpresaNegocio.listarAplicacionEmpresaxAplicacionModel(AplicacionEmpresaModel objAplicacionEmpresaModel);
//	AplicacionEmpresaNegocio.listarAplicacionEmpresaxEmpresaModel(AplicacionEmpresaModel objAplicacionEmpresaModel);
//	AplicacionEmpresaNegocio.listarAplicacionEmpresaxEstadoModel(AplicacionEmpresaModel objAplicacionEmpresaModel);
//	 */
//	
//		@Test
//		public void testMetodosAplicacionEmpresaNegocioTest(){
//			crearAplicacionEmpresaNegocioTest();
//			actualizarAplicacionEmpresaNegocioTest();
//			buscarAplicacionEmpresaxIdNegocioTest();
//			buscarAplicacionEmpresaxAplicacionModelxEmpresaTest();
//			listarAplicacionEmpresasNegocioTest();
//			listarAplicacionEmpresaxAplicacionNegocioTest();
//			listarAplicacionEmpresaxEmpresaNegocioTest();
//			listarAplicacionEmpresaxEstadoNegocioTest();
//		}
//		
//	public void crearAplicacionEmpresaNegocioTest(){
//		objLog.info("crearAplicacionEmpresaNegocioTest");
//		AplicacionEmpresaModel aplicacionEmpresaModel=new AplicacionEmpresaModel();
//		aplicacionEmpresaModel.setIdAplicacion(1);
//		aplicacionEmpresaModel.setIdEmpresa(1);
//		aplicacionEmpresaModel.setEstadoAplicacionEmpresa(1);
//
//		
//		factoryNegocioDAO.getAplicacionEmpresaNegocioDAO().crearAplicacionEmpresaModel(aplicacionEmpresaModel);
//	}
//	
//	public void actualizarAplicacionEmpresaNegocioTest(){
//		objLog.info("actualizarAplicacionEmpresaNegocioTest");
//		AplicacionEmpresaModel aplicacionEmpresaModel=new AplicacionEmpresaModel();
//		
//		aplicacionEmpresaModel.setIdAplicacionEmpresa(1);
//		aplicacionEmpresaModel.setIdAplicacion(2);
//		aplicacionEmpresaModel.setIdEmpresa(2);
//		aplicacionEmpresaModel.setEstadoAplicacionEmpresa(2);
//		
//		
//		factoryNegocioDAO.getAplicacionEmpresaNegocioDAO().actualizarAplicacionEmpresaModel(aplicacionEmpresaModel);
//	}
//	
//	public void buscarAplicacionEmpresaxIdNegocioTest(){
//		objLog.info("buscarAplicacionEmpresaxIdNegocioTest");
//		
//		AplicacionEmpresaModel aplicacionEmpresaModel=new AplicacionEmpresaModel();
//		aplicacionEmpresaModel.setIdAplicacionEmpresa(1);
//		
//		
//		try {
//			aplicacionEmpresaModel=factoryNegocioDAO.getAplicacionEmpresaNegocioDAO().buscarAplicacionEmpresaxIdModel(aplicacionEmpresaModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(aplicacionEmpresaModel!=null){
//			objLog.info(aplicacionEmpresaModel.getIdAplicacionEmpresa()+" - "+aplicacionEmpresaModel.getIdAplicacion() +" - "+aplicacionEmpresaModel.getIdEmpresa());
//		}
//	}
//	
//	public void buscarAplicacionEmpresaxAplicacionModelxEmpresaTest(){
//		objLog.info("buscarAplicacionEmpresaxIdNegocioTest");
//		
//		AplicacionEmpresaModel aplicacionEmpresaModel=new AplicacionEmpresaModel();
//		aplicacionEmpresaModel.setIdAplicacion(1);
//		aplicacionEmpresaModel.setIdEmpresa(1);
//		
//		try {
//			aplicacionEmpresaModel=factoryNegocioDAO.getAplicacionEmpresaNegocioDAO().buscarAplicacionEmpresaxAplicacionModelxEmpresaModel(aplicacionEmpresaModel);
//		} catch (NegocioImplException e) {
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(aplicacionEmpresaModel!=null){
//			objLog.info(aplicacionEmpresaModel.getIdAplicacionEmpresa()+" - "+aplicacionEmpresaModel.getIdAplicacion() +" - "+aplicacionEmpresaModel.getIdEmpresa());
//		}
//	}
//	
//	public void listarAplicacionEmpresasNegocioTest(){
//		objLog.info("listarAplicacionEmpresasNegocioTest");
//		List<AplicacionEmpresaModel> listaAplicacionEmpresas=new ArrayList<AplicacionEmpresaModel>();
//		
//		
//		listaAplicacionEmpresas=factoryNegocioDAO.getAplicacionEmpresaNegocioDAO().listarAplicacionEmpresasModel();
//	
//		for(AplicacionEmpresaModel apliEmpMod:listaAplicacionEmpresas){
//			objLog.info(apliEmpMod.getIdAplicacionEmpresa()+" - "+apliEmpMod.getIdAplicacion() +" - "+apliEmpMod.getIdEmpresa());
//		}
//	}
//	
//	public void listarAplicacionEmpresaxAplicacionNegocioTest(){
//		objLog.info("listarAplicacionEmpresasNegocioTest");
//		List<AplicacionEmpresaModel> listaAplicacionEmpresas=new ArrayList<AplicacionEmpresaModel>();
//		AplicacionEmpresaModel aplicacionEmpresaModel = new AplicacionEmpresaModel();
//		
//		aplicacionEmpresaModel.setIdAplicacion(1);
//		
//		listaAplicacionEmpresas=factoryNegocioDAO.getAplicacionEmpresaNegocioDAO().listarAplicacionEmpresaxAplicacionModel(aplicacionEmpresaModel);
//			
//		for(AplicacionEmpresaModel apliEmpMod:listaAplicacionEmpresas){
//			objLog.info(apliEmpMod.getIdAplicacionEmpresa()+" - "+apliEmpMod.getIdAplicacion() +" - "+apliEmpMod.getIdEmpresa());
//		}
//	}
//	
//	public void listarAplicacionEmpresaxEmpresaNegocioTest(){
//		objLog.info("listarAplicacionEmpresasNegocioTest");
//		List<AplicacionEmpresaModel> listaAplicacionEmpresas=new ArrayList<AplicacionEmpresaModel>();
//		AplicacionEmpresaModel aplicacionEmpresaModel = new AplicacionEmpresaModel();
//		
//		aplicacionEmpresaModel.setIdEmpresa(1);
//		listaAplicacionEmpresas=factoryNegocioDAO.getAplicacionEmpresaNegocioDAO().listarAplicacionEmpresaxEmpresaModel(aplicacionEmpresaModel);
//			
//		for(AplicacionEmpresaModel apliEmpMod:listaAplicacionEmpresas){
//			objLog.info(apliEmpMod.getIdAplicacionEmpresa()+" - "+apliEmpMod.getIdAplicacion() +" - "+apliEmpMod.getIdEmpresa());
//		}
//	}
//	
//		
//	public void listarAplicacionEmpresaxEstadoNegocioTest(){
//		objLog.info("listarAplicacionEmpresaxEstadoNegocioTest");
//		
//		AplicacionEmpresaModel aplicacionEmpresaModel=new AplicacionEmpresaModel();
//		List<AplicacionEmpresaModel> listaAplicacionEmpresas =new ArrayList<AplicacionEmpresaModel>();
//		
//		aplicacionEmpresaModel.setEstadoAplicacionEmpresa(1);
//		
//		listaAplicacionEmpresas=factoryNegocioDAO.getAplicacionEmpresaNegocioDAO().listarAplicacionEmpresaxEstadoModel(aplicacionEmpresaModel);
//		
//		for(AplicacionEmpresaModel apliEmpMod:listaAplicacionEmpresas){
//			objLog.info(apliEmpMod.getIdAplicacionEmpresa()+" - "+apliEmpMod.getIdAplicacion() +" - "+apliEmpMod.getIdEmpresa());
//		}
//	}
//	
//}
