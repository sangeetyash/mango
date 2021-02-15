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
import org.openqa.selenium.Point;
import org.testng.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
//import org.testng.Assert;
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;

public class Processor extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String Processordata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	WebDriver driver;
	JavascriptExecutor executor = (JavascriptExecutor) d;

	//Rules and MDM 
	@CacheLookup     
	@FindBy(xpath = "//*[text()='Rules & MDM']")
	WebElement RulesAndMDM; 

	//Rules and MDM 
	@CacheLookup     
	@FindBy(xpath = "//*[text()='Processor']")
	WebElement Processor; 
		
	//Processor
	@CacheLookup    
	@FindBy(xpath="//*[@href='/processor_admin']")
	WebElement processor_mgmt;

	//Add Processor 
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add Processor']")
	WebElement AddProcessor;


	//Add Processor Name
	@CacheLookup
	@FindBy(xpath="//*[@id=\"Add Processor_name\"]")
	WebElement AddProc_Name;

	//Add Alert Email
	@CacheLookup
	@FindBy(xpath="//*[@id=\"Add Processor_alertEmail\"]")
	WebElement Alert_email;
	
	//Add Website
	@CacheLookup
	@FindBy(xpath="//*[@id=\"Add Processor_websiteUrl\"]")
	WebElement website;

	//select phone code dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_phoneCountryId\"]")
	WebElement phonecode;

	//select phone code dropdown list
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"113\"]")
	WebElement phonecodelist;

	//Add Phone number field
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_phone\"]")
	WebElement phonenumber;
	
	//Add Primary Contact Name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_primaryContactName\"]")
	WebElement ContactName;

	//select phone code 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_primaryContactPhoneCountryId\"]")
	WebElement PriPhonecode;	
	
	//Add phone code 
	@CacheLookup
//	@FindBy(xpath = "(//*[@id=\"244\" and @class='ant-select-dropdown-menu-item']) ")
	@FindBy(xpath = "/html/body/div[3]/div/div/div/ul/li[3]")
	WebElement PriContactPhList;
	
	//Add Primary contact 
	 @CacheLookup
	 @FindBy(xpath="//*[@id=\"Add Processor_primaryContactPhone\"]")
	 WebElement PriContactPhNo;

	//Primary Email
	@CacheLookup
	@FindBy(xpath="//*[@id=\"Add Processor_primaryContactEmail\"]")
	WebElement Primary_email;
	
	//Add Scope
	@CacheLookup
	@FindBy(xpath= "//*[@id=\"Add Processor_scope\"]")
	WebElement scope;
		
	//Add Rule
	@CacheLookup
	@FindBy(xpath= "//*[@type=\"button\" and @class='ant-btn ant-btn-dashed']")
	WebElement AddRule;
	
	@CacheLookup
	@FindBy(xpath = "//*[@type='radio']")
	List<WebElement> FileType;
	
//	//Select batch file
//	@CacheLookup
//	@FindBy(xpath = "//*[text()='Batch']")
//	WebElement BatchFile;	
		
	
	//Select Frequency
	@CacheLookup
	@FindBy(xpath="//*[@id=\"Add Processor_frequency-0\"]")
	WebElement SelFrequency;

	//Frequency dropdown
	@CacheLookup
	@FindBy(xpath="//*[@itemid=\"H\"]")
	WebElement Frequency;
	
	
	//Select Time
	@CacheLookup
	@FindBy(xpath="//*[@placeholder=\"Select time\"]")
	WebElement SelectTime;
	
	//Hour dropdown
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-time-picker-panel-select-option-selected'])[2]")
	WebElement Hour;
	
	//Seconds dropdown
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-time-picker-panel-select-option-selected'])[2]")
	WebElement Minutes;

	//Alert on file found
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-switch-inner'])[1]") 
	WebElement alertOnFileFound;
	
	//Alert users on file found
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-select-search__field__placeholder' and @style=\"display: block;\"])") 
	WebElement alertUserOnFileFound;
	
//	Alert users on file found list
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='anticon anticon-caret-down ant-select-switcher-icon' and @aria-label=\"icon: caret-down\"])[1]") 
	WebElement alertUserOnFileFoundList;
	
//	Alert users on file found list
	@CacheLookup 
	@FindBy(xpath="//*[ @title='Arpitha Purohit']")
	WebElement alertUserOnFileFoundName;
	
	//Alert on file not found
	@CacheLookup
	@FindBy(xpath = "(//*[ @id='Add Processor_alertOnFailure-0'])") 
	WebElement alertOnFileNotFound;
	
	//Alert users on file not found
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-select-search__field__placeholder' and @style=\"display: block;\"])")
	WebElement alertUserOnFileNotFound;
			
//	Alert users on file not found list
	@CacheLookup
	@FindBy(xpath = "(//*[ @role=\"listbox\" and @id=\"rc-tree-select-list_2\"])")
