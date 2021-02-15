
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.RulesAndMDM.Processor;
import com.dataseers.qa.util.TestUtil;

public class AddProcessor extends TestUtil
{
	LoginPage  ds_LoginPage;
	Processor ds_Processor;

	public AddProcessor() 
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
				ds_Processor = new Processor(d);
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
				ds_Processor.ProcessorPage();
				log.info("Seedportal:Redirecting to add new Processor");
				ds_Processor.AddProcessorPage(0);
				ds_Processor.saveProcessorPage();
				Thread.sleep(4000);
				ds_Processor.searchFilter();
				Thread.sleep(2000);
//				ds_Processor.cancelProcessor();
				ds_Processor.Transaction_code_Mapping();
				ds_Processor.Authorization_code_Mapping();
				Thread.sleep(2000);
				ds_Processor.Account_status_code_Mapping(); 
				Thread.sleep(1000);
				ds_Processor.Card_status_code_Mapping();  
				Thread.sleep(1000);
				ds_Processor.POS_status_code_Mapping(); 
				Thread.sleep(2000);
				ds_Processor.Network_status_code_Mapping(); 
				Thread.sleep(1000);
				ds_Processor.Field_Mapping(); 
				Thread.sleep(2000);
//				ds_Processor.Edit_page();
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


