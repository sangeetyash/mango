package com.dataseers.qa.test1;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.page1.BulkExtractPage;
import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.util.TestUtil;

public class BulkExtractPageTest extends TestUtil {

	LoginPage loginPage;
	BulkExtractPage bulkExtractPage;

	String currentHomeDir = System.getProperty("user.home");
	String downloadPath = currentHomeDir + File.separator + "Downloads";

	public BulkExtractPageTest()
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
			bulkExtractPage = new BulkExtractPage(d);
		}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}				
	}

	@Test
	public void Add_ds_BulkExtract_Test() throws InterruptedException, IOException
	{
		try {
			Thread.sleep(10000);
			String user=prop.getProperty("userName");
			String password=prop.getProperty("passWord");
			log.info("Seerportal:Login with Valid username and password");
			loginPage.login(user,password);
			//				loginPage.verify_successful_login();
		}
		catch(Exception e)
		{
			log.error("could not add and delete from db");
		}	
	}

	@Test(priority=1, enabled=true)
	@Parameters({"DataType", "TypeOfInfo", "FileName"})
	public void verifyUploadCsvFile(String dataType, String typeOfInfo, String fileName) throws InterruptedException{

		bulkExtractPage.BulkExtractsClick();
		Thread.sleep(5000);
		bulkExtractPage.CreateAdhocReportBtnClick();

		d.findElement(By.xpath("//div[@title='Select input data type']")).click();
		d.findElement(By.xpath("//li[contains(text(),'"+dataType+"')]")).click();

		d.findElement(By.xpath("//div[@title='Select Type of information']")).click();
		d.findElement(By.xpath("//li[contains(text(),'"+typeOfInfo+"')]")).click();

		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@type=\"file\"]")).sendKeys(fileName);

		bulkExtractPage.SaveClick();
		Thread.sleep(10000);
	}

	@Test(priority=2, enabled=true)
	public void verifyStatusBulkExtract() throws InterruptedException{

		String clusterName = bulkExtractPage.getClusterName();
		System.out.println("Cluster name is: "+clusterName);

		Thread.sleep(4000);
		String Status = bulkExtractPage.getStatus_FromTable();
		System.out.println("Status is: "+Status);

		if(Status == "New"){
			System.out.println("Status is - New");
			String fileName = bulkExtractPage.getFileName();
			System.out.println("File name is: "+fileName);
			bulkExtractPage.ClickOnFileName();

			Thread.sleep(5000);
			bulkExtractPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");

			bulkExtractPage.ReRunClick();
			String NewStatus = bulkExtractPage.getStatus_FromTable();
			System.out.println("New Status is: "+NewStatus);
		}
		else if (Status.contains("Running")){
			System.out.println("Status is - Running");
			String workUnitId = bulkExtractPage.getWorkUnitId();
			System.out.println("Work Unit id is: "+workUnitId);
			bulkExtractPage.ClickOnWorkUnitId();

			String NewStatus = bulkExtractPage.getStatus_FromTable();
			System.out.println("New Status is: "+NewStatus);

			String fileName = bulkExtractPage.getFileName();
			System.out.println("File name is: "+fileName);
			bulkExtractPage.ClickOnFileName();

			Thread.sleep(5000);
			bulkExtractPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");

		}
		else if (Status.contains("Errored") || Status.contains("File not found") ){
			System.out.println("Status is - Errored   or   File not found");
			String workUnitId = bulkExtractPage.getWorkUnitId();
			System.out.println("Work Unit id is: "+workUnitId);
			bulkExtractPage.ClickOnWorkUnitId();

			String NewStatus = bulkExtractPage.getStatus_FromTable();
			System.out.println("New Status is: "+NewStatus);

			String fileName = bulkExtractPage.getFileName();
			System.out.println("File name is: "+fileName);
			bulkExtractPage.ClickOnFileName();

			Thread.sleep(5000);
			bulkExtractPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");
		}
		else if(Status.contains("Queued")){
			System.out.println("Status is - Queued");
			String fileName = bulkExtractPage.getFileName();
			System.out.println("File name is: "+fileName);
			bulkExtractPage.ClickOnFileName();

			Thread.sleep(5000);
			bulkExtractPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");
		}
		else if(Status.contains("Waiting for File")){
			System.out.println("Status is - Waiting for File");
			String workUnitId = bulkExtractPage.getWorkUnitId();
			System.out.println("Work Unit id is: "+workUnitId);
			bulkExtractPage.ClickOnWorkUnitId();

			String NewStatus = bulkExtractPage.getStatus_FromTable();
			System.out.println("New Status is: "+NewStatus);

			String fileName = bulkExtractPage.getFileName();
			System.out.println("File name is: "+fileName);
			bulkExtractPage.ClickOnFileName();

			Thread.sleep(5000);
			bulkExtractPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");
		}
		else{
			System.out.println("Status is - Completed");
			bulkExtractPage.DownloadClick();

			String fileName = bulkExtractPage.getFileName();
			System.out.println("File name is: "+fileName);
			bulkExtractPage.ClickOnFileName();

			Thread.sleep(5000);
			bulkExtractPage.isFileDownload(downloadPath, fileName);
			System.out.println("File downloaded successfully.");
		}
	}
}