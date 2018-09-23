package com.manashiki.sso.servicio.test.unit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.manashiki.uchilearte.servdto.dto.entities.formulario.ComunaDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.FinalidadCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.ProgramaUniversidadPostulacionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.RegionDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoCertificadoDTO;
import com.manashiki.uchilearte.servdto.dto.entities.formulario.TipoSolicitudDTO;
import com.manashiki.uchilearte.servicio.FactoryServicio;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:servicio-context.xml")
public class ZCrearAllEntitiesService {

	private static final Log objLog = LogFactory.getLog(ZCrearAllEntitiesService.class);

	@Autowired
	FactoryServicio factoryServicioDAO;

	@Test
	public void llenarBaseDeDatos(){
		/*DATOS*/
		/*****************************/
		crearRegionTest();
		crearComunasTest();
		/*****************************/
//		crearAplicacionServicioTest();
		//		crearVersionSemestralTest();
		crearProgramaUniversidadServicioTest();
		crearProgramaUniversidadPostulacionServicioTest();
		//		crearVersionProgramaUniversidadTest();
		crearFinalidadCertificadoServicioTest();
		crearTipoCertificadoServicioTest();
		crearTipoSolicitudServicioTest();
//		crearUsuarioServicioTest();
//		crearEmpresaServicioTest();
//		crearAplicacionEmpresaServicioTest();
//		crearEmpresaUsuarioServicioTest();
//		crearEmpresaUsuarioAplicacionEmpresaTest();

		/*RELACIONES*/
	}

