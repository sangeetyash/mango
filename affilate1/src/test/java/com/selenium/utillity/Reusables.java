
/*ClassName: Resuables.java
Date: 17/April/2020
Author: Saurabh Gadgil
Purpose of class: To implement generic methods, all resuable using Xpath and selenium for robust framework.*/

package com.selenium.utillity;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinition.BaseStep;
//import com.sun.org.apache.bcel.internal.Const;
import com.utility.LogCapture;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.List;

import static com.selenium.utillity.Constants.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class Reusables {
    public String actual;

    public boolean openBrowser(String object, String data) throws Exception {
        try {
            String oSName = System.getProperty("os.name");


            if (data.equals("Chrome")) {
                if (oSName.toUpperCase().contains("WIN")) {
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/windows/chromedriver.exe");
                    //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver_old.exe");
                    Constants.driver = new ChromeDriver();
                    Constants.driver.manage().window().maximize();
                } else {
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/linux/chromedriver");
                    ChromeOptions options = new ChromeOptions();
                    options.setHeadless(true);
                    options.addArguments("--window-size=1920,1080");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--disable-extensions");
                    options.setExperimentalOption("useAutomationExtension", false);
                    options.addArguments("--proxy-server='direct://'");
                    options.addArguments("--proxy-bypass-list=*");
                    options.addArguments("--start-maximized");
                    options.addArguments("--headless");
                    options.addArguments("--whitelisted-ips");
                    options.addArguments("--disable-dev-shm-usage");
                    options.addArguments("--no-sandbox");
                    Constants.driver = new ChromeDriver(options);
                    Constants.driver.manage().window().maximize();
                    //options.addArguments("--no-sandbox");
                }
            }
            takeSnapShot();
            return true;
        } catch (Exception ex) {
            System.out.println(ex);
            LogCapture.info("Webdriver not found...");

            takeSnapShot();
            return false;
        }
    }


    /*  public boolean openBrowser(String object, String data) throws Exception {
  =======
     /* public boolean openBrowser(String object, String data) throws Exception {
  >>>>>>> bc2df4118a9dc5bebd7b613fc77a906856728b08
          try {
              if (data.equals("Chrome")) {
                  LogCapture.info("checkpoint.....");
                  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/linux/chromedriver");
                  driver = new ChromeDriver();
                  driver.manage().window().maximize();

              }
              takeSnapShot();
              return true;
          } catch (Exception ex) {
              takeSnapShot();
              return false;
          }
      }*/
    public String navigate(String object, String data) throws Exception {
        try {
            Constants.driver.navigate().to(data);
            takeSnapShot();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "...not able to navigate";

        }
        return Constants.KEYWORD_PASS;
    }

    public String writeInInput(String object, String data) throws Exception {
        try {
            Constants.driver.findElement(By.xpath(object)).sendKeys(data);
            takeSnapShot();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Unable to write " + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

    public String click(String object, String data) throws Exception {
        try {
            Constants.driver.findElement(By.xpath(object)).click();
            takeSnapShot();

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Not able to click...." + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

    public static void quitDriver() {
        driver.quit();
    }

    /*
    public String getCurrentDay() {
        //Create a Calendar Object
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //Get Current Day as a number
        int todayDayInt = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Today Int: " + todayDayInt +"\n");
        //Integer to String Conversion
        String todayDayStr = Integer.toString(todayDayInt);
        System.out.println("Today Str: " + todayDayStr + "\n");

        return todayDayStr;
    }
    public String getCurrentMonth(){
        //Create a Calendar Object
        Date date=new Date();
        LocalDate today = LocalDate.now();
        //Get Current Day as a number
        int todayMonthInt = today.getMonthValue();
        //Get Current Day as a number
        System.out.println("Current Month Int: " + todayMonthInt +"\n");
        //Integer to String Conversion
        String todayMonthStr = Integer.toString(todayMonthInt);
        System.out.println("Current Month Str: " + todayMonthStr + "\n");
        return todayMonthStr;
    }
    public int getCurrentYear(){
        //Create a Calendar Object
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //Get Current Day as a number
        int todayYearInt = calendar.get(Calendar.YEAR);
        System.out.println("Current Year Int: " + todayYearInt +"\n");
        //Integer to String Conversion
        //String todayYearStr = Integer.toString(todayYearInt);
        //System.out.println("Current Year Str: " + todayYearStr + "\n");
        return todayYearInt;
    }
public int YearSelectionValidation() throws NullPointerException{

    int todayYearInt=Constants.key.getCurrentYear();
    int MaxYear= todayYearInt-100; //Maximum Visible year
    int MinYear= todayYearInt-18; //Minimum age limit for DOB is 18 years
    int RandomYearSelection = MinYear +(int)(Math.random()*(MaxYear - MinYear+1));

    System.out.println("Random year: "+RandomYearSelection);
    return RandomYearSelection;
}
*/

    //1. DatePicker is a function
    //2. Parameter will be three
    //a. Random date(Between min and max)
//b. MinDate
    //c.maximum date
    public String datePicker(String object, String data) throws Exception {
        try {
            //Create a Calendar Object
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();

            // SimpleDateFormat CurrentMonth= new SimpleDateFormat()
            calendar.setTime(date);
            //Get Current Day as a number
            int todayDayInt = calendar.get(Calendar.DAY_OF_MONTH);
            System.out.println("Today Int: " + todayDayInt + "\n");
            //Integer to String Conversion
            String todayDayStr = Integer.toString(todayDayInt);
            System.out.println("Today Str: " + todayDayStr + "\n");
            //Getting current month
            LocalDate today = LocalDate.now();
            int todayMonthInt = today.getMonthValue();
            String monthName = DateTime.now().withMonthOfYear(todayMonthInt).toString("MMMMMMMMMMMM");
            System.out.println(monthName);
            //Get Current Day as a number
            System.out.println("Current Month Int: " + todayMonthInt + "\n");
            //Integer to String Conversion
            String todayMonthStr = Integer.toString(todayMonthInt);
            System.out.println("Current Month Str: " + todayMonthStr + "\n");
            //Getting Current year
            int todayYearInt = calendar.get(Calendar.YEAR);
            System.out.println("Current Year Int: " + todayYearInt + "\n");
            //Click on calendar

            //Constants.key.MouseFunctions(object, "DoubleClick");
            //Constants.key.navigateSubMenu(object, "");
            Constants.key.click(object, "");
            //Click on year and navigate to particular year
            // String vDefaultYear = Constants.Affiliates_RegisterACustomerOR.getProperty("DefaultYear");
            int MaxYear = todayYearInt - 100; //Maximum Visible year
            int AboveMaxYear = todayYearInt - 101;
            int BelowMaxYear = todayYearInt - 99;
            int MinYear = todayYearInt - 18; //Minimum age limit for DOB is 18 years
            int BelowMinYear = todayYearInt - 17;
            int AboveMinYear = todayYearInt - 19;
            int RandomYearSelection = 0;
            if (data.equalsIgnoreCase("Random")) {
                RandomYearSelection = MinYear + (int) (Math.random() * (MaxYear - MinYear + 1));
            } else if (data.equalsIgnoreCase("MaxYear")) {
                RandomYearSelection = MaxYear;
            }
        /*else if(data.equalsIgnoreCase("BelowMaxYear")){
            RandomYearSelection=BelowMaxYear;
        }*/
            else if (data.equalsIgnoreCase("MinYear")) {
                RandomYearSelection = MinYear;
            }
        /*else if(data.equalsIgnoreCase("AboveMinYear")){
            RandomYearSelection=AboveMinYear;
        }*/

            System.out.println("Random year: " + RandomYearSelection);
            String vDefaultYear = "//button//parent::span//child::h6";
            Constants.key.pause("2", "");
            //Constants.key.navigateSubMenu(vDefaultYear, "");
            // Constants.driver.findElement(By.xpath(vDefaultYear)).click();
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vDefaultYear, ""));
            Assert.assertEquals("PASS", Constants.key.click(vDefaultYear, ""));
            // int DOBYearInt = Constants.key.YearSelectionValidation();
            String DOB_YearStr = Integer.toString(RandomYearSelection);
            String YearSelection = "//div[text()='" + DOB_YearStr + "']";

            WebElement DOB_Year = Constants.driver.findElement(By.xpath(YearSelection));

            //Constants.key.navigateSubMenu(YearSelection, "");
            JavascriptExecutor js = (JavascriptExecutor) Constants.driver;
            js.executeScript("arguments[0].scrollIntoView(true);", DOB_Year);
            DOB_Year.click();
            Constants.key.pause("1", "");
            String DefaultDate = Constants.Affiliates_RegisterACustomerOR.getProperty("DefaultDate");
            String DefaultMonthDateText = Constants.driver.findElement(By.xpath(DefaultDate)).getText();
            //PreviousMonthNavigation
            //String PreviousMonthNavigation="//div[starts-with(@class,'MuiPickersCalendarHeader-switchHeader')]//child::button[1]";
            //NextMonthNavigation
            String NextMonthNavigation = "//div[starts-with(@class,'MuiPickersCalendarHeader-switchHeader')]//child::button[2]";
        /*
if(DefaultMonthDateText.equalsIgnoreCase(monthName+" "+DOB_YearStr)){

    if (data.equalsIgnoreCase("MaxYear")) {

        int MaxYearInvalidDate = todayDayInt - 1;
        System.out.println("USer is not MAx year loop...and invalid date: "+MaxYearInvalidDate);
        String DOB_MaxYearInvalidDate = Integer.toString(MaxYearInvalidDate);
        if (DOB_MaxYearInvalidDate.equalsIgnoreCase("0")) {
            String DOB_InvalidDate = "1";
            String DOB_MaxYearInvalidDatePath = "//p[text()='" + DOB_InvalidDate + "']/parent::span//parent::button[@tabindex='0']";
            Assert.assertEquals("PASS", Constants.key.notexist(DOB_MaxYearInvalidDatePath, ""));
            System.out.println("Invalid Greyout date: "+DOB_InvalidDate+"verified.....");
        } else {
            String DOB_MaxYearInvalidDatePath = "//p[text()='" + DOB_MaxYearInvalidDate + "']/parent::span//parent::button[@tabindex='0']";
            Assert.assertEquals("PASS", Constants.key.notexist(DOB_MaxYearInvalidDatePath, ""));
            System.out.println("Invalid Greyout date: "+DOB_MaxYearInvalidDate+" verified.....");
        }
    }
         if (data.equalsIgnoreCase("MinYear")) {
             int MinYearInvalidDate = todayDayInt + 1;
             String DOB_MinYearInvalidDate = Integer.toString(MinYearInvalidDate);
             if ((calendar.DAY_OF_YEAR) > 365) {
                 if (monthName.equalsIgnoreCase("February")) {
                     if (DOB_MinYearInvalidDate.equalsIgnoreCase("30")) {
                         String DOB_InvalidDate = "1";
                         String DOB_MinYearInvalidDatePath = "//p[text()='" + DOB_InvalidDate + "']/parent::span//parent::button[@tabindex='-1']";
                         List<WebElement> AllDates = driver.findElements(By.xpath(DOB_MinYearInvalidDatePath));
                         for (int i = 0; i < AllDates.size(); i++) {
                             WebElement AllDateStrng = AllDates.get(i);

                           Constants.driver.findElement(By.xpath(AllDateStrng), "");
                         }
                         Assert.assertEquals("PASS", Constants.key.notexist(DOB_MinYearInvalidDatePath, ""));
                     } else {
                         String DOB_MinYearInvalidDatePath = "//p[text()='" + DOB_MinYearInvalidDate + "']/parent::span//parent::button[@tabindex='0']";
                         Assert.assertEquals("PASS", Constants.key.notexist(DOB_MinYearInvalidDatePath, ""));
                     }
                 }

             }
             if ((calendar.DAY_OF_YEAR) <= 365) {
                 if (monthName.equalsIgnoreCase("February")) {
                     if (DOB_MinYearInvalidDate.equalsIgnoreCase("29")) {
                         String DOB_InvalidDate = "1";
                         String DOB_MinYearInvalidDatePath = "//p[text()='" + DOB_InvalidDate + "']/parent::span//parent::button[@tabindex='-1']";
                         Constants.driver.findElements(By.xpath(DOB_MinYearInvalidDatePath));
                     }
                 }
                 else{
                     if((todayMonthInt % 2)==0){

                     }
                     if (DOB_MinYearInvalidDate.equalsIgnoreCase("32")) {
                         String DOB_InvalidDate = "31";
                         String DOB_MinYearInvalidDatePath = "//p[text()='" + DOB_InvalidDate + "']/parent::span//parent::button[@tabindex='0']";
                         Assert.assertEquals("PASS", Constants.key.notexist(DOB_MinYearInvalidDatePath, ""));
                     } else {
                         String DOB_MaxYearInvalidDatePath = "//p[text()='" + DOB_MinYearInvalidDate + "']/parent::span//parent::button[@tabindex='0']";
                         Assert.assertEquals("PASS", Constants.key.notexist(DOB_MaxYearInvalidDatePath, ""));
                     }
                 }

             }


         }
}*/
            if (DefaultMonthDateText.equalsIgnoreCase("January " + DOB_YearStr)) {

                //String DOB_Month = Constants.key.getCurrentMonth();

                System.out.println("Month need to select: " + todayMonthStr);
                switch (todayMonthStr) {
                    case "1":
                        String SelectedMonthJan = "January " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthJan));
                        LogCapture.info("Selected January month");
                        break;
                    case "2":
                        for (int i = 1; i < 2; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthFeb = "February " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthFeb));
                        LogCapture.info("Selected February Month");
                        break;
                    case "3":
                        for (int i = 1; i < 3; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthMarch = "March " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthMarch));
                        LogCapture.info("Selected March Month");
                        break;
                    case "4":
                        for (int i = 1; i < 4; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthApr = "April " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthApr));
                        LogCapture.info("Selected April Month");
                        break;
                    case "5":
                        for (int i = 1; i < 5; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthMay = "May " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthMay));
                        LogCapture.info("Selected May Month");
                        break;
                    case "6":
                        for (int i = 1; i < 6; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthJune = "June " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthJune));
                        LogCapture.info("Selected June Month");
                        break;
                    case "7":
                        for (int i = 1; i < 7; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthJuly = "July " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthJuly));
                        LogCapture.info("Selected July Month");
                        break;
                    case "8":
                        for (int i = 1; i < 8; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthAug = "August " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthAug));
                        LogCapture.info("Selected August Month");
                        break;
                    case "9":
                        for (int i = 1; i < 9; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthSep = "September " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthSep));
                        LogCapture.info("Selected September Month");
                        break;
                    case "10":
                        for (int i = 1; i < 10; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthOct = "October " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthOct));
                        LogCapture.info("Selected October Month");
                        break;
                    case "11":
                        for (int i = 1; i < 11; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthNov = "November " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthNov));
                        LogCapture.info("Selected November Month");
                        break;
                    case "12":
                        for (int i = 1; i < 12; i++) {
                            Constants.key.click(NextMonthNavigation, "");
                            Constants.key.pause("1", "");
                        }
                        Constants.key.pause("1", "");
                        String SelectedMonthDec = "December " + DOB_YearStr;
                        Assert.assertEquals("PASS", Constants.key.verifyText(DefaultDate, SelectedMonthDec));
                        LogCapture.info("Selected December Month");
                        break;
                }

            }

            //Click on particular date
            // String SelectDate = Constants.key.getCurrentDay();
            String DOB_Date = "//p[text()='" + todayDayStr + "']/parent::span//parent::button[@tabindex='0']";
            Constants.driver.findElement(By.xpath(DOB_Date)).click();
            Constants.key.pause("2", "");
            System.out.println("Date selected: " + todayDayStr);

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Not able to Click on Date...." + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

    public String MouseFunctions(String object, String data) throws Exception {
        try {
            WebElement Element = driver.findElement(By.xpath(object));
            Actions action = new Actions(Constants.driver);
            if (data.equalsIgnoreCase("clickAndHold")) {
                action.moveToElement(Element).build().perform();
                action.clickAndHold(Element).build().perform();
                takeSnapShot();
            } else if (data.equalsIgnoreCase("ReleaseMouseClick")) {
                action.moveToElement(Element).build().perform();
                action.release(Element).build().perform();
                takeSnapShot();
            } else if (data.equalsIgnoreCase("DoubleClick")) {
                action.doubleClick(Element).build().perform();
                takeSnapShot();
            } else if (data.equalsIgnoreCase("MoveToElement")) {
                action.moveToElement(Element);
                action.perform();
                takeSnapShot();
            }

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Not able to clickAndHold...." + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

    public String VerifyAllDropDownValues(String sheetName, String colName, String object) throws Exception {
        System.out.println("start");
        String fileName = System.getProperty("user.dir") + "/TestData.xlsx";

        File file = new File(fileName);
        FileInputStream inputStream = new FileInputStream(file);
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        System.out.println("end");
        if (fileExtensionName.equals(".xlsx")) {
            System.out.println("if");
            Workbook DropDownworkbook = null;
            DropDownworkbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = (XSSFSheet) DropDownworkbook.getSheet(sheetName);
            XSSFRow row;
            XSSFCell cell;
            String CellValue = null;
            try {

                int col_Num = -1;
                row = sheet.getRow(0);
                System.out.println("Ronumber" + row);
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    if (row.getCell(j).getStringCellValue().trim().equals(colName.trim())) {
                        col_Num = j;
                        System.out.println("ColNum" + col_Num);
                        //row= sheet.getRow(j);

                        for (int i = 1; i < sheet.getLastRowNum(); i++) {
                            row = sheet.getRow(i);
                            cell = row.getCell(col_Num);

                            if (cell.getStringCellValue().equalsIgnoreCase("")) {
                                System.out.println("Empty Value");
                            } else {

                                if (cell.getCellTypeEnum() == CellType.STRING) {
                                    CellValue = cell.getStringCellValue();
                                    System.out.println("Value" + CellValue);
                                    // return CellValue;
                                } else if (cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA) {
                                    CellValue = String.valueOf(cell.getNumericCellValue());
                                    if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                        DateFormat df = new SimpleDateFormat("dd/MM/yy");
                                        Date date = cell.getDateCellValue();
                                        CellValue = df.format(date);
                                    }
                                    // return CellValue;
                                } else if (cell.getCellTypeEnum() == CellType.BLANK) {
                                    CellValue = "";
                                    //return CellValue;
                                } else if (cell.getBooleanCellValue()) {
                                    CellValue = String.valueOf(cell.getBooleanCellValue());
                                    //return CellValue;
                                } else if (!cell.getBooleanCellValue()) {
                                    CellValue = String.valueOf(cell.getBooleanCellValue());
                                    //return CellValue;
                                }
                            }
                            // return CellValue;

                            System.out.println("Value is: " + CellValue);
                            Constants.driver.findElement(By.xpath(object)).clear();
                            Constants.driver.findElement(By.xpath(object)).click();
                            //Constants.driver.findElement(By.xpath(object)).clear();
                            Constants.driver.findElement(By.xpath(object)).sendKeys(CellValue);

                            Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.ARROW_DOWN);
                            Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.ENTER);
                            takeSnapShot();
                            Constants.key.pause("2", "");

                            //String vCD_PhoneNumber = Constants.Refer_a_Client.getProperty("CD_PhoneNumber");
                            //Constants.key.click(vCD_PhoneNumber, "");
                            String fotter = object + "//following::p[contains(@class,'MuiTypography-body1')][1]";
                            //System.out.println(fotter);
                            Constants.driver.findElement(By.xpath(fotter)).click();
                            Constants.key.pause("2", "");
                            String ActualDropDownValuetrim = Constants.driver.findElement(By.xpath(object)).getAttribute("value");
                            String ActualDropDownValue = ActualDropDownValuetrim.trim();

                            // System.out.println("Actual DropDown Value is: " + ActualDropDownValue);
                            //Is assert correct or need to put it into try catch block???

                            if (ActualDropDownValue.equals(CellValue)) {

                                System.out.println("ActualValue: " + ActualDropDownValue + " Matched ExpectedValue: " + CellValue);

                            } else {
                                System.out.println("ActualValue: " + ActualDropDownValue + " NOT Matched ExpectedValue: " + CellValue);
                                break;
                            }
                            // return "row " + rowNum + " or column " + colName + " does not exist  in Excel";
                        }


                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                return "data not found";
            }

        } else {
            Workbook DropDownworkbook = null;
            DropDownworkbook = new HSSFWorkbook(inputStream);
            HSSFSheet sheet = (HSSFSheet) DropDownworkbook.getSheet(sheetName);
            HSSFRow row = null;
            HSSFCell cell = null;
            String CellValue = null;
            try {

                int col_Num = -1;
                row = sheet.getRow(0);

                for (int j = 0; j < row.getLastCellNum(); j++) {
                    if (row.getCell(j).getStringCellValue().trim().equals(colName.trim())) {
                        col_Num = j;
                        row = sheet.getRow(j);

                        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                            row = sheet.getRow(i);
                            cell = row.getCell(col_Num);

                            if (cell.getCellTypeEnum() == CellType.STRING) {
                                CellValue = cell.getStringCellValue();
                                System.out.println("Value" + CellValue);
                                // return CellValue;
                            } else if (cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA) {
                                CellValue = String.valueOf(cell.getNumericCellValue());
                                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                    DateFormat df = new SimpleDateFormat("dd/MM/yy");
                                    Date date = cell.getDateCellValue();
                                    CellValue = df.format(date);
                                }
                                // return CellValue;
                            } else if (cell.getCellTypeEnum() == CellType.BLANK) {
                                CellValue = "";
                                //return CellValue;
                            } else if (cell.getBooleanCellValue()) {
                                CellValue = String.valueOf(cell.getBooleanCellValue());
                                //return CellValue;
                            } else if (!cell.getBooleanCellValue()) {
                                CellValue = String.valueOf(cell.getBooleanCellValue());
                                //return CellValue;
                            }

                            System.out.println("Value is: " + CellValue);
                            Constants.driver.findElement(By.xpath(object)).click();
                            //Constants.driver.findElement(By.xpath(object)).clear();
                            Constants.driver.findElement(By.xpath(object)).sendKeys(CellValue);
                            Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.ARROW_DOWN);
                            Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.ENTER);
                            takeSnapShot();
                            String vCD_PhoneNumber = Constants.Refer_a_Client.getProperty("CD_PhoneNumber");
                            Constants.key.click(vCD_PhoneNumber, "");
                            String ActualDropDownValue = Constants.driver.findElement(By.xpath(object)).getAttribute("value");
                            // System.out.println("Actual DropDown Value is: " + ActualDropDownValue);
                            //Is assert correct or need to put it into try catch block???
                            if (CellValue.equals(ActualDropDownValue)) {
                                Assert.assertEquals("PASS", Constants.key.verifyText(object, CellValue));
                                System.out.println("ActualValue: " + ActualDropDownValue + " Matched ExpectedValue: " + CellValue);

                            } else {
                                System.out.println("ActualValue: " + ActualDropDownValue + " NOT Matched ExpectedValue: " + CellValue);

                            }

                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "Data not found...";
            }
        }
        return "row " + " or column " + colName + " does not exist  in Excel";
    }


    public String verifyText(String object, String data) throws Exception {
        try {
            String actual = Constants.driver.findElement(By.xpath(object)).getText();
            if (actual.length() < 1) {
                actual = Constants.driver.findElement(By.xpath(object)).getAttribute("value");
            }
            String expected = data;
            System.out.println("actual value->>>>" + actual);
            System.out.println("data   value->>>>" + data);
            if (actual.equals(expected)) {
                takeSnapShot();
                return Constants.KEYWORD_PASS;
            } else {
                takeSnapShot();
                return Constants.KEYWORD_FAIL + "...text not verified " + actual + "  " + expected;
            }
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Object not found...." + e.getMessage();
        }

    }

    public String verifyInnerText(String object, String data) throws Exception {
        try {
            String actual = Constants.driver.findElement(By.xpath(object)).getAttribute("innerText");
            if (actual.length() < 1) {
                actual = Constants.driver.findElement(By.xpath(object)).getAttribute("value");
            }
            String expected = data;
            System.out.println("actual value->>>>" + actual);
            System.out.println("data value->>>>" + data);
            if (actual.equals(expected)) {
                takeSnapShot();
                return Constants.KEYWORD_PASS;
            } else {
                takeSnapShot();
                return Constants.KEYWORD_FAIL + "...text not verified " + actual + "  " + expected;
            }
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Object not found...." + e.getMessage();
        }

    }

    public String pause(String object, String data) throws NumberFormatException, InterruptedException {
        long time = (long) Double.parseDouble(object);
        Thread.sleep(time * 1000L);
        return Constants.KEYWORD_PASS;

    }

    public String WaitElementToBeVisible(String object, String data) throws Exception {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        if (data.equalsIgnoreCase("VisibilityOf")) {
            try {
                WebElement element = wait.until(ExpectedConditions.visibilityOf(Constants.driver.findElement(By.xpath(object))));
                System.out.println("object exist" + element.isDisplayed());
                takeSnapShot();
            } catch (Exception e) {
                takeSnapShot();
                return Constants.KEYWORD_FAIL + "object does not exist " + e.getMessage();
            }

        }
        return Constants.KEYWORD_PASS;

    }

    public static void takeSnapShot() throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
        String dateString = format.format(new Date());
        String vScenarioN = BaseStep.scenarioName;

        //Convert web driver object to TakeScreenshot

        //String fileWithPath = System.getProperty("user.dir") + "\\Screenshot\\SS"+"_"+vScenarioN+ "_"+ dateString + ".png";
        String fileWithPath = System.getProperty("user.dir") + "\\Screenshot\\SC" + "_" + vScenarioN + "_" + dateString + ".png";

        //String fileWithPath = "C://Framework//CucumberSeleniumProject//CucumberSeleniumProject////SC" + dateString + ".png";
        TakesScreenshot scrShot = ((TakesScreenshot) Constants.driver);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File DestFile = new File(fileWithPath);
        //Copy file at destination
        FileUtils.copyFile(SrcFile, DestFile);
        Reporter.addScreenCaptureFromPath(fileWithPath);
    }

    public String selectList(String object, String data) throws Exception {
        try {
            int attempt = 0;
            Select objSelect = new Select(Constants.driver.findElement(By.xpath(object)));
            if (!data.equals(Constants.RANDOM_VALUE)) {
                objSelect.selectByVisibleText(data);
                takeSnapShot();
            } else {
                WebElement droplist = Constants.driver.findElement(By.xpath(object));
                List<WebElement> droplist_contents = droplist.findElements(By.tagName("option"));
                Random num = new Random();
                int index = num.nextInt(droplist_contents.size());
                String selectedVal = droplist_contents.get(index).getText();
                objSelect.selectByVisibleText(selectedVal);
                takeSnapShot();
            }

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "---Could not select from the List---" + e.getMessage();

        }
        return Constants.KEYWORD_PASS;
    }

    public String sendkeyboardStroke(String object, String data) throws Exception {
        //valid values for data = space,enter,up,tab,down,left,right
        try {
            Robot robot = new Robot();
            if (!object.equals("")) {
                WebElement browseBtn = Constants.driver.findElement(By.xpath(object));
                browseBtn.click();
                Thread.sleep(1000);
            }
            if (data.equals("space")) {
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);
            } else if (data.equals("enter")) {
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            } else if (data.equals("tab")) {
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
            } else if (data.equals("down")) {
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
            }
            Thread.sleep(1000);
            takeSnapShot();

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "....unable to find element...." + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

    public String getReportConfigPath() {
        String reportConfigPath = Constants.CONFIG.getProperty("reportConfigPath");
        if (reportConfigPath != null) return reportConfigPath;
        else
            throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }

    public String exist(String object, String data) throws Exception {
        try {
            Constants.driver.findElement(By.xpath(object));
            takeSnapShot();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "object does not exist " + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

    public String navigateSubMenu(String object, String data) throws Exception {
        try {
            WebElement elem = Constants.driver.findElement(By.xpath(object));
            String js = "argements[0].click();";
            ((JavascriptExecutor) Constants.driver).executeScript(js, elem);

            takeSnapShot();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "object does not exist " + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }


    public String AltasRejectDropDown(String object, String data) throws Exception {
        try {
            List<WebElement> dropdown_list = Constants.driver.findElements(By.xpath(object));
            //System.out.println("The Options in the Dropdown are: " + dropdown_list.size());
            for (int i = 0; i < dropdown_list.size(); i++) {
                //System.out.println(dropdown_list.get(i).getText());
                if (dropdown_list.get(i).getText().contains(data)) {
                    for (int j = 1; j < 10000; j++) {
                        String vdata = Constants.driver.findElement(By.xpath("//div[@id='input-more-reject-reasons']//li[" + j + "]//label[1]")).getText();
                        if (vdata.equals(data)) {
                            Constants.driver.findElement(By.xpath("//div[@id='input-more-reject-reasons']//li[" + j + "]//label[1]")).click();
                            break;
                        }
                    }
                }
            }

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "drop down value does not exist " + e.getMessage();
        }
        takeSnapShot();
        return Constants.KEYWORD_PASS;
    }

 /*   public void ReadCookies() {
        // create file named Cookies to store Login Information
        File file = new File("C:\\POC2\\CucumberSeleniumProject\\Cookies.data");
        try {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for (Cookie ck : Constants.driver.manage().getCookies()) {
                Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";" + ck.getExpiry() + ";" + ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void WriteCookies() {
        try {

            File file = new File("C:\\POC2\\CucumberSeleniumProject\\Cookies.data");
            FileReader fileReader = new FileReader(file);
            BufferedReader Buffreader = new BufferedReader(fileReader);
            String strline;
            while ((strline = Buffreader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(strline, ";");
                while (token.hasMoreTokens()) {
                    String name = token.nextToken();
                    String value = token.nextToken();
                    String domain = token.nextToken();
                    String path = token.nextToken();
                    Date expiry = null;

                    String val;
                    if (!(val = token.nextToken()).equals("null")) {
                        expiry = new Date(val);
                    }
                    Boolean isSecure = new Boolean(token.nextToken()).
                            booleanValue();
                    Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
                    System.out.println(ck);
                    Constants.driver.manage().addCookie(ck); // This will add the stored cookie to your current session
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }*/

    public String isAlertPresent() {
        try {
            Alert alert = Constants.driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            return Constants.KEYWORD_FAIL;
        }
        return Constants.KEYWORD_PASS;
    }

    public String clearText(String object) throws Exception {
        try {
            Constants.driver.findElement(By.xpath(object)).clear();
            takeSnapShot();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL;
        }
        return Constants.KEYWORD_PASS;
    }


    public String verifyLinkText(String object, String data) throws Exception {
        try {
            String LinkObjectText = Constants.driver.findElement(By.xpath(object)).getText();
            String actual = Constants.driver.findElement(By.linkText(LinkObjectText)).getText();
            if (actual.length() < 1) {
                actual = Constants.driver.findElement(By.linkText(LinkObjectText)).getAttribute("value");
            }

            System.out.println("actual value->>>>" + actual);
            System.out.println("data value->>>>" + data);
            if (actual.equals(data)) {
                takeSnapShot();
                return Constants.KEYWORD_PASS;
            } else {
                takeSnapShot();
                return Constants.KEYWORD_FAIL + "...Link text not verified " + actual + "  " + data;
            }
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Link not found...." + e.getMessage();
        }

    }

    public String SfLeadDD(String object, String data) throws Exception {
        try {
            Constants.driver.findElement(By.xpath(object)).click();
            Constants.key.pause("2", "");
            Constants.driver.findElement(By.xpath(data)).click();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL;
        }
        return Constants.KEYWORD_PASS;
    }

    public String VerifyTitle(String object, String data) throws Exception {
        try {
            String actual = Constants.driver.getTitle();
            String expected = data;
            System.out.println("actual value->>>>" + actual);
            System.out.println("data value->>>>" + data);
            if (actual.equals(expected)) {
                takeSnapShot();
                return Constants.KEYWORD_PASS;
            } else {
                takeSnapShot();
                return Constants.KEYWORD_FAIL + "...text not verified " + actual + "  " + expected;
            }
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Object not found...." + e.getMessage();
        }

    }

    //
    //        w.until(ExpectedConditions.visibilityOfAllElements( By.xpath(Constants.CreateFxTicketOR.getProperty("CloseFxSlipButton"))));

    public String VisibleConditionWait(String object, String data) throws Exception {
        try {
            WebDriverWait w = new WebDriverWait(Constants.driver, 150);
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(object)));
            takeSnapShot();

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL;
        }
        return Constants.KEYWORD_PASS;
    }

    public String KeyboardAction(String object, String data) throws Exception {
        try {
            if (data.equalsIgnoreCase("enter")) {
                Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.ENTER);
                takeSnapShot();
            } else if (data.equalsIgnoreCase("tab")) {
                Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.TAB);
                takeSnapShot();
            } else if (data.equalsIgnoreCase("space")) {
                Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.SPACE);
                takeSnapShot();
            } else if (data.equalsIgnoreCase("downArrow")) {
                Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.ARROW_DOWN);
                takeSnapShot();
            } else if (data.equalsIgnoreCase("selectall")) {
                Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.chord(Keys.CONTROL, "a"));
                takeSnapShot();
            } else if (data.equalsIgnoreCase("delete")) {
                Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.DELETE);
                takeSnapShot();
            } else if (data.equalsIgnoreCase("upArrow")) {
                Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.ARROW_UP);
                takeSnapShot();
            } else if (data.equalsIgnoreCase("esc")) {
                System.out.println("esc");
                Constants.driver.findElement(By.xpath(object)).sendKeys(Keys.ESCAPE);
                takeSnapShot();
            }

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL;

        }
        return Constants.KEYWORD_PASS;
    }

    public String verifyElementProperties(String object, String data) throws Exception {
        try {
            if (data.contains("disabled")) {
                String buttonDisabled = Constants.driver.findElement(By.xpath(object)).getAttribute("disabled");
                if (buttonDisabled != null) {
                    takeSnapShot();
                    return Constants.KEYWORD_PASS;
                } else {
                    takeSnapShot();
                    return Constants.KEYWORD_FAIL + " - Not Disabled";
                }
            } else if (data.contains("enabled")) {
                String buttonEnabled = Constants.driver.findElement(By.xpath(object)).getAttribute("enabled");
                if (buttonEnabled == null) {
                    takeSnapShot();
                    return Constants.KEYWORD_PASS;
                } else {
                    takeSnapShot();
                    return Constants.KEYWORD_FAIL + " - Not Enabled";
                }

            } else if (data.contains("visible")) {
                if (Constants.driver.findElement(By.xpath(object)).isDisplayed()) {
                    takeSnapShot();
                    return Constants.KEYWORD_PASS;
                } else {
                    takeSnapShot();
                    return Constants.KEYWORD_FAIL + " -Not Displayed";
                }
            } else if (data.contains("unselected")) {
                if (!Constants.driver.findElement(By.xpath(object)).isSelected()) {
                    takeSnapShot();
                    return Constants.KEYWORD_PASS;
                } else {
                    takeSnapShot();
                    return Constants.KEYWORD_FAIL + " -Not Exists";
                }
            } else if (data.contains("selected")) {
                if (Constants.driver.findElement(By.xpath(object)).isSelected()) {
                    takeSnapShot();
                    return Constants.KEYWORD_PASS;
                } else {
                    takeSnapShot();
                    return Constants.KEYWORD_FAIL + " -Not Exists";
                }
            } else if (data.contains("Invisible")) {
                if (!Constants.driver.findElement(By.xpath(object)).isDisplayed()) {
                    takeSnapShot();
                    return Constants.KEYWORD_PASS;
                } else {
                    takeSnapShot();
                    return Constants.KEYWORD_FAIL + " -Not Displayed";
                }
            } else if (data.contains("readonly")) {
                String readonly = Constants.driver.findElement(By.xpath(object)).getAttribute("readonly");
                if (readonly != null) {
                    takeSnapShot();
                    return Constants.KEYWORD_PASS;
                } else {
                    takeSnapShot();
                    return Constants.KEYWORD_FAIL + " - Not readonly";
                }

            }


        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + " -  Could not find element";

        }

        return Constants.KEYWORD_PASS;
    }

    public String notexist(String object, String data) throws Exception {
        try {
            Constants.driver.findElement(By.xpath(object));
            takeSnapShot();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_PASS;
        }
        return Constants.KEYWORD_FAIL + "object exist ";
    }

    public String UniqueEmail_ID(String object, String data) throws Exception {
        try {
            String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
            String emailID = "xyz" + userName + "@mailinator.com";
            //System.out.println("Result......" + emailID);
            Constants.driver.findElement(By.xpath(object)).clear();
            Thread.sleep(1000);
            Constants.driver.findElement(By.xpath(object)).sendKeys(emailID);
            Thread.sleep(1000);
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL;
        }
        return Constants.KEYWORD_PASS;
    }

    public String InVisibleConditionWaitWithText(String object, String data) throws Exception {
        try {
            WebDriverWait w = new WebDriverWait(Constants.driver, 10);
            w.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(object), data));
            takeSnapShot();

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_PASS;
        }
        return Constants.KEYWORD_FAIL;
    }

    public String UnselectDropDownListValues(String object, String data) throws Exception {
        try {
            WebElement dropdown_list = Constants.driver.findElement(By.xpath("//label[text()='" + data + "']"));
            System.out.println("Dropdownlist" + dropdown_list);
            if (dropdown_list.isSelected() == true) {
                dropdown_list.click();
                //Constants.driver.findElement(By.xpath("//label[text()='"+data+"']")).click();
            }

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "drop down value does not exist " + e.getMessage();
        }
        takeSnapShot();
        return Constants.KEYWORD_PASS;
    }

    public String RefreshPage(String object, String data) throws Exception {
        try {
            Constants.driver.navigate().refresh();
            takeSnapShot();

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Not able to click...." + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

    public String SelectDropDownAllValues(String object, String data) throws Exception {
        try {
            Constants.key.pause("2", "");
            List<WebElement> dropdown_list = Constants.driver.findElements(By.xpath(object));
            System.out.println("The Options in the Dropdown are: " + dropdown_list.size());
            for (int i = 1; i <= dropdown_list.size(); i++) {
                System.out.println(dropdown_list.get(i).getText());
                Constants.driver.findElement(By.xpath("//*[contains(@class,'is-active')]//ul//li[" + i + "]")).click();
                if (i == dropdown_list.size() - 1) {
                    System.out.println(i);
                    break;
                }
            }

        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "drop down value does not exist " + e.getMessage();
        }

        takeSnapShot();
        return Constants.KEYWORD_PASS;
    }

    public int getCurrentYear() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int todayYearInt = calendar.get(Calendar.YEAR);
        return todayYearInt;
    }

    public int getPreviousYear() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int todayYearInt = calendar.get(Calendar.YEAR);
        return (todayYearInt - 1);
    }

    public static Month getCurrentMonth() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        LocalDate today = LocalDate.now();
        Month todayMonthStr = today.getMonth();
        Month month = todayMonthStr.of(calendar.get(Calendar.MONTH));
        System.out.println("Current Month Str: " + month + "\n");
        return month;
    }

    public String verifyFontProperties(String object, String properties, String data) throws Exception {
        try {
            WebElement TextElement = driver.findElement(By.xpath(object));
            String fontProperties = null;
            fontProperties = TextElement.getCssValue(properties);
            if (fontProperties.equals(data)) {
                LogCapture.info("Font Properties Verified: " + properties + " = " + data);
                takeSnapShot();
            } else {
                LogCapture.info("Font Properties NOT Verified: " + properties + " = " + data);
                takeSnapShot();
                return Constants.KEYWORD_FAIL;
            }
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + " -  Could not find element";

        }
        return Constants.KEYWORD_PASS;
    }

    public String randomWordGenerator(String object, int numberOfWords) throws Exception {
        try {
            String[] randomStrings = new String[numberOfWords];
            Random random = new Random();
            for (int i = 0; i < numberOfWords; i++) {
                char[] word = new char[random.nextInt(1) + 1]; // words of length 3 through 10. (1 and 2 letter words are boring.)
                for (int j = 0; j < word.length; j++) {
                    word[j] = (char) ('a' + random.nextInt(26));
                }
                randomStrings[i] = new String(word);
            }
            Constants.driver.findElement(By.xpath(object)).clear();
            Thread.sleep(1000);
            Constants.driver.findElement(By.xpath(object)).sendKeys(randomStrings);
            LogCapture.info("Random String is " + randomStrings);
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL;
        }
        return Constants.KEYWORD_PASS;
    }


    public String getText(String object, String data) throws Exception {


        try {
            actual = Constants.driver.findElement(By.xpath(object)).getText();
            if (actual.length() < 1) {
                actual = Constants.driver.findElement(By.xpath(object)).getAttribute("value");
            }
            LogCapture.info("" + actual);
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL;
        }
        return actual;
    }

    public String SelectDropDownValue(String object, String data) throws Exception {
        try {
            Select objSelect = new Select(Constants.driver.findElement(By.xpath(object)));
            objSelect.selectByVisibleText(data);
            takeSnapShot();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Not able to click...." + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

    public String ValidateWebtablePagination(String object, String data) throws Exception {
        try {
            List<WebElement> rowsCounts = driver.findElements(By.xpath(object));
            //int pagecounts=pagecount.size();
            System.out.println("Row Size" + rowsCounts.size());
            List<String> details = new ArrayList<String>();
            for (WebElement rowsCount : rowsCounts) {
                details.add(rowsCount.getText());
            }
            String nextButton = driver.findElement(By.xpath("//*[@aria-label='Go to next page']")).getAttribute("class");
            while (!nextButton.contains("Mui-disabled")) {
                int totalentries = details.size();
                System.out.println("Total Entries" + totalentries);
                int No_Of_Pages = totalentries / 10;
                driver.findElement(By.xpath("//*[@aria-label='Go to next page']")).click();
                rowsCounts = driver.findElements(By.xpath("//*[@class='MuiTableBody-root']/tr"));
                for (WebElement rowsCount : rowsCounts) {
                    details.add(rowsCount.getText());
                    // int noRows=Integer.parseInt(rowsCount.getText());
                    if ((rowsCounts.size() / 10 <= No_Of_Pages) && (rowsCounts.size() % 10 == 0)) {
                        System.out.println("TenRecord Present on Page");
                        for (String detail : details) {
                            // System.out.println(detail);
                        }
                    } else
                        System.out.println("Record Present on Last Page" + rowsCounts.size() % 10);
                }
                nextButton = driver.findElement(By.xpath("//*[@aria-label='Go to next page']")).getAttribute("class");
            }
            for (String detail : details) {
                // System.out.println(detail);
            }
            takeSnapShot();
        } catch (Exception e) {
            takeSnapShot();
            return Constants.KEYWORD_FAIL + "Not able to click...." + e.getMessage();
        }
        return Constants.KEYWORD_PASS;
    }

}

