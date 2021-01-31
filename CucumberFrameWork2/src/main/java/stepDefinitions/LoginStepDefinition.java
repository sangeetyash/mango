package stepDefinitions;


//Test
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.DataTable;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

import com.connectionsdb.*;
import com.project.managers.*;
//import MyRunner.TestRunner;

//import java.util.List;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
public class LoginStepDefinition 
//extends TestRunner

{
	PageObjectManager pageObjectManager;
	LoginUserPassword loginUserPassword;
	
	SqlConnection sqlConnection;
	ShoppingCart shoppingCart;
	
	
	WebDriver driver;

	
	
	long startTime,endTime,totalTime,executionTime;
	//Cucumber Reg Exp:
	//1. \"([^\"]*)\"
	//	e.g. "<sample>"
	//2. \"(.*)\"
	//   e.g. "sample"
	//3. \"([^\"]*)\"$"

	


	@Given("^Navigate user to Login Page \"(.*)\" and \"(.*)\"$")
	 public void navigateUser(String url, String browser) throws InterruptedException
	 {
	     startTime = System.currentTimeMillis();

		  //System.setProperty("webdriver.chrome.driver","F:\\ProjectSpace\\Cucumber-TestNG-master two\\Cucumber-TestNG-master\\Drivers\\chromedriver.exe"); 
		 Thread.sleep(2000);
		 if(browser.equalsIgnoreCase("chrome")) 
		  {
		  
		  Thread.sleep(2000);
		  System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver1.exe");
		  driver = new ChromeDriver();
		  }
		  else if(browser.equalsIgnoreCase("Firefox")) 
		  {
		  System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
		  driver = new FirefoxDriver(); 
		  }
		 	
		  else 
		  {
			  System.out.println("Invalid unsupported browser");

		  }
		 
		 //System.out.println("Browser"+browser);
		/*
		 * if (browser == "Chrome") {
		 * System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		 * driver = new ChromeDriver(); } else if (browser == "Firefox") { driver = new
		 * FirefoxDriver(); } else if (browser == "IE") { driver = new
		 * InternetExplorerDriver(); }
		 */
		
		  driver.manage().window().maximize();
		  pageObjectManager=new PageObjectManager(driver);
		  loginUserPassword=pageObjectManager.getLoginUserPassword();
		  loginUserPassword.navigateTo_LoginUserPassword(url);
		  endTime = System.currentTimeMillis();
		  totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;
		  System.out.println("^Navigate user to Login Page with " + browser + " -> " + url );
		  System.out.println("And  time taken=" +totalTime+" secs\n");
	 }
	
	
	 @When("^title of login page$")
	 public void title_of_login_page_is_free_CRM()
	 {
		  startTime = System.currentTimeMillis();

		  loginUserPassword=pageObjectManager.getLoginUserPassword();
		  loginUserPassword.title_LoginUserPassword();
		  
		  endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		  System.out.println("^title of login page "  );
		  System.out.println("And  time taken=" +totalTime+" secs\n");
	 }
	

	 
	 
	 @Then("^enters  \"([^\"]*)\" and  \"([^\"]*)\"$")
	 public void enters_username_and_password(String username, String password) throws Exception
	 {
		 startTime = System.currentTimeMillis();
		 loginUserPassword=pageObjectManager.getLoginUserPassword();
		 loginUserPassword.usernamepassword_LoginUserPassword(username, password);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^enters  username and password ");
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password) throws Exception
	 {
		 startTime = System.currentTimeMillis();

		 loginUserPassword=pageObjectManager.getLoginUserPassword();
		 loginUserPassword.usernamepassword_LoginUserPassword(username, password);
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^enters  username and password ");
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() 
	 {	
		 startTime = System.currentTimeMillis();
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^user clicks on login button");
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page()
	 {	
		 startTime = System.currentTimeMillis();

		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^user is on home page");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	
	 @Then("^user enters credentials$")
	 public void getCrentials(DataTable usercredentials) throws Throwable 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 loginUserPassword=pageObjectManager.getLoginUserPassword();
		 loginUserPassword.usercredentials(usercredentials);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^user enters credentials" +"");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");
 
		}
	
	 @Then("^Close Browser$")
	 public void close_the_browser() throws InterruptedException
	 {
		 startTime = System.currentTimeMillis();

		 Thread.sleep(3000);
		 driver.close();
		 driver.quit();	
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Quit Driver$"+ "");	
		  System.out.println("And  time taken=" +totalTime+" secs\n");
		  
		 System.out.println("===========================================================");	
		 System.out.println("Total time taken scenario=" +((executionTime)/60)+" mins");	
		 System.out.println("===========================================================");	

	
	 }
	 @Then("^Login validation check$")
	 public void loginValidations(DataTable credentialsdtn) throws Throwable 
	 	{
		 
		 try
		 {
		 startTime = System.currentTimeMillis();

		 loginUserPassword=pageObjectManager.getLoginUserPassword();
		 loginUserPassword.loginValidation(credentialsdtn);
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Login validation check" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception e");
			 System.exit(0);
		 }
		 	
	 	}

	 @Then("^Logout$")
	 public void logout() throws InterruptedException
	 {
		 startTime = System.currentTimeMillis();

		 loginUserPassword=pageObjectManager.getLoginUserPassword();
		 Thread.sleep(1000);

		 loginUserPassword.logout();
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^User Logout" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	
	 
	
	


}
