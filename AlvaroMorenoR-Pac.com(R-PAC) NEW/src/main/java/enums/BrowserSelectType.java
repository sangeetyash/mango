package enums;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

public class BrowserSelectType {
	WebDriver driver;

	public BrowserSelectType(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectBrowser(String browserType) throws InterruptedException
	{
		if(browserType.equalsIgnoreCase("chrome"))
		 {
	     
	     Thread.sleep(2000);
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver1.exe"); 
		 driver = new ChromeDriver();
		 }
		 else if(browserType.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe"); 
			  driver = new FirefoxDriver();
		 }
		 else
		 {			  
			 System.out.println("Invalid unsupported browser");
		 }
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();

	}
	 public void navigateTo_LoginUserPassword(String url) throws InterruptedException 
	 {
		 driver.get(url);
	     Thread.sleep(5000);
	 }
	 public void title_LoginUserPassword()
	 {
		 String title = driver.getTitle(); 
		 System.out.println("title of page is " +title);
	 }
	

}
