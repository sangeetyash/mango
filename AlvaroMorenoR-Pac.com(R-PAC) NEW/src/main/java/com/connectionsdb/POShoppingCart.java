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

public class POShoppingCart {
	WebDriver driver;
	PageObjectManager pageObjectManager;
	CheckOut checkOut;
	
	String connectionUrl =
            "jdbc:sqlserver://13.71.7.63:1473;"
            + "database=r-tracDB;"
            + "user=Sangeet;"
            + "password=S@ngeet#2020;"
            + "encrypt=true;"
            + "trustServerCertificate=true;"
            + "loginTimeout=30;";

    ResultSet resultSet, resultSet1, resultSet2, resultSet3,resultSet4,resultSet5,resultSet6,resultSet7= null;
    Connection connection;
    Statement statement,statement1;
	public POShoppingCart(WebDriver driver) 
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
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Connection Establish Close");
        }
        
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
	

	
	public void poCheckWithDBParse(String a,DataTable dtrpo) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(a);
		    System.out.println(num);
		    List<List<String>> rows = dtrpo.asLists(String.class);
		    int len=rows.get(0).size();
	    	System.out.println("List Size" + len);

		    for(int aa=0 ; aa < len; aa++)
		    {
		    	System.out.println("aa=" + aa);

		    	String EANC=(rows.get(0).get(aa));
		    	System.out.println("EANC=" + EANC);
					 // Create SELECT SQL statement.
			            String selectSql = 
			            		"	SELECT bigintOriginalQty,bigintOrdQty,intStatus,bigIntRPO ,varItemCode,*" + 
			            		"	FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" + 
			            		"	where bigintShoppingCartNo = "+ num 
			            		+ "AND varEAN=" +"'"+EANC +"'";
			            
			            	System.out.println("SQL Query = " + selectSql);
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
							                + " | "	+ "bigintOriginalQty"
							                + " | " + "bigintOrdQty"
							                + " | " + "intStatus"
							                + " | " + "bigIntRPO"
							                + " | " + "varItemCode"
							                + " | ");
					            	
					                System.out.println
					                (
					                  " | "	+ i	
						                + " | " + resultSet1.getString("bigintShoppingCartNo")
						                + " | "	+ resultSet1.getString("bigintOriginalQty")
						                + " | " + resultSet1.getString("bigintOrdQty")
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
	
	public void rpoWithDBSCart(String c,DataTable dtrpo) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(c);
		    System.out.println(num);
		    List<List<String>> rows = dtrpo.asLists(String.class);
		    int len=rows.get(0).size();
	    	//System.out.println("len" + len);

		    for(int aa=0 ; aa < len; aa++)
		    {
		    	String EANC=(rows.get(0).get(aa));
		    	
					 // Create SELECT SQL statement.
			            
			            String selectSql2=
			            		"SELECT * FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_Mango_ShoppingCart] "
			            		+ "where bigintShoppingCartNo  = "+ num 
			            		+ "AND varEAN=" +"'"+EANC +"'" ;
			            
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
