package Programiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class printStream {
	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("C:\\Users\\Windows\\Desktop\\IOPackage\\BufferReaderr.txt");
		PrintStream ps = new PrintStream(fos);
		ps.print("Hasta El Fuego");
		
		
		
	}
}
