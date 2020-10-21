package DIXIT;

public class e2 {
	void m()
	{
		//try
		//{
			System.out.println(10/0);
		//}
		//catch(ArithmeticException e) {
			//System.out.println("caught by m");
		//}
	}
	void n()
	{
		m();
	}
	void p()
	{
		try 
		{
			n();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught by p");
		}
	}
	public static void main(String[] args) {
		e2 obj=new e2();
		obj.p();
		System.out.println("End");
	}
}
