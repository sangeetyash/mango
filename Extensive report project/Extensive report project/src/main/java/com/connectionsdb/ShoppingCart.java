package com.connectionsdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.ExitCode;

import cucumber.api.DataTable;
public class ShoppingCart {

	WebDriver driver;
	String connectionUrl =
            "jdbc:sqlserver://13.71.7.63:1473;"
            + "database=r-tracDB;"
            + "user=Sangeet;"
            + "password=S@ngeet#2020;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "loginTimeout=30;";

    ResultSet resultSet, resultSet1, resultSet2 = null;
    Connection connection;
    Statement statement,statement1;
	public ShoppingCart(WebDriver driver) 
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void connectionTest1()
	{
		try 
        {
			connection = DriverManager.getConnection(connectionUrl);
            statement = connection.createStatement();
            String selectSql1 = "SELECT TOP (20) * from [r-tracDB].[dbo].[ExlPrice] r";
            resultSet = statement.executeQuery(selectSql1);
            System.out.println("Connection Establish Open");
            connection.close();
            System.out.println("Connection Establish Close");
        }
        
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
	
	public void cartCheckWithDBSCart(String c,DataTable dtCartS) throws SQLException
	{
		try  
        {

			long num = Long.parseLong(c);
		    System.out.println(num);
		    List<Map<String, String>> list = dtCartS.asMaps(String.class, String.class);
		    int col=list.size();
		    //int row=list.get(0).size();

	    	System.out.println("col" + col);
	    	for(int k=0; k<list.size(); k++)
				{
	    			
				    		System.out.println(list.get(k).get("Catalog"));
				    		System.out.println(list.get(k).get("Qty"));
				    		
				    		
					    	String catItem=(list.get(k).get("Catalog"));
					    	System.out.println("Catalog item" + catItem);
					    	String corqty=(list.get(k).get("Qty"));
					    	System.out.println("Customer order qty" + corqty);
					 // Create SELECT SQL statement.
			            
			            String selectSql2=
			            		"SELECT * FROM [MANGODB].[dbo].[tbl_Cust_Mango_ShoppingCart] "
			            		+ "where bigintShoppingCartNo  = " + num+ 
			            		" AND bigIntOriginalTotal_Size_Qty=" +corqty+ 
			            		" AND varItemCode=" + "'" +catItem + "'" ;
			            
						 connection = DriverManager.getConnection(connectionUrl);
						 Statement statement1 = connection.createStatement();
					    
			             
			             	
			          
			            int j=1;
			            resultSet2=null;
			            resultSet2 = statement1.executeQuery(selectSql2);
			
						            while (resultSet2.next())
						            {
						            	

						                System.out.println
						                (
						                		" | "	+ j	
						                		+ " | " + resultSet2.getString(1)
						                		+ " | " + resultSet2.getString(2)
						                		+ " | " + resultSet2.getString(4)
						                		+ " | " + resultSet2.getString(5)
						                		+ " | " + resultSet2.getString(6)
						                		+ " | "
						                );
						                
						                //String status2=resultSet1.getString("intStatus");
								    	System.out.println("tbl_Cust_Mango_ShoppingCart recorde status" + resultSet2.getString(5));

								    	//resultSet2.getString("intStatus")
								    	if((resultSet2.getString(5)).equalsIgnoreCase("4"))
								             {
								            	 System.out.println("tbl_Cust_Mango_ShoppingCart table check Pass");
								             }
								             else
								             {
								            	 System.out.println("tbl_Cust_Mango_ShoppingCart table check Fail");
								             }
						                j=j+1;
						            }
			            
			           // resultSet2.close();
			            //statement.close();
					}

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
