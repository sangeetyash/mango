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
//import com.dataseers.qa.pages.rules_mdm.Processor;
//import com.dataseers.qa.util.TestUtil;
//
//public class AddProcessorRule_Test2 extends TestUtil {
//
//	RegisterPage ds_RegisterPage;
//	LoginPage ds_LoginPage;
//	Processor ds_Processor_page;
//
//	public AddProcessorRule_Test2() {
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
//			ds_Processor_page = new Processor(d);
//
//		} catch (NullPointerException e) {
//			log.error("Unable to load homepage" + e);
//
//		}
//	}
//
//	@Test
//	public void Add_Processor_Test2() throws InterruptedException, IOException {
//		try {
//
//			String user = prop.getProperty("userName");
//			String password = prop.getProperty("passWord");
//			String processor = "test"+GenerateData.generateRandomAlphaNumeric(4).toLowerCase();
////			ds_RegisterPage.proceedtoportal();
//
//			log.info("Seedportal:Login with Valid username and passw0rd");
//			ds_LoginPage.login(user, password);
//
//			ds_LoginPage.verify_successful_login();
//
//			log.info("Seedportal:Redirecting to add new processorpage");
//			ds_Processor_page.processorpage();
//			
//			ds_Processor_page.addProcessorButton();
//			ds_Processor_page.addProcessorDetails(processor);
//			ds_Processor_page.addRuleButton();
//			ds_Processor_page.selectRule("Real Time");			
//			ds_Processor_page.realTimeDetails("10:10", "add");			
//			ds_Processor_page.alertDetails("Rupesh Wayal");
//			ds_Processor_page.saveProcessor();
//			ds_Processor_page.searchProcessor(processor);
//			ds_Processor_page.verifyProcessor(processor);
//		
//			log.info("Seedportal:Redirecting back to processor list page");
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
//			d.quit();
//			log.info("******************END**********************");
//			log.info("browser closed");
//		} catch (Exception e) {
//			log.error("browser not closed");
//		}
//	}
//}
