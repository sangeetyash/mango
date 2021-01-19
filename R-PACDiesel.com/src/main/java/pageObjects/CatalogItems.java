package pageObjects;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.Map.Entry;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import pageObjects.Wait;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
public class CatalogItems {
	WebDriver driver;

	public CatalogItems(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void getCatlogScreen() throws InterruptedException 
	{		        
			
		 Actions actions = new Actions(driver);

		 getWait(2000); 
		 WebElement Ordermenu = driver.findElement(By.className("Order"));
		 actions.moveToElement(Ordermenu).perform();
		 //Ordermenu.click();
		 getWait(3000); 
		 // *[@id="Catalog Items"] 
		 WebElement catalogsubmenu = driver.findElement(By.id("Catalog")); 
		 getWait(2500);
		 actions.moveToElement(catalogsubmenu).perform();
		 getWait(2500);
		 catalogsubmenu.click();
		 getWait(3000);
		 //WebElement addToCart=driver.findElement(By.name("AddToCart"));
		 //id=btnSave
		 WebElement addToCart=driver.findElement(By.id("btnSave"));

			addToCart.click();
			getWait(2000);
			
			  WebElement msg=driver.findElement(By.id("smartAlertScrollArea")); 
			  String msg1= "Please select PO Number"; //String msg2= "Qunatity Cannot be zero.";
			  
			  //System.out.println("Alert Message->"+ msg.getText());
			  
			  Assert.assertEquals(msg1, msg.getText());
			  
			  
			  
			  WebElement ok =
			  driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
			  getWait(3000); 
			  ok.click();
			 
			  
				}
		
		//driver.get("http://devmango.r-pac.com/Mango/Catelog/Catelog");
		//getWait(2000);

	
	
	
	public void addToCartWithMessage1() throws InterruptedException
	{
		
	}
	
	public void addToCartWithMessage2() throws InterruptedException
	{
		WebElement addToCart=driver.findElement(By.name("AddToCart"));
		addToCart.click();
		getWait(2000);
		WebElement msg=driver.findElement(By.id("smartAlertScrollArea"));
		//String msg1= "Please select PO Number";
		String msg2= "Qunatity Cannot be zero.";
		
		//System.out.println("Alert Message"+ msg.getText());
		
			
				Assert.assertEquals(msg2, msg.getText());


			WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
			getWait(3000);
			ok.click();
			
			

	}
	public void selectCatalogItemWithDataTable(DataTable dt)throws InterruptedException
	{
		
		        //div[dataTableContainer]
				//table[tblUserProfile]
				List<WebElement> items = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
				int itemno = items.size() + 1;
				//System.out.println("itemvise" + itemno);
				for (int s = 0; s < itemno; s++)
				{
					//*[@id="tblUserProfile"]/tbody/tr/td[2]
					WebElement itext = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + s + "]/td[2]"));
					String itemText=itext.getText();
					
					List<Map<String, String>> list = dt.asMaps(String.class, String.class);
					for(int i=0; i<list.size(); i++)
					{
						if(itemText==list.get(i).get("Item"))
						{
							
							WebElement cheoxckb = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + s + "]/td[1]"));
							cheoxckb.click();
							if(i==0)
							{
								addToCartWithMessage2();
							}
							WebElement itemQty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + s + "]/td[5]"));
							itemQty.sendKeys(list.get(i).get("Qty"));
							addToCart();
						}
						else
						{
							System.out.println("Wrong item name");
						}
						//System.out.println(list.get(i).get("Item"));
						//System.out.println(list.get(i).get("Qty"));
					}
					
					
				}
		
	}
	
	public void selectCatalogItem(String item1,String qty)throws InterruptedException
	{
		//div[dataTableContainer]
		//table[tblUserProfile]
		//System.out.println("in selectCatalogItem");

		List<WebElement> items = driver.findElements(By.xpath("//table[@id='tblUserProfile']/tbody/tr"));
		//System.out.println("after item list in selectCatalogItem");

		int itemno = items.size() + 1;
		//System.out.println("itemvise" + itemno);
		for (int s = 1; s < itemno; s++)
		{
			//System.out.println("itemvise loop");
			int r=s;
			//System.out.println("itemvise loop r="+r);

			//*[@id="tblUserProfile"]/tbody/tr/td[2]
			WebElement itext = driver.findElement(By.xpath("//table[@id='tblUserProfile']/tbody/tr[" + r + "]/td[2]"));
			String itemText=itext.getText();
			//System.out.println("item text->" +itemText + " " + "Input Item Text->" +item1);
			//*[@id="tblUserProfile"]/tbody/tr/td[2]
			//if(itemText == item1)
			//{
			
				  //System.out.println("itemvise if condition");
				  WebElement cheoxckb = driver.findElement(By.xpath("//table[@id='tblUserProfile']/tbody/tr[" + r + "]/td[1]/div/input"));
				  cheoxckb.click();
				  
				  WebElement addToCart=driver.findElement(By.id("btnSave"));

				  addToCart.click();
				  getWait(2000);
				
				  WebElement msg=driver.findElement(By.id("smartAlertScrollArea")); 
				  String msg1= "Qunatity Cannot be zero."; //String msg2= "Qunatity Cannot be zero.";
				  
				  //System.out.println("Alert Message->"+ msg.getText());
				  
				  Assert.assertEquals(msg1, msg.getText());
		
				  WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
				  getWait(3000); 
				  ok.click();	
				  
				  WebElement itemQty = driver.findElement(By.xpath("//table[@id='tblUserProfile']/tbody/tr[" + r + "]/td[5]/input"));
				  itemQty.clear();
				  itemQty.sendKeys(qty);
				  getWait(1000);

				//WebElement addToCart=driver.findElement(By.name("AddToCart"));
				  addToCart.click();
				  getWait(2000);
				  WebElement msg31=driver.findElement(By.id("smartAlertScrollArea")); 
				  String msg3="Saved Successfully.";
				  
				  //System.out.println("Alert Message->"+ msg31.getText());
				  
				  Assert.assertEquals(msg3, msg31.getText());
		
				  WebElement ok1 = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
				  getWait(3000); 
				  ok1.click();
			//}
			//else
			//{
			//	System.out.println("Wrong item name");
			//}
		}
	}
	
	/*
	 * List<Map<String, String>> list = dt.asMaps(String.class, String.class);
	 * for(int i=0; i<list.size(); i++) {
	 * System.out.println(list.get(i).get("First Name"));
	 * System.out.println(list.get(i).get("Last Name")); }
	 */
	/*
	 * @When("^User enters Credentials to LogIn$") public void
	 * user_enters_testuser_and_Test(DataTable usercredentials) throws Throwable {
	 * 
	 * //Write the code to handle Data Table for (Map<String, String> data :
	 * usercredentials.asMaps(String.class, String.class)) {
	 * driver.findElement(By.id("log")).sendKeys(data.get("Username"));
	 * driver.findElement(By.id("pwd")).sendKeys(data.get("Password"));
	 * driver.findElement(By.id("login")).click(); }
	 * 
	 * }
	 */
	
	
	public void addToCart()throws InterruptedException
	{
		WebElement addToCart=driver.findElement(By.name("AddToCart"));
		addToCart.click();
		getWait(2000);
		//*[@id="ui-datepicker-div"]/table/tbody/tr[3]/td[4]/a
	}
	
	public void getWait(int a) throws InterruptedException 
	{
		Thread.sleep(a);
	}

}
