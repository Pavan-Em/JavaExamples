package Day02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class File02 {

	public static void main(String[] args) throws IOException {
		
		PrintWriter wr = new PrintWriter("C:\\Users\\Windows\\Desktop\\Testing.txt");
		wr.print("ok got this");
		wr.println(420);
		wr.write("Lopper");
		wr.flush();
		
		BufferedReader re = new BufferedReader(new FileReader("C:\\Users\\Windows\\Desktop\\Testing.txt"));
		String getText = re.readLine();
		while(getText!= null) {
			System.out.println(getText);
			getText = re.readLine();
		}
	}
}
