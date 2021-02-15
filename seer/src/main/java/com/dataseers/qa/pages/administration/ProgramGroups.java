package com.dataseers.qa.pages.administration;

import java.sql.SQLException;
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
import com.dataseers.qa.util.SeerportalAPI;
import com.dataseers.qa.util.TestUtil;

public class ProgramGroups extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String programData = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
	JavascriptExecutor executor = (JavascriptExecutor) d;
	SeerportalAPI SeerportalAPI = new SeerportalAPI();

	// Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;

	// program-management module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/program-groups']")
	WebElement programGroup;

	// Add new program button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new program']")
	WebElement addprogram;

	// Add new program name
	@CacheLookup
	@FindBy(xpath = "//*[@id='report_group_add_program_name']")
	WebElement addprogramName;

	// select new program type
	@CacheLookup
	@FindBy(xpath = "//*[@type='radio']")
	List<WebElement> newProgramType;

	// First Data(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@id='checkAll_6']")
	WebElement firstData;

	// Fis South(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@id='checkAll_5']")
	WebElement fisSouth;

	// incomm11(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@id='checkAll_2']")
	WebElement incomm11;

	// marqeta(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@id='checkAll_3']")
	WebElement marqeta;

	// wirecard(all kyc) program checkbox
	@CacheLookup
	@FindBy(xpath = "//*[@id='checkAll_8']")
	WebElement wirecard;

	// Save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveprogram;

	// Cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelprogram;

	// search button of report details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchByName;

//	// added new program name
//	@CacheLookup
//	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters'])[3]")
//	WebElement addedprogram;

	// select program checkbox at program group landing page
	@CacheLookup
	@FindBy(xpath = "//*[@type='checkbox']")
	List<WebElement> selectProgram;

	public ProgramGroups(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void administrationPage() {
		try {
			log.info("Cliciking on Administration module");
			wait.until(ExpectedConditions.visibilityOf(administration));
			administration.click();
			log.info("program clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		}
	}

	public void programGroupsPage() {
		try {
			administrationPage();
			log.info("Clicking on program management");
			wait.until(ExpectedConditions.visibilityOf(programGroup));
			programGroup.click();
			log.info("program is redirected to program management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("program is Not redirected to program management page!!!!");
		}
	}

	public void addProgramGroupsButton() {
		try {
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Clicking on add program button");
			wait.until(ExpectedConditions.visibilityOf(addprogram));
			addprogram.click();

		} catch (Exception e) {
			Assert.fail("Clicking on add program button Failed!!!!");
		}
	}

	public void programDetails(int progType, String programName) {
		try {
			// int progType 0 = all programs and progType 1 = kyc/kyb programs
			log.info("Entering new program name");
			wait.until(ExpectedConditions.visibilityOf(addprogramName));
			addprogramName.sendKeys(programName);
			wait.until(ExpectedConditions.elementToBeClickable(addprogramName));

			newProgramType.get(progType).click();
			TestUtil.scrollDown();

			String programs = String.valueOf(progType);
			List<String> totalProgram = SeerportalAPI.getProgramGroupDetails(programs);
			for (int i = 0; i < totalProgram.size(); i++) {
				String progs = totalProgram.get(i);
				d.findElement(By.xpath("//*[text()='" + progs + "']")).click();

			}

		} catch (Exception e) {
			Assert.fail("Adding new program failed");
		}
	}

	public void editProgramPage(String programName) {
		try {
			d.findElement(By.xpath("//*[text()='" + programName + "']")).click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			WebElement editButton = d.findElement(By.xpath("//*[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']"));
			wait.until(ExpectedConditions.elementToBeClickable(editButton));
			editButton.click();
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("Clearing old program name");
			wait.until(ExpectedConditions.visibilityOf(addprogramName));
			addprogramName.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);

		} catch (

		Exception e) {
			Assert.fail("edit program group scenario failed");
		}
	}

	public void saveprogram() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(saveprogram));

			log.info("Clicking on save button");
			saveprogram.click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

			log.info("New program added successfully!!!!");

		} catch (Exception e) {
			Assert.fail("Save new program scenario failed");

		}
	}

	public void searchProgram(String programName) {
		try {
			log.info("Searching program group!!!!");
			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
			wait.until(ExpectedConditions.elementToBeClickable(searchByName));
			searchByName.click();

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.visibilityOf(searchbox));
			actions.sendKeys(searchbox, programName).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.visibilityOf(searchBtn));
			searchBtn.click();

			executor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");

		} catch (Exception e) {
			Assert.fail("search program group scenario failed");
		}
	}

	public void verifyProgram(String programName) {
		try {
			log.info("Verifying that program group has been added or updated!!!!");

			searchProgram(programName);

			String newprogram = d.findElement(By.xpath("//*[text()='" + programName + "']")).getText();

			if (newprogram.contentEquals(programName)) {

				log.info("searched program is displayed in a program list: " + newprogram);
			}

			else {
				log.info("Newly added program is not displayed in a program list: " + newprogram);
				Assert.fail("verify  program group scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("verify program group scenario failed");
		}
	}

//	public void cancelprogram() {
//		try {
//			log.info("Clicking on cancel button");
//			cancelprogram.click();
//			String newprogram = addedprogram.getText();
//
//			if (newprogram.contentEquals(programData)) {
//				Assert.fail("After clicking on cancel button new program has been added");
//			}
//
//			else {
//				log.info("After clicking on cancel button new program has not been added");
//			}
//
//		} catch (Exception e) {
//			Assert.fail("cancel button scenario failed");
//		}
//	}

	public void deleteprogramdb() throws SQLException {
		String deleteQuery = "DELETE FROM program_groups WHERE name='" + programData + "'";
		TestUtil.deleteQuerykeydb(deleteQuery);
	}

}