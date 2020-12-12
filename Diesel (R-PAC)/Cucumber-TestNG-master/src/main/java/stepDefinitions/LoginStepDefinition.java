package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{

	 WebDriver driver;

	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	 System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://devrtrac.r-pac.com/");
	 }
	
	
	 @When("^title of login page is i-pac CRM$")
	 public void title_of_login_page_is_free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	// Assert.assertEquals("Free CRM in the cloud software boosts sales", title);
	 }
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password() throws InterruptedException{
		/*
		 * driver.wait(5000);
		 * 
		 * 
		 * driver.findElement(By.name("username")).sendKeys("admin@mango.com");
		 * driver.wait(5000);
		 * 
		 * WebElement usersubmit = driver.findElement(By.id("btnsignIn"));
		 * driver.wait(1000);
		 * 
		 * usersubmit.click(); driver.wait(3000);
		 * driver.findElement(By.id("passwd")).sendKeys("Lousie#786");
		 */
		 System.out.println("login and password");
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() throws InterruptedException 
	 {
		/*
		 * driver.wait(3000);
		 * 
		 * WebElement loginBtn =
		 * driver.findElement(By.xpath("//input[@type='submit']")); JavascriptExecutor
		 * js = (JavascriptExecutor)driver; js.executeScript("arguments[0].click();",
		 * loginBtn); driver.wait(3000);
		 */
		 System.out.println("login button");

	 }
	
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 //Assert.assertEquals("CRMPRO", title);
	 }
	 
	/*
	 * @Then("^user moves to new contact page$") public void
	 * user_moves_to_new_contact_page() { driver.switchTo().frame("mainpanel");
	 * Actions action = new Actions(driver);
	 * action.moveToElement(driver.findElement(By.xpath(
	 * "//a[contains(text(),'Contacts')]"))).build().perform();
	 * driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	 * 
	 * }
	 * 
	 * 
	 * @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 * public void user_enters_contacts_details(String firstname, String lastname,
	 * String position){
	 * driver.findElement(By.id("first_name")).sendKeys(firstname);
	 * driver.findElement(By.id("surname")).sendKeys(lastname);
	 * driver.findElement(By.id("company_position")).sendKeys(position);
	 * driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).
	 * click(); }
	 */
	 

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
	
	
	

}
