package pageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.project.managers.PageObjectManager;

import cucumber.api.DataTable;

public class OrderStatus {

	WebDriver driver;
	
	String connectionUrl =
            "jdbc:sqlserver://10.0.0.4:1473;"
            + "database=r-tracDB;"
            + "user=Sangeet;"
            + "password=S@ngeet#2020;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "loginTimeout=30;";
	 Statement statement1;
	 Connection connection;
	 ResultSet resultSet2;
	PageObjectManager pageObjectManager;
	CheckOut checkOut;
	public OrderStatus(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getOrderStutus() throws InterruptedException
	{
		Actions actions = new Actions(driver);

		getWait(2000);

		WebElement lreport = driver.findElement(By.className("Reports"));
		actions.moveToElement(lreport).perform();
		getWait(1000);
		lreport.click();
		getWait(2000);
		
		// *[@id="Release"]
		WebElement oStatus = driver.findElement(By.linkText("Order Status"));
		actions.moveToElement(oStatus).perform();
		getWait(1000);
		oStatus.click();
		getWait(2000);
		
	}
	
	public void getSearch() throws InterruptedException
	{		driver.get("http://devalvaromoreno.r-pac.com/AlvaroMoreno/OrderStatus/Index");
        	JavascriptExecutor js = (JavascriptExecutor) driver;

			getWait(3000);
	  		WebElement search = driver.findElement(By.xpath(".//*[@id='tblMangoOrderStatus_length']/span[2]/span/span"));
	        js.executeScript("arguments[0].scrollIntoView();",search);
	  	    getWait(1000);
	  		search.click();
	  	    getWait(3000);
	  	    
	  	    //*[@id="tblOrderStatus_length"]/span[2]/span/span
	  	    //*[@id="tblOrderStatus_length"]/span[2]/span/span
	  		//*[@id="tblMangoOrderStatus_length"]/span[2]/span/span
	  	    //*[@id="tblOrderStatus_length"]/span[2]/span/span/a/span
	  		//WebElement search = driver.findElement(By.xpath(".//*[@id='tblMangoOrderStatus_length']/span[2]/span/span/a"));
	  	    //getWait(1000);
	  	    // search1=driver.findElement(By.cssSelector("css=.glyphicon"));
	  	    //getWait(2000);
	  	    //search1.click();
	  	    //getWait(3000);
	  	    //*[@id="tblMangoOrderStatus_length"]/span[2]/span/span
	}
	
	public void searchCPO(String cpo) throws InterruptedException {
		// *[@id="searchId0"]
		WebElement seaech = driver.findElement(By.id("searchId1"));
		seaech.clear();
		seaech.sendKeys(cpo);
		seaech.sendKeys(Keys.ENTER);
		// driver.findElement(By.id("searchId0")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// driver.findElement(By.id("searchId0")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// *[@id="tblServiceBureauOrder"]/tbody/tr/td[1]/span/a
	}
	
	public void searchRPO(String shopID) throws InterruptedException 
	{
		try
		{
			String RPOString="";
		// *[@id="searchId0"]
		//int i =rpo.size();
		//System.out.println("size"+i);
		long num = Long.parseLong(shopID);
	    //System.out.println(num);
		  //SELECT DISTINCT [bigIntRPO]
				//  FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] where bigIntShoppingCartNo =3000006454 and [bigIntRPO] is not NULL

		            String selectSql2=	"SELECT DISTINCT [bigIntRPO] FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] "
            		+ "where bigintShoppingCartNo  = "+ num  +" AND [bigIntRPO] is not NULL order by [bigIntRPO] desc";
            	
		            
		             System.out.println(selectSql2);
					 connection = DriverManager.getConnection(connectionUrl);
					 statement1 = connection.createStatement();
				    
					
		            int j=1;
		            resultSet2=null;
		            resultSet2 = statement1.executeQuery(selectSql2);
		            
		            while (resultSet2.next())
		            {
		                   //wait(2500);
		       			selectNoRecords("100");

		            	String rec=resultSet2.getString("bigIntRPO");
				        System.out.println(rec);
				        WebElement seaech = driver.findElement(By.id("searchId0"));
						seaech.clear();
						Thread.sleep(1000);

						//System.out.println(rpo.get(j).toString());
						seaech.sendKeys(rec);
						seaech.sendKeys(Keys.ENTER);
						Thread.sleep(5000);
				        if(j==1)
				        {
				        	RPOString=rec;
				        }
				        else
				        {
				        	RPOString=RPOString+","+rec;
				        }
		            j=j+1;
		            }    
				 	
			
			        System.out.println(RPOString);
		}
		catch (SQLException e) 
        {
            e.printStackTrace();
        }
		finally
		{
            if (resultSet2 != null) {
                try {
                	resultSet2.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (statement1 != null) {
                try {
                	statement1.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (connection != null) 
            {
                try 
                {
                	connection.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
		}
		
	}
	
	public void getWait(int a) throws InterruptedException 
	{
		Thread.sleep(a);
	}
	
	
	public void selectNoRecords(String i) throws InterruptedException
	{
		getWait(1500);

		// *[@id="tblServiceBureauOrder_length"]/label/select

		Select noRecords = new Select(driver.findElement(By.name("tblOrderStatus_length")));
		//System.out.println("Overage" + over);
		/*
		 * for (int i = 1; i < 6; i++) { String a = Integer.toString(i);
		 * over.selectByValue(a); getWait(3000); }
		 */
		noRecords.selectByValue(i);
		getWait(1500);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		getWait(1000);
		js.executeScript("window.scrollTo(0, 0)"); 

	}
	
	public void gotoRPODetailScreen(String shopID) throws InterruptedException
	{
		try
		{
			String RPOString="";

		// *[@id="searchId0"]
		//int i =rpo.size();
		//System.out.println("size"+i);
		long num = Long.parseLong(shopID);
	    //System.out.println(num);
		  //SELECT DISTINCT [bigIntRPO]
				//  FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] where bigIntShoppingCartNo =3000006454 and [bigIntRPO] is not NULL
		selectNoRecords("100");

		            String selectSql2=	"SELECT DISTINCT [bigIntRPO] FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] "
            		+ "where bigintShoppingCartNo  = "+ num  +" AND [bigIntRPO] is not NULL order by [bigIntRPO] desc";
            	
		            
		             System.out.println(selectSql2);
					 connection = DriverManager.getConnection(connectionUrl);
					 statement1 = connection.createStatement();
				    
					
		            int j=1;
		            resultSet2=null;
		            resultSet2 = statement1.executeQuery(selectSql2);
		            
		            while (resultSet2.next())
		            {
		                  // wait(2500);
		       			selectNoRecords("100");

		            	String rec=resultSet2.getString("bigIntRPO");
				        System.out.println(rec);
				        //String rpostring=rpo.get(j).toString();
						String remarks="Cancelling RPO-> " + rec + " for testing";
						driver.findElement(By.linkText(rec)).click();		
						getWait(1500);
						//cancelOrder(1,remarks);
						driver.navigate().back();
						
					    getWait(3000);
					    selectNoRecords("100");
				        if(j==1)
				        {
				        	RPOString=rec;
				        }
				        else
				        {
				        	RPOString=RPOString+","+rec;
				        }
		            j=j+1;
		            }    
				 	
			
			        System.out.println(RPOString);
		}
		catch (SQLException e) 
        {
            e.printStackTrace();
        }
		finally
		{
            if (resultSet2 != null) {
                try {
                	resultSet2.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (statement1 != null) {
                try {
                	statement1.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (connection != null) 
            {
                try 
                {
                	connection.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
		}
		
		
	}
	
	public void gotoRPODetailScreenAndCancelOrder(String shopID) throws InterruptedException
	{
		
		try
		{
			String RPOString="";

		// *[@id="searchId0"]
		//int i =rpo.size();
		//System.out.println("size"+i);
		long num = Long.parseLong(shopID);
	    //System.out.println(num);
		  //SELECT DISTINCT [bigIntRPO]
				//  FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] where bigIntShoppingCartNo =3000006454 and [bigIntRPO] is not NULL

		            String selectSql2=	"SELECT DISTINCT [bigIntRPO] FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] "
            		+ "where bigintShoppingCartNo  = "+ num  +" AND [bigIntRPO] is not NULL order by [bigIntRPO] desc";
            	
		            
		             System.out.println(selectSql2);
					 connection = DriverManager.getConnection(connectionUrl);
					 statement1 = connection.createStatement();
				    
					
		            int j=1;
		            resultSet2=null;
		            resultSet2 = statement1.executeQuery(selectSql2);
		            
		            while (resultSet2.next())
		            {
		                   //wait(2500);
		       			selectNoRecords("100");

		            	String rec=resultSet2.getString("bigIntRPO");
				        System.out.println(rec);
				        
				        //String rpostring=rpo.get(j).toString();
						String remarks="Cancelling order " + rec +" for testing";
						driver.findElement(By.linkText(rec)).click();		
						getWait(1500);
						cancelOrder(1,remarks);
						driver.navigate().back();
						
					    getWait(3000);
					    selectNoRecords("100");
				        if(j==1)
				        {
				        	RPOString=rec;
				        }
				        else
				        {
				        	RPOString=RPOString+","+rec;
				        }
		            j=j+1;
		            }    
				 	
			
			        System.out.println(RPOString);
		}
		catch (SQLException e) 
        {
            e.printStackTrace();
        }
		finally
		{
            if (resultSet2 != null) {
                try {
                	resultSet2.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (statement1 != null) {
                try {
                	statement1.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (connection != null) 
            {
                try 
                {
                	connection.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
		}
		
		
		
		
	}
	
	
	public void cancelOrder(int a,String remark) throws InterruptedException
	{
		//*[@id="btnCancelOrder"]
		
		WebElement cancel = driver.findElement(By.id("btnCancelOrder"));
		cancel.click();
		if (a == 1)
		{
			WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div[1]"));
			getWait(3000);
			ok.click();
			getWait(3000);
			WebElement Remark = driver.findElement(By.xpath(".//*[@id='Remark']"));
			Remark.sendKeys(remark);
			getWait(1500);
			//*[@id="Remark"]
			//*[@id="btnUpdate"]
			WebElement cancelbtn = driver.findElement(By.xpath(".//*[@id='btnUpdate']"));
			cancelbtn.click();
			getWait(1500);
		}
	else if (a == 0)
		{
			WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div[2]"));
			getWait(3000);
			ok.click();
		}

	}
	
	
	public void gotoInplantRPODetailScreen(String RPOLIST) throws InterruptedException
	{
		try
		{
			String RPOString="";

		// *[@id="searchId0"]
		//int i =rpo.size();
		//System.out.println("size"+i);
		//long num = Long.parseLong(shopID);
	    //System.out.println(num);
		  //SELECT DISTINCT [bigIntRPO]
				//  FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] where bigIntShoppingCartNo =3000006454 and [bigIntRPO] is not NULL

		   String selectSql2="SELECT DISTINCT [bigIntRPO] FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] "
           		+ "where bigIntRPO  in ("+ RPOLIST +")";
		            
		             System.out.println(selectSql2);
					 connection = DriverManager.getConnection(connectionUrl);
					 statement1 = connection.createStatement();
				    
					
		            int j=1;
		            resultSet2=null;
		            resultSet2 = statement1.executeQuery(selectSql2);
		            
		            while (resultSet2.next())
		            {
		                   //wait(2500);

		            	String rec=resultSet2.getString("bigIntRPO");
				        System.out.println(rec);
				        //String rpostring=rpo.get(j).toString();
						String remarks="Cancelling RPO-> " + rec + " for testing";
						driver.findElement(By.linkText(rec)).click();		
						getWait(1500);
						//cancelOrder(1,remarks);
						driver.navigate().back();
						
					    getWait(3000);
					    selectNoRecords("100");
				        if(j==1)
				        {
				        	RPOString=rec;
				        }
				        else
				        {
				        	RPOString=RPOString+","+rec;
				        }
		            j=j+1;
		            }    
				 	
			
			        System.out.println(RPOString);
		}
		catch (SQLException e) 
        {
            e.printStackTrace();
        }
		finally
		{
            if (resultSet2 != null) {
                try {
                	resultSet2.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (statement1 != null) {
                try {
                	statement1.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (connection != null) 
            {
                try 
                {
                	connection.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
		}
		
		
	}
	
	public void gotoRPODetailScreenInplantAndCancelOrder(String RPOLIST) throws InterruptedException
	{
		
		try
		{
			String RPOString="";

		// *[@id="searchId0"]
		//int i =rpo.size();
		//System.out.println("size"+i);
		//long num = Long.parseLong(shopID);
	    //System.out.println(num);
		  //SELECT DISTINCT [bigIntRPO]
				//  FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] where bigIntShoppingCartNo =3000006454 and [bigIntRPO] is not NULL

		            String selectSql2=	"SELECT DISTINCT [bigIntRPO] FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] "
            		+ "where bigIntRPO  in ("+ RPOLIST  +")";
            	
		            
		             System.out.println(selectSql2);
					 connection = DriverManager.getConnection(connectionUrl);
					 statement1 = connection.createStatement();
				    
					
		            int j=1;
		            resultSet2=null;
		            resultSet2 = statement1.executeQuery(selectSql2);
		            
		            while (resultSet2.next())
		            {
		                  // wait(2500);
		            	String rec=resultSet2.getString("bigIntRPO");
				        System.out.println(rec);
				        
				        //String rpostring=rpo.get(j).toString();
						String remarks="Cancelling order " + rec +" for testing";
						driver.findElement(By.linkText(rec)).click();		
						getWait(1500);
						cancelOrder(1,remarks);
						driver.navigate().back();
						
					    getWait(3000);
					    selectNoRecords("100");
				        if(j==1)
				        {
				        	RPOString=rec;
				        }
				        else
				        {
				        	RPOString=RPOString+","+rec;
				        }
		            j=j+1;
		            }    
				 	
			
			        System.out.println(RPOString);
		}
		catch (SQLException e) 
        {
            e.printStackTrace();
        }
		finally
		{
            if (resultSet2 != null) {
                try {
                	resultSet2.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (statement1 != null) {
                try {
                	statement1.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (connection != null) 
            {
                try 
                {
                	connection.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
		}
		
		
		
		
	}
	
}
