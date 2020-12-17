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

import cucumber.api.DataTable;

public class SqlConnection 
{
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
	public SqlConnection(WebDriver driver) 
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void connectionTest()
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
	
	public void justCheck(String b)
	{
		try  
        {
			Connection connection = DriverManager.getConnection(connectionUrl);
			Statement statement = connection.createStatement();
		    ResultSet resultSet = null;
		    long num = Long.parseLong(b);
		    //System.out.println(num);
            // Create and execute a SELECT SQL statement.
			/*
			 * String selectSql =
			 * "	SELECT bigintOriginalQty,bigintOrdQty,intStatus,bigIntRPO ,varItemCode,*"
			 * + "	FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" +
			 * "	where bigintShoppingCartNo = "+ num;
			 */
            
            String selectSql = 
            		"	SELECT [bigintId],[bigIntRPO],[varVendorId]" + 
            		"		  ,[bigIntShoppingCartNo],[intStatus],[varPONumber]" + 
            		"		  ,[varEAN],[intQuantity],[intPOLineNo],[bigintOriginalId]" + 
            		"		  ,[bigintOrderQty],[Brand],[Qty],[varItemCode],*" + 
            		"	FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" + 
            		"	where bigintShoppingCartNo = "+ num;
			/*
			 * SELECT TOP (1000) [bigintId],[bigIntRPO]
			 * ,[bigIntShoppingCartNo],[intStatus],[varPONumber],[varVendorId],[varItemCode]
			 * ,[varEAN],[intQuantity],[intPOLineNo],[bigintOriginalId]
			 * ,[bigintOrderQty],[Brand],[Qty] ,* FROM
			 * [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser] where
			 * bigIntShoppingCartNo=3000007113
			 */
             resultSet = statement.executeQuery(selectSql);
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
            
            while (resultSet.next())
            {
            	
            	System.out.println
            	(			" | N"	 	
		                + " | " + "bigintShoppingCartNo"
		                + " | " + "bigintOrdQty"
		                + " | " + "intStatus"
		                + " | " + "bigIntRPO"
		                + " | " + "varItemCode"
		                + " | ");
                System.out.println
                (
                  " | "	+ i	
                + " | "	+ resultSet.getString("bigintShoppingCartNo")
                + " | " + resultSet.getString("bigintOrderQty")
                + " | " + resultSet.getString("intStatus")
                + " | " + resultSet.getString("bigIntRPO")
                + " | " + resultSet.getString("varItemCode")
                + " | "
                );
                i=i+1;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
		
	}
	
	
	public void cartCheckWithDBParse(String a,DataTable dtCart) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(a);
		    System.out.println(num);
		    List<Map<String, String>> list = dtCart.asMaps(String.class, String.class);
		    int col=list.size();
		    //int row=list.get(0).size();

		    //System.out.println("list size=" + col);
	    	for(int k=0; k<list.size(); k++)
				{
	    		//System.out.println(list.get(k).get("Catalog"));
	    		//System.out.println(list.get(k).get("Qty"));
				    		
	    		//System.out.println("k="+k);
					    	String catItem=(list.get(k).get("Catalog"));
					    	//System.out.println("Catalog item" + catItem);
					    	String corqty=(list.get(k).get("qty"));
					    	//System.out.println("Customer order qty" + corqty);
					 // Create SELECT SQL statement.
					    	
					    	String selectSql= 
				            		"	SELECT [bigintId],[bigIntRPO],[varVendorId]" + 
				            		"		  ,[bigIntShoppingCartNo],[intStatus],[varPONumber]" + 
				            		"		  ,[varEAN],[intQuantity],[intPOLineNo],[bigintOriginalId]" + 
				            		"		  ,[bigintOrderQty],[Brand],[Qty],[varItemCode],*" + 
				            		"	FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" + 
				            		"	where bigintShoppingCartNo = "+ num
				            		+ " AND intQuantity= "+corqty
				            		+ " AND varItemCode=" +"'"+catItem +"'";
				/*
				 * String selectSql =
				 * "	SELECT bigintOriginalQty,bigintOrdQty,intStatus,bigIntRPO ,varItemCode,*"
				 * + "	FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" +
				 * "	where bigintShoppingCartNo = "+ num + "AND bigintOrdQty= "+corqty
				 * +"AND varItemCode=" +"'"+catItem +"'";
				 */
				    	System.out.println(selectSql);

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
					            	(" | N"	 	
							                + " | " + "bigintShoppingCartNo"
							                + " | " + "intQuantity"
							                + " | " + "intStatus"
							                + " | " + "bigIntRPO"
							                + " | " + "varItemCode"
							                + " | ");
					                System.out.println
					                (
					                  " | "	+ i	
						                + " | " + resultSet1.getString("bigintShoppingCartNo")
						                + " | "	+ resultSet1.getString("intQuantity")
						                + " | " + resultSet1.getString("intStatus")
						                + " | " + resultSet1.getString("bigIntRPO")
						                + " | " + resultSet1.getString("varItemCode")
						                + " | "
					                );
					                
					                String status=resultSet1.getString("intStatus");
					                //System.out.println("tbl_Cust_AlvaroMoreno_Parser recorde status" + status);

							             if (status.equalsIgnoreCase("3"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass");
							             }
							             else if(status.equalsIgnoreCase("4"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass");
							             }
							             else
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Fail");
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
	
	public void cartCheckWithDBSCart(String c,DataTable dtCartS) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(c);
		    System.out.println(num);
		    List<Map<String, String>> list = dtCartS.asMaps(String.class, String.class);
		    int col=list.size();
		    //int row=list.get(0).size();

		    //System.out.println("col" + col);
	    	for(int k=0; k<list.size(); k++)
				{
				    		//System.out.println(list.get(k).get("Catalog"));
				    		//System.out.println(list.get(k).get("Qty"));
				    		
				    		
					    	String catItem=(list.get(k).get("Catalog"));
					    	//System.out.println("Catalog item" + catItem);
					    	String corqty=(list.get(k).get("qty"));
					    	//System.out.println("Customer order qty" + corqty);
					 // Create SELECT SQL statement.
			            
			            String selectSql2=
			            		"SELECT * FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_ShoppingCart] "
			            		+ "where bigintShoppingCartNo  = "+ num
			            		+" AND varItemCode=" +"'"+catItem +"'" 
			            		+" AND bigintQuantity="+corqty;
				    	System.out.println(selectSql2);

						 connection = DriverManager.getConnection(connectionUrl);
						 Statement statement1 = connection.createStatement();
					    
			       
			            int j=1;
			            resultSet2=null;
			            resultSet2 = statement1.executeQuery(selectSql2);
			
						            while (resultSet2.next())
						            {
						            	
						            	System.out.println
						            	(" | N"	 	
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
						                //System.out.println("tbl_Cust_Mango_ShoppingCart recorde status" + resultSet1.getString("intStatus"));

						                
								    	if((resultSet1.getString("intStatus")).equalsIgnoreCase("4"))
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
	
	
	
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args)
    {
        
    }   
        
}



/*
 * public class SqlConnection {
 * 
 * private java.sql.Connection con = null; private final String url =
 * "jdbc:microsoft:sqlserver://"; private final String serverName =
 * "13.71.7.63"; private final String portNumber = "1473"; private final String
 * databaseName = "r-tracDB"; private final String userName = "Sangeet"; private
 * final String password = "S@ngeet#2020";
 * 
 * // Constructor public SqlConnection() { }
 * 
 * private String getConnectionUrl() { return url + serverName + ":" +
 * portNumber + ";databaseName=" + databaseName ; }
 * 
 * private java.sql.Connection getConnection() { try {
 * Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); con =
 * java.sql.DriverManager.getConnection(getConnectionUrl(), userName, password);
 * if (con != null) { System.out.println("Connection Successful!"); } } catch
 * (Exception e) { e.printStackTrace();
 * System.out.println("Error Trace in getConnection() : " + e.getMessage()); }
 * return con; }
 * 
 * public void displayDbProperties() { java.sql.DatabaseMetaData dm = null;
 * java.sql.ResultSet rs = null; try { con = this.getConnection(); if (con !=
 * null) { dm = con.getMetaData(); System.out.println("Driver Information");
 * System.out.println("\tDriver Name: " + dm.getDriverName());
 * System.out.println("\tDriver Version: " + dm.getDriverVersion());
 * System.out.println("\nDatabase Information ");
 * System.out.println("\tDatabase Name: " + dm.getDatabaseProductName());
 * System.out.println("\tDatabase Version: " + dm.getDatabaseProductVersion());
 * System.out.println("Avalilable Catalogs "); rs = dm.getCatalogs(); while
 * (rs.next()) { System.out.println("\tcatalog: " + rs.getString(1)); }
 * rs.close(); rs = null; closeConnection(); } else {
 * System.out.println("Error: No active Connection"); } } catch (Exception e) {
 * e.printStackTrace(); } dm = null; }
 * 
 * private void closeConnection() { try { if (con != null) { con.close(); } con
 * = null; } catch (Exception e) { e.printStackTrace(); } }
 * 
 * public static void main(String[] args) throws Exception { SqlConnection
 * myDbTest = new SqlConnection(); myDbTest.displayDbProperties(); } }
 */