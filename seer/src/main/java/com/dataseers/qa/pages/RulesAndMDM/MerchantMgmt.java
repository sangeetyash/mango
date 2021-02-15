package com.dataseers.qa.pages.RulesAndMDM;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
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
import com.dataseers.qa.util.SeerportalAPI;
import com.dataseers.qa.util.TestUtil;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MerchantMgmt extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String Merchantdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	SeerportalAPI SeerportalAPI = new SeerportalAPI();
	JavascriptExecutor executor = (JavascriptExecutor) d;

	// Rules & MDM module
	@CacheLookup
	@FindBy(xpath = "//*[text()='Rules & MDM']")
	WebElement rulesMdm;

	// merchant-management module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/merchant-master']")
	WebElement merchntMgmt;

	// add new merchant button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Create new merchant']")
	WebElement addMerchantButton;

	// add new merchant id
	@CacheLookup
	@FindBy(xpath = "//*[@id='manage_merchant_merchant_id']")
	WebElement addMerchantID;

	// add new merchant name
	@CacheLookup
	@FindBy(xpath = "//*[@id='manage_merchant_name']")
	WebElement addMerchantName;

	// add new merchant URL
	@CacheLookup
	@FindBy(xpath = "//*[@id='manage_merchant_url']")
	WebElement addMerchantUrl;

	// add new merchant DS_MID
	@CacheLookup
	@FindBy(xpath = "//*[@id='manage_merchant_DS_MID']")
	WebElement addMerchantDsMID;

	// add new merchant DS_MID
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection ant-select-selection--multiple']")
	WebElement addMCC;

	// add synonym list
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Synonym']")
	List<WebElement> synonym;

	// add synonym Button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn ant-btn-dashed']")
	WebElement addSynonymBtn;

	// add merchant location button
	@CacheLookup
	@FindBy(xpath = "//*[@class='anticon anticon-plus-circle-o cursor']")
	WebElement addMerchentLocation;

	// add merchant location DS LID
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='DS LID']")
	WebElement addDSLID;

	// add merchant location ID
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Location Id']")
	WebElement addlocationID;

	// add merchant location name
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Location name']")
	WebElement addlocationName;

	// add merchant location Address line 1
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Address line 1']")
	WebElement addressLine1;

	// add merchant location Address line 2
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Address line 2']")
	WebElement addressLine2;

	// add merchant location City
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='City']")
	WebElement addCity;

	// add merchant location State
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='State']")
	WebElement addState;

	// add merchant location country drop-down
	@CacheLookup
	@FindBy(xpath = "//*[@title='Select country']")
	WebElement addCountry;

	// add merchant location country drop-down input field
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-search__field' and @id='manage_merchant_locations[0].country']")
	WebElement addCountryInput;

	// add merchant location ZIP
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Zip']")
	WebElement addZip;

	// add merchant location phone number
	@CacheLookup
	@FindBy(xpath = "//*[@id='manage_merchant_locations[0].phone_number']")
	WebElement addPhone;

	// add merchant location URL
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='URL']")
	WebElement addUrl;

	// save location button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']")
	WebElement saveLocation;

	// save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveBtn;

	// cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelBtn;

	// Edit Button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']")
	WebElement editBtn;

	// search button of report details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchByName;

	// added new Merchant name
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-column-sort'])[1]")
	WebElement addedMerchant;

	// all isdeleted toggles on Merchant management landing page
	@CacheLookup
	@FindBy(xpath = "//*[@Merchant='switch']")
	List<WebElement> isDeletedToggle;

	public MerchantMgmt(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void rulesMdmModule() {
		try {
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			log.info("Cliciking on Rules & Mdm module");
			wait.until(ExpectedConditions.visibilityOf(rulesMdm));
			rulesMdm.click();
			Thread.sleep(1000);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			log.info("Clicked on to Rules & Mdm successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Rules & Mdm module not found!!!!");
		}
	}

	public void merchantMgmtPage() {
		try {
			rulesMdmModule();
			log.info("Clicking on merchant Mgmt Page");
			wait.until(ExpectedConditions.visibilityOf(merchntMgmt));
			Point point = merchntMgmt.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", merchntMgmt);
			log.info("User is redirected to Merchant Management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("User is Not redirected to Merchant Management page!!!!");
		}
	}

	public void addMerchantButton() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Clicking on add Merchant button");
			wait.until(ExpectedConditions.elementToBeClickable(addMerchantButton));
			addMerchantButton.click();
		} catch (Exception e) {
			Assert.fail("Clicking on add Merchant button failed!!!");
		}
	}

	public void merchantDetails(String merchantName) {
		try {
			WebElement[] merchantDetails = { addMerchantName, addMerchantID, addMerchantDsMID };

			log.info("Entering data into Merchant Details fields");
			wait.until(ExpectedConditions.elementToBeClickable(addMerchantName));

			if (addMerchantName.getAttribute("value").isEmpty() && addMerchantUrl.getAttribute("value").isEmpty()) {
				for (WebElement addMerchant : merchantDetails) {

					wait.until(ExpectedConditions.elementToBeClickable(addMerchant));
					addMerchant.sendKeys(merchantName);
					log.info("new Merchant details added in : " + addMerchant.getAttribute("id"));
				}
				wait.until(ExpectedConditions.elementToBeClickable(addMerchantUrl));
				log.info("Entering a new Merchant URL");
				addMerchantUrl.sendKeys("https://" + merchantName + ".com");

			}

		} catch (Exception e) {
			Assert.fail("entering Merchant details failed");
		}

	}

	public void editMerchantDetails(String merchantName) {
		try {
			WebElement[] merchantDetails = { addMerchantName, addMerchantID, addMerchantDsMID };
			log.info("Editing data into Merchant Details fields");
			wait.until(ExpectedConditions.elementToBeClickable(addMerchantName));
			for (WebElement editMerchant : merchantDetails) {
				wait.until(ExpectedConditions.elementToBeClickable(editMerchant));
				editMerchant.click();
				editMerchant.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
				editMerchant.sendKeys(merchantName);
				log.info("Merchant details edited in: " + editMerchant.getAttribute("id"));
			}
			log.info("Editing an existing Merchant URL");
			wait.until(ExpectedConditions.elementToBeClickable(addMerchantUrl));
			addMerchantUrl.click();
			addMerchantUrl.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
			addMerchantUrl.sendKeys("https://" + merchantName + ".com");

		} catch (Exception e) {
			Assert.fail("Editing Merchant details failed");
		}

	}

	public void mccDropDown() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(addMCC));
			addMCC.click();
			log.info("Selecting Merchant mcc failed!!!");
			List<String> mccList = SeerportalAPI.getMccAPI();
			for (int i = 0; i < mccList.size(); i++) {
				WebElement mccName = d.findElement(By.xpath("//*[text()='" + mccList.get(i) + "']"));
				wait.until(ExpectedConditions.elementToBeClickable(mccName));
				mccName.click();
			}
			addMCC.click();

		} catch (Exception e) {
			Assert.fail("Selecting Merchant mcc failed!!!");
		}
	}

	public void synonyms(String synonymName) {
		try {

			if (synonym.get(0).getAttribute("value").isEmpty()) {
				addSynonym(synonymName);
			} else {
				log.info("Deleting old synonym and addinge new:");
				List<WebElement> deleteSynonym = d.findElements(By.xpath("//*[@data-icon='minus-circle']"));
				int deleteSynonymCount = synonym.size();
				log.info(deleteSynonymCount);
				for (int i = 1; i < deleteSynonymCount; i++) {
					wait.until(ExpectedConditions.elementToBeClickable(deleteSynonym.get(i)));
					deleteSynonym.get(i).click();
				}

				addSynonym(synonymName);
			}
		} catch (

		Exception e) {
			Assert.fail("Adding Synonym scenario failed");
		}
	}

	public void addSynonym(String synonymName) {
		try {
			log.info("Adding new synonym");
			wait.until(ExpectedConditions.elementToBeClickable(addSynonymBtn));
			addSynonymBtn.click();

			wait.until(ExpectedConditions.elementToBeClickable(synonym.get(0)));
			synonym.get(0).click();
			synonym.get(0).sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
			synonym.get(0).sendKeys(synonymName);

			WebElement addSynonym2 = d.findElement(By.xpath("(//*[@placeholder='Synonym'])[2]"));
			wait.until(ExpectedConditions.elementToBeClickable(addSynonym2));
			addSynonym2.sendKeys(synonymName);

			partialToggles();
		} catch (Exception e) {
			Assert.fail("Adding new synonym failed!!!");
		}
	}

	public void partialToggles() {
		try {
			Thread.sleep(1000);
			log.info("Turning on partial toggles");
			WebElement partialToggle = d.findElement(By.xpath("//*[@role='switch']"));
			partialToggle.click();
			d.findElement(By.xpath("//*[@id='manage_merchant_synonyms[1].partial_match']")).click();

		} catch (Exception e) {

			Assert.fail("failed to turn on partial toggle ");
		}
	}

	public void merchantLocations() {
		try {

			log.info("Clicking on add new merchant location");
			wait.until(ExpectedConditions.elementToBeClickable(addMerchentLocation));
			addMerchentLocation.click();

		} catch (

		Exception e) {
			Assert.fail("Failed to click on add new merchant location");
		}
	}

	public void locationDetails(String locationData, String zip) {
		try {

			log.info("adding a new merchant location details");

			log.info("Entering DSLID details");
			wait.until(ExpectedConditions.elementToBeClickable(addDSLID));
			addDSLID.sendKeys(locationData);

			log.info("Entering LocationID details");
			wait.until(ExpectedConditions.elementToBeClickable(addlocationID));
			addlocationID.sendKeys(locationData);

			log.info("Entering Location Name details");
			wait.until(ExpectedConditions.elementToBeClickable(addlocationName));
			addlocationName.sendKeys(locationData);

			log.info("Entering Location addressLine1 details");
			wait.until(ExpectedConditions.elementToBeClickable(addressLine1));
			addressLine1.sendKeys(locationData);

			log.info("Entering Location addressLine2 details");
			wait.until(ExpectedConditions.elementToBeClickable(addressLine2));
			addressLine2.sendKeys(locationData);

			log.info("Entering Location City details");
			wait.until(ExpectedConditions.elementToBeClickable(addCity));
			addCity.sendKeys(locationData);

			log.info("Entering Location State details");
			wait.until(ExpectedConditions.elementToBeClickable(addState));
			addState.sendKeys(locationData);

			log.info("Entering Location Zip code details");
			wait.until(ExpectedConditions.elementToBeClickable(addZip));
			addZip.sendKeys(zip);

			log.info("Entering Location URL details");
			wait.until(ExpectedConditions.elementToBeClickable(addUrl));
			addUrl.sendKeys("https://" + locationData + ".com");
		} catch (Exception e) {
			Assert.fail("adding a new merchant location details failed");

		}
	}

	public void addCountryDetails(String country) {
		try {

			log.info("Adding merchant location details");

			log.info("Entering Location Country details");
			wait.until(ExpectedConditions.elementToBeClickable(addCountry));
			addCountry.click();

			WebElement countryInput = d.findElement(By.xpath("(//*[@id='manage_merchant_locations[0].country'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(countryInput));
			actions.sendKeys(countryInput, country, Keys.ENTER).perform();

			log.info("Entering Location phone number details");
			wait.until(ExpectedConditions.elementToBeClickable(addPhone));
			addPhone.sendKeys(GenerateData.generateRandomNumber(10));

			log.info("Saving  Location details");
			wait.until(ExpectedConditions.elementToBeClickable(saveLocation));
			saveLocation.click();

		} catch (Exception e) {
			Assert.fail("Adding merchant country details failed");
		}

	}

	public void editCountryDetails(String country) {
		try {

			log.info("Editing merchant location details");

			log.info("Entering Location Country details");
			wait.until(ExpectedConditions.elementToBeClickable(addCountry));
			addCountry.click();

			WebElement countryInput = d.findElement(By.xpath("(//*[@id='manage_merchant_locations[1].country'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(countryInput));
			actions.sendKeys(countryInput, country, Keys.ENTER).perform();

			WebElement addPhone2 = d.findElement(By.xpath("//*[@id='manage_merchant_locations[1].phone_number']"));
			log.info("Entering Location phone number details");
			wait.until(ExpectedConditions.elementToBeClickable(addPhone2));
			addPhone2.sendKeys(GenerateData.generateRandomNumber(10));

			log.info("Saving  Location details");
			wait.until(ExpectedConditions.elementToBeClickable(saveLocation));
			saveLocation.click();

		} catch (Exception e) {
			Assert.fail("Editing merchant country details failed");
		}

	}

	public void saveMerchant() {
		try {
			log.info("Clicking on save button");
			saveBtn.click();

			log.info("Clicked on save button successfully!!!!");

//			wait.until(ExpectedConditions.urlToBe("https://dev.dataseers.in:3000/Merchant-management"));
//			d.findElement(By.xpath("//*[@title='Reset filter']")).click();
		} catch (Exception e) {
			Assert.fail("Save new Merchant scenario failed");

		}
	}

	public void verifyMerchant(String verifyData) {
		try {

			log.info("Verifying that new Merchant has been added!!!!");
			String newMerchant = addedMerchant.getText();

			if (newMerchant.contentEquals(verifyData)) {

				log.info("Newly added Merchant is displayed in a Merchant list: " + newMerchant);
			}

			else {
				log.info("Newly added Merchant is not displayed in a Merchant list: " + newMerchant);
				Assert.fail("Failed to verify added or updated Merchant button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated Merchant button");
		}
	}

	public void searchMerchant(String searchData) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(searchByName));
			JavascriptExecutor executor = (JavascriptExecutor) d;
			executor.executeScript("arguments[0].click();", searchByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Merchant failed");
		}
	}

	public void editMerchant(String editMerchantName) {
		try {

			log.info("Clicking on one existing Merchant");
			d.findElement(By.xpath("//*[text()='" + editMerchantName + "']")).click();

			wait.until(ExpectedConditions.elementToBeClickable(editBtn));
			editBtn.click();

		} catch (Exception e) {
			Assert.fail("Edit Merchant scenario failed");
		}
	}

	public void cancelMerchant() {
		try {
			log.info("Clicking on cancel button");
			cancelBtn.click();
			searchMerchant(Merchantdata);
			String newMerchant = addedMerchant.getText();

			if (newMerchant.contentEquals(Merchantdata)) {
				Assert.fail("After clicking on cancel button new Merchant has been added");
			}

			else {
				log.info("After clicking on cancel button new Merchant has not been added");
			}

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}

	public void isDeleted() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(isDeletedToggle));

			log.info("Clicking on isdeleted toggle");
			isDeletedToggle.get(0).click();
			log.info("opted isdeleted as active for newly added Merchant");

		} catch (Exception e) {
			Assert.fail("failed to opt isdeleted as active for newly added Merchant");
		}
	}

	public void deleteMerchantdb(String deleteMerchant) throws SQLException {
		String deleteQuery = "DELETE FROM Merchants WHERE name='" + deleteMerchant + "'";
		TestUtil.deleteQuerykeydb(deleteQuery);

	}

}