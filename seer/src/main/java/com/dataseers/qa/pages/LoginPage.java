package com.dataseers.qa.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

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

public class LoginPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 20);
//	ArrayList<String> cluster = new ArrayList<>();
//	ArrayList<String> datastats = new ArrayList<>();
	
	@CacheLookup
	@FindBy(id="details-button")
	WebElement Advanced;
	
	@CacheLookup
	@FindBy(id="proceed-link")
	WebElement Proceed;
	
	//username
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Email']")
	WebElement username;

	//password
	@CacheLookup
	@FindBy(xpath = "//*[@type='password']")
	WebElement password;

	//login button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement login;

	//login button
	@CacheLookup
	@FindBy(xpath = "//*[@class='logo-img m-b-20']")
	WebElement dsLogo;

	// invalid user
	@CacheLookup
	@FindBy(css = "div.ant-row:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)")
	WebElement invaliduser;

//invalid PASSW0RD
	@CacheLookup
	@FindBy(xpath = "//*[@aria-label='icon: close-circle']")
	WebElement invalidpass;
//*[@class='ant-message-custom-content ant-message-error']

//logged in user details
	@CacheLookup
	@FindBy(xpath = "//*[@class='role-name-css']")
	WebElement verifylogin;

//logout button 
	@CacheLookup
	@FindBy(xpath = "//*[@title='Logout']\r\n")
	WebElement logout;

//seedportal-login header text
	@CacheLookup
	@FindBy(xpath = "//*[@class='text-center text-white padding-10']")
	WebElement seedportal_login;

//dataseers copyright 
	@CacheLookup
	@FindBy(xpath = "//*[@class='text-center text-white']")
	WebElement copyright;

//DS title
	@CacheLookup
	@FindBy(xpath = "/html/head/title")
	WebElement DStitle;

//locked account error
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-alert ant-alert-error ant-alert-with-description ant-alert-no-icon']")
	WebElement acc_locked;

//locked account error description
	@CacheLookup
	@FindBy(xpath = "//*[@id='root']/div/form/div/div/div/div/div/span[2]")
	WebElement acc_locked_desc;

//locked account error title
	@CacheLookup
	@FindBy(xpath = "//*[@id='root']/div/form/div/div/div/div/div/span[1]")
	WebElement acc_locked_error;

//home page data statistics
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-col ant-col-12']")
	WebElement hmscrap;

	Actions actions = new Actions(d);

	public LoginPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void login(String user,String pass)  
	{
	try
	{
	log.info("Click on Advanced");
	
	String propUrl = prop.getProperty("url");
	if(propUrl.equalsIgnoreCase(prop.getProperty("SecuredUrl"))){
	
	}
	else
	{
		Thread.sleep(5000);
		Advanced.click();
		Proceed.click();
	}
	
//	Advanced.click();
//	Proceed.click();
	
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	log.info("Enter Username"); 
	username.sendKeys(user);
	wait.until(ExpectedConditions.visibilityOf(username));
	log.info("Enter Passw0rd");
	password.sendKeys(pass);
	wait.until(ExpectedConditions.visibilityOf(password));
	log.info("Clicking on login button");
	login.click();  
	}
	catch(Exception e)
	{
	log.error("login failed");
	Assert.fail();	
	}	
	}	

	public void verify_successful_login() {
		try {
			wait.until(ExpectedConditions.visibilityOf(verifylogin));
			verifylogin.isDisplayed();
			log.info("User logged in successfully!!!");
		} catch (Exception e) {
			log.error("User login failed");
			Assert.fail();

		}
	}

	public void logout() {
		try {
			wait.until(ExpectedConditions.visibilityOf(verifylogin));
			actions.moveToElement(verifylogin).build().perform();

			wait.until(ExpectedConditions.visibilityOf(logout));
			logout.click();
		} catch (Exception e) {
			log.error("User login failed");
			Assert.fail();

		}
	}

	public void verify_loginpage_text() {
		try {
			wait.until(ExpectedConditions.visibilityOf(dsLogo));
			dsLogo.isDisplayed();
			log.info("Dataseers Logo found:");
			wait.until(ExpectedConditions.visibilityOf(seedportal_login));
			String actlogin = seedportal_login.getText();
			log.info("expected login title: " + actlogin);

			String explogin = "SeerPortal - Login";
			String actcopyright = copyright.getText();
			String expcopyright = "� 2017-2020 DataSeers. All rights reserved.";
			log.info("expected copyright title: " + actcopyright);

			if (explogin.contentEquals(actlogin) && expcopyright.equals(actcopyright)) {
				log.info("Valid Dataseers Login and copyright text found:");
			} else {
				log.error("InValid Dataseers Login and copyright text found:");

			}
		} catch (Exception e) {
			log.error("Dataseers Login page span text or logo Not found:");
			Assert.fail();

		}
	}

	public void invaliduser() {
		try {
			wait.until(ExpectedConditions.visibilityOf(invaliduser));
			log.info(invaliduser.getText());
			log.info("Got Invalid username error");
		} catch (Exception e) {
			log.error("Invalid username error Not found in text span");
			Assert.fail();

		}
	}

	public void invalidpwd() {
		try {
			wait.until(ExpectedConditions.visibilityOf(invalidpass));
			log.info(invalidpass.getText());
			log.info("Got Invalid password error");

		} catch (Exception e) {
			log.error("Invalid password error Not found in text span");
			Assert.fail();

		}
	}

	public void lockedAccount() {
		try {
			wait.until(ExpectedConditions.visibilityOf(acc_locked));
			if (acc_locked.isDisplayed()) {
				log.info("Got Account locked error");

				String explockheader = "ACCOUNT LOCKED:";
				String actlockheader = acc_locked_error.getText();

				String explockdesc = "There have many failed attempts to login to this account. Please contact your administrator to reset your login information.";
				String actlockdesc = acc_locked_desc.getText();

				log.info("expected account lock description: " + actlockdesc);

				if (explockheader.contentEquals(actlockheader) && explockdesc.equals(actlockdesc)) {
					log.info("Valid Dataseers user account lock description text found:");
					setloginAttempts();
				} else {
					log.error("InValid Dataseers user account lock description:");
					Assert.fail();
				}
			}

		} catch (Exception e) {
			log.error("Dataseers user account lock description not found");
			Assert.fail();

		}
	}

	public void clearlogin() {
		try {
			log.info("Clear Username");
			username.click();
			username.clear();

			log.info("Clear Password");
			password.click();
			password.clear();
			Thread.sleep(1000);
		} catch (Exception e) {
			log.error("Clear Login failed");
			Assert.fail();

		}
	}

	public void setloginAttempts() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String host = dbprop.getProperty("db_host");
		String user = dbprop.getProperty("db_user");
		String passwd = dbprop.getProperty("db_pwd");
		conn = DriverManager.getConnection(host, user, passwd);
		log.info("Connection is created successfully:");
		stmt = conn.createStatement();
		try {

			stmt.executeUpdate(dbprop.getProperty("loginReset"));

			ResultSet rs = stmt.executeQuery(dbprop.getProperty("loginAttempt"));

			// iterate through the java resultset
			while (rs.next()) {
				int loginAttempts = rs.getInt("login_attempts_remaining");

				// print the results
				log.info("Remaining login attempts are: " + loginAttempts);
			}
			rs.close();
		} catch (Exception e) {
			log.info("failed");

		} finally {

			stmt.close();
			conn.close();

		}
	}
}