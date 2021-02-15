package com.dataseers.qa.pages.compliance;
//import java.util.concurrent.TimeUnit;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;public class ReasonCodes extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String ReasonCodesdata = GenerateData.generateRandomString(6).toLowerCase(); 
	
	//Compliance
	@CacheLookup    
//	@FindBy(xpath = "//*[@alt='Case Management']")
	@FindBy(xpath = "//*[text()='ComplianSeer']")
	WebElement Compliance;
	
	//Reason Codes
	@CacheLookup    
	@FindBy(xpath="//*[@href=\"/reason-codes\"]")
	WebElement reasoncodes;
	
	//Add reason codes
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new reason code']")
	WebElement addreasons;
	
	//Add reason name
	@CacheLookup
	@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_name\"]")
	WebElement addreasonName;
	
	//Add reason description
	@CacheLookup
	@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_description\"]")
	WebElement addDescription;
	
	//Status toggle button
	@CacheLookup
//	@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_is_active\"]/span")
	@FindBy(xpath = "(//*[@class='ant-switch-inner'])[1]")
	WebElement statustoggle;
	
	//Fraud toggle button
	@CacheLookup
//	@FindBy(xpath="//*[@id=\"ReasonCodeAdd_list_is_fraud\"]")
	@FindBy(xpath = "(//*[@class='ant-switch-inner'])[1]")
	WebElement fraudtoggle;
	
	
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveReasoncodes;
	
	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancel_reasoncodes;


public ReasonCodes(WebDriver d) 
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

public void ReasonCodesPage()
{
	try
		{
			compliancePage();
			log.info("Click on Reason codes");
			wait.until(ExpectedConditions.visibilityOf(reasoncodes));
			reasoncodes.click();
	
			log.info("Directed to Reason codes page");
		}
			catch(Exception e)
		{
			log.error("Not directed to Reason codes page");
		}
}

public void addreasonPage()  
{
	try
		{	
//			ReasonCodesPage();
			
			log.info("click on Add Reason codes");
			wait.until(ExpectedConditions.visibilityOf(addreasons));
			addreasons.click();
			
			log.info("Enter Reason codes name");
			wait.until(ExpectedConditions.visibilityOf(addreasonName));

			addreasonName.sendKeys(ReasonCodesdata);
			
			log.info("Enter Description");
			addDescription.sendKeys("This is automation testing by Arpitha");
			
			statustoggle.click();
			fraudtoggle.click();
		}
		catch(Exception e)
		{
			log.error("Cant add reasons");
		}
}

	//Save Reason codes
	public void saveReasonCodes() 
	{
		try
			{
				log.info("Clicking on save button");
				saveReasoncodes.click();
				log.info("New Reason codes is added successfully");
							
			}
		
		catch(Exception e)
			{
				log.error("could not create new Reason codes");	

			}
	}
	
	//Cancel Reason codes
	public void cancelReasonCodes()
	{
		try
			{
				log.info("Clicking on cancel button");
				cancel_reasoncodes.click();
			}
		catch(Exception e)
			{
				log.error("cancel button failed");	
			}
	}
	

}

