package com.dataseers.qa.pages;

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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;

//user management page
public class User_Mgmt_Page extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
//	String alphadeta = GenerateData.generateRandomAlphaNumeric(10);
	String pwd = prop.getProperty("passWord");
	String userdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	
//Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;

//user-management module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/manage-users']")
	WebElement usermgmt;

//add new user button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new user']")
	WebElement adduser;

//add user first name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_first_name']")
	WebElement adduserfname;

//add  last name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_last_name']")
	WebElement adduserlname;

	// select phone code dropdown
	@CacheLookup
	@FindBy(xpath = "	//*[@id='add_user_phone_code']")
	WebElement phonecode;

//select phone code dropdown list
	@CacheLookup
	@FindBy(xpath = "//*[@title='91 - India']")
	WebElement phonecodelist;

//Add Phone number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_contact_number']")
	WebElement phonenumber;

//Add Email field
	@CacheLookup
	@FindBy(xpath = "//*[@tabindex='4']")
	WebElement email;

//add passw0rd field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_password']")
	WebElement password;

// confirm passw0rd field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_confirm_password']")
	WebElement cnfpassword;

// users role dropdown 
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_role_id']")
	WebElement user_rolebox;

// users role dropdown list
	@CacheLookup
	@FindBy(xpath = "//*[@itemid='1']")
	WebElement user_role;
	
//	reports_rolebox dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_report_group']")
	WebElement reports_rolebox;
	
	// reports dropdown list
		@CacheLookup
//		@FindBy(xpath = "//*[@itemid='2']")
		@FindBy(xpath = "//*[text()='Global reports']")
		WebElement reports_role;
		
//		programs_rolebox dropdown
		@CacheLookup
		@FindBy(xpath = "//*[@id='add_user_program_group']")
		WebElement programs_rolebox;
		
		// program dropdown list
			@CacheLookup
//			@FindBy(xpath = "//*[@itemid='3']")
			@FindBy(xpath = "//*[text()='Global programs']")

			WebElement programs_role;
			
//save_user
@CacheLookup
@FindBy(xpath="//*[@type='submit']")
WebElement save_user;

	public User_Mgmt_Page(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void administrationPage() {
		try {
			log.info("Cliciking on Administration module");
			wait.until(ExpectedConditions.visibilityOf(administration));
			administration.click();

			log.info("User clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		}
	}

	public void userMgmtPage() {
		try {
			administrationPage();
			log.info("Clicking on user management");
			wait.until(ExpectedConditions.visibilityOf(usermgmt));
			usermgmt.click();

			log.info("User is redirected to User management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("User is Not redirected to user management page!!!!");
		}
	}

	public void adduserPage() {
		try {

			userMgmtPage();

			log.info("Clicking on add user button");
			wait.until(ExpectedConditions.visibilityOf(adduser));
			adduser.click();

			log.info("Entering new user first name");
			wait.until(ExpectedConditions.visibilityOf(adduserfname));
			adduserfname.sendKeys(userdata);

			log.info("Entering new user last name");
			adduserlname.sendKeys(userdata);

			log.info("Selecting new user phone code");
			phonecode.click();
			wait.until(ExpectedConditions.visibilityOf(phonecodelist));
			phonecodelist.click();
			log.info("User's phone country code is: " + phonecode.getText());


			log.info("Entering new user phone number");
			wait.until(ExpectedConditions.visibilityOf(phonenumber));
			phonenumber.click();
//			phonenumber.sendKeys(GenerateData.generateRandomNumber(10));
//			log.info("User's phone number is: " + phonenumber.getText());
			phonenumber.sendKeys("9876543210");


			log.info("Entering new user email ID");
			email.sendKeys(userdata + "@dataseers.in");

			log.info("Entering new password");
			password.sendKeys(pwd);

			log.info("Entering confirm new password");
			cnfpassword.sendKeys(pwd);

			log.info("Selecting User's role as global admin");
			user_rolebox.click();
			wait.until(ExpectedConditions.visibilityOf(user_role));
			user_role.click();
			log.info("Selected User's role is: " + user_rolebox.getText());
			
		
			log.info("Selecting User's report group as global reports");
			reports_rolebox.click();
			wait.until(ExpectedConditions.visibilityOf(reports_role));
			reports_role.click();
			log.info("Selected User's role is: " + reports_rolebox.getText());
			
			log.info("Selecting User's report group as global reports");
			programs_rolebox.click();
			wait.until(ExpectedConditions.visibilityOf(programs_role));
			programs_role.click();
			log.info("Selected User's role is: " + programs_rolebox.getText());

			
		} catch (Exception e) {
			Assert.fail("Adding new user failed");
		}
	}

public void saveuser()
{
	try
		{
			log.info("Clicking on save button");
			save_user.click();
			log.info("New user is added successfully");
						
		}
	
	catch(Exception e)
		{
			log.error("could not create new user");	

		}
}
}
	
//
//	public void canceluser() {
//		try {
//			log.info("Clicking on cancel button");
//			cancel_user.click();
//			String newuser = addeduser.getText();
//
//			if (newuser.contentEquals(userdata)) {
//				Assert.fail("After clicking on cancel button new user has been added");
//			}
//
//			else {
//				log.info("After clicking on cancel button new user has not been added");
//			}
//
//		} catch (Exception e) {
//			Assert.fail("cancel button scenario failed");
//		}
//	}
//
//	public void deleteuserdb() throws SQLException {
//
//		try {
//
//			String deleteQuery = "DELETE FROM users WHERE name='" + userdata + "'";
//
//			Connection conn = null;
//			Statement stmt = null;
//			String host = prop.getProperty("db_host");
//			String user = prop.getProperty("db_user");
//			String pwd = prop.getProperty("db_pwd");
//
//			conn = (Connection) DriverManager.getConnection(host, user, pwd);
//			System.out.println("Connection is created successfully:");
//			stmt = (Statement) conn.createStatement();
//
//			stmt.executeUpdate(deleteQuery);
//			System.out.println("Record has been deleted successfully..................");
//		} catch (Exception e) {
//			log.error("Record update failed!!!");
//			Assert.fail();
//
//		}
//	}
//	}
