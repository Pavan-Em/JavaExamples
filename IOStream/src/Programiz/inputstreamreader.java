package Programiz;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class inputstreamreader {
	public static void main(String[] args) throws IOException {
		
		byte[] b = {56 , 41 , 65 , 78};
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		System.out.println(bis.read());
		InputStreamReader is = new InputStreamReader(bis);
		System.out.println(is.read());
	}
}
