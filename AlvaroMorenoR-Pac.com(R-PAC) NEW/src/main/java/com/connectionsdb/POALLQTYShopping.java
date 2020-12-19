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

import com.project.managers.PageObjectManager;

import cucumber.api.DataTable;
import pageObjects.CheckOut;

public class POALLQTYShopping {

	WebDriver driver;
	PageObjectManager pageObjectManager;
	CheckOut checkOut;
	
	String connectionUrl =
            "jdbc:sqlserver://10.0.0.4:1473;"
            + "database=r-tracDB;"
            + "user=Sangeet;"
            + "password=S@ngeet#2020;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "loginTimeout=30;";

    ResultSet resultSet, resultSet1, resultSet2, resultSet3,resultSet4,resultSet5,resultSet6,resultSet7= null;
    Connection connection;
    Statement statement,statement1;
	public POALLQTYShopping(WebDriver driver) 
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
	public void allpoCheckWithDBParse(String a) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(a);
		    //System.out.println(num);
	
					 // Create SELECT SQL statement.
			/*
			 * String selectSql = "	SELECT *" +
			 * "	FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" +
			 * "	where bigintShoppingCartNo = "+ num ;
			 */
			            
			            String selectSql = 
			            		"SELECT [bigintId],[bigIntRPO],[varVendorId]" + 
			            		",[bigIntShoppingCartNo],[intStatus],[varPONumber]" + 
			            		",[varEAN],[intQuantity],[intPOLineNo],[bigintOriginalId]" + 
			            		",[bigintOrderQty],[Brand],[Qty],[varItemCode],*" + 
			            		"FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" + 
			            		"where bigintShoppingCartNo = "+ num;
			            
			             System.out.println("SQL Query="+selectSql+"\n");
						 connection = DriverManager.getConnection(connectionUrl);
						 Statement statement = connection.createStatement();
					     resultSet1= null;
					   
			             resultSet1 = statement.executeQuery(selectSql);
			             
			             	
			             int i=1;
			            // Print results from select statement
			            
						/*
						 * while (resultSet.next()) { System.out.println ( " | " + i + " | " +
						 * resultSet.getString(1) + " | " + resultSet.getString(2) + " | " +
						 * resultSet.getString(3) + " | " + resultSet.getString(4) + " | " +
						 * resultSet.getString(5) + " | " + resultSet.getString(6) + " | " +
						 * resultSet.getString(7) + " | " + resultSet.getString(8) + " | " +
						 * resultSet.getString(9) + " | " + resultSet.getString(10) + " | " +
						 * resultSet.getString(11) + " | " + resultSet.getString(12) + " | " ); i=i+1; }
						 */
			            i=1;
			            
