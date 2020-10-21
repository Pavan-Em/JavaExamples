package EXCEPTIONDOUBT;

public class doubt1 {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("from finally");
		}
	}
}
