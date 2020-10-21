package EXCEPTIONDOUBT;

import java.io.IOException;

public class special3 {

	public static void main(String[] args) {
		
		try
		{
			ArithmeticException a=new ArithmeticException("Hehe common man");
			a.initCause(new IOException("Im the Trobler"));
			throw a;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
}
