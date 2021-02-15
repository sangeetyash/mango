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
import org.testng.Assert;

import java.sql.Date;
import java.time.LocalDate;

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

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class KYCseerID_MultiStage extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String KYCdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	WebDriver driver; 
	//Select reportDropdown = new select(driver.findElement(By.className(ant-select-dropdown-menu-item)))
	 
	//Compliance
	@CacheLookup    
	@FindBy(xpath = "//*[text()='ComplianSeer']")
	WebElement ComplianSeer;
	
	//On Boarding
	@CacheLookup
	@FindBy(xpath="//*[text()='OnBoarding']")
	WebElement OnBoarding;
	
	//
	@CacheLookup    
	@FindBy(xpath = "//*[text()='KYC']")
	WebElement KYC;
	
	//seerID
	@CacheLookup
	@FindBy(xpath="//*[@href='/seer-id\']")
	WebElement seerID;
	
	//Add kyc
	@CacheLookup
	@FindBy(xpath = "//*[@title=\"Add new kyc\"]")
	WebElement AddseerID;
		
	//Select Flow ID
	@CacheLookup
	@FindBy(xpath = "//div[normalize-space()='Select flow']")
	WebElement FlowID;
	
	//Multi-stage flow id
	@CacheLookup
	@FindBy(xpath="//li[normalize-space()='000029 - JC']")
	WebElement multistage_flow;
	
	//First name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	WebElement first_name;
	
	//Middle name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"middle_name\"]")
	WebElement middle_name;
	
	//last name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	WebElement last_name;
	
	//email
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement email;
	
	//Phone Number
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"contact_number\"]")
	WebElement Phone_number;
	
	//Select date
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Select date' and @class='ant-calendar-picker-input ant-input']")
	WebElement DOB;
		
	//SSN Number 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"ssn\"]")
	WebElement SSN_no;
	
	//street1 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"address_1\"]")
	WebElement street1;
	
	//street2 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"address_2\"]")
	WebElement street2;
	
	//city 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"city\"]")
	WebElement city;
	
	//state
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"state\"]")
	WebElement state;
	
	//zip
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"zip\"]")
	WebElement zip;
	
	//Country
	@CacheLookup
//	@FindBy(xpath="//*[@class=\"ant-select-selection__placeholder\"]")
	@FindBy(xpath = "//*[text()='Select country']")
	WebElement country;
	
	//Country_dropdown
	@CacheLookup
	@FindBy(xpath = "//*[text()='IND']")
	WebElement country_list;

	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveKYC;
	
	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancelKYC;

public KYCseerID_MultiStage(WebDriver d) 
{
	PageFactory.initElements(d, this);
}

public void NextKYCstepPage()  
{
	try
		{	

		By FirstName = By.xpath("//tbody/tr[1]/td[3]/a[1]");
		d.findElement(FirstName).click();
		
		By Alertmsg = By.xpath("//span[@class='ant-alert-message']");
		String NextStep = d.findElement(Alertmsg).getText();
		System.out.println("**************Status is: "+NextStep+"**************");
		
		By Alertdescription = By.xpath("//span[@class='ant-alert-description']");
		String statusdesc = d.findElement(Alertdescription).getText();
		System.out.println("****************Status is: "+statusdesc+"**************");
		
		//Click on goto page
		By gotoPage = By.xpath("//a[normalize-space()='Go to SeerIQ page']");
		d.findElement(gotoPage).getText();
		System.out.println("**************"+gotoPage+"**************");
		d.findElement(gotoPage).click();
		}
	
		catch(Exception e)
		{
			Assert.fail("Cant Add SeerID");
		}
		
}

