package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.RegisterPage;
import com.dataseers.qa.util.ExcelUtils;
import com.dataseers.qa.util.TestUtil;

public class Sucesslogin_Test extends TestUtil {
	
//	WebDriver d;
//	WebDriverWait wait = new WebDriverWait(d, 10);
//    Actions actions= new Actions(d);

	RegisterPage ds_RegisterPage;
	LoginPage ds_LoginPage;

	@CacheLookup
	@FindBy(id="details-button")
	WebElement Advanced;
	//
	@CacheLookup
	@FindBy(id="proceed-link")
	WebElement Proceed;
	String defaultpath = System.getProperty("user.dir");

	public Sucesslogin_Test() {
		super();// Calls the TestBase2 class
		log.info("************************** DS Seed portal login TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException {
		try {
			log.info("Initalizing the seed portal login Page with all fields");
			log.info("User directory->"+defaultpath);
			
			System.out.println("User directory->"+defaultpath);
			System.out.println("User OS->"+System.getProperty("os.name").toLowerCase());

			intialization();
			ds_LoginPage = new LoginPage(d);
			ds_RegisterPage = new RegisterPage(d);
		} catch (NullPointerException e) {
			log.error("Unable to load homepage" + e);
		}
	}

	@Test
	public void Successful_Login_Test() throws InterruptedException, IOException {
		String user = prop.getProperty("userName");
		String password = prop.getProperty("passWord");
 
		log.info("Nimbus:Running test:ds_LoginPage_Test()");

		log.info("Validate present text on login page");
		
		log.info("Seedportal:Login with Valid username and passw0rd");
		
		
		ds_LoginPage.login(user, password);
		log.info("Seedportal:Verifying Logged out user");
		ds_LoginPage.logout();

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
