
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.compliance.*;
import com.dataseers.qa.util.TestUtil;

public class RiskIndicator_Test extends TestUtil
{
	LoginPage  ds_LoginPage;
	RiskIndicator ds_RiskIndicator;

	public RiskIndicator_Test() 
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
				ds_RiskIndicator = new RiskIndicator(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	

	@Test
	public void RiskIndicator_Test1() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				ds_LoginPage.verify_successful_login();
		
				ds_RiskIndicator.onBoardingPage();
				log.info("Seedportal:Redirecting to add KYC");
				ds_RiskIndicator.AddRiskIndicatorPage();
				ds_RiskIndicator.saveRiskIndicatorpage();
				Thread.sleep(2000);
//				ds_RiskIndicator.cancelRiskIndicatorpage();
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


