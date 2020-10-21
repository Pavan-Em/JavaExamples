package DURGA;

public class d1 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		try
		{
			System.out.println("ok 1");
			System.out.println(10/0);
			System.out.println("ok 2");
		}
		catch(ArithmeticException e)
		{
			try
			{
			int[] num=new int[-2];
			}
			catch(NegativeArraySizeException q)
			{
				System.out.println("hehe");
			}
		}
	
	}
}
