package com.dataseers.qa.test1;

import java.net.MalformedURLException;
import java.util.Properties;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.page1.ForgotPasswordPage;
import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.util.TestUtil;

public class ForgotPasswordPageTest extends TestUtil {

	LoginPage loginPage;
	ForgotPasswordPage forgotPasswordPage;
	
	public ForgotPasswordPageTest()
	{
		super();// Calls the TestBase2 class
        log.info("************************** DS Seer portal login TEST  *****************************");
	}
	
	@BeforeTest
	public void setUp()  throws MalformedURLException {

		try
		{
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			loginPage  = new LoginPage(d);
			forgotPasswordPage = new ForgotPasswordPage(d);
		}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}

	@Test(priority=1)
	public void verifyBlankEmailField(){

		forgotPasswordPage.clickOnForgotPasswordLink();
		forgotPasswordPage.getBlankErrorMessage();

		String blankMailErrorMessage = forgotPasswordPage.getBlankErrorMessage();
		System.out.println("Error message is: "+blankMailErrorMessage);
		Assert.assertEquals(blankMailErrorMessage, "Please enter e-mail!");
	}

	@Test(priority=2)
	public void verifyInvalidEmailMessage(){

		forgotPasswordPage.getinvalidEmailMessage();

		String invalidMailErrorMessage = forgotPasswordPage.getinvalidEmailMessage();
		System.out.println("Error message is: "+invalidMailErrorMessage);
		Assert.assertEquals(invalidMailErrorMessage, "Please enter valid e-mail!");
	}

	@Test(priority=3)
	public void verifyForgotPasswordFunctionality(){

	}

	@AfterTest
	public void tearDown() throws InterruptedException{
		Thread.sleep(10000);
		d.quit();
	}

}
