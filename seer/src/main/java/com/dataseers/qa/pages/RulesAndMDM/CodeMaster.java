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

import java.util.List;

import org.openqa.selenium.By;
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

public class CodeMaster extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String Processordata = GenerateData.generateRandomString(6).toLowerCase();
//	String cardData = GenerateData.generateRandomString(1).toUpperCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();            
	WebDriver driver; 

	//Rules and MDM
	@CacheLookup    
	@FindBy(xpath = "//*[text()='Rules & MDM']")
	WebElement RulesAndMDM; 
		
	//DS Code Master
	@CacheLookup    
	@FindBy(xpath="//*[@href=\"/ds-code-master\"]")
	WebElement DS_Code_Master;
	
	//Transaction Mapping
	@CacheLookup    
	@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[1]") 
	WebElement Transaction_Mapping;
	
	//click on Add Transaction code
	@CacheLookup    
//	@FindBy(xpath = "(//*[ @title='Add transaction Code' and @type='button'][3]") 
	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/div/div/div/div/div[1]/button[3]")
	WebElement Add_transaction_code;
	
	//Add Transaction code
	@CacheLookup    
	@FindBy(xpath="//*[@id='manage_ds_code_ds_transaction_code']")
	WebElement Transaction_code;
		
	//Transaction description
	@CacheLookup    
	@FindBy(xpath="//*[@id='manage_ds_code_ds_transaction_desc']")
	WebElement Add_transaction_desc;
	
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
	@FindBy(xpath="//*[@class='ant-btn ant-btn-danger ant-btn-circle']")
	WebElement trans_back_button;


	//Authorization mapping
	@CacheLookup    
//	@FindBy(xpath="//*[text()='Authorization Code']")
	@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[2]")
	WebElement Authorization_Mapping;
		
	//Add Authorization code
	@CacheLookup    
//	@FindBy(xpath="//*[@title='Add Authorization Code']")
	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/div/div/div/div/div[1]/button[3]")
	WebElement Add_Auth_code;
		
	//Add auth code
	@CacheLookup    
	@FindBy(xpath="//*[@id='manage_ds_code_ds_authorization_code']")
	WebElement Auth_code;
			
	//Auth description
	@CacheLookup    
	@FindBy(xpath="//*[@id='manage_ds_code_ds_authorization_desc']")
	WebElement Add_Auth_desc;
		
	//Save Auth code
	@CacheLookup
	@FindBy(xpath="//*[@type='submit' and @class='ant-btn m-t-10 ant-btn-primary']")
	WebElement Save_Auth;

	//back auth code
	@CacheLookup
	@FindBy(xpath="//*[@type='button' and @class='ant-btn ant-btn-danger ant-btn-circle']")
	WebElement auth_back_button;
	
	//status code
	@CacheLookup    
//	@FindBy(xpath="//*[text()='Status Code']")
	@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[3]")
	WebElement Status_Code;
		
	//Add status code
	@CacheLookup    
//	@FindBy(xpath="//*[@title='Add Status Code']")
//	@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[3]")
	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/div/div/div/div/div[1]/button[3]")
	WebElement Add_statusCode;
		
	//Add status code
	@CacheLookup    
	@FindBy(xpath="//*[@id='manage_ds_code_ds_status_code']")
	WebElement Acc_statusCode;
			
	// status code description
	@CacheLookup    
	@FindBy(xpath="//*[@id='manage_ds_code_ds_status_desc']")
	WebElement Add_statusCode_desc;
			
	//Save status code
	@CacheLookup
	@FindBy(xpath="//*[@class='ant-btn m-t-10 ant-btn-primary']")
//	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/form/div[1]/div/button[1]")
	WebElement Save_statusCode;

	//back status code
	@CacheLookup
	@FindBy(xpath="//*[@type='button' and @title='Go Back']")
	WebElement statusCode_back_button;
	
		//POS status code
		@CacheLookup    
		@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[4]")
//		@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[4]/a")
		WebElement POS_status_Code;
				
		//Add POS  status code
		@CacheLookup     
//		@FindBy(xpath="//*[@title='Add Pos Code']")
		@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/div/div/div/div/div[1]/button[3]")
		WebElement Add_POS_statusCode;
				
		//Add POS  status code
		@CacheLookup    
		@FindBy(xpath="//*[@id='manage_ds_code_ds_pos_entry_code']")
		WebElement POS_statusCode;
					
		//POS  code description
		@CacheLookup    
		@FindBy(xpath="//*[@id='manage_ds_code_ds_pos_entry_desc']")
		WebElement Add_POS_statusCode_desc;
				
		//Save POS  status code
		@CacheLookup
		@FindBy(xpath="//*[@class='ant-btn m-t-10 ant-btn-primary']")
		WebElement Save_POS_statusCode;

		//back POS  status code
		@CacheLookup
		@FindBy(xpath="//*[@title='Go Back' and @type='button']")
		WebElement POS_statusCode_back_button;
		
		//Network code
		@CacheLookup    
