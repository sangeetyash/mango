
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

public class Add_Acc_holder_Watchlist_Test extends TestUtil
{
	LoginPage  ds_LoginPage;
	Add_Acc_holder_Watchlist ds_Add_Acc_holder_Watchlist;

	public Add_Acc_holder_Watchlist_Test() 
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
				ds_Add_Acc_holder_Watchlist = new Add_Acc_holder_Watchlist(d);
			}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}	
 
	@Test
	public void Add_Account_Watchlist_Test() throws InterruptedException, IOException
	{
		try {
				String user=prop.getProperty("userName");
				String password=prop.getProperty("passWord");
				log.info("Seedportal:Login with Valid username and password");
				ds_LoginPage.login(user,password);
				
				ds_Add_Acc_holder_Watchlist.watchlistPage();
				ds_Add_Acc_holder_Watchlist.Add_Acc_holder_WatchlistPage("Person",0);
				ds_Add_Acc_holder_Watchlist.save_Account_Watchlistpage();
//				Thread.sleep(2000);
//				ds_Add_Acc_holder_Watchlist.cancel_Account_Watchlistpage();
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


