package DIXIT;

import java.io.FileNotFoundException;
import java.io.IOException;

public class e6  {
	public static void main(String[] args) throws Throwable {
		y();
	}
	public static void y()throws Exception
	{
		z();
	}
	
	public static void z() throws FileNotFoundException
	{
		throw new FileNotFoundException();
	}
}
