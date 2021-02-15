package com.dataseers.qa.pages.compliance;
import java.util.List;
import java.time.LocalDate;
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
import org.testng.Assert;
import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class Add_Acc_holder_Watchlist extends TestBase 
{
WebDriverWait wait = new WebDriverWait(d, 10);
Actions actions= new Actions(d);
String Accountdata = GenerateData.generateRandomString(6).toLowerCase();
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
@FindBy(xpath="//*[@href=\"/account-holder-watchlist\"]")
WebElement Acc_holder_Watchlist;

//Click on add Acc holder watchlist
@CacheLookup
@FindBy(xpath = "//*[@title='Create new account holder']")
WebElement Add_Acc_holder_Watchlist;

//Account holder type
@CacheLookup
@FindBy(xpath = "//*[@id=\"add_account_holder_watchlist_accountholder_type\"]")
WebElement Acc_holder_type;

//Person
@CacheLookup
//@FindBy(xpath="//*[text()='Person']")
@FindBy(xpath = "(//*[@class='ant-select-dropdown-menu-item'])[1]")
WebElement Person;

//Business
@CacheLookup
@FindBy(xpath = "(//*[@class='ant-select-dropdown-menu-item'])[2]")
WebElement Business;

//Expire on
@CacheLookup
@FindBy(xpath = "//*[@placeholder='Select date' and @class='ant-calendar-picker-input ant-input']")
WebElement expiryDate;
	
//Person Id
@CacheLookup
@FindBy(xpath = "//*[@id=\"add_account_holder_watchlist_person_id\"]")
WebElement personId;

//First name
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_first_name\"]")
WebElement first_name;

//Last name
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_last_name\"]")
WebElement last_name;
	
//SSN
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_ssn\" and @type='password']")
WebElement SSN;

//Business Id
@CacheLookup
@FindBy(xpath = "//*[@id=\"add_account_holder_watchlist_person_id\"]")
WebElement BusinessId;

//business name
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_business_name\"]")
WebElement business_name;
		
//TIN
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_tin\"]")
WebElement TIN;
	
//Address 1
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_address_1\"]")
WebElement Address1;

//Address 2
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_address_2\"]")
WebElement Address2;

//City
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_city\"]")
WebElement City;

//State
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_state\"]")
WebElement State;

//Zip
@CacheLookup
@FindBy(xpath="//*[@id=\"add_account_holder_watchlist_zip\"]")
WebElement Zip;

// select program type
@CacheLookup
@FindBy(xpath = "//*[@type='radio']")
List<WebElement> ProgramType;

// core card
@CacheLookup
//@FindBy(xpath = "//*[@id='checkAll_8']")
@FindBy(xpath = "//div[@id='accordion__heading-raa-0']//label[1]")
WebElement coreCard;

// First Data
@CacheLookup
@FindBy(xpath = "//div[@id='accordion__heading-raa-1']//label[1]")
WebElement firstData;

// Fis South
@CacheLookup
@FindBy(xpath = "//div[@id='accordion__heading-raa-2']//label[1]")
WebElement fisSouth;
	
// marqeta
@CacheLookup
@FindBy(xpath = "//div[@id='accordion__heading-raa-3']//label[1]")
WebElement marqeta;

//Save button
@CacheLookup
@FindBy(xpath="//*[@type='submit']")
WebElement saveAcc_holder;

//cancel button
@CacheLookup    
@FindBy(xpath="//*[@type='button']")
WebElement cancelAcc_holder;


public Add_Acc_holder_Watchlist(WebDriver d) 
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
		
		log.info("click on account holder watchlist");
		wait.until(ExpectedConditions.visibilityOf(Acc_holder_Watchlist));
		Acc_holder_Watchlist.click();

		log.info("Clicked on account holder watchlist");
	}
		catch(Exception e)
	{
			Assert.fail("Not clicked on account holder watchlist");
	}
}

