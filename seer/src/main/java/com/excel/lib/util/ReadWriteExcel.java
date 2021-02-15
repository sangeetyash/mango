package com.excel.lib.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ReadWriteExcel {

	WebDriver driver;
	//	WebDriverWait wait;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell cell;

	@BeforeTest
	public void TestSetup()
	{
		WebDriverManager.chromedriver().setup();
		//		System.setProperty("webdriver.chrome.driver", "C:\\work\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		//		wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void ReadData() throws IOException
	{
		//Import Excel Sheet
		File src = new File("./data/LoginData.xlsx");

		//Load the file
		FileInputStream finput = new FileInputStream(src);

		//Load the Workbook
		workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		sheet= workbook.getSheetAt(0);

		for(int i=1; i<=sheet.getLastRowNum(); i++)
		{
			// Import data for username
			cell = sheet.getRow(i).getCell(0);
			//cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.id("txtUsername")).sendKeys(cell.getStringCellValue());

			// Import data for password
			cell = sheet.getRow(i).getCell(1);
			//cell.setCellType(Cell.CELL_TYPE_STRING);			
			driver.findElement(By.id("txtPassword")).sendKeys(cell.getStringCellValue());

			// Specify the message needs to be written.
			String message = "Data Imported Successfully.";

			// Create cell where data needs to be written.
			sheet.getRow(i).createCell(3).setCellValue(message);

			// Specify the file in which data needs to be written.
			FileOutputStream fileOutput = new FileOutputStream(src);

			// finally write content
			workbook.write(fileOutput);

			// close the file
			fileOutput.close();
		}
	}
}