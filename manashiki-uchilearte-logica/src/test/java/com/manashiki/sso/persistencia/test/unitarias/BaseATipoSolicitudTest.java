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
//import com.manashiki.sso.logica.entidad.TipoSolicitudEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseATipoSolicitudTest {
//	
//	private static final Logger objLog = LoggerFactory.getLogger(BaseATipoSolicitudTest.class);
//
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia TipoSolicitudDAO
//	 * @testMethod
//	 * TipoSolicitudDAOImpl.crearTipoSolicitudEntity
//	 * TipoSolicitudEntity actualizarTipoSolicitudEntity;
//	 * TipoSolicitudEntity buscarTipoSolicitudxIdEntity;
//	 * List<TipoSolicitudEntity> listarTipoSolicitudesEntity;
//	 */
//	@Test
//	public void testMetodoTipoSolicitudDAO() {
//		crearTipoSolicitudTest();
//		actualizarTipoSolicitudTest();
//		buscarTipoSolicitudxIdTest();
//		listaTipoSolicitudesTest();
//
//	}
//	
//	public void crearTipoSolicitudTest(){
//		objLog.info("crearTipoSolicitudTest");
//		TipoSolicitudEntity TipoSolicitud=new TipoSolicitudEntity();
//		TipoSolicitud.setCodigoTipoSolicitud("TipoSolicitud Test");
//		TipoSolicitud.setNombreTipoSolicitud("TipoSolicitud Test");
//		
//		TipoSolicitud = factoryPersistenciaDAO.getTipoSolicitudDAO().crearTipoSolicitudEntity(TipoSolicitud);
//	}
//	
//	public void actualizarTipoSolicitudTest(){
//		objLog.info("actualizarTipoSolicitudTest");
//		
//		TipoSolicitudEntity TipoSolicitud=new TipoSolicitudEntity();
//		TipoSolicitud.setIdTipoSolicitud(1);
//		TipoSolicitud.setCodigoTipoSolicitud("Actualizar TipoSolicitud Test");
//		TipoSolicitud.setNombreTipoSolicitud("Actualizar TipoSolicitud Test");
//		
//		TipoSolicitud = factoryPersistenciaDAO.getTipoSolicitudDAO().actualizarTipoSolicitudEntity(TipoSolicitud);
//	}
//	
//	public void buscarTipoSolicitudxIdTest(){
//		objLog.info("buscarTipoSolicitudxIdTest");
//		
//		TipoSolicitudEntity TipoSolicitud=new TipoSolicitudEntity();
//		TipoSolicitud.setIdTipoSolicitud(1);
//		
//		try {
//			TipoSolicitud = factoryPersistenciaDAO.getTipoSolicitudDAO().buscarTipoSolicitudxIdEntity(TipoSolicitud);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(TipoSolicitud!=null){
//			objLog.info(TipoSolicitud.getIdTipoSolicitud()+" - "+TipoSolicitud.getNombreTipoSolicitud());
//		}
//	}
//	
//	public void listaTipoSolicitudesTest(){
//		objLog.info("listaTipoSolicitudesTest");
//		List<TipoSolicitudEntity> listaTipoSolicitudes=new ArrayList<TipoSolicitudEntity>();
//		
//		listaTipoSolicitudes = factoryPersistenciaDAO.getTipoSolicitudDAO().listarTipoSolicitudesEntity();
//	
//		for(TipoSolicitudEntity apli:listaTipoSolicitudes){
//			objLog.info(apli.getIdTipoSolicitud()+" - "+apli.getNombreTipoSolicitud());
//		}
//	}
//	
//}
