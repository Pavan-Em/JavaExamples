package DIXIT;

import java.io.IOException;

public class e4 {
	public static void main(String[] args) {
		try
		{
		y();
		System.out.println("from inside main");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("from main");
	}
	
	public static void y() throws Exception
	{
		try
		{
			z();
			System.out.println("from inside y");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("from y");
	}
	
	public static void z() throws IOException {
		if(10==10)
		throw new IOException("you sucks");
		System.out.println("hehe");

	}
}
