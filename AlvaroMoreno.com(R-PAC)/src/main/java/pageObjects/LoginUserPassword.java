package pageObjects;

//import java.awt.List;

import java.util.List; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.DataTable;

public class LoginUserPassword 
{
	 WebDriver driver;
	 
		 public LoginUserPassword(WebDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		 
		 public void navigateTo_LoginUserPassword(String url) throws InterruptedException 
		 {
			 driver.get(url);
			 getWait(5000);
		 }
	 
		 public void title_LoginUserPassword()
		 {
			 String title = driver.getTitle(); 
			 System.out.println("title of page is " +title);
		 }
	 
		 public void usernamepassword_LoginUserPassword(String user, String pwd) throws InterruptedException
		 {
			//username
			 driver.findElement(By.id("username")).sendKeys(user);
			 getWait(5000);
			 //btnsignIn
			 WebElement signin=driver.findElement(By.id("btnsignIn"));
			 signin.click();
			 getWait(5000);
			 //passwd
			 driver.findElement(By.id("passwd")).sendKeys(pwd);
			 getWait(5000);
			 //*[@id="btnsignIn"]
			 //class="btn-primary"
			 WebElement submit=driver.findElement(By.id("btnsignIn"));
			 getWait(5000);
			 submit.click();
		 }
		 
		 public void logout() throws InterruptedException
		 {
			 getWait(5000);
			 WebElement username=driver.findElement(By.className("user-name"));
			 username.click();
			 getWait(5000);
			// WebElement button = driver.find_element_by_xpath("//a/u[data-trackable='sign-in')]")
			 driver.findElement(By.linkText("Logout")).click();		 
			 getWait(5000);
		 }
		 
	    public void getOrderStutus() throws InterruptedException
		{
			 WebElement reports = driver.findElement(By.className("Reports"));
			 reports.click();
			 getWait(4000); 
			 // *[@id="Catalog Items"] 
			 WebElement orderstatus = driver.findElement(By.linkText("Order Status")); 
			 orderstatus.click();
			 getWait(3000);	
		}
		
		public void getSearch() throws InterruptedException
		{
			//*[@id="tblMangoOrderStatus_length"]/span[2]/span/span
			WebElement search = driver.findElement(By.xpath(".//*[@id='tblMangoOrderStatus_length']/span[2]/span/span"));
			search.click();
		    getWait(3000);
		}
		
		public void usercredentials(DataTable usercredentials) throws Throwable 
		{
		    List<List<String>> rows = (List<List<String>>) usercredentials.asLists(String.class);
		    driver.findElement(By.id("username")).sendKeys(rows.get(0).get(0));
		    WebElement signin=driver.findElement(By.id("btnsignIn"));
			signin.click();
			getWait(5000);
		    driver.findElement(By.id("passwd")).sendKeys(rows.get(0).get(1));
		    getWait(5000);
			 //*[@id="btnsignIn"]
			 //class="btn-primary"
			 WebElement submit=driver.findElement(By.id("btnsignIn"));
			 getWait(5000);
			 submit.click();
		   // driver.findElement(By.id("login")).click();
		}
	 
		 public void getWait(int a) throws InterruptedException
		 {
			 Thread.sleep(a);
		 }
	
	 
}
