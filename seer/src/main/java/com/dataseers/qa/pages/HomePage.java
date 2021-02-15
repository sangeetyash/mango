package com.dataseers.qa.pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dataseers.qa.base.TestBase;
import com.dataseers.qa.util.TestUtil;

public class HomePage extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 20);
	ArrayList<String> cluster = new ArrayList<>();
	ArrayList<String> datastats = new ArrayList<>();

//home page data statistics
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-col ant-col-12']")
	WebElement hmscrap;

	Actions actions = new Actions(d);

	public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void hmpagescrap() {
		try {
			TestUtil.scrollDown();
			datastats = new ArrayList<>();
			wait.until(ExpectedConditions.visibilityOf(hmscrap));
			List<WebElement> statstics = d.findElements(By.xpath("//*[@class='push-right text-bold']"));
			for (WebElement stats : statstics) {
				String s = stats.getText();
				datastats.add(s);
			}
			log.info(datastats);

		} catch (Exception e) {
			log.error("homepage reports scraping failed");
			Assert.fail();

		}
	}

	public void clusterdb1() throws SQLException {
		hmpagescrap();

		Connection conn = null;
		Statement stmt = null;
		String host = dbprop.getProperty("db_host");
		String user = dbprop.getProperty("db_user");
		String password = dbprop.getProperty("db_pwd");
		conn = DriverManager.getConnection(host, user, password);
		log.info("Connection is created successfully:");
		stmt = conn.createStatement();
		try {
			conn = DriverManager.getConnection(host, user, password);
			log.info("Connection is created successfully:");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(dbprop.getProperty("allMetrics"));

// iterate through the java resultset
			if (rs.next()) {
				for (int i = 1; i <= 5; i++) {
					String clusterdata = rs.getString(i);
					log.info("cluster details : " + clusterdata);
					cluster.add(clusterdata);

				}
				log.info("cluster details : " + cluster);

			}
			String pgMatrix = dbprop.getProperty("pg_matrix");
			String reports = dbprop.getProperty("reports");
			String alerts = dbprop.getProperty("alerts");
			String metrics = dbprop.getProperty("metrics");

			selectquery(pgMatrix);
			selectquery(reports);
			selectquery(alerts);
			selectquery(metrics);

			log.info("cluster details : " + cluster);
			Assert.assertEquals(datastats, cluster);
			rs.close();
		} catch (Exception e) {
			log.error("db conneection failed");
			Assert.fail();

		} finally {
			stmt.close();
			conn.close();
		}

	}

	public void selectquery(String query) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String host = dbprop.getProperty("db_host");
		String user = dbprop.getProperty("db_user");
		String password = dbprop.getProperty("db_pwd");
		conn = DriverManager.getConnection(host, user, password);
		log.info("Connection is created successfully:");
		stmt = conn.createStatement();
		try {
			ResultSet rs = stmt.executeQuery(query);

// iterate through the java resultset
			if (rs.next()) {
				String data = rs.getString(1);
				log.info("Executing----" + query);

				cluster.add(data);

			}
			rs.close();
			conn.close();

		} catch (Exception e) {
			log.error("db1 Login failed");
			Assert.fail();

		} finally {
			stmt.close();
			conn.close();
		}
	}

}
