package com.dataseers.qa.pages.rules_mdm;

import java.util.List;
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

public class ProcessorMapping extends TestBase 
{
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String workUnitdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	String processordata = GenerateData.generateRandomString(6).toLowerCase();
	JavascriptExecutor executor = (JavascriptExecutor) d;
	SeerportalAPI SeerportalAPI = new SeerportalAPI();

	// mapping icon on processor list page
	@CacheLookup
	@FindBy(xpath = "(//*[@alt='Map'])[1]")
	WebElement mapIcon;

	// --------------------------- Processor Mapping----------------------------//
	// Transaction Code mapping hyperlink
	@CacheLookup
	@FindBy(xpath = "//*[text()='Transaction Code']")
	WebElement transactionCode;

	// Authorization Code mapping hyperlink
	@CacheLookup
	@FindBy(xpath = "//*[text()='Authorization Code']")
	WebElement authorizationCode;

	// Account Status Code mapping hyperlink
	@CacheLookup
	@FindBy(xpath = "//*[text()='Account Status Code']")
	WebElement accountStatusCode;

	// Card Status Code mapping hyperlink
	@CacheLookup
	@FindBy(xpath = "//*[text()='Card Status Code']")
	WebElement cardStatusCode;

	// POS Entry Code mapping hyperlink
	@CacheLookup
	@FindBy(xpath = "//*[text()='POS Entry Code']")
	WebElement posEntryCode;

	// Network Code mapping hyperlink
	@CacheLookup
	@FindBy(xpath = "//*[text()='Network Code']")
	WebElement networkCode;

	// -----------Transaction code Mapping------------//

	// add transaction button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add Transaction Code']")
	WebElement addTransaction;

	// add transaction code field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_transaction_code']")
	WebElement transactCode;

	// add transaction code description field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_transaction_desc']")
	WebElement transactDesc;

	// select transaction code drop-down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	WebElement transactDropdown;

	// Save Transaction Code Button
	@CacheLookup
	@FindBy(xpath = "//button[@type='submit' and @class='ant-btn m-t-10 ant-btn-primary']")
	WebElement saveTransaction;

	// search button of Transaction Code details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchTransByName;

	// Added transaction code
	@CacheLookup
	@FindBy(xpath = "(//*[@class='transaction_code'])[1]")
	WebElement addedTsCode;

	// Added transaction code
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-checkbox']")
	List<WebElement> tsCheckBox;

	// Transaction code map icon
	@CacheLookup
	@FindBy(xpath = "//*[@title='Map']")
	WebElement tsMapIcon;

	// Transaction code drop-down inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
	WebElement tsMapDropdown;

	// Save Transaction code button inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@type='button' and @class='ant-btn ant-btn-primary']")
	WebElement saveMappedTscode;

	// -----------Authorization code Mapping------------//

	// add authorization code button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add Authorization Code']")
	WebElement addAuthorization;

	// add authorization code field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Authorizar_authorization_code']")
	WebElement authCode;

	// add authorization code description field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Authorizar_authorization_desc']")
	WebElement authDesc;

	// select authorization code drop-down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	WebElement authDropdown;

	// Save authorization Code Button
	@CacheLookup
	@FindBy(xpath = "//button[@type='submit' and @class='ant-btn m-t-10 ant-btn-primary']")
	WebElement saveAuthorization;

	// search button of authorization Code details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchAuthByName;

	// Added authorization code
	@CacheLookup
	@FindBy(xpath = "(//*[@class='authorization_code'])[1]")
	WebElement addedAuthCode;

	// Added authorization code
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-checkbox']")
	List<WebElement> authCheckBox;

	// authorization code map icon
	@CacheLookup
	@FindBy(xpath = "//*[@title='Map']")
	WebElement authMapIcon;

	// authorization code drop-down inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
	WebElement authMapDropdown;

	// Save authorization code button inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@type='button' and @class='ant-btn ant-btn-primary']")
	WebElement saveMappedAuthcode;

	// -----------Account Status code Mapping------------//

	// add Account Status code button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add Account Code']")
	WebElement addAccountStatus;

	// add Account Status code field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Account Status_account_status_code']")
	WebElement accStatusCode;

	// add Account Status code description field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Account Status_account_status_desc']")
	WebElement accStatusDesc;

	// select Account Status code drop-down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	WebElement accStatusDropdown;

