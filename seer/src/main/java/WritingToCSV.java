import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;
public class WritingToCSV {
   public static void main(String args[]) throws Exception {
	   
//	   Method 1
      //Instantiating the CSVWriter class
//      CSVWriter writer = new CSVWriter(new FileWriter("./data/test.csv"));
      //Writing data to a csv file
//      String line1[] = {"Test_ID", "Testname", "Test_Data", "Test_Output", "Result"};
//      String line2[] = {"1", "Krishna", "2548", "2012-01-01", "IT"};
//      String line3[] = {"2", "Vishnu", "4522", "2013-02-26", "Operations"};
//      String line4[] = {"3", "Raja", "3021", "2016-10-10", "HR"};
//      String line5[] = {"4", "Raghav", "6988", "2012-01-01", "IT"};
//      //Writing data to the csv file
//      writer.writeNext(line1);
//      writer.writeNext(line2);
//      writer.writeNext(line3);
//      writer.writeNext(line4);
//      //Flushing data from writer to file
//      writer.flush();
//      System.out.println("Data entered");
	   

//	   Method 2
String csv = "./data/test.csv";
CSVWriter writer = new CSVWriter(new FileWriter(csv));

List<String[]> data = new ArrayList<String[]>();
data.add(new String[] {"India", "New Delhi"});
data.add(new String[] {"United States", "Washington D.C"});
data.add(new String[] {"Germany", "Berlin"});

writer.writeAll(data);

writer.close();
   }
}
