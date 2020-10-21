package DURGA;

public class rethrowing {
	public static void main(String[] args) {
		try
		{
			int a=10/0;
		}
		catch(ArithmeticException e)
		{
			throw new NullPointerException("omg");
		}
	}
}
