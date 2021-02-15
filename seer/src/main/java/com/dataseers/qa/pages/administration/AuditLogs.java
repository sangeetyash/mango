package com.dataseers.qa.pages.administration;

import java.text.ParseException;
import java.time.LocalDate;
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

public class AuditLogs extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 30);
	Actions actions = new Actions(d);
	String auditData = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	String currentDate = LocalDate.now().toString();
	JavascriptExecutor executor = (JavascriptExecutor) d;

	// Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;

	// audit-logs module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/audit-logs']")
	WebElement auditlog;

	// audit-logs header test
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-page-header-heading-title']")
	WebElement auditLogHeader;

	// select audit user
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-select-selection__rendered'])[1]")
	WebElement auditByUser;

	// select new audit type
	@CacheLookup
	@FindBy(xpath = "//*[@id='audit_logs_SelectedAuditType' and @class='ant-select ant-select-enabled ant-select-allow-clear']")
	WebElement auditType;

	// audit DatePicker
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Start date' and @class='ant-calendar-range-picker-input']")
	WebElement datePicker;

	// audit DatePicker Start Date
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Start date'])[2]")
	WebElement startDate;

	// audit DatePicker selected Start Date
	@CacheLookup
	@FindBy(xpath = "(//*[@aria-selected='true'])[3]")
	WebElement selectedStartDate;

	// audit DatePicker End Date
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='End date'])[2]")
	WebElement endDate;

	// audit DatePicker selected End Date
	@CacheLookup
	@FindBy(xpath = "(//*[@aria-selected='true'])[4]")
	WebElement selectedEndDate;

	// audit serach button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Search' and @id='searchBtn']")
	WebElement auditSearch;

	// audit searched user
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-sorters ant-table-row-cell-break-word'])[3]")
	WebElement searchedUser;

	// audit searched Type
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-sorters ant-table-row-cell-break-word'])[4]")
	WebElement searchedType;

	// select user log checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@type='checkbox']")
	List<WebElement> selectLogbox;

	// selected user log row
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-table-row ant-table-row-level-0 ant-table-row-selected']")
	WebElement searchedLogs;

	// download log button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Download audit log file']")
	WebElement downloadLogs;

	public AuditLogs(WebDriver d) {
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

			log.info("Workkey clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		}
	}

	public void auditlogsPage() {
		try {
			administrationPage();
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			log.info("Clicking on audit management");
			wait.until(ExpectedConditions.elementToBeClickable(auditlog));
			auditlog.click();
			log.info("audit is redirected to audit management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("audit is Not redirected to audit management page!!!!");
		}
	}

	public void searchDetails(String userName, String pageName) throws ParseException {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Entering UserName in search log by user field");
			wait.until(ExpectedConditions.elementToBeClickable(auditByUser));
			auditByUser.click();
			actions.sendKeys(auditByUser, userName).perform();

			log.info("Entering Type in search log by type field");
			wait.until(ExpectedConditions.elementToBeClickable(auditType));
			auditType.click();
			actions.sendKeys(auditType, pageName).perform();

			log.info("Entering date range in datepicker");
			wait.until(ExpectedConditions.elementToBeClickable(datePicker));
			datePicker.click();

			String randomDate = GenerateData.generateRandomDate("yyyy-MM-dd", "2020-03-04", currentDate);
			wait.until(ExpectedConditions.elementToBeClickable(startDate));
			startDate.sendKeys(randomDate);
			wait.until(ExpectedConditions.elementToBeClickable(selectedStartDate));

			selectedStartDate.click();
			log.info("Start date is: " + randomDate);
			wait.until(ExpectedConditions.elementToBeClickable(datePicker));

			datePicker.click();
			wait.until(ExpectedConditions.elementToBeClickable(endDate));

			endDate.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
			endDate.sendKeys(currentDate);
			log.info("End date is: " + currentDate);
			wait.until(ExpectedConditions.visibilityOf(selectedEndDate));

			selectedEndDate.click();
			wait.until(ExpectedConditions.elementToBeClickable(auditLogHeader));

			auditLogHeader.click();

		} catch (Exception e) {
			Assert.fail("Audit search failed");
		}
	}

	public void searchAudit(String userName, String pageName) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(auditSearch));
			log.info("Clicking on search button");
			auditSearch.click();

			log.info("Verifying audit logs searched results!!!!");

			wait.until(ExpectedConditions.elementToBeClickable(searchedUser));
			String foundUser = searchedUser.getText();

			wait.until(ExpectedConditions.elementToBeClickable(searchedType));
			String foundType = searchedType.getText();
			if (foundUser.contentEquals(userName) && foundType.contentEquals(pageName)) {

				log.info("Searched details are displayed in a audit list: " + foundUser + foundType);

				d.findElement(By.xpath("(//*[@type='checkbox' and @class='ant-checkbox-input'])[2]")).click();

				wait.until(ExpectedConditions.elementToBeClickable(searchedLogs));
				log.info("First log in an audit list: " + searchedLogs.getText());

				wait.until(ExpectedConditions.elementToBeClickable(downloadLogs));
				log.info("Click on Download log button: ");
				downloadLogs.click();
			}

			else {
				log.info("Searched details are not displayed in a audit list: " + foundUser + foundType);
				Assert.fail("Search audit logs scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("Search audit scenario failed");

		}
	}
}