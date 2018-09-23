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
//import com.manashiki.sso.logica.entidad.ProgramaUniversidadEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseAProgramaUniversidadTest {
//	
//	private static final Logger objLog = LoggerFactory.getLogger(BaseAProgramaUniversidadTest.class);
//
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia ProgramaUniversidadDAO
//	 * @testMethod
//	 * ProgramaUniversidadDAOImpl.crearProgramaUniversidadEntity
//	 * ProgramaUniversidadEntity actualizarProgramaUniversidadEntity;
//	 * ProgramaUniversidadEntity buscarProgramaUniversidadxIdEntity;
//	 * List<ProgramaUniversidadEntity> listarProgramaUniversidadesEntity;
//	 */
//	@Test
//	public void testMetodoProgramaUniversidadDAO() {
//		crearProgramaUniversidadTest();
//		actualizarProgramaUniversidadTest();
//		buscarProgramaUniversidadxIdTest();
//		listaProgramaUniversidadesTest();
//
//	}
//	
//	public void crearProgramaUniversidadTest(){
//		objLog.info("crearProgramaUniversidadTest");
//		ProgramaUniversidadEntity ProgramaUniversidad=new ProgramaUniversidadEntity();
//		ProgramaUniversidad.setCodigoProgramaUniversidad("ProgramaUniversidad Test");
//		ProgramaUniversidad.setNombreProgramaUniversidad("ProgramaUniversidad Test");
//		
//		ProgramaUniversidad = factoryPersistenciaDAO.getProgramaUniversidadDAO().crearProgramaUniversidadEntity(ProgramaUniversidad);
//	}
//	
//	public void actualizarProgramaUniversidadTest(){
//		objLog.info("actualizarProgramaUniversidadTest");
//		
//		ProgramaUniversidadEntity ProgramaUniversidad=new ProgramaUniversidadEntity();
//		ProgramaUniversidad.setIdProgramaUniversidad(1);
//		ProgramaUniversidad.setCodigoProgramaUniversidad("Actualizar ProgramaUniversidad Test");
//		ProgramaUniversidad.setNombreProgramaUniversidad("Actualizar ProgramaUniversidad Test");
//		
//		ProgramaUniversidad = factoryPersistenciaDAO.getProgramaUniversidadDAO().actualizarProgramaUniversidadEntity(ProgramaUniversidad);
//	}
//	
//	public void buscarProgramaUniversidadxIdTest(){
//		objLog.info("buscarProgramaUniversidadxIdTest");
//		
//		ProgramaUniversidadEntity ProgramaUniversidad=new ProgramaUniversidadEntity();
//		ProgramaUniversidad.setIdProgramaUniversidad(1);
//		
//		try {
//			ProgramaUniversidad = factoryPersistenciaDAO.getProgramaUniversidadDAO().buscarProgramaUniversidadxIdEntity(ProgramaUniversidad);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(ProgramaUniversidad!=null){
//			objLog.info(ProgramaUniversidad.getIdProgramaUniversidad()+" - "+ProgramaUniversidad.getNombreProgramaUniversidad());
//		}
//	}
//	
//	public void listaProgramaUniversidadesTest(){
//		objLog.info("listaProgramaUniversidadesTest");
//		List<ProgramaUniversidadEntity> listaProgramaUniversidades=new ArrayList<ProgramaUniversidadEntity>();
//		
//		listaProgramaUniversidades = factoryPersistenciaDAO.getProgramaUniversidadDAO().listarProgramaUniversidadesEntity();
//	
//		for(ProgramaUniversidadEntity apli:listaProgramaUniversidades){
//			objLog.info(apli.getIdProgramaUniversidad()+" - "+apli.getNombreProgramaUniversidad());
//		}
//	}
//	
//}
