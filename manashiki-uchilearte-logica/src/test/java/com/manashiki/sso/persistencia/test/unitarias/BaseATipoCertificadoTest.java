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
//import com.manashiki.sso.logica.entidad.TipoCertificadoEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseATipoCertificadoTest {
//	
//	private static final Logger objLog = LoggerFactory.getLogger(BaseATipoCertificadoTest.class);
//
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia TipoCertificadoDAO
//	 * @testMethod
//	 * TipoCertificadoDAOImpl.crearTipoCertificadoEntity
//	 * TipoCertificadoEntity actualizarTipoCertificadoEntity;
//	 * TipoCertificadoEntity buscarTipoCertificadoxIdEntity;
//	 * List<TipoCertificadoEntity> listarTipoCertificadoesEntity;
//	 */
//	@Test
//	public void testMetodoTipoCertificadoDAO() {
//		crearTipoCertificadoTest();
//		actualizarTipoCertificadoTest();
//		buscarTipoCertificadoxIdTest();
//		listaTipoCertificadoesTest();
//
//	}
//	
//	public void crearTipoCertificadoTest(){
//		objLog.info("crearTipoCertificadoTest");
//		TipoCertificadoEntity TipoCertificado=new TipoCertificadoEntity();
//		TipoCertificado.setCodigoTipoCertificado("TipoCertificado Test");
//		TipoCertificado.setNombreTipoCertificado("TipoCertificado Test");
//		
//		TipoCertificado = factoryPersistenciaDAO.getTipoCertificadoDAO().crearTipoCertificadoEntity(TipoCertificado);
//	}
//	
//	public void actualizarTipoCertificadoTest(){
//		objLog.info("actualizarTipoCertificadoTest");
//		
//		TipoCertificadoEntity TipoCertificado=new TipoCertificadoEntity();
//		TipoCertificado.setIdTipoCertificado(1);
//		TipoCertificado.setCodigoTipoCertificado("Actualizar TipoCertificado Test");
//		TipoCertificado.setNombreTipoCertificado("Actualizar TipoCertificado Test");
//		
//		TipoCertificado = factoryPersistenciaDAO.getTipoCertificadoDAO().actualizarTipoCertificadoEntity(TipoCertificado);
//	}
//	
//	public void buscarTipoCertificadoxIdTest(){
//		objLog.info("buscarTipoCertificadoxIdTest");
//		
//		TipoCertificadoEntity TipoCertificado=new TipoCertificadoEntity();
//		TipoCertificado.setIdTipoCertificado(1);
//		
//		try {
//			TipoCertificado = factoryPersistenciaDAO.getTipoCertificadoDAO().buscarTipoCertificadoxIdEntity(TipoCertificado);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(TipoCertificado!=null){
//			objLog.info(TipoCertificado.getIdTipoCertificado()+" - "+TipoCertificado.getNombreTipoCertificado());
//		}
//	}
//	
//	public void listaTipoCertificadoesTest(){
//		objLog.info("listaTipoCertificadoesTest");
//		List<TipoCertificadoEntity> listaTipoCertificadoes=new ArrayList<TipoCertificadoEntity>();
//		
//		listaTipoCertificadoes = factoryPersistenciaDAO.getTipoCertificadoDAO().listarTipoCertificadoesEntity();
//	
//		for(TipoCertificadoEntity apli:listaTipoCertificadoes){
//			objLog.info(apli.getIdTipoCertificado()+" - "+apli.getNombreTipoCertificado());
//		}
//	}
//	
//}
