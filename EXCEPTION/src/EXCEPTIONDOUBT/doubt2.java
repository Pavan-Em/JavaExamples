package EXCEPTIONDOUBT;

public class doubt2 {

	public static void main(String[] args) {
		try
		{
		throw new ArithmeticException("Hast El Feugo");
		//System.out.println("hey bruh");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	}
}


