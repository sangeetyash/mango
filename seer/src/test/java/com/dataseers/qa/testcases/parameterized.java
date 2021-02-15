package com.dataseers.qa.testcases;
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

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class parameterized {
	
	private static final String SAMPLE_CSV_FILE_PATH = "C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv";
	
	@Test
	@Parameters("row_number")
    public static void main(String[] args,int row_number) throws IOException {
       {
      	 
      	  
    	   CSVReader reader = null;
           String CsvData = null;
           try {
               reader = new CSVReader(new FileReader("C://Users/INTEL/eclipse-workspace/Dataseers_UI/src/main/java/com/dataseers/qa/testdata/test.csv"));
               String[] cell ;
               List<String> list = new ArrayList<String>();
               int i = 0;
               while ((cell = reader.readNext()) != null) {
//               	 for(int i=5;i<4;i++)
//               	 for(int i=0;i<=cell.length;i++)
//               	{
//               	
                   String keyword = cell[0];
                   String emails = cell[1 + 0];
                   String message = cell[2 + 0];
                   String Result = cell[3 + 0];
    
                    
                     if(i==row_number) {
                     	CsvData = keyword+","+emails+","+message+","+Result;
                  
                    
                    }
                     i = i+1;
//               }
               	 }
             
               System.out.println(CsvData);
           } 
          
          catch (IOException e) {
               e.printStackTrace();
           }
           


       }}}

