package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.administration.*;
import com.dataseers.qa.util.TestUtil;

public class SearchAuditLog_Test extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	AuditLogs ds_audit_log_Page;

	public SearchAuditLog_Test() {
		super();// Calls the TestBase class
		log.info("************************** DS-Seed portal Add new program Page TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			ds_RegisterPage = new RegisterPage(d);
			ds_LoginPage = new LoginPage(d);
			ds_audit_log_Page = new AuditLogs(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void Add_Newprogram_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");

//			ds_RegisterPage.proceedtoportal();

			log.info("Seedportal:Login with Valid username and passw0rd");
			ds_LoginPage.login(user, password);

			ds_LoginPage.verify_successful_login();

			log.info("Seedportal:Redirecting to Audit Logs page");
			log.info("Seedportal:Filling all required deatils and hitting Search button");

			ds_audit_log_Page.auditlogsPage();
			ds_audit_log_Page.searchDetails("Rupesh Wayal", "User Management");

			log.info("Seedportal:Verifying Searched results");
			ds_audit_log_Page.searchAudit("Rupesh Wayal", "User Management");
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
