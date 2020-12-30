package com.project.managers;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginUserPassword;
import pageObjects.*;
import enums.BrowserSelectType;

public class PageObjectManager 
{
	private WebDriver driver;
	private LoginUserPassword loginUserPassword;
	private Product product;
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

	
	
	public BrowserSelectType getBrowserSelectType()
	{
		return (browserSelectType == null) ? browserSelectType=new BrowserSelectType(driver) : browserSelectType;
	}
	public Product getProduct()
	{
		return (product == null) ? product=new Product(driver) : product;
	}
}
