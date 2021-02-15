//package com.dataseers.qa.testcases;
//
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//
////import com.dataseers.qa.base.GenerateData;
//import com.dataseers.qa.pages.*;
//import com.dataseers.qa.pages.compliance.ds_AddAlerts;
//import com.dataseers.qa.util.TestUtil;
//
//public class AddAlert_Test1 extends TestUtil {
//
//	RegisterPage ds_RegisterPage;
//	LoginPage ds_LoginPage;
//	ds_AddAlerts ds_alerts_Page;
//
//	public AddAlert_Test1() {
//		super();// Calls the TestBase class
//		log.info("************************** DS-Seed portal Add new alerts Page TEST  *****************************");
//	}
//
//	@BeforeTest
//	public void setUp() throws MalformedURLException, InterruptedException {
//		try {
//			log.info("Initalizing the seed portal login Page with all fields");
//			intialization();
//			ds_RegisterPage = new RegisterPage(d);
//			ds_LoginPage = new LoginPage(d);
//			ds_alerts_Page = new ds_AddAlerts(d);
//		} catch (NullPointerException e) {
//			log.error("Unable to load homepage" + e);
//
//		}
//	}
//
//	@Test
//	public void Add_Alert_Test() throws InterruptedException, IOException {
//		try {
//
//			String user = prop.getProperty("userName");
//			String password = prop.getProperty("passWord");
////			String alertData = "Test" + GenerateData.generateRandomAlphaNumeric(4);
////			ds_RegisterPage.proceedtoportal();
//
//			log.info("Seedportal:Login with Valid user and passw0rd");
//			ds_LoginPage.login(user, password);
//
//			ds_LoginPage.verify_successful_login();
//
//			log.info("Seedportal:Redirecting to add new alerts page");
//			ds_alerts_Page.alertsPage();
//			ds_alerts_Page.addAlertsButton();
//			ds_alerts_Page.alertAPIDetails();
//
//			ds_alerts_Page.addAlertDetails("Rupesh Wayal", "High");
//			ds_alerts_Page.accountNumber();
//			ds_alerts_Page.cardNumber();
//			log.info("Seedportal:hitting Save button and redirecting back to alerts management page");
//			ds_alerts_Page.saveAlert();
//			ds_alerts_Page.searchAlert("Rupesh Wayal");
//			ds_alerts_Page.verifyAlert("Rupesh Wayal");
////			log.info("Seedportal:Deleting newly added alerts and verifying it's deleted or not");
//		} catch (Exception e) {
//			Assert.fail("add alert test failed");
//		}
//		
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
