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
import org.testng.Assert;
import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;

public class MerchantMaster extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String Merchantdata = GenerateData.generateRandomString(7).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	WebDriver driver;

	//Rules and MDM
	@CacheLookup    
	@FindBy(xpath = "//*[text()='Rules & MDM']")
	WebElement RulesAndMDM; 

	//Merchant Master
	@CacheLookup    
	@FindBy(xpath="//*[@href='/merchant-master\']")
	WebElement Merchant_Master; 

	//Add Merchant
	@CacheLookup
	@FindBy(xpath= "//*[@title=\"Create new merchant\" and @type=\"button\" and @class='ant-btn m-r-10 ant-btn-primary ant-btn-circle']")
	WebElement Add_Merchant;

	//Add Merchant id
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_merchant_id\"]")
	WebElement merchant_id;

	//Add Merchant Name
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_name\"]")
	WebElement Merchant_name;
		
	//Add Merchant url
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_url\"]")
	WebElement merchant_url;

	//Add merchant DS MID
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"manage_merchant_DS_MID\"]")
	WebElement DS_MID;

	//Select MCC
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-select-search__field__placeholder' and @style=\"display: block;\"])") 
	WebElement MCC;
		
	//Select MCC from the list
	@CacheLookup
	@FindBy(xpath="(//*[ @title=\"Agricultural Services\" and @class='ant-select-tree-node-content-wrapper ant-select-tree-node-content-wrapper-close'])")
	WebElement MCC_list;
		
	//Add Location
	@CacheLookup
	@FindBy(xpath="(//*[ @data-icon=\"plus-circle\"])")
	WebElement Add_Loc;
		
	//Add merchant DS LID
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"manage_merchant_locations[0].DS_LID\"]")
	WebElement DS_LID;
		
	//Add Location id
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].location_id\"]")
	WebElement location_id;
		
	//Add Location Name
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].location_name\"]")
	WebElement Loc_name;
		
	//Add Address 1
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].address_1\"]")
	WebElement Address_1;
		
	//Add Address 2
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].address_2\"]")
	WebElement Address_2;
		
	//Add City
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].city\"]")
	WebElement city;
		
	//Add State
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].state\"]")
	WebElement state;
		
	//Add country
	@CacheLookup
	@FindBy(xpath="(//*[@id=\"manage_merchant_locations[0].country\"])")
	WebElement country;
		
	//Select country
	@CacheLookup
	@FindBy(xpath = "//*[text()='India']")
	WebElement sel_country;
		
	//Add Zip
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].zip\"]")
	WebElement zip;
		
	//Add phone number
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].phone_number\"]")
	WebElement phone_number;
			
	//Add url
	@CacheLookup
	@FindBy(xpath="//*[@id=\"manage_merchant_locations[0].url\"]")
	WebElement url;
		
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='button' and @class='ant-btn m-r-10 m-t-10 ant-btn-primary']")
	WebElement saveLoc;
			
	//Add Synonym
	@CacheLookup
	@FindBy(xpath="(//*[ @id=\"manage_merchant_synonyms[0].synonyms\"])")
	WebElement Add_Synonym;
		
	//Click on Add synonym
	@CacheLookup
	@FindBy(xpath="(//*[@type='button' and @class='ant-btn ant-btn-dashed'])")
	WebElement Add_Synonym2;
		
	//Add Synonym
	@CacheLookup
	@FindBy(xpath="(//*[ @id=\"manage_merchant_synonyms[1].synonyms\"])")
	WebElement Synonym2;
		
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveMerchant;

	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancel_Merchant;

//	Search merchant
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-column-sort'])")
	WebElement clickMerchant;
		
	//Edit button
	@CacheLookup
//	@FindBy(xpath="//*[@type='submit']")
	@FindBy(xpath = "//button[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']")
	WebElement EditMerchant;
		
	// Search Filter
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchFilter;

	// added new merchant
	@CacheLookup
	@FindBy(xpath="//*[contains(@href,'view-merchant')]")
	WebElement addedMerchant;
		
	//Delete toggle button
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-switch-inner'])[1]")
	WebElement Deletetoggle;
	
public MerchantMaster(WebDriver d) 
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

public void MerchantMasterPage()
{
	try
		{
			RulesAndMDMPage();
			log.info("Click on Merchant Master");
			wait.until(ExpectedConditions.visibilityOf(Merchant_Master));
			Merchant_Master.click();
	
			log.info("Directed to Merchant master page");
		}
			catch(Exception e)
		{
			log.error("Not directed to Merchant master page");
		}
}

