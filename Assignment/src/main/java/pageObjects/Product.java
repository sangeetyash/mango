package pageObjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import pageObjects.Wait;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

public class Product {

	WebDriver driver;
	WebElement titleErrorMsg,skuErrorMsg,descriptionErrorMsg;
	String titleErrorMsgStr,skuErrorMsgStr,descriptionErrorMsgStr;
	String emptyAlert="can't be blank";
	String alreadyExistAlert="has already been taken";

	public Product(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void getProcuctScreen() throws InterruptedException 
	{
		getWait(1500);
		WebElement productMenu = driver.findElement(By.linkText("Products"));
		productMenu.click();
		getWait(1500);
	}
	
	public void getNewProduct() throws InterruptedException 
	{
		getWait(1500);
		WebElement newProduct = driver.findElement(By.linkText("New Product"));
		newProduct.click();
		getWait(1500);
	}
	
	public void getWait(int a) throws InterruptedException 
	{
		Thread.sleep(a);
	}
	//*[@id="product_sku_input"]/p
	//*[@id="product_title_input"]/p
	//*[@id="product_description_input"]/p
	
	public String getProductTitleErrorMessage()
	{
		if(driver.findElement(By.xpath(".//*[@id='product_title_input']/p")).isDisplayed()) 
		{
		titleErrorMsgStr="";
  	    titleErrorMsg = null;
  		titleErrorMsg = driver.findElement(By.xpath(".//*[@id='product_title_input']/p"));
  		titleErrorMsgStr=titleErrorMsg.getText();
  		
		System.out.println("product_title_input is visible ->"+titleErrorMsgStr);

		}
		else
		{
			System.out.println("product_title_input is not visible");
		}
  		return titleErrorMsgStr;
	}
	
	public String getProductSKUErrorMessage()
	{
		if(driver.findElement(By.xpath(".//*[@id='product_sku_input']/p")).isDisplayed()) 
		{
		skuErrorMsgStr="";
  	    skuErrorMsg = null;
  		skuErrorMsg = driver.findElement(By.xpath(".//*[@id='product_sku_input']/p"));
  		skuErrorMsgStr=titleErrorMsg.getText();
  		
		System.out.println("product_sku_input is visible ->"+skuErrorMsgStr);

		}
		else
		{
			System.out.println("product_sku_input is not visible");
		}
  		return skuErrorMsgStr;
	}
	public String getProductDescriptionErrorMessage()
	{
		if(driver.findElement(By.xpath(".//*[@id='product_description_input']/p")).isDisplayed()) 
		{
		descriptionErrorMsgStr="";
		descriptionErrorMsg = null;
		descriptionErrorMsg = driver.findElement(By.xpath(".//*[@id='product_description_input']/p"));
		descriptionErrorMsgStr=titleErrorMsg.getText();
		
		System.out.println("product_description_input is visible ->"+skuErrorMsgStr);

		}
		else
		{
			System.out.println("product_description_input is not visible");
		}
  		return descriptionErrorMsgStr;
	}
	
	public WebElement getTitleText()

	{
		WebElement title;
		title=driver.findElement(By.id("product_title"));
		return title;
	}
	
	public WebElement getSkuText()

	{
		WebElement sku;
		sku=driver.findElement(By.id("product_sku"));
		return sku;
	}
	
	public WebElement getDescriptionText()

	{
		WebElement description;
		description=driver.findElement(By.id("product_description"));
		return description;
	}
	
	public WebElement getCancelButton()

	{
		WebElement cancel;
		cancel=driver.findElement(By.linkText("Cancel"));
		return cancel;
	}
	
	public WebElement getCreateProductButton()

	{
		WebElement createProduct;
		createProduct=driver.findElement(By.name("commit"));
		return createProduct;
	}

	public void addProduct(DataTable productDetails) throws InterruptedException
	{
		 List<Map<String, String>> list = productDetails.asMaps(String.class, String.class);
		 int col=list.size();
		 //int row=list.get(0).size();
	     //System.out.println("col" + col);
		 
			getNewProduct();

		 
	    	for(int k=0; k<list.size(); k++)
				{	
	    			driver.navigate().refresh();
		    		System.out.println("Title -> "+list.get(k).get("Title"));
		    		System.out.println("SKU -> "+list.get(k).get("SKU"));
		    		System.out.println("Description -> "+list.get(k).get("Description"));

	    			WebElement tTitle=getTitleText();
	    			tTitle.clear();
	    			tTitle.sendKeys(list.get(k).get("Title"));
	    			
	    			WebElement tSKU=getSkuText();
	    			tSKU.clear();
	    			tSKU.sendKeys(list.get(k).get("SKU"));
	    			
	    			WebElement tDescription=getDescriptionText();
	    			tDescription.clear();
	    			tDescription.sendKeys(list.get(k).get("Description"));
	    			

	    			WebElement tCreateProduct=getCreateProductButton();
	    			tCreateProduct.click();
	    			
	    			//String titleerror=getProductTitleErrorMessage();
	    			//String skuerror=getProductSKUErrorMessage();
	    			//String skudescription=getProductDescriptionErrorMessage();

				}	
	}
	
	public void editProductDetails(String productTitle, String i) throws InterruptedException
	{
		getProcuctScreen();
		
		//*[@id="product_51"]/
		//*[@id="product_51"]/tr
		//*[@id="product_51"]
		//*[@id="index_table_products"]/thead
		//*[@id="product_41"]/td[2]
		//*[@id="product_51"]/td[8]/div/a[1]
		//*[@id="product_51"]/td[1]
		//*[@id="product_51"]/td[3]
		List<WebElement> itemsfiler1 = driver.findElements(By.xpath("//table[@id='index_table_products']/tbody/tr"));
		int trnofilter1 = itemsfiler1.size() + 1;
		System.out.println("product list no ->" +trnofilter1);
		System.out.println("|"+"  ID  " + "|" + " Title " +"|"+"  SKU  "+"|"+"  Created Date  "+"|"+"  Updated Date  "+"|");

		for (int v = 1; v < trnofilter1; v++)
		{
		//System.out.println("inside");
			WebElement tblID = driver.findElement(By.xpath("//table[@id='index_table_products']/tbody/tr[" + v + "]/td[2]/a"));
			String ID=tblID.getText();
			
			WebElement tblTitle = driver.findElement(By.xpath("//table[@id='index_table_products']/tbody/tr[" + v + "]/td[3]"));
			String pTitle=tblTitle.getText();
			
			WebElement tblSku = driver.findElement(By.xpath("//table[@id='index_table_products']/tbody/tr[" + v + "]/td[4]"));
			String pSku=tblSku.getText();
			
			WebElement tCreatedDate = driver.findElement(By.xpath("//table[@id='index_table_products']/tbody/tr[" + v + "]/td[5]"));
			String pCreatedDate=tCreatedDate.getText();
			
			WebElement tUpdatedDate = driver.findElement(By.xpath("//table[@id='index_table_products']/tbody/tr[" + v + "]/td[6]"));
			String pUpdatedDate=tUpdatedDate.getText();
			
			
			if(pTitle.equalsIgnoreCase(productTitle))
			{
			
					if(i.equalsIgnoreCase("view"))
					{
						WebElement tviewbutton = driver.findElement(By.xpath("//table[@id='index_table_products']/tbody/tr[" + v + "]/td[8]/div/a[1]"));
						String a=tviewbutton.getText();
						System.out.println(""+a);
						System.out.println("|   "+ID+ "  |  "  + pTitle +"   |    "+pSku+"   |      "+pCreatedDate+"     |      "+pUpdatedDate+"     |");
						tviewbutton.click();
						break;
						//*[@id="product_41"]/td[8]/div/a[1]
					}
					
					else if(i.equalsIgnoreCase("edit"))
					{
						WebElement teditbutton = driver.findElement(By.xpath("//table[@id='index_table_products']/tbody/tr[" + v + "]/td[8]/div/a[2]"));
						String b=teditbutton.getText();
						System.out.println(""+b);
						System.out.println("|   "+ID+ "  |  "  + pTitle +"   |    "+pSku+"   |      "+pCreatedDate+"     |      "+pUpdatedDate+"     |");
		                System.exit(0); 
		                teditbutton.click();
		                break;
					}
					else if( i.equalsIgnoreCase("delete"))
					{
						WebElement tdeletebutton = driver.findElement(By.xpath("//table[@id='index_table_products']/tbody/tr[" + v + "]/td[8]/div/a[3]"));
						String c=tdeletebutton.getText();
						System.out.println(""+c);
						System.out.println("|   "+ID+ "  |  "  + pTitle +"   |    "+pSku+"   |      "+pCreatedDate+"     |      "+pUpdatedDate+"     |");
						tdeletebutton.click();
						Thread.sleep(3000);
						String alert=driver.switchTo().alert().getText();
						System.out.println("Alert" + alert);
						driver.switchTo().alert().accept();
						break;
					}
					else
					{
							System.out.println("Invalid dicision input");
					}
			//*[@id="product_51"]/td[8]/div/a[3] -> delete
			//*[@id="product_41"]/td[8]/div/a[2] -> edit
			//*[@id="product_41"]/td[8]/div/a[2] -> view
			}
			else
			{				
			}
		}
	}
	
	public void deleteProductFromDetail() throws InterruptedException
	{
		WebElement deleteProduct = driver.findElement(By.linkText("Delete Product"));
		String c=deleteProduct.getText();
		System.out.println(""+c);
		deleteProduct.click();
		Thread.sleep(3000);
		String alert=driver.switchTo().alert().getText();
		System.out.println("Alert" + alert);
		driver.switchTo().alert().accept();
	}
	
	public void editProductFromDetail(DataTable dtne) throws InterruptedException
	{
		WebElement editProduct = driver.findElement(By.linkText("Edit Product"));
		editProduct.click();
		Thread.sleep(2000);

		List<Map<String, String>> list = dtne.asMaps(String.class, String.class);
		 int col=list.size();
		 //int row=list.get(0).size();
	     //System.out.println("col" + col);
		 
			//getNewProduct();

		 
	    	for(int k=0; k<list.size(); k++)
				{	
	    			driver.navigate().refresh();
		    		System.out.println("Title -> "+list.get(k).get("Title"));
		    		System.out.println("SKU -> "+list.get(k).get("SKU"));
		    		System.out.println("Description -> "+list.get(k).get("Description"));

	    			WebElement tTitle=getTitleText();
	    			tTitle.clear();
	    			tTitle.sendKeys(list.get(k).get("Title"));
	    			Thread.sleep(1000);

	    			WebElement tSKU=getSkuText();
	    			tSKU.clear();
	    			tSKU.sendKeys(list.get(k).get("SKU"));
	    			Thread.sleep(1000);

	    			WebElement tDescription=getDescriptionText();
	    			tDescription.clear();
	    			tDescription.sendKeys(list.get(k).get("Description"));
	    			Thread.sleep(1000);


	    			WebElement tCreateProduct=getCreateProductButton();
	    			tCreateProduct.click();
	    			Thread.sleep(1000);

	    			
	    			//String titleerror=getProductTitleErrorMessage();
	    			//String skuerror=getProductSKUErrorMessage();
	    			//String skudescription=getProductDescriptionErrorMessage();

				}	
	}
	
}

