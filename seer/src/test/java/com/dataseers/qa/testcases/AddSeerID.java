
package com.dataseers.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//import org.testng.annotations.AfterTest;
import com.dataseers.qa.pages.*;
import com.dataseers.qa.pages.compliance.SeerID;
import com.dataseers.qa.pages.compliance.SeerIQ;
import com.dataseers.qa.util.TestUtil;

public class AddSeerID extends TestUtil
{
	LoginPage  ds_LoginPage;
	SeerID ds_SeerID;
	SeerIQ ds_SeerIQ;
	
	public AddSeerID() 
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
				ds_SeerID = new SeerID(d);
				ds_SeerIQ = new SeerIQ(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	  

	@Test
//	@Parameters("row_number") 
	public void Add_KYC_Test() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				ds_LoginPage.verify_successful_login();
				ds_SeerID.onBoardingPage();
				TestUtil.scrollDown();
				log.info("Seedportal:Redirecting to add KYC");
				ds_SeerID.AddSeerIDPage();
				
				
//				int row_number = (Integer) prop.get("select_RowNumber");
//				System.out.println("**************Row number is:**************"+row_number);
//				ds_SeerID.userdetailsPage (row_number);
				
				
				ds_SeerID.userdetailsPage();
				Thread.sleep(3000);
				ds_SeerID.saveSeerIDpage();
				Thread.sleep(3000);
				ds_SeerID.getSeerIDstatus();
				Thread.sleep(8000);
				ds_SeerID.SeerIDTable();
//				Thread.sleep(4000);
//				
//				ds_SeerIQ.QuestionAndAnswersPage();
//				Thread.sleep(3000);
//				ds_SeerIQ.SecondaryQuestionSetPage();
//				Thread.sleep(3000);
//
//				ds_SeerIQ.getSeerIQstatus();
//				Thread.sleep(3000);
//				ds_SeerIQ.SeerIQTable();		
//				Thread.sleep(3000);
//				ds_SeerIQ.NextKYCstepPage();
//				Thread.sleep(3000);

			}
		catch(IOException e)
			{
			log.error("could not create SeerID");
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


