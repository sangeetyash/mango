package com.dataseers.qa.pages.compliance;

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

public class Alerts extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String alertData = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	JavascriptExecutor executor = (JavascriptExecutor) d;
	SeerportalAPI SeerportalAPI = new SeerportalAPI();
	List<String> alertRespInfo;
	// Compliance module
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-menu-submenu-title'])[5]")
	WebElement compliance;

	// Alerts sub module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/manage-alerts']")
	WebElement alerts;

	// Add new Alert button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new alert']")
	WebElement addAlert;

//	// Alert Drop-down list
//	@CacheLookup
//	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
//	List<WebElement> alertDropDown;
//
//	// Alert Drop-down input list
//	@CacheLookup
//	@FindBy(xpath = "//*[@class='ant-select-search ant-select-search--inline']")
//	List<WebElement> alertDropDownIP;

	// Report Config Drop-down input list
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_report_config_id']")
	List<WebElement> reportConfigList;

	// processor Drop-down input list
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_processor']")
	List<WebElement> processorList;

	// program Drop-down input list
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_program_id']")
	List<WebElement> programList;

	// Assignee Drop-down input list
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_assign_user_id']")
	List<WebElement> assigneeList;

	// Reason Drop-down input list
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_reason_id']")
	List<WebElement> reasonList;

	// Priority Drop-down input list
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_priority']")
	List<WebElement> priorityList;

	// Account Number Textbox
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_account_number']")
	WebElement accountNumber;

	// Card Number Textbox
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_card_id']")
	WebElement cardNumber;

	// Notes TextBox
	@CacheLookup
	@FindBy(xpath = "//*[@id='ReasonCodeAdd_list_notes']")
	WebElement notes;

	// Alerts file upload
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-upload-text']")
	WebElement fileUpload;

	// Save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveAlert;

//	// Cancel button
//	@CacheLookup
//	@FindBy(xpath = "//*[@type='button']")
//	WebElement cancelalert;

