package com.dataseers.qa.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.dataseers.qa.base.TestBase;

public class TestUtil extends TestBase {

	static String defaultdir = System.getProperty("user.dir");
	static String filePath = defaultdir + "/src/main/java/com/dataseers/qa/testdata/dbcreds.xls";

	public static void takeScreenshotAtEndOfTest() throws IOException {
		String dateName = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss").format(new Date());

		File scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
		String currentDir = (defaultdir + "/screenshots/" + dateName);
		FileUtils.copyFile(scrFile, new File(currentDir + System.currentTimeMillis() + ".PNG"));

	}

	public static void scrollDown() {

		for (int i = 1; i <= 4; i++) {
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		}
	}

	public static void scrollRight() {

		for (int i = 1; i <= 4; i++) {
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollBy(2000,0)");

		}
	}

	public static int getRandomInteger(int maximum, int minimum)

	{
		return ((int) (Math.random() * (maximum - minimum))) + minimum;

	}

	public static void readcellvalue(int rowValue, int cellValue) throws IOException {

		// obtaining input bytes from a file
		FileInputStream fis = new FileInputStream(new File(filePath));
		// creating workbook instance that refers to .xls file
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFCell cellData = wb.getSheetAt(0).getRow(rowValue).getCell(cellValue);
		String readData = cellData.toString();
		log.info(readData);

	}

	public static String selectquery(String query) {
		String data = null;
		try {

			Connection conn = null;
			Statement stmt = null;
			String host = "jdbc:mysql://192.168.0.225:3306/seerportal_demo_test?autoReconnect=true&useSSL=false";
			String user = "portaluser";
			String pwd = "P0rt@lUs3r";

			conn = (Connection) DriverManager.getConnection(host, user, pwd);
			System.out.println("Connection is created successfully:");
			stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

// iterate through the java resultset
			if (rs.next()) {
				data = rs.getString(1);
				System.out.println("Executing---" + query);
				System.out.println("result of query---" + data);

			}
			rs.close();

		} catch (Exception e) {
			System.out.println("Query execution failed");
			Assert.fail();

		}
		return data;
	}

	public static void deleteQuerykeydb(String deleteQuery) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		String host = dbprop.getProperty("db_host");
		String username = dbprop.getProperty("db_user");
		String passwrd = dbprop.getProperty("db_pwd");
		conn = DriverManager.getConnection(host, username, passwrd);
		log.info("Connection is created successfully:");
		stmt = conn.createStatement();

		try {
			stmt.executeUpdate(deleteQuery);
			log.info("Record has been deleted successfully..................");
		} catch (Exception e) {
			Assert.fail("Record update failed!!!");

		} finally {

			stmt.close();
			conn.close();

		}

	}

	public static void excel(String filepath, String data, int i, int j) throws OpenXML4JException, IOException {
		FileInputStream inputStream = new FileInputStream(new File(filepath));
		try (Workbook workbook = WorkbookFactory.create(inputStream))

		{
			Sheet sheet = workbook.getSheetAt(0);
			Object[][] excel = { { data } };

			for (Object[] bulk : excel) {
				int columnCount = j;
				Row row = sheet.getRow(i);
				Cell cell;
				row.getCell(columnCount);

				for (Object field : bulk) {
					cell = row.getCell(columnCount++);
					if (field instanceof String) {
						cell.setCellValue((String) field);
					} else if (field instanceof Integer) {
						cell.setCellValue((Integer) field);
					}
				}

			}

			inputStream.close();

			FileOutputStream outputStream = new FileOutputStream(filepath);
			workbook.write(outputStream);
			outputStream.close();

		}

		catch (IOException | EncryptedDocumentException ex) {

			log.error("Excel File update failed");
		}

	}

	public static void sortCSV(String filepath, String headerData,int column) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		Map<String, List<String>> map = new TreeMap<String, List<String>>();
		String line = reader.readLine();// read header
		while ((line = reader.readLine()) != null) {
			String key = getField(line, column);
			List<String> l = map.get(key);
			if (l == null) {
				l = new LinkedList<String>();
				map.put(key, l);
			}
			l.add(line);

		}
		reader.close();
		FileWriter writer = new FileWriter(filepath);
		writer.write(headerData + "\n");
		for (List<String> list : map.values()) {
			for (String val : list) {
				writer.write(val);
				writer.write("\n");
			}
		}
		writer.close();
	}

	private static String getField(String line,int column) {
		return line.split(",")[column];// extract value you want to sort on
	}
}
