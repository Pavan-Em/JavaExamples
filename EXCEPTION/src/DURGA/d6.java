package DURGA;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class d6 {
	 public static void main(String[] args) {
		 try {
		PrintWriter p=new PrintWriter("G:\\demo\\dm\\f2.txt");
		p.println("hey mamu");
		p.close();
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println("hehe");
		 }
	}
}
