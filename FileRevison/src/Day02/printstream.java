package Day02;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class printstream {

	public static void main(String[] args) throws Exception {
		
		byte[] b = "pavan".getBytes();
		
		FileOutputStream f = new FileOutputStream("C:\\Users\\Windows\\Desktop\\StreamTesting.txt");
		PrintStream ps = new PrintStream(f, true);
		
		ps.write(b);
		ps.print(660);
	}
}
