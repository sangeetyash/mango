package com.project.managers;
import java.sql.Connection;

import org.openqa.selenium.support.PageFactory;

import com.connectionsdb.*;
public class SQLObjectManager 

{
	Connection conn;
	public SQLObjectManager(Connection conn)
	{
		this.conn = conn;
	}

}