//		@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div[2]/div[5]/a")
		@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[5]")
		WebElement Network_Code;
						
		//Add Network code
		@CacheLookup     
//		@FindBy(xpath="//*[@title='Add Network Code']")
		@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/div/div/div/div/div[1]/button[3]")
		WebElement Add_Network_Code;
						
				//Add Network code
				@CacheLookup    
				@FindBy(xpath="//*[@id='manage_ds_code_ds_network_code']")
				WebElement NetworkCode;
							
				//Network  code description
				@CacheLookup    
				@FindBy(xpath="//*[@id='manage_ds_code_ds_network_desc']")
				WebElement Add_Network_Code_desc;
							
	
				//Select Network type
				@CacheLookup
				@FindBy(xpath="//*[@title='Select Network Type']")
				WebElement Network_type;
				
				//Select from drop down 
				@CacheLookup
				@FindBy(xpath="//*[@class='ant-select-dropdown-menu-item']")
				WebElement Select_NetworkType;
				
				//File upload
				@CacheLookup    
//				@FindBy(xpath="//*[@class='ant-upload ant-upload-select ant-upload-select-picture-card']")
				@FindBy(xpath="//*[@type=\"file\"]")
				WebElement file_upload;
				
				//Save Network  status code
				@CacheLookup
				@FindBy(xpath="//*[@class='ant-btn m-t-10 ant-btn-primary']")
				WebElement Save_Network_Code;

				//back Network  status code
				@CacheLookup
				@FindBy(xpath="//*[@title='Go Back' and @type='button']")
				WebElement Network_Code_back_button;

				//Account Type code
				@CacheLookup    
//				@FindBy(xpath="//*[@href='account-type-mapping']")
				@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[6]")
				WebElement Account_Type_Code;
								
				//Add account-type Code
				@CacheLookup     
//				@FindBy(xpath="//*[@title='Add account-type Code']")
				@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/div/div/div/div/div[1]/button[3]")
				WebElement Add_Account_Type_Code;
								
						//Add Account Type code
						@CacheLookup    
						@FindBy(xpath="//*[@id='manage_ds_code_ds_account_type_code']")
						WebElement Account_type_Code;
									
						//Account Type  code description
						@CacheLookup    
						@FindBy(xpath="//*[@id='manage_ds_code_ds_account_type_desc']")
						WebElement Account_Type_Code_desc;
									
						//Save Account Type code
						@CacheLookup
						@FindBy(xpath="//*[@class='ant-btn m-t-10 ant-btn-primary']")
						WebElement Save_Account_Type_Code;

						//back Account Type code
						@CacheLookup
						@FindBy(xpath="//*[@title='Go Back' and @type='button']")
						WebElement Account_Type_Code_back_button;
						
				//Card Type code
				@CacheLookup    
//				@FindBy(xpath="//*[text()='Card Type Code']")
				@FindBy(xpath = "(//*[ @class='ant-card-grid ant-card-grid-hoverable'])[7]")
				WebElement Card_Type_Code;
						
				//Add Card  Type code
				@CacheLookup     
//				@FindBy(xpath="//*[@title='Add card-type Code']")
				@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div/div/div/div/div/div/div/div[1]/button[3]")
				WebElement Add_Card_TypeCode;
						
				//Add Card  Type code
				@CacheLookup    
				@FindBy(xpath="//*[@id='manage_ds_code_ds_card_type_code']")
				WebElement Card_TypeCode;
							
				//Card Type code description
				@CacheLookup    
				@FindBy(xpath="//*[@id='manage_ds_code_ds_card_type_desc']")
				WebElement Add_Card_TypeCode_desc;
							
				//Save Card  Type code
				@CacheLookup
				@FindBy(xpath="//*[@class='ant-btn m-t-10 ant-btn-primary']")
				WebElement Save_Card_TypeCode;

				//back Card  status code
				@CacheLookup
				@FindBy(xpath="//*[@title='Go Back' and @type='button' and @class='ant-btn ant-btn-danger ant-btn-circle']")
				WebElement Card_TypeCode_back_button;

			
public CodeMaster(WebDriver d) 
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

