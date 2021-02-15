//package com.dataseers.qa.testcases;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.dataseers.qa.base.GenerateData;
//import com.dataseers.qa.pages.LoginPage;
//import com.dataseers.qa.pages.RegisterPage;
//import com.dataseers.qa.pages.rules_mdm.ProgramMatrix;
//import com.dataseers.qa.util.TestUtil;
//
//public class EditProgramMatrix_Test1 extends TestUtil {
//
//	RegisterPage ds_RegisterPage;
//	LoginPage ds_LoginPage;
//	ProgramMatrix ds_ProgramMatrix_page;
//
//	public EditProgramMatrix_Test1() {
//		super();// Calls the TestBase class
//		log.info("************************** DS-Seed portal Add new client Page TEST  *****************************");
//	}
//
//	@BeforeTest
//	public void setUp() throws MalformedURLException, InterruptedException {
//		try {
//			log.info("Initalizing the seed portal login Page with all fields");
//			intialization();
//			ds_RegisterPage = new RegisterPage(d);
//			ds_LoginPage = new LoginPage(d);
//			ds_ProgramMatrix_page = new ProgramMatrix(d);
//
//		} catch (NullPointerException e) {
//			log.error("Unable to load homepage" + e);
//
//		}
//	}
//
//	@Test
//	public void Edit_ProgramMatrix_Test() throws InterruptedException, IOException {
//		try {
//			String programData =TestUtil.selectquery(dbprop.getProperty("selectProgram"));
//			
//			String processor = TestUtil.selectquery(dbprop.getProperty("selectProgramProcessor"));
//			String user = prop.getProperty("userName");
//			String password = prop.getProperty("passWord");
//
////			ds_RegisterPage.proceedtoportal();
//
//			log.info("Seedportal:Login with Valid username and passw0rd");
//			ds_LoginPage.login(user, password);
//
//			ds_LoginPage.verify_successful_login();
//
//			log.info("Seedportal:Redirecting to add new program matrix page");
//			ds_ProgramMatrix_page.programMatrixPage();
//			ds_ProgramMatrix_page.editProgram(programData);
//
//			
//			ds_ProgramMatrix_page.programDetails("USD", "Core Card", "CBKC", "B2C", programData);
//			ds_ProgramMatrix_page.cardFeatures("Open", "Credit", programData);
////			ds_ProgramMatrix_page.networks();
//
//			ds_ProgramMatrix_page.features();
//			ds_ProgramMatrix_page.fundings();
//
////			ds_ProgramMatrix_page.velocityLimits();
//			ds_ProgramMatrix_page.lifeTimeLimits();
//			ds_ProgramMatrix_page.mcc();
//
//			ds_ProgramMatrix_page.country();
//			ds_ProgramMatrix_page.feeMatrix();
//			ds_ProgramMatrix_page.save();
//			ds_ProgramMatrix_page.searchProgram(programData);
//			ds_ProgramMatrix_page.verifyProgram(programData);
//			log.info("Seedportal:Redirecting back to program matrix management page");
//
//		} catch (Exception e) {
//		}
//	}
//
//	@AfterClass
//	public void Quit_Browser_Test() {
//		try {
//
//			log.info("Seedportal:Closing the current browser session");
////			d.quit();
//			log.info("******************END**********************");
//			log.info("browser closed");
//		} catch (Exception e) {
//			log.error("browser not closed");
//		}
//	}
//}
