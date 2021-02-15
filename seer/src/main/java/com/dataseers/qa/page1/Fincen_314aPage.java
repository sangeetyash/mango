package com.dataseers.qa.page1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dataseers.qa.base.TestBase;

public class Fincen_314aPage extends TestBase{

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;

	WebDriver driver;

	By ComplianSeerLink = By.xpath("//span[contains(text(),'ComplianSeer')]");
	By FinCENLink = By.xpath("//span[contains(text(),'FinCEN')]");
	By Fincen_314aLink = By.linkText("314a");
	By Add314aBtn = By.xpath("//button[@title='Add new 314(a)']");
	By DownloadTemplateBtn = By.xpath("//button[@title='Download template files']");
	By ResetFilterBtn = By.xpath("//button[@title='Reset filter']");
	By SelectInputType = By.xpath("//div[@title='Select input data type']");
	By file_upload = By.xpath("//*[@type=\"file\"]");
	By uploadedFileName = By.xpath("//span[@class='ant-upload-list-item-name ant-upload-list-item-name-icon-count-1']"); 
	By alertPopup = By.xpath("//div[@class='ant-message']//span//div[@class='ant-message-notice']");
	By SaveBtn = By.xpath("//button[@type='submit']");
	By CancelBtn = By.xpath("//button[@type='button']");

	By ReRunBtn = By.xpath("//tbody/tr[1]/td[1]/div[1]/button[@title='Re-run']");
	By DeleteBtn = By.xpath("//tbody/tr[1]/td[1]/div[1]/button[@title='Delete']");
	By ErrorDeleteBtn = By.xpath("//tbody/tr[1]/td[1]/button[@title='Delete']");
	By DownloadBtn = By.xpath("//tbody/tr[1]/td[1]//button[@title='Download result']");

	// Status
	By Status = By.xpath("//tbody/tr[1]/td[2]/span[1]");
	By NewStatus = By.xpath("//span[contains(text(),'New')]");
	By RunningStatus = By.xpath("//span[contains(text(),'Running')]");
	By ErrorStatus = By.xpath("//span[contains(text(),'Error')]");
	By BlockedStatus = By.xpath("//span[contains(text(),'Blocked')]");
	By CompletedStatus = By.xpath("//span[contains(text(),'Completed')]");


	public Fincen_314aPage(WebDriver driver){
		this.driver = driver;
	}

