import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import com.dataseers.qa.base.GenerateData;

import au.com.bytecode.opencsv.CSVReader;
public class bufferreadercsv {
	
	private static final String SAMPLE_CSV_FILE_PATH = "C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv";

    public static void main(String[] args) throws IOException {
       {
      	 
      	  
//    Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
//	BufferedReader br = new BufferedReader(new FileReader(SAMPLE_CSV_FILE_PATH));
//	 String line;
//	 String lastLine = "";
//
//	while ((line = br.readLine()) != null) { 
//	    // use comma as separator 
//	    String[] row = line.split(","); 
////	    System.out.println( row[0] + " , "+ row[1]); 
//	    System.out.println(line);
//        lastLine = line;
////        System.out.println("***************"+lastLine);
//        
//        
//	}
//       }}}
//
        // Read CSV file
        CSVReader reader = null;
        String CsvData = null;
        try {
            reader = new CSVReader(new FileReader("C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv"));
            String[] cell ;
            List<String> list = new ArrayList<String>();
            int i = 0;
            while ((cell = reader.readNext()) != null) {
//            	 for(int i=5;i<4;i++)
//            	 for(int i=0;i<=cell.length;i++)
//            	{
//            	
                String keyword = cell[0];
                String emails = cell[1 + 0];
                String message = cell[2 + 0];
                String Result = cell[3 + 0];
 
                Random objGenerator = new Random();
                  int randomNumber = objGenerator.nextInt(5);
                  System.out.println("Random No : " + randomNumber); 
                  if(i==randomNumber) {
                  	CsvData = keyword+","+emails+","+message+","+Result;
               
                 
                 }
                  i = i+1;
//            }
            	 }
          
            System.out.println(CsvData);
        } 
       
       catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
	} 
	
	
}
}
    