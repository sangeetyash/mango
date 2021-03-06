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

public class POALLQTYCheck {
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
	public POALLQTYCheck(WebDriver driver) 
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
	
	public void allrpoCheckWithDBParse(String a) throws SQLException
	{
		
		long num = Long.parseLong(a);

		try  
        {
			
		    //System.out.println(num);
	
					 // Create SELECT SQL statement.
			            String selectSql = "SELECT * " + 
					            		"FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" + 
			            		        "WHERE bigintShoppingCartNo = "+ num ;
			            
			            System.out.println("SQL Query="+selectSql);
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

							             if (status.equalsIgnoreCase("6"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass\n");
							             }
							             else if(status.equalsIgnoreCase("8"))
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
		
		try {
			String selectSql2=
            		"SELECT * FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_ShoppingCart] "
            		+ "where bigintShoppingCartNo  = "+ num  ;
            
             System.out.println("SQL Query = " + selectSql2);
			 connection = DriverManager.getConnection(connectionUrl);
			 Statement statement1 = connection.createStatement();
		    
             
             	
          
            //int j=1;
            resultSet2=null;
            resultSet2 = statement1.executeQuery(selectSql2);
            if (resultSet2.next()==false)
            {
            	System.out.println("Cart has been cleared");
            }
            else
            {
            	System.out.println("Something Went, Cart has not been cleared");
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
                } catch (SQLException e) 
                { e.printStackTrace();}
            }
		}
		
    }
	
	public void rpoCheckWithDBParse(String a,DataTable dtrpo) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(a);
		   // System.out.println(num);
		    List<Map<String, String>> list = dtrpo.asMaps(String.class, String.class);
		    int col=list.size();
		    //int row=list.get(0).size();

	    	//System.out.println("col" + col);
	    	for(int k=0; k<list.size(); k++)
				{
				    		//System.out.println(list.get(k).get("EAN"));
				    		//System.out.println(list.get(k).get("qty"));
				    		
				    		
					    	String catItem=(list.get(k).get("EAN"));
					    	//System.out.println("EAN"+ catItem);
					    	String corqty=(list.get(k).get("qty"));
					    	//System.out.println("Customer order qty" + corqty);
					 // Create SELECT SQL statement.
					    	
					    	
			            String selectSql = 
			            		"	SELECT [bigIntRPO],[varPONumber][varEAN],[intQuantity],[bigintOrderQty],"
					            		+ "[bigIntShoppingCartNo],[intStatus],[varVendorId],[varItemCode],"
					            		+ "[intPOLineNo],[bigintOriginalId],[Brand],[Qty],*" + 
					            		"[AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" + 
					            		"where bigintShoppingCartNo = "+ num +"AND varEAN=" +"'"+catItem +"'";
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

							             if (status.equalsIgnoreCase("6"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass\n");
							             }
							             else if(status.equalsIgnoreCase("8"))
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
	
	public void rpoWithDBSCart(String c,DataTable dtrpo) throws SQLException
	{
		try  
        {
			
			long num = Long.parseLong(c);
		    //System.out.println(num);
		    List<Map<String, String>> list = dtrpo.asMaps(String.class, String.class);
		    int col=list.size();
		    //int row=list.get(0).size();

	    	//System.out.println("col" + col);
	    	for(int k=0; k<list.size(); k++)
				{
			    		//System.out.println(list.get(k).get("EAN"));
			    		//System.out.println(list.get(k).get("qty"));
			    		
			    		
				    	String catItem=(list.get(k).get("EAN"));
				    	//System.out.println("EAN"+ catItem);
				    	String corqty=(list.get(k).get("qty"));
				    	//System.out.println("Customer order qty" + corqty);
					 // Create SELECT SQL statement.
			            
			            String selectSql2=
			            		"SELECT * [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_ShoppingCart] "
			            		+ "where bigintShoppingCartNo  = "+ num+"AND varEAN=" +"'"+catItem +"'" ;
			            
			             System.out.println("SQL Query="+selectSql2+"\n");
			            //String selectSql2=
			            //		"SELECT * FROM [MANGODB].[dbo].[tbl_Cust_Mango_ShoppingCart] "
			            //		+ "where bigintShoppingCartNo  = "+ num+"AND varEAN=" +"'"+catItem +"'" +"AND bigIntOriginalTotal_Size_Qty="+corqty;
			            
						 connection = DriverManager.getConnection(connectionUrl);
						 Statement statement1 = connection.createStatement();
					    
			             
			             	
			          
			            //int j=1;
			            resultSet2=null;
			            resultSet2 = statement1.executeQuery(selectSql2);
			            if (resultSet2.next()==false)
			            {
			            	System.out.println("Cart has been clear\n");
			            }
			            else
			            {
			            	break;
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
	
	
	public void checkRPACTable(List<String> newList)
	{
		List<String> nList= newList;
		int i =newList.size();
		//System.out.println("size"+i);
        String string = String.join(", ", newList); 
        //System.out.println(string);
		for (int v = 0;v< i; v++)
		{
			//System.out.println(newList.get(v).toString());
		}
		//String a="select * from [r-tracDB].[dbo].[tblOrder] where bigIntRPO in ("+string+")";
		//String b="select * from [r-tracDB].[dbo].[tblOrderDetails] where bigIntRPO in ("+string+")";
		//String c="select * from [r-tracDB].[dbo].[tblOrderSummary] where bigIntRPO in ("+string+")";
		//String d="select * from [r-tracDB].[dbo].[tblOrderAddress] where bigIntRPO in ("+string+")";
		
		 
		 
		/*
		 * try {
		 * 
		 * 
		 * 
		 * // Create SELECT SQL statement.
		 * 
		 * 
		 * connection = DriverManager.getConnection(connectionUrl); Statement statement1
		 * = connection.createStatement();
		 * 
		 * resultSet7 = statement1.executeQuery(a); resultSet6=
		 * statement1.executeQuery(b); resultSet5= statement1.executeQuery(c);
		 * resultSet4= statement1.executeQuery(d);
		 * 
		 * if(resultSet7.next()) {
		 * System.out.println("[r-tracDB].[dbo].[tblOrder] table updated successfully."
		 * ); } else { System.out.
		 * println("[r-tracDB].[dbo].[tblOrder] table updated unsuccessfully."); }
		 * if(resultSet6.next()) {
		 * System.out.println("[r-tracDB].[dbo].[tblOrder] table updated successfully."
		 * ); } else { System.out.
		 * println("[r-tracDB].[dbo].[tblOrder] table updated unsuccessfully."); }
		 * 
		 * if(resultSet5.next()) { System.out.
		 * println("[r-tracDB].[dbo].[tblOrderSummary] table updated successfully."); }
		 * else { System.out.
		 * println("[r-tracDB].[dbo].[tblOrderSummary] table updated unsuccessfully.");
		 * } if(resultSet4.next()) {
		 * System.out.println("[dbo].[tblOrderAddress] table updated successfully."); }
		 * else {
		 * System.out.println("[dbo].[tblOrderAddress] table updated unsuccessfully.");
		 * } }
		 * 
		 * 
		 * catch (SQLException e) { e.printStackTrace(); } finally { if (resultSet7 !=
		 * null) { try { resultSet7.close(); } catch (SQLException e) {
		 * e.printStackTrace();} } if (resultSet6 != null) { try { resultSet6.close(); }
		 * catch (SQLException e) { e.printStackTrace();} } if (resultSet5 != null) {
		 * try { resultSet5.close(); } catch (SQLException e) { e.printStackTrace();} }
		 * if (resultSet4 != null) { try { resultSet4.close(); } catch (SQLException e)
		 * { e.printStackTrace();} } if (statement1 != null) { try { statement1.close();
		 * } catch (SQLException e) { e.printStackTrace();} } if (connection != null) {
		 * try { connection.close(); } catch (SQLException e) { e.printStackTrace();} }
		 * }
		 */
		  checkRPACTabletblOrder(nList);
		  checkRPACTabletblOrderDetails(nList);
		  checkRPACTabletblOrderSummary(nList);
	}
	public void checkRPACTabletblOrderSummary(List<String> newList)
	{
	
		int i =newList.size();
		//System.out.println("size"+i);
        String string = String.join(", ", newList); 
        //System.out.println(string);
		for (int v = 0;v< i; v++)
		{
			//System.out.println(newList.get(v).toString());
		}
		String c="select * from [r-tracDB].[dbo].[tblOrderSummary] where bigIntRPO in ("+string+")";
		
        System.out.println("SQL Query="+c);

		 
		
		  try {
		  
		  
		  
				  // Create SELECT SQL statement.
				  
				  
				  connection = DriverManager.getConnection(connectionUrl); 
				  Statement statement1= connection.createStatement();
				  
				  resultSet6 = statement1.executeQuery(c); 
				  
				  if(resultSet6.next()) 
				  {
				  System.out.println("[r-tracDB].[dbo].[tblOrderSummary] table updated successfully.\n" ); 
				  }
				  else 
				  { 
					  System.out.println("[r-tracDB].[dbo].[tblOrderSummary] table updated unsuccessfully.\n"); 
				  }
		   
		  }
		  
		  catch (SQLException e) 
		  { 
			  e.printStackTrace();
		   } 
		  finally 
		  {
			  if (resultSet5 !=null) 
			  { 
				  try { resultSet5.close(); } catch (SQLException e) {
		  e.printStackTrace();} 
				  } 
			  if (statement1 != null) 
			  { try { statement1.close();
		  } catch (SQLException e) { e.printStackTrace();} } 
			  if (connection != null) {
		  try { connection.close(); } catch (SQLException e) { e.printStackTrace();} }
		  }
		 

	}
	
	public void checkRPACTabletblOrderDetails(List<String> newList)
	{
		
		int i =newList.size();
		//System.out.println("size"+i);
        String string = String.join(", ", newList); 
        //System.out.println(string);
		for (int v = 0;v< i; v++)
		{
			//System.out.println(newList.get(v).toString());
		}
		String b="select * from [r-tracDB].[dbo].[tblOrderDetails] where bigIntRPO in ("+string+")";
		
        System.out.println("SQL Query="+b);

		
		  try {
		  
		  
		  
				  // Create SELECT SQL statement.
				  
				  
				  connection = DriverManager.getConnection(connectionUrl); 
				  Statement statement1= connection.createStatement();
				  
				  resultSet6 = statement1.executeQuery(b); 
				  
				  if(resultSet6.next()) 
				  {
				  System.out.println("[r-tracDB].[dbo].[tblOrder] table updated successfully.\n" ); 
				  }
				  else 
				  { 
					  System.out.println("[r-tracDB].[dbo].[tblOrder] table updated unsuccessfully.\n"); 
				  }
		   
		  }
		  
		  catch (SQLException e) 
		  { 
			  e.printStackTrace();
		   } 
		  finally 
		  {
			  if (resultSet6 !=null) 
			  { 
				  try { resultSet6.close(); } catch (SQLException e) {
		  e.printStackTrace();} 
				  } 
			  if (statement1 != null) 
			  { try { statement1.close();
		  } catch (SQLException e) { e.printStackTrace();} } 
			  if (connection != null) {
		  try { connection.close(); } catch (SQLException e) { e.printStackTrace();} }
		  }
		 

	}
	
	public void checkRPACTabletblOrder(List<String> newList)
	{
		
		int i =newList.size();
		//System.out.println("size"+i);
        String string = String.join(", ", newList); 
        //System.out.println(string);
		for (int v = 0;v< i; v++)
		{
			//System.out.println(newList.get(v).toString());
		}
		String a="select * from [r-tracDB].[dbo].[tblOrder] where bigIntRPO in ("+string+")";
        System.out.println("SQL Query="+a);

	
		
		  try {
				  // Create SELECT SQL statement.
				  
				  
				  connection = DriverManager.getConnection(connectionUrl); 
				  Statement statement1= connection.createStatement();
				  
				  resultSet7 = statement1.executeQuery(a); 
				  
				  if(resultSet7.next()) 
				  {
				  System.out.println("[r-tracDB].[dbo].[tblOrder] table updated successfully.\n" ); 
				  }
				  else 
				  { 
					  System.out.println("[r-tracDB].[dbo].[tblOrder] table updated unsuccessfully.\n"); 
				  }
		   }
		  
		  
		  catch (SQLException e) 
		  { 
			  e.printStackTrace();
		   } 
		  finally 
		  {
			  if (resultSet7 !=null) 
			  { 
				  try { resultSet7.close(); } catch (SQLException e) {
		  e.printStackTrace();} 
				  } 
			  if (statement1 != null) 
			  { try { statement1.close();
		  } catch (SQLException e) { e.printStackTrace();} } 
			  if (connection != null) {
		  try { connection.close(); } catch (SQLException e) { e.printStackTrace();} }
		  }
		 

	}
	
	public void checkRPACTable1(String newList)
	{
		
		String a="select * from [r-tracDB].[dbo].[tblOrder] where bigIntRPO in ("+newList+")";
		String b="select * from [r-tracDB].[dbo].[tblOrderDetails] where bigIntRPO in ("+newList+")";
		String c="select * from [r-tracDB].[dbo].[tblOrderSummary] where bigIntRPO in ("+newList+")";
		String d="select * from [r-tracDB].[dbo].[tblOrderAddress] where bigIntRPO in ("+newList+")";
		
		  
		 
		/*
		 * try {
		 * 
		 * 
		 * 
		 * // Create SELECT SQL statement.
		 * 
		 * 
		 * connection = DriverManager.getConnection(connectionUrl); Statement statement1
		 * = connection.createStatement();
		 * 
		 * resultSet7 = statement1.executeQuery(a); resultSet6=
		 * statement1.executeQuery(b); resultSet5= statement1.executeQuery(c);
		 * resultSet4= statement1.executeQuery(d);
		 * 
		 * if(resultSet7.next()) {
		 * System.out.println("[r-tracDB].[dbo].[tblOrder] table updated successfully."
		 * ); } else { System.out.
		 * println("[r-tracDB].[dbo].[tblOrder] table updated unsuccessfully."); }
		 * if(resultSet6.next()) {
		 * System.out.println("[r-tracDB].[dbo].[tblOrder] table updated successfully."
		 * ); } else { System.out.
		 * println("[r-tracDB].[dbo].[tblOrder] table updated unsuccessfully."); }
		 * 
		 * if(resultSet5.next()) { System.out.
		 * println("[r-tracDB].[dbo].[tblOrderSummary] table updated successfully."); }
		 * else { System.out.
		 * println("[r-tracDB].[dbo].[tblOrderSummary] table updated unsuccessfully.");
		 * } if(resultSet4.next()) {
		 * System.out.println("[dbo].[tblOrderAddress] table updated successfully."); }
		 * else {
		 * System.out.println("[dbo].[tblOrderAddress] table updated unsuccessfully.");
		 * } }
		 * 
		 * 
		 * catch (SQLException e) { e.printStackTrace(); } finally { if (resultSet7 !=
		 * null) { try { resultSet7.close(); } catch (SQLException e) {
		 * e.printStackTrace();} } if (resultSet6 != null) { try { resultSet6.close(); }
		 * catch (SQLException e) { e.printStackTrace();} } if (resultSet5 != null) {
		 * try { resultSet5.close(); } catch (SQLException e) { e.printStackTrace();} }
		 * if (resultSet4 != null) { try { resultSet4.close(); } catch (SQLException e)
		 * { e.printStackTrace();} } if (statement1 != null) { try { statement1.close();
		 * } catch (SQLException e) { e.printStackTrace();} } if (connection != null) {
		 * try { connection.close(); } catch (SQLException e) { e.printStackTrace();} }
		 * }
		 */
		  checkRPACTabletblOrder1(newList);
		  checkRPACTabletblOrderDetails1(newList);
		  checkRPACTabletblOrderSummary1(newList);
	}
	public void checkRPACTabletblOrderSummary1(String newList)
	{
	
		
		String c="select * from [r-tracDB].[dbo].[tblOrderSummary] where bigIntRPO in ("+newList+")";
		  System.out.println(c);

		  try {
	
				  // Create SELECT SQL statement.
				  
				  
				  connection = DriverManager.getConnection(connectionUrl); 
				  Statement statement1= connection.createStatement();
				  resultSet6 = statement1.executeQuery(c); 
				  
				  if(resultSet6.next()) 
				  {
				  System.out.println("[r-tracDB].[dbo].[tblOrderSummary] table updated successfully.\n" ); 
				  }
				  else 
				  { 
					  System.out.println("[r-tracDB].[dbo].[tblOrderSummary] table updated unsuccessfully.\n"); 
				  }
		   
		  }
		  
		  catch (SQLException e) 
		  { 
			  e.printStackTrace();
		   } 
		  finally 
		  {
			  if (resultSet6 !=null) 
			  { 
				  try { resultSet6.close(); } catch (SQLException e) {
		  e.printStackTrace();} 
				  } 
			  if (statement1 != null) 
			  { try { statement1.close();
		  } catch (SQLException e) { e.printStackTrace();} } 
			  if (connection != null) {
		  try { connection.close(); } catch (SQLException e) { e.printStackTrace();} }
		  }
		 

	}
	
	public void checkRPACTabletblOrderDetails1(String newList)
	{
		
		
		String b="select * from [r-tracDB].[dbo].[tblOrderDetails] where bigIntRPO in ("+newList+")";
		
		
		 System.out.println(b);
		
		  try {
		  
		  
		  
				  // Create SELECT SQL statement.
				  
				  
				  connection = DriverManager.getConnection(connectionUrl); 
				  Statement statement1= connection.createStatement();
				  
				  resultSet6 = statement1.executeQuery(b); 
				 
				  
				  if(resultSet6.next()) 
				  {
				  System.out.println("[r-tracDB].[dbo].[tblOrderDetails] table updated successfully.\n" ); 
				  }
				  else 
				  { 
					  System.out.println("[r-tracDB].[dbo].[tblOrderDetails] table updated unsuccessfully.\n"); 
				  }
		   
		  }
		  
		  catch (SQLException e) 
		  { 
			  e.printStackTrace();
		   } 
		  finally 
		  {
			  if (resultSet6 !=null) 
			  { 
				  try { resultSet6.close(); } catch (SQLException e) {
		  e.printStackTrace();} 
				  } 
			  if (statement1 != null) 
			  { try { statement1.close();
		  } catch (SQLException e) { e.printStackTrace();} } 
			  if (connection != null) {
		  try { connection.close(); } catch (SQLException e) { e.printStackTrace();} }
		  }
		 

	}
	
	public void checkRPACTabletblOrder1(String newList)
	{
		
		String a="select * from [r-tracDB].[dbo].[tblOrder] where bigIntRPO in ("+newList+")";
		
		  System.out.println(a);

		 
		
		  try {
				  // Create SELECT SQL statement.
				  
				  
				  connection = DriverManager.getConnection(connectionUrl); 
				  Statement statement1= connection.createStatement();
				  
				  resultSet7 = statement1.executeQuery(a); 
				  
				  if(resultSet7.next()) 
				  {
				  System.out.println("[r-tracDB].[dbo].[tblOrder] table updated successfully.\n" ); 
				  }
				  else 
				  { 
					  System.out.println("[r-tracDB].[dbo].[tblOrder] table updated unsuccessfully.\n"); 
				  }
		   }
		  
		  
		  catch (SQLException e) 
		  { 
			  e.printStackTrace();
		   } 
		  finally 
		  {
			  if (resultSet7 !=null) 
			  { 
				  try 
				  { resultSet7.close(); } 
				  catch (SQLException e) 
				  {
					  e.printStackTrace();} 
				  } 
			  if (statement1 != null) 
			  { 
				  try { statement1.close();
				  		} 
				  catch (SQLException e) 
				  { 
					  e.printStackTrace();
					  } 
				  } 
			  if (connection != null)
			  {
		  try { connection.close(); 
		  } 
		  catch (SQLException e) 
		  { e.printStackTrace();} }
		  }
		 

	}
	
	
	public void allrpoInplantCheckWithDBParse(String a) throws SQLException
	{
		

		try  
        {
			
		    //System.out.println(num);
	
					 // Create SELECT SQL statement.
			            String selectSql = "SELECT * " + 
					            		"FROM [AlvaroMorenoDB].[dbo].[tbl_Cust_AlvaroMoreno_Parser]" + 
			            		        "WHERE bigIntRPO IN ("+ a +")";
			            
			            System.out.println("SQL Query="+selectSql);
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

							             if (status.equalsIgnoreCase("6"))
							             {
							            	 System.out.println("tbl_Cust_AlvaroMoreno_Parser table check Pass\n");
							             }
							             else if(status.equalsIgnoreCase("8"))
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
	
}
