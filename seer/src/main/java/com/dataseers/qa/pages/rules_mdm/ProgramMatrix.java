package com.dataseers.qa.pages.rules_mdm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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

public class ProgramMatrix extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 30);
	Actions actions = new Actions(d);
	String workUnitdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
//	String programData = GenerateData.generateRandomString(6).toLowerCase();
	String accountNumber = GenerateData.generateIMEI();
	String feeAmount = "9999";
	String inactiveFeeDays = String.valueOf(TestUtil.getRandomInteger(0, 365));
	JavascriptExecutor executor = (JavascriptExecutor) d;
	SeerportalAPI SeerportalAPI = new SeerportalAPI();

	// Rules & MDM module
	@CacheLookup
	@FindBy(xpath = "//*[text()='Rules & MDM']")
	WebElement rulesMdm;

	// program_matrix management page
	@CacheLookup
	@FindBy(xpath = "//*[@href='/program-matrix']")
	WebElement programMatrix;

	// add new program_matrix button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new program']")
	WebElement addProgramMatrix;

//	// program matrix page all dropdowns
//	@CacheLookup
//	@FindBy(xpath = "//*[@class='ant-select-selection-selected-value']")
//	List<WebElement> pgmDropdown;

	// add Program Matrix ID field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_program_id']")
	WebElement programMatrixID;

	// add Program Matrix Name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_program_name']")
	WebElement programMatrixName;

	// add Program Matrix Manager field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_program_manager']")
	WebElement programMatrixMngr;

	// add Product ID field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_product_id']")
	WebElement productID;

	// add Product Name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_product_desc']")
	WebElement productName;

	// add Group ID field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_group_id']")
	WebElement groupID;

	// add Group Name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_group_desc']")
	WebElement groupName;

	// add Bin Field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_bin']")
	WebElement bin;

	// add Bin Range Field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_binrange']")
	WebElement binRange;

	// *********** Features tab **********///

	// progam matrix tab list
	@CacheLookup
	@FindBy(xpath = "//*[@role='tab']")
	List<WebElement> programTab;

	// max allowed accounts field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_max_accounts_allowed_per_program']")
	WebElement maxAccounts;

	// all toggle list
	@CacheLookup
	@FindBy(xpath = "//*[@type='button' and @role='switch']")
	List<WebElement> toggleList;

	// *********** Fundings tab **********///

	// Fed account number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_fed_accountnumber']")
	WebElement fedAccount;

	// Suspense account number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_suspense_accountnumber']")
	WebElement suspenseAccount;

	// prefunding/GL account number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_prefunding_gl_accountnumber']")
	WebElement preFundingAccount;

	// funding account number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_funding_accountnumber']")
	WebElement fundingAccount;

	// settlement account number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_settlement_accountnumber']")
	WebElement settlementAccount;

	// Revenue account number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_interchange_accountnumber']")
	WebElement revenueAccount;

	// *********** Velocity Limits tab **********///

	// all toggle list
	@CacheLookup
	@FindBy(xpath = "//*[@data-__meta='[object Object]' and @type='text' and @style='width: 90%;']")
	List<WebElement> velocityLimit;

	// *********** LifeTime Limits tab **********///

	// Max load limit field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_max_load_volume']")
	WebElement maxLoadLimit;

	// Single Transaction Amount Volume Max field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_max_single_transaction_volume']")
	WebElement maxSingleTransaction;

	// Max Card Balance Volume field
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_max_account_balance']")
	WebElement maxCardLimit;

	// Max ACH Load
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_maxachload']")
	WebElement maxAchLoad;

	// Max Account transaction volume
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_max_atm_transaction_volume']")
	WebElement maxAtmTransaction;

	// Max Cash Access volume
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_max_cash_access']")
	WebElement maxCashAccess;

	// Max International Atm Transaction volume
	@CacheLookup
	@FindBy(xpath = "//*[@id='addProgramMatrix_max_intrl_atm_transaction_volume']")
	WebElement maxIntAtmTransaction;

	// save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveBtn;

	// cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelBtn;

	// edit button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']")
	WebElement editBtn;

	// Program details page all dropdowns list
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection-selected-value']")
	List<WebElement> pgmDropdown;

	public ProgramMatrix(WebDriver d) {
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

	public void programMatrixPage() {
		try {
			rulesMdmModule();
			log.info("Clicking on Program Matrix");
			wait.until(ExpectedConditions.visibilityOf(programMatrix));
			Point point = programMatrix.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", programMatrix);
			log.info("User is redirected to program matrix page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("User is Not redirected to program matrix page!!!!");
		}
	}

	public void addProgramMatrixBtn() {
		try {
			log.info("Clicking on add Program matrix button");
			wait.until(ExpectedConditions.elementToBeClickable(addProgramMatrix));
			executor.executeScript("arguments[0].click();", addProgramMatrix);
		} catch (Exception e) {
			Assert.fail("User is Not redirected to add new program matrix page!!!!");
		}
	}

	public void programDetails(String currency, String processor, String issuer, String programType,
			String programData) {
		try {

			// program matrix page all dropdowns

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Select Currency from dropdown");
			wait.until(ExpectedConditions.elementToBeClickable(pgmDropdown.get(0)));
			pgmDropdown.get(0).click();
			actions.sendKeys(pgmDropdown.get(0), currency, Keys.ENTER).perform();

			log.info("Select Processor from dropdown");
			wait.until(ExpectedConditions.elementToBeClickable(pgmDropdown.get(1)));
			pgmDropdown.get(1).click();
			actions.sendKeys(pgmDropdown.get(1), processor, Keys.ENTER).perform();

			log.info("Select issuer from dropdown");
			wait.until(ExpectedConditions.elementToBeClickable(pgmDropdown.get(2)));
			pgmDropdown.get(2).click();
			actions.sendKeys(pgmDropdown.get(2), issuer, Keys.ENTER).perform();

			log.info("Enter program ID");
			wait.until(ExpectedConditions.visibilityOf(programMatrixID));
			programMatrixID.clear();
			programMatrixID.sendKeys(programData);

			log.info("Enter program Name");
			wait.until(ExpectedConditions.visibilityOf(programMatrixName));
			programMatrixName.clear();
			programMatrixName.sendKeys(programData);

			log.info("Select Program Type from dropdown");
			wait.until(ExpectedConditions.elementToBeClickable(pgmDropdown.get(3)));
			pgmDropdown.get(3).click();
			actions.sendKeys(pgmDropdown.get(3), programType, Keys.ENTER).perform();

			log.info("Enter program Manager");
			wait.until(ExpectedConditions.visibilityOf(programMatrixMngr));
			programMatrixMngr.clear();
			programMatrixMngr.sendKeys(programData);

			log.info("Enter product ID");
			wait.until(ExpectedConditions.visibilityOf(productID));
			productID.clear();
			productID.sendKeys(programData);

			log.info("Enter product Name");
			wait.until(ExpectedConditions.visibilityOf(productName));
			productName.clear();
			productName.sendKeys(programData);

			log.info("Enter Group ID");
			wait.until(ExpectedConditions.visibilityOf(groupID));
			groupID.clear();
			groupID.sendKeys(programData);

			log.info("Enter Group Name");
			wait.until(ExpectedConditions.visibilityOf(groupName));
			groupName.clear();
			groupName.sendKeys(programData);

		} catch (Exception e) {
			Assert.fail("Adding new Program details failed");
		}
	}

	public void cardFeatures(String loop, String binType, String programData) {
		try {
			log.info("Select loop from dropdown");
			wait.until(ExpectedConditions.elementToBeClickable(pgmDropdown.get(4)));
			pgmDropdown.get(4).click();
			actions.sendKeys(pgmDropdown.get(4), loop, Keys.ENTER).perform();

			log.info("Select Bin Type from dropdown");
			wait.until(ExpectedConditions.elementToBeClickable(pgmDropdown.get(5)));
			pgmDropdown.get(5).click();
			actions.sendKeys(pgmDropdown.get(5), binType, Keys.ENTER).perform();

			log.info("Enter Bin ");
			wait.until(ExpectedConditions.visibilityOf(bin));
			bin.clear();
			bin.sendKeys(GenerateData.generateRandomNumber(8));

			log.info("Enter Bin Range");
			wait.until(ExpectedConditions.visibilityOf(binRange));
			binRange.clear();
			binRange.sendKeys(programData);

		} catch (Exception e) {
			Assert.fail("Adding new Program card features details failed");
		}
	}

	public void networks() {
		try {
			TestUtil.scrollDown();
			List<String> signList = new ArrayList<>();
			List<String> pinList = new ArrayList<>();
			List<String> atmList = new ArrayList<>();

			List<WebElement> networkDropDown = d
					.findElements(By.xpath("//*[@class='ant-select-selection__placeholder']"));

			Map<String, String> networkList = SeerportalAPI.programNetworksAPI("networkResult");

			for (Entry<String, String> entry : networkList.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();

				if (value.contentEquals("S")) {
					log.info("adding signatures in arrayList: " + key);
					signList.add(key);
					log.info(signList);

				}
			}
			for (Entry<String, String> entry : networkList.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				if (value.contentEquals("P")) {
					log.info("adding PiN in arrayList: " + key);

					pinList.add(key);
					log.info(pinList);
				}

			}

			for (Entry<String, String> entry : networkList.entrySet()) {
				String key = entry.getKey();
				String value = entry.getValue();
				if (value.contentEquals("A")) {
					log.info("adding ATM networks in arrayList: " + key);
					atmList.add(key);
					log.info(atmList);

				}
			}

			wait.until(ExpectedConditions.elementToBeClickable(networkDropDown.get(0)));
			networkDropDown.get(0).click();
			log.info("Selecting on Signature : ");

			WebElement signName = d.findElement(By.xpath("//*[text()='" + signList.get(0) + "']"));
			wait.until(ExpectedConditions.elementToBeClickable(signName));
			signName.click();
			log.info(signList.get(0));

			wait.until(ExpectedConditions.elementToBeClickable(networkDropDown.get(1)));
			networkDropDown.get(1).click();
			log.info("Selecting on PIN : ");
			for (int i = 0; i < pinList.size(); i++) {
				executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2000);");

				WebElement pinName = d.findElement(By.xpath("//*[text()='" + pinList.get(i) + "']"));

				log.info(pinList.get(i));

				wait.until(ExpectedConditions.elementToBeClickable(pinName));
				pinName.click();
				actions.sendKeys(networkDropDown.get(1), pinList.get(i));
				actions.sendKeys(networkDropDown.get(1), Keys.ENTER);

			}

//			actions.sendKeys(networkDropDown.get(2), Keys.ENTER);

			wait.until(ExpectedConditions.elementToBeClickable(networkDropDown.get(3)));
			networkDropDown.get(3).click();
			log.info("Selecting on ATM Network : ");
			for (int i = 0; i < atmList.size(); i++) {
				WebElement atmName = d.findElement(By.xpath("//*[text()='" + atmList.get(i) + "']"));
				log.info(atmList.get(i));
				wait.until(ExpectedConditions.elementToBeClickable(atmName));
				atmName.click();
				actions.sendKeys(networkDropDown.get(3), atmList.get(i));
				actions.sendKeys(networkDropDown.get(3), Keys.ENTER);

			}

			wait.until(ExpectedConditions.elementToBeClickable(networkDropDown.get(2)));
			networkDropDown.get(2).click();
			log.info("Selecting on Unaffiliated Network: ");
			WebElement ufNetwork = d.findElement(By.xpath("(//*[text()='" + pinList.get(0) + "'])[3]"));
			wait.until(ExpectedConditions.elementToBeClickable(ufNetwork));
			ufNetwork.click();
			log.info(pinList.get(0));

		} catch (Exception E) {
			Assert.fail("Adding new Program Network details failed");

		}
	}

	public void features() {
		try {

			log.info("Cliciking on Features tab");
			wait.until(ExpectedConditions.elementToBeClickable(programTab.get(1)));
			programTab.get(1).click();
			log.info("Clicked on to Features tab successfully!!!!");

			log.info("Entering max allowed accounts");
			wait.until(ExpectedConditions.elementToBeClickable(maxAccounts));
			maxAccounts.clear();
			maxAccounts.sendKeys("50");

			for (int i = 0; i < toggleList.size(); i++) {
				wait.until(ExpectedConditions.elementToBeClickable(toggleList.get(i)));
				toggleList.get(i).click();
			}

		} catch (Exception e) {
			Assert.fail(" Features tab Scenario Failed!!!!");
		}
	}

	public void fundings() {
		try {

			log.info("Cliciking on Fundings tab");
			wait.until(ExpectedConditions.elementToBeClickable(programTab.get(2)));
			programTab.get(2).click();
			log.info("Clicked on to Fundings tab successfully!!!!");

			WebElement[] accountTypes = { fedAccount, suspenseAccount, preFundingAccount, fundingAccount,
					settlementAccount, revenueAccount };

			for (WebElement accounts : accountTypes) {
				log.info("Entering account number in: " + accounts.getAttribute("id"));
				wait.until(ExpectedConditions.elementToBeClickable(accounts));
				accounts.clear();
				accounts.sendKeys(accountNumber);

			}

		} catch (Exception e) {
			Assert.fail(" Fundings tab Scenario Failed!!!!");
		}
	}

	public void velocityLimits() {
		try {

			log.info("Cliciking on Velocity Limits tab");
			wait.until(ExpectedConditions.elementToBeClickable(programTab.get(3)));
			programTab.get(3).click();
			log.info("Clicked on to Velocity Limits tab successfully!!!!");

			for (int i = 0; i < 144; i++) {
				log.info("Entering velocity limits in: " + velocityLimit.get(i).getAttribute("id"));
				wait.until(ExpectedConditions.elementToBeClickable(velocityLimit.get(i)));
				velocityLimit.get(i).clear();
				velocityLimit.get(i).sendKeys(feeAmount);
			}

		} catch (Exception e) {
			Assert.fail(" Velocity Limits tab Scenario Failed!!!!");
		}
	}

	public void lifeTimeLimits() {
		try {

			log.info("Cliciking on life time limits tab");
			wait.until(ExpectedConditions.elementToBeClickable(programTab.get(4)));
			programTab.get(4).click();
			log.info("Clicked on to life time limits tab successfully!!!!");

			WebElement[] lifeLimitData = { maxLoadLimit, maxSingleTransaction, maxCardLimit, maxAchLoad,
					maxAtmTransaction, maxCashAccess, maxIntAtmTransaction };

			for (WebElement lifeLimits : lifeLimitData) {
				log.info("Entering Life Limit Details In: " + lifeLimits.getAttribute("id"));
				wait.until(ExpectedConditions.elementToBeClickable(lifeLimits));
				lifeLimits.clear();
				if (lifeLimits.getAttribute("id").contentEquals("addProgramMatrix_maxachload")
						|| lifeLimits.getAttribute("id").contentEquals("addProgramMatrix_max_cash_access")) {
					lifeLimits.sendKeys("9999999");
				} else {
					lifeLimits.sendKeys(GenerateData.generateRandomNumber(5));
				}
			}

		} catch (Exception e) {
			Assert.fail(" LifeLimits tab Scenario Failed!!!!");
		}
	}

	public void mcc() {
		try {

			log.info("Cliciking on MCC tab");
			wait.until(ExpectedConditions.elementToBeClickable(programTab.get(5)));
			programTab.get(5).click();

			log.info("Clicked on to MCC tab successfully!!!!");

			List<String> mccList = SeerportalAPI.programMatrixAPI("mccResult", "name");
			log.info(mccList.size());
			for (int i = 0; i < mccList.size(); i++) {
				log.info("Clicking on mcc : " + mccList.get(i));
				WebElement mccName = d.findElement(By.xpath("//*[text()='" + mccList.get(i) + "']"));
				wait.until(ExpectedConditions.elementToBeClickable(mccName));
				mccName.click();

			}

		} catch (Exception e) {
			Assert.fail(" MCC tab test Scenario Failed!!!!");
		}
	}

	public void country() {
		try {

			log.info("Cliciking on Country tab");
			wait.until(ExpectedConditions.elementToBeClickable(programTab.get(6)));
			programTab.get(6).click();

			log.info("Clicked on to Country tab successfully!!!!");
			List<String> countryName = SeerportalAPI.programMatrixAPI("countryResult", "short_name");
			log.info(countryName.size());

			for (int i = 0; i < countryName.size(); i++) {
				log.info("Selecting Country :" + countryName.get(i));
				WebElement country = d.findElement(
						By.xpath("//*[@id='addProgramMatrix_AllowedBlockedCountries[" + countryName.get(i) + "]']"));
				wait.until(ExpectedConditions.elementToBeClickable(country));
				country.click();
			}
			log.info("Entering Country in textbox : IND ");
			WebElement countryTextBox = d.findElement(By.xpath("//*[@placeholder='example - IND, IRN, USA, SSD']"));
			wait.until(ExpectedConditions.elementToBeClickable(countryTextBox));
			countryTextBox.sendKeys("IND");

			log.info("Clicking on allow button");
			d.findElement(By.xpath("(//*[@type='button' and @class='ant-btn'])[3]")).click();

//			actions.sendKeys(Keys.ENTER, Keys.PAGE_UP).perform();

		} catch (Exception e) {
			Assert.fail(" Country tab test Scenario Failed!!!!");
		}
	}

	public void feeMatrix() {
		try {

			log.info("Cliciking on Fee Matrix tab");
			wait.until(ExpectedConditions.elementToBeClickable(programTab.get(7)));
			programTab.get(7).click();
			log.info("Clicked on to Fee Matrix tab successfully!!!!");
			List<WebElement> fees = d
					.findElements(By.xpath("//*[@data-__meta='[object Object]' and @style='width: 100%;']"));
			for (int i = 7; i < fees.size(); i++) {
				fees.get(i).clear();
				if (i != 68) {
					log.info("Entering Fee Matrix in: " + fees.get(i).getAttribute("id"));
					wait.until(ExpectedConditions.elementToBeClickable(fees.get(i)));
					fees.get(i).sendKeys(feeAmount);
				} else {
					log.info("Entering Fee Matrix in: " + fees.get(i).getAttribute("id"));
					wait.until(ExpectedConditions.elementToBeClickable(fees.get(i)));
					fees.get(i).sendKeys(inactiveFeeDays);
					log.info("inactive fees in days: " + inactiveFeeDays);
				}
			}

		} catch (Exception e) {
			Assert.fail(" Fee matrix tab Scenario Failed!!!!");
		}
	}

	public void save() {
		try {
			log.info("Clicking on save button");
			saveBtn.click();

			log.info("Clciked on save button successfully!!!!");

		} catch (Exception e) {
			Assert.fail("Clicking on Save button of Processor scenario failed");

		}
	}

	public void verifyProgram(String programData) {
		try {

			log.info("Verifying that new Program has been added!!!!");
			WebElement addedProgram = d.findElement(By.xpath("//*[text()='" + programData + "']"));
			String newProgram = addedProgram.getText();

			if (newProgram.contentEquals(programData)) {

				log.info("Newly added Program is displayed in a Program list: " + newProgram);
			}

			else {
				log.info("Newly added Program is not displayed in a Program list: " + newProgram);
				Assert.fail("Failed to verify added or updated Program button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated Program button");
		}
	}

	public void searchProgram(String searchData) {
		try {
			WebElement searchByName = d.findElement(By.xpath("(//*[@title='Filter menu'])[2]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchByName));
			executor.executeScript("arguments[0].click();", searchByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search program_id']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			searchbox.sendKeys(searchData);

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[2]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Program failed");
		}
	}

	public void editProgram(String programData) {
		try {
			String processor = TestUtil.selectquery(dbprop.getProperty("selectProgramProcessor"));

			searchProgram(programData);
			d.findElement(By.xpath("//*[text()='" + processor + "']")).click();

			d.navigate().refresh();

			wait.until(ExpectedConditions.elementToBeClickable(editBtn));
			editBtn.click();

		} catch (Exception e) {
			Assert.fail("Unable to click on edit Program button failed");
		}
	}

}
