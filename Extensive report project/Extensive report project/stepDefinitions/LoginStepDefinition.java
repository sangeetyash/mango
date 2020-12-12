package stepDefinitions;



import java.sql.SQLException;
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
	WebDriver driver;
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
	 List<String> lst=null;
	String RPO="";
	String shID="";
	String ShoppingCartNo;
	
	List<String> rpoLIST;
	
	
	long startTime,endTime,totalTime;
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
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe"); 
		 driver = new ChromeDriver();
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
		  
		  System.out.println("^Navigate user to Login Page with " + browser + " -> " + url + "\n  And  time taken=" +totalTime+" secs");
	 }
	
	
	 @When("^title of login page$")
	 public void title_of_login_page_is_free_CRM()
	 {
		  startTime = System.currentTimeMillis();

		  loginUserPassword=pageObjectManager.getLoginUserPassword();
		  loginUserPassword.title_LoginUserPassword();
		  
		  endTime = System.currentTimeMillis();
		  totalTime =(endTime-startTime)/1000;
		  System.out.println("^title of login page "  + "\n And  time taken=" +totalTime+" secs");
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

			 Thread.sleep(5000);
			 System.out.println("^SQL Connection and Statement  And  time taken=" +totalTime+" secs");
			 
	 }	
	 
	 @Then("^enters  \"([^\"]*)\" and  \"([^\"]*)\"$")
	 public void enters_username_and_password(String username, String password) throws Exception
	 {
		 startTime = System.currentTimeMillis();
		 loginUserPassword=pageObjectManager.getLoginUserPassword();
		 loginUserPassword.usernamepassword_LoginUserPassword(username, password);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^enters  username and password "  + " \n And  time taken=" +totalTime+" secs");
		 
	 }
	 
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password) throws Exception
	 {
		 startTime = System.currentTimeMillis();

		 loginUserPassword=pageObjectManager.getLoginUserPassword();
		 loginUserPassword.usernamepassword_LoginUserPassword(username, password);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^enters  username and password "  + " \n And  time taken=" +totalTime+" secs");
		 
	 }
	
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() 
	 {	
		 startTime = System.currentTimeMillis();
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^user clicks on login button"  + " \n And  time taken=" +totalTime+" secs");
	 }
	
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page()
	 {	
		 startTime = System.currentTimeMillis();

		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^user is on home page"  + " \n And  time taken=" +totalTime+" secs");	 
	
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
		 System.out.println("^user moves to Release PO page and search for PO "+RPO  + " \n And  time taken=" +totalTime+" secs");	 
	

		 
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
		 System.out.println("^With Confirm orders,Search Release PO page with CPO ID  "+RPO + " \n And  time taken=" +totalTime+" secs");	 
	
		 
		}
	 
	 // Search supplier ID "0593"
	 @Then("^Search supplier ID \"([^\"]*)\"$")
	 public void SuppilerSearch(String suid) throws InterruptedException 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.searchSupplier(suid);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Search supplier ID " + suid + " \n And  time taken=" +totalTime+" secs");	 
	
		 
		}
	 
	 
	 @Then("^Click on CPO \"([^\"]*)\"$")
	 public void clickoncartCPO(String cpo) throws InterruptedException 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.clickonCPO(cpo);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Click on CPO" + cpo + " \n And  time taken=" +totalTime+" secs");	 
	
		 
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
		 System.out.println("^then delete PO from cart " + " \n And  time taken=" +totalTime+" secs");	 
	
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
		 System.out.println("^click on PO->" + PO +" and select overage " +over + " \n And  time taken=" +totalTime+" secs");	 
	
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
		 System.out.println("^click on PO->" + PO +" and select overage " + " \n And  time taken=" +totalTime+" secs");	 
	
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
		 System.out.println("^click on PO->" + PO +" and select overage " + " \n And  time taken=" +totalTime+" secs");	 
	
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
		 System.out.println("^Addtocart with double click" + " \n And  time taken=" +totalTime+" secs");	 
	
		 

	 }
	 //Then Addtocart
	 @Then("^Addtocart$")
	 public void getAddtocart()throws InterruptedException
	 {
		 	startTime = System.currentTimeMillis();

		 	releasePO=pageObjectManager.getreleasePO();
		 	Thread.sleep(2000);

			 releasePO.printArry();
			 	Thread.sleep(2000);

		 	releasePO.addToCart();
		 	Thread.sleep(2000);
		 	releasePO.addToCartsucess();
		 	
		 	
		 	endTime = System.currentTimeMillis();
			 totalTime =(endTime-startTime)/1000;
			 System.out.println("^Addtocart" + " \n And  time taken=" +totalTime+" secs");	 
		
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
			 System.out.println("^goto catalog screen and PO selection validation check" + " \n And  time taken=" +totalTime+" secs");	 
		

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
			 System.out.println("^Plus Add to cart" + " \n And  time taken=" +totalTime+" secs");	 
		

		  
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
		 System.out.println("^Then check catlog PO selected and quantity should be more than zero" + " \n And  time taken=" +totalTime+" secs");	 
	
	 }
	 
	 @Then("^Search for PO \"([^\"]*)\"$")
	 public void getCPO(String suid) throws InterruptedException 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 orderStatus=pageObjectManager.getOrderStatus();
		 orderStatus.searchCPO(suid);
		
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Search for PO" + suid + " \n And  time taken=" +totalTime+" secs");	 
	
		 
		 
		}
	 
	 @Then("^Select overage \"([^\"]*)\"$")
	 public void getOverage(String overage) throws InterruptedException 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.selectOverage(overage);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Select overage" + overage +" \n And  time taken=" +totalTime+" secs");	 
	
				 
		}
	 
	 @Then("^user enters credentials$")
	 public void getCrentials(DataTable usercredentials) throws Throwable 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 loginUserPassword=pageObjectManager.getLoginUserPassword();
		 loginUserPassword.usercredentials(usercredentials);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^user enters credentials" +" \n And  time taken=" +totalTime+" secs");	 
	
				 
		}
	 
	 @Then("^Deselect previous and Select PO items based on EAN$")
	 public void getDeselectEANSelect(DataTable dtEANA) throws Throwable 
	 	{
		 
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.deselectSelectPOEAN(dtEANA);
		 
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Deselect previous and Select PO items based on EAN" +" \n And  time taken=" +totalTime+" secs");	 
			 
		}
	 @Then("^Select PO items based on EAN$")
	 public void getEANSelect(DataTable dtEAN) throws Throwable 
	 	{
		 startTime = System.currentTimeMillis();

		 releasePO=pageObjectManager.getreleasePO();
		 releasePO.selectPOEAN(dtEAN);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Select PO items based on EAN" +" \n And  time taken=" +totalTime+" secs");	 
			
		 
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
		 System.out.println("^Select PO items based on EAN plus edit order qty" +" \n And  time taken=" +totalTime+" secs");	 
			 
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
		 System.out.println("^Select PO items based on EAN" +" \n And  time taken=" +totalTime+" secs");	 
			
		 
		 
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
		 System.out.println("^Show confirm orders" +" \n And  time taken=" +totalTime+" secs");	 
					 
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
		 System.out.println("^Select PO items based on EAN" + " \n And  time taken=" +totalTime+" secs");	 
					 
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
		 System.out.println("^Select PO items based on EAN" + " \n And  time taken=" +totalTime+" secs");	 
			

		 
		 
		}
	 
	 @Then("^Verify Cart With DB$")
	 public void verifyCartWithDB(DataTable cartdtn) throws Throwable 
	 	{
		 startTime = System.currentTimeMillis();

		 
		 checkout=pageObjectManager.getcheckOut();
		 checkout.verifyDataWithDBCart(cartdtn);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Verify Cart With DB" + " \n And  time taken=" +totalTime+" secs");	 
			

		 	
	 	}
	 
	 @Then("^Verify EAN and RPO with db$")
	 public void verifyOrderEANRPOWithDB(DataTable cartdtn) throws Throwable 
	 	{
		 startTime = System.currentTimeMillis();

		 
		 checkout=pageObjectManager.getcheckOut();
		 poALLQTYCheck =pageObjectManager.getPOALLQTYCheck();
		 poALLQTYCheck.rpoCheckWithDBParse(ShoppingCartNo, cartdtn);
		 poALLQTYCheck.rpoWithDBSCart(ShoppingCartNo, cartdtn);
		 //poALLQTYCheck.checkRPACTable();
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Verify Cart With DB" + " \n And  time taken=" +totalTime+" secs");	 
			

		 	
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
		 System.out.println("^Then Add to cart" + item + " " + qty + " \n And  time taken=" +totalTime+" secs");	 
		
	 }

	 
	 @Then("^select Ship To,selct Production location Vendor PO, Requird Shipment Date$")
	 public void select_checkout_details()throws InterruptedException 
	 {
		 
		 startTime = System.currentTimeMillis();

		 checkout=pageObjectManager.getcheckOut();
		 Thread.sleep(5000);
		 checkout.selectShipTo(1);
		 checkout.printShop(1);
		 checkout.VPO("ABC123");
		 checkout.expectedDate("2020-10-30");
		 Thread.sleep(5000);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^select Ship To,selct Production location Vendor PO, Requird Shipment Date$" + " \n And  time taken=" +totalTime+" secs");	 
		
		 
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
		 System.out.println("^goto checkout page$" + " \n And  time taken=" +totalTime+" secs");	 
		
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
		 System.out.println("^AddToCart$" + " \n And  time taken=" +totalTime+" secs");	 
	
	 }
	 
	 @Then("^Confirm Order$")
	 public void confirm_order()throws InterruptedException 
	 {
		 startTime = System.currentTimeMillis();

		 checkout=pageObjectManager.getcheckOut();
		 ShoppingCartNo=checkout.shoppingCartNo();
		 checkout.orderConfirm();
		 
		 Thread.sleep(2000);
		 rpoScreen=pageObjectManager.getRPOScreen();
		 rpoLIST=checkout.return_RPO();
		 Thread.sleep(2000);
		 rpoScreen.checkRPACTable(rpoLIST);
		 checkout=pageObjectManager.getcheckOut();
		 lst=checkout.return_RPO();
		  shID=checkout.shoppingCart();
		 checkout.printOrderDetails();
		 Thread.sleep(10000);
		 checkout.orderDone();
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Confirm Order$" + " \n And  time taken=" +totalTime+" secs");	 

		 
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
		 System.out.println("^Confirm Order with double click$" + " \n And  time taken=" +totalTime+" secs");	 
				 
	 }
	 
	 @Then("^Print Confirmation and done$")
	 public void print_confirmation_done()throws InterruptedException 
	 {		
		 startTime = System.currentTimeMillis();

		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Print Confirmation and done$" + " \n And  time taken=" +totalTime+" secs");	 
			
	 }
	 
	 @Then("Goto Report>Order Status$")
	 public void order_status_check()throws InterruptedException
	 {
		 startTime = System.currentTimeMillis();

		 orderStatus=pageObjectManager.getOrderStatus();
		 orderStatus.getOrderStutus();
		 Thread.sleep(2000);
		 orderStatus.getSearch();
		 Thread.sleep(1000);
		 orderStatus.searchRPO(lst);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Goto Report>Order Status" + " \n And  time taken=" +totalTime+" secs");	 
			
	 }
	 
	 
	 @Then("^Verify catalog RPO with DB$")
	 public void RPOWithDB(DataTable dtRPO) throws InterruptedException, SQLException
	 {
		 
		 startTime = System.currentTimeMillis();

		 rpoScreen=pageObjectManager.getRPOScreen();
		 rpoScreen.rpoCheckWithDBParse(shID, dtRPO);
		 rpoScreen.rpoWithDBSCart(shID, dtRPO);
		 rpoScreen.checkRPACTable(rpoLIST);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Verify catalog RPO with DB" + " \n And  time taken=" +totalTime+" secs");	 
			
		
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
		 System.out.println("^User Logout" + " \n And  time taken=" +totalTime+" secs");	 
		
	 }
	 @Then("^Verify POData EAN with DB$")
	 public void verifyPODataEAN(DataTable dtaPOData) throws InterruptedException, SQLException
	 {	
		 startTime = System.currentTimeMillis();

		 checkout=pageObjectManager.getcheckOut();
		 checkout.verifyDataEANWithDBCart(dtaPOData);
		 //verifyDataEANWithDBCart
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Verify POData EAN with DB" + " \n And  time taken=" +totalTime+" secs");	 
		

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
		 rpoLIST= checkout.return_RPO();
		 poRPOCheck.checkRPACTable(rpoLIST);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Verify EAN RPO with DB" + " \n And  time taken=" +totalTime+" secs");	 
		

	 }
	 
	 @Then("^Verify All PO data with db$")
	 public void verifyAllPOData() throws InterruptedException, SQLException
	 {
		 startTime = System.currentTimeMillis();

		 Thread.sleep(2000);
		 poALLQTYShopping=pageObjectManager.getPOALLQTYShopping();
		 poALLQTYShopping.allpoCheckWithDBParse(ShoppingCartNo);
		 Thread.sleep(2000);
		 poALLQTYShopping.allpoWithDBSCart(ShoppingCartNo);
		 Thread.sleep(2000);

		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Verify All PO data with db$" + " \n And  time taken=" +totalTime+" secs");	 
		
		 

	 }
	 
	 @Then("^Verify EAN and qty with DB$")
	 public void verifyEANQtyData(DataTable EANQtyData) throws InterruptedException, SQLException
	 {
		 startTime = System.currentTimeMillis();
		 poALLQTYCheck=pageObjectManager.getPOALLQTYCheck();
		 Thread.sleep(2000);
		 poALLQTYShopping=pageObjectManager.getPOALLQTYShopping();
		 poALLQTYShopping.poCartCheckWithDBParse(ShoppingCartNo, EANQtyData);
		 Thread.sleep(2000);
		 poALLQTYShopping.poCartCheckWithDBShoppingCart(ShoppingCartNo, EANQtyData);
		 Thread.sleep(2000);
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Verify EAN and qty with DB$" + " \n And  time taken=" +totalTime+" secs");	 
		
	 }
	 
	 @Then("^Verify EAN and RPO with DB$")
	 public void verifyEANQtyRPOData(DataTable EANQtyRPOData) throws InterruptedException, SQLException
	 {
		 startTime = System.currentTimeMillis();

		 Thread.sleep(5000);
		 poALLQTYCheck=pageObjectManager.getPOALLQTYCheck();
		 poALLQTYCheck.rpoCheckWithDBParse(ShoppingCartNo, EANQtyRPOData);
		 poALLQTYCheck.rpoWithDBSCart(ShoppingCartNo, EANQtyRPOData);
		 poALLQTYCheck.checkRPACTable(rpoLIST);
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Verify EAN and RPO with DB$"+ " \n And  time taken=" +totalTime+" secs");	 
	
	 }
	 
	 @Then("^Close Browser$")
	 public void close_the_browser() throws InterruptedException
	 {
		 startTime = System.currentTimeMillis();

		 Thread.sleep(5000);
		 driver.close();
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Close Browser$"+ " \n And  time taken=" +totalTime+" secs");	 
		 
		 
		 startTime = System.currentTimeMillis();

		 driver.quit();	
		 
		 endTime = System.currentTimeMillis();
		 totalTime =(endTime-startTime)/1000;
		 System.out.println("^Quit Driver$"+ " \n And  time taken=" +totalTime+" secs");	 
	
	 }
	


}
