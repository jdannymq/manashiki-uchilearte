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
//import com.manashiki.sso.logica.entidad.FinalidadCertificadoEntity;
//import com.manashiki.sso.logica.entidad.ProgramaUniversidadEntity;
//import com.manashiki.sso.logica.entidad.SolicitudCertificadoEntity;
//import com.manashiki.sso.logica.entidad.TipoCertificadoEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class RelacionalCSolicitudCertificado {
//	
//	
//	private static final Logger objLog = LoggerFactory.getLogger(RelacionalCSolicitudCertificado.class);
//	
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia SolicitudCertificadoDAO
//	 * @testMethod
//	 * SolicitudCertificadoDAOImpl.crearSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity);
//	 * SolicitudCertificadoDAOImpl.actualizarSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity);
//	 * SolicitudCertificadoDAOImpl.buscarSolicitudCertificadoxIdEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity) throws PersistenceImplException;
//	 * SolicitudCertificadoDAOImpl.buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity) throws PersistenceImplException;
//	 * SolicitudCertificadoDAOImpl.buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity) throws PersistenceImplException;
//	 * SolicitudCertificadoDAOImpl.listarSolicitudCertificadosEntity();
//	 * SolicitudCertificadoDAOImpl.listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity);
//	 * SolicitudCertificadoDAOImpl.listarSolicitudCertificadoxEstadoEntity(SolicitudCertificadoEntity objSolicitudCertificadoEntity);
//	 */
//	
//	@Test
//	public void testMetodoSolicitudCertificadoDAO() {
//		crearSolicitudCertificadoTest();
//		actualizarSolicitudCertificadoTest();
//		buscarSolicitudCertificadoxIdTest();
//		listarSolicitudCertificadosTest();
//		listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoTest();
//		listarSolicitudCertificadoxEstadoTest();
//
//	}
//	
//	public void crearSolicitudCertificadoTest(){
//		objLog.info("crearSolicitudCertificadoTest");
//		SolicitudCertificadoEntity solicitudCertificado=new SolicitudCertificadoEntity();
//		solicitudCertificado.setNombrePersonaSolicitudCertificado("nombre SolCert"); //Nombre a Mostrar
//		solicitudCertificado.setApellidoPaternoPersonaSolicitudCertificado("apellido pat SolCert");
//		/**************************/
//		solicitudCertificado.setApellidoMaternoPersonaSolicitudCertificado("apellido mat SolCert");
//		solicitudCertificado.setRutPersonaSolicitudCertificado("");
//		
//		ProgramaUniversidadEntity programaUniversidadEntity = new ProgramaUniversidadEntity();
//		programaUniversidadEntity.setIdProgramaUniversidad(1);
//		solicitudCertificado.setFkIdProgramaUniversidad(programaUniversidadEntity); 
//		
//		solicitudCertificado.setMailMember("b@b.cl"); //mail usuario
//		solicitudCertificado.setAnhoIngreso("2015"); //mail usuario
//		
//		
//		TipoCertificadoEntity tipoCertificado = new TipoCertificadoEntity();
//		tipoCertificado.setIdTipoCertificado(1);
//		solicitudCertificado.setFkIdTipoCertificado(tipoCertificado); 
//		
//		FinalidadCertificadoEntity finalidadCertificado = new FinalidadCertificadoEntity();
//		finalidadCertificado.setIdFinalidadCertificado(1);
//		solicitudCertificado.setFkIdFinalidadCertificado(finalidadCertificado);
//		
//		solicitudCertificado.setFechaSolicitud(new Timestamp(0)); //momento que que ejecutada la solicitud
//		solicitudCertificado.setEstadoSolicitud(1);
//		
//		factoryPersistenciaDAO.getSolicitudCertificadoDAO().crearSolicitudCertificadoEntity(solicitudCertificado);
//	}
//	
//	public void actualizarSolicitudCertificadoTest(){
//		objLog.info("actualizarEmpresaUsuarioTest");
//		SolicitudCertificadoEntity solicitudCertificado=new SolicitudCertificadoEntity();
//		
//		solicitudCertificado.setIdSolicitudCertificado(1);
//		
//		solicitudCertificado.setNombrePersonaSolicitudCertificado("nombre SolCert aa"); //Nombre a Mostrar
//		solicitudCertificado.setApellidoPaternoPersonaSolicitudCertificado("apellido pat SolCert aa");
//		/**************************/
//		solicitudCertificado.setApellidoMaternoPersonaSolicitudCertificado("apellido mat SolCert aa");
//		solicitudCertificado.setRutPersonaSolicitudCertificado("2-7");
//		
//		ProgramaUniversidadEntity programaUniversidadEntity = new ProgramaUniversidadEntity();
//		programaUniversidadEntity.setIdProgramaUniversidad(2);
//		solicitudCertificado.setFkIdProgramaUniversidad(programaUniversidadEntity); 
//		
//		solicitudCertificado.setMailMember("b@b.cl"); //mail usuario
//		solicitudCertificado.setAnhoIngreso("2014"); //mail usuario
//		
//		
//		TipoCertificadoEntity tipoCertificado = new TipoCertificadoEntity();
//		tipoCertificado.setIdTipoCertificado(1);
//		solicitudCertificado.setFkIdTipoCertificado(tipoCertificado); 
//		
//		FinalidadCertificadoEntity finalidadCertificado = new FinalidadCertificadoEntity();
//		finalidadCertificado.setIdFinalidadCertificado(2);
//		solicitudCertificado.setFkIdFinalidadCertificado(finalidadCertificado);
//		
//		solicitudCertificado.setFechaSolicitud(new Timestamp(0)); //momento que que ejecutada la solicitud
//		solicitudCertificado.setEstadoSolicitud(2);
//		
//		factoryPersistenciaDAO.getSolicitudCertificadoDAO().actualizarSolicitudCertificadoEntity(solicitudCertificado);
//	}
//	
//	public void buscarSolicitudCertificadoxIdTest(){
//		objLog.info("buscarSolicitudCertificadoxIdTest");
//		
//		SolicitudCertificadoEntity solicitudCertificado=new SolicitudCertificadoEntity();
//		solicitudCertificado.setIdSolicitudCertificado(1);
//		
//		try {
//			solicitudCertificado=factoryPersistenciaDAO.getSolicitudCertificadoDAO().buscarSolicitudCertificadoxIdEntity(solicitudCertificado);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(solicitudCertificado!=null){
//			objLog.info(solicitudCertificado.getIdSolicitudCertificado()+"");
//		}
//	}
//	
//	public void buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoTest(){
//		objLog.info("buscarSolicitudCertificadoxIdTest");
//		
//		SolicitudCertificadoEntity solicitudCertificado=new SolicitudCertificadoEntity();
//		solicitudCertificado.setRutPersonaSolicitudCertificado("1-9");
//		
//		try {
//			solicitudCertificado=factoryPersistenciaDAO.getSolicitudCertificadoDAO().buscarSolicitudCertificadoxRutPersonaSolicitudCertificadoEntity(solicitudCertificado);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(solicitudCertificado!=null){
//			objLog.info(solicitudCertificado.getIdSolicitudCertificado()+"");
//		}
//	}
//	
//	public void buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoTest(){
//		objLog.info("buscarSolicitudCertificadoxIdTest");
//		
//		SolicitudCertificadoEntity solicitudCertificado=new SolicitudCertificadoEntity();
//		solicitudCertificado.setNombrePersonaSolicitudCertificado("");
//		
//		try {
//			solicitudCertificado=factoryPersistenciaDAO.getSolicitudCertificadoDAO().buscarSolicitudCertificadoxNombrePersonaSolicitudCertificadoEntity(solicitudCertificado);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(solicitudCertificado!=null){
//			objLog.info(solicitudCertificado.getIdSolicitudCertificado()+"");
//		}
//	}
//	
//	public void listarSolicitudCertificadosTest(){
//		objLog.info("listarSolicitudCertificadosTest");
//		List<SolicitudCertificadoEntity> listaSolicitudCertificado=new ArrayList<SolicitudCertificadoEntity>();
//
//		listaSolicitudCertificado=factoryPersistenciaDAO.getSolicitudCertificadoDAO().listarSolicitudCertificadosEntity();
//	
//		for(SolicitudCertificadoEntity empUsuApliEmp:listaSolicitudCertificado){
//			objLog.info(empUsuApliEmp.getIdSolicitudCertificado()+" - ");
//		}
//	}
//	
//	
//	
//	public void listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoTest(){
//		objLog.info("listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoTest");
//		
//		SolicitudCertificadoEntity solicitudCertificado=new SolicitudCertificadoEntity();
//		List<SolicitudCertificadoEntity> listaSolicitudCertificados =new ArrayList<SolicitudCertificadoEntity>();
//		
//		solicitudCertificado.setApellidoPaternoPersonaSolicitudCertificado("a");
//		
//		listaSolicitudCertificados=factoryPersistenciaDAO.getSolicitudCertificadoDAO().listarSolicitudCertificadoxApellidoPaternoPersonaSolicitudCertificadoEntity(solicitudCertificado);
//		
//		for(SolicitudCertificadoEntity empUsuApliEmp:listaSolicitudCertificados){
//			objLog.info(empUsuApliEmp.getIdSolicitudCertificado()+" - ");
//		}
//	}
//
//	public void listarSolicitudCertificadoxEstadoTest(){
//		objLog.info("listarSolicitudCertificadoxAplicacionEmpresaTest");
//		
//		SolicitudCertificadoEntity solicitudCertificado=new SolicitudCertificadoEntity();
//		List<SolicitudCertificadoEntity> listaSolicitudCertificados =new ArrayList<SolicitudCertificadoEntity>();
//		solicitudCertificado.setEstadoSolicitud(1);
//		
//		listaSolicitudCertificados=factoryPersistenciaDAO.getSolicitudCertificadoDAO().listarSolicitudCertificadoxEstadoEntity(solicitudCertificado);
//		
//		for(SolicitudCertificadoEntity empUsuApliEmp:listaSolicitudCertificados){
//			objLog.info(empUsuApliEmp.getIdSolicitudCertificado()+" - ");
//		}
//	}
//	
//}