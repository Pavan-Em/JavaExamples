package DURGA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class d16 {
	public static void main(String[] args)  {
		try(BufferedReader b=new BufferedReader(new FileReader("abc.txt")))
		{
			System.out.println("closed");
		}
		catch(IOException e)
		{
			System.out.println("catched");
		}
	}
}
