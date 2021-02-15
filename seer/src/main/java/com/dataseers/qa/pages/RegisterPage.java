package com.dataseers.qa.pages;


import org.openqa.selenium.By;
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

public class RegisterPage extends TestBase 
{
WebDriverWait wait = new WebDriverWait(d, 15);
	


// advanced button 
@CacheLookup    
@FindBy(xpath="//*[@id='details-button']")
WebElement advanced;

//proceed to link unsafe 
@CacheLookup    
@FindBy(xpath="//*[@id='proceed-link']")
WebElement proceed;

//sign up hyperlink
@CacheLookup    
@FindBy(xpath="//*[@href='/sign-up']")
WebElement signup;

//firstname
@CacheLookup    
@FindBy(xpath="//*[@placeholder='First Name']")
WebElement firstname;

//lastname
@CacheLookup    
@FindBy(xpath="//*[@placeholder='Last Name']")
WebElement lastname;

//country telephone code
@CacheLookup    
@FindBy(id="normal_registration_phone_code")
WebElement countrycode;

//contact number
@CacheLookup    
@FindBy(xpath="//*[@placeholder='Contact number']")
WebElement contactnumber;

//Email
@CacheLookup    
@FindBy(xpath="//*[@placeholder='Email']")
WebElement email;


//*[@placeholder='Email']
//password
@CacheLookup    
@FindBy(xpath = "//*[@id='normal_registration_password']")
WebElement password;
	
//password
@CacheLookup    
@FindBy(xpath = "//*[@id='normal_registration_confirm_password']")
WebElement cnfpassword;

//register button
@CacheLookup    
@FindBy(xpath = "//*[@class='ant-btn login-form-button text-white ant-btn-block']")
WebElement register;

//existing user hyperlink
@CacheLookup    
@FindBy(xpath = "//*[@href='/login']")
WebElement extuser;

Actions action=new Actions(d);
String emailID = prop.getProperty("email_id");
String pwd = prop.getProperty("passWord");
static Keyboard keyboard = ((HasInputDevices) d).getKeyboard();

public RegisterPage(WebDriver d) 
{
PageFactory.initElements(d, this);
}

public void proceedtoportal()  
{
try
{	
wait.until(ExpectedConditions.elementToBeClickable(advanced)); 
advanced.click();
	
wait.until(ExpectedConditions.elementToBeClickable(proceed)); 
proceed.click();

}
catch(Exception e)
{
log.error("registeration failed");
Assert.fail();	

}	
}	

public void register()  
{
try
{	
log.info("Click on new user link");
wait.until(ExpectedConditions.visibilityOf(signup)); 
signup.click();
	
log.info("Enter first name");
wait.until(ExpectedConditions.visibilityOf(firstname));
firstname.sendKeys("rupesh");

log.info("Enter last name");
wait.until(ExpectedConditions.visibilityOf(lastname));
lastname.sendKeys("wayal");

wait.until(ExpectedConditions.visibilityOf(countrycode));
countrycode.click();

WebElement countrylist=d.findElement(By.xpath("//*[@title='91 - India']"));
wait.until(ExpectedConditions.visibilityOf(countrylist));
countrylist.click();

wait.until(ExpectedConditions.visibilityOf(contactnumber));

log.info("Enter contact number");
contactnumber.click();
contactnumber.sendKeys("9096082820");

log.info("Enter email");
wait.until(ExpectedConditions.visibilityOf(email));
email.sendKeys(GenerateData.generateRandomString(6)+"@dataseers.in");

log.info("Enter Passw0rd");
wait.until(ExpectedConditions.visibilityOf(password));
password.sendKeys(pwd);

log.info("confirm Passw0rd");
wait.until(ExpectedConditions.visibilityOf(cnfpassword));
cnfpassword.sendKeys(pwd);


log.info("Clicking on register button");
wait.until(ExpectedConditions.elementToBeClickable(register));
register.click();
}
catch(Exception e)
{
log.error("registeration failed");
Assert.fail();	

}	
}	
		



}



