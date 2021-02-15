package com.dataseers.qa.pages.user_details;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dataseers.qa.base.TestBase;

public class EditProfile extends TestBase 
{
WebDriverWait wait = new WebDriverWait(d, 10);

//logged in user details
@CacheLookup    
@FindBy(xpath="//*[@class='role-name-css']")
WebElement verifylogin;

//change passw0rd button
@CacheLookup    
@FindBy(xpath="//*[@title='Edit Profile']")
WebElement edit_profile;

////user's displayed email id
@CacheLookup    
@FindBy(xpath="//*[@class='ant-form-text']")
WebElement disp_email;

//first name field
@CacheLookup    
@FindBy(xpath="//*[@id=' user_profile_first_name']")
WebElement first_name;

//last name field
@CacheLookup    
@FindBy(xpath="//*[@id=' user_profile_last_name']")
WebElement last_name;

//last name field
@CacheLookup    
@FindBy(xpath="//*[@id=' user_profile_contact_number']")
WebElement contact_number;

//email notification radio button 
@CacheLookup    
@FindBy(xpath="//*[@id=' user_profile_email_notification']")
WebElement email_notify;

//email notification radio button enabled
@CacheLookup    
@FindBy(xpath="//*[@aria-checked='true']")
WebElement email_notify_active;

//email notification radio button disabled
@CacheLookup    
@FindBy(xpath="//*[@aria-checked='false']")
WebElement email_notify_inactive;

//save password button
@CacheLookup    
@FindBy(xpath="//*[@type='submit']")
WebElement save_details;

//cancel password button
@CacheLookup    
@FindBy(xpath="//*[@type='button']")
WebElement cancel_details;


//homepage button
@CacheLookup    
@FindBy(xpath="//*[@class='ant-page-header-heading-title']")
WebElement homepage_header;


//change passw0rd success toaster
@CacheLookup    
@FindBy(xpath="//*[@aria-label='icon: check-circle']")
WebElement success_toaster;
//
////already used passw0rd error toaster
//@CacheLookup    
//@FindBy(xpath="//*[@class='anticon anticon-close-circle']")
//WebElement alreadyusederr_toaster;

Actions actions= new Actions(d);

public EditProfile(WebDriver d) 
{
PageFactory.initElements(d, this);
}

public void edit_profile_page()
{
try
{
log.info("Hovering mouse over logged in user details");
wait.until(ExpectedConditions.visibilityOf(verifylogin));
actions.moveToElement(verifylogin).build().perform();

log.info("Clicking on edit profile page button");
wait.until(ExpectedConditions.visibilityOf(edit_profile));
edit_profile.click();

wait.until(ExpectedConditions.visibilityOf(disp_email));

log.info("Verify logged in user's email on edit profile page button");
String user=prop.getProperty("userName");
Assert.assertEquals(disp_email.getText(),user);

log.info("User is redirected to edit profile page successfully!!!!");
}
catch(Exception e)
{
log.error("User is Not redirected to edit profile page!!!!");
Assert.fail();

}
}



public void Enter_user_details() 
{
try
{
log.info("Updating profile details fields");
wait.until(ExpectedConditions.visibilityOf(first_name));

log.info("Clear Existing first name");
first_name.clear();

log.info("Updating first name");
first_name.sendKeys("Arpitha");

log.info("Clear Existing last name");
last_name.clear();

log.info("Updating last name");
last_name.sendKeys("Purohit");

log.info("Clear Existing Contact Number");
contact_number.clear();
log.info("Updating Contact Number");
contact_number.sendKeys("8369259151");

log.info("Updating email notifictaions radio button");

email_notify.click();

//if(email_notify_active.isEnabled())
//{
//	log.info("Turned email notifications on");
//
//}
//else 
//{
//	log.info("Turned email notifications off");
//}
}
catch(Exception e)
{
log.error("Edit profile details fields not found");
Assert.fail();
}
}

public void save_details() 
{
try
{
log.info("Clicking on save button");
save_details.click();

log.info("User details updated successfully!!!!");

log.info("Verifying that user is redirected to homepage!!!!");

wait.until(ExpectedConditions.visibilityOf(homepage_header));
homepage_header.isDisplayed();
//wait.until(ExpectedConditions.visibilityOf(success_toaster));
success_toaster.isDisplayed();

}
catch(Exception e)
{
log.error("Saving updated user details failed");
Assert.fail();

}
}


public void cancel_button() 
{
try
{
log.info("Clicking on cancel button");
cancel_details.click();

log.info("Verifying that user is redirected to homepage!!!!");
wait.until((ExpectedConditions.visibilityOf(homepage_header)));
homepage_header.isDisplayed();
}
catch(Exception e)
{
log.error("cancel button scenario failed");
Assert.fail();

}
}

//public void alreadyUsed_password() 
//{
//try
//{
//log.info("Verifying already used password error scenario!!!!");
//wait.until(ExpectedConditions.visibilityOf(alreadyusederr_toaster));
//alreadyusederr_toaster.isDisplayed();
//log.info("Got already used password error!!!!");
//
//}
//catch(Exception e)
//{
//log.error("Already used password error scenario failed!!!");
//Assert.fail();
//}
//}


}
