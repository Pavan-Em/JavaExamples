package DURGA;

public class special {
	public static void main(String[] args) {
		try 
		{
			int[] a=new int[10];
			a[10]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException|ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
