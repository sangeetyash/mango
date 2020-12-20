package pageObjects;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import java.awt.List;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.WebElement;
//import java.awt.List;
//import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.connectionsdb.*;
import com.project.managers.PageObjectManager;

import cucumber.api.DataTable;


public class CheckOut 
{
	
	WebDriver driver;
	PageObjectManager pageObjectManager;
	SqlConnection sqlConnection;
	ShoppingCart shoppingCart;
	 PORPOCheck poRPOCheck;
	 POShoppingCart poShoppingCart;
	
	public CheckOut(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void toCartPage() 
	{
		driver.findElement(By.id("lblCart")).click();
		//System.out.println("^User on Cart screen");
	}
	
	public void deletePO(String PO,int a) throws InterruptedException
	{
		WebElement filter = driver.findElement(By.xpath("//div[@id='tblServiceBureauOrder_wrapper']/span[2]/span/a"));
		filter.click();
		WebElement searchPO=driver.findElement(By.id("searchId1"));
		searchPO.clear();
		//getWait(300);
		searchPO.sendKeys(PO);
		searchPO.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		List<WebElement> itemsfiler1 = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trnofilter1 = itemsfiler1.size() + 1;
		//System.out.println("itemvise" + trnofilter1);
		
		for (int v = 1; v < 2; v++)
			{
				WebElement check = driver.findElement(By.xpath("//table[@id='tblServiceBureauOrder']/tbody/tr[" + v + "]/td[1]"));
				check.click();
			}
		
		if (a == 1)
			{
				WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div[1]"));
				getWait(3000);
				ok.click();
				getWait(3000);
				WebElement ok1 = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
				ok1.click();
			}
		else if (a == 0)
			{
				WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div[2]"));
				getWait(3000);
				ok.click();
			}
		else
			{
				System.out.println("Invalid choose");
			}
		//*[@id="smartAlertButtons"]/div[2]
		//*[@id="smartAlertButtons"]/div[1]
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0, 0)");
		getWait(1000);
	}

	public void billTo(int s) throws InterruptedException 
	{
		Select BillTo = new Select(driver.findElement(By.name("BillAdd.SelAddressId")));
		BillTo.selectByIndex(s);
		
		//System.out.println("^ShipTo address selected");
	}
	public void selectShipTo(int s) throws InterruptedException 
	{
		Select ShipAdd = new Select(driver.findElement(By.name("ShipAdd.SelAddressId")));
		ShipAdd.selectByIndex(s);
		
		//System.out.println("^ShipTo address selected");
	}

	public void printShop(int p) throws InterruptedException
	{
		Select ShipAdd = new Select(driver.findElement(By.name("PrintShopId")));
		ShipAdd.selectByIndex(p);
		/*
		 * WebElement msg=driver.findElement(By.id("smartAlertContent"));
		 * //mCSB_container mCS_no_scrollbar String msg1=
		 * "PLEASE NOTE THAT A ROUND UP OF QUANTITIES WAS APPLIED ON THE RFID ITEM. ROUND UP QUANTITY SET IN ITEM SETUP FOR - SSW=0"
		 * ; //String msg2= "Qunatity Cannot be zero.";
		 * 
		 * System.out.println("Alert Message->"+ msg.getText());
		 * 
		 * Assert.assertEquals(msg1, msg.getText());
		 */
			  getWait(2000); 

		/*
		 * //WebElement ok =
		 * driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
		 * if((driver.findElement(By.id("smartAlertButtons")).isDisplayed())) {
		 * WebElement ok = driver.findElement(By.id("smartAlertButtons"));
		 * 
		 * getWait(3000); ok.click(); }
		 */
		//System.out.println("^Printshop selected");
	}

	public void VPO(String vpo) throws InterruptedException 
	{
		driver.findElement(By.name("VPO")).sendKeys(vpo);
		
		//System.out.println("^Vendor PO enter");
	}

