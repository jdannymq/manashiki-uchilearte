//package com.manashiki.sso.persistencia.test.unitarias;
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
//import com.manashiki.sso.logica.entidad.ComunaEntity;
//import com.manashiki.sso.logica.entidad.EmpresaEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class BaseBEmpresaTest {
//	
//	private static final Logger objLog = LoggerFactory.getLogger(BaseBEmpresaTest.class);
//	
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia EmpresaDAO
//	 * @testMethod
//	 * EmpresaDAOImpl.crearEmpresaEntity(EmpresaEntity objEmpresaEntity);
//	 * EmpresaDAOImpl.actualizarEmpresaEntity(EmpresaEntity objEmpresaEntity);
//	 * EmpresaDAOImpl.buscarEmpresaxIdEntity(EmpresaEntity objEmpresaEntity) throws PersistenceImplException;
//	 * EmpresaDAOImpl.buscarEmpresaxRolUnicoEmpresaEntity(EmpresaEntity objEmpresaEntity) throws PersistenceImplException;
//	 * EmpresaDAOImpl.buscarEmpresaxNombreEmpresaLower(EmpresaEntity objEmpresaEntity) throws PersistenceImplException;
//	 * EmpresaDAOImpl.buscarEmpresaxRazonSocialEmpresaLower(EmpresaEntity objEmpresaEntity) throws PersistenceImplException;
//	 * EmpresaDAOImpl.listarEmpresasEntity();
//	 * EmpresaDAOImpl.listarEmpresaxEstadoEntity(EmpresaEntity objEmpresaEntity);
//	 */
//	
//	@Test
//	public void testMetodoEmpresaDAO() {
//		crearEmpresaTest();
//		actualizarEmpresaTest();
//		buscarEmpresaxIdTest();
//		buscarEmpresaxRutTest();
//		buscarEmpresaxNombreLowerTest();
//		buscarEmpresaxRazonSocialLowerTest();
//		listarEmpresaxEstadoTest();
//	}
//	
//	public void crearEmpresaTest(){
//		objLog.info("crearEmpresaTest");
//		EmpresaEntity empresa=new EmpresaEntity();
//		
//		empresa.setRolUnicoIdentificadorEmpresa("Empresa Rol Prueba");
//		empresa.setNombreEmpresa("Empresa Nombre Prueba"); //nombre fantasia
//		empresa.setNombreEmpresaLower(empresa.getNombreEmpresa().toLowerCase());
//		empresa.setRazonSocialEmpresa("Empresa RazonSocial Prueba"); //nombre legal empresa
//		empresa.setRazonSocialEmpresaLower(empresa.getRazonSocialEmpresa().toLowerCase());
//		empresa.setGiroEmpresa("Empresa Giro Prueba"); // accion que hace empresa
//		empresa.setDireccionOrigen("Empresa Direccion Prueba");  // ubicacion legal empresa
//		empresa.setPaisEmpresa("Empresa Pais Prueba");
//		
//		ComunaEntity comuna = new ComunaEntity();
//		comuna.setIdComuna(1);
//		empresa.setFkIdComuna(comuna);
//		
//		empresa.setCiudadOrigen("Empresa Ciudad Prueba");
//		empresa.setEstadoEmpresa(1); 
//		
//		factoryPersistenciaDAO.getEmpresaDAO().crearEmpresaEntity(empresa);
//	}
//	
//	public void actualizarEmpresaTest(){
//		objLog.info("actualizarEmpresaTest");
//		EmpresaEntity empresa=new EmpresaEntity();
//		
//		empresa.setIdEmpresa(1);
//		empresa.setRolUnicoIdentificadorEmpresa("Actualizar Rol Prueba");
//		empresa.setNombreEmpresa("Actualizar Nombre Prueba"); //nombre fantasia
//		empresa.setNombreEmpresaLower(empresa.getNombreEmpresa().toLowerCase());
//		empresa.setRazonSocialEmpresa("Actualizar RazonSocial Prueba"); //nombre legal empresa
//		empresa.setRazonSocialEmpresaLower(empresa.getRazonSocialEmpresa().toLowerCase());
//		empresa.setGiroEmpresa("Actualizar Giro Prueba"); // accion que hace empresa
//		empresa.setDireccionOrigen("Actualizar Direccion Prueba");  // ubicacion legal empresa
//		empresa.setPaisEmpresa("Actualizar Pais Prueba");
//		
//		ComunaEntity comuna = new ComunaEntity();
//		comuna.setIdComuna(1);
//		empresa.setFkIdComuna(comuna);
//		
//		empresa.setCiudadOrigen("Actualizar Ciudad Prueba");
//		empresa.setEstadoEmpresa(2); 
//		
//		factoryPersistenciaDAO.getEmpresaDAO().actualizarEmpresaEntity(empresa);
//	}
//	
//	public void buscarEmpresaxIdTest(){
//		objLog.info("buscarEmpresaxIdTest");
//		
//		EmpresaEntity empresa=new EmpresaEntity();
//		empresa.setIdEmpresa(1);
//		
//		try {
//			empresa=factoryPersistenciaDAO.getEmpresaDAO().buscarEmpresaxIdEntity(empresa);
//		
//		} catch (PersistenceImplException e) {
//			e.printStackTrace();
//		}
//	
//		objLog.info(empresa.getIdEmpresa()+" - "+empresa.getNombreEmpresa());
//
//	}
//
//	
//	public void buscarEmpresaxRutTest(){
//		objLog.info("buscarEmpresaxRutTest");
//		
//		EmpresaEntity empresa=new EmpresaEntity();
//		EmpresaEntity empEnt=new EmpresaEntity();
//		empresa.setRolUnicoIdentificadorEmpresa("1-9");
//		
//		try {
//			empEnt=factoryPersistenciaDAO.getEmpresaDAO().buscarEmpresaxRolUnicoEmpresaEntity(empresa);
//		} catch (PersistenceImplException e) {
//			empEnt=null;
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(empEnt !=null){
//			objLog.info(empEnt.getIdEmpresa()+" - "+empEnt.getNombreEmpresa());
//		}
//	}
//	
//	public void buscarEmpresaxNombreLowerTest(){
//		objLog.info("buscarEmpresaxRutTest");
//		
//		EmpresaEntity empresa=new EmpresaEntity();
//		EmpresaEntity empEnt=new EmpresaEntity();
//		empresa.setNombreEmpresa("AAA");
//		empresa.setNombreEmpresaLower(empresa.getNombreEmpresa().toLowerCase());
//		
//		try {
//			empEnt=factoryPersistenciaDAO.getEmpresaDAO().buscarEmpresaxNombreEmpresaLower(empresa);
//		} catch (PersistenceImplException e) {
//			empEnt=null;
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(empEnt !=null){
//			objLog.info(empEnt.getIdEmpresa()+" - "+empEnt.getNombreEmpresa());
//		}
//	}
//	
//	public void buscarEmpresaxRazonSocialLowerTest(){
//		objLog.info("buscarEmpresaxRutTest");
//		
//		EmpresaEntity empresa=new EmpresaEntity();
//		EmpresaEntity empEnt=new EmpresaEntity();
//		empresa.setRazonSocialEmpresa("AAA");
//		empresa.setRazonSocialEmpresaLower(empresa.getRazonSocialEmpresa().toLowerCase());
//		
//		try {
//			empEnt=factoryPersistenciaDAO.getEmpresaDAO().buscarEmpresaxNombreEmpresaLower(empresa);
//		} catch (PersistenceImplException e) {
//			empEnt=null;
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(empEnt !=null){
//			objLog.info(empEnt.getIdEmpresa()+" - "+empEnt.getNombreEmpresa());
//		}
//	}
//	
//	public void listarEmpresasTest(){
//		objLog.info("listaEmpresasTest");
//		List<EmpresaEntity> listaEmpresas=new ArrayList<EmpresaEntity>();
//		
//		listaEmpresas=factoryPersistenciaDAO.getEmpresaDAO().listarEmpresasEntity();
//	
//		for(EmpresaEntity empresaEnt:listaEmpresas){
//			objLog.info(empresaEnt.getIdEmpresa()+" - "+empresaEnt.getNombreEmpresa() +" - "+empresaEnt.getRolUnicoIdentificadorEmpresa());
//		}
//	}
//	
//	
//	public void listarEmpresaxEstadoTest(){
//		objLog.info("listarEmpresaxEstadoTest");
//		
//		EmpresaEntity empresa=new EmpresaEntity();
//		List<EmpresaEntity> listaEmpresas=new ArrayList<EmpresaEntity>();
//		empresa.setEstadoEmpresa(1);
//		
//		
//		listaEmpresas=factoryPersistenciaDAO.getEmpresaDAO().listarEmpresaxEstadoEntity(empresa);
//
//		for(EmpresaEntity empresaEnt:listaEmpresas){
//			objLog.info(empresaEnt.getIdEmpresa()+" - "+empresaEnt.getNombreEmpresa() +" - "+empresaEnt.getRolUnicoIdentificadorEmpresa());
//		}
//	
//	}
//	
//}
