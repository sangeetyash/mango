package com.project.managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckOut;
import pageObjects.LoginUserPassword;
import pageObjects.ReleasePO;
import pageObjects.CatalogItems;
import pageObjects.*;
import com.connectionsdb.*;

import enums.BrowserSelectType;
import enums.*;

public class PageObjectManager 
{
	private WebDriver driver;
	private LoginUserPassword loginUserPassword;
	private ReleasePO releasePO;
	private CheckOut checkOut;
	private CatalogItems catalogItems;
	private OrderStatus orderStatus;
	private SqlConnection sqlConnection;
	private ShoppingCart shoppingCart;
	private RPOScreen rpoScreen;
	private PORPOCheck poRPOCheck;
	private POShoppingCart poShoppingCart;
	private POALLQTYShopping poALLQTYShopping;
	private POALLQTYCheck poALLQTYCheck;
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

	public ReleasePO getreleasePO()
	{
		return (releasePO == null) ? releasePO = new ReleasePO(driver) : releasePO;
	}
	

	public CheckOut getcheckOut()
	{
		return (checkOut == null) ? checkOut=new CheckOut(driver) : checkOut;
		
	}
	
	public CatalogItems getcatalogItems()
	{
		return (catalogItems == null) ? catalogItems=new CatalogItems(driver) : catalogItems;
		
	}
	public OrderStatus getOrderStatus()
	{
		return (orderStatus == null) ? orderStatus=new OrderStatus(driver) : orderStatus;
	}
	
	public SqlConnection getSqlConnection()
	{
		return (sqlConnection == null) ? sqlConnection=new SqlConnection(driver) : sqlConnection;
	}
	
	public ShoppingCart getShoppingCart()
	{
		return (shoppingCart == null) ? shoppingCart=new ShoppingCart(driver) : shoppingCart;
	}
	
	public RPOScreen getRPOScreen()
	{
		return (rpoScreen == null) ? rpoScreen=new RPOScreen(driver) : rpoScreen;
	}
	
	public PORPOCheck getPORPOCheck()
	{
		return (poRPOCheck == null) ? poRPOCheck=new PORPOCheck(driver) : poRPOCheck;
	}
	
	public POShoppingCart getPOShoppingCart()
	{
		return (poShoppingCart == null) ? poShoppingCart=new POShoppingCart(driver) : poShoppingCart;
	}
	
	public POALLQTYShopping getPOALLQTYShopping()
	{
		return (poALLQTYShopping == null) ? poALLQTYShopping=new POALLQTYShopping(driver) : poALLQTYShopping;
	}
	
	
	public POALLQTYCheck getPOALLQTYCheck()
	{
		return (poALLQTYCheck == null) ? poALLQTYCheck=new POALLQTYCheck(driver) : poALLQTYCheck;
	}
	
	public BrowserSelectType getBrowserSelectType()
	{
		return (browserSelectType == null) ? browserSelectType=new BrowserSelectType(driver) : browserSelectType;
	}
}