	public void crearRegionTest(){

		RegionDTO regionDTOA=new RegionDTO();
		RegionDTO regionDTOB=new RegionDTO();
		RegionDTO regionDTOC=new RegionDTO();
		RegionDTO regionDTOD=new RegionDTO();
		RegionDTO regionDTOE=new RegionDTO();
		RegionDTO regionDTOF=new RegionDTO();
		RegionDTO regionDTOG=new RegionDTO();
		RegionDTO regionDTOH=new RegionDTO();
		RegionDTO regionDTOI=new RegionDTO();
		RegionDTO regionDTOJ=new RegionDTO();
		RegionDTO regionDTOK=new RegionDTO();
		RegionDTO regionDTOL=new RegionDTO();
		RegionDTO regionDTOM=new RegionDTO();
		RegionDTO regionDTON=new RegionDTO();
		RegionDTO regionDTOO=new RegionDTO();

		regionDTOA.setCodigoRegion("I");
		regionDTOA.setNombreRegion("Región de Tarapaca");
		regionDTOA.setNombreRegionLower(regionDTOA.getNombreRegion().toLowerCase());
		regionDTOA.setDescripcionRegion("primera region de Chile");

		regionDTOB.setCodigoRegion("II");
		regionDTOB.setNombreRegion("Región de Antofagasta");
		regionDTOB.setNombreRegionLower(regionDTOB.getNombreRegion().toLowerCase());
		regionDTOB.setDescripcionRegion("segunda region de Chile");

		regionDTOC.setCodigoRegion("III");
		regionDTOC.setNombreRegion("Región de Atacama");
		regionDTOC.setNombreRegionLower(regionDTOC.getNombreRegion().toLowerCase());
		regionDTOC.setDescripcionRegion("tercera region de Chile");

		regionDTOD.setCodigoRegion("IV");
		regionDTOD.setNombreRegion("Región de Coquimbo");
		regionDTOD.setNombreRegionLower(regionDTOD.getNombreRegion().toLowerCase());
		regionDTOD.setDescripcionRegion("cuarta region de Chile");

		regionDTOE.setCodigoRegion("V");
		regionDTOE.setNombreRegion("Región de Valparaiso");
		regionDTOE.setNombreRegionLower(regionDTOE.getNombreRegion().toLowerCase());
		regionDTOE.setDescripcionRegion("quinta region de Chile");

		regionDTOF.setCodigoRegion("VI");
		regionDTOF.setNombreRegion("Región del Libertador Bernado Ohiggins");
		regionDTOF.setNombreRegionLower(regionDTOF.getNombreRegion().toLowerCase());
		regionDTOF.setDescripcionRegion("sexta region de Chile");

		regionDTOG.setCodigoRegion("VII");
		regionDTOG.setNombreRegion("Región del Maule");
		regionDTOG.setNombreRegionLower(regionDTOG.getNombreRegion().toLowerCase());
		regionDTOG.setDescripcionRegion("septima region de Chile");

		regionDTOH.setCodigoRegion("VIII");
		regionDTOH.setNombreRegion("Región del Bio-Bio");
		regionDTOH.setNombreRegionLower(regionDTOH.getNombreRegion().toLowerCase());
		regionDTOH.setDescripcionRegion("octava region de Chile");

		regionDTOI.setCodigoRegion("IX");
		regionDTOI.setNombreRegion("Región de La Araucania");
		regionDTOI.setNombreRegionLower(regionDTOI.getNombreRegion().toLowerCase());
		regionDTOI.setDescripcionRegion("novena region de Chile");

		regionDTOJ.setCodigoRegion("X");
		regionDTOJ.setNombreRegion("Región de Los Lagos");
		regionDTOJ.setNombreRegionLower(regionDTOJ.getNombreRegion().toLowerCase());
		regionDTOJ.setDescripcionRegion("decima region de Chile");

		regionDTOK.setCodigoRegion("XI");
		regionDTOK.setNombreRegion("Región de Aysen y del General Carlos Ibañez");
		regionDTOK.setNombreRegionLower(regionDTOK.getNombreRegion().toLowerCase());
		regionDTOK.setDescripcionRegion("onceava region de Chile");

		regionDTOL.setCodigoRegion("XII");
		regionDTOL.setNombreRegion("Región de Magallanes");
		regionDTOL.setNombreRegionLower(regionDTOL.getNombreRegion().toLowerCase());
		regionDTOL.setDescripcionRegion("duodecima region de Chile");

		regionDTOM.setCodigoRegion("RM");
		regionDTOM.setNombreRegion("Región Metropolitana");
		regionDTOM.setNombreRegionLower(regionDTOM.getNombreRegion().toLowerCase());
		regionDTOM.setDescripcionRegion("region metropolitana de Santiago");

		regionDTON.setCodigoRegion("XIV");
		regionDTON.setNombreRegion("Región de los Rios");
		regionDTON.setNombreRegionLower(regionDTON.getNombreRegion().toLowerCase());
		regionDTON.setDescripcionRegion("decimocuarta region de Chile");

		regionDTOO.setCodigoRegion("XV");
		regionDTOO.setNombreRegion("Región de Arica y Parinacota");
		regionDTOO.setNombreRegionLower(regionDTOO.getNombreRegion().toLowerCase());
		regionDTOO.setDescripcionRegion("decimoquinta region de Chile");

		regionDTOA = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOA);
		regionDTOB = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOB);
		regionDTOC = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOC);
		regionDTOD = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOD);
		regionDTOE = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOE);
		regionDTOF = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOF);
		regionDTOG = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOG);
		regionDTOH = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOH);
		regionDTOI = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOI);
		regionDTOJ = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOJ);
		regionDTOK = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOK);
		regionDTOL = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOL);
		regionDTOM = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOM);
		regionDTON = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTON);
		regionDTOO = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTOO);

		/******************/
		//		RegionDTO regionDTONone=new RegionDTO();
		//		regionDTONone.setCodigoRegion("None");
		//		regionDTONone.setNombreRegion("None");
		//		regionDTONone.setNombreRegionLower(regionDTONone.getNombreRegion().toLowerCase());
		//		regionDTONone.setDescripcionRegion("None");
		//		regionDTONone = factoryServicioDAO.getRegionServicio().crearRegionDTO(regionDTONone);
		/******************/
	}

	public void crearComunasTest(){
		/*DATOS*/
		crearComunaRegionUnoTest();
		crearComunaRegionDosTest();
		crearComunaRegionTresTest();
		crearComunaRegionCuatroTest();
		crearComunaRegionCincoTest();
		crearComunaRegionSeisTest();
		crearComunaRegionSieteTest();
		crearComunaRegionOchoTest();
		crearComunaRegionNueveTest();
		crearComunaRegionDiezTest();
		crearComunaRegionOnceTest();
		crearComunaRegionDoceTest();
		crearComunaRegionRMTest();
		crearComunaRegionCatorceTest();
		crearComunaRegionQuinceTest();

		//		ComunaDTO comunaDTONula=new ComunaDTO();
		//		comunaDTONula.setCodigoComuna("None");
		//		comunaDTONula.setNombreComuna("None");
		//		comunaDTONula.setNombreComunaLower(comunaDTONula.getNombreComuna().toLowerCase());
		//		comunaDTONula.setIdRegion(16);
		//		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTONula);
		/*DATOS*/
	}

	public void crearComunaRegionUnoTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();

		comunaDTOA.setCodigoComuna("I-1");
		comunaDTOA.setNombreComuna("ALTO HOSPICIO");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(1);

		comunaDTOB.setCodigoComuna("I-2");
		comunaDTOB.setNombreComuna("CAMINA");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(1);

		comunaDTOC.setCodigoComuna("I-3");
		comunaDTOC.setNombreComuna("COLCHANE");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(1);

		comunaDTOD.setCodigoComuna("I-4");
		comunaDTOD.setNombreComuna("HUARA");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(1);

		comunaDTOE.setCodigoComuna("I-5");
		comunaDTOE.setNombreComuna("IQUIQUE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(1);

		comunaDTOF.setCodigoComuna("I-6");
		comunaDTOF.setNombreComuna("PICA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(1);

		comunaDTOG.setCodigoComuna("I-7");
		comunaDTOG.setNombreComuna("POZO ALMONTE");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(1);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
	}

	public void crearComunaRegionDosTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();

		comunaDTOA.setCodigoComuna("II-1");
		comunaDTOA.setNombreComuna("ANTOFAGASTA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(2);

		comunaDTOB.setCodigoComuna("II-2");
		comunaDTOB.setNombreComuna("CALAMA");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(2);

		comunaDTOC.setCodigoComuna("II-3");
		comunaDTOC.setNombreComuna("MARIA ELENA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(2);

		comunaDTOD.setCodigoComuna("II-4");
		comunaDTOD.setNombreComuna("MEJILLONES");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(2);

		comunaDTOE.setCodigoComuna("II-5");
		comunaDTOE.setNombreComuna("OLLAGUE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(2);

		comunaDTOF.setCodigoComuna("II-6");
		comunaDTOF.setNombreComuna("SAN PEDRO DE ATACAMA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(2);

		comunaDTOG.setCodigoComuna("II-7");
		comunaDTOG.setNombreComuna("SIERRA GORDA");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(2);

		comunaDTOH.setCodigoComuna("II-8");
		comunaDTOH.setNombreComuna("TALTAL");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(2);

		comunaDTOI.setCodigoComuna("II-9");
		comunaDTOI.setNombreComuna("TOCOPILLA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(2);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
	}
	public void crearComunaRegionTresTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();

		comunaDTOA.setCodigoComuna("III-1");
		comunaDTOA.setNombreComuna("ALTO DEL CARMEN");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(3);

		comunaDTOB.setCodigoComuna("III-2");
		comunaDTOB.setNombreComuna("CALDERA");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(3);

		comunaDTOC.setCodigoComuna("III-3");
		comunaDTOC.setNombreComuna("CHAÑARAL");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(3);

		comunaDTOD.setCodigoComuna("III-4");
		comunaDTOD.setNombreComuna("COPIAPO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(3);

		comunaDTOE.setCodigoComuna("III-5");
		comunaDTOE.setNombreComuna("DIEGO DE ALMAGRO");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(3);

		comunaDTOF.setCodigoComuna("III-6");
		comunaDTOF.setNombreComuna("FREIRINA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(3);

		comunaDTOG.setCodigoComuna("III-7");
		comunaDTOG.setNombreComuna("HUASCO");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(3);

		comunaDTOH.setCodigoComuna("III-8");
		comunaDTOH.setNombreComuna("TIERRA AMARILLA");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(3);

		comunaDTOI.setCodigoComuna("III-9");
		comunaDTOI.setNombreComuna("VALLENAR");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(3);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
	}
	public void crearComunaRegionCuatroTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();

		comunaDTOA.setCodigoComuna("IV-1");
		comunaDTOA.setNombreComuna("ANDACOLLO");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(4);

		comunaDTOB.setCodigoComuna("IV-2");
		comunaDTOB.setNombreComuna("CANELA");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(4);

		comunaDTOC.setCodigoComuna("IV-3");
		comunaDTOC.setNombreComuna("COMBARBALA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(4);

		comunaDTOD.setCodigoComuna("IV-4");
		comunaDTOD.setNombreComuna("COQUIMBO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(4);

		comunaDTOE.setCodigoComuna("IV-5");
		comunaDTOE.setNombreComuna("ILLAPEL");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(4);

		comunaDTOF.setCodigoComuna("IV-6");
		comunaDTOF.setNombreComuna("LA HIGUERA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(4);

		comunaDTOG.setCodigoComuna("IV-7");
		comunaDTOG.setNombreComuna("LA SERENA");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(4);

		comunaDTOH.setCodigoComuna("IV-8");
		comunaDTOH.setNombreComuna("LOS VILOS");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(4);

		comunaDTOI.setCodigoComuna("IV-9");
		comunaDTOI.setNombreComuna("MONTE PATRIA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(4);

		comunaDTOJ.setCodigoComuna("IV-10");
		comunaDTOJ.setNombreComuna("OVALLE");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(4);

		comunaDTOK.setCodigoComuna("IV-11");
		comunaDTOK.setNombreComuna("PAIHUANO");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(4);

		comunaDTOL.setCodigoComuna("IV-12");
		comunaDTOL.setNombreComuna("PUNITAQUI");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(4);

		comunaDTOM.setCodigoComuna("IV-13");
		comunaDTOM.setNombreComuna("RIO HURTADO");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(4);

		comunaDTON.setCodigoComuna("IV-14");
		comunaDTON.setNombreComuna("SALAMANCA");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(4);

		comunaDTOO.setCodigoComuna("IV-15");
		comunaDTOO.setNombreComuna("VICUÑA");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(4);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
	}

	public void crearComunaRegionCincoTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO();
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO();
		ComunaDTO comunaDTOEE=new ComunaDTO();
		ComunaDTO comunaDTOFF=new ComunaDTO();
		ComunaDTO comunaDTOGG=new ComunaDTO();
		ComunaDTO comunaDTOHH=new ComunaDTO();
		ComunaDTO comunaDTOII=new ComunaDTO();
		ComunaDTO comunaDTOJJ=new ComunaDTO();
		ComunaDTO comunaDTOKK=new ComunaDTO();
		ComunaDTO comunaDTOLL=new ComunaDTO();

		comunaDTOA.setCodigoComuna("V-1");
		comunaDTOA.setNombreComuna("ALGARROBO");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(5);

		comunaDTOB.setCodigoComuna("V-2");
		comunaDTOB.setNombreComuna("CABILDO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(5);

		comunaDTOC.setCodigoComuna("V-3");
		comunaDTOC.setNombreComuna("CALLE LARGA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(5);

		comunaDTOD.setCodigoComuna("V-4");
		comunaDTOD.setNombreComuna("CARTAGENA");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(5);

		comunaDTOE.setCodigoComuna("V-5");
		comunaDTOE.setNombreComuna("CASABLANCA");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(5);

		comunaDTOF.setCodigoComuna("V-6");
		comunaDTOF.setNombreComuna("CATEMU");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(5);

		comunaDTOG.setCodigoComuna("V-7");
		comunaDTOG.setNombreComuna("CONCON");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(5);

		comunaDTOH.setCodigoComuna("V-8");
		comunaDTOH.setNombreComuna("EL QUISCO");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(5);

		comunaDTOI.setCodigoComuna("V-9");
		comunaDTOI.setNombreComuna("EL TABO");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(5);

		comunaDTOJ.setCodigoComuna("V-10");
		comunaDTOJ.setNombreComuna("HIJUELAS");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(5);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("V-11");
		comunaDTOK.setNombreComuna("ISLA DE PASCUA");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(5);

		comunaDTOL.setCodigoComuna("V-12");
		comunaDTOL.setNombreComuna("JUAN FERNANDEZ");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(5);

		comunaDTOM.setCodigoComuna("V-13");
		comunaDTOM.setNombreComuna("LA CALERA");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(5);

		comunaDTON.setCodigoComuna("V-14");
		comunaDTON.setNombreComuna("LA CRUZ");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(5);

		comunaDTOO.setCodigoComuna("V-15");
		comunaDTOO.setNombreComuna("LA LIGUA");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(5);

		comunaDTOP.setCodigoComuna("V-16");
		comunaDTOP.setNombreComuna("LIMACHE");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(5);

		comunaDTOQ.setCodigoComuna("V-17");
		comunaDTOQ.setNombreComuna("LLAY LLAY");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(5);

		comunaDTOR.setCodigoComuna("V-18");
		comunaDTOR.setNombreComuna("LOS ANDES");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(5);

		comunaDTOS.setCodigoComuna("V-19");
		comunaDTOS.setNombreComuna("NOGALES");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(5);

		comunaDTOT.setCodigoComuna("V-20");
		comunaDTOT.setNombreComuna("OLMUE");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(5);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("V-21");
		comunaDTOU.setNombreComuna("PANQUEHUE");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(5);

		comunaDTOV.setCodigoComuna("V-22");
		comunaDTOV.setNombreComuna("PAPUDO");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(5);

		comunaDTOW.setCodigoComuna("V-23");
		comunaDTOW.setNombreComuna("PETORCA");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(5);

		comunaDTOX.setCodigoComuna("V-24");
		comunaDTOX.setNombreComuna("PUCHUNCAVI");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(5);

		comunaDTOY.setCodigoComuna("V-25");
		comunaDTOY.setNombreComuna("PUTAENDO");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(5); //25

		comunaDTOZ.setCodigoComuna("V-26");
		comunaDTOZ.setNombreComuna("QUILLOTA");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(5); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("V-27");
		comunaDTOAA.setNombreComuna("QUILPUE");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(5);

		comunaDTOBB.setCodigoComuna("V-28");
		comunaDTOBB.setNombreComuna("QUINTERO");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(5);

		comunaDTOCC.setCodigoComuna("V-29");
		comunaDTOCC.setNombreComuna("RINCONADA");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(5);

		comunaDTODD.setCodigoComuna("V-30");
		comunaDTODD.setNombreComuna("SAN ANTONIO");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(5);
		/*********OK OK***************************/
		comunaDTOEE.setCodigoComuna("V-31");
		comunaDTOEE.setNombreComuna("SAN ESTEBAN");
		comunaDTOEE.setNombreComunaLower(comunaDTOEE.getNombreComuna().toLowerCase());
		comunaDTOEE.setIdRegion(5);

		comunaDTOFF.setCodigoComuna("V-32");
		comunaDTOFF.setNombreComuna("SAN FELIPE");
		comunaDTOFF.setNombreComunaLower(comunaDTOFF.getNombreComuna().toLowerCase());
		comunaDTOFF.setIdRegion(5);

		comunaDTOGG.setCodigoComuna("V-33");
		comunaDTOGG.setNombreComuna("SANTA MARIA");
		comunaDTOGG.setNombreComunaLower(comunaDTOGG.getNombreComuna().toLowerCase());
		comunaDTOGG.setIdRegion(5);

		comunaDTOHH.setCodigoComuna("V-34");
		comunaDTOHH.setNombreComuna("SANTO DOMINGO");
		comunaDTOHH.setNombreComunaLower(comunaDTOHH.getNombreComuna().toLowerCase());
		comunaDTOHH.setIdRegion(5);

		comunaDTOII.setCodigoComuna("V-35");
		comunaDTOII.setNombreComuna("VALPARAISO");
		comunaDTOII.setNombreComunaLower(comunaDTOII.getNombreComuna().toLowerCase());
		comunaDTOII.setIdRegion(5);

		comunaDTOJJ.setCodigoComuna("V-36");
		comunaDTOJJ.setNombreComuna("VILLA ALEMANA");
		comunaDTOJJ.setNombreComunaLower(comunaDTOJJ.getNombreComuna().toLowerCase());
		comunaDTOJJ.setIdRegion(5);

		comunaDTOKK.setCodigoComuna("V-37");
		comunaDTOKK.setNombreComuna("VIÑA DEL MAR");
		comunaDTOKK.setNombreComunaLower(comunaDTOKK.getNombreComuna().toLowerCase());
		comunaDTOKK.setIdRegion(5);

		comunaDTOLL.setCodigoComuna("V-38");
		comunaDTOLL.setNombreComuna("ZAPALLAR");
		comunaDTOLL.setNombreComunaLower(comunaDTOLL.getNombreComuna().toLowerCase());
		comunaDTOLL.setIdRegion(5);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOEE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOFF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOGG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOHH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOII);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOKK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOLL); //38
	}
	public void crearComunaRegionSeisTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30
		ComunaDTO comunaDTOEE=new ComunaDTO();
		ComunaDTO comunaDTOFF=new ComunaDTO();
		ComunaDTO comunaDTOGG=new ComunaDTO(); //33

		comunaDTOA.setCodigoComuna("VI-1");
		comunaDTOA.setNombreComuna("CHEPICA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(6);

		comunaDTOB.setCodigoComuna("VI-2");
		comunaDTOB.setNombreComuna("CHIMBARONGO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(6);

		comunaDTOC.setCodigoComuna("VI-3");
		comunaDTOC.setNombreComuna("CODEGUA");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(6);

		comunaDTOD.setCodigoComuna("VI-4");
		comunaDTOD.setNombreComuna("COINCO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(6);

		comunaDTOE.setCodigoComuna("VI-5");
		comunaDTOE.setNombreComuna("COLTAUCO");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(6);

		comunaDTOF.setCodigoComuna("VI-6");
		comunaDTOF.setNombreComuna("DOÑIHUE");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(6);

		comunaDTOG.setCodigoComuna("VI-7");
		comunaDTOG.setNombreComuna("GRANEROS");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(6);

		comunaDTOH.setCodigoComuna("VI-8");
		comunaDTOH.setNombreComuna("LA ESTRELLA");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(6);

		comunaDTOI.setCodigoComuna("VI-9");
		comunaDTOI.setNombreComuna("LAS CABRAS");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(6);

		comunaDTOJ.setCodigoComuna("VI-10");
		comunaDTOJ.setNombreComuna("LITUECHE");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(6);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("VI-11");
		comunaDTOK.setNombreComuna("LOLOL");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(6);

		comunaDTOL.setCodigoComuna("VI-12");
		comunaDTOL.setNombreComuna("MACHALI");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(6);

		comunaDTOM.setCodigoComuna("VI-13");
		comunaDTOM.setNombreComuna("MALLOA");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(6);

		comunaDTON.setCodigoComuna("VI-14");
		comunaDTON.setNombreComuna("MARCHIGUE");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(6);

		comunaDTOO.setCodigoComuna("VI-15");
		comunaDTOO.setNombreComuna("NANCAGUA");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(6);

		comunaDTOP.setCodigoComuna("VI-16");
		comunaDTOP.setNombreComuna("NAVIDAD");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(6);

		comunaDTOQ.setCodigoComuna("VI-17");
		comunaDTOQ.setNombreComuna("OLIVAR");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(6);

		comunaDTOR.setCodigoComuna("VI-18");
		comunaDTOR.setNombreComuna("PALMILLA");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(6);

		comunaDTOS.setCodigoComuna("VI-19");
		comunaDTOS.setNombreComuna("PAREDONES");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(6);

		comunaDTOT.setCodigoComuna("VI-20");
		comunaDTOT.setNombreComuna("PERALILLO");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(6);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("VI-21");
		comunaDTOU.setNombreComuna("PEUMO");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(6);

		comunaDTOV.setCodigoComuna("VI-22");
		comunaDTOV.setNombreComuna("PICHIDEGUA");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(6);

		comunaDTOW.setCodigoComuna("VI-23");
		comunaDTOW.setNombreComuna("PICHILEMU");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(6);

		comunaDTOX.setCodigoComuna("VI-24");
		comunaDTOX.setNombreComuna("PLACILLA");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(6);

		comunaDTOY.setCodigoComuna("VI-25");
		comunaDTOY.setNombreComuna("PUMANQUE");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(6); //25

		comunaDTOZ.setCodigoComuna("VI-26");
		comunaDTOZ.setNombreComuna("QUINTA DE TILCOCO");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(6); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("VI-27");
		comunaDTOAA.setNombreComuna("RANCAGUA");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(6);

		comunaDTOBB.setCodigoComuna("VI-28");
		comunaDTOBB.setNombreComuna("RENGO");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(6);

		comunaDTOCC.setCodigoComuna("VI-29");
		comunaDTOCC.setNombreComuna("REQUINOA");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(6);

		comunaDTODD.setCodigoComuna("VI-30");
		comunaDTODD.setNombreComuna("SAN FERNANDO");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(6);
		/*********OK OK***************************/
		comunaDTOEE.setCodigoComuna("VI-31");
		comunaDTOEE.setNombreComuna("SAN FRANCISCO DE MOSTAZAL");
		comunaDTOEE.setNombreComunaLower(comunaDTOEE.getNombreComuna().toLowerCase());
		comunaDTOEE.setIdRegion(6);

		comunaDTOFF.setCodigoComuna("VI-32");
		comunaDTOFF.setNombreComuna("SAN VICENTE");
		comunaDTOFF.setNombreComunaLower(comunaDTOFF.getNombreComuna().toLowerCase());
		comunaDTOFF.setIdRegion(6);

		comunaDTOGG.setCodigoComuna("VI-33");
		comunaDTOGG.setNombreComuna("SANTA CRUZ");
		comunaDTOGG.setNombreComunaLower(comunaDTOGG.getNombreComuna().toLowerCase());
		comunaDTOGG.setIdRegion(6);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOEE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOFF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOGG); //33

	}
	public void crearComunaRegionSieteTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30

		comunaDTOA.setCodigoComuna("VII-1");
		comunaDTOA.setNombreComuna("CAUQUENES");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(7);

		comunaDTOB.setCodigoComuna("VII-2");
		comunaDTOB.setNombreComuna("CHANCO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(7);

		comunaDTOC.setCodigoComuna("VII-3");
		comunaDTOC.setNombreComuna("COLBUN");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(7);

		comunaDTOD.setCodigoComuna("VII-4");
		comunaDTOD.setNombreComuna("CONSTITUCION");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(7);

		comunaDTOE.setCodigoComuna("VII-5");
		comunaDTOE.setNombreComuna("CUREPTO");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(7);

		comunaDTOF.setCodigoComuna("VII-6");
		comunaDTOF.setNombreComuna("CURICO");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(7);

		comunaDTOG.setCodigoComuna("VII-7");
		comunaDTOG.setNombreComuna("EMPEDRADO");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(7);

		comunaDTOH.setCodigoComuna("VII-8");
		comunaDTOH.setNombreComuna("HUALAÑE");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(7);

		comunaDTOI.setCodigoComuna("VII-9");
		comunaDTOI.setNombreComuna("LICANTEN");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(7);

		comunaDTOJ.setCodigoComuna("VII-10");
		comunaDTOJ.setNombreComuna("LINARES");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(7);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("VII-11");
		comunaDTOK.setNombreComuna("LONGAVI");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(7);

		comunaDTOL.setCodigoComuna("VII-12");
		comunaDTOL.setNombreComuna("MAULE");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(7);

		comunaDTOM.setCodigoComuna("VII-13");
		comunaDTOM.setNombreComuna("MOLINA");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(7);

		comunaDTON.setCodigoComuna("VII-14");
		comunaDTON.setNombreComuna("PARRAL");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(7);

		comunaDTOO.setCodigoComuna("VII-15");
		comunaDTOO.setNombreComuna("PELARCO");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(7);

		comunaDTOP.setCodigoComuna("VII-16");
		comunaDTOP.setNombreComuna("PELLUHUE");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(7);

		comunaDTOQ.setCodigoComuna("VII-17");
		comunaDTOQ.setNombreComuna("PENCAHUE");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(7);

		comunaDTOR.setCodigoComuna("VII-18");
		comunaDTOR.setNombreComuna("RAUCO");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(7);

		comunaDTOS.setCodigoComuna("VII-19");
		comunaDTOS.setNombreComuna("RETIRO");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(7);

		comunaDTOT.setCodigoComuna("VII-20");
		comunaDTOT.setNombreComuna("RIO CLARO");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(7);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("VII-21");
		comunaDTOU.setNombreComuna("ROMERAL");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(7);

		comunaDTOV.setCodigoComuna("VII-22");
		comunaDTOV.setNombreComuna("SAGRADA FAMILIA");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(7);

		comunaDTOW.setCodigoComuna("VII-23");
		comunaDTOW.setNombreComuna("SAN CLEMENTE");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(7);

		comunaDTOX.setCodigoComuna("VII-24");
		comunaDTOX.setNombreComuna("SAN JAVIER");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(7);

		comunaDTOY.setCodigoComuna("VII-25");
		comunaDTOY.setNombreComuna("SAN RAFAEL");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(7); //25

		comunaDTOZ.setCodigoComuna("VII-26");
		comunaDTOZ.setNombreComuna("TALCA");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(7); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("VII-27");
		comunaDTOAA.setNombreComuna("TENO");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(7);

		comunaDTOBB.setCodigoComuna("VII-28");
		comunaDTOBB.setNombreComuna("VICHUQUEN");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(7);

		comunaDTOCC.setCodigoComuna("VII-29");
		comunaDTOCC.setNombreComuna("VILLA ALEGRE");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(7);

		comunaDTODD.setCodigoComuna("VII-30");
		comunaDTODD.setNombreComuna("YERBAS BUENAS");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(7);
		/*********OK OK***************************/

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 

	}
	public void crearComunaRegionOchoTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO(); //26
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30
		ComunaDTO comunaDTOEE=new ComunaDTO();
		ComunaDTO comunaDTOFF=new ComunaDTO();
		ComunaDTO comunaDTOGG=new ComunaDTO();
		ComunaDTO comunaDTOHH=new ComunaDTO();
		ComunaDTO comunaDTOII=new ComunaDTO();
		ComunaDTO comunaDTOJJ=new ComunaDTO();
		ComunaDTO comunaDTOKK=new ComunaDTO();
		ComunaDTO comunaDTOLL=new ComunaDTO();
		ComunaDTO comunaDTOMM=new ComunaDTO();
		ComunaDTO comunaDTONN=new ComunaDTO(); //40
		ComunaDTO comunaDTOOO=new ComunaDTO();
		ComunaDTO comunaDTOPP=new ComunaDTO();
		ComunaDTO comunaDTOQQ=new ComunaDTO();
		ComunaDTO comunaDTORR=new ComunaDTO();
		ComunaDTO comunaDTOSS=new ComunaDTO();
		ComunaDTO comunaDTOTT=new ComunaDTO();
		ComunaDTO comunaDTOUU=new ComunaDTO();
		ComunaDTO comunaDTOVV=new ComunaDTO();
		ComunaDTO comunaDTOWW=new ComunaDTO(); 
		ComunaDTO comunaDTOXX=new ComunaDTO();// 50
		ComunaDTO comunaDTOYY=new ComunaDTO();
		ComunaDTO comunaDTOZZ=new ComunaDTO(); //52

		comunaDTOA.setCodigoComuna("VIII-1");
		comunaDTOA.setNombreComuna("ANTUCO");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(8);

		comunaDTOB.setCodigoComuna("VIII-2");
		comunaDTOB.setNombreComuna("ARAUCO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(8);

		comunaDTOC.setCodigoComuna("VIII-3");
		comunaDTOC.setNombreComuna("BULNES");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(8);

		comunaDTOD.setCodigoComuna("VIII-4");
		comunaDTOD.setNombreComuna("CABRERO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(8);

		comunaDTOE.setCodigoComuna("VIII-5");
		comunaDTOE.setNombreComuna("CAÑETE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(8);

		comunaDTOF.setCodigoComuna("VIII-6");
		comunaDTOF.setNombreComuna("CHIGUAYANTE");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(8);

		comunaDTOG.setCodigoComuna("VIII-7");
		comunaDTOG.setNombreComuna("CHILLAN");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(8);

		comunaDTOH.setCodigoComuna("VIII-8");
		comunaDTOH.setNombreComuna("CHILLAN VIEJO");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(8);

		comunaDTOI.setCodigoComuna("VIII-9");
		comunaDTOI.setNombreComuna("COBQUECURA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(8);

		comunaDTOJ.setCodigoComuna("VIII-10");
		comunaDTOJ.setNombreComuna("COELEMU");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(8);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("VIII-11");
		comunaDTOK.setNombreComuna("COIHUECO");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(8);

		comunaDTOL.setCodigoComuna("VIII-12");
		comunaDTOL.setNombreComuna("CONCEPCION");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(8);

		comunaDTOM.setCodigoComuna("VIII-13");
		comunaDTOM.setNombreComuna("CONTULMO");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(8);

		comunaDTON.setCodigoComuna("VIII-14");
		comunaDTON.setNombreComuna("CORONEL");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(8);

		comunaDTOO.setCodigoComuna("VIII-15");
		comunaDTOO.setNombreComuna("CURANILAHUE");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(8);

		comunaDTOP.setCodigoComuna("VIII-16");
		comunaDTOP.setNombreComuna("EL CARMEN");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(8);

		comunaDTOQ.setCodigoComuna("VIII-17");
		comunaDTOQ.setNombreComuna("FLORIDA");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(8);

		comunaDTOR.setCodigoComuna("VIII-18");
		comunaDTOR.setNombreComuna("HUALQUI");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(8);

		comunaDTOS.setCodigoComuna("VIII-19");
		comunaDTOS.setNombreComuna("LAJA");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(8);

		comunaDTOT.setCodigoComuna("VIII-20");
		comunaDTOT.setNombreComuna("LEBU");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(8);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("VIII-21");
		comunaDTOU.setNombreComuna("LOS ALAMOS");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(8);

		comunaDTOV.setCodigoComuna("VIII-22");
		comunaDTOV.setNombreComuna("LOS ANGELES");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(8);

		comunaDTOW.setCodigoComuna("VIII-23");
		comunaDTOW.setNombreComuna("LOTA");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(8);

		comunaDTOX.setCodigoComuna("VIII-24");
		comunaDTOX.setNombreComuna("MULCHEN");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(8);

		comunaDTOY.setCodigoComuna("VIII-25");
		comunaDTOY.setNombreComuna("NACIMIENTO");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(8); //25

		comunaDTOZ.setCodigoComuna("VIII-26");
		comunaDTOZ.setNombreComuna("NEGRETE");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(8); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("VIII-27");
		comunaDTOAA.setNombreComuna("NINHUE");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(8);

		comunaDTOBB.setCodigoComuna("VIII-28");
		comunaDTOBB.setNombreComuna("PEMUCO");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(8);

		comunaDTOCC.setCodigoComuna("VIII-29");
		comunaDTOCC.setNombreComuna("PENCO");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(8);

		comunaDTODD.setCodigoComuna("VIII-30");
		comunaDTODD.setNombreComuna("PINTO");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(8);
		/*********OK OK***************************/
		comunaDTOEE.setCodigoComuna("VIII-31");
		comunaDTOEE.setNombreComuna("PORTEZUELO");
		comunaDTOEE.setNombreComunaLower(comunaDTOEE.getNombreComuna().toLowerCase());
		comunaDTOEE.setIdRegion(8);

		comunaDTOFF.setCodigoComuna("VIII-32");
		comunaDTOFF.setNombreComuna("QUILACO");
		comunaDTOFF.setNombreComunaLower(comunaDTOFF.getNombreComuna().toLowerCase());
		comunaDTOFF.setIdRegion(8);

		comunaDTOGG.setCodigoComuna("VIII-33");
		comunaDTOGG.setNombreComuna("QUILLECO");
		comunaDTOGG.setNombreComunaLower(comunaDTOGG.getNombreComuna().toLowerCase());
		comunaDTOGG.setIdRegion(8);

		comunaDTOHH.setCodigoComuna("VIII-34");
		comunaDTOHH.setNombreComuna("QUILLON");
		comunaDTOHH.setNombreComunaLower(comunaDTOHH.getNombreComuna().toLowerCase());
		comunaDTOHH.setIdRegion(8);

		comunaDTOII.setCodigoComuna("VIII-35");
		comunaDTOII.setNombreComuna("QUIRIHUE");
		comunaDTOII.setNombreComunaLower(comunaDTOII.getNombreComuna().toLowerCase());
		comunaDTOII.setIdRegion(8);

		comunaDTOJJ.setCodigoComuna("VIII-36");
		comunaDTOJJ.setNombreComuna("RANQUIL");
		comunaDTOJJ.setNombreComunaLower(comunaDTOJJ.getNombreComuna().toLowerCase());
		comunaDTOJJ.setIdRegion(8);

		comunaDTOKK.setCodigoComuna("VIII-37");
		comunaDTOKK.setNombreComuna("SAN CARLOS");
		comunaDTOKK.setNombreComunaLower(comunaDTOKK.getNombreComuna().toLowerCase());
		comunaDTOKK.setIdRegion(8);

		comunaDTOLL.setCodigoComuna("VIII-38");
		comunaDTOLL.setNombreComuna("SAN FABIAN");
		comunaDTOLL.setNombreComunaLower(comunaDTOLL.getNombreComuna().toLowerCase());
		comunaDTOLL.setIdRegion(8);

		comunaDTOMM.setCodigoComuna("VIII-39");
		comunaDTOMM.setNombreComuna("SAN GREGORIO DE ÑIQUEN");
		comunaDTOMM.setNombreComunaLower(comunaDTOMM.getNombreComuna().toLowerCase());
		comunaDTOMM.setIdRegion(8);

		comunaDTONN.setCodigoComuna("VIII-40");
		comunaDTONN.setNombreComuna("SAN IGNACIO");
		comunaDTONN.setNombreComunaLower(comunaDTONN.getNombreComuna().toLowerCase());
		comunaDTONN.setIdRegion(8);
		/*********OK OK***************************/
		comunaDTOOO.setCodigoComuna("VIII-41");
		comunaDTOOO.setNombreComuna("SAN NICOLAS");
		comunaDTOOO.setNombreComunaLower(comunaDTOOO.getNombreComuna().toLowerCase());
		comunaDTOOO.setIdRegion(8);

		comunaDTOPP.setCodigoComuna("VIII-42");
		comunaDTOPP.setNombreComuna("SAN PEDRO DE LA PAZ");
		comunaDTOPP.setNombreComunaLower(comunaDTOPP.getNombreComuna().toLowerCase());
		comunaDTOPP.setIdRegion(8);

		comunaDTOQQ.setCodigoComuna("VIII-43");
		comunaDTOQQ.setNombreComuna("SAN ROSENDO");
		comunaDTOQQ.setNombreComunaLower(comunaDTOQQ.getNombreComuna().toLowerCase());
		comunaDTOQQ.setIdRegion(8);

		comunaDTORR.setCodigoComuna("VIII-44");
		comunaDTORR.setNombreComuna("SANTA BARBARA");
		comunaDTORR.setNombreComunaLower(comunaDTORR.getNombreComuna().toLowerCase());
		comunaDTORR.setIdRegion(8);

		comunaDTOSS.setCodigoComuna("VIII-45");
		comunaDTOSS.setNombreComuna("SANTA JUANA");
		comunaDTOSS.setNombreComunaLower(comunaDTOSS.getNombreComuna().toLowerCase());
		comunaDTOSS.setIdRegion(8);

		comunaDTOTT.setCodigoComuna("VIII-46");
		comunaDTOTT.setNombreComuna("TALCAHUANO");
		comunaDTOTT.setNombreComunaLower(comunaDTOTT.getNombreComuna().toLowerCase());
		comunaDTOTT.setIdRegion(8);

		comunaDTOUU.setCodigoComuna("VIII-47");
		comunaDTOUU.setNombreComuna("TIRUA");
		comunaDTOUU.setNombreComunaLower(comunaDTOUU.getNombreComuna().toLowerCase());
		comunaDTOUU.setIdRegion(8);

		comunaDTOVV.setCodigoComuna("VIII-48");
		comunaDTOVV.setNombreComuna("TOME");
		comunaDTOVV.setNombreComunaLower(comunaDTOVV.getNombreComuna().toLowerCase());
		comunaDTOVV.setIdRegion(8);

		comunaDTOWW.setCodigoComuna("VIII-49");
		comunaDTOWW.setNombreComuna("TREHUACO");
		comunaDTOWW.setNombreComunaLower(comunaDTOWW.getNombreComuna().toLowerCase());
		comunaDTOWW.setIdRegion(8);

		comunaDTOXX.setCodigoComuna("VIII-50");
		comunaDTOXX.setNombreComuna("TUCAPEL");
		comunaDTOXX.setNombreComunaLower(comunaDTOXX.getNombreComuna().toLowerCase());
		comunaDTOXX.setIdRegion(8);
		/***********OK OK**********************************/
		comunaDTOYY.setCodigoComuna("VIII-51");
		comunaDTOYY.setNombreComuna("YUMBEL");
		comunaDTOYY.setNombreComunaLower(comunaDTOYY.getNombreComuna().toLowerCase());
		comunaDTOYY.setIdRegion(8); //25

		comunaDTOZZ.setCodigoComuna("VIII-52");
		comunaDTOZZ.setNombreComuna("YUNGAY");
		comunaDTOZZ.setNombreComunaLower(comunaDTOZZ.getNombreComuna().toLowerCase());
		comunaDTOZZ.setIdRegion(8); //26 no hay ñ

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOEE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOFF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOGG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOHH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOII);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOKK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOLL); //38
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOMM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTONN);
		// 40 // 40 // 40 // 40 // 40 // 40 // 40 // 40 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOPP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTORR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOSS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOTT);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOUU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOVV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOWW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOXX);
		// 50 // 50 // 50 // 50 // 50 // 50 // 50 // 50  
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOYY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZZ); //52
	}
	public void crearComunaRegionNueveTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30
		ComunaDTO comunaDTOEE=new ComunaDTO();

		comunaDTOA.setCodigoComuna("IX-1");
		comunaDTOA.setNombreComuna("ANGOL");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(9);

		comunaDTOB.setCodigoComuna("IX-2");
		comunaDTOB.setNombreComuna("CARAHUE");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(9);

		comunaDTOC.setCodigoComuna("IX-3");
		comunaDTOC.setNombreComuna("COLLIPULLI");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(9);

		comunaDTOD.setCodigoComuna("IX-4");
		comunaDTOD.setNombreComuna("CUNCO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(9);

		comunaDTOE.setCodigoComuna("IX-5");
		comunaDTOE.setNombreComuna("CURACAUTIN");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(9);

		comunaDTOF.setCodigoComuna("IX-6");
		comunaDTOF.setNombreComuna("CURARREHUE");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(9);

		comunaDTOG.setCodigoComuna("IX-7");
		comunaDTOG.setNombreComuna("ERCILLA");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(9);

		comunaDTOH.setCodigoComuna("IX-8");
		comunaDTOH.setNombreComuna("GALVARINO");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(9);

		comunaDTOI.setCodigoComuna("IX-9");
		comunaDTOI.setNombreComuna("GORBEA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(9);

		comunaDTOJ.setCodigoComuna("IX-10");
		comunaDTOJ.setNombreComuna("LAUTARO");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(9);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("IX-11");
		comunaDTOK.setNombreComuna("LONCOCHE");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(9);

		comunaDTOL.setCodigoComuna("IX-12");
		comunaDTOL.setNombreComuna("LONQUIMAY");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(9);

		comunaDTOM.setCodigoComuna("IX-13");
		comunaDTOM.setNombreComuna("LOS SAUCES");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(9);

		comunaDTON.setCodigoComuna("IX-14");
		comunaDTON.setNombreComuna("LUMACO");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(9);

		comunaDTOO.setCodigoComuna("IX-15");
		comunaDTOO.setNombreComuna("MELIPEUCO");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(9);

		comunaDTOP.setCodigoComuna("IX-16");
		comunaDTOP.setNombreComuna("NUEVA IMPERIAL");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(9);

		comunaDTOQ.setCodigoComuna("IX-17");
		comunaDTOQ.setNombreComuna("PADRE LAS CASAS");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(9);

		comunaDTOR.setCodigoComuna("IX-18");
		comunaDTOR.setNombreComuna("PERQUENCO");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(9);

		comunaDTOS.setCodigoComuna("IX-19");
		comunaDTOS.setNombreComuna("PITRUFQUEN");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(9);

		comunaDTOT.setCodigoComuna("IX-20");
		comunaDTOT.setNombreComuna("PUCON");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(9);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("IX-21");
		comunaDTOU.setNombreComuna("PUERTO SAAVEDRA");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(9);

		comunaDTOV.setCodigoComuna("IX-22");
		comunaDTOV.setNombreComuna("PUREN");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(9);

		comunaDTOW.setCodigoComuna("IX-23");
		comunaDTOW.setNombreComuna("RENAICO");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(9);

		comunaDTOX.setCodigoComuna("IX-24");
		comunaDTOX.setNombreComuna("SAN JAVIER");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(9);

		comunaDTOY.setCodigoComuna("IX-25");
		comunaDTOY.setNombreComuna("TEMUCO");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(9); //25

		comunaDTOZ.setCodigoComuna("IX-26");
		comunaDTOZ.setNombreComuna("TEODORO SCHMIDT");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(9); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("IX-27");
		comunaDTOAA.setNombreComuna("TOLTEN");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(9);

		comunaDTOBB.setCodigoComuna("IX-28");
		comunaDTOBB.setNombreComuna("TRAIGUEN");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(9);

		comunaDTOCC.setCodigoComuna("IX-29");
		comunaDTOCC.setNombreComuna("VICTORIA");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(9);

		comunaDTODD.setCodigoComuna("IX-30");
		comunaDTODD.setNombreComuna("VILCUN");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(9);
		/*********OK OK***************************/
		comunaDTOEE.setCodigoComuna("IX-31");
		comunaDTOEE.setNombreComuna("VILLARICA");
		comunaDTOEE.setNombreComunaLower(comunaDTOEE.getNombreComuna().toLowerCase());
		comunaDTOEE.setIdRegion(9);


		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOEE);
	}
	public void crearComunaRegionDiezTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO();
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30

		comunaDTOA.setCodigoComuna("X-1");
		comunaDTOA.setNombreComuna("ANCUD");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(10);

		comunaDTOB.setCodigoComuna("X-2");
		comunaDTOB.setNombreComuna("CALBUCO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(10);

		comunaDTOC.setCodigoComuna("X-3");
		comunaDTOC.setNombreComuna("CASTRO");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(10);

		comunaDTOD.setCodigoComuna("X-4");
		comunaDTOD.setNombreComuna("CHAITEN");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(10);

		comunaDTOE.setCodigoComuna("X-5");
		comunaDTOE.setNombreComuna("CHONCHI");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(10);

		comunaDTOF.setCodigoComuna("X-6");
		comunaDTOF.setNombreComuna("COCHAMO");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(10);

		comunaDTOG.setCodigoComuna("X-7");
		comunaDTOG.setNombreComuna("CURACO DE VELEZ");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(10);

		comunaDTOH.setCodigoComuna("X-8");
		comunaDTOH.setNombreComuna("DALCAHUE");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(10);

		comunaDTOI.setCodigoComuna("X-9");
		comunaDTOI.setNombreComuna("FRESIA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(10);

		comunaDTOJ.setCodigoComuna("X-10");
		comunaDTOJ.setNombreComuna("FRUTILLAR");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(10);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("X-11");
		comunaDTOK.setNombreComuna("FUTALEUFU");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(10);

		comunaDTOL.setCodigoComuna("X-12");
		comunaDTOL.setNombreComuna("HUALAIHUE");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(10);

		comunaDTOM.setCodigoComuna("X-13");
		comunaDTOM.setNombreComuna("LLANQUIHUE");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(10);

		comunaDTON.setCodigoComuna("X-14");
		comunaDTON.setNombreComuna("LOS MUERMOS");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(10);

		comunaDTOO.setCodigoComuna("X-15");
		comunaDTOO.setNombreComuna("MAULLIN");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(10);

		comunaDTOP.setCodigoComuna("X-16");
		comunaDTOP.setNombreComuna("OSORNO");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(10);

		comunaDTOQ.setCodigoComuna("X-17");
		comunaDTOQ.setNombreComuna("PALENA");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(10);

		comunaDTOR.setCodigoComuna("X-18");
		comunaDTOR.setNombreComuna("PUERTO MONTT");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(10);

		comunaDTOS.setCodigoComuna("X-19");
		comunaDTOS.setNombreComuna("PUERTO OCTAY");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(10);

		comunaDTOT.setCodigoComuna("X-20");
		comunaDTOT.setNombreComuna("PUERTO VARAS");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(10);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("X-21");
		comunaDTOU.setNombreComuna("PUQUELDON");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(10);

		comunaDTOV.setCodigoComuna("X-22");
		comunaDTOV.setNombreComuna("PURRANQUE");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(10);

		comunaDTOW.setCodigoComuna("X-23");
		comunaDTOW.setNombreComuna("PUYEHUE");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(10);

		comunaDTOX.setCodigoComuna("X-24");
		comunaDTOX.setNombreComuna("QUEILEN");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(10);

		comunaDTOY.setCodigoComuna("X-25");
		comunaDTOY.setNombreComuna("QUELLON");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(10); //25

		comunaDTOZ.setCodigoComuna("X-26");
		comunaDTOZ.setNombreComuna("QUEMCHI");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(10); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("X-27");
		comunaDTOAA.setNombreComuna("QUINCHAO");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(10);

		comunaDTOBB.setCodigoComuna("X-28");
		comunaDTOBB.setNombreComuna("RIO NEGRO");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(10);

		comunaDTOCC.setCodigoComuna("X-29");
		comunaDTOCC.setNombreComuna("SAN JUAN DE LA COSTA");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(10);

		comunaDTODD.setCodigoComuna("X-30");
		comunaDTODD.setNombreComuna("SAN PABLO");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(10);
		/*********OK OK***************************/
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
	}
	public void crearComunaRegionOnceTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();

		comunaDTOA.setCodigoComuna("XI-1");
		comunaDTOA.setNombreComuna("AYSEN");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(11);

		comunaDTOB.setCodigoComuna("XI-2");
		comunaDTOB.setNombreComuna("CHILE CHICO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(11);

		comunaDTOC.setCodigoComuna("XI-3");
		comunaDTOC.setNombreComuna("CISNES");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(11);

		comunaDTOD.setCodigoComuna("XI-4");
		comunaDTOD.setNombreComuna("COCHRANE");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(11);

		comunaDTOE.setCodigoComuna("XI-5");
		comunaDTOE.setNombreComuna("COYHAIQUE");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(11);

		comunaDTOF.setCodigoComuna("XI-6");
		comunaDTOF.setNombreComuna("GUAITECAS");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(11);

		comunaDTOG.setCodigoComuna("XI-7");
		comunaDTOG.setNombreComuna("LAGO VERDE");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(11);

		comunaDTOH.setCodigoComuna("XI-8");
		comunaDTOH.setNombreComuna("OHIGGINS");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(11);

		comunaDTOI.setCodigoComuna("XI-9");
		comunaDTOI.setNombreComuna("RIO IBAÑEZ");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(11);

		comunaDTOJ.setCodigoComuna("XI-10");
		comunaDTOJ.setNombreComuna("TORTEL");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(11);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
	}
	public void crearComunaRegionDoceTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();

		comunaDTOA.setCodigoComuna("XII-1");
		comunaDTOA.setNombreComuna("LAGUNA BLANCA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(12);

		comunaDTOB.setCodigoComuna("XII-2");
		comunaDTOB.setNombreComuna("NAVARINO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(12);

		comunaDTOC.setCodigoComuna("XII-3");
		comunaDTOC.setNombreComuna("PORVENIR");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(12);

		comunaDTOD.setCodigoComuna("XII-4");
		comunaDTOD.setNombreComuna("PRIMAVERA");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(12);

		comunaDTOE.setCodigoComuna("XII-5");
		comunaDTOE.setNombreComuna("PUERTO NATALES");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(12);

		comunaDTOF.setCodigoComuna("XII-6");
		comunaDTOF.setNombreComuna("PUNTA ARENAS");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(12);

		comunaDTOG.setCodigoComuna("XII-7");
		comunaDTOG.setNombreComuna("RIO VERDE");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(12);

		comunaDTOH.setCodigoComuna("XII-8");
		comunaDTOH.setNombreComuna("SAN GREGORIO");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(12);

		comunaDTOI.setCodigoComuna("XII-9");
		comunaDTOI.setNombreComuna("TIMAUKEL");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(12);

		comunaDTOJ.setCodigoComuna("XII-10");
		comunaDTOJ.setNombreComuna("TORRES DEL PAINE");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(12);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
	}
	public void crearComunaRegionRMTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO(); //10
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();
		ComunaDTO comunaDTOM=new ComunaDTO();
		ComunaDTO comunaDTON=new ComunaDTO();
		ComunaDTO comunaDTOO=new ComunaDTO();
		ComunaDTO comunaDTOP=new ComunaDTO();
		ComunaDTO comunaDTOQ=new ComunaDTO();
		ComunaDTO comunaDTOR=new ComunaDTO();
		ComunaDTO comunaDTOS=new ComunaDTO();
		ComunaDTO comunaDTOT=new ComunaDTO(); //20
		ComunaDTO comunaDTOU=new ComunaDTO();
		ComunaDTO comunaDTOV=new ComunaDTO();
		ComunaDTO comunaDTOW=new ComunaDTO();
		ComunaDTO comunaDTOX=new ComunaDTO();
		ComunaDTO comunaDTOY=new ComunaDTO();
		ComunaDTO comunaDTOZ=new ComunaDTO(); //26
		ComunaDTO comunaDTOAA=new ComunaDTO();
		ComunaDTO comunaDTOBB=new ComunaDTO();
		ComunaDTO comunaDTOCC=new ComunaDTO();
		ComunaDTO comunaDTODD=new ComunaDTO(); //30
		ComunaDTO comunaDTOEE=new ComunaDTO();
		ComunaDTO comunaDTOFF=new ComunaDTO();
		ComunaDTO comunaDTOGG=new ComunaDTO();
		ComunaDTO comunaDTOHH=new ComunaDTO();
		ComunaDTO comunaDTOII=new ComunaDTO();
		ComunaDTO comunaDTOJJ=new ComunaDTO();
		ComunaDTO comunaDTOKK=new ComunaDTO();
		ComunaDTO comunaDTOLL=new ComunaDTO();
		ComunaDTO comunaDTOMM=new ComunaDTO();
		ComunaDTO comunaDTONN=new ComunaDTO(); //40
		ComunaDTO comunaDTOOO=new ComunaDTO();
		ComunaDTO comunaDTOPP=new ComunaDTO();
		ComunaDTO comunaDTOQQ=new ComunaDTO();
		ComunaDTO comunaDTORR=new ComunaDTO();
		ComunaDTO comunaDTOSS=new ComunaDTO();
		ComunaDTO comunaDTOTT=new ComunaDTO();
		ComunaDTO comunaDTOUU=new ComunaDTO();
		ComunaDTO comunaDTOVV=new ComunaDTO();
		ComunaDTO comunaDTOWW=new ComunaDTO(); 
		ComunaDTO comunaDTOXX=new ComunaDTO();// 50
		ComunaDTO comunaDTOYY=new ComunaDTO();
		ComunaDTO comunaDTOZZ=new ComunaDTO(); 

		comunaDTOA.setCodigoComuna("RM-1");
		comunaDTOA.setNombreComuna("ALHUE");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(13);

		comunaDTOB.setCodigoComuna("RM-2");
		comunaDTOB.setNombreComuna("BUIN");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(13);

		comunaDTOC.setCodigoComuna("RM-3");
		comunaDTOC.setNombreComuna("CALERA DE TANGO");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(13);

		comunaDTOD.setCodigoComuna("RM-4");
		comunaDTOD.setNombreComuna("CERRILLOS");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(13);

		comunaDTOE.setCodigoComuna("RM-5");
		comunaDTOE.setNombreComuna("CERRO NAVIA");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(13);

		comunaDTOF.setCodigoComuna("RM-6");
		comunaDTOF.setNombreComuna("COLINA");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(13);

		comunaDTOG.setCodigoComuna("RM-7");
		comunaDTOG.setNombreComuna("CONCHALI");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(13);

		comunaDTOH.setCodigoComuna("RM-8");
		comunaDTOH.setNombreComuna("CURACAVI");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(13);

		comunaDTOI.setCodigoComuna("RM-9");
		comunaDTOI.setNombreComuna("EL BOSQUE");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(13);

		comunaDTOJ.setCodigoComuna("RM-10");
		comunaDTOJ.setNombreComuna("EL MONTE");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(13);
		/*************OK**********************/
		comunaDTOK.setCodigoComuna("RM-11");
		comunaDTOK.setNombreComuna("ESTACION CENTRAL");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(13);

		comunaDTOL.setCodigoComuna("RM-12");
		comunaDTOL.setNombreComuna("HUECHURABA");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(13);

		comunaDTOM.setCodigoComuna("RM-13");
		comunaDTOM.setNombreComuna("INDEPENDENCIA");
		comunaDTOM.setNombreComunaLower(comunaDTOM.getNombreComuna().toLowerCase());
		comunaDTOM.setIdRegion(13);

		comunaDTON.setCodigoComuna("RM-14");
		comunaDTON.setNombreComuna("ISLA DE MAIPO");
		comunaDTON.setNombreComunaLower(comunaDTON.getNombreComuna().toLowerCase());
		comunaDTON.setIdRegion(13);

		comunaDTOO.setCodigoComuna("RM-15");
		comunaDTOO.setNombreComuna("LA CISTERNA");
		comunaDTOO.setNombreComunaLower(comunaDTOO.getNombreComuna().toLowerCase());
		comunaDTOO.setIdRegion(13);

		comunaDTOP.setCodigoComuna("RM-16");
		comunaDTOP.setNombreComuna("LA FLORIDA");
		comunaDTOP.setNombreComunaLower(comunaDTOP.getNombreComuna().toLowerCase());
		comunaDTOP.setIdRegion(13);

		comunaDTOQ.setCodigoComuna("RM-17");
		comunaDTOQ.setNombreComuna("LA GRANJA");
		comunaDTOQ.setNombreComunaLower(comunaDTOQ.getNombreComuna().toLowerCase());
		comunaDTOQ.setIdRegion(13);

		comunaDTOR.setCodigoComuna("RM-18");
		comunaDTOR.setNombreComuna("LA PINTANA");
		comunaDTOR.setNombreComunaLower(comunaDTOR.getNombreComuna().toLowerCase());
		comunaDTOR.setIdRegion(13);

		comunaDTOS.setCodigoComuna("RM-19");
		comunaDTOS.setNombreComuna("LA REINA");
		comunaDTOS.setNombreComunaLower(comunaDTOS.getNombreComuna().toLowerCase());
		comunaDTOS.setIdRegion(13);

		comunaDTOT.setCodigoComuna("RM-20");
		comunaDTOT.setNombreComuna("LAMPA");
		comunaDTOT.setNombreComunaLower(comunaDTOT.getNombreComuna().toLowerCase());
		comunaDTOT.setIdRegion(13);
		/***********OK OK**********************************/
		comunaDTOU.setCodigoComuna("RM-21");
		comunaDTOU.setNombreComuna("LAS CONDES");
		comunaDTOU.setNombreComunaLower(comunaDTOU.getNombreComuna().toLowerCase());
		comunaDTOU.setIdRegion(13);

		comunaDTOV.setCodigoComuna("RM-22");
		comunaDTOV.setNombreComuna("LO BARNECHEA");
		comunaDTOV.setNombreComunaLower(comunaDTOV.getNombreComuna().toLowerCase());
		comunaDTOV.setIdRegion(13);

		comunaDTOW.setCodigoComuna("RM-23");
		comunaDTOW.setNombreComuna("LO ESPEJO");
		comunaDTOW.setNombreComunaLower(comunaDTOW.getNombreComuna().toLowerCase());
		comunaDTOW.setIdRegion(13);

		comunaDTOX.setCodigoComuna("RM-24");
		comunaDTOX.setNombreComuna("LO PRADO");
		comunaDTOX.setNombreComunaLower(comunaDTOX.getNombreComuna().toLowerCase());
		comunaDTOX.setIdRegion(13);

		comunaDTOY.setCodigoComuna("RM-25");
		comunaDTOY.setNombreComuna("MACUL");
		comunaDTOY.setNombreComunaLower(comunaDTOY.getNombreComuna().toLowerCase());
		comunaDTOY.setIdRegion(13); //25

		comunaDTOZ.setCodigoComuna("RM-26");
		comunaDTOZ.setNombreComuna("MAIPU");
		comunaDTOZ.setNombreComunaLower(comunaDTOZ.getNombreComuna().toLowerCase());
		comunaDTOZ.setIdRegion(13); //26 no hay ñ

		comunaDTOAA.setCodigoComuna("RM-27");
		comunaDTOAA.setNombreComuna("MARIA PINTO");
		comunaDTOAA.setNombreComunaLower(comunaDTOAA.getNombreComuna().toLowerCase());
		comunaDTOAA.setIdRegion(13);

		comunaDTOBB.setCodigoComuna("RM-28");
		comunaDTOBB.setNombreComuna("MELIPILLA");
		comunaDTOBB.setNombreComunaLower(comunaDTOBB.getNombreComuna().toLowerCase());
		comunaDTOBB.setIdRegion(13);

		comunaDTOCC.setCodigoComuna("RM-29");
		comunaDTOCC.setNombreComuna("ÑUÑOA");
		comunaDTOCC.setNombreComunaLower(comunaDTOCC.getNombreComuna().toLowerCase());
		comunaDTOCC.setIdRegion(13);

		comunaDTODD.setCodigoComuna("RM-30");
		comunaDTODD.setNombreComuna("PADRE HURTADO");
		comunaDTODD.setNombreComunaLower(comunaDTODD.getNombreComuna().toLowerCase());
		comunaDTODD.setIdRegion(13);
		/*********OK OK***************************/
		comunaDTOEE.setCodigoComuna("RM-31");
		comunaDTOEE.setNombreComuna("PAINE");
		comunaDTOEE.setNombreComunaLower(comunaDTOEE.getNombreComuna().toLowerCase());
		comunaDTOEE.setIdRegion(13);

		comunaDTOFF.setCodigoComuna("RM-32");
		comunaDTOFF.setNombreComuna("PEDRO AGUIRRE CERDA");
		comunaDTOFF.setNombreComunaLower(comunaDTOFF.getNombreComuna().toLowerCase());
		comunaDTOFF.setIdRegion(13);

		comunaDTOGG.setCodigoComuna("RM-33");
		comunaDTOGG.setNombreComuna("PEÑAFLOR");
		comunaDTOGG.setNombreComunaLower(comunaDTOGG.getNombreComuna().toLowerCase());
		comunaDTOGG.setIdRegion(13);

		comunaDTOHH.setCodigoComuna("RM-34");
		comunaDTOHH.setNombreComuna("PEÑALOLEN");
		comunaDTOHH.setNombreComunaLower(comunaDTOHH.getNombreComuna().toLowerCase());
		comunaDTOHH.setIdRegion(13);

		comunaDTOII.setCodigoComuna("RM-35");
		comunaDTOII.setNombreComuna("PIRQUE");
		comunaDTOII.setNombreComunaLower(comunaDTOII.getNombreComuna().toLowerCase());
		comunaDTOII.setIdRegion(13);

		comunaDTOJJ.setCodigoComuna("RM-36");
		comunaDTOJJ.setNombreComuna("PROVIDENCIA");
		comunaDTOJJ.setNombreComunaLower(comunaDTOJJ.getNombreComuna().toLowerCase());
		comunaDTOJJ.setIdRegion(13);

		comunaDTOKK.setCodigoComuna("RM-37");
		comunaDTOKK.setNombreComuna("PUDAHUEL");
		comunaDTOKK.setNombreComunaLower(comunaDTOKK.getNombreComuna().toLowerCase());
		comunaDTOKK.setIdRegion(13);

		comunaDTOLL.setCodigoComuna("RM-38");
		comunaDTOLL.setNombreComuna("PUENTE ALTO");
		comunaDTOLL.setNombreComunaLower(comunaDTOLL.getNombreComuna().toLowerCase());
		comunaDTOLL.setIdRegion(13);

		comunaDTOMM.setCodigoComuna("RM-39");
		comunaDTOMM.setNombreComuna("QUILICURA");
		comunaDTOMM.setNombreComunaLower(comunaDTOMM.getNombreComuna().toLowerCase());
		comunaDTOMM.setIdRegion(13);

		comunaDTONN.setCodigoComuna("RM-40");
		comunaDTONN.setNombreComuna("QUINTA NORMAL");
		comunaDTONN.setNombreComunaLower(comunaDTONN.getNombreComuna().toLowerCase());
		comunaDTONN.setIdRegion(13);
		/*********OK OK***************************/
		comunaDTOOO.setCodigoComuna("RM-41");
		comunaDTOOO.setNombreComuna("RECOLETA");
		comunaDTOOO.setNombreComunaLower(comunaDTOOO.getNombreComuna().toLowerCase());
		comunaDTOOO.setIdRegion(13);

		comunaDTOPP.setCodigoComuna("RM-42");
		comunaDTOPP.setNombreComuna("RENCA");
		comunaDTOPP.setNombreComunaLower(comunaDTOPP.getNombreComuna().toLowerCase());
		comunaDTOPP.setIdRegion(13);

		comunaDTOQQ.setCodigoComuna("RM-43");
		comunaDTOQQ.setNombreComuna("SAN BERNARDO");
		comunaDTOQQ.setNombreComunaLower(comunaDTOQQ.getNombreComuna().toLowerCase());
		comunaDTOQQ.setIdRegion(13);

		comunaDTORR.setCodigoComuna("RM-44");
		comunaDTORR.setNombreComuna("SAN JOAQUIN");
		comunaDTORR.setNombreComunaLower(comunaDTORR.getNombreComuna().toLowerCase());
		comunaDTORR.setIdRegion(13);

		comunaDTOSS.setCodigoComuna("RM-45");
		comunaDTOSS.setNombreComuna("SAN JOSE DE MAIPO");
		comunaDTOSS.setNombreComunaLower(comunaDTOSS.getNombreComuna().toLowerCase());
		comunaDTOSS.setIdRegion(13);

		comunaDTOTT.setCodigoComuna("RM-46");
		comunaDTOTT.setNombreComuna("SAN MIGUEL");
		comunaDTOTT.setNombreComunaLower(comunaDTOTT.getNombreComuna().toLowerCase());
		comunaDTOTT.setIdRegion(13);

		comunaDTOUU.setCodigoComuna("RM-47");
		comunaDTOUU.setNombreComuna("SAN PEDRO");
		comunaDTOUU.setNombreComunaLower(comunaDTOUU.getNombreComuna().toLowerCase());
		comunaDTOUU.setIdRegion(13);

		comunaDTOVV.setCodigoComuna("RM-48");
		comunaDTOVV.setNombreComuna("SAN RAMON");
		comunaDTOVV.setNombreComunaLower(comunaDTOVV.getNombreComuna().toLowerCase());
		comunaDTOVV.setIdRegion(13);

		comunaDTOWW.setCodigoComuna("RM-49");
		comunaDTOWW.setNombreComuna("SANTIAGO CENTRO");
		comunaDTOWW.setNombreComunaLower(comunaDTOWW.getNombreComuna().toLowerCase());
		comunaDTOWW.setIdRegion(13);

		comunaDTOXX.setCodigoComuna("RM-50");
		comunaDTOXX.setNombreComuna("TALAGANTE");
		comunaDTOXX.setNombreComunaLower(comunaDTOXX.getNombreComuna().toLowerCase());
		comunaDTOXX.setIdRegion(13);
		/***********OK OK**********************************/
		comunaDTOYY.setCodigoComuna("RM-51");
		comunaDTOYY.setNombreComuna("TIL-TIL");
		comunaDTOYY.setNombreComunaLower(comunaDTOYY.getNombreComuna().toLowerCase());
		comunaDTOYY.setIdRegion(13); //25

		comunaDTOZZ.setCodigoComuna("RM-52");
		comunaDTOZZ.setNombreComuna("VITACURA");
		comunaDTOZZ.setNombreComunaLower(comunaDTOZZ.getNombreComuna().toLowerCase());
		comunaDTOZZ.setIdRegion(13); //

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		//10 //10 //10 //10 //10 //10 //10 //10 //10
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTON);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOT);
		//20 //20 //20 //20 //20 //20 //20 //20 //20
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOX);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOAA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOBB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOCC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTODD);
		//30 //30 //30 //30 //30 //30 //30 //30 //30 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOEE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOFF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOGG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOHH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOII);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOKK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOLL); //38
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOMM);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTONN);
		// 40 // 40 // 40 // 40 // 40 // 40 // 40 // 40 
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOOO);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOPP);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOQQ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTORR);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOSS);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOTT);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOUU);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOVV);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOWW);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOXX);
		// 50 // 50 // 50 // 50 // 50 // 50 // 50 // 50  
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOYY);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOZZ); //52
	}
	public void crearComunaRegionCatorceTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();
		ComunaDTO comunaDTOE=new ComunaDTO();
		ComunaDTO comunaDTOF=new ComunaDTO();
		ComunaDTO comunaDTOG=new ComunaDTO();
		ComunaDTO comunaDTOH=new ComunaDTO();
		ComunaDTO comunaDTOI=new ComunaDTO();
		ComunaDTO comunaDTOJ=new ComunaDTO();
		ComunaDTO comunaDTOK=new ComunaDTO();
		ComunaDTO comunaDTOL=new ComunaDTO();

		comunaDTOA.setCodigoComuna("XIV-1");
		comunaDTOA.setNombreComuna("CORRAL");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(14);

		comunaDTOB.setCodigoComuna("XIV-2");
		comunaDTOB.setNombreComuna("FUTRONO");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(14);

		comunaDTOC.setCodigoComuna("XIV-3");
		comunaDTOC.setNombreComuna("LA UNION");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(14);

		comunaDTOD.setCodigoComuna("XIV-4");
		comunaDTOD.setNombreComuna("LAGO RANCO");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(14);

		comunaDTOE.setCodigoComuna("XIV-5");
		comunaDTOE.setNombreComuna("LANCO");
		comunaDTOE.setNombreComunaLower(comunaDTOE.getNombreComuna().toLowerCase());
		comunaDTOE.setIdRegion(14);

		comunaDTOF.setCodigoComuna("XIV-6");
		comunaDTOF.setNombreComuna("LOS LAGOS");
		comunaDTOF.setNombreComunaLower(comunaDTOF.getNombreComuna().toLowerCase());
		comunaDTOF.setIdRegion(14);

		comunaDTOG.setCodigoComuna("XIV-7");
		comunaDTOG.setNombreComuna("MAFIL");
		comunaDTOG.setNombreComunaLower(comunaDTOG.getNombreComuna().toLowerCase());
		comunaDTOG.setIdRegion(14);

		comunaDTOH.setCodigoComuna("XIV-8");
		comunaDTOH.setNombreComuna("MARIQUINA");
		comunaDTOH.setNombreComunaLower(comunaDTOH.getNombreComuna().toLowerCase());
		comunaDTOH.setIdRegion(14);

		comunaDTOI.setCodigoComuna("XIV-9");
		comunaDTOI.setNombreComuna("VALDIVIA");
		comunaDTOI.setNombreComunaLower(comunaDTOI.getNombreComuna().toLowerCase());
		comunaDTOI.setIdRegion(14);

		comunaDTOJ.setCodigoComuna("XIV-10");
		comunaDTOJ.setNombreComuna("PANGUIPULLI");
		comunaDTOJ.setNombreComunaLower(comunaDTOJ.getNombreComuna().toLowerCase());
		comunaDTOJ.setIdRegion(14);

		comunaDTOK.setCodigoComuna("XIV-11");
		comunaDTOK.setNombreComuna("PAILLACO");
		comunaDTOK.setNombreComunaLower(comunaDTOK.getNombreComuna().toLowerCase());
		comunaDTOK.setIdRegion(14);

		comunaDTOL.setCodigoComuna("XIV-12");
		comunaDTOL.setNombreComuna("RIO BUENO");
		comunaDTOL.setNombreComunaLower(comunaDTOL.getNombreComuna().toLowerCase());
		comunaDTOL.setIdRegion(14);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOE);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOF);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOG);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOH);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOI);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOJ);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOK);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOL);
	}
	public void crearComunaRegionQuinceTest(){

		ComunaDTO comunaDTOA=new ComunaDTO();
		ComunaDTO comunaDTOB=new ComunaDTO();
		ComunaDTO comunaDTOC=new ComunaDTO();
		ComunaDTO comunaDTOD=new ComunaDTO();

		comunaDTOA.setCodigoComuna("XV-1");
		comunaDTOA.setNombreComuna("ARICA");
		comunaDTOA.setNombreComunaLower(comunaDTOA.getNombreComuna().toLowerCase());
		comunaDTOA.setIdRegion(15);

		comunaDTOB.setCodigoComuna("XV-2");
		comunaDTOB.setNombreComuna("CAMARONES");
		comunaDTOB.setNombreComunaLower(comunaDTOB.getNombreComuna().toLowerCase());
		comunaDTOB.setIdRegion(15);

		comunaDTOC.setCodigoComuna("XV-3");
		comunaDTOC.setNombreComuna("GENERAL LAGOS");
		comunaDTOC.setNombreComunaLower(comunaDTOC.getNombreComuna().toLowerCase());
		comunaDTOC.setIdRegion(15);

		comunaDTOD.setCodigoComuna("XV-4");
		comunaDTOD.setNombreComuna("PUTRE");
		comunaDTOD.setNombreComunaLower(comunaDTOD.getNombreComuna().toLowerCase());
		comunaDTOD.setIdRegion(15);

		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOA);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOB);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOC);
		factoryServicioDAO.getComunaServicio().crearComunaDTO(comunaDTOD);
	}



