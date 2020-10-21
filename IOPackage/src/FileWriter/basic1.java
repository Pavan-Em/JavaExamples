package FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class basic1 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw1 = new FileWriter("C:\\Users\\Windows\\Desktop\\IOPackage\\filewriter.txt");
		fw1.write('a');
		char[] ch = "Pavan".toCharArray();
		fw1.write('\n');
		fw1.write(ch);
		fw1.write('\n');
		fw1.write("hehe\r\nTools");
		fw1.flush();
		fw1.close();
		
	}
}