public void AddMerchantPage()  
{
	try
		{	
			MerchantMasterPage();
			
			log.info("click on Add Merchant");
			wait.until(ExpectedConditions.visibilityOf(Add_Merchant));
			Add_Merchant.click();
			
			log.info("Enter Merchant id");
			wait.until(ExpectedConditions.visibilityOf(merchant_id));
			merchant_id.sendKeys(GenerateData.generateRandomAlphaNumeric(5));
			
			log.info("Enter Merchant name");
			wait.until(ExpectedConditions.visibilityOf(Merchant_name));
			Merchant_name.sendKeys(Merchantdata);
			
			log.info("Enter Merchant url");
			wait.until(ExpectedConditions.visibilityOf(merchant_url));
			merchant_url.sendKeys("https://dev.dataseers.in");
			
			log.info("Enter DS MID");
			wait.until(ExpectedConditions.visibilityOf(DS_MID));
			DS_MID.sendKeys(Merchantdata);
			
			log.info("Enter MCC");
			wait.until(ExpectedConditions.visibilityOf(MCC));
			MCC.click();
			MCC_list.click();
			log.info("Enter list");
			wait.until(ExpectedConditions.visibilityOf(MCC_list));
			
			log.info("click on Add synonym");
			Add_Synonym2.click();
			Add_Synonym.sendKeys(GenerateData.generateRandomAlphaNumeric(5));
			wait.until(ExpectedConditions.visibilityOf(Synonym2));
			Synonym2.sendKeys(GenerateData.generateRandomAlphaNumeric(8));
		}
		catch(Exception e)
		{
			log.error("Cant add merchant");
		}
}

public void EditPage()
{
	try
	{
	wait.until(ExpectedConditions.visibilityOf(searchFilter));
	searchFilter.click();

	WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
	wait.until(ExpectedConditions.visibilityOf(searchbox));
	actions.sendKeys(searchbox, Merchantdata).perform();

	WebElement searchBtn = d
			.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
	wait.until(ExpectedConditions.visibilityOf(searchBtn));
	searchBtn.click();
	Thread.sleep(1000);
	addedMerchant.click();
	EditMerchant.click();
	}
	catch(Exception e)
	{
		Assert.fail("could not edit");
	}
}

public void LocationPage() 
{
	try
	{
		EditPage();
		log.info("Click on the Location");
		Add_Loc.click();
		
		log.info("Enter DS LID");
		wait.until(ExpectedConditions.visibilityOf(DS_LID));
		DS_LID.sendKeys(Merchantdata);
		location_id.sendKeys(Merchantdata);
		Loc_name.sendKeys(Merchantdata);
		Address_1.sendKeys("Address 1");;
		Address_2.sendKeys("Address 2");
		city.sendKeys("city");
		state.sendKeys("state");
		country.click();
		wait.until(ExpectedConditions.visibilityOf(sel_country));
		sel_country.click();
		zip.sendKeys("400610");
		phone_number.sendKeys("9898989898");
		url.sendKeys("http://dataseers.in");
		saveLoc.click();
		Thread.sleep(2000);
		WebElement saveMerchant2 = d.findElement(By.xpath("//button[@type='submit']"));
		
		saveMerchant2.click();
	}
	
	catch(Exception e)
	{
		log.error("Cant add merchant location");
	}
}

	//Save merchant
	public void saveMerchantPage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveMerchant.click();
				log.info("New Merchant is added successfully");
				
				wait.until(ExpectedConditions.urlToBe("https://dev.dataseers.in:3000/merchant-master"));
				d.findElement(By.xpath("//*[@title='Reset filter']")).click();
		
			}
		
		catch(Exception e)
			{
				log.error("could not Add Merchant");	

			}
	}
	
	//Cancel  Merchant
	public void cancelMerchant() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancel_Merchant.click();
			}
		catch(Exception e)
			{
				log.error("cancel button failed");	
			}
	}
	
	//Search Filter
		public void searchFilterPage()
		{
			try
			{
			wait.until(ExpectedConditions.visibilityOf(searchFilter));
			searchFilter.click();

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.visibilityOf(searchbox));
			actions.sendKeys(searchbox, Merchantdata).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			searchBtn.click();

			String newprogram = addedMerchant.getText();

			if (newprogram.contentEquals(Merchantdata)) {

				log.info("Newly added program is displayed in a program list: " + newprogram);
			}

			else {
				log.info("Newly added program is not displayed in a program list: " + newprogram);
				log.error("Save new program scenario failed");
			}
			Deletetoggle.click();
			}
			catch(Exception e)
			{
				log.error("cancel button failed");	
			}
						
		}
}
