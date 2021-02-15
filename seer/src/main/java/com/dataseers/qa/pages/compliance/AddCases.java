package com.dataseers.qa.pages.compliance;
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
//import org.testng.Assert;
//import org.springframework.util.Assert;
import org.testng.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class AddCases extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String alertsdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();    
	WebDriver driver; 
	
	//Compliance
		@CacheLookup    
		@FindBy(xpath = "//*[text()='ComplianSeer']")
		WebElement Compliance;

		//Cases 
		@CacheLookup    
		@FindBy(xpath="//*[@href='/manage-cases\']")
		WebElement manageCases;
		
		//Add Case
		@CacheLookup
		@FindBy(xpath = "//*[@title='Create new case']")
		WebElement addCase;
		
		//Add Case Name
		@CacheLookup
		@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_case_title\"]")
		WebElement caseName;
		
		//Select Report type
		@CacheLookup
		@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_report_config_id\"]")
		WebElement SelectReportType;

		//Reports dropdown list
		@CacheLookup
		@FindBy(xpath="//*[@class='ant-select-dropdown-menu-item'][1]")
		WebElement report_dropdown;
		
		//Select Processor
		@CacheLookup
		@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_processor\"]")
		WebElement processor;

		//processor dropdown list
		@CacheLookup
		@FindBy(xpath="//*[text()='Marqeta']")
		WebElement processor_dropdown;	
			
		//Select Program Name
		@CacheLookup
		@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_program_id\"]")
		WebElement prog_name;

		//program name dropdown list
		@CacheLookup
		@FindBy(xpath = "//*[@class=\"ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active\"][1]")
//		@FindBy(xpath = "//*[@id=\"Program 123\"]")
		WebElement progName_dropdown;		
		
		//Enter account Number
		@CacheLookup
		@FindBy(xpath = "//*[@id=\"ReasonCodeAdd_list_account_number\"]")
		WebElement Acc_number;
			
		//Enter Card Number
		@CacheLookup
		@FindBy(xpath = "//*[@id=\"ReasonCodeAdd_list_card_id\"]")
		WebElement card_number;
				
		//Select Assigned-to
		@CacheLookup
		@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_assign_user_id\"]")
		WebElement assign_to;

		//Assigned-to dropdown list
		@CacheLookup
		@FindBy(xpath="//*[text()='Arpitha Purohit - Global Admin']")
		WebElement assigned_user;	

		//Select Reason
		@CacheLookup
		@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_reason_id\"]")
		WebElement reason;

	 	//Reason dropdown list
		@CacheLookup
		@FindBy(xpath="//*[text()='Misfire/Testing']")
		WebElement reason_list;	
				
		//Select priority
		@CacheLookup
		@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_priority\"]")
		WebElement priority;

		//priority dropdown list
		@CacheLookup
		@FindBy(xpath="//*[text()='High']")
		WebElement priority_list;	
		
		//Notes
		@CacheLookup    
		@FindBy(xpath="//div[@class='ql-editor ql-blank']//p")
		WebElement notes;
		
		//File upload
		@CacheLookup    
		@FindBy(xpath="//*[@type=\"file\"]")
		WebElement file_upload;
		
		//Save button
		@CacheLookup
		@FindBy(xpath="//*[@type='submit' and @class='ant-btn ant-btn-primary']")
		WebElement saveCases;
		//
		//cancel button
		@CacheLookup    
		@FindBy(xpath="//*[@type='button']")
		WebElement cancel_Case;

public AddCases(WebDriver d) 
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

public void ManageCasesPage()
{
	try
		{
			compliancePage();
			log.info("Click on Cases");
			wait.until(ExpectedConditions.visibilityOf(manageCases));
			manageCases.click();
	
			log.info("Directed to Case page");
		}
			catch(Exception e)
		{
			log.error("Not directed to Case page");
		}
}

public void addCasePage()  
{
	try
		{	
//			ManageCasesPage();
			
			log.info("click on Add Cases");
			wait.until(ExpectedConditions.visibilityOf(addCase));
			addCase.click();
			
			log.info("click on Add Case Name");
			wait.until(ExpectedConditions.visibilityOf(caseName));
			caseName.sendKeys(alertsdata);
			
			log.info("Select Report Type");
			SelectReportType.click();
			wait.until(ExpectedConditions.visibilityOf(report_dropdown));
			report_dropdown.click();
			log.info("Selected User's role is: " + SelectReportType.getText());
				
			log.info("Select Processor");
			processor.click();
			wait.until(ExpectedConditions.visibilityOf(processor_dropdown));
			processor_dropdown.click();
			log.info("Selected User's role is: " + processor.getText());
			
			log.info("Select Program name");
			prog_name.click();
			wait.until(ExpectedConditions.visibilityOf(progName_dropdown));
			progName_dropdown.click();
			log.info("Selected User's role is: " + prog_name.getText());

			log.info("Enter account number");
			Acc_number.sendKeys(GenerateData.generateRandomNumber(6));
			
			log.info("Enter Card number");
			wait.until(ExpectedConditions.visibilityOf(card_number));
			card_number.click();
			card_number.sendKeys(GenerateData.generateRandomNumber(6));
			log.info("Card number is: " + card_number.getText());
			
			log.info("Select Assigned-to user");
			assign_to.click();
			wait.until(ExpectedConditions.visibilityOf(assigned_user));
			assigned_user.click();
			log.info("Selected User's role is: " + assign_to.getText());
			
			log.info("Select Reasons");
			reason.click();
			wait.until(ExpectedConditions.visibilityOf(reason_list));
			reason_list.click();
			log.info("Reason is: " + reason.getText());
			
			log.info("Select priority");
			priority.click();
			wait.until(ExpectedConditions.visibilityOf(priority_list));
			priority_list.click();
			log.info("Priority is: " + priority.getText());
			
			log.info("Entering Notes");
			notes.sendKeys("This is Automation Testing");
			
			log.info("Upload file");
			file_upload.sendKeys("C:/Users/INTEL/Documents/GitHub/seerportal/qa/data/samplefile/test2.csv");
			
		}
	
		catch(Exception e)
		{
			Assert.fail("Cant add Case");
		}
		
}
	//Save Case
	public void saveCase() 
	{
		try
			{
				log.info("Clicking on save button");
				saveCases.click();
				log.info("New Case is added successfully");
							
			}
		
		catch(Exception e)
			{
			Assert.fail("could not create new Case");	

			}
	}
//	
	//Cancel Case
	public void cancelCase() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancel_Case.click();
			}
		catch(Exception e)
			{
			Assert.fail("cancel button failed");	
			}
	}

}
