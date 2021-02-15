package com.excel.lib.util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class ReadExcel {
   
    public void readExcel(String filePath, String fileName, String sheetName) throws IOException{
        //Create an object of File class to open xlsx file
        File file = new File("C://Users/Anaya/workspace/Finaseer/src/main/java/com/excel/lib/util/LoginData.xlsx");
        //Create an object of FileInputStream class to read excel file
        FileInputStream inputStream = new FileInputStream(file);
        Workbook ReadWorkbook = null;
        //Find the file extension by splitting file name in substring  and getting only extension name
        String fileExtensionName = fileName.substring(fileName.indexOf("."));
        
        //Read sheet inside the workbook by its name
        Sheet Read2Sheet = ReadWorkbook.getSheet(sheetName);
        //Find number of rows in excel file
        int rowCount = Read2Sheet.getLastRowNum()-Read2Sheet.getFirstRowNum();
        //Create a loop over all the rows of excel file to read it
        for (int i = 0; i < rowCount+1; i++) {
            Row row = Read2Sheet.getRow(i);
            //Create a loop to print cell values in a row
            for (int j = 0; j < row.getLastCellNum(); j++) {
                //Print Excel data in console
                System.out.print(row.getCell(j).getStringCellValue()+"|| ");
            }
            System.out.println();
        } 
        }  
        //Main function is calling readExcel function to read data from excel file
        public static void main(String...strings) throws IOException{
        //Create an object of ReadGuru99ExcelFile class
        ReadExcel objExcelFile = new ReadExcel();
        //Prepare the path of excel file
        String filePath = System.getProperty("C://Users/Anaya/workspace/Finaseer/src/main/java/com/excel/lib/util/LoginData.xlsx");
        //Call read file method of the class to read data
        objExcelFile.readExcel(filePath,"LoginData.xlsx","login");
        }


}