package com.project.managers;

import org.openqa.selenium.WebDriver;


import pageObjects.LoginUserPassword;

import pageObjects.*;
import com.connectionsdb.*;

import enums.BrowserSelectType;
import enums.*;

public class PageObjectManager 
{
	private WebDriver driver;
	private LoginUserPassword loginUserPassword;
	
	private SqlConnection sqlConnection;
	private ShoppingCart shoppingCart;

	private BrowserSelectType browserSelectType;

	
	public PageObjectManager(WebDriver driver) 
	{
		this.driver = driver;
	}
	/*
	 * public HomePage getHomePage(){
	 * return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	 * }
	 */
	
	
	public LoginUserPassword getLoginUserPassword()
	{
		return (loginUserPassword == null) ? loginUserPassword = new LoginUserPassword(driver) : loginUserPassword;
	}

	
	public SqlConnection getSqlConnection()
	{
		return (sqlConnection == null) ? sqlConnection=new SqlConnection(driver) : sqlConnection;
	}
	
	public ShoppingCart getShoppingCart()
	{
		return (shoppingCart == null) ? shoppingCart=new ShoppingCart(driver) : shoppingCart;
	}

	
	public BrowserSelectType getBrowserSelectType()
	{
		return (browserSelectType == null) ? browserSelectType=new BrowserSelectType(driver) : browserSelectType;
	}
}
