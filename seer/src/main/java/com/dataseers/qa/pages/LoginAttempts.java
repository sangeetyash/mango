package com.dataseers.qa.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;

//Login attempts
public class LoginAttempts {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
	      Statement stmt = null;
	      try {
	         try {
	            Class.forName("com.mysql.jdbc.Driver");
	         } catch (Exception e) {
	            System.out.println(e);
	         }
	         conn = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.0.225:3306/seerportal_demo_test", "portaluser", "P0rt@lUs3r");
	         System.out.println("Connection is created successfully:");
	         stmt = (Statement) conn.createStatement();
	         String query1 = "update users SET login_attempts_remaining = 3 " + "WHERE id=2065";
	         stmt.executeUpdate(query1);
	         System.out.println("Record has been updated in the table successfully..................");
	      } catch (SQLException excep) {
	         excep.printStackTrace();
	      } catch (Exception excep) {
	         excep.printStackTrace();
	      } finally {
	         try {
	            if (stmt != null)
	            conn.close();
	         } catch (SQLException se) {}
	         try {
	            if (conn != null)
	            conn.close();
	         } catch (SQLException se) {
	            se.printStackTrace();
	         }
	      }
	      System.out.println("Please check it in the MySQL Table. Record is now updated.......");
	   }
	}
		
		
		
		
		

