package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.connectionsdb.POALLQTYCheck;
import com.connectionsdb.POALLQTYShopping;
import com.connectionsdb.PORPOCheck;
import com.connectionsdb.POShoppingCart;
import com.connectionsdb.RPOScreen;
import com.connectionsdb.ShoppingCart;
import com.connectionsdb.SqlConnection;
import com.project.managers.PageObjectManager;

import cucumber.api.java.en.Then;
import pageObjects.CatalogItems;
import pageObjects.CheckOut;
import pageObjects.LoginUserPassword;
import pageObjects.OrderStatus;
import pageObjects.ReleasePO;

public class NewStepDefinition 
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

	
	
	long startTime,endTime,totalTime,executionTime;
	public NewStepDefinition() {
		// TODO Auto-generated constructor stub
	}
	@Then("^Close a Browser$")
	 public void close_the_browser()  throws InterruptedException 
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
	 
}