	// Save Account Status Code Button
	@CacheLookup
	@FindBy(xpath = "//button[@type='submit' and @class='ant-btn m-t-10 ant-btn-primary']")
	WebElement saveaccStatus;

	// search button of Account Status Code details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchAccStatusByName;

	// Added Account Status code
	@CacheLookup
	@FindBy(xpath = "(//*[@class='account_status_code'])[1]")
	WebElement addedAccStatusCode;

	// Added Account Status code
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-checkbox']")
	List<WebElement> accStatusCheckBox;

	// Account Status code map icon
	@CacheLookup
	@FindBy(xpath = "//*[@title='Map']")
	WebElement accStatusMapIcon;

	// Account Status code drop-down inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
	WebElement accStatusMapDropdown;

	// Save Account Status code button inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@type='button' and @class='ant-btn ant-btn-primary']")
	WebElement saveMappedaccStatus;

	// -----------Card Status Code Mapping------------//

	// add Card Status Code button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add Card Code']")
	WebElement addCardStatus;

	// add Card Status Code field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Card Status_card_status_code']")
	WebElement addCardStatusCode;

	// add Card Status Code description field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Card Status_card_status_desc']")
	WebElement cardStatusDesc;

	// select Card Status Code drop-down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	WebElement cardStatusDropdown;

	// Save Card Status Code Button
	@CacheLookup
	@FindBy(xpath = "//button[@type='submit' and @class='ant-btn m-t-10 ant-btn-primary']")
	WebElement saveCardStatus;

	// search button of Card Status Code details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchCardStatusByName;

	// Added Card Status Code
	@CacheLookup
	@FindBy(xpath = "(//*[@class='card_status_code'])[1]")
	WebElement addedCardStatusCode;

	// Added Card Status Code
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-checkbox']")
	List<WebElement> cardStatusCheckBox;

	// Card Status Code map icon
	@CacheLookup
	@FindBy(xpath = "//*[@title='Map']")
	WebElement cardStatusMapIcon;

	// Card Status Code drop-down inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
	WebElement cardStatusMapDropdown;

	// Save Card Status Code button inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@type='button' and @class='ant-btn ant-btn-primary']")
	WebElement saveMappedCardStatus;

	// -----------POS Entry Code Mapping------------//

	// add POS Entry Code button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add Pos Code']")
	WebElement addPosEntry;

	// add POS Entry Code field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Pos Status_pos_code']")
	WebElement addPosEntryCode;

	// add POS Entry Code description field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Pos Status_pos_desc']")
	WebElement posEntryDesc;

	// select POS Entry Code drop-down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	WebElement posEntryDropdown;

	// Save POS Entry Code Button
	@CacheLookup
	@FindBy(xpath = "//button[@type='submit' and @class='ant-btn m-t-10 ant-btn-primary']")
	WebElement savePosEntry;

	// search button of POS Entry Code details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchPosEntryByName;

	// Added POS Entry Code
	@CacheLookup
	@FindBy(xpath = "(//*[@class='pos_code'])[1]")
	WebElement addedPosEntryCode;

	// Added POS Entry Code
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-checkbox']")
	List<WebElement> posEntryCheckBox;

	// POS Entry Code map icon
	@CacheLookup
	@FindBy(xpath = "//*[@title='Map']")
	WebElement posEntryMapIcon;

	// POS Entry Code drop-down inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
	WebElement posEntryMapDropdown;

	// Save POS Entry Code button inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@type='button' and @class='ant-btn ant-btn-primary']")
	WebElement saveMappedPosEntry;

	// -----------Network Code Code Mapping------------//

	// add Network Code Code button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add Network Code']")
	WebElement addNetwork;

	// add Network Code Code field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Network Status_network_code']")
	WebElement addNetworkCode;

	// add Network Code Code description field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Network Status_network_desc']")
	WebElement networkDesc;

	// select Network Code Code drop-down
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	WebElement networkDropdown;

	// Save Network Code Code Button
	@CacheLookup
	@FindBy(xpath = "//button[@type='submit' and @class='ant-btn m-t-10 ant-btn-primary']")
	WebElement saveNetworkCode;

	// search button of Network Code Code details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchNetworkByName;

	// Added Network Code Code
	@CacheLookup
	@FindBy(xpath = "(//*[@class='network_code'])[1]")
	WebElement addedNetworkCode;

	// Added Network Code Code
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-checkbox']")
	List<WebElement> networkCheckBox;

