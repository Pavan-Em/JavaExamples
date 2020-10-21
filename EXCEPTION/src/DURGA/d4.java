package DURGA;

public class d4 {
	public static void main(String[] args) {
		
		try
		{
			System.out.println(10/0);
			
			
		}
		catch(ArithmeticException e)
		{
			throw new ArithmeticException();
		}
	}
}
