package com.dataseers.qa.pages.administration;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.util.TestUtil;

public class ClientMgmt extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 20);
	Actions actions = new Actions(d);
	JavascriptExecutor executor = (JavascriptExecutor) d;

//Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;

//client-management module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/client-management']")
	WebElement clientMgmtPage;

//add new client button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new client']")
	WebElement addClient;

//	 ************ Basic Client Details ************//

//add client name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_name']")
	WebElement addClientname;

//add  client doamin field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_domain']")
	WebElement addClientdomain;

	// add client scope field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_scope']")
	WebElement addClientscope;

	// add client report field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_report_folder']")
	WebElement addClientreport;

	// add client address Line1 field
	@CacheLookup
	@FindBy(xpath = "// *[@placeholder='Address line 1']")
	WebElement addressLine1;

	// add client address Line2 field
	@CacheLookup
	@FindBy(xpath = "// *[@placeholder='Address line 2']")
	WebElement addressLine2;

	// add client City field
	@CacheLookup
	@FindBy(xpath = "// *[@placeholder='City']")
	WebElement city;

	// add client State field
	@CacheLookup
	@FindBy(xpath = "// *[@placeholder='State']")
	WebElement state;

	// add client ZIP/Postal Code field
	@CacheLookup
	@FindBy(xpath = "// *[@placeholder='ZIP/Postal Code']")
	WebElement zipCode;

	// add client all drop-down fields list
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
	List<WebElement> clientDropdown;

	// add client TIN Code field
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='TIN']")
	WebElement tin;

//	 ************  Client Contact Details ************//

	// add client First Name field
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='First name'])[1]")
	WebElement firstName;

	// add client Last Name field
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Last name'])[1]")
	WebElement lastName;

	// add client email field
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Email'])[1]")
	WebElement email;

	// add client contact phone field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_contact_phone']")
	WebElement phoneNumber;

	// add client contact ext field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_contact_ext']")
	WebElement contactExt;

	// same billing details checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_same_billing_contact']")
	WebElement sameDetailsBox;

//	 ************  Client Encryption Details ************//

//column level encryption button
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_column_level_encryption']")
	WebElement colmnEncryption;

//	 ************  Client Dashboard configuration Details ************//	

//read user hash field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_read_user']")
	WebElement readHash;

//write user hash field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_write_user']")
	WebElement writeHash;

//admin user hash field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_admin_user']")
	WebElement adminHash;

//Client dashboard baseurl field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_dashboard_baseurl']")
	WebElement dshBaseUrl;

//Client dashboard account url field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_dashboard_account_url']")
	WebElement dshAccountUrl;

//Client dashboard person url field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_dashboard_person_url']")
	WebElement dshPersonUrl;

//Client dashboard SSN url field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_dashboard_ssn_url']")
	WebElement dshSsnUrl;

//Transaction search url field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_transaction_search_url']")
	WebElement tranSearchUrl;

//Account search url field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_account_search_url']")
	WebElement accountSearchUrl;

	// Active client button
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_client_is_active']")
	WebElement activeToggle;

	// save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveClient;

	// cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelClient;

