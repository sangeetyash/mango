package com.dataseers.qa.pages.reports;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
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
import com.dataseers.qa.util.TestUtil;

public class ReportMgmtPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String reportData = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();

	// Reports module
	@CacheLookup
	@FindBy(xpath = "//*[text()='Reports']")
	WebElement reports;

	// Report-management sub-module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/reports-management']")
	WebElement reportMgmt;

	// Add new report button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new report config']")
	WebElement addReport;

	// report management toggle list(active,trigger alerts)
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-switch-inner']")
	List<WebElement> reportToggles;

	// report management drop-downs list(report short code,layout type)
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	List<WebElement> reportDropdowns;

	// Report Config code field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_report_config_config_code']")
	WebElement configCode;

	// Report Config code description field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_report_config_description']")
	WebElement configDesc;

	// Report Config Name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_report_config_name']")
	WebElement configName;

	// Report Folder Name field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_report_config_foldername']")
	WebElement folderName;

	// Report File suffix field
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_report_config_filesuffix']")
	WebElement fileSuffix;

	// Save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveReport;

	// Cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelReport;

	// search button of report details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[3]")
	WebElement searchByName;

	// added new report name
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters'])[6]")
	WebElement addedReport;
	// added new report ID
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters ant-table-column-sort'])[2]")
	WebElement addedReportID;

	public ReportMgmtPage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void reportsModule() {
		try {
			log.info("Cliciking on Reports module");
			wait.until(ExpectedConditions.visibilityOf(reports));
			reports.click();
			log.info("Clicked on to Reports successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Reports module not found!!!!");
		}
	}

	public void reportMgmtPage() {
		try {
			reportsModule();
			log.info("Clicking on report management");
			wait.until(ExpectedConditions.visibilityOf(reportMgmt));
			reportMgmt.click();
			log.info("user is redirected to report management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("user is Not redirected to report management page!!!!");
		}
	}

	public void addreportPage(String shortCode, String layOut) {
		try {

			reportMgmtPage();

			log.info("Clicking on add report button");
			wait.until(ExpectedConditions.visibilityOf(addReport));
			addReport.click();
			log.info("Turning ON Active report togggle");
			wait.until(ExpectedConditions.visibilityOfAllElements(reportToggles));
			reportToggles.get(0).click();

			log.info("Selecting Report Short Code");
			wait.until(ExpectedConditions.visibilityOfAllElements(reportDropdowns));
			reportDropdowns.get(0).click();
			actions.sendKeys(reportDropdowns.get(0), shortCode).perform();

			if (shortCode.contentEquals("ComplianSeer")) {
				log.info("Entering Report Config Code for ComplianSeer");
				wait.until(ExpectedConditions.visibilityOf(configCode));
				configCode.sendKeys("CS" + reportData);
			}

			else if (shortCode.contentEquals("FraudSeer")) {
				log.info("Entering Report Config Code for FraudSeer");
				wait.until(ExpectedConditions.visibilityOf(configCode));
				configCode.sendKeys("FS" + reportData);
			}

			else if (shortCode.contentEquals("ReconSeer")) {
				log.info("Entering Report Config Code for ReconSeer");
				wait.until(ExpectedConditions.visibilityOf(configCode));
				configCode.sendKeys("RS" + reportData);
			}

			else if (shortCode.contentEquals("StrataSeer")) {
				log.info("Entering Report Config Code for StrataSeer");
				wait.until(ExpectedConditions.visibilityOf(configCode));
				configCode.sendKeys("SS" + reportData);
			}

			else {
				log.info("Report Config Code not found");

			}

			log.info("Entering Report Config Description");
			wait.until(ExpectedConditions.visibilityOf(configDesc));
			configDesc.sendKeys(reportData);

			log.info("Entering Report Config Name");
			wait.until(ExpectedConditions.visibilityOf(configName));
			configName.sendKeys(reportData);

			log.info("Entering Report Folder Name");
			wait.until(ExpectedConditions.visibilityOf(folderName));
			folderName.sendKeys(reportData);

			log.info("Entering Report File Suffix");
			wait.until(ExpectedConditions.visibilityOf(fileSuffix));
			fileSuffix.sendKeys(reportData);

			log.info("Turning ON Trigger Alerts report togggle");
			reportToggles.get(1).click();

			log.info("Selecting Report Layout Type");
			reportDropdowns.get(1).click();
			actions.sendKeys(reportDropdowns.get(1), layOut, Keys.ENTER).perform();

		} catch (Exception e) {
			Assert.fail("Adding new report failed");
		}
	}

	public void optionalOps() {
		try {

			wait.until(ExpectedConditions.elementToBeClickable(reportToggles.get(2)));
			reportToggles.get(2).click();

			WebElement alertUser = d.findElement(By.xpath("//*[@class='checkAll_1 ant-checkbox-wrapper']"));
			wait.until(ExpectedConditions.elementToBeClickable(alertUser));
			alertUser.click();

			log.info("Selecting All Columns for Transaction Reports layout");
			WebElement transColumns = d
					.findElement(By.xpath("//*[@class='MasterReportCheckAll ant-checkbox-wrapper']"));

			wait.until(ExpectedConditions.elementToBeClickable(transColumns));
			transColumns.click();

		} catch (Exception e) {
			Assert.fail("Selecting optional fields scenario failed");
		}
	}

	public void savereport() {
		try {
			log.info("Clicking on save button");
			saveReport.click();

			log.info("New report added successfully!!!!");

			log.info("Verifying that new report has been added!!!!");
			wait.until(ExpectedConditions.visibilityOf(searchByName));
			searchByName.click();

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.visibilityOf(searchbox));
			actions.sendKeys(searchbox, reportData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[3]"));
			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			searchBtn.click();

			String newReport = addedReport.getText();

			if (newReport.contentEquals(reportData)) {

				log.info("Newly added report is displayed in a report list: " + newReport);
			}

			else {
				log.info("Newly added report is not displayed in a report list: " + newReport);
				Assert.fail("Save new report scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("Save new report scenario failed");

		}
	}

	public void cancelreport() {
		try {
			log.info("Clicking on cancel button");
			cancelReport.click();
			String newReport = addedReport.getText();

			if (newReport.contentEquals(reportData)) {
				Assert.fail("After clicking on cancel button new report has been added");
			}

			else {
				log.info("After clicking on cancel button new report has not been added");
			}

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}

	public void deleteReportdb() throws SQLException {
		String deleteQuery = "DELETE FROM report_config WHERE name='" + reportData + "'";
		TestUtil.deleteQuerykeydb(deleteQuery);
	}
}