package EXCEPTIONDOUBT;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class doubt9 {

	public static void main(String[] args) throws Exception {
		
		dostuf();
	}
	
	public static void dostuf() throws Exception
	{
		domorestuf();
	}
	
	public static void domorestuf() throws IOException
	{
		FileOutputStream fos=new FileOutputStream("L://hehe.txt");
	}
}
