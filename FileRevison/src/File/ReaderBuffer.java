package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ReaderBuffer{
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Windows\\Desktop\\Testing.txt",true));
		writer.write("hola");
		writer.newLine();
		writer.write("Ok Bye");
		writer.flush();
		
	/*	BufferedReader re = new BufferedReader(new FileReader("C:\\Users\\Windows\\Desktop\\Testing.txt"));
		String line = re.readLine();
		while(line != null)
		{
		System.out.println(line);
		line = re.readLine();
		}*/
		
		PrintWriter pw = new PrintWriter("C:\\Users\\Windows\\Desktop\\Testing.txt");
		pw.write(420);
		pw.println();
		pw.print(840);
	}
}