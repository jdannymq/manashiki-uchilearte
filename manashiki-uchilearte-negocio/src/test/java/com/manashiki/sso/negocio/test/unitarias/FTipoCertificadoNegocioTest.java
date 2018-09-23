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
//import com.manashiki.sso.negocio.model.TipoCertificadoModel;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:negocio-context.xml")
//public class FTipoCertificadoNegocioTest {
//	
//	@Autowired
//	FactoryNegocioDAO factoryNegocioDAO;
//	
//	private static final Log objLog = LogFactory.getLog(FTipoCertificadoNegocioTest.class);
//	/**Pruebas Unitaria hacia TipoCertificadoNegocioDAO
//	 * @testMethod
//	 * TipoCertificadoNegocio.crearTipoCertificadoModel
//	 * TipoCertificadoNegocio.actualizarTipoCertificadoModel
// 	 * TipoCertificadoNegocio.buscarTipoCertificadoxIdModel
// 	 * TipoCertificadoNegocio.listarTipoCertificadoesModel
// 	 * TipoCertificadoNegocio.listarTipoCertificadoxNombreLowerModel
// 	 * TipoCertificadoNegocio.listarTipoCertificadoesxEstadoModel
//	 */
//	
//	@Test
//	public void testMetodosTipoCertificadoNegocioTest(){
//		crearTipoCertificadoNegocioTest();
//		actualizarTipoCertificadoNegocioTest();
//		buscarTipoCertificadoNegocioxIdTest();
//		listaTipoCertificadoesNegocioTest();
//	}
//	
//	public void crearTipoCertificadoNegocioTest(){
//		objLog.info("crearTipoCertificadoNegocioTest");
//		TipoCertificadoModel tipoCertificadoModel=new TipoCertificadoModel();
//		tipoCertificadoModel.setCodigoTipoCertificado("cod TipoCertificado Model");
//		tipoCertificadoModel.setNombreTipoCertificado("TipoCertificado Model");
//		
//		tipoCertificadoModel = factoryNegocioDAO.getTipoCertificadoNegocioDAO().crearTipoCertificadoModel(tipoCertificadoModel);
//		System.out.println(tipoCertificadoModel.getIdTipoCertificado()+" "+tipoCertificadoModel.getNombreTipoCertificado());
//	}
//	
//	public void actualizarTipoCertificadoNegocioTest(){
//		objLog.info("actualizarTipoCertificadoNegocioTest");
//		
//		TipoCertificadoModel tipoCertificadoModel=new TipoCertificadoModel();
//		tipoCertificadoModel.setIdTipoCertificado(1);
//		tipoCertificadoModel.setCodigoTipoCertificado("cod TipoCertificado ACT");
//		tipoCertificadoModel.setNombreTipoCertificado("TipoCertificado ACT");
//		
//		tipoCertificadoModel = factoryNegocioDAO.getTipoCertificadoNegocioDAO().actualizarTipoCertificadoModel(tipoCertificadoModel);
//	}
//	
//	public void buscarTipoCertificadoNegocioxIdTest(){
//		objLog.info("buscarTipoCertificadoNegocioxIdTest");
//		
//		TipoCertificadoModel tipoCertificadoModel=new TipoCertificadoModel();
//		tipoCertificadoModel.setIdTipoCertificado(1);
//		
//		try {
//			tipoCertificadoModel=factoryNegocioDAO.getTipoCertificadoNegocioDAO().buscarTipoCertificadoxIdModel(tipoCertificadoModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(tipoCertificadoModel!=null){
//			objLog.info(tipoCertificadoModel.getIdTipoCertificado()+" - "+tipoCertificadoModel.getNombreTipoCertificado());
//		}
//	}
//	
//	public void listaTipoCertificadoesNegocioTest(){
//		objLog.info("listaTipoCertificadoesNegocioTest");
//		List<TipoCertificadoModel> listaTipoCertificadoesModel=new ArrayList<TipoCertificadoModel>();
//		
//		listaTipoCertificadoesModel=factoryNegocioDAO.getTipoCertificadoNegocioDAO().listarTipoCertificadoesModel();
//	
//		for(TipoCertificadoModel apliMod:listaTipoCertificadoesModel){
//			objLog.info(apliMod.getIdTipoCertificado()+" - "+apliMod.getNombreTipoCertificado());
//		}
//	}
//	
//
//	
//}
