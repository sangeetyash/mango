package com.dataseers.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.user_details.ChangePassword;
import com.dataseers.qa.pages.user_details.EditProfile;
import com.dataseers.qa.util.TestUtil;

public class EditProfile_Test extends TestUtil
{

RegisterPage ds_RegisterPage;
LoginPage  ds_LoginPage;
ChangePassword  ds_Change_pwd_Page;
EditProfile ds_Edit_profile_Page;


public EditProfile_Test() 
{
super();// Calls the TestBase2 class
log.info("************************** DS-Seed portal Edit profile Page TEST  *****************************");
}
@BeforeTest
public void setUp() throws MalformedURLException, InterruptedException 
{
try
{
log.info("Initalizing the seed portal's all required Pages");
intialization();
ds_LoginPage  = new LoginPage(d);
ds_RegisterPage  = new RegisterPage(d);
ds_Change_pwd_Page= new ChangePassword(d);
ds_Edit_profile_Page= new EditProfile(d);

}
catch (NullPointerException e) 
{
log.error("Unable to load homepage" + e);

}
}	
@Test
public void Edit_Profile_Test() throws InterruptedException, IOException 
{
	try {
String user=prop.getProperty("userName");
String password=prop.getProperty("passWord");

//ds_RegisterPage.proceedtoportal();

log.info("Seedportal:Login with Valid username and passw0rd");
ds_LoginPage.login(user,password);
ds_LoginPage.verify_successful_login();

log.info("Seedportal:Redirecting to Edit Profile page");
ds_Edit_profile_Page.edit_profile_page();
ds_Edit_profile_Page.Enter_user_details();
ds_Edit_profile_Page.save_details();
log.info("Seedportal:Verifying Logged out user");
ds_LoginPage.logout();


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
					
					


					
	
