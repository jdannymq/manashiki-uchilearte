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
//import com.manashiki.sso.logica.entidad.FinalidadCertificadoEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseAFinalidadCertificadoTest {
//	
//	private static final Logger objLog = LoggerFactory.getLogger(BaseAFinalidadCertificadoTest.class);
//
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia FinalidadCertificadoDAO
//	 * @testMethod
//	 * FinalidadCertificadoDAOImpl.crearFinalidadCertificadoEntity
//	 * FinalidadCertificadoEntity actualizarFinalidadCertificadoEntity;
//	 * FinalidadCertificadoEntity buscarFinalidadCertificadoxIdEntity;
//	 * List<FinalidadCertificadoEntity> listarFinalidadCertificadoesEntity;
//	 */
//	@Test
//	public void testMetodoFinalidadCertificadoDAO() {
//		crearFinalidadCertificadoTest();
//		actualizarFinalidadCertificadoTest();
//		buscarFinalidadCertificadoxIdTest();
//		listaFinalidadCertificadoesTest();
//
//	}
//	
//	public void crearFinalidadCertificadoTest(){
//		objLog.info("crearFinalidadCertificadoTest");
//		FinalidadCertificadoEntity finalidadCertificado=new FinalidadCertificadoEntity();
//		finalidadCertificado.setCodigoFinalidadCertificado("FinalidadCertificado Test");
//		finalidadCertificado.setNombreFinalidadCertificado("FinalidadCertificado Test");
//		
//		finalidadCertificado = factoryPersistenciaDAO.getFinalidadCertificadoDAO().crearFinalidadCertificadoEntity(finalidadCertificado);
//	}
//	
//	public void actualizarFinalidadCertificadoTest(){
//		objLog.info("actualizarFinalidadCertificadoTest");
//		
//		FinalidadCertificadoEntity finalidadCertificado=new FinalidadCertificadoEntity();
//		finalidadCertificado.setIdFinalidadCertificado(1);
//		finalidadCertificado.setCodigoFinalidadCertificado("Actualizar FinalidadCertificado Test");
//		finalidadCertificado.setNombreFinalidadCertificado("Actualizar FinalidadCertificado Test");
//		
//		finalidadCertificado = factoryPersistenciaDAO.getFinalidadCertificadoDAO().actualizarFinalidadCertificadoEntity(finalidadCertificado);
//	}
//	
//	public void buscarFinalidadCertificadoxIdTest(){
//		objLog.info("buscarFinalidadCertificadoxIdTest");
//		
//		FinalidadCertificadoEntity finalidadCertificado=new FinalidadCertificadoEntity();
//		finalidadCertificado.setIdFinalidadCertificado(1);
//		
//		try {
//			finalidadCertificado = factoryPersistenciaDAO.getFinalidadCertificadoDAO().buscarFinalidadCertificadoxIdEntity(finalidadCertificado);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(finalidadCertificado!=null){
//			objLog.info(finalidadCertificado.getIdFinalidadCertificado()+" - "+finalidadCertificado.getNombreFinalidadCertificado());
//		}
//	}
//	
//	public void listaFinalidadCertificadoesTest(){
//		objLog.info("listaFinalidadCertificadoesTest");
//		List<FinalidadCertificadoEntity> listaFinalidadCertificadoes=new ArrayList<FinalidadCertificadoEntity>();
//		
//		listaFinalidadCertificadoes = factoryPersistenciaDAO.getFinalidadCertificadoDAO().listarFinalidadCertificadoesEntity();
//	
//		for(FinalidadCertificadoEntity apli:listaFinalidadCertificadoes){
//			objLog.info(apli.getIdFinalidadCertificado()+" - "+apli.getNombreFinalidadCertificado());
//		}
//	}
//	
//}
