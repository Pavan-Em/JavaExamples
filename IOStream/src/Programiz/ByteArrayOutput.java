package Programiz;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutput {
	public static void main(String[] args) throws IOException {
		
		String s = "Just do it";
		ByteArrayOutputStream by = new ByteArrayOutputStream();
		byte[] b2 = s.getBytes();
		by.write(b2);
		String ss = by.toString();
		byte[] nn = by.toByteArray();
		System.out.println(ss);
	}
}
