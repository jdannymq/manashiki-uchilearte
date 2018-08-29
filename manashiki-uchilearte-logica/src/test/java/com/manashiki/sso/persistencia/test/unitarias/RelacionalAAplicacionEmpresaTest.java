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
//import com.manashiki.sso.logica.entidad.AplicacionEmpresaEntity;
//import com.manashiki.sso.logica.entidad.EmpresaEntity;
//import com.manashiki.sso.logica.entidad.EmpresaUsuarioAplicacionEmpresaEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class RelacionalAAplicacionEmpresaTest {
//	
//private static final Logger objLog = LoggerFactory.getLogger(RelacionalAAplicacionEmpresaTest.class);
//	
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia AplicacionEmpresaDAO
//	 * @testMethod
//	 * 	AplicacionEmpresaDAOImpl.crearEmpresaUsuarioAplicacionEmpresaEntity(EmpresaUsuarioAplicacionEmpresaEntity objEmpresaUsuarioAplicacionEmpresaEntity);
//		AplicacionEmpresaDAOImpl.actualizarEmpresaUsuarioAplicacionEmpresaEntity(EmpresaUsuarioAplicacionEmpresaEntity objEmpresaUsuarioAplicacionEmpresaEntity);
//		AplicacionEmpresaDAOImpl.buscarEmpresaUsuarioAplicacionEmpresaxIdEntity(EmpresaUsuarioAplicacionEmpresaEntity objEmpresaUsuarioAplicacionEmpresaEntity) throws PersistenceImplException;
//		AplicacionEmpresaDAOImpl.buscarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioEntityxAplicacionEmpresaEntity(EmpresaUsuarioAplicacionEmpresaEntity objEmpresaUsuarioAplicacionEmpresaEntity) throws PersistenceImplException;
//		AplicacionEmpresaDAOImpl.listarEmpresaUsuarioAplicacionEmpresasEntity();
//		AplicacionEmpresaDAOImpl.listarEmpresaUsuarioAplicacionEmpresaxEstadoEntity(EmpresaUsuarioAplicacionEmpresaEntity objEmpresaUsuarioAplicacionEmpresaEntity);
//		AplicacionEmpresaDAOImpl.listarEmpresaUsuarioAplicacionEmpresaxEmpresaUsuarioEntity(EmpresaUsuarioAplicacionEmpresaEntity objEmpresaUsuarioAplicacionEmpresaEntity);
//		AplicacionEmpresaDAOImpl.listarEmpresaUsuarioAplicacionEmpresaxAplicacionEmpresaEntity(EmpresaUsuarioAplicacionEmpresaEntity objEmpresaUsuarioAplicacionEmpresaEntity);
//	 */
//	
//	@Test
//	public void testMetodoAplicacionEmpresaDAO() {
//		crearAplicacionEmpresaTest();
//		actualizarAplicacionEmpresaTest();
//		buscarAplicacionEmpresaxIdTest();
//		buscarAplicacionEmpresaxIdTest();
//		listarAplicacionEmpresasTest();
//		listarAplicacionEmpresaxAplicacionTest();
//		listarAplicacionEmpresaxEmpresaTest();
//		listarAplicacionEmpresaxEstadoTest();
//
//	}
//	
//	public void crearAplicacionEmpresaTest(){
//		objLog.info("crearAplicacionEmpresaTest");
//		AplicacionEmpresaEntity aplicacionEmpresa=new AplicacionEmpresaEntity();
//		
//		AplicacionEntity aplicacion= new AplicacionEntity();
//		aplicacion.setIdAplicacion(1);
//		aplicacionEmpresa.setFkIdAplicacion(aplicacion);
//		
//		EmpresaEntity empresa = new EmpresaEntity();
//		empresa.setIdEmpresa(1);
//		aplicacionEmpresa.setFkIdEmpresa(empresa);
//		
//		aplicacionEmpresa.setEstadoAplicacionEmpresa(1);
//
//		factoryPersistenciaDAO.getAplicacionEmpresaDAO().crearAplicacionEmpresaEntity(aplicacionEmpresa);
//	}
//	
//	public void actualizarAplicacionEmpresaTest(){
//		objLog.info("actualizarAplicacionEmpresaTest");
//		AplicacionEmpresaEntity aplicacionEmpresa=new AplicacionEmpresaEntity();
//		
//		aplicacionEmpresa.setIdAplicacionEmpresa(1);
//		
//		AplicacionEntity aplicacion= new AplicacionEntity();
//		aplicacion.setIdAplicacion(2);
//		aplicacionEmpresa.setFkIdAplicacion(aplicacion);
//		
//		EmpresaEntity empresa = new EmpresaEntity();
//		empresa.setIdEmpresa(2);
//		aplicacionEmpresa.setFkIdEmpresa(empresa);
//		
//		aplicacionEmpresa.setEstadoAplicacionEmpresa(2);
//		
//		factoryPersistenciaDAO.getAplicacionEmpresaDAO().actualizarAplicacionEmpresaEntity(aplicacionEmpresa);
//	}
//	
//	public void buscarAplicacionEmpresaxIdTest(){
//		objLog.info("buscarAplicacionEmpresaxIdTest");
//		
//		AplicacionEmpresaEntity aplicacionEmpresa=new AplicacionEmpresaEntity();
//		aplicacionEmpresa.setIdAplicacionEmpresa(1);
//		
//		try {
//			aplicacionEmpresa=factoryPersistenciaDAO.getAplicacionEmpresaDAO().buscarAplicacionEmpresaxIdEntity(aplicacionEmpresa);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(aplicacionEmpresa!=null){
//			objLog.info(aplicacionEmpresa.getIdAplicacionEmpresa()+" - "+aplicacionEmpresa.getFkIdAplicacion().getIdAplicacion() +" - "+aplicacionEmpresa.getFkIdEmpresa().getIdEmpresa());
//		}
//	}
//	
//	public void listarAplicacionEmpresasTest(){
//		objLog.info("listaAplicacionEmpresasTest");
//		List<AplicacionEmpresaEntity> listaAplicacionEmpresas=new ArrayList<AplicacionEmpresaEntity>();
//		
//		listaAplicacionEmpresas=factoryPersistenciaDAO.getAplicacionEmpresaDAO().listarAplicacionEmpresasEntity();
//	
//		for(AplicacionEmpresaEntity apliEmp:listaAplicacionEmpresas){
//			objLog.info(apliEmp.getIdAplicacionEmpresa()+" - "+apliEmp.getFkIdAplicacion().getIdAplicacion() +" - "+apliEmp.getFkIdEmpresa().getIdEmpresa());
//		}
//	}
//	
//	public void listarAplicacionEmpresaxAplicacionTest(){
//		objLog.info("listarAplicacionEmpresaxAplicacionTest");
//		
//		AplicacionEmpresaEntity aplicacionEmpresa=new AplicacionEmpresaEntity();
//		List<AplicacionEmpresaEntity> listaAplicacionEmpresas =new ArrayList<AplicacionEmpresaEntity>();
//		
//		AplicacionEntity aplicacion= new AplicacionEntity();
//		aplicacion.setIdAplicacion(1);
//		aplicacionEmpresa.setFkIdAplicacion(aplicacion);
//		
//		listaAplicacionEmpresas=factoryPersistenciaDAO.getAplicacionEmpresaDAO().listarAplicacionEmpresaxAplicacionEntity(aplicacionEmpresa);
//		
//		for(AplicacionEmpresaEntity apliEmp:listaAplicacionEmpresas){
//			objLog.info(apliEmp.getIdAplicacionEmpresa()+" - "+apliEmp.getFkIdAplicacion().getIdAplicacion() +" - "+apliEmp.getFkIdEmpresa().getIdEmpresa());
//		}
//	}
//
//	public void listarAplicacionEmpresaxEmpresaTest(){
//		objLog.info("listarAplicacionEmpresaxEmpresaTest");
//		
//		AplicacionEmpresaEntity aplicacionEmpresa=new AplicacionEmpresaEntity();
//		List<AplicacionEmpresaEntity> listaAplicacionEmpresas =new ArrayList<AplicacionEmpresaEntity>();
//		
//		EmpresaEntity empresa= new EmpresaEntity();
//		empresa.setIdEmpresa(2);
//		aplicacionEmpresa.setFkIdEmpresa(empresa);
//		
//		listaAplicacionEmpresas=factoryPersistenciaDAO.getAplicacionEmpresaDAO().listarAplicacionEmpresaxEmpresaEntity(aplicacionEmpresa);
//		
//		for(AplicacionEmpresaEntity apliEmp:listaAplicacionEmpresas){
//			objLog.info(apliEmp.getIdAplicacionEmpresa()+" - "+apliEmp.getFkIdAplicacion().getIdAplicacion() +" - "+apliEmp.getFkIdEmpresa().getIdEmpresa());
//		}
//	}
//	
//	public void listarAplicacionEmpresaxEstadoTest(){
//		objLog.info("listarAplicacionEmpresaxEstadoTest");
//		
//		AplicacionEmpresaEntity aplicacionEmpresa=new AplicacionEmpresaEntity();
//		List<AplicacionEmpresaEntity> listaAplicacionEmpresas =new ArrayList<AplicacionEmpresaEntity>();
//		
//		aplicacionEmpresa.setEstadoAplicacionEmpresa(1);
//		
//		listaAplicacionEmpresas=factoryPersistenciaDAO.getAplicacionEmpresaDAO().listarAplicacionEmpresaxEstadoEntity(aplicacionEmpresa);
//		
//		for(AplicacionEmpresaEntity apliEmp:listaAplicacionEmpresas){
//			objLog.info(apliEmp.getIdAplicacionEmpresa()+" - "+apliEmp.getFkIdAplicacion().getIdAplicacion() +" - "+apliEmp.getFkIdEmpresa().getIdEmpresa());
//		}
//	}
//	
//}
