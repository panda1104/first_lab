package mycode;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_work {
	public static void main(String[] args) throws NumberFormatException, IOException {
      FileInputStream file1 = new FileInputStream("C:\\Lina\\text1.txt");
      FileInputStream file2 = new FileInputStream("C:\\Lina\\text2.txt");
      BufferedReader br1 = new BufferedReader(new InputStreamReader(file1));
      BufferedReader br2 = new BufferedReader(new InputStreamReader(file2));
      String strLine1;
      String strLine2 = null;
      while ((strLine1 = br1.readLine()) != null && (strLine2 = br2.readLine()) != null){
          System.out.println(strLine1);
          System.out.println(strLine2);
       }
      if(strLine1!=null)
      {
    	  System.out.println(strLine1);
    	  while((strLine1 = br1.readLine()) != null)
          {
        	  System.out.println(strLine1);
          }
      }
      if(strLine2!=null)
      {
    	  while((strLine2 = br2.readLine()) != null)
          {
        	  System.out.println(strLine2);
          }
      }
      System.out.println(readFiles("C:\\\\Lina\\\\test_text1.txt","C:\\\\Lina\\\\test_text_2.txt"));
      file1.close();
      file2.close();
	}
	public static String readFiles(String filename1, String filename2) throws IOException {
		  String result = null;
		  FileInputStream file1 = new FileInputStream(filename1);
	      FileInputStream file2 = new FileInputStream(filename2);
	      BufferedReader br1 = new BufferedReader(new InputStreamReader(file1));
	      BufferedReader br2 = new BufferedReader(new InputStreamReader(file2));
	      String strLine1;
	      String strLine2 = null;
	      int count = 0;
	      while ((strLine1 = br1.readLine()) != null && (strLine2 = br2.readLine()) != null){
	    	  if(count == 0) {
	    		  result = strLine1;
	    		  result+=strLine2;
	    		  count++;
	    	  }
	    	  else {
	    		  result+=strLine1;//System.out.println(strLine1);
		          result+=strLine2;  
	    	  }
	       }
	      if(strLine1!=null)
	      {
	    	  result+=strLine1;
	    	  while((strLine1 = br1.readLine()) != null)
	          {
	        	  result+=strLine1;
	          }
	      }
	      if(strLine2!=null)
	      {
	    	  while((strLine2 = br2.readLine()) != null)
	          {
	        	  result+=strLine2;
	          }
	      }
	      file1.close();
	      file2.close();
		return result;
	}
}
