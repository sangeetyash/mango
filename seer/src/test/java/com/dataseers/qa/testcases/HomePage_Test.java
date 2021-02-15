package com.dataseers.qa.testcases;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.sql.SQLException;
//
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.pages.HomePage;
import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.pages.RegisterPage;
import com.dataseers.qa.util.TestUtil;

public class HomePage_Test extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	HomePage ds_HomePage;

	public HomePage_Test() {
		super();// Calls the TestBase class
		log.info("************************** DS Seed portal login TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			ds_LoginPage = new LoginPage(d);
			ds_RegisterPage = new RegisterPage(d);
			ds_HomePage = new HomePage(d);
		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);
		}
	}

	@Test
	public void verify_Homepage_Test() throws InterruptedException, IOException, SQLException {
		String user = prop.getProperty("userName");
		String password = prop.getProperty("passWord");
//		ds_RegisterPage.proceedtoportal();
		log.info("Seedportal:Login with Valid username and passw0rd");
		ds_LoginPage.login(user, password);
//		ds_LoginPage.verify_successful_login();
//		log.info("Seedportal:Comparing displayed homepage statsics with db statsics");
//		ds_HomePage.clusterdb1();

	}

	@AfterClass
	public void Quit_Browser_Test() {
		try {
			log.info("Seedportal:Closing the current browser session");
			d.quit();
			log.info("******************END**********************");
			log.info("browser closed");
		} catch (Exception e) {
			log.error("browser not closed");
		}
	}
}
