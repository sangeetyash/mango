package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.project.managers.PageObjectManager;

public class OrderStatus {

	WebDriver driver;
	PageObjectManager pageObjectManager;
	CheckOut checkOut;
	public OrderStatus(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getOrderStutus() throws InterruptedException
	{
		getWait(2000);

		WebElement lreport = driver.findElement(By.className("Reports"));
		lreport.click();
		getWait(2000);
		// *[@id="Release"]
		WebElement oStatus = driver.findElement(By.linkText("Order Status"));
		oStatus.click();
		getWait(2000);
		
	}
	
	public void getSearch() throws InterruptedException
	{
		//*[@id="tblMangoOrderStatus_length"]/span[2]/span/span
		WebElement search = driver.findElement(By.xpath(".//*[@id='tblMangoOrderStatus_length']/span[2]/span/span"));
		search.click();
	    getWait(3000);

	}
	
	public void searchCPO(String cpo) throws InterruptedException {
		// *[@id="searchId0"]
		WebElement seaech = driver.findElement(By.id("searchId1"));
		seaech.clear();
		seaech.sendKeys(cpo);
		seaech.sendKeys(Keys.ENTER);
		// driver.findElement(By.id("searchId0")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// driver.findElement(By.id("searchId0")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// *[@id="tblServiceBureauOrder"]/tbody/tr/td[1]/span/a
	}
	
	public void searchRPO(List<String> rpo) throws InterruptedException {
		
		// *[@id="searchId0"]
		int i =rpo.size();
		//System.out.println("size"+i);

		for (int v = 0;v< i; v++)
		{
			//System.out.println(rpo.get(v).toString());
		}
		
		for(int j=0;j<i;j++)
		{
			
		WebElement seaech = driver.findElement(By.id("searchId0"));
		seaech.clear();
		Thread.sleep(1000);

		//System.out.println(rpo.get(j).toString());
		seaech.sendKeys(rpo.get(j).toString());
		seaech.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		}
		// *[@id="tblServiceBureauOrder"]/tbody/tr/td[1]/span/a
	}
	
	public void getWait(int a) throws InterruptedException 
	{
		Thread.sleep(a);
	}
	
	

}
