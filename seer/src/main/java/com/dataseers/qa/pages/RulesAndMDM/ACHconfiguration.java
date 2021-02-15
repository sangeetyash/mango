package com.dataseers.qa.pages.RulesAndMDM;
import org.openqa.selenium.By;
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
import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;

public class ACHconfiguration extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String ACHdata = GenerateData.generateRandomString(7).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard(); 
	WebDriver driver;

	//Rules and MDM
	@CacheLookup    
	@FindBy(xpath = "//*[text()='Rules & MDM']") 
	WebElement RulesAndMDM; 

	//Program Rules
	@CacheLookup    
	@FindBy(xpath = "//*[text()='Program Rules']") 
	WebElement Program_Rules; 
		
		
	//ACH configuration
	@CacheLookup    
	@FindBy(xpath="//*[@href='/ach-configuration\']")
	WebElement ACH_configuration;

	//Add ACH
	@CacheLookup
	@FindBy(xpath= "//button[contains(@title,'Add ach configuration')]")
	WebElement Add_ACH;

		
	//Processor drop-down list
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add-ach-config_processor\"]")
	WebElement Processor_list;
		
	//Select Processor
	@CacheLookup
	@FindBy(xpath = "(//li[normalize-space()='Finastra'])")
	WebElement Processor;
		
	//Program drop-down list
	@CacheLookup
	@FindBy(xpath="//div[contains(text(),'Select program name')]")
	WebElement Program_list;
			
	//Select Program
	@CacheLookup
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]") 
	WebElement Program;
		
	//Full Account Number
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-switch-inner'])[1]") 
	WebElement Full_Acc_number;
		
	//Account prefix
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add-ach-config_account_prefix\"]")
	WebElement Add_Acc_Prefix;
			
		
	//file_identifier
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add-ach-config_file_identifier\"]")
	WebElement Add_file_identifier;
				
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveACH;

	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancel_ACH;

	
public ACHconfiguration(WebDriver d) 
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

public void ACHPage()
{
	try
		{
			RulesAndMDMPage();
			log.info("Click on Program Rules");
			Program_Rules.click();
			log.info("Click on ACH configuration");
			wait.until(ExpectedConditions.visibilityOf(ACH_configuration));
			ACH_configuration.click();
			log.info("Directed to ACH configuration page");
		}
			catch(Exception e)
		{
			log.error("Not directed to ACH configuration page");
		}
}

public void AddACHPage(int Full_AccType)  
{
	try
		{	
			ACHPage();
			
			log.info("click on Add ACH");
			wait.until(ExpectedConditions.visibilityOf(Add_ACH));
			Add_ACH.click();
			
			log.info("Select Processor");
			wait.until(ExpectedConditions.visibilityOf(Processor_list));
			Processor_list.click();
			Processor.click();
			
			log.info("Select Program");
			wait.until(ExpectedConditions.visibilityOf(Program_list));
			Program_list.click();
			Program.click();
			
			if(Full_AccType==1)
			{
				Full_Acc_number.click();
				log.info("Enter File Identifier");
				wait.until(ExpectedConditions.visibilityOf(Add_file_identifier));
				Add_file_identifier.sendKeys(ACHdata);
			}
			
			else 
				{
				
			
					log.info("Enter Account Prefix");
					wait.until(ExpectedConditions.visibilityOf(Add_Acc_Prefix));
					Add_Acc_Prefix.sendKeys(GenerateData.generateRandomNumber(8));
			
					log.info("Enter File Identifier");
					wait.until(ExpectedConditions.visibilityOf(Add_file_identifier));
					Add_file_identifier.sendKeys(ACHdata);
			
				}


		}
		catch(Exception e)
		{
			log.error("Cant add ACH configuration");
		}
}


	public void saveACHPage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveACH.click();
				log.info("New ACH configuration is added successfully");
				
//				wait.until(ExpectedConditions.urlToBe("https://dev.dataseers.in:3000/merchant-master"));
//				d.findElement(By.xpath("//*[@title='Reset filter']")).click();
		
			}
		
		catch(Exception e)
			{
				log.error("could not Add ACH configuration");	

			}
	}
	
	//Cancel  ACH configuration
	public void cancelACH() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancel_ACH.click();
			}
		catch(Exception e)
			{
				log.error("cancel button failed");	
			}
	}
}

