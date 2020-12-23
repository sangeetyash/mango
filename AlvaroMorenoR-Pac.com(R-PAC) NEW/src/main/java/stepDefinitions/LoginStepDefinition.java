package stepDefinitions;



import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.DataTable;
//import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.*;

import com.connectionsdb.*;
import com.project.managers.*;
//import MyRunner.TestRunner;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LoginStepDefinition 
//extends TestRunner

{
	PageObjectManager pageObjectManager;
	LoginUserPassword loginUserPassword;
	ReleasePO releasePO;
	CheckOut checkout;
	CatalogItems catalogItems;
	OrderStatus orderStatus;
	SqlConnection sqlConnection;
	ShoppingCart shoppingCart;
	RPOScreen rpoScreen;
	PORPOCheck poRPOCheck;
	POShoppingCart poShoppingCart;
	POALLQTYShopping poALLQTYShopping;
	POALLQTYCheck poALLQTYCheck;
	
	WebDriver driver;
	List<String> lst,rpoLIST=null;
	String RPO="";
	String shID="";
	String ShoppingCartNo;
	String rpoListStr="";
	String inplantrpoListstr="";
	
	LinkedList<String> linkList=new LinkedList<String>();
	
	
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
	

	 @When("^Connection$")
	 public void Connection() throws InterruptedException
	 {
		     startTime = System.currentTimeMillis();
		 	 sqlConnection=pageObjectManager.getSqlConnection();
		 	 sqlConnection.connectionTest();
		 	 sqlConnection.justCheck("3000006641");
		 	 endTime = System.currentTimeMillis();
		 	 totalTime = ( endTime - startTime)/1000;
			  executionTime=executionTime+totalTime;

			 Thread.sleep(5000);
			 System.out.println("^SQL Connection and Statement");
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
	 
	// Search Release PO page with CPO ID "7R00"
	 @Then("^Search Release PO page with CPO ID \"([^\"]*)\"$")
	 public void Release_PO_page(String RPO) throws InterruptedException 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 Thread.sleep(5000);
		 releasePO.getPOScreen();
		 Thread.sleep(5000);
		 //releasePO.get100records();
		 Thread.sleep(2000);
		 //releasePO.showConfirmed();
		 Thread.sleep(2000);
		 //releasePO.showConfirmed();
		 Thread.sleep(2000);
		 releasePO.searchCPO(RPO);
		 Thread.sleep(2000);
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^user moves to Release PO page and search for PO "+RPO);	 
	
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 
		}
	 
	 @Then("^Search In-Plant PO page with CPO ID \"([^\"]*)\"$")
	 public void InPlant_PO_page(String RPO) throws InterruptedException 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 Thread.sleep(5000);
		 releasePO.getInPlantPrintingbyPO();
		 Thread.sleep(5000);
		 //releasePO.get100records();
		 Thread.sleep(2000);
		 //releasePO.showConfirmed();
		 Thread.sleep(2000);
		 //releasePO.showConfirmed();
		 Thread.sleep(2000);
		 releasePO.searchCPO(RPO);
		 Thread.sleep(2000);
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Search In-Plant PO page with CPO ID "+RPO);	 
	
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 
		}
	 
	 @Then("^With Confirm orders,Search Release PO page with CPO ID \"([^\"]*)\"$")
	 public void Confirm_Release_PO_page(String RPO) throws InterruptedException 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 Thread.sleep(5000);
		 releasePO.getPOScreen();
		 
		 Thread.sleep(5000);

		 //releasePO.get100records();
		 Thread.sleep(2000);
		 releasePO.showConfirmed();
		 Thread.sleep(2000);
		
		 releasePO.searchCPO(RPO);
		 Thread.sleep(2000);

		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^With Confirm orders,Search Release PO page with CPO ID  "+RPO + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 
		}
	 
	 // Search supplier ID "0593"
	 @Then("^Search Vendor ID \"([^\"]*)\"$")
	 public void SuppilerSearch(String suid) throws InterruptedException 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.searchSupplier(suid);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Search supplier ID " + suid + "");	 
	
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		}
	 
	 
	 @Then("^Click on CPO \"([^\"]*)\"$")
	 public void clickoncartCPO(String cpo) throws InterruptedException 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.clickonCPO(cpo);
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Click on CPO" + cpo + "");	 
	
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		}
	 //then delete PO from cart "7R00" 
	 @Then("^then delete PO from cart \"([^\"]*)\"$")
	 public void deletePO(String poid) throws InterruptedException 
	 	{
		 Thread.sleep(200);
		 checkout=pageObjectManager.getcheckOut();
		 //checkout.deletePO(poid,0);
		 Thread.sleep(300);
		 checkout.deletePO(poid,1);
		 Thread.sleep(200);
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^then delete PO from cart " + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		}
	 
	 
	 @Then("^click on PO \"(.*)\" and select overage \"(.*)\"$")
	 public void POClick(String PO, String over) throws InterruptedException 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.clickONPO(PO);

		 Thread.sleep(3000);

		 //releasePO.itemvise();
		 //releasePO.selectAllItems();
		 //releasePO.checkoverageCalculation();

		 Thread.sleep(2000);

		 //releasePO.itemvise();

		 Thread.sleep(2000);
		 releasePO.selectOverage(over);
		 //releasePO.checkoverageCalculation();
		 Thread.sleep(2000);

		 releasePO.printArry();
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^click on PO->" + PO +" and select overage " +over + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 	}
	 
	 @Then("^click on PO \"(.*)\" and select all$")
	 public void POClicka(String PO) throws InterruptedException 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.clickONPO(PO);

		 Thread.sleep(3000);
		 //releasePO.itemvise();
		 releasePO.selectAllItems();
		// releasePO.checkoverageCalculation();

		 Thread.sleep(2000);

		 //releasePO.itemvise();

		 Thread.sleep(2000);
		 //releasePO.selectOverage(over);
		 //releasePO.checkoverageCalculation();

		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^click on PO->" + PO +" and select overage " + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 	}
	 
	 
	 @Then("^click on PO \"(.*)\"$")
	 public void POClickb(String PO) throws InterruptedException 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.clickONPO(PO);

		 Thread.sleep(3000);
		 //releasePO.itemvise();
		 //releasePO.selectAllItems();
		// releasePO.checkoverageCalculation();

		 Thread.sleep(2000);

		 //releasePO.itemvise();

		 Thread.sleep(2000);
		 //releasePO.selectOverage(over);
		 //releasePO.checkoverageCalculation();

		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^click on PO->" + PO +" and select overage " + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 	 	}
	 
	 //AddToCart with double click
	 
	 @Then("^Addtocart with double click$")
	 public void getAddtocartdoubleclick()throws InterruptedException
	 {
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.addToCartWithDoubleClick();
		 Thread.sleep(2000);
		 releasePO.addToCartsucess();
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Addtocart with double click" + "");	 
	
		  System.out.println("And  time taken=" +totalTime+" secs\n");


	 }
	 //Then Addtocart
	 @Then("^Addtocart$")
	 public void getAddtocart()throws InterruptedException
	 {
		 	startTime = System.currentTimeMillis();

		 	releasePO=pageObjectManager.getreleasePO();
		 	Thread.sleep(2000);

			 //releasePO.printArry();
			 Thread.sleep(2000);

		 	releasePO.addToCart();
		 	Thread.sleep(2000);
		 	releasePO.addToCartsucess();
		 	
		 	
		 	endTime = System.currentTimeMillis();
			totalTime =(endTime-startTime)/1000;
			  executionTime=executionTime+totalTime;

			 System.out.println("^Addtocart$" + "");	 
			  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("^Submit$")
	 public void getSubmit()throws InterruptedException
	 {
		 	inplantrpoListstr="";
		 	startTime = System.currentTimeMillis();

		 	releasePO=pageObjectManager.getreleasePO();
		 	Thread.sleep(2000);

			 //releasePO.printArry();
			 Thread.sleep(2000);

		 	inplantrpoListstr=releasePO.submit();
		 	Thread.sleep(2000);
		 	//releasePO.addToCartsucess();
		 	
		 	
		 	endTime = System.currentTimeMillis();
			totalTime =(endTime-startTime)/1000;
			  executionTime=executionTime+totalTime;

			 System.out.println("^Addtocart$" + "");	 
			  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("^Addtocart Confirm Order$")
	 public void getAddtocartConfirmOrder()throws InterruptedException
	 {
		 	startTime = System.currentTimeMillis();

		 	releasePO=pageObjectManager.getreleasePO();
		 	Thread.sleep(2000);

			 //releasePO.printArry();
			 Thread.sleep(2000);

		 	releasePO.addToCart();
		 	Thread.sleep(2000);
		 	releasePO.qtyAlert();
		 	Thread.sleep(2000);
		 	releasePO.addToCartsucess();

		 	endTime = System.currentTimeMillis();
			totalTime =(endTime-startTime)/1000;
			executionTime=executionTime+totalTime;

			 System.out.println("^Addtocart Confirm Order$");	 
			 System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 //Then goto Catalog screen

	 @Then("^goto catalog screen and PO selection validation check$")
	 public void getCatalogScreen()throws InterruptedException
	 {
		  startTime = System.currentTimeMillis();

		  catalogItems=pageObjectManager.getcatalogItems();
		  catalogItems.getCatlogScreen(); 
		  Thread.sleep(2000);
		  endTime = System.currentTimeMillis();
		  totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		  System.out.println("^goto catalog screen and PO selection validation check" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("^Plus Add to cart \"(.*)\" and \"(.*)\"$")
	 public void getAddCatalog(String itemname, String qty)throws InterruptedException
	 {
		  startTime = System.currentTimeMillis();

		  catalogItems=pageObjectManager.getcatalogItems();
		  catalogItems.selectCatalogItem(itemname,qty);
		  Thread.sleep(2000);
		  
		  endTime = System.currentTimeMillis();
		  totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		  System.out.println("^Plus Add to cart" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	// Then check catlog PO selected and quantity should be more than zero
	 @Then("^Then check catlog PO selected and quantity should be more than zero$")
	 public void checkCatalogScreenValidations()throws InterruptedException
	 {
		 startTime = System.currentTimeMillis();

		 catalogItems=pageObjectManager.getcatalogItems();
		 catalogItems.addToCartWithMessage1();
		 Thread.sleep(3000);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Then check catlog PO selected and quantity should be more than zero" + "");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("^Search for PO \"([^\"]*)\"$")
	 public void getCPO(String suid) throws InterruptedException 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 orderStatus=pageObjectManager.getOrderStatus();
		 orderStatus.searchCPO(suid);
		
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Search for PO" + suid + "");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

		 
		 
		}
	 
	 @Then("^Select overage \"([^\"]*)\"$")
	 public void getOverage(String overage) throws InterruptedException 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.selectOverage(overage);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Select overage" + overage +"");	 
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
	 
	 @Then("^Deselect previous and Select PO items based on EAN$")
	 public void getDeselectEANSelect(DataTable dtEANA) throws Throwable 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.deselectSelectPOEAN(dtEANA);
		 
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Deselect previous and Select PO items based on EAN" +"");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");
 
		}
	 
	 @Then("^Select PO items based on EAN$")
	 public void getEANSelect(DataTable dtEAN) throws Throwable 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.selectPOEAN(dtEAN);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Select PO items based on EAN" +"");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");
		 
		}
	 
	 @Then("^Select PO items based on EAN plus edit order qty$")
	 public void getEANSelectEditQty(DataTable dtEAN) throws Throwable 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.selectPOEANEditOqty(dtEAN);
		 Thread.sleep(3000);
		// releasePO.printArryEAN(dtEAN);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Select PO items based on EAN plus edit order qty" +"");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");
 
		}
	 @Then("^Deselect all$")
	 public void getDeselect() throws Throwable 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.selectAllItems();
		 Thread.sleep(3000);

		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Select PO items based on EAN" +"");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");
		 
		}
	 
	 @Then("^Show confirm orders$")
	 public void getShowConfirmOrders() throws Throwable 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.showConfirmed();
		 Thread.sleep(3000);
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Show confirm orders" +"");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");
		 
		}
	 @Then("^Select all$")
	 public void getSelect() throws Throwable 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.selectAllItems();
		 Thread.sleep(3000);

		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Select PO items based on EAN" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");
		 
		}
	 
	 @Then("^Select PO items based on EAN and click addtocart$")
	 public void getEANSelectaddtocart(DataTable dtEAN) throws Throwable 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.selectPOEAN(dtEAN);
		 Thread.sleep(3000);

		 releasePO.printArryEAN(dtEAN);
		 Thread.sleep(3000);

		 releasePO.addToCart();
		 Thread.sleep(3000);

		 releasePO.addToCartsucess();
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Select PO items based on EAN" + "");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

		}
	 
	 
	 @Then("^Then Add to cart \"([^\"]*)\" and  \"([^\"]*)\" $")
	 public void getAddToCart(String item,String qty)throws InterruptedException
	 {
		 
		 startTime = System.currentTimeMillis();

		 catalogItems=pageObjectManager.getcatalogItems();
		 catalogItems.selectCatalogItem(item,qty);
		 Thread.sleep(3000);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;
		 
		 System.out.println("^Then Add to cart" + item + " and " + qty + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }

	 
	 @Then("^Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date$")
	 public void select_checkout_details()throws InterruptedException 
	 {
		 
		 startTime = System.currentTimeMillis();

		 checkout=pageObjectManager.getcheckOut();
		 Thread.sleep(1000);
		 checkout.billTo(1);
		 Thread.sleep(3000);
		 checkout.selectShipTo(1);
		 Thread.sleep(1000);
		 checkout.printShop(1);
		 checkout.VPO("ABC123");
		 checkout.expectedDate("2020-10-30");
		 Thread.sleep(1000);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date$" + "");	 
		
		 System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("^goto checkout page$")
	 public void goto_checkout()throws InterruptedException 
	 {
		 startTime = System.currentTimeMillis();

		 checkout=pageObjectManager.getcheckOut();
		 checkout.toCartPage();
		 ShoppingCartNo=checkout.shoppingCartNo();
		 Thread.sleep(2000);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^goto checkout page$" + "");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 @Then("^AddToCart$")
	 public void getAddToCart()throws InterruptedException 
	 {
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.addToCart();
		 releasePO.addToCartsucess();
		 Thread.sleep(3000);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^AddToCart$" + "");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("^Confirm Order$")
	 public void confirm_order()throws InterruptedException, SQLException 
	 { 
		 
		 startTime = System.currentTimeMillis();
		 
		 
		 checkout=pageObjectManager.getcheckOut();
		 rpoScreen=pageObjectManager.getRPOScreen();

		 ShoppingCartNo=checkout.shoppingCartNo();
		 Thread.sleep(2000);

		 checkout.orderConfirm();
		 Thread.sleep(3000);
		 
		 rpoLIST=null;
		 linkList=null;

	 
		 rpoLIST=checkout.return_RPO();
		 linkList=checkout.return_RPOLinkList();
		 Thread.sleep(3000);
		 
		 checkout.printRPO(rpoLIST);
		 checkout.printRPOLinkList(linkList);
		 Thread.sleep(3000);
		 
		 rpoListStr="";

		 rpoListStr=rpoScreen.getRPOListFromDB(ShoppingCartNo);
		 Thread.sleep(2000);
		 
		 rpoScreen.checkRPACTable1(rpoListStr);
		 Thread.sleep(2000);
		 
		 //lst=checkout.return_RPO();
		 //shID=checkout.shoppingCart();
		 		 
		 Thread.sleep(8000);
		 
		 checkout.orderDone();
		 Thread.sleep(1500);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Confirm Order$" + "");	 

		 System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 @Then("^Confirm Order with double click$")
	 public void double_click_confirm_order()throws InterruptedException 
	 {
		 
		 startTime = System.currentTimeMillis();

		 checkout=pageObjectManager.getcheckOut();
		 checkout.doubleClickConfirm();
		

		 checkout.printOrderDetails();
		 Thread.sleep(10000);
		 checkout.orderDone();
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Confirm Order with double click$" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");
	 
	 }
	 
	 @Then("^Print Confirmation and done$")
	 public void print_confirmation_done()throws InterruptedException 
	 {		
		 startTime = System.currentTimeMillis();

		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Print Confirmation and done$" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("Goto Report>Order Status$")
	 public void order_status_check()throws InterruptedException
	 {
		 startTime = System.currentTimeMillis();

		 orderStatus=pageObjectManager.getOrderStatus();
		 
		 orderStatus.getOrderStutus();
		 Thread.sleep(2000);
		 
		 //orderStatus.getSearch();
		 //Thread.sleep(2000);
		 //orderStatus.searchRPO(rpoLIST);
		 //Thread.sleep(2000);
		 
		 checkout.printRPO(rpoLIST);
		 orderStatus.gotoRPODetailScreen(ShoppingCartNo);
		 Thread.sleep(2000);

		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Goto Report>Order Status" + "");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 
	 @Then("Goto Report>Order Status->Cancel Order$")
	 public void order_status_check_cancel()throws InterruptedException
	 {
		 startTime = System.currentTimeMillis();

		 orderStatus=pageObjectManager.getOrderStatus();
		 
		 orderStatus.getOrderStutus();
		 Thread.sleep(2000);
		 
		 //orderStatus.getSearch();
		 //Thread.sleep(2000);
		 //orderStatus.searchRPO(rpoLIST);
		 //Thread.sleep(2000);
		 
		 checkout.printRPO(rpoLIST);
		 orderStatus.gotoRPODetailScreenAndCancelOrder(ShoppingCartNo);
		 Thread.sleep(2000);

		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Goto Report>Order Status->Cancel Order" + "");	 
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
	 
	 @Then("^Verify POData EAN with DB$")
	 public void verifyPODataEAN(DataTable dtaPOData) throws InterruptedException, SQLException
	 {	
	
		 startTime = System.currentTimeMillis();
		 
		 poShoppingCart=pageObjectManager.getPOShoppingCart();
		 poShoppingCart.poCheckWithDBParse(ShoppingCartNo, dtaPOData);
		 Thread.sleep(3000);
		 poShoppingCart.rpoWithDBSCart(ShoppingCartNo, dtaPOData);
		 //verifyDataEANWithDBCart
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Verify POData EAN with DB" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

	
	 }
	 @Then("^Verify EAN and RPO with db$")
	 public void verifyOrderEANRPOWithDB(DataTable cartdtn) throws Throwable 
	 	{
		 
		 try
		 {
		 startTime = System.currentTimeMillis();

		 
		 checkout=pageObjectManager.getcheckOut();
		 poALLQTYCheck =pageObjectManager.getPOALLQTYCheck();
		 poALLQTYCheck.rpoCheckWithDBParse(ShoppingCartNo, cartdtn);
		 poALLQTYCheck.rpoWithDBSCart(ShoppingCartNo, cartdtn);
		 //poALLQTYCheck.checkRPACTable();
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Verify Cart With DB" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception e");
			 System.exit(0);
		 }
		 	
	 	}
	 
	 @Then("^Verify Cart With DB$")
	 public void verifyCartWithDB(DataTable cartdtn) throws Throwable 
	 	{
		 
		 try
		 {
		 startTime = System.currentTimeMillis();

		 
		 checkout=pageObjectManager.getcheckOut();
		 checkout.verifyDataWithDBCart(cartdtn);
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Verify Cart With DB" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception e");
			 System.exit(0);
		 }
		 	
	 	}
	 
	 
	 @Then("^Verify catalog RPO with DB$")
	 public void RPOWithDB(DataTable dtRPO) throws InterruptedException, SQLException
	 {
		 try
		 {
		 startTime = System.currentTimeMillis();

		 rpoScreen=pageObjectManager.getRPOScreen();
		 rpoScreen.rpoCheckWithDBParse(ShoppingCartNo, dtRPO);
		 rpoScreen.rpoWithDBSCart(ShoppingCartNo, dtRPO);

		 checkout.printRPO(rpoLIST);
		 Thread.sleep(2000);

		 rpoScreen.checkRPACTable1(rpoListStr);
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Verify catalog RPO with DB" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception e");
			 System.exit(0);
		 }
		
	 }
	 
	 
	 @Then("^Verify EAN RPO with db$")
	 public void verifyEANRPO(DataTable dtaPOData) throws InterruptedException, SQLException
	 {
		
		 startTime = System.currentTimeMillis();
		 checkout=pageObjectManager.getcheckOut();
		 //String eancartno=checkout.shoppingCart();
		 poRPOCheck=pageObjectManager.getPORPOCheck();
		 poRPOCheck.rpoCheckWithDBParse(ShoppingCartNo, dtaPOData);
		 poRPOCheck.rpoWithDBSCart(ShoppingCartNo, dtaPOData);
		 //rpoLIST= checkout.return_RPO();
		 checkout.printRPO(rpoLIST);
		 Thread.sleep(2000);

		 poRPOCheck.checkRPACTable(rpoLIST);
		 
		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Verify EAN RPO with DB" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");


	 }
	 
	 // All PO + DB Check
	 @Then("^Verify All PO data with db$")
	 public void verifyAllPOData() throws InterruptedException, SQLException
	 {
		 try{ startTime = System.currentTimeMillis();

		 Thread.sleep(2000);
		 poALLQTYShopping=pageObjectManager.getPOALLQTYShopping();
		 poALLQTYShopping.allpoCheckWithDBParse(ShoppingCartNo);
		 Thread.sleep(2000);
		 poALLQTYShopping.allpoWithDBSCart(ShoppingCartNo);
		 Thread.sleep(2000);

		 endTime = System.currentTimeMillis();
		totalTime =(endTime-startTime)/1000;
		  executionTime=executionTime+totalTime;

		 System.out.println("^Verify All PO data with db$" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception e");
			 System.exit(0);
		 }
		 

	 }
	 
	 // All RPO + DB Check

	 @Then("^Verify All RPO data with db$")
	 public void verifyAllRPOData() throws InterruptedException, SQLException
	 {
		 startTime = System.currentTimeMillis();

		 Thread.sleep(1200);
		 poALLQTYCheck=pageObjectManager.getPOALLQTYCheck();
		 poALLQTYCheck.allrpoCheckWithDBParse(ShoppingCartNo);
		 Thread.sleep(1200);
		 checkout.printRPO(rpoLIST);
		 Thread.sleep(2000);
		 //checkout.printRPO(rpoLIST);
		 //Thread.sleep(2000);

		 rpoScreen.checkRPACTable1(rpoListStr);
		 //poALLQTYCheck.checkRPACTable(rpoLIST);
		 Thread.sleep(1200);
		 //poALLQTYShopping.allpoWithDBSCart(ShoppingCartNo);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Verify All RPO data with db$" + "");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

		

	 }
	 
	 @Then("^Verify All In-Plant RPO data with db$")
	 public void verifyInPlantAllRPOData() throws InterruptedException, SQLException
	 {
		 startTime = System.currentTimeMillis();

		 Thread.sleep(1200);
		 poALLQTYCheck=pageObjectManager.getPOALLQTYCheck();
		 
		 poALLQTYCheck.allrpoInplantCheckWithDBParse(inplantrpoListstr);
		 Thread.sleep(1200);
		 
		 poALLQTYCheck.checkRPACTable1(inplantrpoListstr);
		 Thread.sleep(1200);

		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Verify All In-Plant RPO data with db$" + "");	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

		

	 }
	 
	 @Then("^Verify EAN and qty with DB$")
	 public void verifyEANQtyData(DataTable EANQtyData) throws InterruptedException, SQLException
	 {
		try { startTime = System.currentTimeMillis();
		 poALLQTYCheck=pageObjectManager.getPOALLQTYCheck();
		 Thread.sleep(2000);
		 poALLQTYShopping=pageObjectManager.getPOALLQTYShopping();
		 poALLQTYShopping.poCartCheckWithDBParse(ShoppingCartNo, EANQtyData);
		 Thread.sleep(2000);
		 	poALLQTYShopping.poCartCheckWithDBShoppingCart(ShoppingCartNo, EANQtyData);
		 	Thread.sleep(2000);
		 	endTime = System.currentTimeMillis();
		 	totalTime =(endTime-startTime)/1000;
		 	executionTime=executionTime+totalTime;

		  System.out.println("^Verify EAN and qty with DB$" + "");	 
		  System.out.println("And  time taken=" +totalTime+" secs\n");

		}
		 catch(Exception e)
		 {
			 System.out.println("Exception e");
			 System.exit(0);
		 }
	 }
	 
	 @Then("^Verify EAN and RPO with DB$")
	 public void verifyEANQtyRPOData(DataTable EANQtyRPOData) throws InterruptedException, SQLException
	 { try {
		 startTime = System.currentTimeMillis();

		 Thread.sleep(5000);
		 poALLQTYCheck=pageObjectManager.getPOALLQTYCheck();
		 poALLQTYCheck.rpoCheckWithDBParse(ShoppingCartNo, EANQtyRPOData);
		 poALLQTYCheck.rpoWithDBSCart(ShoppingCartNo, EANQtyRPOData);
		 checkout.printRPO(rpoLIST);
		 Thread.sleep(2000);

		 poALLQTYCheck.checkRPACTable(rpoLIST);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 executionTime=executionTime+totalTime;

		 System.out.println("^Verify EAN and RPO with DB$" );	 
		 System.out.println("And  time taken=" +totalTime+" secs\n");

	 }
	 catch(Exception e)
	 {
		 System.out.println("Exception e");
		 System.exit(0);
	 }
	 }
	


}
