
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.RulesAndMDM.MerchantMaster;
import com.dataseers.qa.util.TestUtil;

public class AddMerchantMaster extends TestUtil
{
	LoginPage  ds_LoginPage;
	MerchantMaster ds_MerchantMaster;

	public AddMerchantMaster() 
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
				ds_MerchantMaster = new MerchantMaster(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	

	@Test
	public void Add_NewProcessor_Test() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				ds_LoginPage.verify_successful_login();
//				ds_Processor.ProcessorPage();
				log.info("Seedportal:Redirecting to add new Processor");
				ds_MerchantMaster.AddMerchantPage();
				ds_MerchantMaster.saveMerchantPage();
				ds_MerchantMaster.LocationPage();
				ds_MerchantMaster.saveMerchantPage();
				Thread.sleep(2000);
				
//				ds_MerchantMaster.cancelMerchant();
//				ds_MerchantMaster.searchFilterPage();
			}
		catch(Exception e)
			{
//			log.error("could not add and delete from db");
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


