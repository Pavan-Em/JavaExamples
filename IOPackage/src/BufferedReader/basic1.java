package BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class basic1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Windows\\Desktop\\IOPackage\\BufferReader.txt"));
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line=br.readLine();
		}
	}
}
