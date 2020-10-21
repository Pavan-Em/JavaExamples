package Programiz;

import java.io.IOException;
import java.io.StringReader;

public class stringreader {
	public static void main(String[] args) throws IOException {
		
		String name = "Hasta El Fuego";
		StringReader sr = new StringReader(name);
		char[] ch  = new char[name.length()];
		sr.read(ch);
		System.out.println(ch);
		
		char[] ch1 = {'a','b'};
		System.out.println(ch1);
		
		int[] num = {1,2,3};
		System.out.println(num);
	}
}
