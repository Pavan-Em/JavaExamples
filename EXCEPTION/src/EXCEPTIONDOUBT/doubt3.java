package EXCEPTIONDOUBT;

public class doubt3 {
	
	public static void main(String[] args)  {
		
	try
	{
		throw new MyException("Hola Ronaldo");
	}
	catch(RuntimeException e)
	{
		System.out.println(e.getMessage());
	}
	}
}


class MyException extends RuntimeException
{
	//String message;
	
	public MyException(String message)
	{
		super(message);
	}
	
	
}
