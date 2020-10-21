package DURGA;

public class d3 {
	public static void main(String[] args) {
		try
		{
			System.out.println("outer try block");
			try
			{
				System.out.println("inner try block");
				System.out.println(10/0);
			}
			catch(IndexOutOfBoundsException e)
			{
				System.out.println("Inner catch block");
			}
			System.out.println("End of outter try block");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Outer catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("end");
	
	}
}