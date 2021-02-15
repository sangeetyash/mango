
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.compliance.SeerIQ;
import com.dataseers.qa.util.TestUtil;

public class AddSeerIQ extends TestUtil
{
	LoginPage  ds_LoginPage;
	SeerIQ ds_SeerIQ;

	public AddSeerIQ() 
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
				ds_SeerIQ = new SeerIQ(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	  

	@Test
	public void Add_KYC_Test() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				ds_LoginPage.verify_successful_login();
		
				ds_SeerIQ.onBoardingPage();
				log.info("Seedportal:Redirecting to add KYC");
				ds_SeerIQ.AddSeerIQPage();
				ds_SeerIQ.saveSeerIQpage();
				Thread.sleep(4000);
				ds_SeerIQ.QuestionAndAnswersPage();
				ds_SeerIQ.SecondaryQuestionSetPage();
				Thread.sleep(4000);
				ds_SeerIQ.getSeerIQstatus();
				Thread.sleep(8000);
				ds_SeerIQ.SeerIQTable();
				
//				ds_SeerIQ.NextKYCstepPage();
//				ds_AddKYCvalidator.cancelSeerIQpage();
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
//				d.quit();
				log.info("******************END**********************");
				log.info("browser closed");
			}
		catch(Exception e)
			{
				log.error("browser not closed");					
			}						
	}
}


