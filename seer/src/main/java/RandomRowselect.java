import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//public class RandomRowselect {
//
//	public static void main(String[] args) throws FileNotFoundException,
//	IOException {
//
//System.out.println("Getting random line from file: " + args[0]);
//
//InputStream is = null;
//BufferedReader reader = null;
//
//try {
//	is = new FileInputStream(args[0]);
//
//	reader = new BufferedReader(new InputStreamReader(
//			new FileInputStream(args[0])));
//
//	System.out.println("Reading file...");
//	List<String> list = new ArrayList<String>();
//	String line = reader.readLine();
//	while (line != null) {
//		list.add(line);
//		line = reader.readLine();
//	}
//
//	System.out.println("Generating random...");
//	SecureRandom random = new SecureRandom();
//	int row = random.nextInt(list.size());
//
//	System.out.println("Random selection is:\n");
//	System.out.println(list.get(row));

public class RandomRowselect {
	
	private static final String SAMPLE_CSV_FILE_PATH = "C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv";

    public static void main(String[] args) throws IOException {
       {
      	 
      	  
    Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
	BufferedReader br = new BufferedReader(new FileReader(SAMPLE_CSV_FILE_PATH));
	List<String> list = new ArrayList<String>();
	 String line;
	 String lastLine = "";

	while ((line = br.readLine()) != null) { 
	    // use comma as separator 
	    String[] row = line.split(","); 
//	    System.out.println( row[0] + " , "+ row[1]); 
	    System.out.println(line);
	    list.add(line);
        lastLine = line;
//        System.out.println("***************"+lastLine);
        
        Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
          int randomNumber = objGenerator.nextInt(10);
          System.out.println("Random No : " + randomNumber); 
         }
	}

       }}}