//	// sort drop-down of alert management page
//	@CacheLookup
//	@FindBy(xpath = "(//*[@class='anticon anticon-caret-down ant-table-column-sorter-down off'])[3]")
//	WebElement sortDown;

	// Select Case DropDown
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	WebElement selectCase;

	// Create case title field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Case_add_titles']")
	WebElement caseTitle;

	// Create case title field
	@CacheLookup
	@FindBy(xpath = "//*[@id='Case_add_note']")
	WebElement caseNotes;

	// Create new case Drop-down list
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	List<WebElement> caseDropdownList;

	public Alerts(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void compliancePage() {
		try {
			log.info("Cliciking on compliance module");
			wait.until(ExpectedConditions.visibilityOf(compliance));
			compliance.click();
			log.info("alert clicked on to compliance successfully!!!!");
		} catch (Exception e) {
			Assert.fail("compliance module not found!!!!");
		}
	}

	public void alertsPage() {
		try {
			compliancePage();

			log.info("Clicking on alert management");
			wait.until(ExpectedConditions.visibilityOf(alerts));
			Point point = alerts.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", alerts);
			log.info("User is redirected to alerts page successfully!!!!");

		} catch (Exception e) {
			Assert.fail("user is Not redirected to alerts page!!!!");
		}
	}

	public void addAlertsButton() {
		try {

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Clicking on add alert button");
			wait.until(ExpectedConditions.elementToBeClickable(addAlert));
			addAlert.click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

		} catch (Exception e) {
			Assert.fail("Clicking on add alert button failed!!!!");
		}
	}

//	public List<String> alertAPIDetails() throws IOException {
//
//		List<String> alertRespInfo = new ArrayList<>();
//		alertRespInfo.add(SeerportalAPI.getAlertReportConfig("name").get(0));
//		alertRespInfo.add(SeerportalAPI.getAlertProcessorAPI("processor").get(0));
//		alertRespInfo.add(SeerportalAPI.getAlertProgramAPI(0, "program_name").get(0));
//		alertRespInfo.add(SeerportalAPI.getAlertReasonAPI("name").get(0));
//
//		return alertRespInfo;
//	}

	public void addAlertDetails(String asignee, String priority) {
		try {
//			alertRespInfo = alertAPIDetails();
			String reportConfig = alertRespInfo.get(0);
			String processorName = alertRespInfo.get(1);
			String programName = alertRespInfo.get(2);
			String reason = alertRespInfo.get(3);

			log.info("Selecting new alert Report Config: " + reportConfig);
			wait.until(ExpectedConditions.elementToBeClickable(reportConfigList.get(0)));
			reportConfigList.get(0).click();
			wait.until(ExpectedConditions.elementToBeClickable(reportConfigList.get(1)));
			reportConfigList.get(1).sendKeys(reportConfig, Keys.ENTER);

			log.info("Selecting new alert processor");
			wait.until(ExpectedConditions.elementToBeClickable(processorList.get(0)));
			processorList.get(0).click();
			wait.until(ExpectedConditions.elementToBeClickable(processorList.get(1)));
			processorList.get(1).sendKeys(processorName, Keys.ENTER);

			log.info("Selecting new alert program");

			wait.until(ExpectedConditions.elementToBeClickable(programList.get(0)));
			programList.get(0).click();
			wait.until(ExpectedConditions.elementToBeClickable(programList.get(1)));
			programList.get(1).sendKeys(programName, Keys.ENTER);

			log.info("Selecting new alert Assignee");
			wait.until(ExpectedConditions.elementToBeClickable(assigneeList.get(0)));
			assigneeList.get(0).click();
			wait.until(ExpectedConditions.elementToBeClickable(assigneeList.get(1)));
			assigneeList.get(1).sendKeys(asignee);
			Thread.sleep(1000);
			actions.sendKeys(Keys.ENTER);

			log.info("Selecting new alert Reason");
			wait.until(ExpectedConditions.elementToBeClickable(reasonList.get(0)));
			reasonList.get(0).click();
			wait.until(ExpectedConditions.elementToBeClickable(reasonList.get(1)));
			reasonList.get(1).sendKeys(reason, Keys.ENTER);

			log.info("Selecting new alert Priority");
			wait.until(ExpectedConditions.elementToBeClickable(priorityList.get(0)));
			priorityList.get(0).click();
			wait.until(ExpectedConditions.elementToBeClickable(priorityList.get(1)));
			priorityList.get(1).sendKeys(priority);

			log.info("Entering new alert Notes");
			wait.until(ExpectedConditions.elementToBeClickable(notes));
			notes.sendKeys("Alerts Automated Testing");

		} catch (Exception e) {
			Assert.fail("Entering Alert Details Scenario failed");
		}
	}

	public void accountNumber() {
		try {
			log.info("Entering Account number");
			wait.until(ExpectedConditions.elementToBeClickable(accountNumber));
			accountNumber.clear();
			accountNumber.sendKeys(GenerateData.generateIMEI());
		} catch (Exception e) {
			Assert.fail("Enter Account number failed");
			wait.until(ExpectedConditions.visibilityOf(accountNumber));

		}
	}

	public void cardNumber() {
		try {
			log.info("Entering Card number");
			wait.until(ExpectedConditions.elementToBeClickable(cardNumber));
			cardNumber.clear();
			cardNumber.sendKeys(GenerateData.generateIMEI());
		} catch (Exception e) {
			Assert.fail("Enter Card number failed");
			wait.until(ExpectedConditions.visibilityOf(cardNumber));

		}
	}

	public void saveAlert() {
		try {
			log.info("Clicking on save button");
			wait.until(ExpectedConditions.elementToBeClickable(saveAlert));
			saveAlert.click();

		} catch (Exception e) {
			Assert.fail("Clicking on Save button scenario failed");

		}
	}

	public void searchAlert(String assignee) {
		try {
//			alertRespInfo = alertAPIDetails();
			String reportConfig = alertRespInfo.get(0);
			String processorName = alertRespInfo.get(1);
			String programName = alertRespInfo.get(2);
			log.info(alertRespInfo);

			log.info("Searching alert!!!!");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			// search filter of alert details page
			List<WebElement> searchFilter = d.findElements(By.xpath("//*[@title='Filter menu']"));

			// search button of alert details page
			List<WebElement> searchBtn = d
					.findElements(By.xpath("//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm']"));

			wait.until(ExpectedConditions.elementToBeClickable(searchFilter.get(2)));
			searchFilter.get(2).click();

			WebElement reportSearchbox = d.findElement(By.xpath("//*[@placeholder='Search report config_name']"));
			wait.until(ExpectedConditions.elementToBeClickable(reportSearchbox));
			reportSearchbox.sendKeys(reportConfig);

			wait.until(ExpectedConditions.elementToBeClickable(searchBtn.get(1)));
			searchBtn.get(1).click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");

			wait.until(ExpectedConditions.elementToBeClickable(searchFilter.get(3)));
			searchFilter.get(3).click();

			WebElement processorSearchbox = d.findElement(By.xpath("//*[@placeholder='Search processor']"));
			wait.until(ExpectedConditions.elementToBeClickable(processorSearchbox));
			processorSearchbox.sendKeys(processorName);

			wait.until(ExpectedConditions.elementToBeClickable(searchBtn.get(2)));
			searchBtn.get(2).click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

			wait.until(ExpectedConditions.elementToBeClickable(searchFilter.get(4)));
			searchFilter.get(4).click();

			WebElement programSearchbox = d.findElement(By.xpath("//*[@placeholder='Search program name']"));
			wait.until(ExpectedConditions.elementToBeClickable(programSearchbox));
			programSearchbox.sendKeys(programName);

			wait.until(ExpectedConditions.visibilityOf(searchBtn.get(3)));
			searchBtn.get(3).click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

			wait.until(ExpectedConditions.elementToBeClickable(searchFilter.get(5)));
			searchFilter.get(5).click();

			WebElement assigneeSearchbox = d.findElement(By.xpath("//*[@placeholder='Search user name']"));
			wait.until(ExpectedConditions.elementToBeClickable(assigneeSearchbox));
			assigneeSearchbox.sendKeys(assignee);

			wait.until(ExpectedConditions.elementToBeClickable(searchBtn.get(4)));
			searchBtn.get(4).click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

		} catch (Exception e) {
			Assert.fail("search alert  scenario failed");
		}
	}

	public void verifyAlert(String assignee) {
		try {

			String reportConfig = alertRespInfo.get(0);
			String processorName = alertRespInfo.get(1);
			String programName = alertRespInfo.get(2);

			log.info("Verifying that alert has been added or updated!!!!");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 4000);");

			// added alert details on alerts list page
			List<WebElement> addedAlert = d.findElements(By.xpath(
					"//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-row-cell-ellipsis']"));

			wait.until(ExpectedConditions.visibilityOfAllElements(addedAlert));
			String newReport = addedAlert.get(7).getText();

			String newProcessor = addedAlert.get(8).getText();

			String newProgram = addedAlert.get(9).getText();

			String newAssignee = addedAlert.get(10).getText();

			if (newReport.contentEquals(reportConfig) && (newProcessor.contentEquals(processorName)
					&& (newProgram.contentEquals(programName) && (newAssignee.contentEquals(assignee))))) {

				log.info("searched alert report is displayed in a alert list: " + newReport);
				log.info("searched alert processor is displayed in a alert list: " + newProcessor);
				log.info("searched alert program is displayed in a alert list: " + newProgram);
				log.info("searched alert assignee is displayed in a alert list: " + newAssignee);

			}

			else {
				log.info("Newly added alert is not displayed in a alert  list: ");
				Assert.fail("verify  alert  scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("verify alert  scenario failed");
		}
	}

	public void editButton() {
		try {

			log.info("Clicking on Edit alert  button");
			String alertReport = d.findElement(By.xpath(
					"(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-row-cell-ellipsis'])[8]"))
					.getText();

			d.findElement(By.xpath("//*[text()='" + alertReport + "']")).click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

			WebElement editButton = d.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary']"));
			wait.until(ExpectedConditions.elementToBeClickable(editButton));
			editButton.click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

		} catch (

		Exception e) {
			Assert.fail("edit alert button click scenario failed");
		}
	}

	public void convertAlert() {
		try {

			log.info("Clicking on Covert to case button");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-btn m-r-10'])[1]")));

			d.findElement(By.xpath("(//*[@class='ant-btn m-r-10'])[1]")).click();
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-sm']")));
			d.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-sm']")).click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

		} catch (

		Exception e) {
			Assert.fail("Clicking on Covert to case button scenario failed");
		}
	}

	public void createAlertCase() {
		try {

			log.info("Clicking on Covert to case button");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ant-btn m-r-10'])[1]")));

			d.findElement(By.xpath("(//*[@class='ant-btn m-r-10'])[1]")).click();
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-sm']")));
			d.findElement(By.xpath("//*[@class='ant-btn ant-btn-primary ant-btn-sm']")).click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

		} catch (

		Exception e) {
			Assert.fail("Clicking on Covert to case button scenario failed");
		}
	}

	public void selectAlertCase(String sceneario, String assignee) {
		try {

			wait.until(ExpectedConditions.elementToBeClickable(selectCase));

			selectCase.click();
			if (sceneario.contentEquals("select")) {
				log.info("Selecting Case From Dropdown:");

				String caseName = SeerportalAPI.getCaseNamesAPI("title").get(0);
				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//*[text()='" + caseName + "'and @role='option']")));
				WebElement selectAlert = d.findElement(By.xpath("//*[text()='" + caseName + "'and @role='option']"));

				actions.moveToElement(selectAlert).click().build().perform();
//				d.findElement(By.xpath("//*[text()='" + caseName + "' @role='option']")).click();

			}

			else {
				log.info("Selecting Create new Case option From Dropdown:");

				wait.until(
						ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='" + "Create New Case" + "']")));
				d.findElement(By.xpath("//*[text()='" + "Create New Case" + "']")).click();

				log.info("Entering Create new Case Title:");

				wait.until(ExpectedConditions.elementToBeClickable(caseTitle));
				caseTitle.sendKeys(GenerateData.generateRandomString(6));

				wait.until(ExpectedConditions.visibilityOfAllElements(caseDropdownList));

				log.info("Selecting Create new Case Assignee:");
				caseDropdownList.get(0).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='" + assignee + "']")));
				d.findElement(By.xpath("//*[text()='" + assignee + "']")).click();

				log.info("Selecting Create new Case Reason:");
				caseDropdownList.get(1).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='" + "Noise" + "']")));
				d.findElement(By.xpath("//*[text()='" + "Noise" + "']")).click();

				log.info("Selecting Create new Case Priority:");
				caseDropdownList.get(2).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='" + "High" + "']")));
				d.findElement(By.xpath("//*[text()='" + "High" + "']")).click();

				log.info("Entering Create new Case Notes:");
				wait.until(ExpectedConditions.elementToBeClickable(caseNotes));
				caseNotes.sendKeys(GenerateData.generateRandomString(6));

			}
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

			log.info("Clicking on back button:");
			wait.until(
					ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-btn m-l-10 ant-btn-danger']")));
			d.findElement(By.xpath("//*[@class='ant-btn m-l-10 ant-btn-danger']")).click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

		} catch (

		Exception e) {
			Assert.fail("Selecting case for alert conversion scenario failed");
		}
	}

	public void closeAlert() {
		try {

			log.info("Clicking on Close case button");

			d.findElement(By.xpath("(//*[@class='ant-btn m-r-10'])[2]")).click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

		} catch (

		Exception e) {
			Assert.fail("Clicking on Close button scenario failed");
		}
	}

	public void verifyClosedAlert() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-icon='filter'])[2]")));
			d.findElement(By.xpath("(//*[@data-icon='filter'])[2]")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Closed']")));
			d.findElement(By.xpath("//*[text()='Closed']")).click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//*[@class='ant-table-filter-dropdown-link confirm'])[1]")));
			d.findElement(By.xpath("(//*[@class='ant-table-filter-dropdown-link confirm'])[1]")).click();

			String verifyClose = d.findElement(By.xpath(
					"(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-row-cell-ellipsis'])[12]"))
					.getText();
			if (verifyClose.contentEquals("Closed")) {
				log.info("Alert Status is " + verifyClose);
			} else {

				Assert.fail("Alert Status is " + verifyClose);

			}

		} catch (Exception e) {
			Assert.fail("Verify Closed Alert's Changed Status scenario failed");
		}
	}

	public void verifyConvertedAlert() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@data-icon='filter'])[2]")));
			d.findElement(By.xpath("(//*[@data-icon='filter'])[2]")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Closed']")));
			d.findElement(By.xpath("//*[text()='Closed']")).click();

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//*[@class='ant-table-filter-dropdown-link confirm'])[1]")));
			d.findElement(By.xpath("(//*[@class='ant-table-filter-dropdown-link confirm'])[1]")).click();

			String verifyClose = d.findElement(By.xpath(
					"(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-row-cell-ellipsis'])[12]"))
					.getText();
			if (verifyClose.contentEquals("Closed")) {
				log.info("Alert Status is " + verifyClose);
			} else {

				Assert.fail("Alert Status is " + verifyClose);

			}

		} catch (Exception e) {
			Assert.fail("Verify Converted Alert's Changed Status scenario failed");
		}
	}
}
