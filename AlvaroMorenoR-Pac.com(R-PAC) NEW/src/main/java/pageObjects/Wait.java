package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Wait {

	WebDriver driver;
	 public Wait(WebDriver driver)
	 {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 public void getWait(int a) throws InterruptedException
	 {
		 Thread.sleep(a);
	 }
}
