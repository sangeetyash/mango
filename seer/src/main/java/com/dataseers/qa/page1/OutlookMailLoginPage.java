package com.dataseers.qa.page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dataseers.qa.base.TestBase;

public class OutlookMailLoginPage extends TestBase {
	
	WebDriver driver;
	
	By profilePic = By.id("mectrl_headerPicture");
	By profileName = By.id("mectrl_currentAccount_primary");
	
	By processingMail = By.xpath("//span[contains(text(),'314(a) Processing for workunit')]");
	
	public OutlookMailLoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void profileNameCheck(){
		driver.findElement(profilePic).click();
		String ProfileName = driver.findElement(profileName).getText();
		System.out.println("Profile Name is: "+ProfileName);
	}
	
	public void mailCheck(){
		String emailSubject = driver.findElement(processingMail).getText();
		System.out.println("Email Subject is: "+emailSubject);
	}
	

}
