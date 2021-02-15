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

import java.io.File;
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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class SeerScan extends TestBase 
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
	
	//seerScan
	@CacheLookup
	@FindBy(xpath="//*[@href='/seer-scan\']")
	WebElement seerScan;
	
	//Add SeerScan
	@CacheLookup
	@FindBy(xpath = "//*[@title=\"Add True ID\"]")
	WebElement AddSeerScan;
		
	//Select Flow ID
	@CacheLookup
	@FindBy(xpath = "//div[normalize-space()='Select flow']")
	WebElement FlowID;
		
	//Flow ID drop down
	@CacheLookup
	@FindBy(xpath = "//li[normalize-space()='00002b - Dataseers - SeerScan']")
	WebElement FlowID_Sel;
	
	//select Program Name
	@CacheLookup
	@FindBy(xpath = "//*[text()='Select program']")
	WebElement selectProgramName;
	
	// Program Name drop down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-dropdown-menu-item']")
	WebElement ProgramName;
	
	//select Product desc
	@CacheLookup
	@FindBy(xpath = "//*[text()='Select product']")
	WebElement selectProductDesc;
		
	// Program Name drop down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-dropdown-menu-item' and aria-selected=\"false\"]")
	WebElement ProductDesc;
		
	//select Group desc
	@CacheLookup
	@FindBy(xpath = "//*[text()='Select group']")
	WebElement selectGroupDesc;
		
	// Program Name drop down
	@CacheLookup
//	@FindBy(xpath = "//*[@class='ant-select-dropdown-menu-item']")
	@FindBy(xpath = "//*[text()='GROUP ICM2']")
	WebElement GroupDesc;
	
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
	@FindBy(xpath = "//*[text()='Select country']")
	WebElement country;
	
	//Country_dropdown
	@CacheLookup
	@FindBy(xpath = "//*[text()='IND']")
	WebElement country_list;

	//Upload front image
	@CacheLookup
	@FindBy(xpath="//*[@type=\"file\"]")
//	@FindBy(xpath = "//p[normalize-space()='Click or drag front image (Max allowed size 5 MB)']")
	WebElement FrontImage;
	
	//Upload back image
	@CacheLookup
	@FindBy(xpath = "//p[normalize-space()='Click or drag back image (Max allowed size 5 MB)']")
//	@FindBy(xpath="//*[@type=\"file\"]")
	WebElement backImage;
//	
	//Upload selfie
	@CacheLookup
	@FindBy(xpath="//div[3]//div[1]//div[1]//span[1]//div[1]//span[1]//input[1]"
			+ ""
			+ "")
	WebElement Selfie;
		
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveseerScan;
	
	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancelseerScan;

public SeerScan(WebDriver d) 
{
	PageFactory.initElements(d, this);
}

//Compliance page
public void ComplianSeerPage()
{
	try
		{
			log.info("Clicking on Compliance");
			wait.until(ExpectedConditions.visibilityOf(ComplianSeer));
			ComplianSeer.click();

			log.info("User clicked on to compliance successfully!!!!");
		}
	catch(Exception e)
		{
			log.error("compliance module not found");
		}
}

public void onBoardingPage()
{
	try
		{
			ComplianSeerPage();
			log.info("Click on onBoarding");
			OnBoarding.click();
			wait.until(ExpectedConditions.visibilityOf(KYC));
			KYC.click();
			log.info("click on KYC Validator");
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOf(seerScan));
			seerScan.click();
			log.info("Clicked on ComplianSeer");
		}
			catch(Exception e)
		{
			Assert.fail("Not clicked on ComplianSeer");
		}
}

