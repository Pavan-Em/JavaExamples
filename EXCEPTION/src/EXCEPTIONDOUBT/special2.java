package EXCEPTIONDOUBT;

import java.io.FileOutputStream;

public class special2 {

	public static void main(String[] args) throws Exception{
		
		try
		{
			throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			FileOutputStream fos=new FileOutputStream("L://hehe.txt");
		}
		catch(Exception e)
		{
			System.out.println("im here");
		}
	}
	
}
