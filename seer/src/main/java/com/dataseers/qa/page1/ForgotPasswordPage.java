package com.dataseers.qa.page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dataseers.qa.base.TestBase;

public class ForgotPasswordPage extends TestBase {
	
	WebDriver driver;

	// 1. locators - By
	By ForgotPasswordLink = By.linkText("Forgot Password?");
	By EmailForgotPassword = By.id("normal_login_email");
	By ResetPasswordBtn = By.xpath("//button[@class='ant-btn ant-btn-primary']");
	By CancelBtn = By.xpath("//button[@class='ant-btn']");
	By errorMessage = By.className("ant-form-explain");
	
	public ForgotPasswordPage(WebDriver driver){
		this.driver = driver;
	}
	
	// 2. page actions:
	public void clickOnForgotPasswordLink(){
		driver.findElement(ForgotPasswordLink).click();
	}
	
	public void clickOnResetPasswordBtn(){
		driver.findElement(ResetPasswordBtn).click();
	}
	
	public void clearEmailfield(){
		driver.findElement(By.id("normal_login_email")).clear();
	}
	
	public String getBlankErrorMessage(){
		driver.findElement(EmailForgotPassword).clear();
		clickOnResetPasswordBtn();
		return driver.findElement(errorMessage).getText();
	}
	
	public String getinvalidEmailMessage(){
		driver.findElement(EmailForgotPassword).sendKeys("jchavathe@");
		clickOnResetPasswordBtn();
		
		return driver.findElement(errorMessage).getText();
	}
	
	public void clickOnCancelBtn(){
		driver.findElement(CancelBtn).click();
	}
}
