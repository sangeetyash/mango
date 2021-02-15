package com.dataseers.qa.pages.administration;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import com.dataseers.qa.util.TestUtil;

public class UserMgmt extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String userdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	JavascriptExecutor executor = (JavascriptExecutor) d;

//Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;
	
//user-management module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/manage-users']")
	WebElement usermgmtpage;
	
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
	@FindBy(xpath = "//*[@id='add_user_phone_code']")
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
	WebElement userRole;
	

	// users reports dropdown
	@CacheLookup
	@FindBy(xpath = "(//*[@id='add_user_report_group'])[1]")
	WebElement userReports;
	
	// users program group dropdown
	@CacheLookup
	@FindBy(xpath = "(//*[@id='add_user_program_group'])[1]")
	WebElement userProgramGroup;

	
	// users email notification toggle
	@CacheLookup @FindBy(xpath="//*[@id='add_user_email_notification']")
	WebElement emailNotify;

	// users account status toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_is_active']")
	WebElement accountStatus;

	// is user deleted toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_user_is_deleted']")
	WebElement is_deleted;

	// 2FA login status progress bar
	@CacheLookup
	@FindBy(xpath = "//*[@aria-label='icon: close-circle']")
	WebElement FApending;

	// available nodes list
	@CacheLookup
	@FindBy(xpath = "//*[@type='checkbox']")
	List<WebElement> nodelist;

	// selected node details
	@CacheLookup
	@FindBy(xpath = "//*[@id='root']/section/section/main/div/div/div/form/div[5]/div/div/div/div/div/div/div/table/tbody/tr/td[2]")
	WebElement selectedNode;

	// is admin toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='cluster-2']")
	WebElement isAdmin;

	// save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveUser;

	// search button of report details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchByName;

	// cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelUser;

	// added new user name
	@CacheLookup
	@FindBy(xpath = "//*[@id='root']/section/section/main/div/div/div/div[3]/div/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]")
	WebElement addeduser;

	public UserMgmt(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void administrationPage() {
		try {
			log.info("Cliciking on Administration module");
			wait.until(ExpectedConditions.visibilityOf(administration));
			administration.click();
			log.info("user clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		}
	}

	public void userMgmtPage() {
		try {
			administrationPage();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Clicking on user management");
			wait.until(ExpectedConditions.elementToBeClickable(usermgmtpage));
			usermgmtpage.click();
			log.info("user is redirected to user management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("user is Not redirected to user management page!!!!");
		}
	}

	public void addUserButton() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Clicking on add user button");
			wait.until(ExpectedConditions.visibilityOf(adduser));
			adduser.click();
		} catch (Exception e) {
			Assert.fail("Unable to click on Add user button!!!!");
		}
	}

	public void adduserDetails(String userName,String roleName,String reportGroupName,String programGroupName) {
		try {
			log.info("Entering new user first name");
			wait.until(ExpectedConditions.visibilityOf(adduserfname));
			adduserfname.sendKeys(userName);

			log.info("Entering new user last name");
			adduserlname.sendKeys(userdata);

			log.info("Selecting new user phone code");
			phonecode.click();

			wait.until(ExpectedConditions.visibilityOf(phonecodelist));
			phonecodelist.click();
			log.info("user's phone country code is: " + phonecode.getText());

			log.info("Entering new user phone number");
			wait.until(ExpectedConditions.visibilityOf(phonenumber));
			phonenumber.click();
			phonenumber.sendKeys(GenerateData.generateRandomNumber(10));

			Thread.sleep(2000);
			
			log.info("Entering new user email ID");
			email.sendKeys(userdata + "@dataseers.in");

			log.info("Entering new password");
			password.sendKeys(pwd);

			log.info("Entering confirm new password");
			cnfpassword.sendKeys(pwd);

			Thread.sleep(2000);
			
			wait.until(ExpectedConditions.elementToBeClickable(userRole));
			log.info("Selecting user's Role");
			userRole.click();
			actions.sendKeys(userRole, roleName, Keys.ENTER).perform();

			log.info("Selecting user's report group");
			wait.until(ExpectedConditions.elementToBeClickable(userReports));
			userReports.click();
			actions.sendKeys(userReports, reportGroupName, Keys.ENTER).perform();


			wait.until(ExpectedConditions.visibilityOf(userProgramGroup));
			log.info("Selecting user's program group");
			userProgramGroup.click();
			actions.sendKeys(userProgramGroup, programGroupName, Keys.ENTER).perform();

	

			emailNotify.click();
			accountStatus.click();
			is_deleted.click();
			TestUtil.scrollDown();

			for (WebElement node : nodelist.subList(1, nodelist.size())) {
				log.info(nodelist.size());
				node.click();
				wait.until(ExpectedConditions.visibilityOf(isAdmin));

			}
			isAdmin.click();
			log.info(selectedNode.getText());

		} catch (Exception e) {
			Assert.fail("Adding new user failed");
		}
	}

	public void saveuser() {
		try {
			log.info("Clicking on save button");
			wait.until(ExpectedConditions.elementToBeClickable(saveUser));

			saveUser.click();

			log.info("Clciked on save button successfully!!!!");

		} catch (Exception e) {
			Assert.fail("Clicking on Save button scenario failed");

		}
	}

	public void searchUser(String userName) {
		try {
			log.info("Searching user!!!!");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			wait.until(ExpectedConditions.visibilityOf(searchByName));
			searchByName.click();

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search first_name']"));
			wait.until(ExpectedConditions.visibilityOf(searchbox));
			actions.sendKeys(searchbox, userName).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			searchBtn.click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

		} catch (Exception e) {
			Assert.fail("search user scenario failed");
		}
	}

	public void verifyUser(String userName) {
		try {
			log.info("Verifying that  user has been added or updated!!!!");

			wait.until(ExpectedConditions.visibilityOf(addeduser));

			String newuser = addeduser.getText();

			if (newuser.contentEquals(userName)) {

				log.info("User is displayed in a user list: " + newuser);
			}

			else {
				log.info("User is Not displayed in a user list: " + newuser);
				Assert.fail("Verify User scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("verify User scenario failed");
		}
	}

	public void canceluser() {
		try {
			log.info("Clicking on cancel button");
			cancelUser.click();
			String newuser = addeduser.getText();

			if (newuser.contentEquals(userdata)) {
				Assert.fail("After clicking on cancel button new user has been added");
			}

			else {
				log.info("After clicking on cancel button new user has not been added");
			}

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}

	public void deleteUserdb() throws SQLException {
		String deleteQuery = "DELETE FROM users WHERE name='" + userdata + "'";
		TestUtil.deleteQuerykeydb(deleteQuery);

	}

}