	public void expectedDate(String exdate) throws InterruptedException 
	{
		Thread.sleep(1000);
		WebElement edate = driver.findElement(By.xpath(".//*[@id='txtdtExpected']"));
		Thread.sleep(1000);
		edate.click();

		WebElement daydate = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[4]/a"));
		daydate.click();
		//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[4]/a
		//*[@id="ui-datepicker-div"]/table/tbody/tr[4]/td[5]
		//System.out.println("^Expected date of delivery selected " + daydate.getText());
	}

	public void orderConfirm() throws InterruptedException 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.id("btnConfirmOrder")).click();
		
		//System.out.println("^Order Confirmed");

	}

	public void doubleClickConfirm() throws InterruptedException 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		//driver.findElement(By.id("btnConfirmOrder")).click();
		//System.out.println("^Order Confirmed");
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("btnConfirmOrder"));
		actions.doubleClick(elementLocator).perform();
		
		//System.out.println("^Order Confirmed with double click");

	}
	public void orderDone() throws InterruptedException 
	{
		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.id("btnConfirmOrder")).click();
		
		//System.out.println("^Order preview page exit");
	}

	public void printOrderDetails() 
	{
		/*
		 * 
		 * WebElement
		 * td=driver.findElement(By.xpath(".//*[@id='divlbl']/table/tbody/tr/td[3]]"));
		 * //List<WebElement> links = td.findElements(By.tagName("label"));
		 * List<WebElement> allElements=driver.findElements(By.
		 * cssSelector("#divlbl > table > tbody > tr > td:nth-child(3)"));
		 * 
		 * //#divlbl > table > tbody > tr > td:nth-child(3) //List<WebElement> links =
		 * ul.findElements(By.tagName("li")); //*[@id="divlbl"]/table/tbody/tr/td[3]
		 * //*[@id="divlbl"]/table/tbody/tr/td[3]/label[3]
		 * 
		 * WebElement ordate=driver.findElement(By.xpath(
		 * "//[@id='divlbl']/table/tbody/tr/td[3]/label[3]]")); String
		 * strordate=ordate.getText(); System.out.println("Order Date" + strordate );
		 * 
		 * WebElement shippingcarte=driver.findElement(By.xpath(
		 * "//*[@id='divlbl']//table//tbody//tr//td[3]//label[5]]")); String
		 * strshippingcarte=shippingcarte.getText();
		 * System.out.println("Shipping Cart No." + strshippingcarte );
		 * 
		 * WebElement productionloc=driver.findElement(By.xpath(
		 * ".//*[@id='divlbl']/table/tbody/tr/td[3]/label[7]]")); String
		 * strproductionloc=productionloc.getText();
		 * System.out.println("Shipping Cart No." + strproductionloc );
		 */
	}
	
	public void alertCheck() throws InterruptedException
	{
		if (driver.findElement(By.xpath("//*[@id='smartAlertButtons']")).isDisplayed())    
		{
			//*[@id="smartAlertButtons"]
			  WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
			  getWait(3000); 
			  ok.click();	
		}
	}

	public void getWait(int a) throws InterruptedException
	{
		Thread.sleep(a);
	}
	
	public void verifyDataWithDBCart(DataTable dtnCart) throws InterruptedException, SQLException
	{
		pageObjectManager=new PageObjectManager(driver);
		sqlConnection=pageObjectManager.getSqlConnection();
		shoppingCart=pageObjectManager.getShoppingCart();
		String cartNo = driver.findElement(By.xpath(".//*[@id='heading']")).getText();
		//System.out.println("Cart No-> "+cartNo);
		String cNo=cartNo.substring(16);
	    System.out.println("Cart No-> "+cNo);
	    sqlConnection.cartCheckWithDBParse(cNo, dtnCart);
		  getWait(3000); 
		  shoppingCart.cartCheckWithDBSCart(cNo, dtnCart);
	}
	
	public void verifyDataEANWithDBCart(DataTable dtnEANCart) throws InterruptedException, SQLException
	{
		pageObjectManager=new PageObjectManager(driver);
		poShoppingCart=pageObjectManager.getPOShoppingCart();
		
		String cartNo = driver.findElement(By.xpath(".//*[@id='heading']")).getText();
		String cpoRPOCheckNo=cartNo.substring(16);
	   // System.out.println("Cart No-> "+cpoRPOCheckNo);

	    poShoppingCart.poCheckWithDBParse(cpoRPOCheckNo, dtnEANCart);
	    getWait(3000); 
	    poShoppingCart.rpoWithDBSCart(cpoRPOCheckNo, dtnEANCart);
	}
	
	public  List<String> return_RPO() 
	{
	       //define string array
		List<String> return_RPO = new ArrayList<String>();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		List<WebElement> itemsfiler = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		//*[@id="tblEmployee"]/tbody/tr[1]
		int trnofilter = itemsfiler.size() + 1;
		//System.out.println("itemvise" + trnofilter);
		
		for (int t = 1; t < trnofilter; t++)
			{
			//*[@id="tblEmployee"]/tbody/tr[1]/td[1]				
			WebElement rpo = driver.findElement(By.xpath("//table[@id='tblEmployee']/tbody/tr[" + t + "]/td[1]"));
				String srpo=rpo.getText();
				return_RPO.add(srpo);
			}
		
	       return return_RPO;	

	   }
	
	
	  public String shoppingCart() 
	  { 
		  String cartNo=""; 
		  cartNo= driver.findElement(By.xpath(".//*[@id='divlbl']/table/tbody/tr/td[3]/label[5]")).getText(); 
		  return cartNo;
		//*[@id="divlbl"]/table/tbody/tr/td[3]/label[5]
	  }
	  
	  public String shoppingCartNo() 
	  { 
		  String cartNo1=""; 
		  	cartNo1 = driver.findElement(By.xpath(".//*[@id='heading']")).getText();
			String cpoRPOCheckNo=cartNo1.substring(16);
		    //System.out.println("Cart No-> "+cpoRPOCheckNo);
		  return cpoRPOCheckNo;
		//*[@id="divlbl"]/table/tbody/tr/td[3]/label[5]
	  }
	  
	  public String[][] arryICodeAndTqty() throws InterruptedException
	  {
		  
		  String[][] newarryICodeAndTqty=new String[50][50];
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			  Thread.sleep(1500);

			List<WebElement> itemsfiler1 = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
			int trnofilter1 = itemsfiler1.size() + 1;
			//System.out.println("itemvise" + trnofilter1);
			
			for (int v = 1; v < trnofilter1; v++)
				{
					WebElement iCode = driver.findElement(By.xpath("//table[@id='tblServiceBureauOrder']/tbody/tr[" + v + "]/td[3]"));
					WebElement tQty = driver.findElement(By.xpath("//table[@id='tblServiceBureauOrder']/tbody/tr[" + v + "]/td[5]"));
					String itemCode=iCode.getText();
					String totalQty=tQty.getText();
					
					newarryICodeAndTqty[v-1][0]=itemCode;
					newarryICodeAndTqty[v-1][1]=totalQty;
				}
		  
		return newarryICodeAndTqty;
	  }
	 public void printRPO(List<String> RPO)
	 {
		 	String strig1="";
		 	List<String> nList= RPO;
		 	
			int i =nList.size();
			System.out.println("size"+i);
			
			strig1 = String.join(",", nList); 
	        System.out.println(strig1);
	 }
	 
	 public String getRPOListString(List<String> RPOn)
	 {		
		 	String str ="";
		 	List<String> nList= RPOn;
		 	
			int i =RPOn.size();
			str = String.join(",", nList);
	        
	        System.out.println(str);
	        
	        return str;
	 }
}
