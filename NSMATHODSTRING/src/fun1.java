
import java.util.Scanner;
public class fun1 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=s.next();  //.trim();
		//String str=new String(); example for empty String
		int length=str.length();
		String rev="";//.trim();
		if(!(str.isEmpty()))
		{
		      for (int i=length-1;i>=0;i--)
		       {
			        rev=rev+str.substring(i,i+1);
		        }
		System.out.println("Reverse String is:"+rev);
		}
		else
			System.out.println("It is a Empty String");
	}

}
