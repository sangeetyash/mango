//package com.dataseers.qa.testcases;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
////import com.dataseers.qa.base.GenerateData;
//import com.dataseers.qa.pages.LoginPage;
//import com.dataseers.qa.pages.RegisterPage;
//import com.dataseers.qa.pages.compliance.Alerts;
//import com.dataseers.qa.util.TestUtil;
//
//public class EditAlert_Test2 extends TestUtil {
//
//	RegisterPage ds_RegisterPage;
//	LoginPage ds_LoginPage;
//	Alerts ds_alerts_Page;
//
//	public EditAlert_Test2() {
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
//			ds_alerts_Page = new Alerts(d);
//		} catch (NullPointerException e) {
//			log.error("Unable to load homepage" + e);
//
//		}
//	}
//
//	@Test
//	public void Convert_Alert_Test() throws InterruptedException, IOException {
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
//			log.info("Seedportal:Redirecting to add new alerts page");
//			ds_alerts_Page.alertsPage();
//			ds_alerts_Page.searchAlert("Rupesh Wayal");
//			ds_alerts_Page.editButton();
//
//			log.info("Seedportal:Perfoming Convert Alert To Case scenario");
////			ds_alerts_Page.convertAlert();
//			ds_alerts_Page.createAlertCase();
//
//			ds_alerts_Page.selectAlertCase("select", "Rupesh Wayal");
////			ds_alerts_Page.searchAlert("Rupesh Wayal");
////			ds_alerts_Page.verifyClosedAlert();
////			ds_alerts_Page.verifyAlert("Rupesh Wayal");
//			log.info("Seedportal:Deleting newly added alerts and verifying it's deleted or not");
//		} catch (Exception e) {
//			Assert.fail("Covert to case Test scenario failed");
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
