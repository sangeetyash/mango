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
import org.testng.Assert;
//import org.springframework.util.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class RiskIndicator extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	WebDriver driver;
	
	//Complianseer
	@CacheLookup    
	@FindBy(xpath = "//*[text()='ComplianSeer']")
	WebElement Complianseer;
	
	//On Boarding
	@CacheLookup    
	@FindBy(xpath = "//*[text()='OnBoarding']")
	WebElement onBoarding;
	
	//Risk Indicator
	@CacheLookup
	@FindBy(xpath="//*[@href='/risk-indicators\']")
	WebElement RiskIndicator;
	
	//Click on Edit
	@CacheLookup
	@FindBy(xpath = "(//*[@title=\"Edit risk indicators\"])")
	WebElement Edit;
	
	//Click on Configuration
	@CacheLookup
	@FindBy(xpath = "/html/body/div[1]/section/section/main/div/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[2]/div/div[4]/div/div[2]/span/i/svg")
	WebElement config;
	
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@title=\"Save\"]")
	WebElement saveRiskIndicator;
	
	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@class='ant-btn ant-btn-danger']")
	WebElement cancelRiskIndicator;


public RiskIndicator(WebDriver d) 
{
	PageFactory.initElements(d, this);
}

//Compliance page
public void compliancePage()
{
	try
		{
			log.info("Clicking on Compliance");
			wait.until(ExpectedConditions.visibilityOf(Complianseer));
			Complianseer.click();

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
			compliancePage();
			log.info("Click on onBoarding");
			wait.until(ExpectedConditions.visibilityOf(onBoarding));
			onBoarding.click();
			log.info("click on Risk indicdator");
			wait.until(ExpectedConditions.visibilityOf(RiskIndicator));
			RiskIndicator.click();
	
			log.info("Clicked on onBoarding");
		}
			catch(Exception e)
		{
			log.error("Not clicked on onBoarding");
		}
}

public void AddRiskIndicatorPage()  
{
	try
		{	

			
			log.info("click on Edit");
			wait.until(ExpectedConditions.visibilityOf(Edit));
			Edit.click();
			
//			log.info("click on configuration");
//			wait.until(ExpectedConditions.visibilityOf(config));
//			config.click();		
		}
	
		catch(Exception e)
		{
			log.error("Cant Add Risk indicator");
		}
		
}

	//Save RiskIndicator
	public void saveRiskIndicatorpage() 
	{
		try
			{
				log.info("Clicking on save button");
				saveRiskIndicator.click();
				log.info("edited successfully");
							
			}
		
		catch(Exception e)
			{
				Assert.fail("could not Edit");	

			}
	}
	
	//Cancel RiskIndicator
	public void cancelRiskIndicatorpage() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancelRiskIndicator.click();
			}
		catch(Exception e)
			{
				Assert.fail("cancel button failed");	
			}
	}

}