//	public void crearAplicacionServicioTest(){
//		objLog.info("crearAplicacionServicioTest");
//		//Solo Una Aplicación
//		AplicacionDTO aplicacionDTO=new AplicacionDTO();
//		aplicacionDTO.setNombreAplicacion("Solicitudes Facultad de Artes Universidad de Chile"); //Nombre a Mostrar
//		aplicacionDTO.setNombreAplicacionLower(aplicacionDTO.getNombreAplicacion().toLowerCase()); //Nombre a Mostrar en minuscula
//		aplicacionDTO.setDescripcionAplicacion("");
//		aplicacionDTO.setEstadoAplicacion(1);
//
//		factoryServicioDAO.getAplicacionServicio().crearAplicacionDTO(aplicacionDTO);
//	}

	//	public void crearVersionSemestralTest(){
	//		objLog.info("crearAplicacionServicioTest");
	//		//Solo Una Aplicación
	//		VersionSemestralDTO versionSemestralDTOA=new VersionSemestralDTO();
	//		versionSemestralDTOA.setTituloVersionSemestral("Primer Semestre del 2017"); //Nombre a Mostrar
	//		VersionSemestralDTO versionSemestralDTOB=new VersionSemestralDTO();
	//		versionSemestralDTOB.setTituloVersionSemestral("Segundo Semestre del 2017"); //Nombre a Mostrar
	//		VersionSemestralDTO versionSemestralDTOC=new VersionSemestralDTO();
	//		versionSemestralDTOC.setTituloVersionSemestral("Primer Semestre del 2018"); //Nombre a Mostrar
	//		
	//		factoryServicioDAO.getVersionSemestralServicio().crearVersionSemestralDTO(versionSemestralDTOA);
	//		factoryServicioDAO.getVersionSemestralServicio().crearVersionSemestralDTO(versionSemestralDTOB);
	//		factoryServicioDAO.getVersionSemestralServicio().crearVersionSemestralDTO(versionSemestralDTOC);
	//	}



	public void crearProgramaUniversidadServicioTest(){
		objLog.info("crearProgramaUniversidadServicioTest");
		ProgramaUniversidadDTO programaUniversidadDTOA=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOB=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOC=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOD=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOE=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOF=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOG=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOH=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOI=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOJ=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOK=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOL=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOM=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTON=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOO=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOP=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOQ=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOR=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOS=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOT=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOU=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOV=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOW=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOX=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOY=new ProgramaUniversidadDTO();
		ProgramaUniversidadDTO programaUniversidadDTOZ=new ProgramaUniversidadDTO();

		programaUniversidadDTOA.setCodigoProgramaUniversidad("DOC_FmETA");	programaUniversidadDTOA.setCostoProgramaUniversidad("$60.000");	programaUniversidadDTOA.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOA.setClasificacionPrograma(1);
		programaUniversidadDTOB.setCodigoProgramaUniversidad("MAG_AAV");	programaUniversidadDTOB.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOB.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOB.setClasificacionPrograma(2);
		programaUniversidadDTOC.setCodigoProgramaUniversidad("MAG_ADT");	programaUniversidadDTOC.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOC.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOC.setClasificacionPrograma(2);
		programaUniversidadDTOD.setCodigoProgramaUniversidad("MAG_AmM");	programaUniversidadDTOD.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOD.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOD.setClasificacionPrograma(2);
		programaUniversidadDTOE.setCodigoProgramaUniversidad("MAG_E");		programaUniversidadDTOE.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOE.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOE.setClasificacionPrograma(2);
		programaUniversidadDTOF.setCodigoProgramaUniversidad("MAG_AmTHA");	programaUniversidadDTOF.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOF.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOF.setClasificacionPrograma(2);
		programaUniversidadDTOG.setCodigoProgramaUniversidad("MAG_GC");		programaUniversidadDTOG.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOG.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOG.setClasificacionPrograma(2);
		programaUniversidadDTOH.setCodigoProgramaUniversidad("MAG_AM");		programaUniversidadDTOH.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOH.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOH.setClasificacionPrograma(2);
		programaUniversidadDTOI.setCodigoProgramaUniversidad("MAG_IM");		programaUniversidadDTOI.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOI.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOI.setClasificacionPrograma(2);
		programaUniversidadDTOJ.setCodigoProgramaUniversidad("POS_CM");		programaUniversidadDTOJ.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOJ.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOJ.setClasificacionPrograma(3);
		programaUniversidadDTOK.setCodigoProgramaUniversidad("POS_ME");		programaUniversidadDTOK.setCostoProgramaUniversidad("-");		programaUniversidadDTOK.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOK.setClasificacionPrograma(3);
		programaUniversidadDTOL.setCodigoProgramaUniversidad("POS_RPCM");	programaUniversidadDTOL.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOL.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOL.setClasificacionPrograma(3);
		programaUniversidadDTOM.setCodigoProgramaUniversidad("POS_TAmAT");	programaUniversidadDTOM.setCostoProgramaUniversidad("-");		programaUniversidadDTOM.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOM.setClasificacionPrograma(3);
		programaUniversidadDTON.setCodigoProgramaUniversidad("POS_TAmM");	programaUniversidadDTON.setCostoProgramaUniversidad("-");		programaUniversidadDTON.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTON.setClasificacionPrograma(3);
		programaUniversidadDTOO.setCodigoProgramaUniversidad("DIPP_AS");	programaUniversidadDTOO.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOO.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOO.setClasificacionPrograma(4);
		programaUniversidadDTOP.setCodigoProgramaUniversidad("DIPP_D");		programaUniversidadDTOP.setCostoProgramaUniversidad("-");		programaUniversidadDTOP.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOP.setClasificacionPrograma(4);
		programaUniversidadDTOQ.setCodigoProgramaUniversidad("DIPP_GC");	programaUniversidadDTOQ.setCostoProgramaUniversidad("$50.000");	programaUniversidadDTOQ.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOQ.setClasificacionPrograma(4);
		programaUniversidadDTOR.setCodigoProgramaUniversidad("DIPP_Pgvf");	programaUniversidadDTOR.setCostoProgramaUniversidad("-");		programaUniversidadDTOR.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOR.setClasificacionPrograma(4);  
		programaUniversidadDTOS.setCodigoProgramaUniversidad("DIPE_C");		programaUniversidadDTOS.setCostoProgramaUniversidad("-");		programaUniversidadDTOS.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOS.setClasificacionPrograma(5);  
		programaUniversidadDTOT.setCodigoProgramaUniversidad("DIPE_EAari");	programaUniversidadDTOT.setCostoProgramaUniversidad("$35.000");	programaUniversidadDTOT.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOT.setClasificacionPrograma(5);
		programaUniversidadDTOU.setCodigoProgramaUniversidad("DIPE_EApm");	programaUniversidadDTOU.setCostoProgramaUniversidad("$35.000");	programaUniversidadDTOU.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOU.setClasificacionPrograma(5);
		programaUniversidadDTOV.setCodigoProgramaUniversidad("DIPE_VGC");	programaUniversidadDTOV.setCostoProgramaUniversidad("$35.000");	programaUniversidadDTOV.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOV.setClasificacionPrograma(5);
		programaUniversidadDTOW.setCodigoProgramaUniversidad("DIPE_PA");	programaUniversidadDTOW.setCostoProgramaUniversidad("$35.000");	programaUniversidadDTOW.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOW.setClasificacionPrograma(5);
		programaUniversidadDTOX.setCodigoProgramaUniversidad("DIPE_GI");	programaUniversidadDTOX.setCostoProgramaUniversidad("$35.000");	programaUniversidadDTOX.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOX.setClasificacionPrograma(5);
		programaUniversidadDTOY.setCodigoProgramaUniversidad("DIPE_GP");	programaUniversidadDTOY.setCostoProgramaUniversidad("$33.000");	programaUniversidadDTOY.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOY.setClasificacionPrograma(5);
		programaUniversidadDTOZ.setCodigoProgramaUniversidad("DIPE_EP");	programaUniversidadDTOZ.setCostoProgramaUniversidad("$33.000");	programaUniversidadDTOZ.setDuracionProgramaUniversidad("Un Semestre"); programaUniversidadDTOZ.setClasificacionPrograma(5);


		programaUniversidadDTOA.setNombreProgramaUniversidad("Doctorado en Filosofía, Mención en Estética y Teoría de Arte");
		programaUniversidadDTOB.setNombreProgramaUniversidad("Magíster en Artes, mención Artes Visuales");
		programaUniversidadDTOC.setNombreProgramaUniversidad("Magíster en Artes, mención Dirección Teatral");
		programaUniversidadDTOD.setNombreProgramaUniversidad("Magíster en Artes, mención Composición Musical");
		programaUniversidadDTOE.setNombreProgramaUniversidad("Magíster en Artes, mención Musicología");
		programaUniversidadDTOF.setNombreProgramaUniversidad("Magíster en Artes, mención Teoría e Historia de Arte");
		programaUniversidadDTOG.setNombreProgramaUniversidad("Magíster en Gestión Cultural");
		programaUniversidadDTOH.setNombreProgramaUniversidad("Magíster en Artes Mediales");
		programaUniversidadDTOI.setNombreProgramaUniversidad("Magíster en Interpretación Musical");
		programaUniversidadDTOJ.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Composición Musical");
		programaUniversidadDTOK.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Música Electrónica");
		programaUniversidadDTOL.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Restauración del Patrimonio Cultural Mueble");
		programaUniversidadDTOM.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Terapias de Arte, mención Arte Terapia");
		programaUniversidadDTON.setNombreProgramaUniversidad("Curso de especialización de Postítulo en Terapias de Arte, mención Musicoterapia");
		programaUniversidadDTOO.setNombreProgramaUniversidad("Diploma de Postitulo en Arte sonoro");
		programaUniversidadDTOP.setNombreProgramaUniversidad("Diploma de Postitulo en Dramaterapia");
		programaUniversidadDTOQ.setNombreProgramaUniversidad("Diploma de Postitulo en Gestión cultural (sede Puerto Montt)");
		programaUniversidadDTOR.setNombreProgramaUniversidad("Diploma de Postitulo en Producción gráfica, video y fotografía");
		programaUniversidadDTOS.setNombreProgramaUniversidad("Diploma de Extensión en Curaduría");
		programaUniversidadDTOT.setNombreProgramaUniversidad("Diploma de Extensión en Educación Artística - Arica y Parinacota");
		programaUniversidadDTOU.setNombreProgramaUniversidad("Diploma de Extensión en Educación Artística - Puerto Montt");
		programaUniversidadDTOV.setNombreProgramaUniversidad("Diploma de Extensión en Virtual en Gestión Cultural");
		programaUniversidadDTOW.setNombreProgramaUniversidad("Diploma de Extensión en Producción Artística");
		programaUniversidadDTOX.setNombreProgramaUniversidad("Diploma Virtual de Extensión en Gestión de Instituciones Culturales");
		programaUniversidadDTOY.setNombreProgramaUniversidad("Diploma Virtual de Postítulo en Gestión del Patrimonio");
		programaUniversidadDTOZ.setNombreProgramaUniversidad("Diploma Virtual de Postítulo en Educación del Patrimonio Artístico");

		programaUniversidadDTOA = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOA);
		programaUniversidadDTOB = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOB);
		programaUniversidadDTOC = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOC);
		programaUniversidadDTOD = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOD);
		programaUniversidadDTOE = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOE);
		programaUniversidadDTOF = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOF);
		programaUniversidadDTOG = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOG);
		programaUniversidadDTOH = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOH);
		programaUniversidadDTOI = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOI);
		programaUniversidadDTOJ = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOJ);
		programaUniversidadDTOK = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOK);
		programaUniversidadDTOL = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOL);
		programaUniversidadDTOM = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOM);
		programaUniversidadDTON = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTON);
		programaUniversidadDTOO = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOO);
		programaUniversidadDTOP = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOP);
		programaUniversidadDTOQ = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOQ);
		programaUniversidadDTOR = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOR);
		programaUniversidadDTOS = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOS);
		programaUniversidadDTOT = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOT);
		programaUniversidadDTOU = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOU);
		programaUniversidadDTOV = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOV);
		programaUniversidadDTOW = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOW);
		programaUniversidadDTOX = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOX);
		programaUniversidadDTOY = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOY);
		programaUniversidadDTOZ = factoryServicioDAO.getProgramaUniversidadServicio().crearProgramaUniversidadDTO(programaUniversidadDTOZ);

	}


	public void crearProgramaUniversidadPostulacionServicioTest(){
		objLog.info("crearProgramaUniversidadPostulacionServicioTest");
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOA=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOB=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOC=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOD=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOE=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOF=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOG=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOH=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOI=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOJ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOK=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOL=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOM=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTON=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOO=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOP=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOQ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOR=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOS=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOT=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOU=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOV=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOW=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOX=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOY=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOZ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAA=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAB=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAC=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAD=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAE=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAF=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAG=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAH=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAI=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAJ=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAK=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAL=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAM=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAN=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAO=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAP=new ProgramaUniversidadPostulacionDTO();
		ProgramaUniversidadPostulacionDTO programaUniversidadPostulacionDTOAQ=new ProgramaUniversidadPostulacionDTO();
		


		programaUniversidadPostulacionDTOA.setCodigoProgramaUniversidadPostulacion("DOC_FmETA");	programaUniversidadPostulacionDTOA.setCostoProgramaUniversidadPostulacion("$60.000");	programaUniversidadPostulacionDTOA.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOA.setClasificacionProgramaPostulacion(1); 
		programaUniversidadPostulacionDTOB.setCodigoProgramaUniversidadPostulacion("MAG_AAV");	programaUniversidadPostulacionDTOB.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOB.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOB.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOC.setCodigoProgramaUniversidadPostulacion("MAG_ADT");	programaUniversidadPostulacionDTOC.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOC.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOC.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOD.setCodigoProgramaUniversidadPostulacion("MAG_AmM");	programaUniversidadPostulacionDTOD.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOD.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOD.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOE.setCodigoProgramaUniversidadPostulacion("MAG_E");		programaUniversidadPostulacionDTOE.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOE.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOE.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOF.setCodigoProgramaUniversidadPostulacion("MAG_AmTHA");	programaUniversidadPostulacionDTOF.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOF.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOF.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOG.setCodigoProgramaUniversidadPostulacion("MAG_GC");		programaUniversidadPostulacionDTOG.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOG.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOG.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOH.setCodigoProgramaUniversidadPostulacion("MAG_AM");		programaUniversidadPostulacionDTOH.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOH.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOH.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOI.setCodigoProgramaUniversidadPostulacion("MAG_IM");		programaUniversidadPostulacionDTOI.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOI.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOI.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOJ.setCodigoProgramaUniversidadPostulacion("POS_CM");		programaUniversidadPostulacionDTOJ.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOJ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOJ.setClasificacionProgramaPostulacion(3);
		programaUniversidadPostulacionDTOK.setCodigoProgramaUniversidadPostulacion("POS_ME");		programaUniversidadPostulacionDTOK.setCostoProgramaUniversidadPostulacion("-");		programaUniversidadPostulacionDTOK.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOK.setClasificacionProgramaPostulacion(3);
		programaUniversidadPostulacionDTOL.setCodigoProgramaUniversidadPostulacion("POS_RPCM");	programaUniversidadPostulacionDTOL.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOL.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOL.setClasificacionProgramaPostulacion(3);
		programaUniversidadPostulacionDTOM.setCodigoProgramaUniversidadPostulacion("POS_TAmAT");	programaUniversidadPostulacionDTOM.setCostoProgramaUniversidadPostulacion("-");		programaUniversidadPostulacionDTOM.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOM.setClasificacionProgramaPostulacion(3);
		programaUniversidadPostulacionDTON.setCodigoProgramaUniversidadPostulacion("POS_TAmM");	programaUniversidadPostulacionDTON.setCostoProgramaUniversidadPostulacion("-");		programaUniversidadPostulacionDTON.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTON.setClasificacionProgramaPostulacion(3);
		programaUniversidadPostulacionDTOO.setCodigoProgramaUniversidadPostulacion("DIPP_AS");	programaUniversidadPostulacionDTOO.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOO.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOO.setClasificacionProgramaPostulacion(4);
		programaUniversidadPostulacionDTOP.setCodigoProgramaUniversidadPostulacion("DIPP_D");		programaUniversidadPostulacionDTOP.setCostoProgramaUniversidadPostulacion("-");		programaUniversidadPostulacionDTOP.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOP.setClasificacionProgramaPostulacion(4);
		programaUniversidadPostulacionDTOQ.setCodigoProgramaUniversidadPostulacion("DIPP_GC");	programaUniversidadPostulacionDTOQ.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOQ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOQ.setClasificacionProgramaPostulacion(4);
		programaUniversidadPostulacionDTOR.setCodigoProgramaUniversidadPostulacion("DIPP_Pgvf");	programaUniversidadPostulacionDTOR.setCostoProgramaUniversidadPostulacion("-");		programaUniversidadPostulacionDTOR.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOR.setClasificacionProgramaPostulacion(4);  
		programaUniversidadPostulacionDTOS.setCodigoProgramaUniversidadPostulacion("DIPE_C");		programaUniversidadPostulacionDTOS.setCostoProgramaUniversidadPostulacion("-");		programaUniversidadPostulacionDTOS.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOS.setClasificacionProgramaPostulacion(5);  
		programaUniversidadPostulacionDTOT.setCodigoProgramaUniversidadPostulacion("DIPE_EAari");	programaUniversidadPostulacionDTOT.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOT.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOT.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOU.setCodigoProgramaUniversidadPostulacion("DIPE_EApm");	programaUniversidadPostulacionDTOU.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOU.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOU.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOV.setCodigoProgramaUniversidadPostulacion("DIPE_VGC");		programaUniversidadPostulacionDTOV.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOV.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOV.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOW.setCodigoProgramaUniversidadPostulacion("DIPE_PA");		programaUniversidadPostulacionDTOW.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOW.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOW.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOX.setCodigoProgramaUniversidadPostulacion("DIPE_GI");		programaUniversidadPostulacionDTOX.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOX.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOX.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOY.setCodigoProgramaUniversidadPostulacion("DIPE_GP");		programaUniversidadPostulacionDTOY.setCostoProgramaUniversidadPostulacion("$33.000");	programaUniversidadPostulacionDTOY.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOY.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOZ.setCodigoProgramaUniversidadPostulacion("DIPE_EP");		programaUniversidadPostulacionDTOZ.setCostoProgramaUniversidadPostulacion("$33.000");	programaUniversidadPostulacionDTOZ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOZ.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOAA.setCodigoProgramaUniversidadPostulacion("DIPE_VGC_2018");	programaUniversidadPostulacionDTOV.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOV.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAA.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOAB.setCodigoProgramaUniversidadPostulacion("DIPE_PA_2018");	programaUniversidadPostulacionDTOW.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOW.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAB.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOAC.setCodigoProgramaUniversidadPostulacion("DIPE_GI_2018");	programaUniversidadPostulacionDTOX.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOX.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAC.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOAD.setCodigoProgramaUniversidadPostulacion("DIPE_GP_2018");	programaUniversidadPostulacionDTOY.setCostoProgramaUniversidadPostulacion("$33.000");	programaUniversidadPostulacionDTOY.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAD.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOAE.setCodigoProgramaUniversidadPostulacion("DIPE_EP_2018");	programaUniversidadPostulacionDTOZ.setCostoProgramaUniversidadPostulacion("$33.000");	programaUniversidadPostulacionDTOZ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAE.setClasificacionProgramaPostulacion(5);


		programaUniversidadPostulacionDTOA.setPrioridad(0);
		programaUniversidadPostulacionDTOB.setPrioridad(0);
		programaUniversidadPostulacionDTOC.setPrioridad(0);
		programaUniversidadPostulacionDTOD.setPrioridad(0); 
		programaUniversidadPostulacionDTOE.setPrioridad(0);
		programaUniversidadPostulacionDTOF.setPrioridad(0); 
		programaUniversidadPostulacionDTOG.setPrioridad(0);
		programaUniversidadPostulacionDTOH.setPrioridad(0);
		programaUniversidadPostulacionDTOI.setPrioridad(0);
		programaUniversidadPostulacionDTOJ.setPrioridad(0);
		programaUniversidadPostulacionDTOK.setPrioridad(0);
		programaUniversidadPostulacionDTOL.setPrioridad(0);
		programaUniversidadPostulacionDTOM.setPrioridad(0);
		programaUniversidadPostulacionDTON.setPrioridad(0);
		programaUniversidadPostulacionDTOO.setPrioridad(0);
		programaUniversidadPostulacionDTOP.setPrioridad(0);
		programaUniversidadPostulacionDTOQ.setPrioridad(0);
		programaUniversidadPostulacionDTOR.setPrioridad(0);
		programaUniversidadPostulacionDTOS.setPrioridad(0);
		programaUniversidadPostulacionDTOT.setPrioridad(0);
		programaUniversidadPostulacionDTOU.setPrioridad(0);
		programaUniversidadPostulacionDTOV.setPrioridad(0);
		programaUniversidadPostulacionDTOW.setPrioridad(0);
		programaUniversidadPostulacionDTOX.setPrioridad(0);
		programaUniversidadPostulacionDTOY.setPrioridad(0);
		programaUniversidadPostulacionDTOZ.setPrioridad(0);
		programaUniversidadPostulacionDTOAA.setPrioridad(0);
		programaUniversidadPostulacionDTOAB.setPrioridad(0);
		programaUniversidadPostulacionDTOAC.setPrioridad(0);
		programaUniversidadPostulacionDTOAD.setPrioridad(0);
		programaUniversidadPostulacionDTOAE.setPrioridad(0);
		


		programaUniversidadPostulacionDTOA.setNombreProgramaUniversidadPostulacion("Doctorado en Filosofía, Mención en Estética y Teoría de Arte");
		programaUniversidadPostulacionDTOB.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Artes Visuales");
		programaUniversidadPostulacionDTOC.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Dirección Teatral");
		programaUniversidadPostulacionDTOD.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Composición Musical");
		programaUniversidadPostulacionDTOE.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Musicología");
		programaUniversidadPostulacionDTOF.setNombreProgramaUniversidadPostulacion("Magíster en Artes, mención Teoría e Historia de Arte");
		programaUniversidadPostulacionDTOG.setNombreProgramaUniversidadPostulacion("Magíster en Gestión Cultural");
		programaUniversidadPostulacionDTOH.setNombreProgramaUniversidadPostulacion("Magíster en Artes Mediales");
		programaUniversidadPostulacionDTOI.setNombreProgramaUniversidadPostulacion("Magíster en Interpretación Musical");
		programaUniversidadPostulacionDTOJ.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Composición Musical");
		programaUniversidadPostulacionDTOK.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Música Electrónica");
		programaUniversidadPostulacionDTOL.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Restauración del Patrimonio Cultural Mueble");
		programaUniversidadPostulacionDTOM.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Terapias de Arte, mención Arte Terapia");
		programaUniversidadPostulacionDTON.setNombreProgramaUniversidadPostulacion("Curso de especialización de Postítulo en Terapias de Arte, mención Musicoterapia");
		programaUniversidadPostulacionDTOO.setNombreProgramaUniversidadPostulacion("Diploma de Postitulo en Arte sonoro");
		programaUniversidadPostulacionDTOP.setNombreProgramaUniversidadPostulacion("Diploma de Postitulo en Dramaterapia");
		programaUniversidadPostulacionDTOQ.setNombreProgramaUniversidadPostulacion("Diploma de Postitulo en Gestión cultural (sede Puerto Montt)");
		programaUniversidadPostulacionDTOR.setNombreProgramaUniversidadPostulacion("Diploma de Postitulo en Producción gráfica, video y fotografía");
		programaUniversidadPostulacionDTOS.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Curaduría");
		programaUniversidadPostulacionDTOT.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Educación Artística - Arica y Parinacota");
		programaUniversidadPostulacionDTOU.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Educación Artística - Puerto Montt");
		programaUniversidadPostulacionDTOV.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Virtual en Gestión Cultural");
		programaUniversidadPostulacionDTOW.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Producción Artística");
		programaUniversidadPostulacionDTOX.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Extensión en Gestión de Instituciones Culturales");
		programaUniversidadPostulacionDTOY.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Postítulo en Gestión del Patrimonio");
		programaUniversidadPostulacionDTOZ.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Postítulo en Educación del Patrimonio Artístico");
		programaUniversidadPostulacionDTOAA.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Virtual en Gestión Cultural, primer semestre 2018");
		programaUniversidadPostulacionDTOAB.setNombreProgramaUniversidadPostulacion("Diploma de Extensión en Producción Artística, primer semestre 2018");
		programaUniversidadPostulacionDTOAC.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Extensión en Gestión de Instituciones Culturales, primer semestre 2018");
		programaUniversidadPostulacionDTOAD.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Postítulo en Gestión del Patrimonio, primer semestre 2018");
		programaUniversidadPostulacionDTOAE.setNombreProgramaUniversidadPostulacion("Diploma Virtual de Postítulo en Educación del Patrimonio Artístico, primer semestre 2018");
		/**Segundo Semestre 2018*/
		/**Segundo Semestre 2018*/
		
		programaUniversidadPostulacionDTOAF.setCodigoProgramaUniversidadPostulacion("MAG_AV_2018_2"); programaUniversidadPostulacionDTOAF.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAF.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAF.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOAG.setCodigoProgramaUniversidadPostulacion("MAG_AM_2018_2");  programaUniversidadPostulacionDTOAG.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAG.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAG.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOAH.setCodigoProgramaUniversidadPostulacion("MAG_IM_2018_2");  programaUniversidadPostulacionDTOAH.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAH.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAH.setClasificacionProgramaPostulacion(2);
		programaUniversidadPostulacionDTOAI.setCodigoProgramaUniversidadPostulacion("CE_Pos_TAmAT_2018_2");  programaUniversidadPostulacionDTOAI.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAI.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAI.setClasificacionProgramaPostulacion(3);
		programaUniversidadPostulacionDTOAJ.setCodigoProgramaUniversidadPostulacion("CE_Pos_TAmM_2018_2");  programaUniversidadPostulacionDTOAJ.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAJ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAJ.setClasificacionProgramaPostulacion(3);
		programaUniversidadPostulacionDTOAK.setCodigoProgramaUniversidadPostulacion("CE_Pos_RPCM_2018_2"); programaUniversidadPostulacionDTOAK.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAK.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAK.setClasificacionProgramaPostulacion(3);
		programaUniversidadPostulacionDTOAL.setCodigoProgramaUniversidadPostulacion("DIPPv_EPAC_2018_2"); programaUniversidadPostulacionDTOAL.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAL.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAL.setClasificacionProgramaPostulacion(4);
		programaUniversidadPostulacionDTOAM.setCodigoProgramaUniversidadPostulacion("DIPP_GC_SANTIAGO_2018_2"); programaUniversidadPostulacionDTOAM.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAM.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAM.setClasificacionProgramaPostulacion(4);
		programaUniversidadPostulacionDTOAN.setCodigoProgramaUniversidadPostulacion("DIPPv_GPC_2018_2"); programaUniversidadPostulacionDTOAN.setCostoProgramaUniversidadPostulacion("$50.000");	programaUniversidadPostulacionDTOAN.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAN.setClasificacionProgramaPostulacion(4);
		programaUniversidadPostulacionDTOAO.setCodigoProgramaUniversidadPostulacion("DIPDpv_GC_2018_2"); programaUniversidadPostulacionDTOAO.setCostoProgramaUniversidadPostulacion("$33.000");	programaUniversidadPostulacionDTOAO.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAO.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOAP.setCodigoProgramaUniversidadPostulacion("DIPDpv_GIC_2018_2"); programaUniversidadPostulacionDTOAP.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOAP.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAP.setClasificacionProgramaPostulacion(5);
		programaUniversidadPostulacionDTOAQ.setCodigoProgramaUniversidadPostulacion("DIPDp_PROD_2018_2"); programaUniversidadPostulacionDTOAQ.setCostoProgramaUniversidadPostulacion("$35.000");	programaUniversidadPostulacionDTOAQ.setDuracionProgramaUniversidadPostulacion("Un Semestre"); programaUniversidadPostulacionDTOAQ.setClasificacionProgramaPostulacion(5);
		
		programaUniversidadPostulacionDTOAF.setPrioridad(1);
		programaUniversidadPostulacionDTOAG.setPrioridad(2);
		programaUniversidadPostulacionDTOAH.setPrioridad(3);
		
		programaUniversidadPostulacionDTOAI.setPrioridad(4);
		programaUniversidadPostulacionDTOAJ.setPrioridad(5);
		programaUniversidadPostulacionDTOAK.setPrioridad(6);
		
		programaUniversidadPostulacionDTOAL.setPrioridad(7);
		programaUniversidadPostulacionDTOAM.setPrioridad(8);
		programaUniversidadPostulacionDTOAN.setPrioridad(9);
		programaUniversidadPostulacionDTOAO.setPrioridad(10);
		programaUniversidadPostulacionDTOAP.setPrioridad(11);
		programaUniversidadPostulacionDTOAQ.setPrioridad(12);
		/**Segundo Semestre 2018**/
		programaUniversidadPostulacionDTOAF.setNombreProgramaUniversidadPostulacion("Magister en Artes Visuales (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAG.setNombreProgramaUniversidadPostulacion("Magister en Artes Mediales (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAH.setNombreProgramaUniversidadPostulacion("Magister en Interpretación Musical (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAI.setNombreProgramaUniversidadPostulacion("Curso de especialización de postítulo en Terapias del Arte mención Arte Terapia (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAJ.setNombreProgramaUniversidadPostulacion("Curso de especialización de postítulo en Terapias del Arte mención Músicoterapia (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAK.setNombreProgramaUniversidadPostulacion("Curso de especialización en postítulo en Restauración del Patrimonio Cultural Mueble (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAL.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo Virtual en Educación del patrimonio artístico y cultural (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAM.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo en Gestión Cultural Sede Santiago (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAN.setNombreProgramaUniversidadPostulacion("Diploma de Postítulo Virtual Gestión del patrimonio cultural (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAO.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional Virtual en Gestión Cultural (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAP.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional Virtual en Gestión de Instituciones Culturales (Segundo Semestre 2018)");
		programaUniversidadPostulacionDTOAQ.setNombreProgramaUniversidadPostulacion("Diploma de Desarrollo Profesional en Producción (Segundo Semestre 2018)");


		programaUniversidadPostulacionDTOA = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOA);
		programaUniversidadPostulacionDTOB = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOB);
		programaUniversidadPostulacionDTOC = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOC);
		programaUniversidadPostulacionDTOD = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOD);
		programaUniversidadPostulacionDTOE = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOE);
		programaUniversidadPostulacionDTOF = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOF);
		programaUniversidadPostulacionDTOG = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOG);
		programaUniversidadPostulacionDTOH = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOH);
		programaUniversidadPostulacionDTOI = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOI);
		programaUniversidadPostulacionDTOJ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOJ);
		programaUniversidadPostulacionDTOK = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOK);
		programaUniversidadPostulacionDTOL = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOL);
		programaUniversidadPostulacionDTOM = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOM);
		programaUniversidadPostulacionDTON = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTON);
		programaUniversidadPostulacionDTOO = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOO);
		programaUniversidadPostulacionDTOP = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOP);
		programaUniversidadPostulacionDTOQ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOQ);
		programaUniversidadPostulacionDTOR = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOR);
		programaUniversidadPostulacionDTOS = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOS);
		programaUniversidadPostulacionDTOT = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOT);
		programaUniversidadPostulacionDTOU = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOU);
		programaUniversidadPostulacionDTOV = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOV);
		programaUniversidadPostulacionDTOW = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOW);
		programaUniversidadPostulacionDTOX = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOX);
		programaUniversidadPostulacionDTOY = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOY);
		programaUniversidadPostulacionDTOZ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOZ);
		programaUniversidadPostulacionDTOAA = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAA);
		programaUniversidadPostulacionDTOAB = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAB);
		programaUniversidadPostulacionDTOAC = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAC);
		programaUniversidadPostulacionDTOAD = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAD);
		programaUniversidadPostulacionDTOAE = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAE);
		/**Segundo Semestre 2018*/
		programaUniversidadPostulacionDTOAF = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAF);
		programaUniversidadPostulacionDTOAG = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAG);
		programaUniversidadPostulacionDTOAH = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAH);
		programaUniversidadPostulacionDTOAI = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAI);
		programaUniversidadPostulacionDTOAJ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAJ);
		programaUniversidadPostulacionDTOAK = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAK);
		programaUniversidadPostulacionDTOAL = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAL);
		programaUniversidadPostulacionDTOAM = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAM);
		programaUniversidadPostulacionDTOAN = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAN);
		programaUniversidadPostulacionDTOAO = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAO);
		programaUniversidadPostulacionDTOAP = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAP);
		programaUniversidadPostulacionDTOAQ = factoryServicioDAO.getProgramaUniversidadPostulacionServicio().crearProgramaUniversidadPostulacionDTO(programaUniversidadPostulacionDTOAQ);
		
	}


	public void crearFinalidadCertificadoServicioTest(){
		objLog.info("crearFinalidadCertificadoServicioTest");
		FinalidadCertificadoDTO finalidadCertificadoDTOA=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOB=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOC=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOD=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOE=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOF=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOG=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOH=new FinalidadCertificadoDTO();
		FinalidadCertificadoDTO finalidadCertificadoDTOI=new FinalidadCertificadoDTO();

		finalidadCertificadoDTOA.setCodigoFinalidadCertificado("A");
		finalidadCertificadoDTOB.setCodigoFinalidadCertificado("B");
		finalidadCertificadoDTOC.setCodigoFinalidadCertificado("C");
		finalidadCertificadoDTOD.setCodigoFinalidadCertificado("D");
		finalidadCertificadoDTOE.setCodigoFinalidadCertificado("E");
		finalidadCertificadoDTOF.setCodigoFinalidadCertificado("F");
		finalidadCertificadoDTOG.setCodigoFinalidadCertificado("G");
		finalidadCertificadoDTOH.setCodigoFinalidadCertificado("H");
		finalidadCertificadoDTOI.setCodigoFinalidadCertificado("I");

		finalidadCertificadoDTOA.setNombreFinalidadCertificado("Asignación Familiar ($0.-)");
		finalidadCertificadoDTOB.setNombreFinalidadCertificado("Beca Interna ($0.-)"); 
		finalidadCertificadoDTOC.setNombreFinalidadCertificado("Uso Interno Universidad ($0.-)"); 
		finalidadCertificadoDTOD.setNombreFinalidadCertificado("Extranjero ($6.000)");
		finalidadCertificadoDTOE.setNombreFinalidadCertificado("Horas Cursadas en el Programa de Postgrado ($6.000)"); 
		finalidadCertificadoDTOF.setNombreFinalidadCertificado("Fondo Solidario para otras universidades ($0.-)");
		finalidadCertificadoDTOG.setNombreFinalidadCertificado("Beca Externa (Fondart, Conicyt, Fundación Volcán Calbuco u otra) ($6.000.-)");
		finalidadCertificadoDTOH.setNombreFinalidadCertificado("Caja de Compensación(CCAF) ($0.-)"); 
		finalidadCertificadoDTOI.setNombreFinalidadCertificado("Otros Fines que estime conveniente ($6.000)");

		finalidadCertificadoDTOA = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOA);
		finalidadCertificadoDTOB = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOB);
		finalidadCertificadoDTOC = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOC);
		finalidadCertificadoDTOD = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOD);
		finalidadCertificadoDTOE = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOE);
		finalidadCertificadoDTOF = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOF);
		finalidadCertificadoDTOG = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOG);
		finalidadCertificadoDTOH = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOH);
		finalidadCertificadoDTOI = factoryServicioDAO.getFinalidadCertificadoServicio().crearFinalidadCertificadoDTO(finalidadCertificadoDTOI);

	}

	public void crearTipoCertificadoServicioTest(){
		objLog.info("crearTipoCertificadoServicioTest");
		TipoCertificadoDTO tipoCertificadoDTOA=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOB=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOC=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOD=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOE=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOF=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOG=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOH=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOI=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOJ=new TipoCertificadoDTO();
		TipoCertificadoDTO tipoCertificadoDTOK=new TipoCertificadoDTO();

		tipoCertificadoDTOA.setCodigoTipoCertificado("A");
		tipoCertificadoDTOB.setCodigoTipoCertificado("B");
		tipoCertificadoDTOC.setCodigoTipoCertificado("C");
		tipoCertificadoDTOD.setCodigoTipoCertificado("D");
		tipoCertificadoDTOE.setCodigoTipoCertificado("E");
		tipoCertificadoDTOF.setCodigoTipoCertificado("F");
		tipoCertificadoDTOG.setCodigoTipoCertificado("G");
		tipoCertificadoDTOH.setCodigoTipoCertificado("H");
		tipoCertificadoDTOI.setCodigoTipoCertificado("I");
		tipoCertificadoDTOJ.setCodigoTipoCertificado("J");
		tipoCertificadoDTOK.setCodigoTipoCertificado("K");

		tipoCertificadoDTOA.setNombreTipoCertificado("Estudiante Regular ($6.000.-)");
		tipoCertificadoDTOB.setNombreTipoCertificado("Egreso ($6.000.-)");
		tipoCertificadoDTOC.setNombreTipoCertificado("Concentración de Notas ($6.000.-)"); 
		tipoCertificadoDTOD.setNombreTipoCertificado("Grado o Título en Trámite ($6.000.-)"); 
		tipoCertificadoDTOE.setNombreTipoCertificado("Programas de Asignaturas ($0.-)");
		tipoCertificadoDTOF.setNombreTipoCertificado("CONICYT - Fecha de Inicio y Término del Programa ($0.-)"); 
		tipoCertificadoDTOG.setNombreTipoCertificado("CONICYT - Actividades inscritas por semestre ($0.-)"); 
		tipoCertificadoDTOH.setNombreTipoCertificado("CONICYT - Inscripción de Tesis ($0.-)");
		tipoCertificadoDTOI.setNombreTipoCertificado("CONICYT - Inscripción de Examen de Calificación ($0.-)");
		tipoCertificadoDTOJ.setNombreTipoCertificado("Notas Parciales y de Exámenes ($6.000.-)");
		tipoCertificadoDTOK.setNombreTipoCertificado("Otros ($6.000.-)");

		tipoCertificadoDTOA = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOA);
		tipoCertificadoDTOB = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOB);
		tipoCertificadoDTOC = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOC);
		tipoCertificadoDTOD = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOD);
		tipoCertificadoDTOE = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOE);
		tipoCertificadoDTOF = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOF);
		tipoCertificadoDTOG = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOG);
		tipoCertificadoDTOH = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOH);
		tipoCertificadoDTOI = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOI);
		tipoCertificadoDTOJ = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOJ);
		tipoCertificadoDTOK = factoryServicioDAO.getTipoCertificadoServicio().crearTipoCertificadoDTO(tipoCertificadoDTOK);
	}

	public void crearTipoSolicitudServicioTest(){
		objLog.info("crearTipoSolicitudServicioTest");
		TipoSolicitudDTO tipoSolicitudDTOA=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOB=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOC=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOD=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOE=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOF=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOG=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOH=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOI=new TipoSolicitudDTO();
		TipoSolicitudDTO tipoSolicitudDTOJ=new TipoSolicitudDTO();

		tipoSolicitudDTOA.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOB.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOC.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOD.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOE.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOF.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOG.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOH.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOI.setCodigoTipoSolicitud("UCH");
		tipoSolicitudDTOJ.setCodigoTipoSolicitud("Otra");

		tipoSolicitudDTOA.setNombreTipoSolicitud("Postergación");
		tipoSolicitudDTOB.setNombreTipoSolicitud("Reincorporación");
		tipoSolicitudDTOC.setNombreTipoSolicitud("Permanencia");
		tipoSolicitudDTOD.setNombreTipoSolicitud("Homologación");
		tipoSolicitudDTOE.setNombreTipoSolicitud("Prórroga Entrega de Tesis");
		tipoSolicitudDTOF.setNombreTipoSolicitud("Inscripción de Tutorias");
		tipoSolicitudDTOG.setNombreTipoSolicitud("Plazo Entrega de Proyecto de Tesis");
		tipoSolicitudDTOH.setNombreTipoSolicitud("Renuncia al Programa");
		tipoSolicitudDTOI.setNombreTipoSolicitud("Inscripción de Tesis"); //Cambiar de Lado, uno antes
		tipoSolicitudDTOJ.setNombreTipoSolicitud("Otra Solicitud"); //Cambiar de Lado, uno despues Este debe ser ultimo. Siempre.


		tipoSolicitudDTOA = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOA);
		tipoSolicitudDTOB = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOB);
		tipoSolicitudDTOC = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOC);
		tipoSolicitudDTOD = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOD);
		tipoSolicitudDTOE = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOE);
		tipoSolicitudDTOF = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOF);
		tipoSolicitudDTOG = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOG);
		tipoSolicitudDTOH = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOH);
		tipoSolicitudDTOI = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOI);
		tipoSolicitudDTOJ = factoryServicioDAO.getTipoSolicitudServicio().crearTipoSolicitudDTO(tipoSolicitudDTOJ);
	}

