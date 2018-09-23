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
//import com.manashiki.sso.negocio.model.ComunaModel;
//
//	@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration(locations="classpath:negocio-context.xml")
//	public class GComunaNegocioTest {
//		
//		@Autowired
//		FactoryNegocioDAO factoryNegocioDAO;
//		
//		private static final Log objLog = LogFactory.getLog(BRegionNegocioTest.class);
//
//	/**Pruebas Unitaria hacia ComunaNegocioDAO
//	 * @testMethod
//	 * ComunaNegocioDAO.crearComunaModel
//	 * ComunaNegocioDAO.actualizarComunaModel
// 	 * ComunaNegocioDAO.buscarComunaxIdComunaModel
// 	 * ComunaNegocioDAO.listarComunasModel
// 	 * ComunaNegocioDAO.listarComunasModelxRegion
//	 */
//	
//		@Test
//		public void testMetodosComunaNegocioTest(){
//			crearComunaTest();
//			actualizarComunaTest();
//			buscarComunaxIdTest();
//			listaComunasTest();
//			listaComunasxRegionTest();
//		}
//		
//	public void crearComunaTest(){
//		objLog.info("crearComunaTest");
//		ComunaModel comunaModel=new ComunaModel();
//		comunaModel.setCodigoComuna("ComunaModel Test");
//		comunaModel.setNombreComuna("ComunaModel Test");
//		comunaModel.setNombreComunaLower(comunaModel.getNombreComuna().toLowerCase());
//		comunaModel.setIdRegion(1);
//	
//		
//		factoryNegocioDAO.getComunaNegocioDAO().crearComunaModel(comunaModel);
//	}
//	
//	public void actualizarComunaTest(){
//		objLog.info("actualizarComunaTest");
//		
//		ComunaModel comunaModel=new ComunaModel();
//		comunaModel.setIdComuna(1);
//		comunaModel.setCodigoComuna("Actualizar ComunaModel Test");
//		comunaModel.setNombreComuna("Nombre ComunaModel Test");
//		comunaModel.setNombreComunaLower(comunaModel.getNombreComuna().toLowerCase());
//		comunaModel.setIdRegion(2);
//		
//		
//		factoryNegocioDAO.getComunaNegocioDAO().actualizarComunaModel(comunaModel);
//	}
//	
//	public void buscarComunaxIdTest(){
//		objLog.info("buscarComunaxIdTest");
//		
//		ComunaModel comunaModel=new ComunaModel();
//		comunaModel.setIdComuna(1);
//		
//		try {
//			comunaModel=factoryNegocioDAO.getComunaNegocioDAO().buscarComunaxIdModel(comunaModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(comunaModel!=null){
//			objLog.info(comunaModel.getIdComuna()+" - "+comunaModel.getNombreComuna()+" - "+comunaModel.getNombreComunaLower());
//		}
//	}
//	
//	public void listaComunasTest(){
//		objLog.info("listaComunasTest");
//		List<ComunaModel> listaComunasModel=new ArrayList<ComunaModel>();
//		
//		
//		listaComunasModel=factoryNegocioDAO.getComunaNegocioDAO().listarComunasModel();
//	
//		for(ComunaModel comMod:listaComunasModel){
//			objLog.info(comMod.getIdComuna()+" - "+comMod.getNombreComuna()+" - "+comMod.getNombreComunaLower());
//		}
//	}
//	
//	public void listaComunasxRegionTest(){
//		objLog.info("listaComunasTest");
//		List<ComunaModel> listaComunasModel=new ArrayList<ComunaModel>();
//		ComunaModel comunaModel=new ComunaModel();
//		comunaModel.setIdRegion(1);
//		
//		
//		listaComunasModel=factoryNegocioDAO.getComunaNegocioDAO().listarComunasModel();
//	
//		for(ComunaModel comMod:listaComunasModel){
//			objLog.info(comMod.getIdComuna()+" - "+comMod.getNombreComuna()+" - "+comMod.getNombreComunaLower());
//		}
//	}
//	
//}
