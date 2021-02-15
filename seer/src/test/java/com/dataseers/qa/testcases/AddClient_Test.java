package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.administration.*;
import com.dataseers.qa.util.TestUtil;

public class AddClient_Test extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	ClientMgmt ds_Client_Mgmt_Page;

	public AddClient_Test() {
		super();// Calls the TestBase class
		log.info("************************** DS-Seed portal Add new client Page TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			ds_RegisterPage = new RegisterPage(d);
			ds_LoginPage = new LoginPage(d);
			ds_Client_Mgmt_Page = new ClientMgmt(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void Add_NewClient_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");
			String clientData = "testclient" + GenerateData.generateRandomString(3).toLowerCase();
			
			log.info("Seedportal:Login with Valid username and passw0rd");
			ds_LoginPage.login(user, password);

			ds_LoginPage.verify_successful_login();

			ds_Client_Mgmt_Page.clientMgmtPage();

			ds_Client_Mgmt_Page.addClientButton();
			
			log.info("Seedportal:Redirecting to add new client page");
			ds_Client_Mgmt_Page.clientBasicDetails(clientData);
			ds_Client_Mgmt_Page.clientDropDowns();
			ds_Client_Mgmt_Page.clientContactDetails(clientData);
			ds_Client_Mgmt_Page.sameBillingBox();
			ds_Client_Mgmt_Page.dashBoardConfig();
			
			ds_Client_Mgmt_Page.clickActiveToggle();

			ds_Client_Mgmt_Page.saveClient();
			ds_Client_Mgmt_Page.verifyClient(clientData);

			log.info("Seedportal:Redirecting back to client management page");

		} catch (Exception e) {
		}
	}

	@AfterClass
	public void Quit_Browser_Test() {
		try {

			log.info("Seedportal:Closing the current browser session");
			Thread.sleep(2000);
			d.quit();
			log.info("******************END**********************");
			log.info("browser closed");
		} catch (Exception e) {
			log.error("browser not closed");
		}
	}
}
