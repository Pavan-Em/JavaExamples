package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class basic1 {
	public static void main(String[] args) throws IOException {
	/*	FileReader fr1 = new FileReader("C:\\Users\\Windows\\Desktop\\IOPackage\\FileReader.txt");
		//System.out.println(fr1.read());
		int ch = fr1.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=fr1.read();
		}*/
		
		FileReader fr2 = new FileReader("\"C:\\\\Users\\\\Windows\\\\Desktop\\\\IOPackage\\\\FileReader.txt\"");
		File f = new File("C:\\Users\\Windows\\Desktop\\IOPackage\\FileReader.txt");
		char[] chr = new char[(int)f.length()];
		fr2.read(chr);
		System.out.println(String.valueOf(chr));
		
	}
}
