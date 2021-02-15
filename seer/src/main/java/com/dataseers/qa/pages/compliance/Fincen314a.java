package com.dataseers.qa.pages.compliance;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.By;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
//import com.itextpdf.text.List;
import com.dataseers.qa.util.TestUtil;

import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import java.util.Date;

public class Fincen314a extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String Merchantdata = GenerateData.generateRandomString(6).toLowerCase();
	
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();  
	WebDriver driver; 

	DateFormat dateFormat = new SimpleDateFormat("MMddyyyyHhmmss");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	 
	 
	//Compliance
	@CacheLookup    
	@FindBy(xpath = "//*[text()='ComplianSeer']")
	WebElement Compliance;

	//FinCEN
	@CacheLookup    
	@FindBy(xpath = "//*[text()='FinCEN']")
	WebElement FinCEN;
	
	//click on 314(a) Management
	@CacheLookup
	@FindBy(xpath="//*[@href=\"/314-a-management\"]")
	WebElement Fincen314a;

	//Click on add new 314(a) Management
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new 314(a)' and @class=\"ant-btn m-r-10 ant-btn-primary ant-btn-circle\"]")
	WebElement Add_Fincen314a;
	
	//Select  Input_dataType
	@CacheLookup
	@FindBy(xpath = "//*[@class=\"ant-select-selection-selected-value\" and @title=\"Select input data type\"]")
	WebElement Select_Input_dataType;

	//Input_dataType
	@CacheLookup
	@FindBy(xpath="//*[@class=\"ant-select-dropdown-menu-item\"][1]")
	WebElement Input_dataType;
				
	//File upload
	@CacheLookup    
	@FindBy(xpath="//*[@type=\"file\"]")
	WebElement file_upload;
	
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveFincen314a;

	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancelFincen314a;

	//status
	@CacheLookup    
	@FindBy(xpath="//tbody/tr[1]/td[2]/span[1]")
	WebElement Status;
//	By Status = By.xpath("//tbody/tr[1]/td[2]/span[1]");
	
	//NewStatus
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'New')]")
	WebElement NewStatus;
	
	//Running Status
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Running')]")
	WebElement RunningStatus;
	
	//Error Status
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Error')]")
	WebElement ErrorStatus;
	
	//Blocked Status
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Blocked')]")
	WebElement BlockedStatus;
	
	//Completed Status
	@CacheLookup
	@FindBy(xpath="//span[contains(text(),'Completed')]")
	WebElement CompletedStatus;
	
//	// Status
//		By Status = By.xpath("//tbody/tr[1]/td[2]/span[1]");
//		By NewStatus = By.xpath("//span[contains(text(),'New')]");
//		By RunningStatus = By.xpath("//span[contains(text(),'Running')]");
//		By ErrorStatus = By.xpath("//span[contains(text(),'Error')]");
//		By BlockedStatus = By.xpath("//span[contains(text(),'Blocked')]");
//		By CompletedStatus = By.xpath("//span[contains(text(),'Completed')]");
		
public Fincen314a(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}

//Compliance page
public void compliancePage()
{
	try
		{
			log.info("Clicking on Compliance");
			wait.until(ExpectedConditions.visibilityOf(Compliance));
			Compliance.click();

			log.info("User clicked on to compliance successfully!!!!");
		}
	
	catch(Exception e)
		{
			log.error("compliance module not found");
		}
}

public void FinCENPage()
{
	try
		{
		
			compliancePage();
			log.info("Click on fincen");
			wait.until(ExpectedConditions.visibilityOf(FinCEN));
//			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			FinCEN.click();
			
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			log.info("click on 314a");
			wait.until(ExpectedConditions.visibilityOf(Fincen314a));
			
			Fincen314a.click();
			
			log.info("Clicked on 314a");
		}
			catch(Exception e)
		{
			log.error("Not clicked on 314a");
		} 
}