public void AddSeerScanPage()  
{
	try
		{	
//			onBoardingPage();
			
			log.info("click on Add SeerScan");
			AddSeerScan.click();
//			wait.until(ExpectedConditions.visibilityOf(selectProgramName));
//			selectProgramName.click();
//			ProgramName.click();
//			
//			wait.until(ExpectedConditions.visibilityOf(selectProductDesc));
//			selectProductDesc.click();
//			ProductDesc.click();
//			
//			wait.until(ExpectedConditions.visibilityOf(selectGroupDesc));
//			selectGroupDesc.click();
//			GroupDesc.click();
//			
			FlowID.click();
			FlowID_Sel.click();
			
			log.info("Enter first name");
			wait.until(ExpectedConditions.visibilityOf(first_name));
			first_name.sendKeys("CHRISTOPHER");
					
			log.info("Enter last name");
			wait.until(ExpectedConditions.visibilityOf(last_name));
			last_name.sendKeys("LESTER");
			
			log.info("Enter Email");
			wait.until(ExpectedConditions.visibilityOf(email));
			email.sendKeys("apurohit@dataseers.in");
			
			log.info("Enter Phone number");
			wait.until(ExpectedConditions.visibilityOf(Phone_number));
//			Phone_number.sendKeys(GenerateData.generateRandomNumber(10));
			Phone_number.sendKeys("1085551212");
			
			
			log.info("Enter Date of birth");
			wait.until(ExpectedConditions.visibilityOf(DOB));
			actions.sendKeys(DOB, LocalDate.now().toString(), Keys.ENTER).perform();
		
			log.info("Enter SSN number");
			wait.until(ExpectedConditions.visibilityOf(SSN_no));
			SSN_no.click();
			SSN_no.sendKeys("666296371");
			log.info("SSN number is: " + SSN_no.getText());
			
			log.info("Enter street address");
			wait.until(ExpectedConditions.visibilityOf(street1));
			street1.sendKeys("LUNSFORD");
			
			log.info("Enter city");
			wait.until(ExpectedConditions.visibilityOf(city));
			city.sendKeys("MORNING VIEW");
			
			log.info("Enter state");
			wait.until(ExpectedConditions.visibilityOf(state));
			state.sendKeys("KY");
			
			log.info("Enter zip");
			wait.until(ExpectedConditions.visibilityOf(zip));
			zip.sendKeys("36869");

			log.info("Select country");
			country.click();
			wait.until(ExpectedConditions.visibilityOf(country_list));
			country_list.click();
			log.info("Selected Country is: " + country.getText());
				
			log.info("Upload front image");
			FrontImage.sendKeys("C://Users/INTEL/Desktop/Dataseers/frontimage.jpg");
		
//			log.info("Upload back image");
//			backImage.sendKeys("C://Users/ArpithaPurohit/Desktop/backimage.jpg");
			
			log.info("Upload selfie");
			Selfie.sendKeys("C://Users/INTEL/Desktop/Dataseers/selfie.png");

		}
	
		catch(Exception e)
		{
			Assert.fail("Cant Add SeerScan");
		}
		
}

	//Save seerscan
	public void saveSeerScanpage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveseerScan.click();
				log.info("New SeerScan is added successfully");
							
			}
		
		catch(Exception e)
			{
			Assert.fail("could not create new seerscan");	

			}
	}
	
	//Cancel KYC
	public void cancelSeerScanpage() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancelseerScan.click();
			}
		catch(Exception e)
			{
			Assert.fail("cancel button failed");	
			}
	}
	
	
public void SeerScanTable(){
		
		int rowCount = d.findElements(By.xpath("//div[@class='ant-table-body']//table//tr")).size()-1;
		System.out.println("*******************Row count is : "+rowCount+ "****************");		
		
		//tbody/tr[1]/td[2]
		//tbody/tr[2]/td[2]
		//tbody/tr[3]/td[2]
		
		String beforeXpath = "//tbody/tr[";
		String afterXpath = "]/td[7]";
		
		for(int rowNum=1; rowNum < rowCount+1; rowNum++){
			String actualXpath = beforeXpath+rowNum+afterXpath;
//			System.out.println(actualXpath);
			String value = d.findElement(By.xpath(actualXpath)).getText();
			System.out.println("***********SeerScan Status for row "+rowNum+" is: "+value+" ***********");
		}
	

	}

public void getSeerScanstatus(){
		
		By mode = By.xpath("//tbody/tr[1]/td[2]");
		String Mode = d.findElement(mode).getText();
		System.out.println("**************Mode is: "+Mode+" ******************");
		
//		String RequestStatus = d.findElement(By.xpath("//tbody/tr[1]/td[7]")).getText();
//		System.out.println("*************Request Status is: "+RequestStatus+" **************");
		
		String SeerScanstatus = d.findElement(By.xpath("//tbody/tr[1]/td[8]")).getText();
		System.out.println("*************SeerScan status is: "+SeerScanstatus+" ****************");
	}	


public void NextKYCstepPage()  
{
	try
		{	

		By FirstName = By.xpath("//tbody/tr[1]/td[4]/a[1]");
		d.findElement(FirstName).click();
		
		By Alertmsg = By.xpath("//span[@class='ant-alert-message']");
		String NextStep = d.findElement(Alertmsg).getText();
		System.out.println("**************Status is: "+NextStep+"**************");
		
		By Alertdescription = By.xpath("//span[@class='ant-alert-description']");
		String statusdesc = d.findElement(Alertdescription).getText();
		System.out.println("************Status description is: "+statusdesc+"****************");
		
		//Click on goto page
		By gotoPage = By.xpath("//a[normalize-space()='Go to SeerScan page']");
		d.findElement(gotoPage).getText();
		System.out.println(gotoPage);
		d.findElement(gotoPage).click();
		}
	
		catch(Exception e)
		{
			Assert.fail("Cant click on go to page");
		}
		
}
	

}

