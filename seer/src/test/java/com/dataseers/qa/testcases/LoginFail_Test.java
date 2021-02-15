package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.util.TestUtil;

public class LoginFail_Test extends TestUtil
{

RegisterPage ds_RegisterPage;
LoginPage  ds_LoginPage;



public LoginFail_Test() 
{
super();// Calls the TestBase class
log.info("************************** DS Seed portal login TEST  *****************************");
}
@BeforeTest
public void setUp() throws MalformedURLException, InterruptedException 
{
try
{
log.info("Initalizing the seed portal login Page with all fields");
intialization();
ds_LoginPage  = new LoginPage(d);
ds_RegisterPage  = new RegisterPage(d);

}
catch (NullPointerException e) 
{
log.error("Unable to load homepage" + e);
}
}	
@Test
public void Invalid_Login_Test() throws InterruptedException, IOException 
{
	try {
String user=prop.getProperty("userName");
String password=prop.getProperty("passWord");
ds_RegisterPage.proceedtoportal();
log.info("Nimbus:Running test:ds_LoginPage_Test()");

log.info("Validate present text on login page");
ds_LoginPage.verify_loginpage_text();


log.info("Login with Invalid username");
ds_LoginPage.login("123",password);
ds_LoginPage.invaliduser();
ds_LoginPage.clearlogin();

log.info("Login with Invalid username");
ds_LoginPage.login("123","xuz");
ds_LoginPage.invaliduser();
ds_LoginPage.clearlogin();

log.info("Login with Invalid passw0rd for locked account scenario");
for(int i=0;i<2;i++) {
ds_LoginPage.login(user,GenerateData.generateRandomAlphaNumeric(8));
Thread.sleep(1000);
ds_LoginPage.clearlogin();
}

log.info("Login with Invalid passw0rd");
ds_LoginPage.login(user,GenerateData.generateRandomString(1));
ds_LoginPage.lockedAccount();

ds_LoginPage.setloginAttempts();

	}
	catch(Exception e){
	Assert.fail();	
	}
}	
@AfterClass
public void Quit_Browser_Test()
{
try
{ 
	
log.info(" Seedportal:Closing the current browser session");
d.quit();
log.info("******************END**********************");
log.info("browser closed");
}
catch(Exception e)
{
log.error("browser not closed");					
}						
}
}
					
					


					
	
