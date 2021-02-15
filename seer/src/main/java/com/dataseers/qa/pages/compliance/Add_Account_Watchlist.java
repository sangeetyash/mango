package com.dataseers.qa.pages.compliance;
import java.time.LocalDate;
import java.util.List;
import org.openqa.selenium.By;
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

public class Add_Account_Watchlist extends TestBase 
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
	
	//click on Account watchlist
	@CacheLookup
	@FindBy(xpath="//*[@href='/account-watchlist']")
	WebElement Acc_Watchlist;
	
	//Click on add Account watchlist
	@CacheLookup
	@FindBy(xpath = "//*[@title='Create new account']")
	WebElement Add_Acc_Watchlist;
	
	//Account number
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"add_account_watchlist_account_number\"]")
	WebElement Acc_No;
	
	//card number
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"add_account_watchlist_card_number\"]")
	WebElement card_No;

	//Expire on
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Select date' and @class='ant-calendar-picker-input ant-input']")
	WebElement expiryDate;
	
	// select program type
	@CacheLookup
	@FindBy(xpath = "//*[@type='radio']")
	List<WebElement> ProgramType;
		
	// core card(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//div[@id='accordion__heading-raa-0']//label[1]")
	WebElement coreCard;
		
	// First Data(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//div[@id='accordion__heading-raa-1']//label[1]")
	WebElement firstData;

	// Fis South(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//div[@id='accordion__heading-raa-2']//label[1]")
	WebElement fisSouth;
			
	// marqeta(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//div[@id='accordion__heading-raa-3']//label[1]")
	WebElement marqeta;
		
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveAccount;
	
	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancelAccount;
	
	// sort drop-down of page
	@CacheLookup
	@FindBy(xpath = "(//*[@class='anticon anticon-caret-down ant-table-column-sorter-down off'])[2]")
	WebElement sortdown;
		
	// added new account name
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters'])[2]")
	WebElement addedaccount;

public Add_Account_Watchlist(WebDriver d) 
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

public void watchlistPage()
{
	try
		{
			compliancePage();
			log.info("Click on watchlist");
			wait.until(ExpectedConditions.visibilityOf(watchlist));
			watchlist.click();
			log.info("click on account watchlist");
			wait.until(ExpectedConditions.visibilityOf(Acc_Watchlist));
			Acc_Watchlist.click();
	
			log.info("Clicked on account watchlist");
		}
			catch(Exception e)
		{
			log.error("Not clicked on account watchlist");
		}
}

public void Add_Account_WatchlistPage(int progType)  
{
	try
		{		
			log.info("click on Add Account watchlist");
			wait.until(ExpectedConditions.visibilityOf(Add_Acc_Watchlist));
			Add_Acc_Watchlist.click();
			
			log.info("Enter Account number");
			wait.until(ExpectedConditions.visibilityOf(Acc_No));
			Acc_No.sendKeys(GenerateData.generateRandomNumber(9));
			
			log.info("Enter card number");
			wait.until(ExpectedConditions.visibilityOf(card_No));
			card_No.sendKeys(GenerateData.generateRandomNumber(9));
					
			log.info("Selecting current date as Expiry date");
			wait.until(ExpectedConditions.visibilityOf(expiryDate));
			expiryDate.click();
			actions.sendKeys(expiryDate, LocalDate.now().toString(), Keys.ENTER).perform();
			log.info("select All programs");
			ProgramType.get(progType).click();	
			coreCard.click();
			firstData.click();
			fisSouth.click();
			marqeta.click();
			
		}
	
		catch(Exception e)
		{
			log.error("Cant Add Acc_Watchlist");
		}
		
}

	//Save Account
	public void save_Account_Watchlistpage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveAccount.click();
				log.info("New Account Watchlist is added successfully");
							
			}
		
		catch(Exception e)
			{
				Assert.fail("could not create new Account Watchlist");	

			}
	}
	
	//Cancel Account
	public void cancel_Account_Watchlistpage() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancelAccount.click();
			}
		catch(Exception e)
			{
			Assert.fail("cancel button failed");	
			}
	}
	
	public void editAccount() {
		
		try {
			log.info("Editing already existing recent API key details");
			wait.until(ExpectedConditions.elementToBeClickable(sortdown));
			actions.moveToElement(sortdown).doubleClick().build().perform();

			wait.until(ExpectedConditions.visibilityOf(addedaccount));
			String data = addedaccount.getText();
			d.findElement(By.linkText(data)).click();

			log.info("Clicking on edit button");
			WebElement editBtn = d.findElement(By.xpath("//*[@class='ant-btn m-r-10 ant-btn-primary']"));
			wait.until(ExpectedConditions.visibilityOf(editBtn));

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}


}

