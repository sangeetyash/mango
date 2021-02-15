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
import com.dataseers.qa.*;
import com.dataseers.qa.base.*;

public class AccountPage extends TestBase {
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

  // accounts page
  @CacheLookup
  @FindBy(xpath = "//*[@href='/account']")
  WebElement account;

  // search account details button
  @CacheLookup
  @FindBy(xpath = "//*[@title='Open Filters Panel']")
  WebElement searchAccount;

//    // Account search filters
//    @CacheLookup
//    @FindBy(xpath = "//*[@class='ant-select-selection__placeholder']")
//    List<WebElement> searchFilters;

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

  List<String> accountDetails = new ArrayList<>();

  public AccountPage(WebDriver d) {
      PageFactory.initElements(d, this);
  }

  public void reportsModule() {
      try {
          log.info("Hitting account API and Fetching data from it's response");

          ReportsAPItest.accountAPITest(accountDetails);

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
          wait.until(ExpectedConditions.elementToBeClickable(account));

          Point point = account.getLocation();
          int xcord = point.getX();
          int ycord = point.getY();
//             actions.moveToElement(account, xcord, ycord).click().build().perform();
          JavascriptExecutor executor = (JavascriptExecutor) d;
          executor.executeScript("window.scroll(" + xcord + ", " + ycord + ");");
          executor.executeScript("arguments[0].click();", account);
//            account.click();
          log.info("user is redirected to Account page successfully!!!!");
      } catch (Exception e) {
          Assert.fail("user is Not redirected to Account page!!!!");
      }
  }

  public void searchAccounts() {
      try {
//            actions.sendKeys(Keys.PAGE_DOWN).build().perform();
          realTimeMsgPage();
//            actions.sendKeys(Keys.PAGE_DOWN).build().perform();

          // Account search filters
          List<WebElement> searchFilters = d
                  .findElements(By.xpath("//*[@class='ant-select-selection__placeholder']"));

          wait.until(ExpectedConditions.visibilityOf(searchAccount));
          log.info("Clicking on Search account details button");
          searchAccount.click();

          log.info("Entering data in search filters");

          log.info("Selecting status");

          wait.until(ExpectedConditions.visibilityOfAllElements(searchFilters));
          searchFilters.get(0).click();
          actions.sendKeys(searchFilters.get(0), Keys.ARROW_DOWN, Keys.ENTER).perform();

          log.info("Entering data in account number filter");
          wait.until(ExpectedConditions.visibilityOf(accountNumber));
          accountNumber.sendKeys(accountDetails.get(1));

//            log.info("Selecting spik number");
//            Select spik = new Select(searchFilters.get(1));
//            spik.selectByValue(accountDetails.get(2));
          searchFilters.get(1).click();
          actions.sendKeys(searchFilters.get(1), accountDetails.get(2),Keys.ENTER).perform();
//            for (int i = 0; i <= 35; i++) {
//                actions.sendKeys(Keys.ARROW_DOWN);
//            }
//            actions.sendKeys(Keys.ENTER);

//            log.info("Selecting Program");
//            searchFilters.get(2).click();
//            actions.sendKeys(searchFilters.get(2), accountDetails.get(3), Keys.ENTER).perform();
//
//            log.info("Selecting Product");
//            searchFilters.get(3).click();
//            actions.sendKeys(searchFilters.get(3), accountDetails.get(4), Keys.ENTER).perform();
//
//            log.info("Selecting Group");
//            searchFilters.get(4).click();
//            actions.sendKeys(searchFilters.get(4), accountDetails.get(5), Keys.ENTER).perform();

          log.info("Selecting Processor");
          searchFilters.get(5).click();
          actions.sendKeys(searchFilters.get(5), accountDetails.get(6), Keys.ENTER).perform();

          log.info("Entering data in Account Holder ID filter");
          wait.until(ExpectedConditions.visibilityOf(accountNumber));
          accountHolderID.sendKeys(accountDetails.get(7));

//            log.info("Entering date range in datepicker");
//            wait.until(ExpectedConditions.visibilityOf(datePicker));
//            datePicker.click();
//
//            String randomDate = GenerateData.generateRandomDate("yyyy-MM-dd", "2020-03-04", currentDate);
//            wait.until(ExpectedConditions.visibilityOf(startDate));
//            startDate.sendKeys(randomDate);
//            selectedStartDate.click();
//
//            log.info("Start date is: " + randomDate);
//
//            datePicker.click();
//
//            endDate.sendKeys(Keys.CONTROL + "a" + Keys.BACK_SPACE);
//            endDate.sendKeys(currentDate);
//            log.info("End date is: " + currentDate);
//            selectedEndDate.click();

          applyBtn.click();

//            wait.until(ExpectedConditions.visibilityOf(searchResult));
//            log.info("Search result: " + searchResult.getText());
//            d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
      }

      catch (Exception e) {
          Assert.fail("Search Account Details via filters Test Failed!!!!");
      }
  }

  public void verifyAccountSearch() {

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

          if (spik.contentEquals(accountDetails.get(2)) && accountNum.contentEquals(accountDetails.get(1))
                  && processor.contentEquals(accountDetails.get(6))
                  && programName.contentEquals(accountDetails.get(3))) {

              log.info("Newly added account details are displayed in search result: ");
              log.info("spik number: " + spik);
              log.info("account number: " + accountNum);
              log.info("processor: " + processor);
              log.info("program name: " + programName);

          }

          else {
              log.info("Newly added account details are not displayed in search result: ");
              Assert.fail("verify search account details result scenario failed");
          }

      } catch (Exception e) {
          Assert.fail("verify search account details result scenario failed");

      }
  }

  public void verifyAccountsResponse() {

      try {

          // Expand search result button
          d.findElement(By.xpath(
                  "//*[@id='root']/section/section/main/div/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr/td[1]/div"))
                  .click();

          String responseUserID = d.findElement(By.xpath("(//*[@class='ant-table-row-cell-break-word'])[30]"))
                  .getText();
          String responseUniqueID = d.findElement(By.xpath("(//*[@class='ant-table-row-cell-break-word'])[38]"))
                  .getText();

          if (responseUserID.contentEquals(accountDetails.get(0))
                  && responseUniqueID.contentEquals(accountDetails.get(8))) {
              log.info("Newly added account details response is displayed in search result response: ");
              log.info("User ID: " + responseUserID);
              log.info("Unique ID: " + responseUniqueID);

          } else {
              log.info("Newly added account details response is not displayed in search result response: ");
              Assert.fail("verify search account details response result scenario failed");
          }
      } catch (Exception e) {
          Assert.fail("verify search account details response scenario failed");

      }
  }

}