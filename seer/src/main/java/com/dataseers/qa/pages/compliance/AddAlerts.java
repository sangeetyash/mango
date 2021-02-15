package com.dataseers.qa.pages.compliance;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.util.SeerportalAPI;

import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class AddAlerts extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String alertsdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard(); 
	WebDriver driver;
	JavascriptExecutor executor = (JavascriptExecutor) d;
	SeerportalAPI SeerportalAPI = new SeerportalAPI();  
	List<String> alertRespInfo;
 
	//Compliance
	@CacheLookup    
	@FindBy(xpath = "//*[text()='ComplianSeer']")
	WebElement Compliance;
		
	//Alerts
	@CacheLookup    
	@FindBy(xpath="//*[@href='/manage-alerts\']")
	WebElement manageAlerts;
		
	//Add Alert
	@CacheLookup
	@FindBy(xpath = "//button[@title='Add new alert']")
	WebElement AddAlert;
		
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
		
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_processor']")
	List<WebElement> processorList;
		
	//Select Program Name
	@CacheLookup
	@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_program_id\"]")
	WebElement prog_name;


	//program name dropdown list
	@CacheLookup
	@FindBy(xpath = "//*[@class=\"ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active\"][1]")
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
	@FindBy(xpath="//li[normalize-space()='False Positive']")
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
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveAlert;
		
	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancel_Alert;

		
	// Search Filter
	@CacheLookup
	@FindBy(xpath = "(//*[@title=\"Elderly Abuse\"])")
	WebElement searchAlert;
			
			
	//Select Assigned-to
	@CacheLookup
	@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_escalate_id\"]")
	WebElement escalate_to;


	//Assigned-to dropdown list
	@CacheLookup
	@FindBy(xpath="(//*[@class=\"ant-select-dropdown-menu-item\"])[2]")
	WebElement escalated_user;	
			
	//Notes
	@CacheLookup    
	@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_notes\"]")
	WebElement notes2;
			
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveEdited;
		
		
public AddAlerts(WebDriver d) 
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

public void ManageAlertsPage()
{
	try
		{ 
			compliancePage();
			log.info("Click on Alerts");
			wait.until(ExpectedConditions.visibilityOf(manageAlerts));
			manageAlerts.click();
	
			log.info("Directed to Alerts page");
		}
			catch(Exception e)
		{
			log.error("Not directed to Alerts page"); 
		}
}

public void addAlertPage()  
{
	try
		{	

			log.info("click on Add Alert");
			wait.until(ExpectedConditions.visibilityOf(AddAlert));
			AddAlert.click();
				
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
			notes.sendKeys("This is selenium Testing");
			
			log.info("Upload file");
			file_upload.sendKeys("C:/Users/INTEL/Documents/GitHub/seerportal/qa/data/samplefile/test2.csv");
			
		}
	
		catch(Exception e)
		{
			log.error("Cant add Alerts");
		}
		
}

	//Save Alerts
	public void saveAlert() 
	{
		try
			{
				log.info("Clicking on save button");
				saveAlert.click();
				log.info("New Alert is added successfully");
							
			}
		
		catch(Exception e)
			{
				log.error("could not create new Alert");	

			}
	}
//	
	//Cancel Alerts
	public void cancelAlert() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancel_Alert.click();
			}
		catch(Exception e)
			{
				log.error("cancel button failed");	
			}
	}
	
	public void editAlert() {
		
		try {

			searchAlert.click();

			log.info("Clicking on edit button");
			WebElement editBtn = d.findElement(By.xpath("//*[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']"));
			wait.until(ExpectedConditions.visibilityOf(editBtn));
			editBtn.click();

			log.info("Select escalate-to user");
			escalate_to.click();
			wait.until(ExpectedConditions.visibilityOf(escalated_user));
			escalated_user.click();
			log.info("Selected User's role is: " + escalate_to.getText());
			
			log.info("Entering Notes");
			notes.clear();
			notes.sendKeys("Editing Alert notes");
			saveEdited.click();

		} catch (Exception e) {
			log.error("cancel button scenario failed");
		}
	}

}


