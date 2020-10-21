package Programiz;

import java.io.StringWriter;

public class stringwriter {
	public static void main(String[] args) {
		
		String data = "Hasta El Fuego";
		StringWriter sw = new StringWriter();
		sw.write(data);
		
		System.out.println(sw.getBuffer());
		System.out.println(sw.toString());
		
		sw.flush();
		
		StringBuffer sb = new StringBuffer("Hola");
		String s = sb.toString();
		System.out.println(s);
	}
}