//	
	WebElement alertUserOnFileNotFoundList;
	
////	Alert users on file not found user list name
//	@CacheLookup
//	@FindBy(xpath = "(//*[@class='ant-select-tree-checkbox'])[2]") 
//	WebElement alertUserOnFileNotFoundName;
	
	//Select no of files
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_noOfFiles-0\"]")
	WebElement Select_noOfFiles;

	//select source folder name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_sourceFolderName-0-0\"]")
	WebElement source_folderName;

	//select Destination folder name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_destinationFolderName-0-0\"]")
	WebElement Des_folderName;

	//select File name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_fileName-0-0\"]")
	WebElement FileName;

	//Select Extension
	@CacheLookup
	@FindBy(xpath="//*[@id=\"Add Processor_extensionId-0-0\"]")
	WebElement Extension;

	//Extension dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@itemid='70']")
	WebElement sel_extension;

	//Select Delimiter
	@CacheLookup
//	@FindBy(xpath="//*[@id=\"Add Processor_delimeterId-0-0\"]/div/div/div")
	@FindBy(xpath="//*[@id=\"Add Processor_delimeterId-0-0\"]")
	WebElement Delimiter;

	// Delimiter dropdown
	@CacheLookup
//	@FindBy(xpath="//*[text()='Pipe (|)']")
	@FindBy(xpath = "//*[@itemid='47']")
	WebElement sel_delimiter;

	//Select Line Terminator
	@CacheLookup
	@FindBy(xpath="//*[@id=\"Add Processor_lineTerminatorId-0-0\"]")
	WebElement LineTerminator;

	// Line Terminator dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@itemid='45']")
	WebElement sel_LineTerminator;

	//Add Header
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"Add Processor_containsHeader-0-0\"]")
	WebElement header;
	
	//Add is Encrypted
	@CacheLookup
	@FindBy(xpath="//*[@id=\"Add Processor_isEncrypted-0-0\"]")
	WebElement isEncrypted;
	
	//Account
	@CacheLookup
	@FindBy(xpath = "//*[@value='85']")
	WebElement Account;
	
	//Account-holder
	@CacheLookup
	@FindBy(xpath = "//*[@value='86']")
	WebElement Acc_holder;
	
	//card
	@CacheLookup
	@FindBy(xpath = "//*[@value='87']")
	WebElement card;
	
	//Address
	@CacheLookup
	@FindBy(xpath = "//*[@value='88']")
	WebElement Address;
		
	//transaction
	@CacheLookup
	@FindBy(xpath = "//*[@value='89']")
	WebElement transaction;
	
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveProcessor;

//	//cancel button
//	@CacheLookup    
//	@FindBy(xpath="//*[@type='button']")
//	WebElement cancel_processor;

//	// Search Filter
//	@CacheLookup
//	@FindBy(xpath = "(//*[@aria-label='icon: search' and @title='Filter menu'])")
//	WebElement searchFilter; 
	
	// Search Filter
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchFilter;

	// added new processor
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-column-sort'])[2]")
	WebElement addedprocessor;
		
	//Mapping
	@CacheLookup    
	@FindBy(xpath="//*[@alt='Map']")
	WebElement Mapping;
	
	//Transaction Mapping
	@CacheLookup    
//	@FindBy(xpath="//*[text()='Transaction Code']")
	@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[1]") 
	WebElement Transaction_Mapping;
	
	//Add Transaction code
	@CacheLookup    
	@FindBy(xpath="//*[@title='Add Transaction Code']")
	WebElement Add_transaction_code;
	
	//Add Transaction code
	@CacheLookup    
	@FindBy(xpath="//*[@id='Add Processor_transaction_code']")
	WebElement Transaction_code;
		
	//Transaction description
	@CacheLookup    
	@FindBy(xpath="//*[@id='Add Processor_transaction_desc']")
	WebElement Add_transaction_desc;
		
	//DS Transaction code
	@CacheLookup    
	@FindBy(xpath="(//*[@class='ant-select-selection__placeholder'])")
	WebElement DS_transaction_code;
	
	//DS transaction code list
	@CacheLookup    
	@FindBy(xpath="(//*[@class='ant-select-dropdown-menu-item'])[1]")
	WebElement DS_transaction_code_list;
	
	//Save transaction code
	@CacheLookup
	@FindBy(xpath="//*[@class='ant-btn m-t-10 ant-btn-primary']")
	WebElement Save_transaction;

//	//cancel transaction code
//	@CacheLookup
//	@FindBy(xpath="//*[@class='ant-btn m-l-10 ant-btn-danger']")
//	WebElement cancel_transaction;
	
	//back transaction code
	@CacheLookup
	@FindBy(xpath="//*[@class='ant-btn m-r-10 ant-btn-danger ant-btn-circle']")
	WebElement back_button;
