//package com.manashiki.sso.negocio.test.unitarias;
//
//import java.util.ArrayList;
//import java.util.Date;
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
//import com.manashiki.sso.negocio.model.UsuarioModel;
//
//	@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration(locations="classpath:negocio-context.xml")
//	public class HUsuarioNegocioTest {
//		
//		@Autowired
//		FactoryNegocioDAO factoryNegocioDAO;
//		
//		private static final Log objLog = LogFactory.getLog(HUsuarioNegocioTest.class);
//		
//	
//	/**Pruebas Unitaria hacia UsuarioNegocioDAO
//	 * @testMethod
//	 * UsuarioNegocio.crearUsuarioModel(UsuarioModel objUsuarioModel);
//	* UsuarioNegocio.actualizarUsuarioModel(UsuarioModel objUsuarioModel);
//	* UsuarioNegocio.buscarUsuarioxIdModel(UsuarioModel objUsuarioModel) throws NegocioImplException;
//	* UsuarioNegocio.buscarUsuarioxUsernameUsuarioPerfilLower(UsuarioModel objUsuarioModel) throws NegocioImplException;
//	* UsuarioNegocio.listarUsuariosModel();
//	* UsuarioNegocio.listarUsuarioxEstadoModel(UsuarioModel objUsuarioModel);
//	 */
//		@Test
//		public void testMetodosUsuarioNegocioTest(){
//			crearUsuarioNegocioTest();
//			actualizarUsuarioNegocioTest();
//			buscarUsuarioxIdNegocioTest();
//			buscarUsuarioxUsernameUsuarioPerfilLowerNegocioTest();
//			listarUsuariosNegocioTest();
//			listarUsuarioxEstadoNegocioTest();
//		}
//		
//	public void crearUsuarioNegocioTest(){
//		objLog.info("crearUsuarioNegocioTest");
//		UsuarioModel usuarioModel=new UsuarioModel();
//		
//		usuarioModel.setUsernameUsuarioPerfil("aaa"); //Nombre a Mostrar
//		usuarioModel.setUsernameUsuarioPerfilLower("aaa"); //nombre a comprobar
//		usuarioModel.setPasswordContrasenha("aaa");
//		usuarioModel.setPasswordContrasenhaFormat("aaa");
//		usuarioModel.setPasswordPregunta("aaa");
//		usuarioModel.setPasswordRespuesta("aaa");
//		usuarioModel.setPasswordUltimaActualizacion(new Date());	
//		usuarioModel.setRutMember("1-9"); //Rut de la Persona
//		usuarioModel.setNombreMember("aaa");//Nombre de la Persona
//		usuarioModel.setApellidoMember("aaa"); //Apellido de la Persona
//		usuarioModel.setMailMember("a@a.cl"); //mail usuario
//		usuarioModel.setTelefonoContactoMember("11111"); //telefono de la persona
//		usuarioModel.setNombrePerfil("aaa"); // al ver en la url (nombre de la persona)
//		usuarioModel.setUltimaConexionPerfil(new Date());  //ultima vez que realizo un login exitoso
//		usuarioModel.setUltimaAccionUsuario(new Date()); //ultima vez que realizo un login exitoso
//		usuarioModel.setEstadoUsuario(1);
//		
//		factoryNegocioDAO.getUsuarioNegocioDAO().crearUsuarioModel(usuarioModel);
//	}
//	
//	public void actualizarUsuarioNegocioTest(){
//		objLog.info("actualizarUsuarioNegocioTest");
//		UsuarioModel usuarioModel=new UsuarioModel();
//		
//		usuarioModel.setIdUsuario(1);
//		usuarioModel.setUsernameUsuarioPerfil("bbb"); //Nombre a Mostrar
//		usuarioModel.setUsernameUsuarioPerfilLower("bbb"); //nombre a comprobar
//		usuarioModel.setPasswordContrasenha("bbb");
//		usuarioModel.setPasswordContrasenhaFormat("bbb");
//		usuarioModel.setPasswordPregunta("bbb");
//		usuarioModel.setPasswordRespuesta("bbb");
//		usuarioModel.setPasswordUltimaActualizacion(new Date());	
//		usuarioModel.setRutMember("2-7"); //Rut de la Persona
//		usuarioModel.setNombreMember("bbb");//Nombre de la Persona
//		usuarioModel.setApellidoMember("bbb"); //Apellido de la Persona
//		usuarioModel.setMailMember("b@b.cl"); //mail usuario
//		usuarioModel.setTelefonoContactoMember("222222"); //telefono de la persona
//		usuarioModel.setNombrePerfil("bbb"); // al ver en la url (nombre de la persona)
//		usuarioModel.setUltimaConexionPerfil(new Date());  //ultima vez que realizo un login exitoso
//		usuarioModel.setUltimaAccionUsuario(new Date()); //ultima vez que realizo un login exitoso
//		usuarioModel.setEstadoUsuario(2);
//		
//		factoryNegocioDAO.getUsuarioNegocioDAO().actualizarUsuarioModel(usuarioModel);
//	}
//	
//	public void buscarUsuarioxIdNegocioTest(){
//		objLog.info("buscarUsuarioxIdNegocioTest");
//		
//		UsuarioModel usuarioModel=new UsuarioModel();
//		usuarioModel.setIdUsuario(1);
//		
//		
//		try {
//			usuarioModel=factoryNegocioDAO.getUsuarioNegocioDAO().buscarUsuarioxIdModel(usuarioModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(usuarioModel!=null){
//			objLog.info(usuarioModel.getIdUsuario()+" - "+usuarioModel.getUsernameUsuarioPerfil());
//		}
//	}
//	
//	public void buscarUsuarioxUsernameUsuarioPerfilLowerNegocioTest(){
//		objLog.info("buscarUsuarioxIdNegocioTest");
//		
//		UsuarioModel usuarioModel=new UsuarioModel();
//		usuarioModel.setUsernameUsuarioPerfil("aaa");
//		usuarioModel.setUsernameUsuarioPerfilLower(usuarioModel.getUsernameUsuarioPerfilLower());
//		
//		
//		try {
//			usuarioModel=factoryNegocioDAO.getUsuarioNegocioDAO().buscarUsuarioxUsernameUsuarioPerfilLower(usuarioModel);
//		} catch (NegocioImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Negocio:: ");
//		}
//		
//		if(usuarioModel!=null){
//			objLog.info(usuarioModel.getIdUsuario()+" - "+usuarioModel.getUsernameUsuarioPerfil());
//		}
//	}
//	
//	public void listarUsuariosNegocioTest(){
//		objLog.info("listarUsuariosNegocioTest");
//		List<UsuarioModel> listaUsuariosModel=new ArrayList<UsuarioModel>();
//		
//		listaUsuariosModel=factoryNegocioDAO.getUsuarioNegocioDAO().listarUsuariosModel();
//	
//		for(UsuarioModel usuMod:listaUsuariosModel){
//			objLog.info(usuMod.getIdUsuario()+" - "+usuMod.getUsernameUsuarioPerfil());
//		}
//	}
//	
//	public void listarUsuarioxEstadoNegocioTest(){
//		objLog.info("listarUsuariosNegocioTest");
//		List<UsuarioModel> listaUsuariosModel=new ArrayList<UsuarioModel>();
//		UsuarioModel usuarioModel = new UsuarioModel();
//		usuarioModel.setEstadoUsuario(1);
//		
//		listaUsuariosModel=factoryNegocioDAO.getUsuarioNegocioDAO().listarUsuarioxEstadoModel(usuarioModel);
//	
//		for(UsuarioModel usuMod:listaUsuariosModel){
//			objLog.info(usuMod.getIdUsuario()+" - "+usuMod.getUsernameUsuarioPerfil());
//		}
//	}
//}