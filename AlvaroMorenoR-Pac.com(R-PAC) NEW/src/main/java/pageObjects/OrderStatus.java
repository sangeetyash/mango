package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.project.managers.PageObjectManager;

import cucumber.api.DataTable;

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
		Actions actions = new Actions(driver);

		getWait(2000);

		WebElement lreport = driver.findElement(By.className("Reports"));
		actions.moveToElement(lreport).perform();
		getWait(1000);
		lreport.click();
		getWait(2000);
		
		// *[@id="Release"]
		WebElement oStatus = driver.findElement(By.linkText("Order Status"));
		actions.moveToElement(oStatus).perform();
		getWait(1000);
		oStatus.click();
		getWait(2000);
		
	}
	
	public void getSearch() throws InterruptedException
	{		driver.get("http://devalvaromoreno.r-pac.com/AlvaroMoreno/OrderStatus/Index");
        	JavascriptExecutor js = (JavascriptExecutor) driver;

			getWait(3000);
	  		WebElement search = driver.findElement(By.xpath(".//*[@id='tblMangoOrderStatus_length']/span[2]/span/span"));
	        js.executeScript("arguments[0].scrollIntoView();",search);
	  	    getWait(1000);
	  		search.click();
	  	    getWait(3000);
	  	    
	  	    //*[@id="tblOrderStatus_length"]/span[2]/span/span
	  	    //*[@id="tblOrderStatus_length"]/span[2]/span/span
	  		//*[@id="tblMangoOrderStatus_length"]/span[2]/span/span
	  	    //*[@id="tblOrderStatus_length"]/span[2]/span/span/a/span
	  		//WebElement search = driver.findElement(By.xpath(".//*[@id='tblMangoOrderStatus_length']/span[2]/span/span/a"));
	  	    //getWait(1000);
	  	    // search1=driver.findElement(By.cssSelector("css=.glyphicon"));
	  	    //getWait(2000);
	  	    //search1.click();
	  	    //getWait(3000);
	  	    //*[@id="tblMangoOrderStatus_length"]/span[2]/span/span
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
	
	
	public void selectNoRecords(String i) throws InterruptedException
	{
		getWait(1500);

		// *[@id="tblServiceBureauOrder_length"]/label/select

		Select noRecords = new Select(driver.findElement(By.name("tblOrderStatus_length")));
		//System.out.println("Overage" + over);
		/*
		 * for (int i = 1; i < 6; i++) { String a = Integer.toString(i);
		 * over.selectByValue(a); getWait(3000); }
		 */
		noRecords.selectByValue(i);
		getWait(1500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		getWait(1000);
		js.executeScript("window.scrollTo(0, 0)"); 

	}
	
	public void gotoRPODetailScreen(List<String> rpo) throws InterruptedException
	{
		int i =rpo.size();
		//System.out.println("size"+i);

		for (int v = 0;v< i; v++)
		{
			//System.out.println(rpo.get(v).toString());
		}
		
		for(int j=0;j<i;j++)
		{
			String rpostring=rpo.get(j).toString();
			String remarks="Cancelling order " + rpostring;
			driver.findElement(By.linkText(rpostring)).click();		
			getWait(1500);
			//cancelOrder(1,remarks);
			driver.navigate().back();
			
		    getWait(3000);
		    selectNoRecords("100");
		}
		
	}
	
	public void gotoRPODetailScreenAndCancelOrder(List<String> rpo) throws InterruptedException
	{
		int i =rpo.size();
		//System.out.println("size"+i);

		for (int v = 0;v< i; v++)
		{
			//System.out.println(rpo.get(v).toString());
		}
		
		for(int j=0;j<i;j++)
		{
			String rpostring=rpo.get(j).toString();
			String remarks="Cancelling order " + rpostring;
			driver.findElement(By.linkText(rpostring)).click();		
			getWait(1500);
			cancelOrder(1,remarks);
			driver.navigate().back();
			
		    getWait(3000);
		    selectNoRecords("100");
		}
		
	}
	
	
	public void cancelOrder(int a,String remark) throws InterruptedException
	{
		//*[@id="btnCancelOrder"]
		
		WebElement cancel = driver.findElement(By.id("btnCancelOrder"));
		cancel.click();
		if (a == 1)
		{
			WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div[1]"));
			getWait(3000);
			ok.click();
			getWait(3000);
			WebElement Remark = driver.findElement(By.xpath(".//*[@id='Remark']"));
			Remark.sendKeys(remark);
			getWait(1500);
			//*[@id="Remark"]
			//*[@id="btnUpdate"]
			WebElement cancelbtn = driver.findElement(By.xpath(".//*[@id='btnUpdate']"));
			cancelbtn.click();
			getWait(1500);
		}
	else if (a == 0)
		{
			WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div[2]"));
			getWait(3000);
			ok.click();
		}

	}
	
}
