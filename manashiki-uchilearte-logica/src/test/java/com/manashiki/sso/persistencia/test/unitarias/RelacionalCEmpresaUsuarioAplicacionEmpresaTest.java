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
//import com.manashiki.sso.logica.entidad.AplicacionEmpresaEntity;
//import com.manashiki.sso.logica.entidad.EmpresaUsuarioEntity;
//import com.manashiki.sso.logica.entidad.EmpresaUsuarioAplicacionEmpresaEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class RelacionalCEmpresaUsuarioAplicacionEmpresaTest {
//	
//	
//	private static final Logger objLog = LoggerFactory.getLogger(RelacionalCEmpresaUsuarioAplicacionEmpresaTest.class);
//	
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia EmpresaUsuarioAplicacionEmpresaDAO
//	 * @testMethod
//	 * EmpresaUsuarioAplicacionEmpresaDAOImpl.crearEmpresaUsuarioAplicacionEmpresaEntity
//	 * EmpresaUsuarioAplicacionEmpresaDAOImpl.actualizarEmpresaUsuarioAplicacionEmpresaEntity
// 	 * EmpresaUsuarioAplicacionEmpresaDAOImpl.buscarEmpresaUsuarioAplicacionEmpresaxIdEntity
// 	 * EmpresaUsuarioAplicacionEmpresaDAOImpl.listarEmpresaUsuarioAplicacionEmpresaEntity
// 	 * EmpresaUsuarioAplicacionEmpresaDAOImpl.listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuario
// 	 * EmpresaUsuarioAplicacionEmpresaDAOImpl.listarEmpresaUsuarioAplicacionEmpresaxRol
// 	 * EmpresaUsuarioAplicacionEmpresaDAOImpl.listarEmpresaUsuarioAplicacionEmpresaxEstadoEntity
//	 */
//	
//	@Test
//	public void testMetodoAplicacionEmpresaDAO() {
//		crearEmpresaUsuarioAplicacionEmpresaTest();
//		actualizarEmpresaUsuarioAplicacionEmpresaTest();
//		buscarEmpresaUsuarioAplicacionEmpresaxIdTest();
//		listarEmpresaUsuarioAplicacionEmpresasTest();
//		listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioTest();
//		listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioTest();
//		listarEmpresaUsuarioAplicacionEmpresaxEstadoTest();
//
//	}
//	
//	public void crearEmpresaUsuarioAplicacionEmpresaTest(){
//		objLog.info("crearEmpresaUsuarioAplicacionEmpresaTest");
//		EmpresaUsuarioAplicacionEmpresaEntity empresaUsuarioAplicacionEmpresa=new EmpresaUsuarioAplicacionEmpresaEntity();
//		
//		EmpresaUsuarioEntity empresaUsuario= new EmpresaUsuarioEntity();
//		empresaUsuario.setIdEmpresaUsuario(1);
//		empresaUsuarioAplicacionEmpresa.setFkIdEmpresaUsuario(empresaUsuario);
//		
//		AplicacionEmpresaEntity aplicacionEmpresa= new AplicacionEmpresaEntity();
//		aplicacionEmpresa.setIdAplicacionEmpresa(1);
//		empresaUsuarioAplicacionEmpresa.setFkIdAplicacionEmpresa(aplicacionEmpresa);
//		
//		empresaUsuarioAplicacionEmpresa.setEstadoEmpresaUsuarioAplicacionEmpresa(1);
//		
//		factoryPersistenciaDAO.getEmpresaUsuarioAplicacionEmpresaDAO().crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa);
//	}
//	
//	public void actualizarEmpresaUsuarioAplicacionEmpresaTest(){
//		objLog.info("actualizarEmpresaUsuarioTest");
//		EmpresaUsuarioAplicacionEmpresaEntity empresaUsuarioAplicacionEmpresa=new EmpresaUsuarioAplicacionEmpresaEntity();
//		
//		empresaUsuarioAplicacionEmpresa.setIdEmpresaUsuarioAplicacionEmpresa(1);
//		
//		EmpresaUsuarioEntity empresaUsuario= new EmpresaUsuarioEntity();
//		empresaUsuario.setIdEmpresaUsuario(2);
//		empresaUsuarioAplicacionEmpresa.setFkIdEmpresaUsuario(empresaUsuario);
//		
//		AplicacionEmpresaEntity aplicacionEmpresa= new AplicacionEmpresaEntity();
//		aplicacionEmpresa.setIdAplicacionEmpresa(2);
//		empresaUsuarioAplicacionEmpresa.setFkIdAplicacionEmpresa(aplicacionEmpresa);
//		
//		empresaUsuarioAplicacionEmpresa.setEstadoEmpresaUsuarioAplicacionEmpresa(2);
//		
//		factoryPersistenciaDAO.getEmpresaUsuarioAplicacionEmpresaDAO().actualizarEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa);
//	}
//	
//	public void buscarEmpresaUsuarioAplicacionEmpresaxIdTest(){
//		objLog.info("buscarEmpresaUsuarioAplicacionEmpresaxIdTest");
//		
//		EmpresaUsuarioAplicacionEmpresaEntity empresaUsuarioAplicacionEmpresa=new EmpresaUsuarioAplicacionEmpresaEntity();
//		empresaUsuarioAplicacionEmpresa.setIdEmpresaUsuarioAplicacionEmpresa(1);
//		
//		try {
//			empresaUsuarioAplicacionEmpresa=factoryPersistenciaDAO.getEmpresaUsuarioAplicacionEmpresaDAO().buscarEmpresaUsuarioAplicacionEmpresaxIdEntity(empresaUsuarioAplicacionEmpresa);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(empresaUsuarioAplicacionEmpresa!=null){
//			objLog.info(empresaUsuarioAplicacionEmpresa.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empresaUsuarioAplicacionEmpresa.getFkIdEmpresaUsuario().getIdEmpresaUsuario() +" - "+empresaUsuarioAplicacionEmpresa.getFkIdAplicacionEmpresa().getIdAplicacionEmpresa());
//		}
//	}
//	
//	public void listarEmpresaUsuarioAplicacionEmpresasTest(){
//		objLog.info("listarEmpresaUsuarioAplicacionEmpresasTest");
//		List<EmpresaUsuarioAplicacionEmpresaEntity> listaEmpresaUsuarioAplicacionEmpresa=new ArrayList<EmpresaUsuarioAplicacionEmpresaEntity>();
//
//		listaEmpresaUsuarioAplicacionEmpresa=factoryPersistenciaDAO.getEmpresaUsuarioAplicacionEmpresaDAO().listarEmpresaUsuarioAplicacionEmpresasEntity();
//	
//		for(EmpresaUsuarioAplicacionEmpresaEntity empUsuApliEmp:listaEmpresaUsuarioAplicacionEmpresa){
//			objLog.info(empUsuApliEmp.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empUsuApliEmp.getFkIdEmpresaUsuario().getIdEmpresaUsuario() +" - "+empUsuApliEmp.getFkIdAplicacionEmpresa().getIdAplicacionEmpresa());
//		}
//	}
//	
//	
//	
//	public void listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioTest(){
//		objLog.info("listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioTest");
//		
//		EmpresaUsuarioAplicacionEmpresaEntity empresaUsuarioAplicacionEmpresa=new EmpresaUsuarioAplicacionEmpresaEntity();
//		List<EmpresaUsuarioAplicacionEmpresaEntity> listaEmpresaUsuarioAplicacionEmpresas =new ArrayList<EmpresaUsuarioAplicacionEmpresaEntity>();
//		
//		EmpresaUsuarioEntity empresaUsuario= new EmpresaUsuarioEntity();
//		empresaUsuario.setIdEmpresaUsuario(1);
//		empresaUsuarioAplicacionEmpresa.setFkIdEmpresaUsuario(empresaUsuario);
//		
//		listaEmpresaUsuarioAplicacionEmpresas=factoryPersistenciaDAO.getEmpresaUsuarioAplicacionEmpresaDAO().listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioEntity(empresaUsuarioAplicacionEmpresa);
//		
//		for(EmpresaUsuarioAplicacionEmpresaEntity empUsuApliEmp:listaEmpresaUsuarioAplicacionEmpresas){
//			objLog.info(empUsuApliEmp.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empUsuApliEmp.getFkIdEmpresaUsuario().getIdEmpresaUsuario() +" - "+empUsuApliEmp.getFkIdAplicacionEmpresa().getIdAplicacionEmpresa());
//		}
//	}
//
//	public void listarEmpresaUsuarioAplicacionEmpresaxAplicacionEmpresaTest(){
//		objLog.info("listarEmpresaUsuarioAplicacionEmpresaxAplicacionEmpresaTest");
//		
//		EmpresaUsuarioAplicacionEmpresaEntity empresaUsuarioAplicacionEmpresa=new EmpresaUsuarioAplicacionEmpresaEntity();
//		List<EmpresaUsuarioAplicacionEmpresaEntity> listaEmpresaUsuarioAplicacionEmpresas =new ArrayList<EmpresaUsuarioAplicacionEmpresaEntity>();
//		
//		AplicacionEmpresaEntity aplicacionEmpresa= new AplicacionEmpresaEntity();
//		aplicacionEmpresa.setIdAplicacionEmpresa(1);
//		empresaUsuarioAplicacionEmpresa.setFkIdAplicacionEmpresa(aplicacionEmpresa);
//		
//		listaEmpresaUsuarioAplicacionEmpresas=factoryPersistenciaDAO.getEmpresaUsuarioAplicacionEmpresaDAO().listarEmpresaUsuarioAplicacionEmpresaxAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa);
//		
//		for(EmpresaUsuarioAplicacionEmpresaEntity empUsuApliEmp:listaEmpresaUsuarioAplicacionEmpresas){
//			objLog.info(empUsuApliEmp.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empUsuApliEmp.getFkIdEmpresaUsuario().getIdEmpresaUsuario() +" - "+empUsuApliEmp.getFkIdAplicacionEmpresa().getIdAplicacionEmpresa());
//		}
//	}
//	
//	public void listarEmpresaUsuarioAplicacionEmpresaxEstadoTest(){
//		objLog.info("listarEmpresaUsuarioAplicacionEmpresaxEstadoTest");
//		
//		EmpresaUsuarioAplicacionEmpresaEntity empresaUsuarioAplicacionEmpresa=new EmpresaUsuarioAplicacionEmpresaEntity();
//		List<EmpresaUsuarioAplicacionEmpresaEntity> listaEmpresaUsuarioAplicacionEmpresas =new ArrayList<EmpresaUsuarioAplicacionEmpresaEntity>();
//		
//		empresaUsuarioAplicacionEmpresa.setEstadoEmpresaUsuarioAplicacionEmpresa(1);
//		
//		listaEmpresaUsuarioAplicacionEmpresas=factoryPersistenciaDAO.getEmpresaUsuarioAplicacionEmpresaDAO().listarEmpresaUsuarioAplicacionEmpresaxEstadoEntity(empresaUsuarioAplicacionEmpresa);
//		
//		for(EmpresaUsuarioAplicacionEmpresaEntity empUsuApliEmp:listaEmpresaUsuarioAplicacionEmpresas){
//			objLog.info(empUsuApliEmp.getIdEmpresaUsuarioAplicacionEmpresa()+" - "+empUsuApliEmp.getFkIdEmpresaUsuario().getIdEmpresaUsuario() +" - "+empUsuApliEmp.getFkIdAplicacionEmpresa().getIdAplicacionEmpresa());
//		}
//	}
//	
//}