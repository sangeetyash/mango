package com.dataseers.qa.page1;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dataseers.qa.base.TestBase;

public class BulkExtractPage extends TestBase {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	
	WebDriver driver;

	// 1. locators - By
	By ReportsLink = By.xpath("//span[contains(text(),'Reports')]");
	By BulkExtractsLink = By.xpath("//a[normalize-space()='Bulk Extracts']");
	By CreateAdhocReportBtn = By.xpath("//button[@title='Create Adhoc Report']");
	By SelectInputDataType = By.xpath("//div[@title='Select input data type']");
	By SelectTypeOfInformation = By.xpath("//div[@title='Select Type of information']");
	By CalDateRange = By.xpath("//input[@placeholder='Start date']");
	By UploadCsvFile = By.xpath("//*[@type=\"file\"]");
	By uploadedFileName = By.xpath("//span[@class='ant-upload-list-item-name ant-upload-list-item-name-icon-count-1']");
	By SaveBtn = By.xpath("//button[@type='submit']");
	By CancelBtn = By.xpath("//button[@type='button']");
	By alertPopup = By.xpath("//div[@class='ant-message']//span//div[@class='ant-message-notice']");
	
	By ReRunBtn = By.xpath("//tbody/tr[1]/td[1]/div[1]/button[@title='Re-run']");
	By DeleteBtn = By.xpath("//tbody/tr[1]/td[1]/div[1]/button[@title='Delete']");
	By DownloadBtn = By.xpath("//tbody/tr[1]/td[1]/button[@title='Download result']");
	
	By Status = By.xpath("//tbody/tr[1]/td[2]/span[1]");
	By FileName = By.xpath("//tbody/tr[1]/td[4]");
	By ClusterName = By.xpath("//tbody/tr[1]/td[7]");
	By WorkUnitId = By.xpath("//tbody/tr[1]/td[8]");
	
	
	public BulkExtractPage(WebDriver driver){
		this.driver = driver;
	}
	
	// 2. Page Actions
	public void BulkExtractsClick(){

		driver.findElement(ReportsLink).click();
		driver.findElement(BulkExtractsLink).click();
	}
	
	public void CreateAdhocReportBtnClick(){
		driver.findElement(CreateAdhocReportBtn).click();
	}
	
//	public void SelectInputDataType(){
//		driver.findElement(SelectInputDataType).click();
//		driver.findElement(By.xpath("//li[contains(text(),'Account Number')]")).click();
//	}
	
	public void SelectTypeOfInformation(){
		driver.findElement(SelectTypeOfInformation).click();
		driver.findElement(By.xpath("//li[contains(text(),'Account Book')]")).click();
	}
	
	public void UploadCsvFile(){
		driver.findElement(UploadCsvFile).sendKeys("D://work/account_number_account_template_2.csv");
	}
	
	public void SaveClick(){
		driver.findElement(SaveBtn).click();
	}
	
	public void CancelClick(){
		driver.findElement(CancelBtn).click();
	}

	public String getAlertMessage(){
		String alertMessage = driver.findElement(alertPopup).getText();
		return alertMessage;
	}
	
	public String getUploadedFileName(){
		String file_Name = driver.findElement(uploadedFileName).getText();
		return file_Name;
	}
	
	public String getFileName(){
		String fileName = driver.findElement(FileName).getText();
		return fileName;
	}

	public void ClickOnFileName(){
		driver.findElement(FileName).click();
	}
	
	public String getClusterName(){
		String clusterName = driver.findElement(ClusterName).getText();
		return clusterName;
	}
	
	public String getWorkUnitId(){
		String workUnitId = driver.findElement(WorkUnitId).getText();
		return workUnitId;
	}
	
	public void ClickOnWorkUnitId(){
		driver.findElement(WorkUnitId).click();
	}
	
	public String getStatus_FromTable(){
		String status = driver.findElement(Status).getText();
		return status;
	}
	
	public void ReRunClick(){
		driver.findElement(ReRunBtn).click();
	}
	
	public void DeleteClick(){
		driver.findElement(DeleteBtn).click();
	}
	
	public void DownloadClick(){
		driver.findElement(DownloadBtn).click();
	}
	
	public void isFileDownload(String downloadPath, String file1){
		File fileLocation = new File(downloadPath);
		File [] totalFiles = fileLocation.listFiles();
		for(File file:totalFiles){
//			System.out.println(downloadPath);
			String fileName = file.getName();
//			System.out.println(fileName);
			
			if(fileName.contains(file1)){
				System.out.println(fileName+" -- file get downloaded");
				break;
				
			}
		}
	}
	
	
}