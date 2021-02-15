
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;

import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.compliance.Fincen314a;
import com.dataseers.qa.util.TestUtil;

public class Add_314a_Management extends TestUtil
{
	LoginPage  ds_LoginPage;
	Fincen314a ds_Fincen314a;

	public Add_314a_Management() 
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
				ds_Fincen314a = new Fincen314a(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	

	@Test
	public void Add_ds_Fincen314a_Test() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				ds_LoginPage.verify_successful_login();
		
				ds_Fincen314a.FinCENPage();
				ds_Fincen314a.Add_Fincen314a_Page();
				ds_Fincen314a.save_Fincen314a();
//				ds_Fincen314a.Fincen314aTable();
//				ds_Fincen314a.getFileNameAndWorkUnitIdFromTable();
				Thread.sleep(2000);
//				ds_Fincen314a.cancel_Fincen314a();
			}
		catch(Exception e)
			{
			log.error("could not add and delete from db");
			}	
	}

	@Test(priority=4)
	public void rowCount(){
//		Thread.sleep(5000);
		ds_Fincen314a.Fincen314aTable();
		
		ds_Fincen314a.getFileNameAndWorkUnitIdFromTable();
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


