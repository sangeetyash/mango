package com.dataseers.qa.pages.compliance;
import java.util.List;
import java.time.LocalDate;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class Add_Merchant_Watchlist extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String Merchantdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	WebDriver driver; 

	//Compliance 
	@CacheLookup    
	@FindBy(xpath = "//*[text()='Rules & MDM']")
	WebElement Compliance;

	//watchlist
	@CacheLookup    
	@FindBy(xpath = "//*[text()='Watchlist']")
	WebElement watchlist;
	
	//click on Account holder watchlist
	@CacheLookup
	@FindBy(xpath="//*[@href=\"/merchant-watchlist\"]")
	WebElement Merchant_Watchlist;

	//Click on add new merchant watchlist
	@CacheLookup
	@FindBy(xpath = "//*[@title='Create new merchant']")
	WebElement Add_Merchant_Watchlist;
	
	//Merchant number
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"add_account_holder_watchlist_merchant_number\"]")
	WebElement Merchant_no;

	//merchant name
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_merchant_name\"]")
	WebElement merchant_name;
				
	//Address
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_merchant_address\"]")
	WebElement Address;
	
	//City
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_merchant_city\"]")
	WebElement City;
	
	//State
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_merchant_state\"]")
	WebElement State;
	
	//Zip
	@CacheLookup
	@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_merchant_zip\"]")
	WebElement Zip;
	
	//Expire on
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Select date' and @class='ant-calendar-picker-input ant-input']")
	WebElement expiryDate;
		
	// select program type
	@CacheLookup
	@FindBy(xpath = "//*[@type='radio']")
	List<WebElement> ProgramType;
	
	// core card
	@CacheLookup
	@FindBy(xpath = "//span[normalize-space()='Core Card']")
	WebElement coreCard;
	
	// First Data
	@CacheLookup
	@FindBy(xpath = "//span[normalize-space()='Galileo']")
	WebElement Galileo;

	// Fis South
	@CacheLookup
	@FindBy(xpath = "//span[normalize-space()='InComm']")
	WebElement fisSouth;
		
	// marqeta
	@CacheLookup
	@FindBy(xpath = "//span[normalize-space()='Marqeta']")
	WebElement marqeta;
	
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveMerchant;

	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancelMerchant;

	
public Add_Merchant_Watchlist(WebDriver d) 
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
		Assert.fail("compliance module not found");
		}
}

public void watchlistPage()
{
	try
		{
			compliancePage();
			log.info("Click on watchlist");
			wait.until(ExpectedConditions.visibilityOf(watchlist));
			watchlist.click();
			
			log.info("click on Merchant watchlist");
			wait.until(ExpectedConditions.visibilityOf(Merchant_Watchlist));
			Merchant_Watchlist.click();
	
			log.info("Clicked on Merchant watchlist");
		}
			catch(Exception e)
		{
				Assert.fail("Not clicked on Merchant watchlist");
		}
}

public void Add_Merchant_WatchlistPage( int progType)  
{
	try
		{	
//			watchlistPage();
			
			log.info("click on Add Merchant watchlist");
			wait.until(ExpectedConditions.visibilityOf(Add_Merchant_Watchlist));
			Add_Merchant_Watchlist.click();
				
			log.info("Enter Merchant Number");
			wait.until(ExpectedConditions.visibilityOf(Merchant_no));
			Merchant_no.sendKeys(GenerateData.generateRandomNumber(3));
			
			log.info("Enter Merchant Name");
			wait.until(ExpectedConditions.visibilityOf(merchant_name));
			merchant_name.sendKeys(Merchantdata);
				
			log.info("Enter Address");
			wait.until(ExpectedConditions.visibilityOf(Address));
			Address.sendKeys(Merchantdata);
				
			log.info("Enter City");
			wait.until(ExpectedConditions.visibilityOf(City));
			City.sendKeys("Thane");
				
			log.info("Enter State");
			wait.until(ExpectedConditions.visibilityOf(State));
			State.sendKeys("MH");
				
			log.info("Enter ZIP");
			wait.until(ExpectedConditions.visibilityOf(Zip));
			Zip.sendKeys(GenerateData.generateRandomNumber(6));
			
			log.info("Selecting current date as Expiry date");
			wait.until(ExpectedConditions.visibilityOf(expiryDate));
			expiryDate.click();
			actions.sendKeys(expiryDate, LocalDate.of(2020, 07, 30).toString(), Keys.ENTER).perform();

			ProgramType.get(progType).click();
			coreCard.click();
			Galileo.click();
			fisSouth.click();
			marqeta.click();
		}
	catch(Exception e)
	{
		Assert.fail("Cant Add Merchant Watchlist");
	}
	
}
//Save Merchant watchlist
	public void save_Merchant_Watchlistpage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveMerchant.click();
				log.info("New Merchant Watchlist is added successfully");
							
			}
		
		catch(Exception e)
			{
			Assert.fail("could not create new Merchant Watchlist");	

			}
	}
	
	//Cancel KYC
	public void cancel_Account_Watchlistpage() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancelMerchant.click();
			}
		catch(Exception e)
			{
			Assert.fail("cancel button failed");	
			}
	}
}