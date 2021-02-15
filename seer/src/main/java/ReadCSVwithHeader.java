import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import au.com.bytecode.opencsv.CSVReader;

public class ReadCSVwithHeader {
	
	private static final String SAMPLE_CSV_FILE_PATH = "C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv";

	      public static void main(String[] args) throws IOException {
	         {
	        	 
	        	  
	        	            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
	        	            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
	        	                    .withFirstRecordAsHeader()
	        	                    .withIgnoreHeaderCase()
	        	                    .withTrim());
	        	
	                  for (CSVRecord csvRecord : csvParser) {
	                      // Accessing values by Header names ,,
	                      String name = csvRecord.get("Name");
	                      String email = csvRecord.get("price");
	                      String phone = csvRecord.get("Rating");
	                      

	                      System.out.println("Record No - " + csvRecord.getRecordNumber());
	                      System.out.println("---------------");
	                      System.out.println("Name : " + name);
	                      System.out.println("Email : " + email);
	                      System.out.println("Phone : " + phone);
	                      System.out.println("---------------\n\n");
	                  }
	    
//	                  List<String> lines = new ArrayList<String>();
//	        	      String[] line;
//	                  while ((line = reader.readNext()) != null) {
//	                      lines.add(line);
//	                  }
//
//	                  System.out.println(lines.get(0));
//	                  lines.get(1);
	                  
	                            
}
	      }}