//	
//	//cancel transaction code
//	@CacheLookup
//	@FindBy(xpath="//*[@type='button']")
//	WebElement cancel_button;

	//Authorization mapping
	@CacheLookup    
	@FindBy(xpath="//*[text()='Authorization Code']")
//	@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[1]") 
	WebElement Authorization_Mapping;
		
	//Add Authorization code
	@CacheLookup    
	@FindBy(xpath="//*[@title='Add Authorization Code']")
	WebElement Add_Auth_code;
		
	//Add Transaction code
	@CacheLookup    
	@FindBy(xpath="//*[@id='Add Authorizar_authorization_code']")
	WebElement Auth_code;
			
	//Auth description
	@CacheLookup    
	@FindBy(xpath="//*[@id='Add Authorizar_authorization_desc']")
	WebElement Add_Auth_desc;
			
	//DS Auth code
	@CacheLookup    
	@FindBy(xpath="(//*[@class='ant-select-selection__placeholder'])")
	WebElement DS_Auth_code;
		
	//DS Auth code list
	@CacheLookup    
	@FindBy(xpath="(//*[@class='ant-select-dropdown-menu-item'])[1]")
	WebElement DS_Auth_code_list;
		
	//Save Auth code
	@CacheLookup
	@FindBy(xpath="//*[@class='ant-btn m-t-10 ant-btn-primary']")
//	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/form/div[1]/div/button[1]")
	WebElement Save_Auth;

	//back auth code
	@CacheLookup
	@FindBy(xpath="//*[@type='button' and @class='ant-btn m-r-10 ant-btn-danger ant-btn-circle']")
	WebElement auth_back_button;
	
	//Account status code
	@CacheLookup    
	@FindBy(xpath="//*[text()='Account Status Code']")
//	@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[3]") 
	WebElement Account_status_Code;
		
	//Add Account status code
	@CacheLookup    
	@FindBy(xpath="//*[@title='Add Account Code']")
	WebElement Add_Acc_statusCode;
		
	//Add Account status code
	@CacheLookup    
	@FindBy(xpath="//*[@id='Add Account Status_account_status_code']")
	WebElement Acc_statusCode;
			
	//Account status code description
	@CacheLookup    
	@FindBy(xpath="//*[@id='Add Account Status_account_status_desc']")
	WebElement Add_Acc_statusCode_desc;
			
	//DS Account status code
	@CacheLookup    
	@FindBy(xpath="(//*[@class='ant-select-selection__placeholder' and @style=\"display: block; user-select: none;\"])")
	WebElement DS_Acc_statusCode;
		
	//DS Account status code list
	@CacheLookup    
	@FindBy(xpath="(//*[@class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active'])[1]")
	WebElement DS_Acc_statusCode_list;
		
	//Save Account status code
	@CacheLookup
	@FindBy(xpath="//*[@class='ant-btn m-r-10 m-b-10 ant-btn-primary']")
//	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/form/div[1]/div/button[1]")
	WebElement Save_Acc_statusCode;

	//back Account status code
	@CacheLookup
	@FindBy(xpath="//*[@type='button' and @title='Go Back']")
	WebElement Acc_statusCode_back_button;
	
	//Card status code
	@CacheLookup    
	@FindBy(xpath="//*[text()='Card Status Code']")
//	@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[4]") 
	WebElement Card_status_Code;
			
	//Add Card  status code
	@CacheLookup     
	@FindBy(xpath="//*[@title='Add Card Code']")
	WebElement Add_Card_statusCode;
			
	//Add Card  status code
	@CacheLookup    
	@FindBy(xpath="//*[@id='Add Card Status_card_status_code']")
	WebElement Card_statusCode;
				
	//Card  code description
	@CacheLookup    
	@FindBy(xpath="//*[@id='Add Card Status_card_status_desc']")
	WebElement Add_Card_statusCode_desc;
				
	//DS Card  status code
	@CacheLookup    
	@FindBy(xpath="(//*[@unselectable=\"on\" and @class='ant-select-selection__placeholder'])")
	WebElement DS_Card_statusCode;
			
	//DS Card  status code list
	@CacheLookup    
	@FindBy(xpath="(//*[@itemid=\"[object Object]\" and @class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active'])[1]")
	WebElement DS_Card_statusCode_list;
			
	//Save Card  status code
	@CacheLookup