public void Add_Fincen314a_Page()  
{
	try
		{
			
			log.info("click on Add Fincen 314a");
			wait.until(ExpectedConditions.visibilityOf(Add_Fincen314a));
			Add_Fincen314a.click();
				
			log.info("Select Input Type");
			wait.until(ExpectedConditions.visibilityOf(Select_Input_dataType));
			Select_Input_dataType.click();
			wait.until(ExpectedConditions.visibilityOf(Input_dataType));
			Input_dataType.click();
			file_upload.sendKeys("C:/Users/INTEL/Desktop/Dataseers/314a_business_template_3.csv");
			Thread.sleep(3000);
//			System.out.println(date1);
			
//			File filename = new File("C:/Users/INTEL/Desktop/Dataseers/314a_business_template_2.csv");
//			File newFilename = new File("C:/Users/INTEL/Desktop/Dataseers/"+date1+"314a_business_template.csv");
//			
//		     if (filename.renameTo(newFilename))  
//		         System.out.println("Renamed successfully");         
//		     else 
//		         System.out.println("Error");   
//			
//		    String path = newFilename.getAbsolutePath();
//		    file_upload.sendKeys(path);
			
		    
//			
//		    File filename=  new File("C:/Users/INTEL/Desktop/Dataseers/314a_business_template.csv");
//		    File newFilename = new File("C:/Users/INTEL/Desktop/Dataseers/"+date1+"314a_business_template.csv");
//	        File temp;
//	        System.out.println("A vlaue before swapping is " +filename);
//	        System.out.println("B vlaue before swapping is " +newFilename);
//	        System.out.println("---------------------");
//	         
//	        temp = filename;
//	        filename = newFilename;
//	        filename = temp;
//	         
//	        if (filename.renameTo(newFilename))  
//		         System.out.println("Renamed successfully");         
//		     else 
//		         System.out.println("Error"); 
//	        	
//	        System.out.println("A vlaue after swapping is " +filename);
//	        System.out.println("B vlaue after swapping is " +newFilename);
//	        String path = newFilename.getAbsolutePath();
//		    file_upload.sendKeys(path);		
			
		}
	
		catch(Exception e)
		{
			Assert.fail("Cant Add 314a management");
		}
		
}

	//Save 314(a)
	public void save_Fincen314a() 
	{
		try
			{
				log.info("Clicking on save button");
				saveFincen314a.click();
				log.info("New FINCEN is added successfully");
							
			}
		
		catch(Exception e)
			{
				Assert.fail("could not create new 314a");	

			}
	}
	
	//Cancel KYC
	public void cancel_Fincen314a() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancelFincen314a.click();
			}
		catch(Exception e)
			{
			Assert.fail("cancel button failed");	
			}
	}
	
public void Fincen314aTable(){
		
		int rowCount = d.findElements(By.xpath("//div[@class='ant-table-body']//table//tr")).size()-1;
		System.out.println(rowCount);		
		
		//tbody/tr[1]/td[2]
		//tbody/tr[2]/td[2]
		//tbody/tr[3]/td[2]
		
		String beforeXpath = "//tbody/tr[";
		String afterXpath = "]/td[2]";
		
		for(int rowNum=1; rowNum < rowCount+1; rowNum++){
			String actualXpath = beforeXpath+rowNum+afterXpath;
//			System.out.println(actualXpath);
			String value = d.findElement(By.xpath(actualXpath)).getText();
			System.out.println("314a Status is for row "+rowNum+" is: "+value);
		}
	}
	
	public void getFileNameAndWorkUnitIdFromTable(){
		String status =(Status).getText();
//		String status = d.findElement(Status).getText();
		System.out.println("Status is: "+status);
		String fileName = d.findElement(By.xpath("//span[text()='"+status+"']//parent::td//following::td[2]")).getText();
		System.out.println("File name is: "+fileName);
		String workUnitId = d.findElement(By.xpath("//span[text()='"+status+"']//parent::td//following::td[5]")).getText();
		System.out.println("Work unit id is: "+workUnitId);
	}

}

