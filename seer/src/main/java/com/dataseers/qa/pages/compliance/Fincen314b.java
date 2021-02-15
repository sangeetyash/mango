package com.dataseers.qa.pages.compliance;
import java.util.concurrent.TimeUnit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;

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
//import com.itextpdf.text.List;
import com.dataseers.qa.util.TestUtil;

import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

public class Fincen314b extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String Merchantdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard(); 
	WebDriver driver; 

	//Compliance
	@CacheLookup    
	@FindBy(xpath = "//*[text()='ComplianSeer']")
	WebElement Compliance;

	//FinCEN
	@CacheLookup    
	@FindBy(xpath = "//*[text()='FinCEN']")
	WebElement FinCEN;
	
	//click on 314(b) Management
	@CacheLookup
	@FindBy(xpath="//*[@href=\"/314-b-management\"]")
	WebElement Fincen314b;

	//Click on add new 314(a) Management
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new 314(b)' and @class=\"ant-btn m-r-10 ant-btn-primary ant-btn-circle\"]")
	WebElement Add_Fincen314b;
	
	//Select  Input_dataType
	@CacheLookup
	@FindBy(xpath = "//*[@class=\"ant-select-selection-selected-value\" and @title=\"Select input data type\"]")
	WebElement Select_Input_dataType;

	//Input_dataType
	@CacheLookup
	@FindBy(xpath="//*[@class=\"ant-select-dropdown-menu-item\"][1]")
	WebElement Input_dataType;
				
	//File upload
	@CacheLookup    
	@FindBy(xpath="//*[@type=\"file\"]")
	WebElement file_upload;
	
	//Save button
	@CacheLookup
	@FindBy(xpath="//*[@type='submit']")
	WebElement saveFincen314b;

	//cancel button
	@CacheLookup    
	@FindBy(xpath="//*[@type='button']")
	WebElement cancelFincen314b;

	
public Fincen314b(WebDriver d) 
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

public void FinCENPage()
{
	try
		{
			compliancePage();
			log.info("Click on 314b");
			wait.until(ExpectedConditions.visibilityOf(FinCEN));
			FinCEN.click();
			
			log.info("click on 314b");
			wait.until(ExpectedConditions.visibilityOf(Fincen314b));
			Fincen314b.click();
	
			log.info("Clicked on 314b");
		}
			catch(Exception e)
		{
			log.error("Not clicked on 314b");
		}
}

public void Add_Fincen314b_Page()  
{
	try
		{
			
			log.info("click on Add Fincen 314a");
			wait.until(ExpectedConditions.visibilityOf(Add_Fincen314b));
			Add_Fincen314b.click();
				
			log.info("Select Input Type");
			wait.until(ExpectedConditions.visibilityOf(Select_Input_dataType));
			Select_Input_dataType.click();
			wait.until(ExpectedConditions.visibilityOf(Input_dataType));
			Input_dataType.click();
	
			log.info("Upload file");
			file_upload.sendKeys("C:/Users/INTEL/Desktop/Dataseers/314b_person_template_2");
		}
	
		catch(Exception e)
		{
			log.error("Cant Add 314b management");
		}
		
}

	//Save 314(a)
	public void save_Fincen314b() 
	{
		try
			{
				log.info("Clicking on save button");
				saveFincen314b.click();
				log.info("New FINCEN is added successfully");
							
			}
		
		catch(Exception e)
			{
				log.error("could not create new 314a");	

			}
	}
	
	//Cancel KYC
	public void cancel_Fincen314b() 
	{
		try
			{
				log.info("Clicking on cancel button");
				cancelFincen314b.click();
			}
		catch(Exception e)
			{
				log.error("cancel button failed");	
			}
	}

}