//	@FindBy(xpath="//*[@class='ant-btn m-t-10 ant-btn-primary']")
	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/form/div[1]/div/button[1]")
	WebElement Save_Card_statusCode;

	//back Card  status code
	@CacheLookup
	@FindBy(xpath="//*[@title='Go Back' and @type='button' and @class='ant-btn m-r-10 ant-btn-danger ant-btn-circle']")
	WebElement Card_statusCode_back_button;
	
		//POS status code
		@CacheLookup    
		@FindBy(xpath="//*[text()='POS Entry Code']")
		WebElement POS_status_Code;
				
		//Add POS  status code
		@CacheLookup     
		@FindBy(xpath="//*[@title='Add Pos Code']")
		WebElement Add_POS_statusCode;
				
		//Add POS  status code
		@CacheLookup    
		@FindBy(xpath="//*[@id='Add Pos Status_pos_code']")
		WebElement POS_statusCode;
					
		//POS  code description
		@CacheLookup    
		@FindBy(xpath="//*[@id='Add Pos Status_pos_desc']")
		WebElement Add_POS_statusCode_desc;
					
		//DS POS  status code
		@CacheLookup    
		@FindBy(xpath="(//*[@class='ant-select-selection__placeholder' and @style=\"display: block; user-select: none;\"])")
		WebElement DS_POS_statusCode;
				
		//DS POS  status code list
		@CacheLookup    
		@FindBy(xpath="(//*[@style=\"user-select: none;\" and @class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active'])[1]")
		WebElement DS_POS_statusCode_list;
				
		//Save POS  status code
		@CacheLookup
		@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/form/div[1]/div/button[1]")
		WebElement Save_POS_statusCode;

		//back POS  status code
		@CacheLookup
		@FindBy(xpath="//*[@title='Go Back' and @type='button']")
		WebElement POS_statusCode_back_button;
		
		//Network status code
		@CacheLookup    
		@FindBy(xpath="//*[text()='Network Code']")
		WebElement Network_status_Code;
						
		//Add Network  status code
		@CacheLookup     
		@FindBy(xpath="//*[@title='Add Network Code']")
		WebElement Add_Network_statusCode;
						
				//Add Network status code
				@CacheLookup    
				@FindBy(xpath="//*[@id='Add Network Status_network_code']")
				WebElement Network_statusCode;
							
				//Network  code description
				@CacheLookup    
				@FindBy(xpath="//*[@id='Add Network Status_network_desc']")
				WebElement Add_Network_statusCode_desc;
							
				//DS Network  status code
				@CacheLookup    
//				@FindBy(xpath="(//*[@class='ant-select-selection__placeholder' and @style=\"display: block; user-select: none;\"])")
				@FindBy(xpath="//*[@id='Add Network Status_DS_Network_desc']")
				WebElement DS_Network_statusCode;
						
				//DS Network status code list
				@CacheLookup    
				@FindBy(xpath="(//*[@aria-selected=\"false\" and @class='ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active'])[1]")
				WebElement DS_Network_statusCode_list;
						
				//Save Network  status code
				@CacheLookup
				@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/form/div[1]/div/button[1]")
				WebElement Save_Network_statusCode;

				//back Network  status code
				@CacheLookup
				@FindBy(xpath="//*[@title='Go Back' and @type='button']")
				WebElement Network_statusCode_back_button;


	//Field Mapping
	@CacheLookup
	@FindBy(xpath="//*[text()='test']")
	WebElement Field_Mapping;

	
	//Click on bulk update
	@CacheLookup
	@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/section[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]")
	WebElement Bulk_update;
	
	//Click on upload file
	@CacheLookup
	@FindBy(xpath="//*[@type=\"file\" and @accept=\".xlsx\"]")
	WebElement file_upload;
	
	//Start upload
	@CacheLookup
	@FindBy(xpath="//*[@type='button' and  @class='ant-btn ant-btn-primary']")
	WebElement upload;
	
	//Click ok
	@CacheLookup
	@FindBy(xpath="(//*[@type='button' and  @class='ant-btn ant-btn-primary ant-btn-sm'])")
	WebElement Ok;
	
	//select checkbox to Delete
	@CacheLookup
	@FindBy(xpath="(//*[ @class='ant-checkbox'])")
	WebElement checkbox;
	
	// Delete
	@CacheLookup
	@FindBy(xpath="(//*[@title='Delete selected records' and @type='button'])")
	WebElement Delete;
	
	//back Card  status code
	@CacheLookup
	@FindBy(xpath="//*[@title='Go back' and @type='button']")
	WebElement field_backButton;		
	
	//Back to listing page
	@CacheLookup
	@FindBy(xpath="//*[@title='Go back' and @type='button' and @class='ant-btn m-r-10 ant-btn-danger ant-btn-circle']")
	WebElement List_backButton;
	
	// sort drop-down of apikey management page
		@CacheLookup
		@FindBy(xpath = "(//*[@class='anticon anticon-caret-up ant-table-column-sorter-up off'])[2]")
		WebElement sortdown; 
		
public Processor(WebDriver d) 
{
	PageFactory.initElements(d, this);
}

