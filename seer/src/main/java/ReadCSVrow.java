import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import au.com.bytecode.opencsv.CSVReader;
public class ReadCSVrow {
	
	private static final String SAMPLE_CSV_FILE_PATH = "C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv";

    public static void main(String[] args) throws IOException {
       {
    	   // Read CSV file
           CSVReader reader = null;
           String CsvData = null;
           try {
               reader = new CSVReader(new FileReader("C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv"));
               String[] cell;
               int i = 0;
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter row number: ");
               int rowNum = sc.nextInt();
               System.out.println("row number: "+rowNum);
               while ((cell = reader.readNext()) != null) {
        	
                   String keyword = cell[0];
                   String emails = cell[1];
                   String message = cell[2];
                   String Result = cell[3];
//                 System.out.println(keyword+","+emails+","+message+","+Result);
                 
                   //Select the row number
                   
                   
                   
                   if(i==rowNum) {
                   	CsvData = keyword+","+emails+","+message+","+Result;
//                   	System.out.println(keyword);
                   }
                   i = i+1;
               }
             
               System.out.println(CsvData);
               
           } 
          
          catch (IOException e) {
               e.printStackTrace();
           }
                  
           
   	}  	
   	
   }
   }
       
