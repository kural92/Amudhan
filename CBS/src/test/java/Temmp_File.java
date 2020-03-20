import java.io.File;
import java.io.IOException;

import org.testng.annotations.AfterSuite;


public class Temmp_File {
	
	public static void main(String[] args) {
		
		      File temp;
		      try
		      {
		         temp = File.createTempFile("myTempFile", ".txt");
		         
		         System.out.println("Temp file created : " + temp.getAbsolutePath());
		         
		         //temp.delete(); //For deleting immediately
		         
		         temp.deleteOnExit(); //Delete on runtime exit
		         
		         System.out.println("Temp file exists : " + temp.exists());
		      } catch (IOException e)
		      {
		         e.printStackTrace();
		      }
		   }
		}
