//package com.manashiki.sso.persistencia.test.unitarias;
//
//import java.sql.Timestamp;
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
//import com.manashiki.sso.logica.entidad.UsuarioEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseBUsuarioTest {
//	
//	private static final Logger objLog = LoggerFactory.getLogger(BaseBUsuarioTest.class);
//	
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia UsuarioDAO
//	 * @testMethod
//	 * UsuarioDAOImpl.crearUsuarioEntity(UsuarioEntity objUsuarioEntity);
//	 * UsuarioDAOImpl.actualizarUsuarioEntity(UsuarioEntity objUsuarioEntity);
//	 * UsuarioDAOImpl.buscarUsuarioxIdEntity(UsuarioEntity objUsuarioEntity);
//	 * UsuarioDAOImpl.buscarUsuarioxUsernameUsuarioPerfilLower(UsuarioEntity objUsuarioEntity);
//	 * UsuarioDAOImpl.listarUsuariosEntity();
//	 * UsuarioDAOImpl.listarUsuarioxEstadoEntity(UsuarioEntity objUsuarioEntity);
//	 */
//	
//	@Test
//	public void testMetodoUsuarioDAO() {
//		crearUsuarioTest();
//		actualizarUsuarioTest();
//		buscarUsuarioxIdTest();
//		listarUsuariosTest();
//		listarUsuariosxEstadoTest();
//
//	}
//	
//	public void crearUsuarioTest(){
//		objLog.info("crearUsuarioTest");
//		UsuarioEntity usuario=new UsuarioEntity();
//		
//		usuario.setUsernameUsuarioPerfil("usu creaR"); //Nombre a Mostrar
//		usuario.setUsernameUsuarioPerfilLower(usuario.getUsernameUsuarioPerfil().toLowerCase()); //nombre a comprobar
//		usuario.setPasswordContrasenha("usu creaR Pass");
//		usuario.setPasswordContrasenhaFormat("");
//		usuario.setPasswordPregunta("usu creaR");
//		usuario.setPasswordRespuesta("usu creaR");
//		usuario.setPasswordUltimaActualizacion(new Timestamp(0));	
//		usuario.setUltimaAccionUsuario(new Timestamp(0));
//		usuario.setRutMember("1-9");
//		usuario.setNombreMember("usu creaR");//Nombre de la Persona
//		usuario.setApellidoMember("usu creaR"); //Apellido de la Persona
//		usuario.setMailMember("a@a.cl"); //mail usuario
//		usuario.setTelefonoContactoMember("usu creaR");
//		usuario.setNombrePerfil("aaaaa");
//		usuario.setUltimaConexionPerfil(new Timestamp(0));
//		usuario.setEstadoUsuario(1);
//		
//		factoryPersistenciaDAO.getUsuarioDAO().crearUsuarioEntity(usuario);
//	}
//	
//	public void actualizarUsuarioTest(){
//		objLog.info("actualizarUsuarioTest");
//		UsuarioEntity usuario=new UsuarioEntity();
//		
//		usuario.setIdUsuario(1);
//		usuario.setUsernameUsuarioPerfil("usu actR"); //Nombre a Mostrar
//		usuario.setUsernameUsuarioPerfilLower(usuario.getUsernameUsuarioPerfil().toLowerCase()); //nombre a comprobar
//		usuario.setPasswordContrasenha("usu actR Pass");
//		usuario.setPasswordContrasenhaFormat("");
//		usuario.setPasswordPregunta("usu actR");
//		usuario.setPasswordRespuesta("usu actR");
//		usuario.setPasswordUltimaActualizacion(new Timestamp(0));	
//		usuario.setUltimaAccionUsuario(new Timestamp(0));
//		usuario.setRutMember("1-9");
//		usuario.setNombreMember("usu actR");//Nombre de la Persona
//		usuario.setApellidoMember("usu actR"); //Apellido de la Persona
//		usuario.setMailMember("a@a.cl"); //mail usuario
//		usuario.setTelefonoContactoMember("usu actR");
//		usuario.setNombrePerfil("bbbb");
//		usuario.setUltimaConexionPerfil(new Timestamp(0));
//		usuario.setEstadoUsuario(2);
//		
//		factoryPersistenciaDAO.getUsuarioDAO().actualizarUsuarioEntity(usuario);
//	}
//	
//	public void buscarUsuarioxIdTest(){
//		objLog.info("buscarUsuarioxIdTest");
//		
//		UsuarioEntity usuario=new UsuarioEntity();
//		usuario.setIdUsuario(1);
//		
//		try {
//			usuario=factoryPersistenciaDAO.getUsuarioDAO().buscarUsuarioxIdEntity(usuario);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(usuario!=null){
//			objLog.info(usuario.getIdUsuario()+" - "+usuario.getUsernameUsuarioPerfil());
//		}
//	}
//
//	public void listarUsuariosTest(){
//		objLog.info("listaUsuariosTest");
//		List<UsuarioEntity> listaUsuarioes=new ArrayList<UsuarioEntity>();
//		
//		listaUsuarioes=factoryPersistenciaDAO.getUsuarioDAO().listarUsuariosEntity();
//	
//		for(UsuarioEntity usuEnt:listaUsuarioes){
//			objLog.info(usuEnt.getIdUsuario()+" - "+usuEnt.getUsernameUsuarioPerfil());
//		}
//	}
//	
//	public void listarUsuariosxEstadoTest(){
//		objLog.info("listaUsuariosTest");
//		List<UsuarioEntity> listaUsuarioes=new ArrayList<UsuarioEntity>();
//
//		UsuarioEntity usuario = new UsuarioEntity();
//		usuario.setEstadoUsuario(1);
//		
//		
//		listaUsuarioes=factoryPersistenciaDAO.getUsuarioDAO().listarUsuarioxEstadoEntity(usuario);
//	
//		for(UsuarioEntity usuEnt:listaUsuarioes){
//			objLog.info(usuEnt.getIdUsuario()+" - "+usuEnt.getUsernameUsuarioPerfil());
//		}
//	}
//	
//}