public void DScodeMasterPage()
{
	try
		{
			RulesAndMDMPage();
			log.info("Click on DS code master");
			wait.until(ExpectedConditions.visibilityOf(DS_Code_Master));
			DS_Code_Master.click();
	
			log.info("Directed to DS_Code_Master page");
		}
			catch(Exception e)
		{
			log.error("Not directed to DS_Code_Master page");
		}
}

	//Mapping
	public void Transaction_code_Mapping()
	{
		try
			{
			
			
				log.info("Click on Transaction Mapping");
				wait.until(ExpectedConditions.visibilityOf(Transaction_Mapping));
				Transaction_Mapping.click();
				
				log.info("Click on Add Transaction code");
				wait.until(ExpectedConditions.visibilityOf(Add_transaction_code));
				Add_transaction_code.click();
				
				log.info("Click on Transaction code");
				wait.until(ExpectedConditions.visibilityOf(Transaction_code));
				Transaction_code.sendKeys(GenerateData.generateRandomNumber(4));
				
				log.info("Click on Transaction description");
				wait.until(ExpectedConditions.visibilityOf(Add_transaction_desc));
				Add_transaction_desc.sendKeys("Transactioncode Map Testing");
				
				Save_transaction.click();
				trans_back_button.click();
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
				Auth_code.sendKeys(GenerateData.generateRandomNumber(2));
				
				log.info("Click on Auth description");
				wait.until(ExpectedConditions.visibilityOf(Add_Auth_desc));
				Add_Auth_desc.sendKeys("Authorization code Map Testing");
				
				Save_Auth.click();
				auth_back_button.click();
			}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}
	
	public void status_code_Mapping()
	{
		try
			{
				log.info("Click on status code Mapping");
				wait.until(ExpectedConditions.visibilityOf(Status_Code));
				Status_Code.click();
				
				log.info("Click on Add Status_Code");
				wait.until(ExpectedConditions.visibilityOf(Add_statusCode));
				Add_statusCode.click();
				
				log.info("Click on  Acc_statusCode");
				wait.until(ExpectedConditions.visibilityOf(Acc_statusCode));
				Acc_statusCode.sendKeys(GenerateData.generateRandomNumber(2));
				
				log.info("Click on Account status code description");
				wait.until(ExpectedConditions.visibilityOf(Add_statusCode_desc));
				Add_statusCode_desc.sendKeys("Card status code Map Testing");
				
				Save_statusCode.click();
				statusCode_back_button.click();
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
				POS_statusCode.sendKeys(GenerateData.generateRandomNumber(2));
				
				log.info("Click on Account status code description");
				wait.until(ExpectedConditions.visibilityOf(Add_POS_statusCode_desc));
				Add_POS_statusCode_desc.sendKeys("POS status code Map Testing");
				
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
				wait.until(ExpectedConditions.visibilityOf(Network_Code));
				Network_Code.click();
				
				log.info("Click on Add Network status code");
				wait.until(ExpectedConditions.visibilityOf(Add_Network_Code));
				Add_Network_Code.click();
				
				log.info("Click on Network status code");
				wait.until(ExpectedConditions.visibilityOf(NetworkCode));
				NetworkCode.sendKeys(GenerateData.generateRandomNumber(2));
				
				log.info("Click on Network status code description");
				wait.until(ExpectedConditions.visibilityOf(Add_Network_Code_desc));
				Add_Network_Code_desc.sendKeys("Network status code Map Testing");
				
				log.info("Click on Network Type");
				Network_type.click();
				
				Select_NetworkType.click();
				file_upload.sendKeys("C://Users/ArpithaPurohit/Downloads/Image2.jpg");
				Save_Network_Code.click();
				Network_Code_back_button.click();
			}
	catch(Exception e)
	{
		log.error("could not Map");
	}
}
		public void Account_type_code_Mapping()
		{
			try
				{
					log.info("Click on Account status code Mapping");
					wait.until(ExpectedConditions.visibilityOf(Account_Type_Code));
					Account_Type_Code.click();
					
					log.info("Click on Add Account status code");
					wait.until(ExpectedConditions.visibilityOf(Add_Account_Type_Code));
					Add_Account_Type_Code.click();
					
					log.info("Click on Account status code");
					wait.until(ExpectedConditions.visibilityOf(Account_type_Code));
			
					Account_type_Code.sendKeys(GenerateData.generateRandomNumber(2));
					
					log.info("Click on Account type code description");
					wait.until(ExpectedConditions.visibilityOf(Account_Type_Code_desc));
					Account_Type_Code_desc.sendKeys("Account type code Map Testing");
				
					
					Save_Account_Type_Code.click();
					Account_Type_Code_back_button.click();
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
					log.info("Click on card Type code Mapping");
					wait.until(ExpectedConditions.visibilityOf(Card_Type_Code));
					Card_Type_Code.click();
					
					log.info("Click on Add Account Type code");
					wait.until(ExpectedConditions.visibilityOf(Add_Card_TypeCode));
					Add_Card_TypeCode.click();
					
					log.info("Click on Account status code");
					wait.until(ExpectedConditions.visibilityOf(Card_TypeCode));
					Card_TypeCode.sendKeys(GenerateData.generateRandomString(1).toUpperCase());
					
					log.info("Click on Account status code description");
					wait.until(ExpectedConditions.visibilityOf(Add_Card_TypeCode_desc));
					Add_Card_TypeCode_desc.sendKeys("Card status code Map Testing");
					
					Save_Card_TypeCode.click();
					Card_TypeCode_back_button.click();
				}
		catch(Exception e)
		{
			log.error("could not Map");
		}
	}
	
}

