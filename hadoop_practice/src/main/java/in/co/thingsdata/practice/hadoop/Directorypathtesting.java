package in.co.thingsdata.practice.hadoop;
import java.io.*;
public class Directorypathtesting {
	   public static void main(String[] args) {
	      
	      File f = null; 
	      String[] paths;
	       BufferedWriter writer = null;
	     String localsrc = args[0];
	 	String dest = args[1];
	      try{      
	         // create new file
	         f = new File(localsrc); //c:/test
	                                 
	         // array of files and directory
	         paths = f.list();
		
		 writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dest)));//c:/listout/output.txt


	            
	         // for each name in the path array
	         for(String path:paths)
	         {
			
			
	            // prints filename and directory name
	            //System.out.println(path);
			
			writer.write(path);
	         	writer.newLine();

	}

		writer.close();
	      }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	      }
	   }
	}