	// Network Code Code map icon
	@CacheLookup
	@FindBy(xpath = "//*[@title='Map']")
	WebElement networkMapIcon;

	// Network Code Code drop-down inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
	WebElement networkMapDropdown;

	// Save Network Code Code button inside mapping popup
	@CacheLookup
	@FindBy(xpath = "//*[@type='button' and @class='ant-btn ant-btn-primary']")
	WebElement saveMappedNetwork;

	public ProcessorMapping(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void processorMapIcon() {
		try {

			log.info("Clicking on Mapping icon of processor");
			wait.until(ExpectedConditions.elementToBeClickable(mapIcon));
			Point point = mapIcon.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", mapIcon);
			log.info("Clicked on processor mapping Icon successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Failed Click on processor mapping icon!!!!");
		}
	}

//********** Transaction Code ************//

	public void transactionMapPage() {
		try {
			log.info("Clicking on Transaction Processor mapping button");
			wait.until(ExpectedConditions.elementToBeClickable(transactionCode));
			transactionCode.click();

		} catch (Exception e) {
			Assert.fail("Failed to redirect Transaction code  mapping page");
		}
	}

	public void addTransactionCode() {
		try {
			log.info("Clicking on Add Transaction code Button");
			wait.until(ExpectedConditions.elementToBeClickable(addTransaction));
			addTransaction.click();

			log.info("Entering on Transaction Code Name");
			wait.until(ExpectedConditions.elementToBeClickable(transactCode));
			transactCode.sendKeys(processordata);

			log.info("Entering on Transaction Code Description");
			wait.until(ExpectedConditions.elementToBeClickable(transactDesc));
			transactDesc.sendKeys("Testing Transactiion code mapping");

			log.info("Selecting Transaction Code from dropdown ");
			wait.until(ExpectedConditions.elementToBeClickable(transactDropdown));
			transactDropdown.click();
			actions.sendKeys(transactDropdown, SeerportalAPI.getTransCodesAPI().get(1), Keys.ENTER).perform();

			log.info("Clicking on save transaction code button");
			wait.until(ExpectedConditions.elementToBeClickable(transactDropdown));
			saveTransaction.click();
		} catch (Exception e) {
			Assert.fail("Failed to add new Transaction code");
		}
	}

	public void searchTransCode(String searchData) {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");
			wait.until(ExpectedConditions.elementToBeClickable(searchTransByName));
			executor.executeScript("arguments[0].click();", searchTransByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search transaction_code']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Transaction Code failed");
		}
	}

	public void verifyTransCode(String verifyData) {
		try {

			log.info("Verifying that Tranasaction code has been added/updated!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(addedTsCode));
			String newTsCode = addedTsCode.getText();

			if (newTsCode.contentEquals(verifyData)) {

				log.info("Newly added Tranasaction code is displayed in a Tranasaction code list: " + newTsCode);
			}

			else {
				log.info("Newly added Tranasaction code is not displayed in a Tranasaction code list: " + newTsCode);
				Assert.fail("Failed to verify added or updated Tranasaction code button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated Tranasaction code button");
		}
	}

	public void mapTransCode() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Clicking on checkbox of Tranasaction code!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(tsCheckBox.get(0)));
			tsCheckBox.get(0).click();

			log.info("Clicking on Map icon of Tranasaction code page!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(tsMapIcon));
			tsMapIcon.click();

			log.info("selecting on Tranasaction code for mapping!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(tsMapDropdown));
			tsMapDropdown.click();

			List<String> tsCode = SeerportalAPI.getTransCodesAPI();
			int ts = TestUtil.getRandomInteger(0, tsCode.size());
			log.info(tsCode.size());

			String tscodeData = SeerportalAPI.getTransCodesAPI().get(ts);
			actions.sendKeys(tsMapDropdown, tscodeData, Keys.ENTER).perform();
			Thread.sleep(1000);

			log.info("Clicking on save button of Map Tranasaction code popup!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(tsMapIcon));
			saveMappedTscode.click();

//			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");
//			d.findElement(By.xpath("//*[@title='Go Back']")).click();
		} catch (Exception e) {
			Assert.fail("Failed to map Tranasaction code");
		}
	}

//*********** Authorization Code *************//

	public void authorizationMapPage() {
		try {
			log.info("Clicking on Authorization Processor mapping button");
			wait.until(ExpectedConditions.elementToBeClickable(authorizationCode));
			authorizationCode.click();

		} catch (Exception e) {
			Assert.fail("Failed to redirect Authorization code  mapping page");
		}
	}

	public void addAuthorizationCode() {
		try {
			log.info("Clicking on Add Authorization code Button");
			wait.until(ExpectedConditions.elementToBeClickable(addAuthorization));
			addAuthorization.click();

			log.info("Entering on Authorization Code Name");
			wait.until(ExpectedConditions.elementToBeClickable(authCode));
			authCode.sendKeys(processordata);

			log.info("Entering on Authorization Code Description");
			wait.until(ExpectedConditions.elementToBeClickable(authDesc));
			authDesc.sendKeys("Testing Authorization code mapping");

			log.info("Selecting Authorization Code from dropdown ");
			wait.until(ExpectedConditions.elementToBeClickable(authDropdown));
			authDropdown.click();
			actions.sendKeys(authDropdown, SeerportalAPI.getAuthCodesAPI().get(1), Keys.ENTER).perform();

			log.info("Clicking on save Authorization code button");
			wait.until(ExpectedConditions.elementToBeClickable(saveAuthorization));
			saveAuthorization.click();
		} catch (Exception e) {
			Assert.fail("Failed to add new Authorization code");
		}
	}

	public void searchAuthCode(String searchData) {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			wait.until(ExpectedConditions.elementToBeClickable(searchAuthByName));
			executor.executeScript("arguments[0].click();", searchAuthByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search authorization_code']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Authorization Code failed");
		}
	}

	public void verifyAuthCode(String verifyData) {
		try {

			log.info("Verifying that Authorization code has been added/updated!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(addedAuthCode));
			String newAuthCode = addedAuthCode.getText();

			if (newAuthCode.contentEquals(verifyData)) {

				log.info("Newly added Authorization code is displayed in a Authorization code list: " + newAuthCode);
			}

			else {
				log.info(
						"Newly added Authorization code is not displayed in a Authorization code list: " + newAuthCode);
				Assert.fail("Failed to verify added or updated Authorization code button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated Authorization code button");
		}
	}

	public void mapAuthCode() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Clicking on checkbox of Authorization code!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(authCheckBox.get(0)));
			authCheckBox.get(0).click();

			log.info("Clicking on Map icon of Authorization code page!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(authMapIcon));
			authMapIcon.click();

			log.info("selecting on Authorization code for mapping!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(authMapDropdown));
			authMapDropdown.click();

			List<String> authCodes = SeerportalAPI.getAuthCodesAPI();
			int auth = TestUtil.getRandomInteger(0, authCodes.size());
			log.info(auth);

			String authCodeData = SeerportalAPI.getAuthCodesAPI().get(auth);
			log.info(authCodeData);

			actions.sendKeys(authMapDropdown, authCodeData, Keys.ENTER).perform();
			Thread.sleep(1000);

			log.info("Clicking on save button of Map Authorization code popup!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(saveMappedAuthcode));
			saveMappedAuthcode.click();

//			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");
//			d.findElement(By.xpath("//*[@title='Go Back']")).click();

		} catch (Exception e) {
			Assert.fail("Failed to map Authorization code");
		}
	}

//************ Account Status Code ***********//

	public void accountStatusMapPage() {
		try {
			log.info("Clicking on Account Status Processor mapping button");
			wait.until(ExpectedConditions.elementToBeClickable(accountStatusCode));
			accountStatusCode.click();

		} catch (Exception e) {
			Assert.fail("Failed to redirect Account Status code  mapping page");
		}
	}

	public void addAccountStatusCode() {
		try {
			log.info("Clicking on Add Account Status code Button");
			wait.until(ExpectedConditions.elementToBeClickable(addAccountStatus));
			addAccountStatus.click();

			log.info("Entering on Account Status Code Name");
			wait.until(ExpectedConditions.elementToBeClickable(accStatusCode));
			accStatusCode.sendKeys(processordata);

			log.info("Entering on Account Status Code Description");
			wait.until(ExpectedConditions.elementToBeClickable(accStatusDesc));
			accStatusDesc.sendKeys("Testing Account Status code mapping");

			log.info("Selecting Account Status Code from dropdown ");
			wait.until(ExpectedConditions.elementToBeClickable(accStatusDropdown));
			accStatusDropdown.click();
			actions.sendKeys(accStatusDropdown, SeerportalAPI.getAccountStatusCodesAPI().get(1), Keys.ENTER).perform();

			log.info("Clicking on save Account Status code button");
			wait.until(ExpectedConditions.elementToBeClickable(saveaccStatus));
			saveaccStatus.click();
		} catch (Exception e) {
			Assert.fail("Failed to add new Account Status code");
		}
	}

	public void searchAccStatusCode(String searchData) {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			wait.until(ExpectedConditions.elementToBeClickable(searchAccStatusByName));
			executor.executeScript("arguments[0].click();", searchAccStatusByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search account_status_code']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Account Status Code failed");
		}
	}

	public void verifyAccStatusCode(String verifyData) {
		try {

			log.info("Verifying that Account Status code has been added/updated!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(addedAccStatusCode));
			String newAccStausCode = addedAccStatusCode.getText();

			if (newAccStausCode.contentEquals(verifyData)) {

				log.info("Newly added Account Status code is displayed in a Account Status code list: "
						+ newAccStausCode);
			}

			else {
				log.info("Newly added Account Status code is not displayed in a Account Status code list: "
						+ newAccStausCode);
				Assert.fail("Failed to verify added or updated Account Status code button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated Account Status code button");
		}
	}

	public void mapAccStatusCode() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");
			log.info("Clicking on checkbox of Account Status code!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(accStatusCheckBox.get(0)));
			accStatusCheckBox.get(0).click();

			log.info("Clicking on Map icon of Account Status code page!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(accStatusMapIcon));
			accStatusMapIcon.click();

			log.info("selecting on Account Status code for mapping!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(accStatusMapDropdown));
			accStatusMapDropdown.click();

			List<String> accStatusCodes = SeerportalAPI.getAccountStatusCodesAPI();
			int accStaus = TestUtil.getRandomInteger(0, accStatusCodes.size());
			log.info(accStaus);

			String accStausData = SeerportalAPI.getAccountStatusCodesAPI().get(accStaus);
			log.info(accStausData);

			actions.sendKeys(accStatusMapDropdown, accStausData, Keys.ENTER).perform();
			Thread.sleep(1000);

			log.info("Clicking on save button of Map Account Status code popup!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(saveMappedaccStatus));
			saveMappedaccStatus.click();


		} catch (Exception e) {
			Assert.fail("Failed to map Account Status code");
		}
	}

//*********** Card Status Code *************//

	public void cardStatusMapPage() {
		try {
			log.info("Clicking on Card Status Processor mapping button");
			wait.until(ExpectedConditions.elementToBeClickable(cardStatusCode));
			cardStatusCode.click();

		} catch (Exception e) {
			Assert.fail("Failed to redirect Card Status code mapping page");
		}
	}

	public void addcardStatusCode() {
		try {
			log.info("Clicking on Add Card Status code Button");
			wait.until(ExpectedConditions.elementToBeClickable(addCardStatus));
			addCardStatus.click();

			log.info("Entering on Card Status Code Name");
			wait.until(ExpectedConditions.elementToBeClickable(addCardStatusCode));
			addCardStatusCode.sendKeys(processordata);

			log.info("Entering on Card Status Code Description");
			wait.until(ExpectedConditions.elementToBeClickable(cardStatusDesc));
			cardStatusDesc.sendKeys("Testing Card Status code mapping");

			log.info("Selecting Card Status Code from dropdown ");
			wait.until(ExpectedConditions.elementToBeClickable(cardStatusDropdown));
			cardStatusDropdown.click();
			actions.sendKeys(cardStatusDropdown, SeerportalAPI.getCardCodesAPI().get(1), Keys.ENTER).perform();

			log.info("Clicking on save Card Status code button");
			wait.until(ExpectedConditions.elementToBeClickable(saveCardStatus));
			saveCardStatus.click();
		} catch (Exception e) {
			Assert.fail("Failed to add new Card Status code");
		}
	}

	public void searchCardStatusCode(String searchData) {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			wait.until(ExpectedConditions.elementToBeClickable(searchCardStatusByName));
			executor.executeScript("arguments[0].click();", searchCardStatusByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search card_status_code']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Card Status Code failed");
		}
	}

	public void verifyCardStatusCode(String verifyData) {
		try {

			log.info("Verifying that Card Status code has been added/updated!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(addedCardStatusCode));
			String newCardStatusCode = addedCardStatusCode.getText();

			if (newCardStatusCode.contentEquals(verifyData)) {

				log.info("Newly added Card Status code is displayed in a Card Status code list: " + newCardStatusCode);
			}

			else {
				log.info("Newly added Card Status code is not displayed in a Card Status code list: "
						+ newCardStatusCode);
				Assert.fail("Failed to verify added or updated Card Status code button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated Card Status code button");
		}
	}

	public void mapCardStatusCode() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Clicking on checkbox of Card Status code!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(cardStatusCheckBox.get(0)));
			cardStatusCheckBox.get(0).click();

			log.info("Clicking on Map icon of Card Status code page!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(cardStatusMapIcon));
			cardStatusMapIcon.click();

			log.info("selecting on Card Status code for mapping!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(cardStatusMapDropdown));
			cardStatusMapDropdown.click();

			List<String> cardStatusCodes = SeerportalAPI.getCardCodesAPI();
			int auth = TestUtil.getRandomInteger(0, cardStatusCodes.size());
			log.info(auth);

			String cardStatusCodeData = SeerportalAPI.getCardCodesAPI().get(auth);
			log.info(cardStatusCodeData);

			actions.sendKeys(cardStatusMapDropdown, cardStatusCodeData, Keys.ENTER).perform();
			Thread.sleep(1000);

			log.info("Clicking on save button of Map Authorization code popup!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(saveMappedCardStatus));
			saveMappedCardStatus.click();

	} catch (Exception e) {
			Assert.fail("Failed to map Card Status code");
		}
	}

//************** POS Entry Code *************//

	public void posEntryMapPage() {
		try {
			log.info("Clicking on POS Entry Code Processor mapping button");
			wait.until(ExpectedConditions.elementToBeClickable(posEntryCode));
			posEntryCode.click();

		} catch (Exception e) {
			Assert.fail("Failed to redirect POS Entry Code code mapping page");
		}
	}

	public void addposEntryCode() {
		try {
			log.info("Clicking on Add POS Entry Code code Button");
			wait.until(ExpectedConditions.elementToBeClickable(addPosEntry));
			addPosEntry.click();

			log.info("Entering on POS Entry Code Code Name");
			wait.until(ExpectedConditions.elementToBeClickable(addPosEntryCode));
			addPosEntryCode.sendKeys(processordata);

			log.info("Entering on POS Entry Code Code Description");
			wait.until(ExpectedConditions.elementToBeClickable(posEntryDesc));
			posEntryDesc.sendKeys("Testing POS Entry Code code mapping");

			log.info("Selecting POS Entry Code Code from dropdown ");
			wait.until(ExpectedConditions.elementToBeClickable(posEntryDropdown));
			posEntryDropdown.click();
			actions.sendKeys(posEntryDropdown, SeerportalAPI.getPosEntryCodesAPI().get(1), Keys.ENTER).perform();

			log.info("Clicking on save POS Entry Code code button");
			wait.until(ExpectedConditions.elementToBeClickable(savePosEntry));
			savePosEntry.click();
		} catch (Exception e) {
			Assert.fail("Failed to add new POS Entry Code code");
		}
	}

	public void searchposEntryCode(String searchData) {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			wait.until(ExpectedConditions.elementToBeClickable(searchPosEntryByName));
			executor.executeScript("arguments[0].click();", searchPosEntryByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search pos_code']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search POS Entry Code Code failed");
		}
	}

	public void verifyposEntryCode(String verifyData) {
		try {

			log.info("Verifying that POS Entry Code code has been added/updated!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(addedPosEntryCode));
			String newposEntryCode = addedPosEntryCode.getText();

			if (newposEntryCode.contentEquals(verifyData)) {

				log.info("Newly added POS Entry Code code is displayed in a POS Entry Code code list: "
						+ newposEntryCode);
			}

			else {
				log.info("Newly added POS Entry Code code is not displayed in a POS Entry Code code list: "
						+ newposEntryCode);
				Assert.fail("Failed to verify added or updated POS Entry Code code button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated POS Entry Code code button");
		}
	}

	public void mapposEntryCode() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Clicking on checkbox of POS Entry Code code!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(posEntryCheckBox.get(0)));
			posEntryCheckBox.get(0).click();

			log.info("Clicking on Map icon of POS Entry Code code page!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(posEntryMapIcon));
			posEntryMapIcon.click();

			log.info("selecting on POS Entry Code code for mapping!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(posEntryMapDropdown));
			posEntryMapDropdown.click();

			List<String> posEntryCodes = SeerportalAPI.getPosEntryCodesAPI();
			int auth = TestUtil.getRandomInteger(0, posEntryCodes.size());
			log.info(auth);

			String posEntryCodeData = SeerportalAPI.getPosEntryCodesAPI().get(auth);
			log.info(posEntryCodeData);

			actions.sendKeys(posEntryMapDropdown, posEntryCodeData, Keys.ENTER).perform();
			Thread.sleep(1000);

			log.info("Clicking on save button of Map Authorization code popup!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(saveMappedPosEntry));
			saveMappedPosEntry.click();


		} catch (Exception e) {
			Assert.fail("Failed to map POS Entry Code code");
		}
	}

//************ Network Code *************//

	public void networkCodeMapPage() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Clicking on Network Code Processor mapping button");
			wait.until(ExpectedConditions.elementToBeClickable(networkCode));
			networkCode.click();

		} catch (Exception e) {
			Assert.fail("Failed to redirect Network Code code mapping page");
		}
	}

	public void addNetworkCode() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Clicking on Add Network Code code Button");
			wait.until(ExpectedConditions.elementToBeClickable(addNetwork));
			addNetwork.click();

			log.info("Entering on Network Code Code Name");
			wait.until(ExpectedConditions.elementToBeClickable(addNetworkCode));
			addNetworkCode.sendKeys(processordata);

			log.info("Entering on Network Code Code Description");
			wait.until(ExpectedConditions.elementToBeClickable(networkDesc));
			networkDesc.sendKeys("Testing Network Code code mapping");

			log.info("Selecting Network Code Code from dropdown ");
			wait.until(ExpectedConditions.elementToBeClickable(networkDropdown));
			networkDropdown.click();
			actions.sendKeys(networkDropdown, SeerportalAPI.getNetworkCodesAPI().get(1), Keys.ENTER).perform();

			log.info("Clicking on save Network Code code button");
			wait.until(ExpectedConditions.elementToBeClickable(saveNetworkCode));
			saveNetworkCode.click();
		} catch (Exception e) {
			Assert.fail("Failed to add new Network Code code");
		}
	}

	public void searchNetworkCode(String searchData) {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			wait.until(ExpectedConditions.elementToBeClickable(searchNetworkByName));
			executor.executeScript("arguments[0].click();", searchNetworkByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search network_code']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Network Code Code failed");
		}
	}

	public void verifyNetworkCode(String verifyData) {
		try {

			log.info("Verifying that Network Code code has been added/updated!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(addedNetworkCode));
			String newNetworkCode = addedNetworkCode.getText();

			if (newNetworkCode.contentEquals(verifyData)) {

				log.info("Newly added Network Code is displayed in a Network Code code list: " + newNetworkCode);
			}

			else {
				log.info("Newly added Network Code code is not displayed in a Network Code code list: "
						+ newNetworkCode);
				Assert.fail("Failed to verify added or updated Network Code code button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated Network Code code button");
		}
	}

	public void mapNetworkCode() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Clicking on checkbox of Network Code code!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(networkCheckBox.get(0)));
			networkCheckBox.get(0).click();

			log.info("Clicking on Map icon of Network Code code page!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(networkMapIcon));
			networkMapIcon.click();

			log.info("selecting on Network Code code for mapping!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(networkMapDropdown));
			networkMapDropdown.click();

			List<String> networkCodes = SeerportalAPI.getNetworkCodesAPI();
			int auth = TestUtil.getRandomInteger(0, networkCodes.size());
			log.info(auth);

			String networkCodeData = SeerportalAPI.getNetworkCodesAPI().get(auth);
			log.info(networkCodeData);

			actions.sendKeys(networkMapDropdown, networkCodeData, Keys.ENTER).perform();
			Thread.sleep(1000);

			log.info("Clicking on save button of Map Authorization code popup!!!!");
			wait.until(ExpectedConditions.elementToBeClickable(saveMappedNetwork));
			saveMappedNetwork.click();

		} catch (Exception e) {
			Assert.fail("Failed to map Network Code code");
		}
	}

	public void goBackButton() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Clicking On Go Back Button");
			d.findElement(By.xpath("//*[@title='Go Back']")).click();

		} catch (Exception e) {
			Assert.fail("Failed To Click On Go Back Button");
		}
	}

}