//Rules And MDM Page
public void RulesAndMDMPage()
{
	try
		{
			log.info("Clicking on Rules & MDM");
			wait.until(ExpectedConditions.visibilityOf(RulesAndMDM));
			RulesAndMDM.click();

			log.info("User clicked on to Rules And MDM successfully!!!!");
		}
	catch(Exception e)
		{
			log.error("Rules And MDM module not found");
		}
}

public void ProcessorPage()
{
	try
		{
			RulesAndMDMPage();
			log.info("Click on Processor");
			Processor.click();
			wait.until(ExpectedConditions.visibilityOf(processor_mgmt));
			processor_mgmt.click();
	
//			log.info("click on Add Processor");
//			wait.until(ExpectedConditions.visibilityOf(AddProcessor));
//			AddProcessor.click();
//			
			log.info("Directed to Processor page");
				
		}
			catch(Exception e)
		{
			log.error("Not directed to Processor page");
		}
}

public void addProcessorButton() {
    try {
        log.info("Clicking on Add Processor Button");
        wait.until(ExpectedConditions.elementToBeClickable(AddProcessor));
        Point point = AddProcessor.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();
        executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
        executor.executeScript("arguments[0].click();", AddProcessor);
        log.info("Clicked on Add Processor Button successfully!!!!");
    } catch (Exception e) {
        Assert.fail("Failed Click on Add Processor Button!!!!");
    }
}

public void AddProcessorPage(int FType)  
{
	try
		{	
			ProcessorPage();
			addProcessorButton();
//			log.info("click on Add Processor");
//			wait.until(ExpectedConditions.visibilityOf(AddProcessor));
//			AddProcessor.click();
			 
			log.info("Click on Processor Name");
			wait.until(ExpectedConditions.visibilityOf(AddProc_Name));
			AddProc_Name.sendKeys(Processordata);
			
			log.info("Click on Alert Email");
			wait.until(ExpectedConditions.visibilityOf(Alert_email));
			Alert_email.sendKeys("apurohit@dataseers.in");
			
			log.info("Click on website");
			wait.until(ExpectedConditions.visibilityOf(website));
			website.sendKeys("https://www.dataseers.ai");
			
			
			log.info("Selecting new user phone code");
			phonecode.click();
			wait.until(ExpectedConditions.visibilityOf(phonecodelist));
			phonecodelist.click();
			log.info("User's phone country code is: " + phonecode.getText());
			
			log.info("Entering new user phone number");
			wait.until(ExpectedConditions.visibilityOf(phonenumber));
			phonenumber.click();
			phonenumber.sendKeys(GenerateData.generateRandomNumber(10));
			log.info("User's phone number is: " + phonenumber.getText());

			log.info("Entering Primary Contact Name");
			wait.until(ExpectedConditions.visibilityOf(ContactName));
			ContactName.sendKeys("Arpitha");
	
			log.info("Selecting primary phone code");
			PriPhonecode.click();
			wait.until(ExpectedConditions.visibilityOf(PriContactPhList)); 
			PriContactPhList.click();
			log.info("User's primary phone country code is: " + PriPhonecode.getText());
			
			log.info("Enter primary phone number");
			wait.until(ExpectedConditions.visibilityOf(PriContactPhNo));
			PriContactPhNo.sendKeys(GenerateData.generateRandomNumber(10));
			
			log.info("Click on Alert Email");
			wait.until(ExpectedConditions.visibilityOf(Primary_email));
			Primary_email.sendKeys("apurohit@dataseers.in");
			
			log.info("Enter Scope");
			wait.until(ExpectedConditions.visibilityOf(scope));
			scope.sendKeys(Processordata);
			
			log.info("Click on Add Rule");
			wait.until(ExpectedConditions.visibilityOf(AddRule));
			AddRule.click();
			
//			log.info("Select batch file");
//			wait.until(ExpectedConditions.visibilityOf(BatchFile));
//			BatchFile.click();
			
			FileType.get(FType).click();
			
			//Batch File
			if( FType== 0)
			{
							
				log.info("Selecting Frequency");
				SelFrequency.click();
				wait.until(ExpectedConditions.visibilityOf(Frequency));
				Frequency.click();
				log.info("Frequency is : " + SelFrequency.getText());
				
				log.info("Selecting Time");
				SelectTime.click();
				wait.until(ExpectedConditions.visibilityOf(Hour));
				Hour.click();
				Hour.sendKeys(Keys.TAB);
				wait.until(ExpectedConditions.visibilityOf(Minutes));
				Minutes.click();
				log.info("time is: " + SelectTime.getText());
				
//				alertOnFileFound.click();
//				alertUserOnFileFound.click();
//				alertUserOnFileFoundList.click();
//				alertUserOnFileFoundName.click();
//
//				alertOnFileNotFound.click();
//				alertUserOnFileNotFound.click();
//				alertUserOnFileNotFoundList.click();
//				alertUserOnFileNotFoundName.click();

				log.info("Select no of files");
				wait.until(ExpectedConditions.visibilityOf(Select_noOfFiles)); 
				Select_noOfFiles.sendKeys("1");
				
				log.info("Entering Source folder name");
				wait.until(ExpectedConditions.visibilityOf(source_folderName));
				source_folderName.sendKeys("test");
				
				log.info("Entering Destination folder Name");
				wait.until(ExpectedConditions.visibilityOf(Des_folderName));
				Des_folderName.sendKeys("test");
				
				log.info("Entering File Name");
				wait.until(ExpectedConditions.visibilityOf(FileName));
				FileName.sendKeys("test");
				
				log.info("Selecting Extension");
				Extension.click();
				wait.until(ExpectedConditions.visibilityOf(sel_extension));
				sel_extension.click();
				log.info("Extension is : " + Extension.getText());
				
				log.info("Selecting Delimiter");
				Delimiter.click();
				wait.until(ExpectedConditions.visibilityOf(sel_delimiter));
				sel_delimiter.click();
				log.info("Delimiter is : " + Delimiter.getText());
			
				log.info("Selecting Line Terminator");
				LineTerminator.click();
				wait.until(ExpectedConditions.visibilityOf(sel_LineTerminator));
				sel_LineTerminator.click();
				log.info("Line Terminator is : " + LineTerminator.getText());
				
				log.info("Click on header");
				header.click();
				
				log.info("Click on is Encrypted");
				isEncrypted.click();
			}
			
			//Real time file
			else {
					Account.click();
					Acc_holder.click();
					card.click();
					Address.click();
					transaction.click();
					
					alertOnFileFound.click();
					alertUserOnFileFound.sendKeys("Arpitha Purohit");
					alertUserOnFileFound.click();
					alertUserOnFileFoundList.click();
					alertUserOnFileFoundName.click();

					alertOnFileNotFound.click();
					alertUserOnFileNotFound.click();
					alertUserOnFileNotFoundList.click();
//					alertUserOnFileNotFoundName.click();
					
					log.info("Selecting Time");
					SelectTime.click();
					wait.until(ExpectedConditions.visibilityOf(Hour));
					Hour.click();
					Hour.sendKeys(Keys.TAB);
					wait.until(ExpectedConditions.visibilityOf(Minutes));
					Minutes.click();
					log.info("time is: " + SelectTime.getText());
				}
		}
		catch(Exception e)
		{
			log.error("Cant add Processor");
		}
}

	//Save processor
	public void saveProcessorPage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveProcessor.click();
				log.info("New Processor is added successfully");
				
				wait.until(ExpectedConditions.urlToBe("https://dev.dataseers.in:3000/processor_admin"));
				d.findElement(By.xpath("//*[@title='Reset filter']")).click();

				
				