					            while (resultSet1.next())
					            {
					            	System.out.println
					            	(" | No."	 	
							                + " | " + "bigintShoppingCartNo"
							                + " | " + "bigintOrderQty"
							                + " | " + "intStatus"
							                + " | " + "bigIntRPO"
							                + " | " + "varItemCode"
							                + " | ");
					                System.out.println
					                (
					                  " | "	+ i	
						                + " | " + resultSet1.getString("bigintShoppingCartNo")
						                + " | " + resultSet1.getString("bigintOrderQty")
						                + " | " + resultSet1.getString("intStatus")
						                + " | " + resultSet1.getString("bigIntRPO")
						                + " | " + resultSet1.getString("varItemCode")
						                + " | "
					                );
					                
					                String status=resultSet1.getString("intStatus");
							    	//System.out.println("tbl_Cust_Mango_Parser recorde status" + status);

							             if (status.equalsIgnoreCase("3"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass\n");
							             }
							             else if(status.equalsIgnoreCase("4"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass\n");
							             }
							             else
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Fail\n");
							             }
					                i=i+1;
					            }
					            
			            //resultSet1.close();
			            
			            
			            
			            //statement.close();
					

        }
		
        
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
		finally
		{
            if (resultSet1 != null) {
                try {
                	resultSet1.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (statement != null) {
                try {
                	statement.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (connection != null) 
            {
                try 
                {
                	connection.close();
                } catch (SQLException e) 
                { e.printStackTrace();}
            }
		}
		

    }
	
	public void allpoWithDBSCart(String c) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(c);
		    //System.out.println(num);
		    

		    	
					 // Create SELECT SQL statement.
			
			            String selectSql2=
			            		"SELECT [bigIntId],[bigIntShoppingCartNo] ,[varPOnumber] "
			            		+ ",[varItemCode] ,[varVendorId],[bigintQuantity] "
			            		+ ",[bigintOrderQty] ,[intStatus] ,[bigintLeadTime],* "
			            		+ "FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_ShoppingCart] "
			            		+ "where bigintShoppingCartNo  = "+ num  ;
			             System.out.println("SQL Query="+selectSql2+"\n");

						 connection = DriverManager.getConnection(connectionUrl);
						 Statement statement1 = connection.createStatement();
					    
			             
			             	
						 int j=1;
				            resultSet2=null;
				            resultSet2 = statement1.executeQuery(selectSql2);
				
							            while (resultSet2.next())
							            {
							            	

							            	System.out.println
							            	(" | No."	 	
									                + " | " + "bigintShoppingCartNo"
									                + " | "	+ "bigintQuantity"
									                + " | " + "intStatus"
									                + " | " + "varItemCode"
									                + " | ");
							                System.out.println
							                (
							                		" | "	+ j	
							                		+ " | " + resultSet2.getString("bigintShoppingCartNo")
							                		+ " | " + resultSet2.getString("bigintQuantity")
							                		+ " | " + resultSet2.getString("intStatus")
							                		+ " | " + resultSet2.getString("varItemCode")
							                		+ " | "
							                );
							                
							                //String status2=resultSet1.getString("intStatus");
									    	//System.out.println("tbl_Cust_Mango_ShoppingCart recorde status" + resultSet2.getString(5));

									    	//resultSet2.getString("intStatus")
									    	if((resultSet2.getString("intStatus")	).equalsIgnoreCase("4"))
									             {
									            	 System.out.println("tbl_Cust_AlvaroMoreno_ShoppingCart table check Pass\n");
									             }
									             else
									             {
									            	 System.out.println("tbl_Cust_AlvaroMoreno_ShoppingCart table check Fail\n");
									             }
							                j=j+1;
							            }
				            
				           // resultSet2.close();
				            //statement.close();
					

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
	
	
	public void poCartCheckWithDBParse(String a,DataTable dtCart) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(a);
		    //System.out.println(num);
		    List<Map<String, String>> list = dtCart.asMaps(String.class, String.class);
		    int col=list.size();
		    //int row=list.get(0).size();

	    	//System.out.println("col" + col);
	    	for(int k=0; k<list.size(); k++)
				{
				    		//System.out.println(list.get(k).get("EAN"));
				    		//System.out.println(list.get(k).get("Qty"));
				    		
				    		
					    	String catItem=(list.get(k).get("EAN"));
					    	//System.out.println("EAN" + catItem);
					    	//String corqty=(list.get(k).get("Qty"));
					    	//System.out.println("Customer order qty" + corqty);
					 // Create SELECT SQL statement.
			            String selectSql = 
			            		"SELECT [bigIntRPO],[varPONumber][varEAN],[intQuantity],"
			            		+ "[bigintOrderQty],,[bigIntShoppingCartNo],[intStatus],"
			            		+ "[varVendorId],[varItemCode],,[intPOLineNo],[bigintOriginalId],"
			            		+ "[Brand],[Qty],*" + 
			            		"FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" + 
			            		"where bigintShoppingCartNo = "+ num + "AND varEAN=" +"'"+catItem +"'";
			             System.out.println("SQL Query="+selectSql+"\n");

			            //String selectSql = 
			            //		"	SELECT bigintOriginalQty,bigintOrdQty,intStatus,bigIntRPO ,varItemCode,*" + 
			            //		"	FROM [MANGODB].[dbo].[tbl_Cust_Mango_Parser]" + 
			            //		"	where bigintShoppingCartNo = "+ num + "AND bigintOrdQty= "+corqty +"AND varEAN=" +"'"+catItem +"'";
			            
			            
						 connection = DriverManager.getConnection(connectionUrl);
						 Statement statement = connection.createStatement();
					     resultSet1= null;
					   
			             resultSet1 = statement.executeQuery(selectSql);
			             
			             	
			             int i=1;
			            // Print results from select statement
			            
						/*
						 * while (resultSet.next()) { System.out.println ( " | " + i + " | " +
						 * resultSet.getString(1) + " | " + resultSet.getString(2) + " | " +
						 * resultSet.getString(3) + " | " + resultSet.getString(4) + " | " +
						 * resultSet.getString(5) + " | " + resultSet.getString(6) + " | " +
						 * resultSet.getString(7) + " | " + resultSet.getString(8) + " | " +
						 * resultSet.getString(9) + " | " + resultSet.getString(10) + " | " +
						 * resultSet.getString(11) + " | " + resultSet.getString(12) + " | " ); i=i+1; }
						 */
			            i=1;
			            
					            while (resultSet1.next())
					            {

					            	System.out.println
					            	(" | No."	 	
							                + " | " + "bigintShoppingCartNo"
							                + " | " + "bigintOrderQty"
							                + " | " + "intStatus"
							                + " | " + "bigIntRPO"
							                + " | " + "varItemCode"
							                + " | ");
					                System.out.println
					                (
					                  " | "	+ i	
						                + " | " + resultSet1.getString("bigintShoppingCartNo")
						                + " | " + resultSet1.getString("bigintOrderQty")
						                + " | " + resultSet1.getString("intStatus")
						                + " | " + resultSet1.getString("bigIntRPO")
						                + " | " + resultSet1.getString("varItemCode")
						                + " | "
					                );
					                
					                
					                String status=resultSet1.getString("intStatus");
							    	//System.out.println("tbl_Cust_Mango_Parser recorde status" + status);

							             if (status.equalsIgnoreCase("3"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass\n");
							             }
							             else if(status.equalsIgnoreCase("4"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass\n");
							             }
							             else
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Fail\n");
							             }
					                i=i+1;
					            }
					            
			            //resultSet1.close();
			            
			            
			            
			            //statement.close();
					}

        }
		
        
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
		finally
		{
            if (resultSet1 != null) {
                try {
                	resultSet1.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (statement != null) {
                try {
                	statement.close();
                } 
                catch (SQLException e) { e.printStackTrace();}
            }
            if (connection != null) 
            {
                try 
                {
                	connection.close();
                } catch (SQLException e) 
                { e.printStackTrace();}
            }
		}
		

    }
	
	public void poCartCheckWithDBShoppingCart(String c,DataTable dtCartS) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(c);
		    //System.out.println(num);
		    List<Map<String, String>> list = dtCartS.asMaps(String.class, String.class);
		    int col=list.size();
		    //int row=list.get(0).size();

	    	//System.out.println("col" + col);
	    	for(int k=0; k<list.size(); k++)
				{
	    		//System.out.println(list.get(k).get("EAN"));
	    		//System.out.println(list.get(k).get("qty"));
				    		
				    		
					    	String catItem=(list.get(k).get("EAN"));
					    	//System.out.println("EAN" + catItem);
					    	String corqty=(list.get(k).get("qty"));
					    	//System.out.println("Customer order qty" + corqty);
					 // Create SELECT SQL statement.
			            
			            String selectSql2=
			            		"SELECT * FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_ShoppingCart] "
			            		+ "where bigintShoppingCartNo  = " + num+ 
			            		" AND varItemCode=" + "'" +catItem + "'" ;
			             System.out.println("SQL Query="+selectSql2+"\n");

						 connection = DriverManager.getConnection(connectionUrl);
						 Statement statement1 = connection.createStatement();
					    
			             
			             	
			          
			            int j=1;
			            resultSet2=null;
			            resultSet2 = statement1.executeQuery(selectSql2);
			
						            while (resultSet2.next())
						            {
						            	
					/*
					 * System.out.println (" | N" + " | " + "bigintShoppingCartNo" + " | " +
					 * "bigintOriginalQty" + " | " + "bigintOrdQty" + " | " + "intStatus" + " | " +
					 * "bigIntRPO" + " | " + "varItemCode" + " | ");
					 */
						            	System.out.println
						            	(" | No."	 	
								                + " | " + "bigintShoppingCartNo"
								                + " | "	+ "bigintQuantity"
								                + " | " + "intStatus"
								                + " | " + "varItemCode"
								                + " | ");
						                System.out.println
						                (
						                		" | "	+ j	
						                		+ " | " + resultSet2.getString("bigintShoppingCartNo")
						                		+ " | " + resultSet2.getString("bigintQuantity")
						                		+ " | " + resultSet2.getString("intStatus")
						                		+ " | " + resultSet2.getString("varItemCode")
						                		+ " | "
						                );
						                
						                
						                //String status2=resultSet1.getString("intStatus");
								    	//System.out.println("tbl_Cust_Mango_ShoppingCart recorde status" + resultSet2.getString(5));

								    	//resultSet2.getString("intStatus")
								    	if((resultSet2.getString(5)).equalsIgnoreCase("4"))
								             {
								            	 System.out.println("tbl_Cust_AlvaroMoreno_ShoppingCart table check Pass\n");
								             }
								             else
								             {
								            	 System.out.println("tbl_Cust_AlvaroMoreno_ShoppingCart table check Fail\n");
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
