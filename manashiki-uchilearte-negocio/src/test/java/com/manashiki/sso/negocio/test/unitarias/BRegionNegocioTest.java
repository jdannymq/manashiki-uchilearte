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
//import com.manashiki.sso.negocio.model.RegionModel;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:negocio-context.xml")
//public class BRegionNegocioTest {
//	
//	@Autowired
//	FactoryNegocioDAO factoryNegocioDAO;
//	
//	private static final Log objLog = LogFactory.getLog(BRegionNegocioTest.class);
//	
//	/**Pruebas Unitaria hacia RegionNegocioDAO
//	 * @testMethod
//	 * RegionNegocioDAOImpl.crearRegionEntity
//	 * RegionNegocioDAOImpl.actualizarRegionEntity
// 	 * RegionNegocioDAOImpl.buscarRegionxIdRegionEntity
// 	 * RegionNegocioDAOImpl.listarRegionesEntity
//	 */
//	
//	@Test
//	public void testMetodosRegionNegocioTest(){
//		crearRegionTest();
//		actualizarRegionTest();
//		buscarRegionxIdTest();
//		listaRegionesTest();
//	}
//	
//	public void crearRegionTest(){
//		objLog.info("crearRegionTest");
//		RegionModel regionModel=new RegionModel();
//		regionModel.setCodigoRegion("RegionModel Test Model");
//		regionModel.setNombreRegion("RegionModel Test Model");
//		regionModel.setNombreRegionLower(regionModel.getNombreRegion().toLowerCase());
//		regionModel.setDescripcionRegion("RegionModel de Prueba descripcion Model");
//		
//		factoryNegocioDAO.getRegionNegocioDAO().crearRegionModel(regionModel);
//	}
//	
//	public void actualizarRegionTest(){
//		objLog.info("actualizarRegionTest");
//		
//		RegionModel regionModel=new RegionModel();
//		regionModel.setIdRegion(1);
//		regionModel.setCodigoRegion("Actualizar RegionModel Test Model");
//		regionModel.setNombreRegion("Actualizar RegionModel Test Model");
//		regionModel.setNombreRegionLower(regionModel.getNombreRegion().toLowerCase());
//		regionModel.setDescripcionRegion("Actualizar RegionModel de Prueba descripcion Model");
//		
//		
//		factoryNegocioDAO.getRegionNegocioDAO().actualizarRegionModel(regionModel);
//	}
//	
//	public void buscarRegionxIdTest(){
//		objLog.info("buscarRegionxIdTest");
//		
//		RegionModel regionModel=new RegionModel();
//		regionModel.setIdRegion(1);
//		
//		try {
//			regionModel=factoryNegocioDAO.getRegionNegocioDAO().buscarRegionxIdModel(regionModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(regionModel!=null){
//			objLog.info(regionModel.getIdRegion()+" - "+regionModel.getDescripcionRegion());
//		}
//	}
//	
//	public void listaRegionesTest(){
//		objLog.info("listaRegionesTest");
//		List<RegionModel> listaRegionesModel=new ArrayList<RegionModel>();
//		
//		
//		listaRegionesModel=factoryNegocioDAO.getRegionNegocioDAO().listarRegionesModel();
//	
//		for(RegionModel regMod:listaRegionesModel){
//			objLog.info(regMod.getIdRegion()+" - "+regMod.getDescripcionRegion());
//		}
//	}
//	
//}
