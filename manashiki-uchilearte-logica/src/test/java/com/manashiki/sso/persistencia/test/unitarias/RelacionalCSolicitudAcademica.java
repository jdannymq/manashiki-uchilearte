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
//import com.manashiki.sso.logica.entidad.ProgramaUniversidadEntity;
//import com.manashiki.sso.logica.entidad.SolicitudAcademicaEntity;
//import com.manashiki.sso.logica.entidad.TipoSolicitudEntity;
//import com.manashiki.sso.logica.exception.PersistenceImplException;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations="classpath:META-INF/test-context.xml")
//public class RelacionalCSolicitudAcademica {
//	
//	
//	private static final Logger objLog = LoggerFactory.getLogger(RelacionalCSolicitudAcademica.class);
//	
//	@Autowired
//	FactoryPersistenciaDAO factoryPersistenciaDAO;
//	
//	/**Pruebas Unitaria hacia SolicitudAcademicaDAO
//	 * @testMethod
//	 * SolicitudAcademicaDAOImpl.crearSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity);
// 	 * SolicitudAcademicaDAOImpl.actualizarSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity);
//	 * SolicitudAcademicaDAOImpl.buscarSolicitudAcademicaxIdEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException;
//	 * SolicitudAcademicaDAOImpl.buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException;
//	 * SolicitudAcademicaDAOImpl.buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity) throws PersistenceImplException;
//	
//	 * SolicitudAcademicaDAOImpl.listarSolicitudAcademicasEntity();
//	 * SolicitudAcademicaDAOImpl.listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity);
//	 * SolicitudAcademicaDAOImpl.listarSolicitudAcademicaxEstadoEntity(SolicitudAcademicaEntity objSolicitudAcademicaEntity);
//	 */
//	
//	@Test
//	public void testMetodoAplicacionEmpresaDAO() {
//		crearSolicitudAcademicaTest();
//		actualizarSolicitudAcademicaTest();
//		buscarSolicitudAcademicaxIdTest();
//		buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaTest();
//		buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaTest();
//		
//		listarSolicitudAcademicasTest();
//		listarSolicitudAcademicaxEstadoTest();
//
//	}
//	
//	public void crearSolicitudAcademicaTest(){
//		objLog.info("crearSolicitudAcademicaTest");
//		SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();
//		
//		solicitudAcademica.setNombrePersonaSolicitudAcademica("Nombre Sol"); //Nombre a Mostrar
//		solicitudAcademica.setApellidoPaternoPersonaSolicitudAcademica("ApellidoPAt Sol");
//		solicitudAcademica.setApellidoMaternoPersonaSolicitudAcademica("ApellidoMat Sol");
//		solicitudAcademica.setRutPersonaSolicitudAcademica("Rut Sol");
//		
//		ProgramaUniversidadEntity programaUniversidad = new ProgramaUniversidadEntity();
//		programaUniversidad.setIdProgramaUniversidad(1);
//		solicitudAcademica.setFkIdProgramaUniversidad(programaUniversidad);
//
//		solicitudAcademica.setMailMember("mailsol@sol.cl"); //mail usuario
//		solicitudAcademica.setAnhoIngreso("2010"); //mail usuario
//		
//		TipoSolicitudEntity tipoSolicitud = new TipoSolicitudEntity();
//		tipoSolicitud.setIdTipoSolicitud(1);
//		solicitudAcademica.setFkIdTipoSolicitud(tipoSolicitud);
//
//		solicitudAcademica.setFundamentacionSolicitud("soy pobre"); //mail usuario
//		solicitudAcademica.setFechaSolicitud(new Timestamp(0)); //momento que que ejecutada la solicitud
//		solicitudAcademica.setEstadoSolicitud(1);
//		
//		factoryPersistenciaDAO.getSolicitudAcademicaDAO().crearSolicitudAcademicaEntity(solicitudAcademica);
//	}
//	
//	public void actualizarSolicitudAcademicaTest(){
//		objLog.info("actualizarEmpresaUsuarioTest");
//		SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();
//		
//		solicitudAcademica.setIdSolicitudAcademica(1);
//		
//		solicitudAcademica.setNombrePersonaSolicitudAcademica("Nombre Act Sol"); //Nombre a Mostrar
//		solicitudAcademica.setApellidoPaternoPersonaSolicitudAcademica("ApellidoPAt Act Sol");
//		solicitudAcademica.setApellidoMaternoPersonaSolicitudAcademica("ApellidoMat Act Sol");
//		solicitudAcademica.setRutPersonaSolicitudAcademica("Rut Act Sol");
//		
//		ProgramaUniversidadEntity programaUniversidad = new ProgramaUniversidadEntity();
//		programaUniversidad.setIdProgramaUniversidad(1);
//		solicitudAcademica.setFkIdProgramaUniversidad(programaUniversidad);
//
//		solicitudAcademica.setMailMember("mailsol@act.cl"); //mail usuario
//		solicitudAcademica.setAnhoIngreso("2011"); //mail usuario
//		
//		TipoSolicitudEntity tipoSolicitud = new TipoSolicitudEntity();
//		tipoSolicitud.setIdTipoSolicitud(1);
//		solicitudAcademica.setFkIdTipoSolicitud(tipoSolicitud);
//
//		solicitudAcademica.setFundamentacionSolicitud("soy mugroso"); //mail usuario
//		solicitudAcademica.setFechaSolicitud(new Timestamp(1)); //momento que que ejecutada la solicitud
//		solicitudAcademica.setEstadoSolicitud(1);
//		
//		factoryPersistenciaDAO.getSolicitudAcademicaDAO().actualizarSolicitudAcademicaEntity(solicitudAcademica);
//	}
//	
//	public void buscarSolicitudAcademicaxIdTest(){
//		objLog.info("buscarSolicitudAcademicaxIdTest");
//		
//		SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();
//		solicitudAcademica.setIdSolicitudAcademica(1);
//		
//		try {
//			solicitudAcademica=factoryPersistenciaDAO.getSolicitudAcademicaDAO().buscarSolicitudAcademicaxIdEntity(solicitudAcademica);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(solicitudAcademica!=null){
//			objLog.info(solicitudAcademica.getIdSolicitudAcademica()+"");
//		}
//	}
//	
//	public void buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaTest(){
//		objLog.info("buscarSolicitudAcademicaxIdTest");
//		
//		SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();
//		solicitudAcademica.setRutPersonaSolicitudAcademica("1-9");
//		
//		try {
//			solicitudAcademica=factoryPersistenciaDAO.getSolicitudAcademicaDAO().buscarSolicitudAcademicaxRutPersonaSolicitudAcademicaEntity(solicitudAcademica);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(solicitudAcademica!=null){
//			objLog.info(solicitudAcademica.getIdSolicitudAcademica()+"");
//		}
//	}
//	
//	public void buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaTest(){
//		objLog.info("buscarSolicitudAcademicaxIdTest");
//		
//		SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();
//		solicitudAcademica.setNombrePersonaSolicitudAcademica("");
//		
//		try {
//			solicitudAcademica=factoryPersistenciaDAO.getSolicitudAcademicaDAO().buscarSolicitudAcademicaxNombrePersonaSolicitudAcademicaEntity(solicitudAcademica);
//		} catch (PersistenceImplException e) {
//			// TODO Auto-generated catch block
//			objLog.error("error en implementacion de Persistencia:: ");
//		}
//		
//		if(solicitudAcademica!=null){
//			objLog.info(solicitudAcademica.getIdSolicitudAcademica()+"");
//		}
//	}
//	
//	public void listarSolicitudAcademicasTest(){
//		objLog.info("listarSolicitudAcademicasTest");
//		List<SolicitudAcademicaEntity> listaSolicitudAcademica=new ArrayList<SolicitudAcademicaEntity>();
//
//		listaSolicitudAcademica=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicasEntity();
//	
//		for(SolicitudAcademicaEntity empUsuApliEmp:listaSolicitudAcademica){
//			objLog.info(empUsuApliEmp.getIdSolicitudAcademica()+" - ");
//		}
//	}
//	
//	
//	
//	public void listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaTest(){
//		objLog.info("listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaTest");
//		
//		SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();
//		List<SolicitudAcademicaEntity> listaSolicitudAcademicas =new ArrayList<SolicitudAcademicaEntity>();
//		
//		solicitudAcademica.setApellidoMaternoPersonaSolicitudAcademica("");
//		
//		listaSolicitudAcademicas=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicaxApellidoPaternoPersonaSolicitudAcademicaEntity(solicitudAcademica);
//		
//		for(SolicitudAcademicaEntity empUsuApliEmp:listaSolicitudAcademicas){
//			objLog.info(empUsuApliEmp.getIdSolicitudAcademica()+" - ");
//		}
//	}
//	
//	@Test
//	public void listarSolicitudAcademicaEntreFecha(){
//		objLog.info("listarSolicitudAcademicaEntreFecha");
//		
//		SolicitudAcademicaEntity solicitudAcademicaInicial=new SolicitudAcademicaEntity();
//		SolicitudAcademicaEntity solicitudAcademicaFinal=new SolicitudAcademicaEntity();
//		List<SolicitudAcademicaEntity> listaSolicitudAcademicas =new ArrayList<SolicitudAcademicaEntity>();
//		
//		solicitudAcademicaInicial.setFechaSolicitud(new Timestamp(0));
//		solicitudAcademicaFinal.setFechaSolicitud(new Timestamp(0));
//		
//		listaSolicitudAcademicas=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicaxEntreFechasEntity(solicitudAcademicaInicial,solicitudAcademicaFinal);
//		
//		for(SolicitudAcademicaEntity empUsuApliEmp:listaSolicitudAcademicas){
//			objLog.info(empUsuApliEmp.getIdSolicitudAcademica()+" - ");
//		}
//	}
//	
//	
//	public void listarSolicitudAcademicaxEstadoTest(){
//		objLog.info("listarSolicitudAcademicaxAplicacionEmpresaTest");
//		
//		SolicitudAcademicaEntity solicitudAcademica=new SolicitudAcademicaEntity();
//		List<SolicitudAcademicaEntity> listaSolicitudAcademicas =new ArrayList<SolicitudAcademicaEntity>();
//		solicitudAcademica.setEstadoSolicitud(1);
//		
//		listaSolicitudAcademicas=factoryPersistenciaDAO.getSolicitudAcademicaDAO().listarSolicitudAcademicaxEstadoEntity(solicitudAcademica);
//		
//		for(SolicitudAcademicaEntity empUsuApliEmp:listaSolicitudAcademicas){
//			objLog.info(empUsuApliEmp.getIdSolicitudAcademica()+" - ");
//		}
//	}
//	
//}