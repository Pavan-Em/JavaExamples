//print uppercase lowercase
import java.util.Scanner;

public class task4sir {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enetr String:");
		String str=s.nextLine().trim();
		System.out.println("Entered String is:"+str);
		String str2=str.toLowerCase();
		String rev1="";
		for (int i=0;i<str2.length();i++)
		{
			if(i%2==0)
				rev1=rev1+(char)(str2.charAt(i)-32);
			else
				rev1=rev1+str2.charAt(i);
		}
		System.out.println("Reverse string is:"+rev1);
	}
}
