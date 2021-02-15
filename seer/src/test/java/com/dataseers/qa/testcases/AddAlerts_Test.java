
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.compliance.AddAlerts;
import com.dataseers.qa.util.TestUtil;
import org.codehaus.groovy.vmplugin.v7.*;


public class AddAlerts_Test extends TestUtil
{
	LoginPage  ds_LoginPage;
	AddAlerts ds_AddAlerts;

	public AddAlerts_Test() 
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
				ds_AddAlerts = new AddAlerts(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	 

	@Test
	public void Add_Alert_Test() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				ds_LoginPage.verify_successful_login();
		
				ds_AddAlerts.ManageAlertsPage();
				log.info("Seedportal:Redirecting to add new Alerts");
//				ds_AddAlerts.alertAPIDetails();
				ds_AddAlerts.addAlertPage();
				Thread.sleep(2000);
				ds_AddAlerts.saveAlert();
				Thread.sleep(2000);
//				ds_AddAlerts.cancelAlert();
//				ds_AddAlerts.editAlert();
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


