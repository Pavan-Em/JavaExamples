//wajp to create the clone of a String object
package assignment;
import java.util.Scanner;
public class a1 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner (System.in);
		System.out.print("Enter String:");
		String s1=s.nextLine().trim();
		String s2="";
		for (int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Clone String is "+s2);
	}

}
