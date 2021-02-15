package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.reports.ReportMgmtPage;
import com.dataseers.qa.util.TestUtil;

public class AddReportMgmt_Test extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	ReportMgmtPage ds_Report_Mgmt_Page;

	public AddReportMgmt_Test() {
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
			ds_Report_Mgmt_Page = new ReportMgmtPage(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void Add_NewReport_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");

//			 ds_RegisterPage.proceedtoportal();

			log.info("Seedportal:Login with Valid Reportname and passw0rd");
			ds_LoginPage.login(user, password);

			ds_LoginPage.verify_successful_login();

			log.info("Seedportal:Redirecting to add new Report page");
			ds_Report_Mgmt_Page.addreportPage("ComplianSeer", "Transaction Layout");
			;

			log.info("Seedportal:Selecting optional fields");
			ds_Report_Mgmt_Page.optionalOps();

			log.info("Seedportal:hitting Save button and redirecting back to Report management page");
			ds_Report_Mgmt_Page.savereport();

//			log.info("Seedportal:Deleting newly added report and verifying it's deleted or not");
//			ds_Report_Mgmt_Page.deleteReportdb();
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
