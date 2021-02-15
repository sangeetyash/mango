package com.dataseers.qa.page1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com.dataseers.qa.base.TestBase;
import com.excel.lib.util.Xls_Reader;

public class ExcelLoginPage extends TestBase {

	WebDriver driver;

	// 1. locators - By

	//dataseers login locators

	@CacheLookup    
	@FindBy(id="normal_login_email")
	WebElement emailId;

	@CacheLookup    
	@FindBy(id="normal_login_password")
	WebElement password;

	@CacheLookup    
	@FindBy(xpath="//button[@type='submit']")
	WebElement LogInBtn;

	@CacheLookup    
	@FindBy(id="details-button")
	WebElement AdvancedBtn;

	@CacheLookup    
	@FindBy(id="proceed-link")
	WebElement ProceedLink;

	public ExcelLoginPage(WebDriver driver){
		this.driver = driver;
	}

//	public void loginPage1(){
//		AdvancedBtn.click();
//		ProceedLink.click();
//	}

	public void ExcelLogin(){

		Xls_Reader reader = new Xls_Reader("./src/main/java/com/excel/lib/util/LoginData.xlsx");
		String sheetName = "login";

		String data = reader.getCellData(sheetName, 0, 2);
		System.out.println(data);
		
		/*int rowCount = reader.getRowCount(sheetName);

		for(int rowNum=2; rowNum<=rowCount; rowNum++){
			String loginId = reader.getCellData(sheetName, "username", rowNum);
			String passsword = reader.getCellData(sheetName, "password", rowNum);

			System.out.println(loginId + " " + passsword);

			emailId.clear();
			emailId.sendKeys(loginId);

			password.clear();
			password.sendKeys(passsword);
			
			LogInBtn.click();
		}*/
	}
}
