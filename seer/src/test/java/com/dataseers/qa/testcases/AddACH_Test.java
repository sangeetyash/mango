
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.RulesAndMDM.ACHconfiguration;
import com.dataseers.qa.util.TestUtil;

public class AddACH_Test extends TestUtil
{
	LoginPage  ds_LoginPage;
	ACHconfiguration ds_ACHconfiguration;

	public AddACH_Test() 
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
				ds_LoginPage  = new LoginPage(d);
				ds_ACHconfiguration = new ACHconfiguration(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	
 
	@Test
	public void Add_ACH_Test() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				ds_LoginPage.verify_successful_login();
		
				ds_ACHconfiguration.ACHPage();
				log.info("Seedportal:Redirecting to add new ACH");
				ds_ACHconfiguration.AddACHPage(0);
				Thread.sleep(2000);
				ds_ACHconfiguration.saveACHPage();
				Thread.sleep(2000);
//				ds_ACHconfiguration.cancelACH();
		
			}
		catch(Exception e)
			{
			log.error("could not add and delete from db");
			}	
	}

	@AfterClass
	public void Quit_Browser_Test()
	{
		try
			{ 
	
				log.info("Seedportal:Closing the current browser session");
				Thread.sleep(2000);
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


