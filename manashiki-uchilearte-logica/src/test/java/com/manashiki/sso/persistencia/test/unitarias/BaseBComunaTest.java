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
//import com.manashiki.sso.logica.entidad.ComunaEntity;
//import com.manashiki.sso.logica.entidad.RegionEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseBComunaTest {
//	
//private static final Logger objLog = LoggerFactory.getLogger(BaseBComunaTest.class);
//	
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia ComunaDAO
//	 * @testMethod
//	 * ComunaDAOImpl.crearComunaEntity(ComunaEntity objComunaEntity);
//	 * ComunaDAOImpl.actualizarComunaEntity(ComunaEntity objComunaEntity);
//	 * ComunaDAOImpl.buscarComunaxIdEntity(ComunaEntity objComunaEntity) throws PersistenceImplException;
//	 * ComunaDAOImpl.listarComunasEntity();
//	 * ComunaDAOImpl.listarComunasEntityxRegion(ComunaEntity objComunaEntity);
//	 */
//	
//	@Test
//	public void testMetodoRegionDAO() {
//		crearComunaTest();
//		actualizarComunaTest();
//		buscarComunaxIdTest();
//		listaComunasTest();
//		listaComunasxRegionTest();
//
//	}
//	
//	public void crearComunaTest(){
//		objLog.info("crearComunaTest");
//		ComunaEntity comuna=new ComunaEntity();
//		comuna.setCodigoComuna("Comuna Test");
//		comuna.setNombreComuna("Comuna Test");
//		comuna.setNombreComunaLower(comuna.getNombreComuna().toLowerCase());
//		
//		RegionEntity region = new RegionEntity();
//		region.setIdRegion(1);
//		comuna.setFkIdRegion(region);
//	
//		factoryPersistenciaDAO.getComunaDAO().crearComunaEntity(comuna);
//	}
//	
//	public void actualizarComunaTest(){
//		objLog.info("actualizarComunaTest");
//		
//		ComunaEntity comuna=new ComunaEntity();
//		comuna.setIdComuna(1);
//		comuna.setCodigoComuna("Actualizar Comuna Test");
//		comuna.setNombreComuna("ActualizarComuna Test");
//		comuna.setNombreComunaLower(comuna.getNombreComuna().toLowerCase());
//		RegionEntity region = new RegionEntity();
//		region.setIdRegion(1);
//		comuna.setFkIdRegion(region);
//		
//		factoryPersistenciaDAO.getComunaDAO().actualizarComunaEntity(comuna);
//	}
//	
//	public void buscarComunaxIdTest(){
//		objLog.info("buscarComunaxIdTest");
//		
//		ComunaEntity comuna=new ComunaEntity();
//		comuna.setIdComuna(1);
//		
//		try {
//			comuna=factoryPersistenciaDAO.getComunaDAO().buscarComunaxIdEntity(comuna);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(comuna!=null){
//			objLog.info(comuna.getIdComuna()+" - "+comuna.getNombreComuna()+" - "+comuna.getNombreComunaLower());
//		}
//	}
//	
//	public void listaComunasTest(){
//		objLog.info("listaComunasTest");
//		List<ComunaEntity> listaComunas=new ArrayList<ComunaEntity>();
//		
//		listaComunas=factoryPersistenciaDAO.getComunaDAO().listarComunasEntity();
//	
//		for(ComunaEntity comuna:listaComunas){
//				objLog.info(comuna.getIdComuna()+" - "+comuna.getNombreComuna()+" - "+comuna.getNombreComunaLower());
//		}
//	}
//	
//	public void listaComunasxRegionTest(){
//		objLog.info("listaComunasxRegionTest");
//		List<ComunaEntity> listaComunas=new ArrayList<ComunaEntity>();
//		ComunaEntity comuna=new ComunaEntity();
//		
//		RegionEntity region = new RegionEntity();
//		region.setIdRegion(1);
//		comuna.setFkIdRegion(region);
//		
//		listaComunas=factoryPersistenciaDAO.getComunaDAO().listarComunasEntity();
//	
//		for(ComunaEntity com:listaComunas){
//			objLog.info(com.getIdComuna()+" - "+com.getNombreComuna()+" - "+com.getNombreComunaLower());
//	}
//	}
//	
//}
