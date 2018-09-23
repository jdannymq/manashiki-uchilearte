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
//import com.manashiki.sso.negocio.model.FinalidadCertificadoModel;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:negocio-context.xml")
//public class CFinalidadCertificadoNegocioTest {
//	
//	@Autowired
//	FactoryNegocioDAO factoryNegocioDAO;
//	
//	private static final Log objLog = LogFactory.getLog(CFinalidadCertificadoNegocioTest.class);
//	/**Pruebas Unitaria hacia FinalidadCertificadoNegocioDAO
//	 * @testMethod
//	 * FinalidadCertificadoNegocio.crearFinalidadCertificadoModel
//	 * FinalidadCertificadoNegocio.actualizarFinalidadCertificadoModel
// 	 * FinalidadCertificadoNegocio.buscarFinalidadCertificadoxIdModel
// 	 * FinalidadCertificadoNegocio.listarFinalidadCertificadoesModel
// 	 * FinalidadCertificadoNegocio.listarFinalidadCertificadoxNombreLowerModel
// 	 * FinalidadCertificadoNegocio.listarFinalidadCertificadoesxEstadoModel
//	 */
//	
//	@Test
//	public void testMetodosFinalidadCertificadoNegocioTest(){
//		crearFinalidadCertificadoNegocioTest();
//		actualizarFinalidadCertificadoNegocioTest();
//		buscarFinalidadCertificadoNegocioxIdTest();
//		listaFinalidadCertificadoesNegocioTest();
//	}
//	
//	public void crearFinalidadCertificadoNegocioTest(){
//		objLog.info("crearFinalidadCertificadoNegocioTest");
//		FinalidadCertificadoModel finalidadCertificadoModel=new FinalidadCertificadoModel();
//		finalidadCertificadoModel.setCodigoFinalidadCertificado("cod FinalidadCertificado Model");
//		finalidadCertificadoModel.setNombreFinalidadCertificado("FinalidadCertificado Model");
//		
//		finalidadCertificadoModel = factoryNegocioDAO.getFinalidadCertificadoNegocioDAO().crearFinalidadCertificadoModel(finalidadCertificadoModel);
//		
//		System.out.println(finalidadCertificadoModel.getIdFinalidadCertificado()+" "+finalidadCertificadoModel.getNombreFinalidadCertificado());
//	}
//	
//	public void actualizarFinalidadCertificadoNegocioTest(){
//		objLog.info("actualizarFinalidadCertificadoNegocioTest");
//		
//		FinalidadCertificadoModel finalidadCertificadoModel=new FinalidadCertificadoModel();
//		finalidadCertificadoModel.setIdFinalidadCertificado(1);
//		finalidadCertificadoModel.setCodigoFinalidadCertificado("cod FinalidadCertificado ACT");
//		finalidadCertificadoModel.setNombreFinalidadCertificado("FinalidadCertificado ACT");
//		
//		finalidadCertificadoModel = factoryNegocioDAO.getFinalidadCertificadoNegocioDAO().actualizarFinalidadCertificadoModel(finalidadCertificadoModel);
//	}
//	
//	public void buscarFinalidadCertificadoNegocioxIdTest(){
//		objLog.info("buscarFinalidadCertificadoNegocioxIdTest");
//		
//		FinalidadCertificadoModel finalidadCertificadoModel=new FinalidadCertificadoModel();
//		finalidadCertificadoModel.setIdFinalidadCertificado(1);
//		
//		try {
//			finalidadCertificadoModel=factoryNegocioDAO.getFinalidadCertificadoNegocioDAO().buscarFinalidadCertificadoxIdModel(finalidadCertificadoModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(finalidadCertificadoModel!=null){
//			objLog.info(finalidadCertificadoModel.getIdFinalidadCertificado()+" - "+finalidadCertificadoModel.getNombreFinalidadCertificado());
//		}
//	}
//	
//	public void listaFinalidadCertificadoesNegocioTest(){
//		objLog.info("listaFinalidadCertificadoesNegocioTest");
//		List<FinalidadCertificadoModel> listaFinalidadCertificadoesModel=new ArrayList<FinalidadCertificadoModel>();
//		
//		listaFinalidadCertificadoesModel=factoryNegocioDAO.getFinalidadCertificadoNegocioDAO().listarFinalidadCertificadosModel();
//	
//		for(FinalidadCertificadoModel apliMod:listaFinalidadCertificadoesModel){
//			objLog.info(apliMod.getIdFinalidadCertificado()+" - "+apliMod.getNombreFinalidadCertificado());
//		}
//	}
//	
//
//	
//}
