package com.dataseers.qa.pages.rules_mdm;

import java.io.File;
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

public class Processor extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String workUnitdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	String processordata = GenerateData.generateRandomString(6).toLowerCase();
	JavascriptExecutor executor = (JavascriptExecutor) d;
	SeerportalAPI SeerportalAPI = new SeerportalAPI();

	// Rules & MDM module
	@CacheLookup
	@FindBy(xpath = "//*[text()='Rules & MDM']")
	WebElement rulesMdm;

	// processor sub-module
	@CacheLookup
	@FindBy(xpath = "//*[text()='Processor']")
	WebElement processorMenu;

	// processor management page
	@CacheLookup
	@FindBy(xpath = "//*[@href='/processor_admin']")
	WebElement processorPage;

	// add new Processor button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add Processor']")
	WebElement addProcessor;

	// add Processor name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_name']")
	WebElement addProcessorName;

	// add Processor alert email field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_alertEmail']")
	WebElement alertEmail;

	// add Processor pgp key upload field
	@CacheLookup
	@FindBy(xpath = "//*[@class='anticon anticon-upload']")
	WebElement pgpKey;

	// Processor website field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_websiteUrl']")
	WebElement webSite;

	// select phone code dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@title='Select phone code']")
	WebElement phoneCode;

//select phone code dropdown list
	@CacheLookup
	@FindBy(xpath = "//*[@title='91 - India']")
	List<WebElement> phoneCodeList;

//Add Phone number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_phone']")
	WebElement phoneNumber;

	// add Processor primary contact name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_primaryContactName']")
	WebElement primaryContact;

	// select primary phone code dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@title='Select primary contact phone code']")
	WebElement primaryPhonecode;

	// Add primary Phone number field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_primaryContactPhone']")
	WebElement primaryPhoneNumber;

	// Active primary email field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_primaryContactEmail']")
	WebElement primaryEmail;

	// Processor scope field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_scope']")
	WebElement processorScope;

	// add rule button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn ant-btn-dashed']")
	WebElement addRule;

	// select rule radio button list
	@CacheLookup
	@FindBy(xpath = "//*[@type='radio']")
	List<WebElement> ruleType;

	// -------------Batch Rule--------------//

	// select frequency field
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-select-selection__placeholder'])[1]")
	WebElement frequency;

	// select Time frequency
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Select time'])[1]")
	WebElement batchTimeFrequency;

	// select Time frequency
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_realTimeDataTimeOfDay-0']")
	WebElement realTimeFrequency;

	// File found alert toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_alertOnSuccess-0']")
	WebElement alertOnSuccess;

	// File not found alert toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_alertOnFailure-0']")
	WebElement alertOnFailure;

	// File found found alert
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-select-selection ant-select-selection--multiple'])[1]")
	WebElement alertDropdown1;

	// File not found alert
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-select-selection ant-select-selection--multiple'])[2]")
	WebElement alertDropdown2;

	// number of files field
	@CacheLookup
	@FindBy(xpath = "//*[@type='number' and @id='Add Processor_noOfFiles-0']")
	WebElement files;

	// Processor Source Folder Name
	@CacheLookup
	@FindBy(xpath = "//*[@type='text' and @id='Add Processor_sourceFolderName-0-0']")
	WebElement sourceFolder;

	// Processor Destination Folder Name
	@CacheLookup
	@FindBy(xpath = "//*[@type='text' and @id='Add Processor_destinationFolderName-0-0']")
	WebElement destinationFolder;

	// Processor File Name
	@CacheLookup
	@FindBy(xpath = "//*[@type='text' and @id='Add Processor_fileName-0-0']")
	WebElement processorFileName;

	// File Extension dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_extensionId-0-0']")
	WebElement extension;

	// File delimiter dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_delimeterId-0-0']")
	WebElement delimiter;

	// File Line Terminator dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_lineTerminatorId-0-0']")
	WebElement lineTerminator;

	// File header toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_containsHeader-0-0']")
	WebElement header;

	// File is_Encrypted toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add Processor_isEncrypted-0-0']")
	WebElement isEncrypted;

	// --------------------------------------Frequency for 2nd batch
	// rule-------------------------------------------------//
	// select frequency field
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-select-selection__placeholder'])[1]")
	WebElement frequency2;

	// select Time frequency
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Select time'])[2]")
	WebElement batchTimeFrequency2;

	// number of files fields for 2nd batch rule
	@CacheLookup
	@FindBy(xpath = "//*[@type='number' and @id='Add_Processor_noOfFiles-1']")
	WebElement files2;

	// Processor Source Folder Name
	@CacheLookup
	@FindBy(xpath = "//*[@type='text' and @id='Add_Processor_sourceFolderName-0-0']")
	WebElement sourceFolder2;

	// Processor Destination Folder Name
	@CacheLookup
	@FindBy(xpath = "//*[@type='text' and @id='Add_Processor_destinationFolderName-0-0']")
	WebElement destinationFolder2;

	// Processor File Name
	@CacheLookup
	@FindBy(xpath = "//*[@type='text' and @id='Add_Processor_fileName-0-0']")
	WebElement processorFileName2;

	// File Extension dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add_Processor_extensionId-0-0']")
	WebElement extension2;

	// File delimiter dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add_Processor_delimeterId-0-0']")
	WebElement delimiter2;

	// File Line Terminator dropdown
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add_Processor_lineTerminatorId-0-0']")
	WebElement lineTerminator2;

	// File header toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add_Processor_containsHeader-0-0']")
	WebElement header2;

	// File is_Encrypted toggle
	@CacheLookup
	@FindBy(xpath = "//*[@id='Add_Processor_isEncrypted-0-0']")
	WebElement isEncrypted2;

