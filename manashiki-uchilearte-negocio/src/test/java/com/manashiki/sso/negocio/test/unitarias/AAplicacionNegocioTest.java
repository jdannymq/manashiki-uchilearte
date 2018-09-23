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
//import com.manashiki.sso.negocio.model.AplicacionModel;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:negocio-context.xml")
//public class AAplicacionNegocioTest {
//	
//	@Autowired
//	FactoryNegocioDAO factoryNegocioDAO;
//	
//	private static final Log objLog = LogFactory.getLog(AAplicacionNegocioTest.class);
//	/**Pruebas Unitaria hacia AplicacionNegocioDAO
//	 * @testMethod
//	 * AplicacionNegocio.crearAplicacionModel
//	 * AplicacionNegocio.actualizarAplicacionModel
// 	 * AplicacionNegocio.buscarAplicacionxIdModel
// 	 * AplicacionNegocio.listarAplicacionesModel
// 	 * AplicacionNegocio.listarAplicacionxNombreLowerModel
// 	 * AplicacionNegocio.listarAplicacionesxEstadoModel
//	 */
//	
//	@Test
//	public void testMetodosAplicacionNegocioTest(){
//		crearAplicacionNegocioTest();
//		actualizarAplicacionNegocioTest();
//		buscarAplicacionNegocioxIdTest();
//		listaAplicacionesNegocioTest();
//		listaAplicacionesNegocioxEstadoTest();
//	}
//	
//	public void crearAplicacionNegocioTest(){
//		objLog.info("crearAplicacionNegocioTest");
//		AplicacionModel aplicacionModel=new AplicacionModel();
//		aplicacionModel.setNombreAplicacion("Aplicacion Model");
//		aplicacionModel.setNombreAplicacionLower(aplicacionModel.getNombreAplicacion().toLowerCase());
//		aplicacionModel.setDescripcionAplicacion("aplicacion de Prueba Model");
//		aplicacionModel.setEstadoAplicacion(1);
//		
//		aplicacionModel = factoryNegocioDAO.getAplicacionNegocioDAO().crearAplicacionModel(aplicacionModel);
//		System.out.println(aplicacionModel.getIdAplicacion()+" "+aplicacionModel.getDescripcionAplicacion()+" "+aplicacionModel.getNombreAplicacion());
//	}
//	
//	public void actualizarAplicacionNegocioTest(){
//		objLog.info("actualizarAplicacionNegocioTest");
//		
//		AplicacionModel aplicacionModel=new AplicacionModel();
//		aplicacionModel.setIdAplicacion(1);
//		aplicacionModel.setNombreAplicacion("Actualizar Aplicacion Model");
//		aplicacionModel.setNombreAplicacionLower(aplicacionModel.getNombreAplicacion().toLowerCase());
//		aplicacionModel.setDescripcionAplicacion("Actualizar Aplicacion Model en el Test");
//		aplicacionModel.setEstadoAplicacion(2);
//		
//		aplicacionModel = factoryNegocioDAO.getAplicacionNegocioDAO().actualizarAplicacionModel(aplicacionModel);
//	}
//	
//	public void buscarAplicacionNegocioxIdTest(){
//		objLog.info("buscarAplicacionNegocioxIdTest");
//		
//		AplicacionModel aplicacionModel=new AplicacionModel();
//		aplicacionModel.setIdAplicacion(1);
//		
//		try {
//			aplicacionModel=factoryNegocioDAO.getAplicacionNegocioDAO().buscarAplicacionxIdModel(aplicacionModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(aplicacionModel!=null){
//			objLog.info(aplicacionModel.getIdAplicacion()+" - "+aplicacionModel.getDescripcionAplicacion());
//		}
//	}
//	
//	public void listaAplicacionesNegocioTest(){
//		objLog.info("listaAplicacionesNegocioTest");
//		List<AplicacionModel> listaAplicacionesModel=new ArrayList<AplicacionModel>();
//		
//		listaAplicacionesModel=factoryNegocioDAO.getAplicacionNegocioDAO().listarAplicacionesModel();
//	
//		for(AplicacionModel apliMod:listaAplicacionesModel){
//			objLog.info(apliMod.getIdAplicacion()+" - "+apliMod.getDescripcionAplicacion());
//		}
//	}
//	
//	public void listaAplicacionesNegocioxEstadoTest(){
//		objLog.info("listaAplicacionesNegocioxEstadoTest");
//		List<AplicacionModel> listaAplicacionesModel=new ArrayList<AplicacionModel>();
//		AplicacionModel aplicacionModel=new AplicacionModel();
//		
//		aplicacionModel.setEstadoAplicacion(1);
//		listaAplicacionesModel=factoryNegocioDAO.getAplicacionNegocioDAO().listarAplicacionxEstadoModel(aplicacionModel);
//	
//		for(AplicacionModel apliMod:listaAplicacionesModel){
//			objLog.info(apliMod.getIdAplicacion()+" - "+apliMod.getDescripcionAplicacion());
//		}
//	}
//	
//}
