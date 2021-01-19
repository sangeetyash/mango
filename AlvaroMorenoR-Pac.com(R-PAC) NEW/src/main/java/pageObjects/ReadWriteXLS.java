package pageObjects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.sql.Date;
//import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//import java.io.FileInputStream;  
//import java.io.FileNotFoundException;  
//import java.io.IOException;  
import org.apache.poi.ss.usermodel.Cell;  
//import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteXLS 
{

	public static void main(String[] args) throws IOException   
	{  
		ReadWriteXLS rc=new ReadWriteXLS();   
		//rc.writeToXLS();
		//rc.readToXLS();
		//object of the class  
	//reading the value of 2nd row and 2nd column  
	String vOutput=rc.ReadCellData(2, 2);   
	System.out.println(vOutput);  
	}  
	
	public void readToXLS()
	{

		 try {
			 File excel = new File("C://temp/Test.xlsx");
		        FileInputStream fis = new FileInputStream(excel);
		        XSSFWorkbook book = new XSSFWorkbook(fis);
		        XSSFSheet sheet = book.getSheetAt(0);
		
		        Iterator<Row> itr = sheet.iterator();
		
		        // Iterating over Excel file in Java
		        while (itr.hasNext())
		        {
		            Row row = itr.next();
		
		            // Iterating over each column of Excel file
		            Iterator<Cell> cellIterator = row.cellIterator();
		            while (cellIterator.hasNext()) 
		            {
		
		                Cell cell = cellIterator.next();
		
				                switch (cell.getCellType()) 
				                {
				                case STRING:
				                    System.out.print(cell.getStringCellValue() + "\t");
				                    break;
				                case NUMERIC:
				                    System.out.print(cell.getNumericCellValue() + "\t");
				                    break;
				                case BOOLEAN:
				                    System.out.print(cell.getBooleanCellValue() + "\t");
				                    break;
				                default:
				
				                }
		            }
		            System.out.println("");
		       }
			

		 	}
		 catch(Exception e)
		 {
			 
		 }

	}
	
	public void writeToXLS() throws IOException
	{
		File excel = new File("C://temp/Test.xlsx");
        FileInputStream fis = new FileInputStream(excel);
        //XSSFWorkbook book = new XSSFWorkbook(fis);
       // XSSFSheet sheet = book.getSheetAt(0);
		 XSSFWorkbook workbook = new XSSFWorkbook(fis); 
         
	        //Create a blank sheet
	        XSSFSheet sheet = workbook.createSheet("Employee Data");
	          
	        //This data needs to be written (Object[])
	        Map<String, Object[]> data = new TreeMap<String, Object[]>();
	        data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
	        data.put("2", new Object[] {1, "Amit", "Shukla"});
	        data.put("3", new Object[] {2, "Lokesh", "Gupta"});
	        data.put("4", new Object[] {3, "John", "Adwards"});
	        data.put("5", new Object[] {4, "Brian", "Schultz"});
	          
	        //Iterate over data and write to sheet
	        Set<String> keyset = data.keySet();
	        int rownum = 0;
	        for (String key : keyset)
	        {
	            Row row = sheet.createRow(rownum++);
	            Object [] objArr = data.get(key);
	            int cellnum = 0;
	            for (Object obj : objArr)
	            {
	               Cell cell = row.createCell(cellnum++);
	               if(obj instanceof String)
	                    cell.setCellValue((String)obj);
	                else if(obj instanceof Integer)
	                    cell.setCellValue((Integer)obj);
	            }
	        }
	        try
	        {
	            //Write the workbook in file system
	            FileOutputStream out = new FileOutputStream(new File("C://temp/Test.xlsx"));
	            workbook.write(out);
	            workbook.close();
	            out.close();
	            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
	
	public String ReadCellData(int vRow, int vColumn)  
	{  
	String value=null;          //variable for storing the cell value  
	Workbook wb=null;           //initialize Workbook null  
	try  
	{  
	//reading data from a file in the form of bytes  
	FileInputStream fis=new FileInputStream("C://temp/Test.xlsx");  
	//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
	wb=new XSSFWorkbook(fis);  
	}  
	catch(FileNotFoundException e)  
	{  
	e.printStackTrace();  
	}  
	catch(IOException e1)  
	{  
	e1.printStackTrace();  
	}  
	Sheet sheet=wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
	Row row=sheet.getRow(vRow); //returns the logical row  
	Cell cell=row.getCell(vColumn); //getting the cell representing the given column  
	value=cell.getStringCellValue();    //getting cell value  
	return value;               //returns the cell value  
	}  
	
	

}
	

	
