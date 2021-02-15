package com.dataseers.qa.test1;

import java.net.MalformedURLException;
import java.util.Properties;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.page1.NodeManagementPage;
import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.util.TestUtil;

public class NodeManagementPageTest extends TestUtil {
	
	LoginPage loginPage;
	NodeManagementPage nodeManagementPage;
	
	public NodeManagementPageTest()
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
			nodeManagementPage = new NodeManagementPage(d);
		}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
	
		
	}
	
	@Test(priority=1)
	public void NodeManagement(){
		try {
//			nodeManagementPage.scrollDownToNodeManagementLink();
			nodeManagementPage.NodeManagementLinkClick();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	public void VerifyPrimaryCluster() throws InterruptedException{
		Thread.sleep(5000);

		String primaryCluster = nodeManagementPage.IsPrimaryClusterEnabled();
		System.out.println("Primary Cluster is: "+primaryCluster);
	}
	
}
