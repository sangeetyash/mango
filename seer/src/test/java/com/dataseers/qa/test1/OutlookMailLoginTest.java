package com.dataseers.qa.test1;

import java.net.MalformedURLException;
import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.page1.OutlookMailLoginPage;
import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.util.TestUtil;

public class OutlookMailLoginTest extends TestUtil {
		
	LoginPage loginPage;
	OutlookMailLoginPage outlookMailLoginPage;
	
	public OutlookMailLoginTest()
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
			outlookMailLoginPage = new OutlookMailLoginPage(d);
		}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
		
	}
	
	@Test
	public void processingMailCheck() throws InterruptedException{
		try {
			Thread.sleep(5000);
			outlookMailLoginPage.profileNameCheck();
			outlookMailLoginPage.mailCheck();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
