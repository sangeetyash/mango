package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.administration.*;
import com.dataseers.qa.util.TestUtil;

public class addRole_Test1 extends TestUtil {

//	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	RoleMgmt ds_Role_Mgmt_Page;

	public addRole_Test1() {
		super();// Calls the TestBase class
		log.info("************************** DS-Seed portal Add new role Page TEST  *****************************");
	}

	@BeforeTest 
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
//			ds_RegisterPage = new RegisterPage(d);
			ds_LoginPage = new LoginPage(d);
			ds_Role_Mgmt_Page = new RoleMgmt(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void edit_Role_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");
			String roleData = "role test";

//			ds_RegisterPage.proceedtoportal();

			log.info("Seedportal:Login with Valid rolename and passw0rd");
			ds_LoginPage.login(user, password);
			ds_LoginPage.verify_successful_login();
			ds_Role_Mgmt_Page.roleMgmtPage();

			log.info("Seedportal:Redirecting to add new role page");
			ds_Role_Mgmt_Page.addRoleButton();
			ds_Role_Mgmt_Page.roleName();
//			ds_Role_Mgmt_Page.expandRoleMenu();
//			ds_Role_Mgmt_Page.expandRoleMenu();
			ds_Role_Mgmt_Page.rolePermissions("Read/Write/Admin");
			ds_Role_Mgmt_Page.escalateToDropdowns("Global Admin");
			ds_Role_Mgmt_Page.hideToggles();
			ds_Role_Mgmt_Page.saveRole();
//			ds_Role_Mgmt_Page.searchRole(roleData);
//			ds_Role_Mgmt_Page.verifyRole(roleData);
//			ds_Role_Mgmt_Page.isDeleted();
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
