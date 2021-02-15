package com.dataseers.qa.pages.administration;

import java.sql.SQLException;

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
import com.dataseers.qa.util.TestUtil;

public class ReportGroups extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String reportData = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	JavascriptExecutor executor = (JavascriptExecutor) d;
//	SeerportalAPI SeerportalAPI = new SeerportalAPI();

	// Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;

	// Report-management module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/report-groups']")
	WebElement reportGroup;

	// Add new report button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new report']")
	WebElement addreport;

	// Add new report name
	@CacheLookup
	@FindBy(xpath = "//*[@id='report_group_add_report_name']")
	WebElement addreportName;

//	// Available reports list
//	@CacheLookup
//	@FindBy(xpath = "//*[@class='ant-checkbox']")
//	List<WebElement> reportGroups;

	// ComlianSeer Report checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@class='checkAll_CS ant-checkbox-wrapper']")
	WebElement complianSeer;

	// FraudSeer Report checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@class='checkAll_FS ant-checkbox-wrapper']")
	WebElement fraudSeer;

	// ReconSeer Report checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@class='checkAll_RS ant-checkbox-wrapper']")
	WebElement reconSeer;

	// StrataSeer Report checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@class='checkAll_SS ant-checkbox-wrapper']")
	WebElement strataSeer;
	// Save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveReport;

	// Cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelReport;

//	// sort drop-down of report management page
//	@CacheLookup
//	@FindBy(xpath = "(//*[@class='anticon anticon-caret-down ant-table-column-sorter-down off'])[3]")
//	WebElement sortDown;

	// search button of report details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchByName;

	// added new report name
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters'])[3]")
	WebElement addedReport;

	public ReportGroups(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void administrationPage() {
		try {
			log.info("Cliciking on Administration module");
			wait.until(ExpectedConditions.visibilityOf(administration));
			administration.click();
			log.info("report clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		}
	}

	public void reportGroupsPage() {
		try {
			administrationPage();
			log.info("Clicking on report management");
			wait.until(ExpectedConditions.visibilityOf(reportGroup));
			reportGroup.click();
			log.info("report is redirected to report management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("report is Not redirected to report management page!!!!");
		}
	}
	public void addReportGroupsButton() {
		try {
					
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Clicking on add report button");
			wait.until(ExpectedConditions.elementToBeClickable(addreport));
			addreport.click();
			
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

		} catch (Exception e) {
			Assert.fail("Clicking on add report button failed!!!!");
		}
	}

	public void addreportDetails(String reportGroup) {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			log.info("Entering new report name");
			wait.until(ExpectedConditions.elementToBeClickable(addreportName));
			addreportName.sendKeys(reportGroup);
			selectReportGroups();
			
		} catch (Exception e) {
			Assert.fail("Adding new report failed");
		}
	}
	public void selectReportGroups() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
			log.info("Selecting Report Group complianSeer");
			wait.until(ExpectedConditions.elementToBeClickable(complianSeer));
			complianSeer.click();
			
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
			log.info("Selecting Report Group fraudSeer");
			wait.until(ExpectedConditions.elementToBeClickable(fraudSeer));
			fraudSeer.click();
			
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
			log.info("Selecting Report Group reconSeer");
			wait.until(ExpectedConditions.elementToBeClickable(reconSeer));
			reconSeer.click();		
			
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
			log.info("Selecting Report Group strataSeer");
			wait.until(ExpectedConditions.elementToBeClickable(strataSeer));
			strataSeer.click();
			
		} catch (Exception e) {
			Assert.fail("Select report groups scenario failed");

		}
	}
	
	
	
	public void savereport() {
		try {
			log.info("Clicking on save button");
			wait.until(ExpectedConditions.elementToBeClickable(saveReport));
			saveReport.click();

		} catch (Exception e) {
			Assert.fail("Clicking on Save button scenario failed");

		}
	}

	public void searchProgram(String reportGroup) {
		try {
			log.info("Searching report group!!!!");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			wait.until(ExpectedConditions.elementToBeClickable(searchByName));
			searchByName.click();

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.visibilityOf(searchbox));
			actions.sendKeys(searchbox, reportGroup).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			searchBtn.click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");

		} catch (Exception e) {
			Assert.fail("search report group scenario failed");
		}
	}

	public void verifyReport(String reportGroupName) {
		try {
			log.info("Verifying that report group has been added or updated!!!!");
			d.findElement(By.xpath("//*[@title='Reset filter']")).click();

			String newprogram = addedReport.getText();

			if (newprogram.contentEquals(reportGroupName)) {

				log.info("searched report group is displayed in a report group list: " + newprogram);
			}

			else {
				log.info("Newly added report is not displayed in a report group list: " + newprogram);
				Assert.fail("verify  report group scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("verify report group scenario failed");
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

	public void editReportGroup(String reportGroupName) {
		try {
			d.findElement(By.xpath("//*[text()='" + reportGroupName + "']")).click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			WebElement editButton = d.findElement(By.xpath("//*[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']"));
			wait.until(ExpectedConditions.elementToBeClickable(editButton));
			editButton.click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Clearing old report group name");
			wait.until(ExpectedConditions.visibilityOf(addreportName));
			addreportName.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);

		} catch (

		Exception e) {
			Assert.fail("edit report group scenario failed");
		}
	}
	
	
	
	public void deletereportdb() throws SQLException {
		String deleteQuery = "DELETE FROM report_groups WHERE name='" + reportData + "'";
		TestUtil.deleteQuerykeydb(deleteQuery);
	}
}