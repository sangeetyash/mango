package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.administration.*;
import com.dataseers.qa.util.TestUtil;

public class EditReportGroup_Test1 extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	ReportGroups ds_Report_Group_Page;

	public EditReportGroup_Test1() {
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
			ds_Report_Group_Page = new ReportGroups(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void Edit_ReportGroup_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");
			String reportGroup = TestUtil.selectquery(dbprop.getProperty("selectReportGroup"));

//			ds_RegisterPage.proceedtoportal();

			log.info("Seedportal:Login with Valid Reportname and passw0rd");
			ds_LoginPage.login(user, password);

			ds_LoginPage.verify_successful_login();

			log.info("Seedportal:Redirecting to add new Report group page");
			ds_Report_Group_Page.reportGroupsPage();

			ds_Report_Group_Page.searchProgram(reportGroup);

			ds_Report_Group_Page.editReportGroup(reportGroup);

			ds_Report_Group_Page.addreportDetails(reportGroup);
			ds_Report_Group_Page.selectReportGroups();

			log.info("Seedportal:hitting Save button and redirecting back to Report group page");
			ds_Report_Group_Page.savereport();

//			log.info("Seedportal:Deleting newly added report group and verifying it's deleted or not");
//			ds_Report_Group_Page.deletereportdb();
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
