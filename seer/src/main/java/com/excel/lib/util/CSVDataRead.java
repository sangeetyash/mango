package com.excel.lib.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSVDataRead {

	WebDriver driver;
	String CSV_file = "C://Users/Anaya/workspace/Finaseer/src/main/java/com/excel/lib/util/TestData.csv";

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
	public void readCsvData() throws IOException{

		CSVReader reader = new CSVReader(new FileReader(CSV_file));
		String[] cell;

		while ((cell = reader.readNext()) != null) {
			
			for(int i=0; i<1; i++){
//				System.out.println("cell size: "+cell.length);
				String email = cell[i];
				String password = cell[i+1];
				System.out.println(email+" "+password);
				driver.findElement(By.id("txtUsername")).clear();
				driver.findElement(By.id("txtUsername")).sendKeys(email);
				driver.findElement(By.id("txtPassword")).clear();
				driver.findElement(By.id("txtPassword")).sendKeys(password);				
			}
			
		}
	}
}
