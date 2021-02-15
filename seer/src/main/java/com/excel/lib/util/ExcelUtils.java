package com.excel.lib.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;

import com.dataseers.qa.base.*;
import com.dataseers.qa.pages.LoginPage;
import com.dataseers.qa.util.TestUtil;

public class ExcelUtils extends TestUtil {
	
	TestBase basePage;
	Properties prop;
	LoginPage loginPage;
	ExcelUtils excelUtils;
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	
	@BeforeTest
	public void setUp() throws MalformedURLException{

		try
		{
			log.info("Initalizing the seed portal login Page with all fields");
			intialization();
			loginPage  = new LoginPage(d);
			excelUtils = new ExcelUtils();
		}
		catch (NullPointerException e) 
		{
			log.error("Unable to load homepage" + e);
		}
		
	
		
	}
	
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
			d.findElement(By.xpath("//li[normalize-space()='"+cell.getStringCellValue()+"']")).click();

			// Import data for password
			cell = sheet.getRow(i).getCell(1);
			//cell.setCellType(Cell.CELL_TYPE_STRING);			
			d.findElement(By.xpath("//*[@type=\"file\"]")).sendKeys(cell.getStringCellValue());

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
