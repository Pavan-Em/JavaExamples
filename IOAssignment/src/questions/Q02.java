package questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q02 {
	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream r = new FileInputStream("C:\\Users\\Windows\\Desktop\\IOPackage\\FileReader.txt");
		byte[] b = new byte[r.available()];
		r.read(b);
		System.out.println(Arrays.toString(b));
		
		System.out.println(new String(b));
		
	}
}
