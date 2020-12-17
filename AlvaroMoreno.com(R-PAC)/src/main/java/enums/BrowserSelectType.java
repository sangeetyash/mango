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
		  driver.manage().window().maximize();
		  //driver.manage().deleteAllCookies();

	}
	 public void navigateTo_LoginUserPassword(String url) throws InterruptedException 
	 {
		 driver.get(url);
	     Thread.sleep(5000);
	 }
	 public void getTitle()
	 {
		// String baseUrl = "http://demo.guru99.com/test/newtours/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";

	        // launch Fire fox and direct it to the Base URL
	        //driver.get(baseUrl);

	        // get the actual value of the title
	        actualTitle = driver.getTitle();

	        /*
	         * compare the actual title of the page with the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	
	 }

}
