package Programiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream is = new FileInputStream("C:\\Users\\Windows\\Desktop\\IOPackage\\FileReader.txt");
		System.out.println(is.available());
		byte[] b = new byte[is.available()];
		is.read(b);
		System.out.println(is.available());
		String s = new String(b);
		System.out.println(s);
	//	is.reset();
		System.out.println(is.available());
		
		System.out.println(is.toString());
	}
}
