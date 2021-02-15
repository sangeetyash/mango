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

public class AddProgramGroup_Test extends TestUtil {

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;
	ProgramGroups ds_program_Group_Page;

	public AddProgramGroup_Test() {
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
			ds_program_Group_Page = new ProgramGroups(d);

		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);

		}
	}

	@Test
	public void Add_Newprogram_Test() throws InterruptedException, IOException {
		try {

			String user = prop.getProperty("userName");
			String password = prop.getProperty("passWord");
			String programGroup ="Test"+GenerateData.generateRandomAlphaNumeric(4);
//			ds_RegisterPage.proceedtoportal();

			log.info("Seedportal:Login with Valid user and passw0rd");
			ds_LoginPage.login(user, password);

			ds_LoginPage.verify_successful_login();
			
			log.info("Seedportal:Redirecting to add new program page");
			ds_program_Group_Page.programGroupsPage();
			ds_program_Group_Page.addProgramGroupsButton();
			ds_program_Group_Page.programDetails(1,programGroup);

			log.info("Seedportal:hitting Save button and redirecting back to program management page");
			ds_program_Group_Page.saveprogram();
			ds_program_Group_Page.verifyProgram(programGroup);
			

//			log.info("Seedportal:Deleting newly added program and verifying it's deleted or not");
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
