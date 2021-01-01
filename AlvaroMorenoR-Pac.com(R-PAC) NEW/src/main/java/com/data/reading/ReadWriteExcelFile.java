package com.data.reading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.print.DocFlavor.STRING;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelFile {

	//private static final int STRING = 0;
	//private static final int NUMERIC = 0;
	//private static final int BOOLEAN = 0;
	static ArrayList<String> data =new ArrayList<String>();

	public static void readXLSFile() throws IOException
	{
		InputStream ExcelFileToRead = new FileInputStream("C:/New Workspace/Test1.xls");
		HSSFWorkbook wb = new HSSFWorkbook(ExcelFileToRead);

		HSSFSheet sheet=wb.getSheetAt(0);
		HSSFRow row; 
		HSSFCell cell;

		Iterator<Row> rows = sheet.rowIterator();

		while (rows.hasNext())
		{
			row=(HSSFRow) rows.next();
			Iterator<Cell> cells = row.cellIterator();
			
			while (cells.hasNext())
			{
				
				 cell = (HSSFCell) cells.next();

	            switch(cell.getCellType()) {
	            case STRING:
					System.out.print(cell.getStringCellValue()+" ");
                    data.add(cell.toString());
	                break;
	            case NUMERIC:
					System.out.print(cell.getStringCellValue()+" ");
                    data.add(cell.toString());
	                break;
	            case BOOLEAN:
					System.out.print(cell.getStringCellValue()+" ");
                    data.add(cell.toString());

	                break;
				default:
					break;
				
			}
	            
			System.out.println();
		}
	}
		
		System.out.println("size-->"+data.size());

		for(int i = 0; i < data.size();i++)
		{
			System.out.println(data.get(i));
		}
	}
	
	public static void writeXLSFile() throws IOException {
		
		String excelFileName = "C:/New Workspace/Test1.xls";//name of excel file
		String sheetName = "Sheet1";//name of sheet

		try (HSSFWorkbook wb = new HSSFWorkbook()) {
			HSSFSheet sheet = wb.createSheet(sheetName) ;

			//iterating r number of rows
			for (int r=0;r < 5; r++ )
			{
				HSSFRow row = sheet.createRow(r);

				//iterating c number of columns
				for (int c=0;c < 5; c++ )
				{
					HSSFCell cell = row.createCell(c);
					
					cell.setCellValue("Sangeet "+r+" "+c);
				}
			}
			
			System.out.println("size"+data.size());

			for(int i = 0; i < data.size();i++)
			{
				System.out.println(data.get(i));
			}
			FileOutputStream fileOut = new FileOutputStream(excelFileName);
			
			//write this workbook to an Outputstream.
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}
	}
	
	

	public static void main(String[] args) throws IOException {
		
		//writeXLSFile();
		readXLSFile();
		
		
		
		//writeXLSXFile();
		//readXLSXFile();

	}

}