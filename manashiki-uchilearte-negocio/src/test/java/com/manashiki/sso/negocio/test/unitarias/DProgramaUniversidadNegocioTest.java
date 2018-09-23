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
//import com.manashiki.sso.negocio.model.ProgramaUniversidadModel;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:negocio-context.xml")
//public class DProgramaUniversidadNegocioTest {
//	
//	@Autowired
//	FactoryNegocioDAO factoryNegocioDAO;
//	
//	private static final Log objLog = LogFactory.getLog(DProgramaUniversidadNegocioTest.class);
//	/**Pruebas Unitaria hacia ProgramaUniversidadNegocioDAO
//	 * @testMethod
//	 * ProgramaUniversidadNegocio.crearProgramaUniversidadModel
//	 * ProgramaUniversidadNegocio.actualizarProgramaUniversidadModel
// 	 * ProgramaUniversidadNegocio.buscarProgramaUniversidadxIdModel
// 	 * ProgramaUniversidadNegocio.listarProgramaUniversidadesModel
// 	 * ProgramaUniversidadNegocio.listarProgramaUniversidadxNombreLowerModel
// 	 * ProgramaUniversidadNegocio.listarProgramaUniversidadesxEstadoModel
//	 */
//	
//	@Test
//	public void testMetodosProgramaUniversidadNegocioTest(){
//		crearProgramaUniversidadNegocioTest();
//		actualizarProgramaUniversidadNegocioTest();
//		buscarProgramaUniversidadNegocioxIdTest();
//		listaProgramaUniversidadesNegocioTest();
//	}
//	
//	public void crearProgramaUniversidadNegocioTest(){
//		objLog.info("crearProgramaUniversidadNegocioTest");
//		ProgramaUniversidadModel programaUniversidadModel=new ProgramaUniversidadModel();
//		programaUniversidadModel.setCodigoProgramaUniversidad("cod ProgramaUniversidad Model");
//		programaUniversidadModel.setNombreProgramaUniversidad("ProgramaUniversidad Model");
//		
//		programaUniversidadModel = factoryNegocioDAO.getProgramaUniversidadNegocioDAO().crearProgramaUniversidadModel(programaUniversidadModel);
//		System.out.println(programaUniversidadModel.getIdProgramaUniversidad()+" "+programaUniversidadModel.getNombreProgramaUniversidad());
//	}
//	
//	public void actualizarProgramaUniversidadNegocioTest(){
//		objLog.info("actualizarProgramaUniversidadNegocioTest");
//		
//		ProgramaUniversidadModel programaUniversidadModel=new ProgramaUniversidadModel();
//		programaUniversidadModel.setIdProgramaUniversidad(1);
//		programaUniversidadModel.setCodigoProgramaUniversidad("cod ProgramaUniversidad ACT");
//		programaUniversidadModel.setNombreProgramaUniversidad("ProgramaUniversidad ACT");
//		
//		programaUniversidadModel = factoryNegocioDAO.getProgramaUniversidadNegocioDAO().actualizarProgramaUniversidadModel(programaUniversidadModel);
//	}
//	
//	public void buscarProgramaUniversidadNegocioxIdTest(){
//		objLog.info("buscarProgramaUniversidadNegocioxIdTest");
//		
//		ProgramaUniversidadModel programaUniversidadModel=new ProgramaUniversidadModel();
//		programaUniversidadModel.setIdProgramaUniversidad(1);
//		
//		try {
//			programaUniversidadModel=factoryNegocioDAO.getProgramaUniversidadNegocioDAO().buscarProgramaUniversidadxIdModel(programaUniversidadModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(programaUniversidadModel!=null){
//			objLog.info(programaUniversidadModel.getIdProgramaUniversidad()+" - "+programaUniversidadModel.getNombreProgramaUniversidad());
//		}
//	}
//	
//	public void listaProgramaUniversidadesNegocioTest(){
//		objLog.info("listaProgramaUniversidadesNegocioTest");
//		List<ProgramaUniversidadModel> listaProgramaUniversidadesModel=new ArrayList<ProgramaUniversidadModel>();
//		
//		listaProgramaUniversidadesModel=factoryNegocioDAO.getProgramaUniversidadNegocioDAO().listarProgramaUniversidadesModel();
//	
//		for(ProgramaUniversidadModel apliMod:listaProgramaUniversidadesModel){
//			objLog.info(apliMod.getIdProgramaUniversidad()+" - "+apliMod.getNombreProgramaUniversidad());
//		}
//	}
//	
//
//	
//}
