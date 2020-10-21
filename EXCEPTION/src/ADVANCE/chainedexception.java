package ADVANCE;

public class chainedexception {
	public static void main(String[] args) {
		try
		{
			getvalue();
		}
		catch(MyException e)
		{
			System.out.println("Cause:"+e.getCause());
			System.out.println("Message:"+e.getMessage());
		}		
	}
	public static int getvalue()  throws MyException
	{
		int a;
		try
		{
			a=10/0;
		}
		catch(ArithmeticException e)
		{
			MyException m=new MyException(e.getMessage(),e);
			System.out.println(m.getMessage());
			throw m;
		}
		return a;
	}
}

class MyException extends Exception
{
	public MyException(String message) {
		super(message);
	}
	public MyException(Throwable throwable)
	{
		super(throwable);
	}
	public MyException(String message,Throwable throwable)
	{
		super(message,throwable);
	}
}
