//package com.manashiki.sso.persistencia.test.unitarias;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.manashiki.sso.logica.dao.FactoryPersistenciaDAO;
//import com.manashiki.sso.logica.entidad.RegionEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseARegionTest {
//	
//	private static final Logger objLog = LoggerFactory.getLogger(BaseARegionTest.class);
//
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia RegionDAO
//	 * @testMethod
//	 * RegionDAOImpl.crearRegionEntity
//	 * RegionEntity actualizarRegionEntity;
//	 * RegionEntity buscarRegionxIdEntity;
//	 * List<RegionEntity> listarRegionesEntity;
//	 */
//	@Test
//	public void testMetodoRegionDAO() {
//		crearRegionTest();
//		actualizarRegionTest();
//		buscarRegionxIdTest();
//		listaRegionesTest();
//
//	}
//	
//	public void crearRegionTest(){
//		objLog.info("crearRegionTest");
//		RegionEntity region=new RegionEntity();
//		region.setCodigoRegion("Region Test");
//		region.setNombreRegion("Region Test");
//		region.setNombreRegionLower(region.getNombreRegion().toLowerCase());
//		region.setDescripcionRegion("Region de Prueba descripcion");
//		
//		region = factoryPersistenciaDAO.getRegionDAO().crearRegionEntity(region);
//	}
//	
//	public void actualizarRegionTest(){
//		objLog.info("actualizarRegionTest");
//		
//		RegionEntity region=new RegionEntity();
//		region.setIdRegion(1);
//		region.setCodigoRegion("Actualizar Region Test");
//		region.setNombreRegion("Actualizar Region Test");
//		region.setNombreRegionLower(region.getNombreRegion().toLowerCase());
//		region.setDescripcionRegion("Actualizar Region de Prueba descripcion");
//		
//		region = factoryPersistenciaDAO.getRegionDAO().actualizarRegionEntity(region);
//	}
//	
//	public void buscarRegionxIdTest(){
//		objLog.info("buscarRegionxIdTest");
//		
//		RegionEntity region=new RegionEntity();
//		region.setIdRegion(1);
//		
//		try {
//			region = factoryPersistenciaDAO.getRegionDAO().buscarRegionxIdEntity(region);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(region!=null){
//			objLog.info(region.getIdRegion()+" - "+region.getDescripcionRegion());
//		}
//	}
//	
//	public void listaRegionesTest(){
//		objLog.info("listaRegionesTest");
//		List<RegionEntity> listaRegiones=new ArrayList<RegionEntity>();
//		
//		listaRegiones = factoryPersistenciaDAO.getRegionDAO().listarRegionesEntity();
//	
//		for(RegionEntity apli:listaRegiones){
//			objLog.info(apli.getIdRegion()+" - "+apli.getDescripcionRegion());
//		}
//	}
//	
//}
