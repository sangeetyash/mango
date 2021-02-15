
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.compliance.ReasonCodes;
import com.dataseers.qa.util.TestUtil;

public class ReasonCodes_Test extends TestUtil
{
	LoginPage  ds_LoginPage;
	ReasonCodes ds_ReasonCodes;

	public ReasonCodes_Test() 
	{
		super();// Calls the TestBase2 class
		log.info("************************** DS Seed portal login TEST  *****************************");
	}
	
	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException 
	{
		try
			{
				log.info("Initalizing the seed portal login Page with all fields");
				intialization();
				//ds_RegisterPage  = new ds_RegisterPage(d);
				ds_LoginPage  = new LoginPage(d);
				ds_ReasonCodes = new ReasonCodes(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	

	@Test
	public void Add_ReasonCodes_Test() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				ds_LoginPage.verify_successful_login();
		
				ds_ReasonCodes.ReasonCodesPage();
				log.info("Seedportal:Redirecting to add new Reason codes");
				ds_ReasonCodes.addreasonPage();
				ds_ReasonCodes.saveReasonCodes();
//				Thread.sleep(2000);
//				ds_ReasonCodes.cancelReasonCodes();
			}
		catch(Exception e)
			{
			log.error("could not add and delete from db");
			}	
	}
//	
//	@Test
//	public void Cancel_ReasonCodes_Test() throws InterruptedException, IOException
//	{
//		try 	
//			{
////				String user=prop.getProperty("userName");
////				String password=prop.getProperty("passWord");
////				log.info("Seedportal:Login with Valid username and password");
////				ds_LoginPage.login(user,password);
////				ds_LoginPage.verify_successful_login();
////				ds_ReasonCodes.ReasonCodesPage();
//				log.info("Seedportal:Redirecting to add new Reason codes");
//				ds_ReasonCodes.addreasonPage();
////				ds_ReasonCodes.cancelreasonPage();
//				ds_ReasonCodes.cancelReasonCodes();
//				Thread.sleep(2000);
//			}
//		catch(Exception e)
//			{
////			log.error("could not add and delete from db");
//			}	
//	}

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


