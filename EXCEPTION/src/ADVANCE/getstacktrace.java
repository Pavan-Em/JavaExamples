package ADVANCE;

public class getstacktrace {
	
	public static void main(String[] args) {
		try
		{
			call();
		}
		catch(ArithmeticException cause)
		{
			StackTraceElement[] s=cause.getStackTrace();
			for(int i=0,n=s.length;i<n;i++)
			{
				System.err.println(s[i].getFileName()+":"+s[i].getLineNumber()+">>"+s[i].getMethodName()+"()");
			}
			System.out.println("==================");
			cause.printStackTrace();
		}
	}
	
	public static void call()
	{
		againclass();
	}
	
	public static void againclass()
	{
		System.out.println(10/0);
	}

}
