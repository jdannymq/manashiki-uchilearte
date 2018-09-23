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
//import com.manashiki.sso.logica.entidad.EmpresaEntity;
//import com.manashiki.sso.logica.entidad.EmpresaUsuarioEntity;
//import com.manashiki.sso.logica.entidad.UsuarioEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class RelacionalAEmpresaUsuarioTest {
//	
//	private static final Logger objLog = LoggerFactory.getLogger(RelacionalAEmpresaUsuarioTest.class);
//	
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia EmpresaUsuarioDAO
//	 * @testMethod
//	 * EmpresaUsuarioDAOImpl.crearEmpresaUsuarioEntity
//	 * EmpresaUsuarioDAOImpl.actualizarEmpresaUsuarioEntity
// 	 * EmpresaUsuarioDAOImpl.buscarEmpresaUsuarioxIdEntity
// 	 * EmpresaUsuarioDAOImpl.listarEmpresaUsuariosEntity
// 	 * EmpresaUsuarioDAOImpl.listarEmpresaUsuarioxEmpresa
// 	 * EmpresaUsuarioDAOImpl.listarEmpresaUsuarioxUsuario
// 	 * EmpresaUsuarioDAOImpl.listarEmpresaUsuarioxEstadoEntity
//	 */
//	
//	@Test
//	public void testMetodoAplicacionEmpresaDAO() {
//		crearEmpresaUsuarioTest();
//		actualizarEmpresaUsuarioTest();
//		buscarEmpresaUsuarioxIdTest();
//		listarEmpresaUsuariosTest();
//		listarEmpresaUsuarioxEmpresaTest();
//		listarEmpresaUsuarioxUsuarioTest();
//		listarEmpresaUsuarioxEstadoTest();
//
//	}
//	
//	
//	public void crearEmpresaUsuarioTest(){
//		objLog.info("crearEmpresaUsuarioTest");
//		EmpresaUsuarioEntity empresaUsuario=new EmpresaUsuarioEntity();
//		
//		EmpresaEntity empresa= new EmpresaEntity();
//		empresa.setIdEmpresa(1);
//		empresaUsuario.setFkIdEmpresa(empresa);
//		
//		UsuarioEntity usuario = new UsuarioEntity();
//		usuario.setIdUsuario(1);
//		empresaUsuario.setFkIdUsuario(usuario);
//		
//		empresaUsuario.setEstadoEmpresaUsuario(1);
//		
//		factoryPersistenciaDAO.getEmpresaUsuarioDAO().crearEmpresaUsuarioEntity(empresaUsuario);
//	}
//	
//	public void actualizarEmpresaUsuarioTest(){
//		objLog.info("actualizarEmpresaUsuarioTest");
//		EmpresaUsuarioEntity empresaUsuario=new EmpresaUsuarioEntity();
//		
//		empresaUsuario.setIdEmpresaUsuario(1);
//		
//		EmpresaEntity empresa= new EmpresaEntity();
//		empresa.setIdEmpresa(2);
//		empresaUsuario.setFkIdEmpresa(empresa);
//		
//		UsuarioEntity usuario = new UsuarioEntity();
//		usuario.setIdUsuario(2);
//		empresaUsuario.setFkIdUsuario(usuario);
//		
//		empresaUsuario.setEstadoEmpresaUsuario(2);
//		
//		factoryPersistenciaDAO.getEmpresaUsuarioDAO().actualizarEmpresaUsuarioEntity(empresaUsuario);
//	}
//	
//	public void listarEmpresaUsuariosTest(){
//		objLog.info("listaEmpresaUsuariosTest");
//		List<EmpresaUsuarioEntity> listaEmpresaUsuarios=new ArrayList<EmpresaUsuarioEntity>();
//		
//		listaEmpresaUsuarios=factoryPersistenciaDAO.getEmpresaUsuarioDAO().listarEmpresaUsuariosEntity();
//	
//		for(EmpresaUsuarioEntity emprUsuario:listaEmpresaUsuarios){
//			objLog.info(emprUsuario.getIdEmpresaUsuario()+" - "+emprUsuario.getFkIdEmpresa().getIdEmpresa() +" - "+emprUsuario.getFkIdUsuario().getIdUsuario());
//		}
//	}
//	
//	public void buscarEmpresaUsuarioxIdTest(){
//		objLog.info("buscarEmpresaUsuarioxIdTest");
//		
//		EmpresaUsuarioEntity empresaUsuario=new EmpresaUsuarioEntity();
//		empresaUsuario.setIdEmpresaUsuario(1);
//		
//		try {
//			empresaUsuario=factoryPersistenciaDAO.getEmpresaUsuarioDAO().buscarEmpresaUsuarioxIdEntity(empresaUsuario);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(empresaUsuario!=null){
//			objLog.info(empresaUsuario.getIdEmpresaUsuario()+" - "+empresaUsuario.getFkIdEmpresa().getIdEmpresa() +" - "+empresaUsuario.getFkIdUsuario().getIdUsuario());
//		}
//	}
//	
//	public void listarEmpresaUsuarioxEmpresaTest(){
//		objLog.info("listarEmpresaUsuarioxEmpresaTest");
//		
//		EmpresaUsuarioEntity empresaUsuario=new EmpresaUsuarioEntity();
//		List<EmpresaUsuarioEntity> listaEmpresaUsuarios =new ArrayList<EmpresaUsuarioEntity>();
//		
//		EmpresaEntity empresa= new EmpresaEntity();
//		empresa.setIdEmpresa(1);
//		empresaUsuario.setFkIdEmpresa(empresa);
//		
//		listaEmpresaUsuarios=factoryPersistenciaDAO.getEmpresaUsuarioDAO().listarEmpresaUsuarioxEmpresaEntity(empresaUsuario);
//		
//		for(EmpresaUsuarioEntity emprUsuario:listaEmpresaUsuarios){
//			objLog.info(emprUsuario.getIdEmpresaUsuario() +" - "+emprUsuario.getFkIdEmpresa().getIdEmpresa() +" - "+emprUsuario.getFkIdUsuario().getIdUsuario());
//		}
//	}
//
//	public void listarEmpresaUsuarioxUsuarioTest(){
//		objLog.info("listarEmpresaUsuarioxUsuarioTest");
//		
//		EmpresaUsuarioEntity empresaUsuario=new EmpresaUsuarioEntity();
//		List<EmpresaUsuarioEntity> listaEmpresaUsuarios =new ArrayList<EmpresaUsuarioEntity>();
//		
//		UsuarioEntity usuario= new UsuarioEntity();
//		usuario.setIdUsuario(2);
//		empresaUsuario.setFkIdUsuario(usuario);
//		
//		listaEmpresaUsuarios=factoryPersistenciaDAO.getEmpresaUsuarioDAO().listarEmpresaUsuarioxUsuarioEntity(empresaUsuario);
//		
//		for(EmpresaUsuarioEntity emprUsuario:listaEmpresaUsuarios){
//			objLog.info(emprUsuario.getIdEmpresaUsuario() +" - "+emprUsuario.getFkIdEmpresa().getIdEmpresa() +" - "+emprUsuario.getFkIdUsuario().getIdUsuario());
//		}
//	}
//	
//	public void listarEmpresaUsuarioxEstadoTest(){
//		objLog.info("listarEmpresaUsuarioxEstadoTest");
//		
//		EmpresaUsuarioEntity empresaUsuario=new EmpresaUsuarioEntity();
//		List<EmpresaUsuarioEntity> listaEmpresaUsuarios =new ArrayList<EmpresaUsuarioEntity>();
//		
//		empresaUsuario.setEstadoEmpresaUsuario(1);
//		
//		listaEmpresaUsuarios=factoryPersistenciaDAO.getEmpresaUsuarioDAO().listarEmpresaUsuarioxEstadoEntity(empresaUsuario);
//		
//		for(EmpresaUsuarioEntity emprUsuario:listaEmpresaUsuarios){
//			objLog.info(emprUsuario.getIdEmpresaUsuario() +" - "+emprUsuario.getFkIdEmpresa().getIdEmpresa() +" - "+emprUsuario.getFkIdUsuario().getIdUsuario());
//		}
//	}
//	
//}