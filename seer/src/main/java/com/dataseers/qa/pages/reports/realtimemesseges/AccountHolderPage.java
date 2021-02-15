package com.dataseers.qa.pages.reports.realtimemesseges;

import java.time.LocalDate;
import java.util.ArrayList;
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

public class AccountHolderPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String accountData = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	String currentDate = LocalDate.now().toString();

	// Reports module
	@CacheLookup
	@FindBy(xpath = "//*[text()='Reports']")
	WebElement reports;

	// Real-Time messages sub-module
	@CacheLookup
	@FindBy(xpath = "//*[text()='Realtime Messages']")
	WebElement realTimeMsg;

	// address page
	@CacheLookup
	@FindBy(xpath = "//*[@href='/account-holder']")
	WebElement accountHolder;

	// search account details button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Open Filters Panel']")
	WebElement searchBtn;

//	// Account search filters
//	@CacheLookup
//	@FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
//	List<WebElement> searchFilters;

	// search account number field
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Account Number']")
	WebElement accountNumber;

	// search Account Holder ID field
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Account Holder ID']")
	WebElement accountHolderID;

	// search Account DatePicker
	@CacheLookup
	@FindBy(xpath = "//*[@placeholder='Start date' and @class='ant-calendar-range-picker-input']")
	WebElement datePicker;

	// search Account DatePicker Start Date
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='Start date'])[2]")
	WebElement startDate;

	// search Account DatePicker selected Start Date
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-calendar-date' and @aria-selected='true'])[1]")
	WebElement selectedStartDate;

	// search Account DatePicker End Date
	@CacheLookup
	@FindBy(xpath = "(//*[@placeholder='End date'])[2]")
	WebElement endDate;

	// search Account DatePicker selected End Date
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-calendar-date' and @aria-selected='true'])[2]")
	WebElement selectedEndDate;

	// apply search filter button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button' and @class='ant-btn m-r-10 ant-btn-primary']")
	WebElement applyBtn;

	// search result
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-tbody'])[1]")
	WebElement searchResult;

