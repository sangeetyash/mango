package com.dataseers.qa.page1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.dataseers.qa.base.TestBase;

public class WorkUnitTrackerPage extends TestBase {
	WebDriver driver;

	By AdminBillingLink = By.xpath("//*[text()='Admin & Billing']");
	By ClusterConfigLink = By.xpath("//*[text()='Cluster Config']");
	By WorkUnitTrackerLink = By.xpath("//a[@href='/work-unit-id-tracker']");
	By ResetFilterBtn = By.xpath("//button[@title='Reset filter']");
	
	public WorkUnitTrackerPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void WorkUnitTrackerPageClick() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(AdminBillingLink).click();
		driver.findElement(ClusterConfigLink).click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(WorkUnitTrackerLink).click();
		
	}
	
}
