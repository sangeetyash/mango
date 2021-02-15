package com.dataseers.qa.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.dataseers.qa.util.TestUtil;
import com.dataseers.qa.base.TestBase;

//change password
public class Change_pwd_Page extends TestBase 
{
WebDriverWait wait = new WebDriverWait(d, 10);

//logged in user details
@CacheLookup    
@FindBy(xpath="//*[@class='role-name-css']")
WebElement verifylogin;

//change passw0rd button
@CacheLookup    
@FindBy(xpath="//*[@title='Change Password']")
WebElement change_password;

//old passw0rd field
@CacheLookup    
@FindBy(xpath="//*[@id='change_password_old_password']")
WebElement old_password;

//new passw0rd field
@CacheLookup    
@FindBy(xpath="//*[@id='change_password_password']")
WebElement new_password;

//confirm passw0rd field
@CacheLookup    
@FindBy(xpath="//*[@id='change_password_confirm_password']")
WebElement confirm_password;

//save password button
@CacheLookup    
@FindBy(xpath="//*[@type='submit']")
WebElement save_password;

//cancel password button
@CacheLookup    
@FindBy(xpath="//*[@type='button']")
WebElement cancel_password;

//homepage button
@CacheLookup    
@FindBy(xpath="//*[@class='ant-page-header-heading-title']")
WebElement homepage_header;


//change passw0rd success toaster
@CacheLookup    
@FindBy(xpath="//*[@aria-label='icon: check-circle']")
WebElement success_toaster;

//already used passw0rd error toaster
@CacheLookup    
@FindBy(xpath="//*[@class='anticon anticon-close-circle']")
WebElement alreadyusederr_toaster;



Actions actions= new Actions(d);

public Change_pwd_Page(WebDriver d) 
{
PageFactory.initElements(d, this);
}

public void change_pwd_page()
{
try
{
log.info("Hovering mouse over logged in user details");
wait.until(ExpectedConditions.visibilityOf(verifylogin));
actions.moveToElement(verifylogin).build().perform();

log.info("Clicking on change password button");
wait.until(ExpectedConditions.visibilityOf(change_password));
change_password.click();

log.info("User is redirected to chnage passsw0rd page successfully!!!!");
}
catch(Exception e)
{
log.error("User is Not redirected to chnage passsw0rd page!!!!");
}
}



public void Enter_new_password(String oldpwd,String newpwd,String cnfpwd) 
{
try
{
log.info("Entering old password");
wait.until(ExpectedConditions.visibilityOf(old_password));
old_password.sendKeys(oldpwd);

log.info("Entering new password");
new_password.sendKeys(newpwd);

log.info("Entering confirm password");
confirm_password.sendKeys(cnfpwd);

}
catch(Exception e)
{
log.error("change password failed");
}
}

public void save_password() 
{
try
{
log.info("Clicking on save button");
save_password.click();

log.info("Passw0rd changed successfully!!!!");

log.info("Verifying that user is redirected to homepage!!!!");

wait.until(ExpectedConditions.visibilityOf(homepage_header));
homepage_header.isDisplayed();

wait.until(ExpectedConditions.visibilityOf(success_toaster));
success_toaster.isDisplayed();

}
catch(Exception e)
{
log.error("change password failed");
}
}


public void cancel_button() 
{
try
{
log.info("Clicking on cancel button");
cancel_password.click();

log.info("Verifying that user is redirected to homepage!!!!");
wait.until(ExpectedConditions.visibilityOf(homepage_header));
homepage_header.isDisplayed();
}
catch(Exception e)
{
log.error("cancel button scenario failed");
}
}

public void alreadyUsed_password() 
{
try
{
log.info("Verifying already used password error scenario!!!!");
wait.until(ExpectedConditions.visibilityOf(alreadyusederr_toaster));
alreadyusederr_toaster.isDisplayed();
log.info("Got already used password error!!!!");

}
catch(Exception e)
{
log.error("Already used password error scenario failed!!!");
}
}


}
