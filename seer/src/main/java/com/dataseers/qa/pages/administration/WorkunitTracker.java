package com.dataseers.qa.pages.administration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;

public class WorkunitTracker extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 35);
	Actions actions = new Actions(d);
	String workUnitdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();

	// Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']") 
	WebElement administration;

	// cluster-management module
	@CacheLookup
	@FindBy(xpath = "//span[contains(text(),'Cluster Config')]")
	WebElement clusterconfig;
		
	// Work-Unit management page
	@CacheLookup
	@FindBy(xpath = "//*[@href='/work-unit-id-tracker']")
	WebElement workUnitPage;

	// first row of work unit tracker table
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-row ant-table-row-level-0'])[1]")
	WebElement firstRowUnit;

	// first work-unit details expand button
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-row-expand-icon ant-table-row-collapsed'])[1]")
	WebElement expandRow;

	// work unit info json list
	@CacheLookup
	@FindBy(xpath = "//*[@class='icon-container']")
	List<WebElement> workUnitInfo;

	// fetching first work-unit row all details
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-expanded-row ant-table-expanded-row-level-1'])[1]")
	WebElement fetchDetails;

	public WorkunitTracker(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void administrationPage() {
		try {
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			log.info("Cliciking on Administration module");
			wait.until(ExpectedConditions.visibilityOf(administration));
			administration.click();
			Thread.sleep(1000);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			log.info("Workkey clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		} 
	}

	public void workTrackerPage() {
		try {
			administrationPage();
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			log.info("Clicking on WorkUnit tracker");
			clusterconfig.click();
			wait.until(ExpectedConditions.visibilityOf(workUnitPage));
			workUnitPage.click();
			log.info(" Redirected to WorkUnit tracker successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Not redirected to WorkUnit tracker page!!!!");
		}
	}

	public void getWorkInfo() {
		try {
			wait.until(ExpectedConditions.visibilityOf(firstRowUnit));
			log.info(firstRowUnit.getText());

			wait.until(ExpectedConditions.visibilityOf(expandRow));
			log.info("Clicking on expand first row work unit details button");
			expandRow.click();

			log.info("Clicking on all expand Work unit details buttons");
			workUnitInfo.get(0).click();
			
			d.findElement(By.xpath("(//*[text()='WUInfoResponse'])[1]")).click();		
			d.findElement(By.xpath("(//*[text()='Workunit'])[1]")).click();

			log.info("Fetching all first row Work unit details");
			wait.until(ExpectedConditions.visibilityOf(fetchDetails));
			log.info(fetchDetails.getText());

		} catch (Exception e) {
			Assert.fail("First row work unit details not found");
		}
	}

}