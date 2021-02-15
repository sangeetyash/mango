package com.dataseers.qa.pages.compliance;
import org.testng.Assert;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

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
import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import au.com.bytecode.opencsv.CSVReader;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import com.dataseers.qa.pages.compliance.SeerIQ;
import java.io.FileWriter;
import com.opencsv.CSVWriter;

public class SeerID extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions= new Actions(d);
	String KYCdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	WebDriver driver; 
	SeerIQ ds_SeerIQ;
	
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

	//Flow ID drop down
	@CacheLookup
//	@FindBy(xpath = "//li[normalize-space()='00002c - Dataseers - SeerID']")
//	@FindBy(xpath = "//li[normalize-space()='00004f - ID-SCAN-IQ']")
	@FindBy(xpath = "//li[normalize-space()='000029 - JC']")
	
	WebElement FlowID_Sel;

	//Multi-stage flow id
	@CacheLookup
	@FindBy(xpath="//li[normalize-space()='000029 - JC']")
	WebElement multistage_flow;

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
	@FindBy(xpath = "//div[normalize-space()='Select country']")
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

	public SeerID(WebDriver d) 
	{
		PageFactory.initElements(d, this);
		ds_SeerIQ = new SeerIQ(d);
		
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
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			log.info("Clicked on ComplianSeer");
		}
		catch(Exception e)
		{
			Assert.fail("Not clicked on ComplianSeer");
		}
	}
	
	public void userdetailsPage () throws IOException
	{

		CSVReader reader = null;
		String CsvData = null;
		
		//Instantiating the CSVWriter class
	      CSVWriter writer = new CSVWriter(new FileWriter("data//KYCdata//test.csv",true));
		try
		{

			reader = new CSVReader(new FileReader("data//KYCdata//KYCdata.csv"), ',' , '"' , 1);
			String[] cell;
			int i = 1;
			Random objGenerator = new Random();
			int  randomNumber = objGenerator.nextInt(10);
			if (randomNumber==0){          
				randomNumber= randomNumber+1;
				}
			System.out.println("***************Random number is :************** " + randomNumber); 
			while ((cell = reader.readNext()) != null) {
		
				String First_Name = cell[0];
				String Last_Name = cell[1];
				String Phone_Number = cell[2];
				String SSN = cell[3];
				String Street_address = cell[4];
				String City = cell[5];
				String State = cell[6];
				String Zip = cell[7];
					if(i==randomNumber)
						
				{
								
					CsvData = First_Name+","+Last_Name+","+Phone_Number+","+SSN+","+Street_address+","+City+","+State+","+Zip;
					log.info("Enter first name");
					wait.until(ExpectedConditions.visibilityOf(first_name));
					first_name.sendKeys(First_Name);

					log.info("Enter last name");
					wait.until(ExpectedConditions.visibilityOf(last_name));
					last_name.sendKeys(Last_Name);

					log.info("Enter Email");
					wait.until(ExpectedConditions.visibilityOf(email));
					email.sendKeys("apurohit@dataseers.in");

					log.info("Enter Phone number");
					wait.until(ExpectedConditions.visibilityOf(Phone_number));
					Phone_number.sendKeys(Phone_Number);

					log.info("Enter Date of birth");
					wait.until(ExpectedConditions.visibilityOf(DOB));
					actions.sendKeys(DOB, LocalDate.now().minusYears(33).minusMonths(8).minusDays(2).toString(), Keys.ENTER).perform();	

					log.info("Enter SSN number");
					wait.until(ExpectedConditions.visibilityOf(SSN_no));
					SSN_no.click();;
					SSN_no.sendKeys(SSN);
					
					log.info("Enter street address");
					wait.until(ExpectedConditions.visibilityOf(street1));
					street1.sendKeys(Street_address);

					log.info("Enter city");
					wait.until(ExpectedConditions.visibilityOf(city));
					city.sendKeys(City);

					log.info("Enter state");
					wait.until(ExpectedConditions.visibilityOf(state));
					state.sendKeys(State);

					log.info("Enter zip");
					wait.until(ExpectedConditions.visibilityOf(zip));
					zip.sendKeys(Zip);
					

					
				}
				
				i = i+1;
			}
		      String line2[] = {"Add SeerID details","Test data: ("+CsvData+")" };
		      writer.writeNext(line2);

		      //Flushing data from writer to file
		      writer.flush();
		      System.out.println("Data entered");
		      writer.close();
			}

		catch(IOException e)
		{
			Assert.fail("User details not filled");
			 String line2[] = {"1", "Add SeerID","Test data: ("+CsvData+")","SeerID not added","Failed" };
			 writer.writeNext(line2);
			 writer.flush();
			 writer.close();
		}
	}
	
	public void AddSeerIDPage() throws IOException, InterruptedException 
	{
		log.info("click on Add seerID");
		AddseerID.click();

		FlowID.click();
//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(2000);
//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(2000);
//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		FlowID_Sel.click();
	}

	public void SeerIDTable(){

		int rowCount = d.findElements(By.xpath("//div[@class='ant-table-body']//table//tr")).size()-1;
		System.out.println(rowCount);		

		String beforeXpath = "//tbody/tr[";
		String afterXpath = "]/td[8]";

		for(int rowNum=1; rowNum < rowCount+1; rowNum++){
			String actualXpath = beforeXpath+rowNum+afterXpath;
			//		System.out.println(actualXpath);
			String value = d.findElement(By.xpath(actualXpath)).getText();
			System.out.println("--------------->SeerID Status is for row "+rowNum+" is: "+value+"<---------------------");
		}
	}
	//Save SeerIQ
	public void saveSeerIDpage() throws IOException 
	{
		 CSVWriter writer = new CSVWriter(new FileWriter("data//KYCdata//test.csv",true));
		try
		{
			log.info("Clicking on save button");
			saveKYC.click();
			log.info("New SeerID is added successfully");
			Thread.sleep(2000);
			String line2[] = {"SeerID added successfully" };
		    writer.writeNext(line2);
		    writer.flush();
		    writer.close();
		}

		catch(Exception e)
		{
			Assert.fail("could not create new SeerID");	
			String line2[] = {"could not create new SeerID" };
		    writer.writeNext(line2);
		    writer.flush();
		    writer.close();
		}
	}

	public void getSeerIDstatus() throws IOException{
		CSVWriter writer = new CSVWriter(new FileWriter("data//KYCdata//test.csv",true));  
		try
		{
		By mode = By.xpath("//tbody/tr[1]/td[2]");
		String Mode = d.findElement(mode).getText();
//		System.out.println("Mode is: "+Mode);

		String SeerIDstatus = d.findElement(By.xpath("//tbody/tr[1]/td[8]")).getText();	
//		System.out.println("SeerID status is: "+SeerIDstatus);
		
		 String line3[] = {"Mode is "+Mode, "SeerID status is "+SeerIDstatus};  
	      writer.writeNext(line3);
	      writer.flush();
	      writer.close();
		if(SeerIDstatus.contains("Secondary Verification Required"))
		{
			NextKYCstepPage();
			
		}
		else if(SeerIDstatus.contains("Passed"))
		{
			System.out.println("SeerID status is: "+SeerIDstatus);
		}
		else
		{
			System.out.println("SeerID status is: "+SeerIDstatus);
		}
		
	     
		
	}
		catch(Exception e)
		{
			Assert.fail("Did not get the seerid status ");	
			String line2[] = {"Did not get the seerid status" };
			writer.writeNext(line2);
		    writer.flush();
		    writer.close();

		}
	}
		

	
	//If status is secondary verification next KYC step page
	public void NextKYCstepPage() throws IOException  
	{
		CSVWriter writer = new CSVWriter(new FileWriter("data//KYCdata//test.csv",true));
		try
			{	

			By FirstName = By.xpath("//tbody/tr[1]/td[4]/a[1]");
			d.findElement(FirstName).click();
			Thread.sleep(2000);
			RiskIndicatorTab();
			Thread.sleep(5000);
			By Alertmsg = By.xpath("//span[@class='ant-alert-message']");
			String NextStep = d.findElement(Alertmsg).getText();
			System.out.println("**************Status is: "+NextStep+"**************");
			
			By Alertdescription = By.xpath("//span[@class='ant-alert-description']");
			String statusdesc = d.findElement(Alertdescription).getText();
			System.out.println("****************Status is: "+statusdesc+"**************");
			
			
		      String line3[] = {"Status description is:  "+statusdesc};
		      writer.writeNext(line3);
		      writer.flush();
		      writer.close();
			if(statusdesc.contains("KYC status is Secondary Verification Required, Next step to complete KYC is SeerIQ"))
			{
				//Click on goto page
				By gotoPage = By.xpath("//a[normalize-space()='Go to SeerIQ page']");
				d.findElement(gotoPage).getText();
				System.out.println("**************"+gotoPage+"**************");
				Thread.sleep(2000);
				d.findElement(gotoPage).click();
				Thread.sleep(2000);
				SeerIQpage();
			}
			else
			{
			By gotoPage = By.xpath("//a[normalize-space()='Go to SeerScan page']");
			d.findElement(gotoPage).getText();
			System.out.println("**************"+gotoPage+"**************");
			d.findElement(gotoPage).click();
			
			SeerScanpage();
	
			}
			}
			catch(Exception e)
			{
				Assert.fail("Cant Add SeerID");
				String line3[] = {"Next KYC step failed"};
				writer.writeNext(line3);
			    writer.flush();
			}
			
	}
	
	
	public void RiskIndicatorTab() throws IOException{

		CSVWriter writer = new CSVWriter(new FileWriter("data//KYCdata//test.csv",true));
		try
		{
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		By RiskIndicator = By.xpath("//div[@id='accordion__heading-raa-1']");
		d.findElement(RiskIndicator).click();
		
		int rowCount = d.findElements(By.xpath("//div[@class='ant-table-body']//table//tr")).size()-1;
		System.out.println(rowCount);		

		String beforeXpath = "//tbody/tr[";
		String afterXpath = "]/td[1]";
		
		String beforeXpath2 = "//tbody/tr[";		
		String afterXpath2 = "]/td[2]";
		
		String beforeXpath3 = "//tbody/tr[";
		String afterXpath3 = "]/td[3]";

		for(int rowNum=1; rowNum < rowCount+1; rowNum++){
			String actualXpath = beforeXpath+rowNum+afterXpath;
			String actualXpath2 = beforeXpath2+rowNum+afterXpath2;
			String actualXpath3 = beforeXpath3+rowNum+afterXpath3;
			//		System.out.println(actualXpath);
			String value = d.findElement(By.xpath(actualXpath)).getText();
			String value2 = d.findElement(By.xpath(actualXpath2)).getText();
			String value3 = d.findElement(By.xpath(actualXpath3)).getText();
			System.out.println("Risk Indicator row "+rowNum+" description is: "+value+"+, Level is: "+value2+", status is: "+value3);
			String line3[] = {"Risk Indicator row "+rowNum+" description is: "+value+", Level is: "+value2+", status is: "+value3};
		      writer.writeNext(line3);
		      writer.flush();
		      writer.close();
		}
		}
		catch(Exception e)
		{
			Assert.fail("Cant Add SeerID");
			String line3[] = {"Next KYC step failed"};
			writer.writeNext(line3);
		    writer.flush();
		    writer.close();
		}
	}
	
	//SeerIQpage click on save button on next kyc step
			public void SeerIQpage() throws IOException 
			{
				CSVWriter writer = new CSVWriter(new FileWriter("data//KYCdata//test.csv",true));
				try
					{
						log.info("Clicking on Save button");
						By saveSeerIQ = By.xpath("//*[@type='submit']");
						d.findElement(saveSeerIQ).click();
						String line3[] = {"Next step SeerIQ is added successfully"};
						writer.writeNext(line3);
						writer.flush();
						Thread.sleep(2000);
						actions.sendKeys(Keys.PAGE_DOWN).build().perform();
						Thread.sleep(2000);
						actions.sendKeys(Keys.PAGE_DOWN).build().perform();
						Thread.sleep(2000);
						Thread.sleep(4000);
						
						ds_SeerIQ.QuestionAndAnswersPage();
						Thread.sleep(5000);
						ds_SeerIQ.SecondaryQuestionSetPage();
						Thread.sleep(3000);

						ds_SeerIQ.getSeerIQstatus();
						Thread.sleep(3000);
						ds_SeerIQ.SeerIQTable();		
						Thread.sleep(3000);
						ds_SeerIQ.NextKYCstepPage();
						Thread.sleep(3000);
					  
					   
					}	
				catch(Exception e)
					{
					Assert.fail("Next KYC step for SeerIQ failed");	
					 String line3[] = {"Next step SeerIQ failed"};
				      writer.writeNext(line3);
				      writer.flush();
				      writer.close();
					}
			}
	
			public void SeerScanpage() throws IOException 
			{
				CSVWriter writer = new CSVWriter(new FileWriter("data//KYCdata//test.csv",true));
				try
					{
					
				
					By FrontImage = By.xpath("//*[@type=\"file\"]");
					d.findElement(FrontImage).sendKeys("data//KYCdata//frontimage.jpg");

					//Upload selfie
					By selfie = By.xpath("//div[3]//div[1]//div[1]//span[1]//div[1]//span[1]//input[1]"
							+ ""
							+ "");
							d.findElement(selfie).sendKeys("data//KYCdata//selfie.png");
					
					
						log.info("Clicking on Save button");
						By saveSeerScan = By.xpath("//*[@type='submit']");
						d.findElement(saveSeerScan).click();
						Thread.sleep(2000);
						String SeerScansubmit = d.findElement(By.xpath("//*[@type='submit']")).getText();
						String line3[] = {"Next step seerscan is added successfully"+SeerScansubmit};
					    writer.writeNext(line3);
					    writer.flush();
					    writer.close();
					}	
				catch(Exception e)
					{
					Assert.fail("Next KYC step failed");	
					String line3[] = {"Next KYC step for seerscan failed"};
					writer.writeNext(line3);
					writer.flush();
					writer.close();
					}
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



}

