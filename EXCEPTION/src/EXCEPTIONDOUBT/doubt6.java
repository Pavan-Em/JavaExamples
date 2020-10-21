package EXCEPTIONDOUBT;

import java.io.IOException;

public class doubt6 {
	
	public static void main(String[] args) throws IOException {
		try
		{
			System.out.println(10/0);
		}
		catch(RuntimeException e)
		{
			throw new IOException("Hast El Feugo");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("The End");
	}
}