public void Add_Acc_holder_WatchlistPage(String AHtype, int progType)  
{
try
	{	
//		watchlistPage();
		
		log.info("click on Add Account holder watchlist");
		wait.until(ExpectedConditions.visibilityOf(Add_Acc_holder_Watchlist));
		Add_Acc_holder_Watchlist.click();
		
		log.info("Enter Account holder type");
		wait.until(ExpectedConditions.visibilityOf(Acc_holder_type));
		Acc_holder_type.click();
		
		if(AHtype == "Person")
			{
			
				Person.click();
			
				log.info("Selecting current date as Expiry date");
				wait.until(ExpectedConditions.visibilityOf(expiryDate));
				expiryDate.click();
				actions.sendKeys(expiryDate, LocalDate.now().toString(), Keys.ENTER).perform();
				
				log.info("Enter person ID");
				wait.until(ExpectedConditions.visibilityOf(personId));
				personId.sendKeys(GenerateData.generateRandomNumber(3));
	
				log.info("Enter First Name");
				wait.until(ExpectedConditions.visibilityOf(first_name));
				first_name.sendKeys(GenerateData.generateRandomString(7));
				
				log.info("Enter Last Name");
				wait.until(ExpectedConditions.visibilityOf(last_name));
				last_name.sendKeys(GenerateData.generateRandomString(5));
					
				log.info("Enter SSN");
				wait.until(ExpectedConditions.visibilityOf(SSN));
				SSN.sendKeys(GenerateData.generateRandomNumber(9));
			}
	
		else 
			{
				Business.click();	
				
				log.info("Selecting current date as Expiry date");
				wait.until(ExpectedConditions.visibilityOf(expiryDate));
				expiryDate.click();
				actions.sendKeys(expiryDate, LocalDate.now().toString(), Keys.ENTER).perform();
				
				log.info("Enter Business ID");
				wait.until(ExpectedConditions.visibilityOf(BusinessId));
				BusinessId.sendKeys(GenerateData.generateRandomNumber(3));
		
				log.info("Enter Business Name");
				wait.until(ExpectedConditions.visibilityOf(business_name));
				business_name.sendKeys(Accountdata);
				
				log.info("Enter TIN");
				wait.until(ExpectedConditions.visibilityOf(TIN));
				TIN.sendKeys(GenerateData.generateRandomNumber(9));
			}
		
			log.info("Enter Address1");
			wait.until(ExpectedConditions.visibilityOf(Address1));
			Address1.sendKeys(Accountdata);
			
			log.info("Enter Address2");
			wait.until(ExpectedConditions.visibilityOf(Address2));
			Address2.sendKeys(Accountdata);
			
			log.info("Enter City");
			wait.until(ExpectedConditions.visibilityOf(City));
			City.sendKeys("Thane");
			
			log.info("Enter State");
			wait.until(ExpectedConditions.visibilityOf(State));
			State.sendKeys("MH");
			
			log.info("Enter ZIP");
			wait.until(ExpectedConditions.visibilityOf(Zip));
			Zip.sendKeys(GenerateData.generateRandomNumber(6));
	
			ProgramType.get(progType).click();		
			coreCard.click();
			firstData.click();
			fisSouth.click();
			marqeta.click();
	}
	catch(Exception e)
	{
		Assert.fail("Cant Add Acc_Watchlist");
	}
	
}
//Save Account watchlist
public void save_Account_Watchlistpage() 
{
	try
		{
			log.info("Clicking on save button");
			saveAcc_holder.click();
			log.info("New Account Watchlist is added successfully");
						
		}
	
	catch(Exception e)
		{
		Assert.fail("could not create new Account Watchlist");	

		}
}

//Cancel account holder watchlist
public void cancel_Account_Watchlistpage() 
{
	try
		{
			log.info("Clicking on cancel button");
			cancelAcc_holder.click();
		}
	catch(Exception e)
		{
		Assert.fail("cancel button failed");	
		}
}

}