//	public void crearUsuarioServicioTest(){
//		objLog.info("crearUsuarioServicioTest");
//		UsuarioDTO usuarioDTOA=new UsuarioDTO();
//		UsuarioDTO usuarioDTOB=new UsuarioDTO();
//
//		usuarioDTOA.setUsernameUsuarioPerfil("Administrador"); //Nombre a Mostrar
//		usuarioDTOA.setUsernameUsuarioPerfilLower(usuarioDTOA.getUsernameUsuarioPerfil().toLowerCase()); //nombre a comprobar
//		usuarioDTOA.setPasswordContrasenha("admin123");
//		usuarioDTOA.setPasswordContrasenhaFormat("");
//		usuarioDTOA.setPasswordPregunta("mascota");
//		usuarioDTOA.setPasswordRespuesta("cosita");
//		usuarioDTOA.setPasswordUltimaActualizacion(new Date());	
//		usuarioDTOA.setRutMember("60910000-1"); //Rut de la Persona
//		usuarioDTOA.setNombreMember("Guadalupe");//Nombre de la Persona
//		usuarioDTOA.setApellidoMember("Alvarez de Araya"); //Apellido de la Persona
//		usuarioDTOA.setMailMember("galvarez@uchile.cl"); //mail usuario
//		usuarioDTOA.setTelefonoContactoMember("29787551"); //telefono de la persona
//		usuarioDTOA.setNombrePerfil("administrador"); // al ver en la url (nombre de la persona)
//		usuarioDTOA.setUltimaConexionPerfil(new Date());  //ultima vez que realizo un login exitoso
//		usuarioDTOA.setUltimaAccionUsuario(new Date()); //ultima vez que realizo un login exitoso
//		usuarioDTOA.setEstadoUsuario(1);
//
//		usuarioDTOB.setUsernameUsuarioPerfil("Secretaria"); //Nombre a Mostrar
//		usuarioDTOB.setUsernameUsuarioPerfilLower(usuarioDTOB.getUsernameUsuarioPerfil().toLowerCase()); //nombre a comprobar
//		usuarioDTOB.setPasswordContrasenha("secretaria123");
//		usuarioDTOB.setPasswordContrasenhaFormat("");
//		usuarioDTOB.setPasswordPregunta("direccion");
//		usuarioDTOB.setPasswordRespuesta("lasEncinas");
//		usuarioDTOB.setPasswordUltimaActualizacion(new Date());	
//		usuarioDTOB.setRutMember("60910000-1"); //Rut de la Persona
//		usuarioDTOB.setNombreMember("Secretaria");//Nombre de la Persona
//		usuarioDTOB.setApellidoMember("Secretaria"); //Apellido de la Persona
//		usuarioDTOB.setMailMember("galvarez@uchile.cl"); //mail usuario
//		usuarioDTOB.setTelefonoContactoMember("29787551"); //telefono de la persona
//		usuarioDTOB.setNombrePerfil("secretaria"); // al ver en la url (nombre de la persona)
//		usuarioDTOB.setUltimaConexionPerfil(new Date());  //ultima vez que realizo un login exitoso
//		usuarioDTOB.setUltimaAccionUsuario(new Date()); //ultima vez que realizo un login exitoso
//		usuarioDTOB.setEstadoUsuario(1);
//
//		factoryServicioDAO.getUsuarioServicio().crearUsuarioDTO(usuarioDTOA);
//		factoryServicioDAO.getUsuarioServicio().crearUsuarioDTO(usuarioDTOB);
//	}