//	// search button of report details page
//	@CacheLookup
//	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
//	WebElement searchByName;

	// added new client's name
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-column-sort'])[2]")
	WebElement addedClient;

	public ClientMgmt(WebDriver d) {
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

	public void clientMgmtPage() {
		try {
			administrationPage();
			log.info("Clicking on Client management");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			wait.until(ExpectedConditions.visibilityOf(clientMgmtPage));
			clientMgmtPage.click();

			log.info("User is redirected to Client management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("User is Not redirected to Client management page!!!!");
		}
	}

	public void addClientButton() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

			log.info("Clicking on add client button");
			wait.until(ExpectedConditions.elementToBeClickable(addClient));
			addClient.click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("User is redirected to Client management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("User is Not redirected to Client management page!!!!");
		}
	}

	public void clientBasicDetails(String clientdata) {
		try {
			log.info("Entering new client basic details");

			log.info("Entering new client name");
			wait.until(ExpectedConditions.elementToBeClickable(addClientname));
			addClientname.clear();
			addClientname.sendKeys(clientdata);

			log.info("Entering new client domain");
			wait.until(ExpectedConditions.elementToBeClickable(addClientdomain));
			addClientdomain.clear();
			addClientdomain.sendKeys(clientdata + ".in");

			log.info("Entering new client scope");
			wait.until(ExpectedConditions.elementToBeClickable(addClientscope));
			addClientscope.clear();
			addClientscope.sendKeys(clientdata);

			log.info("Entering new client report");
			wait.until(ExpectedConditions.elementToBeClickable(addClientreport));
			addClientreport.clear();
			addClientreport.sendKeys(clientdata);

			log.info("Entering new client addressline1");
			wait.until(ExpectedConditions.elementToBeClickable(addressLine1));
			addressLine1.clear();
			addressLine1.sendKeys(clientdata);

			log.info("Entering new client addressline2");
			wait.until(ExpectedConditions.elementToBeClickable(addressLine2));
			addressLine2.clear();
			addressLine2.sendKeys(clientdata);

			log.info("Entering new client city");
			wait.until(ExpectedConditions.elementToBeClickable(city));
			city.clear();
			city.sendKeys(clientdata);

			log.info("Entering new client state");
			state.clear();
			state.sendKeys(clientdata);

			log.info("Entering new client zipcode");
			wait.until(ExpectedConditions.elementToBeClickable(zipCode));
			zipCode.clear();
			zipCode.sendKeys(GenerateData.generateRandomNumber(6));

//			log.info("Selecting new client country");
//			wait.until(ExpectedConditions.elementToBeClickable(clientDropdown.get(0)));
//			clientDropdown.get(0).click();
//
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='add_client_country'])[2]")));
//			d.findElement(By.xpath("(//*[@id='add_client_country'])[2]")).sendKeys("United States Of America");

			log.info("Entering new client TIN");
			wait.until(ExpectedConditions.elementToBeClickable(tin));
			tin.clear();
			tin.sendKeys(GenerateData.generateRandomNumber(9));

//			log.info("Selecting new client TIN Type");
//			wait.until(ExpectedConditions.elementToBeClickable(clientDropdown.get(1)));
//			clientDropdown.get(1).click();
//
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='add_client_tin_type'])[2]")));
//			d.findElement(By.xpath("(//*[@id='add_client_tin_type'])[2]")).sendKeys("EIN");

		} catch (Exception e) {
			Assert.fail("Adding new client basic details failed");
		}
	}

	public void clientDropDowns() {
		try {
			log.info("Selecting new client dropdown details");

			log.info("Selecting new client country");
			wait.until(ExpectedConditions.elementToBeClickable(clientDropdown.get(0)));
			clientDropdown.get(0).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='add_client_country'])[2]")));
			d.findElement(By.xpath("(//*[@id='add_client_country'])[2]")).sendKeys("United States Of America");

			log.info("Selecting new client TIN Type");
			wait.until(ExpectedConditions.elementToBeClickable(clientDropdown.get(1)));
			clientDropdown.get(1).click();

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='add_client_tin_type'])[2]")));
			d.findElement(By.xpath("(//*[@id='add_client_tin_type'])[2]")).sendKeys("EIN");

		} catch (Exception e) {
			Assert.fail("Adding new client basic details failed");
		}
	}

	public void clientContactDetails(String clientdata) {
		try {
			log.info("Entering new client Contact details");

			log.info("Entering new client First name");
			wait.until(ExpectedConditions.elementToBeClickable(firstName));
			firstName.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
			firstName.sendKeys(clientdata);

			log.info("Entering new client Last name");
			wait.until(ExpectedConditions.elementToBeClickable(lastName));
			lastName.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
			lastName.sendKeys(clientdata);

			log.info("Entering new client Email");
			wait.until(ExpectedConditions.elementToBeClickable(email));
			email.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
			email.sendKeys(prop.getProperty("userName"));

			log.info("Entering new client Phone Number");
			wait.until(ExpectedConditions.elementToBeClickable(phoneNumber));
			phoneNumber.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
			String phone = String.valueOf(TestUtil.getRandomInteger(999999999, 111111111));
			phoneNumber.sendKeys("1" + phone);

			log.info("Entering new client ext");
			wait.until(ExpectedConditions.elementToBeClickable(contactExt));
			contactExt.sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
			contactExt.sendKeys(GenerateData.generateRandomNumber(3));

		} catch (Exception e) {
			Assert.fail("Adding new client contact details failed");
		}
	}

	public void sameBillingBox() {
		try {
//			TestUtil.scrollDown();
			log.info("Clicking billing on same as Client conact checkbox");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Same as Client Contact']")));
			d.findElement(By.xpath("//*[text()='Same as Client Contact']")).click();
		} catch (Exception e) {
			Assert.fail("Clicking billing on same as Client conact checkbox scenario failed");

		}
	}

	public void dashBoardConfig() {
		try {
			log.info("Entering dashboard Configuration");
			log.info("Entering dashboard base url");
			wait.until(ExpectedConditions.visibilityOf(dshBaseUrl));
			dshBaseUrl.clear();
			dshBaseUrl.sendKeys(prop.getProperty("demourl"));

		} catch (Exception e) {
			Assert.fail("Entering dashboard configuration scenario failed");

		}
	}

	public void clickActiveToggle() {
		try {
			log.info("Clicking on save button");
			activeToggle.click();

			log.info("Clicked Active Toggle successfully!!!!");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

		} catch (Exception e) {
			Assert.fail("Active toggle Click scenario failed");

		}
	}

	public void saveClient() {
		try {
			log.info("Clicking on save button");
			saveClient.click();

			log.info("client saved successfully!!!!");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

		} catch (Exception e) {
			Assert.fail("Save  client button Click scenario failed");

		}
	}

	public void searchClient(String searchData) {
		try {
			d.navigate().refresh();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Searching client");
			WebElement searchByName = d.findElement(By.xpath("(//*[@title='Filter menu'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchByName));
			searchByName.click();

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.visibilityOf(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			searchBtn.click();

		} catch (Exception e) {
			log.error("Search client failed");
		}
	}

	public void verifyClient(String verifyData) {
		try {
			searchClient(verifyData);
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			String newclient = addedClient.getText();

			if (newclient.contentEquals(verifyData)) {

				log.info("Newly added client is displayed in a client list: " + newclient);
				wait.until(ExpectedConditions.elementToBeClickable(addedClient));
				addedClient.click();
				wait.until(ExpectedConditions.visibilityOf(addedClient));
				log.info("Added client is " + addedClient.getText());
			}

			else {
				log.error("Newly added client is not displayed in a client list: " + newclient);
				Assert.fail("verify added client scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("verify added client scenario failed");

		}
	}

	public void editClient(String data) {
		try {

			log.info("Editing already existing  client details");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			d.findElement(By.linkText(data)).click();

			log.info("Clicking on edit button");
			WebElement editBtn = d.findElement(By.xpath("//*[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']"));
			wait.until(ExpectedConditions.visibilityOf(editBtn));
			editBtn.click();

//			addClientname.clear();
//			addClientname.sendKeys(data);

		} catch (Exception e) {
			Assert.fail("edit client scenario failed");
		}
	}

//	public void cancelClient(String clientdata) {
//		try {
//			log.info("Clicking on cancel button");
//			cancelClient.click();
//			String newclient = addedClient.getText();
//
//			if (newclient.contentEquals(clientdata)) {
//				Assert.fail("After clicking on cancel button new client has been added");
//			}
//
//			else {
//				log.info("After clicking on cancel button new client has not been added");
//			}
//
//		} catch (Exception e) {
//			Assert.fail("cancel button scenario failed");
//		}
//	}

	public void deleteClientdb(String clientdata) throws SQLException {
		String deleteQuery = "DELETE FROM clients WHERE name='" + clientdata + "'";
		TestUtil.deleteQuerykeydb(deleteQuery);

	}
}
