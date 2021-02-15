package com.dataseers.qa.test1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.dataseers.qa.page1.Fincen_314aPage;
import com.dataseers.qa.pages.LoginPage;

import com.dataseers.qa.util.TestUtil;

public class Fincen_314aPageTest extends TestUtil {

	LoginPage loginPage;
	Fincen_314aPage fincen_314aPage;

	String currentHomeDir = System.getProperty("user.home");
	String downloadPath = currentHomeDir + File.separator + "Downloads";

	public Fincen_314aPageTest()
	{
		super();// Calls the TestBase2 class
		log.info("************************** DS Seer portal login TEST  *****************************");
	}

	@BeforeTest
	public void setUp() throws MalformedURLException, InterruptedException{

		try
		{
			log.info("Initalizing the seer portal login Page with all fields");
			intialization();
			loginPage  = new LoginPage(d);
			fincen_314aPage = new Fincen_314aPage(d);

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
			Thread.sleep(10000);
			String user=prop.getProperty("userName");
			String password=prop.getProperty("passWord");
			log.info("Seerportal:Login with Valid username and password");
			loginPage.login(user, password);
			//				loginPage.verify_successful_login();
		}
		catch(Exception e)
		{
			log.error("could not add and delete from db");
		}	
	}


	@Test(priority=1, enabled=true)
	public void fincen_314aClick() throws InterruptedException{
		fincen_314aPage.Fincen_314aClick();

	}

	@Test(priority=2, enabled=true)
	public void verifyEmptyFields(){
		fincen_314aPage.checkEmptyFields();
	}

	@Test(priority=3, enabled=true)
	public void AddFincen314aData() throws IOException{
		fincen_314aPage.AddFincen_314a();
	}

	@Test(priority=4, enabled=false)
	public void rowCount() throws InterruptedException{
		Thread.sleep(5000);
		fincen_314aPage.Fincen314aTable();
	}

	//@Test(priority=5, enabled=false)
	public void verifyFileName(){
		String fileName = fincen_314aPage.getFileName_FromTable();
		System.out.println("File name is: "+fileName);
	}

	//@Test(priority=6, enabled=false)
	public void verifyWorkUnitId(){
		String workUnitId = fincen_314aPage.getWorkUnitId_FromTable();
		System.out.println("Work Unit id is: "+workUnitId);
	}

	@Test(priority=7, enabled=true)
	public void verifyStatus314a() throws InterruptedException{
		String clusterName = fincen_314aPage.getClusterName_FromTable();
		System.out.println("Cluster name is: "+clusterName);

		Thread.sleep(4000);
		String Status = fincen_314aPage.getStatus_FromTable();
		System.out.println("Status is: "+Status);

		if(Status == "New"){
			System.out.println("Status is - New");
			String fileName = fincen_314aPage.getFileName_FromTable();
			System.out.println("File name is: "+fileName);
			fincen_314aPage.ClickOnFileName();

			Thread.sleep(5000);
			fincen_314aPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");

			fincen_314aPage.ReRunClick();
			String NewStatus = fincen_314aPage.getStatus_FromTable();
			System.out.println("New Status is: "+NewStatus);

		}
		else if (Status.contains("Running")){
			System.out.println("Status is - Running");
			String workUnitId = fincen_314aPage.getWorkUnitId_FromTable();
			System.out.println("Work Unit id is: "+workUnitId);
			fincen_314aPage.ClickOnWorkUnitId();

			String NewStatus = fincen_314aPage.getStatus_FromTable();
			System.out.println("New Status is: "+NewStatus);

			String fileName = fincen_314aPage.getFileName_FromTable();
			System.out.println("File name is: "+fileName);
			fincen_314aPage.ClickOnFileName();

			Thread.sleep(5000);
			fincen_314aPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");

		}
		else if (Status.contains("Errored") || Status.contains("File not found") ){
			System.out.println("Status is - Errored   or   File not found");
			String workUnitId = fincen_314aPage.getWorkUnitId_FromTable();
			System.out.println("Work Unit id is: "+workUnitId);
			fincen_314aPage.ClickOnWorkUnitId();

			String NewStatus = fincen_314aPage.getStatus_FromTable();
			System.out.println("New Status is: "+NewStatus);

			String fileName = fincen_314aPage.getFileName_FromTable();
			System.out.println("File name is: "+fileName);
			fincen_314aPage.ClickOnFileName();

			Thread.sleep(5000);
			fincen_314aPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");
		}
		else if(Status.contains("Queued")){
			System.out.println("Status is - Queued");
			String fileName = fincen_314aPage.getFileName_FromTable();
			System.out.println("File name is: "+fileName);
			fincen_314aPage.ClickOnFileName();

			Thread.sleep(5000);
			fincen_314aPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");
		}
		else if(Status.contains("Waiting for File")){
			System.out.println("Status is - Waiting for File");
			String workUnitId = fincen_314aPage.getWorkUnitId_FromTable();
			System.out.println("Work Unit id is: "+workUnitId);
			fincen_314aPage.ClickOnWorkUnitId();

			String NewStatus = fincen_314aPage.getStatus_FromTable();
			System.out.println("New Status is: "+NewStatus);

			String fileName = fincen_314aPage.getFileName_FromTable();
			System.out.println("File name is: "+fileName);
			fincen_314aPage.ClickOnFileName();

			Thread.sleep(5000);
			fincen_314aPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");
		}
		else{
			System.out.println("Status is - Completed");
			fincen_314aPage.DownloadClick();

			String fileName = fincen_314aPage.getFileName_FromTable();
			System.out.println("File name is: "+fileName);
			fincen_314aPage.ClickOnFileName();

			Thread.sleep(5000);
			fincen_314aPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");

		}
	}

	@Test(priority=8, enabled=false)
	public void verifyDownloadTemplates(){
		fincen_314aPage.DownloadTemplates();
	}	
}