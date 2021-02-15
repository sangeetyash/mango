package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.rules_mdm.MerchantMgmt;
import com.dataseers.qa.util.TestUtil;

public class AddMerchant_Test1 extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	MerchantMgmt ds_MerchantMgmt_page;

	public AddMerchant_Test1() {
		super();// Calls the TestBase class
		log.info("************************** DS-Seed portal Add  merchant Page TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			ds_RegisterPage = new RegisterPage(d);
			ds_LoginPage = new LoginPage(d);
			ds_MerchantMgmt_page = new MerchantMgmt(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void Add_Merchant_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");
			String merchantData = GenerateData.generateRandomString(6).toLowerCase();
//			ds_RegisterPage.proceedtoportal();
			String url=prop.getProperty("url");
			log.info(url);
			log.info("Seedportal:Login with Valid username and passw0rd");
			ds_LoginPage.login(user, password);

			ds_LoginPage.verify_successful_login();

			log.info("Seedportal:Redirecting to add new Merchant page");
			ds_MerchantMgmt_page.merchantMgmtPage();
//			ds_MerchantMgmt_page.editMerchant("Abc");

			ds_MerchantMgmt_page.addMerchantButton();
			ds_MerchantMgmt_page.merchantDetails(merchantData);
			ds_MerchantMgmt_page.mccDropDown();

			ds_MerchantMgmt_page.synonyms(merchantData);
			ds_MerchantMgmt_page.merchantLocations();
			ds_MerchantMgmt_page.locationDetails(merchantData,"123456");
			ds_MerchantMgmt_page.addCountryDetails( "India");			
			ds_MerchantMgmt_page.saveMerchant();

			log.info("Seedportal:Redirecting back to Merchant management page");

		} catch (Exception e) {
		}
	}

	@AfterClass
	public void Quit_Browser_Test() {
		try {

			log.info("Seedportal:Closing the current browser session");
//			d.quit();
			log.info("******************END**********************");
			log.info("browser closed");
		} catch (Exception e) {
			log.error("browser not closed");
		}
	}
}
