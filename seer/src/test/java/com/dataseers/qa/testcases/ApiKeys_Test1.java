package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.administration.*;
import com.dataseers.qa.util.TestUtil;

public class ApiKeys_Test1 extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	ApiKeys ds_ApiKeys_Page;

	public ApiKeys_Test1() {
		super();// Calls the TestBase class
		log.info("************************** DS-Seed portal Add new API Key Page TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			ds_RegisterPage = new RegisterPage(d);
			ds_LoginPage = new LoginPage(d);
			ds_ApiKeys_Page = new ApiKeys(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void Add_NewClient_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");

//ds_RegisterPage.proceedtoportal();

			log.info("Seedportal:Login with Valid username and passw0rd");
			ds_LoginPage.login(user, password);
//			ds_LoginPage.verify_successful_login();
			Thread.sleep(2000);
			ds_ApiKeys_Page.apikeyMgmtPage();
			log.info("Seedportal:Entering data in manage api section fields");
			ds_ApiKeys_Page.manageApiKeys(0);

			log.info("Seedportal:Selecting permission details");
			ds_ApiKeys_Page.permissions("Global Admin", "Global Reports", "Global Program");

			log.info("Selecting real-time ingest details");
			ds_ApiKeys_Page.realTimeIngest(2, 0);

			log.info("Selecting IP restrictions details");
			ds_ApiKeys_Page.ipRestrictions(2);

			ds_ApiKeys_Page.saveApiKey();
//			ds_ApiKeys_Page.editApiKey();

//			ds_ApiKeys_Page.deleteApiKeyDB();
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