//	public void crearEmpresaServicioTest(){
//		objLog.info("crearEmpresaServicioTest");
//		EmpresaDTO empresaDTO=new EmpresaDTO();
//
//		empresaDTO.setRolUnicoIdentificadorEmpresa("60910000-1");
//		empresaDTO.setNombreEmpresa("Facultad de Artes Universidad de Chile"); //nombre fantasia
//		empresaDTO.setNombreEmpresaLower(empresaDTO.getNombreEmpresa().toLowerCase());
//		empresaDTO.setRazonSocialEmpresa(""); //nombre legal empresa
//		empresaDTO.setRazonSocialEmpresaLower("");
//		empresaDTO.setGiroEmpresa("Universidades"); // accion que hace empresa
//		empresaDTO.setDireccionOrigen("Compañia 1264");  // ubicacion legal empresa
//		empresaDTO.setPaisEmpresa("EmpresaDTO Pais Prueba");
//		empresaDTO.setIdComuna(1); //Santiago Centro
//		empresaDTO.setCiudadOrigen("Santiago");
//		empresaDTO.setEstadoEmpresa(1); 
//
//		factoryServicioDAO.getEmpresaServicio().crearEmpresaDTO(empresaDTO);
//	}

//	public void crearAplicacionEmpresaServicioTest(){
//		objLog.info("crearAplicacionEmpresaServicioTest");
//		AplicacionEmpresaDTO aplicacionEmpresaDTO=new AplicacionEmpresaDTO();
//		aplicacionEmpresaDTO.setIdAplicacion(1);
//		aplicacionEmpresaDTO.setIdEmpresa(1);
//		aplicacionEmpresaDTO.setEstadoAplicacionEmpresa(1);
//		factoryServicioDAO.getAplicacionEmpresaServicio().crearAplicacionEmpresaDTO(aplicacionEmpresaDTO);
//	}