List<String> accountHolderDetails = new ArrayList<>();

	public AccountHolderPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void reportsModule() {
		try {
			log.info("Hitting Account-holder API and Fetching data from it's response");

//			reportsAPItest.accountHolderAPITest(accountHolderDetails);

			log.info("Cliciking on Reports module");
			wait.until(ExpectedConditions.visibilityOf(reports));
			reports.click();
			Thread.sleep(1000);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			log.info("Clicked on to Reports successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Reports module not found!!!!");
		}
	}

	public void realTimeMsgPage() {
		try {
			reportsModule();
			log.info("Clicking on Real-Time message sub-module");
			wait.until(ExpectedConditions.visibilityOf(realTimeMsg));
			realTimeMsg.click();
			Thread.sleep(1000);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			wait.until(ExpectedConditions.elementToBeClickable(accountHolder));

			Point point = accountHolder.getLocation();
			int xcord = point.getX();
			int ycord = point.getY();
			JavascriptExecutor executor = (JavascriptExecutor) d;
			executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
			executor.executeScript("arguments[0].click();", accountHolder);
			log.info("user is redirected to Address page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("user is Not redirected to Address page!!!!");
		}
	}

	public void searchDetails() {
		try {
//			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			realTimeMsgPage();
//			actions.sendKeys(Keys.PAGE_DOWN).build().perform();

			// Account search filters
			List<WebElement> searchFilters = d
					.findElements(By.xpath("//*[@class='ant-select-selection__placeholder']"));

			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			log.info("Clicking on Search Address details button");
			searchBtn.click();

			log.info("Entering data in search filters");

			log.info("Selecting status");

			wait.until(ExpectedConditions.visibilityOfAllElements(searchFilters));
			searchFilters.get(0).click();
			actions.sendKeys(searchFilters.get(0), Keys.ARROW_DOWN, Keys.ENTER).perform();

			log.info("Entering data in account number filter");
			wait.until(ExpectedConditions.visibilityOf(accountNumber));
			accountNumber.sendKeys(accountHolderDetails.get(1));

//			log.info("Selecting spik number");
//			Select spik = new Select(searchFilters.get(1));
//			spik.selectByValue(accountDetails.get(2));
//			searchFilters.get(1).click();
//			actions.sendKeys(searchFilters.get(1), accountDetails.get(2),Keys.ENTER).perform();
//			for (int i = 0; i <= 35; i++) {
//				actions.sendKeys(Keys.ARROW_DOWN);
//			}
//			actions.sendKeys(Keys.ENTER);

//			log.info("Selecting Program");
//			searchFilters.get(2).click();
//			actions.sendKeys(searchFilters.get(2), accountDetails.get(3), Keys.ENTER).perform();

//			log.info("Selecting Product");
//			searchFilters.get(3).click();
//			actions.sendKeys(searchFilters.get(3), accountDetails.get(4), Keys.ENTER).perform();
//
//			log.info("Selecting Group");
//			searchFilters.get(4).click();
//			actions.sendKeys(searchFilters.get(4), accountDetails.get(5), Keys.ENTER).perform();

			log.info("Selecting Processor");
			searchFilters.get(5).click();
			actions.sendKeys(searchFilters.get(5), accountHolderDetails.get(6), Keys.ENTER).perform();

			log.info("Entering data in Account Holder ID filter");
			wait.until(ExpectedConditions.visibilityOf(accountNumber));
			accountHolderID.sendKeys(accountHolderDetails.get(7));

//			log.info("Entering date range in datepicker");
//			wait.until(ExpectedConditions.visibilityOf(datePicker));
//			datePicker.click();
//
//			String randomDate = GenerateData.generateRandomDate("yyyy-MM-dd", "2020-03-04", currentDate);
//			wait.until(ExpectedConditions.visibilityOf(startDate));
//			startDate.sendKeys(randomDate);
//			selectedStartDate.click();
//
//			log.info("Start date is: " + randomDate);
//
//			datePicker.click();
//
//			endDate.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
//			endDate.sendKeys(currentDate);
//			log.info("End date is: " + currentDate);
//			selectedEndDate.click();

			applyBtn.click();

//			wait.until(ExpectedConditions.visibilityOf(searchResult));
//			log.info("Search result: " + searchResult.getText());
//			d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}

		catch (Exception e) {
			Assert.fail("Search Account Holder Details via filters Test Failed!!!!");
		}
	}

	public void verifyAccountHolderSearch() {

		try {
			String spik = d.findElement(By.xpath(
					"//*[@id='root']/section/section/main/div/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[2]"))
					.getText();

			String accountNum = d.findElement(By.xpath(
					"//*[@id='root']/section/section/main/div/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[3]"))
					.getText();

			String processor = d.findElement(By.xpath(
					"//*[@id='root']/section/section/main/div/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[4]"))
					.getText();

			String programName = d.findElement(By.xpath(
					"//*[@id='root']/section/section/main/div/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[5]"))
					.getText();

			if (spik.contentEquals(accountHolderDetails.get(2)) && accountNum.contentEquals(accountHolderDetails.get(1))
					&& processor.contentEquals(accountHolderDetails.get(6))
					&& programName.contentEquals(accountHolderDetails.get(3))) {

				log.info("Newly added account holder details are displayed in search result: ");
				log.info("spik number: " + spik);
				log.info("account number: " + accountNum);
				log.info("processor: " + processor);
				log.info("program name: " + programName);

			}

			else {
				log.info("Newly added account holder details are not displayed in search result: ");
				Assert.fail("verify search account holder details result scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("verify search Account Holder details result scenario failed");

		}
	}

	public void verifyAccountHolderResponse() {

		try {

			// Expand search result button
			d.findElement(By.xpath(
					"//*[@id='root']/section/section/main/div/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[1]/div"))
					.click();

			String responseUserID = d.findElement(By.xpath("(//*[@class='ant-table-row-cell-break-word'])[28]"))
					.getText();
			String responseUniqueID = d.findElement(By.xpath("(//*[@class='ant-table-row-cell-break-word'])[38]"))
					.getText();

			if (responseUserID.contentEquals(accountHolderDetails.get(0))
					&& responseUniqueID.contentEquals(accountHolderDetails.get(8))) {
				log.info("Newly added account holder details response is displayed in search result response: ");
				log.info("User ID: " + responseUserID);
				log.info("Unique ID: " + responseUniqueID);

			} else {
				log.info("Newly added account holder details response is not displayed in search result response: ");
				Assert.fail("verify search account holder details response result scenario failed");
			}
		} catch (Exception e) {
			Assert.fail("verify search Account Holder details response scenario failed");

		}
	}

}