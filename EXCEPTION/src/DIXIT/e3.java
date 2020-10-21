package DIXIT;

public class e3 {
	public static void main(String[] args) {
		try
		{
			y();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch from main");
		}
		System.out.println("im from main");
	}
	public static void y()
	{
		try
		{
			z();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch from y");
		}
		System.out.println("Im from y");
	}
		public static void z() {
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Catch from z");
			}
		
	}
}
