import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.com.bytecode.opencsv.CSVReader;

public class ReadCSV {

	@SuppressWarnings("resource")
	   public static void main(String[] args) throws Exception
	   {
	      //Build reader instance
	      //Read data.csv
	      //Default seperator is comma
	      //Default quote character is double quote
	      //Start reading from line number 2 (line numbers start from zero)
		
	      CSVReader reader = new CSVReader(new FileReader("C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv"), ',' , '"' , 1);
	       
	      //Read CSV line by line and use the string array as you want
//	      List<String> lines = new ArrayList();
	      String[] nextLine;
	      while ((nextLine = reader.readNext()) != null) {
	         if (nextLine != null) {
	            //Verifying the read data here
	            System.out.println(Arrays.toString(nextLine));
//	            System.out.println(lines.get(1));
	         }
	       }
	   }
}



	    //Read all rows at once
//	      List<String[]> allRows = reader.readAll();
//	       
//	      //Read CSV line by line and use the string array as you want
//	     for(String[] row : allRows){
//	        System.out.println(Arrays.toString(row));
//	     }
	     
//	      BufferedReader bufRdr;
//	      String file;
//	      bufRdr = new BufferedReader(new FileReader("C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv"));
//
//	      String line;
	      
//		while((line = bufRdr.readLine()) != null){
//	          System.out.println(line);       
//	          String[] cell= line.split(",");
//	              String FirstName=cell[0];
//	              String LastName=cell[1];    
//	   }
	     
	    
	     
//	     try {
//	         String[] cell; 
//	         Map<Object, Object> datamap = new HashMap<Object,Object>();  
//	         while((cell =reader.readNext())!=null) {
//	             for( int i=0; i<cell.length;i++ ) {
//	                 System.out.println(cell[i]);
//	                 //datamap.put(Key, value );
//	             }
//
//	          }
//	        }
//	        catch(NullPointerException e) {
//	            e.printStackTrace();
//	        }
	     
	     
	     

