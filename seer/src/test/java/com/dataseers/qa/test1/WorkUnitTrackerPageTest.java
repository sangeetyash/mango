package com.dataseers.qa.test1;

import java.net.MalformedURLException;
import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.page1.WorkUnitTrackerPage;
import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.util.TestUtil;

public class WorkUnitTrackerPageTest extends TestUtil {
	
	LoginPage loginPage;
	WorkUnitTrackerPage workUnitTrackerPage;
	
	public WorkUnitTrackerPageTest()
	{
		super();// Calls the TestBase2 class
        log.info("************************** DS Seer portal login TEST  *****************************");
	}
	
	@BeforeTest
	public void setUp() throws MalformedURLException{

		try
		{
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			loginPage  = new LoginPage(d);
			workUnitTrackerPage = new WorkUnitTrackerPage(d);
		}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	}
	
	@Test
	public void WorkUnitTracker(){
		try {
			workUnitTrackerPage.WorkUnitTrackerPageClick();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
