//Java program to rename a file. 
import java.io.File; 

public class FileRename { 
 public static void main(String[] args) 
 { 
     File oldName = new File("C:/Users/INTEL/Desktop/Dataseers/oldfile_name.txt"); 
     File newName = new File("C:/Users/INTEL/Desktop/Dataseers/newfile_name.txt"); 

     if (oldName.renameTo(newName))  
         System.out.println("Renamed successfully");         
     else 
         System.out.println("Error");         
 } 
} 