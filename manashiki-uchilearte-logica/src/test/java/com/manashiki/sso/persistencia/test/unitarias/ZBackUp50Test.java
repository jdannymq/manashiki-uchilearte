//package com.manashiki.sso.persistencia.test.unitarias;
//
//public class BackUp50Test {
//
//	@Test
//	public void quieroXYZEntities(){
//		
//			crearAplicacionTest();
//			crearRegionTest();
//			crearComunaTest();
//			crearRolTest();
//		
//			crearEmpresaTest();
//			crearMemberTest();
//			crearPerfilTest();
//			crearUsuarioTest();
//		
//			crearAplicacionEmpresaTest();
//			crearAplicacionRolTest();
//			crearEmpresaUsuarioTest();
//		
//			crearEmpresaUsuarioAplicacionEmpresaTest();
//			crearEmpresaUsuarioRolTest();
//	}
//	
//	public void crearAplicacionTest(){
//
//		Aplicacion aplicacion1=new Aplicacion();Aplicacion aplicacion2=new Aplicacion();Aplicacion aplicacion3=new Aplicacion();
//		AplicacionDAOImpl aplicacionDAO=new AplicacionDAOImpl();
//		aplicacion1.setNombre_aplicacion("desarrollator");aplicacion1.setDescripcion_aplicacion("aplicacion 1");aplicacionDAO.crearAplicacionEntity(aplicacion1);
//		aplicacion2.setNombre_aplicacion("explicator");aplicacion2.setDescripcion_aplicacion("aplicacion 22");aplicacionDAO.crearAplicacionEntity(aplicacion2);
//		aplicacion3.setNombre_aplicacion("destructor");aplicacion3.setDescripcion_aplicacion("aplicacion xyz");aplicacionDAO.crearAplicacionEntity(aplicacion3);
//	}
//	
//	public void crearRegionTest(){
//		Region region1=new Region();Region region2=new Region();Region region3=new Region();
//		RegionDAOImpl regionDAO=new RegionDAOImpl();
//		region1.setNombre_region("region Asia");regionDAO.crearRegionEntity(region1);
//		region2.setNombre_region("region America");regionDAO.crearRegionEntity(region2);
//		region3.setNombre_region("region Europa");regionDAO.crearRegionEntity(region3);
//	}
//	
//	public void crearComunaTest(){
//		Comuna comuna1=new Comuna();Comuna comuna2=new Comuna();Comuna comuna3=new Comuna();Comuna comuna4=new Comuna();Comuna comuna5=new Comuna();Comuna comuna6=new Comuna();
//		ComunaDAOImpl comunaDAO=new ComunaDAOImpl();
//		comuna1.setNombre_comuna("comuna de region Asia AAA");comuna1.setId_region(1);comunaDAO.crearComunaEntity(comuna1);
//		comuna2.setNombre_comuna("comuna de region Asia 222");comuna2.setId_region(1);comunaDAO.crearComunaEntity(comuna2);
//		comuna3.setNombre_comuna("comuna de region America EEE");comuna3.setId_region(2);comunaDAO.crearComunaEntity(comuna3);
//		comuna4.setNombre_comuna("comuna de region America 444");comuna4.setId_region(2);comunaDAO.crearComunaEntity(comuna4);
//		comuna5.setNombre_comuna("comuna de region Europa JJJ");comuna5.setId_region(3);comunaDAO.crearComunaEntity(comuna5);
//		comuna6.setNombre_comuna("comuna de region America 911");comuna6.setId_region(3);comunaDAO.crearComunaEntity(comuna6);
//	}
//	
//	public void crearRolTest(){
//		Rol rol1=new Rol(),rol2=new Rol(),rol3=new Rol(),rol4=new Rol(),rol5=new Rol(),rol6=new Rol();
//		Rol rol7=new Rol(),rol8=new Rol(),rol9=new Rol(),rol10=new Rol(),rol11=new Rol();
//		RolDAOImpl rolDAO=new RolDAOImpl();
//		
//		rol1.setNombre_rol("Test General");rol1.setLower_nombre_rol("test");rol1.setDescripcion_rol("rol de Prueba para framework spring EJB");
//		rol2.setNombre_rol("Usuario General");rol2.setLower_nombre_rol("usuario");rol2.setDescripcion_rol("usuario normal");
//		rol3.setNombre_rol("Administrador General");rol3.setLower_nombre_rol("administrador");rol3.setDescripcion_rol("administrador nombrado por la empresa");
//		rol4.setNombre_rol("Alumno Instituto A");rol4.setLower_nombre_rol("alumno instituto");rol4.setDescripcion_rol("rol para usuarios del instituto");
//		rol5.setNombre_rol("profesor Instituto A");rol5.setLower_nombre_rol("profesor instituto");rol5.setDescripcion_rol("rol para usuarios del instituto");
//		rol6.setNombre_rol("administrador Instituto A");rol6.setLower_nombre_rol("administrador instituto");rol6.setDescripcion_rol("rol para usuarios del instituto");
//		rol7.setNombre_rol("alumno Universitario");rol7.setLower_nombre_rol("alumno universidad del Oceano");rol7.setDescripcion_rol("rol para usuarios de la universidad");
//		rol8.setNombre_rol("profesor Universitario");rol8.setLower_nombre_rol("profesor universidad del Oceano");rol8.setDescripcion_rol("rol para usuarios de la universidad");
//		rol9.setNombre_rol("administrador Universitario");rol9.setLower_nombre_rol("administrador universidad del Oceano");rol9.setDescripcion_rol("rol para usuarios de la universidad");
//		rol10.setNombre_rol("trabajador constructora A");rol10.setLower_nombre_rol("trabajador constructora");rol10.setDescripcion_rol("rol para usuarios del instituto");
//		rol11.setNombre_rol("administrador Constructora");rol11.setLower_nombre_rol("administrador universidad del Oceano");rol11.setDescripcion_rol("rol para usuarios de la universidad");
//		
//		rolDAO.crearRolEntity(rol1);rolDAO.crearRolEntity(rol2);rolDAO.crearRolEntity(rol3);rolDAO.crearRolEntity(rol4);rolDAO.crearRolEntity(rol5);rolDAO.crearRolEntity(rol6);rolDAO.crearRolEntity(rol7);rolDAO.crearRolEntity(rol8);
//		rolDAO.crearRolEntity(rol9);rolDAO.crearRolEntity(rol10);rolDAO.crearRolEntity(rol11);
//	}
//	public void crearEmpresaTest(){
//		Empresa empresa1=new Empresa();Empresa empresa2=new Empresa();Empresa empresa3=new Empresa();
//		EmpresaDAOImpl empresaDAO=new EmpresaDAOImpl();
//		empresa1.setRol_unico_identificador_empresa("1-9");empresa1.setNombre_empresa("instituto AAA");empresa1.setRazon_social_empresa("educacion media S/A");empresa1.setGiro_empresa("venta de clases");empresa1.setDireccion_origen("colegio A");empresa1.setPais_empresa("Japon");empresa1.setRegion_origen(1);empresa1.setComuna_origen(1);			   empresa1.setCiudad_origen("en AAA");empresa1.setEstado_empresa(1);empresaDAO.crearEmpresaEntity(empresa1);
//		empresa2.setRol_unico_identificador_empresa("2-7");empresa2.setNombre_empresa("universidad");empresa2.setRazon_social_empresa("educacion universitaria S/A");empresa2.setGiro_empresa("venta de Educacion");empresa2.setDireccion_origen("un fundo");empresa2.setPais_empresa("Chile");empresa2.setRegion_origen(1);empresa2.setComuna_origen(2);	   empresa2.setCiudad_origen("en BBB");empresa2.setEstado_empresa(1);empresaDAO.crearEmpresaEntity(empresa2);
//		empresa3.setRol_unico_identificador_empresa("3-6");empresa3.setNombre_empresa("constructora");empresa3.setRazon_social_empresa("construccion S/A");empresa3.setGiro_empresa("venta de Inmuebles");empresa3.setDireccion_origen("Al lado del Averno");empresa3.setPais_empresa("Rumania");empresa3.setRegion_origen(2);empresa3.setComuna_origen(3);    empresa3.setCiudad_origen("en CCC");empresa3.setEstado_empresa(1);empresaDAO.crearEmpresaEntity(empresa3);
//	}
//	
//	public void crearMemberTest(){
//		Member member1=new Member(),member2=new Member(),member3=new Member(),member4=new Member(),member5=new Member(),member6=new Member(),
//		member7=new Member(),member8=new Member(),member9=new Member(),member10=new Member(),member11=new Member(),member12=new Member();
//		MemberDAOImpl memberDAO=new MemberDAOImpl();
//		member1.setNombre_member("julito");member1.setPassword("aaaaa");member1.setPassword_format("md5");member1.setPassword_salt("!!!");member1.setMail_member("a@a.cl");member1.setTelefono_contacto_member("11111111");member1.setPassword_pregunta("gato julito?");member1.setPassword_respuesta("si");member1.setEstado_member(1);member1.setCreacion_member(new Date(0));member1.setPassword_ultima_actualizacion(new Date(0));member1.setFirma("una X");	memberDAO.crearMemberEntity(member1);
//		member2.setNombre_member("tiene");member2.setPassword("bbbbb");member2.setPassword_format("aes");member2.setPassword_salt("222");member2.setMail_member("b@b.cl");member2.setTelefono_contacto_member("22222222");member2.setPassword_pregunta("perro julito?");member2.setPassword_respuesta("si");member2.setEstado_member(1);member2.setCreacion_member(new Date(0));member2.setPassword_ultima_actualizacion(new Date(0));member2.setFirma("No Firmo");memberDAO.crearMemberEntity(member2);
//		member3.setNombre_member("cinco");member3.setPassword("ccccc");member3.setPassword_format("pem");member3.setPassword_salt("###");member3.setMail_member("c@c.cl");member3.setTelefono_contacto_member("33333333");member3.setPassword_pregunta("cebra julito?");member3.setPassword_respuesta("si");member3.setEstado_member(1);member3.setCreacion_member(new Date(0));member3.setPassword_ultima_actualizacion(new Date(0));member3.setFirma("The Firm");memberDAO.crearMemberEntity(member3);
//		/****************************/
//		member4.setNombre_member("jaime");member4.setPassword("eeeee");member4.setPassword_format("md5");member4.setPassword_salt("$$$");member4.setMail_member("e@e.cl");member4.setTelefono_contacto_member("44444444");member4.setPassword_pregunta("gato jaime?");member4.setPassword_respuesta("si");member4.setEstado_member(1);member4.setCreacion_member(new Date(0));member4.setPassword_ultima_actualizacion(new Date(0));member4.setFirma("una X");	memberDAO.crearMemberEntity(member4);
//		member5.setNombre_member("esmuy");member5.setPassword("fffff");member5.setPassword_format("aes");member5.setPassword_salt("%%%");member5.setMail_member("f@f.cl");member5.setTelefono_contacto_member("55555555");member5.setPassword_pregunta("perro jaime?");member5.setPassword_respuesta("si");member5.setEstado_member(1);member5.setCreacion_member(new Date(0));member5.setPassword_ultima_actualizacion(new Date(0));member5.setFirma("No Firmo");memberDAO.crearMemberEntity(member5);
//		member6.setNombre_member("godito");member6.setPassword("ggggg");member6.setPassword_format("pem");member6.setPassword_salt("&&&");member6.setMail_member("g@g.cl");member6.setTelefono_contacto_member("66666666");member6.setPassword_pregunta("cebra jaime?");member6.setPassword_respuesta("si");member6.setEstado_member(1);member6.setCreacion_member(new Date(0));member6.setPassword_ultima_actualizacion(new Date(0));member6.setFirma("The Firm");memberDAO.crearMemberEntity(member6);
//		/******************************/
//		member7.setNombre_member("marcelita");member7.setPassword("hhhhh");member7.setPassword_format("md5");member7.setPassword_salt("///");member7.setMail_member("f@f.cl");member7.setTelefono_contacto_member("77777777");member7.setPassword_pregunta("gato marce?");member7.setPassword_respuesta("si");member7.setEstado_member(1);member7.setCreacion_member(new Date(0));member7.setPassword_ultima_actualizacion(new Date(0));member7.setFirma("una X");	memberDAO.crearMemberEntity(member7);
//		member8.setNombre_member("esmuy");member8.setPassword("iiiii");member8.setPassword_format("aes");member8.setPassword_salt("(((");member8.setMail_member("i@i.cl");member8.setTelefono_contacto_member("88888888");member8.setPassword_pregunta("perro marce?");member8.setPassword_respuesta("si");member8.setEstado_member(1);member8.setCreacion_member(new Date(0));member8.setPassword_ultima_actualizacion(new Date(0));member8.setFirma("No Firmo");memberDAO.crearMemberEntity(member8);
//		member9.setNombre_member("feafea");member9.setPassword("jjjjj");member9.setPassword_format("pem");member9.setPassword_salt(")))");member9.setMail_member("j@j.cl");member9.setTelefono_contacto_member("99999999");member9.setPassword_pregunta("cebra marce?");member9.setPassword_respuesta("si");member9.setEstado_member(1);member9.setCreacion_member(new Date(0));member9.setPassword_ultima_actualizacion(new Date(0));member9.setFirma("The Firm");memberDAO.crearMemberEntity(member9);
//		/******************************/
//		member10.setNombre_member("mami");member10.setPassword("kkkkk");member10.setPassword_format("md5");member10.setPassword_salt("===");member10.setMail_member("k@k.cl");member10.setTelefono_contacto_member("10101010");member10.setPassword_pregunta("gato mami?");member10.setPassword_respuesta("si");member10.setEstado_member(1);member10.setCreacion_member(new Date(0));member10.setPassword_ultima_actualizacion(new Date(0));member10.setFirma("una X");	memberDAO.crearMemberEntity(member10);
//		member11.setNombre_member("eslamas");member11.setPassword("lllll");member11.setPassword_format("aes");member11.setPassword_salt("***");member11.setMail_member("l@l.cl");member11.setTelefono_contacto_member("12121212");member11.setPassword_pregunta("perro mami?");member11.setPassword_respuesta("si");member11.setEstado_member(1);member11.setCreacion_member(new Date(0));member11.setPassword_ultima_actualizacion(new Date(0));member11.setFirma("No Firmo");memberDAO.crearMemberEntity(member11);
//		member12.setNombre_member("linda");member12.setPassword("mmmmm");member12.setPassword_format("pem");member12.setPassword_salt("+++");member12.setMail_member("m@m.cl");member12.setTelefono_contacto_member("13131313");member12.setPassword_pregunta("cebra mami?");member12.setPassword_respuesta("si");member12.setEstado_member(1);member12.setCreacion_member(new Date(0));member12.setPassword_ultima_actualizacion(new Date(0));member12.setFirma("The Firm");memberDAO.crearMemberEntity(member12);
//		
//	}
//	
//	public void crearPerfilTest(){
//		Perfil perfil1=new Perfil();Perfil perfil2=new Perfil();Perfil perfil3=new Perfil();
//		PerfilDAOImpl perfilDAO=new PerfilDAOImpl();
//		perfil1.setNombre_perfil("soy un Sexy"); perfil1.setEstado_perfil("Activo"); perfil1.setEstado_member_last_bloqueado(new Date(0));perfil1.setUltima_conexion_perfil(new Date(0)); perfilDAO.crearPerfilEntity(perfil1);
//		perfil2.setNombre_perfil("soy Esclavo"); perfil2.setEstado_perfil("No Activo"); perfil2.setEstado_member_last_bloqueado(new Date(0));perfil2.setUltima_conexion_perfil(new Date(0)); perfilDAO.crearPerfilEntity(perfil2);
//		perfil3.setNombre_perfil("ser cafiche"); perfil3.setEstado_perfil("Inactivo"); perfil3.setEstado_member_last_bloqueado(new Date(0));perfil3.setUltima_conexion_perfil(new Date(0)); perfilDAO.crearPerfilEntity(perfil3);
//	}
//	public void crearUsuarioTest(){
//		Perfil perfil=new Perfil();
//		Member member=new Member();
//		Usuario usuario1=new Usuario();Usuario usuario2=new Usuario();Usuario usuario3=new Usuario();Usuario usuario4=new Usuario();;Usuario usuario5=new Usuario();;Usuario usuario6=new Usuario();
//		UsuarioDAOImpl usuarioDAO=new UsuarioDAOImpl();
//		usuario1.setUsername_usuario_perfil("jcornejo");/**/usuario1.setLower_username_usuario_perfil("jcornejo"); usuario1.setIs_anonimous(1);			usuario1.setUltima_accion_usuario(new Date(2014, 11, 11));perfil=new Perfil();perfil.setId_perfil(1);usuario1.setFk_id_perfil(perfil);member=new Member();member.setId_member(1);usuario1.setFk_id_member(member);usuarioDAO.crearUsuarioEntity(usuario1);
//		usuario2.setUsername_usuario_perfil("alaverga");/**/usuario2.setLower_username_usuario_perfil("alaverga"); usuario2.setIs_anonimous(1);			usuario2.setUltima_accion_usuario(new Date(2014, 11, 11));perfil=new Perfil();perfil.setId_perfil(2);usuario2.setFk_id_perfil(perfil);member=new Member();member.setId_member(1);usuario2.setFk_id_member(member);usuarioDAO.crearUsuarioEntity(usuario2);
//		usuario3.setUsername_usuario_perfil("amamones");/**/usuario3.setLower_username_usuario_perfil("amamones"); usuario3.setIs_anonimous(1);			usuario3.setUltima_accion_usuario(new Date(2014, 11, 11));perfil=new Perfil();perfil.setId_perfil(3);usuario3.setFk_id_perfil(perfil);member=new Member();member.setId_member(2);usuario3.setFk_id_member(member);usuarioDAO.crearUsuarioEntity(usuario3);
//		usuario4.setUsername_usuario_perfil("bnitocamelot");usuario4.setLower_username_usuario_perfil("usuario pprueba"); usuario4.setIs_anonimous(1);	usuario4.setUltima_accion_usuario(new Date(2014, 11, 11));perfil=new Perfil();perfil.setId_perfil(1);usuario4.setFk_id_perfil(perfil);member=new Member();member.setId_member(2);usuario4.setFk_id_member(member);usuarioDAO.crearUsuarioEntity(usuario4);
//		usuario5.setUsername_usuario_perfil("susanaoria");  usuario5.setLower_username_usuario_perfil("bnitocamelot"); usuario5.setIs_anonimous(1);		usuario5.setUltima_accion_usuario(new Date(2014, 11, 11));perfil=new Perfil();perfil.setId_perfil(2);usuario5.setFk_id_perfil(perfil);member=new Member();member.setId_member(3);usuario5.setFk_id_member(member);usuarioDAO.crearUsuarioEntity(usuario5);
//		usuario6.setUsername_usuario_perfil("doralava");/**/usuario6.setLower_username_usuario_perfil("doralava"); usuario6.setIs_anonimous(1);			usuario6.setUltima_accion_usuario(new Date(2014, 11, 11));perfil=new Perfil();perfil.setId_perfil(3);usuario6.setFk_id_perfil(perfil);member=new Member();member.setId_member(3);usuario6.setFk_id_member(member);usuarioDAO.crearUsuarioEntity(usuario6);
//	
//	}
//	public void crearAplicacionEmpresaTest(){
//		Aplicacion aplicacion=new Aplicacion();
//		Empresa empresa=new Empresa();
//		AplicacionEmpresa aplicacionEmpresa1 = new AplicacionEmpresa(),aplicacionEmpresa2= new AplicacionEmpresa(),aplicacionEmpresa3= new AplicacionEmpresa(),aplicacionEmpresa4= new AplicacionEmpresa(),aplicacionEmpresa5= new AplicacionEmpresa(),aplicacionEmpresa6= new AplicacionEmpresa(),aplicacionEmpresa7= new AplicacionEmpresa(),aplicacionEmpresa8= new AplicacionEmpresa(),aplicacionEmpresa9=new AplicacionEmpresa();
//		AplicacionEmpresaDAOImpl aplicacionEmpresaDAO=new AplicacionEmpresaDAOImpl();
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionEmpresa1.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(1);aplicacionEmpresa1.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa1);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionEmpresa2.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(1);aplicacionEmpresa2.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa2);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(3);aplicacionEmpresa3.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(1);aplicacionEmpresa3.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa3);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionEmpresa4.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(2);aplicacionEmpresa1.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa1);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionEmpresa5.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(2);aplicacionEmpresa2.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa2);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(3);aplicacionEmpresa6.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(2);aplicacionEmpresa3.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa3);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionEmpresa7.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(3);aplicacionEmpresa1.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa1);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionEmpresa8.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(3);aplicacionEmpresa2.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa2);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(3);aplicacionEmpresa9.setFk_id_aplicacion(aplicacion);empresa=new Empresa();empresa.setId_empresa(3);aplicacionEmpresa3.setFk_id_empresa(empresa);aplicacionEmpresaDAO.crearAplicacionEmpresaEntity(aplicacionEmpresa3);
//		
//	}
//	public void crearAplicacionRolTest(){
//		Aplicacion aplicacion=new Aplicacion();
//		Rol rol=new Rol();
//		AplicacionRol aplicacionRol1=new AplicacionRol(),aplicacionRol2=new AplicacionRol(),aplicacionRol3=new AplicacionRol(),aplicacionRol4=new AplicacionRol(),aplicacionRol5=new AplicacionRol(),aplicacionRol6=new AplicacionRol(),aplicacionRol7=new AplicacionRol(),aplicacionRol8=new AplicacionRol(),aplicacionRol9=new AplicacionRol();
//		AplicacionRol aplicacionRol10=new AplicacionRol(),aplicacionRol11=new AplicacionRol(),aplicacionRol12=new AplicacionRol(),aplicacionRol13=new AplicacionRol(),aplicacionRol14=new AplicacionRol(),aplicacionRol15=new AplicacionRol(),aplicacionRol16=new AplicacionRol(),aplicacionRol17=new AplicacionRol();
//		AplicacionRolDAOImpl aplicacionRolDAO=new AplicacionRolDAOImpl();
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionRol1.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(1);aplicacionRol1.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol1);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionRol2.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(1);aplicacionRol2.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol2);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(3);aplicacionRol3.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(1);aplicacionRol3.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol3);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionRol4.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(2);aplicacionRol4.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol4);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionRol5.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(2);aplicacionRol5.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol5);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(3);aplicacionRol6.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(2);aplicacionRol6.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol6);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionRol7.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(3);aplicacionRol7.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol7);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionRol8.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(3);aplicacionRol8.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol8);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(3);aplicacionRol9.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(3);aplicacionRol9.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol9);
//
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionRol10.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(4);aplicacionRol10.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol10);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionRol11.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(5);aplicacionRol11.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol11);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(1);aplicacionRol12.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(6);aplicacionRol12.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol12);
//		
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionRol13.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(7);aplicacionRol13.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol13);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionRol14.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(8);aplicacionRol14.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol14);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(2);aplicacionRol15.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(9);aplicacionRol15.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol15);
//		
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(3);aplicacionRol16.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(10);aplicacionRol16.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol16);
//		aplicacion=new Aplicacion();aplicacion.setId_aplicacion(3);aplicacionRol17.setFk_id_aplicacion(aplicacion);rol=new Rol();rol.setId_rol(11);aplicacionRol17.setFk_id_rol(rol);aplicacionRolDAO.crearAplicacionRolEntity(aplicacionRol17);
//		
//	}
//
//	public void crearEmpresaUsuarioTest(){
//		Empresa empresa = new Empresa();
//		Usuario usuario= new Usuario();
//		EmpresaUsuario empresaUsuario1=new EmpresaUsuario(),empresaUsuario2=new EmpresaUsuario(),empresaUsuario3=new EmpresaUsuario(),empresaUsuario4=new EmpresaUsuario(),empresaUsuario5=new EmpresaUsuario(),empresaUsuario6=new EmpresaUsuario(),empresaUsuario7=new EmpresaUsuario(),empresaUsuario8=new EmpresaUsuario();
//		EmpresaUsuarioDAOImpl empresaUsuarioDAO=new EmpresaUsuarioDAOImpl();
//		empresa = new Empresa();empresa.setId_empresa(1);empresaUsuario1.setFk_id_empresa(empresa);usuario= new Usuario();usuario.setId_usuario(1);empresaUsuario1.setFk_id_usuario(usuario);empresaUsuarioDAO.crearEmpresaUsuarioEntity(empresaUsuario1);
//		empresa = new Empresa();empresa.setId_empresa(1);empresaUsuario2.setFk_id_empresa(empresa);usuario= new Usuario();usuario.setId_usuario(2);empresaUsuario2.setFk_id_usuario(usuario);empresaUsuarioDAO.crearEmpresaUsuarioEntity(empresaUsuario2);
//		empresa = new Empresa();empresa.setId_empresa(1);empresaUsuario3.setFk_id_empresa(empresa);usuario= new Usuario();usuario.setId_usuario(3);empresaUsuario3.setFk_id_usuario(usuario);empresaUsuarioDAO.crearEmpresaUsuarioEntity(empresaUsuario3);
//		empresa = new Empresa();empresa.setId_empresa(1);empresaUsuario4.setFk_id_empresa(empresa);usuario= new Usuario();usuario.setId_usuario(4);empresaUsuario4.setFk_id_usuario(usuario);empresaUsuarioDAO.crearEmpresaUsuarioEntity(empresaUsuario4);
//		empresa = new Empresa();empresa.setId_empresa(1);empresaUsuario5.setFk_id_empresa(empresa);usuario= new Usuario();usuario.setId_usuario(5);empresaUsuario5.setFk_id_usuario(usuario);empresaUsuarioDAO.crearEmpresaUsuarioEntity(empresaUsuario5);
//		empresa = new Empresa();empresa.setId_empresa(2);empresaUsuario6.setFk_id_empresa(empresa);usuario= new Usuario();usuario.setId_usuario(1);empresaUsuario6.setFk_id_usuario(usuario);empresaUsuarioDAO.crearEmpresaUsuarioEntity(empresaUsuario6);
//		empresa = new Empresa();empresa.setId_empresa(2);empresaUsuario7.setFk_id_empresa(empresa);usuario= new Usuario();usuario.setId_usuario(2);empresaUsuario7.setFk_id_usuario(usuario);empresaUsuarioDAO.crearEmpresaUsuarioEntity(empresaUsuario7);
//		empresa = new Empresa();empresa.setId_empresa(3);empresaUsuario8.setFk_id_empresa(empresa);usuario= new Usuario();usuario.setId_usuario(1);empresaUsuario8.setFk_id_usuario(usuario);empresaUsuarioDAO.crearEmpresaUsuarioEntity(empresaUsuario8);
//	}
//	
//	public void crearEmpresaUsuarioAplicacionEmpresaTest(){
//		EmpresaUsuario empresaUsuario=new EmpresaUsuario();
//		AplicacionEmpresa aplicacionEmpresa = new AplicacionEmpresa();
//		EmpresaUsuarioAplicacionEmpresa empresaUsuarioAplicacionEmpresa1=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa2=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa3=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa4=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa5=new EmpresaUsuarioAplicacionEmpresa();
//		EmpresaUsuarioAplicacionEmpresa empresaUsuarioAplicacionEmpresa6=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa7=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa8=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa9=new EmpresaUsuarioAplicacionEmpresa();
//		
//		EmpresaUsuarioAplicacionEmpresa empresaUsuarioAplicacionEmpresa10=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa11=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa12=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa13=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa14=new EmpresaUsuarioAplicacionEmpresa();
//		EmpresaUsuarioAplicacionEmpresa empresaUsuarioAplicacionEmpresa15=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa16=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa17=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa18=new EmpresaUsuarioAplicacionEmpresa();
//		
//		EmpresaUsuarioAplicacionEmpresa empresaUsuarioAplicacionEmpresa19=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa20=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa21=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa22=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa23=new EmpresaUsuarioAplicacionEmpresa();
//		EmpresaUsuarioAplicacionEmpresa empresaUsuarioAplicacionEmpresa24=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa25=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa26=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa27=new EmpresaUsuarioAplicacionEmpresa();
//		
//		EmpresaUsuarioAplicacionEmpresa empresaUsuarioAplicacionEmpresa28=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa29=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa30=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa31=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa32=new EmpresaUsuarioAplicacionEmpresa();
//		EmpresaUsuarioAplicacionEmpresa empresaUsuarioAplicacionEmpresa33=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa34=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa35=new EmpresaUsuarioAplicacionEmpresa(),empresaUsuarioAplicacionEmpresa36=new EmpresaUsuarioAplicacionEmpresa();
//		
//		EmpresaUsuarioAplicacionEmpresaDAOImpl empresaUsuarioAplicacionEmpresaDAO=new EmpresaUsuarioAplicacionEmpresaDAOImpl();
//		
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(1);empresaUsuarioAplicacionEmpresa1.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(1);empresaUsuarioAplicacionEmpresa1.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa1);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(1);empresaUsuarioAplicacionEmpresa2.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(3);empresaUsuarioAplicacionEmpresa2.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa2);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(1);empresaUsuarioAplicacionEmpresa3.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(5);empresaUsuarioAplicacionEmpresa3.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa3);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(1);empresaUsuarioAplicacionEmpresa4.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(7);empresaUsuarioAplicacionEmpresa4.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa4);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(1);empresaUsuarioAplicacionEmpresa5.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(9);empresaUsuarioAplicacionEmpresa5.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa5);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(2);empresaUsuarioAplicacionEmpresa6.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(2);empresaUsuarioAplicacionEmpresa6.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa6);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(2);empresaUsuarioAplicacionEmpresa7.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(4);empresaUsuarioAplicacionEmpresa7.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa7);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(2);empresaUsuarioAplicacionEmpresa8.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(6);empresaUsuarioAplicacionEmpresa8.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa8);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(2);empresaUsuarioAplicacionEmpresa9.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(8);empresaUsuarioAplicacionEmpresa9.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa9);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(3);empresaUsuarioAplicacionEmpresa10.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(1);empresaUsuarioAplicacionEmpresa10.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa10);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(3);empresaUsuarioAplicacionEmpresa11.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(3);empresaUsuarioAplicacionEmpresa11.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa11);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(3);empresaUsuarioAplicacionEmpresa12.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(5);empresaUsuarioAplicacionEmpresa12.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa12);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(3);empresaUsuarioAplicacionEmpresa13.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(7);empresaUsuarioAplicacionEmpresa13.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa13);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(3);empresaUsuarioAplicacionEmpresa14.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(9);empresaUsuarioAplicacionEmpresa14.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa14);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(4);empresaUsuarioAplicacionEmpresa15.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(2);empresaUsuarioAplicacionEmpresa15.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa15);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(4);empresaUsuarioAplicacionEmpresa16.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(4);empresaUsuarioAplicacionEmpresa16.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa16);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(4);empresaUsuarioAplicacionEmpresa17.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(6);empresaUsuarioAplicacionEmpresa17.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa17);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(4);empresaUsuarioAplicacionEmpresa18.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(8);empresaUsuarioAplicacionEmpresa18.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa18);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(5);empresaUsuarioAplicacionEmpresa19.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(1);empresaUsuarioAplicacionEmpresa19.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa19);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(5);empresaUsuarioAplicacionEmpresa20.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(3);empresaUsuarioAplicacionEmpresa20.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa20);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(5);empresaUsuarioAplicacionEmpresa21.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(5);empresaUsuarioAplicacionEmpresa21.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa21);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(5);empresaUsuarioAplicacionEmpresa22.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(7);empresaUsuarioAplicacionEmpresa22.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa22);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(5);empresaUsuarioAplicacionEmpresa23.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(9);empresaUsuarioAplicacionEmpresa23.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa23);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(6);empresaUsuarioAplicacionEmpresa24.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(2);empresaUsuarioAplicacionEmpresa24.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa24);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(6);empresaUsuarioAplicacionEmpresa25.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(4);empresaUsuarioAplicacionEmpresa25.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa25);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(6);empresaUsuarioAplicacionEmpresa26.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(6);empresaUsuarioAplicacionEmpresa26.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa26);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(6);empresaUsuarioAplicacionEmpresa27.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(8);empresaUsuarioAplicacionEmpresa27.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa27);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(7);empresaUsuarioAplicacionEmpresa28.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(1);empresaUsuarioAplicacionEmpresa28.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa28);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(7);empresaUsuarioAplicacionEmpresa29.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(3);empresaUsuarioAplicacionEmpresa29.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa29);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(7);empresaUsuarioAplicacionEmpresa30.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(5);empresaUsuarioAplicacionEmpresa30.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa30);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(7);empresaUsuarioAplicacionEmpresa31.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(7);empresaUsuarioAplicacionEmpresa31.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa31);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(7);empresaUsuarioAplicacionEmpresa32.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(9);empresaUsuarioAplicacionEmpresa32.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa32);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(8);empresaUsuarioAplicacionEmpresa33.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(2);empresaUsuarioAplicacionEmpresa33.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa33);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(8);empresaUsuarioAplicacionEmpresa34.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(4);empresaUsuarioAplicacionEmpresa34.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa34);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(8);empresaUsuarioAplicacionEmpresa35.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(6);empresaUsuarioAplicacionEmpresa35.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa35);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(8);empresaUsuarioAplicacionEmpresa36.setFk_id_empresa_usuario(empresaUsuario);aplicacionEmpresa.setId_aplicacion_empresa(8);empresaUsuarioAplicacionEmpresa36.setFk_id_aplicacion_empresa(aplicacionEmpresa);empresaUsuarioAplicacionEmpresaDAO.crearEmpresaUsuarioAplicacionEmpresaEntity(empresaUsuarioAplicacionEmpresa36);
//		
//	}
//
//	public void crearEmpresaUsuarioRolTest(){
//		EmpresaUsuario empresaUsuario = new EmpresaUsuario();
//		Rol rol = new Rol();
//		EmpresaUsuarioRol empresaUsuarioRol1=new EmpresaUsuarioRol(),empresaUsuarioRol2=new EmpresaUsuarioRol(),empresaUsuarioRol3=new EmpresaUsuarioRol(),empresaUsuarioRol4=new EmpresaUsuarioRol(),empresaUsuarioRol5=new EmpresaUsuarioRol(),empresaUsuarioRol6=new EmpresaUsuarioRol(),empresaUsuarioRol7=new EmpresaUsuarioRol();
//		EmpresaUsuarioRol empresaUsuarioRol8=new EmpresaUsuarioRol(),empresaUsuarioRol9=new EmpresaUsuarioRol(),empresaUsuarioRol10=new EmpresaUsuarioRol(),empresaUsuarioRol11=new EmpresaUsuarioRol(),empresaUsuarioRol12=new EmpresaUsuarioRol(),empresaUsuarioRol13=new EmpresaUsuarioRol();
//		
//		EmpresaUsuarioRolDAOImpl empresaUsuarioRolDAO=new EmpresaUsuarioRolDAOImpl();
//		
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(1);empresaUsuarioRol1.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(1);empresaUsuarioRol1.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol1);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(1);empresaUsuarioRol2.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(3);empresaUsuarioRol2.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol2);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(2);empresaUsuarioRol3.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(2);empresaUsuarioRol3.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol3);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(3);empresaUsuarioRol4.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(1);empresaUsuarioRol4.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol4);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(3);empresaUsuarioRol5.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(3);empresaUsuarioRol5.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol5);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(4);empresaUsuarioRol6.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(2);empresaUsuarioRol6.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol6);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(5);empresaUsuarioRol7.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(1);empresaUsuarioRol7.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol7);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(5);empresaUsuarioRol8.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(2);empresaUsuarioRol8.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol8);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(6);empresaUsuarioRol9.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(3);empresaUsuarioRol9.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol9);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(7);empresaUsuarioRol10.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(3);empresaUsuarioRol10.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol10);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(7);empresaUsuarioRol11.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(2);empresaUsuarioRol11.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol11);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(8);empresaUsuarioRol12.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(1);empresaUsuarioRol12.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol12);
//		empresaUsuario=new EmpresaUsuario();empresaUsuario.setId_empresa_usuario(8);empresaUsuarioRol13.setFk_id_empresa_usuario(empresaUsuario);rol = new Rol();rol.setId_rol(2);empresaUsuarioRol13.setFk_id_rol(rol);empresaUsuarioRolDAO.crearEmpresaUsuarioRolEntity(empresaUsuarioRol13);
//	}
//	
//}