//	public void crearEmpresaUsuarioServicioTest(){
//		objLog.info("crearEmpresaUsuarioServicioTest");
//		EmpresaUsuarioDTO empresaUsuarioDTOA=new EmpresaUsuarioDTO();
//		EmpresaUsuarioDTO empresaUsuarioDTOB=new EmpresaUsuarioDTO();
//
//		empresaUsuarioDTOA.setIdEmpresa(1);
//		empresaUsuarioDTOA.setIdUsuario(1);
//		empresaUsuarioDTOA.setEstadoEmpresaUsuario(1);
//
//		empresaUsuarioDTOB.setIdEmpresa(1);
//		empresaUsuarioDTOB.setIdUsuario(2);
//		empresaUsuarioDTOB.setEstadoEmpresaUsuario(1);
//
//		empresaUsuarioDTOA = factoryServicioDAO.getEmpresaUsuarioServicio().crearEmpresaUsuarioDTO(empresaUsuarioDTOA);
//		empresaUsuarioDTOB = factoryServicioDAO.getEmpresaUsuarioServicio().crearEmpresaUsuarioDTO(empresaUsuarioDTOB);
//	}

//	public void crearEmpresaUsuarioAplicacionEmpresaTest(){
//		objLog.info("crearEmpresaUsuarioAplicacionEmpresaTest");
//		EmpresaUsuarioAplicacionEmpresaDTO eUAEModA=new EmpresaUsuarioAplicacionEmpresaDTO();
//		EmpresaUsuarioAplicacionEmpresaDTO eUAEModB=new EmpresaUsuarioAplicacionEmpresaDTO();
//
//		eUAEModA.setIdAplicacionEmpresa(1);
//		eUAEModA.setIdEmpresaUsuario(1);
//		eUAEModA.setEstadoEmpresaUsuarioAplicacionEmpresa(1);
//
//		eUAEModB.setIdAplicacionEmpresa(1);
//		eUAEModB.setIdEmpresaUsuario(2);
//		eUAEModB.setEstadoEmpresaUsuarioAplicacionEmpresa(1);
//
//		factoryServicioDAO.getEmpresaUsuarioAplicacionEmpresaServicio().crearEmpresaUsuarioAplicacionEmpresaDTO(eUAEModA);
//		factoryServicioDAO.getEmpresaUsuarioAplicacionEmpresaServicio().crearEmpresaUsuarioAplicacionEmpresaDTO(eUAEModB);
//	}
}
