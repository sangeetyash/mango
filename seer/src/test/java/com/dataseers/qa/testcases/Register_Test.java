package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.pages.RegisterPage;
import com.dataseers.qa.util.TestUtil;

public class Register_Test extends TestUtil {
	RegisterPage ds_RegisterPage;

	public Register_Test() {
		super();// Calls the TestBase class
		log.info("************************** Seedportal registeration TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Nimbus:Initalizing the seed portal registeration Page with all fields");
			intialization();
			ds_RegisterPage = new RegisterPage(d);

		} catch (NullPointerException e) {
			log.error("Unable to load registeration page" + e);
		}
	}

	@Test
	public void Registeration_Test() throws InterruptedException, IOException {
		ds_RegisterPage.proceedtoportal();
		log.info("Running test:ds_RegisterPage_Test()");
		log.info("Registeration with valid username details");
		ds_RegisterPage.register();

	}

	@AfterClass
	public void Quit_Browser_Test() {
		try {
			log.info("Nimbus:Closing the current browser session");
			d.quit();
			log.info("******************END**********************");
			log.info("browser closed");
		} catch (Exception e) {
			log.error("browser not closed");
		}
	}
}