public void userdetailsPage()
{
	try
		{
		log.info("Enter first name");
		wait.until(ExpectedConditions.visibilityOf(first_name));
		first_name.sendKeys("ANA");
			
		log.info("Enter last name");
		wait.until(ExpectedConditions.visibilityOf(last_name));
		last_name.sendKeys("SACHER");
		
		log.info("Enter Email");
		wait.until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("apurohit@dataseers.in");
		
		log.info("Enter Phone number");
		wait.until(ExpectedConditions.visibilityOf(Phone_number));
		Phone_number.sendKeys("1085551212");
		
		
		log.info("Enter Date of birth");
		wait.until(ExpectedConditions.visibilityOf(DOB));
		actions.sendKeys(DOB, LocalDate.now().minusYears(33).minusMonths(8).minusDays(2).toString(), Keys.ENTER).perform();	
		
		log.info("Enter SSN number");
		wait.until(ExpectedConditions.visibilityOf(SSN_no));
		SSN_no.click();;
		SSN_no.sendKeys("666645787");
		log.info("SSN number is: " + SSN_no.getText());
		
		log.info("Enter street address");
		wait.until(ExpectedConditions.visibilityOf(street1));
		street1.sendKeys("3870 BUTLER SPRINGS DR");
		
		log.info("Enter city");
		wait.until(ExpectedConditions.visibilityOf(city));
		city.sendKeys("LOGANVILLE");
		
		log.info("Enter state");
		wait.until(ExpectedConditions.visibilityOf(state));
		state.sendKeys("GA");
		
		log.info("Enter zip");
		wait.until(ExpectedConditions.visibilityOf(zip));
		zip.sendKeys("35811");

		log.info("Select country");
		country.click();
		wait.until(ExpectedConditions.visibilityOf(country_list));
		country_list.click();
		log.info("Selected Country is: " + country_list.getText());
		}
			catch(Exception e)
		{
			Assert.fail("User details not filled");
		}
}
public void AddSeerIDPage()  
{
	try
		{	
//			onBoardingPage();
			
				log.info("click on Add seerID");
				AddseerID.click();
				FlowID.click();
				multistage_flow.click();
				userdetailsPage();
				saveSeerIDpage();
				getSeerIDstatus();
				Thread.sleep(8000);
				SeerIDTable();
				Thread.sleep(2000);
				NextKYCstepPage();
				Thread.sleep(2000);
				SeerIQpage();
				Thread.sleep(2000);				
		}
	
		catch(Exception e)
		{
			Assert.fail("Cant Add SeerID");
		}
		
}

public void SeerIDTable(){
	
	int rowCount = d.findElements(By.xpath("//div[@class='ant-table-body']//table//tr")).size()-1;
	System.out.println("**************"+rowCount+"**************");		
	
	//tbody/tr[1]/td[2]
	//tbody/tr[2]/td[2]
	//tbody/tr[3]/td[2]
	
	String beforeXpath = "//tbody/tr[";
	String afterXpath = "]/td[2]";
	
	for(int rowNum=1; rowNum < rowCount+1; rowNum++){
		String actualXpath = beforeXpath+rowNum+afterXpath;
//		System.out.println(actualXpath);
		String value = d.findElement(By.xpath(actualXpath)).getText();
		System.out.println("**************SeerID Status is for row "+rowNum+" is: "+value+"**************");
	}
}
	//Save SeerIQ
	public void saveSeerIDpage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveKYC.click();
				log.info("New SeerID is added successfully");
				Thread.sleep(2000);
				SeerIDTable();
				getSeerIDstatus();
			}
		
		catch(Exception e)
			{
			Assert.fail("could not create new SeerIQ");	

			}
	}
	
	public void getSeerIDstatus(){
		
		By mode = By.xpath("//tbody/tr[1]/td[2]");
		String Mode = d.findElement(mode).getText();
		System.out.println("**************Mode is: "+Mode+"**************");
		
		String RequestStatus = d.findElement(By.xpath("//tbody/tr[1]/td[7]")).getText();
		System.out.println("**************Request Status is: "+RequestStatus+"**************");
		
		String SeerIDstatus = d.findElement(By.xpath("//tbody/tr[1]/td[8]")).getText();
		System.out.println("****************SeerID status is: "+SeerIDstatus+"**************");
	}
	
	//Cancel KYC
	public void cancelSeerIDpage() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancelKYC.click();
			}
		catch(Exception e)
			{
			Assert.fail("cancel button failed");	
			}
	}
	
	//SeerIQpage click on save button on next kyc step
		public void SeerIQpage() 
		{
			try
				{
					log.info("Clicking on Save button");
					By saveSeerIQ = By.xpath("//*[@type='submit']");
					d.findElement(saveSeerIQ).click();
					Thread.sleep(2000);
					actions.sendKeys(Keys.PAGE_DOWN).build().perform();
					Thread.sleep(2000);
					actions.sendKeys(Keys.PAGE_DOWN).build().perform();
					Thread.sleep(2000);
				}	
			catch(Exception e)
				{
				Assert.fail("Next KYC step failed");	
				}
		}
	

		//SeerScan page click on save button on next kyc step
				public void SeerScanpage() 
				{
					try
						{
						
					
						By FrontImage = By.xpath("//*[@type=\"file\"]");
						d.findElement(FrontImage).sendKeys("C://Users/INTEL/Desktop/Dataseers/frontimage.jpg");
			
						//Upload selfie
						By selfie = By.xpath("//div[3]//div[1]//div[1]//span[1]//div[1]//span[1]//input[1]"
								+ ""
								+ "");
								d.findElement(selfie).sendKeys("C://Users/INTEL/Desktop/Dataseers/selfie.png");
						
						
							log.info("Clicking on Save button");
							By saveSeerScan = By.xpath("//*[@type='submit']");
							d.findElement(saveSeerScan).click();
							Thread.sleep(2000);
						}	
					catch(Exception e)
						{
						Assert.fail("Next KYC step failed");	
						}
				}
}

