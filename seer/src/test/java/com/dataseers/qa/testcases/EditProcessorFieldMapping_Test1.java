//package com.dataseers.qa.testcases;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//
//import org.openqa.selenium.By;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.dataseers.qa.pages.LoginPage;
//import com.dataseers.qa.pages.RegisterPage;
//import com.dataseers.qa.pages.rules_mdm.Processor;
//import com.dataseers.qa.util.TestUtil;
//
//public class EditProcessorFieldMapping_Test1 extends TestUtil {
//
//	RegisterPage ds_RegisterPage;
//	LoginPage ds_LoginPage;
//	Processor ds_Processor_page;
//
//	public EditProcessorFieldMapping_Test1() {
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
//	public void Edit_Processor_Test1() throws InterruptedException, IOException {
//		try {
//			String user = prop.getProperty("userName");
//			String password = prop.getProperty("passWord");
//			String processor = TestUtil.selectquery(dbprop.getProperty("editFileMapping"));
//			log.info(processor);
////			ds_RegisterPage.proceedtoportal();
//
//			log.info("Seedportal:Login with Valid username and passw0rd");
//			ds_LoginPage.login(user, password);
//
//			ds_LoginPage.verify_successful_login();
//
//			log.info("Seedportal:Redirecting to add new processorpage");
//			ds_Processor_page.processorpage();
//			ds_Processor_page.searchProcessor(processor);
//			ds_Processor_page.editProcessorBtn(processor);
//			ds_Processor_page.fieldMapExcelUpload();
//			ds_Processor_page.editFieldMapping();
//
//			log.info("Seedportal:Redirecting back to processor list page");
//			
////			d.findElement(By.xpath("//*[text()='Record has been updated successfully.']")).isDisplayed();
//
//			TestUtil.deleteQuerykeydb(dbprop.getProperty("deleteProcessor"));
//		} catch (Exception e) {
//			Assert.fail("Edit processor test failed");
//
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
