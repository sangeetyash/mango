package com.dataseers.qa.pages.administration;

import java.net.InetAddress;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
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

public class ApiKeys extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String apikeydata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	String ranIpAddress = GenerateData.generateRandomIP();
	JavascriptExecutor executor = (JavascriptExecutor) d;

	// Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;

	// API-keys management page
	@CacheLookup
	@FindBy(xpath = "//*[@href='/manage-api-keys']")
	WebElement apiKeysPage;

	// Add new api button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new api key']")
	WebElement addApiBtn;

	// Add api-key name field
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Key name' and @id='add_api_key_name']")
	WebElement apiKeyName;

	// Encrypted api-key field
	@CacheLookup
	@FindBy(xpath = "//*[@type='password']")
	WebElement apiKey;

	// Never expire toggle
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-switch-inner'])[1]")
	WebElement neverExpire;

	// Expiry Date dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Select date' and @class='ant-calendar-picker-input ant-input']")
	WebElement expiryDate;

	// Select role dropdown
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-select-selection__placeholder'])[1]")
	WebElement selectRole;

	// Select report group dropdown
	@CacheLookup
	@FindBy(xpath = "(//*[ @class='ant-select-selection__placeholder'])[2]")
	WebElement selectReport;

	// Select program group dropdown
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-select-selection__placeholder'])[3]")
	WebElement selectProgram;

	// Real-time Ingest toggle
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-switch-inner'])[2]")
	WebElement realTimeIngest;

	// IP Restrictions radio buttons list
	@CacheLookup
	@FindBy(xpath = "//*[@type='radio']")
	List<WebElement> ipRestrictions;

	// Add field button(IP addresses)
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn ant-btn-dashed']")
	WebElement addField;

	// IP Restrictions radio buttons list
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='IP Address']")
	List<WebElement> ipAddress;

	// From IP Address field
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='From IP Address']")
	WebElement fromIp;

	// To IP Address field
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='To IP Address']")
	WebElement toIp;

	// save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveApi;

	// cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelApi;

	// search button of report details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchByName;

	// added new apikey name
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-column-sort'])[2]")
	WebElement addedapikey;

	public ApiKeys(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void administrationPage() {
		try {
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			log.info("Cliciking on Administration module");
			wait.until(ExpectedConditions.visibilityOf(administration));
			administration.click();
			Thread.sleep(1000);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			log.info("apikey clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		}
	}

	public void apikeyMgmtPage() {
		try {
			administrationPage();
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			log.info("Clicking on apikey management");
			wait.until(ExpectedConditions.elementToBeClickable(apiKeysPage));
			Point point = apiKeysPage.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			JavascriptExecutor executor = (JavascriptExecutor) d;
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", apiKeysPage);
			log.info("apikey is redirected to apikey management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("apikey is Not redirected to apikey management page!!!!");
		}
	}

	public void manageApiKeys(int expiry) {
		try {

			log.info("Clicking on add API button");
			wait.until(ExpectedConditions.visibilityOf(addApiBtn));
			addApiBtn.click();

			log.info("Entering new API Key name");
			wait.until(ExpectedConditions.visibilityOf(apiKeyName));
			apiKeyName.sendKeys(apikeydata);

			if (expiry == 0) {
				log.info("Selecting current date as Expiry date");
				wait.until(ExpectedConditions.visibilityOf(expiryDate));
				expiryDate.click();
				actions.sendKeys(expiryDate, LocalDate.now().toString(), Keys.ENTER).perform();
			} else {
				log.info("Clicking on never expire toggle");
				wait.until(ExpectedConditions.visibilityOf(neverExpire));
				neverExpire.click();
			}
		} catch (Exception e) {
			Assert.fail("Adding new apikey details failed");
		}
	}

	public void permissions(String role, String report, String program) {
		try {

			log.info("Selecting role as global admin");
			wait.until(ExpectedConditions.visibilityOf(selectRole));
			selectRole.click();
			actions.sendKeys(selectRole, role, Keys.ENTER).perform();

			log.info("Selecting reports as global reports");
			wait.until(ExpectedConditions.visibilityOf(selectReport));
			selectReport.click();
			actions.sendKeys(selectReport, report, Keys.ENTER).perform();

			log.info("Selecting programs as global programs");
			wait.until(ExpectedConditions.visibilityOf(selectProgram));
			selectProgram.click();
			actions.sendKeys(selectProgram, program, Keys.ENTER).perform();

		} catch (Exception e) {
			Assert.fail("Adding permissions failed");
		}
	}

	public void realTimeIngest(int validation, int behaveType) {
		try {
			log.info("Selecting Real-Time Ingest");
			wait.until(ExpectedConditions.visibilityOf(realTimeIngest));
			realTimeIngest.click();

			WebElement validationLevel = d.findElement(By.xpath("(//*[@class='ant-select-selection__rendered'])[4]"));
			validationLevel.click();
			if (validation == 0) {
				actions.sendKeys(Keys.ENTER).perform();

			} else {
				for (int i = 0; i < validation; i++) {
					actions.sendKeys(Keys.ARROW_DOWN).perform();
				}
				actions.sendKeys(Keys.ENTER).perform();
			}
			log.info("Selecting validation behaviour as Reject");
			if (validation == 3) {
				WebElement valBehaviour = d.findElement(By.xpath("(//*[@class='ant-select-selection__rendered'])[5]"));
				valBehaviour.click();
				if (behaveType == 1) {
					actions.sendKeys(Keys.ARROW_DOWN).perform();
					actions.sendKeys(Keys.ENTER).perform();
				} else {
					log.info("Default validation behaviour: Replace");

				}
			} else {
				log.info("validation behaviour not applicable");

			}
		} catch (Exception e) {
			Assert.fail("Real-Time Ingest selection failed");
		}
	}

	public void ipRestrictions(int ipValidation) {
		try {

			if (ipValidation == 0) {
				ipRestrictions.get(ipValidation).click();
			} else if (ipValidation == 1) {
				ipRestrictions.get(ipValidation).click();
				addField.click();
				log.info("First(current system) Ip address is: " + InetAddress.getLocalHost().getHostAddress());
				TestUtil.scrollDown();
				addField.click();
				wait.until(ExpectedConditions.visibilityOf(ipAddress.get(0)));
				ipAddress.get(0).sendKeys(InetAddress.getLocalHost().getHostAddress());
				wait.until(ExpectedConditions.visibilityOf(ipAddress.get(1)));
				log.info("second Ip address is: " + ranIpAddress);
				ipAddress.get(1).sendKeys(ranIpAddress);

			} else if (ipValidation == 2) {
				ipRestrictions.get(ipValidation).click();

				log.info("Entering From Ip address is: ");
				wait.until(ExpectedConditions.visibilityOf(fromIp));
				fromIp.sendKeys("192.168.0.2");

				wait.until(ExpectedConditions.visibilityOf(toIp));
				log.info("Entering To Ip address is: ");
				toIp.sendKeys("192.168.0.31");

			} else {
				log.info("unable to click on any IP restriction option");
			}
		} catch (Exception e) {
			Assert.fail("Ip restriction type selection failed");
		}
	}

	public void saveApiKey() {
		try {
			log.info("Clicking on save button");
			saveApi.click();

			log.info("New apikey added successfully!!!!");

			log.info("Verifying that new apikey has been added!!!!");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			verifyApiKey();
			
		} catch (Exception e) {
			Assert.fail("Save new apikey scenario failed");

		}
	}

	public void cancelApiKey() {
		try {
			log.info("Clicking on cancel button");
			cancelApi.click();

			String newapikey = addedapikey.getText();

			if (newapikey.contentEquals(apikeydata)) {
				Assert.fail("After clicking on cancel button new apikey has been added");
			}

			else {
				log.info("After clicking on cancel button new apikey has not been added");
			}

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}

	public void deleteApiKeyDB() {
		try {
			log.info("Deleting newly added API key from DB");
			String deleteQuery = "DELETE FROM api_keys WHERE name='" + apikeydata + "'";
			TestUtil.deleteQuerykeydb(deleteQuery);

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}

	public void editApiKey(String data) {
		try {
			log.info("Editing already existing recent API key details");
			searchApiKey(data);
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			d.findElement(By.linkText(data)).click();

			log.info("Clicking on edit button");
			WebElement editBtn = d.findElement(By.xpath("//*[@class='ant-btn m-r-10 ant-btn-primary']"));
			wait.until(ExpectedConditions.visibilityOf(editBtn));
			editBtn.click();

			wait.until(ExpectedConditions.visibilityOf(apiKey));
			log.info("Clicking on encrypted api-key Eye symbol");
			d.findElement(By.xpath("//*[@class='anticon anticon-eye-invisible ant-input-password-icon']")).click();

			apiKeyName.clear();
			apiKeyName.sendKeys(apikeydata);
			saveApi.click();
			
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("updated api key name is:" + apikeydata);			
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			verifyApiKey();

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}

	public void searchApiKey(String searchkey) {
		try {
			
			log.info("Searching api key");
			wait.until(ExpectedConditions.elementToBeClickable(searchByName));
			searchByName.click();

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.visibilityOf(searchbox));
			actions.sendKeys(searchbox, searchkey).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			searchBtn.click();
			
		} catch (Exception e) {
			log.error("Search api key failed");
		}
	}

	public void verifyApiKey() {
		try {
			searchApiKey(apikeydata);
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			String newapikey = addedapikey.getText();

			if (newapikey.contentEquals(apikeydata)) {

				log.info("Newly added apikey is displayed in a apikey list: " + newapikey);
				wait.until(ExpectedConditions.elementToBeClickable(addedapikey));
				addedapikey.click();
				wait.until(ExpectedConditions.visibilityOf(addedapikey));
				log.info("Added APi key is " + addedapikey.getText());
			}

			else {
				log.info("Newly added apikey is not displayed in a apikey list: " + newapikey);
				Assert.fail("verify added apikey scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("verify added apikey scenario failed");

		}
	}

}