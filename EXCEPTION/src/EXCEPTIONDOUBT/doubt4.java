package EXCEPTIONDOUBT;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class doubt4 {

	public static void main(String[] args)  {
		dostuf();
		
	}
	
	public static void dostuf() 
	{
		System.out.println("from do stuf");
	try
	{
		domorestuf();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		
	}
	
	public static void domorestuf() throws Exception
	{
		System.out.println("dfrom domorestuf");
	
			FileOutputStream fos=new FileOutputStream("J://yes.txt");
		
		
	}
}
