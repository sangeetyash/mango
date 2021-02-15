package com.dataseers.qa.test1;

import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.page1.ForgotPasswordPage;
import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.util.TestUtil;

public class ForgotPasswordPageTest2  extends TestUtil {

	LoginPage loginPage;
	ForgotPasswordPage forgotPasswordPage;
	
	public ForgotPasswordPageTest2()
	{
		super();// Calls the TestBase2 class
        log.info("************************** DS Seer portal login TEST  *****************************");
	}
	
	@BeforeTest
	public void setUp() throws MalformedURLException{

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
	public void verifyBlankEmailField() throws InterruptedException{
		
		d.findElement(By.linkText("Forgot Password?")).click();
		d.findElement(By.id("normal_login_email")).clear();
		d.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
		Thread.sleep(3000);
		String blankMessage = d.findElement(By.className("ant-form-explain")).getText();
				
		System.out.println("Error message is: "+blankMessage);
		Assert.assertEquals(blankMessage, "Please enter e-mail!");
	}
	
	@Test(priority=2)
	public void verifyInvalidEmailMessage(){
//		loginPage.loginPage1();
//		forgotPassword.clickOnForgotPasswordLink();
//		forgotPasswordPage.getinvalidEmailMessage();

		d.findElement(By.id("normal_login_email")).sendKeys("jchavathe@");
		
		String invalidMailErrorMessage = d.findElement(By.className("ant-form-explain")).getText();
		
		System.out.println("Error message is: "+invalidMailErrorMessage);
		Assert.assertEquals(invalidMailErrorMessage, "Please enter valid e-mail!");
	}
	
	@Test(priority=3)
	public void verifyForgotPasswordFunctionality() throws InterruptedException{
		d.findElement(By.id("normal_login_email")).clear();
		d.findElement(By.id("normal_login_email")).sendKeys("jchavathe@dataseers.in");
		d.findElement(By.xpath("//button[@class='ant-btn ant-btn-primary']")).click();
		
		Thread.sleep(3000);
		
		String emailMessage = d.findElement(By.xpath("//span[contains(text(),'We have sent a link to reset your password on your')]")).getText();
		Assert.assertEquals(emailMessage, "We have sent a link to reset your password on your registered email. Please check your email.");
		
	}
	
	@AfterTest
	public void tearDown() throws InterruptedException{
		Thread.sleep(10000);
		d.quit();
	}
}