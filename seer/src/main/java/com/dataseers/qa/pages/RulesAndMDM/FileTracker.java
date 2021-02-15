package com.dataseers.qa.pages.RulesAndMDM;

//import java.util.concurrent.TimeUnit;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;

public class FileTracker extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	WebDriver driver; 

	//Reports
	@CacheLookup    
	@FindBy(xpath = "//*[@id=\"4\"]")
	WebElement Reports;
	
	//File Tracker
	@CacheLookup    
	@FindBy(xpath="//*[@href='/file-tracker-charts\']")
	WebElement FileTracker;

	//Select process date
	@CacheLookup
	@FindBy(xpath="//*[@id=\"report_group_datePicker\"]/div/input")
	WebElement processDate;
	 
	//Select process date from calendar
	@CacheLookup
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div[1]/div/span/a[1]")
	WebElement processDate_list;
		
	//Select month
	@CacheLookup
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/table/tbody/tr[1]/td[1]/a")
	WebElement sel_month;

	//Select date
	@CacheLookup
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div[2]/table/tbody/tr[5]/td[6]/div")
//	@FindBy(xpath = "//*[text()='31']")
	WebElement sel_date;
	
	//Click on Search symbol
	@CacheLookup
	@FindBy(xpath="//*[@id=\"searchBtnClick\"]")
	WebElement search;
	
	//Click on view file
	@CacheLookup
	@FindBy(xpath="//*[@class=\"ant-btn ant-btn-danger\"]")
	WebElement viewFile;
		
	//Select Processor
	@CacheLookup
	@FindBy(xpath="//*[@id=\"file_tracker_list_processor\"]/div/div")
	WebElement processor;
	
	//processor dropdown list
	@CacheLookup
	@FindBy(xpath = "//*[text()='Galileo']")
	WebElement processor_dropdown;	


	//Select File type
	@CacheLookup
	@FindBy(xpath="//*[@id=\"file_tracker_list_filetype\"]/div/div")
	WebElement FileType;
		
	//File type list
	@CacheLookup
	@FindBy(xpath = "//*[text()='subfile']")
	WebElement FileType_list;
	
	//Select record type
	@CacheLookup
	@FindBy(xpath="//*[@id=\"file_tracker_list_recordtype\"]/div/div")
	WebElement RecordType;
			
	//record type list
	@CacheLookup
	@FindBy(xpath = "//*[text()='transaction']")
	WebElement RecordType_list;
	
	//Search submit
	@CacheLookup
	@FindBy(xpath="//*[@id=\"FormSearchSubmit\"]")
	WebElement searchSubmit;
		
	//Reset button
	@CacheLookup
	@FindBy(xpath= "//*[@title=\"Reset filter\" and @type=\"button\" and @class='ant-btn m-r-10 ant-btn-circle']")
	WebElement Reset;
	
	public FileTracker(WebDriver d) 
	{
		PageFactory.initElements(d, this);
	}

//Rules And MDM Page
	public void RulesAndMDMPage()
	{
		try
			{
				log.info("Clicking on Reports");
				wait.until(ExpectedConditions.visibilityOf(Reports));
				Reports.click();
	
				log.info("User clicked on to reports successfully!!!!");
			}
		catch(Exception e)
			{
				log.error("Rules And MDM module not found");
			}
	}

	public void FileTrackerPage()
	{
		try
			{
				RulesAndMDMPage();
				log.info("Click on File Tracker");
				wait.until(ExpectedConditions.visibilityOf(FileTracker));
				FileTracker.click();
		
				log.info("Directed to File Tracker module");
			}
				catch(Exception e)
			{
				log.error("Not directed to File Tracker module");
			}
	}

	public void ViewFileTrackerPage()  
	{
		try
			{	
				FileTrackerPage();
				
				log.info("click on processDate");
				processDate.click();
//				processDate.sendKeys("20200131");
				wait.until(ExpectedConditions.visibilityOf(processDate_list));
				processDate_list.click();
				log.info("Selected process date is: " + processDate.getText());
				sel_month.click();
				sel_date.click();
				
				log.info("search file processed by date");
				search.click();
				Thread.sleep(3000);
				log.info("View file processed by date");
				viewFile.click();
//				Thread.sleep(2000);
				Reset.click();
				
//				log.info("Select Processor");
//				processor.click();
//				wait.until(ExpectedConditions.visibilityOf(processor_dropdown));
//				processor_dropdown.click();
//				log.info("Selected processor is: " + processor.getText());
//		
//				log.info("Enter file type");
//				FileType.click();
//				wait.until(ExpectedConditions.visibilityOf(FileType_list));
//				FileType_list.click();
//				
//				log.info("Select record type");
//				RecordType.click();
//				wait.until(ExpectedConditions.visibilityOf(RecordType_list));
//				RecordType_list.click();
//				log.info("Selected record type is: " + RecordType.getText());
//	
//				log.info("Search submit");
//				searchSubmit.click();
				
				
				
				
			}
			catch(Exception e)
			{
				log.error("Cant view file");
			}
	}

}