//-------------Real Time Rule--------------//

	// save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveProcessor;

	// cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelProcessor;

	// search button of report details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchByName;

	// added processor
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-column-sort'])[2]")
	WebElement addedProcessor;

	// edit processor button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn m-r-10 m-b-10 ant-btn-primary']")
	WebElement editBtn;

//----------------------------Edit Field mapping-----------------------//
	// mapping icon on edit processor page
	@CacheLookup
	@FindBy(xpath = "(//*[@alt='Map'])[1]")
	WebElement mapIcon;

	// field mapping file upload button
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-btn m-r-10 ant-btn-primary ant-btn-circle'])[1]")
	WebElement mapUploadBtn;

	// field mapping file upload area
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-upload ant-upload-btn']")
	WebElement uploadArea;

	// Start upload button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn ant-btn-primary']")
	WebElement startUpload;

	// Upload OK button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement okUpload;

	public Processor(WebDriver d) {
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

	public void processorMenupage() {
		try {
			rulesMdmModule();

			log.info("Clicking on processor Page");
			wait.until(ExpectedConditions.visibilityOf(processorMenu));
			Point point = processorMenu.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", processorMenu);
			log.info("Clicked on processor sub menu successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Failed To Click on processor sub menu!!!!");
		}
	}

	public void processorpage() {
		try {
			processorMenupage();
			log.info("Clicking on processor Page");
			wait.until(ExpectedConditions.visibilityOf(processorPage));
			Point point = processorPage.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", processorPage);
			log.info("User is redirected to processor Page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("User is Not redirected to processor page!!!!");
		}
	}

	public void addProcessorButton() {
		try {
			log.info("Clicking on Add Processor Button");
			wait.until(ExpectedConditions.elementToBeClickable(addProcessor));
			Point point = addProcessor.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", addProcessor);
			log.info("Clicked on Add Processor Button successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Failed Click on Add Processor Button!!!!");
		}
	}

	public void addProcessorDetails(String processor) {
		try {

			log.info("Entering processor name");
			wait.until(ExpectedConditions.elementToBeClickable(addProcessorName));
			addProcessorName.sendKeys(processor);

			log.info("Entering alert Email");
			wait.until(ExpectedConditions.elementToBeClickable(alertEmail));
			alertEmail.sendKeys(prop.getProperty("email_id"));

//			log.info("Uploading PGP Key");
//			wait.until(ExpectedConditions.elementToBeClickable(pgpKey));
//			pgpKey.sendKeys(
//					System.getProperty("user.dir") + "/src/main/java/com/dataseers/qa/testdata/rupesh-wayal.asc");

			log.info("Entering Website");
			wait.until(ExpectedConditions.elementToBeClickable(webSite));
			webSite.sendKeys(prop.getProperty("url"));

			log.info("Entering phone code");
			wait.until(ExpectedConditions.elementToBeClickable(phoneCode));
			phoneCode.click();
			actions.sendKeys(phoneCode, "91 - India", Keys.ENTER).perform();

			log.info("Entering phone number");
			wait.until(ExpectedConditions.elementToBeClickable(phoneNumber));
			String phoneData=String.valueOf(TestUtil.getRandomInteger(1999999999, 1000000000));
			phoneNumber.sendKeys(phoneData);

			log.info("Entering Primary Contact Name");
			wait.until(ExpectedConditions.elementToBeClickable(primaryContact));
			primaryContact.sendKeys(processor);

			log.info("Entering Primary phone code");
			wait.until(ExpectedConditions.elementToBeClickable(primaryPhonecode));
			primaryPhonecode.click();
			actions.sendKeys(primaryPhonecode, "91 - India", Keys.ENTER).perform();

			log.info("Entering Primary phone number");
			wait.until(ExpectedConditions.elementToBeClickable(primaryPhoneNumber));
			primaryPhoneNumber.sendKeys(phoneData);

			log.info("Entering Primary Contact Email");
			wait.until(ExpectedConditions.elementToBeClickable(primaryEmail));
			primaryEmail.sendKeys(prop.getProperty("email_id"));

			log.info("Entering Scope");
			wait.until(ExpectedConditions.elementToBeClickable(processorScope));
			processorScope.sendKeys(processordata);

		} catch (Exception e) {
			Assert.fail("Adding new Processor failed");
		}
	}

	public void addRuleButton() {
		try {
			log.info("Clicking on Add Rule Button");
			wait.until(ExpectedConditions.elementToBeClickable(addRule));
			Point point = addRule.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", addRule);
			log.info("Clicked on Add Rule Button successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Failed Click on Add Rule Button!!!!");
		}
	}

	public void selectRule(String rule) {
		try {
			log.info("Selecting Processor Rule type");
			d.findElement(By.xpath("//*[text()='" + rule + "']")).click();
			log.info("Selected Rule is: " + rule);
		} catch (Exception e) {
			Assert.fail("Failed to Select processor rule");
		}
	}

	public void editRule() {
		try {
			WebElement selectedRule = d.findElement(By.xpath("(//*[@class='ant-radio-input' and @checked])[1]"));
			String rule = selectedRule.getAttribute("value");
			log.info(rule);
			addRuleButton();
			if (rule.contentEquals("R")) {
				rule = "Batch";
				log.info("Selecting Processor Rule type");
				d.findElement(By.xpath("(//*[text()='" + rule + "'])[2]")).click();
				log.info("Selected Rule is: " + rule);
				frequencyDetails("edit", "Daily", "10:10", null, null, null, null);
				batchFileDetails2("edit", "1", "uploads/clients", null, "Company", 0);

			}

			else {
				rule = "Real Time";
				log.info("Selecting Processor Rule type");
				d.findElement(By.xpath("(//*[text()='" + rule + "'])[2]")).click();

				log.info("Selected Rule is: " + rule);
				realTimeDetails("10:15", "edit");
				log.info("Entering 2nd new rule frequency: " + rule);
				WebElement editRealFrequency = d.findElement(By.xpath("(//*[@placeholder='Select time'])[2]"));
				wait.until(ExpectedConditions.elementToBeClickable(editRealFrequency));
				editRealFrequency.click();
				actions.sendKeys(editRealFrequency, "10:15", Keys.ESCAPE).perform();

				fieldMapExcelUpload();
				editFieldMapping();

			}
		} catch (Exception e) {
			Assert.fail("Failed to Select processor rule");
		}
	}

	public void batchFileDetails2(String addOrEdit, String totalFile, String source, String destination,
			String fileName, int infoIndex) {
		try {
			log.info("Entering batch file details");
			log.info("Entering Toatal number of files");
			wait.until(ExpectedConditions.elementToBeClickable(files2));
			files2.sendKeys(totalFile);

			log.info("Entering source folder path");
			wait.until(ExpectedConditions.elementToBeClickable(sourceFolder2));
			sourceFolder2.sendKeys(source);

			log.info("Entering destination folder path");
			wait.until(ExpectedConditions.elementToBeClickable(destinationFolder2));
			destinationFolder2.sendKeys(destination);

			log.info("Entering  file name");
			wait.until(ExpectedConditions.elementToBeClickable(processorFileName2));
			processorFileName2.sendKeys(fileName);

			log.info("Selecting  extension");
			wait.until(ExpectedConditions.elementToBeClickable(extension2));
			extension2.click();
			String extensionInfo = SeerportalAPI.getProcessorfileInfo("extensions").get(infoIndex);
			d.findElement(By.xpath("(//*[text()='" + extensionInfo + "'])[1]")).click();
			log.info("Selecting  delimiter");
			wait.until(ExpectedConditions.elementToBeClickable(delimiter2));
			delimiter2.click();
			String delimiterInfo = SeerportalAPI.getProcessorfileInfo("delimiter").get(infoIndex);
			d.findElement(By.xpath("(//*[text()='" + delimiterInfo + "'])[1]")).click();

			log.info("Selecting  line terminator");
			wait.until(ExpectedConditions.elementToBeClickable(lineTerminator2));
			lineTerminator2.click();
			String terminatorInfo = SeerportalAPI.getProcessorfileInfo("line_terminator").get(infoIndex);
			d.findElement(By.xpath("(//*[text()='" + terminatorInfo + "'])[1]")).click();

			log.info("Turning on Header Toggle");
			wait.until(ExpectedConditions.elementToBeClickable(header2));
			header2.click();

			log.info("Turning on is_encrypted Toggle");
			wait.until(ExpectedConditions.elementToBeClickable(isEncrypted2));
			isEncrypted2.click();

		} catch (Exception e) {
			Assert.fail("Unable to enter processor batch file details");
		}
	}

	public void frequencyDetails(String addOrEdit, String frequencyType, String frequencyTime, String frequencyWeek,
			String frequencyMonth, String frequencyQuarter, String frequencyYearMonth) {
		try {
			List<WebElement> frequencyTimeUnit = d
					.findElements(By.xpath("//*[@class='ant-select-selection__placeholder']"));

			log.info("Selecting Processor Frequency type");
			wait.until(ExpectedConditions.elementToBeClickable(frequency));
			frequency.click();
			d.findElement(By.xpath("//*[text()='" + frequencyType + "']")).click();

			if (frequencyType.contentEquals("Daily") || frequencyTime.contentEquals("Hourly")) {
				log.info("Entering Daily/hourly frequency day name");
			}

			else if (frequencyType.contentEquals("Weekly")) {
				log.info("Entering weekly frequency day name");
				wait.until(ExpectedConditions.elementToBeClickable(frequencyTimeUnit.get(1)));
				frequencyTimeUnit.get(1).click();
				d.findElement(By.xpath("//*[text()='" + frequencyWeek + "']")).click();
			}

			else if (frequencyType.contentEquals("Monthly")) {
				log.info("Entering Monthly frequency date");
				wait.until(ExpectedConditions.elementToBeClickable(frequencyTimeUnit.get(1)));
				frequencyTimeUnit.get(1).click();
				d.findElement(By.xpath("//*[text()='" + frequencyMonth + "']")).click();
			}

			else if (frequencyType.contentEquals("Quarterly")) {
				log.info("Entering Quarterly frequency");
				wait.until(ExpectedConditions.elementToBeClickable(frequencyTimeUnit.get(1)));
				frequencyTimeUnit.get(1).click();
				d.findElement(By.xpath("//*[text()='" + frequencyQuarter + "']")).click();

				log.info("Selecting Quarterly frequency month");
				wait.until(ExpectedConditions.elementToBeClickable(frequencyTimeUnit.get(2)));
				frequencyTimeUnit.get(2).click();
				d.findElement(By.xpath("//*[text()='" + frequencyMonth + "']")).click();
			}

			else if (frequencyType.contentEquals("Yearly")) {
				log.info("Selecting Yearly frequency month");
				wait.until(ExpectedConditions.elementToBeClickable(frequencyTimeUnit.get(1)));
				frequencyTimeUnit.get(1).click();
				d.findElement(By.xpath("//*[text()='" + frequencyYearMonth + "']")).click();

				log.info("Selecting Yearly frequency month date");
				wait.until(ExpectedConditions.elementToBeClickable(frequencyTimeUnit.get(2)));
				frequencyTimeUnit.get(2).click();
				d.findElement(By.xpath("//*[text()='" + frequencyMonth + "']")).click();

			}
			if (addOrEdit.contentEquals("add")) {
				log.info("Entering frequency Time");
				wait.until(ExpectedConditions.elementToBeClickable(batchTimeFrequency));
				batchTimeFrequency.click();
				actions.sendKeys(batchTimeFrequency, frequencyTime, Keys.ESCAPE).perform();
			} else {

				log.info("Entering frequency Time");
				wait.until(ExpectedConditions.elementToBeClickable(batchTimeFrequency2));
				batchTimeFrequency2.click();
				actions.sendKeys(batchTimeFrequency2, frequencyTime, Keys.ESCAPE).perform();
			}

		} catch (Exception e) {
			Assert.fail("Unable to enter processor frequency details");
		}

	}

	public void alertDetails(String alertUser) {
		try {
			log.info("Entering processor alert users details for file found: ");
			wait.until(ExpectedConditions.elementToBeClickable(alertOnSuccess));
			alertOnSuccess.click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 10000);");

			wait.until(ExpectedConditions.elementToBeClickable(alertDropdown1));
			alertDropdown1.click();
			actions.sendKeys(alertDropdown1, alertUser).perform();
			log.info("Selecting file found alertUser:" + alertUser);

			WebElement fileFoundAlertuser = d.findElement(By.xpath("(//*[@title='" + alertUser + "'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(fileFoundAlertuser));
			fileFoundAlertuser.click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Entering processor alert users details for file not found: ");
			wait.until(ExpectedConditions.elementToBeClickable(alertOnFailure));
			alertOnFailure.click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			wait.until(ExpectedConditions.elementToBeClickable(alertDropdown2));
			alertDropdown2.click();

			actions.sendKeys(alertDropdown2, alertUser).perform();
			log.info("Selecting file not found alertUser:" + alertUser);

			WebElement fileNotFoundAlertuser = d.findElement(By.xpath("(//*[@title='" + alertUser + "'])[2]"));
			wait.until(ExpectedConditions.elementToBeClickable(fileNotFoundAlertuser));
			fileNotFoundAlertuser.click();

		} catch (Exception e) {
			Assert.fail("Failed to enter processor rule user alert details");
		}
	}

	public void realTimeDetails(String frequencyTime, String addOrEdit) {
		try {

			log.info("Clicking on Real time api checkboxes");
			List<String> realTimeBox = SeerportalAPI.getProcessorfileInfo("realtime_data");

			if (addOrEdit.contentEquals("add")) {
				for (int i = 0; i < realTimeBox.size(); i++) {
					d.findElement(By.xpath("//*[text()='" + realTimeBox.get(i) + "']")).click();
					log.info("Checked RealTime option is: " + realTimeBox.get(i));
				}
				log.info("Entering frequency Time");
				wait.until(ExpectedConditions.elementToBeClickable(realTimeFrequency));
				realTimeFrequency.click();
				actions.sendKeys(realTimeFrequency, frequencyTime, Keys.ESCAPE).perform();

			} else if (addOrEdit.contentEquals("edit")) {
				int i = TestUtil.getRandomInteger(1, 5);
				d.findElement(By.xpath("//*[text()='" + realTimeBox.get(i) + "']")).click();
				log.info("Checked RealTime option is: " + realTimeBox.get(1));
				WebElement editRealFrequency = d.findElement(By.xpath("(//*[@placeholder='Select time'])[1]"));
				log.info("Entering frequency Time");
				wait.until(ExpectedConditions.elementToBeClickable(editRealFrequency));
				editRealFrequency.click();
				actions.sendKeys(editRealFrequency, frequencyTime, Keys.ESCAPE).perform();

			}

		} catch (Exception e) {
			Assert.fail("Failed to Select processor rule");
		}
	}

	public void saveProcessor() {
		try {
			log.info("Clicking on save button");
			saveProcessor.click();
			log.info("Clicked on save button successfully!!!!");

			WebElement successMsg = d.findElement(By.xpath("//*[@class='ant-message-notice-content']"));
			wait.until(ExpectedConditions.visibilityOf(successMsg));
			String addOrEdit = successMsg.getText();
			if (addOrEdit.contentEquals("Record has been updated successfully.")) {
				log.info(addOrEdit);
			} else if (addOrEdit.contentEquals("Records has been inserted successfully.")) {
				log.info(addOrEdit);

			} else {
				Assert.fail("Save proceessor details failed " + addOrEdit);

			}
			
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2500);");

		}

		catch (Exception e) {
			Assert.fail("Clicking on save button scenario failed");

		}
	}

	public void verifyProcessor(String verifyData) {
		try {

			log.info("Verifying that new Processor has been added!!!!");
			String newProcessor = addedProcessor.getText();

			if (newProcessor.contentEquals(verifyData)) {

				log.info("Newly added Processor is displayed in a Processor list: " + newProcessor);
			}

			else {
				log.info("Newly added Processor is not displayed in a Processor list: " + newProcessor);
				Assert.fail("Failed to verify added or updated Processor button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated Processor button");
		}
	}

	public void searchProcessor(String searchData) {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 2500);");

			wait.until(ExpectedConditions.elementToBeClickable(searchByName));
			executor.executeScript("arguments[0].click();", searchByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Processor failed");
		}
	}

	public void editProcessorBtn(String editProcessorName) {
		try {

			log.info("Clicking on one existing Processor");
			d.findElement(By.xpath("//*[text()='" + editProcessorName + "']")).click();

			log.info("Clicking on edit Processor button");
			wait.until(ExpectedConditions.elementToBeClickable(editBtn));
			editBtn.click();

		} catch (Exception e) {
			Assert.fail("Edit Processor button click scenario failed");
		}
	}

	public void editProcessorDetails(String processor) {
		try {

			String[] editDetails1 = { "Add_Processor_name", "Add_Processor_primaryContactName", "Add_Processor_scope" };

			log.info("Editing data into Processor Details fields");
			for (String editprocessor : editDetails1) {
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']")).click();
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']")).sendKeys(Keys.CONTROL + "a",
						Keys.BACK_SPACE);

				log.info("processor details edited in: " + editprocessor);
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']")).sendKeys(processor);
			}

			String[] editPhoneDetails = { "Add_Processor_phone", "Add_Processor_primaryContactPhone" };
			log.info("Editing data into Processor Details fields");
			for (String editprocessor : editPhoneDetails) {
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']")).click();
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']")).sendKeys(Keys.CONTROL + "a",
						Keys.BACK_SPACE);

				log.info("processor details edited in: " + editprocessor);
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']"))
						.sendKeys(GenerateData.generateRandomNumber(10));
			}
			String[] editMailDetails = { "Add_Processor_alertEmail", "Add_Processor_primaryContactEmail" };
			log.info("Editing data into Processor Details fields");
			for (String editprocessor : editMailDetails) {
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']")).click();
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']")).sendKeys(Keys.CONTROL + "a",
						Keys.BACK_SPACE);

				log.info("processor details edited in: " + editprocessor);
				d.findElement(By.xpath("//*[@id='" + editprocessor + "']")).sendKeys(prop.getProperty("email_id"));
			}

			d.findElement(By.id("Add_Processor_websiteUrl")).sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
			d.findElement(By.id("Add_Processor_websiteUrl")).sendKeys(prop.getProperty("url"));
		} catch (Exception e) {
			Assert.fail("Edit Processor scenario failed");
		}
	}

	public void batchFileDetails(String addOrEdit, String total, String source, String destination, String fileName,
			int infoIndex) {
		try {
			if (addOrEdit.contentEquals("add")) {
				log.info("Entering 1st batch total files");
				log.info("Entering Toatal number of files");
				wait.until(ExpectedConditions.elementToBeClickable(files));
				files.sendKeys(total);
			} else {
				log.info("Entering 2nd batch total files");
				log.info("Entering Toatal number of files");
				wait.until(ExpectedConditions.elementToBeClickable(files2));
				files2.sendKeys(total);
			}

			log.info("Entering source folder path");
			wait.until(ExpectedConditions.elementToBeClickable(files));
			sourceFolder.sendKeys(source);

			log.info("Entering destination folder path");
			wait.until(ExpectedConditions.elementToBeClickable(files));
			destinationFolder.sendKeys(destination);

			log.info("Entering  file name");
			wait.until(ExpectedConditions.elementToBeClickable(processorFileName));
			processorFileName.sendKeys(fileName);

			log.info("Selecting  extension");
			wait.until(ExpectedConditions.elementToBeClickable(extension));
			extension.click();
			String extensionInfo = SeerportalAPI.getProcessorfileInfo("extensions").get(infoIndex);
			d.findElement(By.xpath("//*[text()='" + extensionInfo + "']")).click();

			log.info("Selecting  delimiter");
			wait.until(ExpectedConditions.elementToBeClickable(delimiter));
			delimiter.click();
			String delimiterInfo = SeerportalAPI.getProcessorfileInfo("delimiter").get(infoIndex);
			d.findElement(By.xpath("//*[text()='" + delimiterInfo + "']")).click();

			log.info("Selecting  line terminator");
			wait.until(ExpectedConditions.elementToBeClickable(lineTerminator));
			lineTerminator.click();
			String terminatorInfo = SeerportalAPI.getProcessorfileInfo("line_terminator").get(infoIndex);
			d.findElement(By.xpath("//*[text()='" + terminatorInfo + "']")).click();

			log.info("Turning on Header Toggle");
			wait.until(ExpectedConditions.elementToBeClickable(header));
			header.click();

			log.info("Turning on is_encrypted Toggle");
			wait.until(ExpectedConditions.elementToBeClickable(isEncrypted));
			isEncrypted.click();

		} catch (Exception e) {
			Assert.fail("Unable to enter processor batch file details");
		}
	}

	public void fieldMapExcelUpload() {
		try {
			String[] dataType = { "STRING", "NUMBER", "DATE", "BOOLEAN" };
			String[] validationList = { "APLHABETS_WITH_SPACE", "ALPHA_WITH_SPACE_AND_SPECIAL_CHAR",
					"APLHABETS_WITHOUT_SPACE", "ALPHA_NUMERIC_WITH_SPACE_AND_UNDERSCORE", "ALPHA_NUMERIC_WITHOUT_SPACE",
					"NUMERIC", "DATE_YYYYMMDD", "TIME_HHMMSS", "DATE_YYMMDD", "TIME_HHMM",
					"DOB_GREATER_THAN_OR_EQUAL_18", "FUTURE_DATE", "PAST_DATE", "DATE_MMDDYYYY" };

			String filePath = System.getProperty("user.dir")
					+ "/src/main/java/com/dataseers/qa/testdata/FieldMapping.xlsx";
			for (int i = 1; i <= 10; i++) {
				String fieldName = GenerateData.generateRandomAlphaNumeric(5).toLowerCase();
				int minLength = TestUtil.getRandomInteger(1, 5);
				int maxLength = TestUtil.getRandomInteger(6, 15);
				int typeIndex = TestUtil.getRandomInteger(0, 3);
				int validation = TestUtil.getRandomInteger(0, 13);

				TestUtil.excel(filePath, dataType[typeIndex], i, 0);
				TestUtil.excel(filePath, fieldName, i, 1);
				TestUtil.excel(filePath, "Y", i, 2);
				TestUtil.excel(filePath, Integer.toString(minLength), i, 3);
				TestUtil.excel(filePath, Integer.toString(maxLength), i, 4);
				TestUtil.excel(filePath, "-x-x-x-", i, 5);
				TestUtil.excel(filePath, validationList[validation], i, 6);
				TestUtil.excel(filePath, "Test_" + i, i, 7);
				System.out.println("File Updated Successfully At Row_Number: " + i);
			}
		} catch (Exception e) {
			Assert.fail("Field Mapping Excel File Update Failed");
		}
	}

	public void editFieldMapping() {
		try {
			log.info("Clicking On Map icon dispalyed at edit processor page");
			wait.until(ExpectedConditions.elementToBeClickable(mapIcon));
			mapIcon.click();

			log.info("Clicking On Upload file icon");
			wait.until(ExpectedConditions.elementToBeClickable(mapUploadBtn));
			mapUploadBtn.click();

			log.info("Clicking On Upload file area");
			String filepath = System.getProperty("user.dir")
					+ "/src/main/java/com/dataseers/qa/testdata/FieldMapping.xlsx";
			File file = new File(filepath);
			String path = file.getAbsolutePath();
			// give the URL to upload
			uploadArea.click();
			wait.until(ExpectedConditions.visibilityOf(uploadArea));
			uploadArea.sendKeys(path);

//			executor.executeScript(
//					"document.getElementsByClassName('ant-upload ant-upload-btn').value='" + filepath + "';");

			log.info("Clicking On Start Upload Button");
			wait.until(ExpectedConditions.elementToBeClickable(startUpload));
			startUpload.click();

			log.info("Clicking On Ok Upload Button");
			wait.until(ExpectedConditions.elementToBeClickable(okUpload));
			okUpload.click();
			WebElement suceessUplaodMsg = d
					.findElement(By.xpath("//*[@class='ant-message-custom-content ant-message-success']"));
			wait.until(ExpectedConditions.visibilityOf(suceessUplaodMsg));
			if (suceessUplaodMsg.getText().contentEquals("File uploaded successfully")) {
				log.info("Field mapping File Uplaoded Sucessfully");
			} else {
				Assert.fail("Field mapping File Uplaod Failed");

			}

		} catch (Exception e) {
			Assert.fail("Field mapping File Uplaod Failed");

		}
	}

}
