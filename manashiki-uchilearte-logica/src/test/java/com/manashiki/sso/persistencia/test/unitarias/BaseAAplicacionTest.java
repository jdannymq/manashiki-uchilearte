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
//import com.manashiki.sso.logica.entidad.AplicacionEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseAAplicacionTest {
//
//	private static final Logger objLog = LoggerFactory.getLogger(BaseAAplicacionTest.class);
//
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//
//	/**Pruebas Unitaria hacia AplicacionDAO
//	 * @testMethod
//	 * AplicacionDAOImpl.crearAplicacionEntity(AplicacionEntity objAplicacionEntity)
//	* AplicacionDAOImpl.actualizarAplicacionEntity(AplicacionEntity objAplicacionEntity)
// 	* AplicacionDAOImpl.buscarAplicacionxIdEntity(AplicacionEntity objAplicacionEntity)
// 	* AplicacionDAOImpl.buscarAplicacionxNombreAplicacionLower(AplicacionEntity objAplicacionEntity);
// 	* AplicacionDAOImpl.listarAplicacionesEntity();
// 	* AplicacionDAOImpl.listarAplicacionxEstadoEntity(AplicacionEntity objAplicacionEntity );
//	 */
//	@Test
//	public void testMetodoAplicacionDAO() {
//		crearAplicacionTest();
//		actualizarAplicacionTest();
//		buscarAplicacionxIdTest();
//		buscarAplicacionxNombreAplicacionLowerTest();
//		listaAplicacionsTest();
//		listaAplicacionesxEstadoTest();
//
//	}
//	
//	public void crearAplicacionTest(){
//		objLog.info("crearAplicacionTest");
//		AplicacionEntity aplicacion=new AplicacionEntity();
//		aplicacion.setNombreAplicacion("Aplicacion Test");
//		aplicacion.setNombreAplicacionLower(aplicacion.getNombreAplicacion().toLowerCase());
//		aplicacion.setDescripcionAplicacion("aplicacion de Prueba");
//		aplicacion.setEstadoAplicacion(1);
//
//		aplicacion = factoryPersistenciaDAO.getAplicacionDAO().crearAplicacionEntity(aplicacion);
//		objLog.info("FIN "+aplicacion.getIdAplicacion()+" - "+aplicacion.getNombreAplicacion()+" - "+aplicacion.getNombreAplicacionLower());
//	}
//
//	public void actualizarAplicacionTest(){
//		objLog.info("actualizarAplicacionTest");
//
//		AplicacionEntity aplicacion=new AplicacionEntity();
//		aplicacion.setIdAplicacion(1);
//		aplicacion.setNombreAplicacion("actualizar Aplicacion Test");
//		aplicacion.setNombreAplicacionLower(aplicacion.getNombreAplicacion().toLowerCase());
//		aplicacion.setDescripcionAplicacion("actualizar Aplicacion De Prueba");
//		aplicacion.setEstadoAplicacion(1);
//
//		aplicacion = factoryPersistenciaDAO.getAplicacionDAO().actualizarAplicacionEntity(aplicacion);
//		objLog.info("FIN "+aplicacion.getIdAplicacion()+" - "+aplicacion.getNombreAplicacion()+" - "+aplicacion.getNombreAplicacionLower());
//	}
//
//	public void buscarAplicacionxIdTest(){
//		objLog.info("buscarAplicacionxIdTest");
//
//		AplicacionEntity aplicacion=new AplicacionEntity();
//		aplicacion.setIdAplicacion(1);
//
//		try {
//			aplicacion=factoryPersistenciaDAO.getAplicacionDAO().buscarAplicacionxIdEntity(aplicacion);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//
//		if(aplicacion!=null){
//			objLog.info(aplicacion.getIdAplicacion()+" - "+aplicacion.getNombreAplicacion()+" - "+aplicacion.getDescripcionAplicacion());
//		}
//	}
//	
//	public void buscarAplicacionxNombreAplicacionLowerTest(){
//		objLog.info("buscarAplicacionxNombreAplicacionLower");
//
//		AplicacionEntity aplicacion=new AplicacionEntity();
//		aplicacion.setNombreAplicacion("asasas");
//		aplicacion.setNombreAplicacionLower(aplicacion.getNombreAplicacion().toLowerCase());
//		
//		try {
//			aplicacion=factoryPersistenciaDAO.getAplicacionDAO().buscarAplicacionxNombreAplicacionLower(aplicacion);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//
//		if(aplicacion!=null){
//			objLog.info(aplicacion.getIdAplicacion()+" - "+aplicacion.getNombreAplicacion()+" - "+aplicacion.getDescripcionAplicacion());
//		}
//	}
//
//	public void listaAplicacionsTest(){
//		objLog.info("listaAplicacionesTest");
//		List<AplicacionEntity> listaAplicaciones=new ArrayList<AplicacionEntity>();
//
//		listaAplicaciones=factoryPersistenciaDAO.getAplicacionDAO().listarAplicacionesEntity();
//
//		for(AplicacionEntity apli:listaAplicaciones){
//			objLog.info(apli.getIdAplicacion()+" - "+apli.getDescripcionAplicacion());
//		}
//	}
//
//	public void listaAplicacionesxEstadoTest(){
//		objLog.info("listaAplicacionesxEstadoTest");
//		List<AplicacionEntity> listaAplicaciones=new ArrayList<AplicacionEntity>();
//
//		AplicacionEntity aplicacion = new AplicacionEntity();
//		aplicacion.setEstadoAplicacion(1);
//		listaAplicaciones=factoryPersistenciaDAO.getAplicacionDAO().listarAplicacionxEstadoEntity(aplicacion);
//
//		for(AplicacionEntity apli:listaAplicaciones){
//			objLog.info(apli.getIdAplicacion()+" - "+apli.getDescripcionAplicacion());
//		}
//	}
//
//
//}
