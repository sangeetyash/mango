package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.pages.RegisterPage;
import com.dataseers.qa.pages.reports.realtimemesseges.AccountHolderPage;
import com.dataseers.qa.util.TestUtil;

public class RealTimeAccountHolder_Test1 extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	AccountHolderPage ds_AccountHolderPage;

	public RealTimeAccountHolder_Test1() {
		super();// Calls the TestBase class
		log.info("************************** DS-Seed portal Add new Report Page TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			ds_RegisterPage = new RegisterPage(d);
			ds_LoginPage = new LoginPage(d);
			ds_AccountHolderPage = new AccountHolderPage(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void RalTime_AccountHolder_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");

//			ds_RegisterPage.proceedtoportal();

			log.info("Seedportal:Login with Valid Reportname and passw0rd");
			ds_LoginPage.login(user, password);

			ds_LoginPage.verify_successful_login();

			log.info("Seedportal:Redirecting to real time message Account holder page");
			ds_AccountHolderPage.searchDetails();
			ds_AccountHolderPage.verifyAccountHolderSearch();
			ds_AccountHolderPage.verifyAccountHolderResponse();
		} catch (Exception e) {
		}
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
