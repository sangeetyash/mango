package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.user_details.ChangePassword;
import com.dataseers.qa.util.TestUtil;

public class ChangePassword_Test extends TestUtil
{

RegisterPage ds_RegisterPage;
LoginPage  ds_LoginPage;
ChangePassword  ds_Change_pwd_Page;



public ChangePassword_Test() 
{
super();// Calls the TestBase2 class
log.info("************************** DS-Seed portal Change Password Page TEST  *****************************");
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
ds_Change_pwd_Page= new ChangePassword(d);

}
catch (NullPointerException e) 
{
log.error("Unable to load homepage" + e);

}
}	
@Test
public void Change_Password_Test() throws InterruptedException, IOException 
{
	try {
String user=prop.getProperty("userName");
String password=prop.getProperty("passWord");
String password_new=GenerateData.generateRandomAlphaNumeric(8)+"@";

//ds_RegisterPage.proceedtoportal();

log.info("Seedportal:Login with Valid username and passw0rd");
ds_LoginPage.login(user,password);
ds_LoginPage.verify_successful_login();

log.info("Seedportal:Redirecting to change password page");
ds_Change_pwd_Page.change_pwd_page();
ds_Change_pwd_Page.Enter_new_password(password, password_new, password_new);
ds_Change_pwd_Page.save_password();

log.info("Seedportal:Verifying Logged out user");
ds_LoginPage.logout();
//ds_LoginPage.verify_loginpage_text();
//log.info("Seedportal:Login with Changed Valid username and passw0rd");
ds_Change_pwd_Page.resetPassworddb();
	}
	catch(Exception e){
		Assert.fail("change password test failed");
	}
}	

@AfterClass
public void Quit_Browser_Test()
{
try
{ 
	
	log.info("Seedportal:Closing the current browser session");
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
					
					


					
	
