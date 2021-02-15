package com.dataseers.qa.pages.RulesAndMDM;
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

public class BAI2configuration extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String BAI2data = GenerateData.generateRandomString(7).toLowerCase();
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
			
	//BAI2 configuration
	@CacheLookup    
	@FindBy(xpath="//*[@href='/bai2-configuration\']")
	WebElement BAI2_configuration;

	//Add BAI2
	@CacheLookup
	@FindBy(xpath= "//*[@title=\"Add bai2 configuration\" and @type=\"button\" and @class='ant-btn m-r-10 ant-btn-primary ant-btn-circle']")
	WebElement Add_BAI2;

		
	//Processor drop-down list
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add-ach-config_processor\"]")
	WebElement Processor_list;
		
	//Select Processor
	@CacheLookup
	@FindBy(xpath = "(//li[normalize-space()='Core Card'])") 
	WebElement Processor;
		
	//Program drop-down list
	@CacheLookup
	@FindBy(xpath="//div[contains(text(),'Select program name')]")
	WebElement Program_list;
		
	//Select Program
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-select-dropdown-menu-item 8'])[1]") 
	WebElement Program;
		
			
	//Account number
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add-ach-config_account_number\"]")
	WebElement Add_Acc_number;
			
	//file_identifier
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add-ach-config_file_identifier\"]")
	WebElement Add_file_identifier;
				
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveBAI2;

	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancel_BAI2;
	
public BAI2configuration(WebDriver d) 
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

public void BAI2Page()
{
	try
		{
			RulesAndMDMPage();
			log.info("Click on Program Rules");
			Program_Rules.click();
			log.info("Click on BAI2 configuration");
			wait.until(ExpectedConditions.visibilityOf(BAI2_configuration));
			BAI2_configuration.click();
	
			log.info("Directed to BAI2 configuration page");
		}
			catch(Exception e)
		{
			log.error("Not directed to BAI2 configuration page");
		}
}

public void AddBAI2Page()  
{
	try
		{	
			BAI2Page();
			
			log.info("click on Add BAI2");
			wait.until(ExpectedConditions.visibilityOf(Add_BAI2));
			Add_BAI2.click();
			
			log.info("Select Processor");
			wait.until(ExpectedConditions.visibilityOf(Processor_list));
			Processor_list.click();
			Processor.click();
			
			log.info("Select Program");
			wait.until(ExpectedConditions.visibilityOf(Program_list));
			Program_list.click();
			Program.click();
			
			log.info("Enter Account number");
			wait.until(ExpectedConditions.visibilityOf(Add_Acc_number));
			Add_Acc_number.sendKeys(GenerateData.generateRandomNumber(8));
			
			log.info("Enter File Identifier");
			wait.until(ExpectedConditions.visibilityOf(Add_file_identifier));
			Add_file_identifier.sendKeys(BAI2data);


		}
		catch(Exception e)
		{
			log.error("Cant add merchant");
		}
}


	//Save BAI2
	public void saveBAI2Page() 
	{
		try
			{
				log.info("Clicking on save button");
				saveBAI2.click();
				log.info("New BAI2 is added successfully");
		
			}
		
		catch(Exception e)
			{
				log.error("could not Add BAI2");	

			}
	}
	
	//Cancel  BAI2
	public void cancelBAI2() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancel_BAI2.click();
			}
		catch(Exception e)
			{
				log.error("cancel button failed");	
			}
	}

}

