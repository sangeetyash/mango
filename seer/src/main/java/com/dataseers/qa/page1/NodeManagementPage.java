package com.dataseers.qa.page1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.dataseers.qa.base.TestBase;

public class NodeManagementPage extends TestBase {
	WebDriver driver;
	
	By AdminBillingLink = By.xpath("//*[text()='Admin & Billing']");
	By ClusterConfigLink = By.xpath("//*[text()='Cluster Config']");
	By NodeManagementLink = By.xpath("//*[text()='Node Management']");
	
	public NodeManagementPage(WebDriver driver){
		this.driver = driver;
	}
	
//	public void scrollDownToNodeManagementLink(){
//		WebElement adminBillingLink = driver.findElement(By.xpath("//span[contains(text(),'Admin & Billing')]"));
//		WebElement clusterConfigLink = driver.findElement(By.xpath("//span[contains(text(),'Cluster Config')]"));
//		WebElement nodeManageLink = driver.findElement(By.xpath("//a[contains(@href,'/manage-clusters')]"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", adminBillingLink);
//		js.executeScript("arguments[0].scrollIntoView(true);", clusterConfigLink);
//		js.executeScript("arguments[0].scrollIntoView(true);", nodeManageLink);
//	}
	
	public void NodeManagementLinkClick() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(AdminBillingLink).click();
		driver.findElement(ClusterConfigLink).click();
		
		driver.findElement(NodeManagementLink).click();
	}
	
	public String IsPrimaryClusterEnabled(){
		String PrimaryClusterName = null;
		int rowCount = driver.findElements(By.xpath("//div[@class='ant-table-body']//table//tr")).size()-1;
//		System.out.println(rowCount);
		
		//tbody/tr[1]/td[8]/span/button/span[contains(.,'Yes')]
		//tbody/tr[2]/td[8]/span/button/span[contains(.,'Yes')]
		//tbody/tr[3]/td[8]/span/button/span[contains(.,'Yes')]
		
		//tbody/tr[2]/td[8]/span/button/span[contains(.,'Yes')]//ancestor::td//preceding-sibling::td[1]
		
		String beforeXpath = "//tbody/tr[";
		String afterXpath1 = "]/td[8]/span/button/span[contains(.,'Yes')]";
		String afterXpath2 = "]/td[8]/span/button/span[contains(.,'No')]";
		
		for(int rowNum=1; rowNum < rowCount+1; rowNum++){
			String actualXpath1 = beforeXpath+rowNum+afterXpath1;
			String actualXpath2 = beforeXpath+rowNum+afterXpath2;
//			System.out.println(actualXpath);
			try{
			String value1 = driver.findElement(By.xpath(actualXpath1)).getText();
//			System.out.println("Primary for row number "+rowNum+" is: "+value1);
			PrimaryClusterName = driver.findElement(By.xpath(actualXpath1+"//ancestor::td//preceding-sibling::td[7]")).getText();
//			System.out.println("--------***********---------");
//			System.out.println("Primary Cluster is: "+PrimaryClusterName);
//			System.out.println("--------***********---------");
			
			}
			catch(Exception e){
//				System.out.println("xpath for 'Yes' not found");
			}
			try{
			String value2 = driver.findElement(By.xpath(actualXpath2)).getText();
//			System.out.println("Primary for row number "+rowNum+" is: "+value2);
			}
			catch(Exception e){
//				System.out.println("xpath for 'No' not found");
			}
			
		}
		return PrimaryClusterName;
	}
	
	
}