//				log.info("Verifying that new report has been added!!!!");
//				wait.until(ExpectedConditions.visibilityOf(ProcessorColumn));
//				log.info("Select search filter");
//				wait.until(ExpectedConditions.visibilityOf(searchFilter));
//				searchFilter.click();
//				searchFilter.click();
//				actions.moveToElement(sortDown).doubleClick().build().perform();
//
//				wait.until(ExpectedConditions.textToBePresentInElement(addedReport, Processordata));
//				String newReport = addedReport.getText();
//
//				if (newReport.contentEquals(Processordata)) {
//
//					log.info("Newly added report is displayed in a report list: " + newReport);
//				}
//
//				else {
//					log.info("Newly added report is not displayed in a report list: " + newReport);
//					log.error("Save new report scenario failed");
//				}
		
			}
		
		catch(Exception e)
			{
				log.error("could not Add Processor");	

			}
	}
	
//	//Cancel processor
//	public void cancelProcessor() 
//	{
//		try
//			{
//				log.info("Clicking on cancel button");
//				cancel_processor.click();
//			}
//		catch(Exception e)
//			{
//				log.error("cancel button failed");	
//			}
//	}
	
	//Search Filter
	public void searchFilter()
	{
		try
		{
		wait.until(ExpectedConditions.visibilityOf(searchFilter));
		searchFilter.click();

		WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
		wait.until(ExpectedConditions.visibilityOf(searchbox));
		actions.sendKeys(searchbox, Processordata).perform();

		WebElement searchBtn = d
				.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(searchBtn));
		searchBtn.click();

		String newprogram = addedprocessor.getText();

		if (newprogram.contentEquals(Processordata)) {

			log.info("Newly added program is displayed in a program list: " + newprogram);
		}

		else {
			log.info("Newly added program is not displayed in a program list: " + newprogram);
			log.error("Save new program scenario failed");
		}
		}
		catch(Exception e)
		{
			log.error("cancel button failed");	
		}
		
	}
	
	//Mapping
	public void Transaction_code_Mapping()
	{
		try
			{
//				log.info("Select search filter");
//				wait.until(ExpectedConditions.visibilityOf(searchFilter));
//				searchFilter.click();
			
				log.info("Click on Mapping");
				Mapping.click();
				
				log.info("Click on Transaction Mapping");
				wait.until(ExpectedConditions.visibilityOf(Transaction_Mapping));
				Transaction_Mapping.click();
				
				log.info("Click on Add Transaction code");
				wait.until(ExpectedConditions.visibilityOf(Add_transaction_code));
				Add_transaction_code.click();
				
				log.info("Click on Transaction code");
				wait.until(ExpectedConditions.visibilityOf(Transaction_code));
				Transaction_code.sendKeys(Processordata);
				
				log.info("Click on Transaction description");
				wait.until(ExpectedConditions.visibilityOf(Add_transaction_desc));
				Add_transaction_desc.sendKeys("Transactioncode Map Testing");
				
				log.info("Click on DS Transaction code");
				wait.until(ExpectedConditions.visibilityOf(DS_transaction_code));
				DS_transaction_code.click();
				DS_transaction_code_list.click();
				
				Save_Auth.click();
				back_button.click();
			}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}
	
	public void Authorization_code_Mapping()
	{
		try
			{
				log.info("Click on Authorization code Mapping");
				wait.until(ExpectedConditions.visibilityOf(Authorization_Mapping));
				Authorization_Mapping.click();
				
				log.info("Click on Add Auth code");
				wait.until(ExpectedConditions.visibilityOf(Add_Auth_code));
				Add_Auth_code.click();
				
				log.info("Click on Auth code");
				wait.until(ExpectedConditions.visibilityOf(Auth_code));
				Auth_code.sendKeys(Processordata);
				
				log.info("Click on Auth description");
				wait.until(ExpectedConditions.visibilityOf(Add_Auth_desc));
				Add_Auth_desc.sendKeys("Authorization code Map Testing");
				
				log.info("Click on DS Auth code");
				wait.until(ExpectedConditions.visibilityOf(DS_Auth_code));
				DS_Auth_code.click();
				DS_Auth_code_list.click();
				
				Save_transaction.click();
				auth_back_button.click();
			}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}
		public void Account_status_code_Mapping()
		{
			try
				{
					log.info("Click on Account status code Mapping");
					wait.until(ExpectedConditions.visibilityOf(Account_status_Code));
					Account_status_Code.click();
					
					log.info("Click on Add Account status code");
					wait.until(ExpectedConditions.visibilityOf(Add_Acc_statusCode));
					Add_Acc_statusCode.click();
					
					log.info("Click on Account status code");
					wait.until(ExpectedConditions.visibilityOf(Acc_statusCode));
					Acc_statusCode.sendKeys(Processordata);
					
					log.info("Click on Account status code description");
					wait.until(ExpectedConditions.visibilityOf(Add_Acc_statusCode_desc));
					Add_Acc_statusCode_desc.sendKeys("Account status code Map Testing");
					
					log.info("Click on DS Account status code");
					wait.until(ExpectedConditions.visibilityOf(DS_Acc_statusCode));
					DS_Acc_statusCode.click();
					DS_Acc_statusCode_list.click();
					
					Save_Acc_statusCode.click();
					Acc_statusCode_back_button.click();
				}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}
		public void Card_status_code_Mapping()
		{
			try
				{
					log.info("Click on Account status code Mapping");
					wait.until(ExpectedConditions.visibilityOf(Card_status_Code));
					Card_status_Code.click();
					
					log.info("Click on Add Account status code");
					wait.until(ExpectedConditions.visibilityOf(Add_Card_statusCode));
					Add_Card_statusCode.click();
					
					log.info("Click on Account status code");
					wait.until(ExpectedConditions.visibilityOf(Card_statusCode));
					Card_statusCode.sendKeys(Processordata);
					
					log.info("Click on Account status code description");
					wait.until(ExpectedConditions.visibilityOf(Add_Card_statusCode_desc));
					Add_Card_statusCode_desc.sendKeys("Card status code Map Testing");
					
					log.info("Click on DS Account status code");
					wait.until(ExpectedConditions.visibilityOf(DS_Card_statusCode));
					DS_Card_statusCode.click();
					DS_Card_statusCode_list.click();
					
					Save_Card_statusCode.click();
					Card_statusCode_back_button.click();
				}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}
		public void POS_status_code_Mapping()
		{
			try
				{
					log.info("Click on Account status code Mapping");
					wait.until(ExpectedConditions.visibilityOf(POS_status_Code));
					POS_status_Code.click();
					
					log.info("Click on Add Account status code");
					wait.until(ExpectedConditions.visibilityOf(Add_POS_statusCode));
					Add_POS_statusCode.click();
					
					log.info("Click on Account status code");
					wait.until(ExpectedConditions.visibilityOf(POS_statusCode));
					POS_statusCode.sendKeys(Processordata);
					
					log.info("Click on Account status code description");
					wait.until(ExpectedConditions.visibilityOf(Add_POS_statusCode_desc));
					Add_POS_statusCode_desc.sendKeys("POS status code Map Testing");
					
					log.info("Click on DS Account status code");
					wait.until(ExpectedConditions.visibilityOf(DS_POS_statusCode));
					DS_POS_statusCode.click();
					DS_POS_statusCode_list.click();
					
					Save_POS_statusCode.click();
					POS_statusCode_back_button.click();
				}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}
		public void Network_status_code_Mapping()
		{
			try
				{
					log.info("Click on Network status code Mapping");
					wait.until(ExpectedConditions.visibilityOf(Network_status_Code));
					Network_status_Code.click();
					
					log.info("Click on Add Network status code");
					wait.until(ExpectedConditions.visibilityOf(Add_Network_statusCode));
					Add_Network_statusCode.click();
					
					log.info("Click on Network status code");
					wait.until(ExpectedConditions.visibilityOf(Network_statusCode));
					Network_statusCode.sendKeys(Processordata);
					
					log.info("Click on Network status code description");
					wait.until(ExpectedConditions.visibilityOf(Add_Network_statusCode_desc));
					Add_Network_statusCode_desc.sendKeys("Network status code Map Testing");
					
					log.info("Click on DS Network status code");
					wait.until(ExpectedConditions.visibilityOf(DS_Network_statusCode));
					DS_Network_statusCode.click();
					DS_Network_statusCode_list.click();
					
					Save_Network_statusCode.click();
					Network_statusCode_back_button.click();
				}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}
		
		
		public void Field_Mapping()
		{
			try
				{
					log.info("Click on Field Mapping");
					wait.until(ExpectedConditions.visibilityOf(Field_Mapping));
					Field_Mapping.click();
					
					log.info("Click on Bulk update");
					wait.until(ExpectedConditions.visibilityOf(Bulk_update));
					Bulk_update.click();
					
					log.info("Click on File upload");	
					file_upload.sendKeys("C://Users/ArpithaPurohit/Downloads/FieldMapping21.xlsx");
					
					
					upload.click();
					wait.until(ExpectedConditions.visibilityOf(Ok));
					Ok.click();
					wait.until(ExpectedConditions.visibilityOf(checkbox));
					checkbox.click();
					wait.until(ExpectedConditions.visibilityOf(Delete));
					Delete.click();
					Thread.sleep(2000);
					wait.until(ExpectedConditions.visibilityOf(field_backButton));
					field_backButton.click();
					List_backButton.click();
					
				}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}		
		
		
		public void Edit_page()
		{
			
				try
				{
					WebElement searchFilter2 = d
							.findElement(By.xpath("(//*[@title='Filter menu' and @class='anticon anticon-search ant-table-filter-icon ant-dropdown-trigger'])[1]"));
					
				wait.until(ExpectedConditions.visibilityOf(searchFilter2));
				searchFilter2.click();

				WebElement searchbox2 = d.findElement(By.xpath("//*[@placeholder='Search name']"));
				wait.until(ExpectedConditions.visibilityOf(searchbox2));
				actions.sendKeys(searchbox2, Processordata).perform();

				WebElement searchBtn2 = d
						.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
				wait.until(ExpectedConditions.visibilityOf(searchBtn2));
				searchBtn2.click();
					
	
////				wait.until(ExpectedConditions.visibilityOf(addedprocessor));
//				WebElement datalink = d.findElement(By.xpath("(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-column-sort'])[2]"));
//				wait.until(ExpectedConditions.visibilityOf(datalink));
//				datalink.click();
				
				
//				wait.until(ExpectedConditions.visibilityOf(addedprocessor));
				String data = addedprocessor.getText();
				d.findElement(By.linkText(data)).click();
				
				
				
				log.info("Clicking on edit button");
				WebElement editBtn = d.findElement(By.xpath("//*[@class='ant-btn m-r-10 m-b-10 ant-btn-primary']"));
				wait.until(ExpectedConditions.visibilityOf(editBtn));
				editBtn.click(); 

//				String newprogram = addedprocessor.getText();

//				if (newprogram.contentEquals(Processordata)) {
//
//					log.info("Newly added program is displayed in a program list: " + newprogram);
//				}
//
//				else {
//					log.info("Newly added program is not displayed in a program list: " + newprogram);
//					log.error("Save new program scenario failed");
//				}
				}
				catch(Exception e)
				{
					log.error("cancel button failed");	
				}
							}
			
}

