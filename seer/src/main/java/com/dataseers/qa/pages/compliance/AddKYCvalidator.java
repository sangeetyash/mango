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

public class AddKYCvalidator extends TestBase 
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
	WebElement AddKYC;
		
		
	//select Program Name
	@CacheLookup
	@FindBy(xpath = "//*[text()='Select program name']")
	WebElement selectProgramName;
	
	// Program Name drop down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-dropdown-menu-item']")
	WebElement ProgramName;
	
	//select Product desc
	@CacheLookup
	@FindBy(xpath = "//*[text()='Select product description']")
	WebElement selectProductDesc;
		
	// Program Name drop down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-dropdown-menu-item' and aria-selected=\"false\"]")
	WebElement ProductDesc;
		
	//select Group desc
	@CacheLookup
	@FindBy(xpath = "//*[text()='Select group description']")
	WebElement selectGroupDesc;
		
	// Program Name drop down
	@CacheLookup
//	@FindBy(xpath = "//*[@class='ant-select-dropdown-menu-item']")
	@FindBy(xpath = "//*[text()='GROUP ICM2']")
	WebElement GroupDesc;
	
	//First name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_first_name\"]")
	WebElement first_name;
	
	//Middle name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_middle_name\"]")
	WebElement middle_name;
	
	//last name
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_last_name\"]")
	WebElement last_name;
	
	//email
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_email\"]")
	WebElement email;
	
	//Phone Number
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_contact_number\"]")
	WebElement Phone_number;
	
	//Select date
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Select date' and @class='ant-calendar-picker-input ant-input']")
	WebElement DOB;
		
//	//Select DOB from calendar
//	@CacheLookup
//	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div[1]/div/span/a[1]")
////	@FindBy(xpath = "//*[@title='Choose a year']")
////	@FindBy(xpath = "(//*[ @class='ant-calendar-body'])")
//	WebElement Date_list;
//	
//	//Select month
//	@CacheLookup
//	@FindBy(xpath = "//*[text()='Jul']")
//	WebElement sel_month;
//
//	//Select year
//	@CacheLookup
//	@FindBy(xpath = "//*[text()='2020']")
//	WebElement sel_year;
//		
//	//Select year from option
//	@CacheLookup
//	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/div[1]/a[1]")
////	@FindBy(xpath = "//*[@title='Last decade']")
////	@FindBy(xpath = "(//*[ @class='ant-calendar-year-select'])")
//	WebElement Year;
//			
//	//Year selected is
//	@CacheLookup
//	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div[1]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]/a")
////	@FindBy(xpath = "//*[text()='1989']")
//	WebElement DOByear;
//		
//	//Select date
//	@CacheLookup
//	@FindBy(xpath = "//*[text()='21']")
//	WebElement sel_date;
		
	//SSN Number 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_ssn\"]")
	WebElement SSN_no;
	
	//street1 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_address_1\"]")
	WebElement street1;
	
	//street2 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_address_2\"]")
	WebElement street2;
	
	//city 
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_city\"]")
	WebElement city;
	
	//state
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_state\"]")
	WebElement state;
	
	//zip
	@CacheLookup
	@FindBy(xpath = "//*[@id=\"KycAdd_list_zip\"]")
	WebElement zip;
	
	//Country
	@CacheLookup
	@FindBy(xpath="//*[@id=\"KycAdd_list_country\"]")
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


public AddKYCvalidator(WebDriver d) 
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
			wait.until(ExpectedConditions.visibilityOf(seerID));
			seerID.click();
	
			log.info("Clicked on ComplianSeer");
		}
			catch(Exception e)
		{
			log.error("Not clicked on ComplianSeer");
		}
}

public void AddKYCPage()  
{
	try
		{	
//			onBoardingPage();
			
			log.info("click on Add KYC");
			AddKYC.click();
			wait.until(ExpectedConditions.visibilityOf(selectProgramName));
			selectProgramName.click();
			ProgramName.click();
			
			wait.until(ExpectedConditions.visibilityOf(selectProductDesc));
			selectProductDesc.click();
			ProductDesc.click();
			
			wait.until(ExpectedConditions.visibilityOf(selectGroupDesc));
			selectGroupDesc.click();
			GroupDesc.click();
			
			
			log.info("Enter first name");
			wait.until(ExpectedConditions.visibilityOf(first_name));
			first_name.sendKeys("Arpitha");
			
			log.info("Enter middle name");
			wait.until(ExpectedConditions.visibilityOf(middle_name));
			middle_name.sendKeys("Vyas");
			
			log.info("Enter last name");
			wait.until(ExpectedConditions.visibilityOf(last_name));
			last_name.sendKeys("Purohit");
			
			log.info("Enter Email");
			wait.until(ExpectedConditions.visibilityOf(email));
			email.sendKeys("apurohit@dataseers.in");
			
			log.info("Enter Phone number");
			wait.until(ExpectedConditions.visibilityOf(Phone_number));
			Phone_number.sendKeys(GenerateData.generateRandomNumber(10));
			
			log.info("Enter Date of birth");
			wait.until(ExpectedConditions.visibilityOf(DOB));
//			DOB.click();
			actions.sendKeys(DOB, LocalDate.now().toString(), Keys.ENTER).perform();
//			wait.until(ExpectedConditions.visibilityOf(Date_list));
//			Date_list.click();
//			log.info("Selected  date is: " + DOB.getText());
//			sel_month.click();
//			sel_year.click();
//			for (int i = 0; i < 4; i++)
//			{
//				Year.click();
//				
//			}
//			DOByear.click();
//			
//			sel_date.click();
			
			log.info("Enter SSN number");
			wait.until(ExpectedConditions.visibilityOf(SSN_no));
			SSN_no.click();
			SSN_no.sendKeys(GenerateData.generateRandomNumber(9));
			log.info("SSN number is: " + SSN_no.getText());
			
			log.info("Enter street address");
			wait.until(ExpectedConditions.visibilityOf(street1));
			street1.sendKeys("307 HICKSVILLE RD");
			
			log.info("Enter street address");
			wait.until(ExpectedConditions.visibilityOf(street2));
			street2.sendKeys(KYCdata);
			
			log.info("Enter city");
			wait.until(ExpectedConditions.visibilityOf(city));
			city.sendKeys("LONG BEACH");
			
			log.info("Enter state");
			wait.until(ExpectedConditions.visibilityOf(state));
			state.sendKeys("CA");
			
			log.info("Enter zip");
			wait.until(ExpectedConditions.visibilityOf(zip));
			zip.sendKeys("96001");

			log.info("Select country");
			country.click();
			wait.until(ExpectedConditions.visibilityOf(country_list));
			country_list.click();
			log.info("Selected Country is: " + country.getText());
			
		}
	
		catch(Exception e)
		{
			log.error("Cant Add KYC");
		}
		
}

	//Save KYC
	public void saveKYCpage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveKYC.click();
				log.info("New KYC is added successfully");
							
			}
		
		catch(Exception e)
			{
				log.error("could not create new KYC");	

			}
	}
	
	//Cancel KYC
	public void cancelKYCpage() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancelKYC.click();
			}
		catch(Exception e)
			{
				log.error("cancel button failed");	
			}
	}

}

