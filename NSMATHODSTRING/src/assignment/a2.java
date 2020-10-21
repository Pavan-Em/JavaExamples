//wajp to conver string to uppercase WITHOUT using built-in 
package assignment;
import java.util.Scanner;
public class a2 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String:");
		String s1=s.nextLine().trim();
		System.out.println("Entered String:"+s1);
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				s2=s2+(char)(s1.charAt(i)-32);
			}
			else
				s2=s2+s1.charAt(i);
		}
		System.out.println("Converted String:"+s2);
	}
}
