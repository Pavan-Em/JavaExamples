package questions;

import java.io.File;

public class Q03 {
	 public static void main(String[] args) {

		    // create a file object
		    File file = new File("C:\\Users\\Windows\\Desktop\\IOPackage\\BufferReaderr.txt");
		      
		    // create a file
		    try {
		      file.createNewFile();
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }

		    // create an object that contains the new name of file
		    File newFile = new File("C:\\Users\\Windows\\Desktop\\IOPackage\\PavanReader.txt");

		    // change the name of file
		    boolean value = file.renameTo(newFile);

		    if(value) {
		      System.out.println("The name of the file is changed.");
		    }
		    else {
		      System.out.println("The name cannot be changed.");
		    }
		  }
}