	public void scrollDownTofinCENLink(){
		WebElement finCENLink = driver.findElement(By.xpath("//span[contains(text(),'FinCEN')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", finCENLink);
	}

	public void scrollDownTo314aLink(){
		WebElement finCEN_314aLink = driver.findElement(By.xpath("//a[normalize-space()='314a']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", finCEN_314aLink);
	}

	public void Fincen_314aClick() throws InterruptedException{
		driver.findElement(ComplianSeerLink).click();
		//		Actions actions = new Actions(driver);
		//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		//		Thread.sleep(2000);
		//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		//		Thread.sleep(2000);

		Thread.sleep(2000);
		scrollDownTofinCENLink();
		driver.findElement(FinCENLink).click();
		//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		//		Thread.sleep(2000);
		//		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		//		Thread.sleep(2000);

		Thread.sleep(2000);
		scrollDownTo314aLink();
		driver.findElement(Fincen_314aLink).click();
	}

	//	public void SelectDropDownValue(){
	//		
	//	}
	
	public void checkEmptyFields(){
		driver.findElement(Add314aBtn).click();
		driver.findElement(SaveBtn).click();
		
		String dataTypeErrorMsg = driver.findElement(By.xpath("//div[contains(text(),'Please enter input data type!')]")).getText();
		System.out.println(dataTypeErrorMsg);
		
		String fileUploadErrorMsg = driver.findElement(By.xpath("//label[contains(text(),'Please select a file.')]")).getText();
		System.out.println(fileUploadErrorMsg);
		
		driver.findElement(CancelBtn).click();
	}

	public void AddFincen_314a() throws IOException{

		File src = new File("./data/314a_Data.xlsx");
		FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet= workbook.getSheetAt(0);

		for(int i=1; i<=sheet.getLastRowNum(); i++)
		{
			driver.findElement(Add314aBtn).click();
			driver.findElement(SelectInputType).click();

			// Import data for input data type
			cell = sheet.getRow(i).getCell(0);
			String data_type = cell.getStringCellValue();
			//cell.setCellType(Cell.CELL_TYPE_STRING);
			driver.findElement(By.xpath("//li[normalize-space()='"+data_type+"']")).click();

			// Import data for filename
			cell = sheet.getRow(i).getCell(1);
			String file_Name = cell.getStringCellValue();

			//cell.setCellType(Cell.CELL_TYPE_STRING);			
			driver.findElement(By.xpath("//*[@type=\"file\"]")).sendKeys(file_Name);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			SaveBtnClick();

			// check for duplicate file
			String popupErrorMsg = getAlertMessage();
			System.out.println("Alert message is: "+popupErrorMsg);
			if(popupErrorMsg.contains("File already exists")){
				driver.findElement(CancelBtn).click();
			}
			else if(popupErrorMsg.contains("Incorrect file format. Only csv files are allowed.")){
				driver.findElement(CancelBtn).click();
			}
		}
	}

	public void invalidFileupload(){
		driver.findElement(file_upload).sendKeys("D://work/flower.jpg");
	}

	public String getAlertMessage(){
		String alertMessage = driver.findElement(alertPopup).getText();
		return alertMessage;
	}

	public String getUploadedFileName(){
		String file_Name = driver.findElement(uploadedFileName).getText();
		return file_Name;
	}

	public void SaveBtnClick(){
		driver.findElement(SaveBtn).click();
	}

	public void CancelBtnClick(){
		driver.findElement(CancelBtn).click();
	}

	public void Fincen314aTable(){

		int rowCount = driver.findElements(By.xpath("//div[@class='ant-table-body']//table//tr")).size()-1;
		System.out.println(rowCount);		

		//tbody/tr[1]/td[2]
		//tbody/tr[2]/td[2]
		//tbody/tr[3]/td[2]

		String beforeXpath = "//tbody/tr[";
		String afterXpath = "]/td[2]";

		for(int rowNum=1; rowNum < rowCount+1; rowNum++){
			String actualXpath = beforeXpath+rowNum+afterXpath;
			//			System.out.println(actualXpath);
			String value = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println("314a Status is for row "+rowNum+" is: "+value);
		}
	}

	public String getStatus_FromTable(){
		String status = driver.findElement(Status).getText();
		return status;
	}

	public String getFileName_FromTable(){
		String status = driver.findElement(Status).getText();
		//		System.out.println("Status is: "+status);
		String fileName = driver.findElement(By.xpath("//span[text()='"+status+"']//parent::td//following::td[2]")).getText();
		return fileName;
	}

	public String getWorkUnitId_FromTable(){
		String status = driver.findElement(Status).getText();
		//		System.out.println("Status is: "+status);
		String workUnitId = driver.findElement(By.xpath("//span[text()='"+status+"']//parent::td//following::td[5]")).getText();
		return workUnitId;
	}

	public String getClusterName_FromTable(){
		String status = driver.findElement(Status).getText();
		System.out.println("Status is: "+status);
		String clusterName = driver.findElement(By.xpath("//span[text()='"+status+"']//parent::td//following::td[4]")).getText();
		return clusterName;
	}

	public void ClickOnFileName(){
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]")).click();
	}

	public boolean isFileDownloaded(String downloadPath, String fileName) {
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();

		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().equals(fileName)) {
				// File has been found, it can now be deleted:
				//				dirContents[i].delete();
				return true;
			}
		}
		return false;
	}

	public void ClickOnWorkUnitId(){
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]//span[@class='anchor-link']")).click();
	}

	public void ClickOnClusterName(){
		driver.findElement(By.xpath("//tbody/tr[2]/td[6]")).click();
	}

	public void DownloadTemplates(){
		driver.findElement(DownloadTemplateBtn).click();
		System.out.println("Template files downloaded successfully.");
	}

	public void ReRunClick(){
		driver.findElement(ReRunBtn).click();
	}

	public void DeleteClick(){
		driver.findElement(DeleteBtn).click();
	}

	public void ErrorDeleteClick(){
		driver.findElement(ErrorDeleteBtn).click();
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