package DURGA;
					//customized exception
import java.io.IOException;
import java.util.Scanner;

public class D12 {

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		System.out.print("ENter your age:");
		int age=s.nextInt();
		if(age>40)
			throw new TooOldException("sorry you are too old");
		else if(age<18)
		{
			System.out.println("ok");
			throw new TooYoungException("Sorry you are too young");
			//
		}
		else
			System.out.println("congrats....!  you will get match soon");
	}
}



class TooYoungException extends Exception
{
	public TooYoungException(String st) {
		super(st);
		// TODO Auto-generated constructor stub
	}
}

class TooOldException extends RuntimeException
{
	public TooOldException(String st)
	{
		super(st);
	}
}
