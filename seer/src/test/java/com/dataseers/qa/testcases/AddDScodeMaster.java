
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.RulesAndMDM.CodeMaster;
import com.dataseers.qa.util.TestUtil;

public class AddDScodeMaster extends TestUtil
{
	LoginPage  ds_LoginPage;
	CodeMaster ds_DScodeMaster;
	public AddDScodeMaster() 
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
				ds_DScodeMaster = new CodeMaster(d);
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
				log.info("Seedportal:Redirecting to add new Processor");
				ds_DScodeMaster.DScodeMasterPage();
				ds_DScodeMaster.Transaction_code_Mapping();
				ds_DScodeMaster.Authorization_code_Mapping();	
				ds_DScodeMaster.status_code_Mapping();
				ds_DScodeMaster.POS_status_code_Mapping(); 
				ds_DScodeMaster.Network_status_code_Mapping(); 
				ds_DScodeMaster.Account_type_code_Mapping(); 
				ds_DScodeMaster.Card_status_code_Mapping();  
				
				
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


