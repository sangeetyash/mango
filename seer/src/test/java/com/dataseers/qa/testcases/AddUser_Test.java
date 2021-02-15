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

public class AddUser_Test extends TestUtil
{

RegisterPage ds_RegisterPage;
LoginPage  ds_LoginPage;
UserMgmt  ds_User_Mgmt_Page;

public AddUser_Test() 
{
super();// Calls the TestBase class
log.info("************************** DS-Seed portal Add new User Page TEST  *****************************");
}
@BeforeTest
public void setUp() throws MalformedURLException, InterruptedException 
{
try
{
log.info("Initalizing the seed portal login Page with all fields");
intialization();
ds_RegisterPage  = new RegisterPage(d);
ds_LoginPage  = new LoginPage(d);
ds_User_Mgmt_Page= new UserMgmt(d);

}
catch (NullPointerException e) 
{
log.error("Unable to load homepage" + e);

}
}	
@Test
public void Add_NewUser_Test() throws InterruptedException, IOException 
{
	try {
		
String user=prop.getProperty("userName");
String password=prop.getProperty("passWord");
String userName=GenerateData.generateRandomString(6);
//ds_RegisterPage.proceedtoportal();

log.info("Seedportal:Login with Valid username and passw0rd");
ds_LoginPage.login(user,password);
Thread.sleep(2000);
ds_User_Mgmt_Page.userMgmtPage();

log.info("Seedportal:Redirecting to add new User page");

ds_User_Mgmt_Page.addUserButton();
ds_User_Mgmt_Page.adduserDetails(userName,"Global","Global","Global");
ds_User_Mgmt_Page.saveuser();
Thread.sleep(2000);
ds_User_Mgmt_Page.searchUser(userName);
//ds_User_Mgmt_Page.verifyUser(userName);


//ds_User_Mgmt_Page.deleteUserdb();


	}
	catch(Exception e){
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
					
					


					
